package p341ge.bog.mobilebank.giftcards.presentation.home;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import jj0.C25462c;
import kj0.C25740a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import wh0.C29403j;
import wi0.C29420a;
import wi0.C29439g;
import wi0.C29446i;
import xh0.C29791h;
import xh0.C29792i;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.home.GiftCardsViewModel$ViewModel */
public final class GiftCardsViewModel$ViewModel extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29403j f62752d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29439g f62753e;

    /* renamed from: f */
    private final C29420a f62754f;

    /* renamed from: g */
    private final C25462c f62755g;

    /* renamed from: h */
    private final C1644x f62756h;

    /* renamed from: i */
    private final C1644x f62757i = new C1644x();

    /* renamed from: j */
    private final C1644x f62758j = new C1644x();

    /* renamed from: k */
    private final C1644x f62759k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List f62760l;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.home.GiftCardsViewModel$ViewModel$a */
    static final class C24269a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsViewModel$ViewModel f62761d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.home.GiftCardsViewModel$ViewModel$a$a */
        static final class C24270a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsViewModel$ViewModel f62762d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24270a(GiftCardsViewModel$ViewModel giftCardsViewModel$ViewModel) {
                super(1);
                this.f62762d = giftCardsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo61949a(List list) {
                this.f62762d.f62760l = list;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61949a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.home.GiftCardsViewModel$ViewModel$a$b */
        static final class C24271b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GiftCardsViewModel$ViewModel f62763d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24271b(GiftCardsViewModel$ViewModel giftCardsViewModel$ViewModel) {
                super(1);
                this.f62763d = giftCardsViewModel$ViewModel;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                return C29439g.m89548b(this.f62763d.f62753e, list, (String) null, 2, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24269a(GiftCardsViewModel$ViewModel giftCardsViewModel$ViewModel) {
            super(1);
            this.f62761d = giftCardsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m78129d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final List m78130e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x A = this.f62761d.f62752d.mo69243a(true).mo95084m(new C24272a(new C24270a(this.f62761d))).mo95062A(new C24273b(new C24271b(this.f62761d)));
            C41536l.m120488h(A, "@HiltViewModel\n    class…(model))\n        }\n\n    }");
            return C31270e.m92880i(A, 1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftCardsViewModel$ViewModel(C29403j jVar, C29439g gVar, C29420a aVar, C25462c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(jVar, "getGiftCards");
        C41536l.m120489i(gVar, "mapper");
        C41536l.m120489i(aVar, "giftCardsAnimationsMapper");
        C41536l.m120489i(cVar, "offerFilters");
        this.f62752d = jVar;
        this.f62753e = gVar;
        this.f62754f = aVar;
        this.f62755g = cVar;
        C1644x xVar = new C1644x();
        this.f62756h = xVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C29446i(new C24269a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…C_INIT)\n                }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m78115ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: G */
    public void mo61940G() {
        C37224b.m109965d(this.f62757i, C41238w.f97225a);
    }

    /* renamed from: iw */
    public LiveData mo61941iw() {
        return this.f62756h;
    }

    /* renamed from: jw */
    public LiveData mo61942jw() {
        return this.f62757i;
    }

    /* renamed from: kw */
    public LiveData mo61943kw() {
        return this.f62758j;
    }

    /* renamed from: lw */
    public LiveData mo61944lw() {
        return this.f62759k;
    }

    /* renamed from: mw */
    public void mo61945mw(C25740a aVar) {
        C41536l.m120489i(aVar, "model");
        C37224b.m109966e(this.f62759k, this.f62754f.mo69259a(aVar));
    }

    /* renamed from: nw */
    public void mo61946nw(String str) {
        ArrayList arrayList;
        String str2 = str;
        C41536l.m120489i(str2, "query");
        if (mo61941iw().mo4814f() instanceof C31128a.C31131c) {
            List<C29791h> list = this.f62760l;
            if (list != null) {
                arrayList = new ArrayList(C41343r.m119925u(list, 10));
                for (C29791h hVar : list) {
                    List g = hVar.mo69990g();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : g) {
                        if (this.f62755g.mo64032a((C29792i) next, str2)) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList.add(C29791h.m90496b(hVar, 0, (String) null, (String) null, (String) null, (String) null, arrayList2, 31, (Object) null));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object next2 : arrayList) {
                    if (!((C29791h) next2).mo69990g().isEmpty()) {
                        arrayList3.add(next2);
                    }
                }
                this.f62756h.mo4826r(new C31128a.C31131c(this.f62753e.mo69277a(arrayList3, str2), 0, 2, (DefaultConstructorMarker) null));
            }
        }
    }

    /* renamed from: ow */
    public void mo61947ow(long j) {
        C37224b.m109965d(this.f62758j, Long.valueOf(j));
    }
}
