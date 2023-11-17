package p542od;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import p500ld.C16546c;
import p500ld.C16550f;

/* renamed from: od.b */
public abstract class C17171b extends C16550f {

    /* renamed from: e */
    private boolean f48194e;

    protected C17171b(boolean z) {
        this.f48194e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo26303m(C16546c cVar) {
        MeteringRectangle meteringRectangle;
        super.mo26303m(cVar);
        if (this.f48194e) {
            meteringRectangle = new MeteringRectangle((Rect) mo43701n(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE, new Rect()), 0);
        } else {
            meteringRectangle = null;
        }
        mo44592p(cVar, meteringRectangle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo44592p(C16546c cVar, MeteringRectangle meteringRectangle);
}
