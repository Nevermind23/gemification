package p457ic;

import com.google.zxing.C5767p;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import p200ob.C7508b;

/* renamed from: ic.b */
final class C15592b {

    /* renamed from: a */
    private final C7508b f44279a;

    /* renamed from: b */
    private final List f44280b = new ArrayList(5);

    /* renamed from: c */
    private final int f44281c;

    /* renamed from: d */
    private final int f44282d;

    /* renamed from: e */
    private final int f44283e;

    /* renamed from: f */
    private final int f44284f;

    /* renamed from: g */
    private final float f44285g;

    /* renamed from: h */
    private final int[] f44286h;

    /* renamed from: i */
    private final C5767p f44287i;

    C15592b(C7508b bVar, int i, int i2, int i3, int i4, float f, C5767p pVar) {
        this.f44279a = bVar;
        this.f44281c = i;
        this.f44282d = i2;
        this.f44283e = i3;
        this.f44284f = i4;
        this.f44285g = f;
        this.f44286h = new int[3];
        this.f44287i = pVar;
    }

    /* renamed from: a */
    private static float m56298a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    private float m56299b(int i, int i2, int i3, int i4) {
        C7508b bVar = this.f44279a;
        int h = bVar.mo21978h();
        int[] iArr = this.f44286h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo21974e(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.mo21974e(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < h && bVar.mo21974e(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != h && iArr[1] <= i3) {
                while (i8 < h && !bVar.mo21974e(i2, i8)) {
                    int i12 = iArr[2];
                    if (i12 > i3) {
                        break;
                    }
                    iArr[2] = i12 + 1;
                    i8++;
                }
                int i13 = iArr[2];
                if (i13 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i13) - i4) * 5 < i4 * 2 && m56300d(iArr)) {
                    return m56298a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m56300d(int[] iArr) {
        float f = this.f44285g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C15591a m56301e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m56298a(iArr, i2);
        float b = m56299b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C15591a aVar : this.f44280b) {
            if (aVar.mo42850f(f, b, a)) {
                return aVar.mo42851g(b, a, f);
            }
        }
        C15591a aVar2 = new C15591a(a, b, f);
        this.f44280b.add(aVar2);
        C5767p pVar = this.f44287i;
        if (pVar == null) {
            return null;
        }
        pVar.mo18906a(aVar2);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C15591a mo42852c() {
        int i;
        C15591a e;
        C15591a e2;
        int i2 = this.f44281c;
        int i3 = this.f44284f;
        int i4 = this.f44283e + i2;
        int i5 = this.f44282d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            if ((i6 & 1) == 0) {
                i = (i6 + 1) / 2;
            } else {
                i = -((i6 + 1) / 2);
            }
            int i7 = i + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.f44279a.mo21974e(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (!this.f44279a.mo21974e(i8, i7)) {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                } else if (i9 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i9 != 2) {
                    i9++;
                    iArr[i9] = iArr[i9] + 1;
                } else if (m56300d(iArr) && (e2 = m56301e(iArr, i7, i8)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i9 = 1;
                }
                i8++;
            }
            if (m56300d(iArr) && (e = m56301e(iArr, i7, i4)) != null) {
                return e;
            }
        }
        if (!this.f44280b.isEmpty()) {
            return (C15591a) this.f44280b.get(0);
        }
        throw NotFoundException.m23155a();
    }
}
