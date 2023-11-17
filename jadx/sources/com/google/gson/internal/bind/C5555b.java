package com.google.gson.internal.bind;

import com.google.gson.C5491e;
import com.google.gson.C5494h;
import com.google.gson.C5495i;
import com.google.gson.C5610j;
import com.google.gson.C5612l;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p328ya.C9146c;

/* renamed from: com.google.gson.internal.bind.b */
public final class C5555b extends C9146c {

    /* renamed from: s */
    private static final Writer f17727s = new C5556a();

    /* renamed from: t */
    private static final C5612l f17728t = new C5612l("closed");

    /* renamed from: p */
    private final List f17729p = new ArrayList();

    /* renamed from: q */
    private String f17730q;

    /* renamed from: r */
    private C5494h f17731r = C5495i.f17561d;

    /* renamed from: com.google.gson.internal.bind.b$a */
    class C5556a extends Writer {
        C5556a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C5555b() {
        super(f17727s);
    }

    /* renamed from: M0 */
    private C5494h m22174M0() {
        List list = this.f17729p;
        return (C5494h) list.get(list.size() - 1);
    }

    /* renamed from: O0 */
    private void m22175O0(C5494h hVar) {
        if (this.f17730q != null) {
            if (!hVar.mo18219n() || mo24720t()) {
                ((C5610j) m22174M0()).mo18448v(this.f17730q, hVar);
            }
            this.f17730q = null;
        } else if (this.f17729p.isEmpty()) {
            this.f17731r = hVar;
        } else {
            C5494h M0 = m22174M0();
            if (M0 instanceof C5491e) {
                ((C5491e) M0).mo18213v(hVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: F0 */
    public C9146c mo18356F0(String str) {
        if (str == null) {
            return mo18359Q();
        }
        m22175O0(new C5612l(str));
        return this;
    }

    /* renamed from: G0 */
    public C9146c mo18357G0(boolean z) {
        m22175O0(new C5612l(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: K0 */
    public C5494h mo18358K0() {
        if (this.f17729p.isEmpty()) {
            return this.f17731r;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f17729p);
    }

    /* renamed from: Q */
    public C9146c mo18359Q() {
        m22175O0(C5495i.f17561d);
        return this;
    }

    public void close() {
        if (this.f17729p.isEmpty()) {
            this.f17729p.add(f17728t);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
    }

    /* renamed from: n */
    public C9146c mo18362n() {
        C5491e eVar = new C5491e();
        m22175O0(eVar);
        this.f17729p.add(eVar);
        return this;
    }

    /* renamed from: o */
    public C9146c mo18363o() {
        C5610j jVar = new C5610j();
        m22175O0(jVar);
        this.f17729p.add(jVar);
        return this;
    }

    /* renamed from: p0 */
    public C9146c mo18364p0(double d) {
        if (mo24722v() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m22175O0(new C5612l((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    /* renamed from: q */
    public C9146c mo18365q() {
        if (this.f17729p.isEmpty() || this.f17730q != null) {
            throw new IllegalStateException();
        } else if (m22174M0() instanceof C5491e) {
            List list = this.f17729p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: q0 */
    public C9146c mo18366q0(long j) {
        m22175O0(new C5612l((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: s */
    public C9146c mo18367s() {
        if (this.f17729p.isEmpty() || this.f17730q != null) {
            throw new IllegalStateException();
        } else if (m22174M0() instanceof C5610j) {
            List list = this.f17729p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: s0 */
    public C9146c mo18368s0(Boolean bool) {
        if (bool == null) {
            return mo18359Q();
        }
        m22175O0(new C5612l(bool));
        return this;
    }

    /* renamed from: x */
    public C9146c mo18369x(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f17729p.isEmpty() || this.f17730q != null) {
            throw new IllegalStateException();
        } else if (m22174M0() instanceof C5610j) {
            this.f17730q = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: x0 */
    public C9146c mo18370x0(Number number) {
        if (number == null) {
            return mo18359Q();
        }
        if (!mo24722v()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m22175O0(new C5612l(number));
        return this;
    }
}
