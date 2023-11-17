package p591rk;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.C13606a;

/* renamed from: rk.k */
public final class C17631k {

    /* renamed from: a */
    private final String f49352a;

    /* renamed from: b */
    private final C13606a f49353b;

    /* renamed from: c */
    private final boolean f49354c;

    /* renamed from: d */
    private final boolean f49355d;

    /* renamed from: e */
    private final boolean f49356e;

    public C17631k(String str, C13606a aVar, boolean z, boolean z2) {
        C41536l.m120489i(aVar, "carOwner");
        this.f49352a = str;
        this.f49353b = aVar;
        this.f49354c = z;
        this.f49355d = z2;
        boolean z3 = false;
        if (!(str == null || str.length() == 0) && z && z2) {
            z3 = true;
        }
        this.f49356e = z3;
    }

    /* renamed from: b */
    public static /* synthetic */ C17631k m61276b(C17631k kVar, String str, C13606a aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kVar.f49352a;
        }
        if ((i & 2) != 0) {
            aVar = kVar.f49353b;
        }
        if ((i & 4) != 0) {
            z = kVar.f49354c;
        }
        if ((i & 8) != 0) {
            z2 = kVar.f49355d;
        }
        return kVar.mo45215a(str, aVar, z, z2);
    }

    /* renamed from: a */
    public final C17631k mo45215a(String str, C13606a aVar, boolean z, boolean z2) {
        C41536l.m120489i(aVar, "carOwner");
        return new C17631k(str, aVar, z, z2);
    }

    /* renamed from: c */
    public final String mo45216c() {
        return this.f49352a;
    }

    /* renamed from: d */
    public final C13606a mo45217d() {
        return this.f49353b;
    }

    /* renamed from: e */
    public final boolean mo45218e() {
        return this.f49354c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17631k)) {
            return false;
        }
        C17631k kVar = (C17631k) obj;
        return C41536l.m120484d(this.f49352a, kVar.f49352a) && this.f49353b == kVar.f49353b && this.f49354c == kVar.f49354c && this.f49355d == kVar.f49355d;
    }

    /* renamed from: f */
    public final boolean mo45220f() {
        return this.f49355d;
    }

    /* renamed from: g */
    public final boolean mo45221g() {
        return this.f49356e;
    }

    public int hashCode() {
        String str = this.f49352a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f49353b.hashCode()) * 31;
        boolean z = this.f49354c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f49355d;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f49352a;
        C13606a aVar = this.f49353b;
        boolean z = this.f49354c;
        boolean z2 = this.f49355d;
        return "CarNumberInputUiState(carNumber=" + str + ", carOwner=" + aVar + ", insuranceTermsAndConditionsAccepted=" + z + ", miaTermsAndConditionsAccepted=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17631k(String str, C13606a aVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13606a.MINE : aVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
