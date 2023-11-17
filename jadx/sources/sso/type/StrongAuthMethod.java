package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum StrongAuthMethod {
    ALL("ALL"),
    SMS("SMS"),
    DIGIPASS("DIGIPASS"),
    MAIL("MAIL"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = null;
    private final String rawValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StrongAuthMethod safeValueOf(String str) {
            StrongAuthMethod strongAuthMethod;
            C41536l.m120489i(str, "rawValue");
            StrongAuthMethod[] values = StrongAuthMethod.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strongAuthMethod = null;
                    break;
                }
                strongAuthMethod = values[i];
                if (C41536l.m120484d(strongAuthMethod.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (strongAuthMethod == null) {
                return StrongAuthMethod.UNKNOWN__;
            }
            return strongAuthMethod;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private StrongAuthMethod(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
