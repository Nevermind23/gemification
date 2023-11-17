package com.facetec.sdk;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facetec.sdk.fi */
public final class C3080fi extends C3160gb {

    /* renamed from: a */
    private static final C3008ej f10245a = new C3008ej("closed");

    /* renamed from: d */
    private static final Writer f10246d = new Writer() {
        public final void close() {
            throw new AssertionError();
        }

        public final void flush() {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: b */
    private String f10247b;

    /* renamed from: c */
    private C3000ee f10248c = C2996ea.f10129b;

    /* renamed from: e */
    private final List<C3000ee> f10249e = new ArrayList();

    public C3080fi() {
        super(f10246d);
    }

    /* renamed from: c */
    private void m12752c(C3000ee eeVar) {
        if (this.f10247b != null) {
            if (!eeVar.mo9182j() || mo9359h()) {
                ((C2999ed) m12753g()).mo9173c(this.f10247b, eeVar);
            }
            this.f10247b = null;
        } else if (this.f10249e.isEmpty()) {
            this.f10248c = eeVar;
        } else {
            C3000ee g = m12753g();
            if (g instanceof C2982dz) {
                ((C2982dz) g).mo9149e(eeVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: g */
    private C3000ee m12753g() {
        List<C3000ee> list = this.f10249e;
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    public final C3160gb mo9306a() {
        if (this.f10249e.isEmpty() || this.f10247b != null) {
            throw new IllegalStateException();
        } else if (m12753g() instanceof C2982dz) {
            List<C3000ee> list = this.f10249e;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public final C3000ee mo9309b() {
        if (this.f10249e.isEmpty()) {
            return this.f10248c;
        }
        StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
        sb.append(this.f10249e);
        throw new IllegalStateException(sb.toString());
    }

    public final void close() {
        if (this.f10249e.isEmpty()) {
            this.f10249e.add(f10245a);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final C3160gb mo9312d() {
        C2982dz dzVar = new C2982dz();
        m12752c(dzVar);
        this.f10249e.add(dzVar);
        return this;
    }

    /* renamed from: e */
    public final C3160gb mo9316e() {
        C2999ed edVar = new C2999ed();
        m12752c(edVar);
        this.f10249e.add(edVar);
        return this;
    }

    /* renamed from: f */
    public final C3160gb mo9318f() {
        m12752c(C2996ea.f10129b);
        return this;
    }

    public final void flush() {
    }

    /* renamed from: d */
    public final C3160gb mo9315d(String str) {
        if (str == null) {
            return mo9318f();
        }
        m12752c(new C3008ej(str));
        return this;
    }

    /* renamed from: e */
    public final C3160gb mo9317e(boolean z) {
        m12752c(new C3008ej(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: d */
    public final C3160gb mo9314d(Boolean bool) {
        if (bool == null) {
            return mo9318f();
        }
        m12752c(new C3008ej(bool));
        return this;
    }

    /* renamed from: a */
    public final C3160gb mo9308a(String str) {
        if (this.f10249e.isEmpty() || this.f10247b != null) {
            throw new IllegalStateException();
        } else if (m12753g() instanceof C2999ed) {
            this.f10247b = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public final C3160gb mo9313d(long j) {
        m12752c(new C3008ej((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: c */
    public final C3160gb mo9310c() {
        if (this.f10249e.isEmpty() || this.f10247b != null) {
            throw new IllegalStateException();
        } else if (m12753g() instanceof C2999ed) {
            List<C3000ee> list = this.f10249e;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final C3160gb mo9307a(Number number) {
        if (number == null) {
            return mo9318f();
        }
        if (!mo9360i()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        m12752c(new C3008ej(number));
        return this;
    }
}
