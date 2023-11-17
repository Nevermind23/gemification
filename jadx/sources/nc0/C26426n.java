package nc0;

import ic0.C25168f;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nc0.n */
public final class C26426n {

    /* renamed from: a */
    private final C25168f f66947a;

    /* renamed from: b */
    private final long f66948b;

    public C26426n(C25168f fVar, long j) {
        C41536l.m120489i(fVar, "type");
        this.f66947a = fVar;
        this.f66948b = j;
    }

    /* renamed from: a */
    public final long mo65688a() {
        return this.f66948b;
    }

    /* renamed from: b */
    public final C25168f mo65689b() {
        return this.f66947a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26426n)) {
            return false;
        }
        C26426n nVar = (C26426n) obj;
        return this.f66947a == nVar.f66947a && this.f66948b == nVar.f66948b;
    }

    public int hashCode() {
        return (this.f66947a.hashCode() * 31) + C7397t.m28148a(this.f66948b);
    }

    public String toString() {
        C25168f fVar = this.f66947a;
        long j = this.f66948b;
        return "OpenDepositProlongationActivityModel(type=" + fVar + ", agreeKey=" + j + ")";
    }
}
