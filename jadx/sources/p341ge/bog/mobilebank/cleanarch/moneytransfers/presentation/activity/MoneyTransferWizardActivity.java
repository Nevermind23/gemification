package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import c91.C31302e;
import c91.C31303f;
import g91.C32290b1;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10328q;
import p380ck.C10463g;
import p866pz.C27643b;
import p866pz.C27647c;
import p866pz.C27655d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity */
public final class MoneyTransferWizardActivity extends C35862c implements C27655d {

    /* renamed from: s0 */
    public static final C21209a f56953s0 = new C21209a((DefaultConstructorMarker) null);

    /* renamed from: k0 */
    private final C41217g f56954k0 = new C1617p0(C41520a0.m120436b(MoneyTransferWizardViewModel.class), new C21217i(this), new C21216h(this), new C21218j((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C31303f f56955l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public C31302e f56956m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C31302e f56957n0;

    /* renamed from: o0 */
    private C27643b f56958o0;

    /* renamed from: p0 */
    private C27647c f56959p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public MoneyTransferTypeUiModel f56960q0;

    /* renamed from: r0 */
    private boolean f56961r0;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$a */
    public static final class C21209a {
        private C21209a() {
        }

        public /* synthetic */ C21209a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53123a(Activity activity, MoneyTransferWizardData moneyTransferWizardData, MoneyTransferTypeUiModel moneyTransferTypeUiModel, int i, View view) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(moneyTransferTypeUiModel, "transferType");
            C41536l.m120489i(view, "clickedView");
            Intent intent = new Intent(activity, MoneyTransferWizardActivity.class);
            intent.putExtra("WIZARD_PAGE_INDEX", i);
            intent.putExtra("WIZARD_INPUT_Y_POSITION", C32290b1.m95119i(view).top);
            intent.putExtra("UMTS_TRANSFER_DATA_KEY", moneyTransferWizardData);
            intent.putExtra("UMTS_TRANSFER_TYPE_KEY", moneyTransferTypeUiModel);
            activity.startActivityForResult(intent, 10001);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$b */
    static final class C21210b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardActivity f56962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21210b(MoneyTransferWizardActivity moneyTransferWizardActivity) {
            super(1);
            this.f56962d = moneyTransferWizardActivity;
        }

        /* renamed from: a */
        public final void mo53124a(MoneyTransferWizardData moneyTransferWizardData) {
            boolean z;
            if (moneyTransferWizardData != null) {
                MoneyTransferWizardActivity moneyTransferWizardActivity = this.f56962d;
                C31303f D3 = moneyTransferWizardActivity.f56955l0;
                MoneyTransferTypeUiModel moneyTransferTypeUiModel = null;
                if (D3 == null) {
                    C41536l.m120506z("transferNumberInputPage");
                    D3 = null;
                }
                D3.mo71717U1(moneyTransferWizardData.mo53183v());
                MoneyTransferTypeUiModel E3 = moneyTransferWizardActivity.f56960q0;
                if (E3 == null) {
                    C41536l.m120506z("transferType");
                    E3 = null;
                }
                List a = E3.mo53143a();
                if (a == null || a.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C31302e C3 = moneyTransferWizardActivity.f56956m0;
                    if (C3 != null) {
                        C3.mo71717U1(String.valueOf(moneyTransferWizardData.mo53179s()));
                        C31302e C32 = moneyTransferWizardActivity.f56956m0;
                        if (C32 != null) {
                            C32.mo71722Z1(moneyTransferWizardData.mo53182u());
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                MoneyTransferTypeUiModel E32 = moneyTransferWizardActivity.f56960q0;
                if (E32 == null) {
                    C41536l.m120506z("transferType");
                } else {
                    moneyTransferTypeUiModel = E32;
                }
                if (moneyTransferTypeUiModel.mo53147e()) {
                    C31302e B3 = moneyTransferWizardActivity.f56957n0;
                    if (B3 != null) {
                        B3.mo71717U1(String.valueOf(moneyTransferWizardData.mo53176p()));
                        C31302e B32 = moneyTransferWizardActivity.f56957n0;
                        if (B32 != null) {
                            List<MoneyTransferWizardData.Country> g = moneyTransferWizardData.mo53168g();
                            ArrayList arrayList = new ArrayList(C41343r.m119925u(g, 10));
                            for (MoneyTransferWizardData.Country a2 : g) {
                                arrayList.add(a2.mo53188a());
                            }
                            B32.mo71722Z1(arrayList);
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
            }
            this.f56962d.m68719P3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53124a((MoneyTransferWizardData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$c */
    static final class C21211c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardActivity f56963d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21211c(MoneyTransferWizardActivity moneyTransferWizardActivity) {
            super(1);
            this.f56963d = moneyTransferWizardActivity;
        }

        /* renamed from: a */
        public final void mo53125a(C37223a aVar) {
            if (aVar != null && ((C41238w) aVar.mo90296a()) != null) {
                MoneyTransferWizardActivity.super.mo53122i3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53125a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$d */
    static final class C21212d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardActivity f56964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21212d(MoneyTransferWizardActivity moneyTransferWizardActivity) {
            super(1);
            this.f56964d = moneyTransferWizardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            if (bool != null) {
                MoneyTransferWizardActivity moneyTransferWizardActivity = this.f56964d;
                if (bool.booleanValue()) {
                    moneyTransferWizardActivity.mo87971y3();
                } else {
                    moneyTransferWizardActivity.mo87958V2();
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$e */
    static final class C21213e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardActivity f56965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21213e(MoneyTransferWizardActivity moneyTransferWizardActivity) {
            super(1);
            this.f56965d = moneyTransferWizardActivity;
        }

        /* renamed from: a */
        public final void mo53127a(C37223a aVar) {
            C21503d.C21504a aVar2;
            if (aVar != null && (aVar2 = (C21503d.C21504a) aVar.mo90296a()) != null) {
                this.f56965d.mo52674G1(aVar2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53127a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$f */
    static final class C21214f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardActivity f56966d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21214f(MoneyTransferWizardActivity moneyTransferWizardActivity) {
            super(1);
            this.f56966d = moneyTransferWizardActivity;
        }

        /* renamed from: a */
        public final void mo53128a(MoneyTransferTypeUiModel moneyTransferTypeUiModel) {
            MoneyTransferWizardActivity moneyTransferWizardActivity = this.f56966d;
            C41536l.m120488h(moneyTransferTypeUiModel, "it");
            moneyTransferWizardActivity.f56960q0 = moneyTransferTypeUiModel;
            C31303f D3 = this.f56966d.f56955l0;
            C31303f fVar = null;
            if (D3 == null) {
                C41536l.m120506z("transferNumberInputPage");
                D3 = null;
            }
            D3.mo71707D1().setIconUrl(moneyTransferTypeUiModel.mo53144b());
            C31303f D32 = this.f56966d.f56955l0;
            if (D32 == null) {
                C41536l.m120506z("transferNumberInputPage");
            } else {
                fVar = D32;
            }
            fVar.mo71553i2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53128a((MoneyTransferTypeUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$g */
    static final class C21215g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f56967a;

        C21215g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f56967a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f56967a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f56967a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$h */
    public static final class C21216h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21216h(ComponentActivity componentActivity) {
            super(0);
            this.f56968d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f56968d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$i */
    public static final class C21217i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21217i(ComponentActivity componentActivity) {
            super(0);
            this.f56969d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f56969d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity$j */
    public static final class C21218j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56970d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f56971e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21218j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f56970d = aVar;
            this.f56971e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56970d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f56971e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: I3 */
    private final void m68712I3(String str, List list) {
        boolean z;
        C31303f L3 = m68715L3(C10328q.money_transfer_enter_transfer_code, BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS, str);
        L3.mo71717U1("");
        L3.mo71720X1("TRANSFER_NUMBER_PAGE_ID");
        this.f56955l0 = L3;
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f56960q0;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        List a = moneyTransferTypeUiModel.mo53143a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C31302e J3 = m68713J3(C10328q.money_transfer_select_currency, list);
            J3.mo71720X1("CURRENCY_PAGE_ID");
            this.f56956m0 = J3;
        }
        C27643b bVar = new C27643b();
        bVar.mo71721Y1(getString(C10328q.money_transfer_select_account));
        bVar.mo71720X1("ACCOUNTS_PAGE_ID");
        this.f56958o0 = bVar;
        C27647c cVar = new C27647c();
        cVar.mo71721Y1(getString(C10328q.transfer_details_conversion));
        cVar.mo71720X1("CONVERSION_PAGE_ID");
        this.f56959p0 = cVar;
        this.f56957n0 = m68714K3(this, C10328q.money_transfer_select_sender_country, (List) null, 2, (Object) null);
    }

    /* renamed from: J3 */
    private final C31302e m68713J3(int i, List list) {
        C31302e eVar = new C31302e();
        WizardObject wizardObject = new WizardObject();
        wizardObject.setInputTitle(getString(i));
        wizardObject.setInputStyle(0);
        if (list != null) {
            eVar.mo71717U1("-1");
            eVar.mo71722Z1(list);
        }
        eVar.mo71709L1(wizardObject);
        return eVar;
    }

    /* renamed from: K3 */
    static /* synthetic */ C31302e m68714K3(MoneyTransferWizardActivity moneyTransferWizardActivity, int i, List list, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list = null;
        }
        return moneyTransferWizardActivity.m68713J3(i, list);
    }

    /* renamed from: L3 */
    private final C31303f m68715L3(int i, int i2, String str) {
        C31303f fVar = new C31303f();
        WizardObject wizardObject = new WizardObject();
        wizardObject.setInputTitle(getString(i));
        wizardObject.setInputStyle(1);
        wizardObject.setInputType(i2);
        wizardObject.setIconUrl(str);
        fVar.mo71709L1(wizardObject);
        return fVar;
    }

    /* renamed from: M3 */
    private final MoneyTransferWizardViewModel m68716M3() {
        return (MoneyTransferWizardViewModel) this.f56954k0.getValue();
    }

    /* renamed from: N3 */
    private final void m68717N3(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C10463g F = C36546y.m108282F();
            MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f56960q0;
            if (moneyTransferTypeUiModel == null) {
                C41536l.m120506z("transferType");
                moneyTransferTypeUiModel = null;
            }
            F.mo27152s("remittance", moneyTransferTypeUiModel.mo53145d(), str);
        }
    }

    /* renamed from: O3 */
    private final void m68718O3() {
        MoneyTransferWizardViewModel M3 = m68716M3();
        M3.mo53074Ew().mo4819k(this, new C21215g(new C21210b(this)));
        M3.mo53075Fw().mo4819k(this, new C21215g(new C21211c(this)));
        M3.mo53076Gw().mo4819k(this, new C21215g(new C21212d(this)));
        M3.mo53073Dw().mo4819k(this, new C21215g(new C21213e(this)));
        M3.mo53078Iw().mo4819k(this, new C21215g(new C21214f(this)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ed  */
    /* renamed from: P3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m68719P3() {
        /*
            r8 = this;
            boolean r0 = r8.f56961r0
            java.lang.String r1 = "transferConversionWizardFragment"
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00a1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            c91.f r5 = r8.f56955l0
            if (r5 != 0) goto L_0x0018
            java.lang.String r5 = "transferNumberInputPage"
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r5 = r3
        L_0x0018:
            r0.add(r5)
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel r5 = r8.f56960q0
            java.lang.String r6 = "transferType"
            if (r5 != 0) goto L_0x0025
            kotlin.jvm.internal.C41536l.m120506z(r6)
            r5 = r3
        L_0x0025:
            java.util.List r5 = r5.mo53143a()
            if (r5 == 0) goto L_0x0034
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r5 = r2
            goto L_0x0035
        L_0x0034:
            r5 = r4
        L_0x0035:
            r5 = r5 ^ r4
            java.lang.String r7 = "Required value was null."
            if (r5 == 0) goto L_0x004c
            c91.e r5 = r8.f56956m0
            if (r5 == 0) goto L_0x0042
            r0.add(r5)
            goto L_0x004c
        L_0x0042:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x004c:
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel r5 = r8.f56960q0
            if (r5 != 0) goto L_0x0054
            kotlin.jvm.internal.C41536l.m120506z(r6)
            r5 = r3
        L_0x0054:
            boolean r5 = r5.mo53147e()
            if (r5 == 0) goto L_0x006c
            c91.e r5 = r8.f56957n0
            if (r5 == 0) goto L_0x0062
            r0.add(r5)
            goto L_0x006c
        L_0x0062:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x006c:
            pz.c r5 = r8.f56959p0
            if (r5 != 0) goto L_0x0074
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r5 = r3
        L_0x0074:
            r0.add(r5)
            pz.b r1 = r8.f56958o0
            if (r1 != 0) goto L_0x0081
            java.lang.String r1 = "accountSelectorPage"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            goto L_0x0082
        L_0x0081:
            r3 = r1
        L_0x0082:
            r0.add(r3)
            int r1 = r8.f86775c0
            java.lang.Object r1 = r0.get(r1)
            c91.y r1 = (c91.C31355y) r1
            android.os.Bundle r1 = r1.mo71733r1()
            java.lang.String r3 = "WIZARD_FIELD_SHOULD_ANIMATE"
            r1.putBoolean(r3, r4)
            r8.mo87967s3(r0, r4)
            int r0 = r8.f86775c0
            r8.mo87963n3(r0, r2)
            r8.f56961r0 = r4
            goto L_0x00fc
        L_0x00a1:
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel r0 = r8.m68716M3()
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r0 = r0.mo53079Jw()
            if (r0 == 0) goto L_0x00ee
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel r0 = r0.mo53169h()
            if (r0 == 0) goto L_0x00ee
            java.util.List r0 = r0.mo53132b()
            if (r0 == 0) goto L_0x00ee
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x00bf
        L_0x00bd:
            r0 = r2
            goto L_0x00eb
        L_0x00bf:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c3:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00bd
            java.lang.Object r5 = r0.next()
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem r5 = (p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem) r5
            java.lang.String r5 = r5.mo53201a()
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel r6 = r8.m68716M3()
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r6 = r6.mo53079Jw()
            if (r6 == 0) goto L_0x00e2
            java.lang.String r6 = r6.mo53171i()
            goto L_0x00e3
        L_0x00e2:
            r6 = r3
        L_0x00e3:
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00c3
            r0 = r4
        L_0x00eb:
            if (r0 != r4) goto L_0x00ee
            r2 = r4
        L_0x00ee:
            if (r2 == 0) goto L_0x00fc
            pz.c r0 = r8.f56959p0
            if (r0 != 0) goto L_0x00f8
            kotlin.jvm.internal.C41536l.m120506z(r1)
            goto L_0x00f9
        L_0x00f8:
            r3 = r0
        L_0x00f9:
            r3.mo71718V1(r4)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity.m68719P3():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("UMTS_TRANSFER_TYPE_KEY");
        C41536l.m120486f(parcelableExtra);
        this.f56960q0 = (MoneyTransferTypeUiModel) parcelableExtra;
        MoneyTransferWizardData moneyTransferWizardData = (MoneyTransferWizardData) getIntent().getParcelableExtra("UMTS_TRANSFER_DATA_KEY");
        MoneyTransferWizardViewModel M3 = m68716M3();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f56960q0;
        MoneyTransferTypeUiModel moneyTransferTypeUiModel2 = null;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        String d = moneyTransferTypeUiModel.mo53145d();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel3 = this.f56960q0;
        if (moneyTransferTypeUiModel3 == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel3 = null;
        }
        M3.mo53080Kw(moneyTransferWizardData, d, moneyTransferTypeUiModel3.mo53143a());
        MoneyTransferTypeUiModel moneyTransferTypeUiModel4 = this.f56960q0;
        if (moneyTransferTypeUiModel4 == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel4 = null;
        }
        String b = moneyTransferTypeUiModel4.mo53144b();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel5 = this.f56960q0;
        if (moneyTransferTypeUiModel5 == null) {
            C41536l.m120506z("transferType");
        } else {
            moneyTransferTypeUiModel2 = moneyTransferTypeUiModel5;
        }
        m68712I3(b, moneyTransferTypeUiModel2.mo53143a());
        m68718O3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0021 A[SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53120Y(p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem r10) {
        /*
            r9 = this;
            java.lang.String r0 = "currencyItem"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel r0 = r9.m68716M3()
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r0 = r0.mo53079Jw()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0068
            java.util.List r0 = r0.mo53161a()
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0069
            java.lang.Object r5 = r0.next()
            r6 = r5
            ge.bog.mobilebank.model.account.AccountLov r6 = (p341ge.bog.mobilebank.model.account.AccountLov) r6
            java.util.ArrayList r6 = r6.getSubAccounts()
            java.lang.String r7 = "aacLov.subAccounts"
            kotlin.jvm.internal.C41536l.m120488h(r6, r7)
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0043
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0043
        L_0x0041:
            r6 = r3
            goto L_0x0062
        L_0x0043:
            java.util.Iterator r6 = r6.iterator()
        L_0x0047:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0041
            java.lang.Object r7 = r6.next()
            ge.bog.mobilebank.model.account.AccountLov r7 = (p341ge.bog.mobilebank.model.account.AccountLov) r7
            java.lang.String r7 = r7.getCcy()
            java.lang.String r8 = r10.mo53201a()
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)
            if (r7 == 0) goto L_0x0047
            r6 = r1
        L_0x0062:
            if (r6 == 0) goto L_0x0021
            r4.add(r5)
            goto L_0x0021
        L_0x0068:
            r4 = r2
        L_0x0069:
            if (r4 == 0) goto L_0x0073
            int r0 = r4.size()
            if (r0 != r1) goto L_0x0073
            r0 = r1
            goto L_0x0074
        L_0x0073:
            r0 = r3
        L_0x0074:
            java.lang.String r5 = "accountSelectorPage"
            if (r0 == 0) goto L_0x00c5
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel r0 = r9.m68716M3()
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r0 = r0.mo53079Jw()
            if (r0 != 0) goto L_0x0083
            goto L_0x00b8
        L_0x0083:
            java.lang.Object r3 = r4.get(r3)
            ge.bog.mobilebank.model.account.AccountLov r3 = (p341ge.bog.mobilebank.model.account.AccountLov) r3
            java.util.ArrayList r3 = r3.getSubAccounts()
            java.lang.String r4 = "accounts[0].subAccounts"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x0096:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00b2
            java.lang.Object r4 = r3.next()
            r6 = r4
            ge.bog.mobilebank.model.account.AccountLov r6 = (p341ge.bog.mobilebank.model.account.AccountLov) r6
            java.lang.String r6 = r6.getCcy()
            java.lang.String r7 = r10.mo53201a()
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
            if (r6 == 0) goto L_0x0096
            goto L_0x00b3
        L_0x00b2:
            r4 = r2
        L_0x00b3:
            ge.bog.mobilebank.model.account.AccountLov r4 = (p341ge.bog.mobilebank.model.account.AccountLov) r4
            r0.mo53158B(r4)
        L_0x00b8:
            pz.b r10 = r9.f56958o0
            if (r10 != 0) goto L_0x00c0
            kotlin.jvm.internal.C41536l.m120506z(r5)
            goto L_0x00c1
        L_0x00c0:
            r2 = r10
        L_0x00c1:
            r2.mo71718V1(r1)
            goto L_0x00df
        L_0x00c5:
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel r10 = r9.m68716M3()
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r10 = r10.mo53079Jw()
            if (r10 != 0) goto L_0x00d0
            goto L_0x00d3
        L_0x00d0:
            r10.mo53158B(r2)
        L_0x00d3:
            pz.b r10 = r9.f56958o0
            if (r10 != 0) goto L_0x00db
            kotlin.jvm.internal.C41536l.m120506z(r5)
            goto L_0x00dc
        L_0x00db:
            r2 = r10
        L_0x00dc:
            r2.mo71718V1(r3)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity.mo53120Y(ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo53121f3() {
        int i;
        String z1;
        Integer j;
        MoneyTransferWizardData Jw = m68716M3().mo53079Jw();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f56960q0;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        if (moneyTransferTypeUiModel.mo53147e() && Jw != null) {
            C31302e eVar = this.f56957n0;
            if (eVar == null || (z1 = eVar.mo71611z1()) == null || (j = C40438v.m117098j(z1)) == null) {
                i = -1;
            } else {
                i = j.intValue();
            }
            Jw.mo53160D(i);
        }
        Intent intent = new Intent();
        intent.putExtra("UMTS_TRANSFER_DATA_KEY", Jw);
        MoneyTransferTypeUiModel Hw = m68716M3().mo53077Hw();
        if (Hw != null) {
            intent.putExtra("UMTS_TRANSFER_TYPE_KEY", Hw);
        }
        C41238w wVar = C41238w.f97225a;
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53122i3() {
        /*
            r7 = this;
            ge.bog.mobilebank.ui.wizard.activities.c$d r0 = r7.f86776d0
            java.util.ArrayList r0 = r0.mo87978e()
            int r0 = r0.size()
            ge.bog.mobilebank.ui.wizard.activities.c$d r1 = r7.f86776d0
            int r1 = r1.mo87977d()
            if (r0 <= r1) goto L_0x006f
            ge.bog.mobilebank.ui.wizard.activities.c$d r0 = r7.f86776d0
            int r0 = r0.mo87977d()
            if (r0 < 0) goto L_0x006f
            ge.bog.mobilebank.ui.wizard.activities.c$d r0 = r7.f86776d0
            java.util.ArrayList r0 = r0.mo87978e()
            ge.bog.mobilebank.ui.wizard.activities.c$d r1 = r7.f86776d0
            int r1 = r1.mo87977d()
            java.lang.Object r0 = r0.get(r1)
            c91.y r0 = (c91.C31355y) r0
            java.lang.String r0 = r0.mo71705A1()
            if (r0 == 0) goto L_0x006a
            int r1 = r0.hashCode()
            switch(r1) {
                case -1913092951: goto L_0x005e;
                case -1840630110: goto L_0x0052;
                case 286505629: goto L_0x0046;
                case 794485106: goto L_0x003a;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x006a
        L_0x003a:
            java.lang.String r1 = "ACCOUNTS_PAGE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0043
            goto L_0x006a
        L_0x0043:
            java.lang.String r0 = "remittance_select_account_next"
            goto L_0x006c
        L_0x0046:
            java.lang.String r1 = "CURRENCY_PAGE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004f
            goto L_0x006a
        L_0x004f:
            java.lang.String r0 = "remittance_currency_page_next"
            goto L_0x006c
        L_0x0052:
            java.lang.String r1 = "CONVERSION_PAGE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005b
            goto L_0x006a
        L_0x005b:
            java.lang.String r0 = "remittance_amount_next"
            goto L_0x006c
        L_0x005e:
            java.lang.String r1 = "TRANSFER_NUMBER_PAGE_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            java.lang.String r0 = "remittance_enter_code_next"
            goto L_0x006c
        L_0x006a:
            java.lang.String r0 = ""
        L_0x006c:
            r7.m68717N3(r0)
        L_0x006f:
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel r0 = r7.f56960q0
            r1 = 0
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "transferType"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x007a:
            java.util.List r0 = r0.mo53143a()
            r2 = 1
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r0 = 0
            goto L_0x008b
        L_0x008a:
            r0 = r2
        L_0x008b:
            r0 = r0 ^ r2
            java.lang.String r3 = "transferNumberInputPage"
            java.lang.String r4 = "transferNumberInputPage.inputValue"
            if (r0 == 0) goto L_0x0108
            ge.bog.mobilebank.ui.wizard.activities.c$d r0 = r7.f86776d0
            int r0 = r0.mo87977d()
            if (r0 != r2) goto L_0x013e
            c91.e r0 = r7.f56956m0
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = r0.mo71611z1()
            if (r0 == 0) goto L_0x00b1
            java.lang.Integer r0 = cf1.C40438v.m117098j(r0)
            if (r0 == 0) goto L_0x00b1
            int r0 = r0.intValue()
            goto L_0x00b2
        L_0x00b1:
            r0 = -1
        L_0x00b2:
            c91.e r6 = r7.f56956m0
            if (r6 == 0) goto L_0x00f4
            java.util.List r5 = r6.mo71621C1()
            if (r5 == 0) goto L_0x00c3
            java.lang.Object r0 = ie1.C41358y.m120010Z(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00c4
        L_0x00c3:
            r0 = r1
        L_0x00c4:
            c91.f r5 = r7.f56955l0
            if (r5 != 0) goto L_0x00cc
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r5 = r1
        L_0x00cc:
            java.lang.String r5 = r5.mo71611z1()
            kotlin.jvm.internal.C41536l.m120488h(r5, r4)
            boolean r5 = cf1.C40439w.m117118v(r5)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x00f3
            if (r0 == 0) goto L_0x00f3
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel r2 = r7.m68716M3()
            c91.f r5 = r7.f56955l0
            if (r5 != 0) goto L_0x00e8
            kotlin.jvm.internal.C41536l.m120506z(r3)
            goto L_0x00e9
        L_0x00e8:
            r1 = r5
        L_0x00e9:
            java.lang.String r1 = r1.mo71611z1()
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            r2.mo53081xw(r1, r0)
        L_0x00f3:
            return
        L_0x00f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x0108:
            ge.bog.mobilebank.ui.wizard.activities.c$d r0 = r7.f86776d0
            int r0 = r0.mo87977d()
            if (r0 != 0) goto L_0x013e
            c91.f r0 = r7.f56955l0
            if (r0 != 0) goto L_0x0118
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r0 = r1
        L_0x0118:
            java.lang.String r0 = r0.mo71611z1()
            kotlin.jvm.internal.C41536l.m120488h(r0, r4)
            boolean r0 = cf1.C40439w.m117118v(r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x013d
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel r0 = r7.m68716M3()
            c91.f r2 = r7.f56955l0
            if (r2 != 0) goto L_0x0132
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r2 = r1
        L_0x0132:
            java.lang.String r2 = r2.mo71611z1()
            kotlin.jvm.internal.C41536l.m120488h(r2, r4)
            r3 = 2
            p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel.m68591yw(r0, r2, r1, r3, r1)
        L_0x013d:
            return
        L_0x013e:
            super.mo53122i3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity.mo53122i3():void");
    }

    public void onBackPressed() {
        mo53121f3();
    }
}
