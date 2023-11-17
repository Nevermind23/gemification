package y91;

import j31.C36725a;
import kotlin.jvm.internal.C41536l;

/* renamed from: y91.b */
public final class C40037b {

    /* renamed from: a */
    private final C36725a f95130a;

    /* renamed from: b */
    private final boolean f95131b;

    /* renamed from: c */
    private final String f95132c;

    /* renamed from: d */
    private final boolean f95133d;

    public C40037b(C36725a aVar, boolean z, String str, boolean z2) {
        C41536l.m120489i(aVar, "externalFile");
        this.f95130a = aVar;
        this.f95131b = z;
        this.f95132c = str;
        this.f95133d = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C40037b m116007b(C40037b bVar, C36725a aVar, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = bVar.f95130a;
        }
        if ((i & 2) != 0) {
            z = bVar.f95131b;
        }
        if ((i & 4) != 0) {
            str = bVar.f95132c;
        }
        if ((i & 8) != 0) {
            z2 = bVar.f95133d;
        }
        return bVar.mo93889a(aVar, z, str, z2);
    }

    /* renamed from: a */
    public final C40037b mo93889a(C36725a aVar, boolean z, String str, boolean z2) {
        C41536l.m120489i(aVar, "externalFile");
        return new C40037b(aVar, z, str, z2);
    }

    /* renamed from: c */
    public final C36725a mo93890c() {
        return this.f95130a;
    }

    /* renamed from: d */
    public final boolean mo93891d() {
        return this.f95131b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40037b)) {
            return false;
        }
        C40037b bVar = (C40037b) obj;
        return C41536l.m120484d(this.f95130a, bVar.f95130a) && this.f95131b == bVar.f95131b && C41536l.m120484d(this.f95132c, bVar.f95132c) && this.f95133d == bVar.f95133d;
    }

    public int hashCode() {
        int hashCode = this.f95130a.hashCode() * 31;
        boolean z = this.f95131b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f95132c;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f95133d;
        if (!z3) {
            z2 = z3;
        }
        return hashCode2 + (z2 ? 1 : 0);
    }

    public String toString() {
        C36725a aVar = this.f95130a;
        boolean z = this.f95131b;
        String str = this.f95132c;
        boolean z2 = this.f95133d;
        return "WishCampaignBackgroundUiModel(externalFile=" + aVar + ", isSelected=" + z + ", fileSubType=" + str + ", isDark=" + z2 + ")";
    }
}
