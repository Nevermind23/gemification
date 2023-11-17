package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.content.C0767a;
import androidx.core.view.C1255v0;
import androidx.core.view.C1262w0;
import androidx.core.view.C1268x0;
import androidx.core.view.C1274y0;
import androidx.core.view.C1279z0;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1308l;
import com.github.mikephil.charting.utils.Utils;

public class SwipeRefreshLayout extends ViewGroup implements C1274y0, C1268x0, C1255v0 {

    /* renamed from: S */
    private static final String f5537S = "SwipeRefreshLayout";

    /* renamed from: T */
    private static final int[] f5538T = {16842766};

    /* renamed from: A */
    protected int f5539A;

    /* renamed from: B */
    float f5540B;

    /* renamed from: C */
    protected int f5541C;

    /* renamed from: D */
    int f5542D;

    /* renamed from: E */
    int f5543E;

    /* renamed from: F */
    C1865b f5544F;

    /* renamed from: G */
    private Animation f5545G;

    /* renamed from: H */
    private Animation f5546H;

    /* renamed from: I */
    private Animation f5547I;

    /* renamed from: J */
    private Animation f5548J;

    /* renamed from: K */
    private Animation f5549K;

    /* renamed from: L */
    boolean f5550L;

    /* renamed from: M */
    private int f5551M;

    /* renamed from: N */
    boolean f5552N;

    /* renamed from: O */
    private boolean f5553O;

    /* renamed from: P */
    private Animation.AnimationListener f5554P = new C1853a();

    /* renamed from: Q */
    private final Animation f5555Q = new C1858f();

    /* renamed from: R */
    private final Animation f5556R = new C1859g();

    /* renamed from: d */
    private View f5557d;

    /* renamed from: e */
    C1862j f5558e;

    /* renamed from: f */
    boolean f5559f = false;

    /* renamed from: g */
    private int f5560g;

    /* renamed from: h */
    private float f5561h = -1.0f;

    /* renamed from: i */
    private float f5562i;

    /* renamed from: j */
    private final C1279z0 f5563j;

    /* renamed from: k */
    private final C1262w0 f5564k;

    /* renamed from: l */
    private final int[] f5565l = new int[2];

    /* renamed from: m */
    private final int[] f5566m = new int[2];

    /* renamed from: n */
    private final int[] f5567n = new int[2];

    /* renamed from: o */
    private boolean f5568o;

    /* renamed from: p */
    private int f5569p;

    /* renamed from: q */
    int f5570q;

    /* renamed from: r */
    private float f5571r;

    /* renamed from: s */
    private float f5572s;

    /* renamed from: t */
    private boolean f5573t;

    /* renamed from: u */
    private int f5574u = -1;

    /* renamed from: v */
    boolean f5575v;

    /* renamed from: w */
    private boolean f5576w;

    /* renamed from: x */
    private final DecelerateInterpolator f5577x;

    /* renamed from: y */
    C1863a f5578y;

    /* renamed from: z */
    private int f5579z = -1;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class C1853a implements Animation.AnimationListener {
        C1853a() {
        }

        public void onAnimationEnd(Animation animation) {
            C1862j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f5559f) {
                swipeRefreshLayout.f5544F.setAlpha(C11051p3.f31759c);
                SwipeRefreshLayout.this.f5544F.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f5550L && (jVar = swipeRefreshLayout2.f5558e) != null) {
                    jVar.mo6203v();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f5570q = swipeRefreshLayout3.f5578y.getTop();
                return;
            }
            swipeRefreshLayout.mo6150m();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C1854b extends Animation {
        C1854b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C1855c extends Animation {
        C1855c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C1856d extends Animation {

        /* renamed from: d */
        final /* synthetic */ int f5584d;

        /* renamed from: e */
        final /* synthetic */ int f5585e;

        C1856d(int i, int i2) {
            this.f5584d = i;
            this.f5585e = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C1865b bVar = SwipeRefreshLayout.this.f5544F;
            int i = this.f5584d;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f5585e - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class C1857e implements Animation.AnimationListener {
        C1857e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f5575v) {
                swipeRefreshLayout.mo6166s((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C1858f extends Animation {
        C1858f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f5552N) {
                i = swipeRefreshLayout.f5542D - Math.abs(swipeRefreshLayout.f5541C);
            } else {
                i = swipeRefreshLayout.f5542D;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f5539A;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f5578y.getTop());
            SwipeRefreshLayout.this.f5544F.mo6214e(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C1859g extends Animation {
        C1859g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo6149k(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C1860h extends Animation {
        C1860h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f5540B;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo6149k(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C1861i {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C1862j {
        /* renamed from: v */
        void mo6203v();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5560g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5569p = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f5577x = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f5551M = (int) (displayMetrics.density * 40.0f);
        m7233d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f5542D = i;
        this.f5561h = (float) i;
        this.f5563j = new C1279z0(this);
        this.f5564k = new C1262w0(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f5551M;
        this.f5570q = i2;
        this.f5541C = i2;
        mo6149k(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5538T);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m7231a(int i, Animation.AnimationListener animationListener) {
        this.f5539A = i;
        this.f5555Q.reset();
        this.f5555Q.setDuration(200);
        this.f5555Q.setInterpolator(this.f5577x);
        if (animationListener != null) {
            this.f5578y.mo6204b(animationListener);
        }
        this.f5578y.clearAnimation();
        this.f5578y.startAnimation(this.f5555Q);
    }

    /* renamed from: b */
    private void m7232b(int i, Animation.AnimationListener animationListener) {
        if (this.f5575v) {
            m7244t(i, animationListener);
            return;
        }
        this.f5539A = i;
        this.f5556R.reset();
        this.f5556R.setDuration(200);
        this.f5556R.setInterpolator(this.f5577x);
        if (animationListener != null) {
            this.f5578y.mo6204b(animationListener);
        }
        this.f5578y.clearAnimation();
        this.f5578y.startAnimation(this.f5556R);
    }

    /* renamed from: d */
    private void m7233d() {
        this.f5578y = new C1863a(getContext());
        C1865b bVar = new C1865b(getContext());
        this.f5544F = bVar;
        bVar.mo6222l(1);
        this.f5578y.setImageDrawable(this.f5544F);
        this.f5578y.setVisibility(8);
        addView(this.f5578y);
    }

    /* renamed from: f */
    private void m7234f() {
        if (this.f5557d == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f5578y)) {
                    this.f5557d = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m7235g(float f) {
        C1857e eVar;
        if (f > this.f5561h) {
            m7239n(true, true);
            return;
        }
        this.f5559f = false;
        this.f5544F.mo6220j(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        if (!this.f5575v) {
            eVar = new C1857e();
        } else {
            eVar = null;
        }
        m7232b(this.f5570q, eVar);
        this.f5544F.mo6212d(false);
    }

    /* renamed from: h */
    private boolean m7236h(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: j */
    private void m7237j(float f) {
        this.f5544F.mo6212d(true);
        float min = Math.min(1.0f, Math.abs(f / this.f5561h));
        float max = (((float) Math.max(((double) min) - 0.4d, Utils.DOUBLE_EPSILON)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f5561h;
        int i = this.f5543E;
        if (i <= 0) {
            if (this.f5552N) {
                i = this.f5542D - this.f5541C;
            } else {
                i = this.f5542D;
            }
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(Utils.FLOAT_EPSILON, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f5541C + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f5578y.getVisibility() != 0) {
            this.f5578y.setVisibility(0);
        }
        if (!this.f5575v) {
            this.f5578y.setScaleX(1.0f);
            this.f5578y.setScaleY(1.0f);
        }
        if (this.f5575v) {
            setAnimationProgress(Math.min(1.0f, f / this.f5561h));
        }
        if (f < this.f5561h) {
            if (this.f5544F.getAlpha() > 76 && !m7236h(this.f5547I)) {
                m7243r();
            }
        } else if (this.f5544F.getAlpha() < 255 && !m7236h(this.f5548J)) {
            m7242q();
        }
        this.f5544F.mo6220j(Utils.FLOAT_EPSILON, Math.min(0.8f, max * 0.8f));
        this.f5544F.mo6214e(Math.min(1.0f, max));
        this.f5544F.mo6216g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f5570q);
    }

    /* renamed from: l */
    private void m7238l(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5574u) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f5574u = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: n */
    private void m7239n(boolean z, boolean z2) {
        if (this.f5559f != z) {
            this.f5550L = z2;
            m7234f();
            this.f5559f = z;
            if (z) {
                m7231a(this.f5570q, this.f5554P);
            } else {
                mo6166s(this.f5554P);
            }
        }
    }

    /* renamed from: o */
    private Animation m7240o(int i, int i2) {
        C1856d dVar = new C1856d(i, i2);
        dVar.setDuration(300);
        this.f5578y.mo6204b((Animation.AnimationListener) null);
        this.f5578y.clearAnimation();
        this.f5578y.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: p */
    private void m7241p(float f) {
        float f2 = this.f5572s;
        int i = this.f5560g;
        if (f - f2 > ((float) i) && !this.f5573t) {
            this.f5571r = f2 + ((float) i);
            this.f5573t = true;
            this.f5544F.setAlpha(76);
        }
    }

    /* renamed from: q */
    private void m7242q() {
        this.f5548J = m7240o(this.f5544F.getAlpha(), C11051p3.f31759c);
    }

    /* renamed from: r */
    private void m7243r() {
        this.f5547I = m7240o(this.f5544F.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f5578y.getBackground().setAlpha(i);
        this.f5544F.setAlpha(i);
    }

    /* renamed from: t */
    private void m7244t(int i, Animation.AnimationListener animationListener) {
        this.f5539A = i;
        this.f5540B = this.f5578y.getScaleX();
        C1860h hVar = new C1860h();
        this.f5549K = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f5578y.mo6204b(animationListener);
        }
        this.f5578y.clearAnimation();
        this.f5578y.startAnimation(this.f5549K);
    }

    /* renamed from: u */
    private void m7245u(Animation.AnimationListener animationListener) {
        this.f5578y.setVisibility(0);
        this.f5544F.setAlpha(C11051p3.f31759c);
        C1854b bVar = new C1854b();
        this.f5545G = bVar;
        bVar.setDuration((long) this.f5569p);
        if (animationListener != null) {
            this.f5578y.mo6204b(animationListener);
        }
        this.f5578y.clearAnimation();
        this.f5578y.startAnimation(this.f5545G);
    }

    /* renamed from: c */
    public boolean mo6135c() {
        View view = this.f5557d;
        if (view instanceof ListView) {
            return C1308l.m4538a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f5564k.mo3733a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f5564k.mo3734b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f5564k.mo3735c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f5564k.mo3738f(i, i2, i3, i4, iArr);
    }

    /* renamed from: e */
    public void mo6140e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (i5 == 0) {
            this.f5564k.mo3737e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f5579z;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f5563j.mo3748a();
    }

    public int getProgressCircleDiameter() {
        return this.f5551M;
    }

    public int getProgressViewEndOffset() {
        return this.f5542D;
    }

    public int getProgressViewStartOffset() {
        return this.f5541C;
    }

    public boolean hasNestedScrollingParent() {
        return this.f5564k.mo3740k();
    }

    /* renamed from: i */
    public boolean mo6147i() {
        return this.f5559f;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f5564k.mo3742m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6149k(float f) {
        int i = this.f5539A;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f5541C - i)) * f))) - this.f5578y.getTop());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6150m() {
        this.f5578y.clearAnimation();
        this.f5544F.stop();
        this.f5578y.setVisibility(8);
        setColorViewAlpha(C11051p3.f31759c);
        if (this.f5575v) {
            setAnimationProgress(Utils.FLOAT_EPSILON);
        } else {
            setTargetOffsetTopAndBottom(this.f5541C - this.f5570q);
        }
        this.f5570q = this.f5578y.getTop();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo6150m();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m7234f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5576w && actionMasked == 0) {
            this.f5576w = false;
        }
        if (!isEnabled() || this.f5576w || mo6135c() || this.f5559f || this.f5568o) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f5574u;
                    if (i == -1) {
                        Log.e(f5537S, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m7241p(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m7238l(motionEvent);
                    }
                }
            }
            this.f5573t = false;
            this.f5574u = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f5541C - this.f5578y.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f5574u = pointerId;
            this.f5573t = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f5572s = motionEvent.getY(findPointerIndex2);
        }
        return this.f5573t;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f5557d == null) {
                m7234f();
            }
            View view = this.f5557d;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f5578y.getMeasuredWidth();
                int measuredHeight2 = this.f5578y.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f5570q;
                this.f5578y.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5557d == null) {
            m7234f();
        }
        View view = this.f5557d;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f5578y.measure(View.MeasureSpec.makeMeasureSpec(this.f5551M, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5551M, 1073741824));
            this.f5579z = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f5578y) {
                    this.f5579z = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int i6 = iArr[1];
            mo6140e(i, i2, i3, i4, this.f5566m, i5, iArr);
            int i7 = i4 - (iArr[1] - i6);
            int i8 = i7 == 0 ? i4 + this.f5566m[1] : i7;
            if (i8 < 0 && !mo6135c()) {
                float abs = this.f5562i + ((float) Math.abs(i8));
                this.f5562i = abs;
                m7237j(abs);
                iArr[1] = iArr[1] + i7;
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f5580d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f5559f);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5576w && actionMasked == 0) {
            this.f5576w = false;
        }
        if (!isEnabled() || this.f5576w || mo6135c() || this.f5559f || this.f5568o) {
            return false;
        }
        if (actionMasked == 0) {
            this.f5574u = motionEvent.getPointerId(0);
            this.f5573t = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5574u);
            if (findPointerIndex < 0) {
                Log.e(f5537S, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f5573t) {
                this.f5573t = false;
                m7235g((motionEvent.getY(findPointerIndex) - this.f5571r) * 0.5f);
            }
            this.f5574u = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f5574u);
            if (findPointerIndex2 < 0) {
                Log.e(f5537S, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            m7241p(y);
            if (this.f5573t) {
                float f = (y - this.f5571r) * 0.5f;
                if (f <= Utils.FLOAT_EPSILON) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m7237j(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f5537S, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f5574u = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m7238l(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f5557d;
        if (view == null || ViewCompat.m3580W(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        } else if (!this.f5553O && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo6166s(Animation.AnimationListener animationListener) {
        C1855c cVar = new C1855c();
        this.f5546H = cVar;
        cVar.setDuration(150);
        this.f5578y.mo6204b(animationListener);
        this.f5578y.clearAnimation();
        this.f5578y.startAnimation(this.f5546H);
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.f5578y.setScaleX(f);
        this.f5578y.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m7234f();
        this.f5544F.mo6215f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0767a.m2893c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f5561h = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo6150m();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f5553O = z;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f5564k.mo3743n(z);
    }

    public void setOnChildScrollUpCallback(C1861i iVar) {
    }

    public void setOnRefreshListener(C1862j jVar) {
        this.f5558e = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f5578y.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0767a.m2893c(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f5559f == z) {
            m7239n(z, false);
            return;
        }
        this.f5559f = z;
        if (!this.f5552N) {
            i = this.f5542D + this.f5541C;
        } else {
            i = this.f5542D;
        }
        setTargetOffsetTopAndBottom(i - this.f5570q);
        this.f5550L = false;
        m7245u(this.f5554P);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f5551M = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f5551M = (int) (displayMetrics.density * 40.0f);
            }
            this.f5578y.setImageDrawable((Drawable) null);
            this.f5544F.mo6222l(i);
            this.f5578y.setImageDrawable(this.f5544F);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f5543E = i;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f5578y.bringToFront();
        ViewCompat.m3589c0(this.f5578y, i);
        this.f5570q = this.f5578y.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f5564k.mo3744p(i);
    }

    public void stopNestedScroll() {
        this.f5564k.mo3746r();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1852a();

        /* renamed from: d */
        final boolean f5580d;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        class C1852a implements Parcelable.Creator {
            C1852a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f5580d = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f5580d ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5580d = parcel.readByte() != 0;
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f5562i;
            if (f > Utils.FLOAT_EPSILON) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f5562i = Utils.FLOAT_EPSILON;
                } else {
                    this.f5562i = f - f2;
                    iArr[1] = i2;
                }
                m7237j(this.f5562i);
            }
        }
        if (this.f5552N && i2 > 0 && this.f5562i == Utils.FLOAT_EPSILON && Math.abs(i2 - iArr[1]) > 0) {
            this.f5578y.setVisibility(8);
        }
        int[] iArr2 = this.f5565l;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f5563j.mo3749b(view, view2, i);
        startNestedScroll(i & 2);
        this.f5562i = Utils.FLOAT_EPSILON;
        this.f5568o = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f5576w && !this.f5559f && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f5563j.mo3751d(view);
        this.f5568o = false;
        float f = this.f5562i;
        if (f > Utils.FLOAT_EPSILON) {
            m7235g(f);
            this.f5562i = Utils.FLOAT_EPSILON;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.f5567n);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f5567n);
    }
}
