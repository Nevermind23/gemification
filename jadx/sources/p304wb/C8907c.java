package p304wb;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import p200ob.C7508b;
import p200ob.C7511e;
import p226qb.C8001a;
import p226qb.C8003c;

/* renamed from: wb.c */
public final class C8907c {

    /* renamed from: a */
    private final C8003c f24921a = new C8003c(C8001a.f23058o);

    /* renamed from: a */
    private void m33097a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i2 + i3;
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int[] iArr = new int[(i6 / i5)];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i5] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f24921a.mo23155a(iArr, i3 / i5);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i5];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m23152a();
        }
    }

    /* renamed from: b */
    public C7511e mo24334b(C7508b bVar, Map map) {
        byte[] bArr;
        byte[] a = new C8905a(bVar).mo24333a();
        m33097a(a, 0, 10, 10, 0);
        byte b = a[0] & 15;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr2 = a;
            m33097a(bArr2, 20, 84, 40, 1);
            m33097a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (b == 5) {
            byte[] bArr3 = a;
            m33097a(bArr3, 20, 68, 56, 1);
            m33097a(bArr3, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.m23153a();
        }
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C8906b.m33088a(bArr, b);
    }
}
