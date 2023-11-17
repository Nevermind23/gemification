package p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ao0.C10126g;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40757w;
import ed1.C40762x;
import fd0.C20463a;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ko0.C16521c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import no0.C17133a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel;
import po0.C17456a;
import po0.C17457b;
import po0.C17458c;
import po0.C17459d;
import po0.C17460e;
import po0.C17469n;
import ue1.C43075l;
import ue1.C43079p;
import zn0.C19104p;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d */
public final class C15087d extends C21481a implements C17457b, C17458c {

    /* renamed from: n */
    public static final C15088a f43349n = new C15088a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C17133a f43350d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19104p f43351e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20217b f43352f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C40757w f43353g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C16521c f43354h;

    /* renamed from: i */
    private final C17457b f43355i = this;

    /* renamed from: j */
    private final C17458c f43356j = this;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f43357k = new C1644x();

    /* renamed from: l */
    private final C1644x f43358l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f43359m = new C1644x();

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d$a */
    public static final class C15088a {
        private C15088a() {
        }

        public /* synthetic */ C15088a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d$b */
    public interface C15089b {
        /* renamed from: a */
        C15087d mo32569a(C16521c cVar);
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d$c */
    static final class C15090c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15087d f43360d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d$c$a */
        static final class C15091a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C15087d f43361d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15091a(C15087d dVar) {
                super(1);
                this.f43361d = dVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "list");
                C17133a iw = this.f43361d.f43350d;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(iw.mo44555a((C10126g) it.next()));
                }
                return arrayList;
            }
        }

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d$c$b */
        static final class C15092b extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C15092b f43362d = new C15092b();

            C15092b() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(List list, List list2) {
                C41536l.m120489i(list, "lookups");
                C41536l.m120489i(list2, "offers");
                return C41233s.m119492a(list, list2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15090c(C15087d dVar) {
            super(1);
            this.f43360d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C41224m m55247d(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x K = C40762x.m118154T(this.f43360d.f43352f.mo48650b("LIFE_STYLE_CAMPAIGN_TYPES"), this.f43360d.f43351e.mo47305a().mo95062A(new C15096e(new C15091a(this.f43360d))), new C15097f(C15092b.f43362d)).mo95072K(this.f43360d.f43353g);
            C41536l.m120488h(K, "private fun subscribe() …ndToLifecycle()\n        }");
            return C31270e.m92880i(C32343x.m95415S0(K), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d$d */
    static final class C15093d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15087d f43363d;

        /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d$d$a */
        static final class C15094a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C15087d f43364d;

            /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.d$d$a$a */
            public static final class C15095a implements Comparator {

                /* renamed from: d */
                final /* synthetic */ List f43365d;

                public C15095a(List list) {
                    this.f43365d = list;
                }

                public final int compare(Object obj, Object obj2) {
                    Object obj3;
                    Object obj4;
                    List list = (List) obj;
                    List list2 = this.f43365d;
                    Iterator it = list2.iterator();
                    while (true) {
                        obj3 = null;
                        if (!it.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it.next();
                        if (C41536l.m120484d((String) obj4, ((OffersProgressListItemUiModel) C41358y.m120007W(list)).mo41843b())) {
                            break;
                        }
                    }
                    Integer valueOf = Integer.valueOf(C41358y.m120012b0(list2, obj4));
                    List list3 = (List) obj2;
                    List list4 = this.f43365d;
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (C41536l.m120484d((String) next, ((OffersProgressListItemUiModel) C41358y.m120007W(list3)).mo41843b())) {
                            obj3 = next;
                            break;
                        }
                    }
                    return C41506d.m120406e(valueOf, Integer.valueOf(C41358y.m120012b0(list4, obj3)));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15094a(C15087d dVar) {
                super(1);
                this.f43364d = dVar;
            }

            /* renamed from: a */
            public final void mo42054a(C41224m mVar) {
                String str;
                List<C20463a> list = (List) mVar.mo95675a();
                List list2 = (List) mVar.mo95676b();
                C41536l.m120488h(list, "lookupResult");
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                for (C20463a c : list) {
                    arrayList.add(c.mo49003c());
                }
                C41536l.m120488h(list2, "offers");
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list2) {
                    if (arrayList.contains(((OffersProgressListItemUiModel) next).mo41843b())) {
                        arrayList2.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next2 : arrayList2) {
                    String b = ((OffersProgressListItemUiModel) next2).mo41843b();
                    Object obj = linkedHashMap.get(b);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(b, obj);
                    }
                    ((List) obj).add(next2);
                }
                List t0 = C41358y.m120030t0(linkedHashMap.values(), new C15095a(arrayList));
                C1644x kw = this.f43364d.f43359m;
                C15087d dVar = this.f43364d;
                Iterator it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    String str2 = (String) it.next();
                    C16521c fw = dVar.f43354h;
                    if (fw != null) {
                        str = fw.name();
                    } else {
                        str = null;
                    }
                    if (C41536l.m120484d(str2, str)) {
                        break;
                    }
                    i++;
                }
                kw.mo4826r(new C17469n(new C17456a(arrayList, Integer.valueOf(i)), t0));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42054a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15093d(C15087d dVar) {
            super(1);
            this.f43363d = dVar;
        }

        /* renamed from: a */
        public final void mo42053a(C31128a aVar) {
            this.f43363d.f43357k.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C15094a(this.f43363d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42053a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15087d(C17133a aVar, C19104p pVar, C20217b bVar, C40757w wVar, C16521c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "offersMapper");
        C41536l.m120489i(pVar, "getLifestyleOfferProgress");
        C41536l.m120489i(bVar, "getLookup");
        C41536l.m120489i(wVar, "scheduler");
        this.f43350d = aVar;
        this.f43351e = pVar;
        this.f43352f = bVar;
        this.f43353g = wVar;
        this.f43354h = cVar;
        m55237nw();
    }

    /* renamed from: nw */
    private final void m55237nw() {
        C41205b F0 = C40749p.m118047l0(onRefresh(), onInit()).mo94989L0(new C17459d(new C15090c(this))).mo94981F0(new C17460e(new C15093d(this)));
        C41536l.m120488h(F0, "private fun subscribe() …ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final C40754t m55238ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m55239pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: mw */
    public final C17458c mo42046mw() {
        return this.f43356j;
    }

    /* renamed from: t2 */
    public LiveData mo42047t2() {
        return this.f43357k;
    }

    /* renamed from: th */
    public LiveData mo42048th() {
        return this.f43358l;
    }

    /* renamed from: x */
    public LiveData mo42049x() {
        return this.f43359m;
    }
}
