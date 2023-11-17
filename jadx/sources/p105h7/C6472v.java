package p105h7;

import java.util.Iterator;

/* renamed from: h7.v */
final class C6472v extends C6468r {

    /* renamed from: f */
    final transient Object f19793f;

    C6472v(Object obj) {
        obj.getClass();
        this.f19793f = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo20336b(Object[] objArr, int i) {
        objArr[0] = this.f19793f;
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.f19793f.equals(obj);
    }

    public final int hashCode() {
        return this.f19793f.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new C6469s(this.f19793f);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f19793f.toString();
        return "[" + obj + "]";
    }
}
