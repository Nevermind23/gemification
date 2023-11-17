package xf0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xf0.d */
public final class C29765d {

    /* renamed from: a */
    private final String f75293a;

    /* renamed from: b */
    private final String f75294b;

    /* renamed from: c */
    private final boolean f75295c;

    /* renamed from: d */
    private boolean f75296d;

    public C29765d(String str, String str2, boolean z, boolean z2) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "name");
        this.f75293a = str;
        this.f75294b = str2;
        this.f75295c = z;
        this.f75296d = z2;
    }

    /* renamed from: a */
    public final String mo69921a() {
        return this.f75293a;
    }

    /* renamed from: b */
    public final String mo69922b() {
        return this.f75294b;
    }

    /* renamed from: c */
    public final boolean mo69923c() {
        return this.f75295c;
    }

    /* renamed from: d */
    public final boolean mo69924d() {
        return this.f75296d;
    }

    /* renamed from: e */
    public final void mo69925e(boolean z) {
        this.f75296d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29765d)) {
            return false;
        }
        C29765d dVar = (C29765d) obj;
        return C41536l.m120484d(this.f75293a, dVar.f75293a) && C41536l.m120484d(this.f75294b, dVar.f75294b) && this.f75295c == dVar.f75295c && this.f75296d == dVar.f75296d;
    }

    public int hashCode() {
        int hashCode = ((this.f75293a.hashCode() * 31) + this.f75294b.hashCode()) * 31;
        boolean z = this.f75295c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f75296d;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f75293a;
        String str2 = this.f75294b;
        boolean z = this.f75295c;
        boolean z2 = this.f75296d;
        return "SelectableSubTypeUIModel(id=" + str + ", name=" + str2 + ", isDefault=" + z + ", isSelected=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29765d(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
