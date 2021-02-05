package com.example.demo.model

import tornadofx.ItemViewModel

class UserModel : ItemViewModel<User>() {
    val error = bind(User :: errorCode)
}