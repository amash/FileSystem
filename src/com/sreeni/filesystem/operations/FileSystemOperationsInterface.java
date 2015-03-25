package com.sreeni.filesystem.operations;

import com.sreeni.filesystem.exceptions.IllegalFileSystemOperationException;
import com.sreeni.filesystem.exceptions.NotTextFileException;
import com.sreeni.filesystem.exceptions.PathAlreadyExistException;
import com.sreeni.filesystem.exceptions.PathNotFoundException;

/**
 * Created by ZNE45571 on 3/25/2015.
 */
public interface FileSystemOperationsInterface {

    boolean create(String type,String name,String parentPath) throws PathAlreadyExistException,PathNotFoundException,IllegalFileSystemOperationException;
    boolean delete(String path) throws PathNotFoundException;
    boolean move(String sourcePath,String destinationPath) throws PathNotFoundException,PathAlreadyExistException,IllegalFileSystemOperationException;
    boolean writeToFile(String path,byte[] content) throws PathNotFoundException,NotTextFileException;
}
