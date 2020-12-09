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

@Retention(value=RetentionPolicy.SOURCE)
@Target(value={ElementType.LOCAL_VARIABLE})
public @interface LoopTranslation {
    public LoopStyle value();

    public static final class LoopStyle
    extends Enum<LoopStyle> {
        private static final /* synthetic */ LoopStyle[] $VALUES;
        public static final /* enum */ LoopStyle FAST_ENUMERATION;
        public static final /* enum */ LoopStyle JAVA_ITERATOR;

        static {
            JAVA_ITERATOR = new LoopStyle();
            FAST_ENUMERATION = new LoopStyle();
            LoopStyle[] arrloopStyle = new LoopStyle[]{JAVA_ITERATOR, FAST_ENUMERATION};
            $VALUES = arrloopStyle;
        }

        public static LoopStyle valueOf(String string2) {
            return (LoopStyle)Enum.valueOf(LoopStyle.class, (String)string2);
        }

        public static LoopStyle[] values() {
            return (LoopStyle[])$VALUES.clone();
        }
    }

}

