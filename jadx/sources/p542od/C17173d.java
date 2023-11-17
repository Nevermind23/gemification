package p542od;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import p458id.C15600b;
import p500ld.C16546c;

/* renamed from: od.d */
public class C17173d extends C17171b {

    /* renamed from: f */
    private static final C15600b f48198f = C15600b.m56349a(C17173d.class.getSimpleName());

    public C17173d() {
        super(true);
    }

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        if (mo43698i() == 0) {
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
            cVar.mo43378e(this);
            mo43702o(Integer.MAX_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo44592p(C16546c cVar, MeteringRectangle meteringRectangle) {
        Integer num;
        int intValue = ((Integer) mo43701n(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue();
        if (meteringRectangle != null && intValue > 0) {
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        TotalCaptureResult l = cVar.mo43382l(this);
        if (l == null) {
            num = null;
        } else {
            num = (Integer) l.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        }
        C15600b bVar = f48198f;
        bVar.mo42878c("onStarted:", "last precapture trigger is", num);
        if (num != null && num.intValue() == 1) {
            bVar.mo42878c("onStarted:", "canceling precapture.");
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
        cVar.mo43378e(this);
        mo43702o(0);
    }
}
