package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g31.C32054a;
import g41.C32081a;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity;
import p380ck.C10463g;
import p603si.C17796a;
import p603si.C17799b;
import sf0.C28193b;
import tf0.C28372a;
import ue0.C28756v;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity */
public final class GTOnboardingMailInputActivity extends C28193b {

    /* renamed from: J */
    public static final C23514a f61415J = new C23514a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private final C41217g f61416H = C41219i.m119470b(new C23516c(this));

    /* renamed from: I */
    private final C41217g f61417I = new C1617p0(C41520a0.m120436b(GTOnboardingMailInputViewModel$ViewModel.class), new C23522i(this), new C23521h(this), new C23523j((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$a */
    public static final class C23514a {
        private C23514a() {
        }

        public /* synthetic */ C23514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo60364a(C28193b bVar) {
            C41536l.m120489i(bVar, "context");
            return new Intent(bVar, GTOnboardingMailInputActivity.class);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$b */
    public static final class C23515b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailInputActivity f61418d;

        public C23515b(GTOnboardingMailInputActivity gTOnboardingMailInputActivity) {
            this.f61418d = gTOnboardingMailInputActivity;
        }

        public void afterTextChanged(Editable editable) {
            String obj;
            Button button = this.f61418d.m76081O2().f73489f;
            boolean z = false;
            if (!(editable == null || (obj = editable.toString()) == null || obj.length() <= 0)) {
                z = true;
            }
            button.setEnabled(z);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$c */
    static final class C23516c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailInputActivity f61419d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23516c(GTOnboardingMailInputActivity gTOnboardingMailInputActivity) {
            super(0);
            this.f61419d = gTOnboardingMailInputActivity;
        }

        /* renamed from: b */
        public final C28756v invoke() {
            return C28756v.m88155d(this.f61419d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$d */
    static final class C23517d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailInputActivity f61420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23517d(GTOnboardingMailInputActivity gTOnboardingMailInputActivity) {
            super(1);
            this.f61420d = gTOnboardingMailInputActivity;
        }

        /* renamed from: a */
        public final void mo60369a(C31128a aVar) {
            this.f61420d.m76081O2().f73489f.setLoading(false);
            if (aVar instanceof C31128a.C31131c) {
                this.f61420d.m76081O2().f73489f.setLoading(false);
                GTOnboardingMailInputActivity gTOnboardingMailInputActivity = this.f61420d;
                gTOnboardingMailInputActivity.mo67715G2(GTOnboardingMailValidateActivity.f61443K.mo60388a(gTOnboardingMailInputActivity, gTOnboardingMailInputActivity.m76082P2().mo60381ow(), (String) ((C31128a.C31131c) aVar).mo71340a()));
            } else if (aVar instanceof C31128a.C31129a) {
                this.f61420d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31130b) {
                this.f61420d.m76081O2().f73489f.setLoading(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60369a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$e */
    static final class C23518e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailInputActivity f61421d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23518e(GTOnboardingMailInputActivity gTOnboardingMailInputActivity) {
            super(1);
            this.f61421d = gTOnboardingMailInputActivity;
        }

        /* renamed from: a */
        public final void mo60370a(C31128a aVar) {
            this.f61421d.m76081O2().f73489f.setLoading(false);
            if (aVar instanceof C31128a.C31131c) {
                if (this.f61421d.m76081O2().f73488e.mo35918a()) {
                    this.f61421d.m76082P2().mo60380nw().mo60384ti(this.f61421d.m76081O2().f73488e.getInputText());
                }
            } else if (aVar instanceof C31128a.C31129a) {
                this.f61421d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31130b) {
                this.f61421d.m76081O2().f73489f.setLoading(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60370a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$f */
    static final class C23519f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailInputActivity f61422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23519f(GTOnboardingMailInputActivity gTOnboardingMailInputActivity) {
            super(1);
            this.f61422d = gTOnboardingMailInputActivity;
        }

        /* renamed from: a */
        public final void mo60371a(String str) {
            C41536l.m120489i(str, "mail");
            this.f61422d.m76081O2().f73488e.setInputText(str);
            this.f61422d.m76081O2().f73488e.getTextInput().setSelection(str.length());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60371a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$g */
    static final class C23520g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61423a;

        C23520g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61423a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61423a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61423a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$h */
    public static final class C23521h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23521h(ComponentActivity componentActivity) {
            super(0);
            this.f61424d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61424d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$i */
    public static final class C23522i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23522i(ComponentActivity componentActivity) {
            super(0);
            this.f61425d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61425d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity$j */
    public static final class C23523j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61426d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61427e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23523j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61426d = aVar;
            this.f61427e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61426d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61427e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: M2 */
    private final void m76079M2() {
        m76081O2().f73489f.setOnClickListener(new C28372a(this));
        m76081O2().f73488e.getTextInput().addTextChangedListener(new C23515b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m76080N2(GTOnboardingMailInputActivity gTOnboardingMailInputActivity, View view) {
        C41536l.m120489i(gTOnboardingMailInputActivity, "this$0");
        C32054a.C32066l lVar = C32054a.C32066l.f78907f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(lVar, F, " ", " ");
        gTOnboardingMailInputActivity.m76082P2().mo60380nw().mo60375bo();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final C28756v m76081O2() {
        return (C28756v) this.f61416H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final GTOnboardingMailInputViewModel$ViewModel m76082P2() {
        return (GTOnboardingMailInputViewModel$ViewModel) this.f61417I.getValue();
    }

    /* renamed from: Q2 */
    private final void m76083Q2() {
        m76082P2().mo60382pw().mo60376hm().mo4819k(this, new C23520g(new C23517d(this)));
        m76082P2().mo60382pw().mo60374D().mo4819k(this, new C23520g(new C23518e(this)));
        C37224b.m109963b(m76082P2().mo60382pw().mo60383rv(), this, new C23519f(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m76081O2());
        Input input = m76081O2().f73488e;
        C41536l.m120488h(input, "binding.gtInput");
        C17796a aVar = new C17796a((List) null, (C17796a.C17797a) null, 3, (DefaultConstructorMarker) null);
        aVar.add(C17799b.C17804e.f50685d);
        aVar.add(C17799b.C17805f.f50686d);
        aVar.add(C17799b.C17808i.f50690d);
        Input.m50261f(input, aVar, false, false, false, 14, (Object) null);
        m76081O2().f73488e.getTextInput().setInputType(32);
        m76081O2().f73488e.getTextInput().requestFocus();
        m76079M2();
        m76083Q2();
    }
}
