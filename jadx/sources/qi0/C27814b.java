package qi0;

import androidx.viewpager2.widget.ViewPager2;
import gb1.C32395y;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import mi0.C26233a;
import mi0.C26234b;
import mj0.C26238b;
import oh0.C27008c;
import oi0.C27015a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import pi0.C27534a;
import th0.C28391b0;

/* renamed from: qi0.b */
public final class C27814b extends C26238b {

    /* renamed from: f */
    private final C27015a f70946f;

    /* renamed from: g */
    private final C26233a f70947g;

    /* renamed from: qi0.b$a */
    private static final class C27815a extends ViewPager2.C1928i {

        /* renamed from: a */
        private final C27015a f70948a;

        public C27815a(C27015a aVar) {
            C41536l.m120489i(aVar, "listener");
            this.f70948a = aVar;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.f70948a.mo61789R0(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27814b(C28391b0 b0Var, List list, C26234b bVar, C27015a aVar) {
        super(b0Var);
        C41536l.m120489i(b0Var, "binding");
        C41536l.m120489i(list, "items");
        C41536l.m120489i(bVar, "eventHandler");
        C41536l.m120489i(aVar, "listener");
        this.f70946f = aVar;
        C26233a aVar2 = new C26233a(list, bVar);
        this.f70947g = aVar2;
        b0Var.f71987e.setAdapter(aVar2);
        int dimensionPixelSize = b0Var.mo3946b().getResources().getDimensionPixelSize(C27008c.f67784a);
        ViewPager2 viewPager2 = b0Var.f71987e;
        C41536l.m120488h(viewPager2, "animationsViewPager");
        C32395y.m95667b(viewPager2, dimensionPixelSize, dimensionPixelSize);
        b0Var.f71987e.setOffscreenPageLimit(1);
        ScrollingPagerIndicator scrollingPagerIndicator = b0Var.f71988f;
        ViewPager2 viewPager22 = b0Var.f71987e;
        C41536l.m120488h(viewPager22, "binding.animationsViewPager");
        scrollingPagerIndicator.mo53672c(viewPager22);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m85989o(C28391b0 b0Var, C27534a.C27539e eVar, C27814b bVar) {
        C41536l.m120489i(b0Var, "$this_with");
        C41536l.m120489i(eVar, "$item");
        C41536l.m120489i(bVar, "this$0");
        b0Var.f71987e.mo6606l(eVar.mo66880b(), false);
        bVar.m85990p();
    }

    /* renamed from: p */
    private final void m85990p() {
        ((C28391b0) mo65241h()).f71987e.mo6603h(new C27815a(this.f70946f));
    }

    /* renamed from: q */
    private final void m85991q() {
        ((C28391b0) mo65241h()).f71987e.mo6614p(new C27815a(this.f70946f));
    }

    /* renamed from: n */
    public void mo48397j(C27534a.C27539e eVar) {
        C41536l.m120489i(eVar, "item");
        C28391b0 b0Var = (C28391b0) mo65241h();
        super.mo48397j(eVar);
        m85991q();
        this.f70947g.mo6030j(eVar.mo66879a(), new C27813a(b0Var, eVar, this));
        ScrollingPagerIndicator scrollingPagerIndicator = b0Var.f71988f;
        C41536l.m120488h(scrollingPagerIndicator, "swiperIndicator");
        int i = 0;
        boolean z = true;
        if (eVar.mo66879a().size() <= 1) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        scrollingPagerIndicator.setVisibility(i);
    }
}
