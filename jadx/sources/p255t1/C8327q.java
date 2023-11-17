package p255t1;

import android.graphics.PointF;
import com.airbnb.lottie.C2315d0;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p268u1.C8525a;
import p294w1.C8733a;
import p319y1.C9024m;
import p319y1.C9025n;
import p331z1.C9169b;

/* renamed from: t1.q */
public class C8327q implements C8329s, C8525a.C8527b {

    /* renamed from: a */
    private final C2315d0 f23680a;

    /* renamed from: b */
    private final String f23681b;

    /* renamed from: c */
    private final C8525a f23682c;

    /* renamed from: d */
    private C9025n f23683d;

    public C8327q(C2315d0 d0Var, C9169b bVar, C9024m mVar) {
        this.f23680a = d0Var;
        this.f23681b = mVar.mo24478c();
        C8525a a = mVar.mo24477b().mo24353a();
        this.f23682c = a;
        bVar.mo24753i(a);
        a.mo23850a(this);
    }

    /* renamed from: c */
    private static int m31266c(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    /* renamed from: f */
    private static int m31267f(int i, int i2) {
        return i - (m31266c(i, i2) * i2);
    }

    /* renamed from: i */
    private C9025n m31268i(C9025n nVar) {
        PointF pointF;
        PointF pointF2;
        boolean z;
        List a = nVar.mo24479a();
        boolean d = nVar.mo24482d();
        int i = 0;
        for (int size = a.size() - 1; size >= 0; size--) {
            C8733a aVar = (C8733a) a.get(size);
            C8733a aVar2 = (C8733a) a.get(m31267f(size - 1, a.size()));
            if (size != 0 || d) {
                pointF = aVar2.mo24120c();
            } else {
                pointF = nVar.mo24480b();
            }
            if (size != 0 || d) {
                pointF2 = aVar2.mo24119b();
            } else {
                pointF2 = pointF;
            }
            PointF a2 = aVar.mo24118a();
            if (!nVar.mo24482d() && size == 0 && size == a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (!pointF2.equals(pointF) || !a2.equals(pointF) || z) {
                i++;
            } else {
                i += 2;
            }
        }
        C9025n nVar2 = this.f23683d;
        if (nVar2 == null || nVar2.mo24479a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C8733a());
            }
            this.f23683d = new C9025n(new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON), false, arrayList);
        }
        this.f23683d.mo24483e(d);
        return this.f23683d;
    }

    /* renamed from: a */
    public void mo23468a() {
        this.f23680a.invalidateSelf();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
    }

    /* renamed from: d */
    public C9025n mo23482d(C9025n nVar) {
        PointF pointF;
        PointF pointF2;
        boolean z;
        List list;
        List a = nVar.mo24479a();
        if (a.size() <= 2) {
            return nVar;
        }
        float floatValue = ((Float) this.f23682c.mo23856h()).floatValue();
        if (floatValue == Utils.FLOAT_EPSILON) {
            return nVar;
        }
        C9025n i = m31268i(nVar);
        i.mo24484f(nVar.mo24480b().x, nVar.mo24480b().y);
        List a2 = i.mo24479a();
        boolean d = nVar.mo24482d();
        int i2 = 0;
        int i3 = 0;
        while (i2 < a.size()) {
            C8733a aVar = (C8733a) a.get(i2);
            C8733a aVar2 = (C8733a) a.get(m31267f(i2 - 1, a.size()));
            C8733a aVar3 = (C8733a) a.get(m31267f(i2 - 2, a.size()));
            if (i2 != 0 || d) {
                pointF = aVar2.mo24120c();
            } else {
                pointF = nVar.mo24480b();
            }
            if (i2 != 0 || d) {
                pointF2 = aVar2.mo24119b();
            } else {
                pointF2 = pointF;
            }
            PointF a3 = aVar.mo24118a();
            PointF c = aVar3.mo24120c();
            PointF c2 = aVar.mo24120c();
            if (!nVar.mo24482d() && i2 == 0 && i2 == a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (!pointF2.equals(pointF) || !a3.equals(pointF) || z) {
                list = a;
                C8733a aVar4 = (C8733a) a2.get(m31267f(i3 - 1, a2.size()));
                aVar4.mo24122e(aVar2.mo24119b().x, aVar2.mo24119b().y);
                aVar4.mo24123f(aVar2.mo24120c().x, aVar2.mo24120c().y);
                ((C8733a) a2.get(i3)).mo24121d(aVar.mo24118a().x, aVar.mo24118a().y);
            } else {
                float f = pointF.x;
                float f2 = f - c.x;
                float f3 = pointF.y;
                float f4 = c2.x - f;
                list = a;
                float min = Math.min(floatValue / ((float) Math.hypot((double) f2, (double) (f3 - c.y))), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot((double) f4, (double) (c2.y - f3))), 0.5f);
                float f5 = pointF.x;
                float f6 = ((c.x - f5) * min) + f5;
                float f7 = pointF.y;
                float f8 = ((c.y - f7) * min) + f7;
                float f9 = ((c2.x - f5) * min2) + f5;
                float f12 = ((c2.y - f7) * min2) + f7;
                float f13 = f6 - ((f6 - f5) * 0.5519f);
                float f14 = f8 - ((f8 - f7) * 0.5519f);
                float f15 = f9 - ((f9 - f5) * 0.5519f);
                float f16 = f12 - ((f12 - f7) * 0.5519f);
                C8733a aVar5 = (C8733a) a2.get(m31267f(i3 - 1, a2.size()));
                C8733a aVar6 = (C8733a) a2.get(i3);
                aVar5.mo24122e(f6, f8);
                aVar5.mo24123f(f6, f8);
                if (i2 == 0) {
                    i.mo24484f(f6, f8);
                }
                aVar6.mo24121d(f13, f14);
                i3++;
                aVar6.mo24122e(f15, f16);
                aVar6.mo24123f(f9, f12);
                ((C8733a) a2.get(i3)).mo24121d(f9, f12);
            }
            i3++;
            i2++;
            a = list;
        }
        return i;
    }

    /* renamed from: g */
    public C8525a mo23483g() {
        return this.f23682c;
    }
}
