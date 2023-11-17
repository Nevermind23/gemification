package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.C1290a0;
import androidx.core.widget.C1333z;
import p030c.C2210a;
import p045d.C5769a;

/* renamed from: androidx.appcompat.widget.r */
public class C0481r extends RadioButton implements C1333z, C1290a0 {

    /* renamed from: d */
    private final C0434h f2204d;

    /* renamed from: e */
    private final C0414d f2205e;

    /* renamed from: f */
    private final C0400b0 f2206f;

    /* renamed from: g */
    private C0461l f2207g;

    public C0481r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6436G);
    }

    private C0461l getEmojiTextViewHelper() {
        if (this.f2207g == null) {
            this.f2207g = new C0461l(this);
        }
        return this.f2207g;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0414d dVar = this.f2205e;
        if (dVar != null) {
            dVar.mo2019b();
        }
        C0400b0 b0Var = this.f2206f;
        if (b0Var != null) {
            b0Var.mo1929b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0434h hVar = this.f2204d;
        if (hVar != null) {
            return hVar.mo2104b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0414d dVar = this.f2205e;
        if (dVar != null) {
            return dVar.mo2020c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0414d dVar = this.f2205e;
        if (dVar != null) {
            return dVar.mo2021d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0434h hVar = this.f2204d;
        if (hVar != null) {
            return hVar.mo2105c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0434h hVar = this.f2204d;
        if (hVar != null) {
            return hVar.mo2106d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2206f.mo1936j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2206f.mo1937k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2191d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0414d dVar = this.f2205e;
        if (dVar != null) {
            dVar.mo2023f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0414d dVar = this.f2205e;
        if (dVar != null) {
            dVar.mo2024g(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0434h hVar = this.f2204d;
        if (hVar != null) {
            hVar.mo2108f();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.f2206f;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.f2206f;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2192e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2188a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0414d dVar = this.f2205e;
        if (dVar != null) {
            dVar.mo2026i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0414d dVar = this.f2205e;
        if (dVar != null) {
            dVar.mo2027j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0434h hVar = this.f2204d;
        if (hVar != null) {
            hVar.mo2109g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0434h hVar = this.f2204d;
        if (hVar != null) {
            hVar.mo2110h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2206f.mo1949w(colorStateList);
        this.f2206f.mo1929b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2206f.mo1950x(mode);
        this.f2206f.mo1929b();
    }

    public C0481r(Context context, AttributeSet attributeSet, int i) {
        super(C0473o1.m1931b(context), attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0434h hVar = new C0434h(this);
        this.f2204d = hVar;
        hVar.mo2107e(attributeSet, i);
        C0414d dVar = new C0414d(this);
        this.f2205e = dVar;
        dVar.mo2022e(attributeSet, i);
        C0400b0 b0Var = new C0400b0(this);
        this.f2206f = b0Var;
        b0Var.mo1939m(attributeSet, i);
        getEmojiTextViewHelper().mo2190c(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C5769a.m23210b(getContext(), i));
    }
}
