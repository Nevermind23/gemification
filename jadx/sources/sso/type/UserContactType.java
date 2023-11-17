package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum UserContactType {
    MAIL("MAIL"),
    PHONE("PHONE"),
    DIGIPASS("DIGIPASS"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = null;
    private final String rawValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserContactType safeValueOf(String str) {
            UserContactType userContactType;
            C41536l.m120489i(str, "rawValue");
            UserContactType[] values = UserContactType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    userContactType = null;
                    break;
                }
                userContactType = values[i];
                if (C41536l.m120484d(userContactType.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (userContactType == null) {
                return UserContactType.UNKNOWN__;
            }
            return userContactType;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private UserContactType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
