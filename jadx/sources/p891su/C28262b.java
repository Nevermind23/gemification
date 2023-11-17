package p891su;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: su.b */
public final class C28262b {

    /* renamed from: a */
    private final long f71743a;

    /* renamed from: b */
    private final String f71744b;

    /* renamed from: c */
    private final String f71745c;

    /* renamed from: d */
    private final boolean f71746d;

    /* renamed from: e */
    private final String f71747e;

    public C28262b(long j, String str, String str2, boolean z, String str3) {
        C41536l.m120489i(str, "acctNo");
        this.f71743a = j;
        this.f71744b = str;
        this.f71745c = str2;
        this.f71746d = z;
        this.f71747e = str3;
    }

    /* renamed from: b */
    public static /* synthetic */ C28262b m86885b(C28262b bVar, long j, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bVar.f71743a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = bVar.f71744b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = bVar.f71745c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            z = bVar.f71746d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = bVar.f71747e;
        }
        return bVar.mo67867a(j2, str4, str5, z2, str3);
    }

    /* renamed from: a */
    public final C28262b mo67867a(long j, String str, String str2, boolean z, String str3) {
        C41536l.m120489i(str, "acctNo");
        return new C28262b(j, str, str2, z, str3);
    }

    /* renamed from: c */
    public final String mo67868c() {
        return this.f71747e;
    }

    /* renamed from: d */
    public final String mo67869d() {
        return this.f71744b;
    }

    /* renamed from: e */
    public final String mo67870e() {
        return this.f71745c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28262b)) {
            return false;
        }
        C28262b bVar = (C28262b) obj;
        return this.f71743a == bVar.f71743a && C41536l.m120484d(this.f71744b, bVar.f71744b) && C41536l.m120484d(this.f71745c, bVar.f71745c) && this.f71746d == bVar.f71746d && C41536l.m120484d(this.f71747e, bVar.f71747e);
    }

    /* renamed from: f */
    public final long mo67872f() {
        return this.f71743a;
    }

    /* renamed from: g */
    public final boolean mo67873g() {
        return this.f71746d;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f71743a) * 31) + this.f71744b.hashCode()) * 31;
        String str = this.f71745c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f71746d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f71747e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        long j = this.f71743a;
        String str = this.f71744b;
        String str2 = this.f71745c;
        boolean z = this.f71746d;
        String str3 = this.f71747e;
        return "ContactAccount(id=" + j + ", acctNo=" + str + ", bank=" + str2 + ", isDefault=" + z + ", acctName=" + str3 + ")";
    }
}
