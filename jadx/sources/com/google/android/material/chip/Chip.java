package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0418e;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facetec.sdk.FaceTecSDK;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.chip.C4983a;
import com.google.android.material.internal.C5078f;
import com.google.android.material.internal.C5088l;
import com.google.android.material.internal.C5089m;
import java.util.List;
import p001a0.C0002a;
import p009a8.C0072b;
import p009a8.C0080j;
import p009a8.C0081k;
import p009a8.C0082l;
import p026b8.C2173d;
import p184n8.C7344d;
import p184n8.C7348f;
import p197o8.C7492b;
import p223q8.C7926h;
import p223q8.C7929k;
import p223q8.C7945n;

public class Chip extends C0418e implements C4983a.C4984a, C7945n, Checkable {

    /* renamed from: v */
    private static final int f15813v = C0081k.f372t;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final Rect f15814w = new Rect();

    /* renamed from: x */
    private static final int[] f15815x = {16842913};

    /* renamed from: y */
    private static final int[] f15816y = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4983a f15817d;

    /* renamed from: e */
    private InsetDrawable f15818e;

    /* renamed from: f */
    private RippleDrawable f15819f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public View.OnClickListener f15820g;

    /* renamed from: h */
    private CompoundButton.OnCheckedChangeListener f15821h;

    /* renamed from: i */
    private boolean f15822i;

    /* renamed from: j */
    private boolean f15823j;

    /* renamed from: k */
    private boolean f15824k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f15825l;

    /* renamed from: m */
    private boolean f15826m;

    /* renamed from: n */
    private int f15827n;

    /* renamed from: o */
    private int f15828o;

    /* renamed from: p */
    private CharSequence f15829p;

    /* renamed from: q */
    private final C4982c f15830q;

    /* renamed from: r */
    private boolean f15831r;

    /* renamed from: s */
    private final Rect f15832s;

    /* renamed from: t */
    private final RectF f15833t;

    /* renamed from: u */
    private final C7348f f15834u;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C4980a extends C7348f {
        C4980a() {
        }

        /* renamed from: a */
        public void mo16009a(int i) {
        }

        /* renamed from: b */
        public void mo16010b(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            if (chip.f15817d.mo16045M2()) {
                charSequence = Chip.this.f15817d.mo16090h1();
            } else {
                charSequence = Chip.this.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C4981b extends ViewOutlineProvider {
        C4981b() {
        }

        public void getOutline(View view, Outline outline) {
            if (Chip.this.f15817d != null) {
                Chip.this.f15817d.getOutline(outline);
            } else {
                outline.setAlpha(Utils.FLOAT_EPSILON);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C4982c extends C0002a {
        C4982c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public void mo8B(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.mo3590W(Chip.this.mo15910r());
            accessibilityNodeInfoCompat.mo3593Z(Chip.this.isClickable());
            accessibilityNodeInfoCompat.mo3592Y(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.mo3634w0(Chip.this.getText());
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo9C(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfoCompat.mo3599c0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C0080j.f337m;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    accessibilityNodeInfoCompat.mo3599c0(context.getString(i2, objArr).trim());
                }
                accessibilityNodeInfoCompat.mo3588U(Chip.this.getCloseIconTouchBoundsInt());
                accessibilityNodeInfoCompat.mo3596b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3746i);
                accessibilityNodeInfoCompat.mo3602e0(Chip.this.isEnabled());
                return;
            }
            accessibilityNodeInfoCompat.mo3599c0(charSequence);
            accessibilityNodeInfoCompat.mo3588U(Chip.f15814w);
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public void mo10D(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f15825l = z;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public int mo22q(float f, float f2) {
            return (!Chip.this.m19197n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo23r(List list) {
            list.add(0);
            if (Chip.this.m19197n() && Chip.this.mo15911s() && Chip.this.f15820g != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public boolean mo26y(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo16007u();
            }
            return false;
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f150i);
    }

    /* renamed from: A */
    private void m19182A() {
        this.f15819f = new RippleDrawable(C7492b.m28457d(this.f15817d.mo16080f1()), getBackgroundDrawable(), (Drawable) null);
        this.f15817d.mo16042L2(false);
        ViewCompat.m3627v0(this, this.f15819f);
        m19183B();
    }

    /* renamed from: B */
    private void m19183B() {
        C4983a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f15817d) != null) {
            int J0 = (int) (aVar.mo16034J0() + this.f15817d.mo16096j1() + this.f15817d.mo16111q0());
            int O0 = (int) (this.f15817d.mo16048O0() + this.f15817d.mo16098k1() + this.f15817d.mo16101m0());
            if (this.f15818e != null) {
                Rect rect = new Rect();
                this.f15818e.getPadding(rect);
                O0 += rect.left;
                J0 += rect.right;
            }
            ViewCompat.m3552G0(this, O0, getPaddingTop(), J0, getPaddingBottom());
        }
    }

    /* renamed from: C */
    private void m19184C() {
        TextPaint paint = getPaint();
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C7344d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo21724n(getContext(), paint, this.f15834u);
        }
    }

    /* renamed from: D */
    private void m19185D(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f15833t.setEmpty();
        if (m19197n() && this.f15820g != null) {
            this.f15817d.mo16068Y0(this.f15833t);
        }
        return this.f15833t;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f15832s.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f15832s;
    }

    private C7344d getTextAppearance() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16092i1();
        }
        return null;
    }

    /* renamed from: j */
    private void m19194j(C4983a aVar) {
        aVar.mo16110p2(this);
    }

    /* renamed from: k */
    private int[] m19195k() {
        int isEnabled = isEnabled();
        if (this.f15825l) {
            isEnabled++;
        }
        if (this.f15824k) {
            isEnabled++;
        }
        if (this.f15823j) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f15825l) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f15824k) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f15823j) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: m */
    private void m19196m() {
        if (getBackgroundDrawable() == this.f15818e && this.f15817d.getCallback() == null) {
            this.f15817d.setCallback(this.f15818e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m19197n() {
        C4983a aVar = this.f15817d;
        return (aVar == null || aVar.mo16054R0() == null) ? false : true;
    }

    /* renamed from: o */
    private void m19198o(Context context, AttributeSet attributeSet, int i) {
        TypedArray i2 = C5088l.m19898i(context, attributeSet, C0082l.f430F0, i, f15813v, new int[0]);
        this.f15826m = i2.getBoolean(C0082l.f744l1, false);
        this.f15828o = (int) Math.ceil((double) i2.getDimension(C0082l.f624Z0, (float) Math.ceil((double) C5089m.m19901b(getContext(), 48))));
        i2.recycle();
    }

    /* renamed from: p */
    private void m19199p() {
        setOutlineProvider(new C4981b());
    }

    /* renamed from: q */
    private void m19200q(int i, int i2, int i3, int i4) {
        this.f15818e = new InsetDrawable(this.f15817d, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f15824k != z) {
            this.f15824k = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f15823j != z) {
            this.f15823j = z;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m19201t(CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f15821h;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    /* renamed from: v */
    private void m19202v() {
        if (this.f15818e != null) {
            this.f15818e = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m19205z();
        }
    }

    /* renamed from: x */
    private void m19203x(C4983a aVar) {
        if (aVar != null) {
            aVar.mo16110p2((C4983a.C4984a) null);
        }
    }

    /* renamed from: y */
    private void m19204y() {
        if (!m19197n() || !mo15911s() || this.f15820g == null) {
            ViewCompat.m3619r0(this, (C1055a) null);
            this.f15831r = false;
            return;
        }
        ViewCompat.m3619r0(this, this.f15830q);
        this.f15831r = true;
    }

    /* renamed from: z */
    private void m19205z() {
        if (C7492b.f21801a) {
            m19182A();
            return;
        }
        this.f15817d.mo16042L2(true);
        ViewCompat.m3627v0(this, getBackgroundDrawable());
        m19183B();
        m19196m();
    }

    /* renamed from: a */
    public void mo15866a() {
        mo15901l(this.f15828o);
        requestLayout();
        invalidateOutline();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f15831r) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.f15830q.mo16k(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f15831r) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f15830q.mo17l(keyEvent) || this.f15830q.mo21p() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        C4983a aVar = this.f15817d;
        if (aVar == null || !aVar.mo16109p1()) {
            z = false;
        } else {
            z = this.f15817d.mo16100l2(m19195k());
        }
        if (z) {
            invalidate();
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f15829p)) {
            return this.f15829p;
        }
        if (mo15910r()) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f15818e;
        if (insetDrawable == null) {
            return this.f15817d;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16022F0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16025G0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16028H0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C4983a aVar = this.f15817d;
        return aVar != null ? Math.max(Utils.FLOAT_EPSILON, aVar.mo16031I0()) : Utils.FLOAT_EPSILON;
    }

    public Drawable getChipDrawable() {
        return this.f15817d;
    }

    public float getChipEndPadding() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16034J0() : Utils.FLOAT_EPSILON;
    }

    public Drawable getChipIcon() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16037K0();
        }
        return null;
    }

    public float getChipIconSize() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16040L0() : Utils.FLOAT_EPSILON;
    }

    public ColorStateList getChipIconTint() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16043M0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16046N0() : Utils.FLOAT_EPSILON;
    }

    public float getChipStartPadding() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16048O0() : Utils.FLOAT_EPSILON;
    }

    public ColorStateList getChipStrokeColor() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16050P0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16052Q0() : Utils.FLOAT_EPSILON;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16054R0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16056S0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16058T0() : Utils.FLOAT_EPSILON;
    }

    public float getCloseIconSize() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16060U0() : Utils.FLOAT_EPSILON;
    }

    public float getCloseIconStartPadding() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16062V0() : Utils.FLOAT_EPSILON;
    }

    public ColorStateList getCloseIconTint() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16066X0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16072b1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (!this.f15831r || !(this.f15830q.mo21p() == 1 || this.f15830q.mo18m() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public C2173d getHideMotionSpec() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16073c1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16075d1() : Utils.FLOAT_EPSILON;
    }

    public float getIconStartPadding() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16078e1() : Utils.FLOAT_EPSILON;
    }

    public ColorStateList getRippleColor() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16080f1();
        }
        return null;
    }

    public C7929k getShapeAppearanceModel() {
        return this.f15817d.mo22929D();
    }

    public C2173d getShowMotionSpec() {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            return aVar.mo16082g1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16096j1() : Utils.FLOAT_EPSILON;
    }

    public float getTextStartPadding() {
        C4983a aVar = this.f15817d;
        return aVar != null ? aVar.mo16098k1() : Utils.FLOAT_EPSILON;
    }

    /* renamed from: l */
    public boolean mo15901l(int i) {
        int i2;
        this.f15828o = i;
        int i3 = 0;
        if (!mo16008w()) {
            if (this.f15818e != null) {
                m19202v();
            } else {
                m19205z();
            }
            return false;
        }
        int max = Math.max(0, i - this.f15817d.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f15817d.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            if (max2 > 0) {
                i2 = max2 / 2;
            } else {
                i2 = 0;
            }
            if (max > 0) {
                i3 = max / 2;
            }
            if (this.f15818e != null) {
                Rect rect = new Rect();
                this.f15818e.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                    m19205z();
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            m19200q(i2, i3, i2, i3);
            m19205z();
            return true;
        }
        if (this.f15818e != null) {
            m19202v();
        } else {
            m19205z();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7926h.m29971f(this, this.f15817d);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f15815x);
        }
        if (mo15910r()) {
            View.mergeDrawableStates(onCreateDrawableState, f15816y);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f15831r) {
            this.f15830q.mo25x(z, i, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(mo15910r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), FaceTecSDK.REQUEST_CODE_SESSION);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f15827n != i) {
            this.f15827n = i;
            m19183B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f15823j
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r3)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f15823j
            if (r0 == 0) goto L_0x0034
            r5.mo16007u()
            r0 = r2
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            r5.setCloseIconPressed(r3)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r2)
        L_0x003e:
            r0 = r2
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean mo15910r() {
        C4983a aVar = this.f15817d;
        return aVar != null && aVar.mo16105o1();
    }

    /* renamed from: s */
    public boolean mo15911s() {
        C4983a aVar = this.f15817d;
        return aVar != null && aVar.mo16112q1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f15829p = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f15819f) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f15819f) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16129x1(z);
        }
    }

    public void setCheckableResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16131y1(i);
        }
    }

    public void setChecked(boolean z) {
        C4983a aVar = this.f15817d;
        if (aVar == null) {
            this.f15822i = z;
        } else if (aVar.mo16105o1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16133z1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16012A1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16014B1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16016C1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16018D1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16023F1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16026G1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16029H1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16032I1(i);
        }
    }

    public void setChipDrawable(C4983a aVar) {
        C4983a aVar2 = this.f15817d;
        if (aVar2 != aVar) {
            m19203x(aVar2);
            this.f15817d = aVar;
            aVar.mo16013A2(false);
            m19194j(this.f15817d);
            mo15901l(this.f15828o);
        }
    }

    public void setChipEndPadding(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16035J1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16038K1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16041L1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16044M1(i);
        }
    }

    public void setChipIconSize(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16047N1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16049O1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16051P1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16053Q1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16055R1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16059T1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16061U1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16063V1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16065W1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16067X1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16069Y1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16070Z1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16071a2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16074c2(drawable);
        }
        m19204y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16076d2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16079e2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16081f2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16083g2(i);
        }
        m19204y();
    }

    public void setCloseIconSize(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16091h2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16093i2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16097j2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16099k2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16103m2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16104n2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo22940W(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f15817d != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C4983a aVar = this.f15817d;
                if (aVar != null) {
                    aVar.mo16113q2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f15826m = z;
        mo15901l(this.f15828o);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C2173d dVar) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16114r2(dVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16115s2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16123t2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16124u2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16127v2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16128w2(i);
        }
    }

    public void setInternalOnCheckedChangeListener(C5078f fVar) {
    }

    public void setLayoutDirection(int i) {
        if (this.f15817d != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16130x2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15821h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f15820g = onClickListener;
        m19204y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16132y2(colorStateList);
        }
        if (!this.f15817d.mo16102m1()) {
            m19182A();
        }
    }

    public void setRippleColorResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16134z2(i);
            if (!this.f15817d.mo16102m1()) {
                m19182A();
            }
        }
    }

    public void setShapeAppearanceModel(C7929k kVar) {
        this.f15817d.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C2173d dVar) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16015B2(dVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16017C2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.mo16045M2()) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            C4983a aVar2 = this.f15817d;
            if (aVar2 != null) {
                aVar2.mo16019D2(charSequence);
            }
        }
    }

    public void setTextAppearance(C7344d dVar) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16021E2(dVar);
        }
        m19184C();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16027G2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16030H2(i);
        }
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16033I2(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        m19184C();
    }

    public void setTextStartPadding(float f) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16036J2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16039K2(i);
        }
    }

    /* renamed from: u */
    public boolean mo16007u() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f15820g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f15831r) {
            this.f15830q.mo13J(1, 1);
        }
        return z;
    }

    /* renamed from: w */
    public boolean mo16008w() {
        return this.f15826m;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f15813v
            android.content.Context r7 = p249s8.C8273a.m31120c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f15832s = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f15833t = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f15834u = r7
            android.content.Context r0 = r6.getContext()
            r6.m19185D(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.C4983a.m19248v0(r0, r8, r9, r4)
            r6.m19198o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.ViewCompat.m3628w(r6)
            r7.mo22940W(r1)
            int[] r2 = p009a8.C0082l.f430F0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C5088l.m19898i(r0, r1, r2, r3, r4, r5)
            int r9 = p009a8.C0082l.f794q1
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f15830q = r8
            r6.m19204y()
            if (r9 != 0) goto L_0x0059
            r6.m19199p()
        L_0x0059:
            boolean r8 = r6.f15822i
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.mo16090h1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.mo16072b1()
            r6.setEllipsize(r7)
            r6.m19184C()
            com.google.android.material.chip.a r7 = r6.f15817d
            boolean r7 = r7.mo16045M2()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.m19183B()
            boolean r7 = r6.mo16008w()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f15828o
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = androidx.core.view.ViewCompat.m3541B(r6)
            r6.f15827n = r7
            e8.a r7 = new e8.a
            r7.<init>(r6)
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16106o2(z);
        }
        m19204y();
    }

    public void setCheckedIconVisible(boolean z) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16020E1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16057S1(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16024F2(i);
        }
        m19184C();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C4983a aVar = this.f15817d;
        if (aVar != null) {
            aVar.mo16024F2(i);
        }
        m19184C();
    }
}
