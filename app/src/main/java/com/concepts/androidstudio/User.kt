package com.concepts.androidstudio

data class User(
    val address: com.concepts.androidstudio.Address,
    val age: Int,
    val email: String,
    val first_name: String,
    val friends: List<Int>,
    val interests: List<String>,
    val is_verified: Boolean,
    val last_name: String,
    val user_id: Int,
    val username: String
)