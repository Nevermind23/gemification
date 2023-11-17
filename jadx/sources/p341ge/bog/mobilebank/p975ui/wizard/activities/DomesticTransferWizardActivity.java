package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.C0238h;
import c91.C31338x;
import c91.C31355y;
import com.github.mikephil.charting.utils.Utils;
import f91.C31971a;
import f91.C31972b;
import g91.C32297d;
import g91.C32303f;
import g91.C32304f0;
import g91.C32307h;
import g91.C32335t0;
import g91.C32340v0;
import hd1.C41205b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.RateWeight;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.AccountLoveDebit;
import p341ge.bog.mobilebank.model.account.TransferRate;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10328q;
import p380ck.C10478k;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity */
public class DomesticTransferWizardActivity extends C35872g {

    /* renamed from: A0 */
    private C31338x f86631A0;

    /* renamed from: B0 */
    private C31338x f86632B0;

    /* renamed from: C0 */
    private C31338x f86633C0;

    /* renamed from: D0 */
    private C31338x f86634D0;

    /* renamed from: E0 */
    private String f86635E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public BigDecimal f86636F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public BigDecimal f86637G0;

    /* renamed from: H0 */
    private boolean f86638H0;

    /* renamed from: I0 */
    private DDSTO f86639I0;

    /* renamed from: J0 */
    private boolean f86640J0;

    /* renamed from: K0 */
    private boolean f86641K0;

    /* renamed from: L0 */
    private long[] f86642L0;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public double f86643M0;

    /* renamed from: N0 */
    private boolean f86644N0 = false;

    /* renamed from: O0 */
    private int f86645O0;

    /* renamed from: P0 */
    private AccountLovEvent f86646P0;

    /* renamed from: Q0 */
    private boolean f86647Q0;

    /* renamed from: R0 */
    private boolean f86648R0;

    /* renamed from: S0 */
    private boolean f86649S0;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public String f86650T0;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public String f86651U0;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public RateWeight f86652V0;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public String f86653W0;

    /* renamed from: l0 */
    protected BankApi f86654l0;

    /* renamed from: m0 */
    protected Client f86655m0;

    /* renamed from: n0 */
    protected PreferencesApiManager f86656n0;

    /* renamed from: o0 */
    private ArrayList f86657o0 = new ArrayList();

    /* renamed from: p0 */
    private ArrayList f86658p0 = new ArrayList();

    /* renamed from: q0 */
    private ArrayList f86659q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public ArrayList f86660r0;

    /* renamed from: s0 */
    private boolean f86661s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public C31338x f86662t0;

    /* renamed from: u0 */
    private C31338x f86663u0;

    /* renamed from: v0 */
    private C31338x f86664v0;

    /* renamed from: w0 */
    private C31338x f86665w0;

    /* renamed from: x0 */
    private C31338x f86666x0;

    /* renamed from: y0 */
    private C31338x f86667y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public C31338x f86668z0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity$a */
    class C35841a implements View.OnClickListener {
        C35841a() {
        }

        public void onClick(View view) {
            if (DomesticTransferWizardActivity.this.mo87922N2() != DomesticTransferWizardActivity.this.m106480k4()) {
                DomesticTransferWizardActivity domesticTransferWizardActivity = DomesticTransferWizardActivity.this;
                domesticTransferWizardActivity.mo87963n3(domesticTransferWizardActivity.m106480k4() ? 1 : 0, true);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity$b */
    class C35842b implements View.OnClickListener {
        C35842b() {
        }

        public void onClick(View view) {
            int i;
            int N2 = DomesticTransferWizardActivity.this.mo87922N2();
            int i2 = 2;
            if (DomesticTransferWizardActivity.this.m106480k4()) {
                i = 2;
            } else {
                i = 1;
            }
            if (N2 != i) {
                DomesticTransferWizardActivity domesticTransferWizardActivity = DomesticTransferWizardActivity.this;
                if (!domesticTransferWizardActivity.m106480k4()) {
                    i2 = 1;
                }
                domesticTransferWizardActivity.mo87963n3(i2, true);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity$c */
    class C35843c extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ AccountLov f86671a;

        /* renamed from: b */
        final /* synthetic */ AccountLov f86672b;

        C35843c(AccountLov accountLov, AccountLov accountLov2) {
            this.f86671a = accountLov;
            this.f86672b = accountLov2;
        }

        public void onEnqueue(C41205b bVar) {
            DomesticTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            DomesticTransferWizardActivity.this.mo87860S2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                String stringExtra = DomesticTransferWizardActivity.this.getIntent().getStringExtra("TRANSFER_WIZARD_CONVERSION_TYPE");
                if (stringExtra != null && !stringExtra.isEmpty()) {
                    String[] split = stringExtra.split("#");
                    if (DomesticTransferWizardActivity.this.f86643M0 > Utils.DOUBLE_EPSILON && split[0].equals(this.f86671a.getCcy()) && split[1].equals(this.f86672b.getCcy())) {
                        ((RateWeight) bankApiResponse.getResult()).setRate(new BigDecimal(DomesticTransferWizardActivity.this.f86643M0));
                    }
                }
                DomesticTransferWizardActivity domesticTransferWizardActivity = DomesticTransferWizardActivity.this;
                domesticTransferWizardActivity.f86653W0 = this.f86671a.getCcy() + "#" + this.f86672b.getCcy();
                DomesticTransferWizardActivity.this.f86652V0 = (RateWeight) bankApiResponse.getResult();
                DomesticTransferWizardActivity.this.f86650T0 = ((RateWeight) bankApiResponse.getResult()).getCcy1();
                DomesticTransferWizardActivity.this.f86651U0 = ((RateWeight) bankApiResponse.getResult()).getCcy2();
                if (DomesticTransferWizardActivity.this.f86650T0.equals(this.f86671a.getCcy())) {
                    DomesticTransferWizardActivity.this.f86636F0 = ((RateWeight) bankApiResponse.getResult()).getRateWeight();
                    DomesticTransferWizardActivity.this.f86637G0 = ((RateWeight) bankApiResponse.getResult()).getRate();
                } else {
                    DomesticTransferWizardActivity.this.f86637G0 = ((RateWeight) bankApiResponse.getResult()).getRateWeight();
                    DomesticTransferWizardActivity.this.f86636F0 = ((RateWeight) bankApiResponse.getResult()).getRate();
                }
                if (DomesticTransferWizardActivity.this.f86776d0.mo87976c() == DomesticTransferWizardActivity.this.f86662t0) {
                    DomesticTransferWizardActivity.this.f86662t0.mo71664d4(DomesticTransferWizardActivity.this.f86636F0, DomesticTransferWizardActivity.this.f86637G0, this.f86671a.getCcy(), this.f86672b.getCcy(), DomesticTransferWizardActivity.this.f86650T0, DomesticTransferWizardActivity.this.f86651U0, ((RateWeight) bankApiResponse.getResult()).getRateWeight());
                }
            } else {
                C32297d.m95154b(DomesticTransferWizardActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            }
            DomesticTransferWizardActivity.this.mo87860S2();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity$d */
    class C35844d extends RestCallback {
        C35844d() {
        }

        public void onEnqueue(C41205b bVar) {
            DomesticTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess() && !TextUtils.isEmpty((CharSequence) bankApiResponse.getResult())) {
                DomesticTransferWizardActivity.this.f86660r0.set(19, (String) bankApiResponse.getResult());
                DomesticTransferWizardActivity.this.f86668z0.mo71717U1((String) bankApiResponse.getResult());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.DomesticTransferWizardActivity$e */
    class C35845e extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ boolean f86675a;

        C35845e(boolean z) {
            this.f86675a = z;
        }

        public void onEnqueue(C41205b bVar) {
            DomesticTransferWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            DomesticTransferWizardActivity.this.mo87860S2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (!bankApiResponse.isSuccess()) {
                C32297d.m95154b(DomesticTransferWizardActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            } else if (DomesticTransferWizardActivity.this.mo87892X3()) {
                DomesticTransferWizardActivity.this.f86662t0.mo71674q4(this.f86675a, ((TransferRate) bankApiResponse.getResult()).getFromAmount().toString(), ((TransferRate) bankApiResponse.getResult()).getToAmount().toString());
            } else {
                DomesticTransferWizardActivity.this.f86662t0.mo71674q4(this.f86675a, ((TransferRate) bankApiResponse.getResult()).getToAmount().toString(), ((TransferRate) bankApiResponse.getResult()).getFromAmount().toString());
            }
            DomesticTransferWizardActivity.this.mo87860S2();
        }
    }

    static {
        C0238h.m788K(true);
    }

    /* renamed from: U3 */
    private void m106472U3() {
        C31971a aVar;
        if (this.f86646P0 != null) {
            long e4 = mo87899e4();
            long a4 = mo87895a4();
            C31971a aVar2 = null;
            if (a4 > 0) {
                aVar = C31972b.m94378c(this.f86646P0.getAccountLovContainer(), a4, 0, true);
            } else {
                aVar = null;
            }
            if (e4 > 0) {
                aVar2 = C31972b.m94378c(this.f86646P0.getAccountLovContainer(), e4, 0, false);
            }
            if (aVar2 == null || aVar == null || aVar.mo72458a() == null || aVar2.mo72458a() == null) {
                mo87908u4(false);
            } else if (!aVar2.mo72458a().getCcy().equals(aVar.mo72458a().getCcy())) {
                mo87908u4(true);
            } else {
                mo87908u4(false);
            }
        }
    }

    /* renamed from: V3 */
    private void m106473V3(int i) {
        boolean z;
        if (!this.f86638H0 && !this.f86640J0 && !this.f86641K0) {
            this.f86775c0--;
        }
        if (i > 5) {
            this.f86775c0--;
        }
        if (i > 4) {
            this.f86775c0--;
        }
        if (i > 9) {
            this.f86775c0--;
        }
        if (i > 10) {
            this.f86775c0--;
        }
        if (i > 16) {
            this.f86775c0--;
        }
        if (i > 18) {
            this.f86775c0--;
        }
        if (i > 6) {
            this.f86775c0--;
        }
        if (i > 7) {
            this.f86775c0--;
        }
        if (i > 8) {
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
        }
        if (i > 13) {
            this.f86775c0--;
        }
        if (i > 22 && !this.f86769W) {
            this.f86775c0--;
        }
        boolean z2 = !m106481n4();
        if (z2 || !m106482o4()) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = !z;
        if (this.f86641K0) {
            String str = this.f86639I0.productCode;
            str.hashCode();
            if (str.equals("STO")) {
                if (i > 2) {
                    this.f86775c0--;
                }
                if (i > 14) {
                    this.f86775c0--;
                }
                if (i > 21) {
                    this.f86775c0--;
                }
            } else if (str.equals("BILL")) {
                if (i > 1) {
                    this.f86775c0--;
                }
                if (i > 14) {
                    this.f86775c0--;
                }
                if (i > 15) {
                    this.f86775c0--;
                }
                if (i > 19) {
                    this.f86775c0--;
                }
                if (i > 23) {
                    this.f86775c0--;
                }
                if (i > 24) {
                    this.f86775c0--;
                }
            }
        } else if (z2) {
            if (i > 2) {
                this.f86775c0--;
            }
            if (i > 14) {
                this.f86775c0--;
            }
            if (i > 21) {
                this.f86775c0--;
            }
        } else if (z) {
            if (i > 2) {
                this.f86775c0--;
            }
            if (i > 21) {
                this.f86775c0--;
            }
        } else if (z3) {
            if (i > 2) {
                this.f86775c0--;
            }
            if (i > 15) {
                this.f86775c0--;
            }
            if (i > 19) {
                this.f86775c0--;
            }
            if (i > 23) {
                this.f86775c0--;
            }
            if (i > 24) {
                this.f86775c0--;
            }
        }
    }

    /* renamed from: W3 */
    private void m106474W3() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        ArrayList arrayList = this.f86660r0;
        C31338x xVar = this.f86632B0;
        String str11 = "";
        if (xVar == null) {
            str = str11;
        } else {
            str = xVar.mo71611z1();
        }
        arrayList.set(0, str);
        ArrayList arrayList2 = this.f86660r0;
        C31338x xVar2 = this.f86633C0;
        if (xVar2 == null) {
            str2 = str11;
        } else {
            str2 = xVar2.mo71611z1();
        }
        arrayList2.set(1, str2);
        ArrayList arrayList3 = this.f86660r0;
        C31338x xVar3 = this.f86666x0;
        if (xVar3 == null) {
            str3 = str11;
        } else {
            str3 = xVar3.mo71611z1();
        }
        arrayList3.set(2, str3);
        ArrayList arrayList4 = this.f86660r0;
        C31338x xVar4 = this.f86664v0;
        if (xVar4 == null) {
            str4 = str11;
        } else {
            str4 = xVar4.mo71611z1();
        }
        arrayList4.set(3, str4);
        ArrayList arrayList5 = this.f86660r0;
        C31338x xVar5 = this.f86665w0;
        if (xVar5 == null) {
            str5 = str11;
        } else {
            str5 = xVar5.mo71611z1();
        }
        arrayList5.set(14, str5);
        ArrayList arrayList6 = this.f86660r0;
        C31338x xVar6 = this.f86662t0;
        if (xVar6 == null) {
            str6 = str11;
        } else {
            str6 = xVar6.mo71629I2();
        }
        arrayList6.set(15, str6);
        C31338x xVar7 = this.f86668z0;
        if (xVar7 != null && !TextUtils.isEmpty(xVar7.mo71611z1())) {
            ArrayList arrayList7 = this.f86660r0;
            C31338x xVar8 = this.f86668z0;
            if (xVar8 == null) {
                str10 = str11;
            } else {
                str10 = xVar8.mo71611z1();
            }
            arrayList7.set(19, str10);
        }
        C31338x xVar9 = this.f86663u0;
        if (xVar9 != null && !TextUtils.isEmpty(xVar9.mo71611z1())) {
            ArrayList arrayList8 = this.f86660r0;
            C31338x xVar10 = this.f86663u0;
            if (xVar10 == null) {
                str9 = str11;
            } else {
                str9 = xVar10.mo71611z1();
            }
            arrayList8.set(21, str9);
        }
        ArrayList arrayList9 = this.f86660r0;
        C31338x xVar11 = this.f86667y0;
        if (xVar11 == null) {
            str7 = str11;
        } else {
            str7 = xVar11.mo71611z1();
        }
        arrayList9.set(23, str7);
        ArrayList arrayList10 = this.f86660r0;
        C31338x xVar12 = this.f86631A0;
        if (xVar12 == null) {
            str8 = str11;
        } else {
            str8 = xVar12.mo71611z1();
        }
        arrayList10.set(24, str8);
        ArrayList arrayList11 = this.f86660r0;
        C31338x xVar13 = this.f86634D0;
        if (xVar13 != null) {
            str11 = xVar13.mo71611z1();
        }
        arrayList11.set(25, str11);
        if (!(this.f86636F0 == null || this.f86637G0 == null)) {
            if (this.f86662t0.mo71648U2() != Utils.DOUBLE_EPSILON) {
                intent.putExtra("TRANSFER_WIZARD_RATE", this.f86662t0.mo71648U2());
                intent.putExtra("TRANSFER_WIZARD_CONVERSION_TYPE", this.f86653W0);
            }
            intent.putExtra("TRANSFER_WIZARD_TO_RATE", this.f86637G0.toString());
            intent.putExtra("TRANSFER_WIZARD_FROM_RATE", this.f86636F0.toString());
            intent.putExtra("TRANSFER_WIZARD_FROM_IS_STRONGER", mo87892X3());
            if (this.f86662t0.mo71656Y2() != null) {
                intent.putExtra("TRANSFER_WIZARD_EXCHANGED", this.f86662t0.mo71656Y2());
            }
            intent.putExtra("TRANSFER_WIZARD_EXCHANGED_BUY", this.f86662t0.mo71733r1().getBoolean("TRANSFER_WIZARD_EXCHANGED_BUY", false));
            intent.putExtra("TRANSFER_WIZARD_RATE_WEIGHT", C42035e.m122121c(this.f86652V0));
        }
        intent.putStringArrayListExtra("WIZARD_COLLECTED_VALUES", this.f86660r0);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: f4 */
    private BigDecimal m106475f4() {
        int g4 = m106476g4();
        if (g4 == 1) {
            return this.f86646P0.getAccountLovContainer().getBank().amountLimit;
        }
        if (g4 == 2) {
            return this.f86646P0.getAccountLovContainer().getGeorgia().amountLimit;
        }
        if (g4 != 3) {
            return this.f86646P0.getAccountLovContainer().getDomestic().amountLimit;
        }
        return this.f86646P0.getAccountLovContainer().getConversion().amountLimit;
    }

    /* renamed from: g4 */
    private int m106476g4() {
        return mo87902m4() ? 3 : 0;
    }

    /* renamed from: h4 */
    private void m106477h4() {
        if (!TextUtils.isEmpty(this.f86633C0.mo71611z1()) || !TextUtils.isEmpty(this.f86666x0.mo71611z1())) {
            this.f86758L.setLeftFrameState(12);
        } else {
            this.f86758L.setLeftColor(17170445, false, true);
            this.f86758L.setLeftFrameState(10);
        }
        if (TextUtils.isEmpty(this.f86664v0.mo71611z1())) {
            this.f86758L.setRightColor(17170445, false, true);
            this.f86758L.setRightFrameState(10);
            return;
        }
        this.f86758L.setRightFrameState(12);
    }

    /* renamed from: i4 */
    private void m106478i4() {
        if (!TextUtils.isEmpty(this.f86664v0.mo71611z1())) {
            this.f86758L.setRightFrameState(12);
        } else {
            this.f86758L.setRightFrameState(10);
            this.f86758L.setRightColor(17170445, false, true);
        }
        if (TextUtils.isEmpty(this.f86633C0.mo71611z1()) && TextUtils.isEmpty(this.f86666x0.mo71611z1())) {
            this.f86758L.setLeftColor(C32335t0.m95359d(this, true), false, true);
        }
    }

    /* renamed from: j4 */
    private void m106479j4() {
        if (!TextUtils.isEmpty(this.f86633C0.mo71611z1()) || !TextUtils.isEmpty(this.f86666x0.mo71611z1())) {
            this.f86758L.setLeftFrameState(12);
        } else {
            this.f86758L.setLeftFrameState(10);
            this.f86758L.setLeftColor(17170445, false, true);
        }
        if (TextUtils.isEmpty(this.f86664v0.mo71611z1())) {
            this.f86758L.setRightColor(C32335t0.m95359d(this, true), false, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public boolean m106480k4() {
        return this.f86640J0 || this.f86641K0 || this.f86638H0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* renamed from: n4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m106481n4() {
        /*
            r11 = this;
            boolean r0 = r11.f86640J0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r0 = r11.f86646P0
            r2 = 1
            if (r0 == 0) goto L_0x009d
            ge.bog.mobilebank.model.account.AccountDebitLoveWrapper r0 = r0.getAccountDebitLoveWrapper()
            if (r0 == 0) goto L_0x009d
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r0 = r11.f86646P0
            ge.bog.mobilebank.model.account.AccountDebitLoveWrapper r0 = r0.getAccountDebitLoveWrapper()
            java.util.ArrayList<ge.bog.mobilebank.model.account.AccountLoveDebit> r0 = r0.cardDebits
            if (r0 == 0) goto L_0x009d
            long r3 = r11.mo87895a4()
            long r5 = r11.mo87899e4()
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r0 = r11.f86646P0
            ge.bog.mobilebank.model.account.AccountDebitLoveWrapper r0 = r0.getAccountDebitLoveWrapper()
            java.util.ArrayList<ge.bog.mobilebank.model.account.AccountLoveDebit> r0 = r0.cardDebits
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0043
            java.lang.Object r7 = r0.next()
            ge.bog.mobilebank.model.account.AccountLoveDebit r7 = (p341ge.bog.mobilebank.model.account.AccountLoveDebit) r7
            long r7 = r7.acctKey
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
            r0 = r2
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            boolean r3 = r11.mo87902m4()
            if (r3 == 0) goto L_0x0059
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r3 = r11.f86646P0
            ge.bog.mobilebank.model.account.AccountLovContainer r3 = r3.getAccountLovContainer()
            ge.bog.mobilebank.model.account.AccountLovHolder r3 = r3.getConversion()
            java.util.ArrayList r3 = r3.getDst()
            goto L_0x0067
        L_0x0059:
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r3 = r11.f86646P0
            ge.bog.mobilebank.model.account.AccountLovContainer r3 = r3.getAccountLovContainer()
            ge.bog.mobilebank.model.account.AccountLovHolder r3 = r3.getDomestic()
            java.util.ArrayList r3 = r3.getDst()
        L_0x0067:
            if (r3 == 0) goto L_0x0086
            java.util.Iterator r3 = r3.iterator()
        L_0x006d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r3.next()
            ge.bog.mobilebank.model.account.AccountLov r4 = (p341ge.bog.mobilebank.model.account.AccountLov) r4
            long r7 = r4.getId()
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006d
            boolean r3 = r4.isCreditCard()
            goto L_0x0087
        L_0x0086:
            r3 = r1
        L_0x0087:
            if (r3 == 0) goto L_0x009f
            if (r0 == 0) goto L_0x009f
            long[] r4 = r11.f86642L0
            if (r4 == 0) goto L_0x009f
            int r7 = r4.length
            r8 = r1
        L_0x0091:
            if (r8 >= r7) goto L_0x009f
            r9 = r4[r8]
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x009a
            r3 = r1
        L_0x009a:
            int r8 = r8 + 1
            goto L_0x0091
        L_0x009d:
            r0 = r1
            r3 = r0
        L_0x009f:
            if (r3 == 0) goto L_0x00a3
            if (r0 != 0) goto L_0x00aa
        L_0x00a3:
            c91.x r4 = r11.f86665w0
            java.lang.String r5 = ""
            r4.mo71717U1(r5)
        L_0x00aa:
            if (r0 == 0) goto L_0x00af
            if (r3 == 0) goto L_0x00af
            r1 = r2
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity.m106481n4():boolean");
    }

    /* renamed from: o4 */
    private boolean m106482o4() {
        try {
            if (!m106481n4() || Integer.parseInt(this.f86665w0.mo71611z1()) != 0) {
                return true;
            }
            this.f86662t0.mo71717U1("");
            this.f86667y0.mo71717U1("");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: p4 */
    private boolean m106483p4() {
        if (m106481n4() && m106482o4() && (TextUtils.isEmpty(this.f86662t0.mo71611z1()) || Double.parseDouble(this.f86662t0.mo71611z1()) <= Utils.DOUBLE_EPSILON)) {
            return true;
        }
        Iterator it = this.f86658p0.iterator();
        while (it.hasNext()) {
            C31355y yVar = (C31355y) it.next();
            if (!yVar.mo67195H1() && TextUtils.isEmpty(yVar.mo71611z1())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v4 */
    private void m106484v4() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        DDSTO ddsto;
        boolean z9;
        boolean z12;
        boolean z13;
        DDSTO ddsto2;
        DDSTO ddsto3;
        C31338x xVar = new C31338x();
        this.f86632B0 = xVar;
        xVar.mo71714Q1(2);
        this.f86632B0.mo71600T1(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
        C31338x xVar2 = this.f86632B0;
        if (this.f86640J0 || this.f86641K0) {
            z = true;
        } else {
            z = false;
        }
        xVar2.mo71649U3(z);
        if (this.f86640J0 || this.f86641K0) {
            this.f86632B0.mo71716S1(getString(C10328q.sto_title_name));
            this.f86632B0.mo71712O1(true);
        } else {
            this.f86632B0.mo71716S1(getString(C10328q.common_text_template_name));
        }
        ArrayList arrayList = this.f86660r0;
        if (arrayList != null) {
            this.f86632B0.mo71717U1((String) arrayList.get(0));
        }
        this.f86657o0.add(this.f86632B0);
        C31338x xVar3 = new C31338x();
        this.f86633C0 = xVar3;
        xVar3.mo71714Q1(0);
        C31338x xVar4 = this.f86633C0;
        int i = C10328q.transfer_wizard_from_where_transfer;
        xVar4.mo71721Y1(getString(i));
        C31338x xVar5 = this.f86633C0;
        if (this.f86640J0 || this.f86641K0) {
            z2 = true;
        } else {
            z2 = false;
        }
        xVar5.mo71649U3(z2);
        this.f86633C0.mo71665f4(true);
        ArrayList arrayList2 = this.f86660r0;
        if (arrayList2 != null) {
            this.f86633C0.mo71717U1((String) arrayList2.get(1));
        }
        this.f86657o0.add(this.f86633C0);
        C31338x xVar6 = new C31338x();
        this.f86666x0 = xVar6;
        xVar6.mo71714Q1(4);
        this.f86666x0.mo71721Y1(getString(i));
        C31338x xVar7 = this.f86666x0;
        if (this.f86640J0 || this.f86641K0) {
            z3 = true;
        } else {
            z3 = false;
        }
        xVar7.mo71649U3(z3);
        ArrayList<AccountLoveDebit> arrayList3 = new ArrayList<>();
        if (this.f86641K0 && (ddsto3 = this.f86639I0) != null && "BILL".equals(ddsto3.productCode)) {
            arrayList3 = this.f86646P0.getAccountDebitLoveWrapper().cardDebits;
        }
        this.f86666x0.mo71639O3(arrayList3);
        ArrayList arrayList4 = this.f86660r0;
        if (arrayList4 != null) {
            this.f86666x0.mo71717U1((String) arrayList4.get(2));
        }
        this.f86657o0.add(this.f86666x0);
        C31338x xVar8 = new C31338x();
        this.f86664v0 = xVar8;
        xVar8.mo71714Q1(0);
        this.f86664v0.mo71721Y1(getString(C10328q.transfer_wizard_where_transfer));
        C31338x xVar9 = this.f86664v0;
        if (this.f86640J0 || this.f86641K0) {
            z4 = true;
        } else {
            z4 = false;
        }
        xVar9.mo71649U3(z4);
        C31338x xVar10 = this.f86664v0;
        if (!this.f86641K0 || (ddsto2 = this.f86639I0) == null) {
            z5 = false;
        } else {
            z5 = "BILL".equals(ddsto2.productCode);
        }
        xVar10.mo71657Y3(z5);
        ArrayList arrayList5 = this.f86660r0;
        if (arrayList5 != null) {
            this.f86664v0.mo71717U1((String) arrayList5.get(3));
        }
        this.f86657o0.add(this.f86664v0);
        C31338x xVar11 = new C31338x();
        this.f86665w0 = xVar11;
        xVar11.mo71714Q1(1);
        this.f86665w0.mo71716S1(getString(C10328q.sto_title_select_transfer_type));
        C31338x xVar12 = this.f86665w0;
        if (this.f86640J0 || this.f86641K0) {
            z6 = true;
        } else {
            z6 = false;
        }
        xVar12.mo71649U3(z6);
        ArrayList arrayList6 = new ArrayList();
        int i2 = 0;
        while (true) {
            int[] iArr = C32307h.f79723e;
            if (i2 >= iArr.length) {
                break;
            }
            arrayList6.add(getString(iArr[i2]));
            i2++;
        }
        this.f86665w0.mo71641P3(arrayList6);
        ArrayList arrayList7 = this.f86660r0;
        if (arrayList7 != null) {
            this.f86665w0.mo71717U1((String) arrayList7.get(14));
        }
        this.f86657o0.add(this.f86665w0);
        C31338x xVar13 = new C31338x();
        this.f86662t0 = xVar13;
        xVar13.mo71714Q1(2);
        this.f86662t0.mo71600T1(BogInputLayout.INPUT_TYPE_NUM_REAL);
        C31338x xVar14 = this.f86662t0;
        if (this.f86640J0 || this.f86641K0) {
            z7 = true;
        } else {
            z7 = false;
        }
        xVar14.mo71649U3(z7);
        String str = this.f86635E0;
        if (str != null) {
            mo87906s4(str);
        } else {
            mo87906s4("GEL");
        }
        this.f86662t0.mo71716S1(getString(C10328q.transfer_wizard_amount));
        this.f86662t0.mo71630I3(true);
        this.f86662t0.mo71663c4(this.f86645O0);
        C31338x xVar15 = this.f86662t0;
        if (this.f86640J0 || this.f86641K0) {
            z8 = true;
        } else {
            z8 = false;
        }
        xVar15.mo71649U3(z8);
        ArrayList arrayList8 = this.f86660r0;
        if (arrayList8 != null) {
            this.f86662t0.mo71717U1((String) arrayList8.get(15));
        }
        this.f86657o0.add(this.f86662t0);
        C31338x xVar16 = new C31338x();
        this.f86668z0 = xVar16;
        xVar16.mo71714Q1(2);
        this.f86668z0.mo71716S1(getString(C10328q.transfers_title_subject));
        this.f86668z0.mo71718V1(true);
        this.f86668z0.mo71642Q3(new C32304f0());
        ArrayList arrayList9 = this.f86660r0;
        if (arrayList9 != null) {
            this.f86668z0.mo71717U1((String) arrayList9.get(19));
        }
        this.f86657o0.add(this.f86668z0);
        if (this.f86640J0 || this.f86641K0) {
            C31338x xVar17 = new C31338x();
            this.f86663u0 = xVar17;
            xVar17.mo71714Q1(2);
            this.f86663u0.mo71716S1(getString(C10328q.sto_title_mobile_number));
            C31338x xVar18 = this.f86663u0;
            if (this.f86640J0 || this.f86641K0) {
                z9 = true;
            } else {
                z9 = false;
            }
            xVar18.mo71649U3(z9);
            this.f86663u0.mo71662b4(true);
            this.f86663u0.mo71600T1(BogInputLayout.INPUT_TYPE_NUM_PHONE);
            ArrayList arrayList10 = this.f86660r0;
            if (arrayList10 != null) {
                this.f86663u0.mo71717U1((String) arrayList10.get(21));
            }
            this.f86657o0.add(this.f86663u0);
            C31338x xVar19 = new C31338x();
            this.f86667y0 = xVar19;
            xVar19.mo71714Q1(1);
            this.f86667y0.mo71716S1(getString(C10328q.sto_title_period));
            this.f86667y0.mo71660a4(this.f86659q0);
            this.f86667y0.mo71649U3(this.f86640J0);
            ArrayList arrayList11 = this.f86660r0;
            if (arrayList11 != null) {
                this.f86667y0.mo71717U1((String) arrayList11.get(23));
            }
            this.f86657o0.add(this.f86667y0);
            C31338x xVar20 = new C31338x();
            this.f86631A0 = xVar20;
            xVar20.mo71714Q1(3);
            this.f86631A0.mo71716S1(getString(C10328q.sto_title_start_date));
            C31338x xVar21 = this.f86631A0;
            if (this.f86640J0 || this.f86641K0) {
                z12 = true;
            } else {
                z12 = false;
            }
            xVar21.mo71649U3(z12);
            ArrayList arrayList12 = this.f86660r0;
            if (arrayList12 != null) {
                this.f86631A0.mo71717U1((String) arrayList12.get(24));
            }
            this.f86631A0.mo71623D3();
            this.f86657o0.add(this.f86631A0);
            C31338x xVar22 = new C31338x();
            this.f86634D0 = xVar22;
            xVar22.mo71714Q1(3);
            this.f86634D0.mo71716S1(getString(C10328q.sto_title_service_end));
            C31338x xVar23 = this.f86634D0;
            if (this.f86640J0 || this.f86641K0) {
                z13 = true;
            } else {
                z13 = false;
            }
            xVar23.mo71649U3(z13);
            this.f86634D0.mo71653W3(this.f86631A0.mo71611z1());
            ArrayList arrayList13 = this.f86660r0;
            if (arrayList13 != null) {
                this.f86634D0.mo71717U1((String) arrayList13.get(25));
            }
            this.f86634D0.mo71712O1(true);
            this.f86634D0.mo71718V1(true);
            this.f86634D0.mo71622C3();
            this.f86657o0.add(this.f86634D0);
        }
        for (int i3 = 0; i3 < this.f86657o0.size(); i3++) {
            this.f86658p0.add((C31338x) this.f86657o0.get(i3));
        }
        ArrayList arrayList14 = new ArrayList();
        if (!this.f86638H0 && !this.f86640J0 && !this.f86641K0) {
            arrayList14.add(0);
        }
        if (!this.f86641K0 || (ddsto = this.f86639I0) == null) {
            arrayList14.add(2);
        } else {
            String str2 = ddsto.productCode;
            str2.hashCode();
            if (str2.equals("STO")) {
                arrayList14.add(2);
            } else if (str2.equals("BILL")) {
                arrayList14.add(1);
            }
        }
        if (!m106481n4()) {
            arrayList14.add(14);
        }
        if (!m106482o4() || (this.f86641K0 && "BILL".equals(this.f86639I0.productCode))) {
            arrayList14.add(15);
            arrayList14.add(19);
            arrayList14.add(23);
            arrayList14.add(24);
        } else {
            arrayList14.add(21);
        }
        for (int size = arrayList14.size() - 1; size >= 0; size--) {
            if (((Integer) arrayList14.get(size)).intValue() < this.f86658p0.size()) {
                this.f86658p0.remove(((Integer) arrayList14.get(size)).intValue());
            }
        }
        m106473V3(this.f86775c0);
        int i4 = this.f86775c0;
        if (i4 < 0) {
            this.f86775c0 = 0;
        } else if (i4 >= this.f86658p0.size()) {
            this.f86775c0 = this.f86658p0.size() - 1;
        }
        ((C31338x) this.f86658p0.get(this.f86775c0)).getArguments().putBoolean("WIZARD_FIELD_SHOULD_ANIMATE", true);
        m106472U3();
        mo87967s3(this.f86658p0, true);
        mo87963n3(this.f86775c0, false);
        mo87905r4(false, true);
        this.f86647Q0 = ((C31338x) this.f86658p0.get(this.f86775c0)).mo67195H1();
        this.f86648R0 = m106483p4();
        mo87860S2();
    }

    /* renamed from: w4 */
    public static void m106485w4(Activity activity, Intent intent, int i) {
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: A3 */
    public void mo87848A3() {
        C31338x xVar;
        C31338x xVar2 = this.f86634D0;
        if (!(xVar2 == null || (xVar = this.f86631A0) == null)) {
            xVar2.mo71653W3(xVar.mo71611z1());
        }
        mo87860S2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C32335t0.m95369n(this);
        mo87969v3();
        this.f86660r0 = getIntent().getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
        this.f86659q0 = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_WIZARD_STO_PERIOD_TYPES"));
        this.f86635E0 = getIntent().getStringExtra("TRANSFER_WIZARD_FROM_ACCOUNT_CCY");
        this.f86638H0 = getIntent().getBooleanExtra("IS_TEMPLATE", false);
        this.f86640J0 = getIntent().getBooleanExtra("TRANSFER_IS_NEW_STO", false);
        this.f86641K0 = getIntent().getBooleanExtra("TRANSFER_IS_EDIT_STO", false);
        this.f86639I0 = (DDSTO) C42035e.m122119a(getIntent().getParcelableExtra("STO_ITEM"));
        this.f86642L0 = getIntent().getExtras().getLongArray("STO_EXISTING_CREDIT_BILL_ACCT_KEYS");
        this.f86643M0 = getIntent().getExtras().getDouble("TRANSFER_WIZARD_RATE", Utils.DOUBLE_EPSILON);
        this.f86649S0 = getIntent().getExtras().getBoolean("TRANSFER_GET_DOMESTIC_NOMINATIONS", false);
        this.f86645O0 = getIntent().getIntExtra("TRANSFER_RATE_FOCUS_INDEX", 0);
        this.f86644N0 = TransferForm.TRANSFER_FORM_CONVERSION.equals(getIntent().getStringExtra("TRANSFER_FORM"));
        String stringExtra = getIntent().getStringExtra("TRANSFER_WIZARD_FROM_RATE");
        String stringExtra2 = getIntent().getStringExtra("TRANSFER_WIZARD_TO_RATE");
        this.f86646P0 = C32340v0.m95376b();
        if (!(stringExtra == null || stringExtra2 == null)) {
            this.f86636F0 = new BigDecimal(stringExtra);
            this.f86637G0 = new BigDecimal(stringExtra2);
        }
        m106484v4();
        mo87955L2().setLeftClickListener(new C35841a());
        mo87955L2().setRightClickListener(new C35842b());
        mo87900k3(this.f86776d0.mo87977d());
        mo87905r4(false, true);
    }

    /* renamed from: P2 */
    public int mo87856P2() {
        if (this.f86648R0 && !this.f86647Q0) {
            for (int d = this.f86776d0.mo87977d(); d < this.f86658p0.size(); d++) {
                if (!((C31338x) this.f86658p0.get(d)).mo67195H1() && TextUtils.isEmpty(((C31338x) this.f86658p0.get(d)).mo71611z1())) {
                    return d;
                }
            }
            for (int i = 0; i < this.f86658p0.size() - 1; i++) {
                if (!((C31338x) this.f86658p0.get(i)).mo67195H1() && TextUtils.isEmpty(((C31338x) this.f86658p0.get(i)).mo71611z1())) {
                    return i;
                }
            }
        }
        return this.f86776d0.mo87977d() + 1;
    }

    /* renamed from: Q */
    public void mo87857Q(int i) {
        super.mo87857Q(i);
        if (m106480k4()) {
            i--;
        }
        if (i == 0) {
            m106478i4();
            this.f86758L.setLeftFrameState(11);
            mo87905r4(false, false);
        } else if (i == 1) {
            m106479j4();
            this.f86758L.setRightFrameState(11);
            mo87905r4(false, false);
        } else {
            m106477h4();
        }
        mo87860S2();
    }

    /* renamed from: Q2 */
    public int mo87858Q2() {
        return this.f86776d0.mo87977d() - 1;
    }

    /* renamed from: S2 */
    public void mo87860S2() {
        mo87972z3(!m106483p4());
    }

    /* renamed from: T3 */
    public void mo87891T3() {
        boolean z = true;
        boolean z2 = !m106481n4();
        if (z2 || !m106482o4()) {
            z = false;
        }
        boolean z3 = !z;
        this.f86658p0.clear();
        this.f86658p0.add(this.f86632B0);
        if (this.f86641K0) {
            String str = this.f86639I0.productCode;
            str.hashCode();
            if (str.equals("STO")) {
                this.f86658p0.add(this.f86633C0);
                this.f86658p0.add(this.f86664v0);
                this.f86658p0.add(this.f86662t0);
                this.f86658p0.add(this.f86668z0);
                this.f86658p0.add(this.f86667y0);
                this.f86658p0.add(this.f86631A0);
                this.f86658p0.add(this.f86634D0);
            } else if (str.equals("BILL")) {
                this.f86658p0.add(this.f86666x0);
                this.f86658p0.add(this.f86664v0);
                this.f86658p0.add(this.f86663u0);
                this.f86658p0.add(this.f86634D0);
            }
        } else {
            this.f86658p0.add(this.f86633C0);
            this.f86658p0.add(this.f86664v0);
            if (!z2) {
                this.f86658p0.add(this.f86665w0);
                if (z) {
                    this.f86658p0.add(this.f86662t0);
                    this.f86658p0.add(this.f86668z0);
                    this.f86658p0.add(this.f86667y0);
                    this.f86658p0.add(this.f86631A0);
                    this.f86658p0.add(this.f86634D0);
                } else if (z3) {
                    this.f86658p0.add(this.f86663u0);
                    this.f86658p0.add(this.f86634D0);
                }
            } else {
                if (!this.f86640J0 && !this.f86638H0 && !this.f86641K0) {
                    this.f86658p0.remove(0);
                }
                this.f86658p0.add(this.f86662t0);
                this.f86658p0.add(this.f86668z0);
                if (this.f86640J0) {
                    this.f86658p0.add(this.f86667y0);
                    this.f86658p0.add(this.f86631A0);
                    this.f86658p0.add(this.f86634D0);
                }
            }
        }
        mo87860S2();
    }

    /* renamed from: X2 */
    public void mo87861X2() {
        String x1 = this.f86776d0.mo87976c().mo71737x1();
        if (x1 == null) {
            x1 = "";
        }
        new C10478k.C10483e(x1).mo27184b(C36546y.m108282F());
    }

    /* renamed from: X3 */
    public boolean mo87892X3() {
        BigDecimal bigDecimal = this.f86636F0;
        if (bigDecimal == null || this.f86637G0 == null) {
            return false;
        }
        if (bigDecimal.doubleValue() > this.f86637G0.doubleValue()) {
            if (this.f86636F0.doubleValue() != 1.0d) {
                return true;
            }
            return false;
        } else if (this.f86636F0.doubleValue() < 1.0d || this.f86637G0.doubleValue() < 1.0d) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: Y3 */
    public AccountLovEvent mo87893Y3() {
        return this.f86646P0;
    }

    /* renamed from: Z3 */
    public void mo87894Z3() {
        AccountLov a = C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86633C0.mo71611z1()), m106476g4(), true).mo72458a();
        AccountLov a2 = C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86664v0.mo71611z1()), m106476g4(), false).mo72458a();
        this.f86654l0.transfersGetCommRate(a.getCcy(), a2.getCcy(), new C35843c(a, a2));
    }

    /* renamed from: a3 */
    public void mo87864a3() {
        mo87860S2();
    }

    /* renamed from: a4 */
    public long mo87895a4() {
        try {
            return Long.valueOf(this.f86633C0.mo71611z1()).longValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b4 */
    public String mo87896b4() {
        if (this.f86644N0) {
            try {
                return C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86633C0.mo71611z1()), m106476g4(), true).mo72458a().getCcy();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: c4 */
    public void mo87897c4() {
        String str;
        if (this.f86649S0) {
            try {
                AccountLov a = C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86633C0.mo71611z1()), m106476g4(), true).mo72458a();
                AccountLov a2 = C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86664v0.mo71611z1()), m106476g4(), false).mo72458a();
                if (mo87902m4()) {
                    str = "PAYMENT_CONVERSION";
                } else {
                    str = "PAYMENT_OWN_ACCOUNTS";
                }
                if (a != null && a2 != null) {
                    this.f86654l0.getDomesticTransferNominations(a.getAcctNo(), a2.getAcctNo(), str, new C35844d());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d3 */
    public boolean mo87866d3() {
        for (int i = 0; i < this.f86658p0.size() - 1; i++) {
            if (!((C31338x) this.f86658p0.get(i)).mo67195H1() && TextUtils.isEmpty(((C31338x) this.f86658p0.get(i)).mo71611z1())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d4 */
    public void mo87898d4(String str, String str2, boolean z) {
        String str3;
        String str4;
        AccountLov a = C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86633C0.mo71611z1()), m106476g4(), true).mo72458a();
        AccountLov a2 = C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86664v0.mo71611z1()), m106476g4(), false).mo72458a();
        BankApi bankApi = this.f86654l0;
        if (z) {
            str3 = a.getCcy();
        } else {
            str3 = a2.getCcy();
        }
        if (z) {
            str4 = a2.getCcy();
        } else {
            str4 = a.getCcy();
        }
        bankApi.transfersGetCommRateAmount(str3, str4, str2, str, new C35845e(z));
    }

    /* renamed from: e4 */
    public long mo87899e4() {
        try {
            return Long.valueOf(this.f86664v0.mo71611z1()).longValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo53121f3() {
        super.mo53121f3();
        m106474W3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k3 */
    public void mo87900k3(int i) {
        super.mo87900k3(i);
        m106472U3();
        mo87891T3();
    }

    /* renamed from: l4 */
    public boolean mo87901l4(int i) {
        return !TextUtils.isEmpty(((C31338x) this.f86658p0.get(i)).mo71611z1());
    }

    /* renamed from: m4 */
    public boolean mo87902m4() {
        m106472U3();
        return this.f86661s0;
    }

    public void onBackPressed() {
        m106474W3();
    }

    public void onClick(View view) {
        if (view == this.f86764R) {
            C36546y.m108282F().mo27152s("transfers", "close", "wizard_close");
        } else if (view == this.f86754H) {
            C36546y.m108282F().mo27152s("transfers", "done", "wizard_close");
        }
        super.onClick(view);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (mo87902m4()) {
            mo87894Z3();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    /* renamed from: q4 */
    public void mo87904q4() {
        this.f86637G0 = null;
        this.f86636F0 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x013d A[LOOP:3: B:37:0x00cd->B:54:0x013d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0147 A[EDGE_INSN: B:98:0x0147->B:56:0x0147 ?: BREAK  , SYNTHETIC] */
    /* renamed from: r4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87905r4(boolean r25, boolean r26) {
        /*
            r24 = this;
            r0 = r24
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r1 = r0.f86646P0
            if (r1 == 0) goto L_0x0205
            r8 = 1
            if (r25 == 0) goto L_0x000b
            r9 = r8
            goto L_0x000c
        L_0x000b:
            r9 = 2
        L_0x000c:
            r10 = 0
            r11 = r10
        L_0x000e:
            if (r11 >= r9) goto L_0x0205
            boolean r1 = r24.m106480k4()
            if (r1 == 0) goto L_0x0019
            int r1 = r11 + 1
            goto L_0x001a
        L_0x0019:
            r1 = r11
        L_0x001a:
            if (r25 == 0) goto L_0x0021
            int r2 = r24.mo87922N2()
            goto L_0x0022
        L_0x0021:
            r2 = r1
        L_0x0022:
            if (r25 == 0) goto L_0x002f
            java.util.ArrayList r1 = r0.f86658p0
            int r3 = r24.mo87922N2()
            java.lang.Object r1 = r1.get(r3)
            goto L_0x0035
        L_0x002f:
            java.util.ArrayList r3 = r0.f86658p0
            java.lang.Object r1 = r3.get(r1)
        L_0x0035:
            c91.x r1 = (c91.C31338x) r1
            r12 = r1
            boolean r1 = r0.mo87901l4(r2)
            if (r1 == 0) goto L_0x01fa
            java.lang.String r1 = r12.mo71611z1()
            java.lang.String r2 = "_"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = r12.mo71611z1()
            java.lang.String[] r1 = r1.split(r2)
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r1 != 0) goto L_0x009c
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r4 = r0.f86646P0
            ge.bog.mobilebank.model.account.AccountLovContainer r4 = r4.getAccountLovContainer()
            java.lang.String r5 = r12.mo71611z1()
            long r5 = java.lang.Long.parseLong(r5)
            int r13 = r24.m106476g4()
            boolean r14 = r12.mo71686y3()
            f91.a r4 = f91.C31972b.m94378c(r4, r5, r13, r14)
            ge.bog.mobilebank.model.account.AccountLov r5 = r4.mo72458a()
            if (r5 == 0) goto L_0x0095
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            ge.bog.mobilebank.model.account.AccountLov r3 = r4.mo72458a()
            java.lang.String r3 = r3.getAccountTitle()
            r2.<init>(r3)
            ge.bog.mobilebank.model.account.AccountLov r3 = r4.mo72458a()
            java.lang.String r3 = r3.getRealAmountFormatted()
            r5 = r3
            r7 = r8
            r21 = r9
            goto L_0x0099
        L_0x0095:
            r7 = r8
            r21 = r9
            r5 = 0
        L_0x0099:
            r8 = 2
            goto L_0x0181
        L_0x009c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = r1.length
            r6 = r10
            r5 = 0
        L_0x00a4:
            if (r6 >= r4) goto L_0x015e
            r13 = r1[r6]
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r14 = r0.f86646P0
            ge.bog.mobilebank.model.account.AccountLovContainer r14 = r14.getAccountLovContainer()
            ge.bog.mobilebank.model.account.AccountLovHolder r14 = r14.getDomestic()
            java.util.ArrayList<ge.bog.mobilebank.model.account.AccountLov> r14 = r14.src
            java.util.Iterator r14 = r14.iterator()
            r15 = r10
        L_0x00b9:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x0151
            java.lang.Object r16 = r14.next()
            ge.bog.mobilebank.model.account.AccountLov r16 = (p341ge.bog.mobilebank.model.account.AccountLov) r16
            java.util.ArrayList r16 = r16.getSubAccounts()
            java.util.Iterator r16 = r16.iterator()
        L_0x00cd:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0143
            java.lang.Object r17 = r16.next()
            ge.bog.mobilebank.model.account.AccountLov r17 = (p341ge.bog.mobilebank.model.account.AccountLov) r17
            long r18 = r17.getId()
            java.lang.Long r20 = java.lang.Long.valueOf(r13)
            long r20 = r20.longValue()
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 != 0) goto L_0x0136
            if (r5 != 0) goto L_0x0100
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r5 = r0.f86646P0
            ge.bog.mobilebank.model.account.AccountLovContainer r5 = r5.getAccountLovContainer()
            r19 = r4
            long r3 = java.lang.Long.parseLong(r13)
            int r7 = r24.m106476g4()
            f91.a r5 = f91.C31972b.m94378c(r5, r3, r7, r8)
            goto L_0x0102
        L_0x0100:
            r19 = r4
        L_0x0102:
            c91.x r3 = r0.f86666x0
            java.util.ArrayList r3 = r3.mo71638O2()
            java.util.Iterator r3 = r3.iterator()
        L_0x010c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0138
            java.lang.Object r4 = r3.next()
            ge.bog.mobilebank.model.account.AccountLoveDebit r4 = (p341ge.bog.mobilebank.model.account.AccountLoveDebit) r4
            r21 = r9
            long r8 = r4.acctKey
            long r22 = r17.getId()
            int r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r8 != 0) goto L_0x0132
            java.lang.String r3 = f91.C31972b.m94382g(r4, r10)
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            r15 = 1
            goto L_0x013a
        L_0x0132:
            r9 = r21
            r8 = 1
            goto L_0x010c
        L_0x0136:
            r19 = r4
        L_0x0138:
            r21 = r9
        L_0x013a:
            if (r15 == 0) goto L_0x013d
            goto L_0x0147
        L_0x013d:
            r4 = r19
            r9 = r21
            r8 = 1
            goto L_0x00cd
        L_0x0143:
            r19 = r4
            r21 = r9
        L_0x0147:
            if (r15 == 0) goto L_0x014a
            goto L_0x0155
        L_0x014a:
            r4 = r19
            r9 = r21
            r8 = 1
            goto L_0x00b9
        L_0x0151:
            r19 = r4
            r21 = r9
        L_0x0155:
            int r6 = r6 + 1
            r4 = r19
            r9 = r21
            r8 = 1
            goto L_0x00a4
        L_0x015e:
            r21 = r9
            int r3 = r2.length()
            r7 = 1
            if (r3 <= r7) goto L_0x017e
            int r3 = r2.length()
            r8 = 2
            int r3 = r3 - r8
            int r4 = r2.length()
            r2.delete(r3, r4)
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r3 = r24.mo87955L2()
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r4, r7)
            goto L_0x017f
        L_0x017e:
            r8 = 2
        L_0x017f:
            r4 = r5
            r5 = 0
        L_0x0181:
            ge.bog.mobilebank.model.account.AccountLov r3 = r4.mo72460c()
            ge.bog.mobilebank.model.Client r4 = r0.f86655m0
            ge.bog.mobilebank.model.account.ProductProperties r9 = p341ge.bog.mobilebank.model.account.ProductProperties.getProperties(r3, r4, r10)
            int r3 = r9.getBackgroundImageId()     // Catch:{ Exception -> 0x0194 }
            android.graphics.drawable.Drawable r3 = androidx.core.content.C0767a.m2895e(r0, r3)     // Catch:{ Exception -> 0x0194 }
            goto L_0x019f
        L_0x0194:
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            int r4 = p366bk.C10318g.f28625J0
            int r4 = androidx.core.content.C0767a.m2893c(r0, r4)
            r3.<init>(r4)
        L_0x019f:
            boolean r4 = r12.mo71686y3()
            if (r4 != 0) goto L_0x01c6
            if (r1 == 0) goto L_0x01a8
            goto L_0x01c6
        L_0x01a8:
            if (r25 != 0) goto L_0x01b4
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r1 = r24.mo87955L2()
            android.graphics.drawable.Drawable r1 = r1.getRightDrawable()
            if (r1 == 0) goto L_0x01b6
        L_0x01b4:
            if (r26 == 0) goto L_0x01ea
        L_0x01b6:
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r1 = r24.mo87955L2()
            java.lang.String r4 = r2.toString()
            r6 = 1
            r2 = r3
            r3 = r25
            r1.setRight((android.graphics.drawable.Drawable) r2, (boolean) r3, (java.lang.String) r4, (java.lang.String) r5, (boolean) r6)
            goto L_0x01ea
        L_0x01c6:
            if (r25 != 0) goto L_0x01d2
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r4 = r24.mo87955L2()
            android.graphics.drawable.Drawable r4 = r4.getLeftDrawable()
            if (r4 == 0) goto L_0x01d4
        L_0x01d2:
            if (r26 == 0) goto L_0x01ea
        L_0x01d4:
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r4 = r24.mo87955L2()
            java.lang.String r6 = r2.toString()
            if (r1 != 0) goto L_0x01e0
            r13 = r7
            goto L_0x01e1
        L_0x01e0:
            r13 = r10
        L_0x01e1:
            r1 = r4
            r2 = r3
            r3 = r25
            r4 = r6
            r6 = r13
            r1.setLeft((android.graphics.drawable.Drawable) r2, (boolean) r3, (java.lang.String) r4, (java.lang.String) r5, (boolean) r6)
        L_0x01ea:
            ge.bog.mobilebank.ui.views.widgets.ArrowLayout r1 = r24.mo87955L2()
            int r2 = r9.getTitleColorId()
            boolean r3 = r12.mo71686y3()
            r1.setTextColorIds(r2, r3)
            goto L_0x01fe
        L_0x01fa:
            r7 = r8
            r21 = r9
            r8 = 2
        L_0x01fe:
            int r11 = r11 + 1
            r8 = r7
            r9 = r21
            goto L_0x000e
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity.mo87905r4(boolean, boolean):void");
    }

    /* renamed from: s4 */
    public void mo87906s4(String str) {
        mo87907t4(str, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public boolean mo87878t3() {
        if (!this.f86648R0 || this.f86647Q0) {
            return false;
        }
        return !m106483p4();
    }

    /* renamed from: t4 */
    public void mo87907t4(String str, boolean z) {
        this.f86662t0.mo71719W1(C32303f.m95198i(str, true));
        if (z && this.f86644N0) {
            try {
                if (C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86633C0.mo71611z1()), m106476g4(), true).mo72458a().getCcy().equals(C31972b.m94378c(this.f86646P0.getAccountLovContainer(), Long.parseLong(this.f86664v0.mo71611z1()), m106476g4(), false).mo72458a().getCcy())) {
                    this.f86664v0.mo71717U1("");
                }
                m106478i4();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u3 */
    public boolean mo87879u3() {
        return this.f86647Q0 && m106483p4();
    }

    /* renamed from: u4 */
    public void mo87908u4(boolean z) {
        this.f86661s0 = z;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0063 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[Catch:{ Exception -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: x4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87909x4() {
        /*
            r10 = this;
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r0 = r10.f86646P0     // Catch:{ Exception -> 0x0080 }
            ge.bog.mobilebank.model.account.AccountLovContainer r0 = r0.getAccountLovContainer()     // Catch:{ Exception -> 0x0080 }
            c91.x r1 = r10.f86633C0     // Catch:{ Exception -> 0x0080 }
            java.lang.String r1 = r1.mo71611z1()     // Catch:{ Exception -> 0x0080 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x0080 }
            int r3 = r10.m106476g4()     // Catch:{ Exception -> 0x0080 }
            r4 = 1
            f91.a r0 = f91.C31972b.m94378c(r0, r1, r3, r4)     // Catch:{ Exception -> 0x0080 }
            ge.bog.mobilebank.model.account.AccountLov r0 = r0.mo72458a()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r0 = r0.getCcy()     // Catch:{ Exception -> 0x0080 }
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0080 }
            c91.x r2 = r10.f86662t0     // Catch:{ Exception -> 0x0080 }
            java.lang.String r2 = r2.mo71611z1()     // Catch:{ Exception -> 0x0080 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0080 }
            java.math.BigDecimal r2 = r10.m106475f4()     // Catch:{ Exception -> 0x0080 }
            java.lang.String r3 = "GEL"
            if (r0 != 0) goto L_0x0035
            r0 = r3
        L_0x0035:
            boolean r3 = r3.equals(r0)     // Catch:{ Exception -> 0x0080 }
            r5 = 0
            if (r3 != 0) goto L_0x0063
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r3 = r10.f86656n0     // Catch:{ Exception -> 0x0063 }
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
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity.mo87909x4():void");
    }
}
