package p341ge.bog.mobilebank.products.presentation.products;

import a01.C30418a;
import a01.C30420b;
import a01.C30422c;
import a01.C30424d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C1832v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41238w;
import hy0.C36269c;
import hy0.C36270d;
import hy0.C36274h;
import iu0.C36546y;
import iy0.C36629r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37224b;
import o00.C26656a;
import p00.C27113k;
import p017b.C2106d;
import p163m0.C7047a;
import p189o0.C7357a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.details.list.LoanListActivity;
import p341ge.bog.mobilebank.products.presentation.details.list.ProductListActivity;
import p380ck.C10464h;
import p745er.C20288a;
import q31.C38120d;
import q31.C38122f;
import q31.C38125h;
import q70.C27685a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import xy0.C39945i;

/* renamed from: ge.bog.mobilebank.products.presentation.products.b */
public final class C34332b extends C34331a implements C26656a {

    /* renamed from: g */
    private C36629r f83270g;

    /* renamed from: h */
    private final C41217g f83271h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C34351c f83272i;

    /* renamed from: j */
    private C0173b f83273j;

    /* renamed from: k */
    private final BroadcastReceiver f83274k = new C34333a(this);

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$a */
    public static final class C34333a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C34332b f83275a;

        C34333a(C34332b bVar) {
            this.f83275a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(intent, "intent");
            this.f83275a.m100979v1().mo70787c();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$b */
    static final class C34334b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34332b f83276d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34334b(C34332b bVar) {
            super(1);
            this.f83276d = bVar;
        }

        /* renamed from: a */
        public final void mo82724a(C41224m mVar) {
            C41536l.m120489i(mVar, "shouldShowIntro");
            if (!((Boolean) mVar.mo95678e()).booleanValue()) {
                Context requireContext = this.f83276d.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                C38120d b = C38125h.m112237b(requireContext);
                Context requireContext2 = this.f83276d.requireContext();
                C41536l.m120488h(requireContext2, "requireContext()");
                b.mo91646a(requireContext2, true, ((Number) mVar.mo95680f()).longValue());
                return;
            }
            Context requireContext3 = this.f83276d.requireContext();
            C41536l.m120488h(requireContext3, "requireContext()");
            C38120d b2 = C38125h.m112237b(requireContext3);
            Context requireContext4 = this.f83276d.requireContext();
            C41536l.m120488h(requireContext4, "requireContext()");
            b2.mo91647b(requireContext4, true, ((Number) mVar.mo95680f()).longValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82724a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$c */
    static final class C34335c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34332b f83277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34335c(C34332b bVar) {
            super(1);
            this.f83277d = bVar;
        }

        /* renamed from: a */
        public final void mo82725a(C39945i iVar) {
            C41536l.m120489i(iVar, "contract");
            C27113k.C27114a aVar = C27113k.f68083P;
            String a = iVar.mo93719a();
            if (a == null) {
                a = "";
            }
            String string = this.f83277d.getString(C36274h.f87560A);
            C41536l.m120488h(string, "getString(R.string.header_text_pension_savings)");
            C27113k c = C27113k.C27114a.m84066c(aVar, a, false, (String) null, (ArrayList) null, (Summary) null, string, 30, (Object) null);
            FragmentManager childFragmentManager = this.f83277d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            c.mo4576A1(childFragmentManager, (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82725a((C39945i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$d */
    static final class C34336d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34332b f83278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34336d(C34332b bVar) {
            super(1);
            this.f83278d = bVar;
        }

        /* renamed from: a */
        public final void mo82726a(List list) {
            C34351c n1 = this.f83278d.f83272i;
            if (n1 == null) {
                C41536l.m120506z("productsGridAdapter");
                n1 = null;
            }
            n1.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82726a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$e */
    static final class C34337e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34332b f83279d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.b$e$a */
        static final class C34338a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C34332b f83280d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34338a(C34332b bVar) {
                super(0);
                this.f83280d = bVar;
            }

            public final void invoke() {
                this.f83280d.m100978u1().f88405m.setRefreshing(true);
            }
        }

        /* renamed from: ge.bog.mobilebank.products.presentation.products.b$e$b */
        static final class C34339b extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C34332b f83281d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34339b(C34332b bVar) {
                super(0);
                this.f83281d = bVar;
            }

            public final void invoke() {
                this.f83281d.m100978u1().mo3946b().mo53597e();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34337e(C34332b bVar) {
            super(1);
            this.f83279d = bVar;
        }

        /* renamed from: a */
        public final void mo82727a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f83279d.m100978u1().f88405m.setRefreshing(false);
                if (((List) ((C31128a.C31131c) aVar).mo71340a()).isEmpty()) {
                    this.f83279d.m100978u1().mo3946b().mo53598f();
                } else {
                    this.f83279d.m100978u1().mo3946b().mo53595c();
                }
            } else if (aVar instanceof C31128a.C31130b) {
                C41536l.m120488h(aVar, "productTypesResult");
                C31132b.m92650l(aVar, new int[]{2}, new C34338a(this.f83279d));
                C31132b.m92650l(aVar, new int[]{6, 1}, new C34339b(this.f83279d));
            } else if (aVar instanceof C31128a.C31129a) {
                this.f83279d.m100978u1().f88405m.setRefreshing(false);
                this.f83279d.m100978u1().f88399g.setDrawableSrc(Integer.valueOf(C36270d.f87466E));
                this.f83279d.m100978u1().f88399g.setText(C32343x.m95388F("text.products.loading.error.desc", new Object[0]));
                this.f83279d.m100978u1().f88399g.setTitle(this.f83279d.getString(C36274h.products_error_msg_accounts_cant_load));
                this.f83279d.m100978u1().mo3946b().mo53596d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82727a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$f */
    static final class C34340f extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C34332b f83282d;

        /* renamed from: ge.bog.mobilebank.products.presentation.products.b$f$a */
        public /* synthetic */ class C34341a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f83283a;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    q70.a[] r0 = q70.C27685a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    q70.a r1 = q70.C27685a.PIGGY_BANK     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    q70.a r1 = q70.C27685a.ACC_TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    q70.a r1 = q70.C27685a.ACC_TYPE_LOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    q70.a r1 = q70.C27685a.ACC_TYPE_GT     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    q70.a r1 = q70.C27685a.BNPL     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    q70.a r1 = q70.C27685a.GIFT_CARD_OWNER     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    q70.a r1 = q70.C27685a.TYPE_GTP_TRADING     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f83283a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.products.C34332b.C34340f.C34341a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34340f(C34332b bVar) {
            super(2);
            this.f83282d = bVar;
        }

        /* renamed from: a */
        public final void mo82728a(C27685a aVar, Long l) {
            C41536l.m120489i(aVar, "type");
            if (aVar == C27685a.ACC_TYPE_PENSION) {
                this.f83282d.m100963D1();
            } else if (l != null) {
                switch (C34341a.f83283a[aVar.ordinal()]) {
                    case 1:
                        this.f83282d.m100964E1(l.longValue());
                        return;
                    case 2:
                        Context requireContext = this.f83282d.requireContext();
                        C41536l.m120488h(requireContext, "requireContext()");
                        C38122f c = C38125h.m112238c(requireContext);
                        Context requireContext2 = this.f83282d.requireContext();
                        C41536l.m120488h(requireContext2, "requireContext()");
                        c.mo91606h(requireContext2, l.longValue());
                        return;
                    case 3:
                        Context requireContext3 = this.f83282d.requireContext();
                        C41536l.m120488h(requireContext3, "requireContext()");
                        C38122f c2 = C38125h.m112238c(requireContext3);
                        Context requireContext4 = this.f83282d.requireContext();
                        C41536l.m120488h(requireContext4, "requireContext()");
                        C38122f.C38123a.m112229y(c2, requireContext4, l, (Integer) null, 4, (Object) null);
                        return;
                    case 4:
                        this.f83282d.m100965F1(l.longValue(), 5);
                        return;
                    case 5:
                        this.f83282d.m100961B1(l.longValue());
                        return;
                    case 6:
                        this.f83282d.m100979v1().mo82665qx().mo70789y2(l.longValue());
                        return;
                    default:
                        return;
                }
            } else {
                int i = C34341a.f83283a[aVar.ordinal()];
                if (i == 3) {
                    LoanListActivity.C34169b bVar = LoanListActivity.f83008K;
                    Context requireContext5 = this.f83282d.requireContext();
                    C41536l.m120488h(requireContext5, "requireContext()");
                    bVar.mo82543a(requireContext5);
                } else if (i != 7) {
                    C1505h activity = this.f83282d.getActivity();
                    if (activity != null) {
                        ProductListActivity.f83035L.mo82561a(activity, aVar);
                    }
                } else {
                    this.f83282d.m100962C1();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo82728a((C27685a) obj, (Long) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$g */
    static final class C34342g extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C34332b f83284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34342g(C34332b bVar) {
            super(2);
            this.f83284d = bVar;
        }

        /* renamed from: a */
        public final void mo82729a(long j, int i) {
            this.f83284d.m100965F1(j, i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo82729a(((Number) obj).longValue(), ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$h */
    public static final class C34343h extends GridLayoutManager.C1715c {

        /* renamed from: e */
        final /* synthetic */ C34332b f83285e;

        C34343h(C34332b bVar) {
            this.f83285e = bVar;
        }

        /* renamed from: f */
        public int mo5180f(int i) {
            C34351c n1 = this.f83285e.f83272i;
            if (n1 == null) {
                C41536l.m120506z("productsGridAdapter");
                n1 = null;
            }
            return n1.mo82734s(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$i */
    public static final class C34344i extends RecyclerView.C1746o {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f83286a;

        C34344i(RecyclerView recyclerView) {
            this.f83286a = recyclerView;
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            super.mo5615e(rect, view, recyclerView, b0Var);
            Resources resources = this.f83286a.getResources();
            int i = C36269c.f87464e;
            rect.right = resources.getDimensionPixelSize(i);
            rect.left = this.f83286a.getResources().getDimensionPixelSize(i);
            rect.bottom = this.f83286a.getResources().getDimensionPixelSize(C36269c.f87463d);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$j */
    static final class C34345j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83287a;

        C34345j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83287a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83287a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83287a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$k */
    public static final class C34346k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f83288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34346k(Fragment fragment) {
            super(0);
            this.f83288d = fragment;
        }

        public final Fragment invoke() {
            return this.f83288d;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$l */
    public static final class C34347l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34347l(C43064a aVar) {
            super(0);
            this.f83289d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f83289d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$m */
    public static final class C34348m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f83290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34348m(C41217g gVar) {
            super(0);
            this.f83290d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f83290d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$n */
    public static final class C34349n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83291d;

        /* renamed from: e */
        final /* synthetic */ C41217g f83292e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34349n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f83291d = aVar;
            this.f83292e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83291d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f83292e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.products.b$o */
    public static final class C34350o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f83293d;

        /* renamed from: e */
        final /* synthetic */ C41217g f83294e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34350o(Fragment fragment, C41217g gVar) {
            super(0);
            this.f83293d = fragment;
            this.f83294e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f83294e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f83293d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C34332b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C34347l(new C34346k(this)));
        this.f83271h = C1514j0.m5374c(this, C41520a0.m120436b(ProductsViewModel$ViewModel.class), new C34348m(a), new C34349n((C43064a) null, a), new C34350o(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m100960A1(C34332b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m100979v1().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m100961B1(long j) {
        C36546y.m108282F().mo27152s("bnpl", "Products_page", "click_BNPL_products_details");
        C36546y.m108282F().mo27137H("BNPL_click_BNPLproduct_productpage", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        c.mo91587Y0(requireContext2, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m100962C1() {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112226v(c, requireContext, (String) null, (String) null, false, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final void m100963D1() {
        C0173b bVar = this.f83273j;
        if (bVar != null) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            c.mo91575S0(requireContext2, bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m100964E1(long j) {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        c.mo91563M0(requireContext2, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public final void m100965F1(long j, int i) {
        if (1 == i) {
            DebitCardDetailsActivity.C34008a aVar = DebitCardDetailsActivity.f82717P;
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            DebitCardDetailsActivity.C34008a.m100114b(aVar, requireContext, j, false, 4, (Object) null);
        } else if (2 == i) {
            CreditCardDetailsActivity.C33890a aVar2 = CreditCardDetailsActivity.f82501O;
            Context requireContext2 = requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            aVar2.mo82091a(requireContext2, j);
        } else {
            Intent intent = new Intent(getActivity(), ProductDetailedActivity.class);
            intent.putExtra("PRODUCT_TYPE_KEY", i);
            intent.putExtra("PRODUCT_KEY", j);
            intent.putExtra("PRODUCT_INDEX", 0);
            startActivity(intent);
        }
    }

    private final void observeData() {
        LiveData o2 = m100979v1().mo82666rx().mo70792o2();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(o2, viewLifecycleOwner, new C34334b(this));
        LiveData Q1 = m100979v1().mo82666rx().mo70790Q1();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Q1, viewLifecycleOwner2, new C34335c(this));
        m100979v1().mo82666rx().mo70791ke().mo4819k(getViewLifecycleOwner(), new C34345j(new C34336d(this)));
        m100979v1().mo82666rx().mo70793t3().mo4819k(getViewLifecycleOwner(), new C34345j(new C34337e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final C36629r m100978u1() {
        C36629r rVar = this.f83270g;
        C41536l.m120486f(rVar);
        return rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final ProductsViewModel$ViewModel m100979v1() {
        return (ProductsViewModel$ViewModel) this.f83271h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m100980x1(C34332b bVar, ActivityResult activityResult) {
        C41536l.m120489i(bVar, "this$0");
        if (activityResult.mo371b() == -1) {
            bVar.m100979v1().onRefresh(6);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m100981y1(C34332b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C36546y.m108282F().mo27152s("Products_Page", (String) null, "click_open_counter");
        C1505h requireActivity = bVar.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = bVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        c.mo91607h0(requireContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m100982z1(C34332b bVar) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m100979v1().onRefresh(2);
    }

    /* renamed from: m */
    public void mo39137m() {
        m100979v1().mo82665qx().mo70786Ev();
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C27113k c = C20288a.m66328c(childFragmentManager, (String) null, 2, (Object) null);
        if (c != null) {
            c.mo4577k1();
        }
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        this.f83273j = registerForActivityResult(new C2106d(), new C30418a(this));
        C7357a.m28044b(context).mo21730c(this.f83274k, new IntentFilter("ge.bog.mobilebank.products.presentation.products.refresh_products"));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f83270g = C36629r.m108652d(layoutInflater, viewGroup, false);
        StateView c = m100978u1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f83270g = null;
    }

    public void onDetach() {
        super.onDetach();
        C7357a.m28044b(requireContext()).mo21732e(this.f83274k);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C34351c cVar = new C34351c(m100979v1().mo82665qx(), this.mClient.getUserInfo().getClient().isSoloClient());
        this.f83272i = cVar;
        cVar.mo82732A(new C34340f(this));
        C34351c cVar2 = this.f83272i;
        C34351c cVar3 = null;
        if (cVar2 == null) {
            C41536l.m120506z("productsGridAdapter");
            cVar2 = null;
        }
        cVar2.mo82733B(new C34342g(this));
        C34351c cVar4 = this.f83272i;
        if (cVar4 == null) {
            C41536l.m120506z("productsGridAdapter");
            cVar4 = null;
        }
        cVar4.mo82736z(new C30420b(this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.mo5176u3(new C34343h(this));
        RecyclerView recyclerView = m100978u1().f88400h;
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView.C1742m itemAnimator = recyclerView.getItemAnimator();
        C41536l.m120487g(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((C1832v) itemAnimator).mo6072Q(false);
        C34351c cVar5 = this.f83272i;
        if (cVar5 == null) {
            C41536l.m120506z("productsGridAdapter");
        } else {
            cVar3 = cVar5;
        }
        recyclerView.setAdapter(cVar3);
        recyclerView.mo5351j(new C34344i(recyclerView));
        m100978u1().f88405m.setOnRefreshListener(new C30422c(this));
        m100978u1().f88403k.setOnClickListener(new C30424d(this));
        observeData();
    }
}
