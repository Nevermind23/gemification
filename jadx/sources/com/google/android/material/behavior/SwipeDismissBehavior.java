package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.github.mikephil.charting.utils.Utils;
import p001a0.C0011d;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0644c {

    /* renamed from: a */
    C0011d f15564a;

    /* renamed from: b */
    private boolean f15565b;

    /* renamed from: c */
    private float f15566c = Utils.FLOAT_EPSILON;

    /* renamed from: d */
    private boolean f15567d;

    /* renamed from: e */
    int f15568e = 2;

    /* renamed from: f */
    float f15569f = 0.5f;

    /* renamed from: g */
    float f15570g = Utils.FLOAT_EPSILON;

    /* renamed from: h */
    float f15571h = 0.5f;

    /* renamed from: i */
    private final C0011d.C0014c f15572i = new C4937a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C4937a extends C0011d.C0014c {

        /* renamed from: c */
        private int f15573c;

        /* renamed from: d */
        private int f15574d = -1;

        C4937a() {
        }

        /* renamed from: b */
        private boolean m18881b(View view, float f) {
            boolean z;
            int i = (f > Utils.FLOAT_EPSILON ? 1 : (f == Utils.FLOAT_EPSILON ? 0 : -1));
            if (i != 0) {
                if (ViewCompat.m3541B(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f15568e;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= Utils.FLOAT_EPSILON) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= Utils.FLOAT_EPSILON) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f15573c) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f15569f)) {
                    return true;
                }
                return false;
            }
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int width;
            if (ViewCompat.m3541B(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i5 = SwipeDismissBehavior.this.f15568e;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f15573c - view.getWidth();
                    i4 = view.getWidth() + this.f15573c;
                } else if (z) {
                    i3 = this.f15573c;
                    width = view.getWidth();
                } else {
                    i3 = this.f15573c - view.getWidth();
                    i4 = this.f15573c;
                }
                return SwipeDismissBehavior.m18870G(i3, i, i4);
            } else if (z) {
                i3 = this.f15573c - view.getWidth();
                i4 = this.f15573c;
                return SwipeDismissBehavior.m18870G(i3, i, i4);
            } else {
                i3 = this.f15573c;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m18870G(i3, i, i4);
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        public void onViewCaptured(View view, int i) {
            this.f15574d = i;
            this.f15573c = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void onViewDragStateChanged(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f15573c) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f15570g);
            float width2 = ((float) this.f15573c) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f15571h);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(Utils.FLOAT_EPSILON);
            } else {
                view.setAlpha(SwipeDismissBehavior.m18869F(Utils.FLOAT_EPSILON, 1.0f - SwipeDismissBehavior.m18872I(width, width2, f), 1.0f));
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            boolean z;
            int i;
            int i2;
            this.f15574d = -1;
            int width = view.getWidth();
            if (m18881b(view, f)) {
                if (f < Utils.FLOAT_EPSILON || view.getLeft() < (i2 = this.f15573c)) {
                    i = this.f15573c - width;
                } else {
                    i = i2 + width;
                }
                z = true;
            } else {
                i = this.f15573c;
                z = false;
            }
            if (SwipeDismissBehavior.this.f15564a.mo40G(i, view.getTop())) {
                ViewCompat.m3603j0(view, new C4939c(view, z));
            } else if (z) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        public boolean tryCaptureView(View view, int i) {
            int i2 = this.f15574d;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo15543E(view)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C4938b implements AccessibilityViewCommand {
        C4938b() {
        }

        /* renamed from: a */
        public boolean mo3654a(View view, AccessibilityViewCommand.C1068a aVar) {
            boolean z;
            boolean z2 = false;
            if (!SwipeDismissBehavior.this.mo15543E(view)) {
                return false;
            }
            if (ViewCompat.m3541B(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = SwipeDismissBehavior.this.f15568e;
            if ((i == 0 && z) || (i == 1 && !z)) {
                z2 = true;
            }
            int width = view.getWidth();
            if (z2) {
                width = -width;
            }
            ViewCompat.m3587b0(view, width);
            view.setAlpha(Utils.FLOAT_EPSILON);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    private class C4939c implements Runnable {

        /* renamed from: d */
        private final View f15577d;

        /* renamed from: e */
        private final boolean f15578e;

        C4939c(View view, boolean z) {
            this.f15577d = view;
            this.f15578e = z;
        }

        public void run() {
            C0011d dVar = SwipeDismissBehavior.this.f15564a;
            if (dVar != null && dVar.mo46k(true)) {
                ViewCompat.m3603j0(this.f15577d, this);
            } else if (this.f15578e) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    /* renamed from: F */
    static float m18869F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m18870G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m18871H(ViewGroup viewGroup) {
        C0011d dVar;
        if (this.f15564a == null) {
            if (this.f15567d) {
                dVar = C0011d.m80l(viewGroup, this.f15566c, this.f15572i);
            } else {
                dVar = C0011d.m81m(viewGroup, this.f15572i);
            }
            this.f15564a = dVar;
        }
    }

    /* renamed from: I */
    static float m18872I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: M */
    private void m18873M(View view) {
        ViewCompat.m3607l0(view, 1048576);
        if (mo15543E(view)) {
            ViewCompat.m3611n0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3762y, (CharSequence) null, new C4938b());
        }
    }

    /* renamed from: D */
    public boolean mo3034D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0011d dVar = this.f15564a;
        if (dVar == null) {
            return false;
        }
        dVar.mo38A(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo15543E(View view) {
        return true;
    }

    /* renamed from: J */
    public void mo15544J(float f) {
        this.f15571h = m18869F(Utils.FLOAT_EPSILON, f, 1.0f);
    }

    /* renamed from: K */
    public void mo15545K(float f) {
        this.f15570g = m18869F(Utils.FLOAT_EPSILON, f, 1.0f);
    }

    /* renamed from: L */
    public void mo15546L(int i) {
        this.f15568e = i;
    }

    /* renamed from: k */
    public boolean mo3045k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f15565b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo3022v(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f15565b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f15565b = false;
        }
        if (!z) {
            return false;
        }
        m18871H(coordinatorLayout);
        return this.f15564a.mo41H(motionEvent);
    }

    /* renamed from: l */
    public boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean l = super.mo3046l(coordinatorLayout, view, i);
        if (ViewCompat.m3634z(view) == 0) {
            ViewCompat.m3544C0(view, 1);
            m18873M(view);
        }
        return l;
    }
}
