package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.model.UserModel
import com.example.demo.view.MainView
import com.example.demo.view.WelcomePage
import javafx.beans.property.SimpleStringProperty
import tornadofx.Controller
import tornadofx.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class LoginController : Controller() {
    val statusProperty  = SimpleStringProperty("")
    var status by statusProperty
    val rest : Rest by inject()
    val resp : UserModel by inject()


    fun login(userName:String, password:String){
        var reqParam = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(userName, "UTF-8")
        reqParam += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8")
        val mURL = URL("http://private-222d3-homework5.apiary-mock.com/api/login")

        with(mURL.openConnection() as HttpURLConnection) {
            requestMethod = "POST"
            println("URL : $url")
            println("Response Code : $responseCode")

            BufferedReader(InputStreamReader(inputStream)).use {
                val response = StringBuffer()
                var inputLine = it.readLine()
                while (inputLine != null) {
                    response.append(inputLine)
                    inputLine = it.readLine()
                }
                println("Response : $response")
            }
        }
        runLater {
            status= ""
        }

        runLater {

                print("connected")
            find(MainView :: class).replaceWith(WelcomePage ::class, sizeToScene = true,centerOnScreen = true)

            }
        }


}