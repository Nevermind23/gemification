package ro0;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import he1.C41233s;
import ho0.C15581p;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p642vh.C18338b0;
import ro0.C17703e;
import so0.C17906b;
import uo0.C18273e;
import xn0.C18866x;

/* renamed from: ro0.h */
public final class C17709h extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C18866x f49447d;

    /* renamed from: e */
    private final C15581p f49448e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17709h(C18866x xVar, C17906b bVar) {
        super(xVar.mo3946b());
        C41536l.m120489i(xVar, "binding");
        this.f49447d = xVar;
        C15581p pVar = new C15581p();
        this.f49448e = pVar;
        xVar.f52795f.setAdapter(pVar);
        pVar.mo42830k(bVar);
    }

    /* renamed from: j */
    private final void m61395j(C18338b0 b0Var, int i) {
        this.f49448e.mo42831l(b0Var);
        this.f49447d.f52795f.setAdapter(this.f49448e);
        this.f49447d.f52795f.mo6606l(b0Var.mo46118c().mo46123a(i), false);
    }

    /* renamed from: h */
    public final void mo45275h(List list) {
        C41536l.m120489i(list, "offers");
        C18338b0 b = C18338b0.C18340b.m62692b(C18338b0.f51787c, list.size(), 0, false, false, 14, (Object) null);
        ViewPager2 viewPager2 = this.f49447d.f52795f;
        C41536l.m120488h(viewPager2, "binding.viewPager");
        FrameLayout frameLayout = this.f49447d.f52794e;
        C41536l.m120488h(frameLayout, "binding.sliderContainer");
        m61395j(b.mo46116a(viewPager2, frameLayout), list.size());
        this.f49448e.mo42832m(list);
    }

    /* renamed from: i */
    public final Map mo45276i(String str) {
        C41536l.m120489i(str, "page");
        List g = this.f49448e.mo42826g();
        C18273e eVar = (C18273e) g.get(this.f49448e.mo42827h().mo46117b().mo46119a(g.size(), this.f49447d.f52795f.getCurrentItem()));
        return C41344r0.m119933o(C41233s.m119492a(Long.valueOf(eVar.mo45962k()), new C17703e.C17705b(str, eVar.mo45962k(), eVar.mo45954e(), "topOffers", (String) null, 16, (DefaultConstructorMarker) null)));
    }
}
