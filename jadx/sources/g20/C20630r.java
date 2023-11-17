package g20;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C1940c;
import androidx.viewpager2.widget.ViewPager2;
import g91.C32343x;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import p341ge.bog.mobilebank.cleanarch.presentation.home.layouts.HorizontalPagerViewLayout;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43075l;

/* renamed from: g20.r */
public final class C20630r extends RecyclerView.C1734f0 {

    /* renamed from: i */
    public static final C20632b f55716i = new C20632b((DefaultConstructorMarker) null);

    /* renamed from: j */
    private static final int f55717j = C32343x.m95394I(10);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C43075l f55718d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f55719e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public HorizontalPagerViewLayout f55720f;

    /* renamed from: g */
    private C1940c f55721g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ScrollingPagerIndicator f55722h;

    /* renamed from: g20.r$a */
    public static final class C20631a extends RecyclerView.C1739j {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1736h f55723a;

        /* renamed from: b */
        final /* synthetic */ C20630r f55724b;

        C20631a(RecyclerView.C1736h hVar, C20630r rVar) {
            this.f55723a = hVar;
            this.f55724b = rVar;
        }

        /* renamed from: a */
        public void mo5583a() {
            if (this.f55723a.getItemCount() <= 1) {
                this.f55724b.f55722h.setVisibility(8);
            } else {
                this.f55724b.f55722h.setVisibility(0);
            }
            if (this.f55723a.getItemCount() > 0) {
                this.f55724b.f55720f.getViewPager().setCurrentItem(0);
            }
        }

        /* renamed from: d */
        public void mo5586d(int i, int i2) {
            if (this.f55723a.getItemCount() > 0) {
                this.f55724b.f55720f.getViewPager().setCurrentItem(0);
            }
        }

        /* renamed from: f */
        public void mo5588f(int i, int i2) {
            if (this.f55723a.getItemCount() <= 1) {
                this.f55724b.f55722h.setVisibility(8);
            } else {
                this.f55724b.f55722h.setVisibility(0);
            }
        }
    }

    /* renamed from: g20.r$b */
    public static final class C20632b {
        private C20632b() {
        }

        public /* synthetic */ C20632b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C20630r m66943b(C20632b bVar, ViewGroup viewGroup, RecyclerView.C1736h hVar, C43075l lVar, int i, Object obj) {
            if ((i & 4) != 0) {
                lVar = null;
            }
            return bVar.mo49176a(viewGroup, hVar, lVar);
        }

        /* renamed from: a */
        public final C20630r mo49176a(ViewGroup viewGroup, RecyclerView.C1736h hVar, C43075l lVar) {
            C41536l.m120489i(viewGroup, "parent");
            C41536l.m120489i(hVar, "adapter");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_card_swiper_layout, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context)\n   …er_layout, parent, false)");
            return new C20630r(inflate, hVar, lVar);
        }
    }

    /* renamed from: g20.r$c */
    public static final class C20633c extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ C20630r f55725a;

        C20633c(C20630r rVar) {
            this.f55725a = rVar;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            C43075l k = this.f55725a.f55718d;
            if (k != null) {
                k.invoke(Integer.valueOf(i));
            }
            if (this.f55725a.f55719e != -1) {
                C36546y.m108282F().mo27153t("home", "", "swipe_card", Long.valueOf((long) (i - this.f55725a.f55719e)));
                this.f55725a.f55719e = i;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20630r(View view, RecyclerView.C1736h hVar, C43075l lVar) {
        super(view);
        C41536l.m120489i(view, "itemView");
        C41536l.m120489i(hVar, "adapter");
        View findViewById = view.findViewById(C10322k.card_view_layout);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.card_view_layout)");
        this.f55720f = (HorizontalPagerViewLayout) findViewById;
        this.f55721g = new C1940c();
        View findViewById2 = view.findViewById(C10322k.f28747Hw);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.swiper_indicator)");
        this.f55722h = (ScrollingPagerIndicator) findViewById2;
        this.f55718d = lVar;
        this.f55720f.getViewPager().setOrientation(0);
        this.f55720f.getViewPager().setAdapter(hVar);
        this.f55720f.getViewPager().setOffscreenPageLimit(1);
        this.f55721g.mo6661b(new C20628p(this));
        this.f55721g.mo6661b(new C20629q(this));
        this.f55720f.getViewPager().setPageTransformer(this.f55721g);
        m66937o();
        this.f55722h.mo53672c(this.f55720f.getViewPager());
        hVar.registerAdapterDataObserver(new C20631a(hVar, this));
    }

    /* renamed from: o */
    private final void m66937o() {
        this.f55720f.getViewPager().mo6603h(new C20633c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m66938p(View view, float f) {
        if (f <= 1.0f) {
            float max = Math.max(0.85f, ((float) 1) - Math.abs(f));
            view.setScaleX(max);
            view.setScaleY(max);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m66939q(View view, float f) {
        view.setTranslationX((-f) * (((float) (-f55717j)) + (((float) view.getWidth()) * 0.06374999f)));
    }
}
