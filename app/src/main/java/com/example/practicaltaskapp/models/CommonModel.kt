package com.example.practicaltaskapp.models

data class CommonModel(
    val id: String = "",
    var username: String = "",
    var bio: String = "",
    var fullname: String = "",
    var state: String = "",
    var email: String = "",
    var photoUrl: String = "empty"
)