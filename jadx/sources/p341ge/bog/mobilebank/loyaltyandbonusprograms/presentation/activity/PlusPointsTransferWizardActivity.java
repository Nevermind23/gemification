package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import c91.C31355y;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import ot0.C37778r0;
import p163m0.C7047a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.plustransfer.ClientInitialsUIModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferWizardViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogEditText;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BasicWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import rs0.C38338e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity */
public final class PlusPointsTransferWizardActivity extends C32905e {

    /* renamed from: o0 */
    public static final C32884a f80733o0 = new C32884a((DefaultConstructorMarker) null);

    /* renamed from: m0 */
    private final C41217g f80734m0 = new C1617p0(C41520a0.m120436b(PlusPointsTransferWizardViewModel$ViewModel.class), new C32895l(this), new C32894k(this), new C32896m((C43064a) null, this));

    /* renamed from: n0 */
    private final C41217g f80735n0 = C41219i.m119470b(new C32892i(this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$a */
    public static final class C32884a {
        private C32884a() {
        }

        public /* synthetic */ C32884a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74771a(Activity activity, List list, int i, int i2, String str) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(list, "wizardObjects");
            Intent intent = new Intent(activity, PlusPointsTransferWizardActivity.class);
            intent.putExtra("KEY_CLIENT_NAME", str);
            BasicWizardActivity.m106443B3(intent, new ArrayList(list), i, i2, (String) null);
            activity.startActivityForResult(intent, 10001);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$b */
    public static final class C32885b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferWizardActivity f80736d;

        /* renamed from: e */
        final /* synthetic */ C31355y f80737e;

        /* renamed from: f */
        final /* synthetic */ WizardObject f80738f;

        public C32885b(PlusPointsTransferWizardActivity plusPointsTransferWizardActivity, C31355y yVar, WizardObject wizardObject) {
            this.f80736d = plusPointsTransferWizardActivity;
            this.f80737e = yVar;
            this.f80738f = wizardObject;
        }

        public final void run() {
            BogEditText editText;
            if (this.f80736d.m97072P3() != null) {
                BogInputLayout bogInputLayout = this.f80737e.f77882e;
                if (bogInputLayout != null) {
                    String h0 = C32343x.m95452h0(C38338e.bonus_transfer_beneficiary_name, new Object[0]);
                    String K3 = this.f80736d.m97072P3();
                    bogInputLayout.setUnderHintText(h0 + ": " + K3);
                }
                C37778r0 hw = this.f80736d.m97073Q3().mo75287hw();
                String value = this.f80738f.getValue();
                C41536l.m120488h(value, "wo.value");
                hw.mo75283F4(new ClientInitialsUIModel(value, String.valueOf(this.f80736d.m97072P3())));
            } else {
                this.f80736d.f86752F.setText(C38338e.f91906e);
            }
            BogInputLayout bogInputLayout2 = this.f80737e.f77882e;
            if (bogInputLayout2 != null && (editText = bogInputLayout2.getEditText()) != null) {
                C41536l.m120488h(editText, "editText");
                editText.addTextChangedListener(new C32886c(this.f80736d, this.f80737e));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$c */
    public static final class C32886c implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferWizardActivity f80739d;

        /* renamed from: e */
        final /* synthetic */ C31355y f80740e;

        public C32886c(PlusPointsTransferWizardActivity plusPointsTransferWizardActivity, C31355y yVar) {
            this.f80739d = plusPointsTransferWizardActivity;
            this.f80740e = yVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f80739d.f86752F.setText(C38338e.f91906e);
            BogInputLayout bogInputLayout = this.f80740e.f77882e;
            if (bogInputLayout != null) {
                bogInputLayout.setUnderHintText("");
            }
            this.f80739d.m97073Q3().mo75287hw().mo75283F4((ClientInitialsUIModel) null);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$d */
    static final class C32887d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferWizardActivity f80741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32887d(PlusPointsTransferWizardActivity plusPointsTransferWizardActivity) {
            super(1);
            this.f80741d = plusPointsTransferWizardActivity;
        }

        /* renamed from: a */
        public final void mo74776a(String str) {
            this.f80741d.m97075S3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74776a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$e */
    /* synthetic */ class C32888e extends C41535k implements C43075l {
        C32888e(Object obj) {
            super(1, obj, PlusPointsTransferWizardActivity.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo74777b(Throwable th) {
            ((PlusPointsTransferWizardActivity) this.receiver).mo74709H1(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74777b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$f */
    static final class C32889f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferWizardActivity f80742d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32889f(PlusPointsTransferWizardActivity plusPointsTransferWizardActivity) {
            super(1);
            this.f80742d = plusPointsTransferWizardActivity;
        }

        /* renamed from: a */
        public final void mo74778a(String str) {
            Object obj;
            BogInputLayout bogInputLayout;
            C41536l.m120489i(str, "initials");
            this.f80742d.m97075S3(false);
            this.f80742d.f86752F.setText(C38338e.f91907f);
            ArrayList I3 = this.f80742d.f86630k0;
            C41536l.m120488h(I3, "fragments");
            Iterator it = I3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C31355y) obj).mo71707D1().getId(), "ID_NUMBER")) {
                    break;
                }
            }
            C31355y yVar = (C31355y) obj;
            if (yVar != null && (bogInputLayout = yVar.f77882e) != null) {
                String h0 = C32343x.m95452h0(C38338e.bonus_transfer_beneficiary_name, new Object[0]);
                bogInputLayout.setUnderHintText(h0 + ": " + str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74778a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$g */
    /* synthetic */ class C32890g extends C41535k implements C43075l {
        C32890g(Object obj) {
            super(1, obj, PlusPointsTransferWizardActivity.class, "onClientInitials", "onClientInitials(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74779b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PlusPointsTransferWizardActivity) this.receiver).m97074R3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74779b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$h */
    static final class C32891h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferWizardActivity f80743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32891h(PlusPointsTransferWizardActivity plusPointsTransferWizardActivity) {
            super(1);
            this.f80743d = plusPointsTransferWizardActivity;
        }

        /* renamed from: a */
        public final void mo74780a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                PlusPointsTransferWizardActivity.super.mo53122i3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74780a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$i */
    static final class C32892i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferWizardActivity f80744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32892i(PlusPointsTransferWizardActivity plusPointsTransferWizardActivity) {
            super(0);
            this.f80744d = plusPointsTransferWizardActivity;
        }

        public final String invoke() {
            return this.f80744d.getIntent().getStringExtra("KEY_CLIENT_NAME");
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$j */
    static final class C32893j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80745a;

        C32893j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80745a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80745a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80745a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$k */
    public static final class C32894k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32894k(ComponentActivity componentActivity) {
            super(0);
            this.f80746d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80746d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$l */
    public static final class C32895l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32895l(ComponentActivity componentActivity) {
            super(0);
            this.f80747d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80747d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity$m */
    public static final class C32896m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80748d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80749e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32896m(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80748d = aVar;
            this.f80749e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80748d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80749e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public final String m97072P3() {
        return (String) this.f80735n0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public final PlusPointsTransferWizardViewModel$ViewModel m97073Q3() {
        return (PlusPointsTransferWizardViewModel$ViewModel) this.f80734m0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public final void m97074R3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32887d(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32888e(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32889f(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public final void m97075S3(boolean z) {
        BogProgressBar bogProgressBar = this.f86763Q;
        C41536l.m120488h(bogProgressBar, "nextProgressBar");
        C32343x.m95483r1(bogProgressBar, z, false, 2, (Object) null);
        if (z) {
            mo87971y3();
        } else {
            mo87958V2();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C3 */
    public void mo74769C3(Intent intent) {
        super.mo74769C3(intent);
        ArrayList<C31355y> arrayList = this.f86630k0;
        if (arrayList != null) {
            for (C31355y yVar : arrayList) {
                if (intent != null) {
                    intent.putExtra(yVar.mo71707D1().getId(), yVar.mo71611z1());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D3 */
    public C31355y mo74770D3(WizardObject wizardObject, int i) {
        String str;
        C31355y D3 = super.mo74770D3(wizardObject, i);
        if (wizardObject != null) {
            str = wizardObject.getId();
        } else {
            str = null;
        }
        if (C41536l.m120484d(str, "ID_NUMBER")) {
            BogButton bogButton = this.f86752F;
            C41536l.m120488h(bogButton, "nextButton");
            bogButton.postDelayed(new C32885b(this, D3, wizardObject), 200);
        }
        C41536l.m120488h(D3, "fragment");
        return D3;
    }

    /* renamed from: H1 */
    public void mo74709H1(Throwable th) {
        super.mo74709H1(th);
        m97075S3(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m97073Q3().mo75288iw().mo75284Sg().mo4819k(this, new C32893j(new C32890g(this)));
        m97073Q3().mo75288iw().mo75286h6().mo4819k(this, new C32893j(new C32891h(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i3 */
    public void mo53122i3() {
        int d = this.f86776d0.mo87977d();
        if (!C41536l.m120484d(((C31355y) this.f86630k0.get(d)).mo71707D1().getId(), "ID_NUMBER") || !this.f86752F.isOrange()) {
            super.mo53122i3();
            return;
        }
        C37778r0 hw = m97073Q3().mo75287hw();
        String z1 = ((C31355y) this.f86630k0.get(d)).mo71611z1();
        C41536l.m120488h(z1, "fragments[index].inputValue");
        hw.mo75285Td(z1);
    }
}
