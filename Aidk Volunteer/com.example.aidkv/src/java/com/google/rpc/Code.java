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
package com.google.rpc;

import com.google.protobuf.Internal;

public final class Code
extends Enum<Code>
implements Internal.EnumLite {
    private static final /* synthetic */ Code[] $VALUES;
    public static final /* enum */ Code ABORTED;
    public static final int ABORTED_VALUE = 10;
    public static final /* enum */ Code ALREADY_EXISTS;
    public static final int ALREADY_EXISTS_VALUE = 6;
    public static final /* enum */ Code CANCELLED;
    public static final int CANCELLED_VALUE = 1;
    public static final /* enum */ Code DATA_LOSS;
    public static final int DATA_LOSS_VALUE = 15;
    public static final /* enum */ Code DEADLINE_EXCEEDED;
    public static final int DEADLINE_EXCEEDED_VALUE = 4;
    public static final /* enum */ Code FAILED_PRECONDITION;
    public static final int FAILED_PRECONDITION_VALUE = 9;
    public static final /* enum */ Code INTERNAL;
    public static final int INTERNAL_VALUE = 13;
    public static final /* enum */ Code INVALID_ARGUMENT;
    public static final int INVALID_ARGUMENT_VALUE = 3;
    public static final /* enum */ Code NOT_FOUND;
    public static final int NOT_FOUND_VALUE = 5;
    public static final /* enum */ Code OK;
    public static final int OK_VALUE = 0;
    public static final /* enum */ Code OUT_OF_RANGE;
    public static final int OUT_OF_RANGE_VALUE = 11;
    public static final /* enum */ Code PERMISSION_DENIED;
    public static final int PERMISSION_DENIED_VALUE = 7;
    public static final /* enum */ Code RESOURCE_EXHAUSTED;
    public static final int RESOURCE_EXHAUSTED_VALUE = 8;
    public static final /* enum */ Code UNAUTHENTICATED;
    public static final int UNAUTHENTICATED_VALUE = 16;
    public static final /* enum */ Code UNAVAILABLE;
    public static final int UNAVAILABLE_VALUE = 14;
    public static final /* enum */ Code UNIMPLEMENTED;
    public static final int UNIMPLEMENTED_VALUE = 12;
    public static final /* enum */ Code UNKNOWN;
    public static final int UNKNOWN_VALUE = 2;
    public static final /* enum */ Code UNRECOGNIZED;
    private static final Internal.EnumLiteMap<Code> internalValueMap;
    private final int value;

    static {
        OK = new Code(0);
        CANCELLED = new Code(1);
        UNKNOWN = new Code(2);
        INVALID_ARGUMENT = new Code(3);
        DEADLINE_EXCEEDED = new Code(4);
        NOT_FOUND = new Code(5);
        ALREADY_EXISTS = new Code(6);
        PERMISSION_DENIED = new Code(7);
        UNAUTHENTICATED = new Code(16);
        RESOURCE_EXHAUSTED = new Code(8);
        FAILED_PRECONDITION = new Code(9);
        ABORTED = new Code(10);
        OUT_OF_RANGE = new Code(11);
        UNIMPLEMENTED = new Code(12);
        INTERNAL = new Code(13);
        UNAVAILABLE = new Code(14);
        DATA_LOSS = new Code(15);
        UNRECOGNIZED = new Code(-1);
        Code[] arrcode = new Code[]{OK, CANCELLED, UNKNOWN, INVALID_ARGUMENT, DEADLINE_EXCEEDED, NOT_FOUND, ALREADY_EXISTS, PERMISSION_DENIED, UNAUTHENTICATED, RESOURCE_EXHAUSTED, FAILED_PRECONDITION, ABORTED, OUT_OF_RANGE, UNIMPLEMENTED, INTERNAL, UNAVAILABLE, DATA_LOSS, UNRECOGNIZED};
        $VALUES = arrcode;
        internalValueMap = new Internal.EnumLiteMap<Code>(){

            public Code findValueByNumber(int n) {
                return Code.forNumber(n);
            }
        };
    }

    private Code(int n2) {
        this.value = n2;
    }

    public static Code forNumber(int n) {
        switch (n) {
            default: {
                return null;
            }
            case 16: {
                return UNAUTHENTICATED;
            }
            case 15: {
                return DATA_LOSS;
            }
            case 14: {
                return UNAVAILABLE;
            }
            case 13: {
                return INTERNAL;
            }
            case 12: {
                return UNIMPLEMENTED;
            }
            case 11: {
                return OUT_OF_RANGE;
            }
            case 10: {
                return ABORTED;
            }
            case 9: {
                return FAILED_PRECONDITION;
            }
            case 8: {
                return RESOURCE_EXHAUSTED;
            }
            case 7: {
                return PERMISSION_DENIED;
            }
            case 6: {
                return ALREADY_EXISTS;
            }
            case 5: {
                return NOT_FOUND;
            }
            case 4: {
                return DEADLINE_EXCEEDED;
            }
            case 3: {
                return INVALID_ARGUMENT;
            }
            case 2: {
                return UNKNOWN;
            }
            case 1: {
                return CANCELLED;
            }
            case 0: 
        }
        return OK;
    }

    public static Internal.EnumLiteMap<Code> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static Code valueOf(int n) {
        return Code.forNumber(n);
    }

    public static Code valueOf(String string) {
        return (Code)Enum.valueOf(Code.class, (String)string);
    }

    public static Code[] values() {
        return (Code[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }

}

