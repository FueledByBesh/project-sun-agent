package project.sun.agent.core.miscellaneous;

import java.io.File;

public interface FileStorage {

    String store(byte[] file);

    File get(String fileName);

    void override(String fileName, byte[] file);

    void delete(String fileName);
}
