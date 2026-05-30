package project.sun.agent.port.repository;

import org.springframework.stereotype.Repository;
import project.sun.agent.model.agent.AgentProfile;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgentRepository {

    List<AgentProfile> getAll();
    void save(AgentProfile agent);
    void delete(AgentProfile agent);
    Optional<AgentProfile> findById(int id);
    Optional<AgentProfile> findByName(String name);

}
