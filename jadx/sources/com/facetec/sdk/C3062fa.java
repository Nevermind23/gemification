package com.facetec.sdk;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.facetec.sdk.fa */
public final class C3062fa<E> extends C3004eg<Object> {

    /* renamed from: d */
    public static final C3013eo f10223d = new C3013eo() {
        /* renamed from: c */
        public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
            Type b = fwVar.mo9332b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            Type c = C3033et.m12674c(b);
            return new C3062fa(dvVar, dvVar.mo9133b(C3142fw.m12893c(c)), C3033et.m12677d(c));
        }
    };

    /* renamed from: a */
    private final Class<E> f10224a;

    /* renamed from: c */
    private final C3004eg<E> f10225c;

    public C3062fa(C2972dv dvVar, C3004eg<E> egVar, Class<E> cls) {
        this.f10225c = new C3095fo(dvVar, egVar, cls);
        this.f10224a = cls;
    }

    /* renamed from: b */
    public final void mo8991b(C3160gb gbVar, Object obj) {
        if (obj == null) {
            gbVar.mo9318f();
            return;
        }
        gbVar.mo9312d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f10225c.mo8991b(gbVar, Array.get(obj, i));
        }
        gbVar.mo9306a();
    }

    /* renamed from: d */
    public final Object mo8992d(C3143fx fxVar) {
        if (fxVar.mo9292f() == C3141fv.NULL) {
            fxVar.mo9298l();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        fxVar.mo9286b();
        while (fxVar.mo9291e()) {
            arrayList.add(this.f10225c.mo8992d(fxVar));
        }
        fxVar.mo9284a();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f10224a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }
}
