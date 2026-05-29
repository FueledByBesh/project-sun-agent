package project.sun.agent.port;

import org.springframework.stereotype.Repository;

@Repository
public interface FileStorage {

    String store(byte[] file);

}
