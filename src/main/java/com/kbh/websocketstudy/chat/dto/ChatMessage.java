package com.kbh.websocketstudy.chat.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 메시지 타입 : 입장, 채팅
 * <p/>
 * type : 메시지 타입<p/>
 * roomId : 방번호<p/>
 * sender : 메시지 보낸사람<p/>
 * message : 메시지<p/>
 *
 * */

@Getter
@Setter
public class ChatMessage {

    public enum MessageType {
        ENTER, TALK
    }

    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
}