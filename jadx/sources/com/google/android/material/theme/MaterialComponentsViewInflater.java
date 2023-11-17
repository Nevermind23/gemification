package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0255w;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0410c;
import androidx.appcompat.widget.C0418e;
import androidx.appcompat.widget.C0481r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.C5209w;
import p171m8.C7141a;
import p236r8.C8069a;

public class MaterialComponentsViewInflater extends C0255w {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0410c mo712c(Context context, AttributeSet attributeSet) {
        return new C5209w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatButton mo713d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0418e mo714e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0481r mo720k(Context context, AttributeSet attributeSet) {
        return new C7141a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public AppCompatTextView mo724o(Context context, AttributeSet attributeSet) {
        return new C8069a(context, attributeSet);
    }
}
