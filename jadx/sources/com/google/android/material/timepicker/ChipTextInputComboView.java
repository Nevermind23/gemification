package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C5087k;
import com.google.android.material.internal.C5089m;
import com.google.android.material.textfield.TextInputLayout;
import p009a8.C0076f;
import p009a8.C0078h;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Chip f16711d;

    /* renamed from: e */
    private final TextInputLayout f16712e;

    /* renamed from: f */
    private final EditText f16713f;

    /* renamed from: g */
    private TextWatcher f16714g;

    /* renamed from: h */
    private TextView f16715h;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    private class C5216b extends C5087k {
        private C5216b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f16711d.setText(ChipTextInputComboView.this.m20611c("00"));
            } else {
                ChipTextInputComboView.this.f16711d.setText(ChipTextInputComboView.this.m20611c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m20611c(CharSequence charSequence) {
        return TimeModel.m20637a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m20612d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f16713f.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f16711d.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m20612d();
    }

    public void setChecked(boolean z) {
        int i;
        this.f16711d.setChecked(z);
        EditText editText = this.f16713f;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f16711d;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            C5089m.m19908i(this.f16713f);
            if (!TextUtils.isEmpty(this.f16713f.getText())) {
                EditText editText2 = this.f16713f;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f16711d.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f16711d.setTag(i, obj);
    }

    public void toggle() {
        this.f16711d.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C0078h.f301k, this, false);
        this.f16711d = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C0078h.f302l, this, false);
        this.f16712e = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f16713f = editText;
        editText.setVisibility(4);
        C5216b bVar = new C5216b();
        this.f16714g = bVar;
        editText.addTextChangedListener(bVar);
        m20612d();
        addView(chip);
        addView(textInputLayout);
        this.f16715h = (TextView) findViewById(C0076f.f278p);
        editText.setId(ViewCompat.m3604k());
        ViewCompat.m3548E0(this.f16715h, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
