package com.sreeni.filesystem.baseBeans;

import java.util.List;
import java.util.Set;

/**
 * Created by ZNE45571 on 3/25/2015.
 */
public abstract class NonFileEntity extends FileSystemEntity {

    private Set<NonFileEntity> folderList;
    private Set<NonFileEntity> zipFileList;
    private Set<FileEntity> textFilesList;

    public Set<NonFileEntity> getFolderList() {
        return folderList;
    }

    public void setFolderList(Set<NonFileEntity> folderList) {
        this.folderList = folderList;
    }

    public Set<NonFileEntity> getZipFileList() {
        return zipFileList;
    }

    public void setZipFileList(Set<NonFileEntity> zipFileList) {
        this.zipFileList = zipFileList;
    }

    public Set<FileEntity> getTextFilesList() {
        return textFilesList;
    }

    public void setTextFilesList(Set<FileEntity> textFilesList) {
        this.textFilesList = textFilesList;
    }

    @Override
    public float getSize() {
        float totalSize = 0;
        if(getFolderList()!=null && !getFolderList().isEmpty()){
            for(NonFileEntity nonFileEntity:getFolderList()){
                totalSize+=nonFileEntity.getSize();
            }
        }
        if(getZipFileList()!=null && !getZipFileList().isEmpty()){
            for(NonFileEntity nonFileEntity:getZipFileList()){
                totalSize+=nonFileEntity.getSize();
            }
        }
        if(getTextFilesList()!=null && !getTextFilesList().isEmpty()){
            for(FileEntity fileEntity:getTextFilesList()){
                totalSize+=fileEntity.getSize();
            }
        }
        return totalSize;
    }

}
