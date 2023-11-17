package p500ld;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: ld.d */
public abstract class C16547d extends C16550f {

    /* renamed from: ld.d$a */
    class C16548a implements C16545b {
        C16548a() {
        }

        /* renamed from: a */
        public void mo43694a(C16544a aVar, int i) {
            C16547d.this.mo43702o(i);
            if (i == Integer.MAX_VALUE) {
                aVar.mo43690b(this);
            }
        }
    }

    /* renamed from: e */
    public void mo26301e(C16546c cVar, CaptureRequest captureRequest) {
        super.mo26301e(cVar, captureRequest);
        mo43696p().mo26301e(cVar, captureRequest);
    }

    /* renamed from: f */
    public void mo43693f(C16546c cVar, CaptureRequest captureRequest, CaptureResult captureResult) {
        super.mo43693f(cVar, captureRequest, captureResult);
        mo43696p().mo43693f(cVar, captureRequest, captureResult);
    }

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        mo43696p().mo26302g(cVar, captureRequest, totalCaptureResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo43695k(C16546c cVar) {
        super.mo43695k(cVar);
        mo43696p().mo43695k(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo26303m(C16546c cVar) {
        super.mo26303m(cVar);
        mo43696p().mo43691c(new C16548a());
        mo43696p().mo26303m(cVar);
    }

    /* renamed from: p */
    public abstract C16550f mo43696p();
}
