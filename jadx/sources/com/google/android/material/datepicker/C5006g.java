package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C5089m;

/* renamed from: com.google.android.material.datepicker.g */
public abstract /* synthetic */ class C5006g {
    /* renamed from: a */
    public static /* synthetic */ void m19491a(EditText[] editTextArr, View view, boolean z) {
        int length = editTextArr.length;
        int i = 0;
        while (i < length) {
            if (!editTextArr[i].hasFocus()) {
                i++;
            } else {
                return;
            }
        }
        C5089m.m19904e(view);
    }

    /* renamed from: b */
    public static void m19492b(EditText... editTextArr) {
        if (editTextArr.length != 0) {
            C5005f fVar = new C5005f(editTextArr);
            for (EditText onFocusChangeListener : editTextArr) {
                onFocusChangeListener.setOnFocusChangeListener(fVar);
            }
            C5089m.m19908i(editTextArr[0]);
        }
    }
}
