package project.sun.agent.core.agent;


import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.sun.agent.exception.rest.NotImplementedError;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class AgentService {

    private final AgentRepository agentRepo;

    private Map<String,AgentProfile> agents;
    private static final String defaultPrompt = "You are a helpful assistant.";

    @PostConstruct
    public void init(){
        agentRepo.getAll().forEach(agent -> agents.put(agent.getName(),agent));
    }

    public AgentProfile createAgent(String name){
        var agent = AgentProfile.builder().name(name).personalityPrompt(defaultPrompt).build();
        agents.put(agent.getName(),agent);
        return agent;
    }

    public AgentProfile createAgentWithCustomPrompt(String name, String prompt){
        var agent = AgentProfile.builder().name(name).personalityPrompt(prompt).build();
        agents.put(agent.getName(),agent);
        return agent;
    }

    private String finalizeSystemPrompt(AgentProfile agent){
        //todo
        throw new NotImplementedError();
    }

}
