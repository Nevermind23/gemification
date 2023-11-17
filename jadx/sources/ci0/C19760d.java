package ci0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ci0.d */
public final class C19760d {

    /* renamed from: a */
    private final boolean f54121a;

    /* renamed from: b */
    private final String f54122b;

    public C19760d(boolean z, String str) {
        C41536l.m120489i(str, "amountText");
        this.f54121a = z;
        this.f54122b = str;
    }

    /* renamed from: b */
    public static /* synthetic */ C19760d m65466b(C19760d dVar, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dVar.f54121a;
        }
        if ((i & 2) != 0) {
            str = dVar.f54122b;
        }
        return dVar.mo47971a(z, str);
    }

    /* renamed from: a */
    public final C19760d mo47971a(boolean z, String str) {
        C41536l.m120489i(str, "amountText");
        return new C19760d(z, str);
    }

    /* renamed from: c */
    public final String mo47972c() {
        return this.f54122b;
    }

    /* renamed from: d */
    public final boolean mo47973d() {
        return this.f54121a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19760d)) {
            return false;
        }
        C19760d dVar = (C19760d) obj;
        return this.f54121a == dVar.f54121a && C41536l.m120484d(this.f54122b, dVar.f54122b);
    }

    public int hashCode() {
        boolean z = this.f54121a;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f54122b.hashCode();
    }

    public String toString() {
        boolean z = this.f54121a;
        String str = this.f54122b;
        return "ChooseAmountInputState(isInputVisible=" + z + ", amountText=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19760d(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str);
    }
}
