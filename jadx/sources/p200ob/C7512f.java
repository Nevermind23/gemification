package p200ob;

import com.google.zxing.NotFoundException;

/* renamed from: ob.f */
public final class C7512f extends C7515i {
    /* renamed from: c */
    public C7508b mo22007c(C7508b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        C7508b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo22008d(bVar, i, i2, C7517k.m28590b(f, f2, f3, f4, f5, f6, f7, f8, f9, f12, f13, f14, f15, f16, f17, f18));
    }

    /* renamed from: d */
    public C7508b mo22008d(C7508b bVar, int i, int i2, C7517k kVar) {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.m23155a();
        }
        C7508b bVar2 = new C7508b(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            kVar.mo22013f(fArr);
            C7515i.m28580a(bVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (bVar.mo21974e((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bVar2.mo21984n(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.m23155a();
                }
            }
        }
        return bVar2;
    }
}
