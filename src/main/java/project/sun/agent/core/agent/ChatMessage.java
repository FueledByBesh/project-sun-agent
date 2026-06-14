package project.sun.agent.core.agent;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

@Builder
@Getter
public class ChatMessage {

    private final int id;
    private final MessageAuthor author;
    private final String message;
    private final Instant timestamp;

    public static ChatMessage create(String message) {
        return ChatMessage.builder().message(message).timestamp(Instant.now()).build();
    }

}
