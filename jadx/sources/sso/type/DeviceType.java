package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum DeviceType {
    IOS("IOS"),
    ANDROID("ANDROID"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = null;
    private final String rawValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DeviceType safeValueOf(String str) {
            DeviceType deviceType;
            C41536l.m120489i(str, "rawValue");
            DeviceType[] values = DeviceType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    deviceType = null;
                    break;
                }
                deviceType = values[i];
                if (C41536l.m120484d(deviceType.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (deviceType == null) {
                return DeviceType.UNKNOWN__;
            }
            return deviceType;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private DeviceType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
