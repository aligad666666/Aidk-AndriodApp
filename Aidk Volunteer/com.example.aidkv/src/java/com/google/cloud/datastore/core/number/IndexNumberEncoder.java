/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.cloud.datastore.core.number;

public class IndexNumberEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int DOUBLE_EXPONENT_BIAS = 1023;
    static final int DOUBLE_MIN_EXPONENT = -1022;
    static final int DOUBLE_SIGNIFICAND_BITS = 52;
    static final long DOUBLE_SIGN_BIT = Long.MIN_VALUE;
    static final int EXP1_END = 4;
    static final int EXP2_END = 20;
    static final int EXP3_END = 148;
    static final int EXP4_END = 1172;
    public static final int MAX_ENCODED_BYTES = 11;
    static final int NEGATIVE_INFINITE_EXPONENT = Integer.MIN_VALUE;
    static final int POSITIVE_INFINITE_EXPONENT = Integer.MAX_VALUE;
    static final int SIGNIFICAND_BITS = 64;

    private IndexNumberEncoder() {
    }

    public static int encodeDouble(boolean bl, double d, byte[] arrby, int n) {
        int n2;
        long l;
        if (d == 0.0) {
            return IndexNumberEncoder.encodeZero(arrby, n);
        }
        long l2 = Double.doubleToLongBits((double)d);
        boolean bl2 = d < 0.0;
        boolean bl3 = bl2 ^ bl;
        int n3 = (int)(2047L & l2 >>> 52) - 1023;
        long l3 = 0xFFFFFFFFFFFFFL & l2;
        if (n3 < -1022) {
            int n4 = Long.numberOfLeadingZeros((long)l3);
            long l4 = (l3 & (-1L ^ 1L << 63 - n4)) << n4 + 1;
            n2 = n3 - (n4 - 12);
            l = l4;
        } else {
            if (n3 > 1023) {
                if (l3 == 0L) {
                    if (bl3) {
                        int n5 = n + 1;
                        arrby[n] = 0;
                        n5 + 1;
                        arrby[n5] = -128;
                        return 2;
                    }
                    n + 1;
                    arrby[n] = -1;
                    return 1;
                }
                int n6 = n + 1;
                arrby[n] = 0;
                n6 + 1;
                arrby[n6] = 96;
                return 2;
            }
            long l5 = l3 << 12;
            n2 = n3;
            l = l5;
        }
        return IndexNumberEncoder.encodeNumber(bl3, n2, l, arrby, n);
    }

    public static int encodeLong(boolean bl, long l, byte[] arrby, int n) {
        boolean bl2;
        if (l == 0L) {
            return IndexNumberEncoder.encodeZero(arrby, n);
        }
        if (l < 0L) {
            boolean bl3 = !bl;
            boolean bl4 = bl3;
            l = -l;
            bl2 = bl4;
        } else {
            bl2 = bl;
        }
        int n2 = Long.numberOfLeadingZeros((long)l);
        int n3 = 63 - n2;
        long l2 = (l & (-1L ^ 1L << n3)) << n2 + 1;
        return IndexNumberEncoder.encodeNumber(bl2, n3, l2, arrby, n);
    }

    private static int encodeNumber(boolean bl, int n, long l, byte[] arrby, int n2) {
        IllegalStateException illegalStateException;
        block10 : {
            int n3;
            long l2;
            int n4;
            int n5;
            block7 : {
                int n6;
                block9 : {
                    block8 : {
                        block6 : {
                            n4 = bl ? 255 : 0;
                            n6 = 0;
                            if (n < 0) {
                                n = -n;
                                n6 = 255;
                            }
                            if (n >= 4) break block6;
                            int n7 = n + 1;
                            int n8 = 192 | 1 << n7 | -2 + (1 << n7) & (int)(l >>> 64 - n7);
                            l2 = l << n;
                            if (n6 != 0) {
                                n8 ^= 126 & -1 << n7;
                            }
                            int n9 = n8;
                            n5 = n2;
                            n3 = n9;
                            break block7;
                        }
                        if (n >= 20) break block8;
                        int n10 = (224 | n - 4) ^ (n4 ^ n6 & 127);
                        int n11 = n2 + 1;
                        arrby[n2] = (byte)n10;
                        int n12 = IndexNumberEncoder.topSignificandByte(l);
                        l2 = l << 7;
                        n3 = n12;
                        n5 = n11;
                        break block7;
                    }
                    if (n >= 148) break block9;
                    int n13 = n - 20;
                    int n14 = (240 | n13 >>> 4) ^ (n4 ^ n6 & 127);
                    int n15 = n2 + 1;
                    arrby[n2] = (byte)n14;
                    int n16 = 240 & n13 << 4 | (int)(l >>> 60);
                    long l3 = l << 4;
                    int n17 = n16 ^ (n4 ^ n6 & 240);
                    n5 = n15 + 1;
                    arrby[n15] = (byte)n17;
                    n3 = IndexNumberEncoder.topSignificandByte(l3);
                    l2 = l3 << 7;
                    break block7;
                }
                if (n >= 1172) break block10;
                int n18 = n - 148;
                int n19 = (248 | n18 >>> 8) ^ (n4 ^ n6 & 127);
                int n20 = n2 + 1;
                arrby[n2] = (byte)n19;
                int n21 = n18 & 255 ^ (n4 ^ n6 & 255);
                n5 = n20 + 1;
                arrby[n20] = (byte)n21;
                n3 = IndexNumberEncoder.topSignificandByte(l);
                l2 = l << 7;
            }
            while (l2 != 0L) {
                int n22 = n4 ^ (n3 | 1);
                int n23 = n5 + 1;
                arrby[n5] = (byte)n22;
                n3 = IndexNumberEncoder.topSignificandByte(l2);
                l2 <<= 7;
                n5 = n23;
            }
            int n24 = n3 ^ n4;
            int n25 = n5 + 1;
            arrby[n5] = (byte)n24;
            return n25 - n2;
        }
        illegalStateException = new IllegalStateException("unimplemented");
        throw illegalStateException;
    }

    private static int encodeZero(byte[] arrby, int n) {
        arrby[n] = -128;
        return 1;
    }

    private static int topSignificandByte(long l) {
        return 254 & (int)(l >>> 56);
    }
}

