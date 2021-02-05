package com.example.demo.view

import javafx.geometry.Pos
import tornadofx.View
import tornadofx.button
import tornadofx.hbox
import tornadofx.*

class TopView : View() {
    override val root = hbox (spacing = 20.0){
        alignment = Pos.CENTER_RIGHT
        padding = insets(10)
        button {
            text="Dark"
            prefWidth = 85.0
            prefHeight = 30.0
            action {
                print("Dark")
            }

        }
        button {
            text="Light"
            prefWidth = 85.0
            prefHeight = 30.0
            action {
                print("Light")
            }

        }
    }
}