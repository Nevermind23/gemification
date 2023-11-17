package p072f0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C1378e;

/* renamed from: f0.h */
class C6148h implements TransformationMethod {

    /* renamed from: a */
    private final TransformationMethod f19113a;

    C6148h(TransformationMethod transformationMethod) {
        this.f19113a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod mo19726a() {
        return this.f19113a;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f19113a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C1378e.m4730b().mo3989d() != 1) {
            return charSequence;
        }
        return C1378e.m4730b().mo3994o(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f19113a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
