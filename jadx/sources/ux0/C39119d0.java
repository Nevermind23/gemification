package ux0;

import androidx.lifecycle.C1612n;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.google.gson.C5494h;
import com.google.gson.Gson;
import dy0.C31619b;
import dy0.C31620c;
import dy0.C31622e;
import dy0.C31623f;
import dy0.C31626g;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import ee1.C40767b;
import ey0.C31880b;
import g91.C32343x;
import g91.C32359z0;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k41.C36869a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41547w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lx0.C37179d;
import mx0.C37288b;
import mx0.C37290d;
import mx0.C37291e;
import ox0.C37829b;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.payments.data.model.FormOtpParams;
import p341ge.bog.mobilebank.payments.domain.model.PaymentConfigVersion;
import p341ge.bog.mobilebank.payments.domain.model.PaymentConfigVersionList;
import p341ge.bog.mobilebank.payments.domain.model.PaymentPayParameter;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p748eu.C20292b;
import p758fu.C20557a;
import pc0.C27494a;
import pf1.C42197d;
import s31.C38421a;
import s31.C38424d;
import u61.C39033a;
import ue1.C43075l;
import ue1.C43079p;
import ux0.C39154i0;
import ux0.C39160m;
import v61.C39237c;

/* renamed from: ux0.d0 */
public final class C39119d0 implements C39114b, C39112a, C39150g0, C39157j0, C39152h0, C39154i0, C39148f0, C39166q, C39160m {

    /* renamed from: A */
    private C38421a f93266A;

    /* renamed from: B */
    private final List f93267B = new ArrayList();

    /* renamed from: C */
    private final AtomicReference f93268C = new AtomicReference(C31880b.INITIAL_LOADING);

    /* renamed from: D */
    public String f93269D;

    /* renamed from: E */
    public String f93270E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final AtomicReference f93271F = new AtomicReference((Object) null);

    /* renamed from: G */
    private boolean f93272G = true;

    /* renamed from: d */
    private final C36869a f93273d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C20292b f93274e;

    /* renamed from: f */
    private final C37290d f93275f;

    /* renamed from: g */
    private final C39237c f93276g;

    /* renamed from: h */
    private final C37291e f93277h;

    /* renamed from: i */
    private final C27494a f93278i;

    /* renamed from: j */
    private final C37288b f93279j;

    /* renamed from: k */
    private final Gson f93280k;

    /* renamed from: l */
    private final C40767b f93281l;

    /* renamed from: m */
    private final C40767b f93282m;

    /* renamed from: n */
    private final C40767b f93283n;

    /* renamed from: o */
    private final C40767b f93284o;

    /* renamed from: p */
    private final C40767b f93285p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C40767b f93286q;

    /* renamed from: r */
    private final C40767b f93287r;

    /* renamed from: s */
    private final C40765a f93288s;

    /* renamed from: t */
    private final C40767b f93289t;

    /* renamed from: u */
    private final C40767b f93290u;

    /* renamed from: v */
    private final C40767b f93291v;

    /* renamed from: w */
    private final C40767b f93292w;

    /* renamed from: x */
    private final C40767b f93293x;

    /* renamed from: y */
    private AtomicReference f93294y = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: z */
    public AtomicReference f93295z = new AtomicReference((Object) null);

    /* renamed from: ux0.d0$a */
    public /* synthetic */ class C39120a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f93296a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ey0.b[] r0 = ey0.C31880b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ey0.b r1 = ey0.C31880b.FIRST_PAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ey0.b r1 = ey0.C31880b.FINAL_PAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f93296a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ux0.C39119d0.C39120a.<clinit>():void");
        }
    }

    /* renamed from: ux0.d0$b */
    static final class C39121b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39119d0 f93297d;

        /* renamed from: e */
        final /* synthetic */ String f93298e;

        /* renamed from: ux0.d0$b$a */
        static final class C39122a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C39119d0 f93299d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39122a(C39119d0 d0Var) {
                super(1);
                this.f93299d = d0Var;
            }

            /* renamed from: a */
            public final void mo92787a(Long l) {
                this.f93299d.mo56494Kf(C31880b.OTP_IN_PROGRESS);
                this.f93299d.m114121J(true, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92787a((Long) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ux0.d0$b$b */
        static final class C39123b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C39119d0 f93300d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39123b(C39119d0 d0Var) {
                super(1);
                this.f93300d = d0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f93300d.m114121J(false, true);
                this.f93300d.mo56513af();
            }
        }

        /* renamed from: ux0.d0$b$c */
        static final class C39124c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C39119d0 f93301d;

            /* renamed from: e */
            final /* synthetic */ String f93302e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39124c(C39119d0 d0Var, String str) {
                super(1);
                this.f93301d = d0Var;
                this.f93302e = str;
            }

            /* renamed from: a */
            public final void mo92789a(Long l) {
                if (this.f93301d.mo56526ku().get() == C31880b.OTP_IN_PROGRESS) {
                    this.f93301d.m114121J(true, true);
                    this.f93301d.f93271F.set(l);
                    this.f93301d.f93286q.onNext(new C31620c(new C21503d.C21506c(this.f93302e)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92789a((Long) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39121b(C39119d0 d0Var, String str) {
            super(1);
            this.f93297d = d0Var;
            this.f93298e = str;
        }

        /* renamed from: a */
        public final void mo92786a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C39122a(this.f93297d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C39123b(this.f93297d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C39124c(this.f93297d, this.f93298e), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92786a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ux0.d0$c */
    static final class C39125c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39119d0 f93303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39125c(C39119d0 d0Var) {
            super(1);
            this.f93303d = d0Var;
        }

        /* renamed from: a */
        public final C37179d invoke(C37179d dVar) {
            C38424d d;
            C41536l.m120489i(dVar, "resp");
            C38421a aVar = (C38421a) this.f93303d.mo56535s5().get();
            boolean z = false;
            if (!(aVar == null || (d = aVar.mo91950d()) == null || !C37829b.m111229p(d))) {
                z = true;
            }
            if (z) {
                C38421a b = dVar.mo90181b();
                if (b != null) {
                    C39119d0 d0Var = this.f93303d;
                    if (d0Var.f93295z.get() != null) {
                        d0Var.f93295z.set(new C31626g(C41341q.m119907j(), b, dVar.mo90180a()));
                    }
                    throw new Exception("CONFIG_UPDATED");
                }
            } else {
                this.f93303d.f93295z.set((Object) null);
            }
            return dVar;
        }
    }

    /* renamed from: ux0.d0$d */
    static final class C39126d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39119d0 f93304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39126d(C39119d0 d0Var) {
            super(1);
            this.f93304d = d0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            if (C41536l.m120484d(th.getMessage(), "CONFIG_UPDATED")) {
                this.f93304d.mo56516c();
            }
        }
    }

    /* renamed from: ux0.d0$e */
    static final class C39127e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39119d0 f93305d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39127e(C39119d0 d0Var) {
            super(1);
            this.f93305d = d0Var;
        }

        public final List invoke(List list) {
            List list2;
            String d;
            C41536l.m120489i(list, "it");
            C39119d0 d0Var = this.f93305d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C39033a aVar = (C39033a) it.next();
                String C5 = d0Var.mo56484C5();
                C20557a b = d0Var.f93274e.mo48775b("PAYMENT_PROVIDER_CUSTOMER_ID_KEYS");
                if (b == null || (d = b.mo49087d()) == null || (list2 = C40440x.m117182x0(d, new String[]{","}, false, 0, 6, (Object) null)) == null) {
                    list2 = C41341q.m119907j();
                }
                arrayList.add(C31623f.m93745b(aVar, C5, list2));
            }
            return arrayList;
        }
    }

    /* renamed from: ux0.d0$f */
    static final class C39128f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39128f f93306d = new C39128f();

        C39128f() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C40749p.m118043h0(6);
        }
    }

    /* renamed from: ux0.d0$g */
    static final class C39129g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39119d0 f93307d;

        /* renamed from: e */
        final /* synthetic */ C40749p f93308e;

        /* renamed from: ux0.d0$g$a */
        static final class C39130a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39130a f93309d = new C39130a();

            C39130a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C31128a aVar, C31128a aVar2) {
                C41536l.m120489i(aVar, "config");
                C41536l.m120489i(aVar2, "data");
                return new C41224m(aVar, aVar2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39129g(C39119d0 d0Var, C40749p pVar) {
            super(1);
            this.f93307d = d0Var;
            this.f93308e = pVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m114206c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p d1 = C40749p.m118037d1(C31270e.m92879h(this.f93307d.mo92784y(), num.intValue()), C31270e.m92879h(this.f93308e, num.intValue()), new C39146e0(C39130a.f93309d));
            C41536l.m120488h(d1, "zip(\n                get…nfig, data)\n            }");
            return C31270e.m92879h(d1, num.intValue());
        }
    }

    /* renamed from: ux0.d0$h */
    static final class C39131h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39119d0 f93310d;

        /* renamed from: e */
        final /* synthetic */ C43075l f93311e;

        /* renamed from: f */
        final /* synthetic */ C1644x f93312f;

        /* renamed from: ux0.d0$h$a */
        static final class C39132a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C39119d0 f93313d;

            /* renamed from: e */
            final /* synthetic */ C43075l f93314e;

            /* renamed from: f */
            final /* synthetic */ C1644x f93315f;

            /* renamed from: ux0.d0$h$a$a */
            static final class C39133a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C43075l f93316d;

                /* renamed from: e */
                final /* synthetic */ C41547w f93317e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C39133a(C43075l lVar, C41547w wVar) {
                    super(1);
                    this.f93316d = lVar;
                    this.f93317e = wVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C41238w.f97225a;
                }

                public final void invoke(Throwable th) {
                    C41536l.m120489i(th, "it");
                    this.f93316d.invoke(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
                    this.f93317e.f97714d = true;
                }
            }

            /* renamed from: ux0.d0$h$a$b */
            static final class C39134b extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C43075l f93318d;

                /* renamed from: e */
                final /* synthetic */ C41547w f93319e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C39134b(C43075l lVar, C41547w wVar) {
                    super(1);
                    this.f93318d = lVar;
                    this.f93319e = wVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C41238w.f97225a;
                }

                public final void invoke(Throwable th) {
                    C41536l.m120489i(th, "it");
                    this.f93318d.invoke(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
                    this.f93319e.f97714d = true;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39132a(C39119d0 d0Var, C43075l lVar, C1644x xVar) {
                super(1);
                this.f93313d = d0Var;
                this.f93314e = lVar;
                this.f93315f = xVar;
            }

            /* renamed from: a */
            public final void mo92797a(C41224m mVar) {
                boolean z = false;
                if (!(mVar.mo95678e() instanceof C31128a.C31131c) || !(mVar.mo95680f() instanceof C31128a.C31131c)) {
                    C41547w wVar = new C41547w();
                    Object e = mVar.mo95678e();
                    C41536l.m120488h(e, "successResult.first");
                    C31132b.m92643e((C31128a) e, (int[]) null, new C39133a(this.f93314e, wVar), 1, (Object) null);
                    if (!wVar.f97714d) {
                        Object f = mVar.mo95680f();
                        C41536l.m120488h(f, "successResult.second");
                        C31132b.m92643e((C31128a) f, (int[]) null, new C39134b(this.f93314e, wVar), 1, (Object) null);
                    }
                    if (!wVar.f97714d) {
                        this.f93315f.mo4826r((Object) null);
                        this.f93314e.invoke(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
                    }
                    this.f93313d.m114120I(wVar.f97714d);
                    return;
                }
                this.f93313d.mo56535s5().set(((C31128a) mVar.mo95678e()).mo71340a());
                this.f93314e.invoke(new C31128a.C31131c(new C41224m(((C31128a) mVar.mo95678e()).mo71340a(), ((C31128a) mVar.mo95680f()).mo71340a()), 0, 2, (DefaultConstructorMarker) null));
                C39119d0 d0Var = this.f93313d;
                if (d0Var.f93295z.get() == null) {
                    z = true;
                }
                d0Var.m114120I(z);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92797a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ux0.d0$h$b */
        static final class C39135b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f93320d;

            /* renamed from: e */
            final /* synthetic */ C39119d0 f93321e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39135b(C1644x xVar, C39119d0 d0Var) {
                super(1);
                this.f93320d = xVar;
                this.f93321e = d0Var;
            }

            /* renamed from: a */
            public final void mo92800a(C41224m mVar) {
                this.f93320d.mo4826r((Object) null);
                this.f93321e.m114120I(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92800a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ux0.d0$h$c */
        static final class C39136c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C43075l f93322d;

            /* renamed from: e */
            final /* synthetic */ C39119d0 f93323e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39136c(C43075l lVar, C39119d0 d0Var) {
                super(1);
                this.f93322d = lVar;
                this.f93323e = d0Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f93322d.invoke(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
                this.f93323e.m114120I(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39131h(C39119d0 d0Var, C43075l lVar, C1644x xVar) {
            super(1);
            this.f93310d = d0Var;
            this.f93311e = lVar;
            this.f93312f = xVar;
        }

        /* renamed from: a */
        public final void mo92796a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C39132a(this.f93310d, this.f93311e, this.f93312f), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C39135b(this.f93312f, this.f93310d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C39136c(this.f93311e, this.f93310d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92796a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ux0.d0$i */
    static final class C39137i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f93324d;

        /* renamed from: e */
        final /* synthetic */ C39119d0 f93325e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39137i(C43075l lVar, C39119d0 d0Var) {
            super(1);
            this.f93324d = lVar;
            this.f93325e = d0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C43075l lVar = this.f93324d;
            C41536l.m120488h(th, "it");
            lVar.invoke(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
            this.f93325e.m114120I(false);
        }
    }

    /* renamed from: ux0.d0$j */
    static final class C39138j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39138j f93326d = new C39138j();

        C39138j() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(Object obj) {
            return C40749p.m118043h0(obj);
        }
    }

    /* renamed from: ux0.d0$k */
    static final class C39139k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1644x f93327d;

        /* renamed from: e */
        final /* synthetic */ C43075l f93328e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39139k(C1644x xVar, C43075l lVar) {
            super(1);
            this.f93327d = xVar;
            this.f93328e = lVar;
        }

        /* renamed from: a */
        public final void mo92804a(Object obj) {
            C1644x xVar = this.f93327d;
            if (xVar != null) {
                xVar.mo4823o(obj);
            }
            C43075l lVar = this.f93328e;
            if (lVar != null) {
                lVar.invoke(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92804a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ux0.d0$l */
    static final class C39140l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39119d0 f93329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39140l(C39119d0 d0Var) {
            super(1);
            this.f93329d = d0Var;
        }

        /* renamed from: a */
        public final C40754t invoke(List list) {
            C41536l.m120489i(list, "it");
            if (list.isEmpty()) {
                C40749p h0 = C40749p.m118043h0(new C31128a.C31129a(new Exception("RESET_FORM"), 0, (Object) null, 6, (DefaultConstructorMarker) null));
                C41536l.m120488h(h0, "{\n                Observ…SET_FORM)))\n            }");
                return h0;
            }
            C40749p O = this.f93329d.mo92777A(list).mo95075O();
            C41536l.m120488h(O, "getSecondPageInfo(it)\n  …          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ux0.d0$m */
    static final class C39141m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39119d0 f93330d;

        /* renamed from: e */
        final /* synthetic */ C1644x f93331e;

        /* renamed from: f */
        final /* synthetic */ String f93332f;

        /* renamed from: ux0.d0$m$a */
        static final class C39142a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C39119d0 f93333d;

            /* renamed from: e */
            final /* synthetic */ C1644x f93334e;

            /* renamed from: f */
            final /* synthetic */ C31128a f93335f;

            /* renamed from: g */
            final /* synthetic */ String f93336g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39142a(C39119d0 d0Var, C1644x xVar, C31128a aVar, String str) {
                super(1);
                this.f93333d = d0Var;
                this.f93334e = xVar;
                this.f93335f = aVar;
                this.f93336g = str;
            }

            /* renamed from: a */
            public final void mo92807a(C37179d dVar) {
                this.f93333d.mo56494Kf(C31880b.ADDITIONAL_INFO_TO_GET);
                this.f93333d.mo56520fd(false, false);
                this.f93333d.m114120I(false);
                this.f93334e.mo4823o(this.f93335f);
                this.f93333d.mo56521gp(this.f93336g);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92807a((C37179d) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ux0.d0$m$b */
        static final class C39143b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C39119d0 f93337d;

            /* renamed from: e */
            final /* synthetic */ C1644x f93338e;

            /* renamed from: f */
            final /* synthetic */ C31128a f93339f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39143b(C39119d0 d0Var, C1644x xVar, C31128a aVar) {
                super(1);
                this.f93337d = d0Var;
                this.f93338e = xVar;
                this.f93339f = aVar;
            }

            /* renamed from: a */
            public final void mo92808a(C37179d dVar) {
                this.f93337d.mo56520fd(true, false);
                this.f93337d.m114120I(false);
                this.f93338e.mo4823o(this.f93339f);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92808a((C37179d) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ux0.d0$m$c */
        static final class C39144c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C39119d0 f93340d;

            /* renamed from: e */
            final /* synthetic */ C1644x f93341e;

            /* renamed from: f */
            final /* synthetic */ C31128a f93342f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39144c(C39119d0 d0Var, C1644x xVar, C31128a aVar) {
                super(1);
                this.f93340d = d0Var;
                this.f93341e = xVar;
                this.f93342f = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                String message = th.getMessage();
                if (C41536l.m120484d(message, "RESET_FORM")) {
                    this.f93340d.m114120I(false);
                    this.f93340d.mo56520fd(false, false);
                    this.f93341e.mo4823o((Object) null);
                    this.f93340d.mo56489H1();
                } else if (C41536l.m120484d(message, "CONFIG_UPDATED")) {
                    this.f93340d.m114120I(false);
                    this.f93340d.mo56520fd(true, false);
                } else {
                    this.f93340d.m114120I(true);
                    this.f93340d.mo56520fd(false, false);
                    this.f93341e.mo4823o(this.f93342f);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39141m(C39119d0 d0Var, C1644x xVar, String str) {
            super(1);
            this.f93330d = d0Var;
            this.f93331e = xVar;
            this.f93332f = str;
        }

        /* renamed from: a */
        public final void mo92806a(C31128a aVar) {
            C41536l.m120488h(aVar, "debtResult");
            C31132b.m92648j(aVar, (int[]) null, new C39142a(this.f93330d, this.f93331e, aVar, this.f93332f), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C39143b(this.f93330d, this.f93331e, aVar), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C39144c(this.f93330d, this.f93331e, aVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92806a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    public C39119d0(C36869a aVar, C20292b bVar, C37290d dVar, C39237c cVar, C37291e eVar, C27494a aVar2, C37288b bVar2, Gson gson) {
        C41536l.m120489i(aVar, "deviceInfo");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(dVar, "getPaymentConfigDetailsUseCase");
        C41536l.m120489i(cVar, "getTemplatesByServiceIdUseCase");
        C41536l.m120489i(eVar, "getPaymentDebtUseCase");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        C41536l.m120489i(bVar2, "getOperationServiceIdUseCase");
        C41536l.m120489i(gson, "gson");
        this.f93273d = aVar;
        this.f93274e = bVar;
        this.f93275f = dVar;
        this.f93276g = cVar;
        this.f93277h = eVar;
        this.f93278i = aVar2;
        this.f93279j = bVar2;
        this.f93280k = gson;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create()");
        this.f93281l = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create()");
        this.f93282m = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create()");
        this.f93283n = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create()");
        this.f93284o = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create()");
        this.f93285p = h15;
        C40767b h16 = C40767b.m118210h1();
        C41536l.m120488h(h16, "create()");
        this.f93286q = h16;
        C40767b h17 = C40767b.m118210h1();
        C41536l.m120488h(h17, "create()");
        this.f93287r = h17;
        C40765a h18 = C40765a.m118198h1();
        C41536l.m120488h(h18, "create()");
        this.f93288s = h18;
        C40767b h19 = C40767b.m118210h1();
        C41536l.m120488h(h19, "create()");
        this.f93289t = h19;
        C40767b h110 = C40767b.m118210h1();
        C41536l.m120488h(h110, "create()");
        this.f93290u = h110;
        C40767b h111 = C40767b.m118210h1();
        C41536l.m120488h(h111, "create()");
        this.f93291v = h111;
        C40767b h112 = C40767b.m118210h1();
        C41536l.m120488h(h112, "create<Unit>()");
        this.f93292w = h112;
        C40767b h113 = C40767b.m118210h1();
        C41536l.m120488h(h113, "create<Pair<String?, FormOtpParams>>()");
        this.f93293x = h113;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final void m114115B(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final C37179d m114116C(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37179d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final List m114117F(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: G */
    private final C40749p m114118G() {
        C31626g gVar = (C31626g) this.f93295z.get();
        if (gVar == null) {
            return null;
        }
        this.f93266A = (C38421a) mo56535s5().get();
        mo56535s5().set(gVar.mo72057a());
        return C40749p.m118043h0(mo56535s5().get());
    }

    /* renamed from: H */
    private final void m114119H() {
        mo56494Kf(C31880b.FINAL_PAGE);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m114120I(boolean z) {
        this.f93285p.onNext(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m114121J(boolean z, boolean z2) {
        this.f93287r.onNext(new C31619b(z, z2));
    }

    /* renamed from: K */
    private final void m114122K(boolean z) {
        this.f93289t.onNext(Boolean.valueOf(z));
    }

    /* renamed from: N */
    private final void m114123N() {
        this.f93271F.set((Object) null);
        this.f93292w.onNext(C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static final C40754t m114124O(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static final C40754t m114125P(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m114126Q(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final void m114127R(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static final C40754t m114128S(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static final void m114129T(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static final C40754t m114130U(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static final void m114131V(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: t */
    private final boolean m114150t() {
        C31622e eVar;
        C31626g gVar = (C31626g) this.f93295z.get();
        if (gVar == null) {
            return false;
        }
        this.f93282m.onNext(gVar.mo72059c());
        this.f93283n.onNext(gVar.mo72058b());
        if (!this.f93272G && (eVar = (C31622e) this.f93288s.mo95100j1()) != null) {
            this.f93272G = true;
            this.f93288s.onNext(eVar);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m114151v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: w */
    private final C31880b m114152w() {
        C38421a aVar = (C38421a) mo56535s5().get();
        boolean z = false;
        if (aVar != null && C37829b.m111228o(aVar)) {
            z = true;
        }
        if (z) {
            return C31880b.FIRST_PAGE;
        }
        return C31880b.ADDITIONAL_INFO_TO_GET;
    }

    /* renamed from: A */
    public C40762x mo92777A(List list) {
        String str;
        C41536l.m120489i(list, "paramList");
        C38421a aVar = (C38421a) mo56535s5().get();
        if (aVar == null || (str = aVar.mo91947a()) == null) {
            str = "";
        }
        C37291e eVar = this.f93277h;
        String d0 = C32359z0.m95563d0();
        C41536l.m120488h(d0, "getUUID()");
        C40762x k = C32343x.m95465l1(eVar.mo90401a(d0, str, list)).mo95062A(new C39168r(new C39125c(this))).mo95082k(new C39171u(new C39126d(this)));
        C41536l.m120488h(k, "override fun getSecondPa…    }\n            }\n    }");
        return k;
    }

    /* renamed from: B4 */
    public C40749p mo56480B4() {
        return this.f93289t;
    }

    /* renamed from: Bh */
    public C40749p mo56483Bh() {
        C40749p c0 = this.f93286q.mo95017c0();
        C41536l.m120488h(c0, "_scaStateObservable.hide()");
        return c0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.mo91951e();
     */
    /* renamed from: C5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo56484C5() {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.mo56535s5()
            java.lang.Object r0 = r0.get()
            s31.a r0 = (s31.C38421a) r0
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.mo91951e()
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            java.lang.String r0 = r1.mo92779E()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.C39119d0.mo56484C5():java.lang.String");
    }

    /* renamed from: Cb */
    public C40749p mo56485Cb() {
        return this.f93283n;
    }

    /* renamed from: D */
    public C40749p mo92778D() {
        return this.f93282m;
    }

    /* renamed from: E */
    public String mo92779E() {
        String str = this.f93269D;
        if (str != null) {
            return str;
        }
        C41536l.m120506z("serviceID");
        return null;
    }

    /* renamed from: Gr */
    public C40749p mo56488Gr() {
        C40749p c0 = this.f93288s.mo95017c0();
        C41536l.m120488h(c0, "_templateClickDataObservable.hide()");
        return c0;
    }

    /* renamed from: H1 */
    public void mo56489H1() {
        this.f93291v.onNext(C41238w.f97225a);
    }

    /* renamed from: Hf */
    public C40749p mo56490Hf() {
        return this.f93291v;
    }

    /* renamed from: J7 */
    public C40749p mo56493J7() {
        return this.f93293x;
    }

    /* renamed from: Kf */
    public void mo56494Kf(C31880b bVar) {
        boolean z;
        C38424d d;
        C41536l.m120489i(bVar, "stage");
        this.f93268C.set(bVar);
        C38421a aVar = (C38421a) mo56535s5().get();
        boolean z2 = false;
        if (aVar == null || (d = aVar.mo91950d()) == null || !C37829b.m111230q(d)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || bVar != C31880b.FIRST_PAGE) {
            z2 = true;
        }
        m114122K(z2);
        if (bVar != C31880b.ACTION_IN_PROGRESS && bVar != C31880b.OTP_IN_PROGRESS) {
            C39160m.C39161a.m114253a(this, (String) null, 1, (Object) null);
        }
    }

    /* renamed from: Kj */
    public void mo56495Kj(String str, List list, List list2) {
        int i;
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(list, "paramList");
        C41536l.m120489i(list2, "formValues");
        C31880b bVar = (C31880b) mo56526ku().get();
        if (bVar == null) {
            i = -1;
        } else {
            i = C39120a.f93296a[bVar.ordinal()];
        }
        if (i == 1) {
            this.f93295z.set(new C31626g(list2, (C38421a) null, (List) null, 6, (DefaultConstructorMarker) null));
            this.f93282m.onNext(list);
        } else if (i == 2) {
            m114123N();
        }
    }

    /* renamed from: L */
    public void mo92780L(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f93270E = str;
    }

    /* renamed from: M */
    public void mo92781M(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f93269D = str;
    }

    /* renamed from: Mb */
    public C41205b mo56497Mb(C40749p pVar, C40749p pVar2, C40749p pVar3, C1644x xVar, C43075l lVar) {
        C41536l.m120489i(pVar, "initObservable");
        C41536l.m120489i(pVar2, "refreshObservable");
        C41536l.m120489i(pVar3, "getDataObservable");
        C41536l.m120489i(xVar, "configResultLiveData");
        C41536l.m120489i(lVar, "onResult");
        C40749p L0 = C40749p.m118049m0(pVar, pVar2, mo92785z().mo94998Q(new C39175y(C39128f.f93306d))).mo94989L0(new C39176z(new C39129g(this, pVar3)));
        C41536l.m120488h(L0, "override fun subscribeTo…    }\n            )\n    }");
        C41205b G0 = C32343x.m95462k1(L0).mo94983G0(new C39113a0(new C39131h(this, lVar, xVar)), new C39115b0(new C39137i(lVar, this)));
        C41536l.m120488h(G0, "override fun subscribeTo…    }\n            )\n    }");
        return G0;
    }

    /* renamed from: Pi */
    public C40749p mo56499Pi() {
        return this.f93292w;
    }

    /* renamed from: Pp */
    public C40749p mo56500Pp() {
        return this.f93284o;
    }

    /* renamed from: R1 */
    public void mo56501R1(List list) {
        C41536l.m120489i(list, "formValues");
        this.f93267B.clear();
        this.f93267B.addAll(list);
    }

    /* renamed from: Rb */
    public C40749p mo56502Rb() {
        return this.f93285p;
    }

    /* renamed from: Tv */
    public C40749p mo56504Tv() {
        C40749p c0 = this.f93287r.mo95017c0();
        C41536l.m120488h(c0, "_formLoadingObservable.hide()");
        return c0;
    }

    /* renamed from: V4 */
    public void mo56505V4(String str, String str2) {
        C41536l.m120489i(str, "servId");
        C41536l.m120489i(str2, "pageTitle");
        mo92781M(str);
        mo92780L(str2);
    }

    /* renamed from: Wv */
    public boolean mo56508Wv() {
        if (mo56526ku().get() == C31880b.FIRST_PAGE || mo56526ku().get() == C31880b.ADDITIONAL_INFO_TO_GET) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (ox0.C37829b.m111228o(r3) == true) goto L_0x0018;
     */
    /* renamed from: Xb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56509Xb(boolean r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicReference r3 = r2.mo56535s5()
            java.lang.Object r3 = r3.get()
            s31.a r3 = (s31.C38421a) r3
            if (r3 == 0) goto L_0x0017
            boolean r3 = ox0.C37829b.m111228o(r3)
            r1 = 1
            if (r3 != r1) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = r0
        L_0x0018:
            if (r1 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicReference r3 = r2.mo56526ku()
            java.lang.Object r3 = r3.get()
            ey0.b r1 = r2.m114152w()
            if (r3 == r1) goto L_0x0057
        L_0x0028:
            ee1.b r3 = r2.f93284o
            he1.w r1 = he1.C41238w.f97225a
            r3.onNext(r1)
            ey0.b r3 = r2.m114152w()
            r2.mo56494Kf(r3)
            boolean r3 = r2.m114150t()
            if (r3 != 0) goto L_0x0054
            s31.a r3 = r2.f93266A
            if (r3 == 0) goto L_0x0050
            java.util.concurrent.atomic.AtomicReference r3 = r2.mo56535s5()
            s31.a r0 = r2.f93266A
            r3.set(r0)
            r3 = 0
            r2.f93266A = r3
            r2.mo56516c()
            goto L_0x0057
        L_0x0050:
            r2.mo56520fd(r0, r0)
            goto L_0x0057
        L_0x0054:
            r2.mo56520fd(r0, r0)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.C39119d0.mo56509Xb(boolean):void");
    }

    /* renamed from: Yc */
    public HashMap mo56511Yc(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f93278i.mo66809a(otpParams);
    }

    /* renamed from: Yr */
    public void mo56512Yr(List list) {
        C41536l.m120489i(list, "formValues");
        this.f93267B.clear();
        this.f93267B.addAll(list);
        C39154i0.C39155a.m114240b(this, (C21503d) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 94, (Object) null);
    }

    /* renamed from: af */
    public void mo56513af() {
        mo56494Kf(C31880b.FINAL_PAGE);
    }

    /* renamed from: aj */
    public String mo56514aj() {
        String f;
        String E;
        C38421a aVar = (C38421a) mo56535s5().get();
        if (aVar == null || (f = aVar.mo91953f()) == null || (E = C32343x.m95386E(f, true, new Object[0])) == null) {
            return mo92783x();
        }
        return E;
    }

    /* renamed from: c */
    public void mo56516c() {
        this.f93281l.onNext(C41238w.f97225a);
    }

    /* renamed from: cq */
    public void mo56517cq(C21503d dVar, String str, String str2, String str3, String str4, String str5, List list) {
        C41536l.m120489i(str, "otpServiceId");
        if (dVar instanceof C21503d.C21505b) {
            mo56520fd(true, true);
            this.f93286q.onNext(new C31620c(new C21503d.C21505b((Object) null)));
        } else if (dVar instanceof C21503d.C21504a) {
            m114119H();
            mo56520fd(false, true);
            this.f93286q.onNext(new C31620c(new C21503d.C21504a(((C21503d.C21504a) dVar).mo53706f(), (Object) null, 2, (DefaultConstructorMarker) null)));
        } else if (dVar instanceof C21503d.C21506c) {
            mo56520fd(true, true);
            this.f93286q.onNext(new C31620c((C21503d) null, 1, (DefaultConstructorMarker) null));
            mo92782u(str5, mo56525k5(str, str2, str3, str4, str5, list));
        } else if (dVar == null) {
            AtomicReference ku = mo56526ku();
            C31880b bVar = C31880b.OTP_IN_PROGRESS;
            C31880b bVar2 = C31880b.FINAL_PAGE;
            if (C1612n.m5659a(ku, bVar, bVar2) || mo56526ku().get() == bVar2) {
                mo56520fd(false, true);
            }
            this.f93286q.onNext(new C31620c((C21503d) null, 1, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: eu */
    public C40749p mo56519eu() {
        return this.f93290u;
    }

    /* renamed from: fd */
    public void mo56520fd(boolean z, boolean z2) {
        m114121J(z, z2);
    }

    /* renamed from: gp */
    public void mo56521gp(String str) {
        C40767b bVar = this.f93290u;
        if (str == null) {
            str = ((C31880b) this.f93268C.get()).mo72311b();
        }
        bVar.onNext(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r2 != false) goto L_0x003c;
     */
    /* renamed from: j7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ed1.C40749p mo56522j7() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r4.mo56484C5()
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r4.mo56535s5()
            java.lang.Object r1 = r1.get()
            s31.a r1 = (s31.C38421a) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0025
            s31.d r1 = r1.mo91950d()
            if (r1 == 0) goto L_0x0025
            boolean r1 = ox0.C37829b.m111229p(r1)
            if (r1 != r2) goto L_0x0025
            r1 = r2
            goto L_0x0026
        L_0x0025:
            r1 = r3
        L_0x0026:
            if (r1 != 0) goto L_0x003c
            s31.a r1 = r4.f93266A
            if (r1 == 0) goto L_0x0039
            s31.d r1 = r1.mo91950d()
            if (r1 == 0) goto L_0x0039
            boolean r1 = ox0.C37829b.m111229p(r1)
            if (r1 != r2) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            if (r2 == 0) goto L_0x0060
        L_0x003c:
            eu.b r1 = r4.f93274e
            java.lang.String r2 = "PAYMENTS_ALL_MOBILE_TEMPLATE_PROVIDERS"
            fu.a r1 = r1.mo48775b(r2)
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = r1.mo49087d()
            if (r1 == 0) goto L_0x0060
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ","
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
        L_0x0060:
            v61.c r1 = r4.f93276g
            java.lang.String r0 = r0.toString()
            ed1.p r0 = r1.mo92860b(r0)
            ux0.d0$e r1 = new ux0.d0$e
            r1.<init>(r4)
            ux0.t r2 = new ux0.t
            r2.<init>(r1)
            ed1.p r0 = r0.mo95026k0(r2)
            java.lang.String r1 = "override fun getTemplate…    }\n            }\n    }"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ux0.C39119d0.mo56522j7():ed1.p");
    }

    /* renamed from: k5 */
    public FormOtpParams mo56525k5(String str, String str2, String str3, String str4, String str5, List list) {
        List list2;
        long j;
        String str6;
        String str7 = str;
        C41536l.m120489i(str, "otpServiceId");
        if (list == null || (list2 = C41358y.m119991B0(list)) == null) {
            list2 = new ArrayList();
        }
        Long l = (Long) this.f93271F.get();
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        long j2 = j;
        Gson gson = this.f93280k;
        if (str5 == null) {
            C38421a aVar = (C38421a) mo56535s5().get();
            if (aVar == null || (str6 = aVar.mo91949c()) == null) {
                str6 = "";
            }
        } else {
            str6 = str5;
        }
        String w = gson.mo18181w(C41339p.m119900e(new PaymentPayParameter(str6, list2)));
        C41536l.m120488h(w, "toJson(\n                …          )\n            )");
        return new FormOtpParams(j2, w, str, str2, str3, str4);
    }

    /* renamed from: ku */
    public AtomicReference mo56526ku() {
        return this.f93268C;
    }

    /* renamed from: ok */
    public List mo56529ok() {
        List U = C42197d.m122527U(this.f93267B);
        this.f93267B.clear();
        return U;
    }

    /* renamed from: qe */
    public C41205b mo56532qe(C1644x xVar, String str) {
        C41536l.m120489i(xVar, "paymentDebtLiveData");
        C41536l.m120489i(str, "buttonText");
        C40749p L0 = mo92778D().mo94989L0(new C39117c0(new C39140l(this)));
        C41536l.m120488h(L0, "override fun subscribeTo…   }\n\n            }\n    }");
        C41205b F0 = C32343x.m95462k1(L0).mo94981F0(new C39169s(new C39141m(this, xVar, str)));
        C41536l.m120488h(F0, "override fun subscribeTo…   }\n\n            }\n    }");
        return F0;
    }

    /* renamed from: s5 */
    public AtomicReference mo56535s5() {
        return this.f93294y;
    }

    /* renamed from: u */
    public void mo92782u(String str, FormOtpParams formOtpParams) {
        C41536l.m120489i(formOtpParams, "otpParams");
        this.f93293x.onNext(new C41224m(str, formOtpParams));
    }

    /* renamed from: we */
    public C41205b mo56543we(C40749p pVar, C1644x xVar, C43075l lVar) {
        C41536l.m120489i(pVar, "observable");
        C40749p L0 = pVar.mo94989L0(new C39173w(C39138j.f93326d));
        C41536l.m120488h(L0, "observable.switchMap {\n …rvable.just(it)\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C39174x(new C39139k(xVar, lVar)));
        C41536l.m120488h(F0, "liveData: MutableLiveDat….invoke(it)\n            }");
        return F0;
    }

    /* renamed from: x */
    public String mo92783x() {
        String str = this.f93270E;
        if (str != null) {
            return str;
        }
        C41536l.m120506z("pageTitle");
        return null;
    }

    /* renamed from: xu */
    public C40749p mo56547xu(String str) {
        C41536l.m120489i(str, "finalService");
        C40749p O = this.f93279j.mo90398a().mo95075O();
        C41536l.m120488h(O, "getOperationServiceIdUse…          .toObservable()");
        return C31270e.m92879h(O, 1).mo94978E(new C39172v(new C39121b(this, str)));
    }

    /* renamed from: y */
    public C40749p mo92784y() {
        C40749p O = this.f93275f.mo90400a(mo92779E()).mo95075O();
        C40749p G = m114118G();
        if (G != null) {
            return G;
        }
        C41536l.m120488h(O, "getConfigFromService");
        return O;
    }

    /* renamed from: y9 */
    public void mo56549y9(C31622e eVar) {
        C41536l.m120489i(eVar, "template");
        mo56509Xb(false);
        this.f93272G = false;
        this.f93288s.onNext(eVar);
    }

    /* renamed from: z */
    public C40749p mo92785z() {
        C40749p c0 = this.f93281l.mo95017c0();
        C41536l.m120488h(c0, "_refreshFormObservable.hide()");
        return c0;
    }

    /* renamed from: zf */
    public boolean mo80394zf(String str, String str2, String str3) {
        C5494h hVar;
        String str4;
        int i;
        C41536l.m120489i(str, "serviceID");
        C41536l.m120489i(str2, "settingsKey");
        C41536l.m120489i(str3, "minVersionKey");
        try {
            int parseInt = Integer.parseInt(this.f93273d.mo89793a());
            C20557a b = this.f93274e.mo48775b(str2);
            T t = null;
            if (b != null) {
                hVar = b.mo49085b();
            } else {
                hVar = null;
            }
            C20557a b2 = this.f93274e.mo48775b(str3);
            if (b2 != null) {
                str4 = b2.mo49087d();
            } else {
                str4 = null;
            }
            Iterator<T> it = ((PaymentConfigVersionList) this.f93280k.mo18165g(hVar, PaymentConfigVersionList.class)).getProviders().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C41536l.m120484d(((PaymentConfigVersion) next).getProviderServiceId(), str)) {
                    t = next;
                    break;
                }
            }
            PaymentConfigVersion paymentConfigVersion = (PaymentConfigVersion) t;
            if (paymentConfigVersion == null) {
                return C41536l.m120484d(str4, ProductType.PRODUCT_STATUS_NEW);
            }
            Integer androidMinVersion = paymentConfigVersion.getAndroidMinVersion();
            if (androidMinVersion != null) {
                i = androidMinVersion.intValue();
            } else {
                i = 0;
            }
            if (parseInt >= i) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
