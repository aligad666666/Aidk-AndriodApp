/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.firebase.geofire.util;

public final class Base32Utils {
    private static final String BASE32_CHARS = "0123456789bcdefghjkmnpqrstuvwxyz";
    public static final int BITS_PER_BASE32_CHAR = 5;

    private Base32Utils() {
        throw new AssertionError((Object)"No instances.");
    }

    public static int base32CharToValue(char c) {
        int n = BASE32_CHARS.indexOf((int)c);
        if (n != -1) {
            return n;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a valid base32 char: ");
        stringBuilder.append(c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static boolean isValidBase32String(String string2) {
        return string2.matches("^[0123456789bcdefghjkmnpqrstuvwxyz]*$");
    }

    public static char valueToBase32Char(int n) {
        if (n >= 0 && n < BASE32_CHARS.length()) {
            return BASE32_CHARS.charAt(n);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a valid base32 value: ");
        stringBuilder.append(n);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

