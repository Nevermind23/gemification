package ul0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ul0.f */
public final class C28879f {

    /* renamed from: a */
    private final Integer f73719a;

    /* renamed from: b */
    private final int f73720b;

    public C28879f(Integer num, int i) {
        this.f73719a = num;
        this.f73720b = i;
    }

    /* renamed from: a */
    public final Integer mo68629a() {
        return this.f73719a;
    }

    /* renamed from: b */
    public final int mo68630b() {
        return this.f73720b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28879f)) {
            return false;
        }
        C28879f fVar = (C28879f) obj;
        return C41536l.m120484d(this.f73719a, fVar.f73719a) && this.f73720b == fVar.f73720b;
    }

    public int hashCode() {
        Integer num = this.f73719a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.f73720b;
    }

    public String toString() {
        Integer num = this.f73719a;
        int i = this.f73720b;
        return "RegisterPolicyResult(docKey=" + num + ", errorCode=" + i + ")";
    }
}
