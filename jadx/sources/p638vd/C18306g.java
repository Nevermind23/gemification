package p638vd;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p458id.C15600b;
import p638vd.C18300c;

/* renamed from: vd.g */
public class C18306g extends C18300c {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C15600b f51737h = C15600b.m56349a(C18306g.class.getSimpleName());

    /* renamed from: e */
    private GestureDetector f51738e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f51739f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f51740g;

    /* renamed from: vd.g$a */
    class C18307a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        final /* synthetic */ C18300c.C18301a f51741d;

        C18307a(C18300c.C18301a aVar) {
            this.f51741d = aVar;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3;
            boolean z;
            C18298a aVar;
            boolean z2 = false;
            C18306g.f51737h.mo42878c("onScroll:", "distanceX=" + f, "distanceY=" + f2);
            if (motionEvent == null || motionEvent2 == null) {
                return false;
            }
            if (motionEvent.getX() != C18306g.this.mo46039d(0).x || motionEvent.getY() != C18306g.this.mo46039d(0).y) {
                if (Math.abs(f) >= Math.abs(f2)) {
                    z = true;
                } else {
                    z = false;
                }
                C18306g gVar = C18306g.this;
                if (z) {
                    aVar = C18298a.SCROLL_HORIZONTAL;
                } else {
                    aVar = C18298a.SCROLL_VERTICAL;
                }
                gVar.mo46045j(aVar);
                C18306g.this.mo46039d(0).set(motionEvent.getX(), motionEvent.getY());
                z2 = z;
            } else if (C18306g.this.mo46038c() == C18298a.SCROLL_HORIZONTAL) {
                z2 = true;
            }
            C18306g.this.mo46039d(1).set(motionEvent2.getX(), motionEvent2.getY());
            C18306g gVar2 = C18306g.this;
            if (z2) {
                f3 = f / ((float) this.f51741d.getWidth());
            } else {
                f3 = f2 / ((float) this.f51741d.getHeight());
            }
            float unused = gVar2.f51740g = f3;
            C18306g gVar3 = C18306g.this;
            float l = gVar3.f51740g;
            if (z2) {
                l = -l;
            }
            float unused2 = gVar3.f51740g = l;
            boolean unused3 = C18306g.this.f51739f = true;
            return true;
        }
    }

    public C18306g(C18300c.C18301a aVar) {
        super(aVar, 2);
        GestureDetector gestureDetector = new GestureDetector(aVar.mo29435b(), new C18307a(aVar));
        this.f51738e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* renamed from: f */
    public float mo46041f(float f, float f2, float f3) {
        return f + (mo46053o() * (f3 - f2) * 2.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo46042g(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f51739f = false;
        }
        this.f51738e.onTouchEvent(motionEvent);
        if (this.f51739f) {
            f51737h.mo42878c("Notifying a gesture of type", mo46038c().name());
        }
        return this.f51739f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public float mo46053o() {
        return this.f51740g;
    }
}
