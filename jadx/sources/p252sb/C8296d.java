package p252sb;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import p200ob.C7508b;
import p200ob.C7511e;
import p226qb.C8001a;
import p226qb.C8003c;

/* renamed from: sb.d */
public final class C8296d {

    /* renamed from: a */
    private final C8003c f23504a = new C8003c(C8001a.f23056m);

    /* renamed from: a */
    private void m31166a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f23504a.mo23155a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m23152a();
        }
    }

    /* renamed from: b */
    public C7511e mo23455b(C7508b bVar) {
        C8291a aVar = new C8291a(bVar);
        C8292b[] b = C8292b.m31154b(aVar.mo23452c(), aVar.mo23451b());
        int i = 0;
        for (C8292b c : b) {
            i += c.mo23454c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C8292b bVar2 = b[i2];
            byte[] a = bVar2.mo23453a();
            int c2 = bVar2.mo23454c();
            m31166a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C8293c.m31157a(bArr);
    }
}
