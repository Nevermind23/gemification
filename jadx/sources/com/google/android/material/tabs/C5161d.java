package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.d */
public final class C5161d {

    /* renamed from: a */
    private final TabLayout f16498a;

    /* renamed from: b */
    private final ViewPager2 f16499b;

    /* renamed from: c */
    private final boolean f16500c;

    /* renamed from: d */
    private final boolean f16501d;

    /* renamed from: e */
    private final C5163b f16502e;

    /* renamed from: f */
    private RecyclerView.C1736h f16503f;

    /* renamed from: g */
    private boolean f16504g;

    /* renamed from: h */
    private C5164c f16505h;

    /* renamed from: i */
    private TabLayout.C5149d f16506i;

    /* renamed from: j */
    private RecyclerView.C1739j f16507j;

    /* renamed from: com.google.android.material.tabs.d$a */
    private class C5162a extends RecyclerView.C1739j {
        C5162a() {
        }

        /* renamed from: a */
        public void mo5583a() {
            C5161d.this.mo16991b();
        }

        /* renamed from: b */
        public void mo5584b(int i, int i2) {
            C5161d.this.mo16991b();
        }

        /* renamed from: c */
        public void mo5585c(int i, int i2, Object obj) {
            C5161d.this.mo16991b();
        }

        /* renamed from: d */
        public void mo5586d(int i, int i2) {
            C5161d.this.mo16991b();
        }

        /* renamed from: e */
        public void mo5587e(int i, int i2, int i3) {
            C5161d.this.mo16991b();
        }

        /* renamed from: f */
        public void mo5588f(int i, int i2) {
            C5161d.this.mo16991b();
        }
    }

    /* renamed from: com.google.android.material.tabs.d$b */
    public interface C5163b {
        /* renamed from: a */
        void mo16992a(TabLayout.C5153g gVar, int i);
    }

    /* renamed from: com.google.android.material.tabs.d$c */
    private static class C5164c extends ViewPager2.C1928i {

        /* renamed from: a */
        private final WeakReference f16509a;

        /* renamed from: b */
        private int f16510b;

        /* renamed from: c */
        private int f16511c;

        C5164c(TabLayout tabLayout) {
            this.f16509a = new WeakReference(tabLayout);
            mo16993a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16993a() {
            this.f16511c = 0;
            this.f16510b = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f16510b = this.f16511c;
            this.f16511c = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f16509a.get();
            if (tabLayout != null) {
                int i3 = this.f16511c;
                boolean z2 = false;
                if (i3 != 2 || this.f16510b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i3 == 2 && this.f16510b == 0)) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f16509a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f16511c;
                if (i2 == 0 || (i2 == 2 && this.f16510b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i), z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d */
    private static class C5165d implements TabLayout.C5149d {

        /* renamed from: a */
        private final ViewPager2 f16512a;

        /* renamed from: b */
        private final boolean f16513b;

        C5165d(ViewPager2 viewPager2, boolean z) {
            this.f16512a = viewPager2;
            this.f16513b = z;
        }

        /* renamed from: a */
        public void mo16942a(TabLayout.C5153g gVar) {
            this.f16512a.mo6606l(gVar.mo16958g(), this.f16513b);
        }

        /* renamed from: b */
        public void mo16943b(TabLayout.C5153g gVar) {
        }

        /* renamed from: c */
        public void mo16944c(TabLayout.C5153g gVar) {
        }
    }

    public C5161d(TabLayout tabLayout, ViewPager2 viewPager2, C5163b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    /* renamed from: a */
    public void mo16990a() {
        if (!this.f16504g) {
            RecyclerView.C1736h adapter = this.f16499b.getAdapter();
            this.f16503f = adapter;
            if (adapter != null) {
                this.f16504g = true;
                C5164c cVar = new C5164c(this.f16498a);
                this.f16505h = cVar;
                this.f16499b.mo6603h(cVar);
                C5165d dVar = new C5165d(this.f16499b, this.f16501d);
                this.f16506i = dVar;
                this.f16498a.addOnTabSelectedListener((TabLayout.C5149d) dVar);
                if (this.f16500c) {
                    C5162a aVar = new C5162a();
                    this.f16507j = aVar;
                    this.f16503f.registerAdapterDataObserver(aVar);
                }
                mo16991b();
                this.f16498a.setScrollPosition(this.f16499b.getCurrentItem(), Utils.FLOAT_EPSILON, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16991b() {
        int min;
        this.f16498a.removeAllTabs();
        RecyclerView.C1736h hVar = this.f16503f;
        if (hVar != null) {
            int itemCount = hVar.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.C5153g newTab = this.f16498a.newTab();
                this.f16502e.mo16992a(newTab, i);
                this.f16498a.addTab(newTab, false);
            }
            if (itemCount > 0 && (min = Math.min(this.f16499b.getCurrentItem(), this.f16498a.getTabCount() - 1)) != this.f16498a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f16498a;
                tabLayout.selectTab(tabLayout.getTabAt(min));
            }
        }
    }

    public C5161d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, C5163b bVar) {
        this(tabLayout, viewPager2, z, true, bVar);
    }

    public C5161d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, C5163b bVar) {
        this.f16498a = tabLayout;
        this.f16499b = viewPager2;
        this.f16500c = z;
        this.f16501d = z2;
        this.f16502e = bVar;
    }
}
