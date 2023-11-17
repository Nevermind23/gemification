package com.google.gson.internal.bind;

import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5557c;
import p277ua.C8663b;
import p316xa.C8982a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C5624r {

    /* renamed from: d */
    private final C5557c f17594d;

    public JsonAdapterAnnotationTypeAdapterFactory(C5557c cVar) {
        this.f17594d = cVar;
    }

    /* renamed from: a */
    public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
        C8663b bVar = (C8663b) aVar.getRawType().getAnnotation(C8663b.class);
        if (bVar == null) {
            return null;
        }
        return mo18256b(this.f17594d, gson, aVar, bVar);
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [com.google.gson.TypeAdapter] */
    /* JADX WARNING: type inference failed for: r8v17, types: [com.google.gson.TypeAdapter] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.TypeAdapter mo18256b(com.google.gson.internal.C5557c r8, com.google.gson.Gson r9, p316xa.C8982a r10, p277ua.C8663b r11) {
        /*
            r7 = this;
            java.lang.Class r0 = r11.value()
            xa.a r0 = p316xa.C8982a.get(r0)
            com.google.gson.internal.h r8 = r8.mo18374b(r0)
            java.lang.Object r8 = r8.mo18376a()
            boolean r6 = r11.nullSafe()
            boolean r11 = r8 instanceof com.google.gson.TypeAdapter
            if (r11 == 0) goto L_0x001b
            com.google.gson.TypeAdapter r8 = (com.google.gson.TypeAdapter) r8
            goto L_0x003e
        L_0x001b:
            boolean r11 = r8 instanceof com.google.gson.C5624r
            if (r11 == 0) goto L_0x0026
            com.google.gson.r r8 = (com.google.gson.C5624r) r8
            com.google.gson.TypeAdapter r8 = r8.mo18225a(r9, r10)
            goto L_0x003e
        L_0x0026:
            boolean r11 = r8 instanceof com.google.gson.C5493g
            if (r11 == 0) goto L_0x0047
            r1 = 0
            boolean r11 = r8 instanceof com.google.gson.C5493g
            if (r11 == 0) goto L_0x0032
            com.google.gson.g r8 = (com.google.gson.C5493g) r8
            goto L_0x0033
        L_0x0032:
            r8 = 0
        L_0x0033:
            r2 = r8
            com.google.gson.internal.bind.TreeTypeAdapter r8 = new com.google.gson.internal.bind.TreeTypeAdapter
            r5 = 0
            r0 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = 0
        L_0x003e:
            if (r8 == 0) goto L_0x0046
            if (r6 == 0) goto L_0x0046
            com.google.gson.TypeAdapter r8 = r8.mo18199a()
        L_0x0046:
            return r8
        L_0x0047:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r11.append(r0)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r11.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r11.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.mo18256b(com.google.gson.internal.c, com.google.gson.Gson, xa.a, ua.b):com.google.gson.TypeAdapter");
    }
}
