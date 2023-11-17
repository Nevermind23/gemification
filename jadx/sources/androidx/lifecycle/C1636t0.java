package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.t0 */
public class C1636t0 {

    /* renamed from: a */
    private final Map f4660a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo4952a() {
        for (C1613n0 clear : this.f4660a.values()) {
            clear.clear();
        }
        this.f4660a.clear();
    }

    /* renamed from: b */
    public final C1613n0 mo4953b(String str) {
        C41536l.m120489i(str, "key");
        return (C1613n0) this.f4660a.get(str);
    }

    /* renamed from: c */
    public final Set mo4954c() {
        return new HashSet(this.f4660a.keySet());
    }

    /* renamed from: d */
    public final void mo4955d(String str, C1613n0 n0Var) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(n0Var, "viewModel");
        C1613n0 n0Var2 = (C1613n0) this.f4660a.put(str, n0Var);
        if (n0Var2 != null) {
            n0Var2.onCleared();
        }
    }
}
