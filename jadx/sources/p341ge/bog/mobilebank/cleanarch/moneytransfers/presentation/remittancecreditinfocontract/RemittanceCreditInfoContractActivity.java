package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferSuccessActivity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p366bk.C10322k;
import p366bk.C10328q;
import p777gz.C24840c;
import p836mz.C26326l;
import p836mz.C26332r;
import p90.C27453w1;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity */
public final class RemittanceCreditInfoContractActivity extends C21260c {

    /* renamed from: K */
    public static final C21231a f57015K = new C21231a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C27453w1 f57016G;

    /* renamed from: H */
    private final C41217g f57017H = C41219i.m119470b(new C21239h(this));

    /* renamed from: I */
    public C26326l f57018I;

    /* renamed from: J */
    private final C41217g f57019J = new C1617p0(C41520a0.m120436b(C26332r.class), new C21235e(this), new C21237g(this), new C21236f((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$a */
    public static final class C21231a {
        private C21231a() {
        }

        public /* synthetic */ C21231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53223a(Context context, MoneyTransferTypeUiModel moneyTransferTypeUiModel, MoneyTransferWizardData moneyTransferWizardData, RemittanceCreditInfoContract remittanceCreditInfoContract, C0173b bVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(moneyTransferTypeUiModel, "transferModel");
            C41536l.m120489i(moneyTransferWizardData, "wizardData");
            C41536l.m120489i(remittanceCreditInfoContract, "remittanceCreditInfoContract");
            C41536l.m120489i(bVar, "launcher");
            Intent intent = new Intent(context, RemittanceCreditInfoContractActivity.class);
            intent.putExtra("MONEY_TRANSFER_TYPE", moneyTransferTypeUiModel);
            intent.putExtra("WIZARD_DATA_KEY", moneyTransferWizardData);
            intent.putExtra("CREDIT_INFO_CONTACT_KEY", remittanceCreditInfoContract);
            bVar.mo404a(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$b */
    static final class C21232b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RemittanceCreditInfoContractActivity f57020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21232b(RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity) {
            super(1);
            this.f57020d = remittanceCreditInfoContractActivity;
        }

        /* renamed from: a */
        public final void mo53224a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f57020d.m68801L2(C21250b.f57045j.mo53238a(), true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53224a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$c */
    static final class C21233c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ RemittanceCreditInfoContractActivity f57021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21233c(RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity) {
            super(1);
            this.f57021d = remittanceCreditInfoContractActivity;
        }

        /* renamed from: a */
        public final void mo53225a(C21503d dVar) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String b;
            Double h;
            String Q;
            C27453w1 w1Var;
            C27453w1 w1Var2;
            C21503d dVar2 = dVar;
            if (dVar2 instanceof C21503d.C21504a) {
                C27453w1 E2 = this.f57021d.f57016G;
                if (E2 == null) {
                    C41536l.m120506z("binding");
                    w1Var2 = null;
                } else {
                    w1Var2 = E2;
                }
                w1Var2.f70154f.setVisibility(8);
                this.f57021d.mo74709H1(((C21503d.C21504a) dVar2).mo53706f());
            } else if (dVar2 instanceof C21503d.C21505b) {
                C27453w1 E22 = this.f57021d.f57016G;
                if (E22 == null) {
                    C41536l.m120506z("binding");
                    w1Var = null;
                } else {
                    w1Var = E22;
                }
                w1Var.f70154f.setVisibility(0);
            } else if (dVar2 instanceof C21503d.C21506c) {
                C27453w1 E23 = this.f57021d.f57016G;
                if (E23 == null) {
                    C41536l.m120506z("binding");
                    E23 = null;
                }
                E23.f70154f.setVisibility(8);
                MoneyTransferSuccessActivity.C21207a aVar = MoneyTransferSuccessActivity.f56942H;
                RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity = this.f57021d;
                String d = remittanceCreditInfoContractActivity.m68799I2().mo65507nw().mo53145d();
                String v = this.f57021d.m68800K2().mo53183v();
                String t = this.f57021d.m68800K2().mo53180t();
                AccountLov k = this.f57021d.m68800K2().mo53173k();
                if (k != null) {
                    str = k.getAcctNo();
                } else {
                    str = null;
                }
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                C24840c cVar = (C24840c) dVar.mo53701a();
                if (cVar == null || (b = cVar.mo63263b()) == null || (h = C40437u.m117096h(b)) == null || (Q = C32343x.m95410Q(h.doubleValue(), this.f57021d.m68800K2().mo53171i(), false, 2, (Object) null)) == null) {
                    str3 = "";
                } else {
                    str3 = Q;
                }
                String q = this.f57021d.m68800K2().mo53177q();
                C24840c cVar2 = (C24840c) dVar.mo53701a();
                if (cVar2 != null) {
                    str4 = cVar2.mo63264c();
                } else {
                    str4 = null;
                }
                if (str4 != null) {
                    String i = this.f57021d.m68800K2().mo53171i();
                    String c = ((C24840c) dVar.mo53701a()).mo63264c();
                    AccountLov k2 = this.f57021d.m68800K2().mo53173k();
                    if (k2 != null) {
                        str9 = k2.getCcy();
                    } else {
                        str9 = null;
                    }
                    str5 = "1 " + i + " = " + c + " " + str9;
                } else {
                    str5 = null;
                }
                C24840c cVar3 = (C24840c) dVar.mo53701a();
                if (cVar3 != null) {
                    str6 = cVar3.mo63262a();
                } else {
                    str6 = null;
                }
                if (str6 != null) {
                    Double h2 = C40437u.m117096h(((C24840c) dVar.mo53701a()).mo63262a());
                    AccountLov k3 = this.f57021d.m68800K2().mo53173k();
                    if (k3 != null) {
                        str8 = k3.getCcy();
                    } else {
                        str8 = null;
                    }
                    str7 = h2 + " " + str8;
                } else {
                    str7 = null;
                }
                aVar.mo53111a(remittanceCreditInfoContractActivity, new MoneyTransferSuccessActivity.C21208b(d, v, t, str2, str3, q, str5, str7));
                this.f57021d.setResult(-1);
                this.f57021d.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53225a((C21503d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$d */
    static final class C21234d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57022a;

        C21234d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57022a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57022a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57022a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$e */
    public static final class C21235e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57023d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21235e(ComponentActivity componentActivity) {
            super(0);
            this.f57023d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57023d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$f */
    public static final class C21236f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57024d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57025e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21236f(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57024d = aVar;
            this.f57025e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57024d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57025e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$g */
    static final class C21237g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RemittanceCreditInfoContractActivity f57026d;

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$g$a */
        static final class C21238a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ RemittanceCreditInfoContractActivity f57027d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21238a(RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity) {
                super(0);
                this.f57027d = remittanceCreditInfoContractActivity;
            }

            /* renamed from: b */
            public final C26332r invoke() {
                C26326l J2 = this.f57027d.mo53222J2();
                Parcelable parcelableExtra = this.f57027d.getIntent().getParcelableExtra("MONEY_TRANSFER_TYPE");
                C41536l.m120486f(parcelableExtra);
                MoneyTransferWizardData G2 = this.f57027d.m68800K2();
                Parcelable parcelableExtra2 = this.f57027d.getIntent().getParcelableExtra("CREDIT_INFO_CONTACT_KEY");
                C41536l.m120486f(parcelableExtra2);
                return J2.mo32532a((MoneyTransferTypeUiModel) parcelableExtra, G2, (RemittanceCreditInfoContract) parcelableExtra2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21237g(RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity) {
            super(0);
            this.f57026d = remittanceCreditInfoContractActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C21238a(this.f57026d));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity$h */
    static final class C21239h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ RemittanceCreditInfoContractActivity f57028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21239h(RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity) {
            super(0);
            this.f57028d = remittanceCreditInfoContractActivity;
        }

        /* renamed from: b */
        public final MoneyTransferWizardData invoke() {
            Parcelable parcelableExtra = this.f57028d.getIntent().getParcelableExtra("WIZARD_DATA_KEY");
            C41536l.m120486f(parcelableExtra);
            return (MoneyTransferWizardData) parcelableExtra;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final C26332r m68799I2() {
        return (C26332r) this.f57019J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final MoneyTransferWizardData m68800K2() {
        return (MoneyTransferWizardData) this.f57017H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m68801L2(Fragment fragment, boolean z) {
        C1493e0 p = getSupportFragmentManager().mo4428p();
        C41536l.m120488h(p, "supportFragmentManager.beginTransaction()");
        p.mo4639r(C10322k.f28769Me, fragment);
        if (z) {
            p.mo4636g((String) null);
        }
        p.mo4515i();
    }

    /* renamed from: M2 */
    static /* synthetic */ void m68802M2(RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity, Fragment fragment, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        remittanceCreditInfoContractActivity.m68801L2(fragment, z);
    }

    /* renamed from: N2 */
    private final void m68803N2() {
        C37224b.m109963b(m68799I2().mo65505lw().mo65500N3(), this, new C21232b(this));
        m68799I2().mo65505lw().mo65498I5().mo4819k(this, new C21234d(new C21233c(this)));
    }

    /* renamed from: J2 */
    public final C26326l mo53222J2() {
        C26326l lVar = this.f57018I;
        if (lVar != null) {
            return lVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27453w1 d = C27453w1.m85119d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f57016G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m68803N2();
        m68802M2(this, C21240a.f57029j.mo53230a(), false, 2, (Object) null);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_transfer_provider_list_header_text);
        C41536l.m120488h(string, "getString(R.string.money…rovider_list_header_text)");
        return string;
    }
}
