package wz0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import he1.C41217g;
import he1.C41238w;
import hy0.C36269c;
import iy0.C36603i0;
import java.util.List;
import jz0.C36848c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: wz0.b */
public final class C39751b extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C36603i0 f94439d;

    /* renamed from: e */
    private C43075l f94440e;

    /* renamed from: f */
    private C43079p f94441f;

    /* renamed from: g */
    private final C41217g f94442g = C41219i.m119470b(C39755d.f94446d);

    /* renamed from: wz0.b$a */
    static final class C39752a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39751b f94443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39752a(C39751b bVar) {
            super(1);
            this.f94443d = bVar;
        }

        /* renamed from: a */
        public final void mo93494a(long j) {
            C43075l k = this.f94443d.mo93490k();
            if (k != null) {
                k.invoke(Long.valueOf(j));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93494a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: wz0.b$b */
    static final class C39753b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C39751b f94444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39753b(C39751b bVar) {
            super(2);
            this.f94444d = bVar;
        }

        /* renamed from: a */
        public final void mo93495a(long j, boolean z) {
            C43079p l = this.f94444d.mo93491l();
            if (l != null) {
                l.invoke(Long.valueOf(j), Boolean.valueOf(z));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo93495a(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: wz0.b$c */
    public static final class C39754c extends RecyclerView.C1746o {

        /* renamed from: a */
        final /* synthetic */ int f94445a;

        C39754c(int i) {
            this.f94445a = i;
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            int i = this.f94445a;
            rect.right = i;
            rect.left = i;
        }
    }

    /* renamed from: wz0.b$d */
    static final class C39755d extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C39755d f94446d = new C39755d();

        C39755d() {
            super(0);
        }

        /* renamed from: b */
        public final C36848c invoke() {
            return new C36848c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39751b(C36603i0 i0Var) {
        super(i0Var.mo3946b());
        C41536l.m120489i(i0Var, "binding");
        this.f94439d = i0Var;
        ViewPager2 viewPager2 = i0Var.f88269e;
        viewPager2.setAdapter(m115520m());
        viewPager2.setOrientation(0);
        viewPager2.setOffscreenPageLimit(1);
        m115520m().mo89771o(new C39752a(this));
        m115520m().mo89772p(new C39753b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m115519j(int i, int i2, View view, float f) {
        C41536l.m120489i(view, "page");
        view.setTranslationX(((float) (-(i + i2))) * f);
        view.setScaleY(((float) 1) - (Math.abs(f) * 0.1f));
    }

    /* renamed from: m */
    private final C36848c m115520m() {
        return (C36848c) this.f94442g.getValue();
    }

    /* renamed from: i */
    public final void mo93489i(List list) {
        C41536l.m120489i(list, "cards");
        m115520m().mo6029i(list);
        if (list.size() > 1) {
            int dimensionPixelSize = this.f94439d.f88269e.getContext().getResources().getDimensionPixelSize(C36269c.f87460a);
            this.f94439d.f88269e.setPageTransformer(new C39750a(dimensionPixelSize, this.f94439d.f88269e.getContext().getResources().getDimensionPixelSize(C36269c.f87461b)));
            if (this.f94439d.f88269e.getItemDecorationCount() == 0) {
                this.f94439d.f88269e.mo6588a(new C39754c(dimensionPixelSize));
            }
        } else if (this.f94439d.f88269e.getItemDecorationCount() > 0) {
            this.f94439d.f88269e.mo6604i(0);
        }
    }

    /* renamed from: k */
    public final C43075l mo93490k() {
        return this.f94440e;
    }

    /* renamed from: l */
    public final C43079p mo93491l() {
        return this.f94441f;
    }

    /* renamed from: n */
    public final void mo93492n(C43075l lVar) {
        this.f94440e = lVar;
    }

    /* renamed from: o */
    public final void mo93493o(C43079p pVar) {
        this.f94441f = pVar;
    }
}
