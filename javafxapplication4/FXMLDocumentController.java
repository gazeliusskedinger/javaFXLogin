/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/*
##############################################################
##
##  MADE ORIGINALLY BY Rasmus A. S. Gazelius Skedinger
##
##  Changes made by:[NAME HERE][DATE]  
##                 :[NAME HERE][DATE]
##                 :[NAME HERE][DATE]
##                 :... 
##                 :please add more if they run out :)
##
## 
##  
##  With License To:
##  USE
##  SHARE
##  CHANGE
##  LEARN
##  
##  But keep my name on top of it!
##
##  Enjoy :)
##  
## 
##############################################################
 */
public class FXMLDocumentController implements Initializable {
    private final String uName = "Admin";
    // Password = GoBananas
    private final String passHash = "$31$16$P0RUsuzvBNHzttwpFzdCDwofgWko6N6t-wUTlXAVLoo";
    @FXML
    private Label label;
    
    @FXML
    private Label label2;
    
    @FXML
    private Label label3;
    
    @FXML
    private PasswordField pwf;
    
    @FXML
    private TextField tf;
    
    @FXML
    private void loginHandleButtonAction(ActionEvent event)  {
        
        String pw = pwf.getText();
        String uName = tf.getText();
        Authenticate a = new Authenticate();
        
        if(uName.equals(this.uName) && a.authenticate(pw, passHash)){
            label.setText("logging in!");
            try{
                Parent loggedIn = FXMLLoader.load(getClass().getResource("FXMLtwo.fxml"));
                Scene sc = new Scene(loggedIn);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(sc);
                window.show();
            }
            catch (IOException e ){
                System.err.println(e.getStackTrace());
            }
            
        }
        else{
            label.setText("Wrong password or username!");
        }
        System.out.println(pw+" : "+uName);
        
        System.out.println(uName+" : "+pw);
        
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event)  {
            label2.setText("button2 pushed");
    }
    @FXML
    private void handleButtonAction3(ActionEvent event)  {
            label2.setText("button3 pushed");
            try{
                Parent loggedIn = FXMLLoader.load(getClass().getResource("FXMLtabstest.fxml"));
                Scene sc = new Scene(loggedIn);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(sc);
                window.show();
            }
            catch (IOException e ){
                System.err.println(e.getStackTrace());
            }
            label2.setText("");
            
    }
    
    @FXML
    private void handleButtonAction4(ActionEvent event)  {
            label3.setText("button4 bananas pushed");
    }
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    public void logout(ActionEvent event){
        try{
                Parent loggedIn = FXMLLoader.load(getClass().getResource("FXMLLoginn.fxml"));
                Scene sc = new Scene(loggedIn);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(sc);
                window.show();
            }
            catch (IOException e ){
                System.err.println(e.getStackTrace());
            }
    
    }
}
