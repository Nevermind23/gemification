package p200ob;

/* renamed from: ob.c */
public final class C7509c {

    /* renamed from: a */
    private final byte[] f21877a;

    /* renamed from: b */
    private int f21878b;

    /* renamed from: c */
    private int f21879c;

    public C7509c(byte[] bArr) {
        this.f21877a = bArr;
    }

    /* renamed from: a */
    public int mo21989a() {
        return ((this.f21877a.length - this.f21878b) * 8) - this.f21879c;
    }

    /* renamed from: b */
    public int mo21990b() {
        return this.f21879c;
    }

    /* renamed from: c */
    public int mo21991c() {
        return this.f21878b;
    }

    /* renamed from: d */
    public int mo21992d(int i) {
        if (i <= 0 || i > 32 || i > mo21989a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f21879c;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int min = Math.min(i, i3);
            int i4 = i3 - min;
            byte[] bArr = this.f21877a;
            int i5 = this.f21878b;
            int i6 = (((C11051p3.f31759c >> (8 - min)) << i4) & bArr[i5]) >> i4;
            i -= min;
            int i7 = this.f21879c + min;
            this.f21879c = i7;
            if (i7 == 8) {
                this.f21879c = 0;
                this.f21878b = i5 + 1;
            }
            b = i6;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i8 = b << 8;
            byte[] bArr2 = this.f21877a;
            int i9 = this.f21878b;
            b = (bArr2[i9] & 255) | i8;
            this.f21878b = i9 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i12 = 8 - i;
        int i13 = (b << i) | ((((C11051p3.f31759c >> i12) << i12) & this.f21877a[this.f21878b]) >> i12);
        this.f21879c += i;
        return i13;
    }
}
