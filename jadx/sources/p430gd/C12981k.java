package p430gd;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: gd.k */
class C12981k {

    /* renamed from: e */
    private static C12981k f38288e;

    /* renamed from: a */
    private Handler f38289a;

    /* renamed from: b */
    private HandlerThread f38290b;

    /* renamed from: c */
    private int f38291c = 0;

    /* renamed from: d */
    private final Object f38292d = new Object();

    private C12981k() {
    }

    /* renamed from: a */
    private void m48988a() {
        synchronized (this.f38292d) {
            if (this.f38289a == null) {
                if (this.f38291c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f38290b = handlerThread;
                    handlerThread.start();
                    this.f38289a = new Handler(this.f38290b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    /* renamed from: d */
    public static C12981k m48989d() {
        if (f38288e == null) {
            f38288e = new C12981k();
        }
        return f38288e;
    }

    /* renamed from: f */
    private void m48990f() {
        synchronized (this.f38292d) {
            this.f38290b.quit();
            this.f38290b = null;
            this.f38289a = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33773b() {
        synchronized (this.f38292d) {
            int i = this.f38291c - 1;
            this.f38291c = i;
            if (i == 0) {
                m48990f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo33774c(Runnable runnable) {
        synchronized (this.f38292d) {
            m48988a();
            this.f38289a.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo33775e(Runnable runnable) {
        synchronized (this.f38292d) {
            this.f38291c++;
            mo33774c(runnable);
        }
    }
}
