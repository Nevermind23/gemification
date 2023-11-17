package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2396k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.v */
public class C2596v extends Fragment {

    /* renamed from: d */
    private final C2557a f8075d;

    /* renamed from: e */
    private final C2581s f8076e;

    /* renamed from: f */
    private final Set f8077f;

    /* renamed from: g */
    private C2596v f8078g;

    /* renamed from: h */
    private C2396k f8079h;

    /* renamed from: i */
    private Fragment f8080i;

    /* renamed from: com.bumptech.glide.manager.v$a */
    private class C2597a implements C2581s {
        C2597a() {
        }

        /* renamed from: a */
        public Set mo8059a() {
            Set<C2596v> i1 = C2596v.this.mo8113i1();
            HashSet hashSet = new HashSet(i1.size());
            for (C2596v vVar : i1) {
                if (vVar.mo8115l1() != null) {
                    hashSet.add(vVar.mo8115l1());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C2596v.this + "}";
        }
    }

    public C2596v() {
        this(new C2557a());
    }

    /* renamed from: h1 */
    private void m9942h1(C2596v vVar) {
        this.f8077f.add(vVar);
    }

    /* renamed from: k1 */
    private Fragment m9943k1() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f8080i;
    }

    /* renamed from: m1 */
    private static FragmentManager m9944m1(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: n1 */
    private boolean m9945n1(Fragment fragment) {
        Fragment k1 = m9943k1();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(k1)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: o1 */
    private void m9946o1(Context context, FragmentManager fragmentManager) {
        m9948r1();
        C2596v s = C2379b.m9204c(context).mo7690k().mo8086s(fragmentManager);
        this.f8078g = s;
        if (!equals(s)) {
            this.f8078g.m9942h1(this);
        }
    }

    /* renamed from: p1 */
    private void m9947p1(C2596v vVar) {
        this.f8077f.remove(vVar);
    }

    /* renamed from: r1 */
    private void m9948r1() {
        C2596v vVar = this.f8078g;
        if (vVar != null) {
            vVar.m9947p1(this);
            this.f8078g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public Set mo8113i1() {
        C2596v vVar = this.f8078g;
        if (vVar == null) {
            return Collections.emptySet();
        }
        if (equals(vVar)) {
            return Collections.unmodifiableSet(this.f8077f);
        }
        HashSet hashSet = new HashSet();
        for (C2596v vVar2 : this.f8078g.mo8113i1()) {
            if (m9945n1(vVar2.m9943k1())) {
                hashSet.add(vVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public C2557a mo8114j1() {
        return this.f8075d;
    }

    /* renamed from: l1 */
    public C2396k mo8115l1() {
        return this.f8079h;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager m1 = m9944m1(this);
        if (m1 != null) {
            try {
                m9946o1(getContext(), m1);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f8075d.mo8054a();
        m9948r1();
    }

    public void onDetach() {
        super.onDetach();
        this.f8080i = null;
        m9948r1();
    }

    public void onStart() {
        super.onStart();
        this.f8075d.mo8055b();
    }

    public void onStop() {
        super.onStop();
        this.f8075d.mo8056d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void mo8116q1(Fragment fragment) {
        FragmentManager m1;
        this.f8080i = fragment;
        if (fragment != null && fragment.getContext() != null && (m1 = m9944m1(fragment)) != null) {
            m9946o1(fragment.getContext(), m1);
        }
    }

    public String toString() {
        return super.toString() + "{parent=" + m9943k1() + "}";
    }

    public C2596v(C2557a aVar) {
        this.f8076e = new C2597a();
        this.f8077f = new HashSet();
        this.f8075d = aVar;
    }
}
