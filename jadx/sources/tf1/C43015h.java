package tf1;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import of1.C41889f0;

/* renamed from: tf1.h */
public final class C43015h {

    /* renamed from: a */
    private final Set f100432a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo101592a(C41889f0 f0Var) {
        C41536l.m120489i(f0Var, "route");
        this.f100432a.remove(f0Var);
    }

    /* renamed from: b */
    public final synchronized void mo101593b(C41889f0 f0Var) {
        C41536l.m120489i(f0Var, "failedRoute");
        this.f100432a.add(f0Var);
    }

    /* renamed from: c */
    public final synchronized boolean mo101594c(C41889f0 f0Var) {
        C41536l.m120489i(f0Var, "route");
        return this.f100432a.contains(f0Var);
    }
}
