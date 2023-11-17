package p430gd;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import p174mb.C7165k;
import p416fd.C12861p;
import p416fd.C12863r;

/* renamed from: gd.g */
public class C12971g {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f38237n = "g";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C12981k f38238a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12980j f38239b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12976h f38240c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f38241d;

    /* renamed from: e */
    private C12983m f38242e;

    /* renamed from: f */
    private boolean f38243f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f38244g = true;

    /* renamed from: h */
    private Handler f38245h;

    /* renamed from: i */
    private C12978i f38246i = new C12978i();

    /* renamed from: j */
    private Runnable f38247j = new C12972a();

    /* renamed from: k */
    private Runnable f38248k = new C12973b();

    /* renamed from: l */
    private Runnable f38249l = new C12974c();

    /* renamed from: m */
    private Runnable f38250m = new C12975d();

    /* renamed from: gd.g$a */
    class C12972a implements Runnable {
        C12972a() {
        }

        public void run() {
            try {
                Log.d(C12971g.f38237n, "Opening camera");
                C12971g.this.f38240c.mo33752l();
            } catch (Exception e) {
                C12971g.this.m48940t(e);
                Log.e(C12971g.f38237n, "Failed to open camera", e);
            }
        }
    }

    /* renamed from: gd.g$b */
    class C12973b implements Runnable {
        C12973b() {
        }

        public void run() {
            try {
                Log.d(C12971g.f38237n, "Configuring camera");
                C12971g.this.f38240c.mo33747e();
                if (C12971g.this.f38241d != null) {
                    C12971g.this.f38241d.obtainMessage(C7165k.zxing_prewiew_size_ready, C12971g.this.m48936o()).sendToTarget();
                }
            } catch (Exception e) {
                C12971g.this.m48940t(e);
                Log.e(C12971g.f38237n, "Failed to configure camera", e);
            }
        }
    }

    /* renamed from: gd.g$c */
    class C12974c implements Runnable {
        C12974c() {
        }

        public void run() {
            try {
                Log.d(C12971g.f38237n, "Starting preview");
                C12971g.this.f38240c.mo33756s(C12971g.this.f38239b);
                C12971g.this.f38240c.mo33758u();
            } catch (Exception e) {
                C12971g.this.m48940t(e);
                Log.e(C12971g.f38237n, "Failed to start preview", e);
            }
        }
    }

    /* renamed from: gd.g$d */
    class C12975d implements Runnable {
        C12975d() {
        }

        public void run() {
            try {
                Log.d(C12971g.f38237n, "Closing camera");
                C12971g.this.f38240c.mo33759v();
                C12971g.this.f38240c.mo33746d();
            } catch (Exception e) {
                Log.e(C12971g.f38237n, "Failed to close camera", e);
            }
            boolean unused = C12971g.this.f38244g = true;
            C12971g.this.f38241d.sendEmptyMessage(C7165k.zxing_camera_closed);
            C12971g.this.f38238a.mo33773b();
        }
    }

    public C12971g(Context context) {
        C12863r.m48677a();
        this.f38238a = C12981k.m48989d();
        C12976h hVar = new C12976h(context);
        this.f38240c = hVar;
        hVar.mo33754o(this.f38246i);
        this.f38245h = new Handler();
    }

    /* renamed from: C */
    private void m48924C() {
        if (!this.f38243f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public C12861p m48936o() {
        return this.f38240c.mo33749h();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m48937q(C12986p pVar) {
        this.f38240c.mo33753m(pVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m48938r(C12986p pVar) {
        if (!this.f38243f) {
            Log.d(f38237n, "Camera is closed, not requesting preview");
        } else {
            this.f38238a.mo33774c(new C12970f(this, pVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m48939s(boolean z) {
        this.f38240c.mo33757t(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m48940t(Exception exc) {
        Handler handler = this.f38241d;
        if (handler != null) {
            handler.obtainMessage(C7165k.zxing_camera_error, exc).sendToTarget();
        }
    }

    /* renamed from: A */
    public void mo33730A(boolean z) {
        C12863r.m48677a();
        if (this.f38243f) {
            this.f38238a.mo33774c(new C12968d(this, z));
        }
    }

    /* renamed from: B */
    public void mo33731B() {
        C12863r.m48677a();
        m48924C();
        this.f38238a.mo33774c(this.f38249l);
    }

    /* renamed from: l */
    public void mo33732l() {
        C12863r.m48677a();
        if (this.f38243f) {
            this.f38238a.mo33774c(this.f38250m);
        } else {
            this.f38244g = true;
        }
        this.f38243f = false;
    }

    /* renamed from: m */
    public void mo33733m() {
        C12863r.m48677a();
        m48924C();
        this.f38238a.mo33774c(this.f38248k);
    }

    /* renamed from: n */
    public C12983m mo33734n() {
        return this.f38242e;
    }

    /* renamed from: p */
    public boolean mo33735p() {
        return this.f38244g;
    }

    /* renamed from: u */
    public void mo33736u() {
        C12863r.m48677a();
        this.f38243f = true;
        this.f38244g = false;
        this.f38238a.mo33775e(this.f38247j);
    }

    /* renamed from: v */
    public void mo33737v(C12986p pVar) {
        this.f38245h.post(new C12969e(this, pVar));
    }

    /* renamed from: w */
    public void mo33738w(C12978i iVar) {
        if (!this.f38243f) {
            this.f38246i = iVar;
            this.f38240c.mo33754o(iVar);
        }
    }

    /* renamed from: x */
    public void mo33739x(C12983m mVar) {
        this.f38242e = mVar;
        this.f38240c.mo33755q(mVar);
    }

    /* renamed from: y */
    public void mo33740y(Handler handler) {
        this.f38241d = handler;
    }

    /* renamed from: z */
    public void mo33741z(C12980j jVar) {
        this.f38239b = jVar;
    }
}
