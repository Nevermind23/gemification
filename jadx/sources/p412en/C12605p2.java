package p412en;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import rm0.C28057e;
import ue1.C43075l;
import xd0.C29742a;
import yd0.C29991a;
import yd0.C30003b;

/* renamed from: en.p2 */
public final class C12605p2 extends C21481a implements C12549j2, C12580k2 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28057e f37430d;

    /* renamed from: e */
    private final C29742a f37431e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final OrderCardResult f37432f;

    /* renamed from: g */
    private final C12549j2 f37433g = this;

    /* renamed from: h */
    private final C12580k2 f37434h = this;

    /* renamed from: i */
    private final C1644x f37435i;

    /* renamed from: j */
    private final C1644x f37436j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f37437k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f37438l;

    /* renamed from: en.p2$a */
    static final class C12606a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12605p2 f37439d;

        /* renamed from: en.p2$a$a */
        /* synthetic */ class C12607a extends C41535k implements C43075l {
            C12607a(Object obj) {
                super(1, obj, C37224b.class, "postEvent", "postEvent(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
            }

            /* renamed from: b */
            public final void mo33282b(Throwable th) {
                C41536l.m120489i(th, "p0");
                C37224b.m109965d((C1644x) this.receiver, th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33282b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12606a(C12605p2 p2Var) {
            super(1);
            this.f37439d = p2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m47897d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m47898e(C12605p2 p2Var) {
            C41536l.m120489i(p2Var, "this$0");
            p2Var.mo33177Ih();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
            if (r0 == null) goto L_0x0021;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ed1.C40754t invoke(java.lang.Integer r5) {
            /*
                r4 = this;
                java.lang.String r0 = "rc"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                en.p2 r0 = r4.f37439d
                ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult r0 = r0.f37432f
                java.lang.Long r0 = r0.mo39758g()
                if (r0 == 0) goto L_0x0021
                en.p2 r1 = r4.f37439d
                long r2 = r0.longValue()
                rm0.e r0 = r1.f37430d
                ed1.b r0 = r0.mo67599b(r2)
                if (r0 != 0) goto L_0x0025
            L_0x0021:
                ed1.b r0 = ed1.C40734b.m117918i()
            L_0x0025:
                en.p2$a$a r1 = new en.p2$a$a
                en.p2 r2 = r4.f37439d
                androidx.lifecycle.x r2 = r2.f37438l
                r1.<init>(r2)
                en.n2 r2 = new en.n2
                r2.<init>(r1)
                ed1.b r0 = r0.mo94903p(r2)
                en.p2 r1 = r4.f37439d
                en.o2 r2 = new en.o2
                r2.<init>(r1)
                ed1.b r0 = r0.mo94902o(r2)
                java.lang.String r1 = "result.juniorRequestId?.…o()\n                    }"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                int r5 = r5.intValue()
                ed1.p r5 = c41.C31270e.m92878g(r0, r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p412en.C12605p2.C12606a.invoke(java.lang.Integer):ed1.t");
        }
    }

    /* renamed from: en.p2$b */
    static final class C12608b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12605p2 f37440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12608b(C12605p2 p2Var) {
            super(1);
            this.f37440d = p2Var;
        }

        /* renamed from: a */
        public final void mo33283a(C30003b bVar) {
            if (bVar.mo70300c()) {
                C1644x iw = this.f37440d.f37437k;
                C41536l.m120488h(bVar, "it");
                C37224b.m109965d(iw, bVar);
                return;
            }
            this.f37440d.mo33178jo();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo33283a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12605p2(C28057e eVar, C29742a aVar, OrderCardResult orderCardResult) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "processChildOnBoardingRegistration");
        C41536l.m120489i(aVar, "getClientCampaignInfo");
        C41536l.m120489i(orderCardResult, "result");
        this.f37430d = eVar;
        this.f37431e = aVar;
        this.f37432f = orderCardResult;
        C1644x xVar = new C1644x();
        this.f37435i = xVar;
        this.f37436j = new C1644x();
        this.f37437k = new C1644x();
        this.f37438l = new C1644x();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C12590m2(new C12606a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(rc)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m47881fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m47886mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Fl */
    public LiveData mo33266Fl() {
        return this.f37437k;
    }

    /* renamed from: Ih */
    public void mo33177Ih() {
        C40734b y = C32343x.m95465l1(this.f37431e.mo47470a(C29991a.C29994c.C30000f.f75812e)).mo95084m(new C12585l2(new C12608b(this))).mo95092y();
        C41536l.m120488h(y, "override fun requestEndY…dToLifecycle()\n\n        }");
        bindToLifecycle(C31270e.m92876e(C31270e.m92878g(y, -1), this.f37435i));
    }

    /* renamed from: Pv */
    public LiveData mo33267Pv() {
        return this.f37436j;
    }

    /* renamed from: Tg */
    public LiveData mo33268Tg() {
        return this.f37438l;
    }

    /* renamed from: i */
    public LiveData mo33269i() {
        return this.f37435i;
    }

    /* renamed from: jo */
    public void mo33178jo() {
        if (this.f37432f.mo39762j()) {
            C37224b.m109965d(this.f37436j, Long.valueOf(this.f37432f.mo39753d()));
        }
    }

    /* renamed from: kw */
    public final C12549j2 mo33279kw() {
        return this.f37433g;
    }

    /* renamed from: lw */
    public final C12580k2 mo33280lw() {
        return this.f37434h;
    }
}
