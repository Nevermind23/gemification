package p341ge.bog.mobilebank.cleanarch.application.presentation.activity;

import a81.C30772sa;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import g91.C32289b0;
import g91.C32300e0;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import h00.C24842a;
import h00.C24844b;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.parceler.C42035e;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p341ge.bog.mobilebank.cleanarch.application.presentation.viewmodel.ApplicationDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.model.CardApplicationDetails;
import p366bk.C10320i;
import p366bk.C10328q;
import p642vh.C18358g;
import p709au.C19277a;
import p90.C27352l;
import p90.C27376n5;
import p90.C27459w7;
import p946xu.C29859a;
import p963zp.C30390a;
import p963zp.C30391b;
import p963zp.C30392c;
import q31.C38122f;
import q31.C38125h;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity */
public final class ApplicationDetailsActivity extends C30772sa {

    /* renamed from: J */
    public static final C20801a f56053J = new C20801a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f56054F = C41219i.m119470b(new C20803c(this));

    /* renamed from: G */
    private final Map f56055G = C41344r0.m119933o(C41233s.m119492a(C24842a.DEBIT_CARD.mo63277b(), Integer.valueOf(C10320i.card_icon)), C41233s.m119492a(C24842a.DEPOSIT.mo63277b(), Integer.valueOf(C10320i.ic_depost)), C41233s.m119492a(C24842a.CREDIT_APPLICATION.mo63277b(), Integer.valueOf(C10320i.ic_consumer_loan_application_icon)));

    /* renamed from: H */
    private final C41217g f56056H = new C1617p0(C41520a0.m120436b(ApplicationDetailsViewModel.class), new C20808h(this), new C20807g(this), new C20809i((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f56057I = C41219i.m119470b(new C20802b(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$a */
    public static final class C20801a {
        private C20801a() {
        }

        public /* synthetic */ C20801a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo49468a(Activity activity, Application application) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(application, "applications");
            Intent intent = new Intent(activity, ApplicationDetailsActivity.class);
            intent.putExtra("KEY_APPLICATION", C42035e.m122121c(application));
            activity.startActivityForResult(intent, 10030);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$b */
    static final class C20802b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ApplicationDetailsActivity f56058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20802b(ApplicationDetailsActivity applicationDetailsActivity) {
            super(0);
            this.f56058d = applicationDetailsActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getExtras();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p341ge.bog.mobilebank.model.Application invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity r0 = r2.f56058d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0015
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L_0x0015
                java.lang.String r1 = "KEY_APPLICATION"
                android.os.Parcelable r0 = r0.getParcelable(r1)
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.lang.Object r0 = org.parceler.C42035e.m122119a(r0)
                java.lang.String r1 = "null cannot be cast to non-null type ge.bog.mobilebank.model.Application"
                kotlin.jvm.internal.C41536l.m120487g(r0, r1)
                ge.bog.mobilebank.model.Application r0 = (p341ge.bog.mobilebank.model.Application) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity.C20802b.invoke():ge.bog.mobilebank.model.Application");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$c */
    static final class C20803c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ApplicationDetailsActivity f56059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20803c(ApplicationDetailsActivity applicationDetailsActivity) {
            super(0);
            this.f56059d = applicationDetailsActivity;
        }

        /* renamed from: b */
        public final C27352l invoke() {
            return C27352l.m84716d(this.f56059d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$d */
    /* synthetic */ class C20804d extends C41535k implements C43075l {
        C20804d(Object obj) {
            super(1, obj, ApplicationDetailsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo49471b(boolean z) {
            ((ApplicationDetailsActivity) this.receiver).m67326W2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49471b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$e */
    static final class C20805e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ApplicationDetailsActivity f56060d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20805e(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f56060d = applicationDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49472a(C29859a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f56060d.m67327X2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49472a((C29859a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$f */
    static final class C20806f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ApplicationDetailsActivity f56061d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20806f(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f56061d = applicationDetailsActivity;
        }

        /* renamed from: a */
        public final void mo49473a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f56061d.m67318O2().f69183i.setVisibility(0);
            this.f56061d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49473a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$g */
    public static final class C20807g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56062d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20807g(ComponentActivity componentActivity) {
            super(0);
            this.f56062d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f56062d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$h */
    public static final class C20808h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56063d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20808h(ComponentActivity componentActivity) {
            super(0);
            this.f56063d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f56063d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity$i */
    public static final class C20809i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56064d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f56065e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20809i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f56064d = aVar;
            this.f56065e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56064d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f56065e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: K2 */
    private final void m67314K2(CardApplicationDetails cardApplicationDetails) {
        if (C32300e0.f79712a.mo72816a(cardApplicationDetails.csOwnerFirstName, cardApplicationDetails.csOwnerLastName, cardApplicationDetails.csAddress, cardApplicationDetails.csOwnerPhoneNumber)) {
            C27376n5 d = C27376n5.m84812d(getLayoutInflater(), (ViewGroup) null, false);
            C41536l.m120488h(d, "inflate(layoutInflater, null, false)");
            d.f69381e.setText(C32343x.m95388F("text.applications.details.delivery.title", new Object[0]));
            View[] viewArr = new View[4];
            FrameLayout c = d.mo3946b();
            C41536l.m120488h(c, "deliveryHeader.root");
            viewArr[0] = c;
            String F = C32343x.m95388F("text.applications.details.delivery.person.name", new Object[0]);
            String str = cardApplicationDetails.csOwnerFirstName;
            String str2 = cardApplicationDetails.csOwnerLastName;
            viewArr[1] = m67321R2(this, F, str + " " + str2, (String) null, 4, (Object) null);
            String F2 = C32343x.m95388F("text.applications.details.delivery.person.phone", new Object[0]);
            String str3 = cardApplicationDetails.csOwnerPhoneNumber;
            if (str3 == null) {
                str3 = "";
            }
            viewArr[2] = m67321R2(this, F2, str3, (String) null, 4, (Object) null);
            viewArr[3] = m67321R2(this, C32343x.m95388F("text.applications.details.delivery.person.address", new Object[0]), String.valueOf(cardApplicationDetails.csAddress), (String) null, 4, (Object) null);
            List<View> m = C41341q.m119910m(viewArr);
            LinearLayout linearLayout = m67318O2().f69182h;
            C41536l.m120488h(linearLayout, "binding.detailsContainer");
            for (View addView : m) {
                linearLayout.addView(addView);
            }
        }
    }

    /* renamed from: L2 */
    private final void m67315L2(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("FROM_CANCEL_ORDER", z);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: M2 */
    private final Application m67316M2() {
        return (Application) this.f56057I.getValue();
    }

    /* renamed from: N2 */
    private final void m67317N2() {
        m67322S2().mo49474hw(m67316M2().getAppId());
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final C27352l m67318O2() {
        return (C27352l) this.f56054F.getValue();
    }

    /* renamed from: P2 */
    private final View m67319P2(String str, String str2, String str3) {
        return m67320Q2(str, str2, str3, str3 != null);
    }

    /* renamed from: Q2 */
    private final View m67320Q2(String str, String str2, String str3, boolean z) {
        C27459w7 d = C27459w7.m85142d(getLayoutInflater());
        d.f70183g.setText(str);
        d.f70181e.setText(str2);
        ImageView imageView = d.f70182f;
        String c = C32289b0.m95091c(str3);
        int i = C10320i.f28688dc;
        C32289b0.m95107s(imageView, c, Integer.valueOf(i), Integer.valueOf(i), true, false);
        FrameLayout frameLayout = d.f70184h;
        C41536l.m120488h(frameLayout, "roundedContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        LinearLayout c2 = d.mo3946b();
        C41536l.m120488h(c2, "with(OperationDetailsSin…Image)\n        root\n    }");
        return c2;
    }

    /* renamed from: R2 */
    static /* synthetic */ View m67321R2(ApplicationDetailsActivity applicationDetailsActivity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return applicationDetailsActivity.m67319P2(str, str2, str3);
    }

    /* renamed from: S2 */
    private final ApplicationDetailsViewModel m67322S2() {
        return (ApplicationDetailsViewModel) this.f56056H.getValue();
    }

    /* renamed from: T2 */
    private final void m67323T2() {
        C21484c.m69411c(m67322S2().mo49475lw(), this, new C20805e(this), new C20804d(this), new C20806f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m67324U2(ApplicationDetailsActivity applicationDetailsActivity, View view) {
        C41536l.m120489i(applicationDetailsActivity, "this$0");
        applicationDetailsActivity.m67318O2().f69183i.setVisibility(8);
        applicationDetailsActivity.m67317N2();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m67325V2(ApplicationDetailsActivity applicationDetailsActivity, String str, Bundle bundle) {
        C41536l.m120489i(applicationDetailsActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_CANCEL_CARD_ORDER_RESULT", false)) {
            applicationDetailsActivity.m67315L2(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m67326W2(boolean z) {
        m67318O2().f69188n.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m67327X2(C29859a aVar) {
        m67318O2().f69180f.setVisibility(8);
        m67318O2().f69181g.setVisibility(8);
        if (!(aVar.mo70115a() == null || aVar.mo70116b() == null)) {
            LinearLayout linearLayout = m67318O2().f69182h;
            String string = getString(C10328q.common_text_amount);
            C41536l.m120488h(string, "getString(R.string.common_text_amount)");
            String n = C32303f.m95203n(aVar.mo70115a(), aVar.mo70116b());
            C41536l.m120488h(n, "getFormattedAmount(appli…applicationData.currency)");
            linearLayout.addView(m67321R2(this, string, n, (String) null, 4, (Object) null));
        }
        if (aVar.mo70119e() != null) {
            LinearLayout linearLayout2 = m67318O2().f69182h;
            String string2 = getString(C10328q.application_term);
            C41536l.m120488h(string2, "getString(R.string.application_term)");
            C41524c0 c0Var = C41524c0.f97701a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{aVar.mo70119e().toString(), getString(C10328q.f28967t7)}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            linearLayout2.addView(m67321R2(this, string2, format, (String) null, 4, (Object) null));
        }
        if (aVar.mo70117c() != null && aVar.mo70118d() != null) {
            LinearLayout linearLayout3 = m67318O2().f69182h;
            String string3 = getString(C10328q.approved_amount);
            C41536l.m120488h(string3, "getString(R.string.approved_amount)");
            String n2 = C32303f.m95203n(aVar.mo70117c(), aVar.mo70118d());
            C41536l.m120488h(n2, "getFormattedAmount(\n    …ncy\n                    )");
            linearLayout3.addView(m67321R2(this, string3, n2, (String) null, 4, (Object) null));
        }
    }

    /* renamed from: Y2 */
    private final void m67328Y2() {
        String str;
        m67318O2().f69179e.f69051o.setVisibility(8);
        m67318O2().f69179e.f69052p.setVisibility(8);
        m67318O2().f69184j.setVisibility(8);
        CardApplicationDetails cardDetails = m67316M2().getCardDetails();
        if (cardDetails != null) {
            String str2 = cardDetails.cardClass + cardDetails.cardType;
            String str3 = cardDetails.subProductCode;
            Button button = m67318O2().f69179e.f69045i;
            C41536l.m120488h(button, "binding.applicationCard.cancelCardOrderButton");
            C32343x.m95483r1(button, cardDetails.isCloseFlag(), false, 2, (Object) null);
            m67318O2().f69179e.f69045i.setButtonText(C32343x.m95388F("applications.history.card.close", new Object[0]));
            m67318O2().f69179e.f69045i.setOnClickListener(new C30392c(this));
            if (str3 != null) {
                m67318O2().f69179e.f69041e.setImageResource(C19277a.m64732b(str3, 0, 2, (Object) null));
            } else {
                m67318O2().f69179e.f69041e.setImageResource(C19277a.m64732b(str2, 0, 2, (Object) null));
            }
            m67318O2().f69179e.f69044h.setText(C27950a.m86287d(cardDetails.subProductDictionaryKey, false, 2, (Object) null));
            TextBadgeView textBadgeView = m67318O2().f69179e.f69043g;
            String str4 = cardDetails.cardStatusKey;
            if (str4 == null) {
                str4 = cardDetails.statusDescKey;
            }
            textBadgeView.setBadgeText(C27950a.m86287d(str4, false, 2, (Object) null));
            m67318O2().f69179e.f69043g.setBackgroundTintColor(C18358g.m62729c(C24844b.m79503a(m67316M2())));
            m67318O2().f69179e.f69049m.setText(getString(C10328q.validity_period));
            if (m67316M2().getExpDate() == null) {
                m67318O2().f69179e.f69050n.setText(C27950a.m86287d(cardDetails.dictionaryKey, false, 2, (Object) null));
            } else {
                AppCompatTextView appCompatTextView = m67318O2().f69179e.f69050n;
                Long expDate = m67316M2().getExpDate();
                C41536l.m120486f(expDate);
                appCompatTextView.setText(C32319m.m95297d(expDate.longValue(), "dd.MM.yyyy"));
            }
            Long l = cardDetails.appRegDate;
            if (l != null) {
                str = C32319m.m95297d(l.longValue(), "dd.MM.yyyy");
            } else {
                str = null;
            }
            LinearLayout linearLayout = m67318O2().f69182h;
            String string = getString(C10328q.app_details_card_name_surname);
            C41536l.m120488h(string, "getString(R.string.app_details_card_name_surname)");
            linearLayout.addView(m67319P2(string, cardDetails.nameOnCard, (String) null));
            if (cardDetails.mainAcctNo != null) {
                LinearLayout linearLayout2 = m67318O2().f69182h;
                String string2 = getString(C10328q.account_number_and_main_currency);
                C41536l.m120488h(string2, "getString(R.string.accou…number_and_main_currency)");
                linearLayout2.addView(m67319P2(string2, cardDetails.mainAcctNo.toString(), (String) null));
            }
            if (cardDetails.scAddress != null) {
                LinearLayout linearLayout3 = m67318O2().f69182h;
                String string3 = getString(C10328q.app_details_service_address);
                C41536l.m120488h(string3, "getString(R.string.app_details_service_address)");
                linearLayout3.addView(m67319P2(string3, cardDetails.scAddress, (String) null));
            }
            LinearLayout linearLayout4 = m67318O2().f69182h;
            String string4 = getString(C10328q.app_details_pin_code_reseive_method);
            C41536l.m120488h(string4, "getString(R.string.app_d…_pin_code_reseive_method)");
            linearLayout4.addView(m67319P2(string4, C27950a.m86287d(cardDetails.pinDeliveryTypeKey, false, 2, (Object) null), (String) null));
            if (cardDetails.pinDeliveryPhone != null) {
                LinearLayout linearLayout5 = m67318O2().f69182h;
                String string5 = getString(C10328q.app_details_phone_for_pin_code);
                C41536l.m120488h(string5, "getString(R.string.app_details_phone_for_pin_code)");
                linearLayout5.addView(m67319P2(string5, cardDetails.pinDeliveryPhone, (String) null));
            }
            if (str != null) {
                LinearLayout linearLayout6 = m67318O2().f69182h;
                String string6 = getString(C10328q.app_details_creation_date);
                C41536l.m120488h(string6, "getString(R.string.app_details_creation_date)");
                linearLayout6.addView(m67319P2(string6, str, (String) null));
            }
            m67314K2(cardDetails);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m67329Z2(ApplicationDetailsActivity applicationDetailsActivity, View view) {
        C41536l.m120489i(applicationDetailsActivity, "this$0");
        C38122f c = C38125h.m112238c(applicationDetailsActivity);
        long appId = applicationDetailsActivity.m67316M2().getAppId();
        FragmentManager supportFragmentManager = applicationDetailsActivity.getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo91643z0(appId, supportFragmentManager);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        if (r0 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0172, code lost:
        if (r6 != null) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m67330a3() {
        /*
            r11 = this;
            p90.l r0 = r11.m67318O2()
            ge.bog.mobilebank.ui.views.widgets.BigDividerView r0 = r0.f69180f
            r1 = 8
            r0.setVisibility(r1)
            p90.l r0 = r11.m67318O2()
            android.widget.FrameLayout r0 = r0.f69181g
            r0.setVisibility(r1)
            ge.bog.mobilebank.model.Application r0 = r11.m67316M2()
            ge.bog.mobilebank.model.deposits.DepositAppDetails r0 = r0.getDepositDetails()
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            r1 = 0
            r2 = 0
            java.util.List<ge.bog.mobilebank.model.deposits.DepositAppDetails$ContractDetail> r3 = r0.contractDetails     // Catch:{ Exception -> 0x002c }
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r3.get(r1)     // Catch:{ Exception -> 0x002c }
            ge.bog.mobilebank.model.deposits.DepositAppDetails$ContractDetail r3 = (p341ge.bog.mobilebank.model.deposits.DepositAppDetails.ContractDetail) r3     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r3 = r2
        L_0x002d:
            if (r3 == 0) goto L_0x003c
            java.lang.Long r4 = r3.maturityDate
            if (r4 == 0) goto L_0x003c
            long r4 = r4.longValue()
            java.lang.String r4 = g91.C32319m.m95296c(r4, r11)
            goto L_0x003d
        L_0x003c:
            r4 = r2
        L_0x003d:
            if (r3 == 0) goto L_0x0046
            long r5 = r3.startDate
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0047
        L_0x0046:
            r5 = r2
        L_0x0047:
            if (r5 != 0) goto L_0x004b
            r5 = r2
            goto L_0x0051
        L_0x004b:
            long r5 = r3.startDate
            java.lang.String r5 = g91.C32319m.m95296c(r5, r11)
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            java.lang.String r6 = r3.agrPurpose
            goto L_0x0057
        L_0x0056:
            r6 = r2
        L_0x0057:
            if (r6 != 0) goto L_0x005b
            r6 = r2
            goto L_0x005d
        L_0x005b:
            java.lang.String r6 = r3.agrPurpose
        L_0x005d:
            p90.l r7 = r11.m67318O2()
            android.widget.LinearLayout r7 = r7.f69182h
            int r8 = p366bk.C10328q.app_details_deposit_product
            java.lang.String r8 = r11.getString(r8)
            java.lang.String r9 = "getString(R.string.app_details_deposit_product)"
            kotlin.jvm.internal.C41536l.m120488h(r8, r9)
            if (r3 == 0) goto L_0x0073
            java.lang.String r9 = r3.dictionaryKey
            goto L_0x0074
        L_0x0073:
            r9 = r2
        L_0x0074:
            r10 = 2
            java.lang.String r1 = r90.C27950a.m86287d(r9, r1, r10, r2)
            android.view.View r1 = r11.m67319P2(r8, r1, r2)
            r7.addView(r1)
            java.lang.String r0 = r0.depositName
            if (r0 == 0) goto L_0x009c
            p90.l r1 = r11.m67318O2()
            android.widget.LinearLayout r1 = r1.f69182h
            int r7 = p366bk.C10328q.app_details_deposit_name
            java.lang.String r7 = r11.getString(r7)
            java.lang.String r8 = "getString(R.string.app_details_deposit_name)"
            kotlin.jvm.internal.C41536l.m120488h(r7, r8)
            android.view.View r0 = r11.m67319P2(r7, r0, r2)
            r1.addView(r0)
        L_0x009c:
            if (r6 == 0) goto L_0x00b6
            p90.l r0 = r11.m67318O2()
            android.widget.LinearLayout r0 = r0.f69182h
            int r1 = p366bk.C10328q.app_details_deposit_purpose
            java.lang.String r1 = r11.getString(r1)
            java.lang.String r7 = "getString(R.string.app_details_deposit_purpose)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r7)
            android.view.View r1 = r11.m67319P2(r1, r6, r2)
            r0.addView(r1)
        L_0x00b6:
            if (r3 == 0) goto L_0x00c1
            java.lang.String r0 = r3.ccy
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = g91.C32303f.m95197h(r0)
            goto L_0x00c2
        L_0x00c1:
            r0 = r2
        L_0x00c2:
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x00c7
            r0 = r1
        L_0x00c7:
            p90.l r6 = r11.m67318O2()
            android.widget.LinearLayout r6 = r6.f69182h
            int r7 = p366bk.C10328q.app_details_deposit_amount
            java.lang.String r7 = r11.getString(r7)
            java.lang.String r8 = "getString(R.string.app_details_deposit_amount)"
            kotlin.jvm.internal.C41536l.m120488h(r7, r8)
            if (r3 == 0) goto L_0x0108
            java.math.BigDecimal r8 = r3.agreeAmount
            if (r8 == 0) goto L_0x0108
            java.lang.String r8 = r8.toString()
            if (r8 == 0) goto L_0x0108
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = " "
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            if (r8 == 0) goto L_0x0108
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            if (r0 != 0) goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            android.view.View r0 = r11.m67319P2(r7, r0, r2)
            r6.addView(r0)
            if (r5 == 0) goto L_0x012a
            p90.l r0 = r11.m67318O2()
            android.widget.LinearLayout r0 = r0.f69182h
            int r6 = p366bk.C10328q.app_details_app_date
            java.lang.String r6 = r11.getString(r6)
            java.lang.String r7 = "getString(R.string.app_details_app_date)"
            kotlin.jvm.internal.C41536l.m120488h(r6, r7)
            android.view.View r5 = r11.m67319P2(r6, r5, r2)
            r0.addView(r5)
        L_0x012a:
            if (r4 == 0) goto L_0x0144
            p90.l r0 = r11.m67318O2()
            android.widget.LinearLayout r0 = r0.f69182h
            int r5 = p366bk.C10328q.app_details_maturity_date
            java.lang.String r5 = r11.getString(r5)
            java.lang.String r6 = "getString(R.string.app_details_maturity_date)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            android.view.View r4 = r11.m67319P2(r5, r4, r2)
            r0.addView(r4)
        L_0x0144:
            p90.l r0 = r11.m67318O2()
            android.widget.LinearLayout r0 = r0.f69182h
            int r4 = p366bk.C10328q.app_details_interest_rate
            java.lang.String r4 = r11.getString(r4)
            java.lang.String r5 = "getString(R.string.app_details_interest_rate)"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            java.lang.String r5 = "%"
            if (r3 == 0) goto L_0x0174
            java.math.BigDecimal r6 = r3.intRate
            if (r6 == 0) goto L_0x0174
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L_0x0174
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r5)
            java.lang.String r6 = r7.toString()
            if (r6 != 0) goto L_0x0175
        L_0x0174:
            r6 = r1
        L_0x0175:
            android.view.View r4 = r11.m67319P2(r4, r6, r2)
            r0.addView(r4)
            p90.l r0 = r11.m67318O2()
            android.widget.LinearLayout r0 = r0.f69182h
            int r4 = p366bk.C10328q.app_details_effective_rate
            java.lang.String r4 = r11.getString(r4)
            java.lang.String r6 = "getString(R.string.app_details_effective_rate)"
            kotlin.jvm.internal.C41536l.m120488h(r4, r6)
            if (r3 == 0) goto L_0x01ac
            java.math.BigDecimal r3 = r3.irr
            if (r3 == 0) goto L_0x01ac
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x01ac
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            if (r3 != 0) goto L_0x01ab
            goto L_0x01ac
        L_0x01ab:
            r1 = r3
        L_0x01ac:
            android.view.View r1 = r11.m67319P2(r4, r1, r2)
            r0.addView(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.application.presentation.activity.ApplicationDetailsActivity.m67330a3():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m67318O2());
        m67323T2();
        m67318O2().f69186l.setText(C27950a.m86287d(m67316M2().getDictionaryKey(), false, 2, (Object) null));
        m67318O2().f69185k.setText(C32319m.m95296c(m67316M2().getCreateDate(), this));
        String appType = m67316M2().getAppType();
        if (C41536l.m120484d(appType, C24842a.DEBIT_CARD.mo63277b())) {
            m67328Y2();
        } else if (C41536l.m120484d(appType, C24842a.DEPOSIT.mo63277b())) {
            m67330a3();
        } else if (C41536l.m120484d(appType, C24842a.CREDIT_APPLICATION.mo63277b())) {
            m67317N2();
            m67318O2().f69187m.f68328f.mo3946b().setOnClickListener(new C30390a(this));
        }
        Integer num = (Integer) this.f56055G.get(m67316M2().getAppType());
        if (num != null) {
            m67318O2().f69190p.setImageResource(num.intValue());
        }
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_CANCEL_CARD_ORDER", this, new C30391b(this));
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.app_history_apps_and_offers);
        C41536l.m120488h(string, "getString(R.string.app_history_apps_and_offers)");
        return string;
    }
}
