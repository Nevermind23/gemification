package iv0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: iv0.h */
public final class C36556h {

    /* renamed from: a */
    private final String f88103a;

    /* renamed from: b */
    private final String f88104b;

    /* renamed from: c */
    private final String f88105c;

    /* renamed from: d */
    private final String f88106d;

    /* renamed from: e */
    private final long f88107e;

    /* renamed from: f */
    private final long f88108f;

    /* renamed from: g */
    private final boolean f88109g;

    /* renamed from: h */
    private final List f88110h;

    public C36556h(String str, String str2, String str3, String str4, long j, long j2, boolean z, List list) {
        C41536l.m120489i(str, "bankId");
        C41536l.m120489i(str3, "bankBic");
        C41536l.m120489i(str4, "consentId");
        C41536l.m120489i(list, "data");
        this.f88103a = str;
        this.f88104b = str2;
        this.f88105c = str3;
        this.f88106d = str4;
        this.f88107e = j;
        this.f88108f = j2;
        this.f88109g = z;
        this.f88110h = list;
    }

    /* renamed from: a */
    public final String mo89369a() {
        return this.f88105c;
    }

    /* renamed from: b */
    public final String mo89370b() {
        return this.f88103a;
    }

    /* renamed from: c */
    public final String mo89371c() {
        return this.f88104b;
    }

    /* renamed from: d */
    public final String mo89372d() {
        return this.f88106d;
    }

    /* renamed from: e */
    public final List mo89373e() {
        return this.f88110h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36556h)) {
            return false;
        }
        C36556h hVar = (C36556h) obj;
        return C41536l.m120484d(this.f88103a, hVar.f88103a) && C41536l.m120484d(this.f88104b, hVar.f88104b) && C41536l.m120484d(this.f88105c, hVar.f88105c) && C41536l.m120484d(this.f88106d, hVar.f88106d) && this.f88107e == hVar.f88107e && this.f88108f == hVar.f88108f && this.f88109g == hVar.f88109g && C41536l.m120484d(this.f88110h, hVar.f88110h);
    }

    /* renamed from: f */
    public final long mo89375f() {
        return this.f88108f;
    }

    /* renamed from: g */
    public final long mo89376g() {
        return this.f88107e;
    }

    /* renamed from: h */
    public final boolean mo89377h() {
        return this.f88109g;
    }

    public int hashCode() {
        int hashCode = this.f88103a.hashCode() * 31;
        String str = this.f88104b;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f88105c.hashCode()) * 31) + this.f88106d.hashCode()) * 31) + C7397t.m28148a(this.f88107e)) * 31) + C7397t.m28148a(this.f88108f)) * 31;
        boolean z = this.f88109g;
        if (z) {
            z = true;
        }
        return ((hashCode2 + (z ? 1 : 0)) * 31) + this.f88110h.hashCode();
    }

    public String toString() {
        String str = this.f88103a;
        String str2 = this.f88104b;
        String str3 = this.f88105c;
        String str4 = this.f88106d;
        long j = this.f88107e;
        long j2 = this.f88108f;
        boolean z = this.f88109g;
        List list = this.f88110h;
        return "OpenBankProduct(bankId=" + str + ", bankName=" + str2 + ", bankBic=" + str3 + ", consentId=" + str4 + ", lastUpdateTime=" + j + ", expirationDate=" + j2 + ", isExpired=" + z + ", data=" + list + ")";
    }
}
