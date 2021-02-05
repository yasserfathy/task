package com.example.demo.view


import tornadofx.*


class MainView : View("JavaFX Task") {
    init {
        reloadStylesheetsOnFocus()
    }
    override val root = borderpane {

        top<TopView>()
        center<CenterView>()
    }
}
