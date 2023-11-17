package p341ge.bog.mobilebank.model.usrinfo;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10320i;

/* renamed from: ge.bog.mobilebank.model.usrinfo.StatusDialogIcon */
public enum StatusDialogIcon {
    STATUS_DIALOG_EXPRESS("MEMBER", C10320i.statuses_dialog_express),
    STATUS_DIALOG_CLASSIC("CLASSIC_NEW", C10320i.statuses_dialog_classic),
    STATUS_DIALOG_SILVER("SILVER_NEW", C10320i.statuses_dialog_silver),
    STATUS_DIALOG_GOLD("GOLD_NEW", C10320i.statuses_dialog_gold);
    
    public static final Companion Companion = null;
    private final int iconRes;
    private final String labelTypeNewDesc;

    /* renamed from: ge.bog.mobilebank.model.usrinfo.StatusDialogIcon$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StatusDialogIcon getByLabelType(String str) {
            for (StatusDialogIcon statusDialogIcon : StatusDialogIcon.values()) {
                if (C41536l.m120484d(statusDialogIcon.getLabelTypeNewDesc(), str)) {
                    return statusDialogIcon;
                }
            }
            return null;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private StatusDialogIcon(String str, int i) {
        this.labelTypeNewDesc = str;
        this.iconRes = i;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getLabelTypeNewDesc() {
        return this.labelTypeNewDesc;
    }
}
