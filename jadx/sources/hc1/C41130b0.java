package hc1;

import android.app.Application;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import ce1.C40398b;
import dd1.C40562n;
import dd1.C40578p1;
import dd1.C40581p3;
import dd1.C40605t2;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40762x;
import gb1.C32383o;
import gd1.C40992a;
import ha1.C15458b;
import hd1.C41205b;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35954n;
import p341ge.bog.sso_client.models.Session;
import p341ge.bog.sso_client.models.UserContact;
import sso.type.AuthElementType;
import sso.type.InputScaAuthElement;
import sso.type.StrongAuthMethod;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: hc1.b0 */
public final class C41130b0 extends C15458b {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C41143c f97041A = C41143c.DEFAULT;

    /* renamed from: B */
    private final C41217g f97042B = C41219i.m119470b(new C41142l(this));

    /* renamed from: h */
    private final C40562n f97043h;

    /* renamed from: i */
    private final C40605t2 f97044i;

    /* renamed from: j */
    private final C40578p1 f97045j;

    /* renamed from: k */
    private final C40581p3 f97046k;

    /* renamed from: l */
    private final Application f97047l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f97048m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f97049n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f97050o = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f97051p = new C1644x();

    /* renamed from: q */
    private final C32383o f97052q = new C32383o();

    /* renamed from: r */
    private final C32383o f97053r = new C32383o();

    /* renamed from: s */
    private final C32383o f97054s = new C32383o();

    /* renamed from: t */
    private final C32383o f97055t = new C32383o();

    /* renamed from: u */
    private boolean f97056u;

    /* renamed from: v */
    private boolean f97057v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public String f97058w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f97059x;

    /* renamed from: y */
    private final Set f97060y = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C41224m f97061z;

    /* renamed from: hc1.b0$a */
    public static final class C41131a {

        /* renamed from: a */
        private final String f97062a;

        /* renamed from: b */
        private final String f97063b;

        /* renamed from: c */
        private final String f97064c;

        public C41131a(String str, String str2, String str3) {
            C41536l.m120489i(str, "operationId");
            C41536l.m120489i(str2, "operationReference");
            C41536l.m120489i(str3, "scaAuthCode");
            this.f97062a = str;
            this.f97063b = str2;
            this.f97064c = str3;
        }

        /* renamed from: a */
        public final String mo95579a() {
            return this.f97062a;
        }

        /* renamed from: b */
        public final String mo95580b() {
            return this.f97063b;
        }

        /* renamed from: c */
        public final String mo95581c() {
            return this.f97064c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41131a)) {
                return false;
            }
            C41131a aVar = (C41131a) obj;
            return C41536l.m120484d(this.f97062a, aVar.f97062a) && C41536l.m120484d(this.f97063b, aVar.f97063b) && C41536l.m120484d(this.f97064c, aVar.f97064c);
        }

        public int hashCode() {
            return (((this.f97062a.hashCode() * 31) + this.f97063b.hashCode()) * 31) + this.f97064c.hashCode();
        }

        public String toString() {
            return "AuthData(operationId=" + this.f97062a + ", operationReference=" + this.f97063b + ", scaAuthCode=" + this.f97064c + ')';
        }
    }

    /* renamed from: hc1.b0$b */
    public static final class C41132b {

        /* renamed from: a */
        private final String f97065a;

        /* renamed from: b */
        private final boolean f97066b;

        public C41132b(String str, boolean z) {
            this.f97065a = str;
            this.f97066b = z;
        }

        /* renamed from: a */
        public final boolean mo95585a() {
            return this.f97066b;
        }

        /* renamed from: b */
        public final String mo95586b() {
            return this.f97065a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41132b)) {
                return false;
            }
            C41132b bVar = (C41132b) obj;
            return C41536l.m120484d(this.f97065a, bVar.f97065a) && this.f97066b == bVar.f97066b;
        }

        public int hashCode() {
            String str = this.f97065a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.f97066b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "Error(message=" + this.f97065a + ", dismissDialog=" + this.f97066b + ')';
        }
    }

    /* renamed from: hc1.b0$c */
    public /* synthetic */ class C41133c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97067a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f97068b;

        static {
            int[] iArr = new int[StrongAuthMethod.values().length];
            iArr[StrongAuthMethod.SMS.ordinal()] = 1;
            iArr[StrongAuthMethod.MAIL.ordinal()] = 2;
            f97067a = iArr;
            int[] iArr2 = new int[AuthElementType.values().length];
            iArr2[AuthElementType.PASSCODE.ordinal()] = 1;
            iArr2[AuthElementType.BIOMETRY.ordinal()] = 2;
            f97068b = iArr2;
        }
    }

    /* renamed from: hc1.b0$d */
    static final class C41134d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AuthElementType f97069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41134d(AuthElementType authElementType) {
            super(1);
            this.f97069d = authElementType;
        }

        /* renamed from: a */
        public final Boolean invoke(InputScaAuthElement inputScaAuthElement) {
            boolean z;
            C41536l.m120489i(inputScaAuthElement, "it");
            if (inputScaAuthElement.getType().f22755a == this.f97069d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: hc1.b0$e */
    static final class C41135e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41135e f97070d = new C41135e();

        C41135e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(InputScaAuthElement inputScaAuthElement) {
            C41536l.m120489i(inputScaAuthElement, "it");
            return Boolean.valueOf(!C41358y.m119999O(C41341q.m119910m(AuthElementType.TRUSTED_DEVICE, AuthElementType.BIOMETRY), inputScaAuthElement.getType().f22755a));
        }
    }

    /* renamed from: hc1.b0$f */
    static final class C41136f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41130b0 f97071d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41136f(C41130b0 b0Var) {
            super(1);
            this.f97071d = b0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f97071d.f97050o.mo4823o(new C35947l.C35951d(new C41224m((Object) null, (Object) null)));
            this.f97071d.f97048m.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: hc1.b0$g */
    static final class C41137g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41130b0 f97072d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41137g(C41130b0 b0Var) {
            super(1);
            this.f97072d = b0Var;
        }

        /* renamed from: a */
        public final void mo95593a(C41224m mVar) {
            C41224m mVar2 = (C41224m) mVar.mo95675a();
            C35954n nVar = (C35954n) mVar.mo95676b();
            this.f97072d.f97061z = mVar2;
            this.f97072d.f97050o.mo4823o(new C35947l.C35951d(mVar2));
            C41130b0 b0Var = this.f97072d;
            C41536l.m120488h(nVar, "checkOperation");
            b0Var.m119239Ww(nVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95593a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hc1.b0$h */
    static final class C41138h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41130b0 f97073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41138h(C41130b0 b0Var) {
            super(1);
            this.f97073d = b0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f97073d.f97049n.mo4823o(new C35947l.C35949b(th));
            this.f97073d.m119232Bw();
            C41130b0 b0Var = this.f97073d;
            b0Var.m119242ax(b0Var.m119233Kw().mo95656j());
        }
    }

    /* renamed from: hc1.b0$i */
    static final class C41139i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41130b0 f97074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41139i(C41130b0 b0Var) {
            super(1);
            this.f97074d = b0Var;
        }

        /* renamed from: a */
        public final void mo95595a(String str) {
            C41130b0 b0Var = this.f97074d;
            String ow = b0Var.f97059x;
            String str2 = null;
            if (ow == null) {
                C41536l.m120506z("operationId");
                ow = null;
            }
            String pw = this.f97074d.f97058w;
            if (pw == null) {
                C41536l.m120506z("operationReference");
            } else {
                str2 = pw;
            }
            C41536l.m120488h(str, "scaAuthCode");
            b0Var.m119244cx(ow, str2, str);
            this.f97074d.f97049n.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95595a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hc1.b0$j */
    static final class C41140j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41130b0 f97075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41140j(C41130b0 b0Var) {
            super(1);
            this.f97075d = b0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f97075d.f97051p.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: hc1.b0$k */
    static final class C41141k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41130b0 f97076d;

        /* renamed from: e */
        final /* synthetic */ UserContact f97077e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41141k(C41130b0 b0Var, UserContact userContact) {
            super(0);
            this.f97076d = b0Var;
            this.f97077e = userContact;
        }

        public final void invoke() {
            this.f97076d.f97051p.mo4823o(new C35947l.C35951d(this.f97077e));
        }
    }

    /* renamed from: hc1.b0$l */
    static final class C41142l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41130b0 f97078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41142l(C41130b0 b0Var) {
            super(0);
            this.f97078d = b0Var;
        }

        /* renamed from: b */
        public final C41199w invoke() {
            Session b = C10146d0.C10159c.m37143b();
            return new C41199w(b.getLoginAuthTypes$sso_client_release(), b.getAvailableAuthTypes$sso_client_release(), this.f97078d.f97041A);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41130b0(C40562n nVar, C40605t2 t2Var, C40578p1 p1Var, C40581p3 p3Var, Application application) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(nVar, "checkOperation");
        C41536l.m120489i(t2Var, "performScaUseCase");
        C41536l.m120489i(p1Var, "getUserContactsForAuth");
        C41536l.m120489i(p3Var, "requestOneTimePasswordUseCase");
        C41536l.m120489i(application, "application");
        this.f97043h = nVar;
        this.f97044i = t2Var;
        this.f97045j = p1Var;
        this.f97046k = p3Var;
        this.f97047l = application;
    }

    /* renamed from: Aw */
    public static /* synthetic */ void m119231Aw(C41130b0 b0Var, AuthElementType authElementType, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        b0Var.mo95578zw(authElementType, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public final void m119232Bw() {
        boolean unused = C41352v.m119960E(this.f97060y, C41135e.f97070d);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final C41199w m119233Kw() {
        return (C41199w) this.f97042B.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final C41224m m119234Ow(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C41224m((Object) null, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public static final C41224m m119235Pw(C41224m mVar, C35954n nVar) {
        C41536l.m120489i(mVar, "userContacts");
        C41536l.m120489i(nVar, "checkOperation");
        return new C41224m(mVar, nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final void m119236Qw(C41130b0 b0Var, C41205b bVar) {
        C41536l.m120489i(b0Var, "this$0");
        b0Var.f97048m.mo4823o(C35947l.C35950c.f86976a);
    }

    /* renamed from: Rw */
    private final boolean m119237Rw() {
        boolean z;
        boolean z2;
        C41171i0 j = m119233Kw().mo95656j();
        if (j == null) {
            return true;
        }
        Set<InputScaAuthElement> set = this.f97060y;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(set, 10));
        for (InputScaAuthElement type : set) {
            arrayList.add((AuthElementType) type.getType().f22755a);
        }
        if (j.mo95621d() != null) {
            z = arrayList.contains(j.mo95621d().mo95555a());
        } else {
            z = true;
        }
        if (z) {
            if (!j.mo95622e().isEmpty()) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AuthElementType authElementType = (AuthElementType) it.next();
                        List<C41127a> e = j.mo95622e();
                        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(e, 10));
                        for (C41127a a : e) {
                            arrayList2.add(a.mo95555a());
                        }
                        if (C41358y.m119999O(arrayList2, authElementType)) {
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        return true;
                    }
                }
                z2 = false;
                if (!z2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: Sw */
    private final boolean m119238Sw(AuthElementType authElementType) {
        return m119233Kw().mo95657k(authElementType);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public final void m119239Ww(C35954n nVar) {
        C41127a d;
        this.f97048m.mo4823o(new C35947l.C35951d(nVar));
        AuthElementType authElementType = null;
        if (nVar.mo88528c() == null || nVar.mo88527b() == null) {
            m119243bx((String) null, true);
            return;
        }
        this.f97059x = nVar.mo88526a();
        this.f97058w = nVar.mo88527b();
        this.f97057v = nVar.mo88528c().booleanValue();
        if (nVar.mo88528c().booleanValue()) {
            C41171i0 i = m119233Kw().mo95655i();
            if (!(i == null || (d = i.mo95621d()) == null)) {
                authElementType = d.mo95555a();
            }
            AuthElementType authElementType2 = AuthElementType.TRUSTED_DEVICE;
            if (authElementType == authElementType2) {
                m119231Aw(this, authElementType2, (String) null, false, 4, (Object) null);
            }
            m119242ax(i);
            return;
        }
        String a = nVar.mo88526a();
        String b = nVar.mo88527b();
        C41536l.m120486f(b);
        String d2 = nVar.mo88529d();
        C41536l.m120486f(d2);
        m119244cx(a, b, d2);
    }

    /* renamed from: Yw */
    private final void m119240Yw(boolean z) {
        C40605t2 t2Var = this.f97044i;
        String str = this.f97058w;
        if (str == null) {
            C41536l.m120506z("operationReference");
            str = null;
        }
        C40762x l = t2Var.mo94616c(str, C41358y.m120036z0(this.f97060y), z).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C41128a0(this));
        C41536l.m120488h(l, "performScaUseCase(operat…stValue(Result.Loading) }");
        mo42540ew(C40398b.m116972e(l, new C41138h(this), new C41139i(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public static final void m119241Zw(C41130b0 b0Var, C41205b bVar) {
        C41536l.m120489i(b0Var, "this$0");
        b0Var.f97049n.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0034 A[SYNTHETIC] */
    /* renamed from: ax */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m119242ax(hc1.C41171i0 r9) {
        /*
            r8 = this;
            r0 = 1
            if (r9 == 0) goto L_0x007e
            java.util.List r1 = r9.mo95619a()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x007e
        L_0x000f:
            hc1.a[] r1 = new hc1.C41127a[r0]
            hc1.a r2 = r9.mo95621d()
            r3 = 0
            r1[r3] = r2
            java.util.List r1 = ie1.C41341q.m119913p(r1)
            java.util.List r9 = r9.mo95622e()
            java.lang.Object r9 = ie1.C41358y.m120009Y(r9)
            r1.add(r9)
            java.util.List r9 = ie1.C41358y.m120004T(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0034:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0078
            java.lang.Object r2 = r9.next()
            r4 = r2
            hc1.a r4 = (hc1.C41127a) r4
            java.util.Set r5 = r8.f97060y
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L_0x004f
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x004f
        L_0x004d:
            r4 = r3
            goto L_0x0071
        L_0x004f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004d
            java.lang.Object r6 = r5.next()
            sso.type.InputScaAuthElement r6 = (sso.type.InputScaAuthElement) r6
            q2.e r6 = r6.getType()
            java.lang.Object r6 = r6.f22755a
            sso.type.AuthElementType r7 = r4.mo95555a()
            if (r6 != r7) goto L_0x006d
            r6 = r0
            goto L_0x006e
        L_0x006d:
            r6 = r3
        L_0x006e:
            if (r6 == 0) goto L_0x0053
            r4 = r0
        L_0x0071:
            r4 = r4 ^ r0
            if (r4 == 0) goto L_0x0034
            r1.add(r2)
            goto L_0x0034
        L_0x0078:
            gb1.o r9 = r8.f97054s
            r9.mo4823o(r1)
            return
        L_0x007e:
            r9 = 0
            r8.m119243bx(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hc1.C41130b0.m119242ax(hc1.i0):void");
    }

    /* renamed from: bx */
    private final void m119243bx(String str, boolean z) {
        this.f97052q.mo4823o(new C41132b(str, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public final void m119244cx(String str, String str2, String str3) {
        this.f97053r.mo4823o(new C41131a(str, str2, str3));
    }

    /* renamed from: Cw */
    public final LiveData mo95560Cw() {
        return this.f97053r;
    }

    /* renamed from: Dw */
    public final LiveData mo95561Dw() {
        return this.f97048m;
    }

    /* renamed from: Ew */
    public final boolean mo95562Ew() {
        return this.f97056u;
    }

    /* renamed from: Fw */
    public final LiveData mo95563Fw() {
        return this.f97052q;
    }

    /* renamed from: Gw */
    public final LiveData mo95564Gw() {
        return this.f97049n;
    }

    /* renamed from: Hw */
    public final LiveData mo95565Hw() {
        return this.f97054s;
    }

    /* renamed from: Iw */
    public final LiveData mo95566Iw() {
        return this.f97051p;
    }

    /* renamed from: Jw */
    public final boolean mo95567Jw() {
        return this.f97057v;
    }

    /* renamed from: Lw */
    public final LiveData mo95568Lw() {
        return this.f97055t;
    }

    /* renamed from: Mw */
    public final LiveData mo95569Mw() {
        return this.f97050o;
    }

    /* renamed from: Nw */
    public final void mo95570Nw(C41143c cVar, String str, Map map, boolean z) {
        C41536l.m120489i(cVar, "authConfig");
        C41536l.m120489i(map, "operationData");
        this.f97041A = cVar;
        if (str == null) {
            m119243bx((String) null, true);
            return;
        }
        C40762x l = C40762x.m118154T(this.f97045j.mo94596c((StrongAuthMethod) null).mo95065D(new C41201x()), this.f97043h.mo94590c(str, map, z), new C41202y()).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C41203z(this));
        C41536l.m120488h(l, "zip(\n            getUser…stValue(Result.Loading) }");
        mo42540ew(C40398b.m116972e(l, new C41136f(this), new C41137g(this)));
    }

    /* renamed from: Tw */
    public final boolean mo95571Tw() {
        C35954n nVar;
        Boolean c;
        Object f = mo95561Dw().mo4814f();
        C35947l.C35951d dVar = f instanceof C35947l.C35951d ? (C35947l.C35951d) f : null;
        if (dVar == null || (nVar = (C35954n) dVar.mo88520a()) == null || (c = nVar.mo88528c()) == null) {
            return true;
        }
        return c.booleanValue();
    }

    /* renamed from: Uw */
    public final boolean mo95572Uw() {
        return C41536l.m120484d(m119233Kw().mo95656j(), C41173j0.TRUSTED_AND_KNOWLEDGE.mo95626b());
    }

    /* renamed from: Vw */
    public final void mo95573Vw(AuthElementType authElementType) {
        C41536l.m120489i(authElementType, "authElementType");
        if (m119238Sw(authElementType)) {
            m119232Bw();
            m119242ax(m119233Kw().mo95658m(authElementType));
        }
    }

    /* renamed from: Xw */
    public final void mo95574Xw() {
        this.f97055t.mo4823o(C41238w.f97225a);
    }

    /* renamed from: dx */
    public final void mo95575dx() {
        m119232Bw();
        m119242ax(m119233Kw().mo95656j());
    }

    /* renamed from: ex */
    public final void mo95576ex(StrongAuthMethod strongAuthMethod) {
        C41536l.m120489i(strongAuthMethod, "authMethod");
        C41224m mVar = this.f97061z;
        if (mVar != null) {
            UserContact userContact = (UserContact) mVar.mo95675a();
            UserContact userContact2 = (UserContact) mVar.mo95676b();
            int i = C41133c.f97067a[strongAuthMethod.ordinal()];
            if (i != 1) {
                if (i == 2 && userContact2 != null) {
                    userContact = userContact2;
                } else {
                    return;
                }
            } else if (userContact == null) {
                return;
            }
            C40581p3 p3Var = this.f97046k;
            String str = this.f97058w;
            if (str == null) {
                C41536l.m120506z("operationReference");
                str = null;
            }
            C40734b z = p3Var.mo94598c(userContact, str, false).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
            C41536l.m120488h(z, "requestOneTimePasswordUs…dSchedulers.mainThread())");
            mo42540ew(C40398b.m116971d(z, new C41140j(this), new C41141k(this, userContact)));
        }
    }

    /* renamed from: fx */
    public final void mo95577fx(boolean z) {
        this.f97056u = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5 A[EDGE_INSN: B:53:0x00d5->B:43:0x00d5 ?: BREAK  , SYNTHETIC] */
    /* renamed from: zw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95578zw(sso.type.AuthElementType r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            sso.type.AuthElementType r0 = sso.type.AuthElementType.PASSCODE
            r1 = 0
            if (r7 != r0) goto L_0x001f
            if (r8 == 0) goto L_0x0013
            int r0 = r8.length()
            r2 = 4
            if (r0 >= r2) goto L_0x001f
        L_0x0013:
            android.app.Application r7 = r6.f97047l
            int r8 = ba1.C10220y.sca_verification_enter_full_passcode
            java.lang.String r7 = r7.getString(r8)
            r6.m119243bx(r7, r1)
            return
        L_0x001f:
            int[] r0 = hc1.C41130b0.C41133c.f97068b
            int r2 = r7.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L_0x0040
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L_0x0033
            he1.m r8 = he1.C41233s.m119492a(r8, r4)
            goto L_0x004c
        L_0x0033:
            ge.bog.sso_client.models.Session r8 = ba1.C10146d0.C10159c.m37143b()
            java.lang.String r8 = r8.getBiometricToken$sso_client_release()
            he1.m r8 = he1.C41233s.m119492a(r8, r4)
            goto L_0x004c
        L_0x0040:
            ge.bog.sso_client.models.Session r0 = ba1.C10146d0.C10159c.m37143b()
            java.lang.String r0 = r0.getPassCodeToken$sso_client_release()
            he1.m r8 = he1.C41233s.m119492a(r8, r0)
        L_0x004c:
            java.lang.Object r0 = r8.mo95675a()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r8.mo95676b()
            java.lang.String r8 = (java.lang.String) r8
            sso.type.InputScaAuthElement r3 = new sso.type.InputScaAuthElement
            q2.e$a r4 = p217q2.C7833e.f22754c
            q2.e r8 = r4.mo22769c(r8)
            q2.e r5 = r4.mo22769c(r7)
            q2.e r0 = r4.mo22769c(r0)
            r3.<init>(r8, r5, r0)
            java.util.Set r8 = r6.f97060y
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0079
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            r8 = r1
            goto L_0x0097
        L_0x0079:
            java.util.Iterator r8 = r8.iterator()
        L_0x007d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r8.next()
            sso.type.InputScaAuthElement r0 = (sso.type.InputScaAuthElement) r0
            q2.e r0 = r0.getType()
            java.lang.Object r0 = r0.f22755a
            if (r0 != r7) goto L_0x0093
            r0 = r2
            goto L_0x0094
        L_0x0093:
            r0 = r1
        L_0x0094:
            if (r0 == 0) goto L_0x007d
            r8 = r2
        L_0x0097:
            if (r8 == 0) goto L_0x00a3
            java.util.Set r8 = r6.f97060y
            hc1.b0$d r0 = new hc1.b0$d
            r0.<init>(r7)
            boolean unused = ie1.C41352v.m119960E(r8, r0)
        L_0x00a3:
            java.util.Set r7 = r6.f97060y
            r7.add(r3)
            java.util.Set r7 = r6.f97060y
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x00b5
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x00b5
            goto L_0x00d5
        L_0x00b5:
            java.util.Iterator r7 = r7.iterator()
        L_0x00b9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d5
            java.lang.Object r8 = r7.next()
            sso.type.InputScaAuthElement r8 = (sso.type.InputScaAuthElement) r8
            q2.e r8 = r8.getType()
            java.lang.Object r8 = r8.f22755a
            sso.type.AuthElementType r0 = sso.type.AuthElementType.TRUSTED_DEVICE
            if (r8 != r0) goto L_0x00d1
            r8 = r2
            goto L_0x00d2
        L_0x00d1:
            r8 = r1
        L_0x00d2:
            if (r8 == 0) goto L_0x00b9
            r1 = r2
        L_0x00d5:
            boolean r7 = r6.m119237Rw()
            if (r7 == 0) goto L_0x00df
            r6.m119240Yw(r1)
            goto L_0x00ec
        L_0x00df:
            if (r9 == 0) goto L_0x00ec
            hc1.w r7 = r6.m119233Kw()
            hc1.i0 r7 = r7.mo95656j()
            r6.m119242ax(r7)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hc1.C41130b0.mo95578zw(sso.type.AuthElementType, java.lang.String, boolean):void");
    }
}
