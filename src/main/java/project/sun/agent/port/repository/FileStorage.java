package project.sun.agent.port.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface FileStorage {

    String store(byte[] file);

}
