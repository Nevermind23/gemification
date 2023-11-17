package p341ge.bog.mobilebank.ddsto.presentation.ddform;

import android.content.Context;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import ba0.C19360c;
import ba0.C19361d;
import c41.C31270e;
import dy0.C31622e;
import ed1.C40749p;
import ed1.C40754t;
import ey0.C31880b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.C37833c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.payments.data.model.FormOtpParams;
import p341ge.bog.mobilebank.payments.presentation.form.C33692a;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import s31.C38421a;
import ue1.C43075l;
import ue1.C43079p;
import ux0.C39114b;
import ux0.C39148f0;
import ux0.C39150g0;
import ux0.C39152h0;
import ux0.C39154i0;
import ux0.C39157j0;
import ux0.C39160m;
import ux0.C39166q;

/* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b */
public final class C22738b extends C21481a implements C33692a, C39114b, C39150g0, C39157j0, C39152h0, C39154i0, C39148f0, C39166q, C39160m {

    /* renamed from: d */
    private final String f60003d;

    /* renamed from: e */
    private final String f60004e;

    /* renamed from: f */
    private final /* synthetic */ C39114b f60005f;

    /* renamed from: g */
    private final /* synthetic */ C39150g0 f60006g;

    /* renamed from: h */
    private final /* synthetic */ C39157j0 f60007h;

    /* renamed from: i */
    private final /* synthetic */ C39152h0 f60008i;

    /* renamed from: j */
    private final /* synthetic */ C39154i0 f60009j;

    /* renamed from: k */
    private final /* synthetic */ C39148f0 f60010k;

    /* renamed from: l */
    private final /* synthetic */ C39166q f60011l;

    /* renamed from: m */
    private final /* synthetic */ C39160m f60012m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f60013n = new C1644x();

    /* renamed from: o */
    private final C1644x f60014o = new C1644x();

    /* renamed from: p */
    private final C1644x f60015p = new C1644x();

    /* renamed from: q */
    private final C1644x f60016q = new C1644x();

    /* renamed from: r */
    private final C1644x f60017r = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f60018s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f60019t = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C1644x f60020u = new C1644x();

    /* renamed from: v */
    private final C1644x f60021v = new C1644x();

    /* renamed from: w */
    private final C1644x f60022w = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f60023x = new C1644x();

    /* renamed from: y */
    private final C1644x f60024y = new C1644x();

    /* renamed from: z */
    private final C1644x f60025z = new C1644x();

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$a */
    public interface C22739a {
        /* renamed from: a */
        C22738b mo32546a(String str, String str2);
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$b */
    public /* synthetic */ class C22740b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60026a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ey0.b[] r0 = ey0.C31880b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ey0.b r1 = ey0.C31880b.ADDITIONAL_INFO_TO_GET     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ey0.b r1 = ey0.C31880b.FINAL_PAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ey0.b r1 = ey0.C31880b.FIRST_PAGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f60026a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.ddsto.presentation.ddform.C22738b.C22740b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$c */
    static final class C22741c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22741c f60027d = new C22741c();

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$c$a */
        static final class C22742a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C41224m f60028d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22742a(C41224m mVar) {
                super(2);
                this.f60028d = mVar;
            }

            /* renamed from: a */
            public final C41224m invoke(String str, C41224m mVar) {
                C41536l.m120489i(str, "payData");
                C41536l.m120489i(mVar, "<anonymous parameter 1>");
                return new C41224m(str, this.f60028d);
            }
        }

        C22741c() {
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m73819c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "params");
            C40749p d1 = C40749p.m118037d1(C40749p.m118043h0("todo aq iqneba sheqmnis servisi"), C40749p.m118043h0(mVar), new C22754c(new C22742a(mVar)));
            C41536l.m120488h(d1, "params ->\n              …params)\n                }");
            return C31270e.m92879h(d1, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$d */
    static final class C22743d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22738b f60029d;

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$d$a */
        static final class C22744a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C22738b f60030d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22744a(C22738b bVar) {
                super(1);
                this.f60030d = bVar;
            }

            /* renamed from: a */
            public final void mo56553a(C41224m mVar) {
                this.f60030d.mo56494Kf(C31880b.ACTION_IN_PROGRESS);
                this.f60030d.mo56520fd(true, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56553a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$d$b */
        static final class C22745b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C22738b f60031d;

            /* renamed from: e */
            final /* synthetic */ C31128a f60032e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22745b(C22738b bVar, C31128a aVar) {
                super(1);
                this.f60031d = bVar;
                this.f60032e = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f60031d.mo56513af();
                this.f60031d.mo56520fd(false, true);
                this.f60031d.f60023x.mo4823o(this.f60032e);
            }
        }

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$d$c */
        static final class C22746c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C22746c f60033d = new C22746c();

            C22746c() {
                super(1);
            }

            /* renamed from: a */
            public final void mo56555a(C41224m mVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56555a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22743d(C22738b bVar) {
            super(1);
            this.f60029d = bVar;
        }

        /* renamed from: a */
        public final void mo56552a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C22744a(this.f60029d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C22745b(this.f60029d, aVar), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, C22746c.f60033d, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56552a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$e */
    static final class C22747e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22738b f60034d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22747e(C22738b bVar) {
            super(1);
            this.f60034d = bVar;
        }

        /* renamed from: a */
        public final void mo56556a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f60034d.f60018s.mo4823o((Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56556a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$f */
    static final class C22748f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22738b f60035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22748f(C22738b bVar) {
            super(1);
            this.f60035d = bVar;
        }

        /* renamed from: a */
        public final void mo56557a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f60035d.f60019t.mo4823o(C32343x.m95466m(wVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56557a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$g */
    static final class C22749g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22738b f60036d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22749g(C22738b bVar) {
            super(1);
            this.f60036d = bVar;
        }

        /* renamed from: a */
        public final void mo56558a(C31622e eVar) {
            C41536l.m120489i(eVar, "it");
            this.f60036d.f60020u.mo4823o(C32343x.m95466m(eVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56558a((C31622e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$h */
    static final class C22750h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22738b f60037d;

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$h$a */
        static final class C22751a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C22751a f60038d = new C22751a();

            C22751a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo56560a(C31128a aVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56560a((C31128a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22750h(C22738b bVar) {
            super(1);
            this.f60037d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m73829c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final void mo56559b(C41238w wVar) {
            C41205b F0;
            C41536l.m120489i(wVar, "it");
            this.f60037d.f60023x.mo4826r((Object) null);
            C22738b bVar = this.f60037d;
            C40749p xu = bVar.mo56547xu(bVar.mo56530ow());
            if (xu != null && (F0 = xu.mo94981F0(new C22755d(C22751a.f60038d))) != null) {
                this.f60037d.bindToLifecycle(F0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56559b((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$i */
    static final class C22752i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C22738b f60039d;

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.b$i$a */
        static final class C22753a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C22738b f60040d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22753a(C22738b bVar) {
                super(1);
                this.f60040d = bVar;
            }

            /* renamed from: a */
            public final void mo56562a(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                C38421a aVar = (C38421a) mVar.mo95675a();
                mVar.mo95676b();
                this.f60040d.mo56509Xb(true);
                this.f60040d.m73742lw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56562a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22752i(C22738b bVar) {
            super(1);
            this.f60039d = bVar;
        }

        /* renamed from: a */
        public final void mo56561a(C31128a aVar) {
            C41536l.m120489i(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C22753a(this.f60039d), 1, (Object) null);
            this.f60039d.f60013n.mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56561a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22738b(C39114b bVar, C39150g0 g0Var, C39157j0 j0Var, C39152h0 h0Var, C39154i0 i0Var, C39148f0 f0Var, C39166q qVar, C39160m mVar, String str, String str2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "finalActionDelegate");
        C41536l.m120489i(g0Var, "paymentConfigViewModelDelegate");
        C41536l.m120489i(j0Var, "templatesViewModelDelegate");
        C41536l.m120489i(h0Var, "savedValuesViewModelDelegate");
        C41536l.m120489i(i0Var, "scaStateViewModelDelegate");
        C41536l.m120489i(f0Var, "pageStateViewModelDelegate");
        C41536l.m120489i(qVar, "formStageViewModelDelegate");
        C41536l.m120489i(mVar, "formButtonViewDelegate");
        C41536l.m120489i(str, "paymentServiceId");
        C41536l.m120489i(str2, "pageInitialName");
        this.f60003d = str;
        this.f60004e = str2;
        this.f60005f = bVar;
        this.f60006g = g0Var;
        this.f60007h = j0Var;
        this.f60008i = h0Var;
        this.f60009j = i0Var;
        this.f60010k = f0Var;
        this.f60011l = qVar;
        this.f60012m = mVar;
        mo56505V4(str, str2);
        m73744yw();
        m73733Bw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m73732Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bw */
    private final void m73733Bw() {
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56504Tv(), this.f60017r, (C43075l) null, 4, (Object) null));
        bindToLifecycle(mo56543we(mo56500Pp(), (C1644x) null, new C22747e(this)));
        bindToLifecycle(mo56532qe(this.f60018s, C34646b.m101752f(C37833c.f90838a.mo91149k(), (Context) null, 1, (Object) null)));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56480B4(), this.f60024y, (C43075l) null, 4, (Object) null));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56485Cb(), this.f60021v, (C43075l) null, 4, (Object) null));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56519eu(), this.f60025z, (C43075l) null, 4, (Object) null));
        bindToLifecycle(mo56543we(mo56490Hf(), (C1644x) null, new C22748f(this)));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56483Bh(), this.f60016q, (C43075l) null, 4, (Object) null));
        bindToLifecycle(C39166q.C39167a.m114286a(this, mo56502Rb(), this.f60022w, (C43075l) null, 4, (Object) null));
        bindToLifecycle(mo56543we(mo56488Gr(), (C1644x) null, new C22749g(this)));
        bindToLifecycle(mo56543we(mo56499Pi(), (C1644x) null, new C22750h(this)));
        C40749p<Integer> onInit = onInit();
        C40749p<Integer> onRefresh = onRefresh();
        C40749p h0 = C40749p.m118043h0("get accounts");
        C41536l.m120488h(h0, "just(\"get accounts\")");
        bindToLifecycle(mo56497Mb(onInit, onRefresh, h0, this.f60015p, new C22752i(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public final void m73742lw() {
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(C31270e.m92879h(mo56522j7(), -1)), this.f60014o));
    }

    /* renamed from: mw */
    private final List m73743mw() {
        return C41341q.m119907j();
    }

    /* renamed from: yw */
    private final void m73744yw() {
        C40749p L0 = mo56493J7().mo94989L0(new C19360c(C22741c.f60027d));
        C41536l.m120488h(L0, "finishFinalProcessObserv…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo95031r0(C40749p.m118043h0(new C31128a.C31129a(new Exception(), 0, (Object) null, 6, (DefaultConstructorMarker) null))).mo94981F0(new C19361d(new C22743d(this)));
        C41536l.m120488h(F0, "private fun subscribeCre…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final C40754t m73745zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: A */
    public void mo56479A(C31622e eVar) {
        C41536l.m120489i(eVar, "template");
        mo56549y9(eVar);
    }

    /* renamed from: B4 */
    public C40749p mo56480B4() {
        return this.f60012m.mo56480B4();
    }

    /* renamed from: Bg */
    public void mo56482Bg() {
        int i;
        C31880b bVar = (C31880b) mo56526ku().get();
        if (bVar == null) {
            i = -1;
        } else {
            i = C22740b.f60026a[bVar.ordinal()];
        }
        if (i == 1 || i == 2 || i == 3) {
            mo56509Xb(false);
        }
    }

    /* renamed from: Bh */
    public C40749p mo56483Bh() {
        return this.f60009j.mo56483Bh();
    }

    /* renamed from: C5 */
    public String mo56484C5() {
        return this.f60006g.mo56484C5();
    }

    /* renamed from: Cb */
    public C40749p mo56485Cb() {
        return this.f60008i.mo56485Cb();
    }

    /* renamed from: Gr */
    public C40749p mo56488Gr() {
        return this.f60007h.mo56488Gr();
    }

    /* renamed from: H1 */
    public void mo56489H1() {
        this.f60012m.mo56489H1();
    }

    /* renamed from: Hf */
    public C40749p mo56490Hf() {
        return this.f60012m.mo56490Hf();
    }

    /* renamed from: Hq */
    public void mo56491Hq(String str, List list, List list2) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(list, "paramList");
        C41536l.m120489i(list2, "formValues");
        mo56495Kj(str, list, list2);
    }

    /* renamed from: J7 */
    public C40749p mo56493J7() {
        return this.f60005f.mo56493J7();
    }

    /* renamed from: Kf */
    public void mo56494Kf(C31880b bVar) {
        C41536l.m120489i(bVar, "stage");
        this.f60011l.mo56494Kf(bVar);
    }

    /* renamed from: Kj */
    public void mo56495Kj(String str, List list, List list2) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(list, "paramList");
        C41536l.m120489i(list2, "formValues");
        this.f60012m.mo56495Kj(str, list, list2);
    }

    /* renamed from: Kk */
    public String mo56496Kk() {
        return mo56514aj();
    }

    /* renamed from: Mb */
    public C41205b mo56497Mb(C40749p pVar, C40749p pVar2, C40749p pVar3, C1644x xVar, C43075l lVar) {
        C41536l.m120489i(pVar, "initObservable");
        C41536l.m120489i(pVar2, "refreshObservable");
        C41536l.m120489i(pVar3, "getDataObservable");
        C41536l.m120489i(xVar, "configResultLiveData");
        C41536l.m120489i(lVar, "onResult");
        return this.f60006g.mo56497Mb(pVar, pVar2, pVar3, xVar, lVar);
    }

    /* renamed from: P5 */
    public LiveData mo56498P5() {
        return this.f60021v;
    }

    /* renamed from: Pi */
    public C40749p mo56499Pi() {
        return this.f60005f.mo56499Pi();
    }

    /* renamed from: Pp */
    public C40749p mo56500Pp() {
        return this.f60011l.mo56500Pp();
    }

    /* renamed from: R1 */
    public void mo56501R1(List list) {
        C41536l.m120489i(list, "formValues");
        this.f60008i.mo56501R1(list);
    }

    /* renamed from: Rb */
    public C40749p mo56502Rb() {
        return this.f60011l.mo56502Rb();
    }

    /* renamed from: Tu */
    public boolean mo56503Tu() {
        return mo56508Wv();
    }

    /* renamed from: Tv */
    public C40749p mo56504Tv() {
        return this.f60010k.mo56504Tv();
    }

    /* renamed from: V4 */
    public void mo56505V4(String str, String str2) {
        C41536l.m120489i(str, "servId");
        C41536l.m120489i(str2, "pageTitle");
        this.f60006g.mo56505V4(str, str2);
    }

    /* renamed from: W3 */
    public HashMap mo56506W3(List list, String str) {
        C41536l.m120489i(list, "keyValues");
        String ow = mo56530ow();
        List B0 = C41358y.m119991B0(m73743mw());
        B0.addAll(list);
        C41238w wVar = C41238w.f97225a;
        return mo56511Yc(C39154i0.C39155a.m114239a(this, ow, (String) null, (String) null, (String) null, str, B0, 14, (Object) null));
    }

    /* renamed from: Wv */
    public boolean mo56508Wv() {
        return this.f60006g.mo56508Wv();
    }

    /* renamed from: Xb */
    public void mo56509Xb(boolean z) {
        this.f60011l.mo56509Xb(z);
    }

    /* renamed from: Yc */
    public HashMap mo56511Yc(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f60009j.mo56511Yc(otpParams);
    }

    /* renamed from: Yr */
    public void mo56512Yr(List list) {
        C41536l.m120489i(list, "formValues");
        this.f60008i.mo56512Yr(list);
    }

    /* renamed from: af */
    public void mo56513af() {
        this.f60005f.mo56513af();
    }

    /* renamed from: aj */
    public String mo56514aj() {
        return this.f60006g.mo56514aj();
    }

    /* renamed from: bs */
    public void mo56515bs() {
        mo56516c();
    }

    /* renamed from: c */
    public void mo56516c() {
        this.f60006g.mo56516c();
    }

    /* renamed from: cq */
    public void mo56517cq(C21503d dVar, String str, String str2, String str3, String str4, String str5, List list) {
        C41536l.m120489i(str, "otpServiceId");
        this.f60009j.mo56517cq(dVar, str, str2, str3, str4, str5, list);
    }

    /* renamed from: ed */
    public LiveData mo56518ed() {
        return this.f60022w;
    }

    /* renamed from: eu */
    public C40749p mo56519eu() {
        return this.f60012m.mo56519eu();
    }

    /* renamed from: fd */
    public void mo56520fd(boolean z, boolean z2) {
        this.f60010k.mo56520fd(z, z2);
    }

    /* renamed from: gp */
    public void mo56521gp(String str) {
        this.f60012m.mo56521gp(str);
    }

    /* renamed from: j7 */
    public C40749p mo56522j7() {
        return this.f60007h.mo56522j7();
    }

    /* renamed from: ju */
    public void mo56524ju(List list) {
        C41536l.m120489i(list, "formValues");
        mo56512Yr(list);
    }

    /* renamed from: k5 */
    public FormOtpParams mo56525k5(String str, String str2, String str3, String str4, String str5, List list) {
        C41536l.m120489i(str, "otpServiceId");
        return this.f60009j.mo56525k5(str, str2, str3, str4, str5, list);
    }

    /* renamed from: ku */
    public AtomicReference mo56526ku() {
        return this.f60011l.mo56526ku();
    }

    /* renamed from: ml */
    public List mo56527ml() {
        return mo56529ok();
    }

    /* renamed from: nw */
    public C1644x mo56546xj() {
        return this.f60023x;
    }

    /* renamed from: ok */
    public List mo56529ok() {
        return this.f60008i.mo56529ok();
    }

    /* renamed from: ow */
    public String mo56530ow() {
        return "";
    }

    /* renamed from: pw */
    public C1644x mo56487Da() {
        return this.f60017r;
    }

    /* renamed from: qe */
    public C41205b mo56532qe(C1644x xVar, String str) {
        C41536l.m120489i(xVar, "paymentDebtLiveData");
        C41536l.m120489i(str, "buttonText");
        return this.f60006g.mo56532qe(xVar, str);
    }

    /* renamed from: qw */
    public C1644x mo56541v9() {
        return this.f60013n;
    }

    /* renamed from: rw */
    public C1644x mo56510Xk() {
        return this.f60025z;
    }

    /* renamed from: s5 */
    public AtomicReference mo56535s5() {
        return this.f60006g.mo56535s5();
    }

    /* renamed from: sc */
    public void mo56536sc(C21503d dVar, String str, String str2, String str3, String str4, List list) {
        List list2;
        String ow = mo56530ow();
        if (list == null || (list2 = C41358y.m119991B0(list)) == null) {
            list2 = null;
        } else {
            list2.addAll(m73743mw());
            C41238w wVar = C41238w.f97225a;
        }
        mo56517cq(dVar, ow, str, str2, str3, str4, list2);
    }

    /* renamed from: sw */
    public C1644x mo56481Bd() {
        return this.f60024y;
    }

    /* renamed from: tw */
    public C1644x mo56486Ce() {
        return this.f60015p;
    }

    /* renamed from: uw */
    public C1644x mo56492I2() {
        return this.f60016q;
    }

    /* renamed from: vw */
    public C1644x mo56507Wl() {
        return this.f60018s;
    }

    /* renamed from: we */
    public C41205b mo56543we(C40749p pVar, C1644x xVar, C43075l lVar) {
        C41536l.m120489i(pVar, "observable");
        return this.f60011l.mo56543we(pVar, xVar, lVar);
    }

    /* renamed from: wm */
    public LiveData mo56544wm() {
        return this.f60019t;
    }

    /* renamed from: ww */
    public C1644x mo56537si() {
        return this.f60020u;
    }

    /* renamed from: xu */
    public C40749p mo56547xu(String str) {
        C41536l.m120489i(str, "finalService");
        return this.f60005f.mo56547xu(str);
    }

    /* renamed from: xw */
    public C1644x mo56523jn() {
        return this.f60014o;
    }

    /* renamed from: y9 */
    public void mo56549y9(C31622e eVar) {
        C41536l.m120489i(eVar, "template");
        this.f60007h.mo56549y9(eVar);
    }
}
