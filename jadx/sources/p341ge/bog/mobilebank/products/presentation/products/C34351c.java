package p341ge.bog.mobilebank.products.presentation.products;

import a01.C30428f;
import a01.C30430g;
import a01.C30432h;
import a01.C30434i;
import a01.C30436j;
import a01.C30438k;
import a01.C30440l;
import a01.C30442m;
import a01.C30444n;
import a01.C30446o;
import a01.C30448p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import h00.C24849e;
import hy0.C36270d;
import hy0.C36272f;
import hy0.C36274h;
import iu0.C36546y;
import iy0.C36579a0;
import iy0.C36582b0;
import iy0.C36583b1;
import iy0.C36585c0;
import iy0.C36588d0;
import iy0.C36597g0;
import iy0.C36610k1;
import iy0.C36641v;
import iy0.C36644w;
import iy0.C36647x;
import iy0.C36650y;
import iy0.C36653z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.productgroup.ProductGroupView;
import p341ge.bog.mobilebank.products.presentation.products.C34366d;
import p380ck.C10463g;
import q31.C38122f;
import q31.C38125h;
import q70.C27685a;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.products.presentation.products.c */
public final class C34351c extends C1819o {

    /* renamed from: k */
    public static final C34354c f83295k = new C34354c((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C30448p f83296f;

    /* renamed from: g */
    private final boolean f83297g;

    /* renamed from: h */
    private C43079p f83298h;

    /* renamed from: i */
    private C43079p f83299i;

    /* renamed from: j */
    private View.OnClickListener f83300j;

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$a */
    public final class C34352a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36641v f83301d;

        /* renamed from: e */
        final /* synthetic */ C34351c f83302e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34352a(C34351c cVar, C36641v vVar) {
            super(vVar.mo3946b());
            C41536l.m120489i(vVar, "binding");
            this.f83302e = cVar;
            this.f83301d = vVar;
            vVar.f88440e.setOnClickListener(new C30436j(this, cVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m101011i(C34352a aVar, C34351c cVar, View view) {
            C43079p t;
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            if (aVar.getAdapterPosition() != -1 && (C34351c.m100997p(cVar, aVar.getAdapterPosition()) instanceof C34366d.C34367a) && (t = cVar.mo82735t()) != null) {
                C34366d p = C34351c.m100997p(cVar, aVar.getAdapterPosition());
                C41536l.m120487g(p, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.AccountCardItem");
                t.invoke(Long.valueOf(((C34366d.C34367a) p).mo82747d()), 1);
            }
        }

        /* renamed from: j */
        public final void mo82737j(C34366d.C34367a aVar) {
            C41536l.m120489i(aVar, "item");
            this.f83301d.f88440e.setData(aVar.mo82748e());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$b */
    public final class C34353b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36597g0 f83303d;

        /* renamed from: e */
        final /* synthetic */ C34351c f83304e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34353b(C34351c cVar, C36597g0 g0Var) {
            super(g0Var.mo3946b());
            C41536l.m120489i(g0Var, "binding");
            this.f83304e = cVar;
            this.f83303d = g0Var;
            g0Var.f88208e.setOnClickListener(new C30438k(this, cVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m101014i(C34353b bVar, C34351c cVar, View view) {
            C43079p t;
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            if (bVar.getAdapterPosition() != -1 && (C34351c.m100997p(cVar, bVar.getAdapterPosition()) instanceof C34366d.C34367a) && (t = cVar.mo82735t()) != null) {
                C34366d p = C34351c.m100997p(cVar, bVar.getAdapterPosition());
                C41536l.m120487g(p, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.AccountCardItem");
                t.invoke(Long.valueOf(((C34366d.C34367a) p).mo82747d()), 1);
            }
        }

        /* renamed from: j */
        public final void mo82738j(C34366d.C34367a aVar) {
            C41536l.m120489i(aVar, "item");
            this.f83303d.f88208e.setData(aVar.mo82748e());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$c */
    public static final class C34354c {
        private C34354c() {
        }

        public /* synthetic */ C34354c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$d */
    public final class C34355d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36644w f83305d;

        /* renamed from: e */
        final /* synthetic */ C34351c f83306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34355d(C34351c cVar, C36644w wVar) {
            super(wVar.mo3946b());
            C41536l.m120489i(wVar, "binding");
            this.f83306e = cVar;
            this.f83305d = wVar;
            wVar.f88447e.setOnClickListener(new C30440l(this, cVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m101017i(C34355d dVar, C34351c cVar, View view) {
            C43079p t;
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            if (dVar.getAdapterPosition() != -1 && (C34351c.m100997p(cVar, dVar.getAdapterPosition()) instanceof C34366d.C34369c) && (t = cVar.mo82735t()) != null) {
                C34366d p = C34351c.m100997p(cVar, dVar.getAdapterPosition());
                C41536l.m120487g(p, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.CreditCardItem");
                t.invoke(Long.valueOf(((C34366d.C34369c) p).mo82749d()), 2);
            }
        }

        /* renamed from: j */
        public final void mo82739j(C34366d.C34369c cVar) {
            C41536l.m120489i(cVar, "item");
            this.f83305d.f88447e.setData(cVar.mo82750e());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$e */
    public final class C34356e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36610k1 f83307d;

        /* renamed from: e */
        final /* synthetic */ C34351c f83308e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34356e(C34351c cVar, C36610k1 k1Var) {
            super(k1Var.mo3946b());
            C41536l.m120489i(k1Var, "binding");
            this.f83308e = cVar;
            this.f83307d = k1Var;
            k1Var.f88305e.setOnClickListener(new C30442m(this, cVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m101020i(C34356e eVar, C34351c cVar, View view) {
            C43079p t;
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            if (eVar.getAdapterPosition() != -1 && (C34351c.m100997p(cVar, eVar.getAdapterPosition()) instanceof C34366d.C34369c) && (t = cVar.mo82735t()) != null) {
                C34366d p = C34351c.m100997p(cVar, eVar.getAdapterPosition());
                C41536l.m120487g(p, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.CreditCardItem");
                t.invoke(Long.valueOf(((C34366d.C34369c) p).mo82749d()), 2);
            }
        }

        /* renamed from: j */
        public final void mo82740j(C34366d.C34369c cVar) {
            C41536l.m120489i(cVar, "item");
            this.f83307d.f88305e.setData(cVar.mo82750e());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$f */
    public final class C34357f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36647x f83309d;

        /* renamed from: e */
        final /* synthetic */ C34351c f83310e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34357f(C34351c cVar, C36647x xVar) {
            super(xVar.mo3946b());
            C41536l.m120489i(xVar, "binding");
            this.f83310e = cVar;
            this.f83309d = xVar;
        }

        /* renamed from: h */
        public final void mo82741h(boolean z) {
            int i;
            this.f83309d.mo3946b().removeAllViews();
            FrameLayout c = this.f83309d.mo3946b();
            Context context = this.f83309d.mo3946b().getContext();
            C41536l.m120488h(context, "binding.root.context");
            if (z) {
                i = C36272f.skeleton_wide;
            } else {
                i = C36272f.skeleton_square;
            }
            c.addView(new LoadingView(context, 1, i, false, (LoadingView.C13376b) null, 24, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$g */
    public final class C34358g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36650y f83311d;

        /* renamed from: e */
        final /* synthetic */ C34351c f83312e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34358g(C34351c cVar, C36650y yVar) {
            super(yVar.mo3946b());
            C41536l.m120489i(yVar, "binding");
            this.f83312e = cVar;
            this.f83311d = yVar;
            yVar.mo3946b().setOnClickListener(new C30444n(cVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m101024i(C34351c cVar, C34358g gVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(gVar, "this$1");
            cVar.m101004y(gVar.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82742j(C34366d.C34371e eVar) {
            C41536l.m120489i(eVar, "item");
            C34351c cVar = this.f83312e;
            ProductGroupView c = this.f83311d.mo3946b();
            C41536l.m120488h(c, "binding.root");
            cVar.m100999r(c, eVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$h */
    public /* synthetic */ class C34359h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83313a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                q70.a[] r0 = q70.C27685a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                q70.a r1 = q70.C27685a.ACC_TYPE_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                q70.a r1 = q70.C27685a.ACC_TYPE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                q70.a r1 = q70.C27685a.ACC_TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                q70.a r1 = q70.C27685a.ACC_TYPE_LOAN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                q70.a r1 = q70.C27685a.ACC_TYPE_GT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                q70.a r1 = q70.C27685a.ACC_TYPE_PENSION     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                q70.a r1 = q70.C27685a.PIGGY_BANK     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                q70.a r1 = q70.C27685a.TYPE_GTP_TRADING     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                q70.a r1 = q70.C27685a.BNPL     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f83313a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.C34351c.C34359h.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$i */
    public final class C34360i extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36653z f83314d;

        /* renamed from: e */
        final /* synthetic */ C34351c f83315e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34360i(C34351c cVar, C36653z zVar) {
            super(zVar.mo3946b());
            C41536l.m120489i(zVar, "binding");
            this.f83315e = cVar;
            this.f83314d = zVar;
            zVar.mo3946b().setOnClickListener(new C30446o(cVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m101027i(C34351c cVar, C34360i iVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(iVar, "this$1");
            cVar.m101004y(iVar.getAdapterPosition());
        }

        /* renamed from: j */
        public final void mo82743j(C34366d.C34371e eVar) {
            C41536l.m120489i(eVar, "item");
            C34351c cVar = this.f83315e;
            ProductGroupView c = this.f83314d.mo3946b();
            C41536l.m120488h(c, "binding.root");
            cVar.m100999r(c, eVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$j */
    public static final class C34361j extends RecyclerView.C1734f0 {
        C34361j(Button button) {
            super(button);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$k */
    public static final class C34362k extends RecyclerView.C1734f0 {
        C34362k(FrameLayout frameLayout) {
            super(frameLayout);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$l */
    public static final class C34363l extends RecyclerView.C1734f0 {
        C34363l(FrameLayout frameLayout) {
            super(frameLayout);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$m */
    public static final class C34364m extends RecyclerView.C1734f0 {
        C34364m(FrameLayout frameLayout) {
            super(frameLayout);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.c$n */
    public static final class C34365n extends RecyclerView.C1734f0 {
        C34365n(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34351c(C30448p pVar, boolean z) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(pVar, "viewModel");
        this.f83296f = pVar;
        this.f83297g = z;
    }

    /* renamed from: p */
    public static final /* synthetic */ C34366d m100997p(C34351c cVar, int i) {
        return (C34366d) cVar.mo6027g(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m100999r(ProductGroupView productGroupView, C34366d.C34371e eVar) {
        Amount k = eVar.mo82759k();
        if (k != null) {
            productGroupView.setAmount(k);
        }
        Integer f = eVar.mo82754f();
        if (f != null) {
            productGroupView.setIcon(productGroupView.getContext().getDrawable(f.intValue()));
        }
        String h = eVar.mo82756h();
        if (h != null) {
            productGroupView.mo36581a(h, eVar.mo82757i(), eVar.mo82755g());
        }
        productGroupView.setBadgeVisible(eVar.mo82753e());
        productGroupView.setTitle(eVar.mo82758j());
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m101000u(View view) {
        C32054a.C32072r rVar = C32054a.C32072r.f78913f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(rVar, F, " ", " ");
        Context context = view.getContext();
        C41536l.m120488h(context, "it.context");
        C38122f c = C38125h.m112238c(context);
        Context context2 = view.getContext();
        C41536l.m120488h(context2, "it.context");
        C38122f.C38123a.m112226v(c, context2, (String) null, (String) null, false, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m101001v(C34351c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C36546y.m108282F().mo27152s("Products_Page", (String) null, "Pension_banner_click");
        cVar.f83296f.mo70788rb();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m101002w(View view) {
        C36546y.m108282F().mo27152s("Products_Page", (String) null, "check_my_limit_banner_click");
        Context context = view.getContext();
        C41536l.m120488h(context, "it.context");
        C38122f c = C38125h.m112238c(context);
        C24849e eVar = C24849e.CLIENT_LIMIT;
        Context context2 = view.getContext();
        C41536l.m120488h(context2, "it.context");
        c.mo91637w0(eVar, context2);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m101003x(C34351c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.f83296f.mo70787c();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m101004y(int i) {
        String str;
        int i2 = -1;
        if (i != -1) {
            C27685a b = ((C34366d) mo6027g(i)).mo82745b();
            if (b != null) {
                i2 = C34359h.f83313a[b.ordinal()];
            }
            switch (i2) {
                case 1:
                    str = "Accounts_and_cards_click";
                    break;
                case 2:
                    str = "Creditcards_click";
                    break;
                case 3:
                    str = "Deposits_card_click";
                    break;
                case 4:
                    str = "Loans_card_click";
                    break;
                case 5:
                    str = "GT_card_click";
                    break;
                case 6:
                    str = "Pension_card_click";
                    break;
                case 7:
                    str = "Piggy_bank_click";
                    break;
                case 8:
                    str = "click_open_from_products";
                    break;
                case 9:
                    str = "Bnpl_card_click";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                if (C41536l.m120484d(str, "click_open_from_products")) {
                    C32054a.C32073s sVar = C32054a.C32073s.f78914f;
                    C10463g F = C36546y.m108282F();
                    C41536l.m120488h(F, "getAnalytics()");
                    C32081a.m94499a(sVar, F, str, " ");
                } else {
                    C36546y.m108282F().mo27152s("Products_Page", (String) null, str);
                }
            }
            C43079p pVar = this.f83298h;
            if (pVar != null) {
                C27685a b2 = ((C34366d) mo6027g(i)).mo82745b();
                C41536l.m120486f(b2);
                Object g = mo6027g(i);
                C41536l.m120487g(g, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.ProductGroup");
                pVar.invoke(b2, ((C34366d.C34371e) g).mo82752d());
            }
        }
    }

    /* renamed from: A */
    public final void mo82732A(C43079p pVar) {
        this.f83298h = pVar;
    }

    /* renamed from: B */
    public final void mo82733B(C43079p pVar) {
        this.f83299i = pVar;
    }

    public int getItemViewType(int i) {
        C34366d dVar = (C34366d) mo6027g(i);
        if (dVar instanceof C34366d.C34367a) {
            if (((C34366d) mo6027g(i)).mo82744a() == 1) {
                return C36272f.grid_item_account_card_square;
            }
            return C36272f.item_account_card_wide;
        } else if (dVar instanceof C34366d.C34369c) {
            if (((C34366d) mo6027g(i)).mo82744a() == 1) {
                return C36272f.grid_item_credit_card_square;
            }
            return C36272f.item_credit_card_wide;
        } else if (dVar instanceof C34366d.C34371e) {
            if (((C34366d) mo6027g(i)).mo82744a() == 1) {
                return C36272f.grid_item_product_group_square;
            }
            return C36272f.grid_item_product_group_wide;
        } else if (dVar instanceof C34366d.C34370d) {
            return C36272f.grid_item_loading;
        } else {
            if (dVar instanceof C34366d.C34375i) {
                return C36272f.grid_item_show_pension_sum_banner;
            }
            if (dVar instanceof C34366d.C34368b) {
                return C36272f.item_add_product_button;
            }
            if (dVar instanceof C34366d.C34372f) {
                return C36272f.grid_item_products_loading_error;
            }
            if (dVar instanceof C34366d.C34374h) {
                return C36272f.grid_item_show_gt_banner;
            }
            if (dVar instanceof C34366d.C34373g) {
                return C36272f.grid_item_show_client_limit_banner;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        boolean z;
        C41536l.m120489i(f0Var, "holder");
        int itemViewType = getItemViewType(i);
        if (itemViewType == C36272f.grid_item_product_group_wide) {
            Object g = mo6027g(i);
            C41536l.m120487g(g, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.ProductGroup");
            ((C34360i) f0Var).mo82743j((C34366d.C34371e) g);
        } else if (itemViewType == C36272f.grid_item_product_group_square) {
            Object g2 = mo6027g(i);
            C41536l.m120487g(g2, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.ProductGroup");
            ((C34358g) f0Var).mo82742j((C34366d.C34371e) g2);
        } else if (itemViewType == C36272f.item_account_card_wide) {
            Object g3 = mo6027g(i);
            C41536l.m120487g(g3, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.AccountCardItem");
            ((C34353b) f0Var).mo82738j((C34366d.C34367a) g3);
        } else if (itemViewType == C36272f.grid_item_account_card_square) {
            Object g4 = mo6027g(i);
            C41536l.m120487g(g4, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.AccountCardItem");
            ((C34352a) f0Var).mo82737j((C34366d.C34367a) g4);
        } else if (itemViewType == C36272f.item_credit_card_wide) {
            Object g5 = mo6027g(i);
            C41536l.m120487g(g5, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.CreditCardItem");
            ((C34356e) f0Var).mo82740j((C34366d.C34369c) g5);
        } else if (itemViewType == C36272f.grid_item_credit_card_square) {
            Object g6 = mo6027g(i);
            C41536l.m120487g(g6, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.CreditCardItem");
            ((C34355d) f0Var).mo82739j((C34366d.C34369c) g6);
        } else if (itemViewType == C36272f.grid_item_loading) {
            C34357f fVar = (C34357f) f0Var;
            Object g7 = mo6027g(i);
            C41536l.m120487g(g7, "null cannot be cast to non-null type ge.bog.mobilebank.products.presentation.products.ProductsViewModel.GridItem.LoadingItem");
            if (((C34366d.C34370d) g7).mo82744a() == 2) {
                z = true;
            } else {
                z = false;
            }
            fVar.mo82741h(z);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        String str;
        String str2;
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C36272f.item_add_product_button) {
            C36583b1 d = C36583b1.m108458d(from, viewGroup, false);
            d.mo3946b().setOnClickListener(this.f83300j);
            C41536l.m120488h(d, "inflate(\n               …licked)\n                }");
            return new C34361j(d.mo3946b());
        } else if (i == C36272f.grid_item_product_group_wide) {
            C36653z d2 = C36653z.m108747d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C34360i(this, d2);
        } else if (i == C36272f.grid_item_product_group_square) {
            C36650y d3 = C36650y.m108736d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …  false\n                )");
            return new C34358g(this, d3);
        } else if (i == C36272f.grid_item_show_gt_banner) {
            C36585c0 d4 = C36585c0.m108466d(from, viewGroup, false);
            d4.f88161e.setButtonVisible(true);
            d4.f88161e.setBannerImage(new Image.Resource(C36270d.product_group_wide_galt, (Boolean) null, 2, (DefaultConstructorMarker) null));
            d4.f88161e.setInfoText(C32343x.m95388F("text.gt.banners.text.investments", new Object[0]));
            d4.f88161e.setShowMoreText(C32343x.m95388F("text.gt.banners.text.call.to.action", new Object[0]));
            d4.mo3946b().setOnClickListener(new C30428f());
            C41536l.m120488h(d4, "inflate(\n               …      }\n                }");
            return new C34362k(d4.mo3946b());
        } else if (i == C36272f.grid_item_show_pension_sum_banner) {
            C36588d0 d5 = C36588d0.m108479d(from, viewGroup, false);
            d5.f88174e.setButtonVisible(true);
            d5.f88174e.setBannerImage(new Image.Resource(C36270d.product_group_wide_pension, (Boolean) null, 2, (DefaultConstructorMarker) null));
            BannerCard bannerCard = d5.f88174e;
            if (this.f83297g) {
                str = d5.mo3946b().getContext().getString(C36274h.pension_banner_info_solo);
            } else {
                str = d5.mo3946b().getContext().getString(C36274h.pension_banner_info);
            }
            bannerCard.setInfoText(str);
            BannerCard bannerCard2 = d5.f88174e;
            if (this.f83297g) {
                str2 = d5.mo3946b().getContext().getString(C36274h.see_more_solo);
            } else {
                str2 = d5.mo3946b().getContext().getString(C36274h.see_more);
            }
            bannerCard2.setShowMoreText(str2);
            d5.mo3946b().setOnClickListener(new C30430g(this));
            C41536l.m120488h(d5, "inflate(\n               …      }\n                }");
            return new C34363l(d5.mo3946b());
        } else if (i == C36272f.grid_item_show_client_limit_banner) {
            C36582b0 d6 = C36582b0.m108454d(from, viewGroup, false);
            BannerCard bannerCard3 = d6.f88156e;
            bannerCard3.setButtonVisible(true);
            bannerCard3.setBannerImage(new Image.Resource(C36270d.product_group_wide_client_limit, (Boolean) null, 2, (DefaultConstructorMarker) null));
            bannerCard3.setInfoText(C32343x.m95388F("check.my.limit.banner.main.text", new Object[0]));
            bannerCard3.setShowMoreText(C32343x.m95388F("check.my.limit.banner.button.label", new Object[0]));
            d6.mo3946b().setOnClickListener(new C30432h());
            C41536l.m120488h(d6, "inflate(\n               …      }\n                }");
            return new C34364m(d6.mo3946b());
        } else if (i == C36272f.item_account_card_wide) {
            C36597g0 d7 = C36597g0.m108516d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(\n               …  false\n                )");
            return new C34353b(this, d7);
        } else if (i == C36272f.grid_item_account_card_square) {
            C36641v d8 = C36641v.m108700d(from, viewGroup, false);
            C41536l.m120488h(d8, "inflate(\n               …  false\n                )");
            return new C34352a(this, d8);
        } else if (i == C36272f.item_credit_card_wide) {
            C36610k1 d9 = C36610k1.m108572d(from, viewGroup, false);
            C41536l.m120488h(d9, "inflate(\n               …  false\n                )");
            return new C34356e(this, d9);
        } else if (i == C36272f.grid_item_credit_card_square) {
            C36644w d12 = C36644w.m108712d(from, viewGroup, false);
            C41536l.m120488h(d12, "inflate(\n               …  false\n                )");
            return new C34355d(this, d12);
        } else if (i == C36272f.grid_item_loading) {
            C36647x d13 = C36647x.m108724d(from, viewGroup, false);
            C41536l.m120488h(d13, "inflate(\n               …  false\n                )");
            return new C34357f(this, d13);
        } else if (i == C36272f.grid_item_products_loading_error) {
            C36579a0 d14 = C36579a0.m108442d(from, viewGroup, false);
            d14.mo3946b().setOnClickListener(new C30434i(this));
            C41536l.m120488h(d14, "inflate(\n               …      }\n                }");
            return new C34365n(d14.mo3946b());
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }

    /* renamed from: s */
    public final int mo82734s(int i) {
        return ((C34366d) mo6027g(i)).mo82744a();
    }

    /* renamed from: t */
    public final C43079p mo82735t() {
        return this.f83299i;
    }

    /* renamed from: z */
    public final void mo82736z(View.OnClickListener onClickListener) {
        this.f83300j = onClickListener;
    }
}
