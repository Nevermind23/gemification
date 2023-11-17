package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum RecoveryProcessFlow {
    TRANSACTIONS("TRANSACTIONS"),
    CONTACTS("CONTACTS"),
    ONBOARDING("ONBOARDING"),
    OLD_FLOW("OLD_FLOW"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = null;
    private final String rawValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RecoveryProcessFlow safeValueOf(String str) {
            RecoveryProcessFlow recoveryProcessFlow;
            C41536l.m120489i(str, "rawValue");
            RecoveryProcessFlow[] values = RecoveryProcessFlow.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    recoveryProcessFlow = null;
                    break;
                }
                recoveryProcessFlow = values[i];
                if (C41536l.m120484d(recoveryProcessFlow.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (recoveryProcessFlow == null) {
                return RecoveryProcessFlow.UNKNOWN__;
            }
            return recoveryProcessFlow;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private RecoveryProcessFlow(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
