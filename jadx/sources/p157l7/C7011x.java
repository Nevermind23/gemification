package p157l7;

import java.util.Iterator;

/* renamed from: l7.x */
final class C7011x extends C7006s {

    /* renamed from: f */
    final transient Object f20895f;

    C7011x(Object obj) {
        obj.getClass();
        this.f20895f = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo21181b(Object[] objArr, int i) {
        objArr[0] = this.f20895f;
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.f20895f.equals(obj);
    }

    public final int hashCode() {
        return this.f20895f.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new C7007t(this.f20895f);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.f20895f.toString() + ']';
    }
}
