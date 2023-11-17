package com.threatmetrix.TrustDefender;

import com.salesforce.marketingcloud.C11398b;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11969r1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p585re.C17590g;
import p585re.C17592i;
import p585re.C17597n;
import p585re.C17602s;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.l1 */
public class C11927l1 {

    /* renamed from: k */
    private static final String f34896k = C11907h.m43615j(C11927l1.class);

    /* renamed from: a */
    private final AtomicLong f34897a;

    /* renamed from: b */
    private final long f34898b;

    /* renamed from: c */
    public final long f34899c;

    /* renamed from: d */
    public final C17603t f34900d;

    /* renamed from: e */
    public final String f34901e;

    /* renamed from: f */
    public final String f34902f;

    /* renamed from: g */
    public final String f34903g;

    /* renamed from: h */
    public final String f34904h;

    /* renamed from: i */
    public final String f34905i;

    /* renamed from: j */
    public long f34906j;

    /* renamed from: com.threatmetrix.TrustDefender.l1$a */
    public static class C11928a {

        /* renamed from: a */
        public final double f34907a;

        /* renamed from: b */
        public final double f34908b;

        /* renamed from: c */
        public final Float f34909c;

        /* renamed from: d */
        public final boolean f34910d;

        /* renamed from: e */
        public final boolean f34911e;

        public C11928a(double d, double d2, Float f, boolean z, boolean z2) {
            this.f34907a = d;
            this.f34908b = d2;
            this.f34909c = f;
            this.f34910d = z;
            this.f34911e = z2;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.l1$b */
    public static class C11929b {

        /* renamed from: a */
        public final int f34912a;

        /* renamed from: b */
        public final int f34913b;

        /* renamed from: c */
        public final int f34914c;

        /* renamed from: d */
        public final int f34915d;

        /* renamed from: e */
        public final boolean f34916e;

        public C11929b(int i, int i2, int i3, int i4, boolean z) {
            this.f34912a = i;
            this.f34913b = i2;
            this.f34914c = i3;
            this.f34915d = i4;
            this.f34916e = z;
        }
    }

    public C11927l1(C17603t tVar, long j, AtomicLong atomicLong, long j2) {
        this.f34899c = j;
        this.f34897a = atomicLong;
        this.f34900d = tVar;
        String c = C11876a0.m43518c(tVar);
        this.f34901e = c;
        this.f34902f = C11876a0.m43522g(c);
        String a = tVar.mo45190a();
        a = C11921k0.m43739v(a) ? "TrustDefenderSDK" : a;
        this.f34904h = "http://" + a;
        this.f34903g = "http://" + a + "/mobile";
        this.f34905i = C11921k0.m43730m(C11942o1.m43842a(tVar));
        this.f34898b = j2;
        this.f34906j = 0;
        C17597n.m61201d().mo45168f();
    }

    /* renamed from: d */
    private List m43769d(C11923l lVar) {
        String str = this.f34900d.f49314a.getApplicationInfo().nativeLibraryDir;
        String concat = str.concat("/lib".concat("TMXProfiling-6.3-81-jni").concat(".so"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(concat);
        String m = lVar.mo31972m("MODULE_TYPE_AUTHENTICATION");
        if (C11921k0.m43732o(m)) {
            String concat2 = str.concat("/lib".concat(m).concat(".so"));
            if (C11921k0.m43732o(concat2)) {
                arrayList.add(concat2);
            }
        }
        String m2 = lVar.mo31972m("MODULE_TYPE_DEVICE_SECURITY");
        if (C11921k0.m43732o(m2)) {
            String concat3 = str.concat("/lib".concat(m2).concat(".so"));
            if (C11921k0.m43732o(concat3)) {
                arrayList.add(concat3);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo31979a(java.util.Set r12, java.util.List r13, java.util.Map r14) {
        /*
            r11 = this;
            re.t r0 = r11.f34900d
            java.lang.String r0 = com.threatmetrix.TrustDefender.C11914j.m43690q(r0)
            com.threatmetrix.TrustDefender.o0 r1 = com.threatmetrix.TrustDefender.C11941o0.m43833h()
            java.lang.String r2 = ""
            if (r14 == 0) goto L_0x0018
            java.lang.String r3 = "__orientation"
            java.lang.Object r3 = r14.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "{\"cpo\":"
            r4.append(r5)
            long r5 = r11.f34899c
            r4.append(r5)
            java.lang.String r5 = ",\"dyo\":"
            r4.append(r5)
            java.util.concurrent.atomic.AtomicLong r5 = r11.f34897a
            long r5 = r5.longValue()
            r4.append(r5)
            java.lang.String r5 = ",\"psi\":"
            r4.append(r5)
            int r5 = r1.mo31998e()
            r4.append(r5)
            java.lang.String r5 = ",\"pri\":"
            r4.append(r5)
            long r5 = r11.f34906j
            r4.append(r5)
            java.lang.String r5 = ",\"cpi\":"
            r4.append(r5)
            long r5 = r1.mo32000g()
            r4.append(r5)
            java.lang.String r5 = ",\"ori\":"
            r4.append(r5)
            java.lang.String r5 = "\""
            r4.append(r5)
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            int r4 = r1.mo31998e()
            r6 = 1
            if (r4 <= r6) goto L_0x00a3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ",\"lsi\":\""
            r4.append(r3)
            java.lang.String r3 = r1.mo31995b()
            r4.append(r3)
            java.lang.String r3 = "\",\"lps\":\""
            r4.append(r3)
            re.f r3 = r1.mo31999f()
            r4.append(r3)
            java.lang.String r3 = "\",\"lpi\":"
            r4.append(r3)
            long r6 = r1.mo31997d()
            r4.append(r6)
            java.lang.String r3 = r4.toString()
        L_0x00a3:
            java.util.concurrent.atomic.AtomicLong r1 = r11.f34897a
            long r6 = r1.get()
            r8 = 1073741824(0x40000000, double:5.304989477E-315)
            long r6 = r6 & r8
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012f
            re.t r1 = r11.f34900d
            java.lang.String r1 = com.threatmetrix.TrustDefender.C11914j.m43681h(r1)
            java.lang.String r4 = com.threatmetrix.TrustDefender.C11914j.m43694u()
            if (r13 == 0) goto L_0x00df
            java.util.Iterator r13 = r13.iterator()
            r6 = r2
        L_0x00c4:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x00e0
            java.lang.Object r7 = r13.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r10 = java.lang.Boolean.parseBoolean(r6)
            if (r10 != 0) goto L_0x00c4
            com.threatmetrix.TrustDefender.u0 r6 = com.threatmetrix.TrustDefender.C11996u0.m44036s()
            java.lang.String r6 = r6.mo32076i(r7)
            goto L_0x00c4
        L_0x00df:
            r6 = r2
        L_0x00e0:
            boolean r13 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r1)
            if (r13 == 0) goto L_0x00fa
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r3 = ",\"dbg\":"
            r13.append(r3)
            r13.append(r1)
            java.lang.String r3 = r13.toString()
        L_0x00fa:
            boolean r13 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r4)
            if (r13 == 0) goto L_0x0115
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r1 = ",\"jdwp\":"
            r13.append(r1)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r3 = r13
        L_0x0115:
            boolean r13 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r6)
            if (r13 == 0) goto L_0x012f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r1 = ",\"djni\":"
            r13.append(r1)
            r13.append(r6)
            java.lang.String r3 = r13.toString()
        L_0x012f:
            boolean r13 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r0)
            if (r13 == 0) goto L_0x0149
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r1 = ",\"adb\":"
            r13.append(r1)
            r13.append(r0)
            java.lang.String r3 = r13.toString()
        L_0x0149:
            com.threatmetrix.TrustDefender.C12014y0.m44143g(r12)
            java.lang.String r12 = com.threatmetrix.TrustDefender.C12014y0.m44138b()
            boolean r13 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r12)
            if (r13 == 0) goto L_0x016a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            java.lang.String r0 = ",\"dper\":"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r3 = r13.toString()
        L_0x016a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r13 = ",\"mif\":\""
            r12.append(r13)
            long r0 = r11.f34898b
            int r13 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0182
            java.lang.String r13 = java.lang.Long.toString(r0)
            goto L_0x0183
        L_0x0182:
            r13 = r2
        L_0x0183:
            r12.append(r13)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            if (r14 == 0) goto L_0x019c
            re.g r13 = p585re.C17590g.CRASH_LOG_STRING
            java.lang.String r13 = r13.mo45142a()
            java.lang.Object r13 = r14.get(r13)
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
        L_0x019c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = ",\"crs\":\""
            r13.append(r12)
            boolean r12 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r2)
            if (r12 == 0) goto L_0x01b2
            java.lang.String r12 = "1"
            goto L_0x01b4
        L_0x01b2:
            java.lang.String r12 = "0"
        L_0x01b4:
            r13.append(r12)
            r13.append(r5)
            java.lang.String r12 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = "}"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11927l1.mo31979a(java.util.Set, java.util.List, java.util.Map):java.lang.String");
    }

    /* renamed from: b */
    public C17602s mo31980b(C11938n0 n0Var, String str, String str2, C11928a aVar, Map map, C11923l lVar, boolean z) {
        C11923l lVar2;
        C11938n0 n0Var2 = n0Var;
        String str3 = str;
        String str4 = str2;
        Map map2 = map;
        C11923l lVar3 = lVar;
        C12016z zVar = new C12016z();
        C17597n.m61201d().mo45167c(this.f34897a.get(), new C11994t1(this.f34900d, this.f34901e, "", "", peppep.f35070y, n0Var, aVar, map, (C17592i) null, zVar), true, !z);
        Map a = C17597n.m61201d().mo45166a(this.f34897a.get(), !z);
        C17602s sVar = new C17602s();
        sVar.mo45184d(C11051p3.f31759c);
        sVar.mo45183c("w", n0Var2.f35040t);
        sVar.mo45182a("lh", this.f34903g, true);
        sVar.mo45182a("dr", this.f34904h, true);
        sVar.mo45183c("hh", C11921k0.m43728k(str3 + str4));
        sVar.mo45183c("lq", this.f34905i);
        sVar.mo45183c("ani", this.f34901e);
        if (map2 != null && !map.isEmpty()) {
            sVar.mo45188l(map2);
        }
        if (z) {
            sVar.mo45183c("apd", String.valueOf(C11941o0.m43833h().mo32000g()));
            lVar2 = lVar;
            sVar.mo45186f("atr", mo31979a(lVar.mo31971l(), m43769d(lVar2), a), Integer.valueOf(C11398b.f33142u));
            String b = C12016z.m44148b(C11941o0.m43833h().mo31996c());
            if (b != null) {
                sVar.mo45183c("sp", b);
            }
            if ((this.f34897a.get() & 9007199254740992L) != 0) {
                sVar.mo45186f("rsp", new C11918j0().mo31957a(this.f34900d.f49314a, str3, n0Var2.f35045y), -1);
            }
        } else {
            lVar2 = lVar;
        }
        C17602s sVar2 = new C17602s();
        sVar2.mo45183c("org_id", str3);
        sVar2.mo45183c("session_id", str4);
        sVar2.mo45183c("nonce", n0Var2.f35041u);
        sVar2.mo45183c("h", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
        sVar2.mo45183c("m", AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
        for (Map.Entry entry : a.entrySet()) {
            if (!((String) entry.getKey()).startsWith("__")) {
                if (((String) entry.getKey()).startsWith("sid_")) {
                    sVar2.mo45183c((String) entry.getKey(), (String) entry.getValue());
                } else {
                    sVar.mo45186f((String) entry.getKey(), (String) entry.getValue(), -1);
                }
            }
        }
        Map n = lVar2.mo31973n(this.f34897a.get());
        if (n != null) {
            C17590g gVar = C17590g.APP_HASHES;
            if (n.containsKey(gVar.mo45142a())) {
                sVar2.mo45183c(gVar.mo45142a(), (String) n.get(gVar.mo45142a()));
            }
        }
        C12016z zVar2 = zVar;
        zVar2.mo32108c("Params without xor", "pwx");
        String m = sVar.mo45189m();
        zVar2.mo32108c("URL encoding", "ue");
        String str5 = f34896k;
        C11907h.C11908a.m43624b(str5, "encoded ja = " + sVar);
        sVar2.mo45183c("ja", C11921k0.m43741x(m, str4));
        zVar2.mo32108c("Params xor'd", "pxd");
        return sVar2;
    }

    /* renamed from: c */
    public void mo31981c(String str, C17592i iVar, String str2, boolean z) {
        long b = C11969r1.C11986o.m44002b();
        C17597n.m61201d().mo45167c(this.f34897a.get(), new C11994t1(this.f34900d, this.f34901e, str, str2, peppep.f35070y, (C11938n0) null, (C11928a) null, (Map) null, iVar, new C12016z()), false, z);
        this.f34906j = C11969r1.C11986o.m44002b() - b;
    }
}
