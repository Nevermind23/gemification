package p341ge.bog.mobilebank.giftcards.presentation.filtered;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import ii0.C25217c;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24250b;
import ti0.C28441c;
import ti0.C28442d;
import ue1.C43075l;
import ui0.C28799b;
import wh0.C29403j;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.f */
public final class C24263f extends C21481a {

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f62737l = {C41520a0.m120439e(new C41539o(C24263f.class, "filterData", "getFilterData()Lge/bog/mobilebank/giftcards/presentation/filtered/model/GiftCardsFilterData;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final GiftCardsFlow.FilteredOffers f62738d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C24253c f62739e;

    /* renamed from: f */
    private final C25217c f62740f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f62741g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f62742h = new C1644x();

    /* renamed from: i */
    private final C1644x f62743i = new C1644x();

    /* renamed from: j */
    private final C41555e f62744j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List f62745k;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.f$a */
    static final class C24264a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29403j f62746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24264a(C29403j jVar) {
            super(1);
            this.f62746d = jVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C29403j.m89491b(this.f62746d, false, 1, (Object) null).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.f$b */
    static final class C24265b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24263f f62747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24265b(C24263f fVar) {
            super(1);
            this.f62747d = fVar;
        }

        /* renamed from: a */
        public final void mo61939a(List list) {
            C24263f fVar = this.f62747d;
            C41536l.m120488h(list, "categories");
            fVar.f62745k = list;
            C24263f fVar2 = this.f62747d;
            fVar2.m78102ww(C28799b.m88266b(fVar2.m78101pw(), list, this.f62747d.f62738d.mo61610b(), !this.f62747d.f62738d.mo61611d(), (Long) null, (String) null, false, 56, (Object) null));
            this.f62747d.f62741g.mo4823o(this.f62747d.f62739e.mo61909d(list, this.f62747d.f62738d.mo61611d(), (Long) C41358y.m120008X(this.f62747d.f62738d.mo61610b())));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61939a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.f$c */
    public interface C24266c {
        /* renamed from: a */
        C24263f mo32831a(GiftCardsFlow.FilteredOffers filteredOffers);
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.f$d */
    public static final class C24267d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C24263f f62748a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24267d(Object obj, C24263f fVar) {
            super(obj);
            this.f62748a = fVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C28799b bVar = (C28799b) obj;
            this.f62748a.f62742h.mo4823o(this.f62748a.f62739e.mo61908a((C28799b) obj2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24263f(GiftCardsFlow.FilteredOffers filteredOffers, C29403j jVar, C24253c cVar, C25217c cVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(filteredOffers, "data");
        C41536l.m120489i(jVar, "getGiftCards");
        C41536l.m120489i(cVar, "mapper");
        C41536l.m120489i(cVar2, "defineLanguage");
        this.f62738d = filteredOffers;
        this.f62739e = cVar;
        this.f62740f = cVar2;
        C41551a aVar = C41551a.f97718a;
        this.f62744j = new C24267d(new C28799b((List) null, (Set) null, false, (Long) null, (String) null, false, 63, (DefaultConstructorMarker) null), this);
        this.f62745k = C41341q.m119907j();
        C40749p L0 = onInit().mo94989L0(new C28441c(new C24264a(jVar)));
        C41536l.m120488h(L0, "onInit().switchMap {\n   …bservable()\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C28442d(new C24265b(this)));
        C41536l.m120488h(F0, "onInit().switchMap {\n   …          )\n            }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m78092fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m78093gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public final C28799b m78101pw() {
        return (C28799b) this.f62744j.getValue(this, f62737l[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public final void m78102ww(C28799b bVar) {
        this.f62744j.setValue(this, f62737l[0], bVar);
    }

    /* renamed from: G */
    public void mo61930G() {
        C37224b.m109965d(this.f62743i, new C24250b.C24251a(m78101pw().mo68528d()));
    }

    /* renamed from: ow */
    public void mo61931ow(Set set) {
        C41536l.m120489i(set, "categoriesFilter");
        m78102ww(C28799b.m88266b(m78101pw(), (List) null, set, false, (Long) null, "", true, 5, (Object) null));
    }

    /* renamed from: qw */
    public LiveData mo61932qw() {
        return this.f62742h;
    }

    /* renamed from: rw */
    public LiveData mo61933rw() {
        return this.f62741g;
    }

    /* renamed from: sw */
    public LiveData mo61934sw() {
        return this.f62743i;
    }

    /* renamed from: tw */
    public void mo61935tw(long j) {
        m78102ww(C28799b.m88266b(m78101pw(), (List) null, (Set) null, false, Long.valueOf(j), (String) null, false, 23, (Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: xh0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: xh0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: xh0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: xh0.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: uw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61936uw(long r18, long r20) {
        /*
            r17 = this;
            r0 = r17
            java.util.List r1 = r0.f62745k
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.next()
            r6 = r2
            xh0.h r6 = (xh0.C29791h) r6
            long r6 = r6.mo69987e()
            int r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r6 != 0) goto L_0x0022
            r6 = r3
            goto L_0x0023
        L_0x0022:
            r6 = r4
        L_0x0023:
            if (r6 == 0) goto L_0x0008
            goto L_0x0027
        L_0x0026:
            r2 = r5
        L_0x0027:
            xh0.h r2 = (xh0.C29791h) r2
            if (r2 != 0) goto L_0x002c
            return
        L_0x002c:
            java.util.List r1 = r2.mo69990g()
            java.util.Iterator r1 = r1.iterator()
        L_0x0034:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r1.next()
            r6 = r2
            xh0.i r6 = (xh0.C29792i) r6
            long r6 = r6.mo69995c()
            int r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r6 != 0) goto L_0x004b
            r6 = r3
            goto L_0x004c
        L_0x004b:
            r6 = r4
        L_0x004c:
            if (r6 == 0) goto L_0x0034
            r5 = r2
        L_0x004f:
            xh0.i r5 = (xh0.C29792i) r5
            if (r5 != 0) goto L_0x0054
            return
        L_0x0054:
            ii0.c r1 = r0.f62740f
            boolean r1 = r1.mo63742a()
            ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel r2 = new ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r5.mo69995c()
            if (r1 == 0) goto L_0x006a
            java.lang.String r3 = r5.mo69999f()
            goto L_0x006e
        L_0x006a:
            java.lang.String r3 = r5.mo69997e()
        L_0x006e:
            r12 = r3
            java.lang.String r13 = r5.mo69996d()
            if (r1 == 0) goto L_0x007a
            java.util.List r1 = r5.mo69994b()
            goto L_0x007e
        L_0x007a:
            java.util.List r1 = r5.mo69993a()
        L_0x007e:
            r14 = r1
            r15 = 7
            r16 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r12, r13, r14, r15, r16)
            androidx.lifecycle.x r1 = r0.f62743i
            ge.bog.mobilebank.giftcards.presentation.filtered.b$b r3 = new ge.bog.mobilebank.giftcards.presentation.filtered.b$b
            r3.<init>(r2)
            m41.C37224b.m109965d(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.filtered.C24263f.mo61936uw(long, long):void");
    }

    /* renamed from: vw */
    public void mo61937vw(String str) {
        C41536l.m120489i(str, "query");
        m78102ww(C28799b.m88266b(m78101pw(), (List) null, (Set) null, false, (Long) null, str, false, 15, (Object) null));
    }
}
