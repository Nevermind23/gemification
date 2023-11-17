package hz0;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import hz0.C36301i;
import j51.C36734f;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import k51.C36874b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.products.data.model.CreateClientUserApiModel;
import p341ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel;
import ty0.C38849a;
import ty0.C38859f;
import ty0.C38890s0;
import ty0.C38897v0;
import ue1.C43075l;

/* renamed from: hz0.r */
public final class C36313r extends C21481a implements C36305j, C36306k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final CheckChildMBankActiveModel f87627d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38890s0 f87628e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38897v0 f87629f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C38859f f87630g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C38849a f87631h;

    /* renamed from: i */
    private final C36734f f87632i;

    /* renamed from: j */
    private final C36305j f87633j = this;

    /* renamed from: k */
    private final C36306k f87634k = this;

    /* renamed from: l */
    private final C1644x f87635l = new C1644x(C36301i.C36302a.f87618a);

    /* renamed from: m */
    private final C1644x f87636m = new C1644x();

    /* renamed from: n */
    private final C1644x f87637n = new C1644x();

    /* renamed from: o */
    private final C1644x f87638o = new C1644x();

    /* renamed from: p */
    private final C1644x f87639p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C40767b f87640q;

    /* renamed from: r */
    private final C40767b f87641r;

    /* renamed from: s */
    private final C40767b f87642s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final AtomicReference f87643t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final AtomicReference f87644u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final AtomicReference f87645v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final AtomicReference f87646w;

    /* renamed from: hz0.r$a */
    public interface C36314a {
        /* renamed from: a */
        C36313r mo32780a(CheckChildMBankActiveModel checkChildMBankActiveModel);
    }

    /* renamed from: hz0.r$b */
    static final class C36315b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36313r f87647d;

        /* renamed from: hz0.r$b$a */
        static final class C36316a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36313r f87648d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36316a(C36313r rVar) {
                super(1);
                this.f87648d = rVar;
            }

            /* renamed from: a */
            public final C40739f invoke(CreateClientUserApiModel createClientUserApiModel) {
                C41536l.m120489i(createClientUserApiModel, "createClientUserApiModel");
                this.f87648d.f87644u.set(Boolean.TRUE);
                this.f87648d.f87646w.set(Long.valueOf(createClientUserApiModel.getUserId()));
                return this.f87648d.f87631h.mo92559a(this.f87648d.f87627d.mo81928a(), createClientUserApiModel.getUserId());
            }
        }

        /* renamed from: hz0.r$b$b */
        static final class C36317b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C36317b f87649d = new C36317b();

            C36317b() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36315b(C36313r rVar) {
            super(1);
            this.f87647d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C40739f m107802d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40739f) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C31128a m107803e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41238w wVar) {
            C40734b bVar;
            Long l;
            C41536l.m120489i(wVar, "it");
            if (!((Boolean) this.f87647d.f87644u.get()).booleanValue() || ((l = (Long) this.f87647d.f87646w.get()) != null && l.longValue() == -1)) {
                bVar = this.f87647d.f87630g.mo92564a(this.f87647d.f87627d.mo81928a()).mo95088s(new C36328s(new C36316a(this.f87647d)));
            } else {
                C38849a jw = this.f87647d.f87631h;
                long a = this.f87647d.f87627d.mo81928a();
                Object obj = this.f87647d.f87646w.get();
                C41536l.m120488h(obj, "cbsUserID.get()");
                bVar = jw.mo92559a(a, ((Number) obj).longValue());
            }
            return bVar.mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C36329t(C36317b.f87649d));
        }
    }

    /* renamed from: hz0.r$c */
    static final class C36318c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36313r f87650d;

        /* renamed from: hz0.r$c$a */
        static final class C36319a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36313r f87651d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36319a(C36313r rVar) {
                super(1);
                this.f87651d = rVar;
            }

            /* renamed from: a */
            public final void mo89038a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f87651d.f87645v.set(Boolean.TRUE);
                this.f87651d.f87640q.onNext(C41238w.f97225a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89038a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36318c(C36313r rVar) {
            super(1);
            this.f87650d = rVar;
        }

        /* renamed from: a */
        public final void mo89037a(C31128a aVar) {
            this.f87650d.mo89023Sv().mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C36319a(this.f87650d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89037a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hz0.r$d */
    static final class C36320d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36313r f87652d;

        /* renamed from: hz0.r$d$a */
        static final class C36321a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C36321a f87653d = new C36321a();

            C36321a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36320d(C36313r rVar) {
            super(1);
            this.f87652d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m107810c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38890s0 pw = this.f87652d.f87628e;
            Object obj = this.f87652d.f87643t.get();
            C41536l.m120488h(obj, "clientPhoneNumber.get()");
            return pw.mo92587a("PHONE", (String) obj, this.f87652d.f87627d.mo81928a()).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C36330u(C36321a.f87653d));
        }
    }

    /* renamed from: hz0.r$e */
    static final class C36322e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36313r f87654d;

        /* renamed from: hz0.r$e$a */
        static final class C36323a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36313r f87655d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36323a(C36313r rVar) {
                super(1);
                this.f87655d = rVar;
            }

            /* renamed from: a */
            public final void mo89042a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C1644x uw = this.f87655d.mo89026ia();
                Object obj = this.f87655d.f87643t.get();
                C41536l.m120488h(obj, "clientPhoneNumber.get()");
                uw.mo4823o(new C36301i.C36303b((String) obj));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89042a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36322e(C36313r rVar) {
            super(1);
            this.f87654d = rVar;
        }

        /* renamed from: a */
        public final void mo89041a(C31128a aVar) {
            this.f87654d.mo89023Sv().mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C36323a(this.f87654d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89041a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hz0.r$f */
    static final class C36324f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36313r f87656d;

        /* renamed from: hz0.r$f$a */
        static final class C36325a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C36325a f87657d = new C36325a();

            C36325a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36324f(C36313r rVar) {
            super(1);
            this.f87656d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m107816c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "otp");
            C38897v0 sw = this.f87656d.f87629f;
            Object obj = this.f87656d.f87643t.get();
            C41536l.m120488h(obj, "clientPhoneNumber.get()");
            return sw.mo92593a("PHONE", (String) obj, this.f87656d.f87627d.mo81928a(), str).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C36331v(C36325a.f87657d));
        }
    }

    /* renamed from: hz0.r$g */
    static final class C36326g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36313r f87658d;

        /* renamed from: hz0.r$g$a */
        static final class C36327a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36313r f87659d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36327a(C36313r rVar) {
                super(1);
                this.f87659d = rVar;
            }

            /* renamed from: a */
            public final void mo89046a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f87659d.mo89026ia().mo4823o(C36301i.C36304c.f87620a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89046a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36326g(C36313r rVar) {
            super(1);
            this.f87658d = rVar;
        }

        /* renamed from: a */
        public final void mo89045a(C31128a aVar) {
            this.f87658d.mo89025gn().mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C36327a(this.f87658d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89045a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36313r(CheckChildMBankActiveModel checkChildMBankActiveModel, C38890s0 s0Var, C38897v0 v0Var, C38859f fVar, C38849a aVar, C36734f fVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        long j;
        C41536l.m120489i(checkChildMBankActiveModel, "childClientInfo");
        C41536l.m120489i(s0Var, "sendClientContractConfirmationUseCase");
        C41536l.m120489i(v0Var, "validateClientConfirmationUseCase");
        C41536l.m120489i(fVar, "createClientUserUseCase");
        C41536l.m120489i(aVar, "activateClientChannelUseCase");
        C41536l.m120489i(fVar2, "getClientPhones");
        this.f87627d = checkChildMBankActiveModel;
        this.f87628e = s0Var;
        this.f87629f = v0Var;
        this.f87630g = fVar;
        this.f87631h = aVar;
        this.f87632i = fVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f87640q = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f87641r = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Unit>()");
        this.f87642s = h13;
        this.f87643t = new AtomicReference();
        this.f87644u = new AtomicReference(Boolean.valueOf(checkChildMBankActiveModel.mo81930d()));
        this.f87645v = new AtomicReference(Boolean.valueOf(checkChildMBankActiveModel.mo81929b()));
        Long e = checkChildMBankActiveModel.mo81932e();
        if (e != null) {
            j = e.longValue();
        } else {
            j = -1;
        }
        this.f87646w = new AtomicReference(Long.valueOf(j));
        m107760Dw();
        m107763Gw();
        m107757Aw();
    }

    /* renamed from: Aw */
    private final void m107757Aw() {
        C40749p Q = this.f87642s.mo94998Q(new C36309n(new C36315b(this)));
        C41536l.m120488h(Q, "private fun subscribeToA…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C36310o(new C36318c(this)));
        C41536l.m120488h(F0, "private fun subscribeToA…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final C40754t m107758Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m107759Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Dw */
    private final void m107760Dw() {
        C40749p Q = this.f87640q.mo94998Q(new C36307l(new C36320d(this)));
        C41536l.m120488h(Q, "private fun subscribeToS…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C36308m(new C36322e(this)));
        C41536l.m120488h(F0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final C40754t m107761Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final void m107762Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Gw */
    private final void m107763Gw() {
        C40749p Q = this.f87641r.mo94998Q(new C36311p(new C36324f(this)));
        C41536l.m120488h(Q, "private fun subscribeToV…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C36312q(new C36326g(this)));
        C41536l.m120488h(F0, "private fun subscribeToV…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final C40754t m107764Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m107765Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Jo */
    public void mo89017Jo() {
        mo89026ia().mo4823o(C36301i.C36302a.f87618a);
    }

    /* renamed from: Qi */
    public void mo89018Qi() {
        this.f87640q.onNext(C41238w.f97225a);
    }

    /* renamed from: am */
    public void mo89019am() {
        mo89024fl().mo4823o(C32343x.m95466m(C41238w.f97225a));
    }

    /* renamed from: au */
    public void mo89020au(String str) {
        C41536l.m120489i(str, "otp");
        this.f87641r.onNext(str);
    }

    /* renamed from: dq */
    public void mo89021dq(String str) {
        String str2;
        Object obj;
        C41536l.m120489i(str, "phoneNumber");
        String str3 = "995" + str;
        Iterator it = this.f87632i.mo89561a().iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C36874b) obj).mo89807b()) {
                break;
            }
        }
        C36874b bVar = (C36874b) obj;
        if (bVar != null) {
            str2 = bVar.mo89806a();
        }
        if (str2 == null) {
            str2 = "";
        }
        if (C41536l.m120484d(str2, str3)) {
            mo89022Me().mo4823o(C32343x.m95466m(C41238w.f97225a));
            return;
        }
        this.f87643t.set(str3);
        Object obj2 = this.f87644u.get();
        C41536l.m120488h(obj2, "userActivated.get()");
        if (((Boolean) obj2).booleanValue()) {
            Object obj3 = this.f87645v.get();
            C41536l.m120488h(obj3, "channelActivated.get()");
            if (((Boolean) obj3).booleanValue()) {
                this.f87640q.onNext(C41238w.f97225a);
                return;
            }
        }
        this.f87642s.onNext(C41238w.f97225a);
    }

    /* renamed from: tw */
    public C1644x mo89023Sv() {
        return this.f87637n;
    }

    /* renamed from: uw */
    public C1644x mo89026ia() {
        return this.f87635l;
    }

    /* renamed from: vw */
    public C1644x mo89024fl() {
        return this.f87636m;
    }

    /* renamed from: ww */
    public final C36305j mo89030ww() {
        return this.f87633j;
    }

    /* renamed from: xw */
    public final C36306k mo89031xw() {
        return this.f87634k;
    }

    /* renamed from: yw */
    public C1644x mo89022Me() {
        return this.f87639p;
    }

    /* renamed from: zw */
    public C1644x mo89025gn() {
        return this.f87638o;
    }
}
