package p679yd;

import android.graphics.PointF;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import p374ce.C10396b;

/* renamed from: yd.a */
class C18878a implements Comparable {

    /* renamed from: d */
    final RectF f52835d;

    /* renamed from: e */
    final int f52836e;

    C18878a(RectF rectF, int i) {
        this.f52835d = rectF;
        this.f52836e = i;
    }

    /* renamed from: f */
    private void m63890f(RectF rectF, PointF pointF) {
        rectF.left = Math.min(rectF.left, pointF.x);
        rectF.top = Math.min(rectF.top, pointF.y);
        rectF.right = Math.max(rectF.right, pointF.x);
        rectF.bottom = Math.max(rectF.bottom, pointF.y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C18878a mo46869a(RectF rectF) {
        RectF rectF2 = new RectF();
        rectF2.set(Math.max(rectF.left, this.f52835d.left), Math.max(rectF.top, this.f52835d.top), Math.min(rectF.right, this.f52835d.right), Math.min(rectF.bottom, this.f52835d.bottom));
        return new C18878a(rectF2, this.f52836e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C18878a mo46870b(C10396b bVar) {
        return mo46869a(new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) bVar.mo27062e(), (float) bVar.mo27060c()));
    }

    /* renamed from: c */
    public int compareTo(C18878a aVar) {
        return -Integer.valueOf(this.f52836e).compareTo(Integer.valueOf(aVar.f52836e));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C18878a mo46873e(C18880c cVar) {
        RectF rectF = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f);
        PointF pointF = new PointF();
        RectF rectF2 = this.f52835d;
        pointF.set(rectF2.left, rectF2.top);
        PointF b = cVar.mo44750b(pointF);
        m63890f(rectF, b);
        RectF rectF3 = this.f52835d;
        b.set(rectF3.right, rectF3.top);
        PointF b2 = cVar.mo44750b(b);
        m63890f(rectF, b2);
        RectF rectF4 = this.f52835d;
        b2.set(rectF4.right, rectF4.bottom);
        PointF b3 = cVar.mo44750b(b2);
        m63890f(rectF, b3);
        RectF rectF5 = this.f52835d;
        b3.set(rectF5.left, rectF5.bottom);
        m63890f(rectF, cVar.mo44750b(b3));
        return new C18878a(rectF, this.f52836e);
    }
}
