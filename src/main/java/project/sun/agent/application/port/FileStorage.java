package project.sun.agent.application.port;

import java.util.UUID;

public interface FileStorage {
    UUID save();
    String get(UUID id);
    void delete(UUID id);
}
