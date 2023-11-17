package p341ge.bog.mobilebank.bnpl.presentation.offers.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32289b0;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chipsbadge.ChipsBadgeView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.imagecard.MediumTextImageCardView;
import p341ge.bog.mobilebank.bnpl.presentation.offers.details.C13891b;
import p341ge.bog.mobilebank.bnpl.presentation.offers.details.C13898d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p368bm.C10336a;
import p380ck.C10464h;
import p480jl.C16212c;
import p536nl.C17054g;
import p606sl.C17845k;
import p606sl.C17846l;
import p620tl.C17990d;
import p673xl.C18779b;
import p673xl.C18780c;
import p701zl.C19062a;
import p701zl.C19063b;
import p701zl.C19064c;
import p701zl.C19065d;
import p782hu.C25065a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity */
public final class BnplOfferDetailsActivity extends C13900e {

    /* renamed from: K */
    public static final C13879a f41206K = new C13879a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public PreferencesApiManager f41207G;

    /* renamed from: H */
    public C13891b.C13893b f41208H;

    /* renamed from: I */
    private final C41217g f41209I = new C1617p0(C41520a0.m120436b(C13891b.class), new C13886h(this), new C13888j(this), new C13887i((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f41210J = C41219i.m119470b(new C13880b(this));

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$a */
    public static final class C13879a {
        private C13879a() {
        }

        public /* synthetic */ C13879a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo38294a(long j, String str, Context context) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, BnplOfferDetailsActivity.class);
            intent.putExtra("ARGS_MERCHANT_ID", j);
            intent.putExtra("ARGS_BRAND_NAME", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$b */
    static final class C13880b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplOfferDetailsActivity f41211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13880b(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
            super(0);
            this.f41211d = bnplOfferDetailsActivity;
        }

        /* renamed from: b */
        public final C17054g invoke() {
            return C17054g.m59920d(this.f41211d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$c */
    static final class C13881c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOfferDetailsActivity f41212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13881c(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
            super(1);
            this.f41212d = bnplOfferDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38296a(C31128a aVar) {
            BnplOfferDetailsActivity bnplOfferDetailsActivity = this.f41212d;
            C41536l.m120488h(aVar, "result");
            bnplOfferDetailsActivity.m51727P2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38296a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$d */
    static final class C13882d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOfferDetailsActivity f41213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13882d(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
            super(1);
            this.f41213d = bnplOfferDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38297a(C31128a aVar) {
            BnplOfferDetailsActivity bnplOfferDetailsActivity = this.f41213d;
            C41536l.m120488h(aVar, "result");
            bnplOfferDetailsActivity.m51731T2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38297a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$e */
    static final class C13883e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOfferDetailsActivity f41214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13883e(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
            super(1);
            this.f41214d = bnplOfferDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38298a(String str) {
            C41536l.m120489i(str, "it");
            this.f41214d.m51732U2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38298a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$f */
    static final class C13884f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplOfferDetailsActivity f41215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13884f(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
            super(1);
            this.f41215d = bnplOfferDetailsActivity;
        }

        /* renamed from: a */
        public final void mo38299a(String str) {
            C41536l.m120489i(str, "it");
            this.f41215d.m51732U2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38299a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$g */
    static final class C13885g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41216a;

        C13885g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41216a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41216a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41216a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$h */
    public static final class C13886h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13886h(ComponentActivity componentActivity) {
            super(0);
            this.f41217d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41217d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$i */
    public static final class C13887i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41218d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41219e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13887i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41218d = aVar;
            this.f41219e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41218d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41219e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$j */
    static final class C13888j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplOfferDetailsActivity f41220d;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity$j$a */
        static final class C13889a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ BnplOfferDetailsActivity f41221d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13889a(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
                super(0);
                this.f41221d = bnplOfferDetailsActivity;
            }

            /* renamed from: b */
            public final C13891b invoke() {
                String str;
                C13891b.C13893b M2 = this.f41221d.mo38292M2();
                Intent intent = this.f41221d.getIntent();
                long j = -1;
                if (intent != null) {
                    j = intent.getLongExtra("ARGS_MERCHANT_ID", -1);
                }
                Intent intent2 = this.f41221d.getIntent();
                if (intent2 == null || (str = intent2.getStringExtra("ARGS_BRAND_NAME")) == null) {
                    str = "";
                }
                return M2.mo32557a(j, str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13888j(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
            super(0);
            this.f41220d = bnplOfferDetailsActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C13889a(this.f41220d));
        }
    }

    /* renamed from: L2 */
    private final C17054g m51725L2() {
        return (C17054g) this.f41210J.getValue();
    }

    /* renamed from: O2 */
    private final C13891b m51726O2() {
        return (C13891b) this.f41209I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m51727P2(C31128a aVar) {
        if (aVar instanceof C31128a.C31131c) {
            C31128a.C31131c cVar = (C31128a.C31131c) aVar;
            m51739b3(((C18780c) cVar.mo71340a()).mo46576c());
            m51734W2(((C18780c) cVar.mo71340a()).mo46574a());
            m51733V2(((C18780c) cVar.mo71340a()).mo46575b());
            m51743f3(((C18780c) cVar.mo71340a()).mo46574a());
            m51725L2().f47623z.mo53595c();
        } else if (aVar instanceof C31128a.C31129a) {
            m51725L2().f47623z.mo53596d();
        } else if (aVar instanceof C31128a.C31130b) {
            m51725L2().f47623z.mo53597e();
        }
    }

    /* renamed from: Q2 */
    private final boolean m51728Q2() {
        return mo38293N2().getLanguage().mo90436f();
    }

    /* renamed from: R2 */
    private final void m51729R2() {
        m51726O2().mo38314qw().mo38303R3().mo4819k(this, new C13885g(new C13881c(this)));
        m51726O2().mo38314qw().mo38305Ti().mo4819k(this, new C13885g(new C13882d(this)));
        C37224b.m109963b(m51726O2().mo38314qw().mo38306io(), this, new C13883e(this));
        C37224b.m109963b(m51726O2().mo38314qw().mo38304T6(), this, new C13884f(this));
    }

    /* renamed from: S2 */
    private final void m51730S2() {
        m51726O2().mo38315rw();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m51731T2(C31128a aVar) {
        String str;
        if (aVar instanceof C31128a.C31130b) {
            mo86441o2();
        } else if (aVar instanceof C31128a.C31129a) {
            mo86425J1();
            mo74709H1(((C31128a.C31129a) aVar).mo71342c());
        } else if (aVar instanceof C31128a.C31131c) {
            mo86425J1();
            C13898d.C13899a aVar2 = C13898d.f41239I;
            Iterable<C17846l> iterable = (Iterable) ((C31128a.C31131c) aVar).mo71340a();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
            for (C17846l lVar : iterable) {
                if (m51728Q2()) {
                    str = lVar.mo45500b();
                } else {
                    str = lVar.mo45499a();
                }
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            aVar2.mo38320a(arrayList).mo4576A1(getSupportFragmentManager(), (String) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m51732U2(String str) {
        C32303f.m95184D(str, this);
    }

    /* renamed from: V2 */
    private final void m51733V2(C25065a aVar) {
        BannerCard bannerCard = m51725L2().f47616s;
        C41536l.m120488h(bannerCard, "binding.offerBanner");
        C32343x.m95483r1(bannerCard, !aVar.mo63499b(), false, 2, (Object) null);
        MediumTextImageCardView mediumTextImageCardView = m51725L2().f47612o;
        C41536l.m120488h(mediumTextImageCardView, "binding.limitBanner");
        C32343x.m95483r1(mediumTextImageCardView, aVar.mo63499b(), false, 2, (Object) null);
        MediumTextImageCardView mediumTextImageCardView2 = m51725L2().f47612o;
        C41536l.m120488h(mediumTextImageCardView2, "binding.limitBanner");
        MediumTextImageCardView.m50221l(mediumTextImageCardView2, C32343x.m95410Q(aVar.mo63498a(), aVar.mo63500c(), false, 2, (Object) null), C32343x.m95388F("text.bnpl.offer.page.offer.amount.approved", new Object[0]), true, false, 8, (Object) null);
    }

    /* renamed from: W2 */
    private final void m51734W2(C18779b bVar) {
        Button button = m51725L2().f47621x;
        C41536l.m120488h(button, "binding.singleButton");
        C32343x.m95483r1(button, bVar.mo46573b(), false, 2, (Object) null);
    }

    /* renamed from: X2 */
    private final void m51735X2() {
        m51725L2().f47616s.setOnClickListener(new C19063b(this));
        m51725L2().f47620w.setOnClickListener(new C19064c(this));
        m51725L2().f47621x.setOnClickListener(new C19065d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m51736Y2(BnplOfferDetailsActivity bnplOfferDetailsActivity, View view) {
        C41536l.m120489i(bnplOfferDetailsActivity, "this$0");
        C10336a.m37613a(bnplOfferDetailsActivity);
        C36546y.m108282F().mo27152s("applications", "BNPL_offers_internal_page", "click_check_limit_button");
        C36546y.m108282F().mo27137H("BNPL_click_check_limit_button_internal", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m51737Z2(BnplOfferDetailsActivity bnplOfferDetailsActivity, View view) {
        C41536l.m120489i(bnplOfferDetailsActivity, "this$0");
        C21481a.onRefresh$default(bnplOfferDetailsActivity.m51726O2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m51738a3(BnplOfferDetailsActivity bnplOfferDetailsActivity, View view) {
        C41536l.m120489i(bnplOfferDetailsActivity, "this$0");
        bnplOfferDetailsActivity.m51730S2();
    }

    /* renamed from: b3 */
    private final void m51739b3(C17845k kVar) {
        String str;
        if (m51728Q2()) {
            str = kVar.mo45492b();
        } else {
            str = kVar.mo45491a();
        }
        mo86429X1(str);
        m51725L2().f47619v.setText(str);
        String d = kVar.mo45494d();
        if (d != null) {
            C32289b0.m95103o(m51725L2().f47618u, C32289b0.m95091c(d));
        }
    }

    /* renamed from: c3 */
    private final void m51740c3() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_SELECTED_POSITION", this, new C19062a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m51741d3(BnplOfferDetailsActivity bnplOfferDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(bnplOfferDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        bnplOfferDetailsActivity.m51726O2().mo38316sw(bundle.getInt("RESULT_KEY_SELECTED_POSITION"));
    }

    /* renamed from: e3 */
    private final void m51742e3() {
        C17054g L2 = m51725L2();
        L2.f47616s.setInfoText(C32343x.m95388F("text.bnpl.offer.page.offer.amount.check.description", new Object[0]));
        L2.f47616s.setShowMoreText(C32343x.m95388F("text.bnpl.offer.page.offer.amount.check", new Object[0]));
        L2.f47606i.setText(C34646b.m101752f(C17990d.f51204a.mo45676b(), (Context) null, 1, (Object) null));
        L2.f47621x.setButtonText(C32343x.m95388F("text.bnpl.offer.page.buy.online", new Object[0]));
    }

    /* renamed from: f3 */
    private final void m51743f3(C18779b bVar) {
        C41224m a = C41233s.m119492a(Boolean.valueOf(bVar.mo46573b()), Boolean.valueOf(bVar.mo46572a()));
        boolean booleanValue = ((Boolean) a.mo95675a()).booleanValue();
        boolean booleanValue2 = ((Boolean) a.mo95676b()).booleanValue();
        C17054g L2 = m51725L2();
        if (booleanValue && booleanValue2) {
            TextView textView = L2.f47617t;
            C17990d dVar = C17990d.f51204a;
            textView.setText(C34646b.m101752f(dVar.mo45677c(), (Context) null, 1, (Object) null));
            L2.f47604g.setText(C34646b.m101752f(dVar.mo45675a(), (Context) null, 1, (Object) null));
            LinearLayout linearLayout = L2.f47603f;
            C41536l.m120488h(linearLayout, "bullet1");
            C32343x.m95447f1(linearLayout);
            LinearLayout linearLayout2 = L2.f47605h;
            C41536l.m120488h(linearLayout2, "bullet2");
            C32343x.m95447f1(linearLayout2);
        } else if (booleanValue) {
            TextView textView2 = L2.f47617t;
            C17990d dVar2 = C17990d.f51204a;
            textView2.setText(C34646b.m101752f(dVar2.mo45681g(), (Context) null, 1, (Object) null));
            L2.f47604g.setText(C34646b.m101752f(dVar2.mo45680f(), (Context) null, 1, (Object) null));
            LinearLayout linearLayout3 = L2.f47603f;
            C41536l.m120488h(linearLayout3, "bullet1");
            C32343x.m95447f1(linearLayout3);
            LinearLayout linearLayout4 = L2.f47605h;
            C41536l.m120488h(linearLayout4, "bullet2");
            C32343x.m95455i0(linearLayout4);
        } else if (booleanValue2) {
            TextView textView3 = L2.f47617t;
            C17990d dVar3 = C17990d.f51204a;
            textView3.setText(C34646b.m101752f(dVar3.mo45679e(), (Context) null, 1, (Object) null));
            L2.f47604g.setText(C34646b.m101752f(dVar3.mo45678d(), (Context) null, 1, (Object) null));
            LinearLayout linearLayout5 = L2.f47603f;
            C41536l.m120488h(linearLayout5, "bullet1");
            C32343x.m95447f1(linearLayout5);
            LinearLayout linearLayout6 = L2.f47605h;
            C41536l.m120488h(linearLayout6, "bullet2");
            C32343x.m95455i0(linearLayout6);
        } else {
            L2.f47617t.setText(C34646b.m101752f(C17990d.f51204a.mo45679e(), (Context) null, 1, (Object) null));
            LinearLayout linearLayout7 = L2.f47603f;
            C41536l.m120488h(linearLayout7, "bullet1");
            C32343x.m95455i0(linearLayout7);
            LinearLayout linearLayout8 = L2.f47605h;
            C41536l.m120488h(linearLayout8, "bullet2");
            C32343x.m95455i0(linearLayout8);
        }
    }

    /* renamed from: g3 */
    private final void m51744g3() {
        C17054g L2 = m51725L2();
        BannerCard bannerCard = L2.f47616s;
        int i = C16212c.f45714b;
        bannerCard.setBannerImage(new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null));
        L2.f47612o.setImage(new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null));
        L2.f47615r.setBadgeType(new ChipsBadgeView.C13241a.C13242a(C32343x.m95388F("text.bnpl.name", new Object[0])));
    }

    /* renamed from: M2 */
    public final C13891b.C13893b mo38292M2() {
        C13891b.C13893b bVar = this.f41208H;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: N2 */
    public final PreferencesApiManager mo38293N2() {
        PreferencesApiManager preferencesApiManager = this.f41207G;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m51725L2().mo3946b());
        super.mo37451O1(bundle);
        m51740c3();
        m51735X2();
        m51742e3();
        m51744g3();
        m51729R2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.bnpl.name", new Object[0]);
    }
}
