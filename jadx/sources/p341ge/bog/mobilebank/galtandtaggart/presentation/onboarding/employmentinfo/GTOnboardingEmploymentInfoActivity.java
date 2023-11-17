package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import cf1.C40419j;
import g31.C32054a;
import g41.C32081a;
import g91.C32330r0;
import g91.C32335t0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25182b;
import ie0.C25183c;
import ie0.C25190j;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.C23583b;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity;
import p341ge.bog.mobilebank.shared.helper.InputExtensionKt;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import p547oi.C17199a;
import p547oi.C17201b;
import p561pi.C17367b;
import sf0.C28193b;
import ue0.C28760x;
import ue1.C43064a;
import ue1.C43075l;
import vf0.C29041a;
import vf0.C29042b;
import vf0.C29043c;
import vf0.C29044d;
import vf0.C29045e;
import vf0.C29046f;
import vf0.C29047g;
import vf0.C29048h;
import vf0.C29049i;
import vf0.C29050j;
import xf0.C29765d;
import xf0.C29766e;
import yf0.C30010c;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity */
public final class GTOnboardingEmploymentInfoActivity extends C28193b implements C30010c.C30014c, C23583b.C23585b {

    /* renamed from: L */
    public static final C23547a f61479L = new C23547a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C28760x f61480H;

    /* renamed from: I */
    private final C41217g f61481I = new C1617p0(C41520a0.m120436b(GTOnboardingEmploymentInfoViewModel$ViewModel.class), new C23564r(this), new C23563q(this), new C23565s((C43064a) null, this));

    /* renamed from: J */
    private Boolean f61482J;

    /* renamed from: K */
    private String f61483K;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$a */
    public static final class C23547a {
        private C23547a() {
        }

        public /* synthetic */ C23547a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo60413a(Context context) {
            C41536l.m120489i(context, "context");
            return new Intent(context, GTOnboardingEmploymentInfoActivity.class);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$b */
    static final class C23548b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61484d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23548b(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61484d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60414a(C31128a aVar) {
            C28760x xVar = null;
            if (aVar instanceof C31128a.C31131c) {
                this.f61484d.m76183b3((C29766e) ((C31128a.C31131c) aVar).mo71340a());
                C28760x R2 = this.f61484d.f61480H;
                if (R2 == null) {
                    C41536l.m120506z("binding");
                    R2 = null;
                }
                R2.f73519n.setVisibility(8);
                C28760x R22 = this.f61484d.f61480H;
                if (R22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    xVar = R22;
                }
                xVar.f73520o.setVisibility(0);
            } else if (aVar instanceof C31128a.C31130b) {
                C28760x R23 = this.f61484d.f61480H;
                if (R23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    xVar = R23;
                }
                xVar.f73519n.setVisibility(0);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f61484d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                this.f61484d.finish();
                C28760x R24 = this.f61484d.f61480H;
                if (R24 == null) {
                    C41536l.m120506z("binding");
                } else {
                    xVar = R24;
                }
                xVar.f73519n.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60414a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$c */
    static final class C23549c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23549c(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61485d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60415a(List list) {
            C30010c.C30013b bVar = C30010c.f75836L;
            C41536l.m120488h(list, "result");
            String string = this.f61485d.getString(C25190j.gt_onboarding_lov_occupation_status);
            C41536l.m120488h(string, "getString(R.string.gt_on…ng_lov_occupation_status)");
            bVar.mo70318a(list, string, false).mo4576A1(this.f61485d.getSupportFragmentManager(), "TAG_EMPLOYMENT_STATUS_SELECTOR");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60415a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$d */
    static final class C23550d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61486d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23550d(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61486d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60416a(List list) {
            C30010c.C30013b bVar = C30010c.f75836L;
            C41536l.m120488h(list, "result");
            String string = this.f61486d.getString(C25190j.gt_onboarding_lov_employer_field);
            C41536l.m120488h(string, "getString(R.string.gt_on…rding_lov_employer_field)");
            C30010c.C30013b.m90981b(bVar, list, string, false, 4, (Object) null).mo4576A1(this.f61486d.getSupportFragmentManager(), "TAG_EMPLOYMENT_TYPE_SELECTOR");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60416a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$e */
    static final class C23551e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23551e(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61487d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60417a(List list) {
            C30010c.C30013b bVar = C30010c.f75836L;
            C41536l.m120488h(list, "result");
            String string = this.f61487d.getString(C25190j.gt_onboarding_lov_role);
            C41536l.m120488h(string, "getString(R.string.gt_onboarding_lov_role)");
            C30010c.C30013b.m90981b(bVar, list, string, false, 4, (Object) null).mo4576A1(this.f61487d.getSupportFragmentManager(), "TAG_EMPLOYMENT_POSITION_SELECTOR");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60417a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$f */
    static final class C23552f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61488d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23552f(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61488d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60418a(List list) {
            C30010c.C30013b bVar = C30010c.f75836L;
            C41536l.m120488h(list, "result");
            String string = this.f61488d.getString(C25190j.gt_onboarding_lov_income_source);
            C41536l.m120488h(string, "getString(R.string.gt_on…arding_lov_income_source)");
            C30010c.C30013b.m90981b(bVar, list, string, false, 4, (Object) null).mo4576A1(this.f61488d.getSupportFragmentManager(), "TAG_INCOME_SOURCE_SELECTOR");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60418a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$g */
    static final class C23553g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61489d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23553g(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61489d = gTOnboardingEmploymentInfoActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C28760x R2 = this.f61489d.f61480H;
            if (R2 == null) {
                C41536l.m120506z("binding");
                R2 = null;
            }
            Button button = R2.f73518m;
            C41536l.m120488h(bool, "result");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$h */
    static final class C23554h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61490a;

        C23554h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61490a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61490a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61490a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$i */
    static final class C23555i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23555i(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61491d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60422a(String str) {
            int i;
            C41536l.m120489i(str, "text");
            Float i2 = C40437u.m117097i(new C40419j("[^0-9.]").mo94490g(str, ""));
            C29050j jw = this.f61491d.m76177V2().mo60443jw();
            if (i2 != null) {
                i = (int) i2.floatValue();
            } else {
                i = 0;
            }
            jw.mo60438Vh(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60422a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$j */
    static final class C23556j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23556j(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61492d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60423a(String str) {
            C41536l.m120489i(str, "it");
            GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity = this.f61492d;
            C28760x R2 = gTOnboardingEmploymentInfoActivity.f61480H;
            C28760x xVar = null;
            if (R2 == null) {
                C41536l.m120506z("binding");
                R2 = null;
            }
            gTOnboardingEmploymentInfoActivity.m76179X2(R2.f73523r.getTextInput());
            C29050j jw = this.f61492d.m76177V2().mo60443jw();
            C28760x R22 = this.f61492d.f61480H;
            if (R22 == null) {
                C41536l.m120506z("binding");
            } else {
                xVar = R22;
            }
            jw.mo60441du(xVar.f73523r.getTextInput().getText().toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60423a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$k */
    static final class C23557k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23557k(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61493d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60424a(String str) {
            C41536l.m120489i(str, "it");
            GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity = this.f61493d;
            C28760x R2 = gTOnboardingEmploymentInfoActivity.f61480H;
            C28760x xVar = null;
            if (R2 == null) {
                C41536l.m120506z("binding");
                R2 = null;
            }
            gTOnboardingEmploymentInfoActivity.m76179X2(R2.f73526u.getTextInput());
            C29050j jw = this.f61493d.m76177V2().mo60443jw();
            C28760x R22 = this.f61493d.f61480H;
            if (R22 == null) {
                C41536l.m120506z("binding");
            } else {
                xVar = R22;
            }
            jw.mo60427Dp(xVar.f73526u.getTextInput().getText().toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60424a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$l */
    static final class C23558l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23558l(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(0);
            this.f61494d = gTOnboardingEmploymentInfoActivity;
        }

        public final void invoke() {
            this.f61494d.m76177V2().mo60443jw().mo60449pa();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$m */
    static final class C23559m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23559m(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(0);
            this.f61495d = gTOnboardingEmploymentInfoActivity;
        }

        public final void invoke() {
            this.f61495d.m76177V2().mo60443jw().mo60429Ia();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$n */
    static final class C23560n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23560n(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(0);
            this.f61496d = gTOnboardingEmploymentInfoActivity;
        }

        public final void invoke() {
            this.f61496d.m76177V2().mo60443jw().mo60431Jg();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$o */
    static final class C23561o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23561o(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(0);
            this.f61497d = gTOnboardingEmploymentInfoActivity;
        }

        public final void invoke() {
            this.f61497d.m76177V2().mo60443jw().mo60428Eg();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$p */
    static final class C23562p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingEmploymentInfoActivity f61498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23562p(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity) {
            super(1);
            this.f61498d = gTOnboardingEmploymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo60425a(String str) {
            C41536l.m120489i(str, "it");
            GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity = this.f61498d;
            C28760x R2 = gTOnboardingEmploymentInfoActivity.f61480H;
            C28760x xVar = null;
            if (R2 == null) {
                C41536l.m120506z("binding");
                R2 = null;
            }
            gTOnboardingEmploymentInfoActivity.m76179X2(R2.f73512g.getTextInput());
            C29050j jw = this.f61498d.m76177V2().mo60443jw();
            C28760x R22 = this.f61498d.f61480H;
            if (R22 == null) {
                C41536l.m120506z("binding");
            } else {
                xVar = R22;
            }
            jw.mo60455v2(xVar.f73512g.getTextInput().getText().toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60425a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$q */
    public static final class C23563q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61499d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23563q(ComponentActivity componentActivity) {
            super(0);
            this.f61499d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61499d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$r */
    public static final class C23564r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61500d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23564r(ComponentActivity componentActivity) {
            super(0);
            this.f61500d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61500d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity$s */
    public static final class C23565s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61501d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61502e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23565s(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61501d = aVar;
            this.f61502e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61501d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61502e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final GTOnboardingEmploymentInfoViewModel$ViewModel m76177V2() {
        return (GTOnboardingEmploymentInfoViewModel$ViewModel) this.f61481I.getValue();
    }

    /* renamed from: W2 */
    private final void m76178W2() {
        if (C32330r0.m95338m(this, "android.permission.CAMERA")) {
            m76194m3();
        } else {
            new C32330r0((Activity) this).mo72836w(1095, getString(C25190j.identomat_camera_permission_text));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m76179X2(EditText editText) {
        String obj = editText.getText().toString();
        String g = new C40419j("[^A-Za-z0-9/\\-?:().,'+ ]").mo94490g(obj, "");
        if (!C41536l.m120484d(g, obj)) {
            editText.setText(g);
            String string = getString(C25190j.f64739f);
            C41536l.m120488h(string, "getString(R.string.forei…nsfer_allowed_characters)");
            C12910e.m48790h(this, string, (C12902d.C12905b) null, false, 6, (Object) null);
            editText.setSelection(g.length());
        }
    }

    /* renamed from: Y2 */
    private final void m76180Y2(TextView textView, TextView textView2, boolean z) {
        int e = C32335t0.m95360e(this, C25182b.f64639a, true);
        if (z) {
            textView.setBackgroundResource(e);
            textView.setTextColor(C0767a.m2893c(this, C25183c.f64653o));
            textView2.setBackgroundResource(C25183c.f64643e);
            textView2.setTextColor(C0767a.m2893c(this, C25183c.f64642d));
            return;
        }
        textView.setBackgroundResource(C25183c.f64643e);
        textView.setTextColor(C0767a.m2893c(this, C25183c.f64642d));
        textView2.setBackgroundResource(e);
        textView2.setTextColor(C0767a.m2893c(this, C25183c.f64653o));
    }

    /* renamed from: Z2 */
    private final void m76181Z2() {
        C28760x xVar = this.f61480H;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        xVar.f73527v.setText(getString(m76177V2().mo60446mw()));
        C28760x xVar2 = this.f61480H;
        if (xVar2 == null) {
            C41536l.m120506z("binding");
            xVar2 = null;
        }
        Input input = xVar2.f73508F;
        String str = this.f61483K;
        if (str == null) {
            C41536l.m120506z("gelSymbol");
            str = null;
        }
        input.setSuffix(str);
        input.setFormatter(new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
        input.setFilters(new C17201b[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null)});
    }

    /* renamed from: a3 */
    private final void m76182a3() {
        m76177V2().mo60445lw().mo60442fq().mo4819k(this, new C23554h(new C23548b(this)));
        m76177V2().mo60445lw().mo60434O5().mo4819k(this, new C23554h(new C23549c(this)));
        m76177V2().mo60445lw().mo60440Yu().mo4819k(this, new C23554h(new C23550d(this)));
        m76177V2().mo60445lw().mo60426Ab().mo4819k(this, new C23554h(new C23551e(this)));
        m76177V2().mo60445lw().mo60430J9().mo4819k(this, new C23554h(new C23552f(this)));
        m76177V2().mo60445lw().mo60439Xa().mo4819k(this, new C23554h(new C23553g(this)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* renamed from: b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m76183b3(xf0.C29766e r12) {
        /*
            r11 = this;
            xf0.a r0 = r12.mo69929a()
            xf0.b r12 = r12.mo69930b()
            ue0.x r1 = r11.f61480H
            java.lang.String r2 = "binding"
            r3 = 0
            if (r1 != 0) goto L_0x0013
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0013:
            android.widget.TextView r1 = r1.f73507E
            java.lang.String r4 = "binding.usaMarketYesText"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            ue0.x r4 = r11.f61480H
            if (r4 != 0) goto L_0x0022
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r4 = r3
        L_0x0022:
            android.widget.TextView r4 = r4.f73504B
            java.lang.String r5 = "binding.usaMarketNoText"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            boolean r5 = r0.mo69887a()
            r11.m76180Y2(r1, r4, r5)
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x0038
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0038:
            ge.bog.designsystem.components.inlinefeedback.InlineFeedback r1 = r1.f73531z
            java.lang.String r4 = "binding.usaConnectionWarning"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            boolean r4 = r0.mo69887a()
            r5 = 0
            r6 = 2
            g91.C32343x.m95483r1(r1, r4, r5, r6, r3)
            java.lang.Boolean r1 = r11.f61482J
            java.lang.String r4 = "binding.shareInCompanyGroup"
            java.lang.String r7 = "binding.shareInCompanyNoText"
            java.lang.String r8 = "binding.shareInCompanyYesText"
            if (r1 != 0) goto L_0x00bc
            java.lang.String r1 = r0.mo69888b()
            r9 = 1
            if (r1 == 0) goto L_0x0062
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r1 = r5
            goto L_0x0063
        L_0x0062:
            r1 = r9
        L_0x0063:
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = r0.mo69889c()
            if (r1 == 0) goto L_0x0074
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r1 = r5
            goto L_0x0075
        L_0x0074:
            r1 = r9
        L_0x0075:
            if (r1 == 0) goto L_0x0079
            r1 = r9
            goto L_0x007a
        L_0x0079:
            r1 = r5
        L_0x007a:
            ue0.x r10 = r11.f61480H
            if (r10 != 0) goto L_0x0082
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r10 = r3
        L_0x0082:
            android.widget.TextView r10 = r10.f73529x
            kotlin.jvm.internal.C41536l.m120488h(r10, r8)
            ue0.x r8 = r11.f61480H
            if (r8 != 0) goto L_0x008f
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r8 = r3
        L_0x008f:
            android.widget.TextView r8 = r8.f73525t
            kotlin.jvm.internal.C41536l.m120488h(r8, r7)
            r7 = r1 ^ 1
            r11.m76180Y2(r10, r8, r7)
            ue0.x r7 = r11.f61480H
            if (r7 != 0) goto L_0x00a1
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r7 = r3
        L_0x00a1:
            androidx.constraintlayout.widget.Group r7 = r7.f73522q
            kotlin.jvm.internal.C41536l.m120488h(r7, r4)
            r4 = r1 ^ 1
            g91.C32343x.m95483r1(r7, r4, r5, r6, r3)
            r4 = r1 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r11.f61482J = r4
            ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoViewModel$ViewModel r4 = r11.m76177V2()
            r1 = r1 ^ r9
            r4.mo60433Nt(r1)
            goto L_0x00fb
        L_0x00bc:
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x00c4
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x00c4:
            android.widget.TextView r1 = r1.f73529x
            kotlin.jvm.internal.C41536l.m120488h(r1, r8)
            ue0.x r8 = r11.f61480H
            if (r8 != 0) goto L_0x00d1
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r8 = r3
        L_0x00d1:
            android.widget.TextView r8 = r8.f73525t
            kotlin.jvm.internal.C41536l.m120488h(r8, r7)
            java.lang.Boolean r7 = r11.f61482J
            kotlin.jvm.internal.C41536l.m120486f(r7)
            boolean r7 = r7.booleanValue()
            r11.m76180Y2(r1, r8, r7)
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x00ea
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x00ea:
            androidx.constraintlayout.widget.Group r1 = r1.f73522q
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            java.lang.Boolean r4 = r11.f61482J
            kotlin.jvm.internal.C41536l.m120486f(r4)
            boolean r4 = r4.booleanValue()
            g91.C32343x.m95483r1(r1, r4, r5, r6, r3)
        L_0x00fb:
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x0103
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0103:
            ge.bog.designsystem.components.input.Input r1 = r1.f73523r
            java.lang.String r4 = r0.mo69888b()
            java.lang.String r7 = ""
            if (r4 != 0) goto L_0x010e
            r4 = r7
        L_0x010e:
            r1.setInputText(r4)
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x0119
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0119:
            ge.bog.designsystem.components.input.Input r1 = r1.f73526u
            java.lang.String r4 = r0.mo69889c()
            if (r4 != 0) goto L_0x0122
            r4 = r7
        L_0x0122:
            r1.setInputText(r4)
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x012d
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x012d:
            ge.bog.designsystem.components.input.Input r1 = r1.f73515j
            xf0.d r4 = r0.mo69891e()
            if (r4 == 0) goto L_0x013b
            java.lang.String r4 = r4.mo69922b()
            if (r4 != 0) goto L_0x013c
        L_0x013b:
            r4 = r7
        L_0x013c:
            r1.setInputText(r4)
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x0147
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0147:
            androidx.constraintlayout.widget.Group r1 = r1.f73513h
            java.lang.String r4 = "binding.employmentGroup"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            boolean r4 = r0.mo69900l()
            g91.C32343x.m95483r1(r1, r4, r5, r6, r3)
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x015d
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x015d:
            ge.bog.designsystem.components.input.Input r1 = r1.f73516k
            xf0.d r4 = r0.mo69897i()
            if (r4 == 0) goto L_0x016b
            java.lang.String r4 = r4.mo69922b()
            if (r4 != 0) goto L_0x016c
        L_0x016b:
            r4 = r7
        L_0x016c:
            r1.setInputText(r4)
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x0177
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0177:
            ge.bog.designsystem.components.input.Input r1 = r1.f73514i
            xf0.d r4 = r0.mo69894g()
            if (r4 == 0) goto L_0x0185
            java.lang.String r4 = r4.mo69922b()
            if (r4 != 0) goto L_0x0186
        L_0x0185:
            r4 = r7
        L_0x0186:
            r1.setInputText(r4)
            ue0.x r1 = r11.f61480H
            if (r1 != 0) goto L_0x0191
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x0191:
            ge.bog.designsystem.components.input.Input r1 = r1.f73517l
            xf0.d r12 = r12.mo69910a()
            if (r12 == 0) goto L_0x019f
            java.lang.String r12 = r12.mo69922b()
            if (r12 != 0) goto L_0x01a0
        L_0x019f:
            r12 = r7
        L_0x01a0:
            r1.setInputText(r12)
            ue0.x r12 = r11.f61480H
            if (r12 != 0) goto L_0x01ab
            kotlin.jvm.internal.C41536l.m120506z(r2)
            goto L_0x01ac
        L_0x01ab:
            r3 = r12
        L_0x01ac:
            ge.bog.designsystem.components.input.Input r12 = r3.f73512g
            java.lang.String r0 = r0.mo69890d()
            if (r0 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            r7 = r0
        L_0x01b6:
            r12.setInputText(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity.m76183b3(xf0.e):void");
    }

    /* renamed from: c3 */
    private final void m76184c3() {
        C28760x xVar = this.f61480H;
        C28760x xVar2 = null;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        xVar.f73528w.setOnClickListener(new C29041a(this));
        C28760x xVar3 = this.f61480H;
        if (xVar3 == null) {
            C41536l.m120506z("binding");
            xVar3 = null;
        }
        xVar3.f73524s.setOnClickListener(new C29042b(this));
        C28760x xVar4 = this.f61480H;
        if (xVar4 == null) {
            C41536l.m120506z("binding");
            xVar4 = null;
        }
        xVar4.f73506D.setOnClickListener(new C29043c(this));
        C28760x xVar5 = this.f61480H;
        if (xVar5 == null) {
            C41536l.m120506z("binding");
            xVar5 = null;
        }
        xVar5.f73503A.setOnClickListener(new C29044d(this));
        C28760x xVar6 = this.f61480H;
        if (xVar6 == null) {
            C41536l.m120506z("binding");
            xVar6 = null;
        }
        xVar6.f73515j.setOnClickListener(new C29045e(this));
        C28760x xVar7 = this.f61480H;
        if (xVar7 == null) {
            C41536l.m120506z("binding");
            xVar7 = null;
        }
        xVar7.f73516k.setOnClickListener(new C29046f(this));
        C28760x xVar8 = this.f61480H;
        if (xVar8 == null) {
            C41536l.m120506z("binding");
            xVar8 = null;
        }
        xVar8.f73514i.setOnClickListener(new C29047g(this));
        C28760x xVar9 = this.f61480H;
        if (xVar9 == null) {
            C41536l.m120506z("binding");
            xVar9 = null;
        }
        xVar9.f73517l.setOnClickListener(new C29048h(this));
        C28760x xVar10 = this.f61480H;
        if (xVar10 == null) {
            C41536l.m120506z("binding");
            xVar10 = null;
        }
        C32343x.m95457j(xVar10.f73512g.getTextInput(), new C23562p(this));
        C28760x xVar11 = this.f61480H;
        if (xVar11 == null) {
            C41536l.m120506z("binding");
            xVar11 = null;
        }
        C32343x.m95457j(xVar11.f73508F.getTextInput(), new C23555i(this));
        C28760x xVar12 = this.f61480H;
        if (xVar12 == null) {
            C41536l.m120506z("binding");
            xVar12 = null;
        }
        C32343x.m95457j(xVar12.f73523r.getTextInput(), new C23556j(this));
        C28760x xVar13 = this.f61480H;
        if (xVar13 == null) {
            C41536l.m120506z("binding");
            xVar13 = null;
        }
        C32343x.m95457j(xVar13.f73526u.getTextInput(), new C23557k(this));
        C28760x xVar14 = this.f61480H;
        if (xVar14 == null) {
            C41536l.m120506z("binding");
        } else {
            xVar2 = xVar14;
        }
        xVar2.f73518m.setOnClickListener(new C29049i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m76185d3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C28760x xVar = gTOnboardingEmploymentInfoActivity.f61480H;
        C28760x xVar2 = null;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        xVar.f73522q.setVisibility(0);
        C28760x xVar3 = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar3 == null) {
            C41536l.m120506z("binding");
            xVar3 = null;
        }
        TextView textView = xVar3.f73529x;
        C41536l.m120488h(textView, "binding.shareInCompanyYesText");
        C28760x xVar4 = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            xVar2 = xVar4;
        }
        TextView textView2 = xVar2.f73525t;
        C41536l.m120488h(textView2, "binding.shareInCompanyNoText");
        gTOnboardingEmploymentInfoActivity.m76180Y2(textView, textView2, true);
        gTOnboardingEmploymentInfoActivity.f61482J = Boolean.TRUE;
        gTOnboardingEmploymentInfoActivity.m76177V2().mo60443jw().mo60433Nt(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m76186e3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C28760x xVar = gTOnboardingEmploymentInfoActivity.f61480H;
        C28760x xVar2 = null;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        xVar.f73522q.setVisibility(8);
        C28760x xVar3 = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar3 == null) {
            C41536l.m120506z("binding");
            xVar3 = null;
        }
        TextView textView = xVar3.f73529x;
        C41536l.m120488h(textView, "binding.shareInCompanyYesText");
        C28760x xVar4 = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            xVar2 = xVar4;
        }
        TextView textView2 = xVar2.f73525t;
        C41536l.m120488h(textView2, "binding.shareInCompanyNoText");
        gTOnboardingEmploymentInfoActivity.m76180Y2(textView, textView2, false);
        gTOnboardingEmploymentInfoActivity.f61482J = Boolean.FALSE;
        gTOnboardingEmploymentInfoActivity.m76177V2().mo60443jw().mo60433Nt(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m76187f3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C28760x xVar = gTOnboardingEmploymentInfoActivity.f61480H;
        C28760x xVar2 = null;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        TextView textView = xVar.f73507E;
        C41536l.m120488h(textView, "binding.usaMarketYesText");
        C28760x xVar3 = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            xVar2 = xVar3;
        }
        TextView textView2 = xVar2.f73504B;
        C41536l.m120488h(textView2, "binding.usaMarketNoText");
        gTOnboardingEmploymentInfoActivity.m76180Y2(textView, textView2, true);
        gTOnboardingEmploymentInfoActivity.m76177V2().mo60443jw().mo60437Uq(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m76188g3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C28760x xVar = gTOnboardingEmploymentInfoActivity.f61480H;
        C28760x xVar2 = null;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        TextView textView = xVar.f73507E;
        C41536l.m120488h(textView, "binding.usaMarketYesText");
        C28760x xVar3 = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            xVar2 = xVar3;
        }
        TextView textView2 = xVar2.f73504B;
        C41536l.m120488h(textView2, "binding.usaMarketNoText");
        gTOnboardingEmploymentInfoActivity.m76180Y2(textView, textView2, false);
        gTOnboardingEmploymentInfoActivity.m76177V2().mo60443jw().mo60437Uq(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m76189h3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C28760x xVar = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        Input input = xVar.f73515j;
        C41536l.m120488h(input, "binding.employmentStatus");
        InputExtensionKt.m101732d(input, new C23558l(gTOnboardingEmploymentInfoActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m76190i3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C28760x xVar = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        Input input = xVar.f73516k;
        C41536l.m120488h(input, "binding.employmentType");
        InputExtensionKt.m101732d(input, new C23559m(gTOnboardingEmploymentInfoActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m76191j3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C28760x xVar = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        Input input = xVar.f73514i;
        C41536l.m120488h(input, "binding.employmentPosition");
        InputExtensionKt.m101732d(input, new C23560n(gTOnboardingEmploymentInfoActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m76192k3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C28760x xVar = gTOnboardingEmploymentInfoActivity.f61480H;
        if (xVar == null) {
            C41536l.m120506z("binding");
            xVar = null;
        }
        Input input = xVar.f73517l;
        C41536l.m120488h(input, "binding.incomeSource");
        InputExtensionKt.m101732d(input, new C23561o(gTOnboardingEmploymentInfoActivity));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m76193l3(GTOnboardingEmploymentInfoActivity gTOnboardingEmploymentInfoActivity, View view) {
        C41536l.m120489i(gTOnboardingEmploymentInfoActivity, "this$0");
        C32054a.C32057c cVar = C32054a.C32057c.f78899f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(cVar, F, " ", " ");
        gTOnboardingEmploymentInfoActivity.m76177V2().mo60443jw().mo60454u9();
        gTOnboardingEmploymentInfoActivity.m76178W2();
    }

    /* renamed from: m3 */
    private final void m76194m3() {
        C23583b.C23584a.m76309b(C23583b.f61554P, false, 1, (Object) null).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: E */
    public void mo60411E() {
        mo67715G2(TermsAndConditionsActivity.f61636M.mo60510a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28760x d = C28760x.m88173d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61480H = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        String string = getString(C25190j.gel_symbol);
        C41536l.m120488h(string, "getString(R.string.gel_symbol)");
        this.f61483K = ' ' + string;
        m76181Z2();
        m76184c3();
        m76182a3();
    }

    /* renamed from: g */
    public void mo60412g(C29765d dVar, String str) {
        C41536l.m120489i(dVar, "subType");
        if (str != null) {
            switch (str.hashCode()) {
                case -1809853625:
                    if (str.equals("TAG_EMPLOYMENT_POSITION_SELECTOR")) {
                        if (C41536l.m120484d(dVar.mo69921a(), "DEFAULT_ID_FOR_FIRST_ITEM")) {
                            m76177V2().mo60443jw().mo60453tp((C29765d) null);
                            return;
                        } else {
                            m76177V2().mo60443jw().mo60453tp(dVar);
                            return;
                        }
                    } else {
                        return;
                    }
                case -762154666:
                    if (str.equals("TAG_EMPLOYMENT_TYPE_SELECTOR")) {
                        if (C41536l.m120484d(dVar.mo69921a(), "DEFAULT_ID_FOR_FIRST_ITEM")) {
                            m76177V2().mo60443jw().mo60436Q7((C29765d) null);
                            return;
                        } else {
                            m76177V2().mo60443jw().mo60436Q7(dVar);
                            return;
                        }
                    } else {
                        return;
                    }
                case 1033171794:
                    if (str.equals("TAG_INCOME_SOURCE_SELECTOR")) {
                        m76177V2().mo60443jw().mo60432Kp(dVar);
                        return;
                    }
                    return;
                case 1375061790:
                    if (str.equals("TAG_EMPLOYMENT_STATUS_SELECTOR")) {
                        m76177V2().mo60443jw().mo60435Pj(dVar);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1095) {
            Integer z = C41333m.m119801z(iArr, 0);
            if (z != null) {
                i2 = z.intValue();
            } else {
                i2 = -1;
            }
            if (i2 == 0) {
                m76194m3();
            }
        }
    }
}
