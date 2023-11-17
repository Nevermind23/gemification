package com.facetec.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.renderscript.Allocation;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import com.facetec.sdk.C2778ah;
import com.facetec.sdk.C2959dp;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
/* renamed from: com.facetec.sdk.ag */
final class C2773ag extends C2780ai {

    /* renamed from: A */
    private static Boolean f8785A = null;

    /* renamed from: h */
    static final String[] f8786h = {"Pixel 6"};

    /* renamed from: q */
    static Surface f8787q = null;

    /* renamed from: r */
    static final /* synthetic */ boolean f8788r = true;

    /* renamed from: z */
    private static Boolean f8789z = null;

    /* renamed from: B */
    private Handler f8790B;

    /* renamed from: C */
    private boolean f8791C = false;

    /* renamed from: D */
    private boolean f8792D = false;

    /* renamed from: E */
    private final CameraDevice.StateCallback f8793E = new CameraDevice.StateCallback() {
        public final void onDisconnected(CameraDevice cameraDevice) {
            C2773ag agVar = C2773ag.this;
            agVar.f8795k.release();
            cameraDevice.close();
            agVar.f8798n = null;
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C2773ag agVar = C2773ag.this;
            agVar.f8795k.release();
            cameraDevice.close();
            agVar.f8798n = null;
            C2829bc bcVar = agVar.f8796l.get();
            if (bcVar != null) {
                bcVar.mo8910b("Camera2 device error: ".concat(String.valueOf(i)));
                C2867c cVar = C2867c.CAMERA2_ERROR;
                StringBuilder sb = new StringBuilder("Camera2 device error: ");
                sb.append(i);
                sb.append(C3555s.m13884a((Activity) bcVar));
                C3555s.m13898c((Context) bcVar, cVar, sb.toString());
            }
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0104 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onOpened(android.hardware.camera2.CameraDevice r12) {
            /*
                r11 = this;
                java.lang.String r0 = "CTOT"
                com.facetec.sdk.C2809aw.m10981d(r0)
                com.facetec.sdk.ag r0 = com.facetec.sdk.C2773ag.this
                java.lang.String r1 = "CTCPT"
                com.facetec.sdk.C2809aw.m10980c(r1)
                r0.f8798n = r12
                com.facetec.sdk.dp r12 = r0.f8801s     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                if (r12 != 0) goto L_0x0014
                goto L_0x0139
            L_0x0014:
                com.facetec.sdk.i r12 = r0.f8799o     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.graphics.SurfaceTexture r12 = r12.getSurfaceTexture()     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                boolean r2 = com.facetec.sdk.C2773ag.f8788r     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                if (r2 != 0) goto L_0x0027
                if (r12 == 0) goto L_0x0021
                goto L_0x0027
            L_0x0021:
                java.lang.AssertionError r12 = new java.lang.AssertionError     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r12.<init>()     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                throw r12     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
            L_0x0027:
                com.facetec.sdk.ak r2 = r0.f8797m     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                int r3 = r2.f8862b     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                int r2 = r2.f8861a     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r12.setDefaultBufferSize(r3, r2)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.view.Surface r2 = new android.view.Surface     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r2.<init>(r12)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                com.facetec.sdk.dp r12 = r0.f8801s     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.renderscript.Allocation r12 = r12.f10035a     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.view.Surface r12 = r12.getSurface()     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CameraDevice r3 = r0.f8798n     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r4 = 1
                android.hardware.camera2.CaptureRequest$Builder r3 = r3.createCaptureRequest(r4)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r0.f8800p = r3     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.addTarget(r2)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.addTarget(r12)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.view.Surface r3 = com.facetec.sdk.C2773ag.f8787q     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                if (r3 == 0) goto L_0x0057
                android.hardware.camera2.CaptureRequest$Builder r5 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r5.addTarget(r3)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
            L_0x0057:
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_MODE     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.set(r5, r6)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r5 = 11
                boolean r3 = r0.mo8820d((android.hardware.camera2.CameraCharacteristics.Key<int[]>) r3, (int) r5)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                if (r3 == 0) goto L_0x0077
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.set(r6, r5)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
            L_0x0077:
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.set(r5, r6)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.set(r5, r6)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.STATISTICS_FACE_DETECT_MODE     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r6 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.set(r5, r7)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.String[] r3 = com.facetec.sdk.C2773ag.f8786h     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                int r5 = r3.length     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r7 = r6
                r8 = r7
            L_0x0098:
                if (r7 >= r5) goto L_0x00a8
                r9 = r3[r7]     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.String r10 = android.os.Build.MODEL     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                boolean r9 = r10.contains(r9)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                if (r9 == 0) goto L_0x00a5
                r8 = r4
            L_0x00a5:
                int r7 = r7 + 1
                goto L_0x0098
            L_0x00a8:
                if (r8 == 0) goto L_0x00d4
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.EDGE_MODE     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.Object r3 = r3.get(r5)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                if (r3 == 0) goto L_0x00bf
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.EDGE_MODE     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.set(r5, r7)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
            L_0x00bf:
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.Object r3 = r3.get(r5)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                if (r3 == 0) goto L_0x00d4
                android.hardware.camera2.CaptureRequest$Builder r3 = r0.f8800p     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.set(r5, r7)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
            L_0x00d4:
                java.lang.String r3 = "CTCCST"
                com.facetec.sdk.C2809aw.m10980c(r3)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                android.view.Surface r3 = com.facetec.sdk.C2773ag.f8787q     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r5 = 2
                if (r3 != 0) goto L_0x00e9
                android.view.Surface[] r3 = new android.view.Surface[r5]     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3[r6] = r2     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3[r4] = r12     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.util.List r12 = java.util.Arrays.asList(r3)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                goto L_0x00f6
            L_0x00e9:
                r7 = 3
                android.view.Surface[] r7 = new android.view.Surface[r7]     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r7[r6] = r2     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r7[r4] = r12     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r7[r5] = r3     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                java.util.List r12 = java.util.Arrays.asList(r7)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
            L_0x00f6:
                android.hardware.camera2.CameraDevice r2 = r0.f8798n     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                com.facetec.sdk.ag$4 r3 = new com.facetec.sdk.ag$4     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r3.<init>()     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                r4 = 0
                r2.createCaptureSession(r12, r3, r4)     // Catch:{ CameraAccessException -> 0x0135, IllegalStateException -> 0x0104 }
                goto L_0x0139
            L_0x0102:
                r12 = move-exception
                goto L_0x0142
            L_0x0104:
                java.lang.ref.WeakReference<com.facetec.sdk.bc> r12 = r0.f8796l     // Catch:{ all -> 0x0102 }
                java.lang.Object r12 = r12.get()     // Catch:{ all -> 0x0102 }
                if (r12 == 0) goto L_0x0139
                java.lang.ref.WeakReference<com.facetec.sdk.bc> r12 = r0.f8796l     // Catch:{ all -> 0x0102 }
                java.lang.Object r12 = r12.get()     // Catch:{ all -> 0x0102 }
                com.facetec.sdk.bc r12 = (com.facetec.sdk.C2829bc) r12     // Catch:{ all -> 0x0102 }
                com.facetec.sdk.c r2 = com.facetec.sdk.C2867c.CAMERA_ALREADY_CLOSED     // Catch:{ all -> 0x0102 }
                java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x0102 }
                r12.mo8910b(r3)     // Catch:{ all -> 0x0102 }
                java.lang.ref.WeakReference<com.facetec.sdk.bc> r12 = r0.f8796l     // Catch:{ all -> 0x0102 }
                java.lang.Object r12 = r12.get()     // Catch:{ all -> 0x0102 }
                android.content.Context r12 = (android.content.Context) r12     // Catch:{ all -> 0x0102 }
                java.lang.ref.WeakReference<com.facetec.sdk.bc> r3 = r0.f8796l     // Catch:{ all -> 0x0102 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0102 }
                android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x0102 }
                java.lang.String r3 = com.facetec.sdk.C3555s.m13884a((android.app.Activity) r3)     // Catch:{ all -> 0x0102 }
                com.facetec.sdk.C3555s.m13898c((android.content.Context) r12, (com.facetec.sdk.C2867c) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0102 }
                goto L_0x0139
            L_0x0135:
                r12 = move-exception
                com.facetec.sdk.C3330l.m13346d(r12)     // Catch:{ all -> 0x0102 }
            L_0x0139:
                java.util.concurrent.Semaphore r12 = r0.f8795k
                r12.release()
                com.facetec.sdk.C2809aw.m10981d(r1)
                return
            L_0x0142:
                java.util.concurrent.Semaphore r0 = r0.f8795k
                r0.release()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2773ag.C27765.onOpened(android.hardware.camera2.CameraDevice):void");
        }
    };

    /* renamed from: I */
    private final TextureView.SurfaceTextureListener f8794I;

    /* renamed from: k */
    final Semaphore f8795k = new Semaphore(1);

    /* renamed from: l */
    final WeakReference<C2829bc> f8796l;

    /* renamed from: m */
    final C2784ak f8797m;

    /* renamed from: n */
    CameraDevice f8798n;

    /* renamed from: o */
    final C3201i f8799o;

    /* renamed from: p */
    CaptureRequest.Builder f8800p;

    /* renamed from: s */
    C2959dp f8801s;

    /* renamed from: t */
    CameraCaptureSession f8802t;

    /* renamed from: u */
    private String f8803u;

    /* renamed from: v */
    private CameraCharacteristics f8804v;

    /* renamed from: w */
    private final C2959dp.C2960a f8805w = new C3331l0(this);

    /* renamed from: x */
    private HandlerThread f8806x;

    /* renamed from: y */
    private int f8807y;

    /* renamed from: com.facetec.sdk.ag$c */
    static class C2777c {

        /* renamed from: a */
        StreamConfigurationMap f8811a;

        /* renamed from: b */
        boolean f8812b = false;

        /* renamed from: d */
        CameraCharacteristics f8813d;

        /* renamed from: e */
        String f8814e;

        C2777c() {
        }
    }

    C2773ag(Activity activity) {
        C27741 r0 = new TextureView.SurfaceTextureListener() {
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C2773ag.this.mo8818a(i, i2);
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                try {
                    C2773ag.this.mo8821h();
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C2773ag.this.mo8819c(i, i2);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.f8794I = r0;
        this.f8796l = new WeakReference<>((C2829bc) activity);
        if (!C2827ba.f9071d) {
            this.f8797m = C2780ai.m10763c();
        } else {
            this.f8797m = C2780ai.m10767f();
        }
        C3201i iVar = new C3201i(activity);
        this.f8799o = iVar;
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f8806x = handlerThread;
        handlerThread.start();
        this.f8790B = new Handler(this.f8806x.getLooper());
        if (iVar.isAvailable()) {
            m10735d(activity, iVar.getWidth(), iVar.getHeight());
        } else {
            iVar.setSurfaceTextureListener(r0);
        }
    }

    /* renamed from: c */
    private void m10732c(Activity activity) {
        m10728a(activity, m10744i(activity));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m10739e(byte[] bArr, Size size) {
        C2888cg cgVar;
        if (this.f8835i) {
            C2809aw.m10981d("CTFFT");
        }
        this.f8834b = true;
        C2831bd bdVar = (C2831bd) this.f8796l.get();
        if (bdVar != null && (cgVar = bdVar.f9082b) != null) {
            cgVar.mo9019d(bArr, size.getWidth(), size.getHeight(), this.f8807y, Boolean.TRUE);
            this.f8835i = false;
        }
    }

    /* renamed from: f */
    public static C2784ak m10740f(Context context) {
        return m10738e(context, m10744i(context));
    }

    /* renamed from: i */
    private static C2777c m10744i(Context context) {
        return m10733d(context, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8812a(boolean z, ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8814b(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8815d(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    private void m10728a(Activity activity, C2777c cVar) {
        if (cVar != null) {
            String str = cVar.f8814e;
            CameraCharacteristics cameraCharacteristics = cVar.f8813d;
            StreamConfigurationMap streamConfigurationMap = cVar.f8811a;
            int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.f8807y = intValue;
            C2780ai.f8832j = intValue;
            activity.getWindowManager().getDefaultDisplay().getSize(new Point());
            activity.getWindowManager().getDefaultDisplay().getRealSize(new Point());
            if (activity.getResources().getConfiguration().orientation == 2) {
                C3201i iVar = this.f8799o;
                C2784ak akVar = this.f8797m;
                iVar.setAspectRatio(akVar.f8862b, akVar.f8861a);
            } else {
                C3201i iVar2 = this.f8799o;
                C2784ak akVar2 = this.f8797m;
                iVar2.setAspectRatio(akVar2.f8861a, akVar2.f8862b);
            }
            m10736d((Context) activity, streamConfigurationMap);
            this.f8803u = str;
            this.f8804v = cameraCharacteristics;
            return;
        }
        throw new C2778ah(C2778ah.C2779a.FRONT_FACING_NOT_FOUND);
    }

    /* renamed from: g */
    private static C2777c m10741g(Context context) {
        return m10733d(context, 0);
    }

    /* renamed from: j */
    public static C2784ak m10746j(Context context) {
        return m10738e(context, m10741g(context));
    }

    /* renamed from: b */
    public final View mo8813b() {
        return this.f8799o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8816d(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo8821h() {
        boolean z;
        try {
            z = this.f8795k.tryAcquire(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C3330l.m13346d(e);
            z = false;
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.f8802t;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f8802t = null;
            }
            CameraDevice cameraDevice = this.f8798n;
            if (cameraDevice != null) {
                cameraDevice.close();
                this.f8798n = null;
            }
            if (z) {
                this.f8795k.release();
            }
        } catch (Exception e2) {
            throw new C2778ah(C2778ah.C2779a.CLOSE_ERROR, (Throwable) e2);
        } catch (Throwable th) {
            if (z) {
                this.f8795k.release();
            }
            throw th;
        }
    }

    /* renamed from: d */
    private void m10736d(Context context, StreamConfigurationMap streamConfigurationMap) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(Allocation.class);
        Arrays.sort(outputSizes, new C3403m0());
        Size size = new Size(640, 360);
        C2784ak akVar = this.f8797m;
        float f = ((float) akVar.f8862b) / ((float) akVar.f8861a);
        int width = size.getWidth() * size.getHeight();
        int i = width << 2;
        int length = outputSizes.length;
        Size size2 = null;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Size size3 = outputSizes[i2];
            int height = size3.getHeight() * size3.getWidth();
            if (height >= width && height <= i) {
                float width2 = ((float) size3.getWidth()) / ((float) size3.getHeight());
                if (width2 <= 3.0f) {
                    if (width2 == f) {
                        size2 = size3;
                        break;
                    }
                    size2 = size3;
                } else {
                    continue;
                }
            }
            i2++;
        }
        if (size2 != null) {
            size = size2;
        }
        C2780ai.f8826c = new C2784ak(size.getWidth(), size.getHeight());
        try {
            C2959dp dpVar = new C2959dp(context, size);
            this.f8801s = dpVar;
            if (this.f8791C) {
                dpVar.mo9126e(this.f8805w);
            }
        } catch (Throwable th) {
            C3330l.m13346d(th);
            C2810ax.m10991b(th.getMessage());
            throw new RuntimeException(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo8819c(int i, int i2) {
        C2829bc bcVar = this.f8796l.get();
        if (this.f8799o != null && bcVar != null) {
            int rotation = bcVar.getWindowManager().getDefaultDisplay().getRotation();
            Matrix matrix = new Matrix();
            float f = (float) i;
            float f2 = (float) i2;
            RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f, f2);
            C2784ak akVar = this.f8797m;
            RectF rectF2 = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) akVar.f8861a, (float) akVar.f8862b);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            if (1 == rotation || 3 == rotation) {
                rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                C2784ak akVar2 = this.f8797m;
                float max = Math.max(f2 / ((float) akVar2.f8861a), f / ((float) akVar2.f8862b));
                matrix.postScale(max, max, centerX, centerY);
                matrix.postRotate((float) ((rotation - 2) * 90), centerX, centerY);
            } else if (2 == rotation) {
                matrix.postRotate(180.0f, centerX, centerY);
            }
            this.f8799o.setTransform(matrix);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8817e() {
        if (!this.f8791C) {
            this.f8791C = true;
            C2959dp dpVar = this.f8801s;
            if (dpVar != null) {
                dpVar.mo9126e(this.f8805w);
            }
        }
    }

    /* renamed from: e */
    private static C2784ak m10738e(Context context, C2777c cVar) {
        float[] fArr = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            Size[] outputSizes = cVar.f8811a.getOutputSizes(SurfaceTexture.class);
            if (outputSizes.length != 0) {
                Arrays.sort(outputSizes, new C3281k0());
                StringBuilder sb = new StringBuilder();
                sb.append(outputSizes[0].getWidth());
                sb.append("x");
                sb.append(outputSizes[0].getHeight());
                C2780ai.f8827d = sb.toString();
                C3280k.m13164e(outputSizes);
                Point point = new Point();
                C2810ax.m10999e(context).getDefaultDisplay().getRealSize(point);
                for (int i = 0; i < 5; i++) {
                    float f = fArr[i];
                    for (Size size : outputSizes) {
                        float width = (float) size.getWidth();
                        float height = (float) size.getHeight();
                        if (width <= 1920.0f && height <= 1080.0f) {
                            float f2 = width / height;
                            if (f2 >= f && f2 <= 1.9f && width >= 640.0f && width <= ((float) point.y) && height <= ((float) point.x)) {
                                arrayList.add(size);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        break;
                    }
                }
                if (arrayList.size() > 0) {
                    return new C2784ak(((Size) arrayList.get(0)).getWidth(), ((Size) arrayList.get(0)).getHeight());
                }
                return new C2784ak(outputSizes[0].getWidth(), outputSizes[0].getHeight());
            }
            throw new C2778ah(C2778ah.C2779a.NO_OUTPUT_SIZES);
        }
        throw new C2778ah(C2778ah.C2779a.FRONT_FACING_NOT_FOUND);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ int m10731c(Size size, Size size2) {
        return (size2.getWidth() * size2.getHeight()) - (size.getWidth() * size.getHeight());
    }

    /* renamed from: d */
    private void m10734d(Activity activity) {
        m10728a(activity, m10741g(activity));
    }

    /* renamed from: a */
    static synchronized boolean m10729a(Context context) {
        synchronized (C2773ag.class) {
            if (f8785A == null) {
                C2777c g = m10741g(context);
                if (g == null) {
                    return false;
                }
                f8785A = Boolean.valueOf(g.f8812b);
            }
            boolean booleanValue = f8785A.booleanValue();
            return booleanValue;
        }
    }

    /* renamed from: d */
    private static C2777c m10733d(Context context, int i) {
        StreamConfigurationMap streamConfigurationMap;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            CameraAccessException e = null;
            for (String str : cameraIdList) {
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if ((num == null || num.intValue() == i || C2772af.m10727e(cameraIdList)) && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null) {
                        C2777c cVar = new C2777c();
                        cVar.f8814e = str;
                        cVar.f8813d = cameraCharacteristics;
                        cVar.f8811a = streamConfigurationMap;
                        if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() != 2) {
                            cVar.f8812b = true;
                        }
                        return cVar;
                    }
                } catch (CameraAccessException e2) {
                    e = e2;
                    e.getMessage();
                }
            }
            if (e == null) {
                return null;
            }
            throw new C2778ah(C2778ah.C2779a.ACCESS_ERROR, (Throwable) e);
        } catch (CameraAccessException e3) {
            throw new C2778ah((Throwable) e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8818a(int i, int i2) {
        C2829bc bcVar = this.f8796l.get();
        if (bcVar != null) {
            try {
                m10735d(bcVar, i, i2);
            } catch (Throwable th) {
                C2867c cVar = C2867c.CAMERA2_ERROR;
                StringBuilder sb = new StringBuilder("Camera2 SurfaceTexture error: ");
                sb.append(th.getMessage());
                sb.append(C3555s.m13884a((Activity) bcVar));
                C3555s.m13907d(bcVar, th, cVar, sb.toString(), true);
                StringBuilder sb2 = new StringBuilder("Camera 2 SurfaceTexture error: ");
                sb2.append(th.getMessage());
                bcVar.mo8910b(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo8811a() {
        HandlerThread handlerThread = this.f8806x;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.f8806x.join();
                this.f8806x = null;
                this.f8790B.removeCallbacksAndMessages((Object) null);
                this.f8790B = null;
            } catch (InterruptedException e) {
                C3330l.m13346d(e);
            }
        }
        try {
            mo8821h();
        } catch (Exception unused) {
        }
        C2959dp dpVar = this.f8801s;
        if (dpVar != null) {
            dpVar.f10038d = null;
            this.f8801s = null;
        }
        this.f8792D = true;
    }

    /* renamed from: d */
    static synchronized boolean m10737d(Context context) {
        synchronized (C2773ag.class) {
            if (f8789z == null) {
                C2777c i = m10744i(context);
                if (i == null) {
                    return false;
                }
                f8789z = Boolean.valueOf(i.f8812b);
            }
            boolean booleanValue = f8789z.booleanValue();
            return booleanValue;
        }
    }

    /* renamed from: d */
    private void m10735d(Activity activity, int i, int i2) {
        if (!this.f8792D) {
            if (C0767a.m2891a(activity, "android.permission.CAMERA") == 0) {
                try {
                    if (!C2827ba.f9071d) {
                        m10734d(activity);
                    } else {
                        m10732c(activity);
                    }
                    mo8819c(i, i2);
                    CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
                    if (cameraManager != null) {
                        try {
                            if (this.f8795k.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
                                C2809aw.m10980c("CTOT");
                                C2809aw.m10980c("CTFFT");
                                try {
                                    cameraManager.openCamera(this.f8803u, this.f8793E, (Handler) null);
                                } catch (Exception e) {
                                    this.f8795k.release();
                                    throw new C2778ah(C2778ah.C2779a.UNKNOWN, e.getMessage());
                                }
                            } else {
                                throw new C2778ah(C2778ah.C2779a.OPEN_TIMEOUT);
                            }
                        } catch (InterruptedException e2) {
                            C3330l.m13346d(e2);
                            throw new C2778ah(C2778ah.C2779a.LOCK_OPEN_TIMEOUT, (Throwable) e2);
                        }
                    } else {
                        throw new C2778ah(C2778ah.C2779a.PERMISSION_DENIED);
                    }
                } catch (CameraAccessException e3) {
                    throw new C2778ah(C2778ah.C2779a.UNKNOWN, e3.getMessage());
                }
            } else {
                throw new C2778ah(C2778ah.C2779a.PERMISSION_DENIED);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.hardware.camera2.CameraCharacteristics$Key<int[]>, android.hardware.camera2.CameraCharacteristics$Key] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8820d(android.hardware.camera2.CameraCharacteristics.Key<int[]> r5, int r6) {
        /*
            r4 = this;
            android.hardware.camera2.CameraCharacteristics r0 = r4.f8804v
            java.lang.Object r5 = r0.get(r5)
            int[] r5 = (int[]) r5
            r0 = 0
            if (r5 == 0) goto L_0x0018
            int r1 = r5.length
            r2 = r0
        L_0x000d:
            if (r2 >= r1) goto L_0x0018
            r3 = r5[r2]
            if (r3 != r6) goto L_0x0015
            r5 = 1
            return r5
        L_0x0015:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2773ag.mo8820d(android.hardware.camera2.CameraCharacteristics$Key, int):boolean");
    }
}
