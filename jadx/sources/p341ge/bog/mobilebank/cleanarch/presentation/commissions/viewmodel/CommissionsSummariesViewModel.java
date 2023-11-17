package p341ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p811ku.C25775e;
import t00.C28295c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsSummariesViewModel */
public final class CommissionsSummariesViewModel extends C21481a {

    /* renamed from: d */
    private final C25775e f57337d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28295c f57338e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f57339f;

    /* renamed from: g */
    private final LiveData f57340g;

    /* renamed from: h */
    private final C1644x f57341h;

    /* renamed from: i */
    private final LiveData f57342i;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsSummariesViewModel$a */
    static final class C21464a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CommissionsSummariesViewModel f57343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21464a(CommissionsSummariesViewModel commissionsSummariesViewModel) {
            super(0);
            this.f57343d = commissionsSummariesViewModel;
        }

        public final void invoke() {
            C21484c.m69417i(this.f57343d.f57339f, (Object) null, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsSummariesViewModel$b */
    static final class C21465b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsSummariesViewModel f57344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21465b(CommissionsSummariesViewModel commissionsSummariesViewModel) {
            super(1);
            this.f57344d = commissionsSummariesViewModel;
        }

        /* renamed from: a */
        public final void mo53560a(List list) {
            C41536l.m120489i(list, "it");
            C21484c.m69418j(this.f57344d.f57339f, this.f57344d.f57338e.mo67924a(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53560a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsSummariesViewModel$c */
    static final class C21466c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsSummariesViewModel f57345d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21466c(CommissionsSummariesViewModel commissionsSummariesViewModel) {
            super(1);
            this.f57345d = commissionsSummariesViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C21484c.m69415g(this.f57345d.f57339f, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommissionsSummariesViewModel(C25775e eVar, C28295c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "getSummaries");
        C41536l.m120489i(cVar, "upcomingSummariesUIMapper");
        this.f57337d = eVar;
        this.f57338e = cVar;
        C1644x xVar = new C1644x();
        this.f57339f = xVar;
        this.f57340g = xVar;
        C1644x xVar2 = new C1644x();
        this.f57341h = xVar2;
        this.f57342i = xVar2;
    }

    /* renamed from: fw */
    public final void mo53556fw() {
        addDisposable(C32343x.m95484s(this.f57337d.mo64368a(), new C21464a(this), new C21465b(this), new C21466c(this)));
    }

    /* renamed from: gw */
    public final LiveData mo53557gw() {
        return this.f57340g;
    }

    /* renamed from: hw */
    public final LiveData mo53558hw() {
        return this.f57342i;
    }

    /* renamed from: iw */
    public final void mo53559iw(int i, int i2) {
        if (i == 10033 && i2 == -1) {
            this.f57341h.mo4826r(new Object());
            mo53556fw();
        }
    }
}
