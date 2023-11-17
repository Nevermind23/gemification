package p105h7;

import java.util.Iterator;

/* renamed from: h7.u */
final class C6471u extends C6468r {

    /* renamed from: k */
    private static final Object[] f19786k;

    /* renamed from: l */
    static final C6471u f19787l;

    /* renamed from: f */
    final transient Object[] f19788f;

    /* renamed from: g */
    private final transient int f19789g;

    /* renamed from: h */
    final transient Object[] f19790h;

    /* renamed from: i */
    private final transient int f19791i;

    /* renamed from: j */
    private final transient int f19792j;

    static {
        Object[] objArr = new Object[0];
        f19786k = objArr;
        f19787l = new C6471u(objArr, 0, objArr, 0, 0);
    }

    C6471u(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f19788f = objArr;
        this.f19789g = i;
        this.f19790h = objArr2;
        this.f19791i = i2;
        this.f19792j = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo20336b(Object[] objArr, int i) {
        System.arraycopy(this.f19788f, 0, objArr, 0, this.f19792j);
        return this.f19792j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo20337c() {
        return this.f19792j;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f19790h;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = C6463m.m25562a(obj.hashCode());
        while (true) {
            int i = a & this.f19791i;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo20339g() {
        return 0;
    }

    public final int hashCode() {
        return this.f19789g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo20340i() {
        return this.f19788f;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo20365l().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final C6467q mo20366n() {
        return C6467q.m25572l(this.f19788f, this.f19792j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo20367r() {
        return true;
    }

    public final int size() {
        return this.f19792j;
    }
}
