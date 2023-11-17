package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C1008h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.n */
public final class C1405n extends SpannableStringBuilder {

    /* renamed from: d */
    private final Class f4012d;

    /* renamed from: e */
    private final List f4013e = new ArrayList();

    /* renamed from: androidx.emoji2.text.n$a */
    private static class C1406a implements TextWatcher, SpanWatcher {

        /* renamed from: d */
        final Object f4014d;

        /* renamed from: e */
        private final AtomicInteger f4015e = new AtomicInteger(0);

        C1406a(Object obj) {
            this.f4014d = obj;
        }

        /* renamed from: b */
        private boolean m4840b(Object obj) {
            return obj instanceof C1394i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4071a() {
            this.f4015e.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f4014d).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f4014d).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo4074c() {
            this.f4015e.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f4015e.get() <= 0 || !m4840b(obj)) {
                ((SpanWatcher) this.f4014d).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f4015e.get() <= 0 || !m4840b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i6 = i;
                        i5 = 0;
                        ((SpanWatcher) this.f4014d).onSpanChanged(spannable, obj, i6, i2, i5, i4);
                    }
                }
                i6 = i;
                i5 = i3;
                ((SpanWatcher) this.f4014d).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f4015e.get() <= 0 || !m4840b(obj)) {
                ((SpanWatcher) this.f4014d).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f4014d).onTextChanged(charSequence, i, i2, i3);
        }
    }

    C1405n(Class cls, CharSequence charSequence) {
        super(charSequence);
        C1008h.m3531h(cls, "watcherClass cannot be null");
        this.f4012d = cls;
    }

    /* renamed from: b */
    private void m4831b() {
        for (int i = 0; i < this.f4013e.size(); i++) {
            ((C1406a) this.f4013e.get(i)).mo4071a();
        }
    }

    /* renamed from: c */
    public static C1405n m4832c(Class cls, CharSequence charSequence) {
        return new C1405n(cls, charSequence);
    }

    /* renamed from: e */
    private void m4833e() {
        for (int i = 0; i < this.f4013e.size(); i++) {
            ((C1406a) this.f4013e.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    private C1406a m4834f(Object obj) {
        for (int i = 0; i < this.f4013e.size(); i++) {
            C1406a aVar = (C1406a) this.f4013e.get(i);
            if (aVar.f4014d == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m4835g(Class cls) {
        return this.f4012d == cls;
    }

    /* renamed from: h */
    private boolean m4836h(Object obj) {
        return obj != null && m4835g(obj.getClass());
    }

    /* renamed from: i */
    private void m4837i() {
        for (int i = 0; i < this.f4013e.size(); i++) {
            ((C1406a) this.f4013e.get(i)).mo4074c();
        }
    }

    /* renamed from: a */
    public void mo4052a() {
        m4831b();
    }

    /* renamed from: d */
    public void mo4057d() {
        m4837i();
        m4833e();
    }

    public int getSpanEnd(Object obj) {
        C1406a f;
        if (m4836h(obj) && (f = m4834f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C1406a f;
        if (m4836h(obj) && (f = m4834f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C1406a f;
        if (m4836h(obj) && (f = m4834f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    public Object[] getSpans(int i, int i2, Class cls) {
        if (!m4835g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C1406a[] aVarArr = (C1406a[]) super.getSpans(i, i2, C1406a.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            objArr[i3] = aVarArr[i3].f4014d;
        }
        return objArr;
    }

    public int nextSpanTransition(int i, int i2, Class<C1406a> cls) {
        if (cls == null || m4835g(cls)) {
            cls = C1406a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C1406a aVar;
        if (m4836h(obj)) {
            aVar = m4834f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f4013e.remove(aVar);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m4836h(obj)) {
            C1406a aVar = new C1406a(obj);
            this.f4013e.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return new C1405n(this.f4012d, this, i, i2);
    }

    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m4831b();
        super.replace(i, i2, charSequence);
        m4837i();
        return this;
    }

    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    C1405n(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C1008h.m3531h(cls, "watcherClass cannot be null");
        this.f4012d = cls;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m4831b();
        super.replace(i, i2, charSequence, i3, i4);
        m4837i();
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
