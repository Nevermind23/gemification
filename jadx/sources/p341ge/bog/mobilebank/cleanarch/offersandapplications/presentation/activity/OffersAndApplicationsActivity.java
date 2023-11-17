package p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b00.C19292b;
import c00.C19417a;
import f00.C20317g;
import g00.C20588a;
import g91.C32343x;
import h00.C24846c;
import hc1.C41143c;
import hc1.C41185v;
import hd0.C24978b;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k81.C36906i;
import k81.C36917q;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import o00.C26656a;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.StatusEntity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.model.CreditAppLoanDetails;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p748eu.C20292b;
import p758fu.C20557a;
import p90.C27245a1;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity */
public final class OffersAndApplicationsActivity extends C21393b implements C26656a, C41185v.C41186a {

    /* renamed from: M */
    public static final C21371b f57206M = new C21371b((DefaultConstructorMarker) null);

    /* renamed from: N */
    private static final C21370a f57207N = new C21370a();

    /* renamed from: G */
    public Client f57208G;

    /* renamed from: H */
    public PreferencesApiManager f57209H;

    /* renamed from: I */
    public C20292b f57210I;

    /* renamed from: J */
    private final C41217g f57211J = C41219i.m119470b(new C21372c(this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final C20317g f57212K = new C20317g();

    /* renamed from: L */
    private final C41217g f57213L = new C1617p0(C41520a0.m120436b(OffersAndApplicationsViewModel.class), new C21390u(this), new C21389t(this), new C21391v((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$a */
    public static final class C21370a {

        /* renamed from: a */
        private final String f57214a = "credit.info.block.popUp.header.text";

        /* renamed from: b */
        private final String f57215b = "credit.info.block.popUp.main.text";

        /* renamed from: c */
        private final String f57216c = "credit.info.block.popUp.secondary.button.text";

        /* renamed from: d */
        private final String f57217d = "credit.info.block.popUp.primary.button.text";

        C21370a() {
        }

        /* renamed from: a */
        public final String mo53401a() {
            return this.f57214a;
        }

        /* renamed from: b */
        public final String mo53402b() {
            return this.f57216c;
        }

        /* renamed from: c */
        public final String mo53403c() {
            return this.f57215b;
        }

        /* renamed from: d */
        public final String mo53404d() {
            return this.f57217d;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$b */
    public static final class C21371b {
        private C21371b() {
        }

        public /* synthetic */ C21371b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m69137b(C21371b bVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            bVar.mo53405a(context, z);
        }

        /* renamed from: a */
        public final void mo53405a(Context context, boolean z) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, OffersAndApplicationsActivity.class);
            intent.putExtra("OPEN_DEBIT_CARD", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$c */
    static final class C21372c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsActivity f57218d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21372c(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            super(0);
            this.f57218d = offersAndApplicationsActivity;
        }

        /* renamed from: b */
        public final C27245a1 invoke() {
            C27245a1 a = C27245a1.m84285a(this.f57218d.findViewById(C10322k.f28864lt));
            C41536l.m120488h(a, "bind(findViewById(R.id.root))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$d */
    static final class C21373d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsActivity f57219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21373d(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            super(1);
            this.f57219d = offersAndApplicationsActivity;
        }

        /* renamed from: a */
        public final void mo53407a(boolean z) {
            C41185v P2 = this.f57219d.m69102f3();
            if (P2 != null) {
                P2.mo95635L2(z);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53407a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$e */
    static final class C21374e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsActivity f57220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21374e(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            super(1);
            this.f57220d = offersAndApplicationsActivity;
        }

        /* renamed from: a */
        public final void mo53408a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                OffersAndApplicationsActivity offersAndApplicationsActivity = this.f57220d;
                String str = (String) mVar.mo95675a();
                if (((Boolean) mVar.mo95676b()).booleanValue()) {
                    C12910e.m48797o(offersAndApplicationsActivity, C32343x.m95388F(str, new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
                } else {
                    C12910e.m48790h(offersAndApplicationsActivity, C32343x.m95388F(str, new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53408a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$f */
    static final class C21375f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsActivity f57221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21375f(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            super(1);
            this.f57221d = offersAndApplicationsActivity;
        }

        /* renamed from: a */
        public final void mo53409a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f57221d.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53409a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$g */
    /* synthetic */ class C21376g extends C41535k implements C43075l {
        C21376g(Object obj) {
            super(1, obj, OffersAndApplicationsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo53410b(boolean z) {
            ((OffersAndApplicationsActivity) this.receiver).mo53400q3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53410b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$h */
    /* synthetic */ class C21377h extends C41535k implements C43075l {
        C21377h(Object obj) {
            super(1, obj, OffersAndApplicationsActivity.class, "onInitialDataResult", "onInitialDataResult(Lge/bog/mobilebank/cleanarch/offersandapplications/presentation/model/OffersAndApplicationsInitialData;)V", 0);
        }

        /* renamed from: b */
        public final void mo53411b(C20588a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OffersAndApplicationsActivity) this.receiver).m69112p3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53411b((C20588a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$i */
    static final class C21378i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsActivity f57222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21378i(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            super(1);
            this.f57222d = offersAndApplicationsActivity;
        }

        /* renamed from: a */
        public final void mo53412a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            FrameLayout frameLayout = this.f57222d.m69099Z2().f68282s;
            C41536l.m120488h(frameLayout, "binding.retryBtnContainer");
            C32343x.m95447f1(frameLayout);
            this.f57222d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53412a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$j */
    /* synthetic */ class C21379j extends C41535k implements C43075l {
        C21379j(Object obj) {
            super(1, obj, OffersAndApplicationsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo53413b(boolean z) {
            ((OffersAndApplicationsActivity) this.receiver).mo53400q3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53413b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$k */
    /* synthetic */ class C21380k extends C41535k implements C43075l {
        C21380k(Object obj) {
            super(1, obj, OffersAndApplicationsActivity.class, "showPreContract", "showPreContract(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo53414b(String str) {
            C41536l.m120489i(str, "p0");
            ((OffersAndApplicationsActivity) this.receiver).m69076E3(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53414b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$l */
    /* synthetic */ class C21381l extends C41535k implements C43075l {
        C21381l(Object obj) {
            super(1, obj, OffersAndApplicationsActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo53415b(C21503d.C21504a aVar) {
            ((OffersAndApplicationsActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53415b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$m */
    static final class C21382m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsActivity f57223d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21382m(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            super(1);
            this.f57223d = offersAndApplicationsActivity;
        }

        /* renamed from: a */
        public final void mo53416a(C37223a aVar) {
            HashMap hashMap = (HashMap) aVar.mo90296a();
            if (hashMap != null) {
                this.f57223d.m69080G3(hashMap);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53416a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$n */
    /* synthetic */ class C21383n extends C41535k implements C43075l {
        C21383n(Object obj) {
            super(1, obj, OffersAndApplicationsActivity.class, "onCreditInfoConfirmationResult", "onCreditInfoConfirmationResult(Lge/bog/mobilebank/cleanarch/data/common/entity/StatusEntity;)V", 0);
        }

        /* renamed from: b */
        public final void mo53417b(StatusEntity statusEntity) {
            C41536l.m120489i(statusEntity, "p0");
            ((OffersAndApplicationsActivity) this.receiver).m69111o3(statusEntity);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53417b((StatusEntity) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$o */
    /* synthetic */ class C21384o extends C41535k implements C43075l {
        C21384o(Object obj) {
            super(1, obj, OffersAndApplicationsActivity.class, "onCreditInfoConfirmationError", "onCreditInfoConfirmationError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo53418b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OffersAndApplicationsActivity) this.receiver).m69110n3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53418b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$p */
    /* synthetic */ class C21385p implements C20317g.C20323f, C41532h {
        C21385p() {
        }

        /* renamed from: a */
        public final void mo48804a(Application application) {
            C41536l.m120489i(application, "p0");
            OffersAndApplicationsActivity.this.m69104h3(application);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C20317g.C20323f) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(1, OffersAndApplicationsActivity.this, OffersAndApplicationsActivity.class, "handleCreditApplicationClick", "handleCreditApplicationClick(Lge/bog/mobilebank/model/Application;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$q */
    static final class C21386q implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57225a;

        C21386q(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57225a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57225a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57225a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$r */
    static final class C21387r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsActivity f57226d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21387r(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            super(0);
            this.f57226d = offersAndApplicationsActivity;
        }

        public final void invoke() {
            MyCreditInfoDescriptionActivity.f57161L.mo53351a(this.f57226d);
            C36546y.m108282F().mo27152s("my_credit_info", "", "my_credit_info_banner_opened");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$s */
    static final class C21388s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OffersAndApplicationsActivity f57227d;

        /* renamed from: e */
        final /* synthetic */ C36906i f57228e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21388s(OffersAndApplicationsActivity offersAndApplicationsActivity, C36906i iVar) {
            super(0);
            this.f57227d = offersAndApplicationsActivity;
            this.f57228e = iVar;
        }

        public final void invoke() {
            this.f57227d.mo53399e3().setCreditInfoRegisterBannerInOffersShown(this.f57227d.mo53397a3().getLoginInfo().mo90307d());
            this.f57227d.f57212K.mo48796J(this.f57228e);
            C36546y.m108282F().mo27152s("my_credit_info", "", "my_credit_info_banner_closed");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$t */
    public static final class C21389t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21389t(ComponentActivity componentActivity) {
            super(0);
            this.f57229d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57229d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$u */
    public static final class C21390u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21390u(ComponentActivity componentActivity) {
            super(0);
            this.f57230d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57230d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity$v */
    public static final class C21391v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57231d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57232e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21391v(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57231d = aVar;
            this.f57232e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57231d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57232e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: A3 */
    private final void m69071A3() {
        C21370a aVar = f57207N;
        C35388f2.m105072l2(this, C32343x.m95388F(aVar.mo53401a(), new Object[0]), C32343x.m95388F(aVar.mo53403c(), new Object[0]), C32343x.m95388F(aVar.mo53402b(), new Object[0]), C32343x.m95388F(aVar.mo53404d(), new Object[0]), new C21402j(this), new C21403k(this), true, false, (String) null, (View.OnClickListener) null, 896, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m69072B3(OffersAndApplicationsActivity offersAndApplicationsActivity, View view) {
        C41536l.m120489i(offersAndApplicationsActivity, "this$0");
        offersAndApplicationsActivity.m69103g3().mo53446Ew(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m69073C3(OffersAndApplicationsActivity offersAndApplicationsActivity, View view) {
        C41536l.m120489i(offersAndApplicationsActivity, "this$0");
        C32343x.m95393H0(offersAndApplicationsActivity, "offers_and_applications", (String) null, "toggle_popup_no_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: D3 */
    private final void m69074D3(boolean z) {
        String str;
        C27245a1 Z2 = m69099Z2();
        Group group = Z2.f68275l;
        C41536l.m120488h(group, "emptyStateGroup");
        C32343x.m95447f1(group);
        RecyclerView recyclerView = Z2.f68280q;
        C41536l.m120488h(recyclerView, "recyclerView");
        C32343x.m95455i0(recyclerView);
        BogTextView bogTextView = Z2.f68277n;
        if (z) {
            str = C32343x.m95388F("offers.disabled.Inactive.credit.info.permission.text", new Object[0]);
        } else {
            str = C32343x.m95452h0(C10328q.no_active_offers_and_applications, new Object[0]);
        }
        bogTextView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m69076E3(String str) {
        C27113k.C27114a aVar = C27113k.f68083P;
        String string = getString(C10328q.header_text_my_credit_info);
        C41536l.m120488h(string, "getString(R.string.header_text_my_credit_info)");
        C27113k c = C27113k.C27114a.m84066c(aVar, str, false, (String) null, (ArrayList) null, (Summary) null, string, 30, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: F3 */
    private final void m69078F3() {
        C27245a1 Z2 = m69099Z2();
        ImageView imageView = Z2.f68276m;
        C41536l.m120488h(imageView, "emptyStateImage");
        C32343x.m95455i0(imageView);
        BogTextView bogTextView = Z2.f68277n;
        C41536l.m120488h(bogTextView, "emptyStateText");
        C32343x.m95455i0(bogTextView);
        BogButton bogButton = Z2.f68278o;
        C41536l.m120488h(bogButton, "historyBtn");
        C32343x.m95455i0(bogButton);
        RecyclerView recyclerView = Z2.f68280q;
        C41536l.m120488h(recyclerView, "recyclerView");
        C32343x.m95447f1(recyclerView);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final void m69080G3(HashMap hashMap) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, "CLIENTS_CONFIRMATION_ON_CREDIT_INFO", hashMap, (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: W2 */
    private final void m69096W2(boolean z) {
        OffersAndApplicationsViewModel.m69178Qw(m69103g3(), z, false, 2, (Object) null);
        m69103g3().mo53447Fw();
    }

    /* renamed from: X2 */
    static /* synthetic */ void m69097X2(OffersAndApplicationsActivity offersAndApplicationsActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        offersAndApplicationsActivity.m69096W2(z);
    }

    /* renamed from: Y2 */
    private final List m69098Y2() {
        ArrayList arrayList = new ArrayList();
        C36917q t3 = m69115t3();
        if (t3 != null) {
            arrayList.add(t3);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final C27245a1 m69099Z2() {
        return (C27245a1) this.f57211J.getValue();
    }

    /* renamed from: b3 */
    private final void m69100b3() {
        m69103g3().mo53445Aw();
    }

    /* renamed from: d3 */
    private final C27113k m69101d3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final C41185v m69102f3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: g3 */
    private final OffersAndApplicationsViewModel m69103g3() {
        return (OffersAndApplicationsViewModel) this.f57213L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final void m69104h3(Application application) {
        boolean z;
        boolean z2;
        String str;
        String status = application.getStatus();
        if (C41536l.m120484d(status, C24846c.R.mo63280b())) {
            C19292b.C19293a aVar = C19292b.f53510M;
            CreditAppLoanDetails loanDetails = application.getLoanDetails();
            if (loanDetails != null) {
                str = loanDetails.mo53436f();
            } else {
                str = null;
            }
            aVar.mo47524a(C32343x.m95388F(str, new Object[0])).mo4576A1(getSupportFragmentManager(), (String) null);
            return;
        }
        boolean z3 = true;
        if (C41536l.m120484d(status, C24846c.A.mo63280b())) {
            z = true;
        } else {
            z = C41536l.m120484d(status, C24846c.B.mo63280b());
        }
        if (z) {
            z2 = true;
        } else {
            z2 = C41536l.m120484d(status, C24846c.W.mo63280b());
        }
        if (!z2) {
            z3 = C41536l.m120484d(status, C24846c.M.mo63280b());
        }
        if (z3) {
            try {
                C38122f c = C38125h.m112238c(this);
                String status2 = application.getStatus();
                CreditAppLoanDetails loanDetails2 = application.getLoanDetails();
                C41536l.m120486f(loanDetails2);
                c.mo91566O(this, status2, loanDetails2.mo53430a(), application.getLoanDetails().mo53437g(), application.getLoanDetails().mo53432d(), String.valueOf(application.getAppId()), C41536l.m120484d(application.getAppType(), "CREDIT_APPLICATION"));
            } catch (Exception unused) {
                String string = getString(C10328q.f28955d2);
                C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
                C12910e.m48790h(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        } else if (C41536l.m120484d(status, C24846c.C.mo63280b())) {
            C38125h.m112238c(this).mo91601e0(this, application, C41536l.m120484d(application.getAppType(), "CREDIT_APPLICATION"));
        }
    }

    /* renamed from: i3 */
    private final void m69105i3() {
        Group group = m69099Z2().f68275l;
        C41536l.m120488h(group, "binding.emptyStateGroup");
        C32343x.m95455i0(group);
    }

    /* renamed from: j3 */
    private final void m69106j3() {
        C27245a1 Z2 = m69099Z2();
        Z2.f68273j.setText(C32343x.m95388F("credit.info.block.main.text", new Object[0]));
        Z2.f68270g.setText(C32343x.m95388F("credit.info.block.explanatory.text", new Object[0]));
        SwitchCompat switchCompat = Z2.f68271h;
        switchCompat.setOnCheckedChangeListener(new C21400h(Z2));
        switchCompat.setClickable(false);
        Z2.f68272i.setOnClickListener(new C21401i(Z2, this));
        Z2.f68271h.setChecked(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m69107k3(C27245a1 a1Var, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(a1Var, "$this_with");
        BogTextView bogTextView = a1Var.f68270g;
        C41536l.m120488h(bogTextView, "creditInfoAgreementDescriptionText");
        C32343x.m95483r1(bogTextView, !z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m69108l3(C27245a1 a1Var, OffersAndApplicationsActivity offersAndApplicationsActivity, View view) {
        C41536l.m120489i(a1Var, "$this_with");
        C41536l.m120489i(offersAndApplicationsActivity, "this$0");
        if (!a1Var.f68271h.isChecked()) {
            offersAndApplicationsActivity.m69100b3();
        } else {
            offersAndApplicationsActivity.m69071A3();
        }
        String e = C24978b.m79846b(Boolean.valueOf(!a1Var.f68271h.isChecked())).mo63391e();
        C32343x.m95393H0(offersAndApplicationsActivity, "offers_and_applications", "toggle_is_" + e, "offers_and_applications_toggle_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: m3 */
    private final void m69109m3() {
        C21484c.m69411c(m69103g3().mo53459v9(), this, new C21377h(this), new C21376g(this), new C21378i(this));
        C21484c.m69411c(m69103g3().mo53450Kw(), this, new C21380k(this), new C21379j(this), new C21381l(this));
        m69103g3().mo53449Jw().mo4819k(this, new C21386q(new C21382m(this)));
        C21484c.m69411c(m69103g3().mo53451Lw(), this, new C21383n(this), new C21373d(this), new C21384o(this));
        m69103g3().mo53455Ww().mo4819k(this, new C21386q(new C21374e(this)));
        m69103g3().mo53452Mf().mo4819k(this, new C21386q(new C21375f(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m69110n3(C21503d.C21504a aVar) {
        if (aVar.mo53708h()) {
            C41185v f3 = m69102f3();
            if (f3 != null) {
                f3.mo95634K2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
                return;
            }
            return;
        }
        C41185v f32 = m69102f3();
        if (f32 != null) {
            f32.mo4577k1();
        }
        mo52674G1(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m69111o3(StatusEntity statusEntity) {
        String str;
        boolean z;
        C41185v f3 = m69102f3();
        if (f3 != null) {
            f3.mo4577k1();
        }
        StatusEntity statusEntity2 = StatusEntity.ACTIVE;
        if (statusEntity == statusEntity2) {
            str = "credit.info.check.permission.enabled";
        } else {
            str = "credit.info.check.permission.disabled";
        }
        SwitchCompat switchCompat = m69099Z2().f68271h;
        if (statusEntity == statusEntity2) {
            z = true;
        } else {
            z = false;
        }
        switchCompat.setChecked(z);
        C12910e.m48797o(this, C32343x.m95388F(str, new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final void m69112p3(C20588a aVar) {
        boolean z;
        m69099Z2().f68271h.setChecked(aVar.mo49127c().mo70424b());
        ConstraintLayout constraintLayout = m69099Z2().f68274k;
        C41536l.m120488h(constraintLayout, "binding.criContainer");
        if (aVar.mo49127c().mo70423a() || !aVar.mo49127c().mo70424b()) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(constraintLayout, z, false, 2, (Object) null);
        if (!aVar.mo49129e().isEmpty() || !aVar.mo49131f().isEmpty() || (!aVar.mo49128d().isEmpty() && aVar.mo49127c().mo70424b())) {
            m69105i3();
            m69078F3();
            aVar.mo49126b().addAll(m69098Y2());
            this.f57212K.mo48797K(aVar);
            this.f57212K.mo48798L(new C21385p());
            return;
        }
        m69074D3(!aVar.mo49127c().mo70424b());
        if (!aVar.mo49125a().isEmpty()) {
            BogButton bogButton = m69099Z2().f68278o;
            C41536l.m120488h(bogButton, "binding.historyBtn");
            C32343x.m95447f1(bogButton);
        }
    }

    /* renamed from: r3 */
    private final void m69113r3() {
        this.f57212K.mo48799M(new C21399g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m69114s3(OffersAndApplicationsActivity offersAndApplicationsActivity, OfferInfo offerInfo) {
        C41536l.m120489i(offersAndApplicationsActivity, "this$0");
        C41536l.m120489i(offerInfo, "offer");
        OfferNavigatorActivity.f58469H.mo54606a(offersAndApplicationsActivity, offerInfo);
    }

    /* renamed from: t3 */
    private final C36917q m69115t3() {
        boolean z;
        C20557a b = mo53398c3().mo48775b("OFFER_MY_CREDIT_INFO_REGISTRATION");
        if (b != null) {
            z = C41536l.m120484d(b.mo49084a(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z || mo53399e3().wasCreditInfoRegisterBannerInOffersShown(mo53397a3().getLoginInfo().mo90307d())) {
            return null;
        }
        C36906i iVar = new C36906i();
        iVar.mo89847h(new C21387r(this));
        iVar.mo89848i(new C21388s(this, iVar));
        return iVar;
    }

    /* renamed from: u3 */
    private final void m69116u3() {
        C27245a1 Z2 = m69099Z2();
        m69106j3();
        m69113r3();
        Z2.f68280q.setItemAnimator((RecyclerView.C1742m) null);
        Z2.f68280q.setHasFixedSize(true);
        Z2.f68280q.setAdapter(this.f57212K);
        Z2.f68279p.setOnClickListener(new C21395c(this));
        Z2.f68281r.mo3946b().setOnClickListener(new C21396d(this));
        Z2.f68284u.setOnRefreshListener(new C21397e(this));
        Z2.f68278o.setOnClickListener(new C21398f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m69117v3(OffersAndApplicationsActivity offersAndApplicationsActivity, View view) {
        C41536l.m120489i(offersAndApplicationsActivity, "this$0");
        offersAndApplicationsActivity.m69121z3();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m69118w3(OffersAndApplicationsActivity offersAndApplicationsActivity, View view) {
        C41536l.m120489i(offersAndApplicationsActivity, "this$0");
        offersAndApplicationsActivity.m69096W2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m69119x3(OffersAndApplicationsActivity offersAndApplicationsActivity) {
        C41536l.m120489i(offersAndApplicationsActivity, "this$0");
        offersAndApplicationsActivity.m69096W2(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m69120y3(OffersAndApplicationsActivity offersAndApplicationsActivity, View view) {
        List list;
        C41536l.m120489i(offersAndApplicationsActivity, "this$0");
        C32343x.m95495w0(offersAndApplicationsActivity, "applications", "from_empty_offers", "open_application_history");
        ApplicationsHistoryActivity.C21366a aVar = ApplicationsHistoryActivity.f57198I;
        C20588a Ow = offersAndApplicationsActivity.m69103g3().mo53453Ow();
        if (Ow != null) {
            list = Ow.mo49125a();
        } else {
            list = null;
        }
        aVar.mo53393a(offersAndApplicationsActivity, list);
    }

    /* renamed from: z3 */
    private final void m69121z3() {
        if (!m69103g3().mo53448Iw().isEmpty()) {
            C19417a.f53640O.mo47651a(true).mo4576A1(getSupportFragmentManager(), (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_offers_and_applications;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m69103g3().mo53456Yw(!m69099Z2().f68271h.isChecked(), str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m69109m3();
        m69116u3();
        if (getIntent().getBooleanExtra("OPEN_DEBIT_CARD", false)) {
            C38125h.m112238c(this).mo91597c0(this);
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        mo53400q3(z);
    }

    /* renamed from: a3 */
    public final Client mo53397a3() {
        Client client = this.f57208G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: c3 */
    public final C20292b mo53398c3() {
        C20292b bVar = this.f57210I;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("getAppSettingByNameUseCase");
        return null;
    }

    /* renamed from: e3 */
    public final PreferencesApiManager mo53399e3() {
        PreferencesApiManager preferencesApiManager = this.f57209H;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* renamed from: m */
    public void mo39137m() {
        C27113k d3 = m69101d3();
        if (d3 != null) {
            d3.mo4577k1();
        }
        m69103g3().mo53446Ew(true);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Boolean bool;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            boolean z2 = false;
            if (i == 10029) {
                if (intent == null || !intent.getBooleanExtra("ProductConfirmationActivity.EXTRA_CONFIRMATION_RESULT_REJECT", false)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    m69096W2(true);
                    C12910e.m48797o(this, C32343x.m95388F("product.confirmation.successfully.declined", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
                    return;
                }
                if (intent != null && intent.getBooleanExtra("ProductConfirmationActivity.EXTRA_CONFIRMATION_RESULT_ACCEPT", false)) {
                    z2 = true;
                }
                if (z2) {
                    m69096W2(true);
                }
            } else if (i == 10030) {
                if (intent != null) {
                    bool = Boolean.valueOf(intent.getBooleanExtra("FROM_CANCEL_ORDER", false));
                } else {
                    bool = null;
                }
                if (C41536l.m120484d(bool, Boolean.TRUE)) {
                    m69096W2(true);
                    return;
                }
                String string = getString(C10328q.document_uploaded_successfully);
                C41536l.m120488h(string, "getString(R.string.document_uploaded_successfully)");
                C12910e.m48797o(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m69097X2(this, false, 1, (Object) null);
    }

    /* renamed from: q3 */
    public final void mo53400q3(boolean z) {
        FrameLayout frameLayout = m69099Z2().f68282s;
        C41536l.m120488h(frameLayout, "binding.retryBtnContainer");
        C32343x.m95455i0(frameLayout);
        m69099Z2().f68284u.setRefreshing(z);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.app_history_apps_and_offers);
        C41536l.m120488h(string, "getString(R.string.app_history_apps_and_offers)");
        return string;
    }
}
