package com.immagixe.tasktrackerscheduler.interfaces

import com.immagixe.tasktrackerscheduler.model.User

interface EmailCreator {
    fun createEmailAddress(user: User): String
    fun createEmailTitle(user: User): String
    fun createEmailText(user: User): String
}