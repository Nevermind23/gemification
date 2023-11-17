package p542od;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import p458id.C15600b;
import p500ld.C16546c;

/* renamed from: od.j */
public class C17179j extends C17171b {

    /* renamed from: f */
    private static final C15600b f48209f = C15600b.m56349a(C17179j.class.getSimpleName());

    public C17179j() {
        super(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo44592p(C16546c cVar, MeteringRectangle meteringRectangle) {
        f48209f.mo42880h("onStarted:", "with area:", meteringRectangle);
        int intValue = ((Integer) mo43701n(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (meteringRectangle != null && intValue > 0) {
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AWB_REGIONS, new MeteringRectangle[]{meteringRectangle});
            cVar.mo43378e(this);
        }
        mo43702o(Integer.MAX_VALUE);
    }
}
