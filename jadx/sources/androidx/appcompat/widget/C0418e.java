package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.C1290a0;
import androidx.core.widget.C1333z;
import p030c.C2210a;
import p045d.C5769a;

/* renamed from: androidx.appcompat.widget.e */
public class C0418e extends CheckBox implements C1333z, C1290a0 {
    private C0461l mAppCompatEmojiTextHelper;
    private final C0414d mBackgroundTintHelper;
    private final C0434h mCompoundButtonHelper;
    private final C0400b0 mTextHelper;

    public C0418e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6459o);
    }

    private C0461l getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C0461l(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0414d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2019b();
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1929b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0434h hVar = this.mCompoundButtonHelper;
        if (hVar != null) {
            return hVar.mo2104b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0414d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo2020c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0414d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo2021d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0434h hVar = this.mCompoundButtonHelper;
        if (hVar != null) {
            return hVar.mo2105c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0434h hVar = this.mCompoundButtonHelper;
        if (hVar != null) {
            return hVar.mo2106d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.mo1936j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.mo1937k();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().mo2189b();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2191d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0414d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2023f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0414d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2024g(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0434h hVar = this.mCompoundButtonHelper;
        if (hVar != null) {
            hVar.mo2108f();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.mTextHelper;
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
        C0414d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2026i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0414d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo2027j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0434h hVar = this.mCompoundButtonHelper;
        if (hVar != null) {
            hVar.mo2109g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0434h hVar = this.mCompoundButtonHelper;
        if (hVar != null) {
            hVar.mo2110h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.mo1949w(colorStateList);
        this.mTextHelper.mo1929b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.mo1950x(mode);
        this.mTextHelper.mo1929b();
    }

    public C0418e(Context context, AttributeSet attributeSet, int i) {
        super(C0473o1.m1931b(context), attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0434h hVar = new C0434h(this);
        this.mCompoundButtonHelper = hVar;
        hVar.mo2107e(attributeSet, i);
        C0414d dVar = new C0414d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo2022e(attributeSet, i);
        C0400b0 b0Var = new C0400b0(this);
        this.mTextHelper = b0Var;
        b0Var.mo1939m(attributeSet, i);
        getEmojiTextViewHelper().mo2190c(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C5769a.m23210b(getContext(), i));
    }
}
