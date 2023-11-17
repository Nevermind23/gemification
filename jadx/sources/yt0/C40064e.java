package yt0;

import hd0.C24978b;
import kotlin.jvm.internal.C41536l;

/* renamed from: yt0.e */
public final class C40064e {

    /* renamed from: a */
    private final int f95231a;

    /* renamed from: b */
    private final String f95232b;

    /* renamed from: c */
    private final C24978b f95233c;

    /* renamed from: d */
    private final int f95234d;

    public C40064e(int i, String str, C24978b bVar, int i2) {
        C41536l.m120489i(str, "labelCategoryDesc");
        C41536l.m120489i(bVar, "isActive");
        this.f95231a = i;
        this.f95232b = str;
        this.f95233c = bVar;
        this.f95234d = i2;
    }

    /* renamed from: a */
    public final int mo93991a() {
        return this.f95231a;
    }

    /* renamed from: b */
    public final String mo93992b() {
        return this.f95232b;
    }

    /* renamed from: c */
    public final int mo93993c() {
        return this.f95234d;
    }

    /* renamed from: d */
    public final C24978b mo93994d() {
        return this.f95233c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40064e)) {
            return false;
        }
        C40064e eVar = (C40064e) obj;
        return this.f95231a == eVar.f95231a && C41536l.m120484d(this.f95232b, eVar.f95232b) && this.f95233c == eVar.f95233c && this.f95234d == eVar.f95234d;
    }

    public int hashCode() {
        return (((((this.f95231a * 31) + this.f95232b.hashCode()) * 31) + this.f95233c.hashCode()) * 31) + this.f95234d;
    }

    public String toString() {
        int i = this.f95231a;
        String str = this.f95232b;
        C24978b bVar = this.f95233c;
        int i2 = this.f95234d;
        return "SubProduct(categoryCoefficient=" + i + ", labelCategoryDesc=" + str + ", isActive=" + bVar + ", orderId=" + i2 + ")";
    }
}
