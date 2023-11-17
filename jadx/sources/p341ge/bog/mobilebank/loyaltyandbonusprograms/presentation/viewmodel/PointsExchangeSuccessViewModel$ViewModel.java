package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import he1.C41224m;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import ot0.C37798w0;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p729cv.C19797a;
import p739dv.C20102a;
import p739dv.C20104c;
import p895sy.C28290a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PointsExchangeSuccessViewModel$ViewModel */
public final class PointsExchangeSuccessViewModel$ViewModel extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C19797a f81211d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28290a f81212e;

    /* renamed from: f */
    private final C1644x f81213f;

    /* renamed from: g */
    private final C1644x f81214g = new C1644x(new C37223a(Boolean.FALSE));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PointsExchangeSuccessViewModel$ViewModel$a */
    static final class C33148a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PointsExchangeSuccessViewModel$ViewModel f81215d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PointsExchangeSuccessViewModel$ViewModel$a$a */
        static final class C33149a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C33149a f81216d = new C33149a();

            C33149a() {
                super(1);
            }

            /* renamed from: a */
            public final C40754t invoke(C20102a aVar) {
                BigDecimal bigDecimal;
                Object obj;
                BigDecimal bigDecimal2;
                C41536l.m120489i(aVar, "asset");
                Iterator it = aVar.mo48504d().iterator();
                while (true) {
                    bigDecimal = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(((C20104c) obj).mo48522h(), ProductType.BONUS_PROD_TYPE_MEMBREWARD)) {
                        break;
                    }
                }
                C20104c cVar = (C20104c) obj;
                if (cVar != null) {
                    bigDecimal2 = cVar.mo48514a();
                } else {
                    bigDecimal2 = null;
                }
                if (cVar != null) {
                    bigDecimal = cVar.mo48515b();
                }
                return C40762x.m118162z(new C41224m(bigDecimal2, bigDecimal)).mo95075O();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33148a(PointsExchangeSuccessViewModel$ViewModel pointsExchangeSuccessViewModel$ViewModel) {
            super(1);
            this.f81215d = pointsExchangeSuccessViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C40754t m97770d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m97771e(PointsExchangeSuccessViewModel$ViewModel pointsExchangeSuccessViewModel$ViewModel) {
            C41536l.m120489i(pointsExchangeSuccessViewModel$ViewModel, "this$0");
            pointsExchangeSuccessViewModel$ViewModel.f81212e.mo67918a(true);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p A = this.f81215d.f81211d.mo48086b(true).mo94998Q(new C33157g(C33149a.f81216d)).mo94971A(new C33158h(this.f81215d));
            C41536l.m120488h(A, "getLiability(true).flatM…ally { getBonuses(true) }");
            return C32343x.m95462k1(C31270e.m92879h(A, 1));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointsExchangeSuccessViewModel$ViewModel(C19797a aVar, C28290a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getLiability");
        C41536l.m120489i(aVar2, "getBonuses");
        this.f81211d = aVar;
        this.f81212e = aVar2;
        C1644x xVar = new C1644x();
        this.f81213f = xVar;
        C40749p Q = C40749p.m118047l0(onInit(), onRefresh()).mo94998Q(new C37798w0(new C33148a(this)));
        C41536l.m120488h(Q, "merge(onInit(), onRefres…rveOnMain()\n            }");
        bindToLifecycle(C31270e.m92876e(Q, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m97762ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: hw */
    public LiveData mo75291hw() {
        return this.f81213f;
    }

    /* renamed from: iw */
    public LiveData mo75292iw() {
        return this.f81214g;
    }

    /* renamed from: jw */
    public void mo75293jw(boolean z) {
        C37224b.m109966e(this.f81214g, Boolean.valueOf(z));
    }
}
