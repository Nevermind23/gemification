package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.PrecomputedTextCompat;
import p342j$.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.r */
class C1410r implements Spannable {

    /* renamed from: d */
    private boolean f4017d = false;

    /* renamed from: e */
    private Spannable f4018e;

    /* renamed from: androidx.emoji2.text.r$a */
    private static class C1411a {
        /* renamed from: a */
        static IntStream m4849a(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.chars());
        }

        /* renamed from: b */
        static IntStream m4850b(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        }
    }

    /* renamed from: androidx.emoji2.text.r$b */
    static class C1412b {
        C1412b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4094a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    /* renamed from: androidx.emoji2.text.r$c */
    static class C1413c extends C1412b {
        C1413c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4094a(CharSequence charSequence) {
            return C1414s.m4853a(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    C1410r(Spannable spannable) {
        this.f4018e = spannable;
    }

    /* renamed from: a */
    private void m4846a() {
        Spannable spannable = this.f4018e;
        if (!this.f4017d && m4847c().mo4094a(spannable)) {
            this.f4018e = new SpannableString(spannable);
        }
        this.f4017d = true;
    }

    /* renamed from: c */
    static C1412b m4847c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new C1412b();
        }
        return new C1413c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Spannable mo4080b() {
        return this.f4018e;
    }

    public char charAt(int i) {
        return this.f4018e.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f4018e.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f4018e.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f4018e.getSpanStart(obj);
    }

    public Object[] getSpans(int i, int i2, Class cls) {
        return this.f4018e.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f4018e.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f4018e.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        m4846a();
        this.f4018e.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        m4846a();
        this.f4018e.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f4018e.subSequence(i, i2);
    }

    public String toString() {
        return this.f4018e.toString();
    }

    public IntStream chars() {
        return C1411a.m4849a(this.f4018e);
    }

    public IntStream codePoints() {
        return C1411a.m4850b(this.f4018e);
    }

    C1410r(CharSequence charSequence) {
        this.f4018e = new SpannableString(charSequence);
    }
}
