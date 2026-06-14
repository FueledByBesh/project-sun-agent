package project.sun.agent.core.miscellaneous;

import org.springframework.stereotype.Repository;

@Repository
public interface FileStorage {

    String store(byte[] file);

}
