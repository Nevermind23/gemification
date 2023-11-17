package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facetec.sdk.dz */
public final class C2982dz extends C3000ee implements Iterable<C3000ee> {

    /* renamed from: c */
    private final List<C3000ee> f10093c = new ArrayList();

    /* renamed from: a */
    public final double mo9143a() {
        if (this.f10093c.size() == 1) {
            return this.f10093c.get(0).mo9143a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final void mo9145b(String str) {
        this.f10093c.add(str == null ? C2996ea.f10129b : new C3008ej(str));
    }

    /* renamed from: c */
    public final int mo9146c() {
        if (this.f10093c.size() == 1) {
            return this.f10093c.get(0).mo9146c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final Number mo9147d() {
        if (this.f10093c.size() == 1) {
            return this.f10093c.get(0).mo9147d();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final void mo9149e(C3000ee eeVar) {
        if (eeVar == null) {
            eeVar = C2996ea.f10129b;
        }
        this.f10093c.add(eeVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C2982dz) && ((C2982dz) obj).f10093c.equals(this.f10093c);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10093c.hashCode();
    }

    /* renamed from: i */
    public final boolean mo9152i() {
        if (this.f10093c.size() == 1) {
            return this.f10093c.get(0).mo9152i();
        }
        throw new IllegalStateException();
    }

    public final Iterator<C3000ee> iterator() {
        return this.f10093c.iterator();
    }

    /* renamed from: b */
    public final String mo9144b() {
        if (this.f10093c.size() == 1) {
            return this.f10093c.get(0).mo9144b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final long mo9148e() {
        if (this.f10093c.size() == 1) {
            return this.f10093c.get(0).mo9148e();
        }
        throw new IllegalStateException();
    }
}
