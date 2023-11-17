package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p030c.C2219j;
import p072f0.C6142f;

/* renamed from: androidx.appcompat.widget.l */
class C0461l {

    /* renamed from: a */
    private final TextView f2147a;

    /* renamed from: b */
    private final C6142f f2148b;

    C0461l(TextView textView) {
        this.f2147a = textView;
        this.f2148b = new C6142f(textView, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public InputFilter[] mo2188a(InputFilter[] inputFilterArr) {
        return this.f2148b.mo19709a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo2189b() {
        return this.f2148b.mo19710b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2190c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2147a.getContext().obtainStyledAttributes(attributeSet, C2219j.f6781g0, i, 0);
        try {
            int i2 = C2219j.f6851u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo2192e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2191d(boolean z) {
        this.f2148b.mo19711c(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2192e(boolean z) {
        this.f2148b.mo19712d(z);
    }

    /* renamed from: f */
    public TransformationMethod mo2193f(TransformationMethod transformationMethod) {
        return this.f2148b.mo19713e(transformationMethod);
    }
}
