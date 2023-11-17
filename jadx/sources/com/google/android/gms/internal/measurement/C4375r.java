package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
public final class C4375r implements C4358q {

    /* renamed from: d */
    private final String f13622d;

    /* renamed from: e */
    private final ArrayList f13623e;

    public C4375r(String str, List list) {
        this.f13622d = str;
        ArrayList arrayList = new ArrayList();
        this.f13623e = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo13510a() {
        return this.f13622d;
    }

    /* renamed from: b */
    public final C4358q mo13077b() {
        return this;
    }

    /* renamed from: c */
    public final String mo13078c() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    /* renamed from: d */
    public final ArrayList mo13511d() {
        return this.f13623e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4375r)) {
            return false;
        }
        C4375r rVar = (C4375r) obj;
        String str = this.f13622d;
        if (str == null ? rVar.f13622d == null : str.equals(rVar.f13622d)) {
            return this.f13623e.equals(rVar.f13623e);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f13622d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f13623e.hashCode();
    }

    /* renamed from: u */
    public final Double mo13091u() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* renamed from: v */
    public final Boolean mo13092v() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: w */
    public final Iterator mo13093w() {
        return null;
    }

    /* renamed from: x */
    public final C4358q mo13094x(String str, C4363q4 q4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
