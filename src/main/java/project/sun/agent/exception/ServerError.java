package project.sun.agent.exception;

import lombok.Getter;
import project.sun.agent.controller.rest.dto.response.RestResponseMessage;
//import project.sun.agent.agent.interfaces.rest.response.RestResponseMessage;

@Getter
public class ServerError extends RuntimeException {
    private final int status;
    private final String message;
    public ServerError(int status,String message) {
        super(message);
        this.status = status;
        this.message = message;
    }

    public RestResponseMessage toRestResponse() {
        return RestResponseMessage.builder().status(status).message(message).build();
    }
}
