/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package com.google.cloud.datastore.core.number;

import com.google.cloud.datastore.core.number.NumberParts;
import java.util.Arrays;

public class NumberIndexEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte[] ENCODED_NAN;
    private static final byte[] ENCODED_NEGATIVE_INFINITY;
    private static final byte[] ENCODED_POSITIVE_INFINITY;
    private static final byte[] ENCODED_ZERO;
    private static final int EXP1_END = 4;
    private static final int EXP2_END = 20;
    private static final int EXP3_END = 148;
    private static final int EXP4_END = 1172;
    private static final int MAX_ENCODED_BYTES = 11;

    static {
        ENCODED_ZERO = new byte[]{-128};
        ENCODED_NAN = new byte[]{0, 96};
        ENCODED_NEGATIVE_INFINITY = new byte[]{0, -128};
        ENCODED_POSITIVE_INFINITY = new byte[]{-1};
    }

    private static byte[] copyOf(byte[] arrby) {
        return (byte[])arrby.clone();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static DecodedNumberParts decode(byte[] arrby) {
        block18 : {
            block21 : {
                int n;
                long l;
                int n2;
                boolean bl;
                boolean bl2;
                int n3;
                int n4;
                int n5;
                block20 : {
                    int n6;
                    int n7;
                    int n8;
                    block19 : {
                        if (arrby.length < 1) break block18;
                        n6 = 0 + 1;
                        int n9 = 255 & arrby[0];
                        bl2 = (n9 & 128) == 0;
                        n7 = bl2 ? 255 : 0;
                        n8 = n9 ^ n7;
                        bl = (n8 & 64) == 0;
                        int n10 = bl ? 255 : 0;
                        l = 0L;
                        n4 = 64;
                        int n11 = NumberIndexEncoder.decodeMarker(n8 ^ n10);
                        if (n11 == -4) break block19;
                        if (n11 != -3 && n11 != -2 && n11 != -1) {
                            if (n11 != 1) {
                                if (n11 != 2) {
                                    if (n11 != 3) {
                                        NumberParts numberParts;
                                        if (n11 != 6) throw new IllegalArgumentException("Invalid encoded byte array");
                                        if (bl2) {
                                            if (bl) {
                                                numberParts = NumberParts.create(true, Integer.MIN_VALUE, 0L);
                                                return DecodedNumberParts.create(n6, numberParts);
                                            } else {
                                                if (arrby.length < 2) throw new IllegalArgumentException("Invalid encoded byte array");
                                                int n12 = n6 + 1;
                                                int n13 = 255 & arrby[n6];
                                                if (n13 == 128) {
                                                    numberParts = NumberParts.create(true, Integer.MAX_VALUE, 0L);
                                                    n6 = n12;
                                                    return DecodedNumberParts.create(n6, numberParts);
                                                } else {
                                                    if (n13 != 96) throw new IllegalArgumentException("Invalid encoded byte array");
                                                    numberParts = NumberParts.create(true, Integer.MAX_VALUE, 1L);
                                                    n6 = n12;
                                                }
                                            }
                                            return DecodedNumberParts.create(n6, numberParts);
                                        } else {
                                            numberParts = bl ? NumberParts.create(false, Integer.MIN_VALUE, 0L) : NumberParts.create(false, Integer.MAX_VALUE, 0L);
                                        }
                                        return DecodedNumberParts.create(n6, numberParts);
                                    }
                                    n5 = n7;
                                    if (arrby.length < 3) throw new IllegalArgumentException("Invalid encoded byte array");
                                    int n14 = (3 & (n8 ^ n10)) << 8;
                                    int n15 = n6 + 1;
                                    n3 = 148 + (n14 | n10 ^ (n5 ^ 255 & arrby[n6]));
                                    int n16 = n15 + 1;
                                    n = n5 ^ 255 & arrby[n15];
                                    l |= NumberIndexEncoder.decodeTrailingSignificandByte(n, n4 -= 7);
                                    n2 = n16;
                                } else {
                                    n5 = n7;
                                    if (arrby.length < 3) throw new IllegalArgumentException("Invalid encoded byte array");
                                    int n17 = (7 & (n8 ^ n10)) << 4;
                                    int n18 = n6 + 1;
                                    int n19 = n5 ^ 255 & arrby[n6];
                                    n3 = 20 + (n17 | (n19 ^ n10) >>> 4);
                                    int n20 = n4 - 4;
                                    long l2 = l | (15L & (long)n19) << n20;
                                    int n21 = n18 + 1;
                                    n = n5 ^ 255 & arrby[n18];
                                    n4 = n20 - 7;
                                    l = l2 | NumberIndexEncoder.decodeTrailingSignificandByte(n, n4);
                                    n2 = n21;
                                }
                            } else {
                                n5 = n7;
                                if (arrby.length < 2) throw new IllegalArgumentException("Invalid encoded byte array");
                                int n22 = 4 + (15 & (n8 ^ n10));
                                int n23 = n6 + 1;
                                n = n5 ^ 255 & arrby[n6];
                                l |= NumberIndexEncoder.decodeTrailingSignificandByte(n, n4 -= 7);
                                n3 = n22;
                                n2 = n23;
                            }
                        } else {
                            n5 = n7;
                            int n24 = n11 + 4;
                            int n25 = n8 & (126 & (-1 ^ -1 << n24 + 1));
                            n2 = n6;
                            l |= (long)n25 << (n4 -= n24) - 1;
                            n3 = n24;
                            n = n8;
                        }
                        break block20;
                    }
                    n2 = n6;
                    n5 = n7;
                    if (bl) break block21;
                    n3 = 0;
                    n = n8;
                }
                while ((n & 1) != 0) {
                    if (n2 >= arrby.length) throw new IllegalArgumentException("Invalid encoded byte array");
                    int n26 = n2 + 1;
                    n = n5 ^ 255 & arrby[n2];
                    if ((n4 -= 7) >= 0) {
                        l |= NumberIndexEncoder.decodeTrailingSignificandByte(n, n4);
                        n2 = n26;
                        continue;
                    }
                    l |= (long)(n & 254) >>> -(n4 - 1);
                    if ((n & 1) != 0) throw new IllegalArgumentException("Invalid encoded byte array: overlong sequence");
                    n2 = n26;
                    n4 = 0;
                }
                if (!bl) return DecodedNumberParts.create(n2, NumberParts.create(bl2, n3, l));
                n3 = -n3;
                return DecodedNumberParts.create(n2, NumberParts.create(bl2, n3, l));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid encoded number ");
            stringBuilder.append(Arrays.toString((byte[])arrby));
            stringBuilder.append(": exponent negative zero is invalid");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid encoded byte array");
        throw illegalArgumentException;
    }

    public static double decodeDouble(byte[] arrby) {
        return NumberIndexEncoder.decode(arrby).parts().asDouble();
    }

    public static long decodeLong(byte[] arrby) {
        return NumberIndexEncoder.decode(arrby).parts().asLong();
    }

    static int decodeMarker(int n) {
        boolean bl = (n & 32) != 0;
        if (bl) {
            n ^= 255;
        }
        int n2 = 5 - (31 - Integer.numberOfLeadingZeros((int)(n & 63)));
        if (bl) {
            return n2;
        }
        return -n2;
    }

    private static long decodeTrailingSignificandByte(int n, int n2) {
        return (long)(n & 254) << n2 - 1;
    }

    public static byte[] encode(NumberParts numberParts) {
        IllegalStateException illegalStateException;
        block14 : {
            int n;
            int n2;
            int n3;
            long l;
            byte[] arrby;
            block11 : {
                long l2;
                int n4;
                int n5;
                block13 : {
                    block12 : {
                        block10 : {
                            if (numberParts.isZero()) {
                                return NumberIndexEncoder.copyOf(ENCODED_ZERO);
                            }
                            if (numberParts.isNaN()) {
                                return NumberIndexEncoder.copyOf(ENCODED_NAN);
                            }
                            if (numberParts.isInfinite()) {
                                if (numberParts.negative()) {
                                    return NumberIndexEncoder.copyOf(ENCODED_NEGATIVE_INFINITY);
                                }
                                return NumberIndexEncoder.copyOf(ENCODED_POSITIVE_INFINITY);
                            }
                            n4 = numberParts.exponent();
                            l2 = numberParts.significand();
                            arrby = new byte[11];
                            n2 = numberParts.negative() ? 255 : 0;
                            n5 = 0;
                            if (n4 < 0) {
                                n4 = -n4;
                                n5 = 255;
                            }
                            if (n4 >= 4) break block10;
                            int n6 = n4 + 1;
                            int n7 = 192 | 1 << n6 | -2 + (1 << n6) & (int)(l2 >>> 64 - n6);
                            l = l2 << n4;
                            if (n5 != 0) {
                                n7 ^= 126 & -1 << n6;
                            }
                            n = n7;
                            n3 = 0;
                            break block11;
                        }
                        if (n4 >= 20) break block12;
                        int n8 = (224 | n4 - 4) ^ (n2 ^ n5 & 127);
                        int n9 = 0 + 1;
                        arrby[0] = (byte)n8;
                        int n10 = NumberIndexEncoder.topSignificandByte(l2);
                        l = l2 << 7;
                        n = n10;
                        n3 = n9;
                        break block11;
                    }
                    if (n4 >= 148) break block13;
                    int n11 = n4 - 20;
                    int n12 = (240 | n11 >>> 4) ^ (n2 ^ n5 & 127);
                    int n13 = 0 + 1;
                    arrby[0] = (byte)n12;
                    int n14 = 240 & n11 << 4 | (int)(l2 >>> 60);
                    long l3 = l2 << 4;
                    int n15 = n14 ^ (n2 ^ n5 & 240);
                    n3 = n13 + 1;
                    arrby[n13] = (byte)n15;
                    n = NumberIndexEncoder.topSignificandByte(l3);
                    l = l3 << 7;
                    break block11;
                }
                if (n4 >= 1172) break block14;
                int n16 = n4 - 148;
                int n17 = (248 | n16 >>> 8) ^ (n2 ^ n5 & 127);
                int n18 = 0 + 1;
                arrby[0] = (byte)n17;
                int n19 = n16 & 255 ^ (n2 ^ n5 & 255);
                n3 = n18 + 1;
                arrby[n18] = (byte)n19;
                n = NumberIndexEncoder.topSignificandByte(l2);
                l = l2 << 7;
            }
            while (l != 0L) {
                int n20 = n2 ^ (n | 1);
                int n21 = n3 + 1;
                arrby[n3] = (byte)n20;
                n = NumberIndexEncoder.topSignificandByte(l);
                l <<= 7;
                n3 = n21;
            }
            int n22 = n ^ n2;
            int n23 = n3 + 1;
            arrby[n3] = (byte)n22;
            return Arrays.copyOf((byte[])arrby, (int)n23);
        }
        illegalStateException = new IllegalStateException("unimplemented");
        throw illegalStateException;
    }

    public static byte[] encodeDouble(double d) {
        return NumberIndexEncoder.encode(NumberParts.fromDouble(d));
    }

    public static byte[] encodeLong(long l) {
        return NumberIndexEncoder.encode(NumberParts.fromLong(l));
    }

    private static int topSignificandByte(long l) {
        return 254 & (int)(l >>> 56);
    }

    public static final class DecodedNumberParts {
        private final int bytesRead;
        private final NumberParts parts;

        private DecodedNumberParts(int n, NumberParts numberParts) {
            this.bytesRead = n;
            this.parts = numberParts;
        }

        static DecodedNumberParts create(int n, NumberParts numberParts) {
            return new DecodedNumberParts(n, numberParts);
        }

        public int bytesRead() {
            return this.bytesRead;
        }

        public NumberParts parts() {
            return this.parts;
        }
    }

}

