package com.google.gson.internal.bind;

import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5498b;
import com.google.gson.internal.C5557c;
import com.google.gson.internal.C5587h;
import java.lang.reflect.Type;
import java.util.Collection;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public final class CollectionTypeAdapterFactory implements C5624r {

    /* renamed from: d */
    private final C5557c f17585d;

    private static final class Adapter<E> extends TypeAdapter {

        /* renamed from: a */
        private final TypeAdapter f17586a;

        /* renamed from: b */
        private final C5587h f17587b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, C5587h hVar) {
            this.f17586a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f17587b = hVar;
        }

        /* renamed from: e */
        public Collection mo18185b(C9143a aVar) {
            if (aVar.mo18348n0() == C9145b.NULL) {
                aVar.mo18344f0();
                return null;
            }
            Collection collection = (Collection) this.f17587b.mo18376a();
            aVar.mo18340a();
            while (aVar.hasNext()) {
                collection.add(this.f17586a.mo18185b(aVar));
            }
            aVar.mo18349s();
            return collection;
        }

        /* renamed from: f */
        public void mo18186d(C9146c cVar, Collection collection) {
            if (collection == null) {
                cVar.mo18359Q();
                return;
            }
            cVar.mo18362n();
            for (Object d : collection) {
                this.f17586a.mo18186d(cVar, d);
            }
            cVar.mo18365q();
        }
    }

    public CollectionTypeAdapterFactory(C5557c cVar) {
        this.f17585d = cVar;
    }

    /* renamed from: a */
    public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h = C5498b.m21918h(type, rawType);
        return new Adapter(gson, h, gson.mo18175q(C8982a.get(h)), this.f17585d.mo18374b(aVar));
    }
}
