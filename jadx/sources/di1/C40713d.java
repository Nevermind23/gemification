package di1;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p881ru.tinkoff.scrollingpagerindicator.C42388a;
import p881ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* renamed from: di1.d */
public class C40713d extends C42388a {

    /* renamed from: a */
    private RecyclerView.C1739j f96401a;

    /* renamed from: b */
    private RecyclerView.C1736h f96402b;

    /* renamed from: c */
    private ViewPager2.C1928i f96403c;

    /* renamed from: d */
    private ViewPager2 f96404d;

    /* renamed from: di1.d$a */
    class C40714a extends RecyclerView.C1739j {

        /* renamed from: a */
        final /* synthetic */ ScrollingPagerIndicator f96405a;

        C40714a(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f96405a = scrollingPagerIndicator;
        }

        /* renamed from: a */
        public void mo5583a() {
            this.f96405a.mo97852k();
        }
    }

    /* renamed from: di1.d$b */
    class C40715b extends ViewPager2.C1928i {

        /* renamed from: a */
        boolean f96407a = true;

        /* renamed from: b */
        final /* synthetic */ ScrollingPagerIndicator f96408b;

        C40715b(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f96408b = scrollingPagerIndicator;
        }

        public void onPageScrollStateChanged(int i) {
            this.f96407a = i == 0;
        }

        public void onPageScrolled(int i, float f, int i2) {
            C40713d.this.mo97864c(this.f96408b, i, f);
        }

        public void onPageSelected(int i) {
            if (this.f96407a) {
                C40713d.this.m117876f(this.f96408b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m117876f(ScrollingPagerIndicator scrollingPagerIndicator) {
        scrollingPagerIndicator.setDotCount(this.f96402b.getItemCount());
        scrollingPagerIndicator.setCurrentPosition(this.f96404d.getCurrentItem());
    }

    /* renamed from: a */
    public void mo94871a() {
        this.f96402b.unregisterAdapterDataObserver(this.f96401a);
        this.f96404d.mo6614p(this.f96403c);
    }

    /* renamed from: e */
    public void mo94872b(ScrollingPagerIndicator scrollingPagerIndicator, ViewPager2 viewPager2) {
        RecyclerView.C1736h adapter = viewPager2.getAdapter();
        this.f96402b = adapter;
        if (adapter != null) {
            this.f96404d = viewPager2;
            m117876f(scrollingPagerIndicator);
            C40714a aVar = new C40714a(scrollingPagerIndicator);
            this.f96401a = aVar;
            this.f96402b.registerAdapterDataObserver(aVar);
            C40715b bVar = new C40715b(scrollingPagerIndicator);
            this.f96403c = bVar;
            viewPager2.mo6603h(bVar);
            return;
        }
        throw new IllegalStateException("Set adapter before call attachToPager() method");
    }
}
