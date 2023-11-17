package p341ge.bog.mobilebank.ddsto.presentation.intro;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ca0.C19669a;
import ca0.C19676h;
import ca0.C19678j;
import ca0.C19679k;
import ca0.C19680l;
import ca0.C19681m;
import ca0.C19682n;
import ed1.C40749p;
import ed1.C40754t;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.ddsto.presentation.intro.C22780b;
import ue1.C43075l;
import ue1.C43079p;
import x90.C29661a;
import x90.C29662b;
import z90.C30266a;
import z90.C30267b;

/* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroViewModel$ViewModel */
public final class DdStoIntroViewModel$ViewModel extends C21481a implements C19679k {

    /* renamed from: d */
    private final C30267b f60062d;

    /* renamed from: e */
    private final C30266a f60063e;

    /* renamed from: f */
    private final C19679k f60064f = this;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f60065g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f60066h = new C1644x();

    /* renamed from: i */
    private final C1644x f60067i = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List f60068j = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List f60069k = C41341q.m119907j();

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroViewModel$ViewModel$a */
    static final class C22772a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DdStoIntroViewModel$ViewModel f60070d;

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroViewModel$ViewModel$a$a */
        static final class C22773a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ DdStoIntroViewModel$ViewModel f60071d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22773a(DdStoIntroViewModel$ViewModel ddStoIntroViewModel$ViewModel) {
                super(2);
                this.f60071d = ddStoIntroViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C41224m invoke(List list, List list2) {
                C41536l.m120489i(list, "stoList");
                C41536l.m120489i(list2, "ddList");
                this.f60071d.f60068j = C41341q.m119907j();
                this.f60071d.f60069k = C41341q.m119907j();
                this.f60071d.f60065g.mo4823o(new C19676h((List) null, (List) null, false, C19669a.LOADING, 7, (DefaultConstructorMarker) null));
                return new C41224m(list, list2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22772a(DdStoIntroViewModel$ViewModel ddStoIntroViewModel$ViewModel) {
            super(1);
            this.f60070d = ddStoIntroViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m73889c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            boolean z = true;
            if (!(num.intValue() == 2 || num.intValue() == 1)) {
                z = false;
            }
            return C40749p.m118048m(this.f60070d.mo56576pw().mo70586a(z), this.f60070d.mo56575ow().mo70585a(z), new C22784c(new C22773a(this.f60070d)));
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroViewModel$ViewModel$b */
    static final class C22774b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DdStoIntroViewModel$ViewModel f60072d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22774b(DdStoIntroViewModel$ViewModel ddStoIntroViewModel$ViewModel) {
            super(1);
            this.f60072d = ddStoIntroViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x gw = this.f60072d.f60066h;
            C41536l.m120488h(th, "it");
            C37224b.m109965d(gw, th);
            this.f60072d.f60065g.mo4823o(new C19676h((List) null, (List) null, false, C19669a.ERROR, 7, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroViewModel$ViewModel$c */
    static final class C22775c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DdStoIntroViewModel$ViewModel f60073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22775c(DdStoIntroViewModel$ViewModel ddStoIntroViewModel$ViewModel) {
            super(1);
            this.f60073d = ddStoIntroViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo56585a(C41224m mVar) {
            boolean z;
            List<C29662b> list = (List) mVar.mo95675a();
            List<C29661a> list2 = (List) mVar.mo95676b();
            DdStoIntroViewModel$ViewModel ddStoIntroViewModel$ViewModel = this.f60073d;
            C41536l.m120488h(list, "stoList");
            ddStoIntroViewModel$ViewModel.f60068j = list;
            DdStoIntroViewModel$ViewModel ddStoIntroViewModel$ViewModel2 = this.f60073d;
            C41536l.m120488h(list2, "ddList");
            ddStoIntroViewModel$ViewModel2.f60069k = list2;
            C1644x hw = this.f60073d.f60065g;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
            for (C29661a a : list2) {
                arrayList.add(C19678j.m65344a(a));
            }
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
            for (C29662b b : list) {
                arrayList2.add(C19678j.m65345b(b));
            }
            if (!list.isEmpty() || !list2.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            hw.mo4823o(new C19676h(arrayList, arrayList2, z, (C19669a) null, 8, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56585a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DdStoIntroViewModel$ViewModel(C30267b bVar, C30266a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getStoList");
        C41536l.m120489i(aVar, "getDdList");
        this.f60062d = bVar;
        this.f60063e = aVar;
        m73875kw();
    }

    /* renamed from: kw */
    private final void m73875kw() {
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C19680l(new C22772a(this))).mo94974C(new C19681m(new C22774b(this))).mo94981F0(new C19682n(new C22775c(this)));
        C41536l.m120488h(F0, "private fun configureDat…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m73876lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m73877mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m73878nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public LiveData getState() {
        return this.f60065g;
    }

    /* renamed from: me */
    public LiveData mo47883me() {
        return this.f60067i;
    }

    /* renamed from: o3 */
    public LiveData mo47884o3() {
        return this.f60066h;
    }

    /* renamed from: ow */
    public final C30266a mo56575ow() {
        return this.f60063e;
    }

    /* renamed from: pw */
    public final C30267b mo56576pw() {
        return this.f60062d;
    }

    /* renamed from: qw */
    public final C19679k mo56577qw() {
        return this.f60064f;
    }

    /* renamed from: rw */
    public void mo56578rw() {
        C37224b.m109965d(this.f60067i, C22780b.C22781a.f60078a);
    }

    /* renamed from: sw */
    public void mo56579sw(long j) {
    }

    /* renamed from: tw */
    public void mo56580tw() {
        C37224b.m109965d(this.f60067i, C22780b.C22782b.f60079a);
    }

    /* renamed from: uw */
    public void mo56581uw(long j) {
        Object obj;
        boolean z;
        Iterator it = this.f60068j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C29662b) obj).mo69621i() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C29662b bVar = (C29662b) obj;
        if (bVar != null) {
            C37224b.m109965d(this.f60067i, new C22780b.C22783c(bVar));
        }
    }
}
