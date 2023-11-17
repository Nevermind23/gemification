package com.google.gson.internal;

import android.support.p013v4.media.session.C0125b;
import com.google.gson.C5480a;
import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p277ua.C8662a;
import p277ua.C8665d;
import p277ua.C8666e;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9146c;

public final class Excluder implements C5624r, Cloneable {

    /* renamed from: j */
    public static final Excluder f17562j = new Excluder();

    /* renamed from: d */
    private double f17563d = -1.0d;

    /* renamed from: e */
    private int f17564e = 136;

    /* renamed from: f */
    private boolean f17565f = true;

    /* renamed from: g */
    private boolean f17566g;

    /* renamed from: h */
    private List f17567h = Collections.emptyList();

    /* renamed from: i */
    private List f17568i = Collections.emptyList();

    /* renamed from: d */
    private boolean m21894d(Class cls) {
        if (this.f17563d != -1.0d && !m21901n((C8665d) cls.getAnnotation(C8665d.class), (C8666e) cls.getAnnotation(C8666e.class))) {
            return true;
        }
        if ((this.f17565f || !m21897j(cls)) && !m21896h(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m21895e(Class cls, boolean z) {
        List list;
        if (z) {
            list = this.f17567h;
        } else {
            list = this.f17568i;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        C0125b.m366a(it.next());
        throw null;
    }

    /* renamed from: h */
    private boolean m21896h(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || m21898k(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m21897j(Class cls) {
        return cls.isMemberClass() && !m21898k(cls);
    }

    /* renamed from: k */
    private boolean m21898k(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: l */
    private boolean m21899l(C8665d dVar) {
        if (dVar == null) {
            return true;
        }
        if (this.f17563d >= dVar.value()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m21900m(C8666e eVar) {
        if (eVar == null) {
            return true;
        }
        if (this.f17563d < eVar.value()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m21901n(C8665d dVar, C8666e eVar) {
        return m21899l(dVar) && m21900m(eVar);
    }

    /* renamed from: a */
    public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
        final boolean z;
        final boolean z2;
        Class rawType = aVar.getRawType();
        boolean d = m21894d(rawType);
        if (d || m21895e(rawType, true)) {
            z = true;
        } else {
            z = false;
        }
        if (d || m21895e(rawType, false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return null;
        }
        final Gson gson2 = gson;
        final C8982a aVar2 = aVar;
        return new TypeAdapter() {

            /* renamed from: a */
            private TypeAdapter f17569a;

            /* renamed from: e */
            private TypeAdapter m21907e() {
                TypeAdapter typeAdapter = this.f17569a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter r = gson2.mo18176r(Excluder.this, aVar2);
                this.f17569a = r;
                return r;
            }

            /* renamed from: b */
            public Object mo18185b(C9143a aVar) {
                if (!z2) {
                    return m21907e().mo18185b(aVar);
                }
                aVar.mo18336N();
                return null;
            }

            /* renamed from: d */
            public void mo18186d(C9146c cVar, Object obj) {
                if (z) {
                    cVar.mo18359Q();
                } else {
                    m21907e().mo18186d(cVar, obj);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean mo18227c(Class cls, boolean z) {
        if (m21894d(cls) || m21895e(cls, z)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo18229f(Field field, boolean z) {
        List list;
        C8662a aVar;
        if ((this.f17564e & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f17563d != -1.0d && !m21901n((C8665d) field.getAnnotation(C8665d.class), (C8666e) field.getAnnotation(C8666e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f17566g && ((aVar = (C8662a) field.getAnnotation(C8662a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f17565f && m21897j(field.getType())) || m21896h(field.getType())) {
            return true;
        }
        if (z) {
            list = this.f17567h;
        } else {
            list = this.f17568i;
        }
        if (list.isEmpty()) {
            return false;
        }
        new C5480a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        C0125b.m366a(it.next());
        throw null;
    }

    /* renamed from: g */
    public Excluder mo18230g() {
        Excluder b = clone();
        b.f17566g = true;
        return b;
    }
}
