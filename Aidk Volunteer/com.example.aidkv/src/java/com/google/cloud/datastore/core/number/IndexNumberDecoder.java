/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.cloud.datastore.core.number;

public class IndexNumberDecoder {
    private String doubleResultRepProblemMessage;
    private String longResultRepProblemMessage;
    private double resultAsDouble;
    private long resultAsLong;
    private int resultExponent;
    private boolean resultNegative;
    private long resultSignificand;

    public IndexNumberDecoder() {
        this.reset();
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

    private void recordNumber(boolean bl, int n, long l) {
        this.longResultRepProblemMessage = null;
        this.doubleResultRepProblemMessage = null;
        this.resultNegative = bl;
        this.resultExponent = n;
        this.resultSignificand = l;
    }

    private void updateResultDoubleState() {
        if (this.doubleResultRepProblemMessage != null) {
            return;
        }
        this.doubleResultRepProblemMessage = "";
        int n = this.resultExponent;
        long l = 0L;
        if (n == Integer.MAX_VALUE) {
            if (this.resultSignificand == l) {
                if (this.resultNegative) {
                    this.resultAsDouble = Double.NEGATIVE_INFINITY;
                    return;
                }
                this.resultAsDouble = Double.POSITIVE_INFINITY;
                return;
            }
            this.resultAsDouble = Double.NaN;
            return;
        }
        if (n == Integer.MIN_VALUE && this.resultSignificand == l) {
            this.resultAsDouble = 0.0;
            return;
        }
        if (64 - Long.numberOfTrailingZeros((long)this.resultSignificand) > 52) {
            this.doubleResultRepProblemMessage = "Number has too many significant bits for a double.";
            return;
        }
        this.resultSignificand >>>= 12;
        int n2 = this.resultExponent;
        if (n2 >= -1022) {
            this.resultExponent = n2 + 1023;
        } else {
            int n3 = -1022 - n2;
            long l2 = this.resultSignificand;
            this.resultSignificand >>>= n3;
            if (this.resultSignificand << n3 != l2) {
                this.doubleResultRepProblemMessage = "Number has too many significant bits for a subnormal double.";
            }
            this.resultSignificand |= 1L << 52 - n3;
            this.resultExponent = 0;
        }
        long l3 = this.resultSignificand | (long)this.resultExponent << 52;
        if (this.resultNegative) {
            l = Long.MIN_VALUE;
        }
        this.resultAsDouble = Double.longBitsToDouble((long)(l | l3));
    }

    private void updateResultLongState() {
        if (this.longResultRepProblemMessage != null) {
            return;
        }
        this.longResultRepProblemMessage = "";
        int n = this.resultExponent;
        if (n == Integer.MAX_VALUE) {
            if (this.resultSignificand == 0L) {
                if (this.resultNegative) {
                    this.longResultRepProblemMessage = "+Infinity is not an integer.";
                    return;
                }
                this.longResultRepProblemMessage = "-Infinity is not an integer.";
                return;
            }
            this.longResultRepProblemMessage = "NaN is not an integer.";
            return;
        }
        if (n == Integer.MIN_VALUE && this.resultSignificand == 0L) {
            this.resultAsLong = 0L;
            return;
        }
        int n2 = this.resultExponent;
        if (n2 < 0) {
            this.longResultRepProblemMessage = "Number is not an integer.";
            return;
        }
        if (n2 >= 64) {
            this.longResultRepProblemMessage = "Number is outside the long range.";
            return;
        }
        if (n2 == 63) {
            if (this.resultSignificand == 0L && this.resultNegative) {
                this.resultAsLong = Long.MIN_VALUE;
                return;
            }
            this.longResultRepProblemMessage = "Number is outside the long range.";
            return;
        }
        int n3 = this.resultExponent;
        int n4 = 64 - Long.numberOfTrailingZeros((long)this.resultSignificand);
        if (n3 < n4) {
            this.longResultRepProblemMessage = "Number is not an integer.";
            return;
        }
        long l = this.resultSignificand >>> 1 + (63 - n3) ^ 1L << n3;
        if (this.resultNegative) {
            l = -l;
        }
        this.resultAsLong = l;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int decode(boolean var1_1, byte[] var2_2, int var3_3) {
        block15 : {
            block10 : {
                block11 : {
                    block12 : {
                        block13 : {
                            block14 : {
                                var4_4 = var3_3 + 1;
                                var5_5 = 255 & var2_2[var3_3];
                                var6_6 = (var5_5 & 128) == 0;
                                var7_7 = var6_6 != false ? 255 : 0;
                                var8_8 = var5_5 ^ var7_7;
                                var9_9 = var6_6 ^ var1_1;
                                var10_10 = (var8_8 & 64) == 0;
                                var11_11 = 0;
                                if (var10_10) {
                                    var11_11 = 255;
                                }
                                var12_12 = 0L;
                                var14_13 = 64;
                                var15_14 = IndexNumberDecoder.decodeMarker(var8_8 ^ var11_11);
                                if (var15_14 == -4) break block10;
                                if (var15_14 == -3 || var15_14 == -2 || var15_14 == -1) break block11;
                                if (var15_14 == 1) break block12;
                                if (var15_14 == 2) break block13;
                                if (var15_14 == 3) break block14;
                                if (var15_14 != 6) throw new IllegalArgumentException("Invalid encoded byte array");
                                if (!var6_6) ** GOTO lbl32
                                if (var10_10) {
                                    this.recordNumber(var9_9, Integer.MIN_VALUE, 0L);
                                } else {
                                    var40_15 = var4_4 + 1;
                                    var41_16 = 255 & var2_2[var4_4];
                                    if (var41_16 == 128) {
                                        this.recordNumber(var9_9, Integer.MAX_VALUE, 0L);
                                        return var40_15 - var3_3;
                                    }
                                    if (var41_16 != 96) throw new IllegalArgumentException("Invalid encoded byte array");
                                    this.recordNumber(var9_9, Integer.MAX_VALUE, 1L);
                                    return var40_15 - var3_3;
lbl32: // 1 sources:
                                    if (var10_10) {
                                        this.recordNumber(var9_9, Integer.MIN_VALUE, 0L);
                                    } else {
                                        this.recordNumber(var9_9, Integer.MAX_VALUE, 0L);
                                    }
                                }
                                var40_15 = var4_4;
                                return var40_15 - var3_3;
                            }
                            var17_17 = var7_7;
                            var34_18 = (3 & (var8_8 ^ var11_11)) << 8;
                            var35_19 = var4_4 + 1;
                            var36_20 = 148 + (var34_18 | var11_11 ^ (var17_17 ^ 255 & var2_2[var4_4]));
                            var37_21 = var35_19 + 1;
                            var8_8 = var17_17 ^ 255 & var2_2[var35_19];
                            var12_12 |= IndexNumberDecoder.decodeTrailingSignificandByte(var8_8, var14_13 -= 7);
                            var19_22 = var36_20;
                            var4_4 = var37_21;
                            break block15;
                        }
                        var17_17 = var7_7;
                        var25_23 = (7 & (var8_8 ^ var11_11)) << 4;
                        var26_24 = var4_4 + 1;
                        var27_25 = var17_17 ^ 255 & var2_2[var4_4];
                        var28_26 = 20 + (var25_23 | (var27_25 ^ var11_11) >>> 4);
                        var29_27 = var14_13 - 4;
                        var30_28 = var12_12 | (15L & (long)var27_25) << var29_27;
                        var32_29 = var26_24 + 1;
                        var8_8 = var17_17 ^ 255 & var2_2[var26_24];
                        var14_13 = var29_27 - 7;
                        var12_12 = var30_28 | IndexNumberDecoder.decodeTrailingSignificandByte(var8_8, var14_13);
                        var19_22 = var28_26;
                        var4_4 = var32_29;
                        break block15;
                    }
                    var17_17 = var7_7;
                    var19_22 = 4 + (15 & (var8_8 ^ var11_11));
                    var23_30 = var4_4 + 1;
                    var8_8 = var17_17 ^ 255 & var2_2[var4_4];
                    var12_12 |= IndexNumberDecoder.decodeTrailingSignificandByte(var8_8, var14_13 -= 7);
                    var4_4 = var23_30;
                    break block15;
                }
                var17_17 = var7_7;
                var19_22 = var15_14 + 4;
                var21_31 = var8_8 & (126 & (-1 ^ -1 << var19_22 + 1));
                var12_12 |= (long)var21_31 << (var14_13 -= var19_22) - 1;
                break block15;
            }
            var17_17 = var7_7;
            if (var10_10) {
                var18_33 = new IllegalArgumentException("Invalid encoded number: exponent negative zero is invalid");
                throw var18_33;
            }
            var19_22 = 0;
        }
        while ((var8_8 & 1) != 0) {
            var20_32 = var4_4 + 1;
            var8_8 = var17_17 ^ 255 & var2_2[var4_4];
            if ((var14_13 -= 7) >= 0) {
                var12_12 |= IndexNumberDecoder.decodeTrailingSignificandByte(var8_8, var14_13);
                var4_4 = var20_32;
                continue;
            }
            var12_12 |= (long)(var8_8 & 254) >>> -(var14_13 - 1);
            if ((var8_8 & 1) != 0) throw new IllegalArgumentException("Invalid encoded byte array: overlong sequence");
            var4_4 = var20_32;
            var14_13 = 0;
        }
        if (var10_10) {
            var19_22 = -var19_22;
        }
        this.recordNumber(var9_9, var19_22, var12_12);
        return var4_4 - var3_3;
    }

    public boolean isResultDouble() {
        this.updateResultDoubleState();
        return this.doubleResultRepProblemMessage.isEmpty();
    }

    public boolean isResultLong() {
        this.updateResultLongState();
        return this.longResultRepProblemMessage.isEmpty();
    }

    public void reset() {
        this.longResultRepProblemMessage = "No bytes decoded.";
        this.doubleResultRepProblemMessage = "No bytes decoded.";
    }

    public double resultAsDouble() {
        this.updateResultDoubleState();
        if (this.doubleResultRepProblemMessage.isEmpty()) {
            return this.resultAsDouble;
        }
        throw new IllegalArgumentException(this.doubleResultRepProblemMessage);
    }

    public long resultAsLong() {
        this.updateResultLongState();
        if (this.longResultRepProblemMessage.isEmpty()) {
            return this.resultAsLong;
        }
        throw new IllegalArgumentException(this.longResultRepProblemMessage);
    }
}

