package p202p0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7530c0;

/* renamed from: p0.d0 */
public class C7536d0 {

    /* renamed from: b */
    public static final C7537a f21980b = new C7537a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map f21981c = new LinkedHashMap();

    /* renamed from: a */
    private final Map f21982a = new LinkedHashMap();

    /* renamed from: p0.d0$a */
    public static final class C7537a {
        private C7537a() {
        }

        public /* synthetic */ C7537a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo22063a(Class cls) {
            C41536l.m120489i(cls, "navigatorClass");
            String str = (String) C7536d0.f21981c.get(cls);
            if (str == null) {
                C7530c0.C7532b bVar = (C7530c0.C7532b) cls.getAnnotation(C7530c0.C7532b.class);
                if (bVar != null) {
                    str = bVar.value();
                } else {
                    str = null;
                }
                if (mo22064b(str)) {
                    C7536d0.f21981c.put(cls, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
            }
            C41536l.m120486f(str);
            return str;
        }

        /* renamed from: b */
        public final boolean mo22064b(String str) {
            if (str == null) {
                return false;
            }
            return str.length() > 0;
        }
    }

    /* renamed from: b */
    public C7530c0 mo22059b(String str, C7530c0 c0Var) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(c0Var, "navigator");
        if (f21980b.mo22064b(str)) {
            C7530c0 c0Var2 = (C7530c0) this.f21982a.get(str);
            if (C41536l.m120484d(c0Var2, c0Var)) {
                return c0Var;
            }
            boolean z = false;
            if (c0Var2 != null && c0Var2.mo22049c()) {
                z = true;
            }
            if (!(!z)) {
                throw new IllegalStateException(("Navigator " + c0Var + " is replacing an already attached " + c0Var2).toString());
            } else if (!c0Var.mo22049c()) {
                return (C7530c0) this.f21982a.put(str, c0Var);
            } else {
                throw new IllegalStateException(("Navigator " + c0Var + " is already attached to another NavController").toString());
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
    }

    /* renamed from: c */
    public final C7530c0 mo22060c(C7530c0 c0Var) {
        C41536l.m120489i(c0Var, "navigator");
        return mo22059b(f21980b.mo22063a(c0Var.getClass()), c0Var);
    }

    /* renamed from: d */
    public C7530c0 mo22061d(String str) {
        C41536l.m120489i(str, "name");
        if (f21980b.mo22064b(str)) {
            C7530c0 c0Var = (C7530c0) this.f21982a.get(str);
            if (c0Var != null) {
                return c0Var;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    /* renamed from: e */
    public final Map mo22062e() {
        return C41344r0.m119941w(this.f21982a);
    }
}
