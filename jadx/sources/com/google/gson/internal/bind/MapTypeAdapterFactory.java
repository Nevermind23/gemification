package com.google.gson.internal.bind;

import com.google.gson.C5494h;
import com.google.gson.C5612l;
import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5498b;
import com.google.gson.internal.C5557c;
import com.google.gson.internal.C5577e;
import com.google.gson.internal.C5587h;
import com.google.gson.internal.C5595l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public final class MapTypeAdapterFactory implements C5624r {

    /* renamed from: d */
    private final C5557c f17595d;

    /* renamed from: e */
    final boolean f17596e;

    private final class Adapter<K, V> extends TypeAdapter {

        /* renamed from: a */
        private final TypeAdapter f17597a;

        /* renamed from: b */
        private final TypeAdapter f17598b;

        /* renamed from: c */
        private final C5587h f17599c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, C5587h hVar) {
            this.f17597a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f17598b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f17599c = hVar;
        }

        /* renamed from: e */
        private String m21960e(C5494h hVar) {
            if (hVar.mo18221r()) {
                C5612l i = hVar.mo18217i();
                if (i.mo18453B()) {
                    return String.valueOf(i.mo18459x());
                }
                if (i.mo18460z()) {
                    return Boolean.toString(i.mo18206b());
                }
                if (i.mo18454C()) {
                    return i.mo18211k();
                }
                throw new AssertionError();
            } else if (hVar.mo18219n()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        public Map mo18185b(C9143a aVar) {
            C9145b n0 = aVar.mo18348n0();
            if (n0 == C9145b.NULL) {
                aVar.mo18344f0();
                return null;
            }
            Map map = (Map) this.f17599c.mo18376a();
            if (n0 == C9145b.BEGIN_ARRAY) {
                aVar.mo18340a();
                while (aVar.hasNext()) {
                    aVar.mo18340a();
                    Object b = this.f17597a.mo18185b(aVar);
                    if (map.put(b, this.f17598b.mo18185b(aVar)) == null) {
                        aVar.mo18349s();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + b);
                    }
                }
                aVar.mo18349s();
            } else {
                aVar.mo18347k();
                while (aVar.hasNext()) {
                    C5577e.f17749a.mo18377a(aVar);
                    Object b2 = this.f17597a.mo18185b(aVar);
                    if (map.put(b2, this.f17598b.mo18185b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + b2);
                    }
                }
                aVar.mo18350t();
            }
            return map;
        }

        /* renamed from: g */
        public void mo18186d(C9146c cVar, Map map) {
            boolean z;
            if (map == null) {
                cVar.mo18359Q();
            } else if (!MapTypeAdapterFactory.this.f17596e) {
                cVar.mo18363o();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.mo18369x(String.valueOf(entry.getKey()));
                    this.f17598b.mo18186d(cVar, entry.getValue());
                }
                cVar.mo18367s();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    C5494h c = this.f17597a.mo18200c(entry2.getKey());
                    arrayList.add(c);
                    arrayList2.add(entry2.getValue());
                    if (c.mo18218l() || c.mo18220o()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 |= z;
                }
                if (z2) {
                    cVar.mo18362n();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo18362n();
                        C5595l.m22246b((C5494h) arrayList.get(i), cVar);
                        this.f17598b.mo18186d(cVar, arrayList2.get(i));
                        cVar.mo18365q();
                        i++;
                    }
                    cVar.mo18365q();
                    return;
                }
                cVar.mo18363o();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.mo18369x(m21960e((C5494h) arrayList.get(i)));
                    this.f17598b.mo18186d(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.mo18367s();
            }
        }
    }

    public MapTypeAdapterFactory(C5557c cVar, boolean z) {
        this.f17595d = cVar;
        this.f17596e = z;
    }

    /* renamed from: b */
    private TypeAdapter m21958b(Gson gson, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return TypeAdapters.f17679f;
        }
        return gson.mo18175q(C8982a.get(type));
    }

    /* renamed from: a */
    public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] j = C5498b.m21920j(type, rawType);
        return new Adapter(gson, j[0], m21958b(gson, j[0]), j[1], gson.mo18175q(C8982a.get(j[1])), this.f17595d.mo18374b(aVar));
    }
}
