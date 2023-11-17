package p341ge.bog.mobilebank.galtandtaggart.presentation.trading;

import g31.C32054a;
import g41.C32081a;
import hd1.C41204a;
import if0.C25192a;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg0.C26216n;
import mg0.C26217o;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10463g;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeResultViewModel$ViewModel */
public final class GTShareTradeResultViewModel$ViewModel extends C21481a implements C26216n, C26217o {

    /* renamed from: d */
    private final C26216n f62037d = this;

    /* renamed from: e */
    private final C26217o f62038e = this;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeResultViewModel$ViewModel$a */
    public /* synthetic */ class C23858a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62039a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.BUY_SHARE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.SELL_SHARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f62039a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeResultViewModel$ViewModel.C23858a.<clinit>():void");
        }
    }

    public GTShareTradeResultViewModel$ViewModel() {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: dw */
    public final C26216n mo60833dw() {
        return this.f62037d;
    }

    /* renamed from: e2 */
    public void mo60834e2(C25192a aVar, String str) {
        C41536l.m120489i(aVar, "actionType");
        C41536l.m120489i(str, "symbol");
        int i = C23858a.f62039a[aVar.ordinal()];
        if (i == 1) {
            C32054a.C32056b bVar = C32054a.C32056b.f78898f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            C32081a.m94499a(bVar, F, " ", str);
        } else if (i == 2) {
            C32054a.C32075u uVar = C32054a.C32075u.f78916f;
            C10463g F2 = C36546y.m108282F();
            C41536l.m120488h(F2, "getAnalytics()");
            C32081a.m94499a(uVar, F2, " ", str);
        } else {
            throw new IllegalStateException("Illegal Action Type");
        }
    }
}
