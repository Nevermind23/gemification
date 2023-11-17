package p739dv;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: dv.c */
public final class C20104c {

    /* renamed from: a */
    private final long f54732a;

    /* renamed from: b */
    private final String f54733b;

    /* renamed from: c */
    private final long f54734c;

    /* renamed from: d */
    private final BigDecimal f54735d;

    /* renamed from: e */
    private final String f54736e;

    /* renamed from: f */
    private final boolean f54737f;

    /* renamed from: g */
    private final String f54738g;

    /* renamed from: h */
    private final String f54739h;

    /* renamed from: i */
    private final BigDecimal f54740i;

    public C20104c(long j, String str, long j2, BigDecimal bigDecimal, String str2, boolean z, String str3, String str4, BigDecimal bigDecimal2) {
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str2, "format");
        C41536l.m120489i(str4, "prodType");
        this.f54732a = j;
        this.f54733b = str;
        this.f54734c = j2;
        this.f54735d = bigDecimal;
        this.f54736e = str2;
        this.f54737f = z;
        this.f54738g = str3;
        this.f54739h = str4;
        this.f54740i = bigDecimal2;
    }

    /* renamed from: a */
    public final BigDecimal mo48514a() {
        return this.f54735d;
    }

    /* renamed from: b */
    public final BigDecimal mo48515b() {
        return this.f54740i;
    }

    /* renamed from: c */
    public final String mo48516c() {
        return this.f54733b;
    }

    /* renamed from: d */
    public final String mo48517d() {
        return this.f54738g;
    }

    /* renamed from: e */
    public final String mo48518e() {
        return this.f54736e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20104c)) {
            return false;
        }
        C20104c cVar = (C20104c) obj;
        return this.f54732a == cVar.f54732a && C41536l.m120484d(this.f54733b, cVar.f54733b) && this.f54734c == cVar.f54734c && C41536l.m120484d(this.f54735d, cVar.f54735d) && C41536l.m120484d(this.f54736e, cVar.f54736e) && this.f54737f == cVar.f54737f && C41536l.m120484d(this.f54738g, cVar.f54738g) && C41536l.m120484d(this.f54739h, cVar.f54739h) && C41536l.m120484d(this.f54740i, cVar.f54740i);
    }

    /* renamed from: f */
    public final long mo48520f() {
        return this.f54732a;
    }

    /* renamed from: g */
    public final long mo48521g() {
        return this.f54734c;
    }

    /* renamed from: h */
    public final String mo48522h() {
        return this.f54739h;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f54732a) * 31) + this.f54733b.hashCode()) * 31) + C7397t.m28148a(this.f54734c)) * 31) + this.f54735d.hashCode()) * 31) + this.f54736e.hashCode()) * 31;
        boolean z = this.f54737f;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.f54738g;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.f54739h.hashCode()) * 31;
        BigDecimal bigDecimal = this.f54740i;
        if (bigDecimal != null) {
            i2 = bigDecimal.hashCode();
        }
        return hashCode + i2;
    }

    /* renamed from: i */
    public final boolean mo48524i() {
        return this.f54737f;
    }

    public String toString() {
        long j = this.f54732a;
        String str = this.f54733b;
        long j2 = this.f54734c;
        BigDecimal bigDecimal = this.f54735d;
        String str2 = this.f54736e;
        boolean z = this.f54737f;
        String str3 = this.f54738g;
        String str4 = this.f54739h;
        BigDecimal bigDecimal2 = this.f54740i;
        return "AssetLiabilityPoint(id=" + j + ", dictionaryKey=" + str + ", orderNo=" + j2 + ", amount=" + bigDecimal + ", format=" + str2 + ", scoolcardFlag=" + z + ", firstName=" + str3 + ", prodType=" + str4 + ", amountInGel=" + bigDecimal2 + ")";
    }
}
