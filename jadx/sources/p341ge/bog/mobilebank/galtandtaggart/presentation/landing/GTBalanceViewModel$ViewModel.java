package p341ge.bog.mobilebank.galtandtaggart.presentation.landing;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of0.C26980n;
import of0.C26981o;
import of0.C26982p;
import of0.C26983q;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import we0.C29355p;
import xe0.C29746d;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTBalanceViewModel$ViewModel */
public final class GTBalanceViewModel$ViewModel extends C21481a implements C26980n, C26981o {

    /* renamed from: k */
    public static final C23477c f61327k = new C23477c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29355p f61328d;

    /* renamed from: e */
    private final C26980n f61329e = this;

    /* renamed from: f */
    private final C26981o f61330f = this;

    /* renamed from: g */
    private final C1644x f61331g = new C1644x();

    /* renamed from: h */
    private final C1644x f61332h = new C1644x();

    /* renamed from: i */
    private final C1644x f61333i = new C1644x();

    /* renamed from: j */
    private final C1644x f61334j = new C1644x();

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTBalanceViewModel$ViewModel$a */
    static final class C23474a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTBalanceViewModel$ViewModel f61335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23474a(GTBalanceViewModel$ViewModel gTBalanceViewModel$ViewModel) {
            super(1);
            this.f61335d = gTBalanceViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C31270e.m92879h(this.f61335d.f61328d.mo69204a(), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTBalanceViewModel$ViewModel$b */
    static final class C23475b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTBalanceViewModel$ViewModel f61336d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTBalanceViewModel$ViewModel$b$a */
        static final class C23476a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTBalanceViewModel$ViewModel f61337d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23476a(GTBalanceViewModel$ViewModel gTBalanceViewModel$ViewModel) {
                super(1);
                this.f61337d = gTBalanceViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo60295a(C29746d dVar) {
                boolean z;
                boolean z2;
                C41536l.m120489i(dVar, "cashData");
                C1644x jw = this.f61337d.mo60286fr();
                BigDecimal c = dVar.mo69771c();
                BigDecimal valueOf = BigDecimal.valueOf(0);
                C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                int compareTo = c.compareTo(valueOf);
                boolean z3 = true;
                if (compareTo > 0) {
                    z = true;
                } else {
                    z = false;
                }
                jw.mo4823o(Boolean.valueOf(z));
                C1644x lw = this.f61337d.mo60287h7();
                BigDecimal d = dVar.mo69772d();
                BigDecimal valueOf2 = BigDecimal.valueOf(0);
                C41536l.m120488h(valueOf2, "valueOf(this.toLong())");
                if (d.compareTo(valueOf2) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lw.mo4823o(Boolean.valueOf(z2));
                C1644x kw = this.f61337d.mo60284Ic();
                BigDecimal a = dVar.mo69769a();
                BigDecimal valueOf3 = BigDecimal.valueOf(0);
                C41536l.m120488h(valueOf3, "valueOf(this.toLong())");
                if (a.compareTo(valueOf3) <= 0) {
                    z3 = false;
                }
                kw.mo4823o(Boolean.valueOf(z3));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60295a((C29746d) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23475b(GTBalanceViewModel$ViewModel gTBalanceViewModel$ViewModel) {
            super(1);
            this.f61336d = gTBalanceViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60294a(C31128a aVar) {
            this.f61336d.mo60285Ut().mo4823o(aVar);
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C23476a(this.f61336d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60294a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTBalanceViewModel$ViewModel$c */
    public static final class C23477c {
        private C23477c() {
        }

        public /* synthetic */ C23477c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTBalanceViewModel$ViewModel(C29355p pVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(pVar, "getCashDataUseCase");
        this.f61328d = pVar;
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C26982p(new C23474a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26983q(new C23475b(this)));
        C41536l.m120488h(F0, "merge(onRefresh(), onIni…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m75942fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m75943gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: iw */
    public C1644x mo60285Ut() {
        return this.f61331g;
    }

    /* renamed from: jw */
    public C1644x mo60286fr() {
        return this.f61332h;
    }

    /* renamed from: kw */
    public C1644x mo60284Ic() {
        return this.f61334j;
    }

    /* renamed from: lw */
    public C1644x mo60287h7() {
        return this.f61333i;
    }

    /* renamed from: mw */
    public final C26981o mo60292mw() {
        return this.f61330f;
    }
}
