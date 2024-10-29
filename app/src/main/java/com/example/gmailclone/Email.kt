package com.example.gmailclone

data class Email(
    val senderImage: Int,
    val senderName: String,
    val subject: String,
    val time: String,
    var isStarred: Boolean = false
)
