package project.sun.agent.port.impl;

import project.sun.agent.model.agent.Session;
import project.sun.agent.port.LLMClient;
import project.sun.agent.port.dto.LLMResponse;

import java.util.Optional;

public class LLMClientGeminiImpl implements LLMClient {

    @Override
    public Optional<LLMResponse> generateResponse(Session session) {
        return Optional.empty();
    }

}
