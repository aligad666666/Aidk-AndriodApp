/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

public abstract class ChannelLogger {
    public abstract void log(ChannelLogLevel var1, String var2);

    public /* varargs */ abstract void log(ChannelLogLevel var1, String var2, Object ... var3);

    public static final class ChannelLogLevel
    extends Enum<ChannelLogLevel> {
        private static final /* synthetic */ ChannelLogLevel[] $VALUES;
        public static final /* enum */ ChannelLogLevel DEBUG = new ChannelLogLevel();
        public static final /* enum */ ChannelLogLevel ERROR;
        public static final /* enum */ ChannelLogLevel INFO;
        public static final /* enum */ ChannelLogLevel WARNING;

        static {
            INFO = new ChannelLogLevel();
            WARNING = new ChannelLogLevel();
            ERROR = new ChannelLogLevel();
            ChannelLogLevel[] arrchannelLogLevel = new ChannelLogLevel[]{DEBUG, INFO, WARNING, ERROR};
            $VALUES = arrchannelLogLevel;
        }

        public static ChannelLogLevel valueOf(String string) {
            return (ChannelLogLevel)Enum.valueOf(ChannelLogLevel.class, (String)string);
        }

        public static ChannelLogLevel[] values() {
            return (ChannelLogLevel[])$VALUES.clone();
        }
    }

}

