package p638vd;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.github.mikephil.charting.utils.Utils;
import p638vd.C18300c;

/* renamed from: vd.h */
public class C18308h extends C18300c {

    /* renamed from: e */
    private GestureDetector f51743e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f51744f;

    /* renamed from: vd.h$a */
    class C18309a extends GestureDetector.SimpleOnGestureListener {
        C18309a() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            boolean unused = C18308h.this.f51744f = true;
            C18308h.this.mo46045j(C18298a.LONG_TAP);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            boolean unused = C18308h.this.f51744f = true;
            C18308h.this.mo46045j(C18298a.TAP);
            return true;
        }
    }

    public C18308h(C18300c.C18301a aVar) {
        super(aVar, 1);
        GestureDetector gestureDetector = new GestureDetector(aVar.mo29435b(), new C18309a());
        this.f51743e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }

    /* renamed from: f */
    public float mo46041f(float f, float f2, float f3) {
        return Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo46042g(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f51744f = false;
        }
        this.f51743e.onTouchEvent(motionEvent);
        if (!this.f51744f) {
            return false;
        }
        mo46039d(0).x = motionEvent.getX();
        mo46039d(0).y = motionEvent.getY();
        return true;
    }
}
