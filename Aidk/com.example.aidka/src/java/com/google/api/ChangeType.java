/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.api;

import com.google.protobuf.Internal;

public final class ChangeType
extends Enum<ChangeType>
implements Internal.EnumLite {
    private static final /* synthetic */ ChangeType[] $VALUES;
    public static final /* enum */ ChangeType ADDED;
    public static final int ADDED_VALUE = 1;
    public static final /* enum */ ChangeType CHANGE_TYPE_UNSPECIFIED;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ ChangeType MODIFIED;
    public static final int MODIFIED_VALUE = 3;
    public static final /* enum */ ChangeType REMOVED;
    public static final int REMOVED_VALUE = 2;
    public static final /* enum */ ChangeType UNRECOGNIZED;
    private static final Internal.EnumLiteMap<ChangeType> internalValueMap;
    private final int value;

    static {
        CHANGE_TYPE_UNSPECIFIED = new ChangeType(0);
        ADDED = new ChangeType(1);
        REMOVED = new ChangeType(2);
        MODIFIED = new ChangeType(3);
        UNRECOGNIZED = new ChangeType(-1);
        ChangeType[] arrchangeType = new ChangeType[]{CHANGE_TYPE_UNSPECIFIED, ADDED, REMOVED, MODIFIED, UNRECOGNIZED};
        $VALUES = arrchangeType;
        internalValueMap = new Internal.EnumLiteMap<ChangeType>(){

            public ChangeType findValueByNumber(int n) {
                return ChangeType.forNumber(n);
            }
        };
    }

    private ChangeType(int n2) {
        this.value = n2;
    }

    public static ChangeType forNumber(int n) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return null;
                    }
                    return MODIFIED;
                }
                return REMOVED;
            }
            return ADDED;
        }
        return CHANGE_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<ChangeType> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static ChangeType valueOf(int n) {
        return ChangeType.forNumber(n);
    }

    public static ChangeType valueOf(String string2) {
        return (ChangeType)Enum.valueOf(ChangeType.class, (String)string2);
    }

    public static ChangeType[] values() {
        return (ChangeType[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }

}

