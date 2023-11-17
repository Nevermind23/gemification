package yd1;

/* renamed from: yd1.l */
public final class C43371l {

    /* renamed from: a */
    final float f101212a;

    /* renamed from: b */
    int f101213b;

    /* renamed from: c */
    int f101214c;

    /* renamed from: d */
    int f101215d;

    /* renamed from: e */
    Object[] f101216e;

    public C43371l() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    static int m124431c(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo102045a(Object obj) {
        Object obj2;
        Object[] objArr = this.f101216e;
        int i = this.f101213b;
        int c = m124431c(obj.hashCode()) & i;
        Object obj3 = objArr[c];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                c = (c + 1) & i;
                obj2 = objArr[c];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[c] = obj;
        int i2 = this.f101214c + 1;
        this.f101214c = i2;
        if (i2 >= this.f101215d) {
            mo102047d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] mo102046b() {
        return this.f101216e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo102047d() {
        Object obj;
        Object[] objArr = this.f101216e;
        int length = objArr.length;
        int i = length << 1;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i];
        int i3 = this.f101214c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    obj = objArr[length];
                } while (obj == null);
                int c = m124431c(obj.hashCode()) & i2;
                if (objArr2[c] != null) {
                    do {
                        c = (c + 1) & i2;
                    } while (objArr2[c] != null);
                }
                objArr2[c] = objArr[length];
                i3 = i4;
            } else {
                this.f101213b = i2;
                this.f101215d = (int) (((float) i) * this.f101212a);
                this.f101216e = objArr2;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean mo102048e(Object obj) {
        Object obj2;
        Object[] objArr = this.f101216e;
        int i = this.f101213b;
        int c = m124431c(obj.hashCode()) & i;
        Object obj3 = objArr[c];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            return mo102049f(c, objArr, i);
        }
        do {
            c = (c + 1) & i;
            obj2 = objArr[c];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return mo102049f(c, objArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo102049f(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.f101214c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return true;
                }
                int c = m124431c(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= c || c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= c && c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public C43371l(int i) {
        this(i, 0.75f);
    }

    public C43371l(int i, float f) {
        this.f101212a = f;
        int a = C43372m.m124437a(i);
        this.f101213b = a - 1;
        this.f101215d = (int) (f * ((float) a));
        this.f101216e = new Object[a];
    }
}
