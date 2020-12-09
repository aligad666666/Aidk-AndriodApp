/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.annotation.Annotation
 *  java.lang.annotation.ElementType
 *  java.lang.annotation.Retention
 *  java.lang.annotation.RetentionPolicy
 *  java.lang.annotation.Target
 */
package com.google.j2objc.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.CLASS)
@Target(value={ElementType.TYPE, ElementType.PACKAGE})
public @interface ReflectionSupport {
    public Level value();

    public static final class Level
    extends Enum<Level> {
        private static final /* synthetic */ Level[] $VALUES;
        public static final /* enum */ Level FULL;
        public static final /* enum */ Level NATIVE_ONLY;

        static {
            NATIVE_ONLY = new Level();
            FULL = new Level();
            Level[] arrlevel = new Level[]{NATIVE_ONLY, FULL};
            $VALUES = arrlevel;
        }

        public static Level valueOf(String string2) {
            return (Level)Enum.valueOf(Level.class, (String)string2);
        }

        public static Level[] values() {
            return (Level[])$VALUES.clone();
        }
    }

}

