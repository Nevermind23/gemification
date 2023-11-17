package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import androidx.lifecycle.C1636t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p163m0.C7047a;

/* renamed from: androidx.fragment.app.x */
final class C1544x extends C1613n0 {

    /* renamed from: k */
    private static final C1620q0.C1624b f4487k = new C1545a();

    /* renamed from: d */
    private final HashMap f4488d = new HashMap();

    /* renamed from: e */
    private final HashMap f4489e = new HashMap();

    /* renamed from: f */
    private final HashMap f4490f = new HashMap();

    /* renamed from: g */
    private final boolean f4491g;

    /* renamed from: h */
    private boolean f4492h = false;

    /* renamed from: i */
    private boolean f4493i = false;

    /* renamed from: j */
    private boolean f4494j = false;

    /* renamed from: androidx.fragment.app.x$a */
    class C1545a implements C1620q0.C1624b {
        C1545a() {
        }

        /* renamed from: a */
        public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
            return C1630r0.m5685b(this, cls, aVar);
        }

        /* renamed from: b */
        public C1613n0 mo4804b(Class cls) {
            return new C1544x(true);
        }
    }

    C1544x(boolean z) {
        this.f4491g = z;
    }

    /* renamed from: gw */
    private void m5466gw(String str) {
        C1544x xVar = (C1544x) this.f4489e.get(str);
        if (xVar != null) {
            xVar.onCleared();
            this.f4489e.remove(str);
        }
        C1636t0 t0Var = (C1636t0) this.f4490f.get(str);
        if (t0Var != null) {
            t0Var.mo4952a();
            this.f4490f.remove(str);
        }
    }

    /* renamed from: jw */
    static C1544x m5467jw(C1636t0 t0Var) {
        return (C1544x) new C1620q0(t0Var, f4487k).mo4936a(C1544x.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dw */
    public void mo4788dw(Fragment fragment) {
        if (this.f4494j) {
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f4488d.containsKey(fragment.mWho)) {
            this.f4488d.put(fragment.mWho, fragment);
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1544x.class != obj.getClass()) {
            return false;
        }
        C1544x xVar = (C1544x) obj;
        if (!this.f4488d.equals(xVar.f4488d) || !this.f4489e.equals(xVar.f4489e) || !this.f4490f.equals(xVar.f4490f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ew */
    public void mo4790ew(Fragment fragment) {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m5466gw(fragment.mWho);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fw */
    public void mo4791fw(String str) {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m5466gw(str);
    }

    public int hashCode() {
        return (((this.f4488d.hashCode() * 31) + this.f4489e.hashCode()) * 31) + this.f4490f.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: hw */
    public Fragment mo4793hw(String str) {
        return (Fragment) this.f4488d.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: iw */
    public C1544x mo4794iw(Fragment fragment) {
        C1544x xVar = (C1544x) this.f4489e.get(fragment.mWho);
        if (xVar != null) {
            return xVar;
        }
        C1544x xVar2 = new C1544x(this.f4491g);
        this.f4489e.put(fragment.mWho, xVar2);
        return xVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kw */
    public Collection mo4795kw() {
        return new ArrayList(this.f4488d.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lw */
    public C1636t0 mo4796lw(Fragment fragment) {
        C1636t0 t0Var = (C1636t0) this.f4490f.get(fragment.mWho);
        if (t0Var != null) {
            return t0Var;
        }
        C1636t0 t0Var2 = new C1636t0();
        this.f4490f.put(fragment.mWho, t0Var2);
        return t0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mw */
    public boolean mo4797mw() {
        return this.f4492h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: nw */
    public void mo4798nw(Fragment fragment) {
        boolean z;
        if (!this.f4494j) {
            if (this.f4488d.remove(fragment.mWho) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        if (FragmentManager.m4954M0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4492h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ow */
    public void mo4800ow(boolean z) {
        this.f4494j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: pw */
    public boolean mo4801pw(Fragment fragment) {
        if (!this.f4488d.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f4491g) {
            return this.f4492h;
        }
        return !this.f4493i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f4488d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f4489e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f4490f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
