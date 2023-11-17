package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.z7 */
final class C4516z7 extends C4434u7 {

    /* renamed from: f */
    final transient Object f13850f;

    C4516z7(Object obj) {
        obj.getClass();
        this.f13850f = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo13419b(Object[] objArr, int i) {
        objArr[0] = this.f13850f;
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.f13850f.equals(obj);
    }

    public final int hashCode() {
        return this.f13850f.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new C4451v7(this.f13850f);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f13850f.toString();
        return "[" + obj + "]";
    }
}
