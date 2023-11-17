package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum Locale {
    KA("KA"),
    EN("EN"),
    TR("TR"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = null;
    private final String rawValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Locale safeValueOf(String str) {
            Locale locale;
            C41536l.m120489i(str, "rawValue");
            Locale[] values = Locale.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    locale = null;
                    break;
                }
                locale = values[i];
                if (C41536l.m120484d(locale.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (locale == null) {
                return Locale.UNKNOWN__;
            }
            return locale;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private Locale(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
