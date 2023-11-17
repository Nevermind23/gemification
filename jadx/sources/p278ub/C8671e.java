package p278ub;

import java.util.Arrays;

/* renamed from: ub.e */
public class C8671e {

    /* renamed from: a */
    private final CharSequence f24471a;

    /* renamed from: b */
    private final int f24472b;

    /* renamed from: c */
    private final int f24473c;

    /* renamed from: d */
    private final byte[] f24474d;

    public C8671e(CharSequence charSequence, int i, int i2) {
        this.f24471a = charSequence;
        this.f24473c = i;
        this.f24472b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f24474d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    private void m32331a(int i) {
        m32335f(this.f24472b - 1, 0, i, 1);
        m32335f(this.f24472b - 1, 1, i, 2);
        m32335f(this.f24472b - 1, 2, i, 3);
        m32335f(0, this.f24473c - 2, i, 4);
        m32335f(0, this.f24473c - 1, i, 5);
        m32335f(1, this.f24473c - 1, i, 6);
        m32335f(2, this.f24473c - 1, i, 7);
        m32335f(3, this.f24473c - 1, i, 8);
    }

    /* renamed from: b */
    private void m32332b(int i) {
        m32335f(this.f24472b - 3, 0, i, 1);
        m32335f(this.f24472b - 2, 0, i, 2);
        m32335f(this.f24472b - 1, 0, i, 3);
        m32335f(0, this.f24473c - 4, i, 4);
        m32335f(0, this.f24473c - 3, i, 5);
        m32335f(0, this.f24473c - 2, i, 6);
        m32335f(0, this.f24473c - 1, i, 7);
        m32335f(1, this.f24473c - 1, i, 8);
    }

    /* renamed from: c */
    private void m32333c(int i) {
        m32335f(this.f24472b - 3, 0, i, 1);
        m32335f(this.f24472b - 2, 0, i, 2);
        m32335f(this.f24472b - 1, 0, i, 3);
        m32335f(0, this.f24473c - 2, i, 4);
        m32335f(0, this.f24473c - 1, i, 5);
        m32335f(1, this.f24473c - 1, i, 6);
        m32335f(2, this.f24473c - 1, i, 7);
        m32335f(3, this.f24473c - 1, i, 8);
    }

    /* renamed from: d */
    private void m32334d(int i) {
        m32335f(this.f24472b - 1, 0, i, 1);
        m32335f(this.f24472b - 1, this.f24473c - 1, i, 2);
        m32335f(0, this.f24473c - 3, i, 3);
        m32335f(0, this.f24473c - 2, i, 4);
        m32335f(0, this.f24473c - 1, i, 5);
        m32335f(1, this.f24473c - 3, i, 6);
        m32335f(1, this.f24473c - 2, i, 7);
        m32335f(1, this.f24473c - 1, i, 8);
    }

    /* renamed from: f */
    private void m32335f(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f24472b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f24473c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f24471a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m32337i(i2, i, z);
    }

    /* renamed from: g */
    private boolean m32336g(int i, int i2) {
        return this.f24474d[(i2 * this.f24473c) + i] < 0;
    }

    /* renamed from: i */
    private void m32337i(int i, int i2, boolean z) {
        this.f24474d[(i2 * this.f24473c) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: j */
    private void m32338j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m32335f(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m32335f(i4, i6, i3, 2);
        int i7 = i - 1;
        m32335f(i7, i5, i3, 3);
        m32335f(i7, i6, i3, 4);
        m32335f(i7, i2, i3, 5);
        m32335f(i, i5, i3, 6);
        m32335f(i, i6, i3, 7);
        m32335f(i, i2, i3, 8);
    }

    /* renamed from: e */
    public final boolean mo24029e(int i, int i2) {
        return this.f24474d[(i2 * this.f24473c) + i] == 1;
    }

    /* renamed from: h */
    public final void mo24030h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f24472b && i3 == 0) {
                m32331a(i4);
                i4++;
            }
            if (i5 == this.f24472b - 2 && i3 == 0 && this.f24473c % 4 != 0) {
                m32332b(i4);
                i4++;
            }
            if (i5 == this.f24472b - 2 && i3 == 0 && this.f24473c % 8 == 4) {
                m32333c(i4);
                i4++;
            }
            if (i5 == this.f24472b + 4 && i3 == 2 && this.f24473c % 8 == 0) {
                m32334d(i4);
                i4++;
            }
            do {
                if (i5 < this.f24472b && i3 >= 0 && m32336g(i3, i5)) {
                    m32338j(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0 || i3 >= this.f24473c) {
                    int i6 = i5 + 1;
                    int i7 = i3 + 3;
                }
                m32338j(i5, i3, i4);
                i4++;
                i5 -= 2;
                i3 += 2;
                break;
            } while (i3 >= this.f24473c);
            int i62 = i5 + 1;
            int i72 = i3 + 3;
            do {
                if (i62 >= 0 && i72 < this.f24473c && m32336g(i72, i62)) {
                    m32338j(i62, i72, i4);
                    i4++;
                }
                i62 += 2;
                i72 -= 2;
                i = this.f24472b;
                if (i62 >= i) {
                    break;
                }
            } while (i72 >= 0);
            i5 = i62 + 3;
            i3 = i72 + 1;
            if (i5 >= i && i3 >= (i2 = this.f24473c)) {
                break;
            }
        }
        if (m32336g(i2 - 1, i - 1)) {
            m32337i(this.f24473c - 1, this.f24472b - 1, true);
            m32337i(this.f24473c - 2, this.f24472b - 2, true);
        }
    }
}
