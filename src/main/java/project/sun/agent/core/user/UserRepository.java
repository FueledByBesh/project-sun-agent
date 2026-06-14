package project.sun.agent.core.user;

import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository {

    Optional<User> findById(UUID id);



}
