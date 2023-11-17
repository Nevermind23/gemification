package p341ge.bog.mobilebank.galtandtaggart.presentation.trading;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import if0.C25192a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg0.C26220r;
import mg0.C26221s;
import mg0.C26222t;
import mg0.C26223u;
import mg0.C26224v;
import mg0.C26225w;
import mg0.C26226x;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import ue1.C43075l;
import we0.C29321a;
import we0.C29338i0;
import we0.C29356p0;
import we0.C29362u;
import xe1.C43263c;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel */
public final class GTShareTradeViewModel$ViewModel extends C21481a implements C26220r, C26221s {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29321a f62040d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29356p0 f62041e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29362u f62042f;

    /* renamed from: g */
    private final C26221s f62043g = this;

    /* renamed from: h */
    private final C26220r f62044h = this;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C23864f f62045i;

    /* renamed from: j */
    private final C1644x f62046j = new C1644x();

    /* renamed from: k */
    private final C1644x f62047k = new C1644x();

    /* renamed from: l */
    private final C40767b f62048l;

    /* renamed from: m */
    private final C40767b f62049m;

    /* renamed from: n */
    private final C1644x f62050n;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel$a */
    static final class C23859a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeViewModel$ViewModel f62051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23859a(GTShareTradeViewModel$ViewModel gTShareTradeViewModel$ViewModel) {
            super(1);
            this.f62051d = gTShareTradeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40749p O = this.f62051d.f62042f.mo69210b().mo95075O();
            C41536l.m120488h(O, "getGTMarketIsOpen().toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel$b */
    static final class C23860b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeViewModel$ViewModel f62052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23860b(GTShareTradeViewModel$ViewModel gTShareTradeViewModel$ViewModel) {
            super(1);
            this.f62052d = gTShareTradeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C23864f fVar) {
            C41536l.m120489i(fVar, "par");
            this.f62052d.f62045i = fVar;
            C40749p O = this.f62052d.f62040d.mo69177a(fVar.mo60853d(), fVar.mo60852c(), fVar.mo60850a(), "USD", fVar.mo60851b(), 2).mo95075O();
            C41536l.m120488h(O, "with(par) {\n            …         }.toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel$c */
    static final class C23861c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeViewModel$ViewModel f62053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23861c(GTShareTradeViewModel$ViewModel gTShareTradeViewModel$ViewModel) {
            super(1);
            this.f62053d = gTShareTradeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60847a(C31128a aVar) {
            this.f62053d.mo60835Ba().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60847a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel$d */
    static final class C23862d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeViewModel$ViewModel f62054d;

        /* renamed from: e */
        final /* synthetic */ UtmParamsEntity f62055e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23862d(GTShareTradeViewModel$ViewModel gTShareTradeViewModel$ViewModel, UtmParamsEntity utmParamsEntity) {
            super(1);
            this.f62054d = gTShareTradeViewModel$ViewModel;
            this.f62055e = utmParamsEntity;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            String str;
            String str2;
            String str3;
            C41536l.m120489i(wVar, "it");
            C29356p0 qw = this.f62054d.f62041e;
            C23864f nw = this.f62054d.f62045i;
            if (nw == null) {
                C41536l.m120506z("actionParams");
                nw = null;
            }
            String d = nw.mo60853d();
            C23864f nw2 = this.f62054d.f62045i;
            if (nw2 == null) {
                C41536l.m120506z("actionParams");
                nw2 = null;
            }
            String c = nw2.mo60852c();
            C23864f nw3 = this.f62054d.f62045i;
            if (nw3 == null) {
                C41536l.m120506z("actionParams");
                nw3 = null;
            }
            Double a = nw3.mo60850a();
            C23864f nw4 = this.f62054d.f62045i;
            if (nw4 == null) {
                C41536l.m120506z("actionParams");
                nw4 = null;
            }
            Double b = nw4.mo60851b();
            int c2 = C43263c.f101019d.mo101947c();
            UtmParamsEntity utmParamsEntity = this.f62055e;
            if (utmParamsEntity != null) {
                str = utmParamsEntity.getMedium();
            } else {
                str = null;
            }
            UtmParamsEntity utmParamsEntity2 = this.f62055e;
            if (utmParamsEntity2 != null) {
                str2 = utmParamsEntity2.getSource();
            } else {
                str2 = null;
            }
            UtmParamsEntity utmParamsEntity3 = this.f62055e;
            if (utmParamsEntity3 != null) {
                str3 = utmParamsEntity3.getCampaign();
            } else {
                str3 = null;
            }
            C40749p O = qw.mo69205c(d, c, a, "USD", b, c2, str, str2, str3).mo95075O();
            C41536l.m120488h(O, "tradeShareUseCase(\n     …          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel$e */
    static final class C23863e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeViewModel$ViewModel f62056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23863e(GTShareTradeViewModel$ViewModel gTShareTradeViewModel$ViewModel) {
            super(1);
            this.f62056d = gTShareTradeViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60849a(C31128a aVar) {
            this.f62056d.mo60837ge().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60849a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel$f */
    private static final class C23864f {

        /* renamed from: a */
        private final String f62057a;

        /* renamed from: b */
        private final String f62058b;

        /* renamed from: c */
        private final Double f62059c;

        /* renamed from: d */
        private final Double f62060d;

        public C23864f(String str, String str2, Double d, Double d2) {
            C41536l.m120489i(str, "symbol");
            C41536l.m120489i(str2, "side");
            this.f62057a = str;
            this.f62058b = str2;
            this.f62059c = d;
            this.f62060d = d2;
        }

        /* renamed from: a */
        public final Double mo60850a() {
            return this.f62059c;
        }

        /* renamed from: b */
        public final Double mo60851b() {
            return this.f62060d;
        }

        /* renamed from: c */
        public final String mo60852c() {
            return this.f62058b;
        }

        /* renamed from: d */
        public final String mo60853d() {
            return this.f62057a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23864f)) {
                return false;
            }
            C23864f fVar = (C23864f) obj;
            return C41536l.m120484d(this.f62057a, fVar.f62057a) && C41536l.m120484d(this.f62058b, fVar.f62058b) && C41536l.m120484d(this.f62059c, fVar.f62059c) && C41536l.m120484d(this.f62060d, fVar.f62060d);
        }

        public int hashCode() {
            int hashCode = ((this.f62057a.hashCode() * 31) + this.f62058b.hashCode()) * 31;
            Double d = this.f62059c;
            int i = 0;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.f62060d;
            if (d2 != null) {
                i = d2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.f62057a;
            String str2 = this.f62058b;
            Double d = this.f62059c;
            Double d2 = this.f62060d;
            return "ActionParams(symbol=" + str + ", side=" + str2 + ", amount=" + d + ", quantity=" + d2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel$g */
    public /* synthetic */ class C23865g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62061a;

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
                f62061a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel.C23865g.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTShareTradeViewModel$ViewModel(C29321a aVar, C29356p0 p0Var, C29362u uVar, C29338i0 i0Var) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "calculateTradeDataUseCase");
        C41536l.m120489i(p0Var, "tradeShareUseCase");
        C41536l.m120489i(uVar, "getGTMarketIsOpen");
        C41536l.m120489i(i0Var, "getUTMParametersUseCase");
        this.f62040d = aVar;
        this.f62041e = p0Var;
        this.f62042f = uVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f62048l = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<ActionParams>()");
        this.f62049m = h12;
        this.f62050n = new C1644x();
        C40749p L0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C26222t(new C23859a(this)));
        C41536l.m120488h(L0, "merge(onRefresh(), onIni…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, mo60841u()));
        C41205b F0 = h12.mo94998Q(new C26223u(new C23860b(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26224v(new C23861c(this)));
        C41536l.m120488h(F0, "symbolSubject.flatMap { …result)\n                }");
        bindToLifecycle(F0);
        C41205b F02 = h1.mo94998Q(new C26225w(new C23862d(this, i0Var.mo69193a()))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26226x(new C23863e(this)));
        C41536l.m120488h(F02, "tradeRequestSubject.flat…result)\n                }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C40754t m77063iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C40754t m77064jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m77065kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m77066lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m77067mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Is */
    public void mo60836Is() {
        this.f62048l.onNext(C41238w.f97225a);
    }

    /* renamed from: lf */
    public void mo60838lf(String str, C25192a aVar, Double d, Double d2) {
        String str2;
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(aVar, "actionType");
        C40767b bVar = this.f62049m;
        int i = C23865g.f62061a[aVar.ordinal()];
        if (i == 1) {
            str2 = "BUY";
        } else if (i == 2) {
            str2 = "SELL";
        } else {
            throw new IllegalStateException("Illegal Action Type");
        }
        bVar.onNext(new C23864f(str, str2, d, d2));
    }

    /* renamed from: sw */
    public final C26220r mo60839sw() {
        return this.f62044h;
    }

    /* renamed from: tw */
    public C1644x mo60841u() {
        return this.f62050n;
    }

    /* renamed from: uw */
    public final C26221s mo60842uw() {
        return this.f62043g;
    }

    /* renamed from: vw */
    public C1644x mo60835Ba() {
        return this.f62046j;
    }

    /* renamed from: ww */
    public C1644x mo60837ge() {
        return this.f62047k;
    }
}
