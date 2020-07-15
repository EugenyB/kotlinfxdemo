package myfx

import javafx.scene.control.Button

class Controller {

    lateinit var okButton: Button

    fun hello() {
        okButton.text = "Ok"
    }
}