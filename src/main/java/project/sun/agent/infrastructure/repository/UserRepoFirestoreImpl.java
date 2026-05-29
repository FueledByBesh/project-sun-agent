package project.sun.agent.infrastructure.repository;

import project.sun.agent.model.user.User;
import project.sun.agent.port.repository.UserRepository;

import java.util.Optional;
import java.util.UUID;

public class UserRepoFirestoreImpl implements UserRepository {

    @Override
    public Optional<User> findById(UUID id) {
        return Optional.empty();
    }
}
