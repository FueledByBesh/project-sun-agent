package project.sun.agent.core.agent;

import lombok.Getter;

import java.util.Optional;
import java.util.UUID;

public class MessageAuthor {

    private final Optional<UUID> id;
    @Getter
    private final Author author;
    @Getter
    private final String name;

    private MessageAuthor(Optional<UUID> id, Author author, String name){
        this.id = id;
        this.author = author;
        this.name = name;
    }

    public static MessageAuthor getUser(String name){
        return new MessageAuthor(Optional.empty(), Author.USER, name);
    }

    public static MessageAuthor getAgent(String name){
        return new MessageAuthor(Optional.empty(), Author.AGENT, name);
    }

    public static MessageAuthor getSystem(){
        return new MessageAuthor(Optional.empty(), Author.SYSTEM, "System");
    }


    public String get(){
        return switch (author) {
            case USER -> "User:" + name;
            case AGENT -> "Agent:" + name;
            case SYSTEM -> "System";
        };
    }


    enum Author{
        USER("user"),
        AGENT("agent"),
        SYSTEM("system");
        @Getter
        private final String value;
        Author(String value){
            this.value = value;
        }
    }
}
