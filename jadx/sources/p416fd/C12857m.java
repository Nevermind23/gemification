package p416fd;

import android.graphics.Rect;

/* renamed from: fd.m */
public class C12857m {

    /* renamed from: a */
    private byte[] f37994a;

    /* renamed from: b */
    private int f37995b;

    /* renamed from: c */
    private int f37996c;

    public C12857m(byte[] bArr, int i, int i2) {
        this.f37994a = bArr;
        this.f37995b = i;
        this.f37996c = i2;
    }

    /* renamed from: e */
    public static byte[] m48652e(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4] = bArr[i5];
            i4--;
        }
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m48653f(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i) + i5];
                i4--;
            }
        }
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m48654g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                bArr2[i3] = bArr[(i5 * i) + i4];
                i3++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C12857m mo33521a(Rect rect, int i) {
        int width = rect.width() / i;
        int height = rect.height() / i;
        int i2 = rect.top;
        byte[] bArr = new byte[(width * height)];
        if (i == 1) {
            int i3 = (i2 * this.f37995b) + rect.left;
            for (int i4 = 0; i4 < height; i4++) {
                System.arraycopy(this.f37994a, i3, bArr, i4 * width, width);
                i3 += this.f37995b;
            }
        } else {
            int i5 = (i2 * this.f37995b) + rect.left;
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = i6 * width;
                int i8 = i5;
                for (int i9 = 0; i9 < width; i9++) {
                    bArr[i7] = this.f37994a[i8];
                    i8 += i;
                    i7++;
                }
                i5 += this.f37995b * i;
            }
        }
        return new C12857m(bArr, width, height);
    }

    /* renamed from: b */
    public byte[] mo33522b() {
        return this.f37994a;
    }

    /* renamed from: c */
    public int mo33523c() {
        return this.f37996c;
    }

    /* renamed from: d */
    public int mo33524d() {
        return this.f37995b;
    }

    /* renamed from: h */
    public C12857m mo33525h(int i) {
        if (i == 90) {
            return new C12857m(m48654g(this.f37994a, this.f37995b, this.f37996c), this.f37996c, this.f37995b);
        }
        if (i == 180) {
            return new C12857m(m48652e(this.f37994a, this.f37995b, this.f37996c), this.f37995b, this.f37996c);
        }
        if (i != 270) {
            return this;
        }
        return new C12857m(m48653f(this.f37994a, this.f37995b, this.f37996c), this.f37996c, this.f37995b);
    }
}
