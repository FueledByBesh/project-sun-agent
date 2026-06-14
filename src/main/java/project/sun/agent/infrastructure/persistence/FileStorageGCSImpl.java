package project.sun.agent.infrastructure.persistence;

import org.springframework.stereotype.Repository;
import project.sun.agent.core.miscellaneous.FileStorage;

import java.io.File;

@Repository(value = "gcs-impl")
public class FileStorageGCSImpl implements FileStorage {
    @Override
    public String store(byte[] file) {
        return "";
    }

    @Override
    public File get(String fileName) {
        return null;
    }

    @Override
    public void override(String fileName, byte[] file) {

    }

    @Override
    public void delete(String fileName) {

    }


}
