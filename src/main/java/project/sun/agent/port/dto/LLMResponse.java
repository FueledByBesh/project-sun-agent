package project.sun.agent.port.dto;

public record LLMResponse(
        String response,
        Long tokensCount
) {}
