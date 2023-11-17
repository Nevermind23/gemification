package com.google.gson;

import com.google.gson.internal.C5595l;
import java.io.IOException;
import java.io.StringWriter;
import p328ya.C9146c;

/* renamed from: com.google.gson.h */
public abstract class C5494h {
    /* renamed from: b */
    public boolean mo18206b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public C5491e mo18215c() {
        if (mo18218l()) {
            return (C5491e) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: g */
    public C5610j mo18216g() {
        if (mo18220o()) {
            return (C5610j) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: i */
    public C5612l mo18217i() {
        if (mo18221r()) {
            return (C5612l) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: j */
    public long mo18210j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: k */
    public String mo18211k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: l */
    public boolean mo18218l() {
        return this instanceof C5491e;
    }

    /* renamed from: n */
    public boolean mo18219n() {
        return this instanceof C5495i;
    }

    /* renamed from: o */
    public boolean mo18220o() {
        return this instanceof C5610j;
    }

    /* renamed from: r */
    public boolean mo18221r() {
        return this instanceof C5612l;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C9146c cVar = new C9146c(stringWriter);
            cVar.mo24718m0(true);
            C5595l.m22246b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
