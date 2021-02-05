package com.example.demo.view
import com.example.demo.controller.LoginController
import com.sun.deploy.util.URLUtil
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*
import javax.swing.text.StyleConstants

class CenterView : View() {
    val model = ViewModel()
    val username = model.bind{SimpleStringProperty()}
    val password = model.bind{SimpleStringProperty()}
    val loginController : LoginController by inject()

    override val root = vbox (spacing = 20.0){
        padding = insets(100.0,100.0,50,100)
        alignment = Pos.TOP_CENTER
        hbox {
            imageview("file:user.png"){
                prefWidth(100.0)
                prefHeight(100.0)
            }
        }

        fieldset("user name") {
            textfield(username).required()
        }
        fieldset("password") {
            passwordfield(password).required()
        }
        button ("Log In"){
            prefWidth(150.0)
            prefHeight(50.0)
             enableWhen(model.valid)
             isDefaultButton = true
             useMaxHeight = true
            useMaxWidth = true
             action {
                  runAsyncWithProgress {
                  loginController.login(username.value, password.value)
                  }
             }
        }

            label(loginController.statusProperty){


            }
        }
    }

