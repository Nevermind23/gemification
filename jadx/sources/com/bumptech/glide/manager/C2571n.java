package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2396k;
import com.bumptech.glide.manager.C2578r;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p089g4.C6224l;

/* renamed from: com.bumptech.glide.manager.n */
final class C2571n {

    /* renamed from: a */
    final Map f8021a = new HashMap();

    /* renamed from: b */
    private final C2578r.C2580b f8022b;

    /* renamed from: com.bumptech.glide.manager.n$a */
    class C2572a implements C2570m {

        /* renamed from: d */
        final /* synthetic */ C1593j f8023d;

        C2572a(C1593j jVar) {
            this.f8023d = jVar;
        }

        /* renamed from: f */
        public void mo7279f() {
        }

        /* renamed from: o */
        public void mo7289o() {
        }

        public void onDestroy() {
            C2571n.this.f8021a.remove(this.f8023d);
        }
    }

    /* renamed from: com.bumptech.glide.manager.n$b */
    private final class C2573b implements C2581s {

        /* renamed from: a */
        private final FragmentManager f8025a;

        C2573b(FragmentManager fragmentManager) {
            this.f8025a = fragmentManager;
        }

        /* renamed from: b */
        private void m9879b(FragmentManager fragmentManager, Set set) {
            List y0 = fragmentManager.mo4446y0();
            int size = y0.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) y0.get(i);
                m9879b(fragment.getChildFragmentManager(), set);
                C2396k a = C2571n.this.mo8063a(fragment.getLifecycle());
                if (a != null) {
                    set.add(a);
                }
            }
        }

        /* renamed from: a */
        public Set mo8059a() {
            HashSet hashSet = new HashSet();
            m9879b(this.f8025a, hashSet);
            return hashSet;
        }
    }

    C2571n(C2578r.C2580b bVar) {
        this.f8022b = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2396k mo8063a(C1593j jVar) {
        C6224l.m24733b();
        return (C2396k) this.f8021a.get(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2396k mo8064b(Context context, C2379b bVar, C1593j jVar, FragmentManager fragmentManager, boolean z) {
        C6224l.m24733b();
        C2396k a = mo8063a(jVar);
        if (a != null) {
            return a;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(jVar);
        C2396k a2 = this.f8022b.mo8087a(bVar, lifecycleLifecycle, new C2573b(fragmentManager), context);
        this.f8021a.put(jVar, a2);
        lifecycleLifecycle.mo8050f(new C2572a(jVar));
        if (z) {
            a2.mo7289o();
        }
        return a2;
    }
}
