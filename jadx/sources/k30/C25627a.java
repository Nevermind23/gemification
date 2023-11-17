package k30;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: k30.a */
public final class C25627a {

    /* renamed from: a */
    private final List f65354a;

    /* renamed from: b */
    private final boolean f65355b;

    /* renamed from: c */
    private final boolean f65356c;

    /* renamed from: d */
    private final boolean f65357d;

    public C25627a(List list, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(list, "offers");
        this.f65354a = list;
        this.f65355b = z;
        this.f65356c = z2;
        this.f65357d = z3;
    }

    /* renamed from: a */
    public final List mo64158a() {
        return this.f65354a;
    }

    /* renamed from: b */
    public final boolean mo64159b() {
        return this.f65357d;
    }

    /* renamed from: c */
    public final boolean mo64160c() {
        return this.f65355b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25627a)) {
            return false;
        }
        C25627a aVar = (C25627a) obj;
        return C41536l.m120484d(this.f65354a, aVar.f65354a) && this.f65355b == aVar.f65355b && this.f65356c == aVar.f65356c && this.f65357d == aVar.f65357d;
    }

    public int hashCode() {
        int hashCode = this.f65354a.hashCode() * 31;
        boolean z = this.f65355b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f65356c;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f65357d;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        List list = this.f65354a;
        boolean z = this.f65355b;
        boolean z2 = this.f65356c;
        boolean z3 = this.f65357d;
        return "OfferInfoUIModel(offers=" + list + ", isActive=" + z + ", statusChangeAllowed=" + z2 + ", showBanner=" + z3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25627a(List list, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? true : z3);
    }
}
