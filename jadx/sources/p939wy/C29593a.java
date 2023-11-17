package p939wy;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.views.widgets.ProductExpandableItem;
import p366bk.C10313b;
import p366bk.C10318g;
import p366bk.C10319h;
import p90.C27319h5;
import p950xy.C29870a;

/* renamed from: wy.a */
public final class C29593a extends C1819o {

    /* renamed from: f */
    private final Client f74748f;

    /* renamed from: g */
    private final FragmentManager f74749g;

    /* renamed from: wy.a$a */
    private static final class C29594a extends C1796h.C1802f {

        /* renamed from: a */
        public static final C29594a f74750a = new C29594a();

        private C29594a() {
        }

        /* renamed from: d */
        public boolean mo5976a(C29870a aVar, C29870a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            return false;
        }

        /* renamed from: e */
        public boolean mo5977b(C29870a aVar, C29870a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            return false;
        }
    }

    /* renamed from: wy.a$b */
    public final class C29595b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27319h5 f74751d;

        /* renamed from: e */
        final /* synthetic */ C29593a f74752e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29595b(C29593a aVar, C27319h5 h5Var) {
            super(h5Var.mo3946b());
            C41536l.m120489i(h5Var, "binding");
            this.f74752e = aVar;
            this.f74751d = h5Var;
        }

        /* renamed from: h */
        private final ProductExpandableItem m89834h() {
            ProductExpandableItem productExpandableItem = new ProductExpandableItem(this.f74751d.mo3946b().getContext(), C10318g.f28616A, this.f74752e.mo69485k());
            this.f74751d.mo3946b().addView(productExpandableItem, m89835i());
            return productExpandableItem;
        }

        /* renamed from: i */
        private final FrameLayout.LayoutParams m89835i() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) this.itemView.getContext().getResources().getDimension(C10319h.product_parent_container_height));
            layoutParams.bottomMargin = (int) this.itemView.getContext().getResources().getDimension(C10319h.f28656z0);
            return layoutParams;
        }

        /* renamed from: k */
        private final void m89836k(C29870a aVar, ProductExpandableItem productExpandableItem) {
            int i;
            if (aVar instanceof C29870a.C29873c) {
                i = 16;
            } else if (aVar instanceof C29870a.C29871a) {
                i = 8;
            } else if (aVar instanceof C29870a.C29872b) {
                i = 10;
            } else if (aVar instanceof C29870a.C29874d) {
                i = 15;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            productExpandableItem.setProductType(i);
        }

        /* renamed from: l */
        private final void m89837l(ProductExpandableItem productExpandableItem) {
            productExpandableItem.startAnimation(AnimationUtils.loadAnimation(productExpandableItem.getContext(), C10313b.infinite_alpha));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
            r4 = (p950xy.C29870a.C29874d) r4;
         */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo69490j(p950xy.C29870a r4) {
            /*
                r3 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                p90.h5 r0 = r3.f74751d
                android.widget.FrameLayout r0 = r0.mo3946b()
                r0.removeAllViews()
                ge.bog.mobilebank.ui.views.widgets.ProductExpandableItem r0 = r3.m89834h()
                r3.m89836k(r4, r0)
                boolean r1 = r4.mo70124a()
                if (r1 == 0) goto L_0x001f
                r3.m89837l(r0)
                return
            L_0x001f:
                r0.clearAnimation()
                boolean r1 = r4 instanceof p950xy.C29870a.C29873c
                if (r1 == 0) goto L_0x0032
                xy.a$c r4 = (p950xy.C29870a.C29873c) r4
                ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel r4 = r4.mo70133b()
                if (r4 == 0) goto L_0x006a
                r0.setBonusPlus(r4)
                goto L_0x006a
            L_0x0032:
                boolean r1 = r4 instanceof p950xy.C29870a.C29871a
                if (r1 == 0) goto L_0x0042
                xy.a$a r4 = (p950xy.C29870a.C29871a) r4
                ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel r4 = r4.mo70125b()
                if (r4 == 0) goto L_0x006a
                r0.setAmexPoints(r4)
                goto L_0x006a
            L_0x0042:
                boolean r1 = r4 instanceof p950xy.C29870a.C29872b
                if (r1 == 0) goto L_0x0052
                xy.a$b r4 = (p950xy.C29870a.C29872b) r4
                ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel r4 = r4.mo70129b()
                if (r4 == 0) goto L_0x006a
                r0.setCachBackPoints(r4)
                goto L_0x006a
            L_0x0052:
                boolean r1 = r4 instanceof p950xy.C29870a.C29874d
                if (r1 == 0) goto L_0x006a
                xy.a$d r4 = (p950xy.C29870a.C29874d) r4
                java.util.List r1 = r4.mo70137b()
                if (r1 == 0) goto L_0x006a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                int r4 = r4.mo70138c()
                r0.setScoolCards(r2, r4)
            L_0x006a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p939wy.C29593a.C29595b.mo69490j(xy.a):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29593a(Client client, FragmentManager fragmentManager) {
        super(C29594a.f74750a);
        C41536l.m120489i(client, "client");
        C41536l.m120489i(fragmentManager, "fragmentManager");
        this.f74748f = client;
        this.f74749g = fragmentManager;
    }

    /* renamed from: k */
    public final FragmentManager mo69485k() {
        return this.f74749g;
    }

    /* renamed from: l */
    public void onBindViewHolder(C29595b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo69490j((C29870a) g);
    }

    /* renamed from: m */
    public C29595b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27319h5 d = C27319h5.m84585d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C29595b(this, d);
    }
}
