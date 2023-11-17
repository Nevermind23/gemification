package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0125b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0418e;
import androidx.appcompat.widget.C0483r1;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.widget.C1295d;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.C5089m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p009a8.C0072b;
import p009a8.C0076f;
import p009a8.C0080j;
import p009a8.C0081k;
import p009a8.C0082l;
import p045d.C5769a;
import p080f8.C6170a;
import p106h8.C6477a;
import p297w4.C8847x;

public class MaterialCheckBox extends C0418e {

    /* renamed from: A */
    private static final int[][] f15786A;

    /* renamed from: B */
    private static final int f15787B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: x */
    private static final int f15788x = C0081k.f374v;

    /* renamed from: y */
    private static final int[] f15789y = {C0072b.state_indeterminate};

    /* renamed from: z */
    private static final int[] f15790z;

    /* renamed from: d */
    private final LinkedHashSet f15791d;

    /* renamed from: e */
    private final LinkedHashSet f15792e;

    /* renamed from: f */
    private ColorStateList f15793f;

    /* renamed from: g */
    private boolean f15794g;

    /* renamed from: h */
    private boolean f15795h;

    /* renamed from: i */
    private boolean f15796i;

    /* renamed from: j */
    private CharSequence f15797j;

    /* renamed from: k */
    private Drawable f15798k;

    /* renamed from: l */
    private Drawable f15799l;

    /* renamed from: m */
    private boolean f15800m;

    /* renamed from: n */
    ColorStateList f15801n;

    /* renamed from: o */
    ColorStateList f15802o;

    /* renamed from: p */
    private PorterDuff.Mode f15803p;

    /* renamed from: q */
    private int f15804q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int[] f15805r;

    /* renamed from: s */
    private boolean f15806s;

    /* renamed from: t */
    private CharSequence f15807t;

    /* renamed from: u */
    private CompoundButton.OnCheckedChangeListener f15808u;

    /* renamed from: v */
    private final AnimatedVectorDrawableCompat f15809v;

    /* renamed from: w */
    private final Animatable2Compat$AnimationCallback f15810w;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4977a();

        /* renamed from: d */
        int f15811d;

        /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$a */
        class C4977a implements Parcelable.Creator {
            C4977a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C4978a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C4978a aVar) {
            this(parcel);
        }

        /* renamed from: a */
        private String m19178a() {
            int i = this.f15811d;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + m19178a() + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f15811d));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f15811d = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    class C4978a extends Animatable2Compat$AnimationCallback {
        C4978a() {
        }

        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f15801n;
            if (colorStateList != null) {
                C0836a.m3153o(drawable, colorStateList);
            }
        }

        public void onAnimationStart(Drawable drawable) {
            super.onAnimationStart(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f15801n;
            if (colorStateList != null) {
                C0836a.m3152n(drawable, colorStateList.getColorForState(materialCheckBox.f15805r, MaterialCheckBox.this.f15801n.getDefaultColor()));
            }
        }
    }

    static {
        int i = C0072b.state_error;
        f15790z = new int[]{i};
        f15786A = new int[][]{new int[]{16842910, i}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f149h);
    }

    /* renamed from: c */
    private boolean m19171c(C0483r1 r1Var) {
        int n = r1Var.mo2327n(C0082l.f837u4, 0);
        int n2 = r1Var.mo2327n(C0082l.f847v4, 0);
        if (n == f15787B && n2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m19172e() {
        this.f15798k = C6477a.m25598b(this.f15798k, this.f15801n, C1295d.m4507c(this));
        this.f15799l = C6477a.m25598b(this.f15799l, this.f15802o, this.f15803p);
        m19174g();
        m19175h();
        super.setButtonDrawable(C6477a.m25597a(this.f15798k, this.f15799l));
        refreshDrawableState();
    }

    /* renamed from: f */
    private void m19173f() {
        if (Build.VERSION.SDK_INT >= 30 && this.f15807t == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    /* renamed from: g */
    private void m19174g() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        if (this.f15800m) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f15809v;
            if (animatedVectorDrawableCompat2 != null) {
                animatedVectorDrawableCompat2.mo6284h(this.f15810w);
                this.f15809v.mo6269d(this.f15810w);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f15798k;
                if ((drawable instanceof AnimatedStateListDrawable) && (animatedVectorDrawableCompat = this.f15809v) != null) {
                    int i = C0076f.f262b;
                    int i2 = C0076f.f267d0;
                    ((AnimatedStateListDrawable) drawable).addTransition(i, i2, animatedVectorDrawableCompat, false);
                    ((AnimatedStateListDrawable) this.f15798k).addTransition(C0076f.indeterminate, i2, this.f15809v, false);
                }
            }
        }
    }

    private String getButtonStateDescription() {
        int i = this.f15804q;
        if (i == 1) {
            return getResources().getString(C0080j.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(C0080j.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(C0080j.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15793f == null) {
            int[][] iArr = f15786A;
            int[] iArr2 = new int[iArr.length];
            int d = C6170a.m24583d(this, C0072b.f153l);
            int d2 = C6170a.m24583d(this, C0072b.f155n);
            int d3 = C6170a.m24583d(this, C0072b.f159r);
            int d4 = C6170a.m24583d(this, C0072b.f156o);
            iArr2[0] = C6170a.m24587h(d3, d2, 1.0f);
            iArr2[1] = C6170a.m24587h(d3, d, 1.0f);
            iArr2[2] = C6170a.m24587h(d3, d4, 0.54f);
            iArr2[3] = C6170a.m24587h(d3, d4, 0.38f);
            iArr2[4] = C6170a.m24587h(d3, d4, 0.38f);
            this.f15793f = new ColorStateList(iArr, iArr2);
        }
        return this.f15793f;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f15801n;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    /* renamed from: h */
    private void m19175h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f15798k;
        if (!(drawable == null || (colorStateList2 = this.f15801n) == null)) {
            C0836a.m3153o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f15799l;
        if (drawable2 != null && (colorStateList = this.f15802o) != null) {
            C0836a.m3153o(drawable2, colorStateList);
        }
    }

    /* renamed from: i */
    private void m19176i() {
    }

    /* renamed from: d */
    public boolean mo15828d() {
        return this.f15796i;
    }

    public Drawable getButtonDrawable() {
        return this.f15798k;
    }

    public Drawable getButtonIconDrawable() {
        return this.f15799l;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f15802o;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f15803p;
    }

    public ColorStateList getButtonTintList() {
        return this.f15801n;
    }

    public int getCheckedState() {
        return this.f15804q;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f15797j;
    }

    public boolean isChecked() {
        return this.f15804q == 1;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15794g && this.f15801n == null && this.f15802o == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f15789y);
        }
        if (mo15828d()) {
            View.mergeDrawableStates(onCreateDrawableState, f15790z);
        }
        this.f15805r = C6477a.m25600d(onCreateDrawableState);
        m19176i();
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable a;
        int i;
        if (!this.f15795h || !TextUtils.isEmpty(getText()) || (a = C1295d.m4505a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (C5089m.m19905f(this)) {
            i = -1;
        } else {
            i = 1;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, Utils.FLOAT_EPSILON);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            C0836a.m3150l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && mo15828d()) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f15797j);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f15811d);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f15811d = getCheckedState();
        return savedState;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C5769a.m23210b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f15799l = drawable;
        m19172e();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(C5769a.m23210b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f15802o != colorStateList) {
            this.f15802o = colorStateList;
            m19172e();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f15803p != mode) {
            this.f15803p = mode;
            m19172e();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f15801n != colorStateList) {
            this.f15801n = colorStateList;
            m19172e();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m19172e();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f15795h = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager a;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f15804q != i) {
            this.f15804q = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            m19173f();
            if (!this.f15806s) {
                this.f15806s = true;
                LinkedHashSet linkedHashSet = this.f15792e;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        C0125b.m366a(it.next());
                        throw null;
                    }
                }
                if (!(this.f15804q == 2 || (onCheckedChangeListener = this.f15808u) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (a = C8847x.m32937a(getContext().getSystemService(AutofillManager.class))) != null) {
                    a.notifyValueChanged(this);
                }
                this.f15806s = false;
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m19176i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f15797j = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f15796i != z) {
            this.f15796i = z;
            refreshDrawableState();
            Iterator it = this.f15791d.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                throw null;
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15808u = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f15807t = charSequence;
        if (charSequence == null) {
            m19173f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f15794g = z;
        if (z) {
            C1295d.m4508d(this, getMaterialThemeColorsTintList());
        } else {
            C1295d.m4508d(this, (ColorStateList) null);
        }
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f15788x
            android.content.Context r9 = p249s8.C8273a.m31120c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f15791d = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f15792e = r9
            android.content.Context r9 = r8.getContext()
            int r0 = p009a8.C0075e.mtrl_checkbox_button_checked_unchecked
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r9 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.m7299b(r9, r0)
            r8.f15809v = r9
            com.google.android.material.checkbox.MaterialCheckBox$a r9 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r9.<init>()
            r8.f15810w = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C1295d.m4505a(r8)
            r8.f15798k = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.f15801n = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = p009a8.C0082l.f827t4
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.r1 r10 = com.google.android.material.internal.C5088l.m19899j(r0, r1, r2, r3, r4, r5)
            int r11 = p009a8.C0082l.f857w4
            android.graphics.drawable.Drawable r11 = r10.mo2320g(r11)
            r8.f15799l = r11
            android.graphics.drawable.Drawable r11 = r8.f15798k
            r0 = 1
            if (r11 == 0) goto L_0x007c
            boolean r11 = com.google.android.material.internal.C5088l.m19896g(r9)
            if (r11 == 0) goto L_0x007c
            boolean r11 = r8.m19171c(r10)
            if (r11 == 0) goto L_0x007c
            super.setButtonDrawable((android.graphics.drawable.Drawable) r6)
            int r11 = p009a8.C0075e.mtrl_checkbox_button
            android.graphics.drawable.Drawable r11 = p045d.C5769a.m23210b(r9, r11)
            r8.f15798k = r11
            r8.f15800m = r0
            android.graphics.drawable.Drawable r11 = r8.f15799l
            if (r11 != 0) goto L_0x007c
            int r11 = p009a8.C0075e.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r11 = p045d.C5769a.m23210b(r9, r11)
            r8.f15799l = r11
        L_0x007c:
            int r11 = p009a8.C0082l.f867x4
            android.content.res.ColorStateList r9 = p184n8.C7343c.m28004b(r9, r10, r11)
            r8.f15802o = r9
            int r9 = p009a8.C0082l.f877y4
            r11 = -1
            int r9 = r10.mo2324k(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.C5089m.m19906g(r9, r11)
            r8.f15803p = r9
            int r9 = p009a8.C0082l.f414D4
            boolean r9 = r10.mo2314a(r9, r7)
            r8.f15794g = r9
            int r9 = p009a8.C0082l.f887z4
            boolean r9 = r10.mo2314a(r9, r0)
            r8.f15795h = r9
            int r9 = p009a8.C0082l.f404C4
            boolean r9 = r10.mo2314a(r9, r7)
            r8.f15796i = r9
            int r9 = p009a8.C0082l.f394B4
            java.lang.CharSequence r9 = r10.mo2329p(r9)
            r8.f15797j = r9
            int r9 = p009a8.C0082l.f384A4
            boolean r11 = r10.mo2332s(r9)
            if (r11 == 0) goto L_0x00c2
            int r9 = r10.mo2324k(r9, r7)
            r8.setCheckedState(r9)
        L_0x00c2:
            r10.mo2333w()
            r8.m19172e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f15798k = drawable;
        this.f15800m = false;
        m19172e();
    }
}
