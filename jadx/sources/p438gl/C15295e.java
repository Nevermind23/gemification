package p438gl;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gl.e */
public final class C15295e {

    /* renamed from: a */
    private final String f43687a;

    /* renamed from: b */
    private final String f43688b;

    /* renamed from: c */
    private final String f43689c;

    /* renamed from: d */
    private final List f43690d;

    /* renamed from: e */
    private final boolean f43691e;

    public C15295e(String str, String str2, String str3, List list, boolean z) {
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(str3, "providerName");
        C41536l.m120489i(list, "packages");
        this.f43687a = str;
        this.f43688b = str2;
        this.f43689c = str3;
        this.f43690d = list;
        this.f43691e = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C15295e m55691b(C15295e eVar, String str, String str2, String str3, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f43687a;
        }
        if ((i & 2) != 0) {
            str2 = eVar.f43688b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = eVar.f43689c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = eVar.f43690d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = eVar.f43691e;
        }
        return eVar.mo42381a(str, str4, str5, list2, z);
    }

    /* renamed from: a */
    public final C15295e mo42381a(String str, String str2, String str3, List list, boolean z) {
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(str3, "providerName");
        C41536l.m120489i(list, "packages");
        return new C15295e(str, str2, str3, list, z);
    }

    /* renamed from: c */
    public final String mo42382c() {
        return this.f43688b;
    }

    /* renamed from: d */
    public final List mo42383d() {
        return this.f43690d;
    }

    /* renamed from: e */
    public final String mo42384e() {
        return this.f43687a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15295e)) {
            return false;
        }
        C15295e eVar = (C15295e) obj;
        return C41536l.m120484d(this.f43687a, eVar.f43687a) && C41536l.m120484d(this.f43688b, eVar.f43688b) && C41536l.m120484d(this.f43689c, eVar.f43689c) && C41536l.m120484d(this.f43690d, eVar.f43690d) && this.f43691e == eVar.f43691e;
    }

    /* renamed from: f */
    public final String mo42386f() {
        return this.f43689c;
    }

    /* renamed from: g */
    public final boolean mo42387g() {
        return this.f43691e;
    }

    public int hashCode() {
        int hashCode = this.f43687a.hashCode() * 31;
        String str = this.f43688b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f43689c.hashCode()) * 31) + this.f43690d.hashCode()) * 31;
        boolean z = this.f43691e;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f43687a;
        String str2 = this.f43688b;
        String str3 = this.f43689c;
        List list = this.f43690d;
        boolean z = this.f43691e;
        return "SelectInsurancePackageUiState(providerId=" + str + ", imageUrl=" + str2 + ", providerName=" + str3 + ", packages=" + list + ", isButtonEnabled=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15295e(String str, String str2, String str3, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i & 16) != 0 ? false : z);
    }
}
