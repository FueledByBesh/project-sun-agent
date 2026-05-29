package project.sun.agent.port.repository;

import org.springframework.stereotype.Repository;
import project.sun.agent.model.user.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository {

    Optional<User> findById(UUID id);



}
