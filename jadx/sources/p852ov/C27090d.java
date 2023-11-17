package p852ov;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ov.d */
public final class C27090d {

    /* renamed from: a */
    private final String f68047a;

    /* renamed from: b */
    private final String f68048b;

    /* renamed from: c */
    private final boolean f68049c;

    public C27090d(String str, String str2, boolean z) {
        this.f68047a = str;
        this.f68048b = str2;
        this.f68049c = z;
    }

    /* renamed from: a */
    public final boolean mo66361a() {
        return this.f68049c;
    }

    /* renamed from: b */
    public final String mo66362b() {
        return this.f68047a;
    }

    /* renamed from: c */
    public final String mo66363c() {
        return this.f68048b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27090d)) {
            return false;
        }
        C27090d dVar = (C27090d) obj;
        return C41536l.m120484d(this.f68047a, dVar.f68047a) && C41536l.m120484d(this.f68048b, dVar.f68048b) && this.f68049c == dVar.f68049c;
    }

    public int hashCode() {
        String str = this.f68047a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f68048b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f68049c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f68047a;
        String str2 = this.f68048b;
        boolean z = this.f68049c;
        return "OfferInfoBnpl(offerAmount=" + str + ", offerCcy=" + str2 + ", available=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27090d(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
