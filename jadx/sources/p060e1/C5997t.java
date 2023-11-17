package p060e1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;

/* renamed from: e1.t */
class C5997t extends ViewGroup implements C5988q {

    /* renamed from: d */
    ViewGroup f18744d;

    /* renamed from: e */
    View f18745e;

    /* renamed from: f */
    final View f18746f;

    /* renamed from: g */
    int f18747g;

    /* renamed from: h */
    private Matrix f18748h;

    /* renamed from: i */
    private final ViewTreeObserver.OnPreDrawListener f18749i = new C5998a();

    /* renamed from: e1.t$a */
    class C5998a implements ViewTreeObserver.OnPreDrawListener {
        C5998a() {
        }

        public boolean onPreDraw() {
            View view;
            ViewCompat.m3601i0(C5997t.this);
            C5997t tVar = C5997t.this;
            ViewGroup viewGroup = tVar.f18744d;
            if (viewGroup == null || (view = tVar.f18745e) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            ViewCompat.m3601i0(C5997t.this.f18744d);
            C5997t tVar2 = C5997t.this;
            tVar2.f18744d = null;
            tVar2.f18745e = null;
            return true;
        }
    }

    C5997t(View view) {
        super(view.getContext());
        this.f18746f = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: b */
    static C5997t m24084b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        C5991r rVar;
        if (view.getParent() instanceof ViewGroup) {
            C5991r b = C5991r.m24065b(viewGroup);
            C5997t e = m24087e(view);
            if (e == null || (rVar = (C5991r) e.getParent()) == b) {
                i = 0;
            } else {
                i = e.f18747g;
                rVar.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m24085c(view, viewGroup, matrix);
                }
                e = new C5997t(view);
                e.mo19443h(matrix);
                if (b == null) {
                    b = new C5991r(viewGroup);
                } else {
                    b.mo19437g();
                }
                m24086d(viewGroup, b);
                m24086d(viewGroup, e);
                b.mo19436a(e);
                e.f18747g = i;
            } else if (matrix != null) {
                e.mo19443h(matrix);
            }
            e.f18747g++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    static void m24085c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C5887a1.m23693j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        C5887a1.m23694k(viewGroup, matrix);
    }

    /* renamed from: d */
    static void m24086d(View view, View view2) {
        C5887a1.m23690g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    static C5997t m24087e(View view) {
        return (C5997t) view.getTag(C5894c0.f18488a);
    }

    /* renamed from: f */
    static void m24088f(View view) {
        C5997t e = m24087e(view);
        if (e != null) {
            int i = e.f18747g - 1;
            e.f18747g = i;
            if (i <= 0) {
                ((C5991r) e.getParent()).removeView(e);
            }
        }
    }

    /* renamed from: g */
    static void m24089g(View view, C5997t tVar) {
        view.setTag(C5894c0.f18488a, tVar);
    }

    /* renamed from: a */
    public void mo19429a(ViewGroup viewGroup, View view) {
        this.f18744d = viewGroup;
        this.f18745e = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo19443h(Matrix matrix) {
        this.f18748h = matrix;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m24089g(this.f18746f, this);
        this.f18746f.getViewTreeObserver().addOnPreDrawListener(this.f18749i);
        C5887a1.m23692i(this.f18746f, 4);
        if (this.f18746f.getParent() != null) {
            ((View) this.f18746f.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f18746f.getViewTreeObserver().removeOnPreDrawListener(this.f18749i);
        C5887a1.m23692i(this.f18746f, 0);
        m24089g(this.f18746f, (C5997t) null);
        if (this.f18746f.getParent() != null) {
            ((View) this.f18746f.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C5902f.m23718a(canvas, true);
        canvas.setMatrix(this.f18748h);
        C5887a1.m23692i(this.f18746f, 0);
        this.f18746f.invalidate();
        C5887a1.m23692i(this.f18746f, 4);
        drawChild(canvas, this.f18746f, getDrawingTime());
        C5902f.m23718a(canvas, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (m24087e(this.f18746f) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C5887a1.m23692i(this.f18746f, i2);
        }
    }
}
