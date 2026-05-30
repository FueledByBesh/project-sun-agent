package project.sun.agent.port;

import org.springframework.stereotype.Component;
import project.sun.agent.model.agent.AgentSession;
import project.sun.agent.port.dto.LLMResponse;

import java.util.Optional;

@Component
public interface LLMClient {

    Optional<LLMResponse> generateResponse(AgentSession session);

}
