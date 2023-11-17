package p622tn;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: tn.a */
public final class C18030a {

    /* renamed from: a */
    private final long f51253a;

    /* renamed from: b */
    private final long f51254b;

    /* renamed from: c */
    private final String f51255c;

    /* renamed from: d */
    private final String f51256d;

    /* renamed from: e */
    private final String f51257e;

    /* renamed from: f */
    private final String f51258f;

    public C18030a(long j, long j2, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str2, "firstName");
        C41536l.m120489i(str3, "lastName");
        C41536l.m120489i(str4, "pin");
        this.f51253a = j;
        this.f51254b = j2;
        this.f51255c = str;
        this.f51256d = str2;
        this.f51257e = str3;
        this.f51258f = str4;
    }

    /* renamed from: a */
    public final long mo45723a() {
        return this.f51253a;
    }

    /* renamed from: b */
    public final long mo45724b() {
        return this.f51254b;
    }

    /* renamed from: c */
    public final String mo45725c() {
        return this.f51255c;
    }

    /* renamed from: d */
    public final String mo45726d() {
        return this.f51256d;
    }

    /* renamed from: e */
    public final String mo45727e() {
        return this.f51257e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18030a)) {
            return false;
        }
        C18030a aVar = (C18030a) obj;
        return this.f51253a == aVar.f51253a && this.f51254b == aVar.f51254b && C41536l.m120484d(this.f51255c, aVar.f51255c) && C41536l.m120484d(this.f51256d, aVar.f51256d) && C41536l.m120484d(this.f51257e, aVar.f51257e) && C41536l.m120484d(this.f51258f, aVar.f51258f);
    }

    /* renamed from: f */
    public final String mo45729f() {
        return this.f51258f;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f51253a) * 31) + C7397t.m28148a(this.f51254b)) * 31;
        String str = this.f51255c;
        return ((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f51256d.hashCode()) * 31) + this.f51257e.hashCode()) * 31) + this.f51258f.hashCode();
    }

    public String toString() {
        long j = this.f51253a;
        long j2 = this.f51254b;
        String str = this.f51255c;
        String str2 = this.f51256d;
        String str3 = this.f51257e;
        String str4 = this.f51258f;
        return "ChildInfoUiModel(birthDate=" + j + ", clientKey=" + j2 + ", financialPhone=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", pin=" + str4 + ")";
    }
}
