package project.sun.agent.core.llm;

public record LLMResponse(
        String response,
        Long tokensCount
) {}
