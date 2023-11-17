package p268u1;

import android.graphics.PointF;
import java.util.List;
import p061e2.C6013a;
import p061e2.C6015c;

/* renamed from: u1.k */
public class C8542k extends C8538g {

    /* renamed from: i */
    private final PointF f24260i = new PointF();

    public C8542k(List list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo23857i(C6013a aVar, float f) {
        return mo23858j(aVar, f, f, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public PointF mo23858j(C6013a aVar, float f, float f2, float f3) {
        Object obj;
        Object obj2 = aVar.f18759b;
        if (obj2 == null || (obj = aVar.f18760c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        C6015c cVar = this.f24231e;
        if (cVar != null) {
            PointF pointF3 = (PointF) cVar.mo19504b(aVar.f18764g, aVar.f18765h.floatValue(), pointF, pointF2, f, mo23854e(), mo23855f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f24260i;
        float f4 = pointF.x;
        float f5 = f4 + (f2 * (pointF2.x - f4));
        float f6 = pointF.y;
        pointF4.set(f5, f6 + (f3 * (pointF2.y - f6)));
        return this.f24260i;
    }
}
