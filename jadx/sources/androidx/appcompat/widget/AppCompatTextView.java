package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p013v4.media.session.C0125b;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.C0860g;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.widget.C1290a0;
import androidx.core.widget.C1291b;
import androidx.core.widget.C1314o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p045d.C5769a;

public class AppCompatTextView extends TextView implements C1290a0, C1291b {
    private final C0414d mBackgroundTintHelper;
    private C0461l mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;
    private C0356a mSuperCaller;
    private final C0394a0 mTextClassifierHelper;
    private final C0400b0 mTextHelper;

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$a */
    private interface C0356a {
        /* renamed from: a */
        void mo1571a(int[] iArr, int i);

        /* renamed from: b */
        void mo1572b(int i);

        /* renamed from: c */
        int mo1573c();

        /* renamed from: d */
        int mo1574d();

        /* renamed from: e */
        int[] mo1575e();

        /* renamed from: f */
        TextClassifier mo1576f();

        /* renamed from: g */
        int mo1577g();

        /* renamed from: h */
        void mo1578h(TextClassifier textClassifier);

        /* renamed from: i */
        void mo1579i(int i);

        /* renamed from: j */
        int mo1580j();

        void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

        void setAutoSizeTextTypeWithDefaults(int i);
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$b */
    class C0357b implements C0356a {
        C0357b() {
        }

        /* renamed from: a */
        public void mo1571a(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: b */
        public void mo1572b(int i) {
        }

        /* renamed from: c */
        public int mo1573c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        /* renamed from: d */
        public int mo1574d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        /* renamed from: e */
        public int[] mo1575e() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        /* renamed from: f */
        public TextClassifier mo1576f() {
            return AppCompatTextView.super.getTextClassifier();
        }

        /* renamed from: g */
        public int mo1577g() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        /* renamed from: h */
        public void mo1578h(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        /* renamed from: i */
        public void mo1579i(int i) {
        }

        /* renamed from: j */
        public int mo1580j() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public void setAutoSizeTextTypeWithDefaults(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$c */
    class C0358c extends C0357b {
        C0358c() {
            super();
        }

        /* renamed from: b */
        public void mo1572b(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        /* renamed from: i */
        public void mo1579i(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private void m1411d() {
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C0125b.m366a(future.get());
                C1314o.m4574p(this, (PrecomputedTextCompat) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C0461l getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C0461l(this);
        }
        return this.mEmojiTextViewHelper;
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
            return getSuperCaller().mo1577g();
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            return b0Var.mo1931e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0417d2.f2072b) {
            return getSuperCaller().mo1574d();
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            return b0Var.mo1932f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0417d2.f2072b) {
            return getSuperCaller().mo1580j();
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            return b0Var.mo1933g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0417d2.f2072b) {
            return getSuperCaller().mo1575e();
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
        } else if (getSuperCaller().mo1573c() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1314o.m4577s(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return C1314o.m4560b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C1314o.m4561c(this);
    }

    /* access modifiers changed from: package-private */
    public C0356a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.mSuperCaller = new C0358c();
            } else if (i >= 26) {
                this.mSuperCaller = new C0357b();
            }
        }
        return this.mSuperCaller;
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

    public CharSequence getText() {
        m1411d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0394a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.mTextClassifierHelper) == null) {
            return getSuperCaller().mo1576f();
        }
        return a0Var.mo1915a();
    }

    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return C1314o.m4565g(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().mo2189b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.mo1944r(this, onCreateInputConnection, editorInfo);
        return C0464m.m1850a(onCreateInputConnection, editorInfo, this);
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
    public void onMeasure(int i, int i2) {
        m1411d();
        super.onMeasure(i, i2);
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
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1946t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0417d2.f2072b) {
            getSuperCaller().mo1571a(iArr, i);
            return;
        }
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1947u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0417d2.f2072b) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i);
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

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1942p();
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

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1579i(i);
        } else {
            C1314o.m4571m(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1572b(i);
        } else {
            C1314o.m4572n(this, i);
        }
    }

    public void setLineHeight(int i) {
        C1314o.m4573o(this, i);
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        C1314o.m4574p(this, precomputedTextCompat);
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

    public void setTextClassifier(TextClassifier textClassifier) {
        C0394a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.mTextClassifierHelper) == null) {
            getSuperCaller().mo1578h(textClassifier);
        } else {
            a0Var.mo1916b(textClassifier);
        }
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat.Params params) {
        C1314o.m4576r(this, params);
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

    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (!this.mIsSetTypefaceProcessing) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else {
                typeface2 = C0860g.m3211a(getContext(), typeface, i);
            }
            this.mIsSetTypefaceProcessing = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0473o1.m1931b(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C0470n1.m1922a(this, getContext());
        C0414d dVar = new C0414d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo2022e(attributeSet, i);
        C0400b0 b0Var = new C0400b0(this);
        this.mTextHelper = b0Var;
        b0Var.mo1939m(attributeSet, i);
        b0Var.mo1929b();
        this.mTextClassifierHelper = new C0394a0(this);
        getEmojiTextViewHelper().mo2190c(attributeSet, i);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C5769a.m23210b(context, i) : null;
        Drawable b2 = i2 != 0 ? C5769a.m23210b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C5769a.m23210b(context, i3) : null;
        if (i4 != 0) {
            drawable = C5769a.m23210b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C5769a.m23210b(context, i) : null;
        Drawable b2 = i2 != 0 ? C5769a.m23210b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C5769a.m23210b(context, i3) : null;
        if (i4 != 0) {
            drawable = C5769a.m23210b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C0400b0 b0Var = this.mTextHelper;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }
}
