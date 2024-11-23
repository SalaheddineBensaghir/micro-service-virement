package com.sbensaghir.chatbotservice.entites;

import jakarta.persistence.Entity;


public class ChatBotRequest {
    private String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}