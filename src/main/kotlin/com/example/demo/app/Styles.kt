package com.example.demo.app

import javafx.geometry.Pos
import javafx.scene.text.FontWeight
import tornadofx.*
import tornadofx.px
import java.awt.Color.LIGHT_GRAY

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
    }

    init {

      
        label and heading {
            padding = box(10.px)
            fontSize = 60.px
            fontWeight = FontWeight.BOLD
            alignment = Pos.CENTER

        }
    }

}