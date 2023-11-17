package g00;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p962yz.C30124a;

/* renamed from: g00.a */
public final class C20588a {

    /* renamed from: a */
    private final List f55635a;

    /* renamed from: b */
    private final List f55636b;

    /* renamed from: c */
    private final C30124a f55637c;

    /* renamed from: d */
    private final List f55638d;

    /* renamed from: e */
    private List f55639e;

    public C20588a(List list, List list2, C30124a aVar, List list3, List list4) {
        C41536l.m120489i(list, "offers");
        C41536l.m120489i(list2, "applications");
        C41536l.m120489i(aVar, "criStatus");
        C41536l.m120489i(list3, "pendingProducts");
        C41536l.m120489i(list4, "banners");
        this.f55635a = list;
        this.f55636b = list2;
        this.f55637c = aVar;
        this.f55638d = list3;
        this.f55639e = list4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (kotlin.jvm.internal.C41536l.m120484d(r5, h00.C24848d.f63827f.mo63282b()) == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010a, code lost:
        if (ie1.C41341q.m119910m(h00.C24846c.A.mo63280b(), h00.C24846c.P.mo63280b(), h00.C24846c.C.mo63280b(), h00.C24846c.W.mo63280b(), h00.C24846c.O.mo63280b(), h00.C24846c.R.mo63280b(), h00.C24846c.B.mo63280b(), h00.C24846c.M.mo63280b()).contains(r3.getStatus()) == false) goto L_0x010c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo49125a() {
        /*
            r9 = this;
            java.util.List r0 = r9.f55636b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.model.Application r3 = (p341ge.bog.mobilebank.model.Application) r3
            h00.a$a r4 = h00.C24842a.f63797e
            java.lang.String r3 = r3.getAppType()
            boolean r3 = r4.mo63278a(r3)
            if (r3 == 0) goto L_0x000b
            r1.add(r2)
            goto L_0x000b
        L_0x0028:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0116
            java.lang.Object r2 = r1.next()
            r3 = r2
            ge.bog.mobilebank.model.Application r3 = (p341ge.bog.mobilebank.model.Application) r3
            java.lang.String r4 = r3.getAppType()
            h00.a r5 = h00.C24842a.DEPOSIT
            java.lang.String r5 = r5.mo63277b()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x005e
            java.lang.String r3 = r3.getStatus()
            h00.c r4 = h00.C24846c.A
            java.lang.String r4 = r4.mo63280b()
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)
            goto L_0x010f
        L_0x005e:
            h00.a r5 = h00.C24842a.DEBIT_CARD
            java.lang.String r5 = r5.mo63277b()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x00a8
            java.lang.String r4 = r3.getStatus()
            h00.c r5 = h00.C24846c.A
            java.lang.String r5 = r5.mo63280b()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x010e
            ge.bog.mobilebank.model.CardApplicationDetails r4 = r3.getCardDetails()
            r5 = 0
            if (r4 == 0) goto L_0x0086
            java.lang.String r4 = r4.cardStatus
            goto L_0x0087
        L_0x0086:
            r4 = r5
        L_0x0087:
            h00.d r8 = h00.C24848d.ORDERED
            java.lang.String r8 = r8.mo63282b()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r8)
            if (r4 != 0) goto L_0x010e
            ge.bog.mobilebank.model.CardApplicationDetails r3 = r3.getCardDetails()
            if (r3 == 0) goto L_0x009b
            java.lang.String r5 = r3.cardStatus
        L_0x009b:
            h00.d r3 = h00.C24848d.EMBOSSED
            java.lang.String r3 = r3.mo63282b()
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r5, r3)
            if (r3 != 0) goto L_0x010e
            goto L_0x010c
        L_0x00a8:
            h00.a r5 = h00.C24842a.CREDIT_APPLICATION
            java.lang.String r5 = r5.mo63277b()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x010e
            r4 = 8
            java.lang.String[] r4 = new java.lang.String[r4]
            h00.c r5 = h00.C24846c.A
            java.lang.String r5 = r5.mo63280b()
            r4[r7] = r5
            h00.c r5 = h00.C24846c.P
            java.lang.String r5 = r5.mo63280b()
            r4[r6] = r5
            h00.c r5 = h00.C24846c.C
            java.lang.String r5 = r5.mo63280b()
            r8 = 2
            r4[r8] = r5
            h00.c r5 = h00.C24846c.W
            java.lang.String r5 = r5.mo63280b()
            r8 = 3
            r4[r8] = r5
            h00.c r5 = h00.C24846c.O
            java.lang.String r5 = r5.mo63280b()
            r8 = 4
            r4[r8] = r5
            h00.c r5 = h00.C24846c.R
            java.lang.String r5 = r5.mo63280b()
            r8 = 5
            r4[r8] = r5
            h00.c r5 = h00.C24846c.B
            java.lang.String r5 = r5.mo63280b()
            r8 = 6
            r4[r8] = r5
            h00.c r5 = h00.C24846c.M
            java.lang.String r5 = r5.mo63280b()
            r8 = 7
            r4[r8] = r5
            java.util.List r4 = ie1.C41341q.m119910m(r4)
            java.lang.String r3 = r3.getStatus()
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x010e
        L_0x010c:
            r3 = r6
            goto L_0x010f
        L_0x010e:
            r3 = r7
        L_0x010f:
            if (r3 == 0) goto L_0x0031
            r0.add(r2)
            goto L_0x0031
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g00.C20588a.mo49125a():java.util.List");
    }

    /* renamed from: b */
    public final List mo49126b() {
        return this.f55639e;
    }

    /* renamed from: c */
    public final C30124a mo49127c() {
        return this.f55637c;
    }

    /* renamed from: d */
    public final List mo49128d() {
        return this.f55635a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (kotlin.jvm.internal.C41536l.m120484d(r5, h00.C24848d.f63827f.mo63282b()) != false) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x000b A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo49129e() {
        /*
            r9 = this;
            java.util.List r0 = r9.f55636b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00fc
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.model.Application r3 = (p341ge.bog.mobilebank.model.Application) r3
            java.lang.String r4 = r3.getAppType()
            h00.a r5 = h00.C24842a.DEBIT_CARD
            java.lang.String r5 = r5.mo63277b()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x006a
            java.lang.String r4 = r3.getStatus()
            h00.c r5 = h00.C24846c.A
            java.lang.String r5 = r5.mo63280b()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0067
            ge.bog.mobilebank.model.CardApplicationDetails r4 = r3.getCardDetails()
            r5 = 0
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = r4.cardStatus
            goto L_0x0045
        L_0x0044:
            r4 = r5
        L_0x0045:
            h00.d r8 = h00.C24848d.ORDERED
            java.lang.String r8 = r8.mo63282b()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r8)
            if (r4 != 0) goto L_0x00f5
            ge.bog.mobilebank.model.CardApplicationDetails r3 = r3.getCardDetails()
            if (r3 == 0) goto L_0x0059
            java.lang.String r5 = r3.cardStatus
        L_0x0059:
            h00.d r3 = h00.C24848d.EMBOSSED
            java.lang.String r3 = r3.mo63282b()
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r5, r3)
            if (r3 == 0) goto L_0x0067
            goto L_0x00f5
        L_0x0067:
            r6 = r7
            goto L_0x00f5
        L_0x006a:
            h00.a r5 = h00.C24842a.DEPOSIT
            java.lang.String r5 = r5.mo63277b()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0085
            java.lang.String r3 = r3.getStatus()
            h00.c r4 = h00.C24846c.P
            java.lang.String r4 = r4.mo63280b()
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)
            goto L_0x00f5
        L_0x0085:
            h00.a r5 = h00.C24842a.CREDIT_LIMIT_APP
            java.lang.String r5 = r5.mo63277b()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0093
            r4 = r6
            goto L_0x009d
        L_0x0093:
            h00.a r5 = h00.C24842a.CREDIT_APPLICATION
            java.lang.String r5 = r5.mo63277b()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
        L_0x009d:
            if (r4 == 0) goto L_0x0067
            r4 = 8
            java.lang.String[] r4 = new java.lang.String[r4]
            h00.c r5 = h00.C24846c.A
            java.lang.String r5 = r5.mo63280b()
            r4[r7] = r5
            h00.c r5 = h00.C24846c.P
            java.lang.String r5 = r5.mo63280b()
            r4[r6] = r5
            h00.c r5 = h00.C24846c.C
            java.lang.String r5 = r5.mo63280b()
            r6 = 2
            r4[r6] = r5
            h00.c r5 = h00.C24846c.W
            java.lang.String r5 = r5.mo63280b()
            r6 = 3
            r4[r6] = r5
            h00.c r5 = h00.C24846c.O
            java.lang.String r5 = r5.mo63280b()
            r6 = 4
            r4[r6] = r5
            h00.c r5 = h00.C24846c.R
            java.lang.String r5 = r5.mo63280b()
            r6 = 5
            r4[r6] = r5
            h00.c r5 = h00.C24846c.B
            java.lang.String r5 = r5.mo63280b()
            r6 = 6
            r4[r6] = r5
            h00.c r5 = h00.C24846c.M
            java.lang.String r5 = r5.mo63280b()
            r6 = 7
            r4[r6] = r5
            java.util.List r4 = ie1.C41341q.m119910m(r4)
            java.lang.String r3 = r3.getStatus()
            boolean r6 = r4.contains(r3)
        L_0x00f5:
            if (r6 == 0) goto L_0x000b
            r1.add(r2)
            goto L_0x000b
        L_0x00fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g00.C20588a.mo49129e():java.util.List");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20588a)) {
            return false;
        }
        C20588a aVar = (C20588a) obj;
        return C41536l.m120484d(this.f55635a, aVar.f55635a) && C41536l.m120484d(this.f55636b, aVar.f55636b) && C41536l.m120484d(this.f55637c, aVar.f55637c) && C41536l.m120484d(this.f55638d, aVar.f55638d) && C41536l.m120484d(this.f55639e, aVar.f55639e);
    }

    /* renamed from: f */
    public final List mo49131f() {
        return this.f55638d;
    }

    public int hashCode() {
        return (((((((this.f55635a.hashCode() * 31) + this.f55636b.hashCode()) * 31) + this.f55637c.hashCode()) * 31) + this.f55638d.hashCode()) * 31) + this.f55639e.hashCode();
    }

    public String toString() {
        List list = this.f55635a;
        List list2 = this.f55636b;
        C30124a aVar = this.f55637c;
        List list3 = this.f55638d;
        List list4 = this.f55639e;
        return "OffersAndApplicationsInitialData(offers=" + list + ", applications=" + list2 + ", criStatus=" + aVar + ", pendingProducts=" + list3 + ", banners=" + list4 + ")";
    }
}
