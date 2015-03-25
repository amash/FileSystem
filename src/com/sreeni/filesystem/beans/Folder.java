package com.sreeni.filesystem.beans;

import com.sreeni.filesystem.baseBeans.FileEntity;
import com.sreeni.filesystem.baseBeans.NonFileEntity;
import com.sreeni.filesystem.baseBeans.ParentInterface;

/**
 * Created by ZNE45571 on 3/25/2015.
 */
public class Folder extends NonFileEntity implements ParentInterface {
    @Override
    public NonFileEntity getParent() {
        return null;
    }

}
