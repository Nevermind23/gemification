package p341ge.bog.mobilebank.model.usrinfo;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.model.usrinfo.StatusDialogType */
public enum StatusDialogType {
    NEW_CLIENT("N"),
    UPGRADE("U"),
    DOWNGRADE("D"),
    SAME("S");
    
    public static final Companion Companion = null;
    private final String typeNameShort;

    /* renamed from: ge.bog.mobilebank.model.usrinfo.StatusDialogType$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StatusDialogType getByShortName(String str) {
            C41536l.m120489i(str, "shortName");
            for (StatusDialogType statusDialogType : StatusDialogType.values()) {
                if (C41536l.m120484d(statusDialogType.getTypeNameShort(), str)) {
                    return statusDialogType;
                }
            }
            return null;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private StatusDialogType(String str) {
        this.typeNameShort = str;
    }

    public final String getTypeNameShort() {
        return this.typeNameShort;
    }
}
