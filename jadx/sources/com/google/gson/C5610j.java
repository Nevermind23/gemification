package com.google.gson;

import com.google.gson.internal.C5579g;
import java.util.Set;

/* renamed from: com.google.gson.j */
public final class C5610j extends C5494h {

    /* renamed from: d */
    private final C5579g f17801d = new C5579g(false);

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof C5610j) && ((C5610j) obj).f17801d.equals(this.f17801d))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f17801d.hashCode();
    }

    /* renamed from: v */
    public void mo18448v(String str, C5494h hVar) {
        C5579g gVar = this.f17801d;
        if (hVar == null) {
            hVar = C5495i.f17561d;
        }
        gVar.put(str, hVar);
    }

    /* renamed from: w */
    public Set mo18449w() {
        return this.f17801d.entrySet();
    }

    /* renamed from: x */
    public C5494h mo18450x(String str) {
        return (C5494h) this.f17801d.get(str);
    }

    /* renamed from: z */
    public boolean mo18451z(String str) {
        return this.f17801d.containsKey(str);
    }
}
