package p613te;

import com.salesforce.marketingcloud.C11398b;

/* renamed from: te.b */
public final class C17944b extends C17954k {

    /* renamed from: h */
    public static int f51071h = 18;

    /* renamed from: i */
    public static int f51072i = 1;

    /* renamed from: j */
    public static int f51073j = 2;

    /* renamed from: k */
    public static int f51074k;

    /* renamed from: g */
    public static int m61801g() {
        return 2;
    }

    /* renamed from: h */
    public static int m61802h() {
        return 89;
    }

    /* renamed from: i */
    private static int m61803i(int i, int i2) {
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    /* renamed from: j */
    public static int m61804j() {
        return 1;
    }

    /* renamed from: c */
    public int mo45607c(int i) {
        int i2 = m61803i(i, 63488);
        int h = (m61802h() + f51072i) * m61802h();
        int h2 = m61802h();
        if ((h2 * (f51072i + h2)) % f51073j != 0) {
            f51071h = m61802h();
            f51074k = m61802h();
        }
        if (h % f51073j != f51074k) {
            f51071h = 9;
            f51074k = 89;
        }
        return i2 + C11398b.f33142u;
    }

    /* renamed from: d */
    public int mo45608d(int i) {
        int i2 = f51071h;
        if ((i2 * (m61804j() + i2)) % f51073j != 0) {
            f51071h = 38;
            f51074k = m61802h();
        }
        int i3 = f51071h;
        if (((f51072i + i3) * i3) % m61801g() != f51074k) {
            f51071h = m61802h();
            f51074k = m61802h();
        }
        return i - 2048;
    }
}
