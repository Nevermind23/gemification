package nq0;

import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import m41.C37223a;

/* renamed from: nq0.a */
public final class C37444a {

    /* renamed from: a */
    private final double f90022a;

    /* renamed from: b */
    private final Double f90023b;

    /* renamed from: c */
    private final Double f90024c;

    /* renamed from: d */
    private final Double f90025d;

    /* renamed from: e */
    private final String f90026e;

    /* renamed from: f */
    private final List f90027f;

    /* renamed from: g */
    private final C37223a f90028g;

    /* renamed from: h */
    private final boolean f90029h;

    /* renamed from: i */
    private final boolean f90030i;

    public C37444a(double d, Double d2, Double d3, Double d4, String str, List list, C37223a aVar, boolean z, boolean z2) {
        C41536l.m120489i(str, "loanCcy");
        C41536l.m120489i(list, "details");
        this.f90022a = d;
        this.f90023b = d2;
        this.f90024c = d3;
        this.f90025d = d4;
        this.f90026e = str;
        this.f90027f = list;
        this.f90028g = aVar;
        this.f90029h = z;
        this.f90030i = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C37444a m110309b(C37444a aVar, double d, Double d2, Double d3, Double d4, String str, List list, C37223a aVar2, boolean z, boolean z2, int i, Object obj) {
        C37444a aVar3 = aVar;
        int i2 = i;
        return aVar.mo90545a((i2 & 1) != 0 ? aVar3.f90022a : d, (i2 & 2) != 0 ? aVar3.f90023b : d2, (i2 & 4) != 0 ? aVar3.f90024c : d3, (i2 & 8) != 0 ? aVar3.f90025d : d4, (i2 & 16) != 0 ? aVar3.f90026e : str, (i2 & 32) != 0 ? aVar3.f90027f : list, (i2 & 64) != 0 ? aVar3.f90028g : aVar2, (i2 & 128) != 0 ? aVar3.f90029h : z, (i2 & C11398b.f33139r) != 0 ? aVar3.f90030i : z2);
    }

    /* renamed from: a */
    public final C37444a mo90545a(double d, Double d2, Double d3, Double d4, String str, List list, C37223a aVar, boolean z, boolean z2) {
        String str2 = str;
        C41536l.m120489i(str2, "loanCcy");
        List list2 = list;
        C41536l.m120489i(list2, "details");
        return new C37444a(d, d2, d3, d4, str2, list2, aVar, z, z2);
    }

    /* renamed from: c */
    public final boolean mo90546c() {
        return this.f90030i;
    }

    /* renamed from: d */
    public final List mo90547d() {
        return this.f90027f;
    }

    /* renamed from: e */
    public final Double mo90548e() {
        return this.f90024c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37444a)) {
            return false;
        }
        C37444a aVar = (C37444a) obj;
        return Double.compare(this.f90022a, aVar.f90022a) == 0 && C41536l.m120484d(this.f90023b, aVar.f90023b) && C41536l.m120484d(this.f90024c, aVar.f90024c) && C41536l.m120484d(this.f90025d, aVar.f90025d) && C41536l.m120484d(this.f90026e, aVar.f90026e) && C41536l.m120484d(this.f90027f, aVar.f90027f) && C41536l.m120484d(this.f90028g, aVar.f90028g) && this.f90029h == aVar.f90029h && this.f90030i == aVar.f90030i;
    }

    /* renamed from: f */
    public final C37223a mo90550f() {
        return this.f90028g;
    }

    /* renamed from: g */
    public final Double mo90551g() {
        return this.f90025d;
    }

    /* renamed from: h */
    public final boolean mo90552h() {
        return this.f90029h;
    }

    public int hashCode() {
        int a = Double.doubleToLongBits(this.f90022a) * 31;
        Double d = this.f90023b;
        int i = 0;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f90024c;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f90025d;
        int hashCode3 = (((((hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31) + this.f90026e.hashCode()) * 31) + this.f90027f.hashCode()) * 31;
        C37223a aVar = this.f90028g;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f90029h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f90030i;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final double mo90554i() {
        return this.f90022a;
    }

    /* renamed from: j */
    public final String mo90555j() {
        return this.f90026e;
    }

    /* renamed from: k */
    public final Double mo90556k() {
        return this.f90023b;
    }

    public String toString() {
        double d = this.f90022a;
        Double d2 = this.f90023b;
        Double d3 = this.f90024c;
        Double d4 = this.f90025d;
        String str = this.f90026e;
        List list = this.f90027f;
        C37223a aVar = this.f90028g;
        boolean z = this.f90029h;
        boolean z2 = this.f90030i;
        return "ActivationDetailsUiState(loanAmount=" + d + ", repaymentAmount=" + d2 + ", disbursementFee=" + d3 + ", keepAmount=" + d4 + ", loanCcy=" + str + ", details=" + list + ", error=" + aVar + ", loading=" + z + ", activationButtonVisible=" + z2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C37444a(double r14, java.lang.Double r16, java.lang.Double r17, java.lang.Double r18, java.lang.String r19, java.util.List r20, m41.C37223a r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r10 = r1
            goto L_0x000b
        L_0x0009:
            r10 = r21
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r11 = r0
            goto L_0x0014
        L_0x0012:
            r11 = r22
        L_0x0014:
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r12 = r23
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nq0.C37444a.<init>(double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.util.List, m41.a, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
