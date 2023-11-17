package com.google.gson.internal.bind;

import com.google.gson.C5492f;
import com.google.gson.C5493g;
import com.google.gson.C5494h;
import com.google.gson.C5613m;
import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5497a;
import com.google.gson.internal.C5595l;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9146c;

public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a */
    private final C5493g f17635a;

    /* renamed from: b */
    final Gson f17636b;

    /* renamed from: c */
    private final C8982a f17637c;

    /* renamed from: d */
    private final C5624r f17638d;

    /* renamed from: e */
    private final C5514b f17639e;

    /* renamed from: f */
    private final boolean f17640f;

    /* renamed from: g */
    private volatile TypeAdapter f17641g;

    private static final class SingleTypeFactory implements C5624r {

        /* renamed from: d */
        private final C8982a f17642d;

        /* renamed from: e */
        private final boolean f17643e;

        /* renamed from: f */
        private final Class f17644f;

        /* renamed from: g */
        private final C5493g f17645g;

        SingleTypeFactory(Object obj, C8982a aVar, boolean z, Class cls) {
            C5493g gVar;
            boolean z2;
            if (obj instanceof C5493g) {
                gVar = (C5493g) obj;
            } else {
                gVar = null;
            }
            this.f17645g = gVar;
            if (gVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C5497a.m21910a(z2);
            this.f17642d = aVar;
            this.f17643e = z;
            this.f17644f = cls;
        }

        /* renamed from: a */
        public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
            boolean z;
            C8982a aVar2 = this.f17642d;
            if (aVar2 == null) {
                z = this.f17644f.isAssignableFrom(aVar.getRawType());
            } else if (aVar2.equals(aVar) || (this.f17643e && this.f17642d.getType() == aVar.getRawType())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new TreeTypeAdapter((C5613m) null, this.f17645g, gson, aVar, this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$b */
    private final class C5514b implements C5492f {
        private C5514b() {
        }
    }

    public TreeTypeAdapter(C5613m mVar, C5493g gVar, Gson gson, C8982a aVar, C5624r rVar, boolean z) {
        this.f17639e = new C5514b();
        this.f17635a = gVar;
        this.f17636b = gson;
        this.f17637c = aVar;
        this.f17638d = rVar;
        this.f17640f = z;
    }

    /* renamed from: f */
    private TypeAdapter m22008f() {
        TypeAdapter typeAdapter = this.f17641g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter r = this.f17636b.mo18176r(this.f17638d, this.f17637c);
        this.f17641g = r;
        return r;
    }

    /* renamed from: g */
    public static C5624r m22009g(C8982a aVar, Object obj) {
        boolean z;
        if (aVar.getType() == aVar.getRawType()) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, aVar, z, (Class) null);
    }

    /* renamed from: b */
    public Object mo18185b(C9143a aVar) {
        if (this.f17635a == null) {
            return m22008f().mo18185b(aVar);
        }
        C5494h a = C5595l.m22245a(aVar);
        if (!this.f17640f || !a.mo18219n()) {
            return this.f17635a.mo7657a(a, this.f17637c.getType(), this.f17639e);
        }
        return null;
    }

    /* renamed from: d */
    public void mo18186d(C9146c cVar, Object obj) {
        m22008f().mo18186d(cVar, obj);
    }

    /* renamed from: e */
    public TypeAdapter mo18197e() {
        return m22008f();
    }

    public TreeTypeAdapter(C5613m mVar, C5493g gVar, Gson gson, C8982a aVar, C5624r rVar) {
        this(mVar, gVar, gson, aVar, rVar, true);
    }
}
