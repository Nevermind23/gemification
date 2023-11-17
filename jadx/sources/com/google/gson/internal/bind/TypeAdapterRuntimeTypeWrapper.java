package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9146c;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter {

    /* renamed from: a */
    private final Gson f17647a;

    /* renamed from: b */
    private final TypeAdapter f17648b;

    /* renamed from: c */
    private final Type f17649c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f17647a = gson;
        this.f17648b = typeAdapter;
        this.f17649c = type;
    }

    /* renamed from: e */
    private static Type m22014e(Type type, Object obj) {
        if (obj == null) {
            return type;
        }
        if ((type instanceof Class) || (type instanceof TypeVariable)) {
            return obj.getClass();
        }
        return type;
    }

    /* renamed from: f */
    private static boolean m22015f(TypeAdapter typeAdapter) {
        TypeAdapter e;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (e = ((SerializationDelegatingTypeAdapter) typeAdapter).mo18197e()) != typeAdapter) {
            typeAdapter = e;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    /* renamed from: b */
    public Object mo18185b(C9143a aVar) {
        return this.f17648b.mo18185b(aVar);
    }

    /* renamed from: d */
    public void mo18186d(C9146c cVar, Object obj) {
        TypeAdapter typeAdapter = this.f17648b;
        Type e = m22014e(this.f17649c, obj);
        if (e != this.f17649c) {
            typeAdapter = this.f17647a.mo18175q(C8982a.get(e));
            if ((typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !m22015f(this.f17648b)) {
                typeAdapter = this.f17648b;
            }
        }
        typeAdapter.mo18186d(cVar, obj);
    }
}
