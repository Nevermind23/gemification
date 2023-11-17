package p514md;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import p458id.C15600b;
import p500ld.C16546c;

/* renamed from: md.b */
public class C16676b extends C16675a {

    /* renamed from: e */
    private static final C15600b f46874e = C15600b.m56349a(C16676b.class.getSimpleName());

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        f46874e.mo42878c("processCapture:", "aeState:", num);
        if (num != null && num.intValue() == 3) {
            mo43702o(Integer.MAX_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo43806p(C16546c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (((Integer) mo43701n(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2) {
            z = true;
        } else {
            z = false;
        }
        Integer num = (Integer) cVar.mo43383m(this).get(CaptureRequest.CONTROL_AE_MODE);
        if (num == null || !(num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        f46874e.mo42878c("checkIsSupported:", Boolean.valueOf(z3));
        return z3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo43807q(C16546c cVar) {
        boolean z;
        TotalCaptureResult l = cVar.mo43382l(this);
        if (l != null) {
            Integer num = (Integer) l.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null || num.intValue() != 3) {
                z = false;
            } else {
                z = true;
            }
            f46874e.mo42878c("checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        f46874e.mo42878c("checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo43808r(C16546c cVar) {
        cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
        cVar.mo43378e(this);
    }
}
