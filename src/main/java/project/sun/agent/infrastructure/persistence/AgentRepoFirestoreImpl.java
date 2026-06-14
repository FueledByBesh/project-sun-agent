package project.sun.agent.infrastructure.persistence;

import project.sun.agent.core.agent.AgentProfile;
import project.sun.agent.core.agent.AgentRepository;

import java.util.List;
import java.util.Optional;

public class AgentRepoFirestoreImpl implements AgentRepository {

    @Override
    public List<AgentProfile> getAll() {
        return List.of();
    }

    @Override
    public void save(AgentProfile agent) {

    }

    @Override
    public void delete(AgentProfile agent) {

    }

    @Override
    public Optional<AgentProfile> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<AgentProfile> findByName(String name) {
        return Optional.empty();
    }
}
