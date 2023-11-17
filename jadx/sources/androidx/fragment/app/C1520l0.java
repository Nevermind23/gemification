package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0909f;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p085g0.C6199b;

/* renamed from: androidx.fragment.app.l0 */
abstract class C1520l0 {

    /* renamed from: a */
    private final ViewGroup f4433a;

    /* renamed from: b */
    final ArrayList f4434b = new ArrayList();

    /* renamed from: c */
    final ArrayList f4435c = new ArrayList();

    /* renamed from: d */
    boolean f4436d = false;

    /* renamed from: e */
    boolean f4437e = false;

    /* renamed from: androidx.fragment.app.l0$a */
    class C1521a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C1524d f4438d;

        C1521a(C1524d dVar) {
            this.f4438d = dVar;
        }

        public void run() {
            if (C1520l0.this.f4434b.contains(this.f4438d)) {
                this.f4438d.mo4752e().mo4760a(this.f4438d.mo4753f().mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l0$b */
    class C1522b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C1524d f4440d;

        C1522b(C1524d dVar) {
            this.f4440d = dVar;
        }

        public void run() {
            C1520l0.this.f4434b.remove(this.f4440d);
            C1520l0.this.f4435c.remove(this.f4440d);
        }
    }

    /* renamed from: androidx.fragment.app.l0$c */
    static /* synthetic */ class C1523c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4442a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4443b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.l0$e$b[] r0 = androidx.fragment.app.C1520l0.C1525e.C1527b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4443b = r0
                r1 = 1
                androidx.fragment.app.l0$e$b r2 = androidx.fragment.app.C1520l0.C1525e.C1527b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4443b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.l0$e$b r3 = androidx.fragment.app.C1520l0.C1525e.C1527b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f4443b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.l0$e$b r4 = androidx.fragment.app.C1520l0.C1525e.C1527b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.l0$e$c[] r3 = androidx.fragment.app.C1520l0.C1525e.C1528c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f4442a = r3
                androidx.fragment.app.l0$e$c r4 = androidx.fragment.app.C1520l0.C1525e.C1528c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f4442a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.l0$e$c r3 = androidx.fragment.app.C1520l0.C1525e.C1528c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f4442a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C1520l0.C1525e.C1528c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f4442a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C1520l0.C1525e.C1528c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1520l0.C1523c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.l0$d */
    private static class C1524d extends C1525e {

        /* renamed from: h */
        private final C1480b0 f4444h;

        C1524d(C1525e.C1528c cVar, C1525e.C1527b bVar, C1480b0 b0Var, C0909f fVar) {
            super(cVar, bVar, b0Var.mo4563k(), fVar);
            this.f4444h = b0Var;
        }

        /* renamed from: c */
        public void mo4747c() {
            super.mo4747c();
            this.f4444h.mo4564m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo4748l() {
            if (mo4754g() == C1525e.C1527b.ADDING) {
                Fragment k = this.f4444h.mo4563k();
                View findFocus = k.mView.findFocus();
                if (findFocus != null) {
                    k.setFocusedView(findFocus);
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View requireView = mo4753f().requireView();
                if (requireView.getParent() == null) {
                    this.f4444h.mo4554b();
                    requireView.setAlpha(Utils.FLOAT_EPSILON);
                }
                if (requireView.getAlpha() == Utils.FLOAT_EPSILON && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            } else if (mo4754g() == C1525e.C1527b.REMOVING) {
                Fragment k2 = this.f4444h.mo4563k();
                View requireView2 = k2.requireView();
                if (FragmentManager.m4954M0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + k2);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* renamed from: androidx.fragment.app.l0$e */
    static class C1525e {

        /* renamed from: a */
        private C1528c f4445a;

        /* renamed from: b */
        private C1527b f4446b;

        /* renamed from: c */
        private final Fragment f4447c;

        /* renamed from: d */
        private final List f4448d = new ArrayList();

        /* renamed from: e */
        private final HashSet f4449e = new HashSet();

        /* renamed from: f */
        private boolean f4450f = false;

        /* renamed from: g */
        private boolean f4451g = false;

        /* renamed from: androidx.fragment.app.l0$e$a */
        class C1526a implements C0909f.C0911b {
            C1526a() {
            }

            /* renamed from: a */
            public void mo3362a() {
                C1525e.this.mo4750b();
            }
        }

        /* renamed from: androidx.fragment.app.l0$e$b */
        enum C1527b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.l0$e$c */
        enum C1528c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            static C1528c m5428b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* renamed from: c */
            static C1528c m5429c(View view) {
                if (view.getAlpha() == Utils.FLOAT_EPSILON && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m5428b(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4760a(View view) {
                int i = C1523c.f4442a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m4954M0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        C1525e(C1528c cVar, C1527b bVar, Fragment fragment, C0909f fVar) {
            this.f4445a = cVar;
            this.f4446b = bVar;
            this.f4447c = fragment;
            fVar.mo3361c(new C1526a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4749a(Runnable runnable) {
            this.f4448d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4750b() {
            if (!mo4755h()) {
                this.f4450f = true;
                if (this.f4449e.isEmpty()) {
                    mo4747c();
                    return;
                }
                Iterator it = new ArrayList(this.f4449e).iterator();
                while (it.hasNext()) {
                    ((C0909f) it.next()).mo3359a();
                }
            }
        }

        /* renamed from: c */
        public void mo4747c() {
            if (!this.f4451g) {
                if (FragmentManager.m4954M0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f4451g = true;
                for (Runnable run : this.f4448d) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo4751d(C0909f fVar) {
            if (this.f4449e.remove(fVar) && this.f4449e.isEmpty()) {
                mo4747c();
            }
        }

        /* renamed from: e */
        public C1528c mo4752e() {
            return this.f4445a;
        }

        /* renamed from: f */
        public final Fragment mo4753f() {
            return this.f4447c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C1527b mo4754g() {
            return this.f4446b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final boolean mo4755h() {
            return this.f4450f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final boolean mo4756i() {
            return this.f4451g;
        }

        /* renamed from: j */
        public final void mo4757j(C0909f fVar) {
            mo4748l();
            this.f4449e.add(fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final void mo4758k(C1528c cVar, C1527b bVar) {
            int i = C1523c.f4443b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4447c + " mFinalState = " + this.f4445a + " -> REMOVED. mLifecycleImpact  = " + this.f4446b + " to REMOVING.");
                    }
                    this.f4445a = C1528c.REMOVED;
                    this.f4446b = C1527b.REMOVING;
                } else if (i == 3 && this.f4445a != C1528c.REMOVED) {
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4447c + " mFinalState = " + this.f4445a + " -> " + cVar + ". ");
                    }
                    this.f4445a = cVar;
                }
            } else if (this.f4445a == C1528c.REMOVED) {
                if (FragmentManager.m4954M0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4447c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4446b + " to ADDING.");
                }
                this.f4445a = C1528c.VISIBLE;
                this.f4446b = C1527b.ADDING;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public abstract void mo4748l();

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f4445a + "} " + "{" + "mLifecycleImpact = " + this.f4446b + "} " + "{" + "mFragment = " + this.f4447c + "}";
        }
    }

    C1520l0(ViewGroup viewGroup) {
        this.f4433a = viewGroup;
    }

    /* renamed from: a */
    private void m5395a(C1525e.C1528c cVar, C1525e.C1527b bVar, C1480b0 b0Var) {
        synchronized (this.f4434b) {
            C0909f fVar = new C0909f();
            C1525e h = m5396h(b0Var.mo4563k());
            if (h != null) {
                h.mo4758k(cVar, bVar);
                return;
            }
            C1524d dVar = new C1524d(cVar, bVar, b0Var, fVar);
            this.f4434b.add(dVar);
            dVar.mo4749a(new C1521a(dVar));
            dVar.mo4749a(new C1522b(dVar));
        }
    }

    /* renamed from: h */
    private C1525e m5396h(Fragment fragment) {
        Iterator it = this.f4434b.iterator();
        while (it.hasNext()) {
            C1525e eVar = (C1525e) it.next();
            if (eVar.mo4753f().equals(fragment) && !eVar.mo4755h()) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C1525e m5397i(Fragment fragment) {
        Iterator it = this.f4435c.iterator();
        while (it.hasNext()) {
            C1525e eVar = (C1525e) it.next();
            if (eVar.mo4753f().equals(fragment) && !eVar.mo4755h()) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: n */
    static C1520l0 m5398n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m5399o(viewGroup, fragmentManager.mo4363E0());
    }

    /* renamed from: o */
    static C1520l0 m5399o(ViewGroup viewGroup, C1530m0 m0Var) {
        int i = C6199b.f19205b;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C1520l0) {
            return (C1520l0) tag;
        }
        C1520l0 a = m0Var.mo4459a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: q */
    private void m5400q() {
        Iterator it = this.f4434b.iterator();
        while (it.hasNext()) {
            C1525e eVar = (C1525e) it.next();
            if (eVar.mo4754g() == C1525e.C1527b.ADDING) {
                eVar.mo4758k(C1525e.C1528c.m5428b(eVar.mo4753f().requireView().getVisibility()), C1525e.C1527b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4734b(C1525e.C1528c cVar, C1480b0 b0Var) {
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + b0Var.mo4563k());
        }
        m5395a(cVar, C1525e.C1527b.ADDING, b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4735c(C1480b0 b0Var) {
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + b0Var.mo4563k());
        }
        m5395a(C1525e.C1528c.GONE, C1525e.C1527b.NONE, b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4736d(C1480b0 b0Var) {
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + b0Var.mo4563k());
        }
        m5395a(C1525e.C1528c.REMOVED, C1525e.C1527b.REMOVING, b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4737e(C1480b0 b0Var) {
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + b0Var.mo4563k());
        }
        m5395a(C1525e.C1528c.VISIBLE, C1525e.C1527b.NONE, b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo4528f(List list, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4738g() {
        if (!this.f4437e) {
            if (!ViewCompat.m3578U(this.f4433a)) {
                mo4739j();
                this.f4436d = false;
                return;
            }
            synchronized (this.f4434b) {
                if (!this.f4434b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f4435c);
                    this.f4435c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1525e eVar = (C1525e) it.next();
                        if (FragmentManager.m4954M0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.mo4750b();
                        if (!eVar.mo4756i()) {
                            this.f4435c.add(eVar);
                        }
                    }
                    m5400q();
                    ArrayList arrayList2 = new ArrayList(this.f4434b);
                    this.f4434b.clear();
                    this.f4435c.addAll(arrayList2);
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C1525e) it2.next()).mo4748l();
                    }
                    mo4528f(arrayList2, this.f4436d);
                    this.f4436d = false;
                    if (FragmentManager.m4954M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4739j() {
        String str;
        String str2;
        if (FragmentManager.m4954M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean U = ViewCompat.m3578U(this.f4433a);
        synchronized (this.f4434b) {
            m5400q();
            Iterator it = this.f4434b.iterator();
            while (it.hasNext()) {
                ((C1525e) it.next()).mo4748l();
            }
            Iterator it2 = new ArrayList(this.f4435c).iterator();
            while (it2.hasNext()) {
                C1525e eVar = (C1525e) it2.next();
                if (FragmentManager.m4954M0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (U) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f4433a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.mo4750b();
            }
            Iterator it3 = new ArrayList(this.f4434b).iterator();
            while (it3.hasNext()) {
                C1525e eVar2 = (C1525e) it3.next();
                if (FragmentManager.m4954M0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (U) {
                        str = "";
                    } else {
                        str = "Container " + this.f4433a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.mo4750b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4740k() {
        if (this.f4437e) {
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4437e = false;
            mo4738g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1525e.C1527b mo4741l(C1480b0 b0Var) {
        C1525e.C1527b bVar;
        C1525e h = m5396h(b0Var.mo4563k());
        if (h != null) {
            bVar = h.mo4754g();
        } else {
            bVar = null;
        }
        C1525e i = m5397i(b0Var.mo4563k());
        if (i == null || (bVar != null && bVar != C1525e.C1527b.NONE)) {
            return bVar;
        }
        return i.mo4754g();
    }

    /* renamed from: m */
    public ViewGroup mo4742m() {
        return this.f4433a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4743p() {
        synchronized (this.f4434b) {
            m5400q();
            this.f4437e = false;
            int size = this.f4434b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C1525e eVar = (C1525e) this.f4434b.get(size);
                C1525e.C1528c c = C1525e.C1528c.m5429c(eVar.mo4753f().mView);
                C1525e.C1528c e = eVar.mo4752e();
                C1525e.C1528c cVar = C1525e.C1528c.VISIBLE;
                if (e == cVar && c != cVar) {
                    this.f4437e = eVar.mo4753f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4744r(boolean z) {
        this.f4436d = z;
    }
}
