package l71;

import com.github.mikephil.charting.utils.Utils;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import he1.C41224m;
import he1.C41238w;
import i71.C36358a;
import j71.C36748a;
import j71.C36751d;
import j71.C36753f;
import j71.C36754g;
import j71.C36756i;
import j71.C36758j;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.transportcard.domain.model.Card;
import ue1.C43075l;

/* renamed from: l71.k */
public final class C37101k implements C37096f, C37092b, C37094d, C37099i, C37097g, C37091a, C37095e {

    /* renamed from: m */
    public static final C37102a f89272m = new C37102a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C36758j f89273n = new C36758j("", Utils.DOUBLE_EPSILON, "", "", false);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C36748a f89274o = new C36748a(0, 0, "", "", "", "", 0, "", "", new C36751d((Integer) null, "", "", "", "", (String) null, false, (String) null), C41341q.m119907j());
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C36753f f89275p = new C36753f("", "", "", false, new Date());

    /* renamed from: q */
    private static final C36754g f89276q = new C36754g("", "", 0, "", "", 0, 0, false, "", C36756i.P, "");

    /* renamed from: d */
    private final C40765a f89277d;

    /* renamed from: e */
    private final C40765a f89278e;

    /* renamed from: f */
    private final C40765a f89279f;

    /* renamed from: g */
    private final C40765a f89280g;

    /* renamed from: h */
    private final C40765a f89281h;

    /* renamed from: i */
    private final C40765a f89282i;

    /* renamed from: j */
    private final C40765a f89283j;

    /* renamed from: k */
    private final C40765a f89284k;

    /* renamed from: l */
    private final C40749p f89285l;

    /* renamed from: l71.k$a */
    public static final class C37102a {
        private C37102a() {
        }

        public /* synthetic */ C37102a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36748a mo90030a() {
            return C37101k.f89274o;
        }

        /* renamed from: b */
        public final C36753f mo90031b() {
            return C37101k.f89275p;
        }

        /* renamed from: c */
        public final C36758j mo90032c() {
            return C37101k.f89273n;
        }
    }

    /* renamed from: l71.k$b */
    static final class C37103b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37103b f89286d = new C37103b();

        C37103b() {
            super(1);
        }

        /* renamed from: a */
        public final C36358a.C36359a invoke(Object[] objArr) {
            C41536l.m120489i(objArr, "it");
            C41224m mVar = objArr[1];
            C41536l.m120487g(mVar, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            Object e = mVar.mo95678e();
            C41536l.m120487g(e, "null cannot be cast to non-null type kotlin.String");
            C41224m mVar2 = objArr[1];
            C41536l.m120487g(mVar2, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            Object f = mVar2.mo95680f();
            C41536l.m120487g(f, "null cannot be cast to non-null type kotlin.String");
            C41224m mVar3 = objArr[2];
            C41536l.m120487g(mVar3, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            Object e2 = mVar3.mo95678e();
            C41536l.m120487g(e2, "null cannot be cast to non-null type kotlin.String");
            C41224m mVar4 = objArr[2];
            C41536l.m120487g(mVar4, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            Object f2 = mVar4.mo95680f();
            C41536l.m120487g(f2, "null cannot be cast to non-null type kotlin.String");
            return new C36358a.C36359a((String) e, (String) f, (String) e2, (String) f2);
        }
    }

    public C37101k() {
        C40765a i1 = C40765a.m118199i1(f89273n);
        C41536l.m120488h(i1, "createDefault(EMPTY_PASS_TYPE)");
        this.f89277d = i1;
        C40765a i12 = C40765a.m118199i1(f89274o);
        C41536l.m120488h(i12, "createDefault(EMPTY_ACTIVE_CARD)");
        this.f89278e = i12;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Card>()");
        this.f89279f = h1;
        C40765a i13 = C40765a.m118199i1(f89275p);
        C41536l.m120488h(i13, "createDefault(EMPTY_PASS_DEVICE)");
        this.f89280g = i13;
        C40765a i14 = C40765a.m118199i1(f89276q);
        C41536l.m120488h(i14, "createDefault(EMPTY_PURCHASED_PASS)");
        this.f89281h = i14;
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create<Pair<String, String>>()");
        this.f89282i = h12;
        C40765a h13 = C40765a.m118198h1();
        C41536l.m120488h(h13, "create<Pair<String, String>>()");
        this.f89283j = h13;
        C40765a h14 = C40765a.m118198h1();
        C41536l.m120488h(h14, "create<Long>()");
        this.f89284k = h14;
        C40749p Z0 = C40749p.m118043h0(C41238w.f97225a).mo95015Z0((C40754t[]) new C40749p[]{mo90029f(), mo90028e()}, new C37100j(C37103b.f89286d));
        C41536l.m120488h(Z0, "just(Unit).withLatestFro…e\n            )\n        }");
        this.f89285l = Z0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C36358a.C36359a m109666g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C36358a.C36359a) lVar.invoke(obj);
    }

    /* renamed from: Aj */
    public C40749p mo85893Aj() {
        return mo85991yb();
    }

    /* renamed from: At */
    public void mo85823At(Card card) {
        C41536l.m120489i(card, "card");
        this.f89279f.onNext(card);
    }

    /* renamed from: Bn */
    public void mo85824Bn(C36753f fVar) {
        C41536l.m120489i(fVar, "passDevice");
        this.f89280g.onNext(fVar);
    }

    /* renamed from: Et */
    public C40749p mo85894Et() {
        C40749p c0 = this.f89278e.mo95017c0();
        C41536l.m120488h(c0, "_activeCard.hide()");
        return c0;
    }

    /* renamed from: Js */
    public void mo86021Js(String str, String str2) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "deviceType");
        this.f89283j.onNext(new C41224m(str, str2));
    }

    /* renamed from: Lr */
    public void mo85902Lr(C36754g gVar) {
        C41536l.m120489i(gVar, "purchasedPass");
        this.f89281h.onNext(gVar);
    }

    /* renamed from: Nh */
    public void mo85983Nh(C36758j jVar) {
        C41536l.m120489i(jVar, "passType");
        this.f89277d.onNext(jVar);
    }

    /* renamed from: Rn */
    public C40749p mo85910Rn() {
        C40749p c0 = this.f89280g.mo95017c0();
        C41536l.m120488h(c0, "_passDevice.hide()");
        return c0;
    }

    /* renamed from: Tr */
    public C40749p mo85847Tr() {
        return this.f89285l;
    }

    /* renamed from: Zg */
    public C40749p mo85958Zg() {
        return this.f89280g;
    }

    /* renamed from: ae */
    public C40749p mo85914ae() {
        C40749p c0 = this.f89279f.mo95017c0();
        C41536l.m120488h(c0, "_paymentCard.hide()");
        return c0;
    }

    /* renamed from: e */
    public C40749p mo90028e() {
        return this.f89282i;
    }

    /* renamed from: f */
    public C40749p mo90029f() {
        C40749p c0 = this.f89283j.mo95017c0();
        C41536l.m120488h(c0, "_substituteOldDevice.hide()");
        return c0;
    }

    /* renamed from: g6 */
    public C40749p mo85853g6() {
        C40749p c0 = this.f89284k.mo95017c0();
        C41536l.m120488h(c0, "_cardId.hide()");
        return c0;
    }

    /* renamed from: j8 */
    public void mo85855j8(String str, String str2) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "deviceType");
        this.f89282i.onNext(new C41224m(str, str2));
    }

    /* renamed from: rc */
    public void mo86032rc(long j) {
        this.f89284k.onNext(Long.valueOf(j));
    }

    /* renamed from: t4 */
    public void mo86035t4() {
        this.f89277d.onNext(f89273n);
        this.f89278e.onNext(f89274o);
        this.f89280g.onNext(f89275p);
    }

    /* renamed from: ut */
    public C40749p mo86055ut() {
        C40749p c0 = this.f89281h.mo95017c0();
        C41536l.m120488h(c0, "_purchasedPass.hide()");
        return c0;
    }

    /* renamed from: vd */
    public void mo85830vd(C36748a aVar) {
        C41536l.m120489i(aVar, "card");
        this.f89278e.onNext(aVar);
    }

    /* renamed from: y3 */
    public C40749p mo85963y3() {
        return this.f89278e;
    }

    /* renamed from: yb */
    public C40749p mo85991yb() {
        C40749p c0 = this.f89277d.mo95017c0();
        C41536l.m120488h(c0, "_passType.hide()");
        return c0;
    }
}
