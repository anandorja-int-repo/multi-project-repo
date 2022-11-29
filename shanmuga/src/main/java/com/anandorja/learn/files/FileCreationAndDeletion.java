package com.anandorja.learn.files;

import java.io.File;
import java.io.IOException;

public class FileCreationAndDeletion {
    File createNewFile(String fullyQualifiedName) {
        File testFile = new File(fullyQualifiedName);
        return testFile;
    }

    boolean deleteFile(String fullyQualifiedName) {
        File testFile = this.createNewFile(fullyQualifiedName);
        return testFile.delete();
    }

}
