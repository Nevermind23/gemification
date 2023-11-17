package p341ge.bog.mobilebank.products.presentation.addnewproduct;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import az0.C31103a;
import b00.C19305k;
import b41.C31128a;
import b41.C31132b;
import d20.C19874l;
import g91.C32343x;
import h00.C24849e;
import h20.C24851a;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import hy0.C36270d;
import i20.C25106f;
import iy0.C36596g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationAppearance;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationArguments;
import p341ge.bog.designsystem.components.toastnotification.ToastNotificationIcon;
import p341ge.bog.mobilebank.p975ui.activities.CashCoverLoanActivity;
import p341ge.bog.mobilebank.p975ui.activities.DDSTOListActivity;
import p380ck.C10464h;
import p644vj.C18394d;
import q31.C38122f;
import q31.C38125h;
import tu0.C38796a;
import ue1.C43064a;
import ue1.C43075l;
import xy0.C39935a0;
import yy0.C40112a;
import yy0.C40113b;
import yy0.C40114c;
import zy0.C40273b;
import zy0.C40275c;

/* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity */
public final class AddNewProductActivity extends C30772sa {

    /* renamed from: J */
    public static final C33805a f82385J = new C33805a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f82386F = C41219i.m119470b(new C33819m(this));

    /* renamed from: G */
    private final C41217g f82387G = new C1617p0(C41520a0.m120436b(AddNewProductViewModel$ViewModel.class), new C33806a0(this), new C33833z(this), new C33808b0((C43064a) null, this));

    /* renamed from: H */
    private C19874l f82388H;

    /* renamed from: I */
    private final C41217g f82389I = C41219i.m119470b(new C33820n(this));

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$a */
    public static final class C33805a {
        private C33805a() {
        }

        public /* synthetic */ C33805a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo81968a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, AddNewProductActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$a0 */
    public static final class C33806a0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33806a0(ComponentActivity componentActivity) {
            super(0);
            this.f82390d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f82390d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$b */
    public /* synthetic */ class C33807b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82391a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                xy0.a0[] r0 = xy0.C39935a0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xy0.a0 r1 = xy0.C39935a0.CAS_CLIENT_SERVICE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xy0.a0 r1 = xy0.C39935a0.DEP_LOAN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xy0.a0 r1 = xy0.C39935a0.INSURANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xy0.a0 r1 = xy0.C39935a0.DEPOSIT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                xy0.a0 r1 = xy0.C39935a0.DEBIT_CARD     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                xy0.a0 r1 = xy0.C39935a0.BNPL_APPLICATION     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                xy0.a0 r1 = xy0.C39935a0.CREDIT_APPLICATION     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                xy0.a0 r1 = xy0.C39935a0.TRAVEL_CARD     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                xy0.a0 r1 = xy0.C39935a0.DD_STO     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                xy0.a0 r1 = xy0.C39935a0.INVESTMENT     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                f82391a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity.C33807b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$b0 */
    public static final class C33808b0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f82392d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f82393e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33808b0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f82392d = aVar;
            this.f82393e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f82392d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f82393e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$c */
    static final class C33809c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33809c(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82394d = addNewProductActivity;
        }

        /* renamed from: a */
        public final void mo81969a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f82394d.m99462R2().mo4576A1(this.f82394d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81969a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$d */
    /* synthetic */ class C33810d extends C41535k implements C43075l {
        C33810d(Object obj) {
            super(1, obj, AddNewProductActivity.class, "handleNboCardsResult", "handleNboCardsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo81970b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((AddNewProductActivity) this.receiver).m99469Y2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81970b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$e */
    /* synthetic */ class C33811e extends C41535k implements C43075l {
        C33811e(Object obj) {
            super(1, obj, AddNewProductActivity.class, "handleNboCards", "handleNboCards(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo81971b(List list) {
            C41536l.m120489i(list, "p0");
            ((AddNewProductActivity) this.receiver).m99468X2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81971b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$f */
    /* synthetic */ class C33812f extends C41535k implements C43075l {
        C33812f(Object obj) {
            super(1, obj, AddNewProductActivity.class, "handleCategoriesResult", "handleCategoriesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo81972b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((AddNewProductActivity) this.receiver).m99466V2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81972b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$g */
    /* synthetic */ class C33813g extends C41535k implements C43075l {
        C33813g(Object obj) {
            super(1, obj, C40273b.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo81973b(List list) {
            ((C40273b) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81973b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$h */
    /* synthetic */ class C33814h extends C41535k implements C43075l {
        C33814h(Object obj) {
            super(1, obj, AddNewProductActivity.class, "onCategoryClicked", "onCategoryClicked(Lge/bog/mobilebank/products/domain/model/ProductCode;)V", 0);
        }

        /* renamed from: b */
        public final void mo81974b(C39935a0 a0Var) {
            C41536l.m120489i(a0Var, "p0");
            ((AddNewProductActivity) this.receiver).m99471a3(a0Var);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81974b((C39935a0) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$i */
    /* synthetic */ class C33815i extends C41535k implements C43075l {
        C33815i(Object obj) {
            super(1, obj, AddNewProductActivity.class, "handleLoan", "handleLoan(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo81975b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((AddNewProductActivity) this.receiver).m99467W2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81975b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$j */
    /* synthetic */ class C33816j extends C41535k implements C43075l {
        C33816j(Object obj) {
            super(1, obj, AddNewProductActivity.class, "handleSearch", "handleSearch(Lge/bog/mobilebank/products/presentation/addnewproduct/model/SearchedItems;)V", 0);
        }

        /* renamed from: b */
        public final void mo81976b(C31103a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((AddNewProductActivity) this.receiver).m99470Z2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81976b((C31103a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$k */
    static final class C33817k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33817k(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82395d = addNewProductActivity;
        }

        /* renamed from: a */
        public final void mo81977a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C32343x.m95393H0(this.f82395d, "Product_counter", "cla_first_page_from_new_products", "open_cl_app_page_1", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
            C38125h.m112238c(this.f82395d).mo91590a(this.f82395d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81977a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$l */
    static final class C33818l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33818l(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82396d = addNewProductActivity;
        }

        /* renamed from: a */
        public final void mo81978a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C19305k.f53530L.mo47528a().mo4576A1(this.f82396d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81978a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$m */
    static final class C33819m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33819m(AddNewProductActivity addNewProductActivity) {
            super(0);
            this.f82397d = addNewProductActivity;
        }

        /* renamed from: b */
        public final C36596g invoke() {
            return C36596g.m108511d(this.f82397d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$n */
    static final class C33820n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82398d;

        /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$n$a */
        /* synthetic */ class C33821a implements C40275c, C41532h {

            /* renamed from: a */
            final /* synthetic */ C40114c f82399a;

            C33821a(C40114c cVar) {
                this.f82399a = cVar;
            }

            /* renamed from: a */
            public final void mo81981a(C39935a0 a0Var) {
                C41536l.m120489i(a0Var, "p0");
                this.f82399a.mo82000Qu(a0Var);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C40275c) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f82399a, C40114c.class, "onCategoryClicked", "onCategoryClicked(Lge/bog/mobilebank/products/domain/model/ProductCode;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33820n(AddNewProductActivity addNewProductActivity) {
            super(0);
            this.f82398d = addNewProductActivity;
        }

        /* renamed from: b */
        public final C40273b invoke() {
            return new C40273b(new C33821a(this.f82398d.m99465U2().mo82006tw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$o */
    static final class C33822o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33822o(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82400d = addNewProductActivity;
        }

        /* renamed from: a */
        public final void mo81984a(List list) {
            this.f82400d.m99460P2().f88201k.mo53597e();
            EmptyWidget emptyWidget = this.f82400d.m99460P2().f88198h;
            C41536l.m120488h(emptyWidget, "binding.everyProductHeader");
            C32343x.m95455i0(emptyWidget);
            this.f82400d.m99460P2().f88195e.setBackgroundResource(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81984a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$p */
    static final class C33823p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82401d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33823p(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82401d = addNewProductActivity;
        }

        /* renamed from: a */
        public final void mo81985a(List list) {
            C41536l.m120489i(list, "it");
            EmptyWidget emptyWidget = this.f82401d.m99460P2().f88198h;
            C41536l.m120488h(emptyWidget, "binding.everyProductHeader");
            C32343x.m95447f1(emptyWidget);
            LinearLayout linearLayout = this.f82401d.m99460P2().f88195e;
            C41536l.m120488h(linearLayout, "binding.categoriesContainer");
            C32343x.m95447f1(linearLayout);
            this.f82401d.m99460P2().f88201k.mo53595c();
            this.f82401d.m99460P2().f88195e.setBackgroundResource(C36270d.products_rounded_shape);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81985a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$q */
    static final class C33824q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82402d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33824q(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82402d = addNewProductActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f82402d.m99460P2().f88201k.mo53595c();
            this.f82402d.mo74709H1(th);
            LinearLayout linearLayout = this.f82402d.m99460P2().f88195e;
            C41536l.m120488h(linearLayout, "binding.categoriesContainer");
            C32343x.m95455i0(linearLayout);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$r */
    static final class C33825r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33825r(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82403d = addNewProductActivity;
        }

        /* renamed from: a */
        public final void mo81987a(boolean z) {
            if (z) {
                this.f82403d.m99465U2().mo82006tw().mo82004ft();
            } else {
                this.f82403d.m99465U2().mo82006tw().mo81995Ad();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81987a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$s */
    static final class C33826s extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33826s f82404d = new C33826s();

        C33826s() {
            super(1);
        }

        public final void invoke(Boolean bool) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$t */
    static final class C33827t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82405d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33827t(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82405d = addNewProductActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f82405d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$u */
    static final class C33828u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33828u(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82406d = addNewProductActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f82406d.mo74709H1(th);
            RecyclerView recyclerView = this.f82406d.m99460P2().f88203m;
            C41536l.m120488h(recyclerView, "binding.nboProductsList");
            C32343x.m95455i0(recyclerView);
            EmptyWidget emptyWidget = this.f82406d.m99460P2().f88202l;
            C41536l.m120488h(emptyWidget, "binding.nboProductsHeader");
            C32343x.m95455i0(emptyWidget);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$v */
    static final class C33829v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33829v(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82407d = addNewProductActivity;
        }

        /* renamed from: a */
        public final void mo81991a(List list) {
            RecyclerView recyclerView = this.f82407d.m99460P2().f88203m;
            C41536l.m120488h(recyclerView, "binding.nboProductsList");
            C32343x.m95455i0(recyclerView);
            EmptyWidget emptyWidget = this.f82407d.m99460P2().f88202l;
            C41536l.m120488h(emptyWidget, "binding.nboProductsHeader");
            C32343x.m95455i0(emptyWidget);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81991a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$w */
    public static final class C33830w implements C24851a {

        /* renamed from: a */
        final /* synthetic */ AddNewProductActivity f82408a;

        C33830w(AddNewProductActivity addNewProductActivity) {
            this.f82408a = addNewProductActivity;
        }

        /* renamed from: a */
        public void mo48823a(C25106f fVar) {
            C41536l.m120489i(fVar, "card");
        }

        /* renamed from: b */
        public void mo48824b(C25106f fVar) {
            C41536l.m120489i(fVar, "card");
            C38125h.m112238c(this.f82408a).mo91628s(this.f82408a, fVar.mo63594b());
            C32343x.m95393H0(this.f82408a, "Product_counter", fVar.mo63593a().mo92504c(), "nbo_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$x */
    static final class C33831x implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82409a;

        C33831x(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82409a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82409a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82409a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$y */
    static final class C33832y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddNewProductActivity f82410d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33832y(AddNewProductActivity addNewProductActivity) {
            super(1);
            this.f82410d = addNewProductActivity;
        }

        /* renamed from: a */
        public final void mo81994a(String str) {
            C41536l.m120489i(str, "it");
            this.f82410d.m99465U2().mo82006tw().mo82002Y2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo81994a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity$z */
    public static final class C33833z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33833z(ComponentActivity componentActivity) {
            super(0);
            this.f82411d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f82411d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final C36596g m99460P2() {
        return (C36596g) this.f82386F.getValue();
    }

    /* renamed from: Q2 */
    private final C40273b m99461Q2() {
        return (C40273b) this.f82389I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final C18394d m99462R2() {
        C18394d a = C18394d.f51852A.mo46199a(new ToastNotificationArguments(C32343x.m95388F("add.new.product.page.limit.banner.title", new Object[0]), C32343x.m95388F("add.new.product.page.limit.banner.description", new Object[0]), C32343x.m95388F("add.new.product.page.limit.banner.button", new Object[0]), false, false, new ToastNotificationAppearance.Custom(new ToastNotificationIcon.Illustration(new Image.Resource(C36270d.f87470a, (Boolean) null, 2, (DefaultConstructorMarker) null)), (Color) null, (Color) null, 6, (DefaultConstructorMarker) null), (Long) null, 80, (Integer) null, 24, 328, (DefaultConstructorMarker) null));
        a.mo46195J1(new C40112a(this));
        a.mo46194I1(new C40113b(this));
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m99463S2(AddNewProductActivity addNewProductActivity) {
        C41536l.m120489i(addNewProductActivity, "this$0");
        addNewProductActivity.m99465U2().mo82006tw().mo82005q9();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m99464T2(AddNewProductActivity addNewProductActivity) {
        C41536l.m120489i(addNewProductActivity, "this$0");
        addNewProductActivity.m99465U2().mo82006tw().mo82005q9();
        addNewProductActivity.m99465U2().mo82006tw().mo82000Qu(C39935a0.CREDIT_APPLICATION);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final AddNewProductViewModel$ViewModel m99465U2() {
        return (AddNewProductViewModel$ViewModel) this.f82387G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final void m99466V2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C33822o(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C33823p(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C33824q(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m99467W2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C33825r(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, C33826s.f82404d, 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C33827t(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m99468X2(List list) {
        Object obj;
        if (list.isEmpty()) {
            RecyclerView recyclerView = m99460P2().f88203m;
            C41536l.m120488h(recyclerView, "binding.nboProductsList");
            C32343x.m95455i0(recyclerView);
            EmptyWidget emptyWidget = m99460P2().f88202l;
            C41536l.m120488h(emptyWidget, "binding.nboProductsHeader");
            C32343x.m95455i0(emptyWidget);
            return;
        }
        RecyclerView recyclerView2 = m99460P2().f88203m;
        C41536l.m120488h(recyclerView2, "binding.nboProductsList");
        C32343x.m95447f1(recyclerView2);
        EmptyWidget emptyWidget2 = m99460P2().f88202l;
        C41536l.m120488h(emptyWidget2, "binding.nboProductsHeader");
        C32343x.m95447f1(emptyWidget2);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25106f fVar = (C25106f) it.next();
            if (fVar instanceof C25106f.C25108b) {
                obj = C25106f.C25108b.m80121e((C25106f.C25108b) fVar, 0, (Image) null, (String) null, (String) null, (String) null, 0, (C38796a.C38800d) null, (C38796a.C38798b) null, false, C11051p3.f31759c, (Object) null);
            } else if (fVar instanceof C25106f.C25107a) {
                obj = C25106f.C25107a.m80111e((C25106f.C25107a) fVar, 0, (Image) null, (String) null, (String) null, (String) null, 0, (C38796a.C38800d) null, (C38796a.C38798b) null, false, C11051p3.f31759c, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(obj);
        }
        C19874l lVar = this.f82388H;
        if (lVar == null) {
            C41536l.m120506z("nboCardsAdapter");
            lVar = null;
        }
        lVar.mo6029i(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m99469Y2(C31128a aVar) {
        C31132b.m92643e(aVar, (int[]) null, new C33828u(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C33829v(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m99470Z2(C31103a aVar) {
        boolean z;
        PageDescriptionView pageDescriptionView = m99460P2().f88197g;
        C41536l.m120488h(pageDescriptionView, "binding.emptySearch");
        if (!aVar.mo71302b().isEmpty() || !aVar.mo71301a().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C32343x.m95483r1(pageDescriptionView, z, false, 2, (Object) null);
        LinearLayout linearLayout = m99460P2().f88195e;
        C41536l.m120488h(linearLayout, "binding.categoriesContainer");
        C32343x.m95483r1(linearLayout, !aVar.mo71301a().isEmpty(), false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m99471a3(C39935a0 a0Var) {
        switch (C33807b.f82391a[a0Var.ordinal()]) {
            case 1:
                C32343x.m95393H0(this, "Product_counter", (String) null, "piggy_bank_click_new_product_menu", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
                C38125h.m112238c(this).mo91642z(this);
                return;
            case 2:
                C32343x.m95393H0(this, "Product_counter", (String) null, "click_dep_loan", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
                startActivity(new Intent(this, CashCoverLoanActivity.class));
                return;
            case 3:
                C32343x.m95393H0(this, "Product_counter", (String) null, "click_insurance", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
                C38122f.C38123a.m112227w(C38125h.m112238c(this), this, (String) null, 2, (Object) null);
                return;
            case 4:
                C32343x.m95393H0(this, "Product_counter", "applications_new_application", "open_deposit_choice", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
                C38122f.C38123a.m112225u(C38125h.m112238c(this), this, (String) null, 2, (Object) null);
                return;
            case 5:
                C32343x.m95393H0(this, "Product_counter", "applications_new_application", "open_debit_card_choice", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
                C38125h.m112238c(this).mo91597c0(this);
                return;
            case 6:
                C32343x.m95393H0(this, "Product_counter", (String) null, "click_bnpl", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
                C38125h.m112238c(this).mo91637w0(C24849e.BNPL_LIMIT, this);
                return;
            case 7:
                m99465U2().mo82012ww();
                return;
            case 8:
                C32343x.m95393H0(this, "Product_counter", (String) null, "click_travel_card", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
                C38122f.C38123a.m112203D(C38125h.m112238c(this), this, (String) null, 2, (Object) null);
                return;
            case 9:
                C32343x.m95393H0(this, "Product_counter", (String) null, "click_dd_sto", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
                mo86447x2(DDSTOListActivity.class);
                return;
            case 10:
                C32343x.m95393H0(this, "Product_counter", (String) null, "click_investments", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
                C38122f.C38123a.m112226v(C38125h.m112238c(this), this, (String) null, (String) null, false, 14, (Object) null);
                return;
            default:
                return;
        }
    }

    /* renamed from: b3 */
    private final void m99472b3(C24851a aVar) {
        this.f82388H = C38125h.m112240e(this).mo72371a(aVar);
        RecyclerView recyclerView = m99460P2().f88203m;
        C19874l lVar = this.f82388H;
        if (lVar == null) {
            C41536l.m120506z("nboCardsAdapter");
            lVar = null;
        }
        recyclerView.setAdapter(lVar);
        m99460P2().f88196f.setAdapter(m99461Q2());
    }

    /* renamed from: c3 */
    private final void m99473c3() {
        m99460P2().f88206p.f68494e.setTitle(C32343x.m95388F("add.new.product.page.header", new Object[0]));
        m99460P2().f88205o.setHint(C32343x.m95388F("add.new.product.page.search", new Object[0]));
        m99460P2().f88202l.setTitle(C32343x.m95388F("add.new.product.page.nbo.title", new Object[0]));
        m99460P2().f88198h.setTitle(C32343x.m95388F("add.new.product.page.categories", new Object[0]));
        m99460P2().f88197g.setText(C32343x.m95388F("add.new.product.page.empty.state.message", new Object[0]));
    }

    /* renamed from: d3 */
    private final void m99474d3() {
        m99460P2().f88205o.setOnTextChangeListener(new C33832y(this));
    }

    /* renamed from: l1 */
    private final void m99475l1() {
        m99465U2().mo82009uw().mo4819k(this, new C33831x(new C33810d(this)));
        m99465U2().mo82011vw().mo82003b9().mo4819k(this, new C33831x(new C33811e(this)));
        m99465U2().mo82011vw().mo81996C1().mo4819k(this, new C33831x(new C33812f(this)));
        m99465U2().mo82011vw().mo81999Jn().mo4819k(this, new C33831x(new C33813g(m99461Q2())));
        m99465U2().mo82011vw().mo82008uv().mo4819k(this, new C33831x(new C33814h(this)));
        m99465U2().mo82011vw().mo82010v().mo4819k(this, new C33831x(new C33815i(this)));
        m99465U2().mo82011vw().mo82001S1().mo4819k(this, new C33831x(new C33816j(this)));
        C37224b.m109963b(m99465U2().mo82011vw().mo81997Ci(), this, new C33817k(this));
        C37224b.m109963b(m99465U2().mo82011vw().mo81998Hg(), this, new C33818l(this));
        C37224b.m109963b(m99465U2().mo82011vw().mo82007ua(), this, new C33809c(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m99460P2());
        m99473c3();
        m99475l1();
        m99472b3(new C33830w(this));
        m99474d3();
    }
}
