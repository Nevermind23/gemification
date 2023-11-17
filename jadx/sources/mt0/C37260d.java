package mt0;

import kotlin.jvm.internal.C41536l;

/* renamed from: mt0.d */
public final class C37260d {

    /* renamed from: a */
    private final C37258b f89701a;

    /* renamed from: b */
    private final boolean f89702b;

    public C37260d(C37258b bVar, boolean z) {
        C41536l.m120489i(bVar, "destinationType");
        this.f89701a = bVar;
        this.f89702b = z;
    }

    /* renamed from: a */
    public final C37258b mo90355a() {
        return this.f89701a;
    }

    /* renamed from: b */
    public final boolean mo90356b() {
        return this.f89702b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37260d)) {
            return false;
        }
        C37260d dVar = (C37260d) obj;
        return this.f89701a == dVar.f89701a && this.f89702b == dVar.f89702b;
    }

    public int hashCode() {
        int hashCode = this.f89701a.hashCode() * 31;
        boolean z = this.f89702b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C37258b bVar = this.f89701a;
        boolean z = this.f89702b;
        return "PiggyBankDestination(destinationType=" + bVar + ", withAnimation=" + z + ")";
    }
}
