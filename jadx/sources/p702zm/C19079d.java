package p702zm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p603si.C17799b;
import p702zm.C19074c;

/* renamed from: zm.d */
public final class C19079d {

    /* renamed from: a */
    private final C19074c.C19076b f53251a;

    /* renamed from: b */
    private final C19074c.C19078d f53252b;

    /* renamed from: c */
    private final C19074c.C19078d f53253c;

    /* renamed from: d */
    private final C19074c.C19075a f53254d;

    public C19079d(C19074c.C19076b bVar, C19074c.C19078d dVar, C19074c.C19078d dVar2, C19074c.C19075a aVar) {
        C41536l.m120489i(bVar, "chosenDistrict");
        C41536l.m120489i(dVar, "deliveryAddress");
        C41536l.m120489i(dVar2, "phoneNumber");
        C41536l.m120489i(aVar, "isChecked");
        this.f53251a = bVar;
        this.f53252b = dVar;
        this.f53253c = dVar2;
        this.f53254d = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C19079d m64423b(C19079d dVar, C19074c.C19076b bVar, C19074c.C19078d dVar2, C19074c.C19078d dVar3, C19074c.C19075a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = dVar.f53251a;
        }
        if ((i & 2) != 0) {
            dVar2 = dVar.f53252b;
        }
        if ((i & 4) != 0) {
            dVar3 = dVar.f53253c;
        }
        if ((i & 8) != 0) {
            aVar = dVar.f53254d;
        }
        return dVar.mo47282a(bVar, dVar2, dVar3, aVar);
    }

    /* renamed from: a */
    public final C19079d mo47282a(C19074c.C19076b bVar, C19074c.C19078d dVar, C19074c.C19078d dVar2, C19074c.C19075a aVar) {
        C41536l.m120489i(bVar, "chosenDistrict");
        C41536l.m120489i(dVar, "deliveryAddress");
        C41536l.m120489i(dVar2, "phoneNumber");
        C41536l.m120489i(aVar, "isChecked");
        return new C19079d(bVar, dVar, dVar2, aVar);
    }

    /* renamed from: c */
    public final C19074c.C19076b mo47283c() {
        return this.f53251a;
    }

    /* renamed from: d */
    public final C19074c.C19078d mo47284d() {
        return this.f53252b;
    }

    /* renamed from: e */
    public final C19074c.C19078d mo47285e() {
        return this.f53253c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19079d)) {
            return false;
        }
        C19079d dVar = (C19079d) obj;
        return C41536l.m120484d(this.f53251a, dVar.f53251a) && C41536l.m120484d(this.f53252b, dVar.f53252b) && C41536l.m120484d(this.f53253c, dVar.f53253c) && C41536l.m120484d(this.f53254d, dVar.f53254d);
    }

    /* renamed from: f */
    public final C19074c.C19075a mo47287f() {
        return this.f53254d;
    }

    /* renamed from: g */
    public final boolean mo47288g() {
        if (this.f53251a.mo47271b() == null || !this.f53252b.mo47277c() || !this.f53253c.mo47277c() || !this.f53254d.mo47266c().booleanValue()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f53251a.hashCode() * 31) + this.f53252b.hashCode()) * 31) + this.f53253c.hashCode()) * 31) + this.f53254d.hashCode();
    }

    public String toString() {
        C19074c.C19076b bVar = this.f53251a;
        C19074c.C19078d dVar = this.f53252b;
        C19074c.C19078d dVar2 = this.f53253c;
        C19074c.C19075a aVar = this.f53254d;
        return "InstantDeliveryInput(chosenDistrict=" + bVar + ", deliveryAddress=" + dVar + ", phoneNumber=" + dVar2 + ", isChecked=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19079d(C19074c.C19076b bVar, C19074c.C19078d dVar, C19074c.C19078d dVar2, C19074c.C19075a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C19074c.C19076b((C19072a) null, 1, (DefaultConstructorMarker) null) : bVar, (i & 2) != 0 ? new C19074c.C19078d((String) null, false, false, (C17799b) null, 15, (DefaultConstructorMarker) null) : dVar, (i & 4) != 0 ? new C19074c.C19078d((String) null, false, false, (C17799b) null, 15, (DefaultConstructorMarker) null) : dVar2, (i & 8) != 0 ? new C19074c.C19075a(false, false, false, 7, (DefaultConstructorMarker) null) : aVar);
    }
}
