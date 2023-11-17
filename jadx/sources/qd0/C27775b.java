package qd0;

import ge1.C41084a;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: qd0.b */
public final class C27775b {

    /* renamed from: a */
    private final C41084a f70867a;

    public C27775b(C41084a aVar) {
        C41536l.m120489i(aVar, "cleanables");
        this.f70867a = aVar;
    }

    /* renamed from: a */
    public final void mo67318a() {
        try {
            for (C27774a clean : (Set) this.f70867a.get()) {
                try {
                    clean.clean();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
