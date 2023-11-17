package p500ld;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import p458id.C15600b;
import p486kd.C16401d;

/* renamed from: ld.h */
public class C16552h extends C16550f {

    /* renamed from: f */
    private static final C15600b f46705f = C15600b.m56349a(C16401d.class.getSimpleName());

    /* renamed from: e */
    private String f46706e;

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        String str = "aeMode: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)) + " aeLock: " + ((Boolean) totalCaptureResult.get(CaptureResult.CONTROL_AE_LOCK)) + " aeState: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE)) + " aeTriggerState: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER)) + " afState: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE)) + " afTriggerState: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_TRIGGER));
        if (!str.equals(this.f46706e)) {
            this.f46706e = str;
            f46705f.mo42878c(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo43700l(C16546c cVar) {
        super.mo43700l(cVar);
        mo43702o(0);
        mo43692d(cVar);
    }
}
