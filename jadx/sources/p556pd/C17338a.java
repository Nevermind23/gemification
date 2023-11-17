package p556pd;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import p374ce.C10396b;
import p458id.C15600b;
import p570qd.C17486a;
import p570qd.C17488b;
import p570qd.C17489c;
import p679yd.C18880c;

/* renamed from: pd.a */
public class C17338a implements C18880c {

    /* renamed from: c */
    protected static final C15600b f48647c = C15600b.m56349a(C17338a.class.getSimpleName());

    /* renamed from: a */
    private final int f48648a;

    /* renamed from: b */
    private final C10396b f48649b;

    public C17338a(C17486a aVar, C10396b bVar) {
        this.f48648a = -aVar.mo45010c(C17489c.SENSOR, C17489c.VIEW, C17488b.ABSOLUTE);
        this.f48649b = bVar;
    }

    /* renamed from: b */
    public PointF mo44750b(PointF pointF) {
        PointF pointF2 = new PointF();
        pointF2.x = ((pointF.x / ((float) this.f48649b.mo27062e())) * 2000.0f) - 0.0040893555f;
        pointF2.y = ((pointF.y / ((float) this.f48649b.mo27060c())) * 2000.0f) - 0.0040893555f;
        PointF pointF3 = new PointF();
        double d = (((double) this.f48648a) * 3.141592653589793d) / 180.0d;
        pointF3.x = (float) ((((double) pointF2.x) * Math.cos(d)) - (((double) pointF2.y) * Math.sin(d)));
        pointF3.y = (float) ((((double) pointF2.x) * Math.sin(d)) + (((double) pointF2.y) * Math.cos(d)));
        f48647c.mo42878c("scaled:", pointF2, "rotated:", pointF3);
        return pointF3;
    }

    /* renamed from: c */
    public Camera.Area mo44749a(RectF rectF, int i) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new Camera.Area(rect, i);
    }
}
