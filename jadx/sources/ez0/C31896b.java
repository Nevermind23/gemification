package ez0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ez0.b */
public final class C31896b {

    /* renamed from: a */
    private final String f78622a;

    /* renamed from: b */
    private final boolean f78623b;

    /* renamed from: c */
    private final boolean f78624c;

    public C31896b(String str, boolean z, boolean z2) {
        C41536l.m120489i(str, "text");
        this.f78622a = str;
        this.f78623b = z;
        this.f78624c = z2;
    }

    /* renamed from: a */
    public final boolean mo72319a() {
        return this.f78623b;
    }

    /* renamed from: b */
    public final String mo72320b() {
        return this.f78622a;
    }

    /* renamed from: c */
    public final boolean mo72321c() {
        return this.f78624c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31896b)) {
            return false;
        }
        C31896b bVar = (C31896b) obj;
        return C41536l.m120484d(this.f78622a, bVar.f78622a) && this.f78623b == bVar.f78623b && this.f78624c == bVar.f78624c;
    }

    public int hashCode() {
        int hashCode = this.f78622a.hashCode() * 31;
        boolean z = this.f78623b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f78624c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f78622a;
        boolean z = this.f78623b;
        boolean z2 = this.f78624c;
        return "ChooseButtonState(text=" + str + ", enabled=" + z + ", isLoading=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31896b(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
