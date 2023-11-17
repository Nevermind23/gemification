package p560ph;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C1136d1;
import androidx.recyclerview.widget.C1818n;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41212c;
import java.util.List;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.carousel.CarouselLayoutManager;
import p560ph.C17347a;
import p601sg.C17779d;
import ze1.C43420e;

/* renamed from: ph.g */
public abstract class C17359g extends LinearLayout {

    /* renamed from: d */
    private C17361b f48686d;

    /* renamed from: e */
    private C43420e f48687e = new C43420e(0, 0);

    /* renamed from: f */
    private final int f48688f = getResources().getDimensionPixelSize(C17779d.spacing_12);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1818n f48689g = new C1818n();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CarouselLayoutManager f48690h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public RecyclerView f48691i;

    /* renamed from: j */
    private C17347a f48692j;

    /* renamed from: ph.g$a */
    /* synthetic */ class C17360a implements CarouselLayoutManager.C13217a, C41532h {
        C17360a() {
        }

        /* renamed from: K */
        public final void mo35110K(int i) {
            C17359g.this.mo35111f(i);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CarouselLayoutManager.C13217a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(1, C17359g.this, C17359g.class, "onPeriodSelected", "onPeriodSelected(I)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: ph.g$b */
    public interface C17361b {
        /* renamed from: K */
        void mo44798K(int i);
    }

    /* renamed from: ph.g$c */
    public static final class C17362c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f48694d;

        /* renamed from: e */
        final /* synthetic */ C17359g f48695e;

        /* renamed from: f */
        final /* synthetic */ int f48696f;

        public C17362c(View view, C17359g gVar, int i) {
            this.f48694d = view;
            this.f48695e = gVar;
            this.f48696f = i;
        }

        public final void run() {
            int i;
            this.f48695e.f48690h.mo5197J1(this.f48696f - 3);
            C1818n c = this.f48695e.f48689g;
            CarouselLayoutManager a = this.f48695e.f48690h;
            View O = this.f48695e.f48690h.mo5199O(this.f48696f);
            if (O != null) {
                int[] c2 = c.mo6023c(a, O);
                RecyclerView b = this.f48695e.f48691i;
                RecyclerView recyclerView = null;
                if (b == null) {
                    C41536l.m120506z("recyclerView");
                    b = null;
                }
                if (c2 != null) {
                    i = c2[0];
                } else {
                    i = 0;
                }
                b.scrollBy(i, 0);
                C17363h hVar = C17363h.f48697a;
                RecyclerView b2 = this.f48695e.f48691i;
                if (b2 == null) {
                    C41536l.m120506z("recyclerView");
                } else {
                    recyclerView = b2;
                }
                hVar.mo44800a(recyclerView, this.f48696f, this.f48695e.f48689g);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17359g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(context);
        this.f48690h = carouselLayoutManager;
        setOrientation(1);
        setGravity(1);
        carouselLayoutManager.mo35109f3(new C17360a());
    }

    /* renamed from: e */
    private final void m60746e(int i) {
        this.f48690h.mo5197J1(i - 3);
        RecyclerView recyclerView = this.f48691i;
        if (recyclerView == null) {
            C41536l.m120506z("recyclerView");
            recyclerView = null;
        }
        C41536l.m120488h(C1136d1.m4184a(recyclerView, new C17362c(recyclerView, this, i)), "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
    }

    /* renamed from: d */
    public final void mo44792d(RecyclerView recyclerView, C17347a.C17348a aVar) {
        C41536l.m120489i(recyclerView, "recyclerView");
        C41536l.m120489i(aVar, "carouselViewType");
        this.f48691i = recyclerView;
        this.f48692j = new C17347a(aVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(this.f48690h);
        recyclerView.mo5351j(new C17358f(this.f48688f));
        this.f48689g.mo6073b(recyclerView);
    }

    /* renamed from: f */
    public void mo35111f(int i) {
        C17361b bVar = this.f48686d;
        if (bVar != null) {
            bVar.mo44798K(i);
        }
    }

    /* renamed from: g */
    public final void mo44793g(Integer num) {
        List z0 = C41358y.m120036z0(this.f48687e);
        int b0 = C41358y.m120012b0(z0, num);
        if (b0 == -1) {
            b0 = 0;
        }
        m60746e((((Integer.MAX_VALUE / z0.size()) / 2) * z0.size()) + b0);
    }

    /* renamed from: h */
    public final void mo44794h(C43420e eVar, Integer num) {
        C41536l.m120489i(eVar, "periodRange");
        this.f48687e = eVar;
        List z0 = C41358y.m120036z0(eVar);
        RecyclerView recyclerView = this.f48691i;
        C17347a aVar = null;
        if (recyclerView == null) {
            C41536l.m120506z("recyclerView");
            recyclerView = null;
        }
        C17347a aVar2 = this.f48692j;
        if (aVar2 == null) {
            C41536l.m120506z("recyclerAdapter");
            aVar2 = null;
        }
        recyclerView.setAdapter(aVar2);
        C17347a aVar3 = this.f48692j;
        if (aVar3 == null) {
            C41536l.m120506z("recyclerAdapter");
        } else {
            aVar = aVar3;
        }
        aVar.mo44761h(z0);
        mo44793g(num);
    }

    public final void setPeriodSelectionListener(C17361b bVar) {
        this.f48686d = bVar;
    }
}
