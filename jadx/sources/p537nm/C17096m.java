package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.m */
public final class C17096m {

    /* renamed from: a */
    private final long f47827a;

    /* renamed from: b */
    private final String f47828b;

    public C17096m(long j, String str) {
        this.f47827a = j;
        this.f47828b = str;
    }

    /* renamed from: a */
    public final String mo44403a() {
        return this.f47828b;
    }

    /* renamed from: b */
    public final long mo44404b() {
        return this.f47827a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17096m)) {
            return false;
        }
        C17096m mVar = (C17096m) obj;
        return this.f47827a == mVar.f47827a && C41536l.m120484d(this.f47828b, mVar.f47828b);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f47827a) * 31;
        String str = this.f47828b;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f47827a;
        String str = this.f47828b;
        return "CsDefaultDepartment(id=" + j + ", csDefDepartment=" + str + ")";
    }
}
