package project.sun.agent.core.user;

import lombok.Builder;

import java.util.UUID;

@Builder
public class User {
    private UUID id;
    private String firstname;
    private String lastname;
    private Integer age;
    private String email;

    public String getFullName(){
        return firstname + " " + lastname;
    }
}
