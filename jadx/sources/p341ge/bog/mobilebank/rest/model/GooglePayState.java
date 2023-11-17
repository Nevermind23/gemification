package p341ge.bog.mobilebank.rest.model;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.rest.model.GooglePayState */
public enum GooglePayState {
    ACTIVE,
    NOT_AVAILABLE,
    WALLET_NEEDS_CREATION;
    
    public static final Companion Companion = null;

    /* renamed from: ge.bog.mobilebank.rest.model.GooglePayState$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GooglePayState fromName(String str) {
            GooglePayState googlePayState;
            C41536l.m120489i(str, "stateName");
            GooglePayState[] values = GooglePayState.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    googlePayState = null;
                    break;
                }
                googlePayState = values[i];
                if (C41536l.m120484d(googlePayState.name(), str)) {
                    break;
                }
                i++;
            }
            if (googlePayState == null) {
                return GooglePayState.NOT_AVAILABLE;
            }
            return googlePayState;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public static final GooglePayState fromName(String str) {
        return Companion.fromName(str);
    }
}
