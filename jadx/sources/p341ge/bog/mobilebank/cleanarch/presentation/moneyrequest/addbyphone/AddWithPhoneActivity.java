package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone;

import a81.C30772sa;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.C0209a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27343k;
import r20.C27889e;
import r20.C27890f;
import r20.C27891g;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity */
public final class AddWithPhoneActivity extends C30772sa {

    /* renamed from: F */
    private final C41217g f58199F = C41219i.m119470b(new C21816a(this));

    /* renamed from: G */
    private final AddWithPhonePlugin f58200G = new AddWithPhonePlugin();

    /* renamed from: H */
    private final C41217g f58201H = new C1617p0(C41520a0.m120436b(AddByPhoneViewModel.class), new C21822g(this), new C21821f(this), new C21823h((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity$a */
    static final class C21816a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddWithPhoneActivity f58202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21816a(AddWithPhoneActivity addWithPhoneActivity) {
            super(0);
            this.f58202d = addWithPhoneActivity;
        }

        /* renamed from: b */
        public final C27343k invoke() {
            C27343k a = C27343k.m84680a(this.f58202d.findViewById(C10322k.add_by_phone));
            C41536l.m120488h(a, "bind(findViewById(R.id.add_by_phone))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity$b */
    static final class C21817b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddWithPhoneActivity f58203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21817b(AddWithPhoneActivity addWithPhoneActivity) {
            super(1);
            this.f58203d = addWithPhoneActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f58203d.m70698I2().f69100f;
            C41536l.m120488h(bool, "it");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity$c */
    static final class C21818c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddWithPhoneActivity f58204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21818c(AddWithPhoneActivity addWithPhoneActivity) {
            super(1);
            this.f58204d = addWithPhoneActivity;
        }

        /* renamed from: a */
        public final void mo54401a(String str) {
            this.f58204d.m70698I2().f69105k.setText(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54401a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity$d */
    static final class C21819d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddWithPhoneActivity f58205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21819d(AddWithPhoneActivity addWithPhoneActivity) {
            super(1);
            this.f58205d = addWithPhoneActivity;
        }

        /* renamed from: a */
        public final void mo54402a(String str) {
            this.f58205d.m70698I2().f69103i.setText(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54402a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity$e */
    static final class C21820e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58206a;

        C21820e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58206a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58206a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58206a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity$f */
    public static final class C21821f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58207d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21821f(ComponentActivity componentActivity) {
            super(0);
            this.f58207d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58207d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity$g */
    public static final class C21822g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21822g(ComponentActivity componentActivity) {
            super(0);
            this.f58208d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58208d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhoneActivity$h */
    public static final class C21823h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58209d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58210e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21823h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58209d = aVar;
            this.f58210e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58209d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58210e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final C27343k m70698I2() {
        return (C27343k) this.f58199F.getValue();
    }

    /* renamed from: J2 */
    private final AddByPhoneViewModel m70699J2() {
        return (AddByPhoneViewModel) this.f58201H.getValue();
    }

    /* renamed from: K2 */
    private final void m70700K2() {
        m70699J2().mo54396mw().mo4819k(this, new C21820e(new C21817b(this)));
        m70699J2().mo54392iw().mo4819k(this, new C21820e(new C21818c(this)));
        m70699J2().mo54393jw().mo4819k(this, new C21820e(new C21819d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m70701L2(AddWithPhoneActivity addWithPhoneActivity, View view) {
        C41536l.m120489i(addWithPhoneActivity, "this$0");
        C41536l.m120488h(view, "it");
        addWithPhoneActivity.m70704O2(view, addWithPhoneActivity.m70699J2().mo54394kw("PHONE_WIZARD"));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m70702M2(AddWithPhoneActivity addWithPhoneActivity, View view) {
        C41536l.m120489i(addWithPhoneActivity, "this$0");
        C41536l.m120488h(view, "it");
        addWithPhoneActivity.m70704O2(view, addWithPhoneActivity.m70699J2().mo54394kw("NAME_WIZARD"));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m70703N2(AddWithPhoneActivity addWithPhoneActivity, View view) {
        C41536l.m120489i(addWithPhoneActivity, "this$0");
        addWithPhoneActivity.m70699J2().mo54391fw();
        addWithPhoneActivity.finish();
    }

    /* renamed from: O2 */
    private final void m70704O2(View view, int i) {
        C35893a.m106783a(this).mo88140g(m70699J2().mo54395lw()).mo88141h(i).mo88137d(AdvancedWizardActivity.class).mo88139f(this.f58200G).mo88136c(view).mo88142i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_add_with_phone;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C0209a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo550A(getString(C10328q.money_request_search_header));
        }
        m70700K2();
        m70698I2().f69103i.setOnClickListener(new C27889e(this));
        m70698I2().f69105k.setOnClickListener(new C27890f(this));
        m70698I2().f69100f.setOnClickListener(new C27891g(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001) {
            m70699J2().mo54397ow(intent);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_request_search_header);
        C41536l.m120488h(string, "getString(R.string.money_request_search_header)");
        return string;
    }
}
