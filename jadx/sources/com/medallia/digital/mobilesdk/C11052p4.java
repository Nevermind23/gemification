package com.medallia.digital.mobilesdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.medallia.digital.mobilesdk.p4 */
class C11052p4 extends FrameLayout {

    /* renamed from: A */
    private static final float f31763A = 2.0E-4f;

    /* renamed from: B */
    private static final float f31764B = 0.002f;

    /* renamed from: C */
    private static final float f31765C = 0.2f;

    /* renamed from: y */
    private static final int f31766y = 255;

    /* renamed from: z */
    private static final float f31767z = 0.5f;

    /* renamed from: a */
    private final float f31768a;

    /* renamed from: b */
    private final float f31769b;

    /* renamed from: c */
    private int f31770c;

    /* renamed from: d */
    private int f31771d;

    /* renamed from: e */
    private float f31772e = Utils.FLOAT_EPSILON;

    /* renamed from: f */
    private float f31773f = Utils.FLOAT_EPSILON;

    /* renamed from: g */
    private boolean f31774g = true;

    /* renamed from: h */
    private boolean f31775h = false;

    /* renamed from: i */
    private boolean f31776i = true;

    /* renamed from: j */
    private boolean f31777j = true;

    /* renamed from: k */
    private final int[] f31778k;

    /* renamed from: l */
    private final int[] f31779l;

    /* renamed from: m */
    private final int f31780m;

    /* renamed from: n */
    private final int f31781n;

    /* renamed from: o */
    private int f31782o;

    /* renamed from: p */
    private NinePatchDrawable f31783p;

    /* renamed from: q */
    private int f31784q;

    /* renamed from: r */
    private NinePatchDrawable f31785r;

    /* renamed from: s */
    private int f31786s;

    /* renamed from: t */
    private NinePatchDrawable f31787t;

    /* renamed from: u */
    private int f31788u;

    /* renamed from: v */
    private NinePatchDrawable f31789v;

    /* renamed from: w */
    private final Rect f31790w = new Rect();

    /* renamed from: x */
    private final int[] f31791x = new int[2];

    /* renamed from: com.medallia.digital.mobilesdk.p4$a */
    private static class C11053a extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<C11053a> CREATOR = new C11054a();

        /* renamed from: a */
        float f31792a;

        /* renamed from: b */
        float f31793b;

        /* renamed from: c */
        boolean f31794c;

        /* renamed from: d */
        boolean f31795d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f31796e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f31797f;

        /* renamed from: com.medallia.digital.mobilesdk.p4$a$a */
        static class C11054a implements Parcelable.Creator<C11053a> {
            C11054a() {
            }

            /* renamed from: a */
            public C11053a createFromParcel(Parcel parcel) {
                return new C11053a(parcel);
            }

            /* renamed from: a */
            public C11053a[] newArray(int i) {
                return new C11053a[i];
            }
        }

        C11053a(Parcel parcel) {
            super(parcel);
            this.f31792a = parcel.readFloat();
            this.f31793b = parcel.readFloat();
            boolean z = true;
            this.f31794c = parcel.readByte() != 0;
            this.f31795d = parcel.readByte() != 0;
            this.f31796e = parcel.readByte() != 0;
            this.f31797f = parcel.readByte() == 0 ? false : z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f31792a);
            parcel.writeFloat(this.f31793b);
            parcel.writeByte(this.f31794c ? (byte) 1 : 0);
            parcel.writeByte(this.f31795d ? (byte) 1 : 0);
            parcel.writeByte(this.f31796e ? (byte) 1 : 0);
            parcel.writeByte(this.f31797f ? (byte) 1 : 0);
        }

        C11053a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    C11052p4(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10706R.styleable.md_MaterialShadowContainerView, i, i2);
        float dimension = obtainStyledAttributes.getDimension(C10706R.styleable.md_MaterialShadowContainerView_md_shadowTranslationZ, this.f31772e);
        float dimension2 = obtainStyledAttributes.getDimension(C10706R.styleable.md_MaterialShadowContainerView_md_shadowElevation, this.f31773f);
        int resourceId = obtainStyledAttributes.getResourceId(C10706R.styleable.md_MaterialShadowContainerView_md_spotShadowDrawablesList, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C10706R.styleable.md_MaterialShadowContainerView_md_ambientShadowDrawablesList, 0);
        boolean z = obtainStyledAttributes.getBoolean(C10706R.styleable.md_MaterialShadowContainerView_md_forceUseCompatShadow, this.f31775h);
        boolean z2 = obtainStyledAttributes.getBoolean(C10706R.styleable.md_MaterialShadowContainerView_md_affectsDisplayedPosition, this.f31774g);
        boolean z3 = obtainStyledAttributes.getBoolean(C10706R.styleable.md_MaterialShadowContainerView_md_useAmbientShadow, this.f31776i);
        boolean z4 = obtainStyledAttributes.getBoolean(C10706R.styleable.md_MaterialShadowContainerView_md_useSpotShadow, this.f31777j);
        obtainStyledAttributes.recycle();
        int[] a = m40527a(getResources(), resourceId);
        this.f31778k = a;
        int[] a2 = m40527a(getResources(), resourceId2);
        this.f31779l = a2;
        this.f31780m = m40521a(a);
        this.f31781n = m40521a(a2);
        float f = getResources().getDisplayMetrics().density;
        this.f31768a = f;
        this.f31769b = 1.0f / f;
        this.f31772e = dimension;
        this.f31773f = dimension2;
        this.f31775h = z;
        this.f31774g = z2;
        this.f31776i = z3;
        this.f31777j = z4;
        m40529e(true);
    }

    /* renamed from: a */
    private static int m40521a(int[] iArr) {
        if (iArr != null) {
            return Math.max(0, iArr.length - 1);
        }
        return 0;
    }

    /* renamed from: e */
    private void m40529e(boolean z) {
        if (mo28899j()) {
            m40524a(this.f31772e, this.f31773f, z);
        } else {
            m40528b(this.f31772e, this.f31773f, z);
        }
    }

    /* renamed from: f */
    private void m40531f() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            m40526a(this.f31783p, left, top, right, bottom);
            NinePatchDrawable ninePatchDrawable = this.f31787t;
            NinePatchDrawable ninePatchDrawable2 = this.f31785r;
            if (ninePatchDrawable != ninePatchDrawable2) {
                m40526a(ninePatchDrawable2, left, top, right, bottom);
            }
            m40526a(this.f31787t, left, top, right, bottom);
            NinePatchDrawable ninePatchDrawable3 = this.f31787t;
            NinePatchDrawable ninePatchDrawable4 = this.f31789v;
            if (ninePatchDrawable3 != ninePatchDrawable4) {
                m40526a(ninePatchDrawable4, left, top, right, bottom);
            }
        }
    }

    /* renamed from: g */
    private void m40532g() {
        float f;
        float f2;
        if (getChildCount() >= 1) {
            View childAt = getChildAt(0);
            childAt.getWindowVisibleDisplayFrame(this.f31790w);
            int width = this.f31790w.width() / 2;
            childAt.getLocationInWindow(this.f31791x);
            float f3 = this.f31772e + this.f31773f;
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (this.f31774g) {
                int width2 = childAt.getWidth();
                int height = childAt.getHeight();
                int[] iArr = this.f31791x;
                int i = iArr[1] + (height / 2);
                f = ((float) Math.sqrt((double) (((float) ((iArr[0] + (width2 / 2)) - width)) * this.f31769b * f31763A))) * f3;
                f2 = ((float) Math.sqrt((double) (((float) (i - 0)) * this.f31769b * f31764B))) * f3;
            } else {
                f2 = this.f31768a * f31765C * f3;
                f = Utils.FLOAT_EPSILON;
            }
            this.f31770c = (int) (f + translationX + f31767z);
            this.f31771d = (int) (f2 + translationY + f31767z);
        }
    }

    /* renamed from: h */
    private boolean m40533h() {
        boolean z = true;
        boolean z2 = this.f31776i && !(this.f31787t == null && this.f31789v == null);
        boolean z3 = this.f31777j && !(this.f31783p == null && this.f31785r == null);
        if (z2 || z3 || getBackground() != null || getForeground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        return z;
    }

    /* renamed from: b */
    public float mo28891b() {
        return this.f31773f;
    }

    /* renamed from: c */
    public float mo28894c() {
        return this.f31772e;
    }

    /* renamed from: d */
    public void mo28896d(boolean z) {
        if (this.f31777j != z) {
            this.f31777j = z;
            if (!m40533h()) {
                ViewCompat.m3601i0(this);
            }
        }
    }

    /* renamed from: i */
    public boolean mo28898i() {
        return this.f31776i;
    }

    /* renamed from: j */
    public boolean mo28899j() {
        if (!m40530e()) {
            return true;
        }
        return this.f31775h;
    }

    /* renamed from: k */
    public boolean mo28900k() {
        return this.f31777j;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getChildCount() > 0 && getChildAt(0).getVisibility() == 0) {
            if (this.f31776i) {
                NinePatchDrawable ninePatchDrawable = this.f31787t;
                if (ninePatchDrawable != null) {
                    ninePatchDrawable.draw(canvas);
                }
                NinePatchDrawable ninePatchDrawable2 = this.f31789v;
                if (ninePatchDrawable2 != null) {
                    ninePatchDrawable2.draw(canvas);
                }
            }
            if (!this.f31777j) {
                return;
            }
            if (this.f31783p != null || this.f31785r != null) {
                int save = canvas.save();
                canvas.translate((float) this.f31770c, (float) this.f31771d);
                NinePatchDrawable ninePatchDrawable3 = this.f31783p;
                if (ninePatchDrawable3 != null) {
                    ninePatchDrawable3.draw(canvas);
                }
                NinePatchDrawable ninePatchDrawable4 = this.f31785r;
                if (ninePatchDrawable4 != null) {
                    ninePatchDrawable4.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m40531f();
        m40532g();
        if (!mo28899j()) {
            m40528b(this.f31772e, this.f31773f, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C11053a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C11053a aVar = (C11053a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f31773f = aVar.f31793b;
        this.f31772e = aVar.f31792a;
        this.f31774g = aVar.f31794c;
        this.f31775h = aVar.f31795d;
        this.f31776i = aVar.f31796e;
        this.f31777j = aVar.f31797f;
        m40529e(true);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C11053a aVar = new C11053a(super.onSaveInstanceState());
        aVar.f31793b = this.f31773f;
        aVar.f31792a = this.f31772e;
        aVar.f31794c = this.f31774g;
        aVar.f31795d = this.f31775h;
        boolean unused = aVar.f31796e = this.f31776i;
        boolean unused2 = aVar.f31797f = this.f31777j;
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m40531f();
        m40532g();
    }

    /* renamed from: a */
    private NinePatchDrawable m40522a(int i) {
        Drawable drawable = i != 0 ? getResources().getDrawable(i) : null;
        if (drawable instanceof NinePatchDrawable) {
            return (NinePatchDrawable) drawable;
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m40530e() {
        return true;
    }

    /* renamed from: b */
    public void mo28892b(float f) {
        if (this.f31772e != f) {
            this.f31772e = f;
            m40529e(false);
        }
    }

    /* renamed from: c */
    public void mo28895c(boolean z) {
        if (this.f31776i != z) {
            this.f31776i = z;
            if (!m40533h()) {
                ViewCompat.m3601i0(this);
            }
        }
    }

    /* renamed from: d */
    public boolean mo28897d() {
        return this.f31774g;
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    private void m40523a() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.gravity == -1) {
                layoutParams.gravity = 51;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    private void m40528b(float f, float f2, boolean z) {
        View view = null;
        if (z) {
            this.f31783p = null;
            this.f31782o = 0;
            this.f31785r = null;
            this.f31784q = 0;
            this.f31787t = null;
            this.f31786s = 0;
            this.f31789v = null;
            this.f31788u = 0;
            m40533h();
        }
        if (getChildCount() > 0) {
            view = getChildAt(0);
        }
        if (view != null) {
            ViewCompat.m3568O0(view, f);
            ViewCompat.m3635z0(view, f2);
        }
    }

    /* renamed from: a */
    public void mo28889a(float f) {
        if (this.f31773f != f) {
            this.f31773f = f;
            m40529e(false);
        }
    }

    /* renamed from: b */
    public void mo28893b(boolean z) {
        if (this.f31775h != z) {
            boolean j = mo28899j();
            this.f31775h = z;
            boolean j2 = mo28899j();
            if (j != j2) {
                if (j2 && m40530e()) {
                    m40528b(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, true);
                }
                m40529e(true);
            }
        }
    }

    /* renamed from: a */
    private void m40524a(float f, float f2, boolean z) {
        float max = Math.max((f + f2) * this.f31769b, Utils.FLOAT_EPSILON);
        int i = (int) max;
        int min = Math.min(i, this.f31780m);
        int i2 = i + 1;
        int min2 = Math.min(i2, this.f31780m);
        int min3 = Math.min(i, this.f31781n);
        int min4 = Math.min(i2, this.f31781n);
        int[] iArr = this.f31778k;
        int i3 = iArr != null ? iArr[min] : 0;
        int i4 = iArr != null ? iArr[min2] : 0;
        int[] iArr2 = this.f31779l;
        int i5 = iArr2 != null ? iArr2[min3] : 0;
        int i6 = iArr2 != null ? iArr2[min4] : 0;
        if (!(!z && i3 == this.f31782o && i4 == this.f31784q && i5 == this.f31786s && i6 == this.f31788u)) {
            if (i3 != this.f31782o) {
                this.f31783p = m40522a(i3);
                this.f31782o = i3;
            }
            NinePatchDrawable ninePatchDrawable = null;
            if (i4 != this.f31784q) {
                this.f31785r = i4 == i3 ? null : m40522a(i4);
                if (i4 == i3) {
                    i4 = 0;
                }
                this.f31784q = i4;
            }
            if (i5 != this.f31786s) {
                this.f31787t = m40522a(i5);
                this.f31786s = i5;
            }
            if (i6 != this.f31788u) {
                if (i6 != i5) {
                    ninePatchDrawable = m40522a(i6);
                }
                this.f31789v = ninePatchDrawable;
                if (i6 == i5) {
                    i6 = 0;
                }
                this.f31788u = i6;
            }
            m40531f();
            m40532g();
            m40533h();
        }
        int min5 = 255 - Math.min(Math.max((int) (((max - ((float) i)) * 255.0f) + f31767z), 0), 255);
        int i7 = 255 - min5;
        NinePatchDrawable ninePatchDrawable2 = this.f31783p;
        if (ninePatchDrawable2 != null) {
            if (this.f31785r != null) {
                ninePatchDrawable2.setAlpha(min5);
            } else {
                ninePatchDrawable2.setAlpha(255);
            }
        }
        NinePatchDrawable ninePatchDrawable3 = this.f31785r;
        if (ninePatchDrawable3 != null) {
            ninePatchDrawable3.setAlpha(i7);
        }
        NinePatchDrawable ninePatchDrawable4 = this.f31787t;
        if (ninePatchDrawable4 != null) {
            if (this.f31789v != null) {
                ninePatchDrawable4.setAlpha(min5);
            } else {
                ninePatchDrawable4.setAlpha(255);
            }
        }
        NinePatchDrawable ninePatchDrawable5 = this.f31789v;
        if (ninePatchDrawable5 != null) {
            ninePatchDrawable5.setAlpha(i7);
        }
        if (!willNotDraw()) {
            ViewCompat.m3601i0(this);
        }
    }

    /* renamed from: a */
    private void m40525a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int min = Math.min(1, getChildCount());
        boolean z = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        View view = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < min; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int max = Math.max(i6, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                int max2 = Math.max(i7, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                int measuredState = childAt.getMeasuredState() | i5;
                if (!z || !(layoutParams.width == -1 || layoutParams.height == -1)) {
                    i6 = max;
                    i7 = max2;
                    i5 = measuredState;
                } else {
                    i6 = max;
                    i7 = max2;
                    i5 = measuredState;
                    view = childAt;
                }
            } else {
                int i9 = i5;
            }
        }
        int i12 = i5;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int max3 = Math.max(i7 + paddingTop, getSuggestedMinimumHeight());
        int max4 = Math.max(i6 + paddingLeft, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max3 = Math.max(max3, foreground.getMinimumHeight());
            max4 = Math.max(max4, foreground.getMinimumWidth());
        }
        setMeasuredDimension(View.resolveSizeAndState(max4, i3, i12), View.resolveSizeAndState(max3, i4, i12 << 16));
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i13 = marginLayoutParams.width;
            int makeMeasureSpec = i13 == -1 ? View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - paddingLeft) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824) : ViewGroup.getChildMeasureSpec(i3, paddingLeft + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, i13);
            int i14 = marginLayoutParams.height;
            view.measure(makeMeasureSpec, i14 == -1 ? View.MeasureSpec.makeMeasureSpec(((getMeasuredHeight() - paddingTop) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824) : ViewGroup.getChildMeasureSpec(i4, paddingTop + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, i14));
        }
    }

    /* renamed from: a */
    private void m40526a(NinePatchDrawable ninePatchDrawable, int i, int i2, int i3, int i4) {
        if (ninePatchDrawable != null) {
            Rect rect = this.f31790w;
            ninePatchDrawable.getPadding(rect);
            ninePatchDrawable.setBounds(i - rect.left, i2 - rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    /* renamed from: a */
    public void mo28890a(boolean z) {
        if (this.f31774g != z) {
            this.f31774g = z;
            if (mo28899j()) {
                m40529e(true);
            }
        }
    }

    /* renamed from: a */
    private int[] m40527a(Resources resources, int i) {
        if (i == 0 || isInEditMode()) {
            return null;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = obtainTypedArray.getResourceId(i2, 0);
        }
        obtainTypedArray.recycle();
        return iArr;
    }
}
