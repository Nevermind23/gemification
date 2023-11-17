package p341ge.bog.mobilebank.cardproducts.presentation.closecard.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import hd1.C41204a;
import he1.C41238w;
import j51.C36735g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p510ln.C16587a;
import p510ln.C16588b;
import p661wn.C18638a;
import p661wn.C18639b;
import p661wn.C18640c;
import p661wn.C18641d;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardproducts.presentation.closecard.viewmodel.CloseCardViewModel$ViewModel */
public final class CloseCardViewModel$ViewModel extends C21481a implements C18638a, C18639b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16588b f42137d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C16587a f42138e;

    /* renamed from: f */
    private final C36735g f42139f;

    /* renamed from: g */
    private final C18638a f42140g = this;

    /* renamed from: h */
    private final C18639b f42141h = this;

    /* renamed from: i */
    private final C1644x f42142i;

    /* renamed from: j */
    private final C40765a f42143j;

    /* renamed from: k */
    private final C40765a f42144k;

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.closecard.viewmodel.CloseCardViewModel$ViewModel$a */
    static final class C14393a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CloseCardViewModel$ViewModel f42145d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14393a(CloseCardViewModel$ViewModel closeCardViewModel$ViewModel) {
            super(1);
            this.f42145d = closeCardViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C14395c cVar) {
            C41536l.m120489i(cVar, "it");
            C40749p f = this.f42145d.f42137d.mo43741a(cVar.mo40274b(), cVar.mo40273a()).mo94897f(C40749p.m118043h0(C41238w.f97225a));
            C41536l.m120488h(f, "closeCard(it.productId, …en(Observable.just(Unit))");
            return C31270e.m92879h(f, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.closecard.viewmodel.CloseCardViewModel$ViewModel$b */
    static final class C14394b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CloseCardViewModel$ViewModel f42146d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14394b(CloseCardViewModel$ViewModel closeCardViewModel$ViewModel) {
            super(1);
            this.f42146d = closeCardViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C14395c cVar) {
            C41536l.m120489i(cVar, "it");
            C40749p f = this.f42146d.f42138e.mo43740a(cVar.mo40274b(), cVar.mo40273a()).mo94897f(C40749p.m118043h0(C41238w.f97225a));
            C41536l.m120488h(f, "cancelCardApplication(it…en(Observable.just(Unit))");
            return C31270e.m92879h(f, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.closecard.viewmodel.CloseCardViewModel$ViewModel$c */
    private static final class C14395c {

        /* renamed from: a */
        private final long f42147a;

        /* renamed from: b */
        private final long f42148b;

        public C14395c(long j, long j2) {
            this.f42147a = j;
            this.f42148b = j2;
        }

        /* renamed from: a */
        public final long mo40273a() {
            return this.f42148b;
        }

        /* renamed from: b */
        public final long mo40274b() {
            return this.f42147a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14395c)) {
                return false;
            }
            C14395c cVar = (C14395c) obj;
            return this.f42147a == cVar.f42147a && this.f42148b == cVar.f42148b;
        }

        public int hashCode() {
            return (C7397t.m28148a(this.f42147a) * 31) + C7397t.m28148a(this.f42148b);
        }

        public String toString() {
            long j = this.f42147a;
            long j2 = this.f42148b;
            return "CloseCardParams(productId=" + j + ", customerId=" + j2 + ")";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloseCardViewModel$ViewModel(C16588b bVar, C16587a aVar, C36735g gVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "closeCard");
        C41536l.m120489i(aVar, "cancelCardApplication");
        C41536l.m120489i(gVar, "getLoginInfo");
        this.f42137d = bVar;
        this.f42138e = aVar;
        this.f42139f = gVar;
        C1644x xVar = new C1644x();
        this.f42142i = xVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<CloseCardParams>()");
        this.f42143j = h1;
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create<CloseCardParams>()");
        this.f42144k = h12;
        C40749p L0 = h1.mo94989L0(new C18640c(new C14393a(this)));
        C41536l.m120488h(L0, "closeCardSubject.switchM…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
        C40749p L02 = h12.mo94989L0(new C18641d(new C14394b(this)));
        C41536l.m120488h(L02, "cancelCardOrderSubject.s…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(L02, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m53309fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m53310gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ck */
    public void mo40266Ck(long j) {
        C37228a a = this.f42139f.mo89562a();
        if (a != null) {
            this.f42144k.onNext(new C14395c(j, a.mo90305b()));
        }
    }

    /* renamed from: jw */
    public final C18638a mo40267jw() {
        return this.f42140g;
    }

    /* renamed from: kw */
    public final C18639b mo40268kw() {
        return this.f42141h;
    }

    /* renamed from: os */
    public LiveData mo40269os() {
        return this.f42142i;
    }

    /* renamed from: pj */
    public void mo40270pj(long j) {
        C37228a a = this.f42139f.mo89562a();
        if (a != null) {
            this.f42143j.onNext(new C14395c(j, a.mo90305b()));
        }
    }
}
