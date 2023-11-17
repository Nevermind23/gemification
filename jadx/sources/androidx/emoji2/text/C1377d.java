package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.C0853e;
import androidx.emoji2.text.C1378e;

/* renamed from: androidx.emoji2.text.d */
class C1377d implements C1378e.C1383d {

    /* renamed from: b */
    private static final ThreadLocal f3932b = new ThreadLocal();

    /* renamed from: a */
    private final TextPaint f3933a;

    C1377d() {
        TextPaint textPaint = new TextPaint();
        this.f3933a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    private static StringBuilder m4727b() {
        ThreadLocal threadLocal = f3932b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    /* renamed from: a */
    public boolean mo3987a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder b = m4727b();
        b.setLength(0);
        while (i < i2) {
            b.append(charSequence.charAt(i));
            i++;
        }
        return C0853e.m3192a(this.f3933a, b.toString());
    }
}
