package p514md;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import p458id.C15600b;
import p500ld.C16546c;

/* renamed from: md.c */
public class C16677c extends C16675a {

    /* renamed from: e */
    private static final C15600b f46875e = C15600b.m56349a(C16677c.class.getSimpleName());

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
        f46875e.mo42878c("onCapture:", "afState:", num, "afMode:", num2);
        if (num != null && num2 != null && num2.intValue() == 1) {
            int intValue = num.intValue();
            if (intValue == 0 || intValue == 2 || intValue == 4 || intValue == 5 || intValue == 6) {
                mo43702o(Integer.MAX_VALUE);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo43806p(C16546c cVar) {
        for (int i : (int[]) mo43701n(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0])) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo43807q(C16546c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        TotalCaptureResult l = cVar.mo43382l(this);
        if (l != null) {
            Integer num = (Integer) l.get(CaptureResult.CONTROL_AF_STATE);
            if (num == null || !(num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 0 || num.intValue() == 2 || num.intValue() == 6)) {
                z = false;
            } else {
                z = true;
            }
            Integer num2 = (Integer) l.get(CaptureResult.CONTROL_AF_MODE);
            if (num2 == null || num2.intValue() != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z || !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            f46875e.mo42878c("checkShouldSkip:", Boolean.valueOf(z3));
            return z3;
        }
        f46875e.mo42878c("checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo43808r(C16546c cVar) {
        cVar.mo43383m(this).set(CaptureRequest.CONTROL_AF_MODE, 1);
        cVar.mo43383m(this).set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        cVar.mo43378e(this);
    }
}
