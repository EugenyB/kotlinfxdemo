package myfx

import javafx.fxml.FXML
import javafx.scene.control.Button

class Controller {

    @FXML
    private lateinit var okButton: Button

    fun hello() {
        okButton.text = "Ok"
    }
}