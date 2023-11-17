package com.facetec.sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Timer;

/* renamed from: com.facetec.sdk.bu */
final class C2860bu implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f9367a;

    /* renamed from: b */
    private Sensor f9368b;

    /* renamed from: c */
    private Timer f9369c;

    /* renamed from: d */
    private Timer f9370d;

    /* renamed from: e */
    private WeakReference<C2861e> f9371e = new WeakReference<>((Object) null);

    /* renamed from: f */
    private boolean f9372f;

    /* renamed from: g */
    private int f9373g;

    /* renamed from: h */
    private boolean f9374h;

    /* renamed from: j */
    private WeakReference<C2888cg> f9375j = new WeakReference<>((Object) null);

    @FunctionalInterface
    /* renamed from: com.facetec.sdk.bu$e */
    interface C2861e {
        void onDarkLightDetected();
    }

    C2860bu(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f9367a = sensorManager;
        this.f9368b = sensorManager.getDefaultSensor(5);
        this.f9372f = false;
        this.f9374h = false;
        this.f9373g = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11660b(C2860bu buVar) {
        this.f9367a.registerListener(buVar, this.f9368b, 0);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.f9372f) {
            this.f9373g = 0;
            if (sensorEvent.values[0] < 3.0f) {
                m11666e();
            } else {
                m11664d();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m11658a() {
        /*
            r8 = this;
            int r0 = r8.f9373g
            r1 = 1
            int r0 = r0 + r1
            r8.f9373g = r0
            java.lang.ref.WeakReference<com.facetec.sdk.cg> r0 = r8.f9375j
            java.lang.Object r0 = r0.get()
            com.facetec.sdk.cg r0 = (com.facetec.sdk.C2888cg) r0
            if (r0 == 0) goto L_0x005a
            boolean r2 = r8.f9374h
            if (r2 == 0) goto L_0x001a
            if (r2 == 0) goto L_0x005a
            int r2 = r8.f9373g
            if (r2 <= r1) goto L_0x005a
        L_0x001a:
            com.facetec.sdk.cg$a r0 = r0.mo9023g()
            if (r0 == 0) goto L_0x005a
            byte[] r2 = r0.f9581a
            if (r2 == 0) goto L_0x005a
            int r3 = r0.f9583d
            int r0 = r0.f9582c
            int r3 = r3 * r0
            int r0 = r3 / 4
            r4 = 0
            r5 = 0
            r6 = r4
        L_0x002e:
            if (r1 > r3) goto L_0x0046
            int r7 = r1 + -1
            byte r7 = r2[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r7
            r7 = 8421504(0x808080, float:1.180104E-38)
            int r7 = r1 % r7
            if (r7 != 0) goto L_0x0043
            float r6 = (float) r6
            float r7 = (float) r0
            float r6 = r6 / r7
            float r5 = r5 + r6
            r6 = r4
        L_0x0043:
            int r1 = r1 + 4
            goto L_0x002e
        L_0x0046:
            float r1 = (float) r6
            float r0 = (float) r0
            float r1 = r1 / r0
            float r5 = r5 + r1
            int r0 = (int) r5
            long r0 = (long) r0
            float r0 = (float) r0
            r1 = 1117126656(0x42960000, float:75.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            r8.m11666e()
            return
        L_0x0057:
            r8.m11664d()
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2860bu.m11658a():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11661c() {
        C2861e eVar = this.f9371e.get();
        if (eVar != null) {
            eVar.onDarkLightDetected();
            mo8986b();
        }
    }

    /* renamed from: e */
    private synchronized void m11666e() {
        if (this.f9369c == null) {
            Timer timer = new Timer();
            this.f9369c = timer;
            try {
                timer.schedule(new C2936da(new C3189h9(this)), 200);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8986b() {
        this.f9372f = true;
        Sensor sensor = this.f9368b;
        if (sensor != null) {
            this.f9368b = null;
            C2920cv.m12195c(new C3211i9(this, sensor));
        }
        m11664d();
        Timer timer = this.f9370d;
        if (timer != null) {
            timer.cancel();
            this.f9370d = null;
        }
        WeakReference<C2861e> weakReference = this.f9371e;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo8987d(C2861e eVar, C2888cg cgVar) {
        this.f9371e = new WeakReference<>(eVar);
        this.f9375j = new WeakReference<>(cgVar);
        if (this.f9368b != null) {
            new Handler().postDelayed(new C3233j9(this, this), 50);
            this.f9374h = true;
        }
        C2936da daVar = new C2936da(new C3290k9(this));
        Timer timer = new Timer();
        this.f9370d = timer;
        try {
            timer.scheduleAtFixedRate(daVar, 500, 1000);
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11662c(Sensor sensor) {
        this.f9367a.unregisterListener(this, sensor);
    }

    /* renamed from: d */
    private void m11664d() {
        Timer timer = this.f9369c;
        if (timer != null) {
            timer.cancel();
            this.f9369c = null;
        }
    }
}
