package p936wv;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: wv.g */
public final class C29581g {

    /* renamed from: a */
    private final C29577c f74731a;

    /* renamed from: b */
    private final long f74732b;

    public C29581g(C29577c cVar, long j) {
        C41536l.m120489i(cVar, "pfmData");
        this.f74731a = cVar;
        this.f74732b = j;
    }

    /* renamed from: a */
    public final C29577c mo69470a() {
        return this.f74731a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29581g)) {
            return false;
        }
        C29581g gVar = (C29581g) obj;
        return C41536l.m120484d(this.f74731a, gVar.f74731a) && this.f74732b == gVar.f74732b;
    }

    public int hashCode() {
        return (this.f74731a.hashCode() * 31) + C7397t.m28148a(this.f74732b);
    }

    public String toString() {
        C29577c cVar = this.f74731a;
        long j = this.f74732b;
        return "BudgetingResponse(pfmData=" + cVar + ", hashCode=" + j + ")";
    }
}
