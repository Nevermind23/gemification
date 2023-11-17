package nn0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: nn0.s */
public final class C17131s {

    /* renamed from: a */
    private final int f47946a;

    /* renamed from: b */
    private final String f47947b;

    /* renamed from: c */
    private final String f47948c;

    /* renamed from: d */
    private final String f47949d;

    /* renamed from: e */
    private final List f47950e;

    /* renamed from: f */
    private final boolean f47951f;

    public C17131s(int i, String str, String str2, String str3, List list, boolean z) {
        C41536l.m120489i(str, "employer");
        C41536l.m120489i(str2, "jobPosition");
        C41536l.m120489i(str3, "businessName");
        C41536l.m120489i(list, "items");
        this.f47946a = i;
        this.f47947b = str;
        this.f47948c = str2;
        this.f47949d = str3;
        this.f47950e = list;
        this.f47951f = z;
    }

    /* renamed from: a */
    public final String mo44541a() {
        return this.f47949d;
    }

    /* renamed from: b */
    public final String mo44542b() {
        return this.f47947b;
    }

    /* renamed from: c */
    public final List mo44543c() {
        return this.f47950e;
    }

    /* renamed from: d */
    public final String mo44544d() {
        return this.f47948c;
    }

    /* renamed from: e */
    public final int mo44545e() {
        return this.f47946a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17131s)) {
            return false;
        }
        C17131s sVar = (C17131s) obj;
        return this.f47946a == sVar.f47946a && C41536l.m120484d(this.f47947b, sVar.f47947b) && C41536l.m120484d(this.f47948c, sVar.f47948c) && C41536l.m120484d(this.f47949d, sVar.f47949d) && C41536l.m120484d(this.f47950e, sVar.f47950e) && this.f47951f == sVar.f47951f;
    }

    /* renamed from: f */
    public final boolean mo44547f() {
        return this.f47951f;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f47946a * 31) + this.f47947b.hashCode()) * 31) + this.f47948c.hashCode()) * 31) + this.f47949d.hashCode()) * 31) + this.f47950e.hashCode()) * 31;
        boolean z = this.f47951f;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        int i = this.f47946a;
        String str = this.f47947b;
        String str2 = this.f47948c;
        String str3 = this.f47949d;
        List list = this.f47950e;
        boolean z = this.f47951f;
        return "SelectOccupationUiState(selectedItemId=" + i + ", employer=" + str + ", jobPosition=" + str2 + ", businessName=" + str3 + ", items=" + list + ", isButtonActive=" + z + ")";
    }
}
