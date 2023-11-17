package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import c91.C31320p;
import com.google.gson.Gson;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32297d;
import g91.C32315k0;
import g91.C32343x;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import jg1.C41438c;
import jg1.C41452l;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p366bk.C10323l;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.OldPaymentWizardActivity */
public class OldPaymentWizardActivity extends C35874h {

    /* renamed from: K0 */
    private static boolean f86677K0 = false;

    /* renamed from: A0 */
    private boolean f86678A0;

    /* renamed from: B0 */
    private boolean f86679B0;

    /* renamed from: C0 */
    private long f86680C0 = -1;

    /* renamed from: D0 */
    private boolean f86681D0;

    /* renamed from: E0 */
    private String f86682E0;

    /* renamed from: F0 */
    private String f86683F0;

    /* renamed from: G0 */
    boolean f86684G0;

    /* renamed from: H0 */
    boolean f86685H0;

    /* renamed from: I0 */
    PaymentDebtEvent f86686I0;

    /* renamed from: J0 */
    ProviderConfigurationEvent f86687J0;

    /* renamed from: l0 */
    protected RootBankApiManager f86688l0;

    /* renamed from: m0 */
    protected Client f86689m0;

    /* renamed from: n0 */
    protected C41438c f86690n0;

    /* renamed from: o0 */
    private String f86691o0;

    /* renamed from: p0 */
    private ArrayList f86692p0 = new ArrayList();

    /* renamed from: q0 */
    private C31320p f86693q0;

    /* renamed from: r0 */
    private C31320p f86694r0;

    /* renamed from: s0 */
    private PaymentServiceConfig f86695s0;

    /* renamed from: t0 */
    private PaymentProviderConfiguration f86696t0;

    /* renamed from: u0 */
    private Bundle f86697u0;

    /* renamed from: v0 */
    private PaymentDebtResponse f86698v0;

    /* renamed from: w0 */
    private PaymentDebtResponse f86699w0;

    /* renamed from: x0 */
    private int f86700x0;

    /* renamed from: y0 */
    private boolean f86701y0;

    /* renamed from: z0 */
    private boolean f86702z0;

    /* renamed from: B3 */
    private void m106517B3(int i) {
        if (!((C31320p) this.f86692p0.get(i)).mo71590I2() || ((C31320p) this.f86692p0.get(i)).mo71589H2()) {
            this.f86752F.setText(getString(C10328q.auth_wizard_button_text_next));
        } else {
            this.f86752F.setText(getString(C10328q.f28930I0));
        }
        if (i == 0) {
            this.f86755I.setVisibility(4);
            if (this.f86701y0) {
                this.f86759M.setVisibility(0);
                return;
            }
            return;
        }
        this.f86755I.setVisibility(0);
        this.f86759M.setVisibility(4);
    }

    /* renamed from: C3 */
    private PaymentDebtResponse m106518C3(PaymentDebtResponse paymentDebtResponse, boolean z) {
        PaymentDebtResponse paymentDebtResponse2 = new PaymentDebtResponse();
        int i = 0;
        for (KeyValue keyValue : paymentDebtResponse.getParameter()) {
            if (m106525a4(keyValue.getKey(), keyValue.getValue())) {
                i++;
            }
        }
        KeyValue[] keyValueArr = new KeyValue[i];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f86695s0.getParameter().length; i3++) {
            PaymentServiceConfigParameter paymentServiceConfigParameter = this.f86695s0.getParameter()[i3];
            for (KeyValue keyValue2 : paymentDebtResponse.getParameter()) {
                if (keyValue2.getKey().equals(paymentServiceConfigParameter.getId()) && !TextUtils.isEmpty(keyValue2.getValue())) {
                    if (z && this.f86695s0.getParameter()[i3].getInput()[0].getType().equals("select")) {
                        PaymentsServiceConfigInputOption[] inputOption = paymentServiceConfigParameter.getInput()[0].getInputOption();
                        int length = inputOption.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            PaymentsServiceConfigInputOption paymentsServiceConfigInputOption = inputOption[i4];
                            if (paymentsServiceConfigInputOption.getId().equals(keyValue2.getValue())) {
                                keyValue2.setValue(C27950a.m86286c(paymentsServiceConfigInputOption.getValue(), true));
                                break;
                            }
                            i4++;
                        }
                    }
                    keyValueArr[i2] = keyValue2;
                    i2++;
                }
            }
        }
        paymentDebtResponse2.setParameter(keyValueArr);
        return paymentDebtResponse2;
    }

    /* renamed from: E3 */
    private void m106519E3() {
        if (mo87931Y3()) {
            C31320p pVar = new C31320p();
            Bundle bundle = new Bundle();
            bundle.putString("PAYMENT_PARAMETER_VALUE", this.f86697u0.getString("TEMPLATE_NAME_ID", (String) null));
            bundle.putBoolean("IS_TEMPLATE_MODIFY", true);
            pVar.setArguments(bundle);
            this.f86692p0.add(pVar);
        }
    }

    /* renamed from: F3 */
    private void m106520F3() {
        if (mo87922N2() < this.f86692p0.size() - 1) {
            mo87960c3();
        } else {
            mo87916G3();
        }
    }

    /* renamed from: L3 */
    private int m106521L3() {
        return mo87931Y3() ? 1 : 0;
    }

    /* renamed from: R3 */
    private boolean m106522R3(PaymentServiceConfigParameter paymentServiceConfigParameter) {
        String str;
        if (mo87928V3() || !TextUtils.isEmpty(paymentServiceConfigParameter.getParamMask()) || paymentServiceConfigParameter.getInput().length <= 1) {
            return false;
        }
        for (int i = 0; i < paymentServiceConfigParameter.getInput().length; i++) {
            Bundle bundle = new Bundle();
            C31320p pVar = new C31320p();
            PaymentServiceConfigParameter paymentServiceConfigParameter2 = new PaymentServiceConfigParameter();
            paymentServiceConfigParameter.copyDataTo(paymentServiceConfigParameter2, i);
            paymentServiceConfigParameter2.setName(paymentServiceConfigParameter.getInput()[i].getInputName());
            bundle.putParcelable("PAYMENT_PARAMETER", C42035e.m122121c(paymentServiceConfigParameter2));
            bundle.putBoolean("MULTIPLE_INPUT_OPTION", true);
            Bundle bundle2 = this.f86697u0;
            if (bundle2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(paymentServiceConfigParameter.getId());
                if (i == 0) {
                    str = "";
                } else {
                    str = "_" + i;
                }
                sb.append(str);
                bundle.putString("PAYMENT_PARAMETER_VALUE", bundle2.getString(sb.toString(), (String) null));
            }
            pVar.mo71601T2(true);
            pVar.mo71596O2(paymentServiceConfigParameter.getInput().length);
            pVar.setArguments(bundle);
            this.f86692p0.add(pVar);
        }
        return true;
    }

    /* renamed from: S3 */
    private boolean m106523S3() {
        PaymentDebtEvent paymentDebtEvent = this.f86686I0;
        if (!(paymentDebtEvent == null || paymentDebtEvent.getPaymentDebt() == null)) {
            for (KeyValue keyValue : this.f86686I0.getPaymentDebt().getParameter()) {
                if (keyValue.getKey().equals(PaymentServiceConfig.TYPE_DEBT_LIST) && !TextUtils.isEmpty(keyValue.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: T3 */
    private boolean m106524T3() {
        return this.f86700x0 < this.f86692p0.size() + -2;
    }

    /* renamed from: a4 */
    private boolean m106525a4(String str, String str2) {
        for (PaymentServiceConfigParameter id : this.f86695s0.getParameter()) {
            if (id.getId().equals(str) && !TextUtils.isEmpty(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b4 */
    private void m106526b4() {
        ArrayList arrayList = new ArrayList();
        int L3 = m106521L3();
        while (true) {
            L3++;
            if (L3 < this.f86692p0.size()) {
                arrayList.add((C31320p) this.f86692p0.get(L3));
            } else {
                this.f86692p0.removeAll(arrayList);
                mo87967s3(this.f86692p0, false);
                return;
            }
        }
    }

    /* renamed from: c4 */
    private void m106527c4() {
        if (!mo87930X3()) {
            Bundle bundle = new Bundle();
            C31320p pVar = new C31320p();
            bundle.putBoolean("PAYMENT_COMPANY_WIZARD", true);
            bundle.putLong("PAYMENT_PROVIDERS_LIST", this.f86680C0);
            bundle.putString("PAYMENT_PARAMETER_VALUE", getIntent().getStringExtra("PAYMENT_PROVIDER_ID"));
            pVar.setArguments(bundle);
            this.f86692p0.add(pVar);
        }
        m106528d4(false);
        ((C31320p) this.f86692p0.get(this.f86775c0)).getArguments().putBoolean("WIZARD_FIELD_SHOULD_ANIMATE", true);
        mo87963n3(this.f86775c0, false);
    }

    /* renamed from: d4 */
    private void m106528d4(boolean z) {
        if (!z) {
            m106526b4();
        }
        PaymentServiceConfigParameter paymentServiceConfigParameter = null;
        this.f86694r0 = null;
        int L3 = m106521L3();
        PaymentServiceConfig paymentServiceConfig = this.f86695s0;
        boolean z2 = true;
        if (!(paymentServiceConfig == null || paymentServiceConfig.getParameter() == null)) {
            PaymentServiceConfigParameter paymentServiceConfigParameter2 = null;
            int i = 0;
            while (i < this.f86695s0.getParameter().length) {
                PaymentServiceConfigParameter paymentServiceConfigParameter3 = this.f86695s0.getParameter()[i];
                if (paymentServiceConfigParameter3.isMandatory().booleanValue() && paymentServiceConfigParameter3.getInput()[0].getEnable().booleanValue() && !paymentServiceConfigParameter3.getId().equals("payButton") && !"C".equals(paymentServiceConfigParameter3.getParamType())) {
                    boolean R3 = m106522R3(paymentServiceConfigParameter3);
                    Bundle bundle = new Bundle();
                    if (mo87921M3(paymentServiceConfigParameter3.getId()) == null || R3) {
                        C31320p pVar = new C31320p();
                        bundle.putParcelable("PAYMENT_PARAMETER", C42035e.m122121c(paymentServiceConfigParameter3));
                        Bundle bundle2 = this.f86697u0;
                        if (bundle2 != null) {
                            bundle.putString("PAYMENT_PARAMETER_VALUE", bundle2.getString(paymentServiceConfigParameter3.getId(), (String) null));
                        }
                        if (this.f86682E0 != null && paymentServiceConfigParameter3.getId().equals("customerId")) {
                            bundle.putString("PAYMENT_PARAMETER_VALUE", this.f86682E0);
                        }
                        for (int i2 = i + 1; i2 < this.f86695s0.getParameter().length; i2++) {
                            if (i2 < this.f86695s0.getParameter().length) {
                                if (this.f86695s0.getParameter()[i2].isMandatory().booleanValue() && paymentServiceConfigParameter3.getInput()[0].getEnable().booleanValue() && !this.f86695s0.getParameter()[i2].getId().equals("debtButton")) {
                                    break;
                                } else if (this.f86695s0.getParameter()[i2].getId().equals("debtButton")) {
                                    this.f86691o0 = this.f86695s0.getParameter()[i2].getInput()[0].getValue();
                                    if (R3) {
                                        ArrayList arrayList = this.f86692p0;
                                        C31320p pVar2 = (C31320p) arrayList.get(arrayList.size() - 1);
                                        this.f86693q0 = pVar2;
                                        pVar2.mo71599S2(true);
                                        this.f86693q0.getArguments().putBoolean("PAYMENT_DEBT_VERIFY_FRAGMENT", true);
                                    } else {
                                        this.f86693q0 = pVar;
                                        pVar.mo71599S2(true);
                                        bundle.putBoolean("PAYMENT_DEBT_VERIFY_FRAGMENT", true);
                                    }
                                    i = i2;
                                }
                            }
                        }
                        if (this.f86701y0 && this.f86692p0.size() == L3) {
                            bundle.putBoolean("PAYMENT_MOBILE", this.f86701y0);
                            if (this.f86679B0) {
                                bundle.putBoolean("PAYMENT_DEBT_VERIFIED", getIntent().getBooleanExtra("PAYMENT_DEBT_VERIFIED", false));
                                this.f86693q0 = pVar;
                            }
                        }
                        pVar.setArguments(bundle);
                        if ("amount".equals(paymentServiceConfigParameter3.getInput()[0].getType())) {
                            this.f86694r0 = pVar;
                        }
                        if (!R3) {
                            this.f86692p0.add(pVar);
                        }
                    }
                } else if ("C".equals(paymentServiceConfigParameter3.getParamType())) {
                    paymentServiceConfigParameter2 = paymentServiceConfigParameter3;
                }
                i++;
            }
            paymentServiceConfigParameter = paymentServiceConfigParameter2;
        }
        C31320p pVar3 = this.f86694r0;
        if (!(pVar3 == null || paymentServiceConfigParameter == null)) {
            pVar3.getArguments().putParcelable("PAYMENT_PACK_PARAMETER", C42035e.m122121c(paymentServiceConfigParameter));
            this.f86694r0.getArguments().putInt("PAYMENT_PACK_INDEX", getIntent().getIntExtra("PAYMENT_PACK_INDEX", -1));
        }
        if (this.f86775c0 >= this.f86692p0.size()) {
            this.f86775c0 = this.f86692p0.size() - 1;
        }
        ((C31320p) this.f86692p0.get(0)).getArguments().putString("PAYMENT_ICON_URL", getIntent().getStringExtra("PAYMENT_ICON_URL"));
        ((C31320p) this.f86692p0.get(this.f86775c0)).getArguments().putInt("WIZARD_INPUT_Y_POSITION", getIntent().getIntExtra("WIZARD_INPUT_Y_POSITION", 0));
        ((C31320p) this.f86692p0.get(this.f86775c0)).getArguments().putBoolean("WIZARD_FIELD_SHOULD_ANIMATE", z);
        ArrayList arrayList2 = this.f86692p0;
        if (!z && !mo87927U3()) {
            z2 = false;
        }
        mo87967s3(arrayList2, z2);
        if (z) {
            this.f86700x0 = this.f86775c0;
            ((C31320p) this.f86692p0.get(L3)).getArguments().putBoolean("PAYMENT_MOBILE_UNIVERSAL", this.f86679B0);
            mo87963n3(this.f86775c0, false);
        }
    }

    /* renamed from: D3 */
    public KeyValue[] mo87915D3() {
        int size = this.f86692p0.size();
        KeyValue[] keyValueArr = new KeyValue[size];
        for (int i = 0; i < size; i++) {
            keyValueArr[i] = ((C31320p) this.f86692p0.get(i)).mo71609v2();
        }
        return keyValueArr;
    }

    /* renamed from: G3 */
    public void mo87916G3() {
        Intent intent = new Intent();
        if (this.f86698v0 != null) {
            intent.putExtra("PAYMENT_WIZARD_DEBT_INFO", C42035e.m122121c(new ArrayList(Arrays.asList(this.f86698v0.getParameter()))));
        }
        PaymentProviderConfiguration paymentProviderConfiguration = this.f86696t0;
        if (paymentProviderConfiguration != null) {
            intent.putExtra("PAYMENT_SERVICE_CONFIG", C42035e.m122121c(paymentProviderConfiguration.getServiceConfigJson()));
            intent.putExtra("PAYMENT_PROVIDER_ID", this.f86696t0.getId());
        }
        intent.putExtra("PAYMENT_WIZARD_FILLED_INFO", C42035e.m122121c(new ArrayList(Arrays.asList(mo87915D3()))));
        intent.putExtra("PAYMENT_DEBT_VERIFY_DATA", C42035e.m122121c(this.f86699w0));
        if (this.f86686I0 != null && m106523S3()) {
            intent.putExtra("PAYMENT_UNHANDLED_LIST", C42035e.m122121c(this.f86686I0.getPaymentDebt()));
        }
        C31320p pVar = this.f86693q0;
        if (pVar != null && this.f86679B0) {
            intent.putExtra("PAYMENT_DEBT_VERIFIED", pVar.mo71589H2());
        }
        C31320p pVar2 = this.f86694r0;
        if (pVar2 != null) {
            intent.putExtra("PAYMENT_PACK_INDEX", pVar2.mo71608t2());
        }
        setResult(-1, intent);
        finish();
    }

    /* renamed from: H3 */
    public String mo87917H3() {
        return getIntent().getStringExtra("BONUS_TYPE");
    }

    /* renamed from: I3 */
    public void mo87918I3() {
        mo87919J3(this.f86691o0);
    }

    /* renamed from: J3 */
    public void mo87919J3(String str) {
        this.f86752F.setTextColor(0);
        this.f86763Q.setVisibility(0);
        this.f86752F.setAlpha(0.5f);
        mo87933e4(true, false);
        String P3 = mo87925P3();
        C31320p pVar = this.f86694r0;
        if (pVar != null) {
            pVar.getArguments().putString("PAYMENT_PARAMETER_VALUE", "");
        }
        this.f86689m0.requestPaymentDebt(str, P3, this);
    }

    /* renamed from: K3 */
    public Set mo87920K3() {
        int i = C32315k0.m95260i(this.f86695s0, this.f86699w0);
        ArraySet arraySet = new ArraySet();
        C31320p pVar = this.f86694r0;
        if (pVar != null && i > 0) {
            pVar.getArguments().putString("PAYMENT_PARAMETER_VALUE", C32359z0.m95555Z((double) i));
        }
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : this.f86695s0.getParameter()) {
            if ("amount".equals(paymentServiceConfigParameter.getInput()[0].getType())) {
                for (int i2 = 0; i2 < this.f86698v0.getParameter().length; i2++) {
                    if (this.f86698v0.getParameter()[i2].getKey().equals(paymentServiceConfigParameter.getId())) {
                        arraySet.add(Integer.valueOf(i2));
                    }
                }
            }
        }
        return arraySet;
    }

    /* renamed from: M3 */
    public C31320p mo87921M3(String str) {
        Iterator it = this.f86692p0.iterator();
        while (it.hasNext()) {
            C31320p pVar = (C31320p) it.next();
            if (pVar.mo71609v2() != null && str.equals(pVar.mo71609v2().getKey())) {
                return pVar;
            }
        }
        return null;
    }

    /* renamed from: N2 */
    public int mo87922N2() {
        return this.f86776d0.mo87977d();
    }

    /* renamed from: N3 */
    public int mo87923N3() {
        return this.f86692p0.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        boolean z;
        super.mo37451O1(bundle);
        this.f86695s0 = (PaymentServiceConfig) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_SERVICE_CONFIG_JSON"));
        this.f86680C0 = getIntent().getExtras().getLong("PAYMENT_PROVIDERS_LIST", -1);
        this.f86697u0 = getIntent().getBundleExtra("PAYMENT_PARAMETER_VALUES");
        this.f86691o0 = "mep-bog-mobpayments-customer-info";
        if (getIntent().getExtras().getBoolean("PAYMENT_MOBILE", false) || this.f86679B0) {
            z = true;
        } else {
            z = false;
        }
        this.f86701y0 = z;
        this.f86679B0 = z;
        this.f86702z0 = getIntent().getExtras().getBoolean("IS_TEMPLATE_MODIFY", false);
        this.f86678A0 = getIntent().getExtras().getBoolean("IS_TEMPLATE_ADD", false);
        this.f86681D0 = getIntent().getExtras().getBoolean("PAY_WITH_POINTS", false);
        this.f86682E0 = getIntent().getExtras().getString("TB_PARK_CAR_NUMBER");
        this.f86683F0 = getIntent().getExtras().getString("BONUS_TYPE", (String) null);
        m106519E3();
        if (!mo87927U3()) {
            m106528d4(true);
        } else {
            m106527c4();
        }
    }

    /* renamed from: O3 */
    public PaymentServiceConfigParameter[] mo87924O3() {
        return this.f86695s0.getParameter();
    }

    /* renamed from: P3 */
    public String mo87925P3() {
        KeyValue keyValue;
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList();
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : this.f86695s0.getParameter()) {
            if (!paymentServiceConfigParameter.getId().equals("TEMPLATE_NAME_ID")) {
                if (paymentServiceConfigParameter.isMandatory().booleanValue()) {
                    C31320p M3 = mo87921M3(paymentServiceConfigParameter.getId());
                    if (M3 == null) {
                        keyValue = null;
                    } else if (!M3.mo71591J2()) {
                        keyValue = M3.mo71609v2();
                        if (C32315k0.m95250E(paymentServiceConfigParameter.getParamMask())) {
                            keyValue.setValue(keyValue.getValue().replaceAll(C32315k0.m95262k(paymentServiceConfigParameter.getParamMask()), ""));
                        }
                        if (paymentServiceConfigParameter.getInput()[0].getType().equals("amount")) {
                            keyValue = new KeyValue();
                            keyValue.setKey(M3.mo71609v2().getKey());
                            keyValue.setValue("");
                        }
                        if (M3.mo71585A2()) {
                            keyValue.setKey(paymentServiceConfigParameter.getId());
                            for (int i = 1; i < M3.mo71606s2(); i++) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(keyValue.getValue());
                                sb.append(mo87921M3(keyValue.getKey() + "_" + i).mo71609v2().getValue());
                                keyValue.setValue(sb.toString());
                            }
                        }
                    }
                } else {
                    keyValue = new KeyValue();
                    keyValue.setKey(paymentServiceConfigParameter.getId());
                    keyValue.setValue("");
                }
                if (keyValue != null) {
                    arrayList.add(keyValue);
                }
            }
        }
        return gson.mo18181w(arrayList);
    }

    /* renamed from: Q */
    public void mo87857Q(int i) {
        mo87900k3(i);
        if (((C31320p) this.f86692p0.get(i)).mo71603Z2()) {
            C32290b1.m95112b(this.f86752F);
        } else if (((C31320p) this.f86692p0.get(i)).f77882e != null && this.f86778f0 && !((C31320p) this.f86692p0.get(i)).mo71549G1()) {
            C32290b1.m95115e(((C31320p) this.f86692p0.get(i)).f77882e.getEditText());
        }
    }

    /* renamed from: Q3 */
    public String mo87926Q3() {
        return getIntent().getStringExtra("POINTS_AMOUNT");
    }

    /* renamed from: U3 */
    public boolean mo87927U3() {
        return this.f86680C0 != -1;
    }

    /* renamed from: V3 */
    public boolean mo87928V3() {
        return this.f86701y0;
    }

    /* renamed from: W3 */
    public boolean mo87929W3() {
        return this.f86678A0;
    }

    /* renamed from: X3 */
    public boolean mo87930X3() {
        return this.f86702z0;
    }

    /* renamed from: Y3 */
    public boolean mo87931Y3() {
        return mo87929W3() || mo87930X3();
    }

    /* renamed from: Z3 */
    public boolean mo87932Z3() {
        return getIntent().getBooleanExtra("PAY_WITH_POINTS", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e3 */
    public void mo87867e3() {
        if (((C31320p) this.f86692p0.get(m106521L3())).mo71610y1() == 304) {
            ((C31320p) this.f86692p0.get(m106521L3())).mo71595M2();
        } else if (this.f86692p0.get(m106521L3()) != null) {
            ((C31320p) this.f86692p0.get(m106521L3())).mo71600T1(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
        }
    }

    /* renamed from: e4 */
    public void mo87933e4(boolean z, boolean z2) {
        this.f86684G0 = z;
        this.f86685H0 = z2;
        if (this.f86752F.isOrange() && !z) {
            this.f86763Q.setVisibility(8);
            this.f86752F.setTextColor(-1);
            this.f86752F.setAlpha(1.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo53121f3() {
        mo87916G3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i3 */
    public void mo53122i3() {
        if (!this.f86752F.isOrange()) {
            return;
        }
        if (this.f86684G0 || this.f86685H0) {
            if (this.f86685H0) {
                this.f86777e0 = true;
            }
            this.f86752F.setTextColor(0);
            this.f86763Q.setVisibility(0);
            this.f86752F.setAlpha(C32359z0.m95537H(C10323l.next_button_dim_alpha, this));
        } else if (!((C31320p) this.f86692p0.get(mo87922N2())).mo71590I2()) {
            m106520F3();
        } else if (!mo87928V3() || !((C31320p) this.f86692p0.get(mo87922N2())).mo71589H2()) {
            this.f86777e0 = true;
            mo87918I3();
        } else {
            m106520F3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public void mo87844j3() {
        if (mo87922N2() > 0) {
            mo87961l3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k3 */
    public void mo87900k3(int i) {
        boolean z;
        m106517B3(i);
        KeyValue v2 = ((C31320p) this.f86692p0.get(i)).mo71609v2();
        boolean z2 = true;
        if (this.f86694r0 != this.f86692p0.get(i) || !this.f86702z0) {
            z = false;
        } else {
            z = true;
        }
        if (v2 != null) {
            if (TextUtils.isEmpty(v2.getValue()) && !z) {
                z2 = false;
            }
            mo87965p3(z2);
        }
    }

    public void onBackPressed() {
        mo87916G3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    @jg1.C41452l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDebtResponse(p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent r9) {
        /*
            r8 = this;
            ge.bog.mobilebank.eventbus.events.PaymentDebtEvent r0 = r8.f86686I0
            if (r9 == r0) goto L_0x00e6
            r8.f86686I0 = r9
            int r0 = r9.getState()
            r1 = 20
            r2 = 0
            if (r0 == r1) goto L_0x002b
            r1 = 30
            if (r0 == r1) goto L_0x0026
            r1 = 40
            if (r0 == r1) goto L_0x0019
            goto L_0x00db
        L_0x0019:
            java.lang.String r0 = r9.getErrorKey()
            java.lang.String r0 = r90.C27950a.m86286c(r0, r2)
            g91.C32297d.m95154b(r8, r0)
            goto L_0x00db
        L_0x0026:
            g91.C32297d.m95153a(r8)
            goto L_0x00db
        L_0x002b:
            boolean r0 = r8.f86701y0
            if (r0 != 0) goto L_0x0032
            r8.mo87933e4(r2, r2)
        L_0x0032:
            int r0 = p366bk.C10328q.auth_wizard_button_text_next
            java.lang.String r0 = r8.getString(r0)
            r8.mo87966q3(r0)
            boolean r0 = r8.f86679B0
            r1 = 1
            if (r0 != 0) goto L_0x005f
            ge.bog.mobilebank.model.payment.PaymentDebtResponse r0 = r9.getPaymentDebt()
            r8.f86699w0 = r0
            ge.bog.mobilebank.model.payment.PaymentDebtResponse r0 = r8.m106518C3(r0, r2)
            r8.f86698v0 = r0
            c91.p r0 = r8.f86694r0
            if (r0 == 0) goto L_0x0059
            ge.bog.mobilebank.model.payment.PaymentDebtResponse r3 = r8.f86699w0
            ge.bog.mobilebank.model.payment.PaymentDebtResponse r3 = r8.m106518C3(r3, r1)
            r0.mo71602V2(r3)
        L_0x0059:
            c91.p r0 = r8.f86693q0
            r0.mo71598R2(r1)
            goto L_0x009d
        L_0x005f:
            ge.bog.mobilebank.model.payment.PaymentDebtResponse r0 = r9.getPaymentDebt()
            ge.bog.mobilebank.model.KeyValue[] r0 = r0.getParameter()
            int r3 = r0.length
            r4 = r2
        L_0x0069:
            if (r4 >= r3) goto L_0x0081
            r5 = r0[r4]
            java.lang.String r6 = r5.getKey()
            java.lang.String r7 = "paymentServiceId"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007e
            java.lang.String r0 = r5.getValue()
            goto L_0x0082
        L_0x007e:
            int r4 = r4 + 1
            goto L_0x0069
        L_0x0081:
            r0 = 0
        L_0x0082:
            if (r0 == 0) goto L_0x009a
            r8.mo87933e4(r2, r1)
            boolean r3 = r8.f86681D0
            if (r3 == 0) goto L_0x0093
            ge.bog.mobilebank.rest.manager.RootBankApiManager r3 = r8.f86688l0
            java.lang.String r4 = r8.f86683F0
            r3.getPaymentsProviderConfigurationWithVoucher(r0, r8, r4)
            goto L_0x009d
        L_0x0093:
            ge.bog.mobilebank.model.Client r3 = r8.f86689m0
            r3.requestProviderConfiguration(r0)
            r0 = r1
            goto L_0x009e
        L_0x009a:
            r8.mo87933e4(r2, r2)
        L_0x009d:
            r0 = r2
        L_0x009e:
            boolean r3 = r8.f86679B0
            if (r3 != 0) goto L_0x00ab
            boolean r3 = r8.f86777e0
            if (r3 == 0) goto L_0x00ab
            r8.mo87960c3()
            r8.f86777e0 = r2
        L_0x00ab:
            boolean r3 = r8.mo87931Y3()
            if (r3 == 0) goto L_0x00be
            boolean r3 = r8.m106524T3()
            if (r3 != 0) goto L_0x00be
            boolean r3 = r8.f86679B0
            if (r3 != 0) goto L_0x00be
            r8.mo87916G3()
        L_0x00be:
            ge.bog.mobilebank.ui.wizard.activities.c$d r3 = r8.f86776d0
            int r3 = r3.mo87977d()
            java.util.ArrayList r4 = r8.f86692p0
            int r4 = r4.size()
            int r4 = r4 - r1
            if (r3 != r4) goto L_0x00d2
            if (r0 != 0) goto L_0x00d2
            r8.mo87916G3()
        L_0x00d2:
            boolean r0 = r8.m106523S3()
            if (r0 == 0) goto L_0x00db
            r8.mo87916G3()
        L_0x00db:
            int r9 = r9.getState()
            r0 = 10
            if (r9 == r0) goto L_0x00e6
            r8.mo87933e4(r2, r2)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.OldPaymentWizardActivity.onDebtResponse(ge.bog.mobilebank.eventbus.events.PaymentDebtEvent):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        f86677K0 = false;
    }

    @C41452l
    public void onGetProviderConfigurationsEvent(ProviderConfigurationEvent providerConfigurationEvent) {
        if (this.f86687J0 != providerConfigurationEvent) {
            this.f86687J0 = providerConfigurationEvent;
            if (providerConfigurationEvent.getState() != 10) {
                if (providerConfigurationEvent.getState() == 40) {
                    C32297d.m95154b(this, C27950a.m86284a(providerConfigurationEvent.getErrorKey()));
                } else if (providerConfigurationEvent.getState() == 20) {
                    this.f86695s0 = providerConfigurationEvent.getConfiguration().getServiceConfigJson();
                    this.f86696t0 = providerConfigurationEvent.getConfiguration();
                    m106528d4(false);
                    if (((C31320p) this.f86692p0.get(0)).f77769H) {
                        ((C31320p) this.f86692p0.get(0)).mo71598R2(true);
                        ((C31320p) this.f86692p0.get(0)).mo71593K2(C32289b0.m95091c(this.f86696t0.getLogo()));
                    } else if (mo87927U3()) {
                        ((C31320p) this.f86692p0.get(0)).mo71594L2();
                    }
                    mo87965p3(true);
                    mo87933e4(false, false);
                    if (this.f86777e0) {
                        mo87960c3();
                        this.f86777e0 = false;
                    }
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f86690n0, this);
        this.f86689m0.requestPaymentDebt((String) null, (String) null, this);
        if (this.f86681D0) {
            String str = this.f86691o0;
            if (str != null && !str.equals("mep-bog-mobpayments-customer-info") && mo87927U3()) {
                this.f86688l0.getPaymentsProviderConfigurationWithVoucher(this.f86691o0, this, this.f86683F0);
                return;
            }
            return;
        }
        this.f86689m0.requestProviderConfiguration((String) null);
    }

    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f86690n0, this);
    }
}
