package p341ge.bog.mobilebank.galtandtaggart.presentation.exchange;

import g31.C32054a;
import g41.C32081a;
import hd1.C41204a;
import if0.C25192a;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C25954a;
import lf0.C25955b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10463g;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeResultViewModel$ViewModel */
public final class GTMoneyExchangeResultViewModel$ViewModel extends C21481a implements C25954a, C25955b {

    /* renamed from: d */
    private final C25955b f61198d = this;

    /* renamed from: e */
    private final C25954a f61199e = this;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeResultViewModel$ViewModel$a */
    public /* synthetic */ class C23393a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61200a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.GET_MONEY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.DEPOSIT_MONEY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61200a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeResultViewModel$ViewModel.C23393a.<clinit>():void");
        }
    }

    public GTMoneyExchangeResultViewModel$ViewModel() {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: dw */
    public final C25954a mo60185dw() {
        return this.f61199e;
    }

    /* renamed from: w0 */
    public void mo60186w0(C25192a aVar) {
        C41536l.m120489i(aVar, "actionType");
        int i = C23393a.f61200a[aVar.ordinal()];
        if (i == 1) {
            C32054a.C32079y yVar = C32054a.C32079y.f78920f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            C32081a.m94499a(yVar, F, " ", " ");
        } else if (i == 2) {
            C32054a.C32064j jVar = C32054a.C32064j.f78905f;
            C10463g F2 = C36546y.m108282F();
            C41536l.m120488h(F2, "getAnalytics()");
            C32081a.m94499a(jVar, F2, " ", " ");
        } else {
            throw new IllegalStateException("Illegal Action Type");
        }
    }
}
