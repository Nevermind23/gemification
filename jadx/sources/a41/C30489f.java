package a41;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b31.C31123l;
import he1.C41217g;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: a41.f */
public class C30489f extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C31123l f76488d;

    /* renamed from: e */
    private final C30482a f76489e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Integer f76490f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C43075l f76491g;

    /* renamed from: h */
    private final C41217g f76492h;

    /* renamed from: i */
    private final C30491b f76493i;

    /* renamed from: a41.f$a */
    static final class C30490a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30489f f76494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30490a(C30489f fVar) {
            super(0);
            this.f76494d = fVar;
        }

        /* renamed from: b */
        public final C30484c invoke() {
            C30484c cVar = new C30484c(this.f76494d.f76491g);
            cVar.mo70832o(this.f76494d.f76490f);
            return cVar;
        }
    }

    /* renamed from: a41.f$b */
    public static final class C30491b extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ C30489f f76495a;

        C30491b(C30489f fVar) {
            this.f76495a = fVar;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.f76495a.mo70838q().mo38233Q0(this.f76495a.m91790p().getItemId(i), i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30489f(C31123l lVar, C30482a aVar, Integer num, C43075l lVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, aVar, (i & 4) != 0 ? null : num, lVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m91788n(C30489f fVar, int i) {
        C41536l.m120489i(fVar, "this$0");
        fVar.f76488d.f77351e.post(new C30488e(fVar, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m91789o(C30489f fVar, int i) {
        C41536l.m120489i(fVar, "this$0");
        fVar.f76488d.f77351e.mo6606l(i, false);
        fVar.m91791r();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final C30484c m91790p() {
        return (C30484c) this.f76492h.getValue();
    }

    /* renamed from: r */
    private final void m91791r() {
        this.f76488d.f77351e.mo6603h(this.f76493i);
    }

    /* renamed from: s */
    private final void m91792s() {
        this.f76488d.f77351e.mo6614p(this.f76493i);
    }

    /* renamed from: m */
    public final void mo70837m(List list, int i) {
        C41536l.m120489i(list, "data");
        m91792s();
        m91790p().mo6030j(list, new C30487d(this, i));
        ScrollingPagerIndicator scrollingPagerIndicator = this.f76488d.f77352f;
        C41536l.m120488h(scrollingPagerIndicator, "binding.swiperIndicator");
        int i2 = 0;
        boolean z = true;
        if (list.size() <= 1) {
            z = false;
        }
        if (!z) {
            i2 = 8;
        }
        scrollingPagerIndicator.setVisibility(i2);
    }

    /* renamed from: q */
    public final C30482a mo70838q() {
        return this.f76489e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30489f(C31123l lVar, C30482a aVar, Integer num, C43075l lVar2) {
        super(lVar.mo3946b());
        C41536l.m120489i(lVar, "binding");
        C41536l.m120489i(aVar, "viewModel");
        C41536l.m120489i(lVar2, "onLoadFailed");
        this.f76488d = lVar;
        this.f76489e = aVar;
        this.f76490f = num;
        this.f76491g = lVar2;
        this.f76492h = C41219i.m119470b(new C30490a(this));
        this.f76493i = new C30491b(this);
        lVar.f77351e.setAdapter(m91790p());
        lVar.f77351e.setOrientation(0);
        ScrollingPagerIndicator scrollingPagerIndicator = lVar.f77352f;
        ViewPager2 viewPager2 = lVar.f77351e;
        C41536l.m120488h(viewPager2, "binding.headersViewPager");
        scrollingPagerIndicator.mo53672c(viewPager2);
    }
}
