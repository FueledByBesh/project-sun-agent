package project.sun.agent.core.llm;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LLMService {

    ///spring auto-injects all beans of type LLMClient, key is the name of the bean
    private final Map<String, LLMClient> clients;

    public Optional<LLMClient> getClient(String name){
        return clients.containsKey(name) ? Optional.of(clients.get(name)) : Optional.empty();
    }

}
