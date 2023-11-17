package zh1;

import java.util.Objects;
import of1.C41880d0;
import of1.C41884e0;

/* renamed from: zh1.v */
public final class C43510v {

    /* renamed from: a */
    private final C41880d0 f101469a;

    /* renamed from: b */
    private final Object f101470b;

    /* renamed from: c */
    private final C41884e0 f101471c;

    private C43510v(C41880d0 d0Var, Object obj, C41884e0 e0Var) {
        this.f101469a = d0Var;
        this.f101470b = obj;
        this.f101471c = e0Var;
    }

    /* renamed from: c */
    public static C43510v m124775c(C41884e0 e0Var, C41880d0 d0Var) {
        Objects.requireNonNull(e0Var, "body == null");
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (!d0Var.mo96752u0()) {
            return new C43510v(d0Var, (Object) null, e0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: f */
    public static C43510v m124776f(Object obj, C41880d0 d0Var) {
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (d0Var.mo96752u0()) {
            return new C43510v(d0Var, obj, (C41884e0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object mo102214a() {
        return this.f101470b;
    }

    /* renamed from: b */
    public int mo102215b() {
        return this.f101469a.mo96747q();
    }

    /* renamed from: d */
    public boolean mo102216d() {
        return this.f101469a.mo96752u0();
    }

    /* renamed from: e */
    public String mo102217e() {
        return this.f101469a.mo96754x();
    }

    public String toString() {
        return this.f101469a.toString();
    }
}
