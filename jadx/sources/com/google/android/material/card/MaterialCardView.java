package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import p009a8.C0072b;
import p009a8.C0081k;
import p045d.C5769a;
import p223q8.C7926h;
import p223q8.C7929k;
import p223q8.C7945n;

public class MaterialCardView extends CardView implements Checkable, C7945n {

    /* renamed from: q */
    private static final int[] f15755q = {16842911};

    /* renamed from: r */
    private static final int[] f15756r = {16842912};

    /* renamed from: s */
    private static final int[] f15757s = {C0072b.f135S};

    /* renamed from: t */
    private static final int f15758t = C0081k.f371s;

    /* renamed from: m */
    private final C4975a f15759m;

    /* renamed from: n */
    private boolean f15760n;

    /* renamed from: o */
    private boolean f15761o;

    /* renamed from: p */
    private boolean f15762p;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C4974a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f127G);
    }

    /* renamed from: d */
    private void m19106d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f15759m.mo15809i();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f15759m.mo15810j().getBounds());
        return rectF;
    }

    /* renamed from: e */
    public boolean mo15737e() {
        C4975a aVar = this.f15759m;
        return aVar != null && aVar.mo15784D();
    }

    /* renamed from: f */
    public boolean mo15738f() {
        return this.f15762p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo15739g(int i, int i2, int i3, int i4) {
        super.mo2499b(i, i2, i3, i4);
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f15759m.mo15811k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f15759m.mo15812l();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f15759m.mo15813m();
    }

    public int getCheckedIconGravity() {
        return this.f15759m.mo15814n();
    }

    public int getCheckedIconMargin() {
        return this.f15759m.mo15815o();
    }

    public int getCheckedIconSize() {
        return this.f15759m.mo15816p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f15759m.mo15817q();
    }

    public int getContentPaddingBottom() {
        return this.f15759m.mo15782A().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f15759m.mo15782A().left;
    }

    public int getContentPaddingRight() {
        return this.f15759m.mo15782A().right;
    }

    public int getContentPaddingTop() {
        return this.f15759m.mo15782A().top;
    }

    public float getProgress() {
        return this.f15759m.mo15819u();
    }

    public float getRadius() {
        return this.f15759m.mo15818s();
    }

    public ColorStateList getRippleColor() {
        return this.f15759m.mo15820v();
    }

    public C7929k getShapeAppearanceModel() {
        return this.f15759m.mo15821w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f15759m.mo15822x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f15759m.mo15823y();
    }

    public int getStrokeWidth() {
        return this.f15759m.mo15824z();
    }

    public boolean isChecked() {
        return this.f15761o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7926h.m29971f(this, this.f15759m.mo15810j());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo15737e()) {
            View.mergeDrawableStates(onCreateDrawableState, f15755q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f15756r);
        }
        if (mo15738f()) {
            View.mergeDrawableStates(onCreateDrawableState, f15757s);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo15737e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f15759m.mo15786H(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f15760n) {
            if (!this.f15759m.mo15783C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f15759m.mo15787I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.f15759m.mo15788J(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f15759m.mo15806d0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f15759m.mo15789K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f15759m.mo15790L(z);
    }

    public void setChecked(boolean z) {
        if (this.f15761o != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f15759m.mo15792N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f15759m.mo15814n() != i) {
            this.f15759m.mo15793O(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f15759m.mo15794P(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f15759m.mo15794P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f15759m.mo15792N(C5769a.m23210b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f15759m.mo15795Q(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f15759m.mo15795Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f15759m.mo15796R(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C4975a aVar = this.f15759m;
        if (aVar != null) {
            aVar.mo15804b0();
        }
    }

    public void setDragged(boolean z) {
        if (this.f15762p != z) {
            this.f15762p = z;
            refreshDrawableState();
            m19106d();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f15759m.mo15807f0();
    }

    public void setOnCheckedChangeListener(C4974a aVar) {
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f15759m.mo15807f0();
        this.f15759m.mo15805c0();
    }

    public void setProgress(float f) {
        this.f15759m.mo15798T(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f15759m.mo15797S(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f15759m.mo15799U(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f15759m.mo15799U(C5769a.m23209a(getContext(), i));
    }

    public void setShapeAppearanceModel(C7929k kVar) {
        setClipToOutline(kVar.mo22987u(getBoundsAsRectF()));
        this.f15759m.mo15800V(kVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f15759m.mo15802X(i);
        invalidate();
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f15759m.mo15807f0();
        this.f15759m.mo15805c0();
    }

    public void toggle() {
        if (mo15737e() && isEnabled()) {
            this.f15761o = !this.f15761o;
            refreshDrawableState();
            m19106d();
            this.f15759m.mo15791M(this.f15761o);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f15758t
            android.content.Context r8 = p249s8.C8273a.m31120c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f15761o = r8
            r7.f15762p = r8
            r0 = 1
            r7.f15760n = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p009a8.C0082l.f717i4
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.C5088l.m19898i(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f15759m = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.mo15788J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.mo15803Y(r9, r10, r1, r2)
            r0.mo15785G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f15759m.mo15788J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f15759m.mo15801W(colorStateList);
        invalidate();
    }
}
