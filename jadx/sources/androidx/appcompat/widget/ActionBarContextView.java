package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.C0264b;
import androidx.appcompat.view.menu.C0297g;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import p030c.C2210a;
import p030c.C2215f;
import p030c.C2216g;
import p030c.C2219j;

public class ActionBarContextView extends C0392a {

    /* renamed from: l */
    private CharSequence f1710l;

    /* renamed from: m */
    private CharSequence f1711m;

    /* renamed from: n */
    private View f1712n;

    /* renamed from: o */
    private View f1713o;

    /* renamed from: p */
    private View f1714p;

    /* renamed from: q */
    private LinearLayout f1715q;

    /* renamed from: r */
    private TextView f1716r;

    /* renamed from: s */
    private TextView f1717s;

    /* renamed from: t */
    private int f1718t;

    /* renamed from: u */
    private int f1719u;

    /* renamed from: v */
    private boolean f1720v;

    /* renamed from: w */
    private int f1721w;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0324a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C0264b f1722d;

        C0324a(C0264b bVar) {
            this.f1722d = bVar;
        }

        public void onClick(View view) {
            this.f1722d.mo684c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: i */
    private void m1257i() {
        int i;
        if (this.f1715q == null) {
            LayoutInflater.from(getContext()).inflate(C2216g.f6580a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1715q = linearLayout;
            this.f1716r = (TextView) linearLayout.findViewById(C2215f.f6558e);
            this.f1717s = (TextView) this.f1715q.findViewById(C2215f.f6557d);
            if (this.f1718t != 0) {
                this.f1716r.setTextAppearance(getContext(), this.f1718t);
            }
            if (this.f1719u != 0) {
                this.f1717s.setTextAppearance(getContext(), this.f1719u);
            }
        }
        this.f1716r.setText(this.f1710l);
        this.f1717s.setText(this.f1711m);
        boolean z = !TextUtils.isEmpty(this.f1710l);
        boolean z2 = !TextUtils.isEmpty(this.f1711m);
        TextView textView = this.f1717s;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f1715q;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f1715q.getParent() == null) {
            addView(this.f1715q);
        }
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat mo1247f(int i, long j) {
        return super.mo1247f(i, j);
    }

    /* renamed from: g */
    public void mo1248g() {
        if (this.f1712n == null) {
            mo1257k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1711m;
    }

    public CharSequence getTitle() {
        return this.f1710l;
    }

    /* renamed from: h */
    public void mo1255h(C0264b bVar) {
        View view = this.f1712n;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1721w, this, false);
            this.f1712n = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1712n);
        }
        View findViewById = this.f1712n.findViewById(C2215f.f6562i);
        this.f1713o = findViewById;
        findViewById.setOnClickListener(new C0324a(bVar));
        C0297g gVar = (C0297g) bVar.mo686e();
        ActionMenuPresenter actionMenuPresenter = this.f2008g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1332B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f2008g = actionMenuPresenter2;
        actionMenuPresenter2.mo1342M(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.mo1004c(this.f2008g, this.f2006e);
        ActionMenuView actionMenuView = (ActionMenuView) this.f2008g.mo914r(this);
        this.f2007f = actionMenuView;
        ViewCompat.m3627v0(actionMenuView, (Drawable) null);
        addView(this.f2007f, layoutParams);
    }

    /* renamed from: j */
    public boolean mo1256j() {
        return this.f1720v;
    }

    /* renamed from: k */
    public void mo1257k() {
        removeAllViews();
        this.f1714p = null;
        this.f2007f = null;
        this.f2008g = null;
        View view = this.f1713o;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: l */
    public boolean mo1258l() {
        ActionMenuPresenter actionMenuPresenter = this.f2008g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1343N();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f2008g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1334E();
            this.f2008g.mo1335F();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean b = C0417d2.m1689b(this);
        if (b) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1712n;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1712n.getLayoutParams();
            if (b) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (b) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            int d = C0392a.m1597d(i5, i7, b);
            i5 = C0392a.m1597d(d + mo1911e(this.f1712n, d, paddingTop, paddingTop2, b), i8, b);
        }
        int i9 = i5;
        LinearLayout linearLayout = this.f1715q;
        if (!(linearLayout == null || this.f1714p != null || linearLayout.getVisibility() == 8)) {
            i9 += mo1911e(this.f1715q, i9, paddingTop, paddingTop2, b);
        }
        int i12 = i9;
        View view2 = this.f1714p;
        if (view2 != null) {
            mo1911e(view2, i12, paddingTop, paddingTop2, b);
        }
        if (b) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f2007f;
        if (actionMenuView != null) {
            mo1911e(actionMenuView, i6, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i6 = this.f2009h;
            if (i6 <= 0) {
                i6 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i6 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            View view = this.f1712n;
            if (view != null) {
                int c = mo1910c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1712n.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f2007f;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1910c(this.f2007f, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1715q;
            if (linearLayout != null && this.f1714p == null) {
                if (this.f1720v) {
                    this.f1715q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1715q.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f1715q;
                    if (z) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    linearLayout2.setVisibility(i4);
                } else {
                    paddingLeft = mo1910c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1714p;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i8 = layoutParams.width;
                if (i8 != -2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i5 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i7 = Math.min(i9, i7);
                }
                this.f1714p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i7, i5));
            }
            if (this.f2009h <= 0) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i12) {
                        i12 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i12);
                return;
            }
            setMeasuredDimension(size, i6);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f2009h = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1714p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1714p = view;
        if (!(view == null || (linearLayout = this.f1715q) == null)) {
            removeView(linearLayout);
            this.f1715q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1711m = charSequence;
        m1257i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1710l = charSequence;
        m1257i();
        ViewCompat.m3625u0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1720v) {
            requestLayout();
        }
        this.f1720v = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6451g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0483r1 v = C0483r1.m1946v(context, attributeSet, C2219j.f6870y, i, 0);
        ViewCompat.m3627v0(this, v.mo2320g(C2219j.f6875z));
        this.f1718t = v.mo2327n(C2219j.f6635D, 0);
        this.f1719u = v.mo2327n(C2219j.f6630C, 0);
        this.f2009h = v.mo2326m(C2219j.f6625B, 0);
        this.f1721w = v.mo2327n(C2219j.f6620A, C2216g.f6583d);
        v.mo2333w();
    }
}
