package p542od;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.List;
import p458id.C15600b;
import p500ld.C16546c;

/* renamed from: od.c */
public class C17172c extends C17170a {

    /* renamed from: k */
    private static final C15600b f48195k = C15600b.m56349a(C17172c.class.getSimpleName());

    /* renamed from: i */
    private boolean f48196i = false;

    /* renamed from: j */
    private boolean f48197j = false;

    public C17172c(List list, boolean z) {
        super(list, z);
    }

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        f48195k.mo42878c("onCaptureCompleted:", "aeState:", num, "aeTriggerState:", num2);
        if (num != null) {
            if (mo43698i() == 0) {
                int intValue = num.intValue();
                if (intValue != 2) {
                    if (intValue == 3) {
                        mo44591t(false);
                        mo43702o(Integer.MAX_VALUE);
                    } else if (intValue != 4) {
                        if (intValue == 5) {
                            mo43702o(1);
                        }
                    }
                }
                if (num2 != null && num2.intValue() == 1) {
                    mo44591t(true);
                    mo43702o(Integer.MAX_VALUE);
                }
            }
            if (mo43698i() == 1) {
                int intValue2 = num.intValue();
                if (intValue2 != 2) {
                    if (intValue2 == 3) {
                        mo44591t(false);
                        mo43702o(Integer.MAX_VALUE);
                        return;
                    } else if (intValue2 != 4) {
                        return;
                    }
                }
                mo44591t(true);
                mo43702o(Integer.MAX_VALUE);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo43700l(C16546c cVar) {
        super.mo43700l(cVar);
        cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo44587p(C16546c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (((Integer) mo43701n(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() == 2) {
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
        this.f48197j = !z;
        if (((Integer) mo43701n(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f48196i = z3;
        if (!z2 || (!this.f48197j && !z3)) {
            z4 = false;
        } else {
            z4 = true;
        }
        f48195k.mo42878c("checkIsSupported:", Boolean.valueOf(z4), "trigger:", Boolean.valueOf(this.f48197j), "areas:", Boolean.valueOf(this.f48196i));
        return z4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo44588q(C16546c cVar) {
        boolean z;
        TotalCaptureResult l = cVar.mo43382l(this);
        if (l != null) {
            Integer num = (Integer) l.get(CaptureResult.CONTROL_AE_STATE);
            if (num == null || num.intValue() != 2) {
                z = false;
            } else {
                z = true;
            }
            f48195k.mo42878c("checkShouldSkip:", Boolean.valueOf(z));
            return z;
        }
        f48195k.mo42878c("checkShouldSkip: false - lastResult is null.");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo44590s(C16546c cVar, List list) {
        f48195k.mo42878c("onStarted:", "with areas:", list);
        if (this.f48196i && !list.isEmpty()) {
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(((Integer) mo43701n(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue(), list.size())).toArray(new MeteringRectangle[0]));
        }
        if (this.f48197j) {
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        }
        cVar.mo43378e(this);
        if (this.f48197j) {
            mo43702o(0);
        } else {
            mo43702o(1);
        }
    }
}
