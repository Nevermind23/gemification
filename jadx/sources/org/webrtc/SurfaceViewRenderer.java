package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import org.webrtc.C42076d;
import org.webrtc.C42085h;
import org.webrtc.C42107q;
import xh1.C43303e0;

public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, VideoSink, C42107q.C42110c {

    /* renamed from: d */
    private final String f98901d;

    /* renamed from: e */
    private final C42107q.C42112e f98902e = new C42107q.C42112e();

    /* renamed from: f */
    private final C42113r f98903f;

    /* renamed from: g */
    private C42107q.C42110c f98904g;

    /* renamed from: h */
    private int f98905h;

    /* renamed from: i */
    private int f98906i;

    /* renamed from: j */
    private boolean f98907j;

    /* renamed from: k */
    private int f98908k;

    /* renamed from: l */
    private int f98909l;

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String resourceName = getResourceName();
        this.f98901d = resourceName;
        C42113r rVar = new C42113r(resourceName);
        this.f98903f = rVar;
        getHolder().addCallback(this);
        getHolder().addCallback(rVar);
    }

    /* renamed from: e */
    private void m122202e(String str) {
        Logging.m122183b("SurfaceViewRenderer", this.f98901d + ": " + str);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    /* renamed from: h */
    private void m122203h() {
        C43303e0.m124333b();
        if (!this.f98907j || this.f98905h == 0 || this.f98906i == 0 || getWidth() == 0 || getHeight() == 0) {
            this.f98909l = 0;
            this.f98908k = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) getWidth()) / ((float) getHeight());
        int i = this.f98905h;
        int i2 = this.f98906i;
        if (((float) i) / ((float) i2) > width) {
            i = (int) (((float) i2) * width);
        } else {
            i2 = (int) (((float) i) / width);
        }
        int min = Math.min(getWidth(), i);
        int min2 = Math.min(getHeight(), i2);
        m122202e("updateSurfaceSize. Layout size: " + getWidth() + "x" + getHeight() + ", frame size: " + this.f98905h + "x" + this.f98906i + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.f98908k + "x" + this.f98909l);
        if (min != this.f98908k || min2 != this.f98909l) {
            this.f98908k = min;
            this.f98909l = min2;
            getHolder().setFixedSize(min, min2);
        }
    }

    /* renamed from: a */
    public void mo97570a(C42085h.C42089d dVar, float f) {
        this.f98903f.mo97601m(dVar, f);
    }

    /* renamed from: b */
    public void mo97571b() {
        this.f98903f.mo97604r();
    }

    /* renamed from: c */
    public void mo97572c(C42076d.C42078b bVar, C42107q.C42110c cVar) {
        mo97573d(bVar, cVar, C42076d.f98960b, new C42095j());
    }

    /* renamed from: d */
    public void mo97573d(C42076d.C42078b bVar, C42107q.C42110c cVar, int[] iArr, C42107q.C42109b bVar2) {
        C43303e0.m124333b();
        this.f98904g = cVar;
        this.f98905h = 0;
        this.f98906i = 0;
        this.f98903f.mo97618K(bVar, this, iArr, bVar2);
    }

    /* renamed from: f */
    public void mo97574f() {
        this.f98903f.mo97595D();
    }

    /* renamed from: g */
    public void mo97575g(C42085h.C42089d dVar) {
        this.f98903f.mo97597F(dVar);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C43303e0.m124333b();
        this.f98903f.mo97599I(((float) (i3 - i)) / ((float) (i4 - i2)));
        m122203h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C43303e0.m124333b();
        Point a = this.f98902e.mo97615a(i, i2, this.f98905h, this.f98906i);
        setMeasuredDimension(a.x, a.y);
        m122202e("onMeasure(). New size: " + a.x + "x" + a.y);
    }

    public void setEnableHardwareScaler(boolean z) {
        C43303e0.m124333b();
        this.f98907j = z;
        m122203h();
    }

    public void setFpsReduction(float f) {
        this.f98903f.mo97598H(f);
    }

    public void setMirror(boolean z) {
        this.f98903f.mo97600J(z);
    }

    public void setScalingType(C42107q.C42111d dVar) {
        C43303e0.m124333b();
        this.f98902e.mo97616b(dVar);
        requestLayout();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C43303e0.m124333b();
        this.f98909l = 0;
        this.f98908k = 0;
        m122203h();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
