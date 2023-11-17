package p341ge.bog.mobilebank.rest.model;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.rest.model.DarkModeType */
public enum DarkModeType {
    NONE(1),
    DARK(2),
    AUTO(-1);
    
    public static final Companion Companion = null;
    private final int value;

    /* renamed from: ge.bog.mobilebank.rest.model.DarkModeType$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DarkModeType fromName(String str) {
            DarkModeType darkModeType;
            DarkModeType[] values = DarkModeType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    darkModeType = null;
                    break;
                }
                darkModeType = values[i];
                if (C41536l.m120484d(darkModeType.name(), str)) {
                    break;
                }
                i++;
            }
            if (darkModeType == null) {
                return DarkModeType.NONE;
            }
            return darkModeType;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private DarkModeType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
