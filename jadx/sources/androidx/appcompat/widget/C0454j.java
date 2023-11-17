package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C1123c1;
import androidx.core.view.C1127d;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1290a0;
import androidx.core.widget.C1314o;
import androidx.core.widget.C1331y;
import p030c.C2210a;
import p305x.C8911d;
import p305x.C8915g;

/* renamed from: androidx.appcompat.widget.j */
public class C0454j extends EditText implements C1123c1, C1290a0 {
    private final C0458k mAppCompatEmojiEditTextHelper;
    private final C0414d mBackgroundTintHelper;
    private final C1331y mDefaultOnReceiveContentListener;
    private C0455a mSuperCaller;
    private final C0394a0 mTextClassifierHelper;
    private final C0400b0 mTextHelper;

    /* renamed from: androidx.appcompat.widget.j$a */
    class C0455a {
        C0455a() {
        }

        /* renamed from: a */
        public TextClassifier mo2173a() {
            return C0454j.super.getTextClassifier();
        }

        /* renamed from: b */
        public void mo2174b(TextClassifier textClassifier) {
            C0454j.super.setTextClassifier(textClassifier);
        }
    }

    public C0454j(Context context) {
        this(context, (AttributeSet) null);
    }

    private C0455a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C0455a();
        }
        return this.mSuperCaller;
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

    public TextClassifier getTextClassifier() {
        C0394a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.mTextClassifierHelper) == null) {
            return getSuperCaller().mo2173a();
        }
        return a0Var.mo1915a();
    }

    /* access modifiers changed from: package-private */
    public void initEmojiKeyListener(C0458k kVar) {
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

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.mo2184c();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] E;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.mo1944r(this, onCreateInputConnection, editorInfo);
        InputConnection a = C0464m.m1850a(onCreateInputConnection, editorInfo, this);
        if (!(a == null || Build.VERSION.SDK_INT > 30 || (E = ViewCompat.m3547E(this)) == null)) {
            C8911d.m33105d(editorInfo, E);
            a = C8915g.m33115c(this, a, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.mo2186e(a, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0492u.m1976a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public C1127d onReceiveContent(C1127d dVar) {
        return this.mDefaultOnReceiveContentListener.mo3674a(this, dVar);
    }

    public boolean onTextContextMenuItem(int i) {
        if (C0492u.m1977b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1314o.m4578t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.mo2187f(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.mo2182a(keyListener));
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
            getSuperCaller().mo2174b(textClassifier);
        } else {
            a0Var.mo1916b(textClassifier);
        }
    }

    public C0454j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6430A);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public C0454j(Context context, AttributeSet attributeSet, int i) {
        super(C0473o1.m1931b(context), attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0414d dVar = new C0414d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo2022e(attributeSet, i);
        C0400b0 b0Var = new C0400b0(this);
        this.mTextHelper = b0Var;
        b0Var.mo1939m(attributeSet, i);
        b0Var.mo1929b();
        this.mTextClassifierHelper = new C0394a0(this);
        this.mDefaultOnReceiveContentListener = new C1331y();
        C0458k kVar = new C0458k(this);
        this.mAppCompatEmojiEditTextHelper = kVar;
        kVar.mo2185d(attributeSet, i);
        initEmojiKeyListener(kVar);
    }
}
