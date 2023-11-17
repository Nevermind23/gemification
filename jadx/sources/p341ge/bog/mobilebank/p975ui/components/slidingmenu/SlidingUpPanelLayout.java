package p341ge.bog.mobilebank.p975ui.components.slidingmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C1248u0;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p341ge.bog.mobilebank.p975ui.components.slidingmenu.C35568a;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10320i;
import p366bk.C10330s;
import p81.C37928a;

/* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout */
public class SlidingUpPanelLayout extends ViewGroup {

    /* renamed from: M */
    private static C35567f f85942M = C35567f.COLLAPSED;

    /* renamed from: N */
    private static final int[] f85943N = {16842927};
    /* access modifiers changed from: private */

    /* renamed from: A */
    public float f85944A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f85945B;

    /* renamed from: C */
    private boolean f85946C;

    /* renamed from: D */
    private float f85947D;

    /* renamed from: E */
    private float f85948E;

    /* renamed from: F */
    private float f85949F;

    /* renamed from: G */
    private boolean f85950G;

    /* renamed from: H */
    private final List f85951H;

    /* renamed from: I */
    private View.OnClickListener f85952I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C35568a f85953J;

    /* renamed from: K */
    private boolean f85954K;

    /* renamed from: L */
    private final Rect f85955L;

    /* renamed from: d */
    private int f85956d;

    /* renamed from: e */
    private int f85957e;

    /* renamed from: f */
    private final Paint f85958f;

    /* renamed from: g */
    private final Drawable f85959g;

    /* renamed from: h */
    private int f85960h;

    /* renamed from: i */
    private int f85961i;

    /* renamed from: j */
    private int f85962j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f85963k;

    /* renamed from: l */
    private boolean f85964l;

    /* renamed from: m */
    private boolean f85965m;

    /* renamed from: n */
    private View f85966n;

    /* renamed from: o */
    private int f85967o;

    /* renamed from: p */
    private View f85968p;

    /* renamed from: q */
    private View f85969q;

    /* renamed from: r */
    private View f85970r;

    /* renamed from: s */
    private int f85971s;

    /* renamed from: t */
    private C37928a f85972t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public View f85973u;

    /* renamed from: v */
    private View f85974v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C35567f f85975w;

    /* renamed from: x */
    private C35567f f85976x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public float f85977y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f85978z;

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$a */
    class C35562a implements View.OnClickListener {
        C35562a() {
        }

        public void onClick(View view) {
            C35567f fVar;
            if (SlidingUpPanelLayout.this.isEnabled() && SlidingUpPanelLayout.this.mo86591v()) {
                C35567f g = SlidingUpPanelLayout.this.f85975w;
                C35567f fVar2 = C35567f.EXPANDED;
                if (g == fVar2 || SlidingUpPanelLayout.this.f85975w == (fVar = C35567f.ANCHORED)) {
                    SlidingUpPanelLayout.this.setPanelState(C35567f.COLLAPSED);
                } else if (SlidingUpPanelLayout.this.f85944A < 1.0f) {
                    SlidingUpPanelLayout.this.setPanelState(fVar);
                } else {
                    SlidingUpPanelLayout.this.setPanelState(fVar2);
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$b */
    static /* synthetic */ class C35563b {

        /* renamed from: a */
        static final /* synthetic */ int[] f85980a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$f[] r0 = p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout.C35567f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f85980a = r0
                ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$f r1 = p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout.C35567f.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f85980a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$f r1 = p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout.C35567f.ANCHORED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f85980a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$f r1 = p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout.C35567f.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f85980a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$f r1 = p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout.C35567f.COLLAPSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout.C35563b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$c */
    private class C35564c extends C35568a.C35571c {
        /* renamed from: b */
        public int mo86595b(View view, int i, int i2) {
            int k = SlidingUpPanelLayout.this.m105600q(Utils.FLOAT_EPSILON);
            int k2 = SlidingUpPanelLayout.this.m105600q(1.0f);
            if (SlidingUpPanelLayout.this.f85963k) {
                return Math.min(Math.max(i, k2), k);
            }
            return Math.min(Math.max(i, k), k2);
        }

        /* renamed from: e */
        public int mo86596e(View view) {
            return SlidingUpPanelLayout.this.f85978z;
        }

        /* renamed from: i */
        public void mo86597i(View view, int i) {
            SlidingUpPanelLayout.this.mo86593z();
        }

        /* renamed from: j */
        public void mo86598j(int i) {
            if (SlidingUpPanelLayout.this.f85953J.mo86615w() == 0) {
                SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
                slidingUpPanelLayout.f85977y = slidingUpPanelLayout.m105601r(slidingUpPanelLayout.f85973u.getTop());
                SlidingUpPanelLayout.this.m105599p();
                if (SlidingUpPanelLayout.this.f85977y == 1.0f) {
                    SlidingUpPanelLayout.this.mo86545C();
                    SlidingUpPanelLayout.this.setPanelStateInternal(C35567f.EXPANDED);
                } else if (SlidingUpPanelLayout.this.f85977y == Utils.FLOAT_EPSILON) {
                    SlidingUpPanelLayout.this.setPanelStateInternal(C35567f.COLLAPSED);
                } else if (SlidingUpPanelLayout.this.f85977y < Utils.FLOAT_EPSILON) {
                    SlidingUpPanelLayout.this.setPanelStateInternal(C35567f.HIDDEN);
                    SlidingUpPanelLayout.this.f85973u.setVisibility(4);
                } else {
                    SlidingUpPanelLayout.this.mo86545C();
                    SlidingUpPanelLayout.this.setPanelStateInternal(C35567f.ANCHORED);
                }
            }
        }

        /* renamed from: k */
        public void mo86599k(View view, int i, int i2, int i3, int i4) {
            SlidingUpPanelLayout.this.m105604x(i2);
            SlidingUpPanelLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo86600l(View view, float f, float f2) {
            int i;
            if (SlidingUpPanelLayout.this.f85963k) {
                f2 = -f2;
            }
            int i2 = (f2 > Utils.FLOAT_EPSILON ? 1 : (f2 == Utils.FLOAT_EPSILON ? 0 : -1));
            if (i2 > 0 && SlidingUpPanelLayout.this.f85977y <= SlidingUpPanelLayout.this.f85944A) {
                SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
                i = slidingUpPanelLayout.m105600q(slidingUpPanelLayout.f85944A);
            } else if (i2 <= 0 || SlidingUpPanelLayout.this.f85977y <= SlidingUpPanelLayout.this.f85944A) {
                int i3 = (f2 > Utils.FLOAT_EPSILON ? 1 : (f2 == Utils.FLOAT_EPSILON ? 0 : -1));
                if (i3 < 0 && SlidingUpPanelLayout.this.f85977y >= SlidingUpPanelLayout.this.f85944A) {
                    SlidingUpPanelLayout slidingUpPanelLayout2 = SlidingUpPanelLayout.this;
                    i = slidingUpPanelLayout2.m105600q(slidingUpPanelLayout2.f85944A);
                } else if (i3 < 0 && SlidingUpPanelLayout.this.f85977y < SlidingUpPanelLayout.this.f85944A) {
                    i = SlidingUpPanelLayout.this.m105600q(Utils.FLOAT_EPSILON);
                } else if (SlidingUpPanelLayout.this.f85977y >= (SlidingUpPanelLayout.this.f85944A + 1.0f) / 2.0f) {
                    i = SlidingUpPanelLayout.this.m105600q(1.0f);
                } else if (SlidingUpPanelLayout.this.f85977y >= SlidingUpPanelLayout.this.f85944A / 2.0f) {
                    SlidingUpPanelLayout slidingUpPanelLayout3 = SlidingUpPanelLayout.this;
                    i = slidingUpPanelLayout3.m105600q(slidingUpPanelLayout3.f85944A);
                } else {
                    i = SlidingUpPanelLayout.this.m105600q(Utils.FLOAT_EPSILON);
                }
            } else {
                i = SlidingUpPanelLayout.this.m105600q(1.0f);
            }
            SlidingUpPanelLayout.this.f85953J.mo86605H(view.getLeft(), i);
            SlidingUpPanelLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo86601m(View view, int i) {
            if (!SlidingUpPanelLayout.this.f85945B && view == SlidingUpPanelLayout.this.f85973u) {
                return true;
            }
            return false;
        }

        private C35564c() {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$e */
    public interface C35566e {
        /* renamed from: a */
        void mo86279a(View view, float f);

        /* renamed from: b */
        void mo86280b(View view, C35567f fVar, C35567f fVar2);
    }

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$f */
    public enum C35567f {
        EXPANDED,
        COLLAPSED,
        ANCHORED,
        HIDDEN,
        DRAGGING
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m105599p() {
        if (this.f85962j > 0) {
            ViewCompat.m3566N0(this.f85974v, (float) getCurrentParallaxOffset());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public int m105600q(float f) {
        int i;
        View view = this.f85973u;
        if (view != null) {
            i = view.getMeasuredHeight();
        } else {
            i = 0;
        }
        int i2 = (int) (f * ((float) this.f85978z));
        if (this.f85963k) {
            return ((getMeasuredHeight() - getPaddingBottom()) - this.f85960h) - i2;
        }
        return (getPaddingTop() - i) + this.f85960h + i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public float m105601r(int i) {
        float f;
        int i2;
        int q = m105600q(Utils.FLOAT_EPSILON);
        if (this.f85963k) {
            f = (float) (q - i);
            i2 = this.f85978z;
        } else {
            f = (float) (i - q);
            i2 = this.f85978z;
        }
        return f / ((float) i2);
    }

    /* access modifiers changed from: private */
    public void setPanelStateInternal(C35567f fVar) {
        C35567f fVar2 = this.f85975w;
        if (fVar2 != fVar) {
            this.f85975w = fVar;
            mo86590t(this, fVar2, fVar);
        }
    }

    /* renamed from: u */
    private static boolean m105602u(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private boolean m105603w(View view, int i, int i2) {
        int i3;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i4 = iArr2[0] + i;
        int i5 = iArr2[1] + i2;
        int i6 = iArr[0];
        if (i4 < i6 || i4 >= i6 + view.getWidth() || i5 < (i3 = iArr[1]) || i5 >= i3 + view.getHeight()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m105604x(int i) {
        int i2;
        C35567f fVar = this.f85975w;
        C35567f fVar2 = C35567f.DRAGGING;
        if (fVar != fVar2) {
            this.f85976x = fVar;
        }
        setPanelStateInternal(fVar2);
        this.f85977y = m105601r(i);
        m105599p();
        mo86573s(this.f85973u);
        C35565d dVar = (C35565d) this.f85974v.getLayoutParams();
        int height = ((getHeight() - getPaddingBottom()) - getPaddingTop()) - this.f85960h;
        if (this.f85977y <= Utils.FLOAT_EPSILON && !this.f85964l) {
            if (this.f85963k) {
                i2 = i - getPaddingBottom();
            } else {
                i2 = ((getHeight() - getPaddingBottom()) - this.f85973u.getMeasuredHeight()) - i;
            }
            dVar.height = i2;
            if (i2 == height) {
                dVar.height = -1;
            }
            this.f85974v.requestLayout();
        } else if (dVar.height != -1 && !this.f85964l) {
            dVar.height = -1;
            this.f85974v.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo86543A(float f, int i) {
        if (isEnabled() && this.f85973u != null) {
            int q = m105600q(f);
            C35568a aVar = this.f85953J;
            View view = this.f85973u;
            if (aVar.mo86607J(view, view.getLeft(), q)) {
                mo86593z();
                ViewCompat.m3601i0(this);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo86544B() {
        mo86543A(Utils.FLOAT_EPSILON, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo86545C() {
        int i;
        int i2;
        int i3;
        int i4;
        if (getChildCount() != 0) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            View view = this.f85973u;
            int i5 = 0;
            if (view == null || !m105602u(view)) {
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                i4 = this.f85973u.getLeft();
                i3 = this.f85973u.getRight();
                i2 = this.f85973u.getTop();
                i = this.f85973u.getBottom();
            }
            View childAt = getChildAt(0);
            int max = Math.max(paddingLeft, childAt.getLeft());
            int max2 = Math.max(paddingTop, childAt.getTop());
            int min = Math.min(width, childAt.getRight());
            int min2 = Math.min(height, childAt.getBottom());
            if (max >= i4 && max2 >= i2 && min <= i3 && min2 <= i) {
                i5 = 4;
            }
            childAt.setVisibility(i5);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C35565d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        C35568a aVar = this.f85953J;
        if (aVar != null && aVar.mo86612l(true)) {
            if (!isEnabled()) {
                this.f85953J.mo86609a();
            } else {
                ViewCompat.m3601i0(this);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        int c = C1248u0.m4356c(motionEvent);
        if (!isEnabled() || !mo86591v() || (this.f85945B && c != 0)) {
            this.f85953J.mo86609a();
            return super.dispatchTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        if (c == 0) {
            this.f85950G = false;
            this.f85947D = y;
        } else if (c == 2) {
            float f = y - this.f85947D;
            this.f85947D = y;
            if (!m105603w(this.f85970r, (int) this.f85948E, (int) this.f85949F)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            boolean z = this.f85963k;
            int i2 = -1;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            if (((float) i) * f <= Utils.FLOAT_EPSILON) {
                if (z) {
                    i2 = 1;
                }
                if (f * ((float) i2) < Utils.FLOAT_EPSILON) {
                    if (this.f85977y < 1.0f) {
                        this.f85950G = false;
                        return onTouchEvent(motionEvent);
                    }
                    if (!this.f85950G && this.f85953J.mo86617y()) {
                        this.f85953J.mo86610b();
                        motionEvent.setAction(0);
                    }
                    this.f85950G = true;
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else if (this.f85972t.mo91286a(this.f85970r, z) > 0) {
                this.f85950G = true;
                return super.dispatchTouchEvent(motionEvent);
            } else {
                if (this.f85950G) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    motionEvent.setAction(0);
                }
                this.f85950G = false;
                return onTouchEvent(motionEvent);
            }
        } else if (c == 1 && this.f85950G) {
            this.f85953J.mo86603F(0);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (this.f85959g != null && (view = this.f85973u) != null) {
            int right = view.getRight();
            if (this.f85963k) {
                i2 = this.f85973u.getTop() - this.f85961i;
                i = this.f85973u.getTop();
            } else {
                i2 = this.f85973u.getBottom();
                i = this.f85973u.getBottom() + this.f85961i;
            }
            this.f85959g.setBounds(this.f85973u.getLeft(), i2, right, i);
            this.f85959g.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        int save = canvas.save();
        View view2 = this.f85973u;
        if (view2 == null || view2 == view) {
            z = super.drawChild(canvas, view, j);
        } else {
            canvas.getClipBounds(this.f85955L);
            if (!this.f85964l) {
                if (this.f85963k) {
                    Rect rect = this.f85955L;
                    rect.bottom = Math.min(rect.bottom, this.f85973u.getTop());
                } else {
                    Rect rect2 = this.f85955L;
                    rect2.top = Math.max(rect2.top, this.f85973u.getBottom());
                }
            }
            if (this.f85965m) {
                canvas.clipRect(this.f85955L);
            }
            z = super.drawChild(canvas, view, j);
            int i = this.f85957e;
            if (i != 0) {
                float f = this.f85977y;
                float f2 = this.f85944A;
                if (f > f2) {
                    this.f85958f.setColor((i & 16777215) | (((int) (((float) ((-16777216 & i) >>> 24)) * (f - f2))) << 24));
                    canvas.drawRect(this.f85955L, this.f85958f);
                }
            }
        }
        canvas.restoreToCount(save);
        return z;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C35565d();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C35565d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C35565d(layoutParams);
    }

    public float getAnchorPoint() {
        return this.f85944A;
    }

    public int getCoveredFadeColor() {
        return this.f85957e;
    }

    public int getCurrentParallaxOffset() {
        int max = (int) (((float) this.f85962j) * Math.max(this.f85977y, Utils.FLOAT_EPSILON));
        if (this.f85963k) {
            return -max;
        }
        return max;
    }

    public int getMinFlingVelocity() {
        return this.f85956d;
    }

    public int getPanelHeight() {
        return this.f85960h;
    }

    public C35567f getPanelState() {
        return this.f85975w;
    }

    public int getShadowHeight() {
        return this.f85961i;
    }

    public View getSlideableView() {
        return this.f85973u;
    }

    /* renamed from: o */
    public void mo86562o(C35566e eVar) {
        synchronized (this.f85951H) {
            this.f85951H.add(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f85954K = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f85954K = true;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f85967o;
        if (i != -1) {
            setDragView(findViewById(i));
        }
        int i2 = this.f85971s;
        if (i2 != -1) {
            setScrollableView(findViewById(i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r0 != 3) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.f85950G
            r1 = 0
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r8.mo86591v()
            if (r0 != 0) goto L_0x000d
            goto L_0x00bc
        L_0x000d:
            int r0 = androidx.core.view.C1248u0.m4356c(r9)
            float r2 = r9.getX()
            float r3 = r9.getY()
            float r4 = r8.f85948E
            float r4 = r2 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r8.f85949F
            float r5 = r3 - r5
            float r5 = java.lang.Math.abs(r5)
            ge.bog.mobilebank.ui.components.slidingmenu.a r6 = r8.f85953J
            int r6 = r6.mo86614v()
            r7 = 1
            if (r0 == 0) goto L_0x0086
            if (r0 == r7) goto L_0x004d
            r2 = 2
            if (r0 == r2) goto L_0x003c
            r2 = 3
            if (r0 == r2) goto L_0x004d
            goto L_0x00ad
        L_0x003c:
            float r0 = (float) r6
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            ge.bog.mobilebank.ui.components.slidingmenu.a r9 = r8.f85953J
            r9.mo86610b()
            r8.f85945B = r7
            return r1
        L_0x004d:
            ge.bog.mobilebank.ui.components.slidingmenu.a r0 = r8.f85953J
            boolean r0 = r0.mo86617y()
            if (r0 == 0) goto L_0x005b
            ge.bog.mobilebank.ui.components.slidingmenu.a r0 = r8.f85953J
            r0.mo86602A(r9)
            return r7
        L_0x005b:
            float r0 = (float) r6
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ad
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
            float r0 = r8.f85977y
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            android.view.View r0 = r8.f85973u
            float r2 = r8.f85948E
            int r2 = (int) r2
            float r3 = r8.f85949F
            int r3 = (int) r3
            boolean r0 = r8.m105603w(r0, r2, r3)
            if (r0 != 0) goto L_0x00ad
            android.view.View$OnClickListener r0 = r8.f85952I
            if (r0 == 0) goto L_0x00ad
            r8.playSoundEffect(r1)
            android.view.View$OnClickListener r9 = r8.f85952I
            r9.onClick(r8)
            return r7
        L_0x0086:
            r8.f85945B = r1
            r8.f85948E = r2
            r8.f85949F = r3
            android.view.View r0 = r8.f85966n
            int r2 = (int) r2
            int r3 = (int) r3
            boolean r0 = r8.m105603w(r0, r2, r3)
            if (r0 == 0) goto L_0x00b4
            android.view.View r0 = r8.f85969q
            if (r0 == 0) goto L_0x00ad
            android.view.View r0 = r8.f85968p
            if (r0 == 0) goto L_0x00ad
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00ad
            android.view.View r0 = r8.f85969q
            boolean r0 = r8.m105603w(r0, r2, r3)
            if (r0 == 0) goto L_0x00ad
            goto L_0x00b4
        L_0x00ad:
            ge.bog.mobilebank.ui.components.slidingmenu.a r0 = r8.f85953J
            boolean r9 = r0.mo86606I(r9)
            return r9
        L_0x00b4:
            ge.bog.mobilebank.ui.components.slidingmenu.a r9 = r8.f85953J
            r9.mo86610b()
            r8.f85945B = r7
            return r1
        L_0x00bc:
            ge.bog.mobilebank.ui.components.slidingmenu.a r9 = r8.f85953J
            r9.mo86609a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f85954K) {
            int i7 = C35563b.f85980a[this.f85975w.ordinal()];
            if (i7 == 1) {
                this.f85977y = 1.0f;
            } else if (i7 == 2) {
                this.f85977y = this.f85944A;
            } else if (i7 != 3) {
                this.f85977y = Utils.FLOAT_EPSILON;
            } else {
                int q = m105600q(Utils.FLOAT_EPSILON);
                if (this.f85963k) {
                    i6 = this.f85960h;
                } else {
                    i6 = -this.f85960h;
                }
                this.f85977y = m105601r(q + i6);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C35565d dVar = (C35565d) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || (i8 != 0 && !this.f85954K)) {
                int measuredHeight = childAt.getMeasuredHeight();
                if (childAt == this.f85973u) {
                    i5 = m105600q(this.f85977y);
                } else {
                    i5 = paddingTop;
                }
                if (!this.f85963k && childAt == this.f85974v && !this.f85964l) {
                    i5 = m105600q(this.f85977y) + this.f85973u.getMeasuredHeight();
                }
                int i9 = dVar.leftMargin + paddingLeft;
                childAt.layout(i9, i5, childAt.getMeasuredWidth() + i9, measuredHeight + i5);
            }
        }
        if (this.f85954K) {
            mo86545C();
        }
        m105599p();
        this.f85954K = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
            int childCount = getChildCount();
            if (childCount == 2) {
                this.f85974v = getChildAt(0);
                View childAt = getChildAt(1);
                this.f85973u = childAt;
                if (this.f85966n == null) {
                    setDragView(childAt);
                }
                if (this.f85973u.getVisibility() != 0) {
                    this.f85975w = C35567f.HIDDEN;
                }
                int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt2 = getChildAt(i8);
                    C35565d dVar = (C35565d) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8 || i8 != 0) {
                        if (childAt2 == this.f85974v) {
                            if (this.f85964l || this.f85975w == C35567f.HIDDEN) {
                                i4 = paddingTop;
                            } else {
                                i4 = paddingTop - this.f85960h;
                            }
                            i3 = paddingLeft - (dVar.leftMargin + dVar.rightMargin);
                        } else {
                            if (childAt2 == this.f85973u) {
                                i7 = paddingTop - dVar.topMargin;
                            } else {
                                i7 = paddingTop;
                            }
                            i3 = paddingLeft;
                        }
                        int i9 = dVar.width;
                        if (i9 == -2) {
                            i5 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                        } else if (i9 == -1) {
                            i5 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                        } else {
                            i5 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                        }
                        int i12 = dVar.height;
                        if (i12 == -2) {
                            i6 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                        } else {
                            float f = dVar.f85983a;
                            if (f > Utils.FLOAT_EPSILON && f < 1.0f) {
                                i4 = (int) (((float) i4) * f);
                            } else if (i12 != -1) {
                                i4 = i12;
                            }
                            i6 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                        }
                        childAt2.measure(i5, i6);
                        View view = this.f85973u;
                        if (childAt2 == view) {
                            this.f85978z = view.getMeasuredHeight() - this.f85960h;
                        }
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            }
            throw new IllegalStateException("Sliding up panel layout must have exactly 2 children!");
        } else {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            C35567f fVar = (C35567f) bundle.getSerializable("sliding_state");
            this.f85975w = fVar;
            if (fVar == null) {
                fVar = f85942M;
            }
            this.f85975w = fVar;
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        C35567f fVar = this.f85975w;
        if (fVar == C35567f.DRAGGING) {
            fVar = this.f85976x;
        }
        bundle.putSerializable("sliding_state", fVar);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            this.f85954K = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !mo86591v()) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.f85953J.mo86602A(motionEvent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo86573s(View view) {
        synchronized (this.f85951H) {
            for (C35566e a : this.f85951H) {
                a.mo86279a(view, this.f85977y);
            }
        }
    }

    public void setAnchorPoint(float f) {
        if (f > Utils.FLOAT_EPSILON && f <= 1.0f) {
            this.f85944A = f;
            this.f85954K = true;
            requestLayout();
        }
    }

    public void setClipPanel(boolean z) {
        this.f85965m = z;
    }

    public void setCoveredFadeColor(int i) {
        this.f85957e = i;
        requestLayout();
    }

    public void setDragView(View view) {
        View view2 = this.f85966n;
        if (view2 != null) {
            view2.setOnClickListener((View.OnClickListener) null);
        }
        this.f85966n = view;
        if (view != null) {
            view.setClickable(true);
            this.f85966n.setFocusable(false);
            this.f85966n.setFocusableInTouchMode(false);
            this.f85966n.setOnClickListener(new C35562a());
        }
    }

    public void setFadeOnClickListener(View.OnClickListener onClickListener) {
        this.f85952I = onClickListener;
    }

    public void setGravity(int i) {
        boolean z;
        if (i == 48 || i == 80) {
            if (i == 80) {
                z = true;
            } else {
                z = false;
            }
            this.f85963k = z;
            if (!this.f85954K) {
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("gravity must be set to either top or bottom");
    }

    public void setMinFlingVelocity(int i) {
        this.f85956d = i;
    }

    public void setOverlayed(boolean z) {
        this.f85964l = z;
    }

    public void setPanelHeight(int i) {
        if (getPanelHeight() != i) {
            this.f85960h = i;
            if (!this.f85954K) {
                requestLayout();
            }
            if (getPanelState() == C35567f.COLLAPSED) {
                mo86544B();
                invalidate();
            }
        }
    }

    public void setPanelState(C35567f fVar) {
        C35567f fVar2;
        C35567f fVar3;
        int i;
        if (fVar == null || fVar == (fVar2 = C35567f.DRAGGING)) {
            throw new IllegalArgumentException("Panel state cannot be null or DRAGGING.");
        } else if (isEnabled()) {
            boolean z = this.f85954K;
            if ((z || this.f85973u != null) && fVar != (fVar3 = this.f85975w) && fVar3 != fVar2) {
                if (z) {
                    setPanelStateInternal(fVar);
                    return;
                }
                if (fVar3 == C35567f.HIDDEN) {
                    this.f85973u.setVisibility(0);
                    requestLayout();
                }
                int i2 = C35563b.f85980a[fVar.ordinal()];
                if (i2 == 1) {
                    mo86543A(1.0f, 0);
                } else if (i2 == 2) {
                    mo86543A(this.f85944A, 0);
                } else if (i2 == 3) {
                    int q = m105600q(Utils.FLOAT_EPSILON);
                    if (this.f85963k) {
                        i = this.f85960h;
                    } else {
                        i = -this.f85960h;
                    }
                    mo86543A(m105601r(q + i), 0);
                } else if (i2 == 4) {
                    mo86543A(Utils.FLOAT_EPSILON, 0);
                }
            }
        }
    }

    public void setParallaxOffset(int i) {
        this.f85962j = i;
        if (!this.f85954K) {
            requestLayout();
        }
    }

    public void setScrollableView(View view) {
        this.f85970r = view;
    }

    public void setScrollableViewHelper(C37928a aVar) {
        this.f85972t = aVar;
    }

    public void setShadowHeight(int i) {
        this.f85961i = i;
        if (!this.f85954K) {
            invalidate();
        }
    }

    public void setTouchEnabled(boolean z) {
        this.f85946C = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo86590t(View view, C35567f fVar, C35567f fVar2) {
        synchronized (this.f85951H) {
            for (C35566e b : this.f85951H) {
                b.mo86280b(view, fVar, fVar2);
            }
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: v */
    public boolean mo86591v() {
        return (!this.f85946C || this.f85973u == null || this.f85975w == C35567f.HIDDEN) ? false : true;
    }

    /* renamed from: y */
    public void mo86592y(C35566e eVar) {
        synchronized (this.f85951H) {
            this.f85951H.remove(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo86593z() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.slidingmenu.SlidingUpPanelLayout$d */
    public static class C35565d extends ViewGroup.MarginLayoutParams {

        /* renamed from: b */
        private static final int[] f85982b = {16843137};

        /* renamed from: a */
        public float f85983a;

        public C35565d() {
            super(-1, -1);
            this.f85983a = Utils.FLOAT_EPSILON;
        }

        public C35565d(int i, int i2, float f) {
            super(i, i2);
            this.f85983a = f;
        }

        public C35565d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f85983a = Utils.FLOAT_EPSILON;
        }

        public C35565d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f85983a = Utils.FLOAT_EPSILON;
        }

        public C35565d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f85983a = Utils.FLOAT_EPSILON;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f85982b);
            if (obtainStyledAttributes != null) {
                this.f85983a = obtainStyledAttributes.getFloat(0, Utils.FLOAT_EPSILON);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Interpolator interpolator;
        this.f85956d = TextTypeView.SEPARATOR_FULL;
        this.f85957e = -1728053248;
        this.f85958f = new Paint();
        this.f85960h = -1;
        this.f85961i = -1;
        this.f85962j = -1;
        this.f85964l = false;
        this.f85965m = true;
        this.f85967o = -1;
        this.f85972t = new C37928a();
        C35567f fVar = f85942M;
        this.f85975w = fVar;
        this.f85976x = fVar;
        this.f85944A = 1.0f;
        this.f85950G = false;
        this.f85951H = new CopyOnWriteArrayList();
        this.f85954K = true;
        this.f85955L = new Rect();
        if (isInEditMode()) {
            this.f85959g = null;
            this.f85953J = null;
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f85943N);
            if (obtainStyledAttributes != null) {
                setGravity(obtainStyledAttributes.getInt(0, 0));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C10330s.f29235Z6);
            if (obtainStyledAttributes2 != null) {
                this.f85960h = obtainStyledAttributes2.getDimensionPixelSize(C10330s.f29320h7, -1);
                this.f85961i = obtainStyledAttributes2.getDimensionPixelSize(C10330s.f29360l7, -1);
                this.f85962j = obtainStyledAttributes2.getDimensionPixelSize(C10330s.f29330i7, -1);
                this.f85956d = obtainStyledAttributes2.getInt(C10330s.f29290e7, TextTypeView.SEPARATOR_FULL);
                this.f85957e = obtainStyledAttributes2.getColor(C10330s.f29279d7, -1728053248);
                this.f85967o = obtainStyledAttributes2.getResourceId(C10330s.f29268c7, -1);
                this.f85971s = obtainStyledAttributes2.getResourceId(C10330s.f29350k7, -1);
                this.f85964l = obtainStyledAttributes2.getBoolean(C10330s.f29310g7, false);
                this.f85965m = obtainStyledAttributes2.getBoolean(C10330s.f29257b7, true);
                this.f85944A = obtainStyledAttributes2.getFloat(C10330s.f29246a7, 1.0f);
                this.f85975w = C35567f.values()[obtainStyledAttributes2.getInt(C10330s.f29300f7, f85942M.ordinal())];
                int resourceId = obtainStyledAttributes2.getResourceId(C10330s.f29340j7, -1);
                if (resourceId != -1) {
                    interpolator = AnimationUtils.loadInterpolator(context, resourceId);
                    obtainStyledAttributes2.recycle();
                }
            }
            interpolator = null;
            obtainStyledAttributes2.recycle();
        } else {
            interpolator = null;
        }
        float f = context.getResources().getDisplayMetrics().density;
        if (this.f85960h == -1) {
            this.f85960h = (int) ((68.0f * f) + 0.5f);
        }
        if (this.f85961i == -1) {
            this.f85961i = (int) ((4.0f * f) + 0.5f);
        }
        if (this.f85962j == -1) {
            this.f85962j = (int) (Utils.FLOAT_EPSILON * f);
        }
        if (this.f85961i <= 0) {
            this.f85959g = null;
        } else if (this.f85963k) {
            this.f85959g = getResources().getDrawable(C10320i.above_shadow);
        } else {
            this.f85959g = getResources().getDrawable(C10320i.below_shadow);
        }
        setWillNotDraw(false);
        C35568a m = C35568a.m105636m(this, 0.5f, interpolator, new C35564c());
        this.f85953J = m;
        m.mo86604G(((float) this.f85956d) * f);
        this.f85946C = true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C35565d(getContext(), attributeSet);
    }

    public void setDragView(int i) {
        this.f85967o = i;
        setDragView(findViewById(i));
    }
}
