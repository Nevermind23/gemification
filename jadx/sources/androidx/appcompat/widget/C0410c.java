package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.C1290a0;
import androidx.core.widget.C1314o;
import p030c.C2210a;
import p045d.C5769a;

/* renamed from: androidx.appcompat.widget.c */
public class C0410c extends AutoCompleteTextView implements C1290a0 {

    /* renamed from: g */
    private static final int[] f2059g = {16843126};

    /* renamed from: d */
    private final C0414d f2060d;

    /* renamed from: e */
    private final C0400b0 f2061e;

    /* renamed from: f */
    private final C0458k f2062f;

    public C0410c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6457m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1957a(C0458k kVar) {
        KeyListener keyListener = getKeyListener();
        if (kVar.mo2183b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = kVar.mo2182a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0414d dVar = this.f2060d;
        if (dVar != null) {
            dVar.mo2019b();
        }
        C0400b0 b0Var = this.f2061e;
        if (b0Var != null) {
            b0Var.mo1929b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1314o.m4577s(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0414d dVar = this.f2060d;
        if (dVar != null) {
            return dVar.mo2020c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0414d dVar = this.f2060d;
        if (dVar != null) {
            return dVar.mo2021d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2061e.mo1936j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2061e.mo1937k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f2062f.mo2186e(C0464m.m1850a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0414d dVar = this.f2060d;
        if (dVar != null) {
            dVar.mo2023f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0414d dVar = this.f2060d;
        if (dVar != null) {
            dVar.mo2024g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.f2061e;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0400b0 b0Var = this.f2061e;
        if (b0Var != null) {
            b0Var.mo1942p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1314o.m4578t(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C5769a.m23210b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f2062f.mo2187f(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2062f.mo2182a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0414d dVar = this.f2060d;
        if (dVar != null) {
            dVar.mo2026i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0414d dVar = this.f2060d;
        if (dVar != null) {
            dVar.mo2027j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2061e.mo1949w(colorStateList);
        this.f2061e.mo1929b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2061e.mo1950x(mode);
        this.f2061e.mo1929b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0400b0 b0Var = this.f2061e;
        if (b0Var != null) {
            b0Var.mo1943q(context, i);
        }
    }

    public C0410c(Context context, AttributeSet attributeSet, int i) {
        super(C0473o1.m1931b(context), attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0483r1 v = C0483r1.m1946v(getContext(), attributeSet, f2059g, i, 0);
        if (v.mo2332s(0)) {
            setDropDownBackgroundDrawable(v.mo2320g(0));
        }
        v.mo2333w();
        C0414d dVar = new C0414d(this);
        this.f2060d = dVar;
        dVar.mo2022e(attributeSet, i);
        C0400b0 b0Var = new C0400b0(this);
        this.f2061e = b0Var;
        b0Var.mo1939m(attributeSet, i);
        b0Var.mo1929b();
        C0458k kVar = new C0458k(this);
        this.f2062f = kVar;
        kVar.mo2185d(attributeSet, i);
        mo1957a(kVar);
    }
}
