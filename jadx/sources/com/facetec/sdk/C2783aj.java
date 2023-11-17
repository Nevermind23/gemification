package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.facetec.sdk.aj */
final class C2783aj extends C2780ai implements Camera.AutoFocusCallback, Camera.ErrorCallback, Camera.PreviewCallback, SurfaceHolder.Callback {

    /* renamed from: B */
    private static /* synthetic */ boolean f8841B = true;

    /* renamed from: C */
    private final Camera.AutoFocusMoveCallback f8842C = new C3628v0(this);

    /* renamed from: D */
    private final Camera.AutoFocusCallback f8843D = new C3649w0(this);

    /* renamed from: h */
    C2784ak f8844h = null;

    /* renamed from: k */
    private int f8845k;

    /* renamed from: l */
    private final WeakReference<C2829bc> f8846l;

    /* renamed from: m */
    private boolean f8847m = false;

    /* renamed from: n */
    private Camera f8848n = null;

    /* renamed from: o */
    private final Handler f8849o;

    /* renamed from: p */
    private boolean f8850p;

    /* renamed from: q */
    private boolean f8851q = false;

    /* renamed from: r */
    private boolean f8852r = false;

    /* renamed from: s */
    private final C3179h f8853s;

    /* renamed from: t */
    private SurfaceHolder f8854t;

    /* renamed from: u */
    private boolean f8855u = false;

    /* renamed from: v */
    private String f8856v = "";

    /* renamed from: w */
    private boolean f8857w = false;

    /* renamed from: x */
    private boolean f8858x = false;

    /* renamed from: y */
    private final Handler f8859y = new Handler(Looper.getMainLooper());

    /* renamed from: z */
    private long f8860z = -1;

    private C2783aj(Activity activity, boolean z) {
        this.f8846l = new WeakReference<>((C2829bc) activity);
        C2780ai.f8828e = z;
        HandlerThread handlerThread = new HandlerThread("CameraHandlerThread");
        handlerThread.start();
        this.f8849o = new Handler(handlerThread.getLooper());
        this.f8853s = new C3179h(activity);
    }

    /* renamed from: c */
    static C2783aj m10785c(Activity activity, boolean z) {
        C2783aj ajVar = new C2783aj(activity, z);
        ajVar.f8853s.getHolder().addCallback(ajVar);
        ajVar.f8850p = true;
        return ajVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m10815s() {
        try {
            m10805n();
        } catch (Exception e) {
            C3330l.m13346d(e);
            C2810ax.m10991b(e.getMessage());
            m10793e(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m10816t() {
        C3179h hVar = this.f8853s;
        C2784ak akVar = this.f8844h;
        hVar.setAspectRatio(akVar.f8861a, akVar.f8862b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8812a(boolean z, ViewGroup viewGroup) {
        if (z) {
            this.f8852r = true;
        }
        if (!this.f8855u) {
            if (this.f8857w) {
                new Handler(Looper.getMainLooper()).postDelayed(new C3691y0(this, viewGroup), m10801l());
                return;
            }
            m10792e(viewGroup);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8814b(boolean z) {
        Camera camera = this.f8848n;
        if (camera != null && this.f8851q != (!z)) {
            if (z) {
                camera.stopPreview();
                this.f8851q = false;
                return;
            }
            try {
                camera.setPreviewCallback(this);
                this.f8848n.startPreview();
                this.f8851q = true;
            } catch (Exception e) {
                C2867c cVar = C2867c.STARTPREVIEW_EXCEPTION;
                StringBuilder sb = new StringBuilder("EXCEPTION: startPreview failed -- ");
                sb.append(e.getMessage());
                sb.append(" ");
                sb.append(C3555s.m13884a((Activity) this.f8846l.get()));
                C3555s.m13898c((Context) this.f8846l.get(), cVar, sb.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8816d(boolean z) {
        Camera camera = this.f8848n;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.size() > 0) {
                if (z && supportedFlashModes.contains("torch")) {
                    parameters.setFlashMode("torch");
                } else if (!z && supportedFlashModes.contains("off")) {
                    parameters.setFlashMode("off");
                }
            }
            this.f8848n.setParameters(parameters);
            mo8814b(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8817e() {
        if (C2780ai.f8828e) {
            mo8814b(true);
            mo8814b(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo8834i() {
        return this.f8858x;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
    }

    public final void onError(int i, Camera camera) {
        if (i == 100) {
            try {
                m10803m();
                m10805n();
            } catch (Exception e) {
                C3330l.m13346d(e);
                StringBuilder sb = new StringBuilder("Legacy camera error during cleanup and setup camera: ");
                sb.append(e.getMessage());
                m10793e(sb.toString());
            }
        } else {
            try {
                throw new RuntimeException("Legacy camera error: ".concat(String.valueOf(i)));
            } catch (Exception e2) {
                C3330l.m13346d(e2);
                m10793e("Legacy camera error with code: ".concat(String.valueOf(i)));
            }
        }
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        C2888cg cgVar;
        C2848bl blVar;
        if (this.f8835i && !C2780ai.f8828e) {
            C2809aw.m10981d("CLFFT");
        }
        this.f8834b = true;
        C2831bd bdVar = (C2831bd) this.f8846l.get();
        if (bdVar != null && (cgVar = bdVar.f9082b) != null) {
            boolean z = C2780ai.f8828e;
            if (!z || (blVar = bdVar.f9160k) == null || !blVar.f9281g) {
                if (!z) {
                    C2784ak akVar = this.f8844h;
                    cgVar.mo9019d(bArr, akVar.f8862b, akVar.f8861a, this.f8845k, Boolean.FALSE);
                }
                this.f8835i = false;
                return;
            }
            C2784ak akVar2 = this.f8844h;
            cgVar.mo9019d(bArr, akVar2.f8862b, akVar2.f8861a, this.f8845k, Boolean.FALSE);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f8854t = surfaceHolder;
        this.f8849o.post(new C3535r0(this));
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        m10803m();
        if (surfaceHolder != null && surfaceHolder.getSurface() != null) {
            surfaceHolder.removeCallback(this);
            surfaceHolder.getSurface().release();
            this.f8850p = false;
        }
    }

    /* renamed from: h */
    static synchronized C2784ak m10796h() {
        C2784ak b;
        synchronized (C2783aj.class) {
            Camera d = m10788d(new Camera.CameraInfo());
            b = m10782b(d);
            d.stopPreview();
            d.release();
        }
        return b;
    }

    /* renamed from: j */
    static synchronized C2784ak m10797j() {
        C2784ak d;
        synchronized (C2783aj.class) {
            Camera a = m10778a(new Camera.CameraInfo());
            d = m10789d(a);
            a.stopPreview();
            a.release();
        }
        return d;
    }

    /* renamed from: k */
    private void m10799k() {
        this.f8847m = false;
        Camera camera = this.f8848n;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: l */
    private long m10801l() {
        if (this.f8860z != -1) {
            long nanoTime = (System.nanoTime() / 1000000) - this.f8860z;
            if (nanoTime < 8000) {
                return 8000 - nanoTime;
            }
        }
        return 0;
    }

    /* renamed from: m */
    private synchronized void m10803m() {
        Camera camera = this.f8848n;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
                this.f8848n.stopPreview();
                this.f8848n.setPreviewCallback((Camera.PreviewCallback) null);
                this.f8848n.release();
            } catch (Exception e) {
                try {
                    C2810ax.m10991b(e.getMessage());
                } catch (Throwable th) {
                    this.f8848n = null;
                    throw th;
                }
            }
            this.f8848n = null;
        }
        Handler handler = this.f8849o;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b9  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m10805n() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.ref.WeakReference<com.facetec.sdk.bc> r0 = r10.f8846l     // Catch:{ all -> 0x01d3 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01d3 }
            com.facetec.sdk.bc r0 = (com.facetec.sdk.C2829bc) r0     // Catch:{ all -> 0x01d3 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r10)
            return
        L_0x000d:
            r1 = 0
            r10.f8858x = r1     // Catch:{ all -> 0x01d3 }
            r10.f8852r = r1     // Catch:{ all -> 0x01d3 }
            r10.f8847m = r1     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera r2 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            if (r2 == 0) goto L_0x001a
            monitor-exit(r10)
            return
        L_0x001a:
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo     // Catch:{ all -> 0x01d3 }
            r2.<init>()     // Catch:{ all -> 0x01d3 }
            boolean r3 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x01d3 }
            if (r3 != 0) goto L_0x002f
            boolean r3 = com.facetec.sdk.C2827ba.f9071d     // Catch:{ all -> 0x01d3 }
            if (r3 == 0) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            android.hardware.Camera r3 = m10788d((android.hardware.Camera.CameraInfo) r2)     // Catch:{ all -> 0x01d3 }
            r10.f8848n = r3     // Catch:{ all -> 0x01d3 }
            goto L_0x0035
        L_0x002f:
            android.hardware.Camera r3 = m10778a((android.hardware.Camera.CameraInfo) r2)     // Catch:{ all -> 0x01d3 }
            r10.f8848n = r3     // Catch:{ all -> 0x01d3 }
        L_0x0035:
            android.hardware.Camera r3 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            r3.setErrorCallback(r10)     // Catch:{ all -> 0x01d3 }
            boolean r3 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x01d3 }
            if (r3 != 0) goto L_0x0064
            boolean r3 = com.facetec.sdk.C2827ba.f9071d     // Catch:{ all -> 0x01d3 }
            if (r3 == 0) goto L_0x0043
            goto L_0x0064
        L_0x0043:
            android.hardware.Camera r3 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            com.facetec.sdk.ak r3 = m10782b((android.hardware.Camera) r3)     // Catch:{ all -> 0x01d3 }
            r10.f8844h = r3     // Catch:{ all -> 0x01d3 }
            boolean r4 = f8841B     // Catch:{ all -> 0x01d3 }
            if (r4 != 0) goto L_0x006c
            com.facetec.sdk.ak r4 = com.facetec.sdk.C2780ai.f8825a     // Catch:{ all -> 0x01d3 }
            int r5 = r4.f8861a     // Catch:{ all -> 0x01d3 }
            int r6 = r3.f8861a     // Catch:{ all -> 0x01d3 }
            if (r5 != r6) goto L_0x005e
            int r4 = r4.f8862b     // Catch:{ all -> 0x01d3 }
            int r3 = r3.f8862b     // Catch:{ all -> 0x01d3 }
            if (r4 != r3) goto L_0x005e
            goto L_0x006c
        L_0x005e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x01d3 }
            r0.<init>()     // Catch:{ all -> 0x01d3 }
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x0064:
            android.hardware.Camera r3 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            com.facetec.sdk.ak r3 = m10789d((android.hardware.Camera) r3)     // Catch:{ all -> 0x01d3 }
            r10.f8844h = r3     // Catch:{ all -> 0x01d3 }
        L_0x006c:
            android.view.WindowManager r3 = r0.getWindowManager()     // Catch:{ all -> 0x01d3 }
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ all -> 0x01d3 }
            int r3 = r3.getRotation()     // Catch:{ all -> 0x01d3 }
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            r6 = 1
            if (r3 == 0) goto L_0x0087
            if (r3 == r6) goto L_0x008e
            r7 = 2
            if (r3 == r7) goto L_0x008b
            r7 = 3
            if (r3 == r7) goto L_0x0089
        L_0x0087:
            r3 = r1
            goto L_0x008f
        L_0x0089:
            r3 = r4
            goto L_0x008f
        L_0x008b:
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x008f
        L_0x008e:
            r3 = r5
        L_0x008f:
            int r2 = r2.orientation     // Catch:{ all -> 0x01d3 }
            int r7 = r2 + r3
            int r7 = r7 % 360
            r10.f8845k = r7     // Catch:{ all -> 0x01d3 }
            com.facetec.sdk.C2780ai.f8832j = r7     // Catch:{ all -> 0x01d3 }
            int r7 = 360 - r7
            int r7 = r7 % 360
            boolean r8 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x01d3 }
            if (r8 != 0) goto L_0x00a5
            boolean r8 = com.facetec.sdk.C2827ba.f9071d     // Catch:{ all -> 0x01d3 }
            if (r8 == 0) goto L_0x00aa
        L_0x00a5:
            int r2 = r2 - r3
            int r2 = r2 + 360
            int r7 = r2 % 360
        L_0x00aa:
            android.hardware.Camera r2 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            r2.setDisplayOrientation(r7)     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera r2 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch:{ all -> 0x01d3 }
            if (r7 == r5) goto L_0x00c2
            if (r7 != r4) goto L_0x00ba
            goto L_0x00c2
        L_0x00ba:
            com.facetec.sdk.ak r3 = r10.f8844h     // Catch:{ all -> 0x01d3 }
            int r4 = r3.f8861a     // Catch:{ all -> 0x01d3 }
            float r4 = (float) r4     // Catch:{ all -> 0x01d3 }
            int r3 = r3.f8862b     // Catch:{ all -> 0x01d3 }
            goto L_0x00c9
        L_0x00c2:
            com.facetec.sdk.ak r3 = r10.f8844h     // Catch:{ all -> 0x01d3 }
            int r4 = r3.f8862b     // Catch:{ all -> 0x01d3 }
            float r4 = (float) r4     // Catch:{ all -> 0x01d3 }
            int r3 = r3.f8861a     // Catch:{ all -> 0x01d3 }
        L_0x00c9:
            float r3 = (float) r3     // Catch:{ all -> 0x01d3 }
            float r4 = r4 / r3
            boolean r3 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x01d3 }
            if (r3 == 0) goto L_0x0105
            java.util.List r3 = r2.getSupportedPictureSizes()     // Catch:{ all -> 0x01d3 }
            com.facetec.sdk.s0 r5 = new com.facetec.sdk.s0     // Catch:{ all -> 0x01d3 }
            r5.<init>()     // Catch:{ all -> 0x01d3 }
            java.util.Collections.sort(r3, r5)     // Catch:{ all -> 0x01d3 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x01d3 }
        L_0x00df:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x01d3 }
            if (r7 == 0) goto L_0x00f7
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera$Size r7 = (android.hardware.Camera.Size) r7     // Catch:{ all -> 0x01d3 }
            int r8 = r7.width     // Catch:{ all -> 0x01d3 }
            float r8 = (float) r8     // Catch:{ all -> 0x01d3 }
            int r9 = r7.height     // Catch:{ all -> 0x01d3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01d3 }
            float r8 = r8 / r9
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x00df
            goto L_0x00fe
        L_0x00f7:
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x01d3 }
            r7 = r3
            android.hardware.Camera$Size r7 = (android.hardware.Camera.Size) r7     // Catch:{ all -> 0x01d3 }
        L_0x00fe:
            int r3 = r7.width     // Catch:{ all -> 0x01d3 }
            int r4 = r7.height     // Catch:{ all -> 0x01d3 }
            r2.setPictureSize(r3, r4)     // Catch:{ all -> 0x01d3 }
        L_0x0105:
            com.facetec.sdk.ak r3 = r10.f8844h     // Catch:{ all -> 0x01d3 }
            int r4 = r3.f8862b     // Catch:{ all -> 0x01d3 }
            int r3 = r3.f8861a     // Catch:{ all -> 0x01d3 }
            r2.setPreviewSize(r4, r3)     // Catch:{ all -> 0x01d3 }
            r3 = 17
            r2.setPreviewFormat(r3)     // Catch:{ all -> 0x01d3 }
            r2.setAutoExposureLock(r1)     // Catch:{ all -> 0x01d3 }
            r2.setAutoWhiteBalanceLock(r1)     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera r1 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch:{ all -> 0x01d3 }
            java.util.List r1 = r1.getSupportedFocusModes()     // Catch:{ all -> 0x01d3 }
            boolean r3 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x01d3 }
            r4 = 0
            if (r3 == 0) goto L_0x0133
            java.lang.String r3 = "continuous-picture"
            boolean r3 = r1.contains(r3)     // Catch:{ all -> 0x01d3 }
            if (r3 == 0) goto L_0x0133
            java.lang.String r1 = "continuous-picture"
            goto L_0x0155
        L_0x0133:
            java.lang.String r3 = "continuous-video"
            boolean r3 = r1.contains(r3)     // Catch:{ all -> 0x01d3 }
            if (r3 == 0) goto L_0x013e
            java.lang.String r1 = "continuous-video"
            goto L_0x0155
        L_0x013e:
            java.lang.String r3 = "auto"
            boolean r3 = r1.contains(r3)     // Catch:{ all -> 0x01d3 }
            if (r3 == 0) goto L_0x0149
            java.lang.String r1 = "auto"
            goto L_0x0155
        L_0x0149:
            java.lang.String r3 = "macro"
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x0154
            java.lang.String r1 = "macro"
            goto L_0x0155
        L_0x0154:
            r1 = r4
        L_0x0155:
            if (r1 == 0) goto L_0x016d
            r10.f8856v = r1     // Catch:{ all -> 0x01d3 }
            r2.setFocusMode(r1)     // Catch:{ all -> 0x01d3 }
            boolean r1 = com.facetec.sdk.C2780ai.f8828e     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x016d
            boolean r1 = r10.m10812q()     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x016d
            android.hardware.Camera r1 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera$AutoFocusMoveCallback r3 = r10.f8842C     // Catch:{ all -> 0x01d3 }
            r1.setAutoFocusMoveCallback(r3)     // Catch:{ all -> 0x01d3 }
        L_0x016d:
            int r1 = r2.getMaxNumFocusAreas()     // Catch:{ all -> 0x01d3 }
            if (r1 <= 0) goto L_0x0176
            r2.setFocusAreas(r4)     // Catch:{ all -> 0x01d3 }
        L_0x0176:
            int r1 = r2.getMaxNumMeteringAreas()     // Catch:{ all -> 0x01d3 }
            if (r1 <= 0) goto L_0x017f
            r2.setMeteringAreas(r4)     // Catch:{ all -> 0x01d3 }
        L_0x017f:
            com.facetec.sdk.t0 r1 = new com.facetec.sdk.t0     // Catch:{ all -> 0x01d3 }
            r1.<init>(r10)     // Catch:{ all -> 0x01d3 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x01d3 }
            com.facetec.sdk.ak r0 = r10.f8844h     // Catch:{ all -> 0x01d3 }
            int r1 = r0.f8861a     // Catch:{ all -> 0x01d3 }
            int r0 = r0.f8862b     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "CLCPT"
            com.facetec.sdk.C2809aw.m10980c(r0)     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera r0 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            r0.setParameters(r2)     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera r0 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            android.view.SurfaceHolder r1 = r10.f8854t     // Catch:{ all -> 0x01d3 }
            r0.setPreviewDisplay(r1)     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera r0 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            r0.setPreviewCallback(r10)     // Catch:{ all -> 0x01d3 }
            android.hardware.Camera r0 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            r0.startPreview()     // Catch:{ all -> 0x01d3 }
            r10.f8851q = r6     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "CLCPT"
            com.facetec.sdk.C2809aw.m10981d(r0)     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = "OnePlus"
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x01d3 }
            if (r0 != 0) goto L_0x01be
            android.hardware.Camera r0 = r10.f8848n     // Catch:{ all -> 0x01d3 }
            r0.autoFocus(r10)     // Catch:{ all -> 0x01d3 }
        L_0x01be:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x01d3 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x01d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d3 }
            com.facetec.sdk.u0 r1 = new com.facetec.sdk.u0     // Catch:{ all -> 0x01d3 }
            r1.<init>(r10)     // Catch:{ all -> 0x01d3 }
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)     // Catch:{ all -> 0x01d3 }
            monitor-exit(r10)
            return
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2783aj.m10805n():void");
    }

    /* renamed from: o */
    private void m10808o() {
        if (this.f8848n != null && !this.f8856v.isEmpty()) {
            try {
                Camera.Parameters parameters = this.f8848n.getParameters();
                parameters.setFocusMode(this.f8856v);
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusAreas((List) null);
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas((List) null);
                }
                this.f8848n.setParameters(parameters);
                mo8814b(false);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m10809p() {
        this.f8855u = false;
    }

    /* renamed from: q */
    private boolean m10812q() {
        String str = this.f8856v;
        return str == "continuous-picture" || str == "continuous-video";
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m10813r() {
        if (this.f8855u) {
            this.f8858x = true;
            return;
        }
        m10799k();
        m10808o();
        this.f8858x = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo8833g() {
        if (!this.f8850p) {
            this.f8853s.getHolder().addCallback(this);
            this.f8850p = true;
        }
    }

    /* renamed from: e */
    private void m10792e(ViewGroup viewGroup) {
        if (this.f8848n != null && !this.f8847m) {
            m10779a(m10781b(C2780ai.f8829f, C2780ai.f8830g, viewGroup));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m10786c(boolean z, Camera camera) {
        this.f8857w = z;
        this.f8860z = System.nanoTime() / 1000000;
        m10799k();
        if (m10812q()) {
            m10808o();
        }
        if (this.f8852r && z) {
            C2885cd.m11847l(true);
            this.f8852r = false;
        }
    }

    /* renamed from: e */
    private void m10793e(String str) {
        C2829bc bcVar = this.f8846l.get();
        if (bcVar != null) {
            C2867c cVar = C2867c.CAMERA_LEGACY_ERROR;
            StringBuilder sb = new StringBuilder("CameraLegacy error: ");
            sb.append(str);
            sb.append(C3555s.m13884a((Activity) bcVar));
            C3555s.m13898c((Context) bcVar, cVar, sb.toString());
            bcVar.mo8910b(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m10783b(ViewGroup viewGroup) {
        if (m10801l() <= 0) {
            m10792e(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo8811a() {
        m10803m();
    }

    /* renamed from: a */
    private void m10779a(Rect rect) {
        if (!this.f8847m && this.f8848n != null && this.f8851q) {
            this.f8847m = true;
            this.f8860z = System.nanoTime() / 1000000;
            try {
                this.f8848n.cancelAutoFocus();
                Camera.Parameters parameters = this.f8848n.getParameters();
                if (parameters.getSupportedFocusModes().contains("auto")) {
                    parameters.setFocusMode("auto");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(rect, 1000));
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusAreas(arrayList);
                }
                this.f8848n.setParameters(parameters);
                mo8814b(false);
                this.f8848n.autoFocus(this.f8843D);
            } catch (Exception e) {
                e.getMessage();
                m10799k();
                m10808o();
            }
        }
    }

    /* renamed from: b */
    public final View mo8813b() {
        return this.f8853s;
    }

    /* renamed from: b */
    private static Rect m10781b(float f, float f2, ViewGroup viewGroup) {
        int d = m10787d(Float.valueOf(((f / ((float) viewGroup.getWidth())) * 2000.0f) - 1000.0f).intValue());
        int d2 = m10787d(Float.valueOf(((f2 / ((float) viewGroup.getHeight())) * 2000.0f) - 1000.0f).intValue());
        return new Rect(d, d2, d + BogInputLayout.INPUT_TYPE_TEXT_PASSWORD, d2 + BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8815d(ViewGroup viewGroup) {
        if (this.f8846l.get() != null && this.f8848n != null && this.f8851q) {
            this.f8855u = true;
            this.f8859y.removeCallbacksAndMessages((Object) null);
            this.f8859y.postDelayed(new C3472o0(this), 6000);
            this.f8849o.post(new C3514q0(this, m10781b(C2780ai.f8829f, C2780ai.f8830g, viewGroup)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ int m10784c(Camera.Size size, Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    /* renamed from: b */
    private static synchronized C2784ak m10782b(Camera camera) {
        C2784ak akVar;
        synchronized (C2783aj.class) {
            float[] fArr = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};
            ArrayList arrayList = new ArrayList();
            List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            Collections.sort(supportedPreviewSizes, new C3670x0());
            StringBuilder sb = new StringBuilder();
            sb.append(supportedPreviewSizes.get(0).width);
            sb.append("x");
            sb.append(supportedPreviewSizes.get(0).height);
            C2780ai.f8827d = sb.toString();
            C3280k.m13163d(supportedPreviewSizes);
            for (int i = 0; i < 5; i++) {
                float f = fArr[i];
                for (Camera.Size next : supportedPreviewSizes) {
                    float f2 = (float) next.width;
                    float f3 = f2 / ((float) next.height);
                    if (f3 >= f && f3 <= 1.9f && f2 >= 640.0f && f2 <= 1920.0f) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() > 0) {
                    break;
                }
            }
            akVar = new C2784ak(((Camera.Size) arrayList.get(0)).width, ((Camera.Size) arrayList.get(0)).height);
        }
        return akVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m10790d(Rect rect) {
        try {
            m10799k();
            m10779a(rect);
        } catch (Exception unused) {
            m10799k();
        }
    }

    /* renamed from: d */
    private static int m10787d(int i) {
        int round = Math.round(150.0f);
        if (Math.abs(i) + round > 1000) {
            return i > 0 ? 1000 - round : round - 1000;
        }
        return i - round;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m10791d(boolean z, Camera camera) {
        this.f8857w = !z;
        this.f8847m = z;
        this.f8860z = System.nanoTime() / 1000000;
        boolean z2 = this.f8857w;
        if (this.f8852r && z2) {
            C2885cd.m11847l(true);
            this.f8852r = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m10780b(Camera.Size size, Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    /* renamed from: a */
    private static Camera m10778a(Camera.CameraInfo cameraInfo) {
        int i = 0;
        try {
            Camera.getCameraInfo(0, cameraInfo);
        } catch (RuntimeException unused) {
            i = 1;
        }
        return Camera.open(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m10777a(Camera.Size size, Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    /* renamed from: d */
    private static Camera m10788d(Camera.CameraInfo cameraInfo) {
        int i;
        try {
            Camera.getCameraInfo(1, cameraInfo);
            i = 1;
        } catch (RuntimeException unused) {
            i = 0;
            Camera.getCameraInfo(0, cameraInfo);
        }
        C2809aw.m10980c("CLOT");
        C2809aw.m10980c("CLFFT");
        if (cameraInfo.facing == 1) {
            Camera open = Camera.open(i);
            C2809aw.m10981d("CLOT");
            return open;
        }
        throw new C2798as("Front facing camera not available");
    }

    /* renamed from: d */
    private static synchronized C2784ak m10789d(Camera camera) {
        C2784ak akVar;
        synchronized (C2783aj.class) {
            ArrayList arrayList = new ArrayList();
            List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            float d = C2780ai.m10765d();
            Collections.sort(supportedPreviewSizes, new C3493p0());
            StringBuilder sb = new StringBuilder();
            sb.append(supportedPreviewSizes.get(0).width);
            sb.append("x");
            sb.append(supportedPreviewSizes.get(0).height);
            C2780ai.f8827d = sb.toString();
            for (Camera.Size next : supportedPreviewSizes) {
                float f = (float) next.width;
                if (f / ((float) next.height) == d && f <= 1920.0f) {
                    arrayList.add(next);
                }
            }
            akVar = new C2784ak(((Camera.Size) arrayList.get(0)).width, ((Camera.Size) arrayList.get(0)).height);
        }
        return akVar;
    }
}
