package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0767a;
import c91.C31338x;
import c91.C31355y;
import com.github.mikephil.charting.utils.Utils;
import f91.C31971a;
import f91.C31972b;
import g91.C32297d;
import g91.C32299e;
import g91.C32303f;
import g91.C32304f0;
import g91.C32335t0;
import g91.C32340v0;
import g91.C32359z0;
import hd1.C41205b;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.model.AccountCountryType;
import p341ge.bog.mobilebank.model.BogCountry;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.TransferNomination;
import p341ge.bog.mobilebank.model.account.AccountOwnerInfo;
import p341ge.bog.mobilebank.model.account.AccountOwnerInfoWrapper;
import p341ge.bog.mobilebank.model.account.OtherAccountDetails;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p341ge.bog.mobilebank.model.account.TreasureCodeInfo;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBank;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;
import p341ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferContact;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10323l;
import p366bk.C10328q;
import p380ck.C10478k;
import r90.C27950a;
import w61.C39607i;
import z61.C40150a;
import z61.C40156d;
import z61.C40165h;
import z61.C40167j;
import z61.C40171l;
import z81.C40199b;
import z81.C40200c;
import z81.C40201d;
import z81.C40202e;
import z81.C40203f;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity */
public class BankTransferWizardActivity extends C35870f implements C40150a {

    /* renamed from: A0 */
    private C31338x f86554A0;

    /* renamed from: B0 */
    private C31338x f86555B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public C31338x f86556C0;

    /* renamed from: D0 */
    private C31338x f86557D0;

    /* renamed from: E0 */
    private C31338x f86558E0;

    /* renamed from: F0 */
    private C31338x f86559F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public C31338x f86560G0;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public C31338x f86561H0;

    /* renamed from: I0 */
    private C31338x f86562I0;

    /* renamed from: J0 */
    private C31338x f86563J0;

    /* renamed from: K0 */
    private C31338x f86564K0;

    /* renamed from: L0 */
    private C40167j f86565L0;

    /* renamed from: M0 */
    private C31338x f86566M0;

    /* renamed from: N0 */
    private C31338x f86567N0;

    /* renamed from: O0 */
    private C40156d f86568O0;

    /* renamed from: P0 */
    private C40156d f86569P0;

    /* renamed from: Q0 */
    private C31338x f86570Q0;

    /* renamed from: R0 */
    private C40165h f86571R0;

    /* renamed from: S0 */
    private C40171l f86572S0;

    /* renamed from: T0 */
    private C39607i f86573T0;

    /* renamed from: U0 */
    private boolean f86574U0;

    /* renamed from: V0 */
    private boolean f86575V0;

    /* renamed from: W0 */
    private ArrayList f86576W0;

    /* renamed from: X0 */
    private AccountLovEvent f86577X0;

    /* renamed from: Y0 */
    public TransferForm.TRANSFERTYPE f86578Y0;

    /* renamed from: Z0 */
    private boolean f86579Z0;

    /* renamed from: a1 */
    private boolean f86580a1;

    /* renamed from: b1 */
    private boolean f86581b1;

    /* renamed from: c1 */
    private boolean f86582c1;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public boolean f86583d1;

    /* renamed from: e1 */
    private boolean f86584e1;

    /* renamed from: f1 */
    private boolean f86585f1 = true;

    /* renamed from: g1 */
    private boolean f86586g1 = true;
    /* access modifiers changed from: private */

    /* renamed from: h1 */
    public TransferContact f86587h1 = null;
    /* access modifiers changed from: private */

    /* renamed from: i1 */
    public boolean f86588i1 = false;

    /* renamed from: j1 */
    private ArrayList f86589j1;

    /* renamed from: k1 */
    public String f86590k1 = "";

    /* renamed from: l0 */
    protected BankApi f86591l0;
    /* access modifiers changed from: private */

    /* renamed from: l1 */
    public boolean f86592l1;

    /* renamed from: m0 */
    protected Client f86593m0;
    /* access modifiers changed from: private */

    /* renamed from: m1 */
    public boolean f86594m1;

    /* renamed from: n0 */
    protected PreferencesApiManager f86595n0;
    /* access modifiers changed from: private */

    /* renamed from: n1 */
    public boolean f86596n1;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public ArrayList f86597o0 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: o1 */
    public boolean f86598o1;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public ArrayList f86599p0;
    /* access modifiers changed from: private */

    /* renamed from: p1 */
    public boolean f86600p1;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public ArrayList f86601q0;
    /* access modifiers changed from: private */

    /* renamed from: q1 */
    public boolean f86602q1;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public ArrayList f86603r0;

    /* renamed from: s0 */
    private boolean f86604s0;

    /* renamed from: t0 */
    private boolean f86605t0 = true;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public String f86606u0;

    /* renamed from: v0 */
    private String f86607v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public C31338x f86608w0;

    /* renamed from: x0 */
    private C31338x f86609x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public C31338x f86610y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public C31338x f86611z0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity$a */
    class C35834a extends RestCallback {
        C35834a() {
        }

        public void onEnqueue(C41205b bVar) {
            BankTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            C32297d.m95153a(BankTransferWizardActivity.this);
            BankTransferWizardActivity.this.mo87877q5(false, true);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            BankTransferWizardActivity.this.mo87877q5(false, true);
            if (bankApiResponse.isSuccess()) {
                BankTransferWizardActivity.super.mo53122i3();
            } else {
                C32297d.m95154b(BankTransferWizardActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity$b */
    class C35835b extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f86613a;

        /* renamed from: b */
        final /* synthetic */ boolean f86614b;

        C35835b(String str, boolean z) {
            this.f86613a = str;
            this.f86614b = z;
        }

        public void onEnqueue(C41205b bVar) {
            BankTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            BankTransferWizardActivity.this.f86596n1 = false;
            BankTransferWizardActivity.this.f86602q1 = true;
            BankTransferWizardActivity.this.m106380i5();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            String str;
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                String str2 = this.f86613a;
                BankTransferWizardActivity bankTransferWizardActivity = BankTransferWizardActivity.this;
                if (bankTransferWizardActivity.f86578Y0 == TransferForm.TRANSFERTYPE.ACCOUNT) {
                    str = bankTransferWizardActivity.m106400x4(bankTransferWizardActivity.m106403z4());
                } else {
                    str = bankTransferWizardActivity.f86611z0.mo71611z1();
                }
                if (str2.equals(str)) {
                    BankTransferWizardActivity.this.f86596n1 = false;
                    if (BankTransferWizardActivity.this.f86588i1) {
                        BankTransferWizardActivity.this.f86603r0.set(5, BankTransferWizardActivity.this.f86587h1.getFullName());
                    } else {
                        BankTransferWizardActivity.this.f86603r0.set(5, "");
                    }
                    BankTransferWizardActivity.this.f86556C0.mo71717U1("");
                    if (bankApiResponse.getResult() != null) {
                        BankTransferWizardActivity.this.f86602q1 = false;
                        BankTransferWizardActivity.this.f86606u0 = ((TreasureCodeInfo) bankApiResponse.getResult()).benefBic;
                        BankTransferWizardActivity.this.f86603r0.set(5, ((TreasureCodeInfo) bankApiResponse.getResult()).benefName);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new KeyValue(BankTransferWizardActivity.this.getString(C10328q.transfer_abonent), ((TreasureCodeInfo) bankApiResponse.getResult()).benefName));
                        if (!BankTransferWizardActivity.this.f86588i1) {
                            BankTransferWizardActivity.this.f86610y0.mo71677s4(arrayList);
                        }
                        BankTransferWizardActivity.this.f86556C0.mo71718V1(true);
                        BankTransferWizardActivity.this.f86556C0.mo71717U1(((TreasureCodeInfo) bankApiResponse.getResult()).benefName);
                        BankTransferWizardActivity.this.f86603r0.set(19, ((TreasureCodeInfo) bankApiResponse.getResult()).nomination);
                        BankTransferWizardActivity.this.f86561H0.mo71717U1(((TreasureCodeInfo) bankApiResponse.getResult()).nomination);
                        BankTransferWizardActivity.this.f86561H0.mo71718V1(true);
                    }
                    BankTransferWizardActivity.this.m106391r5();
                    BankTransferWizardActivity.this.mo87860S2();
                    BankTransferWizardActivity.this.f86583d1 = false;
                }
            }
            BankTransferWizardActivity.this.f86602q1 = true;
            BankTransferWizardActivity.this.m106378h5(this.f86614b, bankApiResponse.getKey());
            BankTransferWizardActivity.this.mo87860S2();
            BankTransferWizardActivity.this.f86583d1 = false;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity$c */
    class C35836c extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f86616a;

        /* renamed from: b */
        final /* synthetic */ boolean f86617b;

        /* renamed from: c */
        final /* synthetic */ boolean f86618c;

        C35836c(String str, boolean z, boolean z2) {
            this.f86616a = str;
            this.f86617b = z;
            this.f86618c = z2;
        }

        public void onEnqueue(C41205b bVar) {
            BankTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            BankTransferWizardActivity.this.f86596n1 = false;
            BankTransferWizardActivity.this.f86602q1 = true;
            BankTransferWizardActivity.this.m106380i5();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            BankTransferWizardActivity.this.m106343N4(bankApiResponse, this.f86616a, this.f86617b, this.f86618c);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity$d */
    class C35837d extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f86620a;

        /* renamed from: b */
        final /* synthetic */ boolean f86621b;

        /* renamed from: c */
        final /* synthetic */ boolean f86622c;

        C35837d(String str, boolean z, boolean z2) {
            this.f86620a = str;
            this.f86621b = z;
            this.f86622c = z2;
        }

        public void onEnqueue(C41205b bVar) {
            BankTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            BankTransferWizardActivity.this.f86596n1 = false;
            BankTransferWizardActivity.this.f86602q1 = true;
            BankTransferWizardActivity.this.m106380i5();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            BankTransferWizardActivity.this.m106343N4(bankApiResponse, this.f86620a, this.f86621b, this.f86622c);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity$e */
    class C35838e extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f86624a;

        /* renamed from: b */
        final /* synthetic */ boolean f86625b;

        /* renamed from: c */
        final /* synthetic */ boolean f86626c;

        C35838e(String str, boolean z, boolean z2) {
            this.f86624a = str;
            this.f86625b = z;
            this.f86626c = z2;
        }

        public void onEnqueue(C41205b bVar) {
            BankTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            BankTransferWizardActivity.this.f86596n1 = false;
            BankTransferWizardActivity.this.f86602q1 = true;
            BankTransferWizardActivity.this.m106380i5();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            BankTransferWizardActivity.this.m106343N4(bankApiResponse, this.f86624a, this.f86625b, this.f86626c);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity$f */
    class C35839f extends RestCallback {
        C35839f() {
        }

        public void onEnqueue(C41205b bVar) {
            BankTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            BankTransferWizardActivity.this.f86594m1 = false;
            boolean z = true;
            BankTransferWizardActivity.this.f86600p1 = true;
            BankTransferWizardActivity bankTransferWizardActivity = BankTransferWizardActivity.this;
            if (!bankTransferWizardActivity.f86592l1 && !BankTransferWizardActivity.this.f86596n1) {
                z = false;
            }
            bankTransferWizardActivity.mo87877q5(z, false);
            BankTransferWizardActivity.this.mo87860S2();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v3 */
        /* JADX WARNING: type inference failed for: r1v4, types: [int] */
        /* JADX WARNING: type inference failed for: r1v11 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(p341ge.bog.mobilebank.shared2.network.BankApiResponse r5) {
            /*
                r4 = this;
                super.onResponse(r5)
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                r1 = 0
                r0.f86594m1 = r1
                boolean r0 = r5.isSuccess()
                r2 = 1
                if (r0 == 0) goto L_0x0114
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                r0.f86600p1 = r1
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.lang.Object r5 = r5.getResult()
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                r0.f86601q0 = r5
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r5 = r5.f86601q0
                if (r5 == 0) goto L_0x00e6
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r5 = r5.f86601q0
                int r5 = r5.size()
                if (r5 <= 0) goto L_0x00e6
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r0 = r5.f86592l1
                if (r0 != 0) goto L_0x004f
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r0 = r0.f86594m1
                if (r0 != 0) goto L_0x004f
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r0 = r0.f86596n1
                if (r0 == 0) goto L_0x004d
                goto L_0x004f
            L_0x004d:
                r0 = r1
                goto L_0x0050
            L_0x004f:
                r0 = r2
            L_0x0050:
                r5.mo87877q5(r0, r2)
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                c91.x r5 = r5.f86560G0
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r0 = r0.f86601q0
                r5.mo71655X3(r0)
            L_0x0062:
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r5 = r5.f86597o0
                int r5 = r5.size()
                if (r1 >= r5) goto L_0x008c
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r5 = r5.f86597o0
                java.lang.Object r5 = r5.get(r1)
                c91.y r5 = (c91.C31355y) r5
                boolean r0 = r5 instanceof c91.C31338x
                if (r0 != 0) goto L_0x007f
                goto L_0x0089
            L_0x007f:
                c91.x r5 = (c91.C31338x) r5
                boolean r5 = r5.mo71675r3()
                if (r5 == 0) goto L_0x0089
                int r1 = r1 + r2
                goto L_0x008d
            L_0x0089:
                int r1 = r1 + 1
                goto L_0x0062
            L_0x008c:
                r1 = -1
            L_0x008d:
                if (r1 <= 0) goto L_0x00aa
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r5 = r5.f86597o0
                int r5 = r5.size()
                if (r1 > r5) goto L_0x00aa
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r5 = r5.f86597o0
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                c91.x r0 = r0.f86560G0
                r5.add(r1, r0)
            L_0x00aa:
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                c91.x r5 = r5.f86561H0
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                int r1 = p366bk.C10328q.transfer_details_title_nomination_description
                java.lang.String r0 = r0.getString(r1)
                r5.mo71716S1(r0)
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r5 = r5.f86603r0
                r0 = 19
                java.lang.String r1 = ""
                r5.set(r0, r1)
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.util.ArrayList r5 = r5.f86603r0
                r0 = 18
                r5.set(r0, r1)
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                c91.x r5 = r5.f86561H0
                r5.mo71717U1(r1)
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                c91.x r5 = r5.f86560G0
                r5.mo71717U1(r1)
                goto L_0x0143
            L_0x00e6:
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r0 = r5.f86592l1
                if (r0 != 0) goto L_0x00fe
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r0 = r0.f86594m1
                if (r0 != 0) goto L_0x00fe
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r0 = r0.f86596n1
                if (r0 == 0) goto L_0x00ff
            L_0x00fe:
                r1 = r2
            L_0x00ff:
                r5.mo87877q5(r1, r2)
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                c91.x r5 = r5.f86561H0
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                int r1 = p366bk.C10328q.transfers_title_subject
                java.lang.String r0 = r0.getString(r1)
                r5.mo71716S1(r0)
                goto L_0x0143
            L_0x0114:
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                r0.f86600p1 = r2
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r3 = r0.f86592l1
                if (r3 != 0) goto L_0x0133
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r3 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r3 = r3.f86594m1
                if (r3 != 0) goto L_0x0133
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r3 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                boolean r3 = r3.f86596n1
                if (r3 == 0) goto L_0x0132
                goto L_0x0133
            L_0x0132:
                r2 = r1
            L_0x0133:
                r0.mo87877q5(r2, r1)
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                java.lang.String r5 = r5.getKey()
                java.lang.String r5 = r90.C27950a.m86284a(r5)
                g91.C32297d.m95154b(r0, r5)
            L_0x0143:
                ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity r5 = p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.this
                r5.mo87860S2()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.C35839f.onResponse(ge.bog.mobilebank.shared2.network.BankApiResponse):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.BankTransferWizardActivity$g */
    class C35840g extends RestCallback {
        C35840g() {
        }

        public void onEnqueue(C41205b bVar) {
            BankTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            BankTransferWizardActivity.this.f86592l1 = false;
            boolean z = true;
            BankTransferWizardActivity.this.f86598o1 = true;
            BankTransferWizardActivity bankTransferWizardActivity = BankTransferWizardActivity.this;
            if (!bankTransferWizardActivity.f86594m1 && !BankTransferWizardActivity.this.f86596n1) {
                z = false;
            }
            bankTransferWizardActivity.mo87877q5(z, false);
            BankTransferWizardActivity.this.mo87860S2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            boolean z = false;
            BankTransferWizardActivity.this.f86592l1 = false;
            boolean z2 = true;
            if (bankApiResponse.isSuccess()) {
                BankTransferWizardActivity.this.f86598o1 = false;
                BankTransferWizardActivity.this.f86599p0 = (ArrayList) bankApiResponse.getResult();
                BankTransferWizardActivity bankTransferWizardActivity = BankTransferWizardActivity.this;
                if (bankTransferWizardActivity.f86592l1 || BankTransferWizardActivity.this.f86594m1 || BankTransferWizardActivity.this.f86596n1) {
                    z = true;
                }
                bankTransferWizardActivity.mo87877q5(z, true);
                BankTransferWizardActivity.this.f86608w0.mo71644R3(BankTransferWizardActivity.this.f86599p0);
            } else {
                BankTransferWizardActivity.this.f86598o1 = true;
                BankTransferWizardActivity bankTransferWizardActivity2 = BankTransferWizardActivity.this;
                if (!bankTransferWizardActivity2.f86592l1 && !BankTransferWizardActivity.this.f86594m1 && !BankTransferWizardActivity.this.f86596n1) {
                    z2 = false;
                }
                bankTransferWizardActivity2.mo87877q5(z2, false);
                C32297d.m95154b(BankTransferWizardActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            }
            BankTransferWizardActivity.this.mo87860S2();
        }
    }

    /* renamed from: A4 */
    private void m106322A4(String str) {
        boolean z = true;
        this.f86592l1 = true;
        this.f86598o1 = false;
        this.f86591l0.transfersGetDispatchTypes(str, new C35840g());
        mo87860S2();
        if (!this.f86592l1 && !this.f86594m1 && !this.f86596n1) {
            z = false;
        }
        mo87877q5(z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r4 > 66) goto L_0x0010;
     */
    /* renamed from: A5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m106323A5(int r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            r0 = -1
            r1 = 33
            if (r5 <= r1) goto L_0x0008
            if (r4 <= r1) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            if (r5 > r1) goto L_0x000f
            r1 = 66
            if (r4 <= r1) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = r0
        L_0x0010:
            r5 = 1
            r2 = 0
            if (r1 == r0) goto L_0x0026
            if (r7 == 0) goto L_0x0025
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r2] = r5
            java.lang.String r4 = r3.getString(r6, r4)
            g91.C32297d.m95154b(r3, r4)
        L_0x0025:
            return r2
        L_0x0026:
            if (r4 <= 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r5 = r2
        L_0x002a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.m106323A5(int, int, int, boolean):boolean");
    }

    /* renamed from: C4 */
    private String m106326C4(int i) {
        ArrayList arrayList = this.f86603r0;
        if (arrayList != null) {
            return (String) arrayList.get(i);
        }
        return "";
    }

    /* renamed from: E4 */
    private void m106329E4(String str) {
        TransferForm.TRANSFERTYPE transfertype;
        String str2;
        String str3;
        String x4;
        this.f86561H0.mo71716S1(getString(C10328q.transfers_title_subject));
        String z4 = m106403z4();
        if (this.f86575V0 || str == null || (this.f86578Y0 == (transfertype = TransferForm.TRANSFERTYPE.ACCOUNT) ? TextUtils.isEmpty(z4) : TextUtils.isEmpty(this.f86611z0.mo71611z1())) || !"PAYMENT_WITHIN_BANK".equals(mo87849B4())) {
            this.f86594m1 = false;
            this.f86600p1 = false;
            return;
        }
        boolean z = true;
        this.f86594m1 = true;
        this.f86600p1 = false;
        TransferForm.TRANSFERTYPE transfertype2 = this.f86578Y0;
        if (transfertype2 == transfertype) {
            x4 = m106400x4(z4);
        } else if (transfertype2 == TransferForm.TRANSFERTYPE.PHONE) {
            x4 = m106400x4(this.f86611z0.mo71611z1());
        } else {
            str2 = m106400x4(this.f86611z0.mo71611z1());
            str3 = null;
            this.f86591l0.getTransferNominations(mo87849B4(), str, str, str3, str2, new C35839f());
            mo87860S2();
            if (!this.f86592l1 && !this.f86594m1 && !this.f86596n1) {
                z = false;
            }
            mo87877q5(z, false);
        }
        str3 = x4;
        str2 = null;
        this.f86591l0.getTransferNominations(mo87849B4(), str, str, str3, str2, new C35839f());
        mo87860S2();
        z = false;
        mo87877q5(z, false);
    }

    /* renamed from: J4 */
    private BigDecimal m106335J4() {
        return C31972b.m94381f(this.f86577X0.getAccountLovContainer(), m106337K4());
    }

    /* renamed from: K4 */
    private int m106337K4() {
        return this.f86604s0 ? 1 : 2;
    }

    /* renamed from: L4 */
    private void m106339L4() {
        if (TextUtils.isEmpty(this.f86609x0.mo71611z1())) {
            this.f86758L.setLeftColor(17170445, false, true);
            this.f86758L.setLeftFrameState(10);
        } else {
            this.f86758L.setLeftFrameState(12);
        }
        if (!TextUtils.isEmpty(m106403z4()) || this.f86588i1) {
            this.f86758L.setRightFrameState(12);
            return;
        }
        this.f86758L.setRightColor(17170445, false, true);
        this.f86758L.setRightFrameState(10);
        this.f86758L.setBankLogo(-1);
        this.f86758L.setTextColorIds(C10318g.f28647k1, false);
    }

    /* renamed from: M4 */
    private void m106341M4() {
        if (!TextUtils.isEmpty(m106403z4()) || this.f86588i1) {
            this.f86758L.setRightFrameState(12);
        } else {
            this.f86758L.setRightFrameState(10);
            this.f86758L.setRightColor(17170445, false, true);
            this.f86758L.setBankLogo(-1);
            this.f86758L.setTextColorIds(C10318g.f28647k1, false);
        }
        if (TextUtils.isEmpty(this.f86609x0.mo71611z1())) {
            this.f86758L.setLeftColor(C32335t0.m95359d(this, true), false, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N4 */
    public void m106343N4(BankApiResponse bankApiResponse, String str, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        this.f86596n1 = false;
        if (!bankApiResponse.isSuccess() || (this.f86578Y0 != TransferForm.TRANSFERTYPE.ACCOUNT && !str.equals(m106400x4(m106403z4())))) {
            this.f86590k1 = "";
            this.f86602q1 = true;
            m106378h5(z, bankApiResponse.getKey());
        } else {
            AccountOwnerInfo accountOwnerInfo = ((AccountOwnerInfoWrapper) bankApiResponse.getResult()).clientInfo;
            this.f86602q1 = false;
            this.f86606u0 = accountOwnerInfo.getBic();
            if (accountOwnerInfo.getAcctBankType() == AccountCountryType.FOREIGN) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f86584e1 = z3;
            this.f86585f1 = accountOwnerInfo.isValidIban();
            if (this.f86769W) {
                this.f86605t0 = !this.f86584e1;
                this.f86752F.setOrange(true, true);
                this.f86584e1 = false;
            }
            if (this.f86606u0 == null) {
                this.f86603r0.set(5, "");
                this.f86556C0.mo71717U1("");
            }
            if (this.f86588i1) {
                this.f86603r0.set(5, this.f86587h1.getFullName());
            } else if (accountOwnerInfo.getOwner() != null) {
                this.f86603r0.set(5, accountOwnerInfo.getOwner());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new KeyValue(getString(C10328q.transfer_abonent), accountOwnerInfo.getOwner()));
                this.f86590k1 = accountOwnerInfo.getOwner();
                this.f86610y0.mo71677s4(arrayList);
            } else {
                this.f86590k1 = "";
            }
            if (((AccountOwnerInfoWrapper) bankApiResponse.getResult()).accounts == null) {
                if (this.f86575V0) {
                    this.f86556C0.mo71718V1(true);
                    this.f86556C0.mo71717U1(accountOwnerInfo.getTreasureCode().getTreasureCodeDesc());
                    this.f86603r0.set(5, accountOwnerInfo.getTreasureCode().getTreasureCodeDesc());
                } else if (!this.f86588i1 && accountOwnerInfo.getOwner() != null) {
                    this.f86556C0.mo71717U1(accountOwnerInfo.getOwner());
                    this.f86556C0.mo71718V1(false);
                    this.f86603r0.set(5, this.f86556C0.mo71611z1());
                }
                mo87872m5();
            } else {
                ArrayList<OtherAccountDetails> arrayList2 = ((AccountOwnerInfoWrapper) bankApiResponse.getResult()).accounts;
                this.f86589j1 = arrayList2;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    C32297d.m95154b(this, getString(C10328q.transfer_error_pin_no_accounts));
                }
                if (this.f86596n1 || this.f86592l1 || this.f86594m1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mo87877q5(z4, true);
                if (this.f86583d1) {
                    this.f86583d1 = false;
                    super.mo53122i3();
                }
            }
            m106391r5();
            if (z2) {
                mo87880u5();
            }
        }
        mo87860S2();
        this.f86583d1 = false;
    }

    /* renamed from: O4 */
    private void m106345O4() {
        if (!TextUtils.isEmpty(this.f86609x0.mo71611z1())) {
            this.f86758L.setLeftFrameState(12);
        } else {
            this.f86758L.setLeftFrameState(10);
            this.f86758L.setLeftColor(17170445, false, true);
        }
        if (TextUtils.isEmpty(m106403z4()) && !this.f86588i1) {
            this.f86758L.setRightColor(C32335t0.m95359d(this, true), false, true);
            this.f86758L.setTextColorIds(C10318g.f28647k1, false);
        }
    }

    /* renamed from: P4 */
    private boolean m106347P4(C31355y yVar) {
        if (yVar instanceof C31338x) {
            return !((C31338x) yVar).mo71669n3(false);
        }
        return TextUtils.isEmpty(yVar.mo71611z1());
    }

    /* renamed from: Q4 */
    private boolean m106349Q4() {
        return this.f86579Z0 || this.f86580a1 || this.f86574U0;
    }

    /* renamed from: S4 */
    private boolean m106352S4() {
        return (this.f86579Z0 || this.f86580a1) && "GEL".equals(this.f86607v0);
    }

    /* renamed from: T4 */
    private boolean m106354T4() {
        ArrayList arrayList = this.f86601q0;
        return arrayList == null || arrayList.size() == 0;
    }

    /* renamed from: U4 */
    private void m106356U4() {
        C40171l p2 = C40171l.m116395p2((ReportingCode) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_REPORTING_CODE")));
        this.f86572S0 = p2;
        p2.mo71716S1(getString(C10328q.common_text_operation_type));
        C40156d j2 = C40156d.m116311j2((ForeignBank) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_SELECTED_INTERMIDIARY_BANK")), getString(C10328q.search_intermidiary_bank));
        this.f86568O0 = j2;
        j2.mo71714Q1(2);
        this.f86568O0.mo71716S1(getString(C10328q.intermidiary_bank));
        this.f86568O0.mo71718V1(true);
        C40156d j22 = C40156d.m116311j2((ForeignBank) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_SELECTED_BENEFICIARY_BANK")), getString(C10328q.search_beneficiary_bank));
        this.f86569P0 = j22;
        j22.mo94107m2(true);
        this.f86569P0.mo71714Q1(2);
        this.f86569P0.mo71716S1(getString(C10328q.beneficiary_bank));
        C31338x xVar = new C31338x();
        this.f86570Q0 = xVar;
        xVar.mo71715R1(70);
        this.f86570Q0.mo71659Z3(true);
        this.f86570Q0.mo71718V1(true);
        this.f86570Q0.mo71714Q1(2);
        this.f86570Q0.mo71716S1(getString(C10328q.additional_info));
        this.f86570Q0.mo71717U1(m106326C4(20));
        C40165h j23 = C40165h.m116357j2((List) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_ATTACHED_FILES")));
        this.f86571R0 = j23;
        j23.mo71718V1(true);
    }

    /* renamed from: V4 */
    private boolean m106358V4() {
        return (!this.f86604s0 && !this.f86575V0 && !"GEL".equals(this.f86607v0)) || this.f86584e1;
    }

    /* renamed from: W4 */
    private boolean m106360W4() {
        try {
            if (TextUtils.isEmpty(this.f86554A0.mo71611z1()) || Double.parseDouble(this.f86554A0.mo71611z1()) <= Utils.DOUBLE_EPSILON) {
                return true;
            }
            Iterator it = this.f86597o0.iterator();
            while (it.hasNext()) {
                C31355y yVar = (C31355y) it.next();
                if (!yVar.mo67195H1() && m106347P4(yVar)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: Z4 */
    private boolean m106364Z4() {
        TransferForm.TRANSFERTYPE transfertype;
        boolean z;
        boolean z2;
        if (!"PAGE_DESTINATION_ACCOUNT".equals(mo87956O2()) || this.f86575V0 || (transfertype = this.f86578Y0) == TransferForm.TRANSFERTYPE.PIN || transfertype == TransferForm.TRANSFERTYPE.PHONE) {
            return true;
        }
        int length = m106403z4().length();
        if (!this.f86584e1 || length < 6) {
            z = false;
        } else {
            z = true;
        }
        if (length == 22 || length == 25) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b5 */
    public /* synthetic */ void m106367b5(View view) {
        mo87963n3(m106349Q4() ? 1 : 0, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c5 */
    public /* synthetic */ void m106369c5(View view) {
        int i;
        if (m106349Q4()) {
            i = 2;
        } else {
            i = 1;
        }
        if (mo87922N2() != i) {
            mo87963n3(i, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d5 */
    public /* synthetic */ boolean m106371d5(String str, boolean z) {
        return m106323A5(str.length(), this.f86556C0.mo71611z1().length(), C10328q.recipient_address_characters_limit, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: e5 */
    public /* synthetic */ C41238w m106373e5(String str) {
        C36546y.m108282F().mo27156w("transfers", "other_transfer_contact", "select_suggested_acc", this.f86587h1.getConnectionType().mo67882b());
        m106393s5(true);
        mo87853G4(str, true);
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: f5 */
    public /* synthetic */ boolean m106375f5(String str, boolean z) {
        return m106323A5(str.length(), this.f86567N0.mo71611z1().length(), C10328q.recipient_name_characters_limit, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: h5 */
    public void m106378h5(boolean z, String str) {
        boolean z2;
        this.f86590k1 = "";
        mo87872m5();
        mo87871l5();
        mo87873n5((String) null);
        if (z) {
            C32297d.m95154b(this, C27950a.m86284a(str));
        }
        boolean z3 = false;
        if (this.f86596n1 || this.f86592l1 || this.f86594m1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f86578Y0 == TransferForm.TRANSFERTYPE.ACCOUNT) {
            z3 = true;
        }
        mo87877q5(z2, z3);
        m106402y5();
    }

    /* access modifiers changed from: private */
    /* renamed from: i5 */
    public void m106380i5() {
        boolean z;
        this.f86590k1 = "";
        boolean z2 = false;
        this.f86583d1 = false;
        if (this.f86596n1 || this.f86592l1 || this.f86594m1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f86578Y0 == TransferForm.TRANSFERTYPE.ACCOUNT) {
            z2 = true;
        }
        mo87877q5(z, z2);
        mo87860S2();
        m106402y5();
    }

    /* renamed from: k5 */
    private void m106383k5() {
        this.f86561H0.mo71642Q3(mo87865a5() ? new C32304f0() : null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r5 */
    public void m106391r5() {
        String str = this.f86606u0;
        if (str != null || this.f86584e1 || this.f86769W || this.f86588i1) {
            this.f86604s0 = "BAGAGE22".equals(str);
            int a = C32299e.m95163a(this.f86606u0);
            if (this.f86584e1 && a == -1) {
                a = C10320i.default_small;
            }
            C31338x xVar = this.f86610y0;
            if (xVar != null) {
                xVar.mo71634K3(a);
                this.f86610y0.mo71685x4();
            }
            if (!this.f86588i1 || !this.f86575V0) {
                mo87955L2().setBankLogo(a);
            } else {
                mo87955L2().setBankLogo(this.f86587h1.getProfilePictureDrawable(), this.f86587h1.getProfilePictureUrl(), false);
            }
            boolean z = true;
            m106393s5(true);
            mo87881v5(false);
            if (!m106364Z4() && !this.f86769W) {
                z = false;
            }
            mo87877q5(false, z);
        } else {
            m106402y5();
        }
        m106383k5();
    }

    /* renamed from: s5 */
    private void m106393s5(boolean z) {
        String str;
        String z4 = m106403z4();
        if (this.f86588i1) {
            str = (String) this.f86603r0.get(5);
        } else {
            str = this.f86556C0.mo71611z1();
        }
        ColorDrawable colorDrawable = new ColorDrawable(C0767a.m2893c(this, C10318g.f28624I0));
        mo87955L2().setRight((Drawable) colorDrawable, z, z4, str, true);
        mo87955L2().setTextColorIds(C10318g.f28630R0, false);
    }

    /* renamed from: t5 */
    private void m106395t5() {
        boolean z;
        boolean z2;
        mo87967s3(this.f86597o0, true);
        m106356U4();
        C40167j p2 = C40167j.m116378p2((BogCountry) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_RECIPIENT_COUNTRY")));
        this.f86565L0 = p2;
        p2.mo71716S1(getString(C10328q.user_name_wizard_title_country));
        C31338x xVar = new C31338x();
        this.f86566M0 = xVar;
        xVar.mo71659Z3(true);
        this.f86566M0.mo71714Q1(2);
        this.f86566M0.mo71716S1(getString(C10328q.recipient_city));
        this.f86566M0.mo71717U1(m106326C4(7));
        C31338x xVar2 = new C31338x();
        this.f86567N0 = xVar2;
        xVar2.mo71647T3(new C40202e(this));
        this.f86567N0.mo71659Z3(true);
        this.f86567N0.mo71714Q1(2);
        this.f86567N0.mo71716S1(getString(C10328q.recipient_address));
        this.f86567N0.mo71717U1(m106326C4(8));
        C31338x xVar3 = new C31338x();
        this.f86559F0 = xVar3;
        xVar3.mo71714Q1(2);
        this.f86559F0.mo71600T1(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
        if (this.f86579Z0 || this.f86580a1) {
            this.f86559F0.mo71716S1(getString(C10328q.sto_title_name));
            this.f86559F0.mo71712O1(true);
        } else {
            this.f86559F0.mo71716S1(getString(C10328q.common_text_template_name));
        }
        ArrayList arrayList = this.f86603r0;
        if (arrayList != null) {
            this.f86559F0.mo71717U1((String) arrayList.get(0));
        }
        this.f86597o0.add(this.f86559F0);
        C31338x xVar4 = new C31338x();
        this.f86609x0 = xVar4;
        xVar4.mo71720X1("PAGE_SOURCE_ACCOUNT");
        this.f86609x0.mo71714Q1(0);
        this.f86609x0.mo71721Y1(getString(C10328q.transfer_wizard_from_where_transfer));
        this.f86609x0.mo71636L3(true);
        this.f86609x0.mo71665f4(true);
        ArrayList arrayList2 = this.f86603r0;
        if (arrayList2 != null) {
            this.f86609x0.mo71717U1((String) arrayList2.get(1));
        }
        this.f86597o0.add(this.f86609x0);
        if (!this.f86588i1) {
            C31338x xVar5 = new C31338x();
            this.f86610y0 = xVar5;
            xVar5.mo71720X1("PAGE_DESTINATION_ACCOUNT");
            this.f86610y0.mo71714Q1(2);
            this.f86610y0.mo71666g4(this.f86578Y0);
            if (!this.f86575V0) {
                TransferForm.TRANSFERTYPE transfertype = this.f86578Y0;
                if (transfertype == TransferForm.TRANSFERTYPE.ACCOUNT) {
                    this.f86610y0.mo71716S1(getString(C10328q.transfers_title_receiver_account));
                    this.f86610y0.mo71600T1(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
                } else if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
                    this.f86610y0.mo71716S1(getString(C10328q.transfers_title_customer_pin));
                    this.f86610y0.mo71600T1(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
                } else if (transfertype == TransferForm.TRANSFERTYPE.PHONE) {
                    this.f86610y0.mo71716S1(getString(C10328q.transfers_title_customer_phone));
                }
            } else {
                this.f86610y0.mo71716S1(getString(C10328q.transfers_title_treasure_code));
                this.f86610y0.mo71637N3(true);
                this.f86610y0.mo71600T1(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
            }
            this.f86610y0.mo71628H3(true);
            this.f86610y0.mo71711N1(false);
            ArrayList arrayList3 = this.f86603r0;
            if (arrayList3 != null) {
                String str = (String) arrayList3.get(3);
                if (!TextUtils.isEmpty(str)) {
                    if (!this.f86575V0 || str.contains("-")) {
                        this.f86610y0.mo71717U1(str);
                    } else {
                        C31338x xVar6 = this.f86610y0;
                        xVar6.mo71717U1(xVar6.mo71635L2(str));
                    }
                }
            }
            this.f86597o0.add(this.f86610y0);
        } else {
            C39607i j2 = C39607i.m115086j2(this.f86587h1, (String) this.f86603r0.get(3));
            this.f86573T0 = j2;
            j2.mo93267k2(new C40203f(this));
            this.f86597o0.add(this.f86573T0);
        }
        C31338x xVar7 = new C31338x();
        this.f86611z0 = xVar7;
        xVar7.mo71651V3(true);
        this.f86611z0.mo71714Q1(5);
        this.f86611z0.mo71718V1(false);
        TransferForm.TRANSFERTYPE transfertype2 = this.f86578Y0;
        TransferForm.TRANSFERTYPE transfertype3 = TransferForm.TRANSFERTYPE.PIN;
        if (transfertype2 == transfertype3) {
            this.f86611z0.mo71666g4(transfertype3);
        }
        ArrayList arrayList4 = this.f86603r0;
        if (arrayList4 != null) {
            this.f86611z0.mo71717U1((String) arrayList4.get(4));
        }
        this.f86597o0.add(this.f86611z0);
        C31338x xVar8 = new C31338x();
        this.f86556C0 = xVar8;
        xVar8.mo71714Q1(2);
        this.f86556C0.mo71659Z3(this.f86584e1);
        this.f86556C0.mo71716S1(getString(C10328q.transfers_title_receiver_name));
        ArrayList arrayList5 = this.f86603r0;
        if (arrayList5 != null) {
            this.f86556C0.mo71717U1((String) arrayList5.get(5));
        }
        if (!this.f86588i1) {
            this.f86597o0.add(this.f86556C0);
        }
        C31338x xVar9 = new C31338x();
        this.f86557D0 = xVar9;
        xVar9.mo71714Q1(2);
        this.f86557D0.mo71716S1(getString(C10328q.transfer_details_title_sender_name));
        this.f86557D0.mo71718V1(true);
        ArrayList arrayList6 = this.f86603r0;
        if (arrayList6 != null) {
            this.f86557D0.mo71717U1((String) arrayList6.get(9));
        }
        this.f86597o0.add(this.f86557D0);
        C31338x xVar10 = new C31338x();
        this.f86558E0 = xVar10;
        xVar10.mo71720X1("PAGE_SENDERS_PIN");
        this.f86558E0.mo71714Q1(2);
        this.f86558E0.mo71716S1(getString(C10328q.transfer_details_title_sender_pin));
        this.f86558E0.mo71718V1(true);
        ArrayList arrayList7 = this.f86603r0;
        if (arrayList7 != null) {
            this.f86558E0.mo71717U1((String) arrayList7.get(10));
        }
        this.f86597o0.add(this.f86558E0);
        C31338x xVar11 = new C31338x();
        this.f86554A0 = xVar11;
        xVar11.mo71714Q1(2);
        this.f86554A0.mo71600T1(BogInputLayout.INPUT_TYPE_NUM_REAL);
        if (this.f86607v0 == null) {
            this.f86607v0 = "GEL";
        }
        mo87876p5(this.f86607v0);
        this.f86554A0.mo71716S1(getString(C10328q.transfer_wizard_amount));
        this.f86554A0.mo71630I3(true);
        ArrayList arrayList8 = this.f86603r0;
        if (arrayList8 != null) {
            this.f86554A0.mo71717U1((String) arrayList8.get(15));
        }
        this.f86597o0.add(this.f86554A0);
        C31338x xVar12 = new C31338x();
        this.f86608w0 = xVar12;
        xVar12.mo71720X1("PAGE_TRANSFER_TYPE");
        this.f86608w0.mo71714Q1(1);
        this.f86608w0.mo71716S1(getString(C10328q.transfer_wizard_choose_transfer_type));
        this.f86608w0.mo71644R3(this.f86599p0);
        this.f86608w0.mo71718V1(true);
        ArrayList arrayList9 = this.f86603r0;
        if (arrayList9 != null) {
            this.f86608w0.mo71717U1((String) arrayList9.get(16));
        }
        this.f86597o0.add(this.f86608w0);
        C31338x xVar13 = new C31338x();
        this.f86560G0 = xVar13;
        xVar13.mo71714Q1(1);
        C31338x xVar14 = this.f86560G0;
        int i = C10328q.transfers_title_subject;
        xVar14.mo71716S1(getString(i));
        this.f86560G0.mo71655X3(this.f86601q0);
        this.f86560G0.mo71718V1(false);
        ArrayList arrayList10 = this.f86603r0;
        if (arrayList10 != null) {
            this.f86560G0.mo71717U1((String) arrayList10.get(18));
        }
        this.f86597o0.add(this.f86560G0);
        C31338x xVar15 = new C31338x();
        this.f86561H0 = xVar15;
        xVar15.mo71659Z3(this.f86584e1);
        this.f86561H0.mo71720X1("PAGE_NOMINATION");
        this.f86561H0.mo71714Q1(2);
        this.f86561H0.mo71716S1(getString(i));
        this.f86561H0.mo71718V1(!this.f86575V0);
        ArrayList arrayList11 = this.f86603r0;
        if (arrayList11 != null) {
            this.f86561H0.mo71717U1((String) arrayList11.get(19));
        }
        this.f86597o0.add(this.f86561H0);
        if (this.f86579Z0 || this.f86580a1) {
            C31338x xVar16 = new C31338x();
            this.f86555B0 = xVar16;
            xVar16.mo71714Q1(1);
            this.f86555B0.mo71716S1(getString(C10328q.sto_title_period));
            this.f86555B0.mo71660a4(this.f86576W0);
            this.f86555B0.mo71649U3(this.f86579Z0);
            ArrayList arrayList12 = this.f86603r0;
            if (arrayList12 != null) {
                this.f86555B0.mo71717U1((String) arrayList12.get(23));
            }
            this.f86597o0.add(this.f86555B0);
            C31338x xVar17 = new C31338x();
            this.f86563J0 = xVar17;
            xVar17.mo71714Q1(3);
            this.f86563J0.mo71716S1(getString(C10328q.sto_title_start_date));
            C31338x xVar18 = this.f86563J0;
            if (this.f86579Z0 || this.f86580a1) {
                z = true;
            } else {
                z = false;
            }
            xVar18.mo71649U3(z);
            ArrayList arrayList13 = this.f86603r0;
            if (arrayList13 != null) {
                this.f86563J0.mo71717U1((String) arrayList13.get(24));
            }
            this.f86563J0.mo71623D3();
            this.f86597o0.add(this.f86563J0);
            C31338x xVar19 = new C31338x();
            this.f86562I0 = xVar19;
            xVar19.mo71714Q1(3);
            this.f86562I0.mo71716S1(getString(C10328q.sto_title_service_end));
            C31338x xVar20 = this.f86562I0;
            if (this.f86579Z0 || this.f86580a1) {
                z2 = true;
            } else {
                z2 = false;
            }
            xVar20.mo71649U3(z2);
            this.f86562I0.mo71653W3(this.f86563J0.mo71611z1());
            this.f86562I0.mo71712O1(true);
            ArrayList arrayList14 = this.f86603r0;
            if (arrayList14 != null) {
                this.f86562I0.mo71717U1((String) arrayList14.get(25));
            }
            this.f86562I0.mo71622C3();
            this.f86562I0.mo71718V1(true);
            this.f86597o0.add(this.f86562I0);
        }
        if (this.f86769W) {
            C31338x xVar21 = new C31338x();
            this.f86564K0 = xVar21;
            xVar21.mo71714Q1(2);
            this.f86564K0.mo71716S1(getString(C10328q.cadastral_code));
            this.f86564K0.mo71717U1((String) this.f86603r0.get(22));
            this.f86597o0.add(this.f86564K0);
        }
        if (this.f86604s0) {
            this.f86597o0.remove(this.f86608w0);
            this.f86597o0.remove(this.f86556C0);
        }
        if (this.f86575V0) {
            this.f86597o0.remove(this.f86556C0);
        }
        if (this.f86578Y0 == TransferForm.TRANSFERTYPE.ACCOUNT) {
            this.f86597o0.remove(this.f86611z0);
        }
        if (m106352S4()) {
            this.f86597o0.remove(this.f86608w0);
        }
        if (m106354T4()) {
            this.f86597o0.remove(this.f86560G0);
        }
        if (!this.f86574U0 && !this.f86579Z0 && !this.f86580a1) {
            this.f86597o0.remove(0);
        }
        m106391r5();
        m106397v4(this.f86775c0);
        int i2 = this.f86775c0;
        if (i2 != 1) {
            ((C31355y) this.f86597o0.get(i2)).mo71733r1().putBoolean("WIZARD_FIELD_SHOULD_ANIMATE", true);
        }
        ((C31355y) this.f86597o0.get(this.f86775c0)).getArguments().putBoolean("WIZARD_FIELD_SHOULD_ANIMATE", true);
        mo87963n3(this.f86775c0, false);
        if (this.f86577X0 != null) {
            mo87874o5(false, true);
        }
        this.f86581b1 = ((C31355y) this.f86597o0.get(this.f86775c0)).mo67195H1();
        this.f86582c1 = m106360W4();
        mo87860S2();
        m106383k5();
    }

    /* renamed from: u4 */
    private void m106396u4() {
        mo87877q5(true, false);
        this.f86591l0.checkCadastralCode(this.f86564K0.mo71611z1(), new C35834a());
    }

    /* renamed from: v4 */
    private void m106397v4(int i) {
        if (!m106349Q4()) {
            this.f86775c0--;
        }
        if (i > 4 && this.f86578Y0 == TransferForm.TRANSFERTYPE.ACCOUNT) {
            this.f86775c0--;
        }
        if (i > 16 && (this.f86604s0 || m106352S4())) {
            this.f86775c0--;
        }
        if (i > 18 && m106354T4()) {
            this.f86775c0--;
        }
        if (i > 2) {
            this.f86775c0--;
        }
        if (i > 14) {
            this.f86775c0--;
        }
        if (i > 21) {
            this.f86775c0--;
        }
        if ((this.f86604s0 || this.f86575V0 || this.f86588i1) && i > 5) {
            this.f86775c0--;
        }
        if (i > 22 && !this.f86769W) {
            this.f86775c0--;
        }
        if (!m106358V4()) {
            if (i > 6) {
                this.f86775c0--;
            }
            if (i > 7) {
                this.f86775c0--;
            }
            if (i > 8) {
                this.f86775c0--;
            }
        }
        if (!this.f86584e1) {
            if (i > 13) {
                this.f86775c0--;
            }
            if (i > 11) {
                this.f86775c0--;
            }
            if (i > 12) {
                this.f86775c0--;
            }
            if (i > 20) {
                this.f86775c0--;
            }
            if (i > 17) {
                this.f86775c0--;
                return;
            }
            return;
        }
        if (i > 9) {
            this.f86775c0--;
        }
        if (i > 10) {
            this.f86775c0--;
        }
        ForeignBank i2 = this.f86569P0.mo94106i2();
        if ((i2 == null || i2.getCountryCode() != TransferCountryCode.COUNTRY_CODE_UNITED_ARAB_EMIRATES) && i > 13) {
            this.f86775c0--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (r7.filter(r1, 0, r1.length(), (android.text.Spanned) null, 0, 0) != null) goto L_0x0158;
     */
    /* renamed from: w4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m106398w4() {
        /*
            r14 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86559F0
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x000f
            r2 = r3
            goto L_0x0013
        L_0x000f:
            java.lang.String r2 = r2.mo71611z1()
        L_0x0013:
            r4 = 0
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86609x0
            if (r2 != 0) goto L_0x001f
            r2 = r3
            goto L_0x0023
        L_0x001f:
            java.lang.String r2 = r2.mo71611z1()
        L_0x0023:
            r4 = 1
            r1.set(r4, r2)
            ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE r1 = r14.f86578Y0
            ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE r2 = p341ge.bog.mobilebank.transfers.model.TransferForm.TRANSFERTYPE.PHONE
            r5 = 3
            if (r1 != r2) goto L_0x003c
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86611z0
            java.lang.String r2 = r2.mo71611z1()
            r6 = 26
            r1.set(r6, r2)
            goto L_0x0054
        L_0x003c:
            java.lang.String r1 = r14.m106403z4()
            java.util.ArrayList r2 = r14.f86603r0
            if (r1 != 0) goto L_0x0046
        L_0x0044:
            r1 = r3
            goto L_0x0051
        L_0x0046:
            java.lang.String r6 = r14.m106400x4(r1)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0051
            goto L_0x0044
        L_0x0051:
            r2.set(r5, r1)
        L_0x0054:
            boolean r1 = r14.f86588i1
            r2 = 5
            if (r1 != 0) goto L_0x007e
            c91.x r1 = r14.f86556C0
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = r1.mo71611z1()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x006f
            c91.x r1 = r14.f86556C0
            boolean r1 = r1.mo67195H1()
            if (r1 != 0) goto L_0x007e
        L_0x006f:
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r6 = r14.f86556C0
            if (r6 != 0) goto L_0x0077
            r6 = r3
            goto L_0x007b
        L_0x0077:
            java.lang.String r6 = r6.mo71611z1()
        L_0x007b:
            r1.set(r2, r6)
        L_0x007e:
            boolean r1 = r14.f86588i1
            r6 = 0
            if (r1 != 0) goto L_0x009f
            java.util.ArrayList r1 = r14.f86603r0
            java.lang.Object r1 = r1.get(r5)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x009f
            java.util.ArrayList r1 = r14.f86603r0
            r1.set(r2, r6)
            boolean r1 = r14.f86575V0
            if (r1 != 0) goto L_0x009f
            r14.f86604s0 = r4
            r14.m106383k5()
        L_0x009f:
            c91.x r1 = r14.f86557D0
            if (r1 == 0) goto L_0x00be
            java.lang.String r1 = r1.mo71611z1()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00be
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86557D0
            if (r2 != 0) goto L_0x00b5
            r2 = r3
            goto L_0x00b9
        L_0x00b5:
            java.lang.String r2 = r2.mo71611z1()
        L_0x00b9:
            r4 = 9
            r1.set(r4, r2)
        L_0x00be:
            c91.x r1 = r14.f86558E0
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = r1.mo71611z1()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00dd
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86558E0
            if (r2 != 0) goto L_0x00d4
            r2 = r3
            goto L_0x00d8
        L_0x00d4:
            java.lang.String r2 = r2.mo71611z1()
        L_0x00d8:
            r4 = 10
            r1.set(r4, r2)
        L_0x00dd:
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86554A0
            if (r2 != 0) goto L_0x00e5
            r2 = r3
            goto L_0x00e9
        L_0x00e5:
            java.lang.String r2 = r2.mo71629I2()
        L_0x00e9:
            r4 = 15
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86608w0
            if (r2 == 0) goto L_0x0106
            java.lang.String r2 = r2.mo71611z1()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00ff
            goto L_0x0106
        L_0x00ff:
            c91.x r2 = r14.f86608w0
            java.lang.String r2 = r2.mo71611z1()
            goto L_0x0108
        L_0x0106:
            java.lang.String r2 = "0"
        L_0x0108:
            r4 = 16
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86560G0
            if (r2 == 0) goto L_0x0125
            java.lang.String r2 = r2.mo71611z1()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x011e
            goto L_0x0125
        L_0x011e:
            c91.x r2 = r14.f86560G0
            java.lang.String r2 = r2.mo71611z1()
            goto L_0x0126
        L_0x0125:
            r2 = r3
        L_0x0126:
            r4 = 18
            r1.set(r4, r2)
            c91.x r1 = r14.f86561H0
            if (r1 == 0) goto L_0x015f
            java.lang.String r1 = r1.mo71611z1()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x015f
            c91.x r1 = r14.f86561H0
            android.text.InputFilter r7 = r1.mo71645S2()
            c91.x r1 = r14.f86561H0
            java.lang.String r1 = r1.mo71611z1()
            if (r7 == 0) goto L_0x0157
            r9 = 0
            int r10 = r1.length()
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r1
            java.lang.CharSequence r2 = r7.filter(r8, r9, r10, r11, r12, r13)
            if (r2 == 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r6 = r1
        L_0x0158:
            java.util.ArrayList r1 = r14.f86603r0
            r2 = 19
            r1.set(r2, r6)
        L_0x015f:
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86611z0
            if (r2 != 0) goto L_0x0167
            r2 = r3
            goto L_0x016b
        L_0x0167:
            java.lang.String r2 = r2.mo71611z1()
        L_0x016b:
            r4 = 4
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86555B0
            if (r2 != 0) goto L_0x0177
            r2 = r3
            goto L_0x017b
        L_0x0177:
            java.lang.String r2 = r2.mo71611z1()
        L_0x017b:
            r4 = 23
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86563J0
            if (r2 != 0) goto L_0x0188
            r2 = r3
            goto L_0x018c
        L_0x0188:
            java.lang.String r2 = r2.mo71611z1()
        L_0x018c:
            r4 = 24
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86562I0
            if (r2 != 0) goto L_0x0199
            r2 = r3
            goto L_0x019d
        L_0x0199:
            java.lang.String r2 = r2.mo71611z1()
        L_0x019d:
            r4 = 25
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86570Q0
            java.lang.String r2 = r2.mo71611z1()
            r4 = 20
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86566M0
            java.lang.String r2 = r2.mo71611z1()
            r4 = 7
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86567N0
            java.lang.String r2 = r2.mo71611z1()
            r4 = 8
            r1.set(r4, r2)
            java.util.ArrayList r1 = r14.f86603r0
            c91.x r2 = r14.f86564K0
            if (r2 != 0) goto L_0x01cf
            goto L_0x01d3
        L_0x01cf:
            java.lang.String r3 = r2.mo71611z1()
        L_0x01d3:
            r2 = 22
            r1.set(r2, r3)
            z61.h r1 = r14.f86571R0
            java.util.List r1 = r1.mo94129g2()
            android.os.Parcelable r1 = org.parceler.C42035e.m122121c(r1)
            java.lang.String r2 = "TRANSFER_WIZARD_ATTACHED_FILES"
            r0.putExtra(r2, r1)
            z61.d r1 = r14.f86569P0
            ge.bog.mobilebank.model.foreigntransfer.ForeignBank r1 = r1.mo94106i2()
            android.os.Parcelable r1 = org.parceler.C42035e.m122121c(r1)
            java.lang.String r2 = "TRANSFER_WIZARD_SELECTED_BENEFICIARY_BANK"
            r0.putExtra(r2, r1)
            z61.d r1 = r14.f86568O0
            ge.bog.mobilebank.model.foreigntransfer.ForeignBank r1 = r1.mo94106i2()
            android.os.Parcelable r1 = org.parceler.C42035e.m122121c(r1)
            java.lang.String r2 = "TRANSFER_WIZARD_SELECTED_INTERMIDIARY_BANK"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "WIZARD_COLLECTED_VALUES"
            java.util.ArrayList r2 = r14.f86603r0
            r0.putStringArrayListExtra(r1, r2)
            java.lang.String r1 = "TRANSFER_WIZARD_BANK_CODE"
            java.lang.String r2 = r14.f86606u0
            r0.putExtra(r1, r2)
            java.util.ArrayList r1 = r14.f86599p0
            android.os.Parcelable r1 = org.parceler.C42035e.m122121c(r1)
            java.lang.String r2 = "TRANSFER_WIZARD_DISPATCH_TYPES"
            r0.putExtra(r2, r1)
            java.util.ArrayList r1 = r14.f86601q0
            android.os.Parcelable r1 = org.parceler.C42035e.m122121c(r1)
            java.lang.String r2 = "TRANSFER_WIZARD_NOMINATION_LIST"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "TRANSFER_WIZARD_WITHIN_BANK"
            boolean r2 = r14.f86604s0
            r0.putExtra(r1, r2)
            java.lang.String r1 = "TRANSFER_TYPE"
            ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE r2 = r14.f86578Y0
            r0.putExtra(r1, r2)
            java.lang.String r1 = "TRANSFER_WIZARD_FOREIGN_TRANSFER"
            boolean r2 = r14.f86584e1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "IS_REAL_ESTATE"
            boolean r2 = r14.f86769W
            r0.putExtra(r1, r2)
            java.lang.String r1 = "REAL_ESTATE_DST_ALLOWED"
            boolean r2 = r14.f86605t0
            r0.putExtra(r1, r2)
            z61.j r1 = r14.f86565L0
            ge.bog.mobilebank.model.BogCountry r1 = r1.mo94131l2()
            java.lang.String r2 = "TRANSFER_WIZARD_RECIPIENT_COUNTRY"
            android.os.Parcelable r1 = org.parceler.C42035e.m122121c(r1)
            r0.putExtra(r2, r1)
            z61.d r1 = r14.f86569P0
            ge.bog.mobilebank.model.foreigntransfer.ForeignBank r1 = r1.mo94106i2()
            if (r1 == 0) goto L_0x027a
            ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode r1 = r1.getCountryCode()
            ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode r2 = p341ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode.COUNTRY_CODE_UNITED_ARAB_EMIRATES
            if (r1 != r2) goto L_0x027a
            z61.l r1 = r14.f86572S0
            ge.bog.mobilebank.model.foreigntransfer.ReportingCode r1 = r1.mo94137l2()
            android.os.Parcelable r1 = org.parceler.C42035e.m122121c(r1)
            java.lang.String r2 = "TRANSFER_WIZARD_REPORTING_CODE"
            r0.putExtra(r2, r1)
        L_0x027a:
            r1 = -1
            r14.setResult(r1, r0)
            r14.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.m106398w4():void");
    }

    /* renamed from: w5 */
    private void m106399w5() {
        boolean V4 = m106358V4();
        this.f86597o0.remove(this.f86565L0);
        this.f86597o0.remove(this.f86566M0);
        this.f86597o0.remove(this.f86567N0);
        this.f86556C0.mo71659Z3(V4);
        this.f86556C0.mo71647T3((C31338x.C31354o) null);
        this.f86561H0.mo71659Z3(V4);
        if (V4) {
            this.f86556C0.mo71647T3(new C40199b(this));
            int indexOf = this.f86597o0.indexOf(this.f86557D0);
            if (indexOf == -1) {
                indexOf = this.f86597o0.indexOf(this.f86554A0);
            }
            this.f86597o0.add(indexOf, this.f86565L0);
            int i = indexOf + 1;
            this.f86597o0.add(i, this.f86566M0);
            this.f86597o0.add(i + 1, this.f86567N0);
            if (!this.f86561H0.mo71611z1().matches("[A-Za-z0-9/\\-?:().,'+ ]*")) {
                this.f86561H0.mo71717U1(getString(C10328q.transfer_details_personal_transfer_en));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public String m106400x4(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("-", "").replace(" ", "");
    }

    /* renamed from: x5 */
    private void m106401x5() {
        int indexOf;
        this.f86597o0.remove(this.f86568O0);
        this.f86597o0.remove(this.f86569P0);
        this.f86597o0.remove(this.f86570Q0);
        this.f86597o0.remove(this.f86571R0);
        this.f86597o0.remove(this.f86572S0);
        if (this.f86584e1) {
            this.f86597o0.remove(this.f86557D0);
            this.f86597o0.remove(this.f86558E0);
            int indexOf2 = this.f86597o0.indexOf(this.f86567N0) + 1;
            this.f86597o0.add(indexOf2, this.f86568O0);
            int i = indexOf2 + 1;
            this.f86597o0.add(i, this.f86569P0);
            ForeignBank i2 = this.f86569P0.mo94106i2();
            if (i2 != null && i2.getCountryCode() == TransferCountryCode.COUNTRY_CODE_UNITED_ARAB_EMIRATES) {
                this.f86597o0.add(i + 1, this.f86572S0);
            }
            this.f86597o0.add(this.f86597o0.indexOf(this.f86608w0) + 1, this.f86571R0);
            this.f86597o0.add(this.f86597o0.indexOf(this.f86561H0) + 1, this.f86570Q0);
        } else if (!this.f86597o0.contains(this.f86558E0) && (indexOf = this.f86597o0.indexOf(this.f86554A0)) != -1) {
            this.f86597o0.add(indexOf, this.f86558E0);
            this.f86597o0.add(indexOf, this.f86557D0);
        }
    }

    /* renamed from: y5 */
    private void m106402y5() {
        if (!this.f86588i1) {
            C31338x xVar = this.f86610y0;
            xVar.mo71682v4(xVar.mo71611z1());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public String m106403z4() {
        if (!this.f86588i1) {
            return this.f86610y0.mo71611z1();
        }
        String i2 = this.f86573T0.mo93266i2();
        if (i2 != null) {
            return i2;
        }
        return "";
    }

    /* renamed from: z5 */
    public static void m106404z5(Activity activity, Intent intent, int i) {
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: A3 */
    public void mo87848A3() {
        C31338x xVar;
        C31338x xVar2 = this.f86562I0;
        if (!(xVar2 == null || (xVar = this.f86563J0) == null)) {
            xVar2.mo71653W3(xVar.mo71611z1());
        }
        mo87860S2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B4 */
    public String mo87849B4() {
        if (this.f86575V0) {
            return "PAYMENT_WITHIN_BUDGET";
        }
        if (this.f86604s0) {
            return "PAYMENT_WITHIN_BANK";
        }
        return "PAYMENT_WITHIN_GEORGIA";
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0063 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[Catch:{ Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: B5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87850B5() {
        /*
            r10 = this;
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r0 = r10.f86577X0     // Catch:{ Exception -> 0x0080 }
            ge.bog.mobilebank.model.account.AccountLovContainer r0 = r0.getAccountLovContainer()     // Catch:{ Exception -> 0x0080 }
            c91.x r1 = r10.f86609x0     // Catch:{ Exception -> 0x0080 }
            java.lang.String r1 = r1.mo71611z1()     // Catch:{ Exception -> 0x0080 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x0080 }
            int r3 = r10.m106337K4()     // Catch:{ Exception -> 0x0080 }
            r4 = 1
            f91.a r0 = f91.C31972b.m94378c(r0, r1, r3, r4)     // Catch:{ Exception -> 0x0080 }
            ge.bog.mobilebank.model.account.AccountLov r0 = r0.mo72458a()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r0 = r0.getCcy()     // Catch:{ Exception -> 0x0080 }
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0080 }
            c91.x r2 = r10.f86554A0     // Catch:{ Exception -> 0x0080 }
            java.lang.String r2 = r2.mo71611z1()     // Catch:{ Exception -> 0x0080 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0080 }
            java.math.BigDecimal r2 = r10.m106335J4()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r3 = "GEL"
            if (r0 != 0) goto L_0x0035
            r0 = r3
        L_0x0035:
            boolean r3 = r3.equals(r0)     // Catch:{ Exception -> 0x0080 }
            r5 = 0
            if (r3 != 0) goto L_0x0063
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r3 = r10.f86595n0     // Catch:{ Exception -> 0x0063 }
            ge.bog.mobilebank.model.CcyRatesWrapper r3 = r3.getCcyRates()     // Catch:{ Exception -> 0x0063 }
            ge.bog.mobilebank.model.CcyRate[] r3 = r3.getList()     // Catch:{ Exception -> 0x0063 }
            int r6 = r3.length     // Catch:{ Exception -> 0x0063 }
            r7 = r5
        L_0x0048:
            if (r7 >= r6) goto L_0x0063
            r8 = r3[r7]     // Catch:{ Exception -> 0x0063 }
            java.lang.String r9 = r8.getCcy()     // Catch:{ Exception -> 0x0063 }
            boolean r9 = r9.equals(r0)     // Catch:{ Exception -> 0x0063 }
            if (r9 == 0) goto L_0x0060
            java.math.BigDecimal r0 = r8.getCurrentRate()     // Catch:{ Exception -> 0x0063 }
            java.math.BigDecimal r0 = r1.multiply(r0)     // Catch:{ Exception -> 0x0063 }
            r1 = r0
            goto L_0x0063
        L_0x0060:
            int r7 = r7 + 1
            goto L_0x0048
        L_0x0063:
            long r0 = r1.longValue()     // Catch:{ Exception -> 0x0080 }
            long r6 = r2.longValue()     // Catch:{ Exception -> 0x0080 }
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            int r0 = p366bk.C10328q.transfer_error_transfer_limit     // Catch:{ Exception -> 0x0080 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ Exception -> 0x0080 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0080 }
            r1[r5] = r2     // Catch:{ Exception -> 0x0080 }
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x0080 }
            g91.C32297d.m95154b(r10, r0)     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity.mo87850B5():void");
    }

    /* renamed from: D4 */
    public boolean mo87851D4() {
        return this.f86588i1;
    }

    /* renamed from: F4 */
    public ArrayList mo87852F4() {
        return this.f86589j1;
    }

    /* renamed from: G4 */
    public void mo87853G4(String str, boolean z) {
        mo87854H4(str, z, false);
    }

    /* renamed from: H4 */
    public void mo87854H4(String str, boolean z, boolean z2) {
        boolean z3 = true;
        this.f86596n1 = true;
        this.f86602q1 = false;
        this.f86603r0.set(3, str);
        if (this.f86575V0) {
            this.f86591l0.getTreasureOwnerInfo(m106400x4(str), this.f86607v0, "1", new C35835b(str, z));
        } else {
            TransferForm.TRANSFERTYPE transfertype = this.f86578Y0;
            if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
                this.f86591l0.getAcctOwnerInfoMasked(m106400x4(str), this.f86607v0, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, new C35836c(str, z, z2));
            } else if (transfertype == TransferForm.TRANSFERTYPE.PHONE) {
                this.f86591l0.getAcctOwnerInfoMaskedWithPhone(str, this.f86607v0, new C35837d(str, z, z2));
            } else {
                this.f86591l0.getAcctOwnerInfo(m106400x4(str), this.f86607v0, "1", new C35838e(str, z, z2));
            }
        }
        if (!this.f86596n1 && !this.f86592l1 && !this.f86594m1) {
            z3 = false;
        }
        mo87877q5(z3, false);
    }

    /* renamed from: I4 */
    public String mo87855I4() {
        String str = this.f86590k1;
        if (str != null && str.length() > 0) {
            return this.f86590k1;
        }
        if (this.f86603r0.get(5) == null || ((String) this.f86603r0.get(5)).length() <= 0) {
            return null;
        }
        return (String) this.f86603r0.get(5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        boolean z;
        super.mo37451O1(bundle);
        C32335t0.m95369n(this);
        mo87969v3();
        this.f86754H.setText(getString(C10328q.button_text_save));
        this.f86577X0 = C32340v0.m95376b();
        this.f86603r0 = getIntent().getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
        this.f86599p0 = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_DISPATCH_TYPES"));
        this.f86606u0 = getIntent().getStringExtra("TRANSFER_WIZARD_BANK_CODE");
        this.f86575V0 = getIntent().getBooleanExtra("TRANSFER_FORCE_BUDGET", false);
        this.f86607v0 = getIntent().getStringExtra("TRANSFER_WIZARD_FROM_ACCOUNT_CCY");
        this.f86574U0 = getIntent().getBooleanExtra("IS_TEMPLATE", false);
        this.f86579Z0 = getIntent().getBooleanExtra("TRANSFER_IS_NEW_STO", false);
        this.f86580a1 = getIntent().getBooleanExtra("TRANSFER_IS_EDIT_STO", false);
        this.f86576W0 = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_STO_PERIOD_TYPES"));
        this.f86589j1 = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_OTHER_ACCOUNTS"));
        this.f86604s0 = getIntent().getBooleanExtra("TRANSFER_WIZARD_WITHIN_BANK", false);
        TransferForm.TRANSFERTYPE transfertype = (TransferForm.TRANSFERTYPE) getIntent().getSerializableExtra("TRANSFER_TYPE");
        this.f86578Y0 = transfertype;
        if (transfertype == null) {
            this.f86578Y0 = TransferForm.TRANSFERTYPE.ACCOUNT;
        }
        this.f86601q0 = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_NOMINATION_LIST"));
        this.f86584e1 = getIntent().getBooleanExtra("TRANSFER_WIZARD_FOREIGN_TRANSFER", false);
        this.f86769W = getIntent().getBooleanExtra("IS_REAL_ESTATE", false);
        this.f86605t0 = getIntent().getBooleanExtra("REAL_ESTATE_DST_ALLOWED", true);
        TransferContact transferContact = (TransferContact) getIntent().getParcelableExtra("TRANSFER_WIZARD_CONTACT");
        this.f86587h1 = transferContact;
        if (transferContact != null) {
            z = true;
        } else {
            z = false;
        }
        this.f86588i1 = z;
        m106395t5();
        mo87955L2().setLeftClickListener(new C40200c(this));
        mo87955L2().setRightClickListener(new C40201d(this));
        mo87900k3(this.f86776d0.mo87977d());
        mo87874o5(false, true);
    }

    /* renamed from: P2 */
    public int mo87856P2() {
        if (this.f86582c1 && !this.f86581b1) {
            int d = this.f86776d0.mo87977d();
            while (true) {
                d++;
                if (d >= this.f86597o0.size()) {
                    for (int i = 0; i < this.f86597o0.size() - 1; i++) {
                        if (!((C31355y) this.f86597o0.get(i)).mo67195H1() && m106347P4((C31355y) this.f86597o0.get(i))) {
                            return i;
                        }
                    }
                } else if (!((C31355y) this.f86597o0.get(d)).mo67195H1() && m106347P4((C31355y) this.f86597o0.get(d))) {
                    return d;
                }
            }
        }
        return this.f86776d0.mo87977d() + 1;
    }

    /* renamed from: Q */
    public void mo87857Q(int i) {
        int i2;
        super.mo87857Q(i);
        if (m106349Q4()) {
            i--;
        }
        boolean z = false;
        if (i == 0) {
            m106341M4();
            this.f86758L.setLeftFrameState(11);
            mo87874o5(false, false);
        } else if (i == 1) {
            m106345O4();
            this.f86758L.setRightFrameState(11);
            mo87874o5(false, false);
            String z4 = m106403z4();
            if (z4 != null) {
                i2 = z4.length();
            } else {
                i2 = 0;
            }
            if (!TextUtils.isEmpty(z4)) {
                TransferForm.TRANSFERTYPE transfertype = this.f86578Y0;
                if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
                    if (i2 == 11) {
                        mo87853G4(z4, true);
                    } else {
                        mo87965p3(false);
                        m106402y5();
                    }
                } else if (transfertype == TransferForm.TRANSFERTYPE.PHONE) {
                    C31338x xVar = this.f86610y0;
                    if (xVar != null) {
                        xVar.mo71670o3();
                    }
                } else if (this.f86575V0 && i2 == 11) {
                    mo87853G4(m106400x4(z4), true);
                } else if (i2 >= 6) {
                    if (i2 == 22 || i2 == 25) {
                        z = true;
                    }
                    mo87854H4(m106400x4(z4), true, z);
                } else {
                    mo87965p3(false);
                    m106402y5();
                }
            } else {
                m106402y5();
            }
        } else {
            m106339L4();
        }
        mo87860S2();
    }

    /* renamed from: Q2 */
    public int mo87858Q2() {
        return this.f86776d0.mo87977d() - 1;
    }

    /* renamed from: R4 */
    public boolean mo87859R4(int i) {
        return !TextUtils.isEmpty(((C31355y) this.f86597o0.get(i)).mo71611z1());
    }

    /* renamed from: S2 */
    public void mo87860S2() {
        mo87972z3(!m106360W4());
    }

    /* renamed from: X2 */
    public void mo87861X2() {
        String x1 = this.f86776d0.mo87976c().mo71737x1();
        if (x1 == null) {
            x1 = "";
        }
        new C10478k.C10483e(x1).mo27184b(C36546y.m108282F());
    }

    /* renamed from: X4 */
    public boolean mo87862X4() {
        return this.f86769W;
    }

    /* renamed from: Y4 */
    public boolean mo87863Y4(C31338x xVar) {
        return this.f86556C0 == xVar;
    }

    /* renamed from: a3 */
    public void mo87864a3() {
        mo87860S2();
    }

    /* renamed from: a5 */
    public boolean mo87865a5() {
        return this.f86604s0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d3 */
    public boolean mo87866d3() {
        for (int i = 0; i < this.f86597o0.size() - 1; i++) {
            if (!((C31355y) this.f86597o0.get(i)).mo67195H1() && m106347P4((C31355y) this.f86597o0.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e3 */
    public void mo87867e3() {
        super.mo87867e3();
        C31338x xVar = this.f86610y0;
        if (xVar != null) {
            if (xVar.mo71607t1().getLastInputType() == 304) {
                this.f86610y0.mo71607t1().setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE);
            } else {
                this.f86610y0.mo71607t1().setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo53121f3() {
        super.mo53121f3();
        m106398w4();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g3 */
    public void mo87868g3() {
        mo53121f3();
    }

    /* renamed from: g5 */
    public void mo87869g5(TransferNomination transferNomination) {
        int i;
        this.f86603r0.set(18, this.f86561H0.mo71611z1());
        this.f86597o0.remove(this.f86561H0);
        if ("Y".equals(transferNomination.additionalNomFlag)) {
            this.f86561H0.mo71717U1("");
            this.f86603r0.set(19, "");
            int i2 = 0;
            this.f86561H0.mo71718V1(false);
            while (true) {
                if (i2 >= this.f86597o0.size()) {
                    i = -1;
                    break;
                }
                C31355y yVar = (C31355y) this.f86597o0.get(i2);
                if ((yVar instanceof C31338x) && ((C31338x) yVar).mo71650V2() != null) {
                    i = i2 + 1;
                    break;
                }
                i2++;
            }
            if (i > 0 && i <= this.f86597o0.size()) {
                this.f86597o0.add(i, this.f86561H0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i3 */
    public void mo53122i3() {
        if (this.f86769W) {
            if (!this.f86605t0 && mo87956O2().equals(this.f86610y0.mo71705A1())) {
                C32297d.m95154b(this, C27950a.m86284a("error.transfers.real.estate.pmi.not.allowed"));
                this.f86752F.setOrange(false, false);
                return;
            } else if (this.f86564K0 == this.f86597o0.get(mo87922N2())) {
                m106396u4();
            }
        }
        if (this.f86578Y0 == TransferForm.TRANSFERTYPE.PHONE && mo87956O2().equals(this.f86610y0.mo71705A1())) {
            this.f86583d1 = true;
            mo87853G4(m106400x4(this.f86610y0.mo71611z1()), true);
        } else if (this.f86578Y0 == TransferForm.TRANSFERTYPE.PIN) {
            int N2 = mo87922N2() + 1;
            if (!m106349Q4()) {
                N2++;
            }
            if (N2 == 3) {
                this.f86583d1 = true;
                String z4 = m106403z4();
                this.f86603r0.set(3, z4);
                mo87853G4(m106400x4(z4), true);
                return;
            }
            super.mo53122i3();
        } else if (this.f86584e1) {
            String O2 = mo87956O2();
            if ("PAGE_DESTINATION_ACCOUNT".equals(O2)) {
                if ("GEL".equals(this.f86607v0)) {
                    C32297d.m95154b(this, getString(C10328q.transfer_in_gel_not_available_for_account_number));
                } else if (this.f86585f1) {
                    super.mo53122i3();
                } else if (this.f86586g1) {
                    C32297d.m95158f(this, getString(C10328q.invalid_iban_format_warning), C32297d.f79707c);
                    this.f86586g1 = false;
                } else {
                    this.f86586g1 = true;
                    super.mo53122i3();
                }
            } else if (!"PAGE_SOURCE_ACCOUNT".equals(O2) || !"GEL".equals(this.f86607v0)) {
                super.mo53122i3();
            } else {
                C32297d.m95154b(this, getString(C10328q.transfer_in_gel_not_available_for_account_number));
            }
        } else {
            super.mo53122i3();
        }
    }

    /* renamed from: j5 */
    public void mo87870j5(String str, String str2) {
        try {
            TransferForm.TRANSFERTYPE transfertype = this.f86578Y0;
            if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
                C36546y.m108282F().mo27152s("transfers", "other_transfers_pin", "select_suggested_acc");
                TransferForm.TRANSFERTYPE transfertype2 = TransferForm.TRANSFERTYPE.ACCOUNT;
                this.f86578Y0 = transfertype2;
                this.f86610y0.mo71666g4(transfertype2);
                this.f86597o0.remove(this.f86611z0);
                this.f86610y0.mo71716S1(getString(C10328q.transfers_title_receiver_account));
                this.f86610y0.mo71600T1(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
                this.f86610y0.mo71724c2();
            } else if (transfertype == TransferForm.TRANSFERTYPE.ACCOUNT) {
                C36546y.m108282F().mo27152s("transfers", "other_transfers_acc", "select_suggested_acc");
            }
            this.f86603r0.set(5, str2);
            C31338x xVar = this.f86556C0;
            if (xVar != null) {
                xVar.mo71717U1(str2);
            }
            C31338x xVar2 = this.f86610y0;
            if (xVar2 != null) {
                xVar2.mo71717U1(str);
                this.f86610y0.mo71626F3();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: l5 */
    public void mo87871l5() {
        if (this.f86578Y0 == TransferForm.TRANSFERTYPE.PHONE) {
            this.f86611z0.mo71717U1("");
            this.f86603r0.set(5, "");
            this.f86603r0.set(3, this.f86610y0.mo71611z1());
            m106393s5(false);
            mo87955L2().setBankLogo(-1);
            m106345O4();
        }
    }

    /* renamed from: m5 */
    public void mo87872m5() {
        if (this.f86578Y0 == TransferForm.TRANSFERTYPE.PIN) {
            this.f86589j1 = null;
            this.f86611z0.mo71717U1("");
            this.f86603r0.set(5, "");
            this.f86603r0.set(3, this.f86610y0.mo71611z1());
            this.f86610y0.mo71670o3();
            m106393s5(false);
            mo87955L2().setBankLogo(-1);
            this.f86610y0.mo71634K3(-1);
            this.f86610y0.mo71685x4();
            C31338x xVar = this.f86610y0;
            xVar.mo71682v4(xVar.mo71611z1());
            m106345O4();
        }
    }

    /* renamed from: n5 */
    public void mo87873n5(String str) {
        if (!this.f86588i1) {
            ArrayList arrayList = this.f86603r0;
            if (str == null) {
                str = "";
            }
            arrayList.set(3, str);
            this.f86603r0.set(5, "");
            this.f86556C0.mo71717U1("");
            this.f86610y0.mo71634K3(-1);
            this.f86610y0.mo71685x4();
        }
        if (!this.f86588i1 || !this.f86575V0) {
            mo87955L2().setBankLogo(-1);
            m106393s5(false);
            m106345O4();
        }
    }

    /* renamed from: o5 */
    public void mo87874o5(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        C35656p0 p0Var;
        Drawable drawable;
        if (this.f86577X0 != null) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (m106349Q4()) {
                    i2 = i4 + 1;
                } else {
                    i2 = i4;
                }
                if (z) {
                    i3 = mo87922N2();
                } else {
                    i3 = i2;
                }
                if (z) {
                    p0Var = (C31355y) this.f86597o0.get(mo87922N2());
                } else {
                    p0Var = (C31355y) this.f86597o0.get(i2);
                }
                if ((p0Var instanceof C31338x) && mo87859R4(i3)) {
                    C31338x xVar = (C31338x) p0Var;
                    if (xVar.mo71686y3()) {
                        C31971a c = C31972b.m94378c(this.f86577X0.getAccountLovContainer(), Long.parseLong(xVar.mo71611z1()), m106337K4(), true);
                        ProductProperties properties = ProductProperties.getProperties(c.mo72460c(), this.f86593m0, false);
                        try {
                            drawable = C0767a.m2895e(this, properties.getBackgroundImageId());
                        } catch (Exception unused) {
                            drawable = new ColorDrawable(C0767a.m2893c(this, C10318g.f28624I0));
                        }
                        if (((!z && mo87955L2().getLeftDrawable() == null) || z2) && c.mo72458a() != null) {
                            mo87955L2().setLeft(drawable, z, c.mo72458a().getAccountTitle(), c.mo72458a().getRealAmountFormatted(), true);
                        }
                        mo87955L2().setTextColorIds(properties.getTitleColorId(), xVar.mo71686y3());
                    }
                }
            }
        }
    }

    public void onBackPressed() {
        m106398w4();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    /* renamed from: p0 */
    public void mo87875p0(TransferCountryCode transferCountryCode) {
        this.f86597o0.remove(this.f86572S0);
        if (transferCountryCode == TransferCountryCode.COUNTRY_CODE_UNITED_ARAB_EMIRATES) {
            this.f86597o0.add(this.f86597o0.indexOf(this.f86569P0) + 1, this.f86572S0);
        }
    }

    /* renamed from: p5 */
    public void mo87876p5(String str) {
        this.f86607v0 = str;
        this.f86554A0.mo71719W1(C32303f.m95198i(str, true));
        if ("GEL".equals(str)) {
            this.f86556C0.mo71632J3(true);
        } else {
            this.f86556C0.mo71632J3(false);
        }
    }

    /* renamed from: q5 */
    public void mo87877q5(boolean z, boolean z2) {
        if (z) {
            this.f86752F.setTextColor(0);
            this.f86763Q.setVisibility(0);
            this.f86752F.setAlpha(C32359z0.m95537H(C10323l.next_button_dim_alpha, this));
            mo87965p3(false);
            return;
        }
        if (z2) {
            this.f86752F.setTextColor(-1);
        } else {
            this.f86752F.setTextColor(-16777216);
        }
        mo87965p3(z2);
        this.f86763Q.setVisibility(8);
        this.f86752F.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public boolean mo87878t3() {
        if (!this.f86582c1 || this.f86581b1) {
            return false;
        }
        return !m106360W4();
    }

    /* renamed from: u3 */
    public boolean mo87879u3() {
        return this.f86581b1 && m106360W4();
    }

    /* renamed from: u5 */
    public void mo87880u5() {
        if (this.f86609x0.mo71611z1() != null) {
            this.f86560G0.mo71655X3((ArrayList) null);
            this.f86597o0.remove(this.f86560G0);
            try {
                this.f86607v0 = this.f86609x0.mo71658Z2();
            } catch (Exception unused) {
            }
            m106329E4(this.f86607v0);
            mo87860S2();
        }
    }

    /* renamed from: v5 */
    public void mo87881v5(boolean z) {
        int i;
        int i2;
        if (z) {
            this.f86608w0.mo71644R3((ArrayList) null);
        }
        this.f86597o0.remove(this.f86608w0);
        this.f86597o0.remove(this.f86556C0);
        if (!this.f86588i1 && !this.f86604s0 && !this.f86575V0) {
            if (this.f86574U0 || this.f86579Z0 || this.f86580a1) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            this.f86597o0.add(i2, this.f86556C0);
        }
        if (!this.f86604s0 && !m106352S4()) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f86597o0.size()) {
                    i = -1;
                    break;
                }
                C31355y yVar = (C31355y) this.f86597o0.get(i3);
                if ((yVar instanceof C31338x) && ((C31338x) yVar).mo71675r3()) {
                    i = i3 + 1;
                    break;
                }
                i3++;
            }
            if (i > 0 && i <= this.f86597o0.size()) {
                this.f86597o0.add(i, this.f86608w0);
            }
            if (this.f86608w0.mo71643R2() == null) {
                try {
                    m106322A4(this.f86609x0.mo71658Z2());
                } catch (Exception unused) {
                    m106322A4(this.f86607v0);
                }
            }
        }
        m106399w5();
        m106401x5();
        mo87860S2();
    }

    /* renamed from: y4 */
    public TransferContact mo87882y4() {
        return this.f86587h1;
    }
}
