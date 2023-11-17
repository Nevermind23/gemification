package p674xm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xm.n */
public final class C18812n {

    /* renamed from: a */
    private final String f52561a;

    /* renamed from: b */
    private final String f52562b;

    /* renamed from: c */
    private final boolean f52563c;

    public C18812n(String str, String str2, boolean z) {
        this.f52561a = str;
        this.f52562b = str2;
        this.f52563c = z;
    }

    /* renamed from: a */
    public final String mo46657a() {
        return this.f52562b;
    }

    /* renamed from: b */
    public final String mo46658b() {
        return this.f52561a;
    }

    /* renamed from: c */
    public final boolean mo46659c() {
        return this.f52563c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18812n)) {
            return false;
        }
        C18812n nVar = (C18812n) obj;
        return C41536l.m120484d(this.f52561a, nVar.f52561a) && C41536l.m120484d(this.f52562b, nVar.f52562b) && this.f52563c == nVar.f52563c;
    }

    public int hashCode() {
        String str = this.f52561a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f52562b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f52563c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f52561a;
        String str2 = this.f52562b;
        boolean z = this.f52563c;
        return "InfoBoxData(title=" + str + ", caption=" + str2 + ", isVisible=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18812n(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
