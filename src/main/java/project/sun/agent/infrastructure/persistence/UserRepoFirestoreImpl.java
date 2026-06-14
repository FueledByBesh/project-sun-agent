package project.sun.agent.infrastructure.persistence;

import project.sun.agent.core.user.User;
import project.sun.agent.core.user.UserRepository;

import java.util.Optional;
import java.util.UUID;

public class UserRepoFirestoreImpl implements UserRepository {

    @Override
    public Optional<User> findById(UUID id) {
        return Optional.empty();
    }
}
