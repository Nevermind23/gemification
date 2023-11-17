package dg1;

import dg1.C40681e;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.c0 */
public abstract class C40678c0 {

    /* renamed from: a */
    private static final byte[] f96325a;

    /* renamed from: b */
    private static final byte[] f96326b;

    static {
        C40681e.C40682a aVar = C40681e.f96327g;
        f96325a = aVar.mo94822c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").mo94805g();
        f96326b = aVar.mo94822c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").mo94805g();
    }

    /* renamed from: a */
    public static final String m117673a(byte[] bArr, byte[] bArr2) {
        C41536l.m120489i(bArr, "<this>");
        C41536l.m120489i(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i12 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i12] = b5;
            bArr3[i12 + 1] = b5;
        } else if (length2 == 2) {
            int i13 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i13];
            int i14 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i15 = i14 + 1;
            bArr3[i14] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i15] = bArr2[(b7 & 15) << 2];
            bArr3[i15 + 1] = (byte) 61;
        }
        return C40680d0.m117695b(bArr3);
    }

    /* renamed from: b */
    public static /* synthetic */ String m117674b(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f96325a;
        }
        return m117673a(bArr, bArr2);
    }
}
