package com.immagixe.tasktrackerscheduler.model.dto

data class EmailDTO(
    val recipientAddress: String,
    val title: String,
    val text: String
)