package p341ge.bog.mobilebank.bnpl.presentation.offers.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37616s;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity;
import p341ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p354am.C10074a;
import p354am.C10077d;
import p368bm.C10336a;
import p380ck.C10464h;
import p480jl.C16210a;
import p480jl.C16211b;
import p480jl.C16212c;
import p536nl.C17055h;
import p606sl.C17835b;
import p673xl.C18778a;
import p687yl.C18943c;
import p782hu.C25065a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity */
public final class BnplOffersActivity extends C13917c {

    /* renamed from: K */
    public static final C13902a f41243K = new C13902a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f41244G = C41219i.m119470b(new C13907f(this));

    /* renamed from: H */
    private final C41217g f41245H = C41219i.m119470b(new C13903b(this));

    /* renamed from: I */
    private final C41217g f41246I = new C1617p0(C41520a0.m120436b(BnplOffersViewModel$ViewModel.class), new C13910i(this), new C13909h(this), new C13911j((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public List f41247J = C41341q.m119907j();

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$a */
    public static final class C13902a {
        private C13902a() {
        }

        public /* synthetic */ C13902a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo38321a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, BnplOffersActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$b */
    static final class C13903b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplOffersActivity f41248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13903b(BnplOffersActivity bnplOffersActivity) {
            super(0);
            this.f41248d = bnplOffersActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m51819d(BnplOffersActivity bnplOffersActivity, long j) {
            C41536l.m120489i(bnplOffersActivity, "this$0");
            BnplCategoriesActivity.f41021L.mo38146a(bnplOffersActivity, j, bnplOffersActivity.f41247J);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m51820e(BnplOffersActivity bnplOffersActivity, long j, String str) {
            C41536l.m120489i(bnplOffersActivity, "this$0");
            C36546y.m108282F().mo27152s("life_style_offers", str, "click");
            C36546y.m108282F().mo27137H("BNPL_click_offer_bnplpage", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            BnplOfferDetailsActivity.f41206K.mo38294a(j, str, bnplOffersActivity);
        }

        /* renamed from: c */
        public final C18943c invoke() {
            return new C18943c(new C13915a(this.f41248d), new C13916b(this.f41248d));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$c */
    static final class C13904c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOffersActivity f41249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13904c(BnplOffersActivity bnplOffersActivity) {
            super(1);
            this.f41249d = bnplOffersActivity;
        }

        /* renamed from: a */
        public final void mo38323a(String str) {
            C41536l.m120489i(str, "it");
            this.f41249d.m51810Q2().mo38329pw().mo26532Y1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38323a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$d */
    static final class C13905d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOffersActivity f41250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13905d(BnplOffersActivity bnplOffersActivity) {
            super(1);
            this.f41250d = bnplOffersActivity;
        }

        /* renamed from: a */
        public final void mo38324a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                this.f41250d.m51808O2().mo46987n((List) cVar.mo71340a());
                BnplOffersActivity bnplOffersActivity = this.f41250d;
                Iterable<C17835b> iterable = (Iterable) cVar.mo71340a();
                ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
                for (C17835b a : iterable) {
                    arrayList.add(C18778a.m63547a(C17835b.f50724f.mo45436a(a)));
                }
                bnplOffersActivity.f41247J = arrayList;
                PageDescriptionView pageDescriptionView = this.f41250d.m51809P2().f47631k;
                C41536l.m120488h(pageDescriptionView, "binding.searchFailed");
                C32343x.m95483r1(pageDescriptionView, ((List) cVar.mo71340a()).isEmpty(), false, 2, (Object) null);
                this.f41250d.m51809P2().f47627g.mo53595c();
            } else if (aVar instanceof C31128a.C31129a) {
                this.f41250d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                this.f41250d.m51809P2().f47627g.mo53595c();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f41250d.m51809P2().f47627g.mo53597e();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38324a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$e */
    static final class C13906e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOffersActivity f41251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13906e(BnplOffersActivity bnplOffersActivity) {
            super(1);
            this.f41251d = bnplOffersActivity;
        }

        /* renamed from: a */
        public final void mo38325a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f41251d.m51806M2((C25065a) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f41251d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38325a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$f */
    static final class C13907f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplOffersActivity f41252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13907f(BnplOffersActivity bnplOffersActivity) {
            super(0);
            this.f41252d = bnplOffersActivity;
        }

        /* renamed from: b */
        public final C17055h invoke() {
            return C17055h.m59925d(this.f41252d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$g */
    static final class C13908g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41253a;

        C13908g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41253a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41253a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41253a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$h */
    public static final class C13909h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13909h(ComponentActivity componentActivity) {
            super(0);
            this.f41254d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f41254d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$i */
    public static final class C13910i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41255d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13910i(ComponentActivity componentActivity) {
            super(0);
            this.f41255d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41255d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity$j */
    public static final class C13911j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41256d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41257e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13911j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41256d = aVar;
            this.f41257e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41256d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41257e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: L2 */
    private final void m51805L2() {
        m51809P2().f47630j.setOnTextChangeListener(new C13904c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m51806M2(C25065a aVar) {
        Button button = m51809P2().f47625e;
        C41536l.m120488h(button, "formatHeader$lambda$4");
        C32343x.m95483r1(button, !aVar.mo63499b(), false, 2, (Object) null);
        button.setOnClickListener(new C10074a(this));
        button.setButtonText(C32343x.m95388F("text.bnpl.limit.check.button", new Object[0]));
        DynamicThumbnailCardView dynamicThumbnailCardView = m51809P2().f47626f;
        dynamicThumbnailCardView.setLogo(new Image.Resource(C16212c.f45713a, (Boolean) null, 2, (DefaultConstructorMarker) null));
        if (aVar.mo63499b()) {
            dynamicThumbnailCardView.setTitle(C32343x.m95410Q(aVar.mo63498a(), aVar.mo63500c(), false, 2, (Object) null));
            dynamicThumbnailCardView.setTitleSize(DynamicThumbnailCardView.C13325c.REGULAR);
            dynamicThumbnailCardView.setTitleColor(new Color.Resource(C16210a.f45708a));
            dynamicThumbnailCardView.setDescription(C32343x.m95388F("text.bnpl.limit.banner.text", new Object[0]));
            return;
        }
        dynamicThumbnailCardView.setTitle(C32343x.m95388F("text.bnpl.no.limit.banner.header", new Object[0]));
        dynamicThumbnailCardView.setTitleSize(DynamicThumbnailCardView.C13325c.SMALL);
        dynamicThumbnailCardView.setTitleColor(new Color.Resource(C16210a.f45709b));
        dynamicThumbnailCardView.setDescription(C32343x.m95388F("text.bnpl.no.limit.banner.text", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m51807N2(BnplOffersActivity bnplOffersActivity, View view) {
        C41536l.m120489i(bnplOffersActivity, "this$0");
        bnplOffersActivity.m51811R2();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final C18943c m51808O2() {
        return (C18943c) this.f41245H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final C17055h m51809P2() {
        return (C17055h) this.f41244G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final BnplOffersViewModel$ViewModel m51810Q2() {
        return (BnplOffersViewModel$ViewModel) this.f41246I.getValue();
    }

    /* renamed from: R2 */
    private final void m51811R2() {
        C36546y.m108282F().mo27152s("applications", "bnpl_page", "click_check_limit_button");
        C36546y.m108282F().mo27137H("BNPL_click_check_limit_button_bnplpage", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        C10336a.m37613a(this);
    }

    /* renamed from: S2 */
    private final void m51812S2() {
        RecyclerView recyclerView = m51809P2().f47628h;
        recyclerView.setAdapter(m51808O2());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C41536l.m120488h(recyclerView, "setupViews$lambda$1$lambda$0");
        C37616s.m110618b(recyclerView, C16211b.f45712a, 1, false, 4, (Object) null);
    }

    /* renamed from: l1 */
    private final void m51813l1() {
        C10077d qw = m51810Q2().mo38330qw();
        qw.mo26534x().mo4819k(this, new C13908g(new C13905d(this)));
        qw.mo26533L1().mo4819k(this, new C13908g(new C13906e(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m51809P2().mo3946b());
        super.mo37451O1(bundle);
        m51812S2();
        m51813l1();
        m51805L2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C21481a.onRefresh$default(m51810Q2(), 0, 1, (Object) null);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.bnpl.name", new Object[0]);
    }
}
