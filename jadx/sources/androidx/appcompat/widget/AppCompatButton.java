package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C1290a0;
import androidx.core.widget.C1291b;
import androidx.core.widget.C1314o;
import p030c.C2210a;

public class AppCompatButton extends Button implements C1291b, C1290a0 {
    private C0461l mAppCompatEmojiTextHelper;
    private final C0414d mBackgroundTintHelper;
    private final C0400b0 mTextHelper;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6458n);
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

    public int getAutoSizeMaxTextSize() {
        if (C0417d2.f2072b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            return b0Var.mo1931e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0417d2.f2072b) {
            return super.getAutoSizeMinTextSize();
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            return b0Var.mo1932f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0417d2.f2072b) {
            return super.getAutoSizeStepGranularity();
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            return b0Var.mo1933g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0417d2.f2072b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            return b0Var.mo1934h();
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0417d2.f2072b) {
            C0400b0 b0Var = this.mTextHelper;
            if (b0Var != null) {
                return b0Var.mo1935i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1314o.m4577s(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.mo1936j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.mo1937k();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().mo2189b();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1941o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var == null || C0417d2.f2072b || !b0Var.mo1938l()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.mTextHelper.mo1930c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2191d(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0417d2.f2072b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1946t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0417d2.f2072b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1947u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0417d2.f2072b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1948v(i);
        }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1314o.m4578t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2192e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2188a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1945s(z);
        }
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.mo1949w(colorStateList);
        this.mTextHelper.mo1929b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.mo1950x(mode);
        this.mTextHelper.mo1929b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1943q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0417d2.f2072b) {
            super.setTextSize(i, f);
            return;
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1928A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0473o1.m1931b(context), attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0414d dVar = new C0414d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo2022e(attributeSet, i);
        C0400b0 b0Var = new C0400b0(this);
        this.mTextHelper = b0Var;
        b0Var.mo1939m(attributeSet, i);
        b0Var.mo1929b();
        getEmojiTextViewHelper().mo2190c(attributeSet, i);
    }
}
