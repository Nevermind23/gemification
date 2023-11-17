package ai1;

import ed1.C40734b;
import ed1.C40741h;
import ed1.C40744k;
import ed1.C40749p;
import ed1.C40757w;
import ed1.C40762x;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import zh1.C43444c;
import zh1.C43510v;
import zh1.C43511w;

/* renamed from: ai1.g */
public final class C40325g extends C43444c.C43445a {

    /* renamed from: a */
    private final C40757w f95792a;

    /* renamed from: b */
    private final boolean f95793b;

    private C40325g(C40757w wVar, boolean z) {
        this.f95792a = wVar;
        this.f95793b = z;
    }

    /* renamed from: d */
    public static C40325g m116760d() {
        return new C40325g((C40757w) null, false);
    }

    /* renamed from: e */
    public static C40325g m116761e(C40757w wVar) {
        if (wVar != null) {
            return new C40325g(wVar, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    public C43444c mo92682a(Type type, Annotation[] annotationArr, C43511w wVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Type type2;
        String str;
        Class<C40749p> c = C43444c.C43445a.m124641c(type);
        if (c == C40734b.class) {
            return new C40324f(Void.class, this.f95792a, this.f95793b, false, true, false, false, false, true);
        }
        if (c == C40741h.class) {
            z = true;
        } else {
            z = false;
        }
        if (c == C40762x.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c == C40744k.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c != C40749p.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z) {
                str = "Flowable";
            } else if (z2) {
                str = "Single";
            } else if (z3) {
                str = "Maybe";
            } else {
                str = "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type b = C43444c.C43445a.m124640b(0, (ParameterizedType) type);
        Class<C40321d> c2 = C43444c.C43445a.m124641c(b);
        if (c2 == C43510v.class) {
            if (b instanceof ParameterizedType) {
                type2 = C43444c.C43445a.m124640b(0, (ParameterizedType) b);
                z5 = false;
                z4 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (c2 != C40321d.class) {
            type2 = b;
            z4 = true;
            z5 = false;
        } else if (b instanceof ParameterizedType) {
            type2 = C43444c.C43445a.m124640b(0, (ParameterizedType) b);
            z5 = true;
            z4 = false;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        return new C40324f(type2, this.f95792a, this.f95793b, z5, z4, z, z2, z3, false);
    }
}
