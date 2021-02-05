package com.example.demo.view

import javafx.geometry.Pos
import tornadofx.*

class WelcomePage: View("Welcome") {
    init {
        reloadStylesheetsOnFocus()
    }
    override val root = vbox {
        prefHeight = 600.0
        prefWidth = 600.0
        alignment = Pos.CENTER
        label(text="Login Successfully")
    }
}