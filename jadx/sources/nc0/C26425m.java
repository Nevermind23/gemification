package nc0;

import ic0.C25168f;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nc0.m */
public final class C26425m {

    /* renamed from: a */
    private final C25168f f66945a;

    /* renamed from: b */
    private final long f66946b;

    public C26425m(C25168f fVar, long j) {
        C41536l.m120489i(fVar, "type");
        this.f66945a = fVar;
        this.f66946b = j;
    }

    /* renamed from: a */
    public final long mo65683a() {
        return this.f66946b;
    }

    /* renamed from: b */
    public final C25168f mo65684b() {
        return this.f66945a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26425m)) {
            return false;
        }
        C26425m mVar = (C26425m) obj;
        return this.f66945a == mVar.f66945a && this.f66946b == mVar.f66946b;
    }

    public int hashCode() {
        return (this.f66945a.hashCode() * 31) + C7397t.m28148a(this.f66946b);
    }

    public String toString() {
        C25168f fVar = this.f66945a;
        long j = this.f66946b;
        return "OpenCancelDepositConfirmationModel(type=" + fVar + ", closeDayCount=" + j + ")";
    }
}
