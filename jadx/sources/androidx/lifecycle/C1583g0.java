package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1620q0;
import androidx.savedstate.C1846a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import p163m0.C7051c;
import p306x0.C8933d;
import ue1.C43075l;

/* renamed from: androidx.lifecycle.g0 */
public abstract class C1583g0 {

    /* renamed from: a */
    public static final C7047a.C7049b f4589a = new C1585b();

    /* renamed from: b */
    public static final C7047a.C7049b f4590b = new C1586c();

    /* renamed from: c */
    public static final C7047a.C7049b f4591c = new C1584a();

    /* renamed from: androidx.lifecycle.g0$a */
    public static final class C1584a implements C7047a.C7049b {
        C1584a() {
        }
    }

    /* renamed from: androidx.lifecycle.g0$b */
    public static final class C1585b implements C7047a.C7049b {
        C1585b() {
        }
    }

    /* renamed from: androidx.lifecycle.g0$c */
    public static final class C1586c implements C7047a.C7049b {
        C1586c() {
        }
    }

    /* renamed from: androidx.lifecycle.g0$d */
    static final class C1587d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C1587d f4592d = new C1587d();

        C1587d() {
            super(1);
        }

        /* renamed from: a */
        public final C1592i0 invoke(C7047a aVar) {
            C41536l.m120489i(aVar, "$this$initializer");
            return new C1592i0();
        }
    }

    /* renamed from: a */
    public static final C1580f0 m5612a(C7047a aVar) {
        C41536l.m120489i(aVar, "<this>");
        C8933d dVar = (C8933d) aVar.mo21270a(f4589a);
        if (dVar != null) {
            C1638u0 u0Var = (C1638u0) aVar.mo21270a(f4590b);
            if (u0Var != null) {
                Bundle bundle = (Bundle) aVar.mo21270a(f4591c);
                String str = (String) aVar.mo21270a(C1620q0.C1625c.f4646c);
                if (str != null) {
                    return m5613b(dVar, u0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* renamed from: b */
    private static final C1580f0 m5613b(C8933d dVar, C1638u0 u0Var, String str, Bundle bundle) {
        C1589h0 d = m5615d(dVar);
        C1592i0 e = m5616e(u0Var);
        C1580f0 f0Var = (C1580f0) e.mo4905dw().get(str);
        if (f0Var != null) {
            return f0Var;
        }
        C1580f0 a = C1580f0.f4582f.mo4895a(d.mo4902b(str), bundle);
        e.mo4905dw().put(str, a);
        return a;
    }

    /* renamed from: c */
    public static final void m5614c(C8933d dVar) {
        boolean z;
        C41536l.m120489i(dVar, "<this>");
        C1593j.C1598b b = dVar.getLifecycle().mo4907b();
        if (b == C1593j.C1598b.INITIALIZED || b == C1593j.C1598b.CREATED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (dVar.getSavedStateRegistry().mo6112c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1589h0 h0Var = new C1589h0(dVar.getSavedStateRegistry(), (C1638u0) dVar);
            dVar.getSavedStateRegistry().mo6116h("androidx.lifecycle.internal.SavedStateHandlesProvider", h0Var);
            dVar.getLifecycle().mo4906a(new SavedStateHandleAttacher(h0Var));
        }
    }

    /* renamed from: d */
    public static final C1589h0 m5615d(C8933d dVar) {
        C1589h0 h0Var;
        C41536l.m120489i(dVar, "<this>");
        C1846a.C1849c c = dVar.getSavedStateRegistry().mo6112c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (c instanceof C1589h0) {
            h0Var = (C1589h0) c;
        } else {
            h0Var = null;
        }
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final C1592i0 m5616e(C1638u0 u0Var) {
        C41536l.m120489i(u0Var, "<this>");
        C7051c cVar = new C7051c();
        Class<C1592i0> cls = C1592i0.class;
        cVar.mo21272a(C41520a0.m120436b(cls), C1587d.f4592d);
        return (C1592i0) new C1620q0(u0Var, cVar.mo21273b()).mo4937b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
