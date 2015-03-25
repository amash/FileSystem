package com.sreeni.filesystem.beans;

import com.sreeni.filesystem.baseBeans.FileEntity;
import com.sreeni.filesystem.baseBeans.NonFileEntity;
import com.sreeni.filesystem.baseBeans.ParentInterface;

/**
 * Created by ZNE45571 on 3/25/2015.
 */
public class Text extends FileEntity implements ParentInterface {

    StringBuilder content;

    public StringBuilder getContent() {
        return content;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }

    @Override
    public NonFileEntity getParent() {
        return null;
    }

    @Override
    public float getSize() {
        return content.length();
    }
}
