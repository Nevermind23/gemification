package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import p030c.C2215f;
import p030c.C2219j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: d */
    private boolean f1700d;

    /* renamed from: e */
    private View f1701e;

    /* renamed from: f */
    private View f1702f;

    /* renamed from: g */
    private View f1703g;

    /* renamed from: h */
    Drawable f1704h;

    /* renamed from: i */
    Drawable f1705i;

    /* renamed from: j */
    Drawable f1706j;

    /* renamed from: k */
    boolean f1707k;

    /* renamed from: l */
    boolean f1708l;

    /* renamed from: m */
    private int f1709m;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    private static class C0323a {
        /* renamed from: a */
        public static void m1256a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.m3627v0(this, new C0398b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2219j.f6750a);
        this.f1704h = obtainStyledAttributes.getDrawable(C2219j.f6755b);
        this.f1705i = obtainStyledAttributes.getDrawable(C2219j.f6765d);
        this.f1709m = obtainStyledAttributes.getDimensionPixelSize(C2219j.f6795j, -1);
        boolean z = true;
        if (getId() == C2215f.f6545H) {
            this.f1707k = true;
            this.f1706j = obtainStyledAttributes.getDrawable(C2219j.f6760c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1707k ? !(this.f1704h == null && this.f1705i == null) : this.f1706j != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m1254a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1255b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1704h;
        if (drawable != null && drawable.isStateful()) {
            this.f1704h.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1705i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1705i.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1706j;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1706j.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1701e;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1704h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1705i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1706j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1702f = findViewById(C2215f.f6554a);
        this.f1703g = findViewById(C2215f.f6559f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1700d || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f1701e
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f1707k
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f1706j
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f1704h
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f1702f
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f1704h
            android.view.View r7 = r4.f1702f
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1702f
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1702f
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1702f
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f1703g
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f1704h
            android.view.View r7 = r4.f1703g
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1703g
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1703g
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1703g
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f1704h
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f1708l = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f1705i
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1702f == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f1709m) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1702f != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f1701e;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m1255b(this.f1702f)) {
                    i3 = m1254a(this.f1702f);
                } else if (!m1255b(this.f1703g)) {
                    i3 = m1254a(this.f1703g);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = View.MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1254a(this.f1701e), i4));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1704h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1704h);
        }
        this.f1704h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1702f;
            if (view != null) {
                this.f1704h.setBounds(view.getLeft(), this.f1702f.getTop(), this.f1702f.getRight(), this.f1702f.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1707k ? !(this.f1704h == null && this.f1705i == null) : this.f1706j != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0323a.m1256a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1706j;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1706j);
        }
        this.f1706j = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1707k && (drawable2 = this.f1706j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1707k ? this.f1704h == null && this.f1705i == null : this.f1706j == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        C0323a.m1256a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1705i;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1705i);
        }
        this.f1705i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1708l && (drawable2 = this.f1705i) != null) {
                drawable2.setBounds(this.f1701e.getLeft(), this.f1701e.getTop(), this.f1701e.getRight(), this.f1701e.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1707k ? !(this.f1704h == null && this.f1705i == null) : this.f1706j != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        C0323a.m1256a(this);
    }

    public void setTabContainer(C0460k1 k1Var) {
        View view = this.f1701e;
        if (view != null) {
            removeView(view);
        }
        this.f1701e = k1Var;
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f1700d = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1704h;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1705i;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1706j;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f1704h || this.f1707k) && ((drawable != this.f1705i || !this.f1708l) && ((drawable != this.f1706j || !this.f1707k) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
