package p157l7;

import java.util.Iterator;

/* renamed from: l7.w */
final class C7010w extends C7006s {

    /* renamed from: k */
    private static final Object[] f20888k;

    /* renamed from: l */
    static final C7010w f20889l;

    /* renamed from: f */
    final transient Object[] f20890f;

    /* renamed from: g */
    private final transient int f20891g;

    /* renamed from: h */
    final transient Object[] f20892h;

    /* renamed from: i */
    private final transient int f20893i;

    /* renamed from: j */
    private final transient int f20894j;

    static {
        Object[] objArr = new Object[0];
        f20888k = objArr;
        f20889l = new C7010w(objArr, 0, objArr, 0, 0);
    }

    C7010w(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f20890f = objArr;
        this.f20891g = i;
        this.f20892h = objArr2;
        this.f20893i = i2;
        this.f20894j = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo21181b(Object[] objArr, int i) {
        System.arraycopy(this.f20890f, 0, objArr, 0, this.f20894j);
        return this.f20894j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo21182c() {
        return this.f20894j;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f20892h;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = C7001n.m27129a(obj.hashCode());
        while (true) {
            int i = a & this.f20893i;
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
    public final int mo21184g() {
        return 0;
    }

    public final int hashCode() {
        return this.f20891g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo21185i() {
        return this.f20890f;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo21210l().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final C7005r mo21211n() {
        return C7005r.m27140n(this.f20890f, this.f20894j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo21212r() {
        return true;
    }

    public final int size() {
        return this.f20894j;
    }
}
