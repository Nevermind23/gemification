package p341ge.bog.mobilebank.products.presentation.details.list;

import a81.C30722p;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b00.C19305k;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import h00.C24849e;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import hy0.C36269c;
import hy0.C36274h;
import iu0.C36546y;
import iy0.C36617n;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity;
import p380ck.C10464h;
import pz0.C38055e;
import pz0.C38066p;
import pz0.C38072v;
import q31.C38122f;
import q31.C38125h;
import q70.C27685a;
import sz0.C38607a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity */
public final class ProductListActivity extends C34215c {

    /* renamed from: L */
    public static final C34188a f83035L = new C34188a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C38066p f83036G;

    /* renamed from: H */
    private final C41217g f83037H = C41219i.m119470b(new C34190c(this));

    /* renamed from: I */
    private final C41217g f83038I = C41219i.m119470b(new C34203n(this));

    /* renamed from: J */
    private final C41217g f83039J = C41219i.m119470b(new C34204o(this));

    /* renamed from: K */
    private final C41217g f83040K = new C1617p0(C41520a0.m120436b(C38072v.class), new C34208q(this), new C34210s(this), new C34209r((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$a */
    public static final class C34188a {
        private C34188a() {
        }

        public /* synthetic */ C34188a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo82561a(Context context, C27685a aVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(aVar, "productType");
            context.startActivity(new Intent(context, ProductListActivity.class).putExtra("PRODUCT_ARG", aVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$b */
    public /* synthetic */ class C34189b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83041a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
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
                q70.a r1 = q70.C27685a.PIGGY_BANK     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                q70.a r1 = q70.C27685a.BNPL     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                q70.a r1 = q70.C27685a.GIFT_CARD_OWNER     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f83041a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.list.ProductListActivity.C34189b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$c */
    static final class C34190c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34190c(ProductListActivity productListActivity) {
            super(0);
            this.f83042d = productListActivity;
        }

        /* renamed from: b */
        public final C36617n invoke() {
            return C36617n.m108602d(this.f83042d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$d */
    static final class C34191d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83043d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$d$a */
        static final class C34192a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductListActivity f83044d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34192a(ProductListActivity productListActivity) {
                super(1);
                this.f83044d = productListActivity;
            }

            /* renamed from: a */
            public final void mo82564a(List list) {
                C41536l.m120489i(list, "it");
                this.f83044d.m100615Q2().mo82592j(list);
                this.f83044d.m100613N2().f88333g.setRefreshing(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82564a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$d$b */
        static final class C34193b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductListActivity f83045d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34193b(ProductListActivity productListActivity) {
                super(1);
                this.f83045d = productListActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f83045d.m100613N2().f88333g.setRefreshing(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34191d(ProductListActivity productListActivity) {
            super(1);
            this.f83043d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82563a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34192a(this.f83043d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C34193b(this.f83043d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82563a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$e */
    static final class C34194e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34194e(ProductListActivity productListActivity) {
            super(1);
            this.f83046d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82566a(C41224m mVar) {
            C41536l.m120489i(mVar, "shouldShowIntro");
            if (!((Boolean) mVar.mo95678e()).booleanValue()) {
                C38125h.m112237b(this.f83046d).mo91646a(this.f83046d, true, ((Number) mVar.mo95680f()).longValue());
            } else {
                C38125h.m112237b(this.f83046d).mo91647b(this.f83046d, true, ((Number) mVar.mo95680f()).longValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82566a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$f */
    static final class C34195f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83047d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34195f(ProductListActivity productListActivity) {
            super(1);
            this.f83047d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82567a(C37223a aVar) {
            C38607a aVar2 = (C38607a) aVar.mo90296a();
            if (aVar2 != null) {
                this.f83047d.m100621W2(aVar2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82567a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$g */
    static final class C34196g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83048d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34196g(ProductListActivity productListActivity) {
            super(1);
            this.f83048d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82568a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                ProductListActivity productListActivity = this.f83048d;
                bool.booleanValue();
                productListActivity.m100622X2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82568a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$h */
    static final class C34197h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34197h(ProductListActivity productListActivity) {
            super(1);
            this.f83049d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82569a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f83049d.m100623Y2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82569a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$i */
    static final class C34198i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34198i(ProductListActivity productListActivity) {
            super(1);
            this.f83050d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82570a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f83050d.m100616R2().mo91489vw().mo91468Y6();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82570a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$j */
    static final class C34199j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34199j(ProductListActivity productListActivity) {
            super(1);
            this.f83051d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82571a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                FrameLayout frameLayout = this.f83051d.m100613N2().f88332f;
                C41536l.m120488h(frameLayout, "binding.progressBar");
                C32343x.m95447f1(frameLayout);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f83051d.m100619U2(((Boolean) ((C31128a.C31131c) aVar).mo71340a()).booleanValue());
            } else if (aVar instanceof C31128a.C31129a) {
                FrameLayout frameLayout2 = this.f83051d.m100613N2().f88332f;
                C41536l.m120488h(frameLayout2, "binding.progressBar");
                C32343x.m95455i0(frameLayout2);
                this.f83051d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82571a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$k */
    static final class C34200k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34200k(ProductListActivity productListActivity) {
            super(1);
            this.f83052d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82572a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                ProductListActivity productListActivity = this.f83052d;
                C38125h.m112238c(productListActivity).mo91642z(productListActivity);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82572a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$l */
    static final class C34201l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34201l(ProductListActivity productListActivity) {
            super(1);
            this.f83053d = productListActivity;
        }

        /* renamed from: a */
        public final void mo82573a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                ProductListActivity productListActivity = this.f83053d;
                C38125h.m112238c(productListActivity).mo91637w0(C24849e.BNPL_LIMIT, productListActivity);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82573a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$m */
    public static final class C34202m extends RecyclerView.C1746o {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f83054a;

        C34202m(RecyclerView recyclerView) {
            this.f83054a = recyclerView;
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            super.mo5615e(rect, view, recyclerView, b0Var);
            Resources resources = this.f83054a.getResources();
            int i = C36269c.f87464e;
            rect.top = resources.getDimensionPixelSize(i);
            rect.bottom = this.f83054a.getResources().getDimensionPixelSize(i);
            Resources resources2 = this.f83054a.getResources();
            int i2 = C36269c.f87462c;
            rect.right = resources2.getDimensionPixelSize(i2);
            rect.left = this.f83054a.getResources().getDimensionPixelSize(i2);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$n */
    static final class C34203n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34203n(ProductListActivity productListActivity) {
            super(0);
            this.f83055d = productListActivity;
        }

        /* renamed from: b */
        public final C27685a invoke() {
            Intent intent = this.f83055d.getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("PRODUCT_ARG") : null;
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.shareddomain.model.producttype.ProductType");
            return (C27685a) serializableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$o */
    static final class C34204o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83056d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$o$a */
        /* synthetic */ class C34205a extends C41535k implements C43079p {
            C34205a(Object obj) {
                super(2, obj, C38072v.class, "onProductItemClicked", "onProductItemClicked(JI)V", 0);
            }

            /* renamed from: b */
            public final void mo82576b(long j, int i) {
                ((C38072v) this.receiver).mo91487Iw(j, i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo82576b(((Number) obj).longValue(), ((Number) obj2).intValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$o$b */
        /* synthetic */ class C34206b extends C41535k implements C43064a {
            C34206b(Object obj) {
                super(0, obj, C38072v.class, "onNewProductClicked", "onNewProductClicked()V", 0);
            }

            /* renamed from: b */
            public final void mo82577b() {
                ((C38072v) this.receiver).mo91486Hw();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo82577b();
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34204o(ProductListActivity productListActivity) {
            super(0);
            this.f83056d = productListActivity;
        }

        /* renamed from: b */
        public final C34232e invoke() {
            return new C34232e(new C34205a(this.f83056d.m100616R2()), new C34206b(this.f83056d.m100616R2()));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$p */
    static final class C34207p implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83057a;

        C34207p(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83057a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83057a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83057a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$q */
    public static final class C34208q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34208q(ComponentActivity componentActivity) {
            super(0);
            this.f83058d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83058d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$r */
    public static final class C34209r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83059d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83060e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34209r(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83059d = aVar;
            this.f83060e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83059d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83060e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$s */
    static final class C34210s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ProductListActivity f83061d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.list.ProductListActivity$s$a */
        static final class C34211a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ ProductListActivity f83062d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34211a(ProductListActivity productListActivity) {
                super(0);
                this.f83062d = productListActivity;
            }

            /* renamed from: b */
            public final C38072v invoke() {
                return this.f83062d.mo82560O2().mo32549a(this.f83062d.m100614P2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34210s(ProductListActivity productListActivity) {
            super(0);
            this.f83061d = productListActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C34211a(this.f83061d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final C36617n m100613N2() {
        return (C36617n) this.f83037H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final C27685a m100614P2() {
        return (C27685a) this.f83038I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final C34232e m100615Q2() {
        return (C34232e) this.f83039J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final C38072v m100616R2() {
        return (C38072v) this.f83040K.getValue();
    }

    /* renamed from: S2 */
    private final void m100617S2() {
        m100616R2().mo91482Cw().mo91475f2().mo4819k(this, new C34207p(new C34191d(this)));
        C37224b.m109963b(m100616R2().mo91482Cw().mo91478o2(), this, new C34194e(this));
        m100616R2().mo91482Cw().mo91470L7().mo4819k(this, new C34207p(new C34195f(this)));
        m100616R2().mo91482Cw().mo91479re().mo4819k(this, new C34207p(new C34196g(this)));
        m100616R2().mo91482Cw().mo91476jd().mo4819k(this, new C34207p(new C34197h(this)));
        m100616R2().mo91482Cw().mo91473Ua().mo4819k(this, new C34207p(new C34198i(this)));
        m100616R2().mo91482Cw().mo91472Tp().mo4819k(this, new C34207p(new C34199j(this)));
        m100616R2().mo91482Cw().mo91471Np().mo4819k(this, new C34207p(new C34200k(this)));
        m100616R2().mo91482Cw().mo91477jf().mo4819k(this, new C34207p(new C34201l(this)));
        m100613N2().f88333g.setOnRefreshListener(new C38055e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m100618T2(ProductListActivity productListActivity) {
        C41536l.m120489i(productListActivity, "this$0");
        C21481a.onRefresh$default(productListActivity.m100616R2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m100619U2(boolean z) {
        if (z) {
            C36546y.m108282F().mo27152s("Products_Page", (String) null, "Request_new_loan_BTN_click");
            C38125h.m112238c(this).mo91590a(this);
        } else {
            C19305k.f53530L.mo47528a().mo4576A1(getSupportFragmentManager(), (String) null);
        }
        FrameLayout frameLayout = m100613N2().f88332f;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95455i0(frameLayout);
    }

    /* renamed from: V2 */
    private final void m100620V2(long j) {
        C36546y.m108282F().mo27152s("bnpl", "Products_page", "click_BNPL_products_details");
        C36546y.m108282F().mo27137H("BNPL_click_BNPLsubproduct_productpage", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        C38125h.m112238c(this).mo91587Y0(this, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m100621W2(C38607a aVar) {
        if (m100614P2() == C27685a.PIGGY_BANK) {
            C38125h.m112238c(this).mo91563M0(this, aVar.mo92229a());
        } else if (m100614P2() == C27685a.BNPL) {
            m100620V2(aVar.mo92229a());
        } else if (m100614P2() == C27685a.ACC_TYPE_DEPOSIT) {
            C38125h.m112238c(this).mo91606h(this, aVar.mo92229a());
        } else if (m100614P2() == C27685a.GIFT_CARD_OWNER) {
            m100616R2().mo91489vw().mo91469y2(aVar.mo92229a());
        } else if (aVar.mo92231c() == 1) {
            DebitCardDetailsActivity.C34008a.m100114b(DebitCardDetailsActivity.f82717P, this, aVar.mo92229a(), false, 4, (Object) null);
        } else if (aVar.mo92231c() == 2) {
            CreditCardDetailsActivity.f82501O.mo82091a(this, aVar.mo92229a());
        } else {
            Intent intent = new Intent(this, ProductDetailedActivity.class);
            intent.putExtra("PRODUCT_TYPE_KEY", aVar.mo92231c());
            intent.putExtra("PRODUCT_KEY", aVar.mo92229a());
            intent.putExtra("PRODUCT_INDEX", aVar.mo92230b());
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m100622X2() {
        C36546y.m108282F().mo27152s("Products_Page", (String) null, "Order_new_card_BTN_click");
        C38125h.m112238c(this).mo91597c0(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m100623Y2() {
        C36546y.m108282F().mo27152s("Products_Page", (String) null, "Open_new_deposit_BTN_click");
        C38122f.C38123a.m112225u(C38125h.m112238c(this), this, (String) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m100613N2().mo3946b());
        super.mo37451O1(bundle);
        RecyclerView recyclerView = m100613N2().f88331e;
        recyclerView.setAdapter(m100615Q2());
        recyclerView.mo5351j(new C34202m(recyclerView));
        m100617S2();
    }

    /* renamed from: O2 */
    public final C38066p mo82560O2() {
        C38066p pVar = this.f83036G;
        if (pVar != null) {
            return pVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public C30722p mo40037w1() {
        if (m100614P2() == C27685a.ACC_TYPE_ACCOUNT) {
            return C30722p.ACCOUNTS_AND_CARDS;
        }
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String str;
        switch (C34189b.f83041a[m100614P2().ordinal()]) {
            case 1:
                str = getString(C36274h.f87579v);
                break;
            case 2:
                str = getString(C36274h.f87581x);
                break;
            case 3:
                str = getString(C36274h.f87582y);
                break;
            case 4:
                str = getString(C36274h.f87583z);
                break;
            case 5:
                str = getString(C36274h.f87580w);
                break;
            case 6:
                str = C32343x.m95388F("products.cas.service", new Object[0]);
                break;
            case 7:
                str = C32343x.m95388F("text.bnpl.name", new Object[0]);
                break;
            case 8:
                str = C32343x.m95388F("giftcard.owner.list.header", new Object[0]);
                break;
            default:
                str = "";
                break;
        }
        C41536l.m120488h(str, "when (productType) {\n   …\n        else -> \"\"\n    }");
        return str;
    }
}
