package p341ge.bog.mobilebank.openbanking.presentation.products;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import bv0.C31202b;
import bv0.C31203c;
import bv0.C31206f;
import ev0.C31829j;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.openbanking.domain.AccountsLoadingInProgressException;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.ProductUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.C33374e;
import p341ge.bog.mobilebank.openbanking.presentation.details.OpenBankProductDetailsActivity;
import p341ge.bog.mobilebank.openbanking.presentation.details.list.OpenBankProductListActivity;
import p420fh.C12902d;
import p434gh.C15278a;
import rv0.C38350a;
import rv0.C38351b;
import rv0.C38352c;
import rv0.C38353d;
import rv0.C38354e;
import rv0.C38355f;
import rv0.C38365p;
import tv0.C38805e;
import tv0.C38806f;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b */
public final class C33465b extends C33464a implements C38805e {

    /* renamed from: g */
    private C31829j f81683g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C38365p f81684h;

    /* renamed from: i */
    private final C41217g f81685i;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$a */
    public /* synthetic */ class C33466a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81686a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                tv0.f$b[] r0 = tv0.C38806f.C38808b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                tv0.f$b r1 = tv0.C38806f.C38808b.DELETE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                tv0.f$b r1 = tv0.C38806f.C38808b.REFRESH     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f81686a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.openbanking.presentation.products.C33465b.C33466a.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$b */
    static final class C33467b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33465b f81687d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$b$a */
        static final class C33468a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C33465b f81688d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33468a(C33465b bVar) {
                super(0);
                this.f81688d = bVar;
            }

            public final void invoke() {
                this.f81688d.m98271r1().f78525s.setRefreshing(true);
            }
        }

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$b$b */
        static final class C33469b extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C33465b f81689d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33469b(C33465b bVar) {
                super(0);
                this.f81689d = bVar;
            }

            public final void invoke() {
                this.f81689d.m98271r1().mo3946b().mo53597e();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33467b(C33465b bVar) {
            super(1);
            this.f81687d = bVar;
        }

        /* renamed from: a */
        public final void mo79318a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f81687d.m98271r1().f78525s.setRefreshing(false);
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                if (((List) cVar.mo71340a()).isEmpty()) {
                    this.f81687d.m98271r1().mo3946b().mo53598f();
                } else {
                    this.f81687d.m98271r1().mo3946b().mo53595c();
                }
                C38365p p1 = this.f81687d.f81684h;
                if (p1 == null) {
                    C41536l.m120506z("productsAdapter");
                    p1 = null;
                }
                p1.mo91895n((List) cVar.mo71340a());
            } else if (aVar instanceof C31128a.C31130b) {
                C41536l.m120488h(aVar, "it");
                C31132b.m92650l(aVar, new int[]{2}, new C33468a(this.f81687d));
                C31132b.m92650l(aVar, new int[]{6, 1}, new C33469b(this.f81687d));
            } else if (aVar instanceof C31128a.C31129a) {
                this.f81687d.m98271r1().f78525s.setRefreshing(false);
                if (((C31128a.C31129a) aVar).mo71342c() instanceof AccountsLoadingInProgressException) {
                    this.f81687d.m98271r1().f78513g.setDrawableSrc(Integer.valueOf(C31203c.f77507f));
                    this.f81687d.m98271r1().f78513g.setText(C32343x.m95388F("open.bank.loading.in.progress.text", new Object[0]));
                    this.f81687d.m98271r1().f78513g.setTitle(this.f81687d.getString(C31206f.open_bank_accounts_title));
                } else {
                    this.f81687d.m98271r1().f78513g.setDrawableSrc(Integer.valueOf(C31203c.f77506e));
                    this.f81687d.m98271r1().f78513g.setText(C32343x.m95388F("open.bank.list.error.desc", new Object[0]));
                    this.f81687d.m98271r1().f78513g.setTitle(this.f81687d.getString(C31206f.open_banking_error_msg_accounts_cant_load));
                }
                this.f81687d.m98271r1().mo3946b().mo53596d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79318a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$c */
    static final class C33470c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33465b f81690d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$c$a */
        static final class C33471a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33465b f81691d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33471a(C33465b bVar) {
                super(1);
                this.f81691d = bVar;
            }

            /* renamed from: a */
            public final void mo79320a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C12902d.C12903a aVar = C12902d.f38098b;
                C1505h requireActivity = this.f81691d.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
                String string = this.f81691d.getString(C31206f.f77546d);
                C41536l.m120488h(string, "getString(R.string.commo…_operations_successfully)");
                e.mo33652k(string, C15278a.POSITIVE, (C12902d.C12905b) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79320a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$c$b */
        static final class C33472b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33465b f81692d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33472b(C33465b bVar) {
                super(1);
                this.f81692d = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C12902d.C12903a aVar = C12902d.f38098b;
                C1505h requireActivity = this.f81692d.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
                String string = this.f81692d.getString(C31206f.f77545c);
                C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
                e.mo33652k(string, C15278a.NEGATIVE, (C12902d.C12905b) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33470c(C33465b bVar) {
            super(1);
            this.f81690d = bVar;
        }

        /* renamed from: a */
        public final void mo79319a(C37223a aVar) {
            C31128a aVar2;
            if (aVar != null && (aVar2 = (C31128a) aVar.mo90296a()) != null) {
                C33465b bVar = this.f81690d;
                C31132b.m92648j(aVar2, (int[]) null, new C33471a(bVar), 1, (Object) null);
                C31132b.m92643e(aVar2, (int[]) null, new C33472b(bVar), 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79319a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$d */
    static final class C33473d extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C33465b f81693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33473d(C33465b bVar) {
            super(2);
            this.f81693d = bVar;
        }

        /* renamed from: a */
        public final void mo79322a(BankWithProductsUiModel bankWithProductsUiModel, BankProductUiModel bankProductUiModel) {
            C41536l.m120489i(bankWithProductsUiModel, "bankWithProduct");
            C41536l.m120489i(bankProductUiModel, "product");
            BankUiModel bankUiModel = new BankUiModel(bankWithProductsUiModel.mo79288b(), bankWithProductsUiModel.mo79291e(), bankWithProductsUiModel.mo79287a(), true);
            if (bankProductUiModel.mo79276d() != null) {
                OpenBankProductDetailsActivity.C33386a aVar = OpenBankProductDetailsActivity.f81548H;
                Context requireContext = this.f81693d.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                aVar.mo79204a(requireContext, new ProductUiModel(bankUiModel, bankProductUiModel.mo79275b(), bankWithProductsUiModel.mo79293f(), bankProductUiModel.mo79276d()));
                return;
            }
            OpenBankProductListActivity.C33442a aVar2 = OpenBankProductListActivity.f81630I;
            Context requireContext2 = this.f81693d.requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            aVar2.mo79262a(requireContext2, new ProductUiModel(bankUiModel, bankProductUiModel.mo79275b(), bankWithProductsUiModel.mo79293f(), (String) null, 8, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo79322a((BankWithProductsUiModel) obj, (BankProductUiModel) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$e */
    static final class C33474e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33465b f81694d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33474e(C33465b bVar) {
            super(1);
            this.f81694d = bVar;
        }

        /* renamed from: a */
        public final void mo79323a(BankWithProductsUiModel bankWithProductsUiModel) {
            String str;
            C41536l.m120489i(bankWithProductsUiModel, "bank");
            if (bankWithProductsUiModel.mo79295h()) {
                this.f81694d.m98272s1().mo79307pw().mo79305dj(bankWithProductsUiModel.mo79288b(), bankWithProductsUiModel.mo79293f());
                str = "click_delete_bank";
            } else {
                C38806f.f92869F.mo92527a(bankWithProductsUiModel).mo4576A1(this.f81694d.getChildFragmentManager(), (String) null);
                str = "click_additional_functions";
            }
            C36546y.m108282F().mo27152s("open_banking", bankWithProductsUiModel.mo79287a(), str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79323a((BankWithProductsUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$f */
    static final class C33475f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38365p f81695d;

        /* renamed from: e */
        final /* synthetic */ C33465b f81696e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33475f(C38365p pVar, C33465b bVar) {
            super(1);
            this.f81695d = pVar;
            this.f81696e = bVar;
        }

        /* renamed from: a */
        public final void mo79324a(BankWithProductsUiModel bankWithProductsUiModel) {
            C41536l.m120489i(bankWithProductsUiModel, "it");
            C33374e.f81532J.mo79197a(new BankUiModel(bankWithProductsUiModel.mo79288b(), bankWithProductsUiModel.mo79291e(), bankWithProductsUiModel.mo79287a(), true), this.f81695d.mo91890i()).mo4576A1(this.f81696e.getChildFragmentManager(), (String) null);
            C36546y.m108282F().mo27152s("open_banking", bankWithProductsUiModel.mo79287a(), "click_renew_bank");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79324a((BankWithProductsUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$g */
    public static final class C33476g extends RecyclerView.C1746o {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f81697a;

        C33476g(RecyclerView recyclerView) {
            this.f81697a = recyclerView;
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            super.mo5615e(rect, view, recyclerView, b0Var);
            if (recyclerView.mo5355k0(view) == 0) {
                rect.top = this.f81697a.getResources().getDimensionPixelSize(C31202b.f77501b);
            }
            rect.bottom = this.f81697a.getResources().getDimensionPixelSize(C31202b.f77500a);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$h */
    static final class C33477h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81698a;

        C33477h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81698a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81698a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81698a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$i */
    public static final class C33478i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33478i(Fragment fragment) {
            super(0);
            this.f81699d = fragment;
        }

        public final Fragment invoke() {
            return this.f81699d;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$j */
    public static final class C33479j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33479j(C43064a aVar) {
            super(0);
            this.f81700d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f81700d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$k */
    public static final class C33480k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f81701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33480k(C41217g gVar) {
            super(0);
            this.f81701d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f81701d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$l */
    public static final class C33481l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81702d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81703e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33481l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f81702d = aVar;
            this.f81703e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81702d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f81703e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.b$m */
    public static final class C33482m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81704d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81705e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33482m(Fragment fragment, C41217g gVar) {
            super(0);
            this.f81704d = fragment;
            this.f81705e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f81705e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f81704d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C33465b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C33479j(new C33478i(this)));
        this.f81685i = C1514j0.m5374c(this, C41520a0.m120436b(OpenBanksProductsViewModel$ViewModel.class), new C33480k(a), new C33481l((C43064a) null, a), new C33482m(this, a));
    }

    private final void observeData() {
        m98272s1().mo79308qw().mo79304T9().mo4819k(getViewLifecycleOwner(), new C33477h(new C33467b(this)));
        m98272s1().mo79308qw().mo79309ud().mo4819k(getViewLifecycleOwner(), new C33477h(new C33470c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final C31829j m98271r1() {
        C31829j jVar = this.f81683g;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final OpenBanksProductsViewModel$ViewModel m98272s1() {
        return (OpenBanksProductsViewModel$ViewModel) this.f81685i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m98273t1(C13310d dVar, C33465b bVar, BankWithProductsUiModel bankWithProductsUiModel, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(bankWithProductsUiModel, "$bank");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        bVar.m98272s1().mo79307pw().mo79305dj(bankWithProductsUiModel.mo79288b(), bankWithProductsUiModel.mo79293f());
        C36546y.m108282F().mo27152s("open_banking", bankWithProductsUiModel.mo79287a(), "click_confirm_delete_buttons");
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m98274u1(C13310d dVar, BankWithProductsUiModel bankWithProductsUiModel, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(bankWithProductsUiModel, "$bank");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        C36546y.m108282F().mo27152s("open_banking", bankWithProductsUiModel.mo79287a(), "click_reject_delete_buttons");
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m98275v1(C38365p pVar, C33465b bVar, View view) {
        C41536l.m120489i(pVar, "$this_apply");
        C41536l.m120489i(bVar, "this$0");
        C33374e.C33375a.m98094b(C33374e.f81532J, (BankUiModel) null, pVar.mo91890i(), 1, (Object) null).mo4576A1(bVar.getChildFragmentManager(), (String) null);
        C36546y.m108282F().mo27152s("open_banking", (String) null, "click_add_bank");
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m98276x1(C33465b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C33374e.C33375a.m98094b(C33374e.f81532J, (BankUiModel) null, C41341q.m119907j(), 1, (Object) null).mo4576A1(bVar.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m98277y1(C33465b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m98272s1().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m98278z1(C33465b bVar) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m98272s1().onRefresh(2);
    }

    /* renamed from: Y */
    public void mo79317Y(BankWithProductsUiModel bankWithProductsUiModel, C38806f.C38808b bVar) {
        C41536l.m120489i(bankWithProductsUiModel, "bank");
        C41536l.m120489i(bVar, "type");
        if (C33466a.f81686a[bVar.ordinal()] == 1) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C13310d dVar = new C13310d();
            dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
            dVar.mo35648c2(requireContext.getString(C31206f.open_banking_title_delete_account));
            dVar.mo35639Q1(C32343x.m95388F("open.bank.delete.bank.popup.desc", new Object[0]));
            dVar.mo35646Z1(requireContext.getString(C31206f.f77547e));
            dVar.mo35642U1(requireContext.getString(C31206f.f77544b));
            dVar.mo35645Y1(new C38354e(dVar, this, bankWithProductsUiModel));
            dVar.mo35641T1(new C38355f(dVar, bankWithProductsUiModel));
            dVar.mo4576A1(getChildFragmentManager(), (String) null);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f81683g = C31829j.m94106d(layoutInflater, viewGroup, false);
        StateView c = m98271r1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f81683g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m98271r1().f78522p.setTitle(C32343x.m95388F("open.bank.info.title", new Object[0]));
        m98271r1().f78522p.setText(C32343x.m95388F("open.bank.info.desc.main", new Object[0]));
        m98271r1().f78515i.setText(C32343x.m95388F("open.bank.info.desc.1", new Object[0]));
        m98271r1().f78516j.setText(C32343x.m95388F("open.bank.info.desc.2", new Object[0]));
        m98271r1().f78517k.setText(C32343x.m95388F("open.bank.info.desc.3", new Object[0]));
        C38365p pVar = new C38365p();
        pVar.mo91892k(new C33473d(this));
        pVar.mo91893l(new C33474e(this));
        pVar.mo91891j(new C38350a(pVar, this));
        pVar.mo91894m(new C33475f(pVar, this));
        this.f81684h = pVar;
        RecyclerView recyclerView = m98271r1().f78514h;
        C38365p pVar2 = this.f81684h;
        if (pVar2 == null) {
            C41536l.m120506z("productsAdapter");
            pVar2 = null;
        }
        recyclerView.setAdapter(pVar2);
        recyclerView.mo5351j(new C33476g(recyclerView));
        m98271r1().f78511e.setOnClickListener(new C38351b(this));
        m98271r1().f78523q.setOnClickListener(new C38352c(this));
        m98271r1().f78525s.setOnRefreshListener(new C38353d(this));
        observeData();
    }
}
