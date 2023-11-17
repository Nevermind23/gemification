package p129j5;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: j5.b */
class C6706b {

    /* renamed from: a */
    private int f20243a = -1;

    /* renamed from: b */
    private int f20244b = 0;

    /* renamed from: c */
    private final ScaleGestureDetector f20245c;

    /* renamed from: d */
    private VelocityTracker f20246d;

    /* renamed from: e */
    private boolean f20247e;

    /* renamed from: f */
    private float f20248f;

    /* renamed from: g */
    private float f20249g;

    /* renamed from: h */
    private final float f20250h;

    /* renamed from: i */
    private final float f20251i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6708c f20252j;

    /* renamed from: j5.b$a */
    class C6707a implements ScaleGestureDetector.OnScaleGestureListener {
        C6707a() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < Utils.FLOAT_EPSILON) {
                return true;
            }
            C6706b.this.f20252j.mo20696b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    C6706b(Context context, C6708c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f20251i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f20250h = (float) viewConfiguration.getScaledTouchSlop();
        this.f20252j = cVar;
        this.f20245c = new ScaleGestureDetector(context, new C6707a());
    }

    /* renamed from: b */
    private float m26160b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f20244b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    private float m26161c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f20244b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: g */
    private boolean m26162g(MotionEvent motionEvent) {
        boolean z;
        int i;
        int action = motionEvent.getAction() & C11051p3.f31759c;
        int i2 = 0;
        if (action == 0) {
            this.f20243a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f20246d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f20248f = m26160b(motionEvent);
            this.f20249g = m26161c(motionEvent);
            this.f20247e = false;
        } else if (action == 1) {
            this.f20243a = -1;
            if (this.f20247e && this.f20246d != null) {
                this.f20248f = m26160b(motionEvent);
                this.f20249g = m26161c(motionEvent);
                this.f20246d.addMovement(motionEvent);
                this.f20246d.computeCurrentVelocity(1000);
                float xVelocity = this.f20246d.getXVelocity();
                float yVelocity = this.f20246d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f20251i) {
                    this.f20252j.mo20697c(this.f20248f, this.f20249g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f20246d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f20246d = null;
            }
        } else if (action == 2) {
            float b = m26160b(motionEvent);
            float c = m26161c(motionEvent);
            float f = b - this.f20248f;
            float f2 = c - this.f20249g;
            if (!this.f20247e) {
                if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f20250h)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f20247e = z;
            }
            if (this.f20247e) {
                this.f20252j.mo20695a(f, f2);
                this.f20248f = b;
                this.f20249g = c;
                VelocityTracker velocityTracker2 = this.f20246d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f20243a = -1;
            VelocityTracker velocityTracker3 = this.f20246d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f20246d = null;
            }
        } else if (action == 6) {
            int b2 = C6723l.m26241b(motionEvent.getAction());
            if (motionEvent.getPointerId(b2) == this.f20243a) {
                if (b2 == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.f20243a = motionEvent.getPointerId(i);
                this.f20248f = motionEvent.getX(i);
                this.f20249g = motionEvent.getY(i);
            }
        }
        int i3 = this.f20243a;
        if (i3 != -1) {
            i2 = i3;
        }
        this.f20244b = motionEvent.findPointerIndex(i2);
        return true;
    }

    /* renamed from: d */
    public boolean mo20689d() {
        return this.f20247e;
    }

    /* renamed from: e */
    public boolean mo20690e() {
        return this.f20245c.isInProgress();
    }

    /* renamed from: f */
    public boolean mo20691f(MotionEvent motionEvent) {
        try {
            this.f20245c.onTouchEvent(motionEvent);
            return m26162g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
