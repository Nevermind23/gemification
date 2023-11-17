package r30;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: r30.c */
public final class C27896c {

    /* renamed from: a */
    private final long f71052a;

    /* renamed from: b */
    private final String f71053b;

    /* renamed from: c */
    private final String f71054c;

    /* renamed from: d */
    private final String f71055d;

    /* renamed from: e */
    private final int f71056e;

    /* renamed from: f */
    private final double f71057f;

    /* renamed from: g */
    private final String f71058g;

    public C27896c(long j, String str, String str2, String str3, int i, double d, String str4) {
        this.f71052a = j;
        this.f71053b = str;
        this.f71054c = str2;
        this.f71055d = str3;
        this.f71056e = i;
        this.f71057f = d;
        this.f71058g = str4;
    }

    /* renamed from: a */
    public final double mo67450a() {
        return this.f71057f;
    }

    /* renamed from: b */
    public final String mo67451b() {
        return this.f71058g;
    }

    /* renamed from: c */
    public final int mo67452c() {
        return this.f71056e;
    }

    /* renamed from: d */
    public final String mo67453d() {
        return this.f71053b;
    }

    /* renamed from: e */
    public final String mo67454e() {
        return this.f71054c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27896c)) {
            return false;
        }
        C27896c cVar = (C27896c) obj;
        return this.f71052a == cVar.f71052a && C41536l.m120484d(this.f71053b, cVar.f71053b) && C41536l.m120484d(this.f71054c, cVar.f71054c) && C41536l.m120484d(this.f71055d, cVar.f71055d) && this.f71056e == cVar.f71056e && Double.compare(this.f71057f, cVar.f71057f) == 0 && C41536l.m120484d(this.f71058g, cVar.f71058g);
    }

    /* renamed from: f */
    public final String mo67456f() {
        return this.f71055d;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f71052a) * 31;
        String str = this.f71053b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71054c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71055d;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f71056e) * 31) + Double.doubleToLongBits(this.f71057f)) * 31;
        String str4 = this.f71058g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.f71052a;
        String str = this.f71053b;
        String str2 = this.f71054c;
        String str3 = this.f71055d;
        int i = this.f71056e;
        double d = this.f71057f;
        String str4 = this.f71058g;
        return "MoneyRequestBottomSheetModel(requestId=" + j + ", name=" + str + ", nickname=" + str2 + ", profilePictureUrl=" + str3 + ", iconDrawableRes=" + i + ", amount=" + d + ", description=" + str4 + ")";
    }
}
