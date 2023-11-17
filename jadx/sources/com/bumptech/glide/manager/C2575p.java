package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2396k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.p */
public class C2575p extends Fragment {

    /* renamed from: d */
    private final C2557a f8027d;

    /* renamed from: e */
    private final C2581s f8028e;

    /* renamed from: f */
    private final Set f8029f;

    /* renamed from: g */
    private C2396k f8030g;

    /* renamed from: h */
    private C2575p f8031h;

    /* renamed from: i */
    private Fragment f8032i;

    /* renamed from: com.bumptech.glide.manager.p$a */
    private class C2576a implements C2581s {
        C2576a() {
        }

        /* renamed from: a */
        public Set mo8059a() {
            Set<C2575p> b = C2575p.this.mo8065b();
            HashSet hashSet = new HashSet(b.size());
            for (C2575p pVar : b) {
                if (pVar.mo8067e() != null) {
                    hashSet.add(pVar.mo8067e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C2575p.this + "}";
        }
    }

    public C2575p() {
        this(new C2557a());
    }

    /* renamed from: a */
    private void m9883a(C2575p pVar) {
        this.f8029f.add(pVar);
    }

    /* renamed from: d */
    private Fragment m9884d() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f8032i;
    }

    /* renamed from: g */
    private boolean m9885g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    private void m9886h(Activity activity) {
        m9888l();
        C2575p q = C2379b.m9204c(activity).mo7690k().mo8085q(activity);
        this.f8031h = q;
        if (!equals(q)) {
            this.f8031h.m9883a(this);
        }
    }

    /* renamed from: i */
    private void m9887i(C2575p pVar) {
        this.f8029f.remove(pVar);
    }

    /* renamed from: l */
    private void m9888l() {
        C2575p pVar = this.f8031h;
        if (pVar != null) {
            pVar.m9887i(this);
            this.f8031h = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set mo8065b() {
        if (equals(this.f8031h)) {
            return Collections.unmodifiableSet(this.f8029f);
        }
        if (this.f8031h == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C2575p pVar : this.f8031h.mo8065b()) {
            if (m9885g(pVar.getParentFragment())) {
                hashSet.add(pVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2557a mo8066c() {
        return this.f8027d;
    }

    /* renamed from: e */
    public C2396k mo8067e() {
        return this.f8030g;
    }

    /* renamed from: f */
    public C2581s mo8068f() {
        return this.f8028e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8069j(Fragment fragment) {
        this.f8032i = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m9886h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo8070k(C2396k kVar) {
        this.f8030g = kVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m9886h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f8027d.mo8054a();
        m9888l();
    }

    public void onDetach() {
        super.onDetach();
        m9888l();
    }

    public void onStart() {
        super.onStart();
        this.f8027d.mo8055b();
    }

    public void onStop() {
        super.onStop();
        this.f8027d.mo8056d();
    }

    public String toString() {
        return super.toString() + "{parent=" + m9884d() + "}";
    }

    C2575p(C2557a aVar) {
        this.f8028e = new C2576a();
        this.f8029f = new HashSet();
        this.f8027d = aVar;
    }
}
