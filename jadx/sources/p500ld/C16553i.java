package p500ld;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.List;

/* renamed from: ld.i */
class C16553i extends C16550f {

    /* renamed from: e */
    private final List f46707e;

    /* renamed from: f */
    private int f46708f = -1;

    /* renamed from: ld.i$a */
    class C16554a implements C16545b {
        C16554a() {
        }

        /* renamed from: a */
        public void mo43694a(C16544a aVar, int i) {
            if (i == Integer.MAX_VALUE) {
                aVar.mo43690b(this);
                C16553i.this.m58799q();
            }
        }
    }

    C16553i(List list) {
        this.f46707e = list;
        m58799q();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m58799q() {
        boolean z;
        int i = this.f46708f;
        boolean z2 = false;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (i == this.f46707e.size() - 1) {
            z2 = true;
        }
        if (z2) {
            mo43702o(Integer.MAX_VALUE);
            return;
        }
        int i2 = this.f46708f + 1;
        this.f46708f = i2;
        ((C16550f) this.f46707e.get(i2)).mo43691c(new C16554a());
        if (!z) {
            ((C16550f) this.f46707e.get(this.f46708f)).mo26303m(mo43697h());
        }
    }

    /* renamed from: e */
    public void mo26301e(C16546c cVar, CaptureRequest captureRequest) {
        super.mo26301e(cVar, captureRequest);
        int i = this.f46708f;
        if (i >= 0) {
            ((C16550f) this.f46707e.get(i)).mo26301e(cVar, captureRequest);
        }
    }

    /* renamed from: f */
    public void mo43693f(C16546c cVar, CaptureRequest captureRequest, CaptureResult captureResult) {
        super.mo43693f(cVar, captureRequest, captureResult);
        int i = this.f46708f;
        if (i >= 0) {
            ((C16550f) this.f46707e.get(i)).mo43693f(cVar, captureRequest, captureResult);
        }
    }

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        int i = this.f46708f;
        if (i >= 0) {
            ((C16550f) this.f46707e.get(i)).mo26302g(cVar, captureRequest, totalCaptureResult);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo43695k(C16546c cVar) {
        super.mo43695k(cVar);
        int i = this.f46708f;
        if (i >= 0) {
            ((C16550f) this.f46707e.get(i)).mo43695k(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo26303m(C16546c cVar) {
        super.mo26303m(cVar);
        int i = this.f46708f;
        if (i >= 0) {
            ((C16550f) this.f46707e.get(i)).mo26303m(cVar);
        }
    }
}
