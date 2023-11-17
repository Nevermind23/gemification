package a30;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: a30.c */
public final class C19158c {

    /* renamed from: a */
    private final long f53345a;

    /* renamed from: b */
    private final String f53346b;

    /* renamed from: c */
    private final String f53347c;

    /* renamed from: d */
    private final String f53348d;

    /* renamed from: e */
    private final int f53349e;

    /* renamed from: f */
    private final boolean f53350f;

    public C19158c(long j, String str, String str2, String str3, int i, boolean z) {
        C41536l.m120489i(str2, "contactName");
        this.f53345a = j;
        this.f53346b = str;
        this.f53347c = str2;
        this.f53348d = str3;
        this.f53349e = i;
        this.f53350f = z;
    }

    /* renamed from: a */
    public final String mo47368a() {
        return this.f53347c;
    }

    /* renamed from: b */
    public final int mo47369b() {
        return this.f53349e;
    }

    /* renamed from: c */
    public final String mo47370c() {
        return this.f53348d;
    }

    /* renamed from: d */
    public final long mo47371d() {
        return this.f53345a;
    }

    /* renamed from: e */
    public final String mo47372e() {
        return this.f53346b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19158c)) {
            return false;
        }
        C19158c cVar = (C19158c) obj;
        return this.f53345a == cVar.f53345a && C41536l.m120484d(this.f53346b, cVar.f53346b) && C41536l.m120484d(this.f53347c, cVar.f53347c) && C41536l.m120484d(this.f53348d, cVar.f53348d) && this.f53349e == cVar.f53349e && this.f53350f == cVar.f53350f;
    }

    /* renamed from: f */
    public final boolean mo47374f() {
        return this.f53350f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f53345a) * 31;
        String str = this.f53346b;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f53347c.hashCode()) * 31;
        String str2 = this.f53348d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (((hashCode + i) * 31) + this.f53349e) * 31;
        boolean z = this.f53350f;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        long j = this.f53345a;
        String str = this.f53346b;
        String str2 = this.f53347c;
        String str3 = this.f53348d;
        int i = this.f53349e;
        boolean z = this.f53350f;
        return "MoneyRequestContactModel(id=" + j + ", profilePictureUrl=" + str + ", contactName=" + str2 + ", description=" + str3 + ", defaultIconRes=" + i + ", isSelected=" + z + ")";
    }
}
