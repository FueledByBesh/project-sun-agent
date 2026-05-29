package project.sun.agent.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public record RestResponseMessage(
        Integer status,
        String message
) {
}
