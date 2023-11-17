package p175n;

/* renamed from: n.g */
class C7179g implements C7178f {

    /* renamed from: a */
    private final Object[] f21273a;

    /* renamed from: b */
    private int f21274b;

    C7179g(int i) {
        if (i > 0) {
            this.f21273a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo21495a(Object obj) {
        int i = this.f21274b;
        Object[] objArr = this.f21273a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f21274b = i + 1;
        return true;
    }

    /* renamed from: b */
    public Object mo21496b() {
        int i = this.f21274b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f21273a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f21274b = i - 1;
        return obj;
    }

    /* renamed from: c */
    public void mo21497c(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f21274b;
            Object[] objArr2 = this.f21273a;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f21274b = i3 + 1;
            }
        }
    }
}
