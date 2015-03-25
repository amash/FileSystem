package com.sreeni.filesystem.operations;

import com.sreeni.filesystem.exceptions.IllegalFileSystemOperationException;
import com.sreeni.filesystem.exceptions.NotTextFileException;
import com.sreeni.filesystem.exceptions.PathAlreadyExistException;
import com.sreeni.filesystem.exceptions.PathNotFoundException;

/**
 * Created by ZNE45571 on 3/25/2015.
 */
public class FileSystemOperations implements FileSystemOperationsInterface {
    @Override
    public boolean create(String type, String name, String parentPath)
            throws PathAlreadyExistException, PathNotFoundException, IllegalFileSystemOperationException {
        return false;
    }

    @Override
    public boolean delete(String path) throws PathNotFoundException {
        return false;
    }

    @Override
    public boolean move(String sourcePath, String destinationPath)
            throws PathNotFoundException, PathAlreadyExistException, IllegalFileSystemOperationException {
        return false;
    }

    @Override
    public boolean writeToFile(String path, byte[] content)
            throws PathNotFoundException, NotTextFileException {
        return false;
    }
}
