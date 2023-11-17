package p341ge.bog.mobilebank.p2p.presentation.topup;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import aw0.C31089d;
import aw0.C31091f;
import b41.C31128a;
import b41.C31132b;
import bw0.C31208a;
import bw0.C31209b;
import bw0.C31213f;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import iw0.C36560a;
import java.util.List;
import jw0.C36806c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kw0.C37008f;
import kw0.C37009g;
import kw0.C37010h;
import kw0.C37011i;
import kw0.C37012j;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.p2p.presentation.topup.C33562c;
import p380ck.C10463g;
import p380ck.C10464h;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.p2p.presentation.topup.e */
public final class C33568e extends C21481a implements C33566d, C37008f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C31091f f81850d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C36560a f81851e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C31089d f81852f;

    /* renamed from: g */
    private final C10463g f81853g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f81854h;

    /* renamed from: i */
    private final C33566d f81855i = this;

    /* renamed from: j */
    private final C37008f f81856j = this;

    /* renamed from: k */
    private final C1644x f81857k = new C1644x();

    /* renamed from: l */
    private final C1644x f81858l = new C1644x(new C33562c.C33565c((Double) null));

    /* renamed from: m */
    private final C1644x f81859m = new C1644x();

    /* renamed from: n */
    private final C1644x f81860n = new C1644x();

    /* renamed from: o */
    private final C1644x f81861o = new C1644x();

    /* renamed from: p */
    private final C1644x f81862p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f81863q;

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.e$a */
    static final class C33569a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33568e f81864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33569a(C33568e eVar) {
            super(1);
            this.f81864d = eVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f81864d.f81850d.mo71292a(C31213f.TOP_UP), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.e$b */
    static final class C33570b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33568e f81865d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.e$b$a */
        static final class C33571a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33568e f81866d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33571a(C33568e eVar) {
                super(1);
                this.f81866d = eVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo79577a(java.util.List r9) {
                /*
                    r8 = this;
                    java.lang.String r0 = "cards"
                    kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                    boolean r0 = r9.isEmpty()
                    r1 = 1
                    r0 = r0 ^ r1
                    if (r0 == 0) goto L_0x00b6
                    ge.bog.mobilebank.p2p.presentation.topup.e r0 = r8.f81866d
                    java.lang.String r0 = r0.f81854h
                    r2 = 0
                    if (r0 == 0) goto L_0x0023
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x001e
                    r0 = r1
                    goto L_0x001f
                L_0x001e:
                    r0 = r2
                L_0x001f:
                    if (r0 != r1) goto L_0x0023
                    r0 = r1
                    goto L_0x0024
                L_0x0023:
                    r0 = r2
                L_0x0024:
                    r3 = 0
                    if (r0 == 0) goto L_0x0070
                    ge.bog.mobilebank.p2p.presentation.topup.e r0 = r8.f81866d
                    java.util.Iterator r4 = r9.iterator()
                L_0x002d:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L_0x005c
                    java.lang.Object r5 = r4.next()
                    r6 = r5
                    bw0.b r6 = (bw0.C31209b) r6
                    java.lang.String r7 = r6.mo71433b()
                    java.lang.String r6 = r6.mo71433b()
                    int r6 = r6.length()
                    int r6 = r6 + -3
                    java.lang.String r6 = r7.substring(r2, r6)
                    java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
                    kotlin.jvm.internal.C41536l.m120488h(r6, r7)
                    java.lang.String r7 = r0.f81854h
                    boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
                    if (r6 == 0) goto L_0x002d
                    goto L_0x005d
                L_0x005c:
                    r5 = r3
                L_0x005d:
                    bw0.b r5 = (bw0.C31209b) r5
                    if (r5 == 0) goto L_0x009b
                    ge.bog.mobilebank.p2p.presentation.topup.e r0 = r8.f81866d
                    iw0.a r0 = r0.f81851e
                    int r3 = r9.indexOf(r5)
                    jw0.c r3 = r0.mo89391a(r5, r3, r1)
                    goto L_0x009b
                L_0x0070:
                    java.util.Iterator r0 = r9.iterator()
                L_0x0074:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L_0x0088
                    java.lang.Object r4 = r0.next()
                    r5 = r4
                    bw0.b r5 = (bw0.C31209b) r5
                    boolean r5 = r5.mo71445l()
                    if (r5 == 0) goto L_0x0074
                    goto L_0x0089
                L_0x0088:
                    r4 = r3
                L_0x0089:
                    bw0.b r4 = (bw0.C31209b) r4
                    if (r4 == 0) goto L_0x009b
                    ge.bog.mobilebank.p2p.presentation.topup.e r0 = r8.f81866d
                    iw0.a r0 = r0.f81851e
                    int r3 = r9.indexOf(r4)
                    jw0.c r3 = r0.mo89391a(r4, r3, r1)
                L_0x009b:
                    ge.bog.mobilebank.p2p.presentation.topup.e r0 = r8.f81866d
                    androidx.lifecycle.x r0 = r0.mo79561c2()
                    if (r3 != 0) goto L_0x00b3
                    ge.bog.mobilebank.p2p.presentation.topup.e r3 = r8.f81866d
                    iw0.a r3 = r3.f81851e
                    java.lang.Object r9 = r9.get(r2)
                    bw0.b r9 = (bw0.C31209b) r9
                    jw0.c r3 = r3.mo89391a(r9, r2, r1)
                L_0x00b3:
                    r0.mo4826r(r3)
                L_0x00b6:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p2p.presentation.topup.C33568e.C33570b.C33571a.mo79577a(java.util.List):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79577a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33570b(C33568e eVar) {
            super(1);
            this.f81865d = eVar;
        }

        /* renamed from: a */
        public final void mo79576a(C31128a aVar) {
            this.f81865d.mo79566s().mo4826r(aVar);
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C33571a(this.f81865d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79576a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.e$c */
    static final class C33572c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33568e f81867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33572c(C33568e eVar) {
            super(1);
            this.f81867d = eVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f81867d.f81852f.mo71290a(C31213f.TOP_UP), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.e$d */
    static final class C33573d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33568e f81868d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.e$d$a */
        static final class C33574a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33568e f81869d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33574a(C33568e eVar) {
                super(1);
                this.f81869d = eVar;
            }

            /* renamed from: a */
            public final void mo79580a(C31208a aVar) {
                C41536l.m120489i(aVar, "it");
                this.f81869d.f81863q = aVar.mo71428a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79580a((C31208a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33573d(C33568e eVar) {
            super(1);
            this.f81868d = eVar;
        }

        /* renamed from: a */
        public final void mo79579a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C33574a(this.f81868d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79579a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.e$e */
    public interface C33575e {
        /* renamed from: a */
        C33568e mo32842a(String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33568e(C31091f fVar, C36560a aVar, C31089d dVar, C10463g gVar, String str) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "getCardsUseCase");
        C41536l.m120489i(aVar, "cardPickerUiStateMapper");
        C41536l.m120489i(dVar, "getAmountLimitUseCase");
        C41536l.m120489i(gVar, "analytics");
        this.f81850d = fVar;
        this.f81851e = aVar;
        this.f81852f = dVar;
        this.f81853g = gVar;
        this.f81854h = str;
        gVar.mo27137H("P2P_Top_up", "first_page_view", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C37009g(new C33569a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C37010h(new C33570b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…     }\n\n                }");
        bindToLifecycle(F0);
        C41205b F02 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C37011i(new C33572c(this))).mo94981F0(new C37012j(new C33573d(this)));
        C41536l.m120488h(F02, "merge(onInit(), onRefres…          }\n            }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m98517hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m98518iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C40754t m98519jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m98520kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: B0 */
    public void mo79558B0(String str) {
        C41536l.m120489i(str, "error");
        this.f81853g.mo27137H("P2P_Top_up", "click_choose_card", "", (Bundle) null, (C10464h.C10465a) null);
        C36806c cVar = (C36806c) mo79561c2().mo4814f();
        if (cVar != null) {
            mo79563m1().mo4826r(new C37223a(new C41224m(Integer.valueOf(cVar.mo89709e()), str)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0.isEmpty() == true) goto L_0x001e;
     */
    /* renamed from: Du */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79559Du() {
        /*
            r8 = this;
            androidx.lifecycle.x r0 = r8.mo79566s()
            java.lang.Object r0 = r0.mo4814f()
            b41.a r0 = (b41.C31128a) r0
            r1 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = b41.C31132b.m92640b(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 != r2) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            if (r2 == 0) goto L_0x0030
            androidx.lifecycle.x r0 = r8.mo79562d2()
            java.lang.String r2 = "text.p2p.payment.emptyCard.error"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r1 = g91.C32343x.m95388F(r2, r1)
            r0.mo4826r(r1)
            return
        L_0x0030:
            androidx.lifecycle.x r0 = r8.mo79574zr()
            java.lang.Object r0 = r0.mo4814f()
            boolean r0 = r0 instanceof p341ge.bog.mobilebank.p2p.presentation.topup.C33562c.C33564b
            if (r0 != 0) goto L_0x0123
            androidx.lifecycle.x r0 = r8.mo79574zr()
            java.lang.Object r0 = r0.mo4814f()
            boolean r0 = r0 instanceof p341ge.bog.mobilebank.p2p.presentation.topup.C33562c.C33563a
            if (r0 == 0) goto L_0x004a
            goto L_0x0123
        L_0x004a:
            androidx.lifecycle.x r0 = r8.mo79574zr()
            java.lang.Object r0 = r0.mo4814f()
            java.lang.String r1 = "null cannot be cast to non-null type ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpViewModel.AmountLimitValidation.Success"
            kotlin.jvm.internal.C41536l.m120487g(r0, r1)
            ge.bog.mobilebank.p2p.presentation.topup.c$c r0 = (p341ge.bog.mobilebank.p2p.presentation.topup.C33562c.C33565c) r0
            java.lang.Double r0 = r0.mo79557a()
            if (r0 == 0) goto L_0x011a
            androidx.lifecycle.x r0 = r8.mo79574zr()
            java.lang.Object r0 = r0.mo4814f()
            kotlin.jvm.internal.C41536l.m120487g(r0, r1)
            ge.bog.mobilebank.p2p.presentation.topup.c$c r0 = (p341ge.bog.mobilebank.p2p.presentation.topup.C33562c.C33565c) r0
            java.lang.Double r0 = r0.mo79557a()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            double r2 = r0.doubleValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            goto L_0x011a
        L_0x007f:
            ck.g r2 = r8.f81853g
            java.lang.String r3 = "P2P_Top_up"
            java.lang.String r4 = "transfer_webview_click"
            androidx.lifecycle.x r0 = r8.mo79574zr()
            java.lang.Object r0 = r0.mo4814f()
            kotlin.jvm.internal.C41536l.m120487g(r0, r1)
            ge.bog.mobilebank.p2p.presentation.topup.c$c r0 = (p341ge.bog.mobilebank.p2p.presentation.topup.C33562c.C33565c) r0
            java.lang.Double r0 = r0.mo79557a()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            r6 = 0
            r7 = 0
            r2.mo27137H(r3, r4, r5, r6, r7)
            androidx.lifecycle.x r0 = r8.mo79573z5()
            ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpViewModel$TopUpState r2 = new ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpViewModel$TopUpState
            androidx.lifecycle.x r3 = r8.mo79561c2()
            java.lang.Object r3 = r3.mo4814f()
            jw0.c r3 = (jw0.C36806c) r3
            r4 = 0
            if (r3 == 0) goto L_0x00c7
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$b r3 = r3.mo89708d()
            if (r3 == 0) goto L_0x00c7
            java.lang.String r3 = r3.mo35473a()
            if (r3 == 0) goto L_0x00c7
            long r5 = java.lang.Long.parseLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            goto L_0x00c8
        L_0x00c7:
            r3 = r4
        L_0x00c8:
            androidx.lifecycle.x r5 = r8.mo79561c2()
            java.lang.Object r5 = r5.mo4814f()
            jw0.c r5 = (jw0.C36806c) r5
            if (r5 == 0) goto L_0x00dd
            long r5 = r5.mo89705a()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x00de
        L_0x00dd:
            r5 = r4
        L_0x00de:
            androidx.lifecycle.x r6 = r8.mo79574zr()
            java.lang.Object r6 = r6.mo4814f()
            kotlin.jvm.internal.C41536l.m120487g(r6, r1)
            ge.bog.mobilebank.p2p.presentation.topup.c$c r6 = (p341ge.bog.mobilebank.p2p.presentation.topup.C33562c.C33565c) r6
            java.lang.Double r1 = r6.mo79557a()
            androidx.lifecycle.x r6 = r8.mo79561c2()
            java.lang.Object r6 = r6.mo4814f()
            jw0.c r6 = (jw0.C36806c) r6
            if (r6 == 0) goto L_0x0101
            java.lang.String r6 = r6.mo89707c()
            if (r6 != 0) goto L_0x0103
        L_0x0101:
            java.lang.String r6 = "GEL"
        L_0x0103:
            r2.<init>(r3, r5, r1, r6)
            m41.a r1 = g91.C32343x.m95466m(r2)
            r0.mo4823o(r1)
            androidx.lifecycle.x r0 = r8.mo79574zr()
            ge.bog.mobilebank.p2p.presentation.topup.c$c r1 = new ge.bog.mobilebank.p2p.presentation.topup.c$c
            r1.<init>(r4)
            r0.mo4823o(r1)
            return
        L_0x011a:
            androidx.lifecycle.x r0 = r8.mo79574zr()
            ge.bog.mobilebank.p2p.presentation.topup.c$a r1 = p341ge.bog.mobilebank.p2p.presentation.topup.C33562c.C33563a.f81847a
            r0.mo4823o(r1)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p2p.presentation.topup.C33568e.mo79559Du():void");
    }

    /* renamed from: Z2 */
    public void mo79560Z2(int i) {
        List list;
        C31128a aVar = (C31128a) mo79566s().mo4814f();
        if (aVar != null && (list = (List) aVar.mo71340a()) != null) {
            C36806c cVar = (C36806c) mo79561c2().mo4814f();
            boolean z = false;
            if (cVar != null && cVar.mo89709e() == i) {
                z = true;
            }
            if (!z) {
                this.f81853g.mo27137H("P2P_Top_up", "choose_specific_card", "", (Bundle) null, (C10464h.C10465a) null);
            }
            mo79561c2().mo4826r(this.f81851e.mo89391a((C31209b) list.get(i), i, true));
        }
    }

    /* renamed from: qw */
    public C1644x mo79574zr() {
        return this.f81858l;
    }

    /* renamed from: rw */
    public C1644x mo79561c2() {
        return this.f81860n;
    }

    /* renamed from: sw */
    public C1644x mo79566s() {
        return this.f81857k;
    }

    /* renamed from: tw */
    public C1644x mo79562d2() {
        return this.f81862p;
    }

    /* renamed from: uw */
    public C1644x mo79563m1() {
        return this.f81859m;
    }

    /* renamed from: vw */
    public C1644x mo79573z5() {
        return this.f81861o;
    }

    /* renamed from: ww */
    public final C37008f mo79571ww() {
        return this.f81856j;
    }

    /* renamed from: xw */
    public void mo79572xw(String str) {
        C41536l.m120489i(str, "amountText");
        Double h = C40437u.m117096h(str);
        int i = this.f81863q;
        if (i == 0) {
            mo79574zr().mo4823o(new C33562c.C33565c(h));
        } else if (h == null) {
            mo79574zr().mo4823o(new C33562c.C33565c((Double) null));
        } else if (((double) i) >= h.doubleValue()) {
            mo79574zr().mo4823o(new C33562c.C33565c(h));
        } else {
            mo79574zr().mo4823o(new C33562c.C33564b(this.f81863q));
        }
    }
}
