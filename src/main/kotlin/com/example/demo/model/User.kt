package com.example.demo.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.JsonModel
import tornadofx.string
import tornadofx.int
import javax.json.JsonObject
import tornadofx.*

class User : JsonModel {
//    val idProperty = SimpleIntegerProperty()
//    var userId by idProperty
//
//    val userNameProperty = SimpleStringProperty()
//    var userName by userNameProperty

    val errorProperty = SimpleStringProperty()
    var errorCode by errorProperty



    override fun updateModel(json: JsonObject) {
        with(json) {
//            userId = this!!.int("userId")!!
//            userName = string("userName")
            errorCode = string("errorCode")


        }
    }

    override fun toJSON(json: JsonBuilder) {
        with(json) {
//            add("userId", userId)
//            add("userName", userName)
            add("errorCode", errorCode)
        }
    }
}





