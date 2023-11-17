package com.google.protobuf;

import android.support.p013v4.media.session.C0125b;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.l0 */
final class C5696l0 implements C5728v0 {

    /* renamed from: a */
    private final C5677h0 f17968a;

    /* renamed from: b */
    private final C5636b1 f17969b;

    /* renamed from: c */
    private final boolean f17970c;

    /* renamed from: d */
    private final C5693k f17971d;

    private C5696l0(C5636b1 b1Var, C5693k kVar, C5677h0 h0Var) {
        this.f17969b = b1Var;
        this.f17970c = kVar.mo18714d(h0Var);
        this.f17971d = kVar;
        this.f17968a = h0Var;
    }

    /* renamed from: i */
    private int m22880i(C5636b1 b1Var, Object obj) {
        return b1Var.mo18537c(b1Var.mo18535a(obj));
    }

    /* renamed from: j */
    static C5696l0 m22881j(C5636b1 b1Var, C5693k kVar, C5677h0 h0Var) {
        return new C5696l0(b1Var, kVar, h0Var);
    }

    /* renamed from: k */
    private void m22882k(C5636b1 b1Var, Object obj, C5689i1 i1Var) {
        b1Var.mo18541g(b1Var.mo18535a(obj), i1Var);
    }

    /* renamed from: a */
    public void mo18717a(Object obj, Object obj2) {
        C5732x0.m23052E(this.f17969b, obj, obj2);
        if (this.f17970c) {
            C5732x0.m23050C(this.f17971d, obj, obj2);
        }
    }

    /* renamed from: b */
    public void mo18718b(Object obj, C5689i1 i1Var) {
        Iterator n = this.f17971d.mo18712b(obj).mo18735n();
        if (!n.hasNext()) {
            m22882k(this.f17969b, obj, i1Var);
        } else {
            C0125b.m366a(((Map.Entry) n.next()).getKey());
            throw null;
        }
    }

    /* renamed from: c */
    public void mo18719c(Object obj) {
        this.f17969b.mo18538d(obj);
        this.f17971d.mo18715e(obj);
    }

    /* renamed from: d */
    public final boolean mo18720d(Object obj) {
        return this.f17971d.mo18712b(obj).mo18734k();
    }

    /* renamed from: e */
    public int mo18721e(Object obj) {
        int i = m22880i(this.f17969b, obj) + 0;
        if (this.f17970c) {
            return i + this.f17971d.mo18712b(obj).mo18730f();
        }
        return i;
    }

    /* renamed from: f */
    public Object mo18722f() {
        C5677h0 h0Var = this.f17968a;
        if (h0Var instanceof C5709q) {
            return ((C5709q) h0Var).mo18753O();
        }
        return h0Var.mo18705e().mo18707q0();
    }

    /* renamed from: g */
    public int mo18723g(Object obj) {
        int hashCode = this.f17969b.mo18535a(obj).hashCode();
        if (this.f17970c) {
            return (hashCode * 53) + this.f17971d.mo18712b(obj).hashCode();
        }
        return hashCode;
    }

    /* renamed from: h */
    public boolean mo18724h(Object obj, Object obj2) {
        if (!this.f17969b.mo18535a(obj).equals(this.f17969b.mo18535a(obj2))) {
            return false;
        }
        if (this.f17970c) {
            return this.f17971d.mo18712b(obj).equals(this.f17971d.mo18712b(obj2));
        }
        return true;
    }
}
