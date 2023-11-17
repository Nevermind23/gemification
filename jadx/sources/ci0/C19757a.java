package ci0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ci0.a */
public final class C19757a {

    /* renamed from: a */
    private final boolean f54117a;

    public C19757a(boolean z) {
        this.f54117a = z;
    }

    /* renamed from: a */
    public final C19757a mo47956a(boolean z) {
        return new C19757a(z);
    }

    /* renamed from: b */
    public final boolean mo47957b() {
        return this.f54117a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19757a) && this.f54117a == ((C19757a) obj).f54117a;
    }

    public int hashCode() {
        boolean z = this.f54117a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f54117a;
        return "AdditionalInfoTextState(isInfoTextVisible=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19757a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
