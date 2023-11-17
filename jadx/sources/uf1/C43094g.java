package uf1;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41902j;
import of1.C41935w;
import tf1.C42998c;
import tf1.C43002e;

/* renamed from: uf1.g */
public final class C43094g implements C41935w.C41936a {

    /* renamed from: a */
    private final C43002e f100525a;

    /* renamed from: b */
    private final List f100526b;

    /* renamed from: c */
    private final int f100527c;

    /* renamed from: d */
    private final C42998c f100528d;

    /* renamed from: e */
    private final C41869b0 f100529e;

    /* renamed from: f */
    private final int f100530f;

    /* renamed from: g */
    private final int f100531g;

    /* renamed from: h */
    private final int f100532h;

    /* renamed from: i */
    private int f100533i;

    public C43094g(C43002e eVar, List list, int i, C42998c cVar, C41869b0 b0Var, int i2, int i3, int i4) {
        C41536l.m120489i(eVar, "call");
        C41536l.m120489i(list, "interceptors");
        C41536l.m120489i(b0Var, "request");
        this.f100525a = eVar;
        this.f100526b = list;
        this.f100527c = i;
        this.f100528d = cVar;
        this.f100529e = b0Var;
        this.f100530f = i2;
        this.f100531g = i3;
        this.f100532h = i4;
    }

    /* renamed from: d */
    public static /* synthetic */ C43094g m123651d(C43094g gVar, int i, C42998c cVar, C41869b0 b0Var, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = gVar.f100527c;
        }
        if ((i5 & 2) != 0) {
            cVar = gVar.f100528d;
        }
        C42998c cVar2 = cVar;
        if ((i5 & 4) != 0) {
            b0Var = gVar.f100529e;
        }
        C41869b0 b0Var2 = b0Var;
        if ((i5 & 8) != 0) {
            i2 = gVar.f100530f;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = gVar.f100531g;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = gVar.f100532h;
        }
        return gVar.mo101663c(i, cVar2, b0Var2, i6, i7, i4);
    }

    /* renamed from: a */
    public C41880d0 mo97008a(C41869b0 b0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        C41536l.m120489i(b0Var, "request");
        boolean z4 = false;
        if (this.f100527c < this.f100526b.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f100533i++;
            C42998c cVar = this.f100528d;
            if (cVar != null) {
                if (cVar.mo101516j().mo101532g(b0Var.mo96681j())) {
                    if (this.f100533i == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalStateException(("network interceptor " + this.f100526b.get(this.f100527c - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f100526b.get(this.f100527c - 1) + " must retain the same host and port").toString());
                }
            }
            C43094g d = m123651d(this, this.f100527c + 1, (C42998c) null, b0Var, 0, 0, 0, 58, (Object) null);
            C41935w wVar = (C41935w) this.f100526b.get(this.f100527c);
            C41880d0 a = wVar.mo21294a(d);
            if (a != null) {
                if (this.f100528d != null) {
                    if (this.f100527c + 1 >= this.f100526b.size() || d.f100533i == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a.mo96739a() != null) {
                    z4 = true;
                }
                if (z4) {
                    return a;
                }
                throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public C41902j mo97009b() {
        C42998c cVar = this.f100528d;
        if (cVar == null) {
            return null;
        }
        return cVar.mo101514h();
    }

    /* renamed from: c */
    public final C43094g mo101663c(int i, C42998c cVar, C41869b0 b0Var, int i2, int i3, int i4) {
        C41536l.m120489i(b0Var, "request");
        return new C43094g(this.f100525a, this.f100526b, i, cVar, b0Var, i2, i3, i4);
    }

    public C41882e call() {
        return this.f100525a;
    }

    /* renamed from: e */
    public final C43002e mo101664e() {
        return this.f100525a;
    }

    /* renamed from: f */
    public final int mo101665f() {
        return this.f100530f;
    }

    /* renamed from: g */
    public final C42998c mo101666g() {
        return this.f100528d;
    }

    /* renamed from: h */
    public final int mo101667h() {
        return this.f100531g;
    }

    /* renamed from: i */
    public final C41869b0 mo101668i() {
        return this.f100529e;
    }

    /* renamed from: j */
    public final int mo101669j() {
        return this.f100532h;
    }

    /* renamed from: k */
    public int mo101670k() {
        return this.f100531g;
    }

    /* renamed from: w */
    public C41869b0 mo97011w() {
        return this.f100529e;
    }
}
