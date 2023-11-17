package p346ae;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import p500ld.C16544a;
import p500ld.C16546c;
import p500ld.C16550f;
import p500ld.C16551g;

/* renamed from: ae.f */
public class C9814f extends C9818g {

    /* renamed from: n */
    private final C16544a f26647n;

    /* renamed from: o */
    private final C16546c f26648o;

    /* renamed from: p */
    private final boolean f26649p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Integer f26650q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Integer f26651r;

    /* renamed from: ae.f$a */
    class C9815a extends C16551g {
        C9815a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26309b(C16544a aVar) {
            C9821h.f26668g.mo42878c("Taking picture with super.take().");
            C9814f.super.mo26297c();
        }
    }

    /* renamed from: ae.f$b */
    private class C9816b extends C16550f {
        private C9816b() {
        }

        /* renamed from: g */
        public void mo26302g(C16546c cVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.mo26302g(cVar, captureRequest, totalCaptureResult);
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
            if (num == null) {
                C9821h.f26668g.mo42880h("FlashAction:", "Waiting flash, but flashState is null!", "Taking snapshot.");
                mo43702o(Integer.MAX_VALUE);
            } else if (num.intValue() == 3) {
                C9821h.f26668g.mo42878c("FlashAction:", "Waiting flash and we have FIRED state!", "Taking snapshot.");
                mo43702o(Integer.MAX_VALUE);
            } else {
                C9821h.f26668g.mo42878c("FlashAction:", "Waiting flash but flashState is", num, ". Waiting...");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo26303m(C16546c cVar) {
            super.mo26303m(cVar);
            C9821h.f26668g.mo42878c("FlashAction:", "Parameters locked, opening torch.");
            cVar.mo43383m(this).set(CaptureRequest.FLASH_MODE, 2);
            cVar.mo43383m(this).set(CaptureRequest.CONTROL_AE_MODE, 1);
            cVar.mo43378e(this);
        }

        /* synthetic */ C9816b(C9814f fVar, C9815a aVar) {
            this();
        }
    }

    /* renamed from: ae.f$c */
    private class C9817c extends C16550f {
        private C9817c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo26303m(C16546c cVar) {
            super.mo26303m(cVar);
            try {
                C9821h.f26668g.mo42878c("ResetFlashAction:", "Reverting the flash changes.");
                CaptureRequest.Builder m = cVar.mo43383m(this);
                m.set(CaptureRequest.CONTROL_AE_MODE, 1);
                m.set(CaptureRequest.FLASH_MODE, 0);
                cVar.mo43379g(this, m);
                m.set(CaptureRequest.CONTROL_AE_MODE, C9814f.this.f26650q);
                m.set(CaptureRequest.FLASH_MODE, C9814f.this.f26651r);
                cVar.mo43378e(this);
            } catch (CameraAccessException unused) {
            }
        }

        /* synthetic */ C9817c(C9814f fVar, C9815a aVar) {
            this();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9814f(com.otaliastudios.cameraview.C11278a.C11279a r7, p486kd.C16365b r8, p360be.C10254d r9, p374ce.C10395a r10) {
        /*
            r6 = this;
            zd.a r5 = r8.mo43439H1()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f26648o = r8
            r7 = 2
            ld.f[] r9 = new p500ld.C16550f[r7]
            md.d r10 = new md.d
            r10.<init>()
            r0 = 2500(0x9c4, double:1.235E-320)
            ld.f r10 = p500ld.C16549e.m58777b(r0, r10)
            r0 = 0
            r9[r0] = r10
            ae.f$b r10 = new ae.f$b
            r1 = 0
            r10.<init>(r6, r1)
            r2 = 1
            r9[r2] = r10
            ld.f r9 = p500ld.C16549e.m58776a(r9)
            r6.f26647n = r9
            ae.f$a r10 = new ae.f$a
            r10.<init>()
            r9.mo43691c(r10)
            android.hardware.camera2.TotalCaptureResult r10 = r8.mo43382l(r9)
            if (r10 != 0) goto L_0x004b
            id.b r3 = p346ae.C9821h.f26668g
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r4 = "Picture snapshot requested very early, before the first preview frame."
            r7[r0] = r4
            java.lang.String r4 = "Metering might not work as intended."
            r7[r2] = r4
            r3.mo42880h(r7)
        L_0x004b:
            if (r10 != 0) goto L_0x004e
            goto L_0x0057
        L_0x004e:
            android.hardware.camera2.CaptureResult$Key r7 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r7 = r10.get(r7)
            r1 = r7
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x0057:
            boolean r7 = r8.mo43459S()
            if (r7 == 0) goto L_0x0067
            if (r1 == 0) goto L_0x0067
            int r7 = r1.intValue()
            r10 = 4
            if (r7 != r10) goto L_0x0067
            r0 = r2
        L_0x0067:
            r6.f26649p = r0
            android.hardware.camera2.CaptureRequest$Builder r7 = r8.mo43383m(r9)
            android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Object r7 = r7.get(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r6.f26650q = r7
            android.hardware.camera2.CaptureRequest$Builder r7 = r8.mo43383m(r9)
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r6.f26651r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p346ae.C9814f.<init>(com.otaliastudios.cameraview.a$a, kd.b, be.d, ce.a):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26296b() {
        new C9817c(this, (C9815a) null).mo43692d(this.f26648o);
        super.mo26296b();
    }

    /* renamed from: c */
    public void mo26297c() {
        if (!this.f26649p) {
            C9821h.f26668g.mo42878c("take:", "Engine does no metering or needs no flash.", "Taking fast snapshot.");
            super.mo26297c();
            return;
        }
        C9821h.f26668g.mo42878c("take:", "Engine needs flash. Starting action");
        this.f26647n.mo43692d(this.f26648o);
    }
}
