package ic0;

import ac0.C19222c;
import ac0.C19225f;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import py0.C38048b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ic0.m */
public final class C25175m extends C21481a implements C25171i {

    /* renamed from: d */
    private final long f64628d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19222c f64629e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C19225f f64630f;

    /* renamed from: g */
    private final C25171i f64631g = this;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f64632h = new C1644x();

    /* renamed from: ic0.m$a */
    static final class C25176a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25175m f64633d;

        /* renamed from: ic0.m$a$a */
        static final class C25177a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C25177a f64634d = new C25177a();

            C25177a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C31128a aVar, C31128a aVar2) {
                C41536l.m120489i(aVar, "depositDetails");
                C41536l.m120489i(aVar2, "maxAmount");
                return C41233s.m119492a(aVar, aVar2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25176a(C25175m mVar) {
            super(1);
            this.f64633d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m80248c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "code");
            return C40749p.m118037d1(C31270e.m92880i(this.f64633d.f64629e.mo47457a(this.f64633d.mo63712kw()), num.intValue()), C31270e.m92880i(C19225f.m64662b(this.f64633d.f64630f, this.f64633d.mo63712kw(), false, 2, (Object) null), num.intValue()), new C25174l(C25177a.f64634d));
        }
    }

    /* renamed from: ic0.m$b */
    static final class C25178b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25175m f64635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25178b(C25175m mVar) {
            super(1);
            this.f64635d = mVar;
        }

        /* renamed from: a */
        public final void mo63716a(C41224m mVar) {
            Object obj;
            C31128a.C31129a aVar;
            double d;
            C31128a aVar2 = (C31128a) mVar.mo95675a();
            C31128a aVar3 = (C31128a) mVar.mo95676b();
            C1644x jw = this.f64635d.f64632h;
            C41536l.m120488h(aVar2, "depositDetails");
            try {
                if (aVar2 instanceof C31128a.C31131c) {
                    C38048b bVar = (C38048b) ((C31128a.C31131c) aVar2).mo71340a();
                    Double d2 = (Double) aVar3.mo71340a();
                    if (d2 != null) {
                        d = d2.doubleValue();
                    } else {
                        d = bVar.mo91427e();
                    }
                    obj = new C31128a.C31131c(C38048b.m111829b(bVar, (String) null, 0, 0, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, d, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (String) null, (String) null, 0, 0, Utils.DOUBLE_EPSILON, (String) null, (String) null, (String) null, false, false, 1048543, (Object) null), aVar2.mo71341b());
                } else if (aVar2 instanceof C31128a.C31129a) {
                    aVar = new C31128a.C31129a(((C31128a.C31129a) aVar2).mo71342c(), aVar2.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    obj = aVar;
                } else if (aVar2 instanceof C31128a.C31130b) {
                    obj = new C31128a.C31130b(aVar2.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar = new C31128a.C31129a(th, aVar2.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
            C37224b.m109965d(jw, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63716a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25175m(long j, C19222c cVar, C19225f fVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "detailsUseCase");
        C41536l.m120489i(fVar, "prolongationAmountUseCase");
        this.f64628d = j;
        this.f64629e = cVar;
        this.f64630f = fVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C25172j(new C25176a(this)));
        C41536l.m120488h(L0, "merge(\n                o…maxAmount }\n            }");
        C41205b F0 = C32343x.m95462k1(L0).mo94981F0(new C25173k(new C25178b(this)));
        C41536l.m120488h(F0, "merge(\n                o…     })\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m80239fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m80240gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Tt */
    public LiveData mo63711Tt() {
        return this.f64632h;
    }

    /* renamed from: kw */
    public final long mo63712kw() {
        return this.f64628d;
    }

    /* renamed from: lw */
    public final C25171i mo63713lw() {
        return this.f64631g;
    }
}
