package p500ld;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ld.f */
public abstract class C16550f implements C16544a {

    /* renamed from: a */
    private final List f46701a = new ArrayList();

    /* renamed from: b */
    private int f46702b;

    /* renamed from: c */
    private C16546c f46703c;

    /* renamed from: d */
    private boolean f46704d;

    /* renamed from: a */
    public final void mo43689a(C16546c cVar) {
        cVar.mo43377c(this);
        if (!mo43699j()) {
            mo43695k(cVar);
            mo43702o(Integer.MAX_VALUE);
        }
        this.f46704d = false;
    }

    /* renamed from: b */
    public void mo43690b(C16545b bVar) {
        this.f46701a.remove(bVar);
    }

    /* renamed from: c */
    public void mo43691c(C16545b bVar) {
        if (!this.f46701a.contains(bVar)) {
            this.f46701a.add(bVar);
            bVar.mo43694a(this, mo43698i());
        }
    }

    /* renamed from: d */
    public final void mo43692d(C16546c cVar) {
        this.f46703c = cVar;
        cVar.mo43380h(this);
        if (cVar.mo43382l(this) != null) {
            mo26303m(cVar);
        } else {
            this.f46704d = true;
        }
    }

    /* renamed from: e */
    public void mo26301e(C16546c cVar, CaptureRequest captureRequest) {
        if (this.f46704d) {
            mo26303m(cVar);
            this.f46704d = false;
        }
    }

    /* renamed from: f */
    public void mo43693f(C16546c cVar, CaptureRequest captureRequest, CaptureResult captureResult) {
    }

    /* renamed from: g */
    public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C16546c mo43697h() {
        return this.f46703c;
    }

    /* renamed from: i */
    public final int mo43698i() {
        return this.f46702b;
    }

    /* renamed from: j */
    public boolean mo43699j() {
        return this.f46702b == Integer.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo43695k(C16546c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo43700l(C16546c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo26303m(C16546c cVar) {
        this.f46703c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Object mo43701n(CameraCharacteristics.Key key, Object obj) {
        Object obj2 = this.f46703c.mo43381i(this).get(key);
        return obj2 == null ? obj : obj2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo43702o(int i) {
        if (i != this.f46702b) {
            this.f46702b = i;
            for (C16545b a : this.f46701a) {
                a.mo43694a(this, this.f46702b);
            }
            if (this.f46702b == Integer.MAX_VALUE) {
                this.f46703c.mo43377c(this);
                mo43700l(this.f46703c);
            }
        }
    }
}
