package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum ProcessFlow {
    DEFAULT("DEFAULT"),
    IDENTIFY_BY_DOCUMENT("IDENTIFY_BY_DOCUMENT"),
    IDENTIFY_BY_VIDEO("IDENTIFY_BY_VIDEO"),
    IDENTIFY_BY_CARD("IDENTIFY_BY_CARD"),
    IDENTIFY_BY_ONLY_CARD("IDENTIFY_BY_ONLY_CARD"),
    REGISTER_NEW_USER("REGISTER_NEW_USER"),
    REGISTER_NEW_CLIENT("REGISTER_NEW_CLIENT"),
    ADD_FINANCIAL_CONTACT("ADD_FINANCIAL_CONTACT"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = null;
    private final String rawValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProcessFlow safeValueOf(String str) {
            ProcessFlow processFlow;
            C41536l.m120489i(str, "rawValue");
            ProcessFlow[] values = ProcessFlow.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    processFlow = null;
                    break;
                }
                processFlow = values[i];
                if (C41536l.m120484d(processFlow.getRawValue(), str)) {
                    break;
                }
                i++;
            }
            if (processFlow == null) {
                return ProcessFlow.UNKNOWN__;
            }
            return processFlow;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private ProcessFlow(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
