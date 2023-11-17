package p387dc;

/* renamed from: dc.b */
public final class C12071b {

    /* renamed from: f */
    public static final C12071b f35473f = new C12071b(929, 3);

    /* renamed from: a */
    private final int[] f35474a;

    /* renamed from: b */
    private final int[] f35475b;

    /* renamed from: c */
    private final C12072c f35476c;

    /* renamed from: d */
    private final C12072c f35477d;

    /* renamed from: e */
    private final int f35478e;

    private C12071b(int i, int i2) {
        this.f35478e = i;
        this.f35474a = new int[i];
        this.f35475b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f35474a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f35475b[this.f35474a[i5]] = i5;
        }
        this.f35476c = new C12072c(this, new int[]{0});
        this.f35477d = new C12072c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo32195a(int i, int i2) {
        return (i + i2) % this.f35478e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C12072c mo32196b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f35476c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C12072c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo32197c(int i) {
        return this.f35474a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12072c mo32198d() {
        return this.f35477d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo32199e() {
        return this.f35478e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12072c mo32200f() {
        return this.f35476c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo32201g(int i) {
        if (i != 0) {
            return this.f35474a[(this.f35478e - this.f35475b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo32202h(int i) {
        if (i != 0) {
            return this.f35475b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo32203i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f35474a;
        int[] iArr2 = this.f35475b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f35478e - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo32204j(int i, int i2) {
        int i3 = this.f35478e;
        return ((i + i3) - i2) % i3;
    }
}
