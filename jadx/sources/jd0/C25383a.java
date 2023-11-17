package jd0;

import kotlin.jvm.internal.C41536l;

/* renamed from: jd0.a */
public final class C25383a {

    /* renamed from: a */
    private final String f65030a;

    /* renamed from: b */
    private final String f65031b;

    /* renamed from: c */
    private final String f65032c;

    /* renamed from: d */
    private final boolean f65033d;

    public C25383a(String str, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "headerDictionaryKey");
        C41536l.m120489i(str2, "detailDictionaryKey");
        C41536l.m120489i(str3, "iconServiceUrl");
        this.f65030a = str;
        this.f65031b = str2;
        this.f65032c = str3;
        this.f65033d = z;
    }

    /* renamed from: a */
    public final String mo63970a() {
        return this.f65031b;
    }

    /* renamed from: b */
    public final String mo63971b() {
        return this.f65030a;
    }

    /* renamed from: c */
    public final String mo63972c() {
        return this.f65032c;
    }

    /* renamed from: d */
    public final boolean mo63973d() {
        return this.f65033d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25383a)) {
            return false;
        }
        C25383a aVar = (C25383a) obj;
        return C41536l.m120484d(this.f65030a, aVar.f65030a) && C41536l.m120484d(this.f65031b, aVar.f65031b) && C41536l.m120484d(this.f65032c, aVar.f65032c) && this.f65033d == aVar.f65033d;
    }

    public int hashCode() {
        int hashCode = ((((this.f65030a.hashCode() * 31) + this.f65031b.hashCode()) * 31) + this.f65032c.hashCode()) * 31;
        boolean z = this.f65033d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f65030a;
        String str2 = this.f65031b;
        String str3 = this.f65032c;
        boolean z = this.f65033d;
        return "CrossSalePackage(headerDictionaryKey=" + str + ", detailDictionaryKey=" + str2 + ", iconServiceUrl=" + str3 + ", showFlag=" + z + ")";
    }
}
