package p341ge.bog.mobilebank.transfers.other_transfer_type;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.content.res.C0808h;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b71.C31138d;
import b71.C31141g;
import b71.C31146l;
import g91.C32286a1;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.activity.ContactsActivity;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.shared.P2PFlowType;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34951c;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34966e;
import p366bk.C10318g;
import p366bk.C10328q;
import p380ck.C10464h;
import p891su.C28269e;
import p90.C27285e1;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity */
public final class OtherTransferTypeListActivity extends C34949b {

    /* renamed from: M */
    public static final C34933a f84353M = new C34933a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C31138d f84354G;

    /* renamed from: H */
    private final C41217g f84355H = C41219i.m119470b(new C34937c(this));

    /* renamed from: I */
    private final C41217g f84356I = C41219i.m119470b(new C34938d(this));

    /* renamed from: J */
    private final C41217g f84357J = C41219i.m119470b(new C34942h(this));

    /* renamed from: K */
    private final C41217g f84358K = new C1617p0(C41520a0.m120436b(C34968f.class), new C34944j(this), new C34946l(this), new C34945k((C43064a) null, this));

    /* renamed from: L */
    private final C41217g f84359L = C41219i.m119470b(new C34934b(this));

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$a */
    public static final class C34933a {
        private C34933a() {
        }

        public /* synthetic */ C34933a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo85457a(Context context, OtherTransferTypeState otherTransferTypeState) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(otherTransferTypeState, "otherTransferTypeState");
            Intent intent = new Intent(context, OtherTransferTypeListActivity.class);
            intent.putExtra("OPENED_FROM_CARD_DETAILS", otherTransferTypeState);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$b */
    static final class C34934b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OtherTransferTypeListActivity f84360d;

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$b$a */
        public static final class C34935a implements C34965d {

            /* renamed from: a */
            final /* synthetic */ OtherTransferTypeListActivity f84361a;

            /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$b$a$a */
            public /* synthetic */ class C34936a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f84362a;

                /* renamed from: b */
                public static final /* synthetic */ int[] f84363b;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
                static {
                    /*
                        b71.l[] r0 = b71.C31146l.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        r1 = 1
                        b71.l r2 = b71.C31146l.BOG_ACC_NO     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        r2 = 2
                        b71.l r3 = b71.C31146l.BOG_PHONE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        b71.l r3 = b71.C31146l.BOG_PIN     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r4 = 3
                        r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f84362a = r0
                        b71.g[] r0 = b71.C31141g.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        b71.g r3 = b71.C31141g.EXTERNAL_ACC_NO     // Catch:{ NoSuchFieldError -> 0x0033 }
                        int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                        r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
                    L_0x0033:
                        b71.g r1 = b71.C31141g.EXTERNAL__PHONE     // Catch:{ NoSuchFieldError -> 0x003b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
                    L_0x003b:
                        f84363b = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity.C34934b.C34935a.C34936a.<clinit>():void");
                }
            }

            C34935a(OtherTransferTypeListActivity otherTransferTypeListActivity) {
                this.f84361a = otherTransferTypeListActivity;
            }

            /* renamed from: a */
            public void mo85459a(C31141g gVar) {
                C41536l.m120489i(gVar, "transferExternalListTypeEnum");
                int i = C34936a.f84363b[gVar.ordinal()];
                if (i == 1) {
                    this.f84361a.m102751O2(TransferForm.TRANSFERTYPE.ACCOUNT, true);
                } else if (i == 2) {
                    C36546y.m108282F().mo27152s("transfers", "phone_other", "select_other_transfer_type");
                    C38125h.m112238c(this.f84361a).mo91605g0(this.f84361a, new P2PFlowType.P2PSend(true));
                }
            }

            /* renamed from: b */
            public void mo85460b(C31146l lVar) {
                C41536l.m120489i(lVar, "transferWithinBogListTypeEnum");
                int i = C34936a.f84362a[lVar.ordinal()];
                if (i == 1) {
                    OtherTransferTypeListActivity.m102752P2(this.f84361a, TransferForm.TRANSFERTYPE.ACCOUNT, false, 2, (Object) null);
                } else if (i == 2) {
                    OtherTransferTypeListActivity.m102752P2(this.f84361a, TransferForm.TRANSFERTYPE.PHONE, false, 2, (Object) null);
                } else if (i == 3) {
                    OtherTransferTypeListActivity.m102752P2(this.f84361a, TransferForm.TRANSFERTYPE.PIN, false, 2, (Object) null);
                }
            }

            /* renamed from: c */
            public void mo85461c() {
                ContactsActivity.f59333O.mo55380a(this.f84361a, false);
            }

            /* renamed from: d */
            public void mo85462d(C34966e.C34967a aVar) {
                String str;
                C41536l.m120489i(aVar, "contactItem");
                TransferForm.C34932I contactId = TransferForm.startWith((Activity) this.f84361a, "TRANSFER", TransferForm.OPERATION_VIEW).setContactId(aVar.mo85499c());
                if (aVar.mo85498b() == C28269e.BUDGET) {
                    str = TransferForm.TRANSFER_FORM_BUDGET;
                } else {
                    str = TransferForm.TRANSFER_FORM_OTHER;
                }
                contactId.setTransferForm(str).setSrcAcctKey(this.f84361a.m102747J2().mo84140a()).start();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34934b(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            super(0);
            this.f84360d = otherTransferTypeListActivity;
        }

        /* renamed from: b */
        public final C34951c invoke() {
            return new C34951c(new C34935a(this.f84360d));
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$c */
    static final class C34937c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OtherTransferTypeListActivity f84364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34937c(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            super(0);
            this.f84364d = otherTransferTypeListActivity;
        }

        /* renamed from: b */
        public final C27285e1 invoke() {
            return C27285e1.m84441d(this.f84364d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$d */
    static final class C34938d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OtherTransferTypeListActivity f84365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34938d(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            super(0);
            this.f84365d = otherTransferTypeListActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f84365d.getIntent().getBooleanExtra("IS_REAL_ESTATE", false));
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$e */
    static final class C34939e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OtherTransferTypeListActivity f84366d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34939e(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            super(1);
            this.f84366d = otherTransferTypeListActivity;
        }

        /* renamed from: a */
        public final void mo85465a(List list) {
            C34951c E2 = this.f84366d.m102745H2();
            C41536l.m120488h(list, "it");
            E2.mo85478k(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85465a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$f */
    static final class C34940f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OtherTransferTypeListActivity f84367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34940f(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            super(1);
            this.f84367d = otherTransferTypeListActivity;
        }

        /* renamed from: a */
        public final void mo85466a(List list) {
            ArrayList arrayList = new ArrayList();
            this.f84367d.m102745H2().mo85477j();
            C41536l.m120488h(list, "it");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C34966e eVar = (C34966e) it.next();
                if (eVar instanceof C34966e.C34967a) {
                    arrayList.add(new C34951c.C34952a.C34954b((C34966e.C34967a) eVar));
                }
            }
            this.f84367d.m102745H2().mo85474g(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85466a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$g */
    static final class C34941g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OtherTransferTypeListActivity f84368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34941g(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            super(1);
            this.f84368d = otherTransferTypeListActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f84368d.m102745H2().mo85474g(C41341q.m119913p(C34951c.C34952a.C34955c.f84384a, C34951c.C34952a.C34953a.f84380a));
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$h */
    static final class C34942h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OtherTransferTypeListActivity f84369d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34942h(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            super(0);
            this.f84369d = otherTransferTypeListActivity;
        }

        /* renamed from: b */
        public final OtherTransferTypeState invoke() {
            OtherTransferTypeState otherTransferTypeState = (OtherTransferTypeState) this.f84369d.getIntent().getParcelableExtra("OPENED_FROM_CARD_DETAILS");
            return otherTransferTypeState == null ? new OtherTransferTypeState(0, false, false, 7, (DefaultConstructorMarker) null) : otherTransferTypeState;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$i */
    static final class C34943i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84370a;

        C34943i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84370a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84370a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84370a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$j */
    public static final class C34944j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f84371d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34944j(ComponentActivity componentActivity) {
            super(0);
            this.f84371d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f84371d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$k */
    public static final class C34945k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84372d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f84373e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34945k(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f84372d = aVar;
            this.f84373e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84372d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f84373e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$l */
    static final class C34946l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OtherTransferTypeListActivity f84374d;

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity$l$a */
        static final class C34947a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ OtherTransferTypeListActivity f84375d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34947a(OtherTransferTypeListActivity otherTransferTypeListActivity) {
                super(0);
                this.f84375d = otherTransferTypeListActivity;
            }

            /* renamed from: b */
            public final C34968f invoke() {
                return this.f84375d.mo85456L2().mo32555a(this.f84375d.m102747J2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34946l(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            super(0);
            this.f84374d = otherTransferTypeListActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C34947a(this.f84374d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final C34951c m102745H2() {
        return (C34951c) this.f84359L.getValue();
    }

    /* renamed from: I2 */
    private final C27285e1 m102746I2() {
        return (C27285e1) this.f84355H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final OtherTransferTypeState m102747J2() {
        return (OtherTransferTypeState) this.f84357J.getValue();
    }

    /* renamed from: K2 */
    private final C34968f m102748K2() {
        return (C34968f) this.f84358K.getValue();
    }

    /* renamed from: M2 */
    private final boolean m102749M2() {
        return ((Boolean) this.f84356I.getValue()).booleanValue();
    }

    /* renamed from: N2 */
    private final void m102750N2() {
        m102748K2().mo85506kw().mo4819k(this, new C34943i(new C34939e(this)));
        m102748K2().mo85504hw().mo4819k(this, new C34943i(new C34940f(this)));
        m102748K2().mo85505iw().mo4819k(this, new C34943i(new C34941g(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final void m102751O2(TransferForm.TRANSFERTYPE transfertype, boolean z) {
        String str;
        if (transfertype == TransferForm.TRANSFERTYPE.ACCOUNT) {
            if (z) {
                str = "iban_other";
            } else {
                str = "iban";
            }
        } else if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
            str = "pin";
        } else {
            str = "phone";
        }
        C36546y.m108282F().mo27137H("transfers", "select_other_transfer_type", str, (Bundle) null, C10464h.C10465a.FIREBASE);
        TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OTHER).setWithinBank(true).setTransfertype(transfertype).setSrcAcctKey(m102747J2().mo84140a()).setIsRealEstate(m102749M2()).start();
    }

    /* renamed from: P2 */
    static /* synthetic */ void m102752P2(OtherTransferTypeListActivity otherTransferTypeListActivity, TransferForm.TRANSFERTYPE transfertype, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        otherTransferTypeListActivity.m102751O2(transfertype, z);
    }

    /* renamed from: L2 */
    public final C31138d mo85456L2() {
        C31138d dVar = this.f84354G;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m102746I2().mo3946b());
        super.mo37451O1(bundle);
        C36546y.m108282F().mo27152s("transfers", "other_transfer", "select_transfer_type");
        m102746I2().f68583f.setAdapter(m102745H2());
        m102746I2().f68582e.f68494e.setBackgroundColor(C0808h.m3029d(getResources(), C10318g.f28625J0, (Resources.Theme) null));
        m102750N2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.payments_and_transfers_category_transfer_someone_else_account);
        C41536l.m120488h(string, "getString(R.string.payme…fer_someone_else_account)");
        return string;
    }
}
