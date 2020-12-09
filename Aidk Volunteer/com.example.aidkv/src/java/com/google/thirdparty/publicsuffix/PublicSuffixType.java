/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.thirdparty.publicsuffix;

public final class PublicSuffixType
extends Enum<PublicSuffixType> {
    private static final /* synthetic */ PublicSuffixType[] $VALUES;
    public static final /* enum */ PublicSuffixType PRIVATE = new PublicSuffixType(':', ',');
    public static final /* enum */ PublicSuffixType REGISTRY = new PublicSuffixType('!', '?');
    private final char innerNodeCode;
    private final char leafNodeCode;

    static {
        PublicSuffixType[] arrpublicSuffixType = new PublicSuffixType[]{PRIVATE, REGISTRY};
        $VALUES = arrpublicSuffixType;
    }

    private PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }

    static PublicSuffixType fromCode(char c) {
        IllegalArgumentException illegalArgumentException;
        for (PublicSuffixType publicSuffixType : PublicSuffixType.values()) {
            if (publicSuffixType.getInnerNodeCode() != c) {
                if (publicSuffixType.getLeafNodeCode() != c) continue;
                return publicSuffixType;
            }
            return publicSuffixType;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No enum corresponding to given code: ");
        stringBuilder.append(c);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    static PublicSuffixType fromIsPrivate(boolean bl) {
        if (bl) {
            return PRIVATE;
        }
        return REGISTRY;
    }

    public static PublicSuffixType valueOf(String string) {
        return (PublicSuffixType)Enum.valueOf(PublicSuffixType.class, (String)string);
    }

    public static PublicSuffixType[] values() {
        return (PublicSuffixType[])$VALUES.clone();
    }

    char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}

