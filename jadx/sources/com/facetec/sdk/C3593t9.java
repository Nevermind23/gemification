package com.facetec.sdk;

import android.view.View;
import android.widget.EditText;

/* renamed from: com.facetec.sdk.t9 */
public final /* synthetic */ class C3593t9 implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C2879cb f11543d;

    /* renamed from: e */
    public final /* synthetic */ EditText f11544e;

    public /* synthetic */ C3593t9(C2879cb cbVar, EditText editText) {
        this.f11543d = cbVar;
        this.f11544e = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f11543d.m11707a(this.f11544e, view, z);
    }
}
