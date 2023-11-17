package com.facetec.sdk;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: com.facetec.sdk.u9 */
public final /* synthetic */ class C3614u9 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C2879cb f11585a;

    /* renamed from: b */
    public final /* synthetic */ EditText f11586b;

    public /* synthetic */ C3614u9(C2879cb cbVar, EditText editText) {
        this.f11585a = cbVar;
        this.f11586b = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.f11585a.m11710a(this.f11586b, textView, i, keyEvent);
    }
}
