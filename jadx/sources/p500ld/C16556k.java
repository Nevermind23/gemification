package p500ld;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ld.k */
class C16556k extends C16550f {

    /* renamed from: e */
    private final List f46713e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List f46714f;

    /* renamed from: ld.k$a */
    class C16557a implements C16545b {
        C16557a() {
        }

        /* renamed from: a */
        public void mo43694a(C16544a aVar, int i) {
            if (i == Integer.MAX_VALUE) {
                C16556k.this.f46714f.remove(aVar);
            }
            if (C16556k.this.f46714f.isEmpty()) {
                C16556k.this.mo43702o(Integer.MAX_VALUE);
            }
        }
    }

    C16556k(List list) {
        this.f46713e = new ArrayList(list);
        this.f46714f = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C16550f) it.next()).mo43691c(new C16557a());
        }
    }

    /* renamed from: e */
    public void mo26301e(C16546c cVar, CaptureRequest captureRequest) {
        super.mo26301e(cVar, captureRequest);
        for (C16550f fVar : this.f46713e) {
            if (!fVar.mo43699j()) {
                fVar.mo26301e(cVar, captureRequest);
            }
        }
    }

    /* renamed from: f */
    public void mo43693f(C16546c cVar, CaptureRequest captureRequest, CaptureResult captureResult) {
        super.mo43693f(cVar, captureRequest, captureResult);
        for (C16550f fVar : this.f46713e) {
            if (!fVar.mo43699j()) {
                fVar.mo43693f(cVar, captureRequest, captureResult);
            }
        }
    }

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.mo26302g(cVar, captureRequest, totalCaptureResult);
        for (C16550f fVar : this.f46713e) {
            if (!fVar.mo43699j()) {
                fVar.mo26302g(cVar, captureRequest, totalCaptureResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo43695k(C16546c cVar) {
        super.mo43695k(cVar);
        for (C16550f fVar : this.f46713e) {
            if (!fVar.mo43699j()) {
                fVar.mo43695k(cVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo26303m(C16546c cVar) {
        super.mo26303m(cVar);
        for (C16550f fVar : this.f46713e) {
            if (!fVar.mo43699j()) {
                fVar.mo26303m(cVar);
            }
        }
    }
}
