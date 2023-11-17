package yi0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yi0.e */
public final class C30071e {

    /* renamed from: a */
    private final String f75897a;

    /* renamed from: b */
    private final boolean f75898b;

    public C30071e(String str, boolean z) {
        C41536l.m120489i(str, "text");
        this.f75897a = str;
        this.f75898b = z;
    }

    /* renamed from: a */
    public final boolean mo70343a() {
        return this.f75898b;
    }

    /* renamed from: b */
    public final String mo70344b() {
        return this.f75897a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30071e)) {
            return false;
        }
        C30071e eVar = (C30071e) obj;
        return C41536l.m120484d(this.f75897a, eVar.f75897a) && this.f75898b == eVar.f75898b;
    }

    public int hashCode() {
        int hashCode = this.f75897a.hashCode() * 31;
        boolean z = this.f75898b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f75897a;
        boolean z = this.f75898b;
        return "GiftCardsNominationInputModel(text=" + str + ", fromTemplate=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30071e(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
