package p341ge.bog.mobilebank.products.presentation.details.creditcard;

import a41.C30489f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31123l;
import g20.C20626o;
import g91.C32312j;
import g91.C32343x;
import he1.C41238w;
import hy0.C36272f;
import iy0.C36591e0;
import iy0.C36594f0;
import iy0.C36598g1;
import iy0.C36601h1;
import iy0.C36603i0;
import iy0.C36604i1;
import iy0.C36607j1;
import iy0.C36612l0;
import iy0.C36615m0;
import iy0.C36627q0;
import iy0.C36630r0;
import iy0.C36633s0;
import iy0.C36636t0;
import iy0.C36639u0;
import iy0.C36642v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mz0.C37320i;
import mz0.C37322j;
import mz0.C37324k;
import mz0.C37326l;
import mz0.C37328m;
import mz0.C37329n;
import mz0.C37330o;
import mz0.C37331p;
import mz0.C37332q;
import mz0.C37334s;
import o31.C37599g;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d;
import p90.C27393p4;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import wz0.C39751b;
import wz0.C39758e;
import wz0.C39759f;
import wz0.C39761h;
import wz0.C39763j;
import wz0.C39764k;

/* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c */
public final class C33935c extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C37334s f82552f;

    /* renamed from: g */
    private final boolean f82553g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C43064a f82554h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C43064a f82555i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C43075l f82556j;

    /* renamed from: k */
    private final C43075l f82557k;

    /* renamed from: l */
    private C43075l f82558l;

    /* renamed from: m */
    private C43079p f82559m;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$a */
    public final class C33936a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36598g1 f82560d;

        /* renamed from: e */
        final /* synthetic */ C33935c f82561e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33936a(C33935c cVar, C36598g1 g1Var) {
            super(g1Var.mo3946b());
            C41536l.m120489i(g1Var, "binding");
            this.f82561e = cVar;
            this.f82560d = g1Var;
            g1Var.f88212g.setText(C32343x.m95388F("creditcard.account.details.agreement", new Object[0]));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m99776j(C33950d.C33952b bVar, C33935c cVar, View view) {
            C41536l.m120489i(bVar, "$data");
            C41536l.m120489i(cVar, "this$0");
            String d = bVar.mo82144d();
            if (d != null) {
                cVar.f82552f.mo82209Zm(d, String.valueOf(bVar.mo82143c()));
            }
        }

        /* renamed from: i */
        public final void mo82134i(C33950d.C33952b bVar) {
            boolean z;
            int i;
            boolean z2;
            int i2;
            boolean z3;
            int i3;
            boolean z4;
            C41536l.m120489i(bVar, "data");
            this.f82560d.f88214i.setText(bVar.mo82142b());
            ListItem listItem = this.f82560d.f88216k;
            C41536l.m120488h(listItem, "binding.creditLimitItem");
            String b = bVar.mo82142b();
            int i4 = 0;
            if (b == null || b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = 0;
            } else {
                i = 8;
            }
            listItem.setVisibility(i);
            BigDividerView bigDividerView = this.f82560d.f88215j;
            C41536l.m120488h(bigDividerView, "binding.creditLimitDivider");
            String b2 = bVar.mo82142b();
            if (b2 == null || b2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            bigDividerView.setVisibility(i2);
            this.f82560d.f88213h.setText(bVar.mo82141a() + " %");
            this.f82560d.f88217l.setText(bVar.mo82145e() + " %");
            ListItem listItem2 = this.f82560d.f88210e;
            C41536l.m120488h(listItem2, "binding.agreement");
            String d = bVar.mo82144d();
            if (d == null || d.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            listItem2.setVisibility(i3);
            BigDividerView bigDividerView2 = this.f82560d.f88211f;
            C41536l.m120488h(bigDividerView2, "binding.agreementDivider");
            String d2 = bVar.mo82144d();
            if (d2 == null || d2.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!(!z4)) {
                i4 = 8;
            }
            bigDividerView2.setVisibility(i4);
            this.f82560d.f88210e.setOnClickListener(new C37324k(bVar, this.f82561e));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$b */
    public final class C33937b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36601h1 f82562d;

        /* renamed from: e */
        final /* synthetic */ C33935c f82563e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33937b(C33935c cVar, C36601h1 h1Var) {
            super(h1Var.mo3946b());
            C41536l.m120489i(h1Var, "binding");
            this.f82563e = cVar;
            this.f82562d = h1Var;
        }

        /* renamed from: h */
        public final void mo82135h(C33950d.C33954d dVar) {
            C41536l.m120489i(dVar, "data");
            C36601h1 h1Var = this.f82562d;
            h1Var.f88252f.setText(dVar.mo82147b());
            h1Var.f88257k.setText(dVar.mo82151f());
            h1Var.f88254h.setText(dVar.mo82149d());
            h1Var.f88255i.setText(dVar.mo82150e());
            h1Var.f88251e.setText(dVar.mo82146a());
            h1Var.f88253g.setText(dVar.mo82148c());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$c */
    public final class C33938c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36604i1 f82564d;

        /* renamed from: e */
        final /* synthetic */ C33935c f82565e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33938c(C33935c cVar, C36604i1 i1Var) {
            super(i1Var.mo3946b());
            C41536l.m120489i(i1Var, "binding");
            this.f82565e = cVar;
            this.f82564d = i1Var;
            i1Var.f88277k.setOnClickListener(new C37328m(cVar));
            i1Var.f88272f.setOnClickListener(new C37329n(cVar));
            i1Var.f88275i.setOnClickListener(new C37330o(cVar));
            i1Var.f88276j.setOnClickListener(new C37331p(cVar));
            i1Var.f88274h.setOnClickListener(new C37332q(cVar));
            i1Var.f88271e.setButtonText(C32343x.m95388F("text.account.cancellation.button", new Object[0]));
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static final void m99785o(C33935c cVar, C33950d.C33961k kVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(kVar, "$data");
            cVar.f82556j.invoke(Long.valueOf(kVar.mo82165a()));
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m99786p(C33935c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82552f.mo82227n4();
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final void m99787q(C33935c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82552f.mo82226m0();
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m99788r(C33935c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82552f.mo82213be();
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static final void m99789s(C33935c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82552f.mo38232P9();
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public static final void m99790t(C33935c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82552f.mo82199Ak();
        }

        /* renamed from: n */
        public final void mo82136n(C33950d.C33961k kVar) {
            C41536l.m120489i(kVar, "data");
            C36604i1 i1Var = this.f82564d;
            C33935c cVar = this.f82565e;
            Button button = i1Var.f88277k;
            C41536l.m120488h(button, "topUp");
            C32343x.m95483r1(button, kVar.mo82171g(), false, 2, (Object) null);
            Button button2 = i1Var.f88275i;
            C41536l.m120488h(button2, "share");
            C32343x.m95483r1(button2, kVar.mo82169e(), false, 2, (Object) null);
            Button button3 = i1Var.f88276j;
            C41536l.m120488h(button3, "statements");
            C32343x.m95483r1(button3, kVar.mo82170f(), false, 2, (Object) null);
            Button button4 = i1Var.f88274h;
            C41536l.m120488h(button4, "requisites");
            C32343x.m95483r1(button4, kVar.mo82168d(), false, 2, (Object) null);
            Button button5 = i1Var.f88272f;
            C41536l.m120488h(button5, "p2pTopUp");
            C32343x.m95483r1(button5, kVar.mo82167c(), false, 2, (Object) null);
            i1Var.f88272f.setButtonText(C32343x.m95388F(C32312j.f79740j, new Object[0]));
            ImageView imageView = i1Var.f88273g;
            C41536l.m120488h(imageView, "p2pTopUpNewBadge");
            C32343x.m95483r1(imageView, kVar.mo82167c(), false, 2, (Object) null);
            Button button6 = i1Var.f88271e;
            C41536l.m120488h(button6, "close");
            C32343x.m95483r1(button6, kVar.mo82166b(), false, 2, (Object) null);
            i1Var.f88271e.setOnClickListener(new C37326l(cVar, kVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$d */
    public final class C33939d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36607j1 f82566d;

        /* renamed from: e */
        final /* synthetic */ C33935c f82567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33939d(C33935c cVar, C36607j1 j1Var) {
            super(j1Var.mo3946b());
            C41536l.m120489i(j1Var, "binding");
            this.f82567e = cVar;
            this.f82566d = j1Var;
        }

        /* renamed from: h */
        public final void mo82137h(C33950d.C33966p pVar) {
            boolean z;
            int i;
            boolean z2;
            C41536l.m120489i(pVar, "data");
            C36607j1 j1Var = this.f82566d;
            j1Var.f88291h.setText(pVar.mo82174b());
            j1Var.f88288e.setText(pVar.mo82173a());
            j1Var.f88293j.setText(pVar.mo82175c());
            ListItem listItem = j1Var.f88290g;
            C41536l.m120488h(listItem, "fullPaymentItem");
            String a = pVar.mo82173a();
            int i2 = 0;
            if (a == null || a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = 0;
            } else {
                i = 8;
            }
            listItem.setVisibility(i);
            BigDividerView bigDividerView = j1Var.f88289f;
            C41536l.m120488h(bigDividerView, "fullPaymentDivider");
            String a2 = pVar.mo82173a();
            if (a2 == null || a2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                i2 = 8;
            }
            bigDividerView.setVisibility(i2);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$e */
    static final class C33940e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33935c f82568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33940e(C33935c cVar) {
            super(1);
            this.f82568d = cVar;
        }

        /* renamed from: a */
        public final void mo82138a(long j) {
            C43075l q = this.f82568d.mo82130q();
            if (q != null) {
                q.invoke(Long.valueOf(j));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82138a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$f */
    static final class C33941f extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C33935c f82569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33941f(C33935c cVar) {
            super(2);
            this.f82569d = cVar;
        }

        /* renamed from: a */
        public final void mo82139a(long j, boolean z) {
            C43079p r = this.f82569d.mo82131r();
            if (r != null) {
                r.invoke(Long.valueOf(j), Boolean.valueOf(z));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo82139a(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$g */
    static final class C33942g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C33935c f82570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33942g(C33935c cVar) {
            super(0);
            this.f82570d = cVar;
        }

        public final void invoke() {
            this.f82570d.f82554h.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$h */
    static final class C33943h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C33935c f82571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33943h(C33935c cVar) {
            super(0);
            this.f82571d = cVar;
        }

        public final void invoke() {
            this.f82571d.f82555i.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$i */
    static final class C33944i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C33935c f82572d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33944i(C33935c cVar) {
            super(0);
            this.f82572d = cVar;
        }

        public final void invoke() {
            this.f82572d.f82552f.mo82203G0();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$j */
    public static final class C33945j extends RecyclerView.C1734f0 {
        C33945j(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$k */
    public static final class C33946k extends RecyclerView.C1734f0 {
        C33946k(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$l */
    public static final class C33947l extends RecyclerView.C1734f0 {
        C33947l(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$m */
    public static final class C33948m extends RecyclerView.C1734f0 {
        C33948m(ConstraintLayout constraintLayout) {
            super(constraintLayout);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.c$n */
    public static final class C33949n extends RecyclerView.C1734f0 {
        C33949n(LayerView layerView) {
            super(layerView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33935c(C37334s sVar, boolean z, C43064a aVar, C43064a aVar2, C43075l lVar, C43075l lVar2) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(sVar, "viewModel");
        C41536l.m120489i(aVar, "onGooglePayClicked");
        C41536l.m120489i(aVar2, "onGooglePayDismissed");
        C41536l.m120489i(lVar, "onCloseAccountClicked");
        C41536l.m120489i(lVar2, "onHeaderLoadFailed");
        this.f82552f = sVar;
        this.f82553g = z;
        this.f82554h = aVar;
        this.f82555i = aVar2;
        this.f82556j = lVar;
        this.f82557k = lVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m99769s(C33935c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.f82552f.mo70819Tl();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m99770t(C33935c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.f82552f.mo70818Ss();
    }

    public int getItemViewType(int i) {
        C33950d dVar = (C33950d) mo6027g(i);
        if (dVar instanceof C33950d.C33967q) {
            return C36272f.f87559w0;
        }
        if (dVar instanceof C33950d.C33961k) {
            return C36272f.item_credit_card_operations_buttons;
        }
        if (dVar instanceof C33950d.C33951a) {
            return C36272f.item_account_cards_swiper;
        }
        if (dVar instanceof C33950d.C33955e) {
            return C36272f.item_account_card_insurance_offer;
        }
        if (dVar instanceof C33950d.C33952b) {
            return C36272f.item_credit_account_details;
        }
        if (dVar instanceof C33950d.C33954d) {
            return C36272f.item_credit_card_billing_details;
        }
        if (dVar instanceof C33950d.C33966p) {
            return C36272f.item_credit_card_payment_details;
        }
        if (dVar instanceof C33950d.C33959i) {
            return C36272f.item_account_linked_loans_header;
        }
        if (dVar instanceof C33950d.C33953c) {
            return C36272f.item_account_all_operations_button;
        }
        if (dVar instanceof C33950d.C33956f) {
            return C36272f.item_account_operations_empty;
        }
        if (dVar instanceof C33950d.C33960j) {
            return C36272f.item_account_operation_item;
        }
        if (dVar instanceof C33950d.C33962l) {
            return C36272f.item_account_operations_date;
        }
        if (dVar instanceof C33950d.C33963m) {
            return C36272f.item_account_operations_header;
        }
        if (dVar instanceof C33950d.C33964n) {
            return C36272f.item_account_operations_loading;
        }
        if (dVar instanceof C33950d.C33965o) {
            return C36272f.item_account_operations_loading_error;
        }
        if (dVar instanceof C33950d.C33958h) {
            return C36272f.item_account_linked_loan;
        }
        if (dVar instanceof C33950d.C33957g) {
            return C36272f.f87556E;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C20626o oVar;
        C41536l.m120489i(f0Var, "holder");
        C33950d dVar = (C33950d) mo6027g(i);
        if (dVar instanceof C33950d.C33967q) {
            C33950d.C33967q qVar = (C33950d.C33967q) dVar;
            ((C30489f) f0Var).mo70837m(qVar.mo82176a(), qVar.mo82177b());
        } else if (dVar instanceof C33950d.C33961k) {
            ((C33938c) f0Var).mo82136n((C33950d.C33961k) dVar);
        } else if (dVar instanceof C33950d.C33951a) {
            ((C39751b) f0Var).mo93489i(((C33950d.C33951a) dVar).mo82140a());
        } else if (dVar instanceof C33950d.C33952b) {
            ((C33936a) f0Var).mo82134i((C33950d.C33952b) dVar);
        } else if (dVar instanceof C33950d.C33954d) {
            ((C33937b) f0Var).mo82135h((C33950d.C33954d) dVar);
        } else if (dVar instanceof C33950d.C33966p) {
            ((C33939d) f0Var).mo82137h((C33950d.C33966p) dVar);
        } else {
            boolean z = true;
            if (dVar instanceof C33950d.C33958h) {
                if (i != getItemCount() - 1 && (mo6027g(i + 1) instanceof C33950d.C33958h)) {
                    z = false;
                }
                C33950d.C33958h hVar = (C33950d.C33958h) dVar;
                ((C39761h) f0Var).mo93502i(hVar.mo82156d(), hVar.mo82155c(), hVar.mo82153a(), hVar.mo82154b(), z);
            } else if (dVar instanceof C33950d.C33962l) {
                ((C39764k) f0Var).mo93505h(((C33950d.C33962l) dVar).mo82172a());
            } else if (dVar instanceof C33950d.C33960j) {
                C33950d.C33960j jVar = (C33950d.C33960j) dVar;
                ((C39763j) f0Var).mo93504i(jVar.mo82157a(), jVar.mo82162f(), jVar.mo82163g(), jVar.mo82158b(), jVar.mo82160d(), jVar.mo82159c(), jVar.mo82161e(), jVar.mo82164h());
            } else if (dVar instanceof C33950d.C33957g) {
                if (f0Var instanceof C20626o) {
                    oVar = (C20626o) f0Var;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    oVar.mo49175k(true);
                }
            }
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C36272f.f87559w0) {
            C31123l d = C31123l.m92612d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C30489f(d, this.f82552f, (Integer) null, this.f82557k, 4, (DefaultConstructorMarker) null);
        } else if (i == C36272f.item_credit_card_operations_buttons) {
            C36604i1 d2 = C36604i1.m108546d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C33938c(this, d2);
        } else if (i == C36272f.item_account_cards_swiper) {
            C36603i0 d3 = C36603i0.m108542d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            C39751b bVar = new C39751b(d3);
            bVar.mo93492n(new C33940e(this));
            bVar.mo93493o(new C33941f(this));
            return bVar;
        } else if (i == C36272f.item_account_card_insurance_offer) {
            C36594f0 d4 = C36594f0.m108503d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …  false\n                )");
            C39758e eVar = new C39758e(d4, this.f82553g);
            eVar.mo93499l(new C33944i(this));
            return eVar;
        } else if (i == C36272f.item_credit_account_details) {
            C36598g1 d5 = C36598g1.m108520d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …  false\n                )");
            return new C33936a(this, d5);
        } else if (i == C36272f.item_credit_card_billing_details) {
            C36601h1 d6 = C36601h1.m108533d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(\n               …  false\n                )");
            return new C33937b(this, d6);
        } else if (i == C36272f.item_credit_card_payment_details) {
            C36607j1 d7 = C36607j1.m108559d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(\n               …  false\n                )");
            return new C33939d(this, d7);
        } else if (i == C36272f.item_account_linked_loans_header) {
            C36615m0 d8 = C36615m0.m108594d(from, viewGroup, false);
            C41536l.m120488h(d8, "inflate(\n               …  false\n                )");
            return new C39759f(d8);
        } else if (i == C36272f.item_account_operations_header) {
            C36636t0 d9 = C36636t0.m108680d(from, viewGroup, false);
            C41536l.m120488h(d9, "inflate(\n               …  false\n                )");
            return new C33945j(d9.mo3946b());
        } else if (i == C36272f.item_account_operations_date) {
            C36630r0 d12 = C36630r0.m108656d(from, viewGroup, false);
            C41536l.m120488h(d12, "inflate(\n               …  false\n                )");
            return new C39764k(d12);
        } else if (i == C36272f.item_account_operation_item) {
            C36627q0 d13 = C36627q0.m108644d(from, viewGroup, false);
            C41536l.m120488h(d13, "inflate(\n               …  false\n                )");
            return new C39763j(d13, this.f82552f);
        } else if (i == C36272f.item_account_operations_loading_error) {
            C36642v0 d14 = C36642v0.m108704d(from, viewGroup, false);
            C41536l.m120488h(d14, "inflate(\n               …  false\n                )");
            d14.f88442e.setOnClickListener(new C37320i(this));
            return new C33946k(d14.mo3946b());
        } else if (i == C36272f.item_account_operations_empty) {
            C36633s0 d15 = C36633s0.m108668d(from, viewGroup, false);
            C41536l.m120488h(d15, "inflate(\n               …  false\n                )");
            return new C33947l(d15.mo3946b());
        } else if (i == C36272f.item_account_all_operations_button) {
            C36591e0 d16 = C36591e0.m108491d(from, viewGroup, false);
            C41536l.m120488h(d16, "inflate(\n               …  false\n                )");
            d16.mo3946b().setOnClickListener(new C37322j(this));
            return new C33948m(d16.mo3946b());
        } else if (i == C36272f.item_account_operations_loading) {
            C36639u0 d17 = C36639u0.m108692d(from, viewGroup, false);
            C41536l.m120488h(d17, "inflate(\n               …  false\n                )");
            return new C33949n(d17.mo3946b());
        } else if (i == C36272f.item_account_linked_loan) {
            C36612l0 d18 = C36612l0.m108581d(from, viewGroup, false);
            C41536l.m120488h(d18, "inflate(\n               …  false\n                )");
            return new C39761h(d18, this.f82552f);
        } else if (i == C36272f.f87556E) {
            C27393p4 d19 = C27393p4.m84877d(from, viewGroup, false);
            C41536l.m120488h(d19, "inflate(\n               …      false\n            )");
            return new C20626o(d19, new C33942g(this), new C33943h(this));
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }

    /* renamed from: q */
    public final C43075l mo82130q() {
        return this.f82558l;
    }

    /* renamed from: r */
    public final C43079p mo82131r() {
        return this.f82559m;
    }

    /* renamed from: u */
    public final void mo82132u(C43075l lVar) {
        this.f82558l = lVar;
    }

    /* renamed from: v */
    public final void mo82133v(C43079p pVar) {
        this.f82559m = pVar;
    }
}
