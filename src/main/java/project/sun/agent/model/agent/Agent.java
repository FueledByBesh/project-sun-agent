package project.sun.agent.model.agent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Agent {

    private int id;
    private String name;
    private String prompt;

}
