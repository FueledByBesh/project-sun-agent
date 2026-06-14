package project.sun.agent.core.llm;

import project.sun.agent.core.agent.AgentSession;

import java.util.Optional;

public interface LLMClient {

    Optional<LLMResponse> generateResponse(AgentSession session);

}
