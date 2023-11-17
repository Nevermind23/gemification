package li0;

import com.salesforce.marketingcloud.C11398b;
import g91.C32343x;
import ij0.C25218a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37614q;
import pi0.C27534a;

/* renamed from: li0.g */
public final class C26035g {

    /* renamed from: a */
    private final C27534a.C27542g f66109a;

    /* renamed from: b */
    private final C27534a.C27549n f66110b;

    /* renamed from: c */
    private final C25218a f66111c;

    /* renamed from: d */
    private final C27534a.C27539e f66112d;

    /* renamed from: e */
    private final C27534a.C27543h f66113e;

    /* renamed from: f */
    private final C27534a.C27541f f66114f;

    /* renamed from: g */
    private final C27534a.C27544i f66115g;

    /* renamed from: h */
    private final C27534a.C27546k f66116h;

    /* renamed from: i */
    private final C27534a.C27536b f66117i;

    /* renamed from: j */
    private final C27534a.C27547l f66118j;

    /* renamed from: k */
    private final List f66119k;

    /* renamed from: l */
    private final C27534a.C27535a f66120l;

    /* renamed from: m */
    private final C27534a.C27538d f66121m;

    /* renamed from: n */
    private final C27534a.C27545j f66122n;

    /* renamed from: li0.g$a */
    public static final class C26036a {

        /* renamed from: a */
        private final BigDecimal f66123a;

        /* renamed from: b */
        private final String f66124b;

        /* renamed from: c */
        private final String f66125c;

        /* renamed from: d */
        private final boolean f66126d;

        /* renamed from: e */
        private final String f66127e;

        public C26036a(BigDecimal bigDecimal, String str, String str2, boolean z, String str3) {
            C41536l.m120489i(bigDecimal, "paymentAmount");
            C41536l.m120489i(str, "paymentCcy");
            this.f66123a = bigDecimal;
            this.f66124b = str;
            this.f66125c = str2;
            this.f66126d = z;
            this.f66127e = str3;
        }

        /* renamed from: a */
        public final String mo64920a() {
            return this.f66127e;
        }

        /* renamed from: b */
        public final String mo64921b() {
            return this.f66125c;
        }

        /* renamed from: c */
        public final BigDecimal mo64922c() {
            return this.f66123a;
        }

        /* renamed from: d */
        public final String mo64923d() {
            return this.f66124b;
        }

        /* renamed from: e */
        public final boolean mo64924e() {
            return this.f66126d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26036a)) {
                return false;
            }
            C26036a aVar = (C26036a) obj;
            return C41536l.m120484d(this.f66123a, aVar.f66123a) && C41536l.m120484d(this.f66124b, aVar.f66124b) && C41536l.m120484d(this.f66125c, aVar.f66125c) && this.f66126d == aVar.f66126d && C41536l.m120484d(this.f66127e, aVar.f66127e);
        }

        public int hashCode() {
            int hashCode = ((this.f66123a.hashCode() * 31) + this.f66124b.hashCode()) * 31;
            String str = this.f66125c;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f66126d;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            String str2 = this.f66127e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            BigDecimal bigDecimal = this.f66123a;
            String str = this.f66124b;
            String str2 = this.f66125c;
            boolean z = this.f66126d;
            String str3 = this.f66127e;
            return "PaymentTransactionWithMerchantName(paymentAmount=" + bigDecimal + ", paymentCcy=" + str + ", merchantName=" + str2 + ", isPaymentAmount=" + z + ", merchantAddress=" + str3 + ")";
        }
    }

    /* renamed from: li0.g$b */
    public static final class C26037b {

        /* renamed from: a */
        private final String f66128a;

        /* renamed from: b */
        private final List f66129b;

        public C26037b(String str, List list) {
            C41536l.m120489i(list, "paymentAmounts");
            this.f66128a = str;
            this.f66129b = list;
        }

        /* renamed from: a */
        public final List mo64928a() {
            return this.f66129b;
        }

        /* renamed from: b */
        public final String mo64929b() {
            return this.f66128a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26037b)) {
                return false;
            }
            C26037b bVar = (C26037b) obj;
            return C41536l.m120484d(this.f66128a, bVar.f66128a) && C41536l.m120484d(this.f66129b, bVar.f66129b);
        }

        public int hashCode() {
            String str = this.f66128a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f66129b.hashCode();
        }

        public String toString() {
            String str = this.f66128a;
            List list = this.f66129b;
            return "TransactionSummary(transactionDate=" + str + ", paymentAmounts=" + list + ")";
        }
    }

    public C26035g(C27534a.C27542g gVar, C27534a.C27549n nVar, C25218a aVar, C27534a.C27539e eVar, C27534a.C27543h hVar, C27534a.C27541f fVar, C27534a.C27544i iVar, C27534a.C27546k kVar, C27534a.C27536b bVar, C27534a.C27547l lVar, List list, C27534a.C27535a aVar2, C27534a.C27538d dVar, C27534a.C27545j jVar) {
        C41536l.m120489i(list, "transactions");
        this.f66109a = gVar;
        this.f66110b = nVar;
        this.f66111c = aVar;
        this.f66112d = eVar;
        this.f66113e = hVar;
        this.f66114f = fVar;
        this.f66115g = iVar;
        this.f66116h = kVar;
        this.f66117i = bVar;
        this.f66118j = lVar;
        this.f66119k = list;
        this.f66120l = aVar2;
        this.f66121m = dVar;
        this.f66122n = jVar;
    }

    /* renamed from: a */
    private final void m81665a(List list) {
        C27534a.C27537c cVar;
        for (C26037b bVar : this.f66119k) {
            String b = bVar.mo64929b();
            if (b != null) {
                cVar = new C27534a.C27537c(b);
            } else {
                cVar = null;
            }
            C37614q.m110615a(list, cVar);
            List<C26036a> a = bVar.mo64928a();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (C26036a aVar : a) {
                String b2 = aVar.mo64921b();
                String str = "";
                if (b2 == null) {
                    b2 = str;
                }
                String a2 = aVar.mo64920a();
                if (a2 != null) {
                    str = a2;
                }
                arrayList.add(new C27534a.C27548m(b2, str, C32343x.m95408P(aVar.mo64922c(), aVar.mo64923d()), aVar.mo64924e()));
            }
            list.addAll(arrayList);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ C26035g m81666d(C26035g gVar, C27534a.C27542g gVar2, C27534a.C27549n nVar, C25218a aVar, C27534a.C27539e eVar, C27534a.C27543h hVar, C27534a.C27541f fVar, C27534a.C27544i iVar, C27534a.C27546k kVar, C27534a.C27536b bVar, C27534a.C27547l lVar, List list, C27534a.C27535a aVar2, C27534a.C27538d dVar, C27534a.C27545j jVar, int i, Object obj) {
        C26035g gVar3 = gVar;
        int i2 = i;
        return gVar.mo64914c((i2 & 1) != 0 ? gVar3.f66109a : gVar2, (i2 & 2) != 0 ? gVar3.f66110b : nVar, (i2 & 4) != 0 ? gVar3.f66111c : aVar, (i2 & 8) != 0 ? gVar3.f66112d : eVar, (i2 & 16) != 0 ? gVar3.f66113e : hVar, (i2 & 32) != 0 ? gVar3.f66114f : fVar, (i2 & 64) != 0 ? gVar3.f66115g : iVar, (i2 & 128) != 0 ? gVar3.f66116h : kVar, (i2 & C11398b.f33139r) != 0 ? gVar3.f66117i : bVar, (i2 & C11398b.f33140s) != 0 ? gVar3.f66118j : lVar, (i2 & C11398b.f33141t) != 0 ? gVar3.f66119k : list, (i2 & C11398b.f33142u) != 0 ? gVar3.f66120l : aVar2, (i2 & C11398b.f33143v) != 0 ? gVar3.f66121m : dVar, (i2 & 8192) != 0 ? gVar3.f66122n : jVar);
    }

    /* renamed from: b */
    public final List mo64913b() {
        ArrayList arrayList = new ArrayList();
        C37614q.m110615a(arrayList, this.f66122n);
        C37614q.m110615a(arrayList, this.f66109a);
        C37614q.m110615a(arrayList, this.f66112d);
        C37614q.m110615a(arrayList, this.f66116h);
        C37614q.m110615a(arrayList, this.f66114f);
        C37614q.m110615a(arrayList, this.f66113e);
        C37614q.m110615a(arrayList, this.f66117i);
        C37614q.m110615a(arrayList, this.f66110b);
        C37614q.m110615a(arrayList, this.f66111c);
        C37614q.m110615a(arrayList, this.f66118j);
        m81665a(arrayList);
        C37614q.m110615a(arrayList, this.f66121m);
        C37614q.m110615a(arrayList, this.f66120l);
        return arrayList;
    }

    /* renamed from: c */
    public final C26035g mo64914c(C27534a.C27542g gVar, C27534a.C27549n nVar, C25218a aVar, C27534a.C27539e eVar, C27534a.C27543h hVar, C27534a.C27541f fVar, C27534a.C27544i iVar, C27534a.C27546k kVar, C27534a.C27536b bVar, C27534a.C27547l lVar, List list, C27534a.C27535a aVar2, C27534a.C27538d dVar, C27534a.C27545j jVar) {
        List list2 = list;
        C41536l.m120489i(list2, "transactions");
        return new C26035g(gVar, nVar, aVar, eVar, hVar, fVar, iVar, kVar, bVar, lVar, list2, aVar2, dVar, jVar);
    }

    /* renamed from: e */
    public final C27534a.C27536b mo64915e() {
        return this.f66117i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26035g)) {
            return false;
        }
        C26035g gVar = (C26035g) obj;
        return C41536l.m120484d(this.f66109a, gVar.f66109a) && C41536l.m120484d(this.f66110b, gVar.f66110b) && C41536l.m120484d(this.f66111c, gVar.f66111c) && C41536l.m120484d(this.f66112d, gVar.f66112d) && C41536l.m120484d(this.f66113e, gVar.f66113e) && C41536l.m120484d(this.f66114f, gVar.f66114f) && C41536l.m120484d(this.f66115g, gVar.f66115g) && C41536l.m120484d(this.f66116h, gVar.f66116h) && C41536l.m120484d(this.f66117i, gVar.f66117i) && C41536l.m120484d(this.f66118j, gVar.f66118j) && C41536l.m120484d(this.f66119k, gVar.f66119k) && C41536l.m120484d(this.f66120l, gVar.f66120l) && C41536l.m120484d(this.f66121m, gVar.f66121m) && C41536l.m120484d(this.f66122n, gVar.f66122n);
    }

    /* renamed from: f */
    public final C27534a.C27539e mo64917f() {
        return this.f66112d;
    }

    public int hashCode() {
        C27534a.C27542g gVar = this.f66109a;
        int i = 0;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        C27534a.C27549n nVar = this.f66110b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        C25218a aVar = this.f66111c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C27534a.C27539e eVar = this.f66112d;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        C27534a.C27543h hVar = this.f66113e;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        C27534a.C27541f fVar = this.f66114f;
        int hashCode6 = (hashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        C27534a.C27544i iVar = this.f66115g;
        int hashCode7 = (hashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C27534a.C27546k kVar = this.f66116h;
        int hashCode8 = (hashCode7 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        C27534a.C27536b bVar = this.f66117i;
        int hashCode9 = (hashCode8 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C27534a.C27547l lVar = this.f66118j;
        int hashCode10 = (((hashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f66119k.hashCode()) * 31;
        C27534a.C27535a aVar2 = this.f66120l;
        int hashCode11 = (hashCode10 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C27534a.C27538d dVar = this.f66121m;
        int hashCode12 = (hashCode11 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C27534a.C27545j jVar = this.f66122n;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        C27534a.C27542g gVar = this.f66109a;
        C27534a.C27549n nVar = this.f66110b;
        C25218a aVar = this.f66111c;
        C27534a.C27539e eVar = this.f66112d;
        C27534a.C27543h hVar = this.f66113e;
        C27534a.C27541f fVar = this.f66114f;
        C27534a.C27544i iVar = this.f66115g;
        C27534a.C27546k kVar = this.f66116h;
        C27534a.C27536b bVar = this.f66117i;
        C27534a.C27547l lVar = this.f66118j;
        List list = this.f66119k;
        C27534a.C27535a aVar2 = this.f66120l;
        C27534a.C27538d dVar = this.f66121m;
        C27534a.C27545j jVar = this.f66122n;
        return "GiftCardDetailsViewState(giftCardDetailsLoadingItem=" + gVar + ", loadingItem=" + nVar + ", errorItem=" + aVar + ", giftCardAnimation=" + eVar + ", giftCardTermDescription=" + hVar + ", giftCardCode=" + fVar + ", googlePayCard=" + iVar + ", inlineFeedBack=" + kVar + ", cardDetails=" + bVar + ", paymentHistory=" + lVar + ", transactions=" + list + ", bottomLayer=" + aVar2 + ", emptyTransactions=" + dVar + ", incorrectGiftCardIdItem=" + jVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C26035g(pi0.C27534a.C27542g r16, pi0.C27534a.C27549n r17, ij0.C25218a r18, pi0.C27534a.C27539e r19, pi0.C27534a.C27543h r20, pi0.C27534a.C27541f r21, pi0.C27534a.C27544i r22, pi0.C27534a.C27546k r23, pi0.C27534a.C27536b r24, pi0.C27534a.C27547l r25, java.util.List r26, pi0.C27534a.C27535a r27, pi0.C27534a.C27538d r28, pi0.C27534a.C27545j r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r17
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r18
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r19
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r20
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r21
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r22
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r23
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r24
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r25
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005c
            java.util.List r12 = ie1.C41341q.m119907j()
            goto L_0x005e
        L_0x005c:
            r12 = r26
        L_0x005e:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0064
            r13 = r2
            goto L_0x0066
        L_0x0064:
            r13 = r27
        L_0x0066:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006c
            r14 = r2
            goto L_0x006e
        L_0x006c:
            r14 = r28
        L_0x006e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r2 = r29
        L_0x0075:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: li0.C26035g.<init>(pi0.a$g, pi0.a$n, ij0.a, pi0.a$e, pi0.a$h, pi0.a$f, pi0.a$i, pi0.a$k, pi0.a$b, pi0.a$l, java.util.List, pi0.a$a, pi0.a$d, pi0.a$j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
