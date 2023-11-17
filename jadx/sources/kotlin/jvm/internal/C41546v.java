package kotlin.jvm.internal;

import af1.C40295b;
import af1.C40303i;

/* renamed from: kotlin.jvm.internal.v */
public abstract class C41546v extends C41525d implements C40303i {

    /* renamed from: d */
    private final boolean f97713d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41546v(java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0008
            r8 = r2
            goto L_0x0009
        L_0x0008:
            r8 = r1
        L_0x0009:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 2
            r11 = r14 & 2
            if (r11 != r10) goto L_0x0017
            r1 = r2
        L_0x0017:
            r9.f97713d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C41546v.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C40303i getReflected() {
        if (!this.f97713d) {
            return (C40303i) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public C40295b compute() {
        return this.f97713d ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41546v) {
            C41546v vVar = (C41546v) obj;
            if (!getOwner().equals(vVar.getOwner()) || !getName().equals(vVar.getName()) || !getSignature().equals(vVar.getSignature()) || !C41536l.m120484d(getBoundReceiver(), vVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C40303i) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C40295b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
