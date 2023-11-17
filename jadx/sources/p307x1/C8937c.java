package p307x1;

import java.util.Arrays;
import java.util.List;
import p061e2.C6013a;
import p268u1.C8525a;
import p268u1.C8536e;
import p319y1.C9012d;

/* renamed from: x1.c */
public class C8937c extends C8948n {
    public C8937c(List list) {
        super(m33159e(list));
    }

    /* renamed from: d */
    private static C6013a m33158d(C6013a aVar) {
        C9012d dVar = (C9012d) aVar.f18759b;
        C9012d dVar2 = (C9012d) aVar.f18760c;
        if (dVar == null || dVar2 == null || dVar.mo24423d().length == dVar2.mo24423d().length) {
            return aVar;
        }
        float[] f = m33160f(dVar.mo24423d(), dVar2.mo24423d());
        return aVar.mo19486b(dVar.mo24421a(f), dVar2.mo24421a(f));
    }

    /* renamed from: e */
    private static List m33159e(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, m33158d((C6013a) list.get(i)));
        }
        return list;
    }

    /* renamed from: f */
    static float[] m33160f(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    /* renamed from: a */
    public C8525a mo24353a() {
        return new C8536e(this.f24953a);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ List mo24354b() {
        return super.mo24354b();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo24355c() {
        return super.mo24355c();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
