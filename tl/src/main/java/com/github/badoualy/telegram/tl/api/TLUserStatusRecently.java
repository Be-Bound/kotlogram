package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLUserStatusRecently extends TLAbsUserStatus {
    public static final int CLASS_ID = 0xe26f42f1;

    public TLUserStatusRecently() {
    }

    @Override
    public String toString() {
        return "userStatusRecently#e26f42f1";
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }
}
