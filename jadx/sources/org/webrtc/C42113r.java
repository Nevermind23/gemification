package org.webrtc;

import android.view.SurfaceHolder;
import com.github.mikephil.charting.utils.Utils;
import java.util.concurrent.CountDownLatch;
import org.webrtc.C42076d;
import org.webrtc.C42107q;
import xh1.C43301d0;
import xh1.C43303e0;

/* renamed from: org.webrtc.r */
public class C42113r extends C42085h implements SurfaceHolder.Callback {

    /* renamed from: E */
    private C42107q.C42110c f99041E;

    /* renamed from: F */
    private final Object f99042F = new Object();

    /* renamed from: G */
    private boolean f99043G;

    /* renamed from: H */
    private boolean f99044H;

    /* renamed from: I */
    private int f99045I;

    /* renamed from: J */
    private int f99046J;

    /* renamed from: K */
    private int f99047K;

    public C42113r(String str) {
        super(str);
    }

    /* renamed from: A */
    private void m122315A(String str) {
        Logging.m122183b("SurfaceEglRenderer", this.f98978d + ": " + str);
    }

    /* renamed from: H */
    public void mo97598H(float f) {
        boolean z;
        synchronized (this.f99042F) {
            if (f == Utils.FLOAT_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            this.f99043G = z;
        }
        super.mo97598H(f);
    }

    /* renamed from: K */
    public void mo97618K(C42076d.C42078b bVar, C42107q.C42110c cVar, int[] iArr, C42107q.C42109b bVar2) {
        C43303e0.m124333b();
        this.f99041E = cVar;
        synchronized (this.f99042F) {
            this.f99044H = false;
            this.f99045I = 0;
            this.f99046J = 0;
            this.f99047K = 0;
        }
        super.mo97605s(bVar, iArr, bVar2);
    }

    /* renamed from: r */
    public void mo97604r() {
        synchronized (this.f99042F) {
            this.f99043G = false;
        }
        super.mo97604r();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C43303e0.m124333b();
        m122315A("surfaceChanged: format: " + i + " size: " + i2 + "x" + i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C43303e0.m124333b();
        mo97603p(surfaceHolder.getSurface());
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C43303e0.m124333b();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo97596E(new C43301d0(countDownLatch));
        C43303e0.m124332a(countDownLatch);
    }
}
