package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p030c.C2219j;
import p072f0.C6132a;

/* renamed from: androidx.appcompat.widget.k */
class C0458k {

    /* renamed from: a */
    private final EditText f2145a;

    /* renamed from: b */
    private final C6132a f2146b;

    C0458k(EditText editText) {
        this.f2145a = editText;
        this.f2146b = new C6132a(editText, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public KeyListener mo2182a(KeyListener keyListener) {
        if (mo2183b(keyListener)) {
            return this.f2146b.mo19689a(keyListener);
        }
        return keyListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2183b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2184c() {
        return this.f2146b.mo19690b();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2185d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2145a.getContext().obtainStyledAttributes(attributeSet, C2219j.f6781g0, i, 0);
        try {
            int i2 = C2219j.f6851u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo2187f(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public InputConnection mo2186e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f2146b.mo19691c(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2187f(boolean z) {
        this.f2146b.mo19692d(z);
    }
}
