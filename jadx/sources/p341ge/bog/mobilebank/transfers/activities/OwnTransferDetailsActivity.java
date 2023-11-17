package p341ge.bog.mobilebank.transfers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import f91.C31971a;
import f91.C31972b;
import g91.C32290b1;
import g91.C32297d;
import g91.C32303f;
import g91.C32306g0;
import g91.C32340v0;
import hd1.C41205b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferCommissionApiModel;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.RateWeight;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.TransferResult;
import p341ge.bog.mobilebank.model.TransferTemplateObject;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity;
import p341ge.bog.mobilebank.p975ui.activities.TransferResultActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10320i;
import p366bk.C10328q;
import p380ck.C10464h;
import r90.C27950a;
import w61.C39610j;

/* renamed from: ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity */
public class OwnTransferDetailsActivity extends C34907f {

    /* renamed from: G0 */
    protected BankApi f84229G0;

    /* renamed from: H0 */
    protected Client f84230H0;

    /* renamed from: I0 */
    protected RateWeight f84231I0;

    /* renamed from: J0 */
    protected double f84232J0;

    /* renamed from: K0 */
    protected double f84233K0;

    /* renamed from: L0 */
    protected String f84234L0;

    /* renamed from: M0 */
    protected boolean f84235M0;

    /* renamed from: N0 */
    protected String f84236N0;

    /* renamed from: O0 */
    protected String f84237O0;

    /* renamed from: P0 */
    protected BigDecimal f84238P0;

    /* renamed from: Q0 */
    protected BigDecimal f84239Q0;

    /* renamed from: R0 */
    protected DecimalFormat f84240R0;

    /* renamed from: S0 */
    protected DecimalFormat f84241S0;

    /* renamed from: T0 */
    private C39610j f84242T0;

    /* renamed from: U0 */
    private String f84243U0;

    /* renamed from: V0 */
    String f84244V0;

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity$a */
    class C34873a implements View.OnClickListener {
        C34873a() {
        }

        public void onClick(View view) {
            View view2 = new View(OwnTransferDetailsActivity.this);
            view2.setTag(OwnTransferDetailsActivity.this.f84281O);
            OwnTransferDetailsActivity.this.onClick(view2);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity$b */
    class C34874b implements View.OnClickListener {
        C34874b() {
        }

        public void onClick(View view) {
            View view2 = new View(OwnTransferDetailsActivity.this);
            view2.setTag(OwnTransferDetailsActivity.this.f84282P);
            OwnTransferDetailsActivity.this.onClick(view2);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity$c */
    class C34875c extends RestCallback {
        C34875c() {
        }

        public void onEnqueue(C41205b bVar) {
            OwnTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OwnTransferDetailsActivity ownTransferDetailsActivity = OwnTransferDetailsActivity.this;
            ownTransferDetailsActivity.f84271D0 = false;
            ownTransferDetailsActivity.f84272E0 = true;
            ownTransferDetailsActivity.mo85325m3();
            OwnTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OwnTransferDetailsActivity ownTransferDetailsActivity = OwnTransferDetailsActivity.this;
            ownTransferDetailsActivity.f84271D0 = false;
            ownTransferDetailsActivity.f84272E0 = !bankApiResponse.isSuccess();
            if (bankApiResponse.isSuccess()) {
                OwnTransferDetailsActivity.this.f84312t0 = ((MoneyTransferCommissionApiModel) bankApiResponse.getResult()).getCommissionAnount().doubleValue();
                OwnTransferDetailsActivity.this.mo85332r3(((MoneyTransferCommissionApiModel) bankApiResponse.getResult()).getCommissionDescDictionaryKey());
                OwnTransferDetailsActivity.this.mo85241t3();
                OwnTransferDetailsActivity.this.m102597P3();
            } else {
                C32297d.m95154b(OwnTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                OwnTransferDetailsActivity.this.mo85257N2();
            }
            OwnTransferDetailsActivity.this.mo85325m3();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity$d */
    class C34876d extends RestCallback {
        C34876d() {
        }

        public void onEnqueue(C41205b bVar) {
            OwnTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OwnTransferDetailsActivity ownTransferDetailsActivity = OwnTransferDetailsActivity.this;
            ownTransferDetailsActivity.f84272E0 = true;
            ownTransferDetailsActivity.f84271D0 = false;
            ownTransferDetailsActivity.mo85325m3();
            OwnTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OwnTransferDetailsActivity ownTransferDetailsActivity = OwnTransferDetailsActivity.this;
            ownTransferDetailsActivity.f84271D0 = false;
            ownTransferDetailsActivity.f84272E0 = !bankApiResponse.isSuccess();
            OwnTransferDetailsActivity.this.mo85257N2();
            if (!bankApiResponse.isSuccess() || bankApiResponse.getResult() == null) {
                C32297d.m95154b(OwnTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            } else {
                OwnTransferDetailsActivity.this.mo85293Y3(bankApiResponse);
            }
            OwnTransferDetailsActivity.this.mo85325m3();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity$e */
    class C34877e implements C39610j.C39612b {

        /* renamed from: a */
        final /* synthetic */ int f84249a;

        /* renamed from: ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity$e$a */
        class C34878a extends RestCallback {
            C34878a() {
            }

            public void onEnqueue(C41205b bVar) {
                OwnTransferDetailsActivity.this.mo86438k1(bVar);
            }

            public void onFailure(Throwable th) {
                super.onFailure(th);
                C36546y.m108282F().mo27136G("transfers", "transfer_failure", "own_account", (Bundle) null);
                OwnTransferDetailsActivity.this.mo85321a3();
                if (th instanceof SocketTimeoutException) {
                    Intent intent = new Intent(OwnTransferDetailsActivity.this, PaymentResultActivity.class);
                    intent.putExtra("PAYMENT_TIMED_OUT", true);
                    intent.putExtra("IS_TRANSFER", true);
                    OwnTransferDetailsActivity.this.startActivity(intent);
                    OwnTransferDetailsActivity.this.setResult(-1);
                    OwnTransferDetailsActivity.this.finish();
                }
            }

            public void onResponse(BankApiResponse bankApiResponse) {
                super.onResponse(bankApiResponse);
                OwnTransferDetailsActivity.this.mo85321a3();
                if (bankApiResponse.isSuccess() || "document.result.code.accept".equals(bankApiResponse.getKey()) || "document.result.code.processing".equals(bankApiResponse.getKey())) {
                    if (OwnTransferDetailsActivity.this.f84316x0.getCcy().equals(OwnTransferDetailsActivity.this.f84314v0.getCcy())) {
                        C32306g0.m95223d("own_account");
                        C36546y.m108282F().mo27137H("own_account_transfer_completed", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                    } else {
                        C32306g0.m95223d("conversion");
                        C36546y.m108282F().mo27137H("currency_exchange_completed", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                    }
                    C34877e eVar = C34877e.this;
                    OwnTransferDetailsActivity ownTransferDetailsActivity = OwnTransferDetailsActivity.this;
                    int i = eVar.f84249a;
                    Long valueOf = bankApiResponse.getResult() == null ? null : Long.valueOf(((TransferResult) bankApiResponse.getResult()).getReferenceDocKey());
                    TransferTemplateObject S3 = OwnTransferDetailsActivity.this.mo85290S3((TemplateBasketItem) null);
                    String key = bankApiResponse.getKey();
                    OwnTransferDetailsActivity ownTransferDetailsActivity2 = OwnTransferDetailsActivity.this;
                    TransferResultActivity.m104910d3(ownTransferDetailsActivity, i, valueOf, OwnTransferDetailsActivity.this.f84316x0.getAccountTitle(), OwnTransferDetailsActivity.this.f84316x0.getCcy(), OwnTransferDetailsActivity.this.f84314v0.getAccountTitle(), OwnTransferDetailsActivity.this.f84314v0.getCcy(), (String) null, (String) null, (String) null, OwnTransferDetailsActivity.this.f84293a0.getValueText(), OwnTransferDetailsActivity.this.mo85319Y2(), C32303f.m95204o(OwnTransferDetailsActivity.this.f84312t0) + C32303f.m95198i(OwnTransferDetailsActivity.this.f84316x0.getCcy(), true), S3, key, ownTransferDetailsActivity2.f84234L0, ownTransferDetailsActivity2.f84244V0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, ownTransferDetailsActivity2.m102598R3(), (String) null, (Boolean) null);
                    OwnTransferDetailsActivity.this.finish();
                    C36546y.m108282F().mo27152s("transfers", "own_account", "finish_transfer");
                } else if (BankApiResponse.CODE_STATUS_WARNING.equals(bankApiResponse.getCodeStatus())) {
                    C36546y.m108282F().mo27152s("transfers", "own_account", "warning_transfer");
                    C34877e eVar2 = C34877e.this;
                    OwnTransferDetailsActivity ownTransferDetailsActivity3 = OwnTransferDetailsActivity.this;
                    int i2 = eVar2.f84249a;
                    Long valueOf2 = bankApiResponse.getResult() == null ? null : Long.valueOf(((TransferResult) bankApiResponse.getResult()).getReferenceDocKey());
                    TransferTemplateObject S32 = OwnTransferDetailsActivity.this.mo85290S3((TemplateBasketItem) null);
                    String key2 = bankApiResponse.getKey();
                    OwnTransferDetailsActivity ownTransferDetailsActivity4 = OwnTransferDetailsActivity.this;
                    TransferResultActivity.m104910d3(ownTransferDetailsActivity3, i2, valueOf2, OwnTransferDetailsActivity.this.f84316x0.getAccountTitle(), OwnTransferDetailsActivity.this.f84316x0.getCcy(), OwnTransferDetailsActivity.this.f84314v0.getAccountTitle(), OwnTransferDetailsActivity.this.f84314v0.getCcy(), (String) null, (String) null, (String) null, OwnTransferDetailsActivity.this.f84293a0.getValueText(), OwnTransferDetailsActivity.this.mo85319Y2(), C32303f.m95204o(OwnTransferDetailsActivity.this.f84312t0) + C32303f.m95198i(OwnTransferDetailsActivity.this.f84316x0.getCcy(), true), S32, key2, ownTransferDetailsActivity4.f84234L0, ownTransferDetailsActivity4.f84244V0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, ownTransferDetailsActivity4.m102598R3(), (String) null, Boolean.TRUE);
                    OwnTransferDetailsActivity.this.finish();
                } else {
                    C36546y.m108282F().mo27136G("transfers", "transfer_failure", "own_account", (Bundle) null);
                    C32297d.m95154b(OwnTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                }
            }
        }

        C34877e(int i) {
            this.f84249a = i;
        }

        /* renamed from: a */
        public void mo85270a(C41205b bVar) {
            OwnTransferDetailsActivity.this.mo86438k1(bVar);
        }

        /* renamed from: b */
        public void mo85271b(String str) {
            String Y2 = OwnTransferDetailsActivity.this.mo85319Y2();
            String ccy = OwnTransferDetailsActivity.this.f84316x0.getCcy();
            OwnTransferDetailsActivity ownTransferDetailsActivity = OwnTransferDetailsActivity.this;
            if (ownTransferDetailsActivity.f84235M0) {
                Y2 = ownTransferDetailsActivity.f84234L0.split(" ")[0];
                if (Y2.startsWith(".")) {
                    Y2 = BankApiResponse.SUCCESSFUL_RESPONSE_CODE + Y2;
                }
                ccy = OwnTransferDetailsActivity.this.f84314v0.getCcy();
            }
            OwnTransferDetailsActivity ownTransferDetailsActivity2 = OwnTransferDetailsActivity.this;
            ownTransferDetailsActivity2.f84229G0.transferBetweenOwnAccounts(String.valueOf(ownTransferDetailsActivity2.f84316x0.getId()), String.valueOf(OwnTransferDetailsActivity.this.f84314v0.getId()), Y2, ccy, OwnTransferDetailsActivity.this.f84293a0.getValueText(), OwnTransferDetailsActivity.this.f84316x0.getCcy(), OwnTransferDetailsActivity.this.f84314v0.getCcy(), OwnTransferDetailsActivity.this.f84232J0 + "", str, new C34878a());
        }
    }

    public OwnTransferDetailsActivity() {
        Locale locale = Locale.US;
        this.f84240R0 = new DecimalFormat("0.########", new DecimalFormatSymbols(locale));
        this.f84241S0 = new DecimalFormat("0.##", new DecimalFormatSymbols(locale));
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public void m102597P3() {
        if (mo85284d3()) {
            m102599T3();
        } else {
            mo85257N2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public TransferHistoryItem m102598R3() {
        String str;
        TransferHistoryItem transferHistoryItem = new TransferHistoryItem();
        try {
            transferHistoryItem.setClientKey(Long.parseLong(this.f84230H0.getLoginInfo().mo90304a()));
            transferHistoryItem.setAmount(new BigDecimal(mo85319Y2()));
            transferHistoryItem.setCcy(this.f84314v0.getCcy());
            transferHistoryItem.setRate(new BigDecimal(this.f84232J0));
            transferHistoryItem.srcAcctKey = this.f84316x0.getId();
            transferHistoryItem.dstAcctKey = this.f84314v0.getId();
            if (mo85284d3()) {
                str = "PAYMENT_CONVERSION";
            } else {
                str = "PAYMENT_OWN_ACCOUNTS";
            }
            transferHistoryItem.docType = str;
            transferHistoryItem.nomination = this.f84293a0.getValueText();
            transferHistoryItem.benefAcctNo = this.f84314v0.getAcctNo();
            transferHistoryItem.benefName = this.f84230H0.getUserInfo().getClient().getName();
            transferHistoryItem.payerName = this.f84286T.getValueText();
            transferHistoryItem.payerInn = this.f84287U.getValueText();
            transferHistoryItem.srcAcctNo = this.f84316x0.getAcctNo();
            transferHistoryItem.dstAcctNo = this.f84314v0.getAcctNo();
            transferHistoryItem.srcAcctName = this.f84315w0.getAccountTitle();
            transferHistoryItem.dstAcctName = this.f84313u0.getAccountTitle();
        } catch (Exception unused) {
        }
        return transferHistoryItem;
    }

    /* renamed from: T3 */
    private void m102599T3() {
        AccountLov a = C31972b.m94378c(this.f84307o0.getAccountLovContainer(), Long.parseLong((String) this.f84311s0.get(1)), mo85291W3(), true).mo72458a();
        AccountLov a2 = C31972b.m94378c(this.f84307o0.getAccountLovContainer(), Long.parseLong((String) this.f84311s0.get(3)), mo85291W3(), false).mo72458a();
        if (a == null || a2 == null) {
            this.f84271D0 = false;
            this.f84272E0 = false;
            mo85257N2();
        } else {
            this.f84271D0 = true;
            this.f84272E0 = false;
            this.f84229G0.transfersGetCommRate(a.getCcy(), a2.getCcy(), new C34876d());
        }
        mo85325m3();
    }

    /* renamed from: U3 */
    private void m102600U3() {
        if (this.f84316x0 == null || TextUtils.isEmpty(this.f84282P.getValueText()) || mo85315S2() <= Utils.DOUBLE_EPSILON) {
            m102597P3();
        } else {
            this.f84272E0 = false;
            this.f84271D0 = true;
            this.f84229G0.getTransferCommission(String.valueOf(this.f84316x0.getId()), (String) this.f84311s0.get(15), this.f84316x0.getCcy(), mo85320Z2(this.f84282P.getValueText()), (String) null, "", "M", (String) null, new C34875c());
        }
        mo85325m3();
    }

    /* renamed from: Z3 */
    private void m102601Z3() {
        mo85311I3();
        this.f84242T0.mo93271a(BankApi.SERVICE_TRANSFERS_BETWEEN_OWN_ACCOUNTS, new C34877e(mo85291W3()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        mo85333u3(false);
        this.f84242T0 = new C39610j(this.f84229G0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public void mo85236P2() {
        boolean z;
        Iterator it = mo85283V3().iterator();
        boolean z2 = true;
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            } else if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(((Integer) it.next()).intValue()))) {
                z2 = false;
            }
        }
        if (mo85315S2() <= Utils.DOUBLE_EPSILON) {
            z2 = false;
        }
        if (mo85323e3()) {
            z2 = false;
        }
        if (mo85312O2(mo85291W3())) {
            z = z2;
        }
        this.f84276J.f68595L.f70288l.setOrange(z, z, true);
    }

    /* renamed from: Q3 */
    public boolean mo85289Q3() {
        BigDecimal bigDecimal;
        if (this.f84236N0 == null || this.f84237O0 == null || (bigDecimal = this.f84238P0) == null || this.f84239Q0 == null) {
            return false;
        }
        if (bigDecimal.doubleValue() > this.f84239Q0.doubleValue()) {
            if (this.f84238P0.doubleValue() != 1.0d) {
                return true;
            }
            return false;
        } else if (this.f84238P0.doubleValue() < 1.0d || this.f84239Q0.doubleValue() < 1.0d) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S3 */
    public TransferTemplateObject mo85290S3(TemplateBasketItem templateBasketItem) {
        TransferTemplateObject transferTemplateObject = new TransferTemplateObject();
        transferTemplateObject.setAmount(mo85319Y2());
        transferTemplateObject.setTemplateName((String) this.f84311s0.get(0));
        transferTemplateObject.setTemplateType("M");
        AccountLov accountLov = this.f84314v0;
        if (accountLov != null) {
            transferTemplateObject.addTemplateParam("creditAccNo", accountLov.getAcctNo(), mo85318V2(templateBasketItem, "creditAccNo"));
            transferTemplateObject.addTemplateParam("creditAccountNumber", this.f84314v0.getAcctNo(), mo85318V2(templateBasketItem, "creditAccountNumber"));
            transferTemplateObject.addTemplateParam("idCreditAccount", this.f84314v0.getAcctNo(), mo85318V2(templateBasketItem, "idCreditAccount"));
            transferTemplateObject.addTemplateParam("creditAccountId", this.f84314v0.getId() + "", mo85318V2(templateBasketItem, "creditAccountId"));
        }
        transferTemplateObject.addTemplateParam("description", (String) this.f84311s0.get(19), mo85318V2(templateBasketItem, "description"));
        transferTemplateObject.addTemplateParam("paymentdetail", (String) this.f84311s0.get(19), mo85318V2(templateBasketItem, "paymentdetail"));
        transferTemplateObject.addTemplateParam("amount", mo85319Y2(), mo85318V2(templateBasketItem, "amount"));
        AccountLov accountLov2 = this.f84316x0;
        if (accountLov2 != null) {
            transferTemplateObject.addTemplateParam("debitAccountNumber", accountLov2.getAcctNo(), mo85318V2(templateBasketItem, "debitAccountNumber"));
            transferTemplateObject.addTemplateParam("debitAccNo", this.f84316x0.getAcctNo(), mo85318V2(templateBasketItem, "debitAccNo"));
            transferTemplateObject.addTemplateParam("debitAccCurrency", this.f84316x0.getCcy(), mo85318V2(templateBasketItem, "debitAccCurrency"));
            transferTemplateObject.addTemplateParam("debitAccountId", this.f84316x0.getId() + "", mo85318V2(templateBasketItem, "debitAccountId"));
            transferTemplateObject.addTemplateParam("debitAccountCurrency", this.f84316x0.getCcy(), mo85318V2(templateBasketItem, "debitAccountCurrency"));
            transferTemplateObject.addTemplateParam("idDebitAccount", this.f84316x0.getId() + "", mo85318V2(templateBasketItem, "idDebitAccount"));
        }
        if (templateBasketItem != null) {
            transferTemplateObject.setId(Long.valueOf(templateBasketItem.getId()));
        }
        return transferTemplateObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V3 */
    public ArrayList mo85283V3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W3 */
    public int mo85291W3() {
        return mo85284d3() ? 3 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X2 */
    public void mo85261X2() {
        m102600U3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X3 */
    public Intent mo85292X3(View view) {
        int i;
        int i2;
        boolean z;
        Intent intent = new Intent(this, DomesticTransferWizardActivity.class);
        if (view.getTag() == null || !(view.getTag() instanceof TextTypeView)) {
            i2 = 0;
            i = 0;
        } else {
            i2 = ((TextTypeView) view.getTag()).getPosition();
            i = C32290b1.m95119i((TextTypeView) view.getTag()).top;
        }
        intent.putExtra("WIZARD_INPUT_Y_POSITION", i);
        intent.putExtra("WIZARD_PAGE_INDEX", i2);
        intent.putStringArrayListExtra("WIZARD_COLLECTED_VALUES", this.f84311s0);
        C32340v0.m95377c(this.f84307o0);
        if ("TRANSFER".equals(this.f84308p0) || "CREATE".equals(this.f84310r0)) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("TRANSFER_GET_DOMESTIC_NOMINATIONS", z);
        intent.putExtra("TRANSFER_FORM", this.f84309q0);
        if (view == this.f84290X.getViewSelector()) {
            intent.putExtra("TRANSFER_RATE_FOCUS_INDEX", 1);
        } else {
            intent.putExtra("TRANSFER_RATE_FOCUS_INDEX", 0);
        }
        String str = this.f84237O0;
        if (!(str == null || this.f84236N0 == null)) {
            intent.putExtra("TRANSFER_WIZARD_TO_RATE", str);
            intent.putExtra("TRANSFER_WIZARD_FROM_RATE", this.f84236N0);
        }
        intent.putExtra("TRANSFER_WIZARD_RATE", this.f84232J0);
        intent.putExtra("TRANSFER_WIZARD_CONVERSION_TYPE", this.f84243U0);
        AccountLov accountLov = this.f84316x0;
        if (accountLov != null) {
            intent.putExtra("TRANSFER_WIZARD_FROM_ACCOUNT_CCY", accountLov.getCcy());
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0093  */
    /* renamed from: Y3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85293Y3(p341ge.bog.mobilebank.shared2.network.BankApiResponse r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.getResult()
            ge.bog.mobilebank.model.RateWeight r0 = (p341ge.bog.mobilebank.model.RateWeight) r0
            r6.f84231I0 = r0
            p90.e2 r0 = r6.f84276J
            ge.bog.mobilebank.ui.views.widgets.ProviderDetailTypeView r0 = r0.f68612c0
            java.lang.String r1 = "TYPE_GREEN"
            r0.setType(r1)
            double r0 = r6.f84233K0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ge.bog.mobilebank.model.account.AccountLov r1 = r6.f84316x0
            java.lang.String r1 = r1.getCcy()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            ge.bog.mobilebank.model.account.AccountLov r1 = r6.f84314v0
            java.lang.String r1 = r1.getCcy()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r6.f84243U0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            double r0 = r6.f84233K0
            r6.f84232J0 = r0
            goto L_0x0056
        L_0x0046:
            java.lang.Object r0 = r7.getResult()
            ge.bog.mobilebank.model.RateWeight r0 = (p341ge.bog.mobilebank.model.RateWeight) r0
            java.math.BigDecimal r0 = r0.getRate()
            double r0 = r0.doubleValue()
            r6.f84232J0 = r0
        L_0x0056:
            java.lang.Object r0 = r7.getResult()
            ge.bog.mobilebank.model.RateWeight r0 = (p341ge.bog.mobilebank.model.RateWeight) r0
            java.lang.String r0 = r0.getCcy1()
            ge.bog.mobilebank.model.account.AccountLov r1 = r6.f84316x0
            java.lang.String r1 = r1.getCcy()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r7.getResult()
            ge.bog.mobilebank.model.RateWeight r0 = (p341ge.bog.mobilebank.model.RateWeight) r0
            java.math.BigDecimal r0 = r0.getRateWeight()
            r6.f84239Q0 = r0
            java.lang.Object r7 = r7.getResult()
            ge.bog.mobilebank.model.RateWeight r7 = (p341ge.bog.mobilebank.model.RateWeight) r7
            java.math.BigDecimal r7 = r7.getRate()
            r6.f84238P0 = r7
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.f84236N0 = r7
            java.math.BigDecimal r7 = r6.f84239Q0
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.f84237O0 = r7
            goto L_0x00bb
        L_0x0093:
            java.lang.Object r0 = r7.getResult()
            ge.bog.mobilebank.model.RateWeight r0 = (p341ge.bog.mobilebank.model.RateWeight) r0
            java.math.BigDecimal r0 = r0.getRateWeight()
            r6.f84238P0 = r0
            java.lang.Object r7 = r7.getResult()
            ge.bog.mobilebank.model.RateWeight r7 = (p341ge.bog.mobilebank.model.RateWeight) r7
            java.math.BigDecimal r7 = r7.getRate()
            r6.f84239Q0 = r7
            java.math.BigDecimal r7 = r6.f84238P0
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.f84236N0 = r7
            java.math.BigDecimal r7 = r6.f84239Q0
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.f84237O0 = r7
        L_0x00bb:
            double r0 = r6.f84232J0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x018b
            p90.e2 r7 = r6.f84276J
            ge.bog.mobilebank.ui.views.widgets.ProviderDetailTypeView r7 = r7.f68607X
            r0 = 0
            r7.setVisibility(r0)
            java.lang.String r7 = r6.f84234L0
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r1 = 1
            if (r7 == 0) goto L_0x010c
            boolean r7 = r6.mo85289Q3()
            if (r7 == 0) goto L_0x00e0
            double r2 = r6.mo85315S2()
            double r4 = r6.f84232J0
            double r2 = r2 * r4
            goto L_0x00e7
        L_0x00e0:
            double r2 = r6.mo85315S2()
            double r4 = r6.f84232J0
            double r2 = r2 / r4
        L_0x00e7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.text.DecimalFormat r4 = r6.f84241S0
            java.lang.String r2 = r4.format(r2)
            r7.append(r2)
            ge.bog.mobilebank.model.account.AccountLov r2 = r6.f84314v0
            if (r2 == 0) goto L_0x0102
            java.lang.String r2 = r2.getCcy()
            java.lang.String r2 = g91.C32303f.m95198i(r2, r1)
            goto L_0x0104
        L_0x0102:
            java.lang.String r2 = ""
        L_0x0104:
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            goto L_0x010e
        L_0x010c:
            java.lang.String r7 = r6.f84234L0
        L_0x010e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "1 "
            r2.append(r3)
            ge.bog.mobilebank.model.RateWeight r3 = r6.f84231I0
            java.lang.String r3 = r3.getCcy1()
            r2.append(r3)
            java.lang.String r3 = " = "
            r2.append(r3)
            java.text.DecimalFormat r3 = r6.f84240R0
            double r4 = r6.f84232J0
            java.lang.String r3 = r3.format(r4)
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            ge.bog.mobilebank.model.RateWeight r3 = r6.f84231I0
            java.lang.String r3 = r3.getCcy2()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r6.f84244V0 = r2
            p90.e2 r2 = r6.f84276J
            ge.bog.mobilebank.ui.views.widgets.ProviderDetailTypeView r2 = r2.f68607X
            int r3 = p366bk.C10328q.common_text_currency
            java.lang.String r3 = r6.getString(r3)
            r2.setTitleText(r3)
            p90.e2 r2 = r6.f84276J
            ge.bog.mobilebank.ui.views.widgets.ProviderDetailTypeView r2 = r2.f68607X
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            ge.bog.mobilebank.model.RateWeight r4 = r6.f84231I0
            java.lang.String r4 = r4.getCcy1()
            java.lang.String r4 = g91.C32303f.m95197h(r4)
            r3[r0] = r4
            java.text.DecimalFormat r0 = r6.f84240R0
            double r4 = r6.f84232J0
            java.lang.String r0 = r0.format(r4)
            r3[r1] = r0
            ge.bog.mobilebank.model.RateWeight r0 = r6.f84231I0
            java.lang.String r0 = r0.getCcy2()
            java.lang.String r0 = g91.C32303f.m95197h(r0)
            r1 = 2
            r3[r1] = r0
            java.lang.String r0 = "1%s=%s%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r2.setValueText(r0)
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r6.f84290X
            r0.setValueTextIgnoringEmpty(r7)
            goto L_0x01a7
        L_0x018b:
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r7 = r6.f84290X
            r0 = 8
            r7.setVisibility(r0)
            p90.e2 r7 = r6.f84276J
            ge.bog.mobilebank.ui.views.widgets.ProviderDetailTypeView r7 = r7.f68607X
            r7.setVisibility(r0)
            p90.e2 r7 = r6.f84276J
            ge.bog.mobilebank.ui.views.widgets.ProviderDetailTypeView r7 = r7.f68614d0
            r7.setVisibility(r0)
            p90.e2 r7 = r6.f84276J
            ge.bog.mobilebank.ui.views.widgets.ProviderDetailTypeView r7 = r7.f68612c0
            r7.setVisibility(r0)
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity.mo85293Y3(ge.bog.mobilebank.shared2.network.BankApiResponse):void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10008) {
            this.f84311s0 = intent.getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
            this.f84233K0 = intent.getDoubleExtra("TRANSFER_WIZARD_RATE", -1.0d);
            this.f84237O0 = intent.getStringExtra("TRANSFER_WIZARD_TO_RATE");
            this.f84236N0 = intent.getStringExtra("TRANSFER_WIZARD_FROM_RATE");
            this.f84234L0 = intent.getStringExtra("TRANSFER_WIZARD_EXCHANGED");
            this.f84235M0 = intent.getBooleanExtra("TRANSFER_WIZARD_EXCHANGED_BUY", false);
            this.f84243U0 = intent.getStringExtra("TRANSFER_WIZARD_CONVERSION_TYPE");
            RateWeight rateWeight = (RateWeight) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_WIZARD_RATE_WEIGHT"));
            if (rateWeight != null) {
                this.f84231I0 = rateWeight;
            }
            mo85333u3(true);
        }
    }

    public void onClick(View view) {
        BogButton bogButton = this.f84276J.f68595L.f70288l;
        if (view != bogButton) {
            C36546y.m108282F().mo27152s("transfers", ((TextTypeView) view.getTag()).getBogInputLayout().getHint(), "wizard_open");
            DomesticTransferWizardActivity.m106485w4(this, mo85292X3(view), 10008);
        } else if (bogButton.isOrange() && this.f84316x0 != null && this.f84314v0 != null) {
            m102601Z3();
        }
    }

    /* renamed from: p3 */
    public void mo85267p3() {
        C31971a aVar;
        C31971a aVar2;
        if (!TextUtils.isEmpty((CharSequence) this.f84311s0.get(1))) {
            aVar = C31972b.m94378c(this.f84307o0.getAccountLovContainer(), Long.parseLong((String) this.f84311s0.get(1)), mo85291W3(), true);
        } else {
            aVar = null;
        }
        if (!TextUtils.isEmpty((CharSequence) this.f84311s0.get(3))) {
            aVar2 = C31972b.m94378c(this.f84307o0.getAccountLovContainer(), Long.parseLong((String) this.f84311s0.get(3)), mo85291W3(), false);
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            this.f84314v0 = aVar2.mo72458a();
            this.f84313u0 = aVar2.mo72460c();
        }
        if (aVar2 == null || this.f84314v0 == null || this.f84313u0 == null) {
            this.f84311s0.set(3, "");
            this.f84314v0 = null;
            this.f84313u0 = null;
        }
        if (aVar != null) {
            this.f84316x0 = aVar.mo72458a();
            this.f84315w0 = aVar.mo72460c();
        }
        if (aVar == null || this.f84316x0 == null || this.f84315w0 == null) {
            this.f84311s0.set(1, "");
            this.f84316x0 = null;
            this.f84315w0 = null;
        }
    }

    /* renamed from: s3 */
    public void mo85240s3(boolean z) {
        mo85335z3(false);
        mo85310H3(false);
        mo85308F3(false);
        mo85303A3(false);
        mo85306D3(false);
    }

    /* renamed from: t3 */
    public void mo85241t3() {
        mo85327o3();
        mo85331q3();
    }

    /* renamed from: v3 */
    public void mo85242v3(boolean z) {
        this.f84276J.f68615e.setLeftClickListener(new C34873a());
        this.f84276J.f68615e.setRightClickListener(new C34874b());
        this.f84281O.clearInputDrawableEnd();
        AccountLov accountLov = this.f84315w0;
        if (accountLov == null || this.f84316x0 == null) {
            this.f84281O.setValueTextIgnoringEmpty((String) null);
            this.f84276J.f68615e.resetLeft();
        } else {
            String name = accountLov.getName();
            if (TextUtils.isEmpty(name)) {
                name = this.f84316x0.getAcctNo();
            }
            String str = name;
            this.f84281O.setValueTextIgnoringEmpty(str);
            ProductProperties properties = ProductProperties.getProperties(this.f84315w0, this.f84230H0, false);
            this.f84276J.f68615e.setLeft(properties.getBackgroundImageId(), false, str, this.f84316x0.getRealAmountFormatted(), true);
            this.f84276J.f68615e.setTextColorIds(properties.getTitleColorId(), true);
            this.f84276J.f68615e.setLeftFrameState(11);
            if (this.f84315w0.isDefault()) {
                this.f84281O.setInputDrawableEnd(C10320i.ic_favorite_12dp);
            }
        }
        AccountLov accountLov2 = this.f84313u0;
        if (accountLov2 == null || this.f84314v0 == null) {
            this.f84276J.f68615e.resetRight();
            this.f84282P.setValueTextIgnoringEmpty((String) null);
        } else {
            String name2 = accountLov2.getName();
            if (TextUtils.isEmpty(name2)) {
                name2 = this.f84314v0.getAcctNo();
            }
            String str2 = name2;
            this.f84282P.setValueTextIgnoringEmpty(str2);
            ProductProperties properties2 = ProductProperties.getProperties(this.f84313u0, this.f84230H0, false);
            this.f84276J.f68615e.setRightFrameState(11);
            this.f84276J.f68615e.setRight(properties2.getBackgroundImageId(), false, str2, this.f84314v0.getRealAmountFormatted(), false);
            this.f84276J.f68615e.setTextColorIds(properties2.getTitleColorId(), false);
        }
        this.f84289W.setValueTextIgnoringEmpty(mo85317U2(mo85315S2(), mo85316T2()));
        this.f84293a0.setValueTextIgnoringEmpty((String) this.f84311s0.get(19));
    }

    /* renamed from: y3 */
    public void mo85243y3() {
        this.f84276J.f68604U.addView(this.f84281O);
        this.f84276J.f68627k.addView(this.f84282P);
        this.f84276J.f68596M.addView(this.f84289W);
        this.f84276J.f68616e0.addView(this.f84293a0);
        if (mo85284d3()) {
            this.f84276J.f68597N.addView(this.f84290X);
            this.f84289W.setTitleText(getString(C10328q.transfers_title_to_sell));
        }
    }
}
