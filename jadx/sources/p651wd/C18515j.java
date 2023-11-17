package p651wd;

import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p374ce.C10396b;

/* renamed from: wd.j */
public abstract class C18515j {
    /* renamed from: a */
    public static byte[] m63022a(byte[] bArr, C10396b bVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr2 = bArr;
        int i6 = i;
        if (i6 == 0) {
            return bArr2;
        }
        if (i6 % 90 != 0 || i6 < 0 || i6 > 270) {
            throw new IllegalArgumentException("0 <= rotation < 360, rotation % 90 == 0");
        }
        int e = bVar.mo27062e();
        int c = bVar.mo27060c();
        byte[] bArr3 = new byte[bArr2.length];
        int i7 = e * c;
        if (i6 % SubsamplingScaleImageView.ORIENTATION_180 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i6 % SubsamplingScaleImageView.ORIENTATION_270 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i6 >= 180) {
            z3 = true;
        } else {
            z3 = false;
        }
        for (int i8 = 0; i8 < c; i8++) {
            for (int i9 = 0; i9 < e; i9++) {
                int i12 = (i8 * e) + i9;
                int i13 = ((i8 >> 1) * e) + i7 + (i9 & -2);
                int i14 = i13 + 1;
                if (z) {
                    i2 = c;
                } else {
                    i2 = e;
                }
                if (z) {
                    i3 = e;
                } else {
                    i3 = c;
                }
                if (z) {
                    i4 = i8;
                } else {
                    i4 = i9;
                }
                if (z) {
                    i5 = i9;
                } else {
                    i5 = i8;
                }
                if (z2) {
                    i4 = (i2 - i4) - 1;
                }
                if (z3) {
                    i5 = (i3 - i5) - 1;
                }
                int i15 = i7 + ((i5 >> 1) * i2) + (i4 & -2);
                bArr3[(i5 * i2) + i4] = (byte) (bArr2[i12] & 255);
                bArr3[i15] = (byte) (bArr2[i13] & 255);
                bArr3[i15 + 1] = (byte) (bArr2[i14] & 255);
            }
        }
        return bArr3;
    }
}
