package com.Chat_Application.chatApp.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;

    private enum MessageType{
        CHAT,LEAVE,JOIN
    }
}
