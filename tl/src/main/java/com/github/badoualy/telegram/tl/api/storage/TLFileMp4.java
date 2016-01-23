package com.github.badoualy.telegram.tl.api.storage;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLFileMp4 extends TLAbsFileType {
    public static final int CLASS_ID = 0xb3cea0e4;

    public TLFileMp4() {
    }

    @Override
    public String toString() {
        return "storage.fileMp4#b3cea0e4";
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }
}
