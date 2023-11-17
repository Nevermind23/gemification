package me1;

import he1.C41238w;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41548x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me1.C41752f;
import ue1.C43079p;

/* renamed from: me1.c */
public final class C41743c implements C41752f, Serializable {

    /* renamed from: d */
    private final C41752f f98019d;

    /* renamed from: e */
    private final C41752f.C41755b f98020e;

    /* renamed from: me1.c$a */
    private static final class C41744a implements Serializable {

        /* renamed from: e */
        public static final C41745a f98021e = new C41745a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;

        /* renamed from: d */
        private final C41752f[] f98022d;

        /* renamed from: me1.c$a$a */
        public static final class C41745a {
            private C41745a() {
            }

            public /* synthetic */ C41745a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C41744a(C41752f[] fVarArr) {
            C41536l.m120489i(fVarArr, "elements");
            this.f98022d = fVarArr;
        }

        private final Object readResolve() {
            C41752f[] fVarArr = this.f98022d;
            C41752f fVar = C41758g.f98029d;
            for (C41752f u : fVarArr) {
                fVar = fVar.mo23741u(u);
            }
            return fVar;
        }
    }

    /* renamed from: me1.c$b */
    static final class C41746b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C41746b f98023d = new C41746b();

        C41746b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, C41752f.C41755b bVar) {
            boolean z;
            C41536l.m120489i(str, "acc");
            C41536l.m120489i(bVar, "element");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: me1.c$c */
    static final class C41747c extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C41752f[] f98024d;

        /* renamed from: e */
        final /* synthetic */ C41548x f98025e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41747c(C41752f[] fVarArr, C41548x xVar) {
            super(2);
            this.f98024d = fVarArr;
            this.f98025e = xVar;
        }

        /* renamed from: a */
        public final void mo96535a(C41238w wVar, C41752f.C41755b bVar) {
            C41536l.m120489i(wVar, "<anonymous parameter 0>");
            C41536l.m120489i(bVar, "element");
            C41752f[] fVarArr = this.f98024d;
            C41548x xVar = this.f98025e;
            int i = xVar.f97715d;
            xVar.f97715d = i + 1;
            fVarArr[i] = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo96535a((C41238w) obj, (C41752f.C41755b) obj2);
            return C41238w.f97225a;
        }
    }

    public C41743c(C41752f fVar, C41752f.C41755b bVar) {
        C41536l.m120489i(fVar, "left");
        C41536l.m120489i(bVar, "element");
        this.f98019d = fVar;
        this.f98020e = bVar;
    }

    /* renamed from: b */
    private final boolean m121019b(C41752f.C41755b bVar) {
        return C41536l.m120484d(mo23736c(bVar.getKey()), bVar);
    }

    /* renamed from: e */
    private final boolean m121020e(C41743c cVar) {
        while (m121019b(cVar.f98020e)) {
            C41752f fVar = cVar.f98019d;
            if (fVar instanceof C41743c) {
                cVar = (C41743c) fVar;
            } else {
                C41536l.m120487g(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m121019b((C41752f.C41755b) fVar);
            }
        }
        return false;
    }

    /* renamed from: g */
    private final int m121021g() {
        int i = 2;
        C41743c cVar = this;
        while (true) {
            C41752f fVar = cVar.f98019d;
            cVar = fVar instanceof C41743c ? (C41743c) fVar : null;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        boolean z;
        int g = m121021g();
        C41752f[] fVarArr = new C41752f[g];
        C41548x xVar = new C41548x();
        mo23734U(C41238w.f97225a, new C41747c(fVarArr, xVar));
        if (xVar.f97715d == g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C41744a(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: U */
    public Object mo23734U(Object obj, C43079p pVar) {
        C41536l.m120489i(pVar, "operation");
        return pVar.invoke(this.f98019d.mo23734U(obj, pVar), this.f98020e);
    }

    /* renamed from: c */
    public C41752f.C41755b mo23736c(C41752f.C41757c cVar) {
        C41536l.m120489i(cVar, "key");
        C41743c cVar2 = this;
        while (true) {
            C41752f.C41755b c = cVar2.f98020e.mo23736c(cVar);
            if (c != null) {
                return c;
            }
            C41752f fVar = cVar2.f98019d;
            if (!(fVar instanceof C41743c)) {
                return fVar.mo23736c(cVar);
            }
            cVar2 = (C41743c) fVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41743c) {
                C41743c cVar = (C41743c) obj;
                if (cVar.m121021g() != m121021g() || !cVar.m121020e(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f98019d.hashCode() + this.f98020e.hashCode();
    }

    /* renamed from: q */
    public C41752f mo23740q(C41752f.C41757c cVar) {
        C41536l.m120489i(cVar, "key");
        if (this.f98020e.mo23736c(cVar) != null) {
            return this.f98019d;
        }
        C41752f q = this.f98019d.mo23740q(cVar);
        if (q == this.f98019d) {
            return this;
        }
        if (q == C41758g.f98029d) {
            return this.f98020e;
        }
        return new C41743c(q, this.f98020e);
    }

    public String toString() {
        return '[' + ((String) mo23734U("", C41746b.f98023d)) + ']';
    }

    /* renamed from: u */
    public C41752f mo23741u(C41752f fVar) {
        return C41752f.C41753a.m121037a(this, fVar);
    }
}
