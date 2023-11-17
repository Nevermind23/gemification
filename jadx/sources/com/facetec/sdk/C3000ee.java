package com.facetec.sdk;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.facetec.sdk.ee */
public abstract class C3000ee {
    /* renamed from: a */
    public double mo9143a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public String mo9144b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public int mo9146c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public Number mo9147d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public long mo9148e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public final boolean mo9179f() {
        return this instanceof C3008ej;
    }

    /* renamed from: g */
    public final boolean mo9180g() {
        return this instanceof C2982dz;
    }

    /* renamed from: h */
    public final boolean mo9181h() {
        return this instanceof C2999ed;
    }

    /* renamed from: i */
    public boolean mo9152i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: j */
    public final boolean mo9182j() {
        return this instanceof C2996ea;
    }

    /* renamed from: o */
    public final C3008ej mo9183o() {
        if (mo9179f()) {
            return (C3008ej) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(this)));
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C3160gb gbVar = new C3160gb(stringWriter);
            gbVar.mo9355a(true);
            C3065fc.m12714c(this, gbVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
