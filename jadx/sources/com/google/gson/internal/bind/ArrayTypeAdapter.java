package com.google.gson.internal.bind;

import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5498b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public final class ArrayTypeAdapter<E> extends TypeAdapter {

    /* renamed from: c */
    public static final C5624r f17582c = new C5624r() {
        /* renamed from: a */
        public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g = C5498b.m21917g(type);
            return new ArrayTypeAdapter(gson, gson.mo18175q(C8982a.get(g)), C5498b.m21921k(g));
        }
    };

    /* renamed from: a */
    private final Class f17583a;

    /* renamed from: b */
    private final TypeAdapter f17584b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f17584b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f17583a = cls;
    }

    /* renamed from: b */
    public Object mo18185b(C9143a aVar) {
        if (aVar.mo18348n0() == C9145b.NULL) {
            aVar.mo18344f0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo18340a();
        while (aVar.hasNext()) {
            arrayList.add(this.f17584b.mo18185b(aVar));
        }
        aVar.mo18349s();
        int size = arrayList.size();
        if (!this.f17583a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(this.f17583a, size));
        }
        Object newInstance = Array.newInstance(this.f17583a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: d */
    public void mo18186d(C9146c cVar, Object obj) {
        if (obj == null) {
            cVar.mo18359Q();
            return;
        }
        cVar.mo18362n();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f17584b.mo18186d(cVar, Array.get(obj, i));
        }
        cVar.mo18365q();
    }
}
