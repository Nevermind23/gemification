package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum ContactType {
    PHONE("PHONE"),
    MAIL("MAIL"),
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

        public final ContactType safeValueOf(String str) {
            ContactType contactType;
            C41536l.m120489i(str, "rawValue");
            ContactType[] values = ContactType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    contactType = null;
                    break;
                }
                contactType = values[i];
                if (C41536l.m120484d(contactType.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (contactType == null) {
                return ContactType.UNKNOWN__;
            }
            return contactType;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private ContactType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
