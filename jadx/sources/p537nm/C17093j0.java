package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.j0 */
public final class C17093j0 {

    /* renamed from: a */
    private final long f47813a;

    /* renamed from: b */
    private final String f47814b;

    /* renamed from: c */
    private final String f47815c;

    /* renamed from: d */
    private final String f47816d;

    /* renamed from: e */
    private final String f47817e;

    /* renamed from: f */
    private final long f47818f;

    /* renamed from: g */
    private final String f47819g;

    public C17093j0(long j, String str, String str2, String str3, String str4, long j2, String str5) {
        C41536l.m120489i(str, "firstName");
        C41536l.m120489i(str2, "lastName");
        C41536l.m120489i(str3, "firstNameInt");
        C41536l.m120489i(str4, "lastNameInt");
        C41536l.m120489i(str5, "pin");
        this.f47813a = j;
        this.f47814b = str;
        this.f47815c = str2;
        this.f47816d = str3;
        this.f47817e = str4;
        this.f47818f = j2;
        this.f47819g = str5;
    }

    /* renamed from: a */
    public final long mo44380a() {
        return this.f47818f;
    }

    /* renamed from: b */
    public final long mo44381b() {
        return this.f47813a;
    }

    /* renamed from: c */
    public final String mo44382c() {
        return this.f47814b;
    }

    /* renamed from: d */
    public final String mo44383d() {
        return this.f47816d;
    }

    /* renamed from: e */
    public final String mo44384e() {
        return this.f47815c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17093j0)) {
            return false;
        }
        C17093j0 j0Var = (C17093j0) obj;
        return this.f47813a == j0Var.f47813a && C41536l.m120484d(this.f47814b, j0Var.f47814b) && C41536l.m120484d(this.f47815c, j0Var.f47815c) && C41536l.m120484d(this.f47816d, j0Var.f47816d) && C41536l.m120484d(this.f47817e, j0Var.f47817e) && this.f47818f == j0Var.f47818f && C41536l.m120484d(this.f47819g, j0Var.f47819g);
    }

    /* renamed from: f */
    public final String mo44386f() {
        return this.f47817e;
    }

    /* renamed from: g */
    public final String mo44387g() {
        return this.f47819g;
    }

    public int hashCode() {
        return (((((((((((C7397t.m28148a(this.f47813a) * 31) + this.f47814b.hashCode()) * 31) + this.f47815c.hashCode()) * 31) + this.f47816d.hashCode()) * 31) + this.f47817e.hashCode()) * 31) + C7397t.m28148a(this.f47818f)) * 31) + this.f47819g.hashCode();
    }

    public String toString() {
        long j = this.f47813a;
        String str = this.f47814b;
        String str2 = this.f47815c;
        String str3 = this.f47816d;
        String str4 = this.f47817e;
        long j2 = this.f47818f;
        String str5 = this.f47819g;
        return "ScoolCardOwner(childClientKey=" + j + ", firstName=" + str + ", lastName=" + str2 + ", firstNameInt=" + str3 + ", lastNameInt=" + str4 + ", birthDate=" + j2 + ", pin=" + str5 + ")";
    }
}
