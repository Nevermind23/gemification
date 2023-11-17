package ec0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ec0.c */
public final class C20211c {

    /* renamed from: a */
    private final List f54904a;

    /* renamed from: b */
    private final int f54905b;

    /* renamed from: c */
    private final boolean f54906c;

    public C20211c(List list, int i, boolean z) {
        C41536l.m120489i(list, "items");
        this.f54904a = list;
        this.f54905b = i;
        this.f54906c = z;
    }

    /* renamed from: a */
    public final boolean mo48625a() {
        return this.f54906c;
    }

    /* renamed from: b */
    public final int mo48626b() {
        return this.f54905b;
    }

    /* renamed from: c */
    public final List mo48627c() {
        return this.f54904a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20211c)) {
            return false;
        }
        C20211c cVar = (C20211c) obj;
        return C41536l.m120484d(this.f54904a, cVar.f54904a) && this.f54905b == cVar.f54905b && this.f54906c == cVar.f54906c;
    }

    public int hashCode() {
        int hashCode = ((this.f54904a.hashCode() * 31) + this.f54905b) * 31;
        boolean z = this.f54906c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        List list = this.f54904a;
        int i = this.f54905b;
        boolean z = this.f54906c;
        return "DepositDetailsHeaderData(items=" + list + ", initialIndex=" + i + ", allowSmoothScroll=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20211c(List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, (i2 & 4) != 0 ? false : z);
    }
}
