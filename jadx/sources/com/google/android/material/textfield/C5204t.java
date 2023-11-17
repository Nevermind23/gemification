package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C1080c;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.t */
abstract class C5204t {

    /* renamed from: a */
    final TextInputLayout f16665a;

    /* renamed from: b */
    final C5199s f16666b;

    /* renamed from: c */
    final Context f16667c;

    /* renamed from: d */
    final CheckableImageButton f16668d;

    C5204t(C5199s sVar) {
        this.f16665a = sVar.f16637d;
        this.f16666b = sVar;
        this.f16667c = sVar.getContext();
        this.f16668d = sVar.mo17288p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17213a(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17300b(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17214c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo17215d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View.OnFocusChangeListener mo17216e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View.OnClickListener mo17217f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public View.OnFocusChangeListener mo17218g() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1080c.C1082b mo17236h() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo17237i(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo17238j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo17239k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo17240l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo17241m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo17219n(EditText editText) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo17242o(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo17243p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo17220q(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo17301r() {
        this.f16666b.mo17253I(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo17221s() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo17244t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo17222u() {
    }
}
