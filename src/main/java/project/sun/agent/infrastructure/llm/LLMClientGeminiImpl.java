package project.sun.agent.infrastructure.llm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import project.sun.agent.core.agent.AgentSession;
import project.sun.agent.core.llm.LLMClient;
import project.sun.agent.core.llm.LLMResponse;

import java.util.Optional;

@Component(value = "gemini-impl")
public class LLMClientGeminiImpl implements LLMClient {

    private final String apiKey;

    public LLMClientGeminiImpl(@Value("llm.gemini.api-key") String apiKey) {
        this.apiKey = apiKey;
    }


    @Override
    public Optional<LLMResponse> generateResponse(AgentSession session) {
        return Optional.empty();
    }

}
