package p341ge.bog.mobilebank.model.usrinfo;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10318g;
import p366bk.C10320i;

/* renamed from: ge.bog.mobilebank.model.usrinfo.PlusStatusState */
public enum PlusStatusState {
    EXPRESS("MEMBER", C10320i.benefit_express_circle, C10318g.f28637Y0),
    CLASSIC("CLASSIC_NEW", C10320i.benefit_classic_circle, C10318g.f28644h1),
    SILVER("SILVER_NEW", C10320i.benefit_silver_circle, C10318g.f28622G0),
    GOLD("GOLD_NEW", C10320i.benefit_gold_circle, C10318g.f28645i1);
    
    public static final Companion Companion = null;
    private final int colorRes;
    private final int iconRes;
    private final String status;

    /* renamed from: ge.bog.mobilebank.model.usrinfo.PlusStatusState$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlusStatusState getByStatus(String str) {
            for (PlusStatusState plusStatusState : PlusStatusState.values()) {
                if (C41536l.m120484d(str, plusStatusState.getStatus())) {
                    return plusStatusState;
                }
            }
            return null;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private PlusStatusState(String str, int i, int i2) {
        this.status = str;
        this.iconRes = i;
        this.colorRes = i2;
    }

    public final int getColorRes() {
        return this.colorRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getStatus() {
        return this.status;
    }
}
