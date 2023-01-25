package com.immagixe.tasktrackerscheduler.service

import com.immagixe.tasktrackerscheduler.interfaces.EmailCreator
import com.immagixe.tasktrackerscheduler.model.User
import com.immagixe.tasktrackerscheduler.model.dto.EmailDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmailCreatorService(@Autowired private val emailCreator: EmailCreator) {
    fun getEmailMessages(users: MutableList<User>): MutableList<EmailDTO> {
        val emailMessages: MutableList<EmailDTO> = mutableListOf()
        for (user in users) {
            if (user.tasks.size > 0) {
                val emailDTO = EmailDTO(
                    emailCreator.createEmailAddress(user),
                    emailCreator.createEmailTitle(user),
                    emailCreator.createEmailText(user)
                )
                emailMessages.add(emailDTO)
            }
        }
        return emailMessages
    }
}