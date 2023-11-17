package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C4205h implements C4358q {

    /* renamed from: d */
    private final C4358q f13265d;

    /* renamed from: e */
    private final String f13266e;

    public C4205h(String str) {
        this.f13265d = C4358q.f13593U2;
        this.f13266e = str;
    }

    /* renamed from: a */
    public final C4358q mo13199a() {
        return this.f13265d;
    }

    /* renamed from: b */
    public final C4358q mo13077b() {
        return new C4205h(this.f13266e, this.f13265d.mo13077b());
    }

    /* renamed from: c */
    public final String mo13078c() {
        throw new IllegalStateException("Control is not a String");
    }

    /* renamed from: d */
    public final String mo13200d() {
        return this.f13266e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4205h)) {
            return false;
        }
        C4205h hVar = (C4205h) obj;
        if (!this.f13266e.equals(hVar.f13266e) || !this.f13265d.equals(hVar.f13265d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f13266e.hashCode() * 31) + this.f13265d.hashCode();
    }

    /* renamed from: u */
    public final Double mo13091u() {
        throw new IllegalStateException("Control is not a double");
    }

    /* renamed from: v */
    public final Boolean mo13092v() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: w */
    public final Iterator mo13093w() {
        return null;
    }

    /* renamed from: x */
    public final C4358q mo13094x(String str, C4363q4 q4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C4205h(String str, C4358q qVar) {
        this.f13265d = qVar;
        this.f13266e = str;
    }
}
