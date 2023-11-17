package p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ao0.C10126g;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40757w;
import ed1.C40762x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import no0.C17133a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel;
import po0.C17465j;
import po0.C17466k;
import po0.C17467l;
import po0.C17468m;
import ue1.C43075l;
import zn0.C19104p;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.j */
public final class C15101j extends C21481a implements C17465j, C17466k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C17133a f43369d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19104p f43370e;

    /* renamed from: f */
    private final C40757w f43371f;

    /* renamed from: g */
    private final C40757w f43372g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f43373h;

    /* renamed from: i */
    private final C17465j f43374i = this;

    /* renamed from: j */
    private final C17466k f43375j = this;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f43376k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f43377l = new C1644x();

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.j$a */
    public interface C15102a {
        /* renamed from: a */
        C15101j mo32571a(int i);
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.j$b */
    static final class C15103b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15101j f43378d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.j$b$a */
        static final class C15104a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C15101j f43379d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15104a(C15101j jVar) {
                super(1);
                this.f43379d = jVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "list");
                C17133a gw = this.f43379d.f43369d;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(gw.mo44555a((C10126g) it.next()));
                }
                return arrayList;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15103b(C15101j jVar) {
            super(1);
            this.f43378d = jVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x A = this.f43378d.f43370e.mo47305a().mo95062A(new C15107k(new C15104a(this.f43378d)));
            C41536l.m120488h(A, "private fun subscribePro…ndToLifecycle()\n        }");
            return C31270e.m92880i(A, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.j$c */
    static final class C15105c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15101j f43380d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.j$c$a */
        static final class C15106a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C15101j f43381d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15106a(C15101j jVar) {
                super(1);
                this.f43381d = jVar;
            }

            /* renamed from: a */
            public final void mo42062a(List list) {
                boolean z;
                C1644x iw = this.f43381d.f43377l;
                C41536l.m120488h(list, "offers");
                C15101j jVar = this.f43381d;
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    Integer i = ((OffersProgressListItemUiModel) next).mo41852i();
                    int hw = jVar.f43373h;
                    if (i != null && i.intValue() == hw) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                iw.mo4826r(arrayList);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42062a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15105c(C15101j jVar) {
            super(1);
            this.f43380d = jVar;
        }

        /* renamed from: a */
        public final void mo42061a(C31128a aVar) {
            this.f43380d.f43376k.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C15106a(this.f43380d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42061a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15101j(C17133a aVar, C19104p pVar, C40757w wVar, C40757w wVar2, int i) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "offersMapper");
        C41536l.m120489i(pVar, "getLifestyleOfferProgress");
        C41536l.m120489i(wVar, "mainScheduler");
        C41536l.m120489i(wVar2, "scheduler");
        this.f43369d = aVar;
        this.f43370e = pVar;
        this.f43371f = wVar;
        this.f43372g = wVar2;
        this.f43373h = i;
        m55262lw();
    }

    /* renamed from: lw */
    private final void m55262lw() {
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C17467l(new C15103b(this))).mo94987J0(this.f43372g).mo95027o0(this.f43371f).mo94981F0(new C17468m(new C15105c(this)));
        C41536l.m120488h(F0, "private fun subscribePro…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m55263mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m55264nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: L0 */
    public LiveData mo42056L0() {
        return this.f43377l;
    }

    /* renamed from: kw */
    public final C17466k mo42057kw() {
        return this.f43375j;
    }

    /* renamed from: t2 */
    public LiveData mo42058t2() {
        return this.f43376k;
    }
}
