package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum AuthTokenType {
    BIOMETRIC("BIOMETRIC"),
    PASSCODE("PASSCODE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = null;
    private final String rawValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthTokenType safeValueOf(String str) {
            AuthTokenType authTokenType;
            C41536l.m120489i(str, "rawValue");
            AuthTokenType[] values = AuthTokenType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    authTokenType = null;
                    break;
                }
                authTokenType = values[i];
                if (C41536l.m120484d(authTokenType.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (authTokenType == null) {
                return AuthTokenType.UNKNOWN__;
            }
            return authTokenType;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private AuthTokenType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
