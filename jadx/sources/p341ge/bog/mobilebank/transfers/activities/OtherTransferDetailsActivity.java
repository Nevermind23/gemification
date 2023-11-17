package p341ge.bog.mobilebank.transfers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import ba1.C10146d0;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import e41.C31658b;
import f91.C31971a;
import f91.C31972b;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32297d;
import g91.C32299e;
import g91.C32303f;
import g91.C32306g0;
import g91.C32311i0;
import g91.C32340v0;
import gd1.C40992a;
import hc1.C41185v;
import hd0.C24978b;
import hd1.C41205b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jg1.C41452l;
import n41.C37353c;
import org.greenrobot.eventbus.ThreadMode;
import org.parceler.C42035e;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferCommissionApiModel;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.model.AccountCountryType;
import p341ge.bog.mobilebank.model.BogCountry;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DispatchType;
import p341ge.bog.mobilebank.model.PMIHistoryItem;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.TransferNomination;
import p341ge.bog.mobilebank.model.TransferResult;
import p341ge.bog.mobilebank.model.TransferTemplateObject;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.AccountOwnerInfoWrapper;
import p341ge.bog.mobilebank.model.account.OtherAccountDetails;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p341ge.bog.mobilebank.model.account.TreasureCodeInfo;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBank;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;
import p341ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity;
import p341ge.bog.mobilebank.p975ui.activities.TransferResultActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.otpparameter.TransferForeighBankParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.TransferWithinBankParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.TransferWithinGeorgiaParams;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.foreign.FileAttachment;
import p341ge.bog.mobilebank.transfers.model.TransferContact;
import p341ge.bog.mobilebank.transfers.model.TransferContactAccount;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p341ge.bog.mobilebank.transfers.model.TransferTermsItemUiModel;
import p341ge.bog.mobilebank.transfers.model.TransferTermsUiModel;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import p420fh.C12902d;
import p745er.C20288a;
import p748eu.C20292b;
import p758fu.C20557a;
import p802jv.C25508l;
import p843nw.C26619b;
import p881ru.C28103l;
import p881ru.C28106n;
import p891su.C28261a;
import p891su.C28262b;
import p90.C27286e2;
import pc0.C27494a;
import r90.C27950a;
import w61.C39610j;
import x61.C39803f;
import x61.C39804g;
import x61.C39805h;
import x61.C39806i;
import x61.C39807j;
import x61.C39808k;
import x61.C39809l;
import x61.C39810m;
import x61.C39811n;
import x61.C39812o;

/* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity */
public class OtherTransferDetailsActivity extends C34885c implements C41185v.C41186a {

    /* renamed from: G0 */
    protected boolean f84149G0 = false;

    /* renamed from: H0 */
    protected String f84150H0;

    /* renamed from: I0 */
    protected boolean f84151I0;

    /* renamed from: J0 */
    private boolean f84152J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public boolean f84153K0 = false;

    /* renamed from: L0 */
    private int f84154L0 = 0;

    /* renamed from: M0 */
    private ArrayList f84155M0;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public ArrayList f84156N0;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public ArrayList f84157O0;

    /* renamed from: P0 */
    private List f84158P0;

    /* renamed from: Q0 */
    private ForeignBank f84159Q0;

    /* renamed from: R0 */
    private ForeignBank f84160R0;

    /* renamed from: S0 */
    private BogCountry f84161S0;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public ReportingCode f84162T0;

    /* renamed from: U0 */
    private PMIHistoryItem f84163U0;

    /* renamed from: V0 */
    private C39610j f84164V0;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public TransferContact f84165W0;

    /* renamed from: X0 */
    private long f84166X0;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public Long f84167Y0;

    /* renamed from: Z0 */
    private boolean f84168Z0;

    /* renamed from: a1 */
    protected PreferencesApiManager f84169a1;

    /* renamed from: b1 */
    C28103l f84170b1;

    /* renamed from: c1 */
    private boolean f84171c1 = false;

    /* renamed from: d1 */
    C25508l f84172d1;

    /* renamed from: e1 */
    C28106n f84173e1;

    /* renamed from: f1 */
    C26619b f84174f1;

    /* renamed from: g1 */
    C31658b f84175g1;

    /* renamed from: h1 */
    C20292b f84176h1;

    /* renamed from: i1 */
    protected BankApi f84177i1;

    /* renamed from: j1 */
    protected Client f84178j1;

    /* renamed from: k1 */
    protected C27494a f84179k1;

    /* renamed from: l1 */
    private boolean f84180l1 = false;

    /* renamed from: m1 */
    protected Boolean f84181m1;

    /* renamed from: n1 */
    protected Boolean f84182n1;

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$a */
    class C34853a implements C39610j.C39612b {

        /* renamed from: a */
        final /* synthetic */ String f84183a;

        /* renamed from: b */
        final /* synthetic */ String f84184b;

        /* renamed from: c */
        final /* synthetic */ String f84185c;

        /* renamed from: d */
        final /* synthetic */ boolean f84186d;

        /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$a$a */
        class C34854a extends RestCallback {
            C34854a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static /* synthetic */ void m102520c(List list) {
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static /* synthetic */ void m102521d(Throwable th) {
            }

            public void onEnqueue(C41205b bVar) {
                OtherTransferDetailsActivity.this.mo86438k1(bVar);
            }

            public void onFailure(Throwable th) {
                OtherTransferDetailsActivity.this.mo85321a3();
                C32297d.m95153a(OtherTransferDetailsActivity.this);
                if (th instanceof SocketTimeoutException) {
                    Intent intent = new Intent(OtherTransferDetailsActivity.this, PaymentResultActivity.class);
                    intent.putExtra("PAYMENT_TIMED_OUT", true);
                    intent.putExtra("IS_TRANSFER", true);
                    OtherTransferDetailsActivity.this.startActivity(intent);
                    OtherTransferDetailsActivity.this.setResult(-1);
                    OtherTransferDetailsActivity.this.finish();
                }
            }

            public void onResponse(BankApiResponse bankApiResponse) {
                OtherTransferDetailsActivity.this.mo85321a3();
                if (bankApiResponse.isSuccess() || "1".equals(bankApiResponse.getCode())) {
                    C34853a aVar = C34853a.this;
                    if (aVar.f84186d && OtherTransferDetailsActivity.this.f84165W0 != null) {
                        OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
                        if (otherTransferDetailsActivity.f84268A0) {
                            otherTransferDetailsActivity.mo86438k1(otherTransferDetailsActivity.f84173e1.mo67640a(true).mo95070I(new C34918n(), new C34919o()));
                        }
                    }
                    OtherTransferDetailsActivity otherTransferDetailsActivity2 = OtherTransferDetailsActivity.this;
                    Long valueOf = Long.valueOf(bankApiResponse.getResult() != null ? ((TransferResult) bankApiResponse.getResult()).getReferenceDocKey() : -1);
                    String accountTitle = OtherTransferDetailsActivity.this.f84316x0.getAccountTitle();
                    String ccy = OtherTransferDetailsActivity.this.f84316x0.getCcy();
                    String M4 = OtherTransferDetailsActivity.this.mo85256M4();
                    String valueText = OtherTransferDetailsActivity.this.f84284R.getValueText();
                    String valueText2 = OtherTransferDetailsActivity.this.f84304l0.getValueText();
                    String valueText3 = OtherTransferDetailsActivity.this.f84291Y.getValueText();
                    String valueText4 = OtherTransferDetailsActivity.this.f84293a0.getValueText();
                    String Y2 = OtherTransferDetailsActivity.this.mo85319Y2();
                    TransferResultActivity.m104909c3(otherTransferDetailsActivity2, 4, valueOf, accountTitle, ccy, M4, (String) null, valueText, valueText2, valueText3, valueText4, Y2, C32303f.m95204o(OtherTransferDetailsActivity.this.f84312t0) + C32303f.m95197h(OtherTransferDetailsActivity.this.f84316x0.getCcy()), OtherTransferDetailsActivity.this.mo85251F4((TemplateBasketItem) null, (String) null), (String) null, (String) null, (String) null, OtherTransferDetailsActivity.this.f84303k0.getValueText(), OtherTransferDetailsActivity.this.f84305m0.getValueText(), OtherTransferDetailsActivity.this.f84299g0.getValueText(), OtherTransferDetailsActivity.this.f84300h0.getValueText(), OtherTransferDetailsActivity.this.f84301i0.getValueText(), OtherTransferDetailsActivity.this.f84162T0 != null ? OtherTransferDetailsActivity.this.f84162T0.getReportingCode() : null, OtherTransferDetailsActivity.this.m102410E4((String) null), (Boolean) null);
                    OtherTransferDetailsActivity.this.m102470r5(false);
                    OtherTransferDetailsActivity.this.finish();
                } else if (BankApiResponse.CODE_STATUS_WARNING.equals(bankApiResponse.getCodeStatus())) {
                    C36546y.m108282F().mo27152s("transfers", "transfer", "warning_transfer");
                    Intent intent = new Intent(OtherTransferDetailsActivity.this, PaymentResultActivity.class);
                    intent.putExtra("PAYMENT_TIMED_OUT", true);
                    intent.putExtra("IS_TRANSFER", true);
                    intent.putExtra("PAYMENT_WARNING_KEY", bankApiResponse.getKey());
                    OtherTransferDetailsActivity.this.startActivity(intent);
                    OtherTransferDetailsActivity.this.setResult(-1);
                    OtherTransferDetailsActivity.this.finish();
                } else {
                    C32297d.m95154b(OtherTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                }
            }
        }

        C34853a(String str, String str2, String str3, boolean z) {
            this.f84183a = str;
            this.f84184b = str2;
            this.f84185c = str3;
            this.f84186d = z;
        }

        /* renamed from: a */
        public void mo85270a(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        /* renamed from: b */
        public void mo85271b(String str) {
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84177i1.transferInForeignBank(otherTransferDetailsActivity.f84179k1.mo66809a(otherTransferDetailsActivity.m102432W4(this.f84183a, this.f84184b, this.f84185c)), str, new C34854a());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$b */
    class C34855b implements C39610j.C39612b {

        /* renamed from: a */
        final /* synthetic */ String f84189a;

        /* renamed from: b */
        final /* synthetic */ String f84190b;

        /* renamed from: c */
        final /* synthetic */ String f84191c;

        /* renamed from: d */
        final /* synthetic */ boolean f84192d;

        /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$b$a */
        class C34856a extends RestCallback {
            C34856a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public static /* synthetic */ void m102528e() {
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public static /* synthetic */ void m102529f(Throwable th) {
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static /* synthetic */ void m102530g(List list) {
            }

            /* access modifiers changed from: private */
            /* renamed from: h */
            public static /* synthetic */ void m102531h(Throwable th) {
            }

            public void onEnqueue(C41205b bVar) {
                OtherTransferDetailsActivity.this.mo86438k1(bVar);
            }

            public void onFailure(Throwable th) {
                String str;
                super.onFailure(th);
                TransferForm.TRANSFERTYPE transfertype = OtherTransferDetailsActivity.this.f84317y0;
                if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
                    str = "within_bank_pin";
                } else if (transfertype == TransferForm.TRANSFERTYPE.PHONE) {
                    str = "other_transfer_phone";
                } else {
                    str = "other_transfer_acc";
                }
                C36546y.m108282F().mo27137H("transfers", "transfer_failure", str, (Bundle) null, C10464h.C10465a.FIREBASE);
                OtherTransferDetailsActivity.this.mo85321a3();
                if (th instanceof SocketTimeoutException) {
                    Intent intent = new Intent(OtherTransferDetailsActivity.this, PaymentResultActivity.class);
                    intent.putExtra("PAYMENT_TIMED_OUT", true);
                    intent.putExtra("IS_TRANSFER", true);
                    OtherTransferDetailsActivity.this.startActivity(intent);
                    OtherTransferDetailsActivity.this.setResult(-1);
                    OtherTransferDetailsActivity.this.finish();
                }
            }

            public void onResponse(BankApiResponse bankApiResponse) {
                OtherTransferDetailsActivity otherTransferDetailsActivity;
                C25508l lVar;
                super.onResponse(bankApiResponse);
                OtherTransferDetailsActivity.this.mo85321a3();
                if (bankApiResponse.isSuccess() || "1".equals(bankApiResponse.getCode())) {
                    if (!(OtherTransferDetailsActivity.this.f84167Y0 == null || (lVar = otherTransferDetailsActivity.f84172d1) == null)) {
                        (otherTransferDetailsActivity = OtherTransferDetailsActivity.this).mo86438k1(lVar.mo64058a().mo94888G(new C34920p(), new C34921q()));
                    }
                    C34855b bVar = C34855b.this;
                    if (bVar.f84192d && OtherTransferDetailsActivity.this.f84165W0 != null) {
                        OtherTransferDetailsActivity otherTransferDetailsActivity2 = OtherTransferDetailsActivity.this;
                        if (otherTransferDetailsActivity2.f84268A0) {
                            otherTransferDetailsActivity2.mo86438k1(otherTransferDetailsActivity2.f84173e1.mo67640a(true).mo95070I(new C34922r(), new C34923s()));
                        }
                    }
                    OtherTransferDetailsActivity otherTransferDetailsActivity3 = OtherTransferDetailsActivity.this;
                    String c4 = otherTransferDetailsActivity3.f84317y0 == TransferForm.TRANSFERTYPE.PIN ? otherTransferDetailsActivity3.m102419O4() : otherTransferDetailsActivity3.mo85256M4();
                    OtherTransferDetailsActivity otherTransferDetailsActivity4 = OtherTransferDetailsActivity.this;
                    if (otherTransferDetailsActivity4.f84317y0 == TransferForm.TRANSFERTYPE.PHONE) {
                        c4 = (String) otherTransferDetailsActivity4.f84311s0.get(26);
                    }
                    String str = c4;
                    OtherTransferDetailsActivity otherTransferDetailsActivity5 = OtherTransferDetailsActivity.this;
                    Long valueOf = Long.valueOf(bankApiResponse.getResult() != null ? ((TransferResult) bankApiResponse.getResult()).getReferenceDocKey() : -1);
                    String accountTitle = OtherTransferDetailsActivity.this.f84316x0.getAccountTitle();
                    String ccy = OtherTransferDetailsActivity.this.f84316x0.getCcy();
                    String valueText = OtherTransferDetailsActivity.this.f84284R.getValueText();
                    OtherTransferDetailsActivity otherTransferDetailsActivity6 = OtherTransferDetailsActivity.this;
                    String str2 = otherTransferDetailsActivity6.f84150H0;
                    String H4 = otherTransferDetailsActivity6.mo85252H4();
                    String valueText2 = OtherTransferDetailsActivity.this.f84293a0.getValueText();
                    String Y2 = OtherTransferDetailsActivity.this.mo85319Y2();
                    TransferResultActivity.m104910d3(otherTransferDetailsActivity5, 1, valueOf, accountTitle, ccy, str, (String) null, valueText, str2, H4, valueText2, Y2, C32303f.m95204o(OtherTransferDetailsActivity.this.f84312t0) + C32303f.m95197h(OtherTransferDetailsActivity.this.f84316x0.getCcy()), bankApiResponse.getResult() != null ? OtherTransferDetailsActivity.this.mo85251F4((TemplateBasketItem) null, ((TransferResult) bankApiResponse.getResult()).getBenefAcctNo()) : null, bankApiResponse.getKey(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, bankApiResponse.getResult() != null ? OtherTransferDetailsActivity.this.m102410E4(((TransferResult) bankApiResponse.getResult()).getBenefAcctNo()) : null, OtherTransferDetailsActivity.this.f84298f0.getValueText(), (Boolean) null);
                    OtherTransferDetailsActivity otherTransferDetailsActivity7 = OtherTransferDetailsActivity.this;
                    otherTransferDetailsActivity7.m102470r5(otherTransferDetailsActivity7.mo85263c5());
                    OtherTransferDetailsActivity.this.finish();
                } else if (BankApiResponse.CODE_STATUS_WARNING.equals(bankApiResponse.getCodeStatus())) {
                    TransferForm.TRANSFERTYPE transfertype = OtherTransferDetailsActivity.this.f84317y0;
                    C36546y.m108282F().mo27137H("transfers", "warning_transfer", transfertype == TransferForm.TRANSFERTYPE.PIN ? "within_bank_pin" : transfertype == TransferForm.TRANSFERTYPE.PHONE ? "other_transfer_phone" : "other_transfer_acc", (Bundle) null, C10464h.C10465a.FIREBASE);
                    Intent intent = new Intent(OtherTransferDetailsActivity.this, PaymentResultActivity.class);
                    intent.putExtra("PAYMENT_TIMED_OUT", true);
                    intent.putExtra("IS_TRANSFER", true);
                    intent.putExtra("PAYMENT_WARNING_KEY", bankApiResponse.getKey());
                    OtherTransferDetailsActivity.this.startActivity(intent);
                    OtherTransferDetailsActivity.this.setResult(-1);
                    OtherTransferDetailsActivity.this.finish();
                } else {
                    TransferForm.TRANSFERTYPE transfertype2 = OtherTransferDetailsActivity.this.f84317y0;
                    C36546y.m108282F().mo27137H("transfers", "transfer_failure", transfertype2 == TransferForm.TRANSFERTYPE.PIN ? "within_bank_pin" : transfertype2 == TransferForm.TRANSFERTYPE.PHONE ? "other_transfer_phone" : "other_transfer_acc", (Bundle) null, C10464h.C10465a.FIREBASE);
                    C32297d.m95154b(OtherTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                }
            }
        }

        C34855b(String str, String str2, String str3, boolean z) {
            this.f84189a = str;
            this.f84190b = str2;
            this.f84191c = str3;
            this.f84192d = z;
        }

        /* renamed from: a */
        public void mo85270a(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        /* renamed from: b */
        public void mo85271b(String str) {
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84177i1.transferWithinBank(otherTransferDetailsActivity.f84179k1.mo66809a(otherTransferDetailsActivity.m102434X4(this.f84189a, this.f84190b, this.f84191c)), str, new C34856a());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$c */
    static /* synthetic */ class C34857c {

        /* renamed from: a */
        static final /* synthetic */ int[] f84195a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                su.e[] r0 = p891su.C28269e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f84195a = r0
                su.e r1 = p891su.C28269e.BUDGET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f84195a     // Catch:{ NoSuchFieldError -> 0x001d }
                su.e r1 = p891su.C28269e.JURIDICAL_PERSON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity.C34857c.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$d */
    class C34858d extends RestCallback {
        C34858d() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            C32297d.m95153a(OtherTransferDetailsActivity.this);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = true;
            otherTransferDetailsActivity.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                OtherTransferDetailsActivity.this.f84153K0 = true;
            } else {
                OtherTransferDetailsActivity.this.f84153K0 = false;
                C32297d.m95154b(OtherTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            }
            OtherTransferDetailsActivity.this.mo85257N2();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$e */
    class C34859e extends RestCallback {
        C34859e() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = true;
            otherTransferDetailsActivity.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OtherTransferDetailsActivity.this.m102441b5(bankApiResponse);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$f */
    class C34860f extends RestCallback {
        C34860f() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = true;
            otherTransferDetailsActivity.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OtherTransferDetailsActivity.this.m102441b5(bankApiResponse);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$g */
    class C34861g extends RestCallback {
        C34861g() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = true;
            otherTransferDetailsActivity.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OtherTransferDetailsActivity.this.m102441b5(bankApiResponse);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$h */
    class C34862h extends RestCallback {
        C34862h() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = true;
            otherTransferDetailsActivity.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = !bankApiResponse.isSuccess();
            if (bankApiResponse.isSuccess()) {
                OtherTransferDetailsActivity.this.f84150H0 = ((TreasureCodeInfo) bankApiResponse.getResult()).benefBic;
                String str = ((TreasureCodeInfo) bankApiResponse.getResult()).benefName;
                if (str != null && str.length() > 150) {
                    str = str.substring(0, 150);
                }
                OtherTransferDetailsActivity.this.f84311s0.set(5, str);
                OtherTransferDetailsActivity otherTransferDetailsActivity2 = OtherTransferDetailsActivity.this;
                otherTransferDetailsActivity2.f84309q0 = TransferForm.TRANSFER_FORM_BUDGET;
                otherTransferDetailsActivity2.m102473t5(bankApiResponse.isSuccess());
            } else {
                C32297d.m95154b(OtherTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                OtherTransferDetailsActivity.this.mo85257N2();
            }
            OtherTransferDetailsActivity.this.mo85325m3();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$i */
    class C34863i extends RestCallback {
        C34863i() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = true;
            otherTransferDetailsActivity.f84156N0 = null;
            OtherTransferDetailsActivity.this.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = !bankApiResponse.isSuccess();
            if (bankApiResponse.isSuccess()) {
                OtherTransferDetailsActivity.this.f84156N0 = (ArrayList) bankApiResponse.getResult();
                if (TextUtils.isEmpty((CharSequence) OtherTransferDetailsActivity.this.f84311s0.get(16))) {
                    OtherTransferDetailsActivity.this.f84311s0.set(16, BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
                } else {
                    for (int i = 0; i < OtherTransferDetailsActivity.this.f84156N0.size(); i++) {
                        if (((String) OtherTransferDetailsActivity.this.f84311s0.get(16)).equals(((DispatchType) OtherTransferDetailsActivity.this.f84156N0.get(i)).getDispatchType())) {
                            OtherTransferDetailsActivity.this.f84311s0.set(16, Integer.toString(i));
                        }
                    }
                }
                OtherTransferDetailsActivity.this.m102408D4();
            } else {
                C32297d.m95154b(OtherTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                OtherTransferDetailsActivity.this.f84156N0 = null;
                OtherTransferDetailsActivity.this.mo85257N2();
            }
            OtherTransferDetailsActivity.this.mo85325m3();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$j */
    class C34864j extends RestCallback {
        C34864j() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = true;
            otherTransferDetailsActivity.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = !bankApiResponse.isSuccess();
            if (bankApiResponse.isSuccess()) {
                Double commissionAnount = ((MoneyTransferCommissionApiModel) bankApiResponse.getResult()).getCommissionAnount();
                OtherTransferDetailsActivity.this.f84312t0 = commissionAnount == null ? Utils.DOUBLE_EPSILON : commissionAnount.doubleValue();
                OtherTransferDetailsActivity.this.mo85332r3(((MoneyTransferCommissionApiModel) bankApiResponse.getResult()).getCommissionDescDictionaryKey());
                OtherTransferDetailsActivity.this.mo85241t3();
                OtherTransferDetailsActivity.this.m102407C4();
            } else {
                OtherTransferDetailsActivity.this.mo85257N2();
                C32297d.m95154b(OtherTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            }
            OtherTransferDetailsActivity.this.mo85325m3();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$k */
    class C34865k extends RestCallback {
        C34865k() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = true;
            otherTransferDetailsActivity.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84271D0 = false;
            otherTransferDetailsActivity.f84272E0 = !bankApiResponse.isSuccess();
            if (bankApiResponse.isSuccess()) {
                OtherTransferDetailsActivity.this.f84157O0 = (ArrayList) bankApiResponse.getResult();
            } else {
                C32297d.m95154b(OtherTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            }
            OtherTransferDetailsActivity.this.mo85325m3();
            OtherTransferDetailsActivity.this.mo85257N2();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$l */
    class C34866l implements C39610j.C39612b {

        /* renamed from: a */
        final /* synthetic */ TransferWithinGeorgiaParams f84204a;

        /* renamed from: b */
        final /* synthetic */ boolean f84205b;

        /* renamed from: c */
        final /* synthetic */ String f84206c;

        /* renamed from: ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$l$a */
        class C34867a extends RestCallback {
            C34867a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static /* synthetic */ void m102536c(List list) {
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static /* synthetic */ void m102537d(Throwable th) {
            }

            public void onEnqueue(C41205b bVar) {
                OtherTransferDetailsActivity.this.mo86438k1(bVar);
            }

            public void onFailure(Throwable th) {
                super.onFailure(th);
                C36546y.m108282F().mo27136G("transfers", "transfer_failure", "other_transfer", (Bundle) null);
                OtherTransferDetailsActivity.this.mo85321a3();
                if (th instanceof SocketTimeoutException) {
                    Intent intent = new Intent(OtherTransferDetailsActivity.this, PaymentResultActivity.class);
                    intent.putExtra("PAYMENT_TIMED_OUT", true);
                    intent.putExtra("IS_TRANSFER", true);
                    OtherTransferDetailsActivity.this.startActivity(intent);
                    OtherTransferDetailsActivity.this.setResult(-1);
                    OtherTransferDetailsActivity.this.finish();
                }
            }

            public void onResponse(BankApiResponse bankApiResponse) {
                super.onResponse(bankApiResponse);
                OtherTransferDetailsActivity.this.mo85321a3();
                if (bankApiResponse.isSuccess() || "1".equals(bankApiResponse.getCode())) {
                    C34866l lVar = C34866l.this;
                    if (lVar.f84205b && OtherTransferDetailsActivity.this.f84165W0 != null) {
                        OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
                        if (otherTransferDetailsActivity.f84268A0) {
                            otherTransferDetailsActivity.mo86438k1(otherTransferDetailsActivity.f84173e1.mo67640a(true).mo95070I(new C34924t(), new C34925u()));
                        }
                    }
                    OtherTransferDetailsActivity otherTransferDetailsActivity2 = OtherTransferDetailsActivity.this;
                    Long valueOf = Long.valueOf(bankApiResponse.getResult() != null ? ((TransferResult) bankApiResponse.getResult()).getReferenceDocKey() : -1);
                    String accountTitle = OtherTransferDetailsActivity.this.f84316x0.getAccountTitle();
                    String ccy = OtherTransferDetailsActivity.this.f84316x0.getCcy();
                    String M4 = OtherTransferDetailsActivity.this.mo85256M4();
                    String valueText = OtherTransferDetailsActivity.this.f84284R.getValueText();
                    OtherTransferDetailsActivity otherTransferDetailsActivity3 = OtherTransferDetailsActivity.this;
                    TransferTemplateObject F4 = OtherTransferDetailsActivity.this.mo85251F4((TemplateBasketItem) null, (String) null);
                    C34866l lVar2 = C34866l.this;
                    TransferResultActivity.m104910d3(otherTransferDetailsActivity2, 2, valueOf, accountTitle, ccy, M4, (String) null, valueText, otherTransferDetailsActivity3.f84150H0, otherTransferDetailsActivity3.f84291Y.getValueText(), OtherTransferDetailsActivity.this.f84293a0.getValueText(), OtherTransferDetailsActivity.this.mo85319Y2(), C32303f.m95204o(OtherTransferDetailsActivity.this.f84312t0) + C32303f.m95197h(OtherTransferDetailsActivity.this.f84316x0.getCcy()), F4, (String) null, (String) null, (String) null, (String) null, (String) null, lVar2.f84206c, lVar2.f84204a.getBenefCity(), C34866l.this.f84204a.getBenefAddress(), (String) null, OtherTransferDetailsActivity.this.m102410E4((String) null), OtherTransferDetailsActivity.this.f84298f0.getValueText(), (Boolean) null);
                    OtherTransferDetailsActivity otherTransferDetailsActivity4 = OtherTransferDetailsActivity.this;
                    otherTransferDetailsActivity4.m102470r5(otherTransferDetailsActivity4.mo85263c5());
                    OtherTransferDetailsActivity.this.finish();
                } else if (BankApiResponse.CODE_STATUS_WARNING.equals(bankApiResponse.getCodeStatus())) {
                    C36546y.m108282F().mo27152s("transfers", "other_transfer", "warning_transfer");
                    Intent intent = new Intent(OtherTransferDetailsActivity.this, PaymentResultActivity.class);
                    intent.putExtra("PAYMENT_TIMED_OUT", true);
                    intent.putExtra("IS_TRANSFER", true);
                    intent.putExtra("PAYMENT_WARNING_KEY", bankApiResponse.getKey());
                    OtherTransferDetailsActivity.this.startActivity(intent);
                    OtherTransferDetailsActivity.this.setResult(-1);
                    OtherTransferDetailsActivity.this.finish();
                } else {
                    C36546y.m108282F().mo27136G("transfers", "transfer_failure", "other_transfer", (Bundle) null);
                    C32297d.m95154b(OtherTransferDetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                }
            }
        }

        C34866l(TransferWithinGeorgiaParams transferWithinGeorgiaParams, boolean z, String str) {
            this.f84204a = transferWithinGeorgiaParams;
            this.f84205b = z;
            this.f84206c = str;
        }

        /* renamed from: a */
        public void mo85270a(C41205b bVar) {
            OtherTransferDetailsActivity.this.mo86438k1(bVar);
        }

        /* renamed from: b */
        public void mo85271b(String str) {
            OtherTransferDetailsActivity otherTransferDetailsActivity = OtherTransferDetailsActivity.this;
            otherTransferDetailsActivity.f84177i1.transferWithinGeorgia(otherTransferDetailsActivity.f84179k1.mo66809a(this.f84204a), str, new C34867a());
        }
    }

    public OtherTransferDetailsActivity() {
        Boolean bool = Boolean.FALSE;
        this.f84181m1 = bool;
        this.f84182n1 = bool;
    }

    /* renamed from: A4 */
    private void m102405A4() {
        if (this.f84269B0 && !this.f84270C0) {
            C32297d.m95154b(this, C27950a.m86284a("error.transfers.real.estate.pmi.not.allowed"));
        }
    }

    /* renamed from: B4 */
    private void m102406B4() {
        if (!this.f84182n1.booleanValue() && !mo85263c5()) {
            if (this.f84181m1.booleanValue()) {
                mo86438k1(this.f84175g1.mo72084b("STO"));
            } else {
                mo86438k1(this.f84175g1.mo72084b("TRANSFER"));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public void m102407C4() {
        m102421P4();
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public void m102408D4() {
        m102411G4();
    }

    /* renamed from: D5 */
    private void m102409D5() {
        if (this.f84269B0 && this.f84270C0 && this.f84298f0.getValueText().length() > 0) {
            this.f84272E0 = false;
            this.f84271D0 = true;
            this.f84154L0++;
            this.f84177i1.checkCadastralCode(this.f84298f0.getValueText(), new C34858d());
        } else if (this.f84269B0 && this.f84298f0.getValueText().length() == 0) {
            this.f84153K0 = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public TransferHistoryItem m102410E4(String str) {
        String str2;
        TransferHistoryItem transferHistoryItem = new TransferHistoryItem();
        try {
            transferHistoryItem.setClientKey(Long.parseLong(this.f84178j1.getLoginInfo().mo90304a()));
            transferHistoryItem.setAmount(new BigDecimal(mo85319Y2()));
            transferHistoryItem.setCcy(this.f84316x0.getCcy());
            transferHistoryItem.srcAcctKey = this.f84316x0.getId();
            transferHistoryItem.nomination = this.f84293a0.getValueText();
            transferHistoryItem.benefBic = this.f84150H0;
            transferHistoryItem.benefName = this.f84284R.getValueText();
            transferHistoryItem.payerName = this.f84286T.getValueText();
            transferHistoryItem.payerInn = mo85259S4();
            transferHistoryItem.dispatchType = mo85252H4();
            transferHistoryItem.docType = mo85254K4();
            if (mo85263c5()) {
                transferHistoryItem.treasureCode = mo85320Z2(mo85256M4());
            } else {
                TransferForm.TRANSFERTYPE transfertype = this.f84317y0;
                TransferForm.TRANSFERTYPE transfertype2 = TransferForm.TRANSFERTYPE.ACCOUNT;
                if (transfertype != transfertype2) {
                    str2 = str;
                } else {
                    str2 = mo85256M4();
                }
                transferHistoryItem.benefAcctNo = str2;
                if (this.f84317y0 == transfertype2) {
                    str = mo85256M4();
                }
                transferHistoryItem.dstAcctNo = str;
            }
            transferHistoryItem.srcAcctNo = this.f84316x0.getAcctNo();
            transferHistoryItem.srcAcctName = this.f84315w0.getAccountTitle();
        } catch (Exception unused) {
        }
        return transferHistoryItem;
    }

    /* renamed from: G4 */
    private void m102411G4() {
        String str;
        String str2;
        String str3;
        ForeignBank foreignBank;
        String str4;
        if (this.f84316x0 == null || (((mo85256M4() == null || TextUtils.isEmpty(mo85320Z2(mo85256M4()))) && (mo85255L4() == null || TextUtils.isEmpty(mo85320Z2(mo85255L4())))) || mo85315S2() <= Utils.DOUBLE_EPSILON || !m102475u5())) {
            m102407C4();
        } else {
            this.f84272E0 = false;
            this.f84271D0 = true;
            String str5 = null;
            if (!this.f84152J0 || (foreignBank = this.f84160R0) == null) {
                str = null;
            } else {
                if (foreignBank.getSwift() != null) {
                    str4 = this.f84160R0.getSwift();
                } else {
                    str4 = this.f84160R0.getBankName();
                }
                str = str4;
            }
            BankApi bankApi = this.f84177i1;
            String valueOf = String.valueOf(this.f84316x0.getId());
            String str6 = (String) this.f84311s0.get(15);
            String T2 = mo85316T2();
            if (this.f84317y0 == TransferForm.TRANSFERTYPE.PHONE) {
                str2 = (String) this.f84311s0.get(26);
            } else {
                str2 = mo85320Z2(mo85256M4());
            }
            String str7 = str2;
            if (this.f84317y0 == TransferForm.TRANSFERTYPE.PIN) {
                str5 = mo85255L4();
            }
            String str8 = str5;
            String I4 = mo85253I4();
            if (this.f84151I0) {
                str3 = "B";
            } else if (this.f84152J0) {
                str3 = "F";
            } else {
                str3 = "G";
            }
            bankApi.getTransferCommission(valueOf, str6, T2, str7, str8, I4, str3, str, new C34864j());
        }
        mo85325m3();
    }

    /* renamed from: J4 */
    private void m102413J4() {
        if (this.f84316x0 != null) {
            this.f84271D0 = true;
            this.f84272E0 = false;
            this.f84177i1.transfersGetDispatchTypes(mo85316T2(), new C34863i());
        } else {
            m102408D4();
        }
        mo85325m3();
    }

    /* access modifiers changed from: private */
    /* renamed from: O4 */
    public String m102419O4() {
        String str = null;
        if (!(this.f84317y0 == TransferForm.TRANSFERTYPE.ACCOUNT || this.f84155M0 == null)) {
            for (int i = 0; i < this.f84155M0.size(); i++) {
                OtherAccountDetails otherAccountDetails = (OtherAccountDetails) this.f84155M0.get(i);
                if (otherAccountDetails.f81299id.equals(this.f84311s0.get(4))) {
                    str = otherAccountDetails.name;
                }
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* renamed from: P4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m102421P4() {
        /*
            r10 = this;
            boolean r0 = r10.mo85263c5()
            r1 = 0
            if (r0 != 0) goto L_0x008d
            ge.bog.mobilebank.model.account.AccountLov r0 = r10.f84316x0
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r10.mo85256M4()
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r10.mo85256M4()
            java.lang.String r0 = r10.mo85320Z2(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
        L_0x001f:
            java.lang.String r0 = r10.mo85255L4()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r10.mo85255L4()
            java.lang.String r0 = r10.mo85320Z2(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008d
        L_0x0033:
            java.lang.String r0 = "PAYMENT_WITHIN_BANK"
            java.lang.String r2 = r10.mo85254K4()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x008d
            boolean r0 = r10.m102475u5()
            if (r0 == 0) goto L_0x008d
            r0 = 1
            r10.f84271D0 = r0
            r10.f84272E0 = r1
            ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE r0 = r10.f84317y0
            ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE r1 = p341ge.bog.mobilebank.transfers.model.TransferForm.TRANSFERTYPE.PHONE
            r2 = 0
            if (r0 != r1) goto L_0x005d
            java.util.ArrayList r0 = r10.f84311s0
            r1 = 26
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
        L_0x005b:
            r7 = r0
            goto L_0x006b
        L_0x005d:
            ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE r1 = p341ge.bog.mobilebank.transfers.model.TransferForm.TRANSFERTYPE.ACCOUNT
            if (r0 != r1) goto L_0x006a
            java.lang.String r0 = r10.mo85256M4()
            java.lang.String r0 = r10.mo85320Z2(r0)
            goto L_0x005b
        L_0x006a:
            r7 = r2
        L_0x006b:
            ge.bog.mobilebank.rest.BankApi r3 = r10.f84177i1
            java.lang.String r4 = r10.mo85254K4()
            java.lang.String r5 = r10.mo85316T2()
            java.lang.String r6 = r10.mo85316T2()
            ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE r0 = r10.f84317y0
            ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE r1 = p341ge.bog.mobilebank.transfers.model.TransferForm.TRANSFERTYPE.PIN
            if (r0 != r1) goto L_0x0083
            java.lang.String r2 = r10.mo85255L4()
        L_0x0083:
            r8 = r2
            ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$k r9 = new ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity$k
            r9.<init>()
            r3.getTransferNominations(r4, r5, r6, r7, r8, r9)
            goto L_0x0094
        L_0x008d:
            r10.f84271D0 = r1
            r10.f84272E0 = r1
            r10.mo85257N2()
        L_0x0094:
            r10.mo85325m3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity.m102421P4():void");
    }

    /* renamed from: R4 */
    private void m102424R4() {
        this.f84154L0++;
        if (!TextUtils.isEmpty(mo85320Z2(mo85256M4()))) {
            this.f84271D0 = true;
            this.f84272E0 = false;
            TransferForm.TRANSFERTYPE transfertype = this.f84317y0;
            if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
                this.f84177i1.getAcctOwnerInfoMasked(mo85320Z2(mo85256M4()), mo85316T2(), BankApiResponse.SUCCESSFUL_RESPONSE_CODE, new C34859e());
            } else if (transfertype == TransferForm.TRANSFERTYPE.ACCOUNT) {
                this.f84177i1.getAcctOwnerInfo(mo85320Z2(mo85256M4()), mo85316T2(), "1", new C34860f());
            } else if (transfertype == TransferForm.TRANSFERTYPE.PHONE) {
                this.f84177i1.getAcctOwnerInfoMaskedWithPhone((String) this.f84311s0.get(3), mo85316T2(), new C34861g());
            }
        } else {
            m102473t5(false);
        }
        mo85325m3();
    }

    /* renamed from: T4 */
    private C41185v m102427T4() {
        return C20288a.m66329d(getSupportFragmentManager());
    }

    /* renamed from: U4 */
    private String m102429U4() {
        try {
            return C27950a.m86284a(((DispatchType) this.f84156N0.get(Integer.valueOf((String) this.f84311s0.get(16)).intValue())).getTooltipDictionaryKey());
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W4 */
    public TransferForeighBankParams m102432W4(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList = new ArrayList();
        List<FileAttachment> list = this.f84158P0;
        if (list != null) {
            for (FileAttachment attachmentId : list) {
                arrayList.add(String.valueOf(attachmentId.getAttachmentId()));
            }
        }
        String valueOf = String.valueOf(this.f84316x0.getId());
        String M4 = mo85256M4();
        String valueText = this.f84284R.getValueText();
        BogCountry bogCountry = this.f84161S0;
        if (bogCountry != null) {
            str4 = bogCountry.getCountryCode();
        } else {
            str4 = null;
        }
        String valueText2 = this.f84300h0.getValueText();
        String valueText3 = this.f84301i0.getValueText();
        String bankName = this.f84160R0.getBankName();
        String swift = this.f84160R0.getSwift();
        ForeignBank foreignBank = this.f84159Q0;
        if (foreignBank != null) {
            str5 = foreignBank.getSwift();
        } else {
            str5 = null;
        }
        ForeignBank foreignBank2 = this.f84159Q0;
        if (foreignBank2 != null) {
            str6 = foreignBank2.getBankName();
        } else {
            str6 = null;
        }
        String Y2 = mo85319Y2();
        String ccy = this.f84316x0.getCcy();
        String I4 = mo85253I4();
        String valueText4 = this.f84293a0.getValueText();
        String valueText5 = this.f84305m0.getValueText();
        String w = new Gson().mo18181w(arrayList);
        ReportingCode reportingCode = this.f84162T0;
        if (reportingCode != null) {
            str7 = reportingCode.getReportingCode();
        } else {
            str7 = null;
        }
        return new TransferForeighBankParams(valueOf, M4, valueText, str4, valueText2, valueText3, bankName, swift, str5, str6, Y2, ccy, I4, valueText4, valueText5, w, str7, this.f84167Y0, Integer.valueOf(this.f84268A0 ? 1 : 0), C10146d0.C10177h.m37232a(), BankApi.TRANSFERS_FOREIGN_NEW, str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: X4 */
    public TransferWithinBankParams m102434X4(String str, String str2, String str3) {
        String str4;
        String str5;
        String valueOf = String.valueOf(this.f84316x0.getId());
        if (this.f84317y0 == TransferForm.TRANSFERTYPE.PHONE) {
            str4 = (String) this.f84311s0.get(26);
        } else {
            str4 = mo85320Z2(mo85256M4());
        }
        String str6 = str4;
        if (this.f84317y0 == TransferForm.TRANSFERTYPE.PIN) {
            str5 = mo85255L4();
        } else {
            str5 = null;
        }
        return new TransferWithinBankParams(valueOf, str6, str5, this.f84284R.getValueText(), this.f84286T.getValueText(), mo85259S4(), mo85319Y2(), this.f84316x0.getCcy(), this.f84293a0.getValueText(), "", this.f84298f0.getValueText(), this.f84167Y0, Integer.valueOf(this.f84268A0 ? 1 : 0), C10146d0.C10177h.m37232a(), BankApi.SERVICE_TRANSFERS_WITHIN_BANK, str, str2, str3);
    }

    /* renamed from: Y4 */
    private TransferWithinGeorgiaParams m102436Y4(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        BogCountry bogCountry;
        String str7 = null;
        if (!m102444d5() || (bogCountry = this.f84161S0) == null) {
            str4 = null;
        } else {
            str4 = bogCountry.getCountryCode();
        }
        if (m102444d5()) {
            str5 = this.f84300h0.getValueText();
        } else {
            str5 = null;
        }
        if (m102444d5()) {
            str7 = this.f84301i0.getValueText();
        }
        String str8 = str7;
        String valueOf = String.valueOf(this.f84316x0.getId());
        String Z2 = mo85320Z2(mo85256M4());
        String Z22 = mo85320Z2(mo85256M4());
        String valueText = this.f84284R.getValueText();
        String valueText2 = this.f84286T.getValueText();
        String S4 = mo85259S4();
        String Y2 = mo85319Y2();
        String ccy = this.f84316x0.getCcy();
        String valueText3 = this.f84293a0.getValueText();
        String I4 = mo85253I4();
        String valueText4 = this.f84298f0.getValueText();
        Long l = this.f84167Y0;
        Integer valueOf2 = Integer.valueOf(this.f84268A0 ? 1 : 0);
        String a = C10146d0.C10177h.m37232a();
        if (mo85263c5()) {
            str6 = BankApi.TRANSFERS_WITHIN_BUDGET;
        } else {
            str6 = BankApi.SERVICE_TRANSFERS_WITHIN_GEORGIA;
        }
        return new TransferWithinGeorgiaParams(valueOf, Z2, Z22, valueText, valueText2, S4, Y2, ccy, valueText3, I4, "", str4, str5, str8, valueText4, l, valueOf2, a, str6, str, str2, str3);
    }

    /* renamed from: Z4 */
    private void m102438Z4() {
        String str;
        if (!TextUtils.isEmpty(mo85320Z2(mo85256M4()))) {
            this.f84271D0 = true;
            this.f84272E0 = false;
            this.f84154L0++;
            BankApi bankApi = this.f84177i1;
            String Z2 = mo85320Z2(mo85256M4());
            String T2 = mo85316T2();
            if (this.f84317y0 != TransferForm.TRANSFERTYPE.ACCOUNT) {
                str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
            } else {
                str = "1";
            }
            bankApi.getTreasureOwnerInfo(Z2, T2, str, new C34862h());
        } else {
            m102473t5(false);
        }
        mo85325m3();
    }

    /* access modifiers changed from: private */
    /* renamed from: b5 */
    public void m102441b5(BankApiResponse bankApiResponse) {
        boolean z;
        String str;
        this.f84271D0 = false;
        this.f84272E0 = !bankApiResponse.isSuccess();
        if (bankApiResponse.isSuccess()) {
            this.f84150H0 = ((AccountOwnerInfoWrapper) bankApiResponse.getResult()).clientInfo.getBic();
            this.f84149G0 = ((AccountOwnerInfoWrapper) bankApiResponse.getResult()).clientInfo.isTrusted();
            this.f84151I0 = false;
            if (((AccountOwnerInfoWrapper) bankApiResponse.getResult()).clientInfo.getAcctBankType() == AccountCountryType.FOREIGN) {
                z = true;
            } else {
                z = false;
            }
            this.f84152J0 = z;
            if (m102444d5()) {
                str = TransferForm.TRANSFER_FORM_FOREIGN;
            } else {
                str = TransferForm.TRANSFER_FORM_OTHER;
            }
            this.f84309q0 = str;
            if (this.f84269B0) {
                if (this.f84152J0) {
                    this.f84270C0 = false;
                }
                m102405A4();
                this.f84152J0 = false;
            }
            if (((AccountOwnerInfoWrapper) bankApiResponse.getResult()).clientInfo.getOwner() != null) {
                this.f84151I0 = true;
                if (!this.f84168Z0) {
                    this.f84311s0.set(5, ((AccountOwnerInfoWrapper) bankApiResponse.getResult()).clientInfo.getOwner());
                }
            }
            if (((AccountOwnerInfoWrapper) bankApiResponse.getResult()).accounts != null) {
                this.f84155M0 = ((AccountOwnerInfoWrapper) bankApiResponse.getResult()).accounts;
            }
            m102473t5(bankApiResponse.isSuccess());
        } else {
            C32297d.m95154b(this, C27950a.m86284a(bankApiResponse.getKey()));
            mo85257N2();
        }
        if (this.f84149G0 || this.f84276J.f68593J.getChildCount() > 0) {
            this.f84276J.f68595L.f70293q.setVisibility(8);
        } else {
            this.f84276J.f68595L.f70293q.setVisibility(0);
        }
        mo85325m3();
    }

    /* renamed from: d5 */
    private boolean m102444d5() {
        return (!this.f84151I0 && !mo85263c5() && !"GEL".equals(mo85316T2())) || this.f84152J0;
    }

    /* renamed from: g5 */
    private boolean m102448g5() {
        if (!"GEL".equals(mo85316T2())) {
            return true;
        }
        String valueText = this.f84284R.getValueText();
        if (valueText != null) {
            int i = 0;
            while (i < valueText.length()) {
                int i2 = i + 1;
                if (valueText.subSequence(i, i2).toString().matches("[A-Za-zა-ჰ]")) {
                    return true;
                }
                i = i2;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h5 */
    public /* synthetic */ void m102450h5(C28261a aVar, Throwable th) {
        int i;
        int i2;
        if (th != null) {
            C32297d.m95155c(this, getString(C10328q.f28940T1), (C32311i0) null);
            new Handler(Looper.getMainLooper()).postDelayed(new C39812o(this), C12902d.C12905b.C12908c.f38105a.mo33660a());
            return;
        }
        int i3 = C34857c.f84195a[aVar.mo67850g().ordinal()];
        if (i3 == 1) {
            i = C10320i.ic_contact_treasury;
        } else if (i3 == 2) {
            i = C10320i.ic_contact_company_small;
        } else if (aVar.mo67861q()) {
            i = C10320i.ic_contact_default_avatar_bog;
        } else {
            i = C10320i.ic_contact_default_avatar;
        }
        int i4 = i;
        ArrayList arrayList = new ArrayList();
        for (C28262b bVar : aVar.mo67845c()) {
            if (bVar.mo67870e() == null) {
                i2 = C10320i.default_small;
            } else {
                i2 = C32299e.m95163a(bVar.mo67870e());
            }
            arrayList.add(new TransferContactAccount(i2, bVar.mo67869d(), bVar.mo67873g(), bVar.mo67868c()));
        }
        this.f84165W0 = new TransferContact(aVar.mo67857m(), aVar.mo67853i(), C32289b0.m95090b(aVar.mo67860p(), true), i4, aVar.mo67861q(), aVar.mo67850g(), arrayList, aVar.mo67864t(), aVar.mo67866u());
        if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(3)) && !aVar.mo67845c().isEmpty()) {
            this.f84311s0.set(3, ((C28262b) aVar.mo67845c().get(0)).mo67869d());
        }
        this.f84311s0.set(5, aVar.mo67853i());
        this.f84271D0 = false;
        mo85325m3();
        m102468q5();
    }

    /* access modifiers changed from: private */
    /* renamed from: i5 */
    public /* synthetic */ void m102452i5(TransferTermsItemUiModel transferTermsItemUiModel) {
        String str;
        if (this.f84169a1.getLanguage() == C37353c.KA) {
            str = transferTermsItemUiModel.getClickUrl().getGE();
        } else {
            str = transferTermsItemUiModel.getClickUrl().getEN();
        }
        C32303f.m95184D(str, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j5 */
    public /* synthetic */ void m102454j5(CompoundButton compoundButton, boolean z, boolean z2) {
        mo85236P2();
    }

    /* access modifiers changed from: private */
    /* renamed from: k5 */
    public /* synthetic */ void m102456k5(View view) {
        View view2 = new View(this);
        view2.setTag(this.f84281O);
        onClick(view2);
    }

    /* access modifiers changed from: private */
    /* renamed from: l5 */
    public /* synthetic */ void m102458l5(View view) {
        View view2 = new View(this);
        view2.setTag(this.f84283Q);
        onClick(view2);
    }

    /* access modifiers changed from: private */
    /* renamed from: m5 */
    public /* synthetic */ void m102460m5(View view) {
        m102482y5();
    }

    /* access modifiers changed from: private */
    /* renamed from: n5 */
    public /* synthetic */ void m102462n5(View view) {
        m102482y5();
    }

    /* access modifiers changed from: private */
    /* renamed from: o5 */
    public /* synthetic */ void m102464o5() {
        this.f84180l1 = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: p5 */
    public /* synthetic */ void m102466p5(AccountLov accountLov, Throwable th) {
        AccountLov accountLov2 = this.f84315w0;
        if (accountLov2 != null && accountLov2.getMainAcctKey() == accountLov.getMainAcctKey()) {
            mo74709H1(th);
        }
    }

    /* renamed from: q5 */
    private void m102468q5() {
        if (mo85263c5()) {
            m102438Z4();
            return;
        }
        m102424R4();
        m102409D5();
    }

    /* access modifiers changed from: private */
    /* renamed from: r5 */
    public void m102470r5(boolean z) {
        String str;
        String str2;
        Long l;
        String str3;
        String str4;
        String str5;
        if (z) {
            str = "treasury";
            str2 = str;
        } else {
            TransferForm.TRANSFERTYPE transfertype = this.f84317y0;
            if (transfertype == TransferForm.TRANSFERTYPE.ACCOUNT) {
                str3 = "other_transfers_pin";
            } else if (this.f84152J0) {
                str3 = "other_transfers_foreign";
            } else {
                str3 = "other_transfers_acc";
            }
            if (transfertype == TransferForm.TRANSFERTYPE.PHONE) {
                str4 = "other_transfer_phone";
            } else {
                str4 = str3;
            }
            if (this.f84152J0) {
                str5 = "foreign";
            } else {
                str5 = "other_transfer";
            }
            str2 = str4;
            str = str5;
        }
        C32306g0.m95223d(str);
        long longExtra = getIntent().getLongExtra("action_value", -1);
        C10463g F = C36546y.m108282F();
        if (longExtra == -1) {
            l = null;
        } else {
            l = Long.valueOf(longExtra);
        }
        F.mo27154u("transfers", str2, "finish_transfer", l, getIntent().getStringExtra("event_label_2"));
    }

    /* access modifiers changed from: private */
    /* renamed from: t5 */
    public void m102473t5(boolean z) {
        TransferContact transferContact;
        if (!z) {
            if (!this.f84168Z0 || (transferContact = this.f84165W0) == null) {
                this.f84311s0.set(5, (Object) null);
            } else {
                this.f84311s0.set(5, transferContact.getFullName());
            }
            this.f84311s0.set(4, (Object) null);
            this.f84155M0 = null;
            this.f84150H0 = null;
        }
        if (!this.f84151I0) {
            m102413J4();
        } else {
            m102411G4();
        }
    }

    /* renamed from: u5 */
    private boolean m102475u5() {
        TransferForm.TRANSFERTYPE transfertype = this.f84317y0;
        if (transfertype == TransferForm.TRANSFERTYPE.PHONE) {
            return !TextUtils.isEmpty((CharSequence) this.f84311s0.get(26));
        }
        if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
            return !TextUtils.isEmpty((CharSequence) this.f84311s0.get(4));
        }
        if (transfertype == TransferForm.TRANSFERTYPE.ACCOUNT) {
            return !TextUtils.isEmpty(mo85320Z2(this.f84283Q.getValueText()));
        }
        return true;
    }

    /* renamed from: w5 */
    private void m102478w5() {
        this.f84281O.clearIcon();
        this.f84281O.clearInputDrawableEnd();
        AccountLov accountLov = this.f84315w0;
        if (accountLov != null && this.f84316x0 != null) {
            if (!accountLov.isDefault()) {
                this.f84281O.setIconResource(C10320i.ic_favorite_border_24dp, (View.OnClickListener) new C39808k(this));
            } else if (this.f84180l1) {
                this.f84281O.setIconResource(C10320i.ic_favorite_filled_24dp, (View.OnClickListener) new C39809l(this));
            } else {
                this.f84281O.setInputDrawableEnd(C10320i.ic_favorite_12dp);
            }
        }
    }

    /* renamed from: x5 */
    private void m102480x5(String str, HashMap hashMap) {
        C41185v.m119403r2(str, hashMap).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: y5 */
    private void m102482y5() {
        C24978b bVar;
        AccountLov accountLov = this.f84315w0;
        C26619b bVar2 = this.f84174f1;
        if (bVar2 != null && accountLov != null) {
            String productGroup = accountLov.getProductGroup();
            String valueOf = String.valueOf(accountLov.getMainAcctKey());
            if (accountLov.isDefault()) {
                bVar = C24978b.NO;
            } else {
                bVar = C24978b.YES;
            }
            mo86438k1(bVar2.mo65873a(productGroup, valueOf, bVar).mo94906z(C40992a.m118827a()).mo94888G(new C39810m(this), new C39811n(this, accountLov)));
        }
    }

    /* renamed from: z5 */
    private void m102484z5() {
        String str;
        HashMap hashMap;
        String str2;
        if (this.f84316x0 != null) {
            if (!m102444d5() || this.f84152J0 || this.f84286T.getValueText().matches("[A-Za-z0-9/\\-?:().,'+ ]*")) {
                new HashMap();
                if (this.f84151I0) {
                    hashMap = this.f84179k1.mo66809a(m102434X4((String) null, (String) null, (String) null));
                    str = BankApi.SERVICE_TRANSFERS_WITHIN_BANK;
                } else if (this.f84152J0) {
                    hashMap = this.f84179k1.mo66809a(m102432W4((String) null, (String) null, (String) null));
                    str = BankApi.TRANSFERS_FOREIGN_NEW;
                } else {
                    if (mo85263c5()) {
                        str2 = BankApi.TRANSFERS_WITHIN_BUDGET;
                    } else {
                        str2 = BankApi.SERVICE_TRANSFERS_WITHIN_GEORGIA;
                    }
                    str = str2;
                    hashMap = this.f84179k1.mo66809a(m102436Y4((String) null, (String) null, (String) null));
                }
                mo85311I3();
                m102480x5(str, hashMap);
                return;
            }
            C32297d.m95154b(this, getString(C10328q.foreign_ccy_transfer_payer_name_allowed_characters));
        }
    }

    /* renamed from: A5 */
    public void mo85248A5(String str, String str2, String str3, boolean z) {
        mo85311I3();
        this.f84164V0.mo93271a(BankApi.TRANSFERS_FOREIGN_NEW, new C34853a(str, str2, str3, z));
    }

    /* renamed from: B5 */
    public void mo85249B5(String str, String str2, String str3, boolean z) {
        if (this.f84316x0 != null) {
            mo85311I3();
            this.f84164V0.mo93271a(BankApi.SERVICE_TRANSFERS_WITHIN_BANK, new C34855b(str, str2, str3, z));
        }
    }

    /* renamed from: C5 */
    public void mo85250C5(String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        if (this.f84316x0 != null) {
            if (!m102444d5() || this.f84286T.getValueText().matches("[A-Za-z0-9/\\-?:().,'+ ]*")) {
                mo85311I3();
                if (m102444d5()) {
                    str4 = this.f84299g0.getValueText();
                } else {
                    str4 = null;
                }
                TransferWithinGeorgiaParams Y4 = m102436Y4(str, str2, str3);
                C39610j jVar = this.f84164V0;
                if (mo85263c5()) {
                    str5 = BankApi.TRANSFERS_WITHIN_BUDGET;
                } else {
                    str5 = BankApi.SERVICE_TRANSFERS_WITHIN_GEORGIA;
                }
                jVar.mo93271a(str5, new C34866l(Y4, z, str4));
                return;
            }
            C32297d.m95154b(this, getString(C10328q.foreign_ccy_transfer_payer_name_allowed_characters));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F4 */
    public TransferTemplateObject mo85251F4(TemplateBasketItem templateBasketItem, String str) {
        String str2;
        String str3;
        TransferTemplateObject transferTemplateObject = new TransferTemplateObject();
        transferTemplateObject.setAmount(mo85319Y2());
        transferTemplateObject.setTemplateName((String) this.f84311s0.get(0));
        if (this.f84151I0) {
            str2 = "B";
        } else if (mo85263c5()) {
            str2 = "R";
        } else {
            str2 = "G";
        }
        transferTemplateObject.setTemplateType(str2);
        AccountLov accountLov = this.f84316x0;
        if (accountLov != null) {
            transferTemplateObject.addTemplateParam("debitAccountNumber", accountLov.getAcctNo(), mo85318V2(templateBasketItem, "debitAccountNumber"));
            transferTemplateObject.addTemplateParam("debitAccNo", this.f84316x0.getAcctNo(), mo85318V2(templateBasketItem, "debitAccNo"));
            transferTemplateObject.addTemplateParam("description", (String) this.f84311s0.get(19), mo85318V2(templateBasketItem, "description"));
            transferTemplateObject.addTemplateParam("debitAccCurrency", this.f84316x0.getCcy(), mo85318V2(templateBasketItem, "debitAccCurrency"));
            transferTemplateObject.addTemplateParam("debitAccountId", this.f84316x0.getId() + "", mo85318V2(templateBasketItem, "debitAccountId"));
        }
        transferTemplateObject.addTemplateParam("amount", mo85319Y2(), mo85318V2(templateBasketItem, "amount"));
        transferTemplateObject.addTemplateParam("payerId", mo85259S4(), mo85318V2(templateBasketItem, "payerId"));
        AccountLov accountLov2 = this.f84316x0;
        if (accountLov2 != null) {
            transferTemplateObject.addTemplateParam("currency", accountLov2.getCcy(), mo85318V2(templateBasketItem, "currency"));
        }
        transferTemplateObject.addTemplateParam("creditBankCode", this.f84150H0, mo85318V2(templateBasketItem, "creditBankCode"));
        transferTemplateObject.addTemplateParam("benefBic", this.f84150H0, mo85318V2(templateBasketItem, "benefBic"));
        transferTemplateObject.addTemplateParam("dispatchType", mo85253I4(), mo85318V2(templateBasketItem, "dispatchType"));
        transferTemplateObject.addTemplateParam("charges", mo85253I4(), mo85318V2(templateBasketItem, "charges"));
        transferTemplateObject.addTemplateParam("paymentdetail", (String) this.f84311s0.get(19), mo85318V2(templateBasketItem, "paymentdetail"));
        TransferForm.TRANSFERTYPE transfertype = this.f84317y0;
        TransferForm.TRANSFERTYPE transfertype2 = TransferForm.TRANSFERTYPE.PIN;
        if (transfertype == transfertype2) {
            str3 = str;
        } else {
            str3 = mo85256M4();
        }
        transferTemplateObject.addTemplateParam("creditAccNo", str3, mo85318V2(templateBasketItem, "creditAccNo"));
        if (this.f84317y0 != transfertype2) {
            str = mo85256M4();
        }
        transferTemplateObject.addTemplateParam("creditAccountNumber", str, mo85318V2(templateBasketItem, "creditAccountNumber"));
        String str4 = this.f84178j1.getUserInfo().getClient().getFirstNameInt() + " " + this.f84178j1.getUserInfo().getClient().getLastNameInt();
        String str5 = this.f84178j1.getUserInfo().getClient().getFirstName() + " " + this.f84178j1.getUserInfo().getClient().getLastName();
        transferTemplateObject.addTemplateParam("payerFullNameGeo", str5, mo85318V2(templateBasketItem, "payerFullNameGeo"));
        transferTemplateObject.addTemplateParam("payerFullNameLatin", str4, mo85318V2(templateBasketItem, "payerFullNameLatin"));
        transferTemplateObject.addTemplateParam("payerFullNameGE", str5, mo85318V2(templateBasketItem, "payerFullNameGE"));
        transferTemplateObject.addTemplateParam("payerFullNameEN", str4, mo85318V2(templateBasketItem, "payerFullNameEN"));
        transferTemplateObject.addTemplateParam("payerName", this.f84286T.getValueText(), mo85318V2(templateBasketItem, "payerName"));
        transferTemplateObject.addTemplateParam("customerName", str4, mo85318V2(templateBasketItem, "customerName"));
        transferTemplateObject.addTemplateParam("recipientName", this.f84284R.getValueText(), mo85318V2(templateBasketItem, "recipientName"));
        if (this.f84316x0 != null) {
            transferTemplateObject.addTemplateParam("idDebitAccount", this.f84316x0.getId() + "", mo85318V2(templateBasketItem, "idDebitAccount"));
        }
        if (templateBasketItem != null) {
            transferTemplateObject.setId(Long.valueOf(templateBasketItem.getId()));
        }
        return transferTemplateObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H4 */
    public String mo85252H4() {
        try {
            return C27950a.m86284a(((DispatchType) this.f84156N0.get(Integer.valueOf((String) this.f84311s0.get(16)).intValue())).getDictionaryKey());
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I4 */
    public String mo85253I4() {
        try {
            return ((DispatchType) this.f84156N0.get(Integer.valueOf((String) this.f84311s0.get(16)).intValue())).getDispatchType();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K4 */
    public String mo85254K4() {
        if (mo85263c5()) {
            return "PAYMENT_WITHIN_BUDGET";
        }
        if (this.f84151I0) {
            return "PAYMENT_WITHIN_BANK";
        }
        if (this.f84152J0) {
            return "PAYMENT_FOREIGN";
        }
        return "PAYMENT_WITHIN_GEORGIA";
    }

    /* access modifiers changed from: protected */
    /* renamed from: L4 */
    public String mo85255L4() {
        String Z2 = mo85320Z2(this.f84283Q.getValueText());
        if (!(this.f84317y0 == TransferForm.TRANSFERTYPE.ACCOUNT || this.f84155M0 == null)) {
            for (int i = 0; i < this.f84155M0.size(); i++) {
                OtherAccountDetails otherAccountDetails = (OtherAccountDetails) this.f84155M0.get(i);
                if (otherAccountDetails.f81299id.equals(this.f84311s0.get(4))) {
                    Z2 = otherAccountDetails.f81299id;
                }
            }
        }
        return Z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M4 */
    public String mo85256M4() {
        if (this.f84317y0 == TransferForm.TRANSFERTYPE.PHONE) {
            return (String) this.f84311s0.get(26);
        }
        return mo85320Z2((String) this.f84311s0.get(3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public void mo85257N2() {
        int i = this.f84154L0 - 1;
        this.f84154L0 = i;
        if (i <= 0) {
            this.f84154L0 = 0;
            super.mo85257N2();
        }
        if (this.f84171c1) {
            if (this.f84315w0 == null || this.f84316x0 == null) {
                onClick(this.f84281O.getViewSelector());
            } else if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(3))) {
                onClick(this.f84283Q.getViewSelector());
            } else if (m102444d5()) {
                onClick(this.f84299g0.getViewSelector());
            } else if (mo85315S2() <= Utils.DOUBLE_EPSILON) {
                onClick(this.f84289W.getViewSelector());
            } else if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(19))) {
                onClick(this.f84293a0.getViewSelector());
            }
            this.f84171c1 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N4 */
    public ArrayList mo85235N4() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        if (!this.f84152J0) {
            arrayList.add(9);
        }
        arrayList.add(19);
        arrayList.add(5);
        if (!this.f84151I0) {
            arrayList.add(16);
        }
        if (this.f84317y0 != TransferForm.TRANSFERTYPE.ACCOUNT) {
            arrayList.add(4);
        }
        if (m102444d5()) {
            arrayList.add(8);
            arrayList.add(7);
        }
        return arrayList;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        if (m102427T4() != null) {
            m102427T4().mo4577k1();
        }
        if (this.f84151I0) {
            mo85249B5(str, str2, str3, true);
        } else if (this.f84152J0) {
            mo85248A5(str, str2, str3, true);
        } else {
            mo85250C5(str, str2, str3, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        boolean z;
        super.mo37451O1(bundle);
        this.f84151I0 = getIntent().getBooleanExtra("TRANSFER_WITHIN_BANK", false);
        this.f84166X0 = getIntent().getLongExtra("TRANSFER_CONTACT_ID", -1);
        long longExtra = getIntent().getLongExtra("TRANSFER_MONEY_REQUEST_ID", -1);
        if (longExtra != -1) {
            this.f84167Y0 = Long.valueOf(longExtra);
        }
        boolean z2 = true;
        if (this.f84166X0 != -1) {
            z = true;
        } else {
            z = false;
        }
        this.f84168Z0 = z;
        if (!z && !getIntent().getBooleanExtra("TRANSFER_AUTOMATICALLY_OPEN_WIZARD", false)) {
            z2 = false;
        }
        this.f84171c1 = z2;
        if (getIntent().hasExtra("PMI_HISTORY_ITEM")) {
            this.f84163U0 = (PMIHistoryItem) C42035e.m122119a(getIntent().getParcelableExtra("PMI_HISTORY_ITEM"));
        }
        PMIHistoryItem pMIHistoryItem = this.f84163U0;
        if (pMIHistoryItem != null) {
            this.f84162T0 = pMIHistoryItem.reportingCode;
            this.f84161S0 = pMIHistoryItem.benefCountry;
            this.f84159Q0 = pMIHistoryItem.intBank;
            this.f84160R0 = pMIHistoryItem.benefBank;
        }
        m102406B4();
        mo85333u3(false);
        this.f84164V0 = new C39610j(this.f84177i1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public void mo85236P2() {
        boolean z;
        ForeignBank foreignBank;
        Iterator it = mo85235N4().iterator();
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
        if (!mo85312O2(mo85260V4())) {
            z2 = false;
        }
        if (m102444d5() && this.f84161S0 == null) {
            z2 = false;
        }
        if (this.f84152J0 && ((foreignBank = this.f84160R0) == null || (foreignBank.getCountryCode() == TransferCountryCode.COUNTRY_CODE_UNITED_ARAB_EMIRATES && this.f84162T0 == null))) {
            z2 = false;
        }
        if (this.f84269B0 && (!this.f84153K0 || !this.f84270C0)) {
            z2 = false;
        }
        if (!mo85265f5()) {
            z2 = false;
        }
        if (!m102448g5()) {
            z2 = false;
        }
        if (mo85264e5()) {
            z = z2;
        }
        this.f84276J.f68595L.f70288l.setOrange(z, z, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q4 */
    public String mo85258Q4() {
        try {
            return ((TransferNomination) this.f84157O0.get(Integer.valueOf((String) this.f84311s0.get(18)).intValue())).nomination;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            mo85311I3();
        } else {
            mo85321a3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S4 */
    public String mo85259S4() {
        String valueText = this.f84287U.getValueText();
        if (!TextUtils.isEmpty(valueText)) {
            return valueText;
        }
        if (this.f84178j1.getUserInfo().getClient().isResident()) {
            return this.f84178j1.getUserInfo().getClient().pin;
        }
        return "";
    }

    /* renamed from: V4 */
    public int mo85260V4() {
        return this.f84151I0 ? 1 : 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X2 */
    public void mo85261X2() {
        if (!this.f84168Z0 || this.f84165W0 != null) {
            m102468q5();
            return;
        }
        mo86438k1(this.f84170b1.mo67637b(this.f84166X0).mo95063B(C40992a.m118827a()).mo95068G(new C39807j(this)));
        this.f84271D0 = true;
        this.f84272E0 = false;
        mo85325m3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a5 */
    public Intent mo85262a5(View view) {
        int i;
        int i2;
        Intent intent = new Intent(this, BankTransferWizardActivity.class);
        if (view.getTag() == null || !(view.getTag() instanceof TextTypeView)) {
            i2 = 0;
            i = 0;
        } else {
            i2 = ((TextTypeView) view.getTag()).getPosition();
            i = C32290b1.m95119i((TextTypeView) view.getTag()).top;
        }
        intent.putExtra("IS_TEMPLATE", TransferForm.MODULE_TEMPLATE.equals(this.f84308p0));
        intent.putExtra("TRANSFER_WIZARD_BANK_CODE", this.f84150H0);
        intent.putExtra("WIZARD_INPUT_Y_POSITION", i);
        intent.putExtra("WIZARD_PAGE_INDEX", i2);
        intent.putExtra("TRANSFER_WIZARD_DISPATCH_TYPES", C42035e.m122121c(this.f84156N0));
        intent.putExtra("TRANSFER_WIZARD_NOMINATION_LIST", C42035e.m122121c(this.f84157O0));
        intent.putExtra("TRANSFER_FORCE_BUDGET", mo85263c5());
        intent.putExtra("TRANSFER_WIZARD_WITHIN_BANK", this.f84151I0);
        intent.putStringArrayListExtra("WIZARD_COLLECTED_VALUES", this.f84311s0);
        C32340v0.m95377c(this.f84307o0);
        intent.putExtra("TRANSFER_TYPE", this.f84317y0);
        intent.putExtra("TRANSFER_WIZARD_FOREIGN_TRANSFER", this.f84152J0);
        intent.putExtra("TRANSFER_WIZARD_ATTACHED_FILES", C42035e.m122121c(this.f84158P0));
        intent.putExtra("TRANSFER_WIZARD_SELECTED_INTERMIDIARY_BANK", C42035e.m122121c(this.f84159Q0));
        intent.putExtra("TRANSFER_WIZARD_SELECTED_BENEFICIARY_BANK", C42035e.m122121c(this.f84160R0));
        intent.putExtra("TRANSFER_WIZARD_RECIPIENT_COUNTRY", C42035e.m122121c(this.f84161S0));
        intent.putExtra("TRANSFER_WIZARD_REPORTING_CODE", C42035e.m122121c(this.f84162T0));
        intent.putExtra("IS_REAL_ESTATE", this.f84269B0);
        intent.putExtra("REAL_ESTATE_DST_ALLOWED", this.f84270C0);
        AccountLov accountLov = this.f84316x0;
        if (accountLov != null) {
            intent.putExtra("TRANSFER_WIZARD_FROM_ACCOUNT_CCY", accountLov.getCcy());
        }
        AccountLov accountLov2 = this.f84316x0;
        if (accountLov2 != null) {
            intent.putExtra("TRANSFER_WIZARD_FROM_ACCOUNT_CCY", accountLov2.getCcy());
        }
        ArrayList arrayList = this.f84155M0;
        if (arrayList != null) {
            intent.putExtra("TRANSFER_WIZARD_OTHER_ACCOUNTS", C42035e.m122121c(arrayList));
        }
        TransferContact transferContact = this.f84165W0;
        if (transferContact != null) {
            intent.putExtra("TRANSFER_WIZARD_CONTACT", transferContact);
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c5 */
    public boolean mo85263c5() {
        TransferContact transferContact;
        if (TransferForm.TRANSFER_FORM_BUDGET.equals(this.f84309q0) || ((transferContact = this.f84165W0) != null && transferContact.isBudgetContact())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e5 */
    public boolean mo85264e5() {
        for (int i = 0; i < this.f84276J.f68593J.getChildCount(); i++) {
            if (!((CheckboxView) this.f84276J.f68593J.getChildAt(i)).isChecked()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f5 */
    public boolean mo85265f5() {
        if (this.f84151I0 || this.f84152J0 || mo85256M4() == null || mo85256M4().length() <= 22) {
            return true;
        }
        this.f84272E0 = true;
        C32297d.m95154b(this, C27950a.m86284a("document.result.code.beneficiary.wrong.bank.bic"));
        return false;
    }

    @C41452l(threadMode = ThreadMode.MAIN)
    public void onAccountsLovEvent(AccountLovEvent accountLovEvent) {
        int state = accountLovEvent.getState();
        if (state == 10) {
            mo85311I3();
        } else if (state != 20) {
            mo85321a3();
        } else {
            C32340v0.m95377c(accountLovEvent);
            this.f84307o0 = accountLovEvent;
            mo85267p3();
            m102478w5();
            mo85321a3();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10009) {
            this.f84311s0 = intent.getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
            this.f84156N0 = (ArrayList) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_WIZARD_DISPATCH_TYPES"));
            this.f84157O0 = (ArrayList) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_WIZARD_NOMINATION_LIST"));
            this.f84150H0 = intent.getStringExtra("TRANSFER_WIZARD_BANK_CODE");
            this.f84151I0 = intent.getBooleanExtra("TRANSFER_WIZARD_WITHIN_BANK", false);
            TransferForm.TRANSFERTYPE transfertype = (TransferForm.TRANSFERTYPE) intent.getSerializableExtra("TRANSFER_TYPE");
            this.f84317y0 = transfertype;
            if (transfertype == null) {
                this.f84317y0 = TransferForm.TRANSFERTYPE.ACCOUNT;
            }
            this.f84152J0 = intent.getBooleanExtra("TRANSFER_WIZARD_FOREIGN_TRANSFER", false);
            this.f84158P0 = (List) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_WIZARD_ATTACHED_FILES"));
            this.f84159Q0 = (ForeignBank) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_WIZARD_SELECTED_INTERMIDIARY_BANK"));
            this.f84160R0 = (ForeignBank) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_WIZARD_SELECTED_BENEFICIARY_BANK"));
            this.f84161S0 = (BogCountry) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_WIZARD_RECIPIENT_COUNTRY"));
            this.f84162T0 = (ReportingCode) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_WIZARD_REPORTING_CODE"));
            this.f84269B0 = intent.getBooleanExtra("IS_REAL_ESTATE", false);
            this.f84270C0 = intent.getBooleanExtra("REAL_ESTATE_DST_ALLOWED", true);
            mo85333u3(true);
        }
    }

    public void onClick(View view) {
        BogButton bogButton = this.f84276J.f68595L.f70288l;
        if (view != bogButton) {
            String hint = ((TextTypeView) view.getTag()).getBogInputLayout().getHint();
            if (this.f84168Z0) {
                C36546y.m108282F().mo27156w("transfers", hint, "wizard_open", this.f84165W0.getConnectionType().mo67882b());
            } else {
                C36546y.m108282F().mo27152s("transfers", hint, "wizard_open");
            }
            BankTransferWizardActivity.m106404z5(this, mo85262a5(view), 10009);
        } else if (bogButton.isOrange()) {
            if (this.f84168Z0) {
                C36546y.m108282F().mo27156w("transfers", "other_transfer_contact", "finish_transfer", this.f84165W0.getConnectionType().mo67882b());
            }
            m102484z5();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p3 */
    public void mo85267p3() {
        C31971a aVar;
        if (!TextUtils.isEmpty((CharSequence) this.f84311s0.get(1))) {
            aVar = C31972b.m94378c(this.f84307o0.getAccountLovContainer(), Long.parseLong((String) this.f84311s0.get(1)), mo85260V4(), true);
        } else {
            aVar = null;
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

    /* access modifiers changed from: protected */
    /* renamed from: s3 */
    public void mo85240s3(boolean z) {
        mo85335z3(false);
        mo85310H3(false);
        mo85308F3(false);
        mo85303A3(false);
        mo85306D3(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s5 */
    public boolean mo85268s5() {
        try {
            return "Y".equals(((TransferNomination) this.f84157O0.get(Integer.valueOf((String) this.f84311s0.get(18)).intValue())).additionalNomFlag);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: t3 */
    public void mo85241t3() {
        mo85327o3();
        mo85331q3();
        mo85269v5();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v3 */
    public void mo85242v3(boolean z) {
        if (mo85263c5()) {
            this.f84283Q.setTitleText(getString(C10328q.transfers_title_treasure_code));
            this.f84284R.setTitleText(getString(C10328q.transfers_title_treasure_desc));
            this.f84286T.setTitleText(getString(C10328q.transfer_details_title_budget_sender_name));
            this.f84287U.setTitleText(getString(C10328q.transfer_details_title_budget_sender_pin));
        } else {
            this.f84283Q.setTitleText(getString(C10328q.transfers_title_receiver_account));
            this.f84284R.setTitleText(getString(C10328q.transfers_title_receiver_name));
            this.f84286T.setTitleText(getString(C10328q.transfer_details_title_sender_name));
            this.f84287U.setTitleText(getString(C10328q.transfer_details_title_sender_pin));
        }
        TransferForm.TRANSFERTYPE transfertype = this.f84317y0;
        int i = 0;
        if (transfertype == TransferForm.TRANSFERTYPE.PIN) {
            this.f84283Q.setTitleText(getString(C10328q.transfers_title_customer_pin));
            this.f84276J.f68641x.addView(this.f84285S);
            if (this.f84155M0 != null) {
                for (int i2 = 0; i2 < this.f84155M0.size(); i2++) {
                    OtherAccountDetails otherAccountDetails = (OtherAccountDetails) this.f84155M0.get(i2);
                    TransferForm.TRANSFERTYPE transfertype2 = this.f84317y0;
                    TransferForm.TRANSFERTYPE transfertype3 = TransferForm.TRANSFERTYPE.ACCOUNT;
                    if (transfertype2 == transfertype3 && otherAccountDetails.acctNo.equals(this.f84311s0.get(4))) {
                        this.f84285S.setValueTextIgnoringEmpty(otherAccountDetails.getTitle());
                    } else if (this.f84317y0 != transfertype3 && otherAccountDetails.f81299id.equals(this.f84311s0.get(4))) {
                        this.f84285S.setValueTextIgnoringEmpty(otherAccountDetails.getTitle());
                    }
                }
            } else {
                this.f84285S.setValueTextIgnoringEmpty("");
            }
        } else if (transfertype == TransferForm.TRANSFERTYPE.PHONE) {
            this.f84283Q.setTitleText(getString(C10328q.transfers_title_customer_phone));
            this.f84276J.f68641x.addView(this.f84285S);
            if (this.f84311s0.size() > 26) {
                ArrayList arrayList = this.f84155M0;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        OtherAccountDetails otherAccountDetails2 = (OtherAccountDetails) it.next();
                        if (otherAccountDetails2.acctNo.equals(this.f84311s0.get(26))) {
                            this.f84285S.setValueTextIgnoringEmpty(otherAccountDetails2.getTitle());
                        }
                    }
                } else {
                    this.f84285S.setValueTextIgnoringEmpty("");
                }
            }
        }
        this.f84276J.f68615e.setLeftClickListener(new C39803f(this));
        this.f84276J.f68615e.setRightClickListener(new C39804g(this));
        m102478w5();
        AccountLov accountLov = this.f84315w0;
        boolean z2 = true;
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
            if (!this.f84315w0.isDefault() && ((z || !this.f84171c1) && this.f84169a1.getShowFavoriteAccountTooltip())) {
                this.f84281O.getBogInputLayout().showRightImageTooltip(getString(C10328q.transfer_set_favorite_account_tooltip), 7000);
                this.f84169a1.setFavoriteAccountTooltipWasShown();
            }
            ProductProperties properties = ProductProperties.getProperties(this.f84315w0, this.f84178j1, false);
            this.f84276J.f68615e.setLeftFrameState(11);
            this.f84276J.f68615e.setLeft(properties.getBackgroundImageId(), false, str, this.f84316x0.getRealAmountFormatted(), true);
            this.f84276J.f68615e.setTextColorIds(properties.getTitleColorId(), true);
        }
        int a = C32299e.m95163a(this.f84150H0);
        if (this.f84152J0) {
            a = C10320i.default_small;
        }
        this.f84283Q.setValueTextIgnoringEmpty((String) this.f84311s0.get(3));
        this.f84284R.setValueTextIgnoringEmpty((String) this.f84311s0.get(5));
        if (!TextUtils.isEmpty((CharSequence) this.f84311s0.get(3)) || this.f84165W0 != null) {
            this.f84276J.f68615e.setRightFrameState(11);
            this.f84276J.f68615e.setRight(-1, false, (String) this.f84311s0.get(3), (String) this.f84311s0.get(5), false);
            this.f84276J.f68615e.setTextColorIds(C10318g.f28630R0, false);
            if (!this.f84168Z0 || !mo85263c5()) {
                this.f84276J.f68615e.setBankLogo(a);
            } else {
                TransferContact transferContact = this.f84165W0;
                if (transferContact != null) {
                    this.f84276J.f68615e.setBankLogo(transferContact.getProfilePictureDrawable(), this.f84165W0.getProfilePictureUrl(), false);
                } else {
                    this.f84276J.f68615e.resetRight();
                    this.f84283Q.setValueTextIgnoringEmpty((String) null);
                    this.f84276J.f68615e.setBankLogo(-1);
                    this.f84150H0 = null;
                }
            }
        } else {
            this.f84276J.f68615e.resetRight();
            this.f84283Q.setValueTextIgnoringEmpty((String) null);
            this.f84276J.f68615e.setBankLogo(-1);
            this.f84150H0 = null;
        }
        this.f84276J.f68626j0.setText((CharSequence) this.f84311s0.get(5));
        this.f84286T.setValueTextIgnoringEmpty((String) this.f84311s0.get(9));
        this.f84287U.setValueTextIgnoringEmpty((String) this.f84311s0.get(10));
        this.f84289W.setValueTextIgnoringEmpty(mo85317U2(mo85315S2(), mo85316T2()));
        this.f84291Y.setValueTextIgnoringEmpty(mo85252H4());
        if (mo85252H4().isEmpty() || this.f84151I0) {
            this.f84276J.f68622h0.setVisibility(8);
        } else {
            this.f84276J.f68622h0.setVisibility(0);
            this.f84276J.f68622h0.setText(m102429U4());
        }
        this.f84276J.f68598O.setTitleText(C32299e.m95165c(this.f84150H0), false);
        this.f84276J.f68616e0.addView(this.f84293a0);
        ArrayList arrayList2 = this.f84157O0;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f84276J.f68608Y.addView(this.f84292Z);
            this.f84293a0.setTitleText(getString(C10328q.transfer_details_title_nomination_description));
            if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(18))) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f84157O0.size()) {
                        z2 = false;
                        break;
                    } else if (((TransferNomination) this.f84157O0.get(i3)).nomination.equals(this.f84311s0.get(19))) {
                        this.f84311s0.set(18, String.valueOf(i3));
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z2 && !"TRANSFER".equals(this.f84308p0)) {
                    while (true) {
                        if (i >= this.f84157O0.size()) {
                            break;
                        } else if ("Y".equals(((TransferNomination) this.f84157O0.get(i)).additionalNomFlag)) {
                            this.f84311s0.set(18, String.valueOf(i));
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(18))) {
                this.f84311s0.set(19, "");
                this.f84293a0.setValueTextIgnoringEmpty("");
                this.f84292Z.setValueTextIgnoringEmpty("");
                this.f84276J.f68616e0.removeAllViews();
            } else {
                this.f84292Z.setValueTextIgnoringEmpty(mo85258Q4());
                if (!mo85268s5()) {
                    this.f84311s0.set(19, mo85258Q4());
                    this.f84276J.f68616e0.removeAllViews();
                }
            }
        }
        this.f84293a0.setValueTextIgnoringEmpty((String) this.f84311s0.get(19));
        this.f84299g0.setValueText("");
        if (m102444d5()) {
            BogCountry bogCountry = this.f84161S0;
            if (bogCountry != null) {
                this.f84299g0.setValueText(bogCountry.getCountryNameInt());
            }
            this.f84300h0.setValueText((String) this.f84311s0.get(7));
            this.f84301i0.setValueText((String) this.f84311s0.get(8));
        }
        if (this.f84152J0) {
            this.f84303k0.setValueText("");
            ForeignBank foreignBank = this.f84159Q0;
            if (foreignBank != null) {
                this.f84303k0.setValueText(foreignBank.getBankName());
            }
            this.f84304l0.setValueText("");
            ForeignBank foreignBank2 = this.f84160R0;
            if (foreignBank2 != null) {
                this.f84304l0.setValueText(foreignBank2.getBankName());
            }
            this.f84305m0.setValueText((String) this.f84311s0.get(20));
            if (this.f84158P0 != null) {
                StringBuilder sb = new StringBuilder();
                for (FileAttachment fileName : this.f84158P0) {
                    sb.append(fileName.getFileName());
                    sb.append(" ");
                }
                this.f84276J.f68619g.setText(sb.toString());
            }
            ReportingCode reportingCode = this.f84162T0;
            if (reportingCode != null) {
                this.f84276J.f68585B.setText(reportingCode.getDescription());
                this.f84302j0.setValueText(this.f84162T0.getReportingCode());
            }
        }
        if (this.f84269B0) {
            this.f84298f0.setValueText((String) this.f84311s0.get(22));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v5 */
    public void mo85269v5() {
        int i;
        C20557a b;
        TransferTermsUiModel transferTermsUiModel;
        this.f84276J.f68593J.removeAllViews();
        if (!this.f84151I0 && !"GEL".equals(mo85316T2()) && (b = this.f84176h1.mo48775b("FOREIGN_CCY_TRANSFER_TERMS_LINKS")) != null) {
            try {
                transferTermsUiModel = (TransferTermsUiModel) new Gson().mo18165g(b.mo49085b(), TransferTermsUiModel.class);
            } catch (JsonSyntaxException unused) {
                transferTermsUiModel = null;
            }
            if (!(transferTermsUiModel == null || transferTermsUiModel.getTermsAndConditionsParams() == null)) {
                for (TransferTermsItemUiModel next : transferTermsUiModel.getTermsAndConditionsParams()) {
                    CheckboxView checkboxView = new CheckboxView(this, (AttributeSet) null);
                    checkboxView.mo35145g(C27950a.m86284a(next.getTermsTextKey()), C27950a.m86284a(next.getClickableTextKey()));
                    checkboxView.setTextClickListener(new C39805h(this, next));
                    checkboxView.setOnCheckedStateChangeListener(new C39806i(this));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, getResources().getDimensionPixelSize(C10319h.f28653w0), 0, 0);
                    checkboxView.setLayoutParams(layoutParams);
                    this.f84276J.f68593J.addView(checkboxView);
                }
            }
        }
        C27286e2 e2Var = this.f84276J;
        LinearLayout linearLayout = e2Var.f68595L.f70293q;
        if (e2Var.f68593J.getChildCount() > 0) {
            i = 8;
        } else {
            i = this.f84276J.f68595L.f70293q.getVisibility();
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y3 */
    public void mo85243y3() {
        int i;
        int i2;
        this.f84276J.f68604U.addView(this.f84281O);
        this.f84276J.f68642y.addView(this.f84283Q);
        if (this.f84269B0) {
            this.f84276J.f68621h.addView(this.f84298f0);
        }
        if (!this.f84152J0) {
            this.f84276J.f68609Z.addView(this.f84286T);
            this.f84276J.f68610a0.addView(this.f84287U);
        }
        if (!this.f84151I0) {
            this.f84276J.f68620g0.addView(this.f84291Y);
            if (!mo85263c5() && !this.f84168Z0) {
                this.f84276J.f68643z.addView(this.f84284R);
            }
        }
        int i3 = 0;
        if ((this.f84151I0 || mo85263c5() || this.f84168Z0) && !TextUtils.isEmpty(this.f84276J.f68626j0.getText())) {
            this.f84276J.f68628k0.setVisibility(0);
        }
        if (this.f84150H0 != null) {
            this.f84276J.f68598O.setVisibility(0);
        } else {
            this.f84276J.f68598O.setVisibility(8);
        }
        this.f84276J.f68596M.addView(this.f84289W);
        if (m102444d5()) {
            this.f84276J.f68637t.addView(this.f84299g0);
            this.f84276J.f68636s.addView(this.f84300h0);
            this.f84276J.f68635r.addView(this.f84301i0);
        }
        BogTextView bogTextView = this.f84276J.f68585B;
        if (this.f84152J0) {
            i = 0;
        } else {
            i = 8;
        }
        bogTextView.setVisibility(i);
        BogTextView bogTextView2 = this.f84276J.f68619g;
        if (this.f84152J0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        bogTextView2.setVisibility(i2);
        if (this.f84152J0) {
            this.f84276J.f68633p.addView(this.f84303k0);
            this.f84276J.f68632o.addView(this.f84304l0);
            this.f84276J.f68634q.addView(this.f84306n0);
            this.f84276J.f68631n.addView(this.f84305m0);
            ForeignBank foreignBank = this.f84160R0;
            if (foreignBank != null && foreignBank.getCountryCode() == TransferCountryCode.COUNTRY_CODE_UNITED_ARAB_EMIRATES) {
                this.f84276J.f68638u.addView(this.f84302j0);
            }
            BogTextView bogTextView3 = this.f84276J.f68585B;
            if (this.f84162T0 == null) {
                i3 = 8;
            }
            bogTextView3.setVisibility(i3);
        }
    }
}
