package p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts;

import a81.C30772sa;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import bv0.C31206f;
import ev0.C31817b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import jv0.C36792a;
import jv0.C36793b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.C33330c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsActivity */
public final class OpenBankAccountsActivity extends C30772sa {

    /* renamed from: H */
    public static final C33308a f81421H = new C33308a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C31817b f81422F;

    /* renamed from: G */
    private final C41217g f81423G = new C1617p0(C41520a0.m120436b(OpenBankAccountsViewModel$ViewModel.class), new C33312e(this), new C33311d(this), new C33313f((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsActivity$a */
    public static final class C33308a {
        private C33308a() {
        }

        public /* synthetic */ C33308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsActivity$b */
    static final class C33309b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBankAccountsActivity f81424d;

        /* renamed from: e */
        final /* synthetic */ C33322a f81425e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33309b(OpenBankAccountsActivity openBankAccountsActivity, C33322a aVar) {
            super(1);
            this.f81424d = openBankAccountsActivity;
            this.f81425e = aVar;
        }

        /* renamed from: a */
        public final void mo79118a(C33330c cVar) {
            C31817b bVar = null;
            if (C41536l.m120484d(cVar, C33330c.C33331a.f81456a)) {
                C31817b G2 = this.f81424d.f81422F;
                if (G2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    bVar = G2;
                }
                bVar.f78454k.mo53596d();
            } else if (cVar instanceof C33330c.C33332b) {
                C31817b G22 = this.f81424d.f81422F;
                if (G22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    bVar = G22;
                }
                bVar.f78454k.mo53595c();
                this.f81425e.mo6029i(((C33330c.C33332b) cVar).mo79145a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79118a((C33330c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsActivity$c */
    static final class C33310c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81426a;

        C33310c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81426a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81426a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81426a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsActivity$d */
    public static final class C33311d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33311d(ComponentActivity componentActivity) {
            super(0);
            this.f81427d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f81427d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsActivity$e */
    public static final class C33312e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33312e(ComponentActivity componentActivity) {
            super(0);
            this.f81428d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f81428d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsActivity$f */
    public static final class C33313f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81429d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f81430e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33313f(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f81429d = aVar;
            this.f81430e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81429d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f81430e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: H2 */
    private final OpenBankAccountsViewModel$ViewModel m97971H2() {
        return (OpenBankAccountsViewModel$ViewModel) this.f81423G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m97972I2(OpenBankAccountsActivity openBankAccountsActivity, View view) {
        C41536l.m120489i(openBankAccountsActivity, "this$0");
        openBankAccountsActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m97973J2(OpenBankAccountsActivity openBankAccountsActivity, View view) {
        C41536l.m120489i(openBankAccountsActivity, "this$0");
        openBankAccountsActivity.m97971H2().onRefresh(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C31817b d = C31817b.m94053d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f81422F = d;
        C31817b bVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        C31817b bVar2 = this.f81422F;
        if (bVar2 == null) {
            C41536l.m120506z("binding");
            bVar2 = null;
        }
        bVar2.f78450g.setText(C32343x.m95388F("open.bank.list.error.desc", new Object[0]));
        C33322a aVar = new C33322a();
        C31817b bVar3 = this.f81422F;
        if (bVar3 == null) {
            C41536l.m120506z("binding");
            bVar3 = null;
        }
        bVar3.f78452i.setAdapter(aVar);
        C31817b bVar4 = this.f81422F;
        if (bVar4 == null) {
            C41536l.m120506z("binding");
            bVar4 = null;
        }
        bVar4.f78451h.setOnClickListener(new C36792a(this));
        C31817b bVar5 = this.f81422F;
        if (bVar5 == null) {
            C41536l.m120506z("binding");
        } else {
            bVar = bVar5;
        }
        bVar.f78453j.setOnClickListener(new C36793b(this));
        Parcelable parcelableExtra = getIntent().getParcelableExtra("BANK_ARG");
        C41536l.m120486f(parcelableExtra);
        String stringExtra = getIntent().getStringExtra("CONSENT_ID_ARG");
        C41536l.m120486f(stringExtra);
        m97971H2().mo79123qw().mo79122hj(new C41224m((BankUiModel) parcelableExtra, stringExtra));
        m97971H2().mo79124rw().mo79121g().mo4819k(this, new C33310c(new C33309b(this, aVar)));
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C31206f.f77548g);
        C41536l.m120488h(string, "getString(R.string.header_text_accounts)");
        return string;
    }
}
