package project.sun.agent.exception.rest;

import lombok.Getter;
import project.sun.agent.exception.ServerError;

@Getter
public class NotImplementedError extends ServerError {
    private final String message;

    public NotImplementedError(){
        super(501, "RESOURCE NOT IMPLEMENTED YET!");
        this.message = "RESOURCE NOT IMPLEMENTED YET!";
    }

    public NotImplementedError(String message) {
        super(501,message);
        this.message = message;
    }
}
