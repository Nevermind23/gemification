package p556pd;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import com.github.mikephil.charting.utils.Utils;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p374ce.C10395a;
import p374ce.C10396b;
import p458id.C15600b;
import p570qd.C17486a;
import p570qd.C17488b;
import p570qd.C17489c;
import p679yd.C18880c;

/* renamed from: pd.b */
public class C17339b implements C18880c {

    /* renamed from: g */
    protected static final C15600b f48650g = C15600b.m56349a(C17339b.class.getSimpleName());

    /* renamed from: a */
    private final C17486a f48651a;

    /* renamed from: b */
    private final C10396b f48652b;

    /* renamed from: c */
    private final C10396b f48653c;

    /* renamed from: d */
    private final boolean f48654d;

    /* renamed from: e */
    private final CameraCharacteristics f48655e;

    /* renamed from: f */
    private final CaptureRequest.Builder f48656f;

    public C17339b(C17486a aVar, C10396b bVar, C10396b bVar2, boolean z, CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder) {
        this.f48651a = aVar;
        this.f48652b = bVar;
        this.f48653c = bVar2;
        this.f48654d = z;
        this.f48655e = cameraCharacteristics;
        this.f48656f = builder;
    }

    /* renamed from: c */
    private C10396b m60691c(C10396b bVar, PointF pointF) {
        float f;
        Rect rect = (Rect) this.f48656f.get(CaptureRequest.SCALER_CROP_REGION);
        float f2 = pointF.x;
        float f3 = Utils.FLOAT_EPSILON;
        if (rect == null) {
            f = 0.0f;
        } else {
            f = (float) rect.left;
        }
        pointF.x = f2 + f;
        float f4 = pointF.y;
        if (rect != null) {
            f3 = (float) rect.top;
        }
        pointF.y = f4 + f3;
        Rect rect2 = (Rect) this.f48655e.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect2 == null) {
            rect2 = new Rect(0, 0, bVar.mo27062e(), bVar.mo27060c());
        }
        return new C10396b(rect2.width(), rect2.height());
    }

    /* renamed from: d */
    private C10396b m60692d(C10396b bVar, PointF pointF) {
        int i;
        int i2;
        Rect rect = (Rect) this.f48656f.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect == null) {
            i = bVar.mo27062e();
        } else {
            i = rect.width();
        }
        if (rect == null) {
            i2 = bVar.mo27060c();
        } else {
            i2 = rect.height();
        }
        pointF.x += ((float) (i - bVar.mo27062e())) / 2.0f;
        pointF.y += ((float) (i2 - bVar.mo27060c())) / 2.0f;
        return new C10396b(i, i2);
    }

    /* renamed from: e */
    private C10396b m60693e(C10396b bVar, PointF pointF) {
        C10396b bVar2 = this.f48653c;
        int e = bVar.mo27062e();
        int c = bVar.mo27060c();
        C10395a g = C10395a.m37801g(bVar2);
        C10395a g2 = C10395a.m37801g(bVar);
        if (this.f48654d) {
            if (g.mo27056j() > g2.mo27056j()) {
                float j = g.mo27056j() / g2.mo27056j();
                pointF.x += (((float) bVar.mo27062e()) * (j - 1.0f)) / 2.0f;
                e = Math.round(((float) bVar.mo27062e()) * j);
            } else {
                float j2 = g2.mo27056j() / g.mo27056j();
                pointF.y += (((float) bVar.mo27060c()) * (j2 - 1.0f)) / 2.0f;
                c = Math.round(((float) bVar.mo27060c()) * j2);
            }
        }
        return new C10396b(e, c);
    }

    /* renamed from: f */
    private C10396b m60694f(C10396b bVar, PointF pointF) {
        C10396b bVar2 = this.f48653c;
        pointF.x *= ((float) bVar2.mo27062e()) / ((float) bVar.mo27062e());
        pointF.y *= ((float) bVar2.mo27060c()) / ((float) bVar.mo27060c());
        return bVar2;
    }

    /* renamed from: g */
    private C10396b m60695g(C10396b bVar, PointF pointF) {
        boolean z;
        int c = this.f48651a.mo45010c(C17489c.SENSOR, C17489c.VIEW, C17488b.ABSOLUTE);
        if (c % SubsamplingScaleImageView.ORIENTATION_180 != 0) {
            z = true;
        } else {
            z = false;
        }
        float f = pointF.x;
        float f2 = pointF.y;
        if (c == 0) {
            pointF.x = f;
            pointF.y = f2;
        } else if (c == 90) {
            pointF.x = f2;
            pointF.y = ((float) bVar.mo27062e()) - f;
        } else if (c == 180) {
            pointF.x = ((float) bVar.mo27062e()) - f;
            pointF.y = ((float) bVar.mo27060c()) - f2;
        } else if (c == 270) {
            pointF.x = ((float) bVar.mo27060c()) - f2;
            pointF.y = f;
        } else {
            throw new IllegalStateException("Unexpected angle " + c);
        }
        if (z) {
            return bVar.mo27059b();
        }
        return bVar;
    }

    /* renamed from: b */
    public PointF mo44750b(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        C10396b c = m60691c(m60692d(m60695g(m60694f(m60693e(this.f48652b, pointF2), pointF2), pointF2), pointF2), pointF2);
        C15600b bVar = f48650g;
        bVar.mo42878c("input:", pointF, "output (before clipping):", pointF2);
        if (pointF2.x < Utils.FLOAT_EPSILON) {
            pointF2.x = Utils.FLOAT_EPSILON;
        }
        if (pointF2.y < Utils.FLOAT_EPSILON) {
            pointF2.y = Utils.FLOAT_EPSILON;
        }
        if (pointF2.x > ((float) c.mo27062e())) {
            pointF2.x = (float) c.mo27062e();
        }
        if (pointF2.y > ((float) c.mo27060c())) {
            pointF2.y = (float) c.mo27060c();
        }
        bVar.mo42878c("input:", pointF, "output (after clipping):", pointF2);
        return pointF2;
    }

    /* renamed from: h */
    public MeteringRectangle mo44749a(RectF rectF, int i) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new MeteringRectangle(rect, i);
    }
}
