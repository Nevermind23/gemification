package ef0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ef0.f */
public final class C20231f {

    /* renamed from: a */
    private final String f55119a;

    /* renamed from: b */
    private final String f55120b;

    /* renamed from: c */
    private final boolean f55121c;

    public C20231f(String str, String str2, boolean z) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "name");
        this.f55119a = str;
        this.f55120b = str2;
        this.f55121c = z;
    }

    /* renamed from: a */
    public final String mo48696a() {
        return this.f55119a;
    }

    /* renamed from: b */
    public final String mo48697b() {
        return this.f55120b;
    }

    /* renamed from: c */
    public final boolean mo48698c() {
        return this.f55121c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20231f)) {
            return false;
        }
        C20231f fVar = (C20231f) obj;
        return C41536l.m120484d(this.f55119a, fVar.f55119a) && C41536l.m120484d(this.f55120b, fVar.f55120b) && this.f55121c == fVar.f55121c;
    }

    public int hashCode() {
        int hashCode = ((this.f55119a.hashCode() * 31) + this.f55120b.hashCode()) * 31;
        boolean z = this.f55121c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f55119a;
        String str2 = this.f55120b;
        boolean z = this.f55121c;
        return "SelectableSubTypeModel(id=" + str + ", name=" + str2 + ", isDefault=" + z + ")";
    }
}
