package xy0;

import j31.C36725a;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.h */
public final class C39944h {

    /* renamed from: a */
    private final long f94790a;

    /* renamed from: b */
    private final C39935a0 f94791b;

    /* renamed from: c */
    private final String f94792c;

    /* renamed from: d */
    private final String f94793d;

    /* renamed from: e */
    private final String f94794e;

    /* renamed from: f */
    private final String f94795f;

    /* renamed from: g */
    private final String f94796g;

    /* renamed from: h */
    private final boolean f94797h;

    /* renamed from: i */
    private final C36725a f94798i;

    public C39944h(long j, C39935a0 a0Var, String str, String str2, String str3, String str4, String str5, boolean z, C36725a aVar) {
        C41536l.m120489i(a0Var, "productCode");
        C41536l.m120489i(str, "productDescription");
        C41536l.m120489i(str2, "status");
        C41536l.m120489i(str3, "orderNumber");
        C41536l.m120489i(str4, "productNameKey");
        this.f94790a = j;
        this.f94791b = a0Var;
        this.f94792c = str;
        this.f94793d = str2;
        this.f94794e = str3;
        this.f94795f = str4;
        this.f94796g = str5;
        this.f94797h = z;
        this.f94798i = aVar;
    }

    /* renamed from: a */
    public final C36725a mo93710a() {
        return this.f94798i;
    }

    /* renamed from: b */
    public final String mo93711b() {
        return this.f94796g;
    }

    /* renamed from: c */
    public final boolean mo93712c() {
        return this.f94797h;
    }

    /* renamed from: d */
    public final C39935a0 mo93713d() {
        return this.f94791b;
    }

    /* renamed from: e */
    public final String mo93714e() {
        return this.f94792c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39944h)) {
            return false;
        }
        C39944h hVar = (C39944h) obj;
        return this.f94790a == hVar.f94790a && this.f94791b == hVar.f94791b && C41536l.m120484d(this.f94792c, hVar.f94792c) && C41536l.m120484d(this.f94793d, hVar.f94793d) && C41536l.m120484d(this.f94794e, hVar.f94794e) && C41536l.m120484d(this.f94795f, hVar.f94795f) && C41536l.m120484d(this.f94796g, hVar.f94796g) && this.f94797h == hVar.f94797h && C41536l.m120484d(this.f94798i, hVar.f94798i);
    }

    /* renamed from: f */
    public final String mo93716f() {
        return this.f94795f;
    }

    public int hashCode() {
        int a = ((((((((((C7397t.m28148a(this.f94790a) * 31) + this.f94791b.hashCode()) * 31) + this.f94792c.hashCode()) * 31) + this.f94793d.hashCode()) * 31) + this.f94794e.hashCode()) * 31) + this.f94795f.hashCode()) * 31;
        String str = this.f94796g;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f94797h;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C36725a aVar = this.f94798i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        long j = this.f94790a;
        C39935a0 a0Var = this.f94791b;
        String str = this.f94792c;
        String str2 = this.f94793d;
        String str3 = this.f94794e;
        String str4 = this.f94795f;
        String str5 = this.f94796g;
        boolean z = this.f94797h;
        C36725a aVar = this.f94798i;
        return "CommonGetProductType(id=" + j + ", productCode=" + a0Var + ", productDescription=" + str + ", status=" + str2 + ", orderNumber=" + str3 + ", productNameKey=" + str4 + ", keywords=" + str5 + ", newBadge=" + z + ", externalFile=" + aVar + ")";
    }
}
