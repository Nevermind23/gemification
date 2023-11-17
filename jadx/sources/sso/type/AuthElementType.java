package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum AuthElementType {
    PASSWORD("PASSWORD"),
    OTP("OTP"),
    PASSCODE("PASSCODE"),
    BIOMETRY("BIOMETRY"),
    TRUSTED_DEVICE("TRUSTED_DEVICE"),
    VIDEO_ID("VIDEO_ID"),
    DIGIPASS_SIGNATURE("DIGIPASS_SIGNATURE"),
    QR("QR"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = null;
    private final String rawValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthElementType safeValueOf(String str) {
            AuthElementType authElementType;
            C41536l.m120489i(str, "rawValue");
            AuthElementType[] values = AuthElementType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    authElementType = null;
                    break;
                }
                authElementType = values[i];
                if (C41536l.m120484d(authElementType.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (authElementType == null) {
                return AuthElementType.UNKNOWN__;
            }
            return authElementType;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private AuthElementType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
