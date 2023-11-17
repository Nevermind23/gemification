package zs0;

import kotlin.jvm.internal.C41536l;

/* renamed from: zs0.c */
public final class C40250c {

    /* renamed from: a */
    private final int f95650a;

    /* renamed from: b */
    private final String f95651b;

    /* renamed from: c */
    private final int f95652c;

    /* renamed from: d */
    private final double f95653d;

    /* renamed from: e */
    private final String f95654e;

    public C40250c(int i, String str, int i2, double d, String str2) {
        C41536l.m120489i(str, "monthDictionaryKey");
        C41536l.m120489i(str2, "ccy");
        this.f95650a = i;
        this.f95651b = str;
        this.f95652c = i2;
        this.f95653d = d;
        this.f95654e = str2;
    }

    /* renamed from: a */
    public final double mo94218a() {
        return this.f95653d;
    }

    /* renamed from: b */
    public final String mo94219b() {
        return this.f95654e;
    }

    /* renamed from: c */
    public final String mo94220c() {
        return this.f95651b;
    }

    /* renamed from: d */
    public final int mo94221d() {
        return this.f95652c;
    }

    /* renamed from: e */
    public final int mo94222e() {
        return this.f95650a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40250c)) {
            return false;
        }
        C40250c cVar = (C40250c) obj;
        return this.f95650a == cVar.f95650a && C41536l.m120484d(this.f95651b, cVar.f95651b) && this.f95652c == cVar.f95652c && Double.compare(this.f95653d, cVar.f95653d) == 0 && C41536l.m120484d(this.f95654e, cVar.f95654e);
    }

    public int hashCode() {
        return (((((((this.f95650a * 31) + this.f95651b.hashCode()) * 31) + this.f95652c) * 31) + Double.doubleToLongBits(this.f95653d)) * 31) + this.f95654e.hashCode();
    }

    public String toString() {
        int i = this.f95650a;
        String str = this.f95651b;
        int i2 = this.f95652c;
        double d = this.f95653d;
        String str2 = this.f95654e;
        return "CasHistoryItem(orderNo=" + i + ", monthDictionaryKey=" + str + ", operationCount=" + i2 + ", amount=" + d + ", ccy=" + str2 + ")";
    }
}
