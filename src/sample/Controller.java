package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    Perro perro = new Perro();

    String nombre = "";

    @FXML
    private Label idLabelEdad;
    @FXML
    private Label idLabelNombre;

    @FXML
    public void onEdadClicked(MouseEvent event){
        idLabelEdad.setText(perro.edad.toString());
    }

    @FXML
    public void onNombreClicked(){
        nombre += perro.nombre;
        idLabelNombre.setText(nombre);
    }
}
