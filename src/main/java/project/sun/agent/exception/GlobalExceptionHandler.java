package project.sun.agent.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import project.sun.agent.exception.rest.NotImplementedError;
import project.sun.agent.rest.dto.response.RestResponseMessage;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServerError.class)
    protected ResponseEntity<RestResponseMessage> notImplementedError(NotImplementedError error){
        return ResponseEntity.status(error.getStatus()).body(error.toRestResponse());
    }

}
