package p341ge.bog.mobilebank.shared.tmx_profiling;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.shared.tmx_profiling.TMXFlags */
public final class TMXFlags {
    public static final C34671a Companion = new C34671a((DefaultConstructorMarker) null);
    public static final String DEP_LOAN = "DEP_LOAN";
    public static final String P2P_TRANSFERS = "P2P_TRANSFERS";
    public static final String TMX_FLAG_CARD_APPLICATION_KEY = "CARD_APPLICATION";
    public static final String TMX_FLAG_CARD_INFO_KEY = "CARD_INFO";
    public static final String TMX_FLAG_CARD_ORDER_AGGR_KEY = "CARD_ORDER_AGGR";
    public static final String TMX_FLAG_CARD_UNBLOCK = "CARD_UNBLOCK";
    public static final String TMX_FLAG_DD_KEY = "DD";
    public static final String TMX_FLAG_DEPOSIT_BREAK_KEY = "DEPOSIT_BREAK";
    public static final String TMX_FLAG_LOAN_ACTIVATE_KEY = "LOAN_ACTIVATE";
    public static final String TMX_FLAG_QR_LOGIN_KEY = "QR_LOGIN";
    public static final String TMX_FLAG_QR_WITHDRAWAL = "QR_WITHDRAWAL";
    public static final String TMX_FLAG_SMS_NOTIFS = "SMS_NOTIFS";
    public static final String TMX_FLAG_STO_KEY = "STO";
    public static final String TMX_FLAG_TRANSFERS_KEY = "TRANSFER";
    public static final String TMX_FLAG_UTILITY_PAY = "UTILITY_PAY";
    public static final String TMX_WALLET_CARD_ADD = "WALLET_CARD_ADD";
    private final List<TMXFlag> forms;

    /* renamed from: ge.bog.mobilebank.shared.tmx_profiling.TMXFlags$a */
    public static final class C34671a {
        private C34671a() {
        }

        public /* synthetic */ C34671a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TMXFlags(List<TMXFlag> list) {
        C41536l.m120489i(list, "forms");
        this.forms = list;
    }

    public static /* synthetic */ TMXFlags copy$default(TMXFlags tMXFlags, List<TMXFlag> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tMXFlags.forms;
        }
        return tMXFlags.copy(list);
    }

    public final List<TMXFlag> component1() {
        return this.forms;
    }

    public final TMXFlags copy(List<TMXFlag> list) {
        C41536l.m120489i(list, "forms");
        return new TMXFlags(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TMXFlags) && C41536l.m120484d(this.forms, ((TMXFlags) obj).forms);
    }

    public final List<TMXFlag> getForms() {
        return this.forms;
    }

    public int hashCode() {
        return this.forms.hashCode();
    }

    public String toString() {
        List<TMXFlag> list = this.forms;
        return "TMXFlags(forms=" + list + ")";
    }
}
