package project.sun.agent.model.agent;

import lombok.Builder;
import lombok.Getter;
import project.sun.agent.exception.rest.NotImplementedError;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Builder
@Getter
public class AgentSession {

    private UUID id;
    private AgentProfile agent;
    private Instant startTime;
    private String systemPrompt;
    private List<ChatMessage> context;
    private Long tokensUsed;

    public static AgentSession create(AgentProfile agent) {
        return AgentSession.builder().agent(agent).startTime(Instant.now()).build();
    }

    public boolean addMessageAndCheckIfSummaryNeeded(ChatMessage message){
        this.context.add(message);
        return isSummaryNeeded();
    }

    public boolean isSummaryNeeded(){
        throw new NotImplementedError();
    }

}
