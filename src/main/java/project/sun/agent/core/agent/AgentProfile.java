package project.sun.agent.core.agent;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AgentProfile {

    private int id;
    private String name;
    private String personalityPrompt;
    private String agentSpecificPrompt;

}
