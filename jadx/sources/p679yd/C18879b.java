package p679yd;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p374ce.C10396b;

/* renamed from: yd.b */
public class C18879b {

    /* renamed from: a */
    final List f52837a;

    private C18879b(List list) {
        this.f52837a = list;
    }

    /* renamed from: a */
    private static RectF m63895a(PointF pointF, float f, float f2) {
        float f3 = pointF.x;
        float f4 = f / 2.0f;
        float f5 = pointF.y;
        float f6 = f2 / 2.0f;
        return new RectF(f3 - f4, f5 - f6, f3 + f4, f5 + f6);
    }

    /* renamed from: b */
    public static C18879b m63896b(C10396b bVar, RectF rectF, int i, boolean z) {
        ArrayList<C18878a> arrayList = new ArrayList<>();
        PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
        float width = rectF.width();
        float height = rectF.height();
        arrayList.add(new C18878a(rectF, i));
        if (z) {
            arrayList.add(new C18878a(m63895a(pointF, width * 1.5f, height * 1.5f), Math.round(((float) i) * 0.1f)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (C18878a b : arrayList) {
            arrayList2.add(b.mo46870b(bVar));
        }
        return new C18879b(arrayList2);
    }

    /* renamed from: c */
    public static C18879b m63897c(C10396b bVar, PointF pointF) {
        return m63898d(bVar, pointF, 1000);
    }

    /* renamed from: d */
    public static C18879b m63898d(C10396b bVar, PointF pointF, int i) {
        return m63896b(bVar, m63895a(pointF, ((float) bVar.mo27062e()) * 0.05f, ((float) bVar.mo27060c()) * 0.05f), i, true);
    }

    /* renamed from: e */
    public List mo46874e(int i, C18880c cVar) {
        ArrayList arrayList = new ArrayList();
        Collections.sort(this.f52837a);
        for (C18878a aVar : this.f52837a) {
            arrayList.add(cVar.mo44749a(aVar.f52835d, aVar.f52836e));
        }
        return arrayList.subList(0, Math.min(i, arrayList.size()));
    }

    /* renamed from: f */
    public C18879b mo46875f(C18880c cVar) {
        ArrayList arrayList = new ArrayList();
        for (C18878a e : this.f52837a) {
            arrayList.add(e.mo46873e(cVar));
        }
        return new C18879b(arrayList);
    }
}
