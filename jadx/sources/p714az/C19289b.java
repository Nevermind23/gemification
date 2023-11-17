package p714az;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: az.b */
public final class C19289b {

    /* renamed from: a */
    private final String f53502a;

    /* renamed from: b */
    private final boolean f53503b;

    /* renamed from: c */
    private final boolean f53504c;

    public C19289b(String str, boolean z, boolean z2) {
        this.f53502a = str;
        this.f53503b = z;
        this.f53504c = z2;
    }

    /* renamed from: a */
    public final String mo47517a() {
        return this.f53502a;
    }

    /* renamed from: b */
    public final boolean mo47518b() {
        return this.f53503b;
    }

    /* renamed from: c */
    public final boolean mo47519c() {
        return this.f53504c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19289b)) {
            return false;
        }
        C19289b bVar = (C19289b) obj;
        return C41536l.m120484d(this.f53502a, bVar.f53502a) && this.f53503b == bVar.f53503b && this.f53504c == bVar.f53504c;
    }

    public int hashCode() {
        String str = this.f53502a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f53503b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f53504c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f53502a;
        boolean z = this.f53503b;
        boolean z2 = this.f53504c;
        return "PreLoginBackgroundData(url=" + str + ", isDark=" + z + ", isLoggedIn=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19289b(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
