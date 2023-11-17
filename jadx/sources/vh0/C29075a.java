package vh0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import xh0.C29780a;

/* renamed from: vh0.a */
public final class C29075a {

    /* renamed from: a */
    private final long f74062a;

    /* renamed from: b */
    private final String f74063b;

    /* renamed from: c */
    private final String f74064c;

    /* renamed from: d */
    private final C29780a f74065d;

    public C29075a(long j, String str, String str2, C29780a aVar) {
        C41536l.m120489i(aVar, "externalFile");
        this.f74062a = j;
        this.f74063b = str;
        this.f74064c = str2;
        this.f74065d = aVar;
    }

    /* renamed from: a */
    public final String mo68928a() {
        return this.f74063b;
    }

    /* renamed from: b */
    public final C29780a mo68929b() {
        return this.f74065d;
    }

    /* renamed from: c */
    public final long mo68930c() {
        return this.f74062a;
    }

    /* renamed from: d */
    public final String mo68931d() {
        return this.f74064c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29075a)) {
            return false;
        }
        C29075a aVar = (C29075a) obj;
        return this.f74062a == aVar.f74062a && C41536l.m120484d(this.f74063b, aVar.f74063b) && C41536l.m120484d(this.f74064c, aVar.f74064c) && C41536l.m120484d(this.f74065d, aVar.f74065d);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f74062a) * 31;
        String str = this.f74063b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74064c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f74065d.hashCode();
    }

    public String toString() {
        long j = this.f74062a;
        String str = this.f74063b;
        String str2 = this.f74064c;
        C29780a aVar = this.f74065d;
        return "Design(id=" + j + ", designName=" + str + ", logoUrl=" + str2 + ", externalFile=" + aVar + ")";
    }
}
