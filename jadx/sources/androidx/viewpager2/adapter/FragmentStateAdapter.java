package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.util.C1008h;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public abstract class FragmentStateAdapter extends RecyclerView.C1736h implements C1918b {

    /* renamed from: d */
    final C1593j f5764d;

    /* renamed from: e */
    final FragmentManager f5765e;

    /* renamed from: f */
    final LongSparseArray f5766f;

    /* renamed from: g */
    private final LongSparseArray f5767g;

    /* renamed from: h */
    private final LongSparseArray f5768h;

    /* renamed from: i */
    private FragmentMaxLifecycleEnforcer f5769i;

    /* renamed from: j */
    boolean f5770j;

    /* renamed from: k */
    private boolean f5771k;

    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        private ViewPager2.C1928i f5777a;

        /* renamed from: b */
        private RecyclerView.C1739j f5778b;

        /* renamed from: c */
        private C1606m f5779c;

        /* renamed from: d */
        private ViewPager2 f5780d;

        /* renamed from: e */
        private long f5781e = -1;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        class C1911a extends ViewPager2.C1928i {
            C1911a() {
            }

            public void onPageScrollStateChanged(int i) {
                FragmentMaxLifecycleEnforcer.this.mo6582d(false);
            }

            public void onPageSelected(int i) {
                FragmentMaxLifecycleEnforcer.this.mo6582d(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        class C1912b extends C1916d {
            C1912b() {
                super((C1913a) null);
            }

            /* renamed from: a */
            public void mo5583a() {
                FragmentMaxLifecycleEnforcer.this.mo6582d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        /* renamed from: a */
        private ViewPager2 m7511a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6580b(RecyclerView recyclerView) {
            this.f5780d = m7511a(recyclerView);
            C1911a aVar = new C1911a();
            this.f5777a = aVar;
            this.f5780d.mo6603h(aVar);
            C1912b bVar = new C1912b();
            this.f5778b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            C19103 r2 = new C1606m() {
                /* renamed from: b */
                public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                    FragmentMaxLifecycleEnforcer.this.mo6582d(false);
                }
            };
            this.f5779c = r2;
            FragmentStateAdapter.this.f5764d.mo4906a(r2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6581c(RecyclerView recyclerView) {
            m7511a(recyclerView).mo6614p(this.f5777a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f5778b);
            FragmentStateAdapter.this.f5764d.mo4909d(this.f5779c);
            this.f5780d = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6582d(boolean z) {
            int currentItem;
            Fragment fragment;
            boolean z2;
            if (!FragmentStateAdapter.this.mo6579y() && this.f5780d.getScrollState() == 0 && !FragmentStateAdapter.this.f5766f.isEmpty() && FragmentStateAdapter.this.getItemCount() != 0 && (currentItem = this.f5780d.getCurrentItem()) < FragmentStateAdapter.this.getItemCount()) {
                long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                if ((itemId != this.f5781e || z) && (fragment = (Fragment) FragmentStateAdapter.this.f5766f.get(itemId)) != null && fragment.isAdded()) {
                    this.f5781e = itemId;
                    C1493e0 p = FragmentStateAdapter.this.f5765e.mo4428p();
                    Fragment fragment2 = null;
                    for (int i = 0; i < FragmentStateAdapter.this.f5766f.size(); i++) {
                        long keyAt = FragmentStateAdapter.this.f5766f.keyAt(i);
                        Fragment fragment3 = (Fragment) FragmentStateAdapter.this.f5766f.valueAt(i);
                        if (fragment3.isAdded()) {
                            if (keyAt != this.f5781e) {
                                p.mo4524v(fragment3, C1593j.C1598b.STARTED);
                            } else {
                                fragment2 = fragment3;
                            }
                            if (keyAt == this.f5781e) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            fragment3.setMenuVisibility(z2);
                        }
                    }
                    if (fragment2 != null) {
                        p.mo4524v(fragment2, C1593j.C1598b.RESUMED);
                    }
                    if (!p.mo4521p()) {
                        p.mo4517k();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    class C1913a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        final /* synthetic */ FrameLayout f5786d;

        /* renamed from: e */
        final /* synthetic */ C1917a f5787e;

        C1913a(FrameLayout frameLayout, C1917a aVar) {
            this.f5786d = frameLayout;
            this.f5787e = aVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f5786d.getParent() != null) {
                this.f5786d.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.mo6578u(this.f5787e);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    class C1914b extends FragmentManager.C1454k {

        /* renamed from: a */
        final /* synthetic */ Fragment f5789a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f5790b;

        C1914b(Fragment fragment, FrameLayout frameLayout) {
            this.f5789a = fragment;
            this.f5790b = frameLayout;
        }

        /* renamed from: m */
        public void mo4480m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f5789a) {
                fragmentManager.mo4383M1(this);
                FragmentStateAdapter.this.mo6569f(view, this.f5790b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    class C1915c implements Runnable {
        C1915c() {
        }

        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f5770j = false;
            fragmentStateAdapter.mo6572k();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    private static abstract class C1916d extends RecyclerView.C1739j {
        private C1916d() {
        }

        /* renamed from: a */
        public abstract void mo5583a();

        /* renamed from: b */
        public final void mo5584b(int i, int i2) {
            mo5583a();
        }

        /* renamed from: c */
        public final void mo5585c(int i, int i2, Object obj) {
            mo5583a();
        }

        /* renamed from: d */
        public final void mo5586d(int i, int i2) {
            mo5583a();
        }

        /* renamed from: e */
        public final void mo5587e(int i, int i2, int i3) {
            mo5583a();
        }

        /* renamed from: f */
        public final void mo5588f(int i, int i2) {
            mo5583a();
        }

        /* synthetic */ C1916d(C1913a aVar) {
            this();
        }
    }

    public FragmentStateAdapter(C1505h hVar) {
        this(hVar.getSupportFragmentManager(), hVar.getLifecycle());
    }

    /* renamed from: i */
    private static String m7487i(String str, long j) {
        return str + j;
    }

    /* renamed from: j */
    private void m7488j(int i) {
        long itemId = getItemId(i);
        if (!this.f5766f.containsKey(itemId)) {
            Fragment h = mo6571h(i);
            h.setInitialSavedState((Fragment.SavedState) this.f5767g.get(itemId));
            this.f5766f.put(itemId, h);
        }
    }

    /* renamed from: l */
    private boolean m7489l(long j) {
        View view;
        if (this.f5768h.containsKey(j)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f5766f.get(j);
        if (fragment == null || (view = fragment.getView()) == null) {
            return false;
        }
        if (view.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static boolean m7490m(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: n */
    private Long m7491n(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f5768h.size(); i2++) {
            if (((Integer) this.f5768h.valueAt(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f5768h.keyAt(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: t */
    private static long m7492t(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: v */
    private void m7493v(long j) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f5766f.get(j);
        if (fragment != null) {
            if (!(fragment.getView() == null || (parent = fragment.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!mo6570g(j)) {
                this.f5767g.remove(j);
            }
            if (!fragment.isAdded()) {
                this.f5766f.remove(j);
            } else if (mo6579y()) {
                this.f5771k = true;
            } else {
                if (fragment.isAdded() && mo6570g(j)) {
                    this.f5767g.put(j, this.f5765e.mo4352A1(fragment));
                }
                this.f5765e.mo4428p().mo4522q(fragment).mo4517k();
                this.f5766f.remove(j);
            }
        }
    }

    /* renamed from: w */
    private void m7494w() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final C1915c cVar = new C1915c();
        this.f5764d.mo4906a(new C1606m() {
            /* renamed from: b */
            public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                if (aVar == C1593j.C1594a.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    qVar.getLifecycle().mo4909d(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000);
    }

    /* renamed from: x */
    private void m7495x(Fragment fragment, FrameLayout frameLayout) {
        this.f5765e.mo4427o1(new C1914b(fragment, frameLayout), false);
    }

    /* renamed from: a */
    public final Parcelable mo6567a() {
        Bundle bundle = new Bundle(this.f5766f.size() + this.f5767g.size());
        for (int i = 0; i < this.f5766f.size(); i++) {
            long keyAt = this.f5766f.keyAt(i);
            Fragment fragment = (Fragment) this.f5766f.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.f5765e.mo4425n1(bundle, m7487i("f#", keyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f5767g.size(); i2++) {
            long keyAt2 = this.f5767g.keyAt(i2);
            if (mo6570g(keyAt2)) {
                bundle.putParcelable(m7487i("s#", keyAt2), (Parcelable) this.f5767g.get(keyAt2));
            }
        }
        return bundle;
    }

    /* renamed from: c */
    public final void mo6568c(Parcelable parcelable) {
        if (!this.f5767g.isEmpty() || !this.f5766f.isEmpty()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String next : bundle.keySet()) {
            if (m7490m(next, "f#")) {
                this.f5766f.put(m7492t(next, "f#"), this.f5765e.mo4438u0(bundle, next));
            } else if (m7490m(next, "s#")) {
                long t = m7492t(next, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                if (mo6570g(t)) {
                    this.f5767g.put(t, savedState);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: " + next);
            }
        }
        if (!this.f5766f.isEmpty()) {
            this.f5771k = true;
            this.f5770j = true;
            mo6572k();
            m7494w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6569f(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: g */
    public boolean mo6570g(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: h */
    public abstract Fragment mo6571h(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6572k() {
        if (this.f5771k && !mo6579y()) {
            ArraySet<Long> arraySet = new ArraySet<>();
            for (int i = 0; i < this.f5766f.size(); i++) {
                long keyAt = this.f5766f.keyAt(i);
                if (!mo6570g(keyAt)) {
                    arraySet.add(Long.valueOf(keyAt));
                    this.f5768h.remove(keyAt);
                }
            }
            if (!this.f5770j) {
                this.f5771k = false;
                for (int i2 = 0; i2 < this.f5766f.size(); i2++) {
                    long keyAt2 = this.f5766f.keyAt(i2);
                    if (!m7489l(keyAt2)) {
                        arraySet.add(Long.valueOf(keyAt2));
                    }
                }
            }
            for (Long longValue : arraySet) {
                m7493v(longValue.longValue());
            }
        }
    }

    /* renamed from: o */
    public final void onBindViewHolder(C1917a aVar, int i) {
        long itemId = aVar.getItemId();
        int id = aVar.mo6587i().getId();
        Long n = m7491n(id);
        if (!(n == null || n.longValue() == itemId)) {
            m7493v(n.longValue());
            this.f5768h.remove(n.longValue());
        }
        this.f5768h.put(itemId, Integer.valueOf(id));
        m7488j(i);
        FrameLayout i2 = aVar.mo6587i();
        if (ViewCompat.m3578U(i2)) {
            if (i2.getParent() == null) {
                i2.addOnLayoutChangeListener(new C1913a(i2, aVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo6572k();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        if (this.f5769i == null) {
            z = true;
        } else {
            z = false;
        }
        C1008h.m3524a(z);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f5769i = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.mo6580b(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f5769i.mo6581c(recyclerView);
        this.f5769i = null;
    }

    /* renamed from: p */
    public final C1917a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C1917a.m7524h(viewGroup);
    }

    /* renamed from: q */
    public final boolean onFailedToRecycleView(C1917a aVar) {
        return true;
    }

    /* renamed from: r */
    public final void onViewAttachedToWindow(C1917a aVar) {
        mo6578u(aVar);
        mo6572k();
    }

    /* renamed from: s */
    public final void onViewRecycled(C1917a aVar) {
        Long n = m7491n(aVar.mo6587i().getId());
        if (n != null) {
            m7493v(n.longValue());
            this.f5768h.remove(n.longValue());
        }
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo6578u(final C1917a aVar) {
        Fragment fragment = (Fragment) this.f5766f.get(aVar.getItemId());
        if (fragment != null) {
            FrameLayout i = aVar.mo6587i();
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (fragment.isAdded() && view == null) {
                m7495x(fragment, i);
            } else if (!fragment.isAdded() || view.getParent() == null) {
                if (fragment.isAdded()) {
                    mo6569f(view, i);
                } else if (!mo6579y()) {
                    m7495x(fragment, i);
                    C1493e0 p = this.f5765e.mo4428p();
                    p.mo4634e(fragment, "f" + aVar.getItemId()).mo4524v(fragment, C1593j.C1598b.STARTED).mo4517k();
                    this.f5769i.mo6582d(false);
                } else if (!this.f5765e.mo4381L0()) {
                    this.f5764d.mo4906a(new C1606m() {
                        /* renamed from: b */
                        public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
                            if (!FragmentStateAdapter.this.mo6579y()) {
                                qVar.getLifecycle().mo4909d(this);
                                if (ViewCompat.m3578U(aVar.mo6587i())) {
                                    FragmentStateAdapter.this.mo6578u(aVar);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != i) {
                mo6569f(view, i);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo6579y() {
        return this.f5765e.mo4394T0();
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, C1593j jVar) {
        this.f5766f = new LongSparseArray();
        this.f5767g = new LongSparseArray();
        this.f5768h = new LongSparseArray();
        this.f5770j = false;
        this.f5771k = false;
        this.f5765e = fragmentManager;
        this.f5764d = jVar;
        super.setHasStableIds(true);
    }
}
