package p341ge.bog.mobilebank.giftcards.presentation.filter;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import si0.C28228a;
import si0.C28233f;
import si0.C28234g;
import si0.C28235h;
import ue1.C43075l;
import wh0.C29403j;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.c */
public final class C24227c extends C21481a {

    /* renamed from: d */
    private final GiftCardsFlow.Filter f62682d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1644x f62683e = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f62684f = new C1644x(Boolean.FALSE);

    /* renamed from: g */
    private final C1644x f62685g = new C1644x();

    /* renamed from: h */
    private final C1644x f62686h = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Set f62687i;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.c$a */
    static final class C24228a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29403j f62688d;

        /* renamed from: e */
        final /* synthetic */ C28233f f62689e;

        /* renamed from: f */
        final /* synthetic */ C24227c f62690f;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.c$a$a */
        static final class C24229a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C28233f f62691d;

            /* renamed from: e */
            final /* synthetic */ C24227c f62692e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24229a(C28233f fVar, C24227c cVar) {
                super(1);
                this.f62691d = fVar;
                this.f62692e = cVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                return this.f62691d.mo67766a(list, this.f62692e.f62687i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24228a(C29403j jVar, C28233f fVar, C24227c cVar) {
            super(1);
            this.f62688d = jVar;
            this.f62689e = fVar;
            this.f62690f = cVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C29403j.m89491b(this.f62688d, false, 1, (Object) null).mo95062A(new C24226b(new C24229a(this.f62689e, this.f62690f))).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.c$b */
    static final class C24230b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24227c f62693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24230b(C24227c cVar) {
            super(1);
            this.f62693d = cVar;
        }

        /* renamed from: a */
        public final void mo61881a(List list) {
            this.f62693d.f62683e.mo4823o(list);
            this.f62693d.f62684f.mo4823o(Boolean.valueOf(!this.f62693d.f62687i.isEmpty()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61881a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filter.c$c */
    public interface C24231c {
        /* renamed from: a */
        C24227c mo32828a(GiftCardsFlow.Filter filter);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24227c(GiftCardsFlow.Filter filter, C29403j jVar, C28233f fVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(filter, "data");
        C41536l.m120489i(jVar, "getGiftCards");
        C41536l.m120489i(fVar, "mapper");
        this.f62682d = filter;
        this.f62687i = C41358y.m119992C0(filter.mo61599b());
        C40749p L0 = onInit().mo94989L0(new C28234g(new C24228a(jVar, fVar, this)));
        C41536l.m120488h(L0, "onInit().switchMap {\n   …bservable()\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C28235h(new C24230b(this)));
        C41536l.m120488h(F0, "onInit().switchMap {\n   …mpty())\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m78011fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m78012gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: pw */
    private final void m78016pw() {
        if (this.f62682d.mo61600d()) {
            C37224b.m109965d(this.f62686h, this.f62687i);
        } else {
            C37224b.m109965d(this.f62685g, this.f62687i);
        }
    }

    /* renamed from: G */
    public void mo61871G() {
        m78016pw();
    }

    /* renamed from: Wf */
    public void mo61872Wf(long j) {
        if (this.f62687i.contains(Long.valueOf(j))) {
            this.f62687i.remove(Long.valueOf(j));
        } else {
            this.f62687i.add(Long.valueOf(j));
        }
        this.f62684f.mo4823o(Boolean.valueOf(!this.f62687i.isEmpty()));
    }

    /* renamed from: gf */
    public LiveData mo61873gf() {
        return this.f62683e;
    }

    /* renamed from: kw */
    public boolean mo61874kw() {
        return (this.f62687i.isEmpty() ^ true) && !this.f62682d.mo61600d();
    }

    /* renamed from: lw */
    public LiveData mo61875lw() {
        return this.f62684f;
    }

    /* renamed from: mw */
    public LiveData mo61876mw() {
        return this.f62686h;
    }

    /* renamed from: nw */
    public LiveData mo61877nw() {
        return this.f62685g;
    }

    /* renamed from: ow */
    public void mo61878ow() {
        List<C28228a> list = (List) mo61873gf().mo4814f();
        if (list != null) {
            C1644x xVar = this.f62683e;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            for (C28228a b : list) {
                arrayList.add(C28228a.m86764b(b, 0, (Image) null, (String) null, false, 7, (Object) null));
            }
            xVar.mo4823o(arrayList);
        }
        this.f62687i.clear();
        this.f62684f.mo4823o(Boolean.FALSE);
    }
}
