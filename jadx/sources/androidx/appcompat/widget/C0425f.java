package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C1290a0;
import androidx.core.widget.C1314o;
import p030c.C2210a;
import p045d.C5769a;

/* renamed from: androidx.appcompat.widget.f */
public class C0425f extends CheckedTextView implements C1290a0 {

    /* renamed from: d */
    private final C0428g f2079d;

    /* renamed from: e */
    private final C0414d f2080e;

    /* renamed from: f */
    private final C0400b0 f2081f;

    /* renamed from: g */
    private C0461l f2082g;

    public C0425f(Context context) {
        this(context, (AttributeSet) null);
    }

    private C0461l getEmojiTextViewHelper() {
        if (this.f2082g == null) {
            this.f2082g = new C0461l(this);
        }
        return this.f2082g;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0400b0 b0Var = this.f2081f;
        if (b0Var != null) {
            b0Var.mo1929b();
        }
        C0414d dVar = this.f2080e;
        if (dVar != null) {
            dVar.mo2019b();
        }
        C0428g gVar = this.f2079d;
        if (gVar != null) {
            gVar.mo2089a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1314o.m4577s(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0414d dVar = this.f2080e;
        if (dVar != null) {
            return dVar.mo2020c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0414d dVar = this.f2080e;
        if (dVar != null) {
            return dVar.mo2021d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0428g gVar = this.f2079d;
        if (gVar != null) {
            return gVar.mo2090b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0428g gVar = this.f2079d;
        if (gVar != null) {
            return gVar.mo2091c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2081f.mo1936j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2081f.mo1937k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0464m.m1850a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2191d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0414d dVar = this.f2080e;
        if (dVar != null) {
            dVar.mo2023f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0414d dVar = this.f2080e;
        if (dVar != null) {
            dVar.mo2024g(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0428g gVar = this.f2079d;
        if (gVar != null) {
            gVar.mo2093e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.f2081f;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.f2081f;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0414d dVar = this.f2080e;
        if (dVar != null) {
            dVar.mo2026i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0414d dVar = this.f2080e;
        if (dVar != null) {
            dVar.mo2027j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0428g gVar = this.f2079d;
        if (gVar != null) {
            gVar.mo2094f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0428g gVar = this.f2079d;
        if (gVar != null) {
            gVar.mo2095g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2081f.mo1949w(colorStateList);
        this.f2081f.mo1929b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2081f.mo1950x(mode);
        this.f2081f.mo1929b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0400b0 b0Var = this.f2081f;
        if (b0Var != null) {
            b0Var.mo1943q(context, i);
        }
    }

    public C0425f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6460p);
    }

    public C0425f(Context context, AttributeSet attributeSet, int i) {
        super(C0473o1.m1931b(context), attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0400b0 b0Var = new C0400b0(this);
        this.f2081f = b0Var;
        b0Var.mo1939m(attributeSet, i);
        b0Var.mo1929b();
        C0414d dVar = new C0414d(this);
        this.f2080e = dVar;
        dVar.mo2022e(attributeSet, i);
        C0428g gVar = new C0428g(this);
        this.f2079d = gVar;
        gVar.mo2092d(attributeSet, i);
        getEmojiTextViewHelper().mo2190c(attributeSet, i);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C5769a.m23210b(getContext(), i));
    }
}
