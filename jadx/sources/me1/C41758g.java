package me1;

import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;
import ue1.C43079p;

/* renamed from: me1.g */
public final class C41758g implements C41752f, Serializable {

    /* renamed from: d */
    public static final C41758g f98029d = new C41758g();
    private static final long serialVersionUID = 0;

    private C41758g() {
    }

    private final Object readResolve() {
        return f98029d;
    }

    /* renamed from: U */
    public Object mo23734U(Object obj, C43079p pVar) {
        C41536l.m120489i(pVar, "operation");
        return obj;
    }

    /* renamed from: c */
    public C41752f.C41755b mo23736c(C41752f.C41757c cVar) {
        C41536l.m120489i(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: q */
    public C41752f mo23740q(C41752f.C41757c cVar) {
        C41536l.m120489i(cVar, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    /* renamed from: u */
    public C41752f mo23741u(C41752f fVar) {
        C41536l.m120489i(fVar, "context");
        return fVar;
    }
}
