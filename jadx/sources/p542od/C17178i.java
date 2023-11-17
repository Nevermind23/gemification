package p542od;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.List;
import p458id.C15600b;
import p500ld.C16546c;

/* renamed from: od.i */
public class C17178i extends C17170a {

    /* renamed from: i */
    private static final C15600b f48208i = C15600b.m56349a(C17178i.class.getSimpleName());

    public C17178i(List list, boolean z) {
        super(list, z);
    }

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        f48208i.mo42878c("onCaptureCompleted:", "awbState:", num);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 2) {
                mo44591t(true);
                mo43702o(Integer.MAX_VALUE);
            } else if (intValue == 3) {
                mo44591t(false);
                mo43702o(Integer.MAX_VALUE);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo44587p(C16546c cVar) {
        boolean z;
        boolean z2;
        if (((Integer) mo43701n(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2) {
            z = true;
        } else {
            z = false;
        }
        Integer num = (Integer) cVar.mo43383m(this).get(CaptureRequest.CONTROL_AWB_MODE);
        if (!z || num == null || num.intValue() != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        f48208i.mo42878c("checkIsSupported:", Boolean.valueOf(z2));
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo44588q(C16546c cVar) {
        boolean z;
        TotalCaptureResult l = cVar.mo43382l(this);
        if (l != null) {
            Integer num = (Integer) l.get(CaptureResult.CONTROL_AWB_STATE);
            if (num == null || num.intValue() != 2) {
                z = false;
            } else {
                z = true;
            }
            f48208i.mo42878c("checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        f48208i.mo42878c("checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo44590s(C16546c cVar, List list) {
        f48208i.mo42878c("onStarted:", "with areas:", list);
        int intValue = ((Integer) mo43701n(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (!list.isEmpty() && intValue > 0) {
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AWB_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(intValue, list.size())).toArray(new MeteringRectangle[0]));
            cVar.mo43378e(this);
        }
    }
}
