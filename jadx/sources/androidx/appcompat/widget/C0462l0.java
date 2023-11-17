package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.widget.C1290a0;

/* renamed from: androidx.appcompat.widget.l0 */
public class C0462l0 extends ToggleButton implements C1290a0 {

    /* renamed from: d */
    private final C0414d f2149d;

    /* renamed from: e */
    private final C0400b0 f2150e;

    /* renamed from: f */
    private C0461l f2151f;

    public C0462l0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    private C0461l getEmojiTextViewHelper() {
        if (this.f2151f == null) {
            this.f2151f = new C0461l(this);
        }
        return this.f2151f;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0414d dVar = this.f2149d;
        if (dVar != null) {
            dVar.mo2019b();
        }
        C0400b0 b0Var = this.f2150e;
        if (b0Var != null) {
            b0Var.mo1929b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0414d dVar = this.f2149d;
        if (dVar != null) {
            return dVar.mo2020c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0414d dVar = this.f2149d;
        if (dVar != null) {
            return dVar.mo2021d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2150e.mo1936j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2150e.mo1937k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2191d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0414d dVar = this.f2149d;
        if (dVar != null) {
            dVar.mo2023f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0414d dVar = this.f2149d;
        if (dVar != null) {
            dVar.mo2024g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.f2150e;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.f2150e;
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
        C0414d dVar = this.f2149d;
        if (dVar != null) {
            dVar.mo2026i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0414d dVar = this.f2149d;
        if (dVar != null) {
            dVar.mo2027j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2150e.mo1949w(colorStateList);
        this.f2150e.mo1929b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2150e.mo1950x(mode);
        this.f2150e.mo1929b();
    }

    public C0462l0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0414d dVar = new C0414d(this);
        this.f2149d = dVar;
        dVar.mo2022e(attributeSet, i);
        C0400b0 b0Var = new C0400b0(this);
        this.f2150e = b0Var;
        b0Var.mo1939m(attributeSet, i);
        getEmojiTextViewHelper().mo2190c(attributeSet, i);
    }
}
