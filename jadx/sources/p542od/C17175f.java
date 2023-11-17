package p542od;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import p458id.C15600b;
import p500ld.C16546c;

/* renamed from: od.f */
public class C17175f extends C17171b {

    /* renamed from: f */
    private static final C15600b f48200f = C15600b.m56349a(C17175f.class.getSimpleName());

    public C17175f() {
        super(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo44592p(C16546c cVar, MeteringRectangle meteringRectangle) {
        boolean z;
        Integer num;
        int intValue = ((Integer) mo43701n(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0)).intValue();
        boolean z2 = true;
        if (meteringRectangle == null || intValue <= 0) {
            z = false;
        } else {
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            z = true;
        }
        TotalCaptureResult l = cVar.mo43382l(this);
        if (l == null) {
            num = null;
        } else {
            num = (Integer) l.get(CaptureResult.CONTROL_AF_TRIGGER);
        }
        f48200f.mo42880h("onStarted:", "last focus trigger is", num);
        if (num == null || num.intValue() != 1) {
            z2 = z;
        } else {
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        if (z2) {
            cVar.mo43378e(this);
        }
        mo43702o(Integer.MAX_VALUE);
    }
}
