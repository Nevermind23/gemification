package p341ge.bog.mobilebank.p975ui.activities;

import a50.C19169a;
import a50.C19170b;
import a50.C19176e;
import a81.C30568d7;
import a81.C30582e7;
import a81.C30596f7;
import a81.C30610g7;
import a81.C30624h7;
import a81.C30638i7;
import a81.C30652j7;
import a81.C30665k7;
import a81.C30678l7;
import a81.C30691m7;
import a81.C30704n7;
import a81.C30717o7;
import a81.C30730p7;
import a81.C30743q7;
import a81.C30756r7;
import a81.C30769s7;
import a81.C30782t7;
import a81.C30795u7;
import a81.C30808v7;
import a81.C30821w7;
import a81.C30834x7;
import a81.C30847y7;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import c50.C19492r;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import d50.C19909b;
import g91.C32289b0;
import g91.C32297d;
import g91.C32303f;
import g91.C32307h;
import g91.C32319m;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hd1.C41205b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import n20.C26360b;
import org.parceler.C42035e;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.eventbus.events.InTransferDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.OperationDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.OutTransferDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.UtilityPaymentDetailsEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.InTransferDetail;
import p341ge.bog.mobilebank.model.OperationPfmDetails;
import p341ge.bog.mobilebank.model.PMIDocGPIAction;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.bonus.BonusType;
import p341ge.bog.mobilebank.model.payment.DeviceType;
import p341ge.bog.mobilebank.model.payment.LastOperation;
import p341ge.bog.mobilebank.model.payment.PaymentDetail;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.QrPayReversalActivity;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10320i;
import p366bk.C10328q;
import p380ck.C10463g;
import p420fh.C12910e;
import p737dt.C20100q;
import p750ew.C20300c;
import p773gv.C24784c;
import p90.C27265c1;
import q40.C27680a;
import q81.C38162a0;
import r90.C27950a;
import r90.C27954d;

/* renamed from: ge.bog.mobilebank.ui.activities.OperationDetailsActivity */
public class OperationDetailsActivity extends C35343a0 {

    /* renamed from: G */
    protected Client f85196G;

    /* renamed from: H */
    protected C41438c f85197H;

    /* renamed from: I */
    protected PreferencesApiManager f85198I;

    /* renamed from: J */
    private C27265c1 f85199J;

    /* renamed from: K */
    private int f85200K;

    /* renamed from: L */
    private long f85201L;

    /* renamed from: M */
    private long f85202M;

    /* renamed from: N */
    private AccountOperation f85203N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public LastOperation f85204O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public TransferHistoryItem f85205P;

    /* renamed from: Q */
    private PaymentDetail f85206Q;

    /* renamed from: R */
    private InTransferDetail f85207R;

    /* renamed from: S */
    private C33624a.C33625a f85208S;

    /* renamed from: T */
    protected C19170b f85209T = new C19170b();

    /* renamed from: U */
    protected C19170b f85210U = new C19170b();

    /* renamed from: V */
    protected C19170b f85211V = new C19170b();

    /* renamed from: W */
    private boolean f85212W;

    /* renamed from: X */
    private boolean f85213X;

    /* renamed from: Y */
    private boolean f85214Y;

    /* renamed from: Z */
    private boolean f85215Z;

    /* renamed from: a0 */
    private boolean f85216a0;

    /* renamed from: b0 */
    private boolean f85217b0;

    /* renamed from: c0 */
    private boolean f85218c0;

    /* renamed from: d0 */
    private boolean f85219d0 = false;

    /* renamed from: e0 */
    private boolean f85220e0 = false;

    /* renamed from: f0 */
    private OperationDetailsEvent f85221f0;

    /* renamed from: g0 */
    private OutTransferDetailsEvent f85222g0;

    /* renamed from: h0 */
    private UtilityPaymentDetailsEvent f85223h0;

    /* renamed from: i0 */
    private PaymentDetailsEvent f85224i0;

    /* renamed from: j0 */
    private InTransferDetailsEvent f85225j0;

    /* renamed from: k0 */
    C20300c f85226k0;

    /* renamed from: l0 */
    C20100q f85227l0;

    /* renamed from: m0 */
    C24784c f85228m0;

    /* renamed from: n0 */
    protected BankApi f85229n0;

    /* renamed from: o0 */
    private boolean f85230o0;

    /* renamed from: ge.bog.mobilebank.ui.activities.OperationDetailsActivity$a */
    class C35283a extends RestCallback {
        C35283a() {
        }

        public void onEnqueue(C41205b bVar) {
            OperationDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OperationDetailsActivity.this.m104452g4(false);
            C32297d.m95153a(OperationDetailsActivity.this);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OperationDetailsActivity.this.m104452g4(false);
            if (bankApiResponse.isSuccess()) {
                OperationDetailsActivity.this.m104449f3();
                OperationDetailsActivity.this.f85227l0.mo48495b(C19909b.CHANGE_COMPUTABILITY);
            } else if (!bankApiResponse.getCode().equals("14") || !bankApiResponse.getKey().equals("rbc.pfm.update.future.operation.error")) {
                C32297d.m95154b(OperationDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            } else {
                C32297d.m95157e(OperationDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.OperationDetailsActivity$b */
    class C35284b extends RestCallback {
        C35284b() {
        }

        public void onEnqueue(C41205b bVar) {
            OperationDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OperationDetailsActivity.this.m104452g4(false);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OperationDetailsActivity.this.m104452g4(false);
            if (!bankApiResponse.isSuccess()) {
                C32297d.m95154b(OperationDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            } else if (OperationDetailsActivity.this.f85204O != null) {
                OperationPfmDetails operationPfmDetails = (bankApiResponse.getResult() == null || ((List) bankApiResponse.getResult()).isEmpty() || ((List) bankApiResponse.getResult()).get(0) == null) ? null : (OperationPfmDetails) ((List) bankApiResponse.getResult()).get(0);
                if (operationPfmDetails != null) {
                    OperationDetailsActivity.this.f85204O.setPfmCatId(operationPfmDetails.getPfmCatId());
                    OperationDetailsActivity.this.f85204O.setPfmParentCatId(operationPfmDetails.getPfmParentCatId());
                    OperationDetailsActivity.this.m104444c4();
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.OperationDetailsActivity$c */
    class C35285c extends RestCallback {
        C35285c() {
        }

        public void onEnqueue(C41205b bVar) {
            OperationDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OperationDetailsActivity.this.m104452g4(false);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            OperationPfmDetails operationPfmDetails;
            super.onResponse(bankApiResponse);
            OperationDetailsActivity.this.m104452g4(false);
            if (!bankApiResponse.isSuccess()) {
                C32297d.m95154b(OperationDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            } else if (OperationDetailsActivity.this.f85205P != null && (operationPfmDetails = (OperationPfmDetails) bankApiResponse.getResult()) != null) {
                OperationDetailsActivity.this.f85205P.setPfmCatId(operationPfmDetails.getPfmCatId());
                OperationDetailsActivity.this.f85205P.setPfmParentCatId(operationPfmDetails.getPfmParentCatId());
                if (operationPfmDetails.getPmiDocGPIActions() != null && operationPfmDetails.getPmiDocGPIActions().size() > 0) {
                    OperationDetailsActivity.this.f85205P.pmiDocGPIActions = operationPfmDetails.getPmiDocGPIActions();
                }
                OperationDetailsActivity.this.m104444c4();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.OperationDetailsActivity$d */
    class C35286d {

        /* renamed from: a */
        Long f85234a;

        /* renamed from: b */
        Long f85235b;

        /* renamed from: c */
        Long f85236c;

        /* renamed from: d */
        Long f85237d;

        C35286d(Long l, Long l2, Long l3, Long l4) {
            this.f85234a = l;
            this.f85235b = l2;
            this.f85236c = l3;
            this.f85237d = l4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m104391A3(View view) {
        m104404I3();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m104392B3(View view) {
        m104414N3();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m104393C3(View view) {
        m104414N3();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m104394D3(View view) {
        m104418P3();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m104396E3(View view) {
        m104412M3();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m104398F3(View view) {
        m104412M3();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m104400G3(View view) {
        m104408K3();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m104402H3(View view) {
        m104408K3();
    }

    /* renamed from: I3 */
    private void m104404I3() {
        C35286d k3 = m104457k3();
        if (k3 != null) {
            m104452g4(true);
            this.f85229n0.changeTransactionComputability(k3.f85234a, k3.f85235b, this.f85212W ^ true ? 1 : 0, k3.f85237d, new C35283a());
        }
    }

    /* renamed from: J3 */
    private void m104406J3() {
        Class<DDTransparentLoaderActivity> cls = DDTransparentLoaderActivity.class;
        if (this.f85204O != null && this.f85216a0) {
            C36546y.m108282F().mo27136G("operation_payment_details", "click", "create_dd", (Bundle) null);
            for (PaymentProviderConfiguration paymentProviderConfiguration : C27954d.m86303i()) {
                if (paymentProviderConfiguration.getPaymentServiceId() != null && this.f85204O != null && paymentProviderConfiguration.getPaymentServiceId().equals(this.f85204O.getServiceId())) {
                    this.f85208S = C33624a.m98713a(this).mo79806f(cls).mo79819s(paymentProviderConfiguration.getServiceId()).mo79812l(this.f85204O.getEssPaymentId());
                    m104454h4();
                    return;
                }
            }
        } else if (this.f85205P != null) {
            C36546y.m108282F().mo27136G("operation_transfer_details", "click", "create_sto", (Bundle) null);
            TransferForm.startWith((Activity) this, "STO", "CREATE").setTransferHistoryItem(this.f85205P).start();
        } else {
            AccountOperation accountOperation = this.f85203N;
            if (accountOperation == null) {
                return;
            }
            if ("OUT_TRANSFER".equals(accountOperation.getPrintFormType())) {
                C36546y.m108282F().mo27136G("operation_transfer_details", "click", "create_sto", (Bundle) null);
                TransferForm.startWith((Activity) this, "STO", "CREATE").setItemKey(this.f85203N.getDocKey()).setPfmID(this.f85203N.getPfmId()).setOperationDate(Long.valueOf(this.f85203N.getOperationDate())).setPrintFormType(this.f85203N.getPrintFormType()).start();
                return;
            }
            C36546y.m108282F().mo27136G("operation_payment_details", "click", "create_dd", (Bundle) null);
            for (PaymentProviderConfiguration paymentProviderConfiguration2 : C27954d.m86303i()) {
                if (paymentProviderConfiguration2.getPaymentServiceId() != null && paymentProviderConfiguration2.getPaymentServiceId().equals(this.f85203N.getEssServiceId()) && paymentProviderConfiguration2.isDDAllowed) {
                    this.f85208S = C33624a.m98713a(this).mo79806f(cls).mo79819s(paymentProviderConfiguration2.getServiceId()).mo79812l(this.f85203N.getEssId());
                    m104454h4();
                    return;
                }
            }
        }
    }

    /* renamed from: K3 */
    private void m104408K3() {
        C36546y.m108282F().mo27136G("operation_transfer_details", "click", "transfer_back", (Bundle) null);
        if (this.f85205P != null) {
            TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferHistoryItem(this.f85205P).start();
        } else if (this.f85203N != null) {
            TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setAccountOperation(this.f85203N).start();
        }
    }

    /* renamed from: L3 */
    private void m104410L3() {
        QrPayReversalActivity.m105407S2(this, String.valueOf(this.f85203N.getDocKey()), this.f85203N.getMerchantNameByLocale(Boolean.valueOf(this.f85198I.getLanguage().equals("ka"))), String.valueOf(this.f85203N.getAmount()));
    }

    /* renamed from: M3 */
    private void m104412M3() {
        if (this.f85215Z) {
            Class<PaymentFormActivity> cls = PaymentFormActivity.class;
            if (this.f85204O != null) {
                C36546y.m108282F().mo27136G("operation_payment_details", "click", "save", (Bundle) null);
                for (PaymentProviderConfiguration paymentProviderConfiguration : C27954d.m86303i()) {
                    if (paymentProviderConfiguration.getPaymentServiceId() != null && this.f85204O != null && paymentProviderConfiguration.getPaymentServiceId().equals(this.f85204O.getServiceId())) {
                        C33624a.m98713a(this).mo79806f(cls).mo79819s(paymentProviderConfiguration.getServiceId()).mo79812l(this.f85204O.getEssPaymentId()).mo79825y();
                        return;
                    }
                }
            } else if (this.f85205P != null) {
                C36546y.m108282F().mo27136G("operation_transfer_details", "click", "save", (Bundle) null);
                TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferHistoryItem(this.f85205P).start();
            } else {
                AccountOperation accountOperation = this.f85203N;
                if (accountOperation == null) {
                    return;
                }
                if ("OUT_TRANSFER".equals(accountOperation.getPrintFormType())) {
                    C36546y.m108282F().mo27136G("operation_transfer_details", "click", "save", (Bundle) null);
                    TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setItemKey(this.f85203N.getDocKey()).setPfmID(this.f85203N.getPfmId()).setOperationDate(Long.valueOf(this.f85203N.getOperationDate())).setPrintFormType(this.f85203N.getPrintFormType()).start();
                    return;
                }
                C36546y.m108282F().mo27136G("operation_payment_details", "click", "save", (Bundle) null);
                for (PaymentProviderConfiguration paymentProviderConfiguration2 : C27954d.m86303i()) {
                    if (paymentProviderConfiguration2.getPaymentServiceId() != null && paymentProviderConfiguration2.getPaymentServiceId().equals(this.f85203N.getEssServiceId())) {
                        C33624a.m98713a(this).mo79806f(cls).mo79819s(paymentProviderConfiguration2.getServiceId()).mo79812l(this.f85203N.getEssId()).mo79825y();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: N3 */
    private void m104414N3() {
        String str;
        String str2;
        C36546y.m108282F().mo27140K("transaction_receipt");
        if (this.f85213X) {
            boolean z = true;
            this.f85230o0 = true;
            C10463g F = C36546y.m108282F();
            if (this.f85205P != null) {
                str = "operation_transfer_details";
            } else {
                str = "operation_payment_details";
            }
            F.mo27136G(str, "click", "share", (Bundle) null);
            LastOperation lastOperation = this.f85204O;
            if (lastOperation == null && this.f85205P == null) {
                AccountOperation accountOperation = this.f85203N;
                if (accountOperation != null) {
                    String b = C32303f.m95191b(accountOperation.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType());
                    C32303f.m95195f(b, this, getString(C10328q.f28968x1) + ".pdf", "application/pdf");
                    return;
                }
                return;
            }
            if (lastOperation == null) {
                z = false;
            }
            if (lastOperation != null) {
                str2 = lastOperation.getEssPaymentId();
            } else {
                str2 = String.valueOf(this.f85205P.getDocKey());
            }
            String c = C32303f.m95192c(z, str2);
            C32303f.m95195f(c, this, getString(C10328q.f28968x1) + ".pdf", "application/pdf");
            return;
        }
        C32297d.m95158f(this, C27950a.m86284a("text.operation.print.not.allowed"), C32297d.f79709e);
    }

    /* renamed from: O3 */
    private void m104416O3() {
        C36546y.m108282F().mo27152s("money_request", "", "money_request_initiate_operation_bill_split_click");
        if (this.f85196G.isAuthorized()) {
            C38162a0 a = C38162a0.m112290a(this);
            mo86438k1(this.f85228m0.mo63203d(this.f85203N.getEntryId()).mo94906z(C40992a.m118827a()).mo94904r(new C30717o7(a)).mo94888G(new C30730p7(this, a), new C30743q7(this, a)));
        }
    }

    /* renamed from: P3 */
    private void m104418P3() {
        if (this.f85214Y) {
            Class<TemplateFormActivity> cls = TemplateFormActivity.class;
            if (this.f85204O != null) {
                C36546y.m108282F().mo27136G("operation_payment_details", "click", "save", (Bundle) null);
                for (PaymentProviderConfiguration paymentProviderConfiguration : C27954d.m86303i()) {
                    if (paymentProviderConfiguration.getPaymentServiceId() != null && this.f85204O != null && paymentProviderConfiguration.getPaymentServiceId().equals(this.f85204O.getServiceId())) {
                        C33624a.m98713a(this).mo79806f(cls).mo79819s(paymentProviderConfiguration.getServiceId()).mo79812l(this.f85204O.getEssPaymentId()).mo79825y();
                        return;
                    }
                }
            } else if (this.f85205P != null) {
                C36546y.m108282F().mo27136G("operation_transfer_details", "click", "save", (Bundle) null);
                TransferForm.startWith((Activity) this, TransferForm.MODULE_TEMPLATE, "CREATE").setTransferHistoryItem(this.f85205P).start();
            } else {
                AccountOperation accountOperation = this.f85203N;
                if (accountOperation == null) {
                    return;
                }
                if ("OUT_TRANSFER".equals(accountOperation.getPrintFormType())) {
                    C36546y.m108282F().mo27136G("operation_transfer_details", "click", "save", (Bundle) null);
                    TransferForm.startWith((Activity) this, TransferForm.MODULE_TEMPLATE, "CREATE").setItemKey(this.f85203N.getDocKey()).setPfmID(this.f85203N.getPfmId()).setOperationDate(Long.valueOf(this.f85203N.getOperationDate())).setPrintFormType(this.f85203N.getPrintFormType()).start();
                    return;
                }
                C36546y.m108282F().mo27136G("operation_transfer_details", "click", "save", (Bundle) null);
                for (PaymentProviderConfiguration paymentProviderConfiguration2 : C27954d.m86303i()) {
                    if (paymentProviderConfiguration2.getPaymentServiceId() != null && paymentProviderConfiguration2.getPaymentServiceId().equals(this.f85203N.getEssServiceId())) {
                        C33624a.m98713a(this).mo79806f(cls).mo79819s(paymentProviderConfiguration2.getServiceId()).mo79812l(this.f85203N.getEssId()).mo79803c(true).mo79825y();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: Q3 */
    private void m104420Q3(boolean z) {
        int i = this.f85200K;
        if (i == 30) {
            if ("IN_TRANSFER".equals(this.f85203N.getPrintFormType())) {
                this.f85196G.requestInTransferDetails(z, this.f85203N.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType(), this.f85203N.getPfmId(), Long.valueOf(this.f85203N.getEntryId()), Long.valueOf(this.f85203N.getOperationDate()));
            } else if ("OUT_TRANSFER".equals(this.f85203N.getPrintFormType())) {
                this.f85196G.requestOutTransferDetails(z, this.f85203N.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType(), this.f85203N.getPfmId(), Long.valueOf(this.f85203N.getEntryId()), Long.valueOf(this.f85203N.getOperationDate()));
            } else if ("PAYMENT".equals(this.f85203N.getPrintFormType())) {
                this.f85196G.requestPaymentDetails(z, this.f85203N.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType(), this.f85203N.getPfmId(), Long.valueOf(this.f85203N.getEntryId()), Long.valueOf(this.f85203N.getOperationDate()));
            } else if ("UTILITY_PAYMENT".equals(this.f85203N.getPrintFormType())) {
                this.f85196G.requestUtilityPaymentDetails(z, this.f85203N.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType(), this.f85203N.getPfmId(), Long.valueOf(this.f85203N.getEntryId()), Long.valueOf(this.f85203N.getOperationDate()));
            } else {
                TransferForm.TRANSFER_FORM_OTHER.equals(this.f85203N.getPrintFormType());
            }
        } else if (i == 40) {
            this.f85196G.requestOperationDetails(z, this.f85202M, this.f85201L);
        } else if (i == 10) {
            m104422R3();
        } else if (i == 20) {
            m104424S3();
        }
    }

    /* renamed from: R3 */
    private void m104422R3() {
        LastOperation lastOperation = this.f85204O;
        if (lastOperation != null && !this.f85220e0) {
            this.f85229n0.getOperationPfmDetailsList((Long) null, lastOperation.getEssPaymentId(), "UTILITY_PAYMENT", this.f85204O.getPfmId(), (Long) null, this.f85204O.operationDate, new C35284b());
        }
    }

    /* renamed from: S3 */
    private void m104424S3() {
        TransferHistoryItem transferHistoryItem = this.f85205P;
        if (transferHistoryItem != null && !this.f85220e0) {
            this.f85229n0.getOperationPfmDetails(Long.valueOf(transferHistoryItem.docKey), (String) null, "OUT_TRANSFER", this.f85205P.getPfmId(), Long.valueOf(this.f85205P.getEntryId()), Long.valueOf(this.f85205P.getOperationDate()), new C35285c());
        }
    }

    /* renamed from: T3 */
    private void m104426T3(boolean z) {
    }

    /* renamed from: U3 */
    private void m104428U3(Long l, Long l2) {
        m104430V3(l, l2, false);
    }

    /* renamed from: V3 */
    private void m104430V3(Long l, Long l2, boolean z) {
        if (!this.f85220e0) {
            mo86438k1(this.f85226k0.mo48784a().mo95062A(new C30624h7()).mo95063B(C40992a.m118827a()).mo95070I(new C30638i7(this, l2, l), new C30652j7(this)));
        }
    }

    /* renamed from: W3 */
    private void m104432W3() {
        int i;
        boolean z;
        AccountOperation accountOperation = this.f85203N;
        int i2 = 8;
        if (accountOperation != null && accountOperation.getPfmId() == null) {
            this.f85199J.f68439e.setVisibility(8);
        }
        AccountOperation accountOperation2 = this.f85203N;
        if (accountOperation2 != null && accountOperation2.getDeviceType() == DeviceType.QR_CODE) {
            if (this.f85203N.isReversalAvailable()) {
                m104451g3((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, Boolean.TRUE);
            }
            m104451g3((Boolean) null, Boolean.FALSE, Boolean.TRUE, (Boolean) null, (Boolean) null);
            this.f85199J.f68436L.setVisibility(8);
            this.f85199J.f68441g.setVisibility(8);
        }
        boolean z2 = true;
        this.f85212W = !m104455i3();
        m104449f3();
        m104451g3(Boolean.valueOf(this.f85213X), Boolean.valueOf(this.f85215Z), (Boolean) null, Boolean.valueOf(this.f85217b0), (Boolean) null);
        LayerView layerView = this.f85199J.f68436L;
        if (this.f85214Y) {
            i = 0;
        } else {
            i = 8;
        }
        layerView.setVisibility(i);
        LayerView layerView2 = this.f85199J.f68441g;
        if (this.f85216a0) {
            i2 = 0;
        }
        layerView2.setVisibility(i2);
        AccountOperation accountOperation3 = this.f85203N;
        if (accountOperation3 == null || !"IN_TRANSFER".equals(accountOperation3.getPrintFormType())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            boolean isBackTransferAllowedBool = this.f85203N.isBackTransferAllowedBool();
        }
        m104451g3((Boolean) null, Boolean.valueOf(this.f85215Z), Boolean.valueOf(z), (Boolean) null, (Boolean) null);
        if (!this.f85213X && !this.f85214Y && !this.f85215Z && !this.f85216a0 && !z) {
            z2 = false;
        }
        m104426T3(z2);
        if (!this.f85220e0) {
            this.f85199J.f68440f.setOnClickListener(new C30568d7(this));
        }
        this.f85199J.f68451q.setOnClickListener(new C30782t7(this));
        this.f85199J.f68447m.setOnClickListener(new C30795u7(this));
        this.f85199J.f68435K.setOnClickListener(new C30808v7(this));
        this.f85199J.f68450p.setOnClickListener(new C30821w7(this));
        this.f85199J.f68446l.setOnClickListener(new C30834x7(this));
        this.f85199J.f68443i.setOnClickListener(new C30847y7(this));
        this.f85199J.f68444j.setOnClickListener(new C30582e7(this));
        this.f85199J.f68442h.setOnClickListener(new C30596f7(this));
        this.f85199J.f68449o.setOnClickListener(new C30610g7(this));
        this.f85199J.f68445k.setOnClickListener(new C30704n7(this));
        this.f85199J.f68452r.setOnClickListener(new C30756r7(this));
        this.f85199J.f68448n.setOnClickListener(new C30769s7(this));
    }

    /* renamed from: X3 */
    private void m104434X3() {
        AccountOperation accountOperation;
        if (this.f85207R != null && (accountOperation = this.f85203N) != null) {
            ImageView imageView = this.f85199J.f68432H;
            String e = C32289b0.m95093e(accountOperation.getImageUrl(true));
            int i = C10320i.f28688dc;
            C32289b0.m95107s(imageView, e, Integer.valueOf(i), Integer.valueOf(i), true, C32359z0.m95598z(this.f85203N.getImageUrl(true), this.f85203N.getGroupImageUrl()));
            this.f85199J.f68431G.setText(C32319m.m95314u(this.f85207R.getOperationDate()));
            if (this.f85207R.getDocType().equals("PAYMENT_CONVERSION")) {
                this.f85199J.f68433I.setText(C10328q.operation_details_header_transfer_conversion);
            } else if (this.f85207R.getAmount().compareTo(new BigDecimal(0)) < 0) {
                C32359z0.m95589q0(this.f85199J.f68433I, this.f85207R.getBenefName());
            } else {
                C32359z0.m95589q0(this.f85199J.f68433I, this.f85207R.getSenderName());
            }
            InTransferDetail inTransferDetail = this.f85207R;
            m104428U3(inTransferDetail.pfmParentCatId, inTransferDetail.pfmCatId);
            this.f85209T.mo47406l();
            this.f85210U.mo47406l();
            this.f85211V.mo47406l();
            this.f85199J.f68453s.setVisibility(0);
            this.f85199J.f68458x.setVisibility(0);
            this.f85199J.f68455u.setVisibility(0);
            TextView textView = this.f85199J.f68425A;
            textView.setText(C32303f.m95204o(this.f85207R.getAmount().doubleValue()) + C32303f.m95198i(this.f85207R.getCcy(), true));
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_doc_no), String.valueOf(this.f85207R.getDocKey()));
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_date), C32319m.m95314u(this.f85207R.getPostDate()));
            C19170b bVar = this.f85211V;
            String string = getString(C10328q.operation_details_title_amount);
            bVar.mo47402h(string, this.f85207R.getAmount() + " " + this.f85207R.getCcy());
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_transfer_description), this.f85207R.getNomination());
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_enrollment_date), C32319m.m95314u(this.f85207R.getOperationDate()));
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_post_date), C32319m.m95314u(this.f85207R.getPostDate()));
            this.f85210U.mo47402h(getString(C10328q.operation_details_title_sender), this.f85207R.getSenderName());
            C19170b bVar2 = this.f85210U;
            int i2 = C10328q.operation_details_title_account;
            bVar2.mo47402h(getString(i2), this.f85207R.getSenderAcctNo());
            C19170b bVar3 = this.f85210U;
            int i3 = C10328q.operation_details_title_bank;
            bVar3.mo47402h(getString(i3), this.f85207R.getSenderBankName());
            C19170b bVar4 = this.f85210U;
            int i4 = C10328q.operation_details_title_bank_code;
            bVar4.mo47402h(getString(i4), this.f85207R.getSenderBic());
            this.f85209T.mo47402h(getString(C10328q.operation_details_title_receive), this.f85207R.getBenefName());
            this.f85209T.mo47402h(getString(i2), this.f85207R.getBenefAcctNo());
            this.f85209T.mo47402h(getString(i3), this.f85207R.getBenefBankName());
            this.f85209T.mo47402h(getString(i4), this.f85207R.getBenefBic());
            List<PMIDocGPIAction> list = this.f85207R.pmiDocGPIActions;
            if (list != null && list.size() > 0) {
                m104446d4(this.f85207R.pmiDocGPIActions);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x020d */
    /* renamed from: Y3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m104436Y3() {
        /*
            r13 = this;
            java.lang.String r0 = "commission"
            java.lang.String r1 = "amount"
            java.lang.String r2 = "UTILITY_PAYMENT"
            java.lang.String r3 = "GEL"
            java.lang.String r4 = "-"
            ge.bog.mobilebank.model.payment.LastOperation r5 = r13.f85204O
            if (r5 == 0) goto L_0x022f
            p90.c1 r6 = r13.f85199J
            android.widget.ImageView r7 = r6.f68432H
            java.lang.String r5 = r5.getLogo()
            java.lang.String r8 = g91.C32289b0.m95091c(r5)
            int r5 = p366bk.C10320i.f28688dc
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r11 = 1
            r12 = 0
            g91.C32289b0.m95107s(r7, r8, r9, r10, r11, r12)
            ge.bog.mobilebank.model.payment.LastOperation r5 = r13.f85204O
            java.lang.Long r6 = r5.pfmParentCatId
            java.lang.Long r5 = r5.pfmCatId
            r13.m104428U3(r6, r5)
            p90.c1 r5 = r13.f85199J
            android.widget.TextView r5 = r5.f68431G
            ge.bog.mobilebank.model.payment.LastOperation r6 = r13.f85204O
            java.lang.Long r6 = r6.getPostDate()
            long r6 = r6.longValue()
            java.lang.String r6 = g91.C32319m.m95314u(r6)
            r5.setText(r6)
            a50.b r5 = r13.f85209T
            r5.mo47406l()
            a50.b r5 = r13.f85210U
            r5.mo47406l()
            a50.b r5 = r13.f85211V
            r5.mo47406l()
            p90.c1 r5 = r13.f85199J
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = r5.f68458x
            r6 = 0
            r5.setVisibility(r6)
            p90.c1 r5 = r13.f85199J
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = r5.f68455u
            r5.setVisibility(r6)
            p90.c1 r5 = r13.f85199J
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = r5.f68453s
            r5.setVisibility(r6)
            int r5 = p366bk.C10328q.operation_details_header_payment
            java.lang.String r5 = r13.getString(r5)
            java.util.List r6 = r90.C27954d.m86303i()
            java.util.Iterator r6 = r6.iterator()
        L_0x007a:
            boolean r7 = r6.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x00a7
            java.lang.Object r7 = r6.next()
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r7 = (p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration) r7
            ge.bog.mobilebank.model.payment.LastOperation r9 = r13.f85204O
            java.lang.String r9 = r9.getServiceId()
            if (r9 == 0) goto L_0x007a
            ge.bog.mobilebank.model.payment.LastOperation r9 = r13.f85204O
            java.lang.String r9 = r9.getServiceId()
            java.lang.String r10 = r7.getPaymentServiceId()
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x007a
            java.lang.String r5 = r7.getServiceName()
            java.lang.String r5 = r90.C27950a.m86286c(r5, r8)
        L_0x00a7:
            p90.c1 r6 = r13.f85199J
            android.widget.TextView r6 = r6.f68433I
            g91.C32359z0.m95589q0(r6, r5)
            a50.b r6 = r13.f85209T
            int r7 = p366bk.C10328q.operation_details_title_provider_name
            java.lang.String r7 = r13.getString(r7)
            r6.mo47402h(r7, r5)
            a50.b r5 = r13.f85209T
            int r6 = p366bk.C10328q.operation_details_title_customer
            java.lang.String r6 = r13.getString(r6)
            ge.bog.mobilebank.model.payment.LastOperation r7 = r13.f85204O
            java.lang.String r9 = "essCustomerIdentifier"
            java.lang.String r7 = r7.getValueByKey(r9)
            r5.mo47402h(r6, r7)
            ge.bog.mobilebank.model.payment.LastOperation r5 = r13.f85204O
            java.lang.String r6 = "cardName"
            java.lang.String r5 = r5.getValueByKey(r6)
            if (r5 == 0) goto L_0x00f4
            ge.bog.mobilebank.model.payment.LastOperation r5 = r13.f85204O
            java.lang.String r5 = r5.getValueByKey(r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00f4
            a50.b r5 = r13.f85210U
            int r7 = p366bk.C10328q.operation_details_title_card_name
            java.lang.String r7 = r13.getString(r7)
            ge.bog.mobilebank.model.payment.LastOperation r9 = r13.f85204O
            java.lang.String r6 = r9.getValueByKey(r6)
            r5.mo47402h(r7, r6)
            goto L_0x011d
        L_0x00f4:
            ge.bog.mobilebank.model.payment.LastOperation r5 = r13.f85204O
            java.lang.String r6 = "last4"
            java.lang.String r5 = r5.getValueByKey(r6)
            if (r5 == 0) goto L_0x0114
            a50.b r5 = r13.f85210U
            int r7 = p366bk.C10328q.operation_details_title_last_four
            java.lang.String r7 = r13.getString(r7)
            ge.bog.mobilebank.model.payment.LastOperation r9 = r13.f85204O
            java.lang.String r6 = r9.getValueByKey(r6)
            java.lang.String r6 = g91.C32307h.m95232i(r6)
            r5.mo47402h(r7, r6)
            goto L_0x011d
        L_0x0114:
            p90.c1 r5 = r13.f85199J
            ge.bog.designsystem.components.layersandshadows.LayerView r5 = r5.f68455u
            r6 = 8
            r5.setVisibility(r6)
        L_0x011d:
            p90.c1 r5 = r13.f85199J     // Catch:{ Exception -> 0x022f }
            android.widget.TextView r5 = r5.f68425A     // Catch:{ Exception -> 0x022f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r6.<init>()     // Catch:{ Exception -> 0x022f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r7.<init>()     // Catch:{ Exception -> 0x022f }
            r7.append(r4)     // Catch:{ Exception -> 0x022f }
            ge.bog.mobilebank.model.payment.LastOperation r9 = r13.f85204O     // Catch:{ Exception -> 0x022f }
            java.lang.String r9 = r9.getValueByKey(r1)     // Catch:{ Exception -> 0x022f }
            r7.append(r9)     // Catch:{ Exception -> 0x022f }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x022f }
            java.lang.String r7 = g91.C32359z0.m95543N(r7)     // Catch:{ Exception -> 0x022f }
            r6.append(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.String r7 = g91.C32303f.m95198i(r3, r8)     // Catch:{ Exception -> 0x022f }
            r6.append(r7)     // Catch:{ Exception -> 0x022f }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x022f }
            r5.setText(r6)     // Catch:{ Exception -> 0x022f }
            ge.bog.mobilebank.model.account.AccountOperation r5 = r13.f85203N     // Catch:{ Exception -> 0x022f }
            java.lang.String r5 = r5.getPrintFormType()     // Catch:{ Exception -> 0x022f }
            boolean r5 = r2.equals(r5)     // Catch:{ Exception -> 0x022f }
            if (r5 == 0) goto L_0x016d
            a50.b r5 = r13.f85211V     // Catch:{ Exception -> 0x022f }
            int r6 = p366bk.C10328q.operation_details_title_transfer_description     // Catch:{ Exception -> 0x022f }
            java.lang.String r6 = r13.getString(r6)     // Catch:{ Exception -> 0x022f }
            ge.bog.mobilebank.model.account.AccountOperation r7 = r13.f85203N     // Catch:{ Exception -> 0x022f }
            java.lang.String r7 = r7.getNomination()     // Catch:{ Exception -> 0x022f }
            r5.mo47402h(r6, r7)     // Catch:{ Exception -> 0x022f }
        L_0x016d:
            a50.b r5 = r13.f85211V     // Catch:{ Exception -> 0x022f }
            int r6 = p366bk.C10328q.operation_details_title_amount     // Catch:{ Exception -> 0x022f }
            java.lang.String r6 = r13.getString(r6)     // Catch:{ Exception -> 0x022f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r7.<init>()     // Catch:{ Exception -> 0x022f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r9.<init>()     // Catch:{ Exception -> 0x022f }
            r9.append(r4)     // Catch:{ Exception -> 0x022f }
            ge.bog.mobilebank.model.payment.LastOperation r10 = r13.f85204O     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r10.getValueByKey(r1)     // Catch:{ Exception -> 0x022f }
            r9.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = g91.C32359z0.m95543N(r1)     // Catch:{ Exception -> 0x022f }
            r7.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = g91.C32303f.m95198i(r3, r8)     // Catch:{ Exception -> 0x022f }
            r7.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x022f }
            r5.mo47402h(r6, r1)     // Catch:{ Exception -> 0x022f }
            ge.bog.mobilebank.model.account.AccountOperation r1 = r13.f85203N     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r1.getPrintFormType()     // Catch:{ Exception -> 0x022f }
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x022f }
            if (r1 == 0) goto L_0x01da
            a50.b r1 = r13.f85211V     // Catch:{ Exception -> 0x022f }
            int r5 = p366bk.C10328q.operation_details_title_date     // Catch:{ Exception -> 0x022f }
            java.lang.String r5 = r13.getString(r5)     // Catch:{ Exception -> 0x022f }
            ge.bog.mobilebank.model.account.AccountOperation r6 = r13.f85203N     // Catch:{ Exception -> 0x022f }
            long r6 = r6.getOperationDate()     // Catch:{ Exception -> 0x022f }
            java.lang.String r6 = g91.C32319m.m95314u(r6)     // Catch:{ Exception -> 0x022f }
            r1.mo47402h(r5, r6)     // Catch:{ Exception -> 0x022f }
            a50.b r1 = r13.f85211V     // Catch:{ Exception -> 0x022f }
            int r5 = p366bk.C10328q.operation_details_title_post_date     // Catch:{ Exception -> 0x022f }
            java.lang.String r5 = r13.getString(r5)     // Catch:{ Exception -> 0x022f }
            ge.bog.mobilebank.model.account.AccountOperation r6 = r13.f85203N     // Catch:{ Exception -> 0x022f }
            long r6 = r6.getPostDate()     // Catch:{ Exception -> 0x022f }
            java.lang.String r6 = g91.C32319m.m95314u(r6)     // Catch:{ Exception -> 0x022f }
            r1.mo47402h(r5, r6)     // Catch:{ Exception -> 0x022f }
        L_0x01da:
            ge.bog.mobilebank.model.payment.LastOperation r1 = r13.f85204O     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r1.getValueByKey(r0)     // Catch:{ Exception -> 0x022f }
            if (r1 == 0) goto L_0x022f
            ge.bog.mobilebank.model.account.AccountOperation r1 = r13.f85203N     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r1.getPrintFormType()     // Catch:{ Exception -> 0x022f }
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x022f
            ge.bog.mobilebank.model.payment.LastOperation r1 = r13.f85204O     // Catch:{ Exception -> 0x022f }
            java.lang.String r0 = r1.getValueByKey(r0)     // Catch:{ Exception -> 0x022f }
            double r1 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x020d }
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x020d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020d }
            r1.<init>()     // Catch:{ Exception -> 0x020d }
            r1.append(r4)     // Catch:{ Exception -> 0x020d }
            r1.append(r0)     // Catch:{ Exception -> 0x020d }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x020d }
        L_0x020d:
            a50.b r1 = r13.f85211V     // Catch:{ Exception -> 0x022f }
            int r2 = p366bk.C10328q.operation_details_title_commission     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r4.<init>()     // Catch:{ Exception -> 0x022f }
            java.lang.String r0 = g91.C32359z0.m95543N(r0)     // Catch:{ Exception -> 0x022f }
            r4.append(r0)     // Catch:{ Exception -> 0x022f }
            java.lang.String r0 = g91.C32303f.m95198i(r3, r8)     // Catch:{ Exception -> 0x022f }
            r4.append(r0)     // Catch:{ Exception -> 0x022f }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x022f }
            r1.mo47402h(r2, r0)     // Catch:{ Exception -> 0x022f }
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity.m104436Y3():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: Z3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m104438Z3() {
        /*
            r24 = this;
            r0 = r24
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            if (r1 == 0) goto L_0x03d8
            java.lang.String r1 = r1.getDocType()
            r1.hashCode()
            int r2 = r1.hashCode()
            java.lang.String r5 = "PAYMENT_CONVERSION"
            java.lang.String r7 = "PAYMENT_WITHIN_GEORGIA"
            java.lang.String r9 = "PAYMENT_OWN_ACCOUNTS"
            java.lang.String r10 = "PAYMENT_WITHIN_BUDGET"
            java.lang.String r11 = "PAYMENT_WITHIN_BANK"
            r12 = -1
            java.lang.String r13 = "PAYMENT_FOREIGN"
            r14 = 0
            r15 = 1
            switch(r2) {
                case -93971273: goto L_0x005d;
                case -93909248: goto L_0x0054;
                case 499781208: goto L_0x004b;
                case 1078753379: goto L_0x0042;
                case 1174158607: goto L_0x0039;
                case 1527111732: goto L_0x002e;
                case 1867328347: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r1 = r12
            goto L_0x0065
        L_0x0025:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x002c
            goto L_0x0023
        L_0x002c:
            r1 = 6
            goto L_0x0065
        L_0x002e:
            java.lang.String r2 = "PAYMENT_REAL_ESTATE"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0037
            goto L_0x0023
        L_0x0037:
            r1 = 5
            goto L_0x0065
        L_0x0039:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0040
            goto L_0x0023
        L_0x0040:
            r1 = 4
            goto L_0x0065
        L_0x0042:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0049
            goto L_0x0023
        L_0x0049:
            r1 = 3
            goto L_0x0065
        L_0x004b:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0052
            goto L_0x0023
        L_0x0052:
            r1 = 2
            goto L_0x0065
        L_0x0054:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x005b
            goto L_0x0023
        L_0x005b:
            r1 = r15
            goto L_0x0065
        L_0x005d:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0064
            goto L_0x0023
        L_0x0064:
            r1 = r14
        L_0x0065:
            switch(r1) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00bb;
                case 2: goto L_0x0092;
                case 3: goto L_0x00e2;
                case 4: goto L_0x006a;
                case 5: goto L_0x00e2;
                case 6: goto L_0x00e2;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x010a
        L_0x006a:
            p90.c1 r1 = r0.f85199J
            android.widget.ImageView r1 = r1.f68432H
            int r2 = p366bk.C10320i.ic_transfer_conversion
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
            int r2 = p366bk.C10320i.f28688dc
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r20 = 1
            r21 = 1
            r16 = r1
            g91.C32289b0.m95101m(r16, r17, r18, r19, r20, r21)
            p90.c1 r1 = r0.f85199J
            android.widget.TextView r1 = r1.f68433I
            int r2 = p366bk.C10328q.operation_details_header_transfer_conversion
            r1.setText(r2)
            goto L_0x010a
        L_0x0092:
            p90.c1 r1 = r0.f85199J
            android.widget.ImageView r1 = r1.f68432H
            int r2 = p366bk.C10320i.ic_transfer_between_accs
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
            int r2 = p366bk.C10320i.f28688dc
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r20 = 1
            r21 = 1
            r16 = r1
            g91.C32289b0.m95101m(r16, r17, r18, r19, r20, r21)
            p90.c1 r1 = r0.f85199J
            android.widget.TextView r1 = r1.f68433I
            ge.bog.mobilebank.model.TransferHistoryItem r2 = r0.f85205P
            java.lang.String r2 = r2.benefName
            g91.C32359z0.m95589q0(r1, r2)
            goto L_0x010a
        L_0x00bb:
            p90.c1 r1 = r0.f85199J
            android.widget.ImageView r1 = r1.f68432H
            int r2 = p366bk.C10320i.ic_transfer_rs
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
            int r2 = p366bk.C10320i.f28688dc
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r20 = 1
            r21 = 1
            r16 = r1
            g91.C32289b0.m95101m(r16, r17, r18, r19, r20, r21)
            p90.c1 r1 = r0.f85199J
            android.widget.TextView r1 = r1.f68433I
            int r2 = p366bk.C10328q.operation_details_header_transfer_budget
            r1.setText(r2)
            goto L_0x010a
        L_0x00e2:
            p90.c1 r1 = r0.f85199J
            android.widget.ImageView r1 = r1.f68432H
            int r2 = p366bk.C10320i.ic_transfer_domestic
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
            int r2 = p366bk.C10320i.f28688dc
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r20 = 1
            r21 = 1
            r16 = r1
            g91.C32289b0.m95101m(r16, r17, r18, r19, r20, r21)
            p90.c1 r1 = r0.f85199J
            android.widget.TextView r1 = r1.f68433I
            ge.bog.mobilebank.model.TransferHistoryItem r2 = r0.f85205P
            java.lang.String r2 = r2.benefName
            g91.C32359z0.m95589q0(r1, r2)
        L_0x010a:
            p90.c1 r1 = r0.f85199J
            android.widget.TextView r1 = r1.f68431G
            ge.bog.mobilebank.model.TransferHistoryItem r2 = r0.f85205P
            long r16 = r2.getOperationDate()
            java.lang.String r2 = g91.C32319m.m95314u(r16)
            r1.setText(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.Long r2 = r1.pfmParentCatId
            java.lang.Long r1 = r1.pfmCatId
            r0.m104428U3(r2, r1)
            ge.bog.mobilebank.model.account.AccountOperation r1 = r0.f85203N
            if (r1 == 0) goto L_0x0156
            p90.c1 r2 = r0.f85199J
            android.widget.ImageView r2 = r2.f68432H
            java.lang.String r1 = r1.getImageUrl(r15)
            java.lang.String r17 = g91.C32289b0.m95093e(r1)
            int r1 = p366bk.C10320i.f28688dc
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            r20 = 1
            ge.bog.mobilebank.model.account.AccountOperation r1 = r0.f85203N
            java.lang.String r1 = r1.getImageUrl(r15)
            ge.bog.mobilebank.model.account.AccountOperation r3 = r0.f85203N
            java.lang.String r3 = r3.getGroupImageUrl()
            boolean r21 = g91.C32359z0.m95598z(r1, r3)
            r16 = r2
            g91.C32289b0.m95107s(r16, r17, r18, r19, r20, r21)
            goto L_0x0177
        L_0x0156:
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.String r1 = r1.benefProfilePicture
            if (r1 == 0) goto L_0x0177
            p90.c1 r2 = r0.f85199J
            android.widget.ImageView r2 = r2.f68432H
            java.lang.String r17 = g91.C32289b0.m95093e(r1)
            int r1 = p366bk.C10320i.f28688dc
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            r20 = 1
            r21 = 0
            r16 = r2
            g91.C32289b0.m95107s(r16, r17, r18, r19, r20, r21)
        L_0x0177:
            a50.b r1 = r0.f85209T
            r1.mo47406l()
            a50.b r1 = r0.f85210U
            r1.mo47406l()
            a50.b r1 = r0.f85211V
            r1.mo47406l()
            p90.c1 r1 = r0.f85199J
            ge.bog.designsystem.components.layersandshadows.LayerView r1 = r1.f68458x
            r1.setVisibility(r14)
            p90.c1 r1 = r0.f85199J
            ge.bog.designsystem.components.layersandshadows.LayerView r1 = r1.f68455u
            r1.setVisibility(r14)
            p90.c1 r1 = r0.f85199J
            ge.bog.designsystem.components.layersandshadows.LayerView r1 = r1.f68453s
            r1.setVisibility(r14)
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.String r1 = r1.getSrcAcctName()
            if (r1 == 0) goto L_0x01b5
            a50.b r1 = r0.f85210U
            int r2 = p366bk.C10328q.operation_details_title_account_name
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getSrcAcctName()
            r1.mo47402h(r2, r3)
            goto L_0x01ce
        L_0x01b5:
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.String r1 = r1.srcAcctTypeKey
            if (r1 == 0) goto L_0x01ce
            a50.b r1 = r0.f85210U
            int r2 = p366bk.C10328q.operation_details_title_account_type
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.srcAcctTypeKey
            java.lang.String r3 = r90.C27950a.m86284a(r3)
            r1.mo47402h(r2, r3)
        L_0x01ce:
            p90.c1 r1 = r0.f85199J
            android.widget.TextView r1 = r1.f68425A
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.math.BigDecimal r3 = r3.getAmount()
            double r16 = r3.doubleValue()
            r18 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r16 = r16 * r18
            java.lang.String r3 = g91.C32303f.m95204o(r16)
            r2.append(r3)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getCcy()
            java.lang.String r3 = g91.C32303f.m95198i(r3, r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            a50.b r1 = r0.f85210U
            int r2 = p366bk.C10328q.operation_details_title_account_number
            java.lang.String r3 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r4 = r0.f85205P
            java.lang.String r4 = r4.getSrcAcctNo()
            a50.e r6 = a50.C19176e.ACCOUNT_NUMBER
            r1.mo47403i(r3, r4, r6)
            a50.b r1 = r0.f85211V
            int r3 = p366bk.C10328q.operation_details_title_amount
            java.lang.String r3 = r0.getString(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            ge.bog.mobilebank.model.TransferHistoryItem r8 = r0.f85205P
            java.math.BigDecimal r8 = r8.getAmount()
            double r22 = r8.doubleValue()
            double r22 = r22 * r18
            java.lang.String r8 = g91.C32303f.m95204o(r22)
            r4.append(r8)
            ge.bog.mobilebank.model.TransferHistoryItem r8 = r0.f85205P
            java.lang.String r8 = r8.getCcy()
            java.lang.String r8 = g91.C32303f.m95198i(r8, r15)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r1.mo47402h(r3, r4)
            a50.b r1 = r0.f85211V
            int r3 = p366bk.C10328q.operation_details_title_transfer_description
            java.lang.String r3 = r0.getString(r3)
            ge.bog.mobilebank.model.TransferHistoryItem r4 = r0.f85205P
            java.lang.String r4 = r4.getNomination()
            r1.mo47402h(r3, r4)
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.String r1 = r1.getDocType()
            r1.hashCode()
            int r3 = r1.hashCode()
            switch(r3) {
                case -93971273: goto L_0x0297;
                case -93909248: goto L_0x028e;
                case 499781208: goto L_0x0285;
                case 1078753379: goto L_0x027c;
                case 1174158607: goto L_0x0273;
                case 1867328347: goto L_0x026a;
                default: goto L_0x0268;
            }
        L_0x0268:
            r3 = r12
            goto L_0x029f
        L_0x026a:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x0271
            goto L_0x0268
        L_0x0271:
            r3 = 5
            goto L_0x029f
        L_0x0273:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x027a
            goto L_0x0268
        L_0x027a:
            r3 = 4
            goto L_0x029f
        L_0x027c:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0283
            goto L_0x0268
        L_0x0283:
            r3 = 3
            goto L_0x029f
        L_0x0285:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x028c
            goto L_0x0268
        L_0x028c:
            r3 = 2
            goto L_0x029f
        L_0x028e:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x0295
            goto L_0x0268
        L_0x0295:
            r3 = r15
            goto L_0x029f
        L_0x0297:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x029e
            goto L_0x0268
        L_0x029e:
            r3 = r14
        L_0x029f:
            switch(r3) {
                case 0: goto L_0x0309;
                case 1: goto L_0x0309;
                case 2: goto L_0x02a4;
                case 3: goto L_0x0309;
                case 4: goto L_0x02a4;
                case 5: goto L_0x0309;
                default: goto L_0x02a2;
            }
        L_0x02a2:
            goto L_0x0397
        L_0x02a4:
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.String r1 = r1.getDstAcctName()
            if (r1 == 0) goto L_0x02be
            a50.b r1 = r0.f85209T
            int r3 = p366bk.C10328q.operation_details_title_account_name
            java.lang.String r3 = r0.getString(r3)
            ge.bog.mobilebank.model.TransferHistoryItem r4 = r0.f85205P
            java.lang.String r4 = r4.getDstAcctName()
            r1.mo47402h(r3, r4)
            goto L_0x02d7
        L_0x02be:
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.String r1 = r1.dstAcctTypeKey
            if (r1 == 0) goto L_0x02d7
            a50.b r1 = r0.f85209T
            int r3 = p366bk.C10328q.operation_details_title_account_type
            java.lang.String r3 = r0.getString(r3)
            ge.bog.mobilebank.model.TransferHistoryItem r4 = r0.f85205P
            java.lang.String r4 = r4.dstAcctTypeKey
            java.lang.String r4 = r90.C27950a.m86284a(r4)
            r1.mo47402h(r3, r4)
        L_0x02d7:
            a50.b r1 = r0.f85209T
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getDisplayAcctNo()
            r1.mo47403i(r2, r3, r6)
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.math.BigDecimal r1 = r1.getRate()
            if (r1 == 0) goto L_0x0397
            a50.b r1 = r0.f85211V
            int r2 = p366bk.C10328q.operation_details_title_rate
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.math.BigDecimal r3 = r3.getRate()
            double r3 = r3.doubleValue()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.mo47402h(r2, r3)
            goto L_0x0397
        L_0x0309:
            a50.b r1 = r0.f85209T
            int r2 = p366bk.C10328q.operation_details_title_receiver_bank
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getBenefBic()
            java.lang.String r3 = g91.C32299e.m95165c(r3)
            r1.mo47402h(r2, r3)
            a50.b r1 = r0.f85209T
            int r2 = p366bk.C10328q.operation_details_title_receiver_bank_code
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getBenefBic()
            r1.mo47402h(r2, r3)
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.String r1 = r1.getDocType()
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x034d
            a50.b r1 = r0.f85209T
            int r2 = p366bk.C10328q.operation_details_title_receiver_name
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getBenefClientShort()
            r1.mo47402h(r2, r3)
            goto L_0x035e
        L_0x034d:
            a50.b r1 = r0.f85209T
            int r2 = p366bk.C10328q.operation_details_title_receiver_name
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getDisplayName()
            r1.mo47402h(r2, r3)
        L_0x035e:
            a50.b r1 = r0.f85209T
            int r2 = p366bk.C10328q.operation_details_title_receiver_acc_num
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getDisplayAcctNo()
            if (r3 == 0) goto L_0x0375
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getDisplayAcctNo()
            goto L_0x037b
        L_0x0375:
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getTreasureCode()
        L_0x037b:
            r1.mo47402h(r2, r3)
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.lang.String r1 = r1.getIntermediarName()
            if (r1 == 0) goto L_0x0397
            a50.b r1 = r0.f85209T
            int r2 = p366bk.C10328q.operation_details_title_middle_bank
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.String r3 = r3.getIntermediarName()
            r1.mo47402h(r2, r3)
        L_0x0397:
            a50.b r1 = r0.f85211V
            int r2 = p366bk.C10328q.operation_details_title_initiation_date
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            long r3 = r3.getOperationDate()
            java.lang.String r3 = g91.C32319m.m95314u(r3)
            r1.mo47402h(r2, r3)
            a50.b r1 = r0.f85211V
            int r2 = p366bk.C10328q.operation_details_title_post_date
            java.lang.String r2 = r0.getString(r2)
            ge.bog.mobilebank.model.TransferHistoryItem r3 = r0.f85205P
            java.lang.Long r3 = r3.getValueDate()
            long r3 = r3.longValue()
            java.lang.String r3 = g91.C32319m.m95314u(r3)
            r1.mo47402h(r2, r3)
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.util.List<ge.bog.mobilebank.model.PMIDocGPIAction> r1 = r1.pmiDocGPIActions
            if (r1 == 0) goto L_0x03d8
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03d8
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r0.f85205P
            java.util.List<ge.bog.mobilebank.model.PMIDocGPIAction> r1 = r1.pmiDocGPIActions
            r0.m104446d4(r1)
        L_0x03d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity.m104438Z3():void");
    }

    /* renamed from: a4 */
    private void m104440a4() {
        AccountOperation accountOperation = this.f85203N;
        if (accountOperation != null) {
            ImageView imageView = this.f85199J.f68432H;
            String c = C32289b0.m95091c(accountOperation.getImageUrl());
            int i = C10320i.f28688dc;
            C32289b0.m95107s(imageView, c, Integer.valueOf(i), Integer.valueOf(i), true, C32359z0.m95598z(this.f85203N.getImageUrl(), this.f85203N.getGroupImageUrl()));
            m104428U3(this.f85203N.getPfmParentCatId(), this.f85203N.getPfmCatId());
            String str = "";
            this.f85199J.f68431G.setText(str);
            if (this.f85203N.getOperationDate() > 0) {
                this.f85199J.f68431G.setText(C32319m.m95314u(this.f85203N.getOperationDate()));
            }
            this.f85209T.mo47406l();
            this.f85210U.mo47406l();
            this.f85211V.mo47406l();
            this.f85199J.f68453s.setVisibility(0);
            this.f85199J.f68458x.setVisibility(8);
            this.f85199J.f68455u.setVisibility(8);
            Boolean valueOf = Boolean.valueOf(this.f85198I.getLanguage().equals("ka"));
            if (this.f85203N.getMerchantNameByLocale(valueOf) != null) {
                this.f85211V.mo47402h(getString(C10328q.operation_details_title_merchant), this.f85203N.getMerchantNameByLocale(valueOf));
                C32359z0.m95589q0(this.f85199J.f68433I, this.f85203N.getMerchantNameByLocale(valueOf));
            } else {
                String operationTitle = this.f85203N.getOperationTitle();
                if (operationTitle.length() > 25) {
                    operationTitle = C27950a.m86286c(this.f85203N.getEntryGroupDKey(), false);
                }
                C32359z0.m95589q0(this.f85199J.f68433I, operationTitle);
            }
            this.f85199J.f68425A.setText(C32303f.m95204o(this.f85203N.getAmount().doubleValue() * -1.0d) + C32303f.m95198i(this.f85203N.getCcy(), true));
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_description), this.f85203N.getNomination());
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_amount), C32303f.m95204o(this.f85203N.getAmount().doubleValue() * -1.0d) + C32303f.m95198i(this.f85203N.getCcy(), true));
            if (this.f85203N.getOperationDate() > 0) {
                this.f85211V.mo47402h(getString(C10328q.operation_details_title_initiation_date), C32319m.m95314u(this.f85203N.getOperationDate()));
            }
            if (this.f85203N.getPostDate() > 0) {
                this.f85211V.mo47402h(getString(C10328q.operation_details_title_post_date), C32319m.m95314u(this.f85203N.getPostDate()));
            }
            if (this.f85203N.getBonusPointType() == null) {
                return;
            }
            if (this.f85203N.getBonusPoint() != null || this.f85203N.getCashbackAmount() != null) {
                if (this.f85203N.getBonusPointType().equals(BonusType.EXPRES.getStringValue()) && this.f85203N.getBonusPoint() != null) {
                    str = "+ " + this.f85203N.getBonusPoint() + " Express " + getString(C10328q.common_text_point);
                } else if (this.f85203N.getBonusPointType().equals(BonusType.AMEX.getStringValue()) && this.f85203N.getBonusPoint() != null) {
                    str = "+ " + this.f85203N.getBonusPoint().intValue() + " MR " + getString(C10328q.common_text_point);
                } else if (this.f85203N.getBonusPointType().equals(BonusType.CASHBACK.getStringValue()) && this.f85203N.getCashbackAmount() != null) {
                    str = "+ " + C32303f.m95204o(this.f85203N.getCashbackAmount().doubleValue()) + C32303f.m95198i("GEL", true);
                } else if (this.f85203N.getBonusPointType().equals(BonusType.PLUS.getStringValue()) && this.f85203N.getBonusPoint() != null) {
                    str = "+ " + C32359z0.m95531B(this.f85203N.getBonusPoint()) + " " + getString(C10328q.payments_plus_points);
                }
                this.f85211V.mo47402h(getString(C10328q.operation_details_title_loyalty_point), str);
            }
        }
    }

    /* renamed from: b4 */
    private void m104442b4() {
        AccountOperation accountOperation;
        if (this.f85206Q != null && (accountOperation = this.f85203N) != null) {
            int i = C10320i.f28688dc;
            C32289b0.m95107s(this.f85199J.f68432H, C32289b0.m95091c(accountOperation.getImageUrl()), Integer.valueOf(i), Integer.valueOf(i), true, C32359z0.m95598z(this.f85203N.getImageUrl(), this.f85203N.getGroupImageUrl()));
            PaymentDetail paymentDetail = this.f85206Q;
            m104428U3(paymentDetail.pfmParentCatId, paymentDetail.pfmCatId);
            C32359z0.m95589q0(this.f85199J.f68433I, this.f85206Q.getMerchantName());
            this.f85199J.f68431G.setText(C32319m.m95314u(this.f85206Q.getAuthDate()));
            this.f85209T.mo47406l();
            this.f85210U.mo47406l();
            this.f85211V.mo47406l();
            this.f85199J.f68453s.setVisibility(0);
            this.f85199J.f68458x.setVisibility(8);
            this.f85199J.f68455u.setVisibility(8);
            TextView textView = this.f85199J.f68425A;
            textView.setText("-" + this.f85206Q.getAmount() + C32303f.m95198i(this.f85206Q.getCcy(), true));
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_transfer_description), this.f85206Q.getNomination());
            C19170b bVar = this.f85211V;
            String string = getString(C10328q.operation_details_title_amount);
            bVar.mo47402h(string, "-" + this.f85206Q.getAmount() + " " + this.f85206Q.getCcy());
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_merchant), this.f85206Q.getMerchantName());
            if (this.f85206Q.getBonusInfo() != null) {
                this.f85211V.mo47402h(getString(C10328q.operation_details_title_loyalty_point), this.f85206Q.getBonusInfo());
            }
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_card_number), C32307h.m95232i(this.f85206Q.getCardLast4()));
            this.f85211V.mo47403i(getString(C10328q.operation_details_title_account_number), this.f85206Q.getAcctNo(), C19176e.ACCOUNT_NUMBER);
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_auth_date), C32319m.m95314u(this.f85206Q.getAuthDate()));
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_post_date), C32319m.m95314u(this.f85206Q.getPostDate()));
            this.f85211V.mo47402h(getString(C10328q.operation_details_title_doc_no), String.valueOf(this.f85206Q.getDocKey()));
            if (DeviceType.QR_CODE == this.f85206Q.getDeviceType() && !TextUtils.isEmpty(this.f85206Q.getApprovalCode())) {
                this.f85211V.mo47402h(getString(C10328q.approval_code), this.f85206Q.getApprovalCode());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public void m104444c4() {
        int i = this.f85200K;
        if (i == 10) {
            m104436Y3();
            m104452g4(false);
        } else if (i == 20) {
            m104438Z3();
            m104452g4(false);
        } else if (i == 30) {
            AccountOperation accountOperation = this.f85203N;
            if (accountOperation == null) {
                return;
            }
            if (this.f85204O != null) {
                m104442b4();
                m104452g4(false);
            } else if (this.f85207R != null) {
                m104434X3();
                m104452g4(false);
            } else if ("IN_TRANSFER".equals(accountOperation.getPrintFormType()) && !this.f85218c0) {
                this.f85196G.requestInTransferDetails(false, this.f85203N.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType(), this.f85203N.getPfmId(), Long.valueOf(this.f85203N.getEntryId()), Long.valueOf(this.f85203N.getOperationDate()));
            } else if ("OUT_TRANSFER".equals(this.f85203N.getPrintFormType()) && !this.f85218c0) {
                this.f85196G.requestOutTransferDetails(false, this.f85203N.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType(), this.f85203N.getPfmId(), Long.valueOf(this.f85203N.getEntryId()), Long.valueOf(this.f85203N.getOperationDate()));
            } else if ("PAYMENT".equals(this.f85203N.getPrintFormType()) && !this.f85218c0) {
                this.f85196G.requestPaymentDetails(false, this.f85203N.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType(), this.f85203N.getPfmId(), Long.valueOf(this.f85203N.getEntryId()), Long.valueOf(this.f85203N.getOperationDate()));
            } else if (!"UTILITY_PAYMENT".equals(this.f85203N.getPrintFormType()) || this.f85218c0) {
                m104440a4();
                m104452g4(false);
            } else {
                this.f85196G.requestUtilityPaymentDetails(false, this.f85203N.getDocKey(), this.f85203N.getEssId(), this.f85203N.getPrintFormType(), this.f85203N.getPfmId(), Long.valueOf(this.f85203N.getEntryId()), Long.valueOf(this.f85203N.getOperationDate()));
            }
        } else if (i == 40) {
            this.f85196G.requestOperationDetails(false, this.f85202M, this.f85201L);
        }
    }

    /* renamed from: d4 */
    private void m104446d4(List list) {
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public void m104448e4(String str) {
        C32359z0.m95583n0(this, str, getString(C10328q.f28961m2));
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public void m104449f3() {
        if (this.f85212W) {
            this.f85212W = false;
            this.f85199J.f68440f.setChecked(false);
            return;
        }
        this.f85212W = true;
        this.f85199J.f68440f.setChecked(true);
    }

    /* renamed from: f4 */
    private void m104450f4(boolean z) {
    }

    /* renamed from: g3 */
    private void m104451g3(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        if (bool != null) {
            Button button = this.f85199J.f68447m;
            if (bool.booleanValue()) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            button.setVisibility(i13);
            Button button2 = this.f85199J.f68451q;
            if (bool.booleanValue()) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            button2.setVisibility(i14);
        }
        if (bool2 != null) {
            Button button3 = this.f85199J.f68446l;
            if (bool2.booleanValue()) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            button3.setVisibility(i9);
            Button button4 = this.f85199J.f68450p;
            if (bool2.booleanValue()) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            button4.setVisibility(i12);
        }
        if (bool3 != null) {
            Button button5 = this.f85199J.f68444j;
            if (bool3.booleanValue()) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            button5.setVisibility(i7);
            Button button6 = this.f85199J.f68443i;
            if (bool3.booleanValue()) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            button6.setVisibility(i8);
        }
        if (bool4 != null) {
            Button button7 = this.f85199J.f68448n;
            if (bool4.booleanValue()) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            button7.setVisibility(i5);
            Button button8 = this.f85199J.f68452r;
            if (bool4.booleanValue()) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            button8.setVisibility(i6);
        }
        if (bool5 != null) {
            Button button9 = this.f85199J.f68445k;
            if (bool5.booleanValue()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            button9.setVisibility(i3);
            Button button10 = this.f85199J.f68449o;
            if (bool5.booleanValue()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            button10.setVisibility(i4);
        }
        boolean z = true;
        if (this.f85199J.f68451q.getVisibility() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f85199J.f68450p.getVisibility() == 0) {
            i++;
        }
        if (this.f85199J.f68443i.getVisibility() == 0) {
            i++;
        }
        if (this.f85199J.f68452r.getVisibility() == 0) {
            i++;
        }
        if (this.f85199J.f68449o.getVisibility() == 0) {
            i++;
        }
        if (i != 1) {
            z = false;
        }
        ConstraintLayout constraintLayout = this.f85199J.f68434J;
        if (!z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        constraintLayout.setVisibility(i2);
        LinearLayout linearLayout = this.f85199J.f68426B;
        if (z) {
            i15 = 0;
        }
        linearLayout.setVisibility(i15);
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public void m104452g4(boolean z) {
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public void m104453h3(String str) {
        C32359z0.m95596x(str);
        C12910e.m48783a(this, getString(C10328q.f28953c2));
    }

    /* renamed from: h4 */
    private void m104454h4() {
        if (this.f85208S == null) {
            return;
        }
        if (this.f85196G.isAuthorized()) {
            this.f85208S.mo79825y();
        } else {
            C32303f.m95188H(this);
        }
    }

    /* renamed from: i3 */
    private boolean m104455i3() {
        AccountOperation accountOperation = this.f85203N;
        if (accountOperation != null) {
            return accountOperation.isPfmComputable();
        }
        LastOperation lastOperation = this.f85204O;
        if (lastOperation != null) {
            return lastOperation.pfmComputable;
        }
        TransferHistoryItem transferHistoryItem = this.f85205P;
        if (transferHistoryItem != null) {
            return transferHistoryItem.pfmComputable;
        }
        PaymentDetail paymentDetail = this.f85206Q;
        if (paymentDetail != null) {
            return paymentDetail.pfmComputable;
        }
        return false;
    }

    /* renamed from: j3 */
    private Integer m104456j3(TransactionCategoryModel transactionCategoryModel, TransactionCategoryModel transactionCategoryModel2) {
        if (transactionCategoryModel2 != null) {
            return Integer.valueOf(C27680a.f70771a.mo67216a(transactionCategoryModel2.mo55075a()));
        }
        try {
            return Integer.valueOf(C27680a.f70771a.mo67216a(transactionCategoryModel.mo55075a()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k3 */
    private C35286d m104457k3() {
        Long l;
        Long l2;
        Long l3;
        AccountOperation accountOperation = this.f85203N;
        if (accountOperation == null || accountOperation.getPfmId() == null) {
            TransferHistoryItem transferHistoryItem = this.f85205P;
            if (transferHistoryItem == null || (l3 = transferHistoryItem.pfmId) == null) {
                LastOperation lastOperation = this.f85204O;
                if (lastOperation == null || (l2 = lastOperation.pfmId) == null) {
                    PaymentDetail paymentDetail = this.f85206Q;
                    if (paymentDetail == null || (l = paymentDetail.pfmId) == null) {
                        return null;
                    }
                    return new C35286d(l, paymentDetail.pfmCatId, paymentDetail.pfmParentCatId, paymentDetail.getOperationDate());
                }
                return new C35286d(l2, lastOperation.pfmCatId, lastOperation.pfmParentCatId, lastOperation.operationDate);
            }
            return new C35286d(l3, transferHistoryItem.pfmCatId, transferHistoryItem.pfmParentCatId, Long.valueOf(transferHistoryItem.getOperationDate()));
        }
        return new C35286d(this.f85203N.getPfmId(), this.f85203N.getPfmCatId(), this.f85203N.getPfmParentCatId(), Long.valueOf(this.f85203N.getOperationDate()));
    }

    /* renamed from: l3 */
    private boolean m104458l3() {
        AccountOperation accountOperation = this.f85203N;
        if (accountOperation != null) {
            return "P".equals(accountOperation.getStatus());
        }
        LastOperation lastOperation = this.f85204O;
        if (lastOperation != null) {
            return !ProductType.PRODUCT_STATUS_PENDING.equals(lastOperation.pfmProviderStatusId);
        }
        TransferHistoryItem transferHistoryItem = this.f85205P;
        if (transferHistoryItem != null) {
            return !ProductType.PRODUCT_STATUS_PENDING.equals(transferHistoryItem.pfmProviderStatusId);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public void m104461o3(C19909b bVar) {
        if (bVar.equals(C19909b.DELETE_CATEGORY)) {
            m104420Q3(true);
        }
    }

    /* renamed from: n3 */
    private void m104460n3() {
        this.f85220e0 = true;
        this.f85199J.f68429E.setVisibility(8);
        this.f85199J.f68439e.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m104462p3(C35286d dVar, View view) {
        if (!m104458l3()) {
            C32297d.m95157e(this, C27950a.m86284a(getString(C10328q.operation_details_can_not_edit_category)));
        } else if (dVar != null) {
            TransactionCategoriesSelectorActivity.m72017g3(this, dVar.f85234a.longValue(), dVar.f85235b.longValue(), dVar.f85237d, this.f85219d0, 123);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m104464r3(C38162a0 a0Var) {
        a0Var.dismiss();
        C26360b.f66777a.mo65554f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m104465s3(C38162a0 a0Var, Throwable th) {
        a0Var.dismiss();
        C26360b.f66777a.mo65555g(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m104466t3(Long l, Long l2, List list) {
        TransactionCategoryModel transactionCategoryModel;
        TransactionCategoryModel transactionCategoryModel2;
        if (l == null && l2 == null) {
            this.f85199J.f68429E.setVisibility(8);
            return;
        }
        if (l == null) {
            transactionCategoryModel = null;
        } else {
            transactionCategoryModel = C19492r.m65066a(list, l.longValue());
        }
        if (transactionCategoryModel != null) {
            transactionCategoryModel2 = C19492r.m65067b(list, transactionCategoryModel.mo55083h().longValue());
        } else if (l2 == null) {
            transactionCategoryModel2 = C19492r.m65067b(list, l.longValue());
            if (transactionCategoryModel2 == null) {
                this.f85199J.f68429E.setVisibility(8);
                return;
            }
        } else {
            transactionCategoryModel2 = C19492r.m65067b(list, l2.longValue());
        }
        if (transactionCategoryModel2 == null) {
            this.f85199J.f68429E.setVisibility(8);
            return;
        }
        this.f85219d0 = transactionCategoryModel2.mo55077d();
        this.f85199J.f68427C.setTitle(transactionCategoryModel2.mo55082g());
        this.f85199J.f68429E.setVisibility(0);
        if (transactionCategoryModel != null) {
            this.f85199J.f68427C.setText(transactionCategoryModel.mo55082g());
        }
        Integer j3 = m104456j3(transactionCategoryModel2, transactionCategoryModel);
        if (j3 != null) {
            this.f85199J.f68430F.setImageResource(j3.intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m104467u3(Throwable th) {
        this.f85199J.f68429E.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m104468v3(View view) {
        m104406J3();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m104469w3(View view) {
        m104410L3();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m104470x3(View view) {
        m104410L3();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m104471y3(View view) {
        m104416O3();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m104472z3(View view) {
        m104416O3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        boolean z;
        boolean z2;
        PaymentProviderConfiguration g;
        C27265c1 d = C27265c1.m84359d(getLayoutInflater());
        this.f85199J = d;
        super.mo70996D2(bundle, d);
        Client client = this.f85196G;
        if (client == null || !client.isAuthorized()) {
            m104460n3();
        }
        if (!this.f85220e0) {
            mo86438k1(this.f85227l0.mo48494a().mo95027o0(C40992a.m118827a()).mo94981F0(new C30665k7(this)));
        }
        m104452g4(true);
        this.f85200K = getIntent().getIntExtra("PAYMENT_OPERATION_TYPE", 40);
        this.f85202M = getIntent().getLongExtra("PAYMENT_DETAILS_ITEM_ENTRY_ID", -1);
        this.f85201L = getIntent().getLongExtra("PAYMENT_DETAILS_ITEM_DOC_KEY", -1);
        int i = this.f85200K;
        if (i == 10) {
            LastOperation lastOperation = (LastOperation) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_DETAILS_OBJECT"));
            this.f85204O = lastOperation;
            this.f85213X = true;
            this.f85215Z = true;
            PaymentProviderConfiguration h = C27954d.m86302h(lastOperation.getServiceId());
            if (h == null || !h.isDDAllowed()) {
                z = false;
            } else {
                z = true;
            }
            this.f85216a0 = z;
            if (h == null || !h.isTemplateAccessAllowed) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f85214Y = z2;
        } else if (i == 20) {
            this.f85205P = (TransferHistoryItem) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_DETAILS_OBJECT"));
            this.f85213X = true;
            this.f85214Y = false;
            this.f85215Z = true;
            this.f85216a0 = true;
        } else if (i == 30) {
            AccountOperation accountOperation = (AccountOperation) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_DETAILS_OBJECT"));
            this.f85203N = accountOperation;
            if (!"OUT_TRANSFER".equals(accountOperation.getPrintFormType())) {
                this.f85203N.setIsDDSTOAllowed(false);
                this.f85203N.setTemplateAllowed(false);
                if (!(this.f85203N.getEssServiceId() == null || (g = C27954d.m86301g(this.f85203N.getEssServiceId())) == null)) {
                    this.f85203N.setIsDDSTOAllowed(g.isDDAllowed);
                    this.f85203N.setTemplateAllowed(g.isTemplateAccessAllowed);
                }
            }
            this.f85213X = this.f85203N.isPrintableBool();
            this.f85214Y = this.f85203N.isTemplateAllowed();
            this.f85215Z = this.f85203N.isRepeatAllowed();
            this.f85216a0 = this.f85203N.isDDSTOAlllowed();
            this.f85217b0 = this.f85203N.isCanSplit();
        }
        m104450f4(false);
        m104444c4();
        m104432W3();
        C35286d k3 = m104457k3();
        if (k3 == null) {
            m104460n3();
        }
        this.f85199J.f68428D.setOnClickListener(new C35521v1(this, k3));
        C19169a aVar = new C19169a(this);
        this.f85199J.f68459y.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f85199J.f68459y.setAdapter(this.f85209T);
        this.f85199J.f68459y.mo5351j(aVar);
        this.f85209T.mo47408n(new C30678l7(this));
        this.f85209T.mo47407m(new C30691m7(this));
        this.f85199J.f68456v.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f85199J.f68456v.setAdapter(this.f85210U);
        this.f85199J.f68456v.mo5351j(aVar);
        this.f85210U.mo47408n(new C30678l7(this));
        this.f85210U.mo47407m(new C30691m7(this));
        this.f85199J.f68454t.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f85199J.f68454t.setAdapter(this.f85211V);
        this.f85199J.f68454t.mo5351j(aVar);
        this.f85211V.mo47408n(new C30678l7(this));
        this.f85211V.mo47407m(new C30691m7(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 123) {
            Long valueOf = Long.valueOf(intent.getLongExtra("CAT_ID", -1));
            AccountOperation accountOperation = this.f85203N;
            if (accountOperation != null) {
                accountOperation.setPfmCatId(valueOf);
                this.f85203N.setPfmParentCatId((Long) null);
            }
            LastOperation lastOperation = this.f85204O;
            if (lastOperation != null) {
                lastOperation.pfmCatId = valueOf;
                lastOperation.pfmParentCatId = null;
            }
            TransferHistoryItem transferHistoryItem = this.f85205P;
            if (transferHistoryItem != null) {
                transferHistoryItem.pfmCatId = valueOf;
                transferHistoryItem.pfmParentCatId = null;
            }
            PaymentDetail paymentDetail = this.f85206Q;
            if (paymentDetail != null) {
                paymentDetail.pfmCatId = valueOf;
                paymentDetail.pfmParentCatId = null;
            }
            m104430V3((Long) null, valueOf, true);
        } else if (i == 2018) {
            finish();
        }
    }

    @C41452l
    public void onInTransferDetails(InTransferDetailsEvent inTransferDetailsEvent) {
        if (this.f85225j0 != inTransferDetailsEvent && this.f85200K == 30) {
            this.f85225j0 = inTransferDetailsEvent;
            int state = inTransferDetailsEvent.getState();
            boolean z = true;
            if (state == 10) {
                m104452g4(true);
                m104450f4(false);
            } else if (state == 20) {
                InTransferDetail inTransferDetail = inTransferDetailsEvent.getInTransferDetail();
                this.f85207R = inTransferDetail;
                if (inTransferDetail != null) {
                    m104434X3();
                    m104432W3();
                }
                if (this.f85207R != null) {
                    z = false;
                }
                m104450f4(z);
                m104452g4(false);
            } else if (state != 30 && state != 40) {
            } else {
                if (this.f85203N != null) {
                    this.f85218c0 = true;
                    m104450f4(false);
                    m104444c4();
                    m104432W3();
                    return;
                }
                m104452g4(false);
                m104450f4(true);
            }
        }
    }

    @C41452l
    public void onOperationDetails(OperationDetailsEvent operationDetailsEvent) {
        PaymentProviderConfiguration g;
        if (this.f85221f0 != operationDetailsEvent && this.f85200K == 40) {
            this.f85221f0 = operationDetailsEvent;
            int state = operationDetailsEvent.getState();
            if (state == 10) {
                m104452g4(true);
                m104450f4(false);
            } else if (state == 20) {
                AccountOperation accountOperation = operationDetailsEvent.getAccountOperation();
                this.f85203N = accountOperation;
                this.f85200K = 30;
                this.f85213X = accountOperation.isPrintableBool();
                this.f85215Z = this.f85203N.isRepeatAllowed();
                if (!("OUT_TRANSFER".equals(this.f85203N.getPrintFormType()) || this.f85203N.getEssServiceId() == null || (g = C27954d.m86301g(this.f85203N.getEssServiceId())) == null)) {
                    this.f85203N.setIsDDSTOAllowed(g.isDDAllowed);
                    this.f85203N.setTemplateAllowed(g.isTemplateAccessAllowed);
                }
                this.f85216a0 = this.f85203N.isDDSTOAlllowed();
                this.f85214Y = this.f85203N.isTemplateAllowed();
                this.f85217b0 = this.f85203N.isCanSplit();
                m104444c4();
                m104432W3();
                m104450f4(false);
            } else if (state != 30 && state != 40) {
            } else {
                if (this.f85203N != null) {
                    this.f85218c0 = true;
                    m104450f4(false);
                    m104444c4();
                    m104432W3();
                    return;
                }
                m104452g4(false);
                m104450f4(true);
            }
        }
    }

    @C41452l
    public void onOutTransferDetails(OutTransferDetailsEvent outTransferDetailsEvent) {
        if (this.f85222g0 != outTransferDetailsEvent && this.f85200K == 30) {
            this.f85222g0 = outTransferDetailsEvent;
            int state = outTransferDetailsEvent.getState();
            boolean z = true;
            if (state == 10) {
                m104452g4(true);
                m104450f4(false);
            } else if (state == 20) {
                TransferHistoryItem transferHistoryItem = outTransferDetailsEvent.getTransferHistoryItem();
                this.f85205P = transferHistoryItem;
                if (transferHistoryItem != null) {
                    this.f85213X = true;
                    this.f85214Y = false;
                    this.f85215Z = true;
                    this.f85216a0 = true;
                    m104438Z3();
                    m104432W3();
                }
                if (this.f85205P != null) {
                    z = false;
                }
                m104450f4(z);
                m104452g4(false);
            } else if (state != 30 && state != 40) {
            } else {
                if (this.f85203N != null) {
                    this.f85218c0 = true;
                    m104450f4(false);
                    m104444c4();
                    m104432W3();
                    return;
                }
                m104452g4(false);
                m104450f4(true);
            }
        }
    }

    @C41452l
    public void onPaymentDetails(PaymentDetailsEvent paymentDetailsEvent) {
        if (this.f85224i0 != paymentDetailsEvent && this.f85200K == 30) {
            this.f85224i0 = paymentDetailsEvent;
            int state = paymentDetailsEvent.getState();
            boolean z = true;
            if (state == 10) {
                m104452g4(true);
                m104450f4(false);
            } else if (state == 20) {
                PaymentDetail paymentDetail = paymentDetailsEvent.getPaymentDetail();
                this.f85206Q = paymentDetail;
                if (paymentDetail != null) {
                    m104442b4();
                    m104432W3();
                }
                if (this.f85206Q != null) {
                    z = false;
                }
                m104450f4(z);
                m104452g4(false);
            } else if (state != 30 && state != 40) {
            } else {
                if (this.f85203N != null) {
                    this.f85218c0 = true;
                    m104450f4(false);
                    m104444c4();
                    m104432W3();
                    return;
                }
                m104452g4(false);
                m104450f4(true);
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016 && iArr.length > 0 && iArr[0] == 0 && this.f85230o0) {
            this.f85199J.f68451q.performClick();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85197H, this);
        m104420Q3(true);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f85197H, this);
    }

    @C41452l
    public void onUtilityPaymentDetails(UtilityPaymentDetailsEvent utilityPaymentDetailsEvent) {
        PaymentProviderConfiguration g;
        if (this.f85223h0 != utilityPaymentDetailsEvent && this.f85200K == 30) {
            this.f85223h0 = utilityPaymentDetailsEvent;
            int state = utilityPaymentDetailsEvent.getState();
            boolean z = true;
            if (state == 10) {
                m104452g4(true);
                m104450f4(false);
            } else if (state == 20) {
                LastOperation lastOperation = utilityPaymentDetailsEvent.getLastOperation();
                this.f85204O = lastOperation;
                if (lastOperation != null) {
                    this.f85213X = true;
                    if (!(lastOperation.getServiceId() == null || (g = C27954d.m86301g(this.f85204O.getServiceId())) == null)) {
                        this.f85216a0 = g.isDDAllowed;
                        this.f85214Y = g.isTemplateAccessAllowed;
                    }
                    this.f85215Z = true;
                    m104436Y3();
                    m104432W3();
                }
                if (this.f85204O != null) {
                    z = false;
                }
                m104450f4(z);
                m104452g4(false);
            } else if (state != 30 && state != 40) {
            } else {
                if (this.f85203N != null) {
                    this.f85218c0 = true;
                    m104450f4(false);
                    m104444c4();
                    m104432W3();
                    return;
                }
                m104452g4(false);
                m104450f4(true);
            }
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_statement);
    }
}
