package iz0;

import android.util.Base64;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import ty0.C38857e;
import ty0.C38887r;
import ue1.C43075l;
import xy0.C39945i;

/* renamed from: iz0.l */
public final class C36679l extends C21481a implements C36673f, C36674g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f88501d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38887r f88502e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38857e f88503f;

    /* renamed from: g */
    private final C36673f f88504g = this;

    /* renamed from: h */
    private final C36674g f88505h = this;

    /* renamed from: i */
    private final C1644x f88506i = new C1644x();

    /* renamed from: j */
    private final C1644x f88507j = new C1644x();

    /* renamed from: k */
    private final C1644x f88508k = new C1644x();

    /* renamed from: l */
    private final C40767b f88509l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f88510m;

    /* renamed from: iz0.l$a */
    static final class C36680a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36679l f88511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36680a(C36679l lVar) {
            super(1);
            this.f88511d = lVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p O = this.f88511d.f88502e.mo92585a("PARENT_PERMISSION_DIGITAL_CHANNEL_ACTIVATION", Long.valueOf(this.f88511d.f88501d)).mo95075O();
            C41536l.m120488h(O, "contractUseCase(CONTRACT…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: iz0.l$b */
    static final class C36681b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36679l f88512d;

        /* renamed from: iz0.l$b$a */
        static final class C36682a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36679l f88513d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36682a(C36679l lVar) {
                super(1);
                this.f88513d = lVar;
            }

            /* renamed from: a */
            public final void mo89503a(C39945i iVar) {
                C36679l lVar = this.f88513d;
                String a = iVar.mo93719a();
                if (a == null) {
                    a = "";
                }
                lVar.f88510m = a;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89503a((C39945i) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36681b(C36679l lVar) {
            super(1);
            this.f88512d = lVar;
        }

        /* renamed from: a */
        public final void mo89502a(C31128a aVar) {
            this.f88512d.mo89494Q1().mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C36682a(this.f88512d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89502a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: iz0.l$c */
    public interface C36683c {
        /* renamed from: a */
        C36679l mo32786a(long j);
    }

    /* renamed from: iz0.l$d */
    static final class C36684d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36679l f88514d;

        /* renamed from: iz0.l$d$a */
        static final class C36685a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C36685a f88515d = new C36685a();

            C36685a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36684d(C36679l lVar) {
            super(1);
            this.f88514d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m108809c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38857e kw = this.f88514d.f88503f;
            String encodeToString = Base64.encodeToString(C40439w.m117112p(this.f88514d.f88510m), 0);
            C41536l.m120488h(encodeToString, "encodeToString(contractT…eArray(), Base64.DEFAULT)");
            return kw.mo92563a("PARENT_PERMISSION", encodeToString, String.valueOf(this.f88514d.f88501d), PensionStatusResult.STATUS_ACTIVE, PensionStatusResult.STATUS_INACTIVE).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C36688m(C36685a.f88515d));
        }
    }

    /* renamed from: iz0.l$e */
    static final class C36686e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36679l f88516d;

        /* renamed from: iz0.l$e$a */
        static final class C36687a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36679l f88517d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36687a(C36679l lVar) {
                super(1);
                this.f88517d = lVar;
            }

            /* renamed from: a */
            public final void mo89507a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f88517d.mo89495mr().mo4823o(C32343x.m95466m(C41238w.f97225a));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89507a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36686e(C36679l lVar) {
            super(1);
            this.f88516d = lVar;
        }

        /* renamed from: a */
        public final void mo89506a(C31128a aVar) {
            this.f88516d.mo89493C6().mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C36687a(this.f88516d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89506a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36679l(long j, C38887r rVar, C38857e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(rVar, "contractUseCase");
        C41536l.m120489i(eVar, "confirmClientDocumentUseCase");
        this.f88501d = j;
        this.f88502e = rVar;
        this.f88503f = eVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f88509l = h1;
        this.f88510m = "";
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C36675h(new C36680a(this)));
        C41536l.m120488h(L0, "merge(\n                o…le(RC_INIT)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C36676i(new C36681b(this)));
        C41536l.m120488h(F0, "merge(\n                o…          }\n            }");
        bindToLifecycle(F0);
        m108793sw();
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m108786hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m108787iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: sw */
    private final void m108793sw() {
        C40749p Q = this.f88509l.mo94998Q(new C36677j(new C36684d(this)));
        C41536l.m120488h(Q, "private fun subscribeToD…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C36678k(new C36686e(this)));
        C41536l.m120488h(F0, "private fun subscribeToD…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final C40754t m108794tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m108795uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: ow */
    public C1644x mo89494Q1() {
        return this.f88507j;
    }

    /* renamed from: pw */
    public C1644x mo89495mr() {
        return this.f88508k;
    }

    /* renamed from: qw */
    public C1644x mo89493C6() {
        return this.f88506i;
    }

    /* renamed from: rw */
    public final C36674g mo89499rw() {
        return this.f88505h;
    }

    /* renamed from: s2 */
    public void mo89500s2() {
        this.f88509l.onNext(C41238w.f97225a);
    }
}
