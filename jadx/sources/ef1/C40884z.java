package ef1;

import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: ef1.z */
public final class C40884z {

    /* renamed from: a */
    public final Object f96606a;

    /* renamed from: b */
    public final C43075l f96607b;

    public C40884z(Object obj, C43075l lVar) {
        this.f96606a = obj;
        this.f96607b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40884z)) {
            return false;
        }
        C40884z zVar = (C40884z) obj;
        return C41536l.m120484d(this.f96606a, zVar.f96606a) && C41536l.m120484d(this.f96607b, zVar.f96607b);
    }

    public int hashCode() {
        Object obj = this.f96606a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f96607b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f96606a + ", onCancellation=" + this.f96607b + ')';
    }
}
