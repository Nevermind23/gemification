package p500ld;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: ld.j */
class C16555j extends C16547d {

    /* renamed from: e */
    private long f46710e;

    /* renamed from: f */
    private long f46711f;

    /* renamed from: g */
    private C16550f f46712g;

    C16555j(long j, C16550f fVar) {
        this.f46711f = j;
        this.f46712g = fVar;
    }

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        if (!mo43699j() && System.currentTimeMillis() > this.f46710e + this.f46711f) {
            mo43696p().mo43689a(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo26303m(C16546c cVar) {
        this.f46710e = System.currentTimeMillis();
        super.mo26303m(cVar);
    }

    /* renamed from: p */
    public C16550f mo43696p() {
        return this.f46712g;
    }
}
