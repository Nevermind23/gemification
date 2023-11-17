package p638vd;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.github.mikephil.charting.utils.Utils;
import p638vd.C18300c;

/* renamed from: vd.f */
public class C18304f extends C18300c {

    /* renamed from: e */
    private ScaleGestureDetector f51733e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f51734f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f51735g = Utils.FLOAT_EPSILON;

    /* renamed from: vd.f$a */
    class C18305a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C18305a() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            boolean unused = C18304f.this.f51734f = true;
            float unused2 = C18304f.this.f51735g = (scaleGestureDetector.getScaleFactor() - 1.0f) * 2.0f;
            return true;
        }
    }

    public C18304f(C18300c.C18301a aVar) {
        super(aVar, 2);
        mo46045j(C18298a.PINCH);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(aVar.mo29435b(), new C18305a());
        this.f51733e = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    /* renamed from: f */
    public float mo46041f(float f, float f2, float f3) {
        return f + (mo46051m() * (f3 - f2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo46042g(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.f51734f = false;
        }
        this.f51733e.onTouchEvent(motionEvent);
        if (this.f51734f) {
            mo46039d(0).x = motionEvent.getX(0);
            mo46039d(0).y = motionEvent.getY(0);
            z = true;
            if (motionEvent.getPointerCount() > 1) {
                mo46039d(1).x = motionEvent.getX(1);
                mo46039d(1).y = motionEvent.getY(1);
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public float mo46051m() {
        return this.f51735g;
    }
}
