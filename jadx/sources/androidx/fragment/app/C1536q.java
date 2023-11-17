package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.q */
class C1536q {

    /* renamed from: a */
    private final CopyOnWriteArrayList f4471a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final FragmentManager f4472b;

    /* renamed from: androidx.fragment.app.q$a */
    private static final class C1537a {

        /* renamed from: a */
        final FragmentManager.C1454k f4473a;

        /* renamed from: b */
        final boolean f4474b;

        C1537a(FragmentManager.C1454k kVar, boolean z) {
            this.f4473a = kVar;
            this.f4474b = z;
        }
    }

    C1536q(FragmentManager fragmentManager) {
        this.f4472b = fragmentManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4771a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4771a(fragment, bundle, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4468a(this.f4472b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4772b(Fragment fragment, boolean z) {
        Context f = this.f4472b.mo4449z0().mo4762f();
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4772b(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4469b(this.f4472b, fragment, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4773c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4773c(fragment, bundle, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4470c(this.f4472b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4774d(Fragment fragment, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4774d(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4471d(this.f4472b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4775e(Fragment fragment, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4775e(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4472e(this.f4472b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4776f(Fragment fragment, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4776f(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4473f(this.f4472b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4777g(Fragment fragment, boolean z) {
        Context f = this.f4472b.mo4449z0().mo4762f();
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4777g(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4474g(this.f4472b, fragment, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4778h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4778h(fragment, bundle, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4475h(this.f4472b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4779i(Fragment fragment, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4779i(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4476i(this.f4472b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4780j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4780j(fragment, bundle, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4477j(this.f4472b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4781k(Fragment fragment, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4781k(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4478k(this.f4472b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4782l(Fragment fragment, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4782l(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4479l(this.f4472b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4783m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4783m(fragment, view, bundle, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4480m(this.f4472b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4784n(Fragment fragment, boolean z) {
        Fragment C0 = this.f4472b.mo4357C0();
        if (C0 != null) {
            C0.getParentFragmentManager().mo4354B0().mo4784n(fragment, true);
        }
        Iterator it = this.f4471a.iterator();
        while (it.hasNext()) {
            C1537a aVar = (C1537a) it.next();
            if (!z || aVar.f4474b) {
                aVar.f4473a.mo4481n(this.f4472b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void mo4785o(FragmentManager.C1454k kVar, boolean z) {
        this.f4471a.add(new C1537a(kVar, z));
    }

    /* renamed from: p */
    public void mo4786p(FragmentManager.C1454k kVar) {
        synchronized (this.f4471a) {
            int size = this.f4471a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C1537a) this.f4471a.get(i)).f4473a == kVar) {
                    this.f4471a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
