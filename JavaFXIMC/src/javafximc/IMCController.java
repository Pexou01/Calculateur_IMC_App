
package javafximc;

import fr.m2i.imc.model.ImcCalculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrateur
 */
public class IMCController {
    @FXML private TextField metre;
    @FXML private TextField kg;
    @FXML private TextField message;
  public void onClick(ActionEvent event){
      //récupération et conversion de la saisie 
      double masse = Double.valueOf(kg.getText());
      double taille = Double.valueOf(metre.getText());
      // Instanciation d'un ImcCalculator avec 2 argument déclaré jus avant
      ImcCalculator imcCalculator = new ImcCalculator(masse,taille);
      message.setText("Votre IMC  est de : " + imcCalculator.getImc() + " "+ imcCalculator.traduireIMC());
      kg.setText("");
      metre.setText("");
        
        
    }
}
