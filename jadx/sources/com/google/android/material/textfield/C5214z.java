package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import p009a8.C0075e;
import p009a8.C0080j;

/* renamed from: com.google.android.material.textfield.z */
class C5214z extends C5204t {

    /* renamed from: e */
    private int f16708e = C0075e.f233a;

    /* renamed from: f */
    private EditText f16709f;

    /* renamed from: g */
    private final View.OnClickListener f16710g = new C5213y(this);

    C5214z(C5199s sVar, int i) {
        super(sVar);
        if (i != 0) {
            this.f16708e = i;
        }
    }

    /* renamed from: w */
    private boolean m20592w() {
        EditText editText = this.f16709f;
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    private static boolean m20593x(EditText editText) {
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m20594y(View view) {
        EditText editText = this.f16709f;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (m20592w()) {
                this.f16709f.setTransformationMethod((TransformationMethod) null);
            } else {
                this.f16709f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                this.f16709f.setSelection(selectionEnd);
            }
            mo17301r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17300b(CharSequence charSequence, int i, int i2, int i3) {
        mo17301r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17214c() {
        return C0080j.f327M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo17215d() {
        return this.f16708e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View.OnClickListener mo17217f() {
        return this.f16710g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo17240l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo17241m() {
        return !m20592w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo17219n(EditText editText) {
        this.f16709f = editText;
        mo17301r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo17221s() {
        if (m20593x(this.f16709f)) {
            this.f16709f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo17222u() {
        EditText editText = this.f16709f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
