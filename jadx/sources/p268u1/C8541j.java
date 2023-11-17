package p268u1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p061e2.C6013a;
import p061e2.C6015c;

/* renamed from: u1.j */
public class C8541j extends C8538g {

    /* renamed from: i */
    private final PointF f24256i = new PointF();

    /* renamed from: j */
    private final float[] f24257j = new float[2];

    /* renamed from: k */
    private final PathMeasure f24258k = new PathMeasure();

    /* renamed from: l */
    private C8540i f24259l;

    public C8541j(List list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo23857i(C6013a aVar, float f) {
        C8540i iVar = (C8540i) aVar;
        Path k = iVar.mo23890k();
        if (k == null) {
            return (PointF) aVar.f18759b;
        }
        C6015c cVar = this.f24231e;
        if (cVar != null) {
            PointF pointF = (PointF) cVar.mo19504b(iVar.f18764g, iVar.f18765h.floatValue(), (PointF) iVar.f18759b, (PointF) iVar.f18760c, mo23854e(), f, mo23855f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f24259l != iVar) {
            this.f24258k.setPath(k, false);
            this.f24259l = iVar;
        }
        PathMeasure pathMeasure = this.f24258k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f24257j, (float[]) null);
        PointF pointF2 = this.f24256i;
        float[] fArr = this.f24257j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f24256i;
    }
}
