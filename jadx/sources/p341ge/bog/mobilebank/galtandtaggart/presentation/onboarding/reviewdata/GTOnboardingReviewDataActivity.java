package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import ef0.C20230e;
import ef0.C20231f;
import eg0.C20233a;
import eg0.C20234b;
import g91.C32314k;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25181a;
import ie0.C25183c;
import ie0.C25187g;
import ie0.C25188h;
import ie0.C25190j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.p975ui.activities.ContactUsActivity;
import p642vh.C18368l;
import sf0.C28193b;
import ue0.C28710a0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataActivity */
public final class GTOnboardingReviewDataActivity extends C28193b {

    /* renamed from: J */
    public static final C23622a f61614J = new C23622a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C28710a0 f61615H;

    /* renamed from: I */
    private final C41217g f61616I = new C1617p0(C41520a0.m120436b(GTOnboardingReviewDataViewModel$ViewModel.class), new C23626e(this), new C23625d(this), new C23627f((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataActivity$a */
    public static final class C23622a {
        private C23622a() {
        }

        public /* synthetic */ C23622a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Intent m76380b(C23622a aVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo60498a(context, z);
        }

        /* renamed from: a */
        public final Intent mo60498a(Context context, boolean z) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTOnboardingReviewDataActivity.class);
            intent.putExtra("RESULT_PAGE", z);
            return intent;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataActivity$b */
    static final class C23623b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingReviewDataActivity f61617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23623b(GTOnboardingReviewDataActivity gTOnboardingReviewDataActivity) {
            super(1);
            this.f61617d = gTOnboardingReviewDataActivity;
        }

        /* renamed from: a */
        public final void mo60499a(C31128a aVar) {
            C28710a0 L2 = this.f61617d.f61615H;
            C28710a0 a0Var = null;
            if (L2 == null) {
                C41536l.m120506z("binding");
                L2 = null;
            }
            L2.f73111g.setLoading(false);
            if (aVar instanceof C31128a.C31131c) {
                this.f61617d.m76372Q2().mo60502gw().mo48711G1();
                GTOnboardingReviewDataActivity gTOnboardingReviewDataActivity = this.f61617d;
                gTOnboardingReviewDataActivity.startActivity(GTOnboardingReviewDataActivity.f61614J.mo60498a(gTOnboardingReviewDataActivity, true));
                this.f61617d.m76372Q2().mo60506kw();
                this.f61617d.mo67714F2();
            } else if (aVar instanceof C31128a.C31130b) {
                C28710a0 L22 = this.f61617d.f61615H;
                if (L22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    a0Var = L22;
                }
                a0Var.f73111g.setLoading(true);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f61617d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60499a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataActivity$c */
    static final class C23624c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61618a;

        C23624c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61618a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61618a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61618a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataActivity$d */
    public static final class C23625d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23625d(ComponentActivity componentActivity) {
            super(0);
            this.f61619d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61619d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataActivity$e */
    public static final class C23626e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23626e(ComponentActivity componentActivity) {
            super(0);
            this.f61620d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61620d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataActivity$f */
    public static final class C23627f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61621d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61622e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23627f(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61621d = aVar;
            this.f61622e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61621d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61622e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: N2 */
    private final void m76369N2(String str, String str2, ViewGroup viewGroup, boolean z) {
        if (z) {
            m76371P2(viewGroup);
        }
        View.inflate(this, C25188h.item_review_data, viewGroup);
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) viewGroup.getChildAt(viewGroup.getChildCount() - 1).findViewById(C25187g.f64674G4);
        twoLineTextItem.setText(str2);
        twoLineTextItem.setTitle(str);
    }

    /* renamed from: O2 */
    static /* synthetic */ void m76370O2(GTOnboardingReviewDataActivity gTOnboardingReviewDataActivity, String str, String str2, ViewGroup viewGroup, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        gTOnboardingReviewDataActivity.m76369N2(str, str2, viewGroup, z);
    }

    /* renamed from: P2 */
    private final void m76371P2(ViewGroup viewGroup) {
        View view = new View(this);
        view.setBackgroundColor(C0767a.m2893c(this, C25183c.f64643e));
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, C18368l.m62762k(1)));
        viewGroup.addView(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final GTOnboardingReviewDataViewModel$ViewModel m76372Q2() {
        return (GTOnboardingReviewDataViewModel$ViewModel) this.f61616I.getValue();
    }

    /* renamed from: R2 */
    private final void m76373R2(C20230e eVar) {
        String i = eVar.mo48688i();
        boolean z = false;
        C28710a0 a0Var = null;
        if (i != null) {
            String string = getString(C25190j.common_text_first_name_last_name);
            C41536l.m120488h(string, "getString(R.string.commo…ext_first_name_last_name)");
            C28710a0 a0Var2 = this.f61615H;
            if (a0Var2 == null) {
                C41536l.m120506z("binding");
                a0Var2 = null;
            }
            LinearLayout linearLayout = a0Var2.f73113i;
            C41536l.m120488h(linearLayout, "binding.personalInfoContainer");
            m76369N2(string, i, linearLayout, false);
        }
        String l = eVar.mo48691l();
        if (l != null) {
            String string2 = getString(C25190j.gt_onboarding_lov_pn);
            C41536l.m120488h(string2, "getString(R.string.gt_onboarding_lov_pn)");
            C28710a0 a0Var3 = this.f61615H;
            if (a0Var3 == null) {
                C41536l.m120506z("binding");
                a0Var3 = null;
            }
            LinearLayout linearLayout2 = a0Var3.f73113i;
            C41536l.m120488h(linearLayout2, "binding.personalInfoContainer");
            m76370O2(this, string2, l, linearLayout2, false, 8, (Object) null);
        }
        if (!(eVar.mo48679b() == null || eVar.mo48680c() == null || eVar.mo48681d() == null)) {
            String[] stringArray = getResources().getStringArray(C25181a.f64638a);
            C41536l.m120488h(stringArray, "resources.getStringArray(R.array.months)");
            String str = stringArray[eVar.mo48680c().intValue() - 1] + " " + eVar.mo48679b() + ", " + eVar.mo48681d();
            String string3 = getString(C25190j.gt_onboarding_lov_birth_date);
            C41536l.m120488h(string3, "getString(R.string.gt_onboarding_lov_birth_date)");
            C28710a0 a0Var4 = this.f61615H;
            if (a0Var4 == null) {
                C41536l.m120506z("binding");
                a0Var4 = null;
            }
            LinearLayout linearLayout3 = a0Var4.f73113i;
            C41536l.m120488h(linearLayout3, "binding.personalInfoContainer");
            m76370O2(this, string3, str, linearLayout3, false, 8, (Object) null);
        }
        String j = eVar.mo48689j();
        if (j != null) {
            String string4 = getString(C25190j.gt_onboarding_lov_gender);
            C41536l.m120488h(string4, "getString(R.string.gt_onboarding_lov_gender)");
            C28710a0 a0Var5 = this.f61615H;
            if (a0Var5 == null) {
                C41536l.m120506z("binding");
                a0Var5 = null;
            }
            LinearLayout linearLayout4 = a0Var5.f73113i;
            C41536l.m120488h(linearLayout4, "binding.personalInfoContainer");
            m76370O2(this, string4, j, linearLayout4, false, 8, (Object) null);
        }
        String n = eVar.mo48693n();
        if (n != null) {
            String string5 = getString(C25190j.gt_onboarding_lov_residence_country);
            C41536l.m120488h(string5, "getString(R.string.gt_on…ng_lov_residence_country)");
            C28710a0 a0Var6 = this.f61615H;
            if (a0Var6 == null) {
                C41536l.m120506z("binding");
                a0Var6 = null;
            }
            LinearLayout linearLayout5 = a0Var6.f73113i;
            C41536l.m120488h(linearLayout5, "binding.personalInfoContainer");
            m76370O2(this, string5, n, linearLayout5, false, 8, (Object) null);
        }
        String e = eVar.mo48682e();
        if (e != null) {
            String string6 = getString(C25190j.gt_onboarding_lov_city);
            C41536l.m120488h(string6, "getString(R.string.gt_onboarding_lov_city)");
            C28710a0 a0Var7 = this.f61615H;
            if (a0Var7 == null) {
                C41536l.m120506z("binding");
                a0Var7 = null;
            }
            LinearLayout linearLayout6 = a0Var7.f73113i;
            C41536l.m120488h(linearLayout6, "binding.personalInfoContainer");
            m76370O2(this, string6, e, linearLayout6, false, 8, (Object) null);
        }
        String o = eVar.mo48694o();
        if (o != null) {
            String string7 = getString(C25190j.gt_onboarding_lov_street);
            C41536l.m120488h(string7, "getString(R.string.gt_onboarding_lov_street)");
            C28710a0 a0Var8 = this.f61615H;
            if (a0Var8 == null) {
                C41536l.m120506z("binding");
                a0Var8 = null;
            }
            LinearLayout linearLayout7 = a0Var8.f73113i;
            C41536l.m120488h(linearLayout7, "binding.personalInfoContainer");
            m76370O2(this, string7, o, linearLayout7, false, 8, (Object) null);
        }
        String f = eVar.mo48684f();
        if (f != null) {
            String string8 = getString(C25190j.gt_onboarding_lov_email);
            C41536l.m120488h(string8, "getString(R.string.gt_onboarding_lov_email)");
            C28710a0 a0Var9 = this.f61615H;
            if (a0Var9 == null) {
                C41536l.m120506z("binding");
                a0Var9 = null;
            }
            LinearLayout linearLayout8 = a0Var9.f73113i;
            C41536l.m120488h(linearLayout8, "binding.personalInfoContainer");
            m76370O2(this, string8, f, linearLayout8, false, 8, (Object) null);
        }
        String k = eVar.mo48690k();
        if (k != null) {
            String string9 = getString(C25190j.gt_onboarding_lov_phone);
            C41536l.m120488h(string9, "getString(R.string.gt_onboarding_lov_phone)");
            C28710a0 a0Var10 = this.f61615H;
            if (a0Var10 == null) {
                C41536l.m120506z("binding");
                a0Var10 = null;
            }
            LinearLayout linearLayout9 = a0Var10.f73113i;
            C41536l.m120488h(linearLayout9, "binding.personalInfoContainer");
            m76370O2(this, string9, k, linearLayout9, false, 8, (Object) null);
        }
        C20231f h = eVar.mo48686h();
        if (h != null) {
            String string10 = getString(C25190j.gt_onboarding_lov_occupation_status);
            C41536l.m120488h(string10, "getString(R.string.gt_on…ng_lov_occupation_status)");
            String b = h.mo48697b();
            C28710a0 a0Var11 = this.f61615H;
            if (a0Var11 == null) {
                C41536l.m120506z("binding");
                a0Var11 = null;
            }
            LinearLayout linearLayout10 = a0Var11.f73110f;
            C41536l.m120488h(linearLayout10, "binding.detailsInnerContainer");
            m76369N2(string10, b, linearLayout10, false);
        }
        String g = eVar.mo48685g();
        if (g != null) {
            if (g.length() > 0) {
                z = true;
            }
            if (z) {
                String string11 = getString(C25190j.gt_onboarding_lov_employer);
                C41536l.m120488h(string11, "getString(R.string.gt_onboarding_lov_employer)");
                C28710a0 a0Var12 = this.f61615H;
                if (a0Var12 == null) {
                    C41536l.m120506z("binding");
                    a0Var12 = null;
                }
                LinearLayout linearLayout11 = a0Var12.f73110f;
                C41536l.m120488h(linearLayout11, "binding.detailsInnerContainer");
                m76370O2(this, string11, g, linearLayout11, false, 8, (Object) null);
            }
        }
        C20231f m = eVar.mo48692m();
        if (m != null) {
            String string12 = getString(C25190j.gt_onboarding_lov_employment_field);
            C41536l.m120488h(string12, "getString(R.string.gt_on…ing_lov_employment_field)");
            String b2 = m.mo48697b();
            C28710a0 a0Var13 = this.f61615H;
            if (a0Var13 == null) {
                C41536l.m120506z("binding");
                a0Var13 = null;
            }
            LinearLayout linearLayout12 = a0Var13.f73110f;
            C41536l.m120488h(linearLayout12, "binding.detailsInnerContainer");
            m76370O2(this, string12, b2, linearLayout12, false, 8, (Object) null);
        }
        Integer a = eVar.mo48678a();
        if (a != null) {
            int intValue = a.intValue();
            String string13 = getString(C25190j.gt_onboarding_lov_annual_income);
            C41536l.m120488h(string13, "getString(R.string.gt_on…arding_lov_annual_income)");
            String str2 = intValue + C32314k.m95245a("USD");
            C28710a0 a0Var14 = this.f61615H;
            if (a0Var14 == null) {
                C41536l.m120506z("binding");
            } else {
                a0Var = a0Var14;
            }
            LinearLayout linearLayout13 = a0Var.f73110f;
            C41536l.m120488h(linearLayout13, "binding.detailsInnerContainer");
            m76370O2(this, string13, str2, linearLayout13, false, 8, (Object) null);
        }
    }

    /* renamed from: S2 */
    private final void m76374S2() {
        m76372Q2().mo60502gw().mo48710E();
    }

    /* renamed from: T2 */
    private final void m76375T2() {
        m76372Q2().mo60503hw().mo48713Q5().mo4819k(this, new C23624c(new C23623b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m76376U2(GTOnboardingReviewDataActivity gTOnboardingReviewDataActivity, View view) {
        C41536l.m120489i(gTOnboardingReviewDataActivity, "this$0");
        gTOnboardingReviewDataActivity.m76374S2();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m76377V2(GTOnboardingReviewDataActivity gTOnboardingReviewDataActivity, View view) {
        C41536l.m120489i(gTOnboardingReviewDataActivity, "this$0");
        ContactUsActivity.m103436P3(gTOnboardingReviewDataActivity);
    }

    /* renamed from: W2 */
    private final void m76378W2() {
        C28710a0 a0Var = this.f61615H;
        if (a0Var == null) {
            C41536l.m120506z("binding");
            a0Var = null;
        }
        Button button = a0Var.f73111g;
        C41536l.m120488h(button, "binding.nextButton");
        C32343x.m95483r1(button, false, false, 2, (Object) null);
        C28710a0 a0Var2 = this.f61615H;
        if (a0Var2 == null) {
            C41536l.m120506z("binding");
            a0Var2 = null;
        }
        LayerView layerView = a0Var2.f73116l;
        C41536l.m120488h(layerView, "binding.successPageHeader");
        C32343x.m95483r1(layerView, true, false, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28710a0 d = C28710a0.m87957d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61615H = d;
        C28710a0 a0Var = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        if (getIntent().getBooleanExtra("RESULT_PAGE", false)) {
            m76378W2();
        }
        m76373R2(m76372Q2().mo60503hw().mo48712D0());
        C28710a0 a0Var2 = this.f61615H;
        if (a0Var2 == null) {
            C41536l.m120506z("binding");
            a0Var2 = null;
        }
        a0Var2.f73111g.setOnClickListener(new C20233a(this));
        C28710a0 a0Var3 = this.f61615H;
        if (a0Var3 == null) {
            C41536l.m120506z("binding");
            a0Var3 = null;
        }
        a0Var3.f73109e.setOnClickListener(new C20234b(this));
        C28710a0 a0Var4 = this.f61615H;
        if (a0Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            a0Var = a0Var4;
        }
        a0Var.f73112h.setTitleText(getString(m76372Q2().mo60505jw()));
        m76375T2();
    }
}
