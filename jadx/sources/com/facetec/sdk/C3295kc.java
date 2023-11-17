package com.facetec.sdk;

import com.facetec.sdk.C3260jr;
import java.io.Closeable;

/* renamed from: com.facetec.sdk.kc */
public final class C3295kc implements Closeable {

    /* renamed from: a */
    public final C3259jq f10796a;

    /* renamed from: b */
    final int f10797b;

    /* renamed from: c */
    final C3271jv f10798c;

    /* renamed from: d */
    final String f10799d;

    /* renamed from: e */
    final C3293kb f10800e;

    /* renamed from: f */
    final C3295kc f10801f;

    /* renamed from: g */
    public final C3291ka f10802g;

    /* renamed from: h */
    final C3260jr f10803h;

    /* renamed from: i */
    final C3295kc f10804i;

    /* renamed from: j */
    final C3295kc f10805j;

    /* renamed from: k */
    final long f10806k;

    /* renamed from: l */
    private volatile C3240jf f10807l;

    /* renamed from: m */
    final long f10808m;

    /* renamed from: com.facetec.sdk.kc$d */
    public static class C3296d {

        /* renamed from: a */
        C3271jv f10809a;

        /* renamed from: b */
        C3293kb f10810b;

        /* renamed from: c */
        int f10811c;

        /* renamed from: d */
        String f10812d;

        /* renamed from: e */
        C3259jq f10813e;

        /* renamed from: f */
        C3295kc f10814f;

        /* renamed from: g */
        public C3260jr.C3261d f10815g;

        /* renamed from: h */
        C3295kc f10816h;

        /* renamed from: i */
        C3291ka f10817i;

        /* renamed from: j */
        public C3295kc f10818j;

        /* renamed from: l */
        long f10819l;

        /* renamed from: o */
        long f10820o;

        public C3296d() {
            this.f10811c = -1;
            this.f10815g = new C3260jr.C3261d();
        }

        /* renamed from: c */
        private static void m13199c(String str, C3295kc kcVar) {
            if (kcVar.f10802g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (kcVar.f10804i != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (kcVar.f10801f != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (kcVar.f10805j != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* renamed from: a */
        public final C3296d mo9619a(C3293kb kbVar) {
            this.f10810b = kbVar;
            return this;
        }

        /* renamed from: b */
        public final C3296d mo9622b(C3260jr jrVar) {
            this.f10815g = jrVar.mo9491e();
            return this;
        }

        /* renamed from: d */
        public final C3296d mo9624d(C3271jv jvVar) {
            this.f10809a = jvVar;
            return this;
        }

        /* renamed from: e */
        public final C3296d mo9627e(int i) {
            this.f10811c = i;
            return this;
        }

        /* renamed from: a */
        public final C3296d mo9620a(String str, String str2) {
            this.f10815g.mo9497c(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C3296d mo9623b(C3295kc kcVar) {
            if (kcVar != null) {
                m13199c("cacheResponse", kcVar);
            }
            this.f10814f = kcVar;
            return this;
        }

        /* renamed from: d */
        public final C3296d mo9625d(C3291ka kaVar) {
            this.f10817i = kaVar;
            return this;
        }

        /* renamed from: e */
        public final C3296d mo9630e(String str) {
            this.f10812d = str;
            return this;
        }

        /* renamed from: a */
        public final C3296d mo9618a(long j) {
            this.f10819l = j;
            return this;
        }

        /* renamed from: d */
        public final C3296d mo9626d(C3295kc kcVar) {
            if (kcVar != null) {
                m13199c("networkResponse", kcVar);
            }
            this.f10816h = kcVar;
            return this;
        }

        /* renamed from: e */
        public final C3296d mo9629e(C3259jq jqVar) {
            this.f10813e = jqVar;
            return this;
        }

        C3296d(C3295kc kcVar) {
            this.f10811c = -1;
            this.f10810b = kcVar.f10800e;
            this.f10809a = kcVar.f10798c;
            this.f10811c = kcVar.f10797b;
            this.f10812d = kcVar.f10799d;
            this.f10813e = kcVar.f10796a;
            this.f10815g = kcVar.f10803h.mo9491e();
            this.f10817i = kcVar.f10802g;
            this.f10816h = kcVar.f10804i;
            this.f10814f = kcVar.f10801f;
            this.f10818j = kcVar.f10805j;
            this.f10819l = kcVar.f10808m;
            this.f10820o = kcVar.f10806k;
        }

        /* renamed from: a */
        public final C3295kc mo9621a() {
            if (this.f10810b == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f10809a == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f10811c < 0) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.f10811c);
                throw new IllegalStateException(sb.toString());
            } else if (this.f10812d != null) {
                return new C3295kc(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        /* renamed from: e */
        public final C3296d mo9628e(long j) {
            this.f10820o = j;
            return this;
        }
    }

    C3295kc(C3296d dVar) {
        this.f10800e = dVar.f10810b;
        this.f10798c = dVar.f10809a;
        this.f10797b = dVar.f10811c;
        this.f10799d = dVar.f10812d;
        this.f10796a = dVar.f10813e;
        this.f10803h = dVar.f10815g.mo9498c();
        this.f10802g = dVar.f10817i;
        this.f10804i = dVar.f10816h;
        this.f10801f = dVar.f10814f;
        this.f10805j = dVar.f10818j;
        this.f10808m = dVar.f10819l;
        this.f10806k = dVar.f10820o;
    }

    /* renamed from: a */
    public final boolean mo9605a() {
        int i = this.f10797b;
        return i >= 200 && i < 300;
    }

    /* renamed from: b */
    public final int mo9606b() {
        return this.f10797b;
    }

    /* renamed from: c */
    public final C3291ka mo9607c() {
        return this.f10802g;
    }

    public final void close() {
        C3291ka kaVar = this.f10802g;
        if (kaVar != null) {
            kaVar.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: d */
    public final C3293kb mo9609d() {
        return this.f10800e;
    }

    /* renamed from: e */
    public final C3260jr mo9610e() {
        return this.f10803h;
    }

    /* renamed from: f */
    public final C3296d mo9612f() {
        return new C3296d(this);
    }

    /* renamed from: g */
    public final long mo9613g() {
        return this.f10808m;
    }

    /* renamed from: h */
    public final C3295kc mo9614h() {
        return this.f10805j;
    }

    /* renamed from: i */
    public final long mo9615i() {
        return this.f10806k;
    }

    /* renamed from: j */
    public final C3240jf mo9616j() {
        C3240jf jfVar = this.f10807l;
        if (jfVar != null) {
            return jfVar;
        }
        C3240jf e = C3240jf.m13002e(this.f10803h);
        this.f10807l = e;
        return e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.f10798c);
        sb.append(", code=");
        sb.append(this.f10797b);
        sb.append(", message=");
        sb.append(this.f10799d);
        sb.append(", url=");
        sb.append(this.f10800e.mo9588a());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo9611e(String str) {
        String a = this.f10803h.mo9488a(str);
        if (a != null) {
            return a;
        }
        return null;
    }
}
