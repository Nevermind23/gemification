package m01;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: m01.i */
public final class C37195i {

    /* renamed from: a */
    private final int f89589a;

    /* renamed from: b */
    private final long f89590b;

    /* renamed from: c */
    private final String f89591c;

    /* renamed from: d */
    private final String f89592d;

    /* renamed from: e */
    private final int f89593e;

    /* renamed from: f */
    private final int f89594f;

    /* renamed from: g */
    private final int f89595g;

    /* renamed from: h */
    private final int f89596h;

    /* renamed from: i */
    private final int f89597i;

    /* renamed from: j */
    private final int f89598j;

    /* renamed from: k */
    private final Long f89599k;

    /* renamed from: l */
    private final Long f89600l;

    public C37195i(int i, long j, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, Long l, Long l2) {
        C41536l.m120489i(str, "channelType");
        C41536l.m120489i(str2, "channelTypeDesc");
        this.f89589a = i;
        this.f89590b = j;
        this.f89591c = str;
        this.f89592d = str2;
        this.f89593e = i2;
        this.f89594f = i3;
        this.f89595g = i4;
        this.f89596h = i5;
        this.f89597i = i6;
        this.f89598j = i7;
        this.f89599k = l;
        this.f89600l = l2;
    }

    /* renamed from: a */
    public final int mo90246a() {
        return this.f89598j;
    }

    /* renamed from: b */
    public final String mo90247b() {
        return this.f89591c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37195i)) {
            return false;
        }
        C37195i iVar = (C37195i) obj;
        return this.f89589a == iVar.f89589a && this.f89590b == iVar.f89590b && C41536l.m120484d(this.f89591c, iVar.f89591c) && C41536l.m120484d(this.f89592d, iVar.f89592d) && this.f89593e == iVar.f89593e && this.f89594f == iVar.f89594f && this.f89595g == iVar.f89595g && this.f89596h == iVar.f89596h && this.f89597i == iVar.f89597i && this.f89598j == iVar.f89598j && C41536l.m120484d(this.f89599k, iVar.f89599k) && C41536l.m120484d(this.f89600l, iVar.f89600l);
    }

    public int hashCode() {
        int a = ((((((((((((((((((this.f89589a * 31) + C7397t.m28148a(this.f89590b)) * 31) + this.f89591c.hashCode()) * 31) + this.f89592d.hashCode()) * 31) + this.f89593e) * 31) + this.f89594f) * 31) + this.f89595g) * 31) + this.f89596h) * 31) + this.f89597i) * 31) + this.f89598j) * 31;
        Long l = this.f89599k;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f89600l;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        int i = this.f89589a;
        long j = this.f89590b;
        String str = this.f89591c;
        String str2 = this.f89592d;
        int i2 = this.f89593e;
        int i3 = this.f89594f;
        int i4 = this.f89595g;
        int i5 = this.f89596h;
        int i6 = this.f89597i;
        int i7 = this.f89598j;
        Long l = this.f89599k;
        Long l2 = this.f89600l;
        return "QrDailyLimit(id=" + i + ", cardId=" + j + ", channelType=" + str + ", channelTypeDesc=" + str2 + ", currentCount=" + i2 + ", currentAmount=" + i3 + ", maxLimitCount=" + i4 + ", maxLimitAmount=" + i5 + ", availableLimitCount=" + i6 + ", availableLimitAmount=" + i7 + ", limitStartDate=" + l + ", limitEndDate=" + l2 + ")";
    }
}
