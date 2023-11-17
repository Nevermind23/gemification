package p202p0;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import androidx.lifecycle.C1636t0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;

/* renamed from: p0.m */
public final class C7575m extends C1613n0 implements C7521a0 {

    /* renamed from: e */
    public static final C7577b f22100e = new C7577b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C1620q0.C1624b f22101f = new C7576a();

    /* renamed from: d */
    private final Map f22102d = new LinkedHashMap();

    /* renamed from: p0.m$a */
    public static final class C7576a implements C1620q0.C1624b {
        C7576a() {
        }

        /* renamed from: a */
        public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
            return C1630r0.m5685b(this, cls, aVar);
        }

        /* renamed from: b */
        public C1613n0 mo4804b(Class cls) {
            C41536l.m120489i(cls, "modelClass");
            return new C7575m();
        }
    }

    /* renamed from: p0.m$b */
    public static final class C7577b {
        private C7577b() {
        }

        public /* synthetic */ C7577b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7575m mo22163a(C1636t0 t0Var) {
            C41536l.m120489i(t0Var, "viewModelStore");
            return (C7575m) new C1620q0(t0Var, C7575m.f22101f, (C7047a) null, 4, (DefaultConstructorMarker) null).mo4936a(C7575m.class);
        }
    }

    /* renamed from: ew */
    public final void mo22161ew(String str) {
        C41536l.m120489i(str, "backStackEntryId");
        C1636t0 t0Var = (C1636t0) this.f22102d.remove(str);
        if (t0Var != null) {
            t0Var.mo4952a();
        }
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        for (C1636t0 a : this.f22102d.values()) {
            a.mo4952a();
        }
        this.f22102d.clear();
    }

    /* renamed from: p5 */
    public C1636t0 mo22019p5(String str) {
        C41536l.m120489i(str, "backStackEntryId");
        C1636t0 t0Var = (C1636t0) this.f22102d.get(str);
        if (t0Var != null) {
            return t0Var;
        }
        C1636t0 t0Var2 = new C1636t0();
        this.f22102d.put(str, t0Var2);
        return t0Var2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f22102d.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "sb.toString()");
        return sb2;
    }
}
