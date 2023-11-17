package p341ge.bog.mobilebank.transportcard.presentation.choosecard;

import androidx.lifecycle.C1644x;
import ed1.C40749p;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import i71.C36360b;
import i71.C36362d;
import iu0.C36546y;
import j71.C36748a;
import j71.C36753f;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l71.C37092b;
import l71.C37101k;
import m71.C37233a;
import m71.C37235c;
import m71.C37236d;
import m71.C37237e;
import m71.C37238f;
import m71.C37239g;
import m71.C37240h;
import m71.C37241i;
import m71.C37242j;
import m71.C37243k;
import m71.C37244l;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.transportcard.domain.model.Card;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b */
public final class C34994b extends C21481a implements C37235c, C37236d, C37092b {

    /* renamed from: d */
    private final boolean f84465d;

    /* renamed from: e */
    private final /* synthetic */ C37092b f84466e;

    /* renamed from: f */
    private final C37235c f84467f = this;

    /* renamed from: g */
    private final C37236d f84468g = this;

    /* renamed from: h */
    private final C1644x f84469h = new C1644x();

    /* renamed from: i */
    private final C40767b f84470i;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$a */
    /* synthetic */ class C34995a extends C41535k implements C43075l {
        C34995a(Object obj) {
            super(1, obj, C37233a.class, "convertCard", "convertCard(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C37233a) this.receiver).mo90312b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$b */
    static final class C34996b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34994b f84471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34996b(C34994b bVar) {
            super(1);
            this.f84471d = bVar;
        }

        /* renamed from: a */
        public final void mo85832a(List list) {
            this.f84471d.mo85826s().mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85832a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$c */
    static final class C34997c extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C34997c f84472d = new C34997c();

        C34997c() {
            super(2);
        }

        /* renamed from: a */
        public final Card invoke(Integer num, List list) {
            C41536l.m120489i(num, "position");
            C41536l.m120489i(list, "list");
            return (Card) list.get(num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$d */
    static final class C34998d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34994b f84473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34998d(C34994b bVar) {
            super(1);
            this.f84473d = bVar;
        }

        /* renamed from: a */
        public final void mo85834a(Card card) {
            C34994b bVar = this.f84473d;
            C41536l.m120488h(card, "it");
            bVar.mo85823At(card);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85834a((Card) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$e */
    /* synthetic */ class C34999e extends C41535k implements C43075l {
        C34999e(Object obj) {
            super(1, obj, C37233a.class, "convertActiveCard", "convertActiveCard(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C37233a) this.receiver).mo90311a(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$f */
    static final class C35000f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34994b f84474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35000f(C34994b bVar) {
            super(1);
            this.f84474d = bVar;
        }

        /* renamed from: a */
        public final void mo85836a(List list) {
            this.f84474d.mo85826s().mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85836a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$g */
    static final class C35001g extends C41537m implements C43080q {

        /* renamed from: d */
        public static final C35001g f84475d = new C35001g();

        C35001g() {
            super(3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.transportcard.domain.model.Card} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ge.bog.mobilebank.transportcard.domain.model.Card} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: ge.bog.mobilebank.transportcard.domain.model.Card} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.mobilebank.transportcard.domain.model.Card} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: ge.bog.mobilebank.transportcard.domain.model.Card} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final he1.C41224m invoke(java.lang.Integer r10, java.util.List r11, java.util.List r12) {
            /*
                r9 = this;
                java.lang.String r0 = "position"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                java.lang.String r0 = "list"
                kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                java.lang.String r0 = "paymentCards"
                kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                int r0 = r10.intValue()
                java.lang.Object r0 = r11.get(r0)
                boolean r1 = r12 instanceof java.util.Collection
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0025
                boolean r1 = r12.isEmpty()
                if (r1 == 0) goto L_0x0025
            L_0x0023:
                r1 = r3
                goto L_0x003c
            L_0x0025:
                java.util.Iterator r1 = r12.iterator()
            L_0x0029:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0023
                java.lang.Object r4 = r1.next()
                ge.bog.mobilebank.transportcard.domain.model.Card r4 = (p341ge.bog.mobilebank.transportcard.domain.model.Card) r4
                boolean r4 = r4.isDefault()
                if (r4 == 0) goto L_0x0029
                r1 = r2
            L_0x003c:
                r4 = 0
                if (r1 == 0) goto L_0x006e
                java.util.Iterator r12 = r12.iterator()
            L_0x0043:
                boolean r1 = r12.hasNext()
                if (r1 == 0) goto L_0x006c
                java.lang.Object r1 = r12.next()
                r5 = r1
                ge.bog.mobilebank.transportcard.domain.model.Card r5 = (p341ge.bog.mobilebank.transportcard.domain.model.Card) r5
                long r5 = r5.getCardId()
                int r7 = r10.intValue()
                java.lang.Object r7 = r11.get(r7)
                j71.a r7 = (j71.C36748a) r7
                long r7 = r7.mo89574c()
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 != 0) goto L_0x0068
                r5 = r3
                goto L_0x0069
            L_0x0068:
                r5 = r2
            L_0x0069:
                if (r5 == 0) goto L_0x0043
                r4 = r1
            L_0x006c:
                ge.bog.mobilebank.transportcard.domain.model.Card r4 = (p341ge.bog.mobilebank.transportcard.domain.model.Card) r4
            L_0x006e:
                he1.m r10 = new he1.m
                r10.<init>(r0, r4)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transportcard.presentation.choosecard.C34994b.C35001g.invoke(java.lang.Integer, java.util.List, java.util.List):he1.m");
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$h */
    static final class C35002h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34994b f84476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35002h(C34994b bVar) {
            super(1);
            this.f84476d = bVar;
        }

        /* renamed from: a */
        public final void mo85838a(C41224m mVar) {
            C36753f fVar;
            C36748a aVar = (C36748a) mVar.mo95675a();
            Card card = (Card) mVar.mo95676b();
            this.f84476d.mo85830vd(aVar);
            C34994b bVar = this.f84476d;
            if (aVar.mo89582i().size() == 1) {
                fVar = (C36753f) aVar.mo89582i().get(0);
            } else {
                fVar = C37101k.f89272m.mo90031b();
            }
            bVar.mo85824Bn(fVar);
            if (card != null) {
                this.f84476d.mo85823At(card);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85838a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.choosecard.b$i */
    public interface C35003i {
        /* renamed from: a */
        C34994b mo32840a(boolean z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34994b(C36362d dVar, C36360b bVar, C37233a aVar, C37092b bVar2, boolean z) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(dVar, "getPaymentCardsUseCase");
        C41536l.m120489i(bVar, "getActiveCardsUseCase");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(bVar2, "delegate");
        this.f84465d = z;
        this.f84466e = bVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f84470i = h1;
        if (z) {
            C40749p m1 = C26186e.m81987e(C36362d.m107893b(dVar, false, 1, (Object) null)).mo95040w0().mo102096m1(2);
            C40749p k0 = m1.mo95026k0(new C37237e(new C34995a(aVar)));
            C41536l.m120488h(k0, "cards.map(mapper::convertCard)");
            C41205b F0 = C32343x.m95413R0(k0).mo94981F0(new C37238f(new C34996b(this)));
            C41536l.m120488h(F0, "cards.map(mapper::conver…ue = it\n                }");
            bindToLifecycle(F0);
            C40749p Y0 = h1.mo95014Y0(m1, new C37239g(C34997c.f84472d));
            C41536l.m120488h(Y0, "onSelectedCard.withLates…sition]\n                }");
            C41205b F02 = C32343x.m95413R0(Y0).mo94981F0(new C37240h(new C34998d(this)));
            C41536l.m120488h(F02, "onSelectedCard.withLates…ect(it)\n                }");
            bindToLifecycle(F02);
            return;
        }
        C40749p m12 = C26186e.m81987e(C36360b.m107890b(bVar, false, 1, (Object) null)).mo95040w0().mo102096m1(2);
        C40749p k02 = m12.mo95026k0(new C37241i(new C34999e(aVar)));
        C41536l.m120488h(k02, "cards.map(mapper::convertActiveCard)");
        C41205b F03 = C32343x.m95413R0(k02).mo94981F0(new C37242j(new C35000f(this)));
        C41536l.m120488h(F03, "cards.map(mapper::conver…ue = it\n                }");
        bindToLifecycle(F03);
        C40749p X0 = h1.mo95013X0(m12, C26186e.m81987e(C36362d.m107893b(dVar, false, 1, (Object) null)), new C37243k(C35001g.f84475d));
        C41536l.m120488h(X0, "onSelectedCard.withLates…      )\n                }");
        C41205b F04 = C32343x.m95413R0(X0).mo94981F0(new C37244l(new C35002h(this)));
        C41536l.m120488h(F04, "onSelectedCard.withLates…      }\n                }");
        bindToLifecycle(F04);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final List m102881lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m102882mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final Card m102883nw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (Card) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m102884ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final List m102885pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final C41224m m102886qw(C43080q qVar, Object obj, Object obj2, Object obj3) {
        C41536l.m120489i(qVar, "$tmp0");
        return (C41224m) qVar.invoke(obj, obj2, obj3);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m102887rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: At */
    public void mo85823At(Card card) {
        C41536l.m120489i(card, "card");
        this.f84466e.mo85823At(card);
    }

    /* renamed from: Bn */
    public void mo85824Bn(C36753f fVar) {
        C41536l.m120489i(fVar, "passDevice");
        this.f84466e.mo85824Bn(fVar);
    }

    /* renamed from: Z2 */
    public void mo85825Z2(int i) {
        this.f84470i.onNext(Integer.valueOf(i));
        if (!this.f84465d) {
            C36546y.m108282F().mo27152s("travel_card", "payments_category/more_menu/my_payments", "link_cards_action_sheet_click");
        }
    }

    /* renamed from: sw */
    public C1644x mo85826s() {
        return this.f84469h;
    }

    /* renamed from: tw */
    public final C37235c mo85828tw() {
        return this.f84467f;
    }

    /* renamed from: uw */
    public final C37236d mo85829uw() {
        return this.f84468g;
    }

    /* renamed from: vd */
    public void mo85830vd(C36748a aVar) {
        C41536l.m120489i(aVar, "card");
        this.f84466e.mo85830vd(aVar);
    }
}
