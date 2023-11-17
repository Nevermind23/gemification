package p341ge.bog.mobilebank.p975ui.wizard.activities;

import a91.C30896j;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebViewClient;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import ba1.C10146d0;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import e41.C31658b;
import g91.C32290b1;
import g91.C32297d;
import g91.C32303f;
import g91.C32307h;
import g91.C32343x;
import g91.C32355x0;
import g91.C32359z0;
import hc1.C41185v;
import hd0.C24978b;
import hd1.C41205b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import jg1.C41438c;
import jg1.C41452l;
import l81.C37104a;
import org.parceler.C42035e;
import p060e1.C5958l0;
import p341ge.bog.mobilebank.cleanarch.presentation.common.DialogManager;
import p341ge.bog.mobilebank.eventbus.events.PaymentCardsEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.ExternalPaymentDetails;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.PaymentDataObject;
import p341ge.bog.mobilebank.model.PaymentExecuteEssObject;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.model.payment.PaymentCommissionEntity;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentResult;
import p341ge.bog.mobilebank.model.payment.PaymentsCommissionsRequestParams;
import p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity;
import p341ge.bog.mobilebank.p975ui.activities.PaymentResultListActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.otpparameter.ExecutePaymentParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.PaymentsBatchExecuteParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10313b;
import p366bk.C10328q;
import p380ck.C10468i;
import p420fh.C12902d;
import p420fh.C12910e;
import p745er.C20288a;
import p90.C27326i2;
import pc0.C27494a;
import r90.C27950a;
import z81.C40207j;
import z81.C40208k;
import z81.C40209l;
import z81.C40210m;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity */
public class PaymentOptionWizardActivity extends C35876i implements C37104a, C41185v.C41186a {
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public static boolean f86703g0 = false;

    /* renamed from: h0 */
    private static String f86704h0 = "OP_REQUEST_ID";

    /* renamed from: G */
    C31658b f86705G;

    /* renamed from: H */
    protected BankApi f86706H;

    /* renamed from: I */
    protected Client f86707I;

    /* renamed from: J */
    protected C41438c f86708J;

    /* renamed from: K */
    protected PreferencesApiManager f86709K;

    /* renamed from: L */
    protected C27494a f86710L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C27326i2 f86711M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public PaymentCardsEvent f86712N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C30896j f86713O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public ArrayList f86714P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f86715Q = true;

    /* renamed from: R */
    private String f86716R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Gson f86717S = new Gson();
    /* access modifiers changed from: private */

    /* renamed from: T */
    public long f86718T = -1;

    /* renamed from: U */
    private ArrayMap f86719U = new ArrayMap();

    /* renamed from: V */
    private ArrayMap f86720V = new ArrayMap();
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f86721W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f86722X = false;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public double f86723Y = Utils.DOUBLE_EPSILON;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public DialogManager f86724Z = new DialogManager();

    /* renamed from: a0 */
    private String f86725a0 = UUID.randomUUID().toString();

    /* renamed from: b0 */
    Runnable f86726b0 = new C35853g();

    /* renamed from: c0 */
    boolean f86727c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public Handler f86728d0 = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public ExternalPaymentDetails f86729e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public Runnable f86730f0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$a */
    class C35846a extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f86731a;

        C35846a(String str) {
            this.f86731a = str;
        }

        public void onEnqueue(C41205b bVar) {
            PaymentOptionWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            PaymentOptionWizardActivity.this.m106575K3();
            PaymentOptionWizardActivity.this.f86715Q = true;
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                KeyValue[] parameter = ((PaymentDebtResponse) bankApiResponse.getResult()).getParameter();
                int length = parameter.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    KeyValue keyValue = parameter[i];
                    if (keyValue.getKey().equals("paymentData")) {
                        PaymentOptionWizardActivity paymentOptionWizardActivity = PaymentOptionWizardActivity.this;
                        paymentOptionWizardActivity.f86729e0 = (ExternalPaymentDetails) paymentOptionWizardActivity.f86717S.mo18170l(keyValue.getValue(), ExternalPaymentDetails.class);
                        PaymentOptionWizardActivity.this.m106621p3(this.f86731a);
                        break;
                    }
                    i++;
                }
            } else {
                PaymentOptionWizardActivity.this.m106575K3();
                C32297d.m95154b(PaymentOptionWizardActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            }
            PaymentOptionWizardActivity.this.f86715Q = true;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$b */
    class C35847b extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ ArrayList f86733a;

        C35847b(ArrayList arrayList) {
            this.f86733a = arrayList;
        }

        public void onEnqueue(C41205b bVar) {
            PaymentOptionWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            String str;
            super.onFailure(th);
            PaymentOptionWizardActivity.this.m106575K3();
            if (PaymentOptionWizardActivity.this.m106569H3() != null) {
                PaymentOptionWizardActivity.this.f86724Z.mo53585c(PaymentOptionWizardActivity.this.m106569H3());
            }
            boolean z = true;
            PaymentOptionWizardActivity.this.f86715Q = true;
            if (this.f86733a.size() < 2) {
                str = "payment_failure";
            } else {
                str = "group_payment_failure";
            }
            Iterator it = this.f86733a.iterator();
            while (it.hasNext()) {
                C36546y.m108282F().mo27136G("payment", str, (String) it.next(), (Bundle) null);
            }
            if (th instanceof SocketTimeoutException) {
                Intent intent = new Intent(PaymentOptionWizardActivity.this, PaymentResultActivity.class);
                intent.putExtra("PAYMENT_TIMED_OUT", true);
                if (this.f86733a.size() >= 2) {
                    z = false;
                }
                intent.putExtra("PAYMENT_SINGLE", z);
                PaymentOptionWizardActivity.this.startActivity(intent);
                PaymentOptionWizardActivity.this.setResult(-1);
                PaymentOptionWizardActivity.this.finish();
            }
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess() && bankApiResponse.getResult() != null) {
                if (PaymentOptionWizardActivity.this.m106569H3() != null) {
                    PaymentOptionWizardActivity.this.f86724Z.mo53585c(PaymentOptionWizardActivity.this.m106569H3());
                }
                PaymentOptionWizardActivity.this.m106623r3(bankApiResponse);
            } else if (BankApiResponse.CODE_STATUS_WARNING.equals(bankApiResponse.getCodeStatus())) {
                if (PaymentOptionWizardActivity.this.m106569H3() != null) {
                    PaymentOptionWizardActivity.this.f86724Z.mo53585c(PaymentOptionWizardActivity.this.m106569H3());
                }
                PaymentOptionWizardActivity.this.m106623r3(bankApiResponse);
            } else {
                String str = this.f86733a.size() < 2 ? "payment_failure" : "group_payment_failure";
                Iterator it = this.f86733a.iterator();
                while (it.hasNext()) {
                    C36546y.m108282F().mo27136G("payment", str, (String) it.next(), (Bundle) null);
                }
                PaymentOptionWizardActivity.this.m106575K3();
                if (!bankApiResponse.isScaError()) {
                    if (PaymentOptionWizardActivity.this.m106569H3() != null) {
                        PaymentOptionWizardActivity.this.f86724Z.mo53585c(PaymentOptionWizardActivity.this.m106569H3());
                    }
                    C32297d.m95154b(PaymentOptionWizardActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
                } else if (PaymentOptionWizardActivity.this.m106569H3() != null) {
                    PaymentOptionWizardActivity.this.m106569H3().mo95634K2(C27950a.m86284a(bankApiResponse.getKey()));
                }
            }
            PaymentOptionWizardActivity.this.f86715Q = true;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$c */
    class C35848c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ boolean f86735d;

        /* renamed from: e */
        final /* synthetic */ int f86736e;

        /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$c$a */
        class C35849a implements Runnable {
            C35849a() {
            }

            public void run() {
                PaymentOptionWizardActivity.this.f86711M.f68960r.setVisibility(8);
            }
        }

        C35848c(boolean z, int i) {
            this.f86735d = z;
            this.f86736e = i;
        }

        public void run() {
            if (this.f86735d) {
                PaymentOptionWizardActivity.this.f86711M.f68960r.animate().y(Utils.FLOAT_EPSILON);
            } else {
                PaymentOptionWizardActivity.this.f86711M.f68960r.animate().y((float) this.f86736e).withEndAction(new C35849a());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$d */
    class C35850d extends RestCallback {
        C35850d() {
        }

        public void onEnqueue(C41205b bVar) {
            PaymentOptionWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            PaymentOptionWizardActivity.this.m106575K3();
            PaymentOptionWizardActivity.this.f86711M.f68962t.setVisibility(0);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            PaymentOptionWizardActivity.this.f86711M.f68958p.setLoading(false);
            if (PaymentOptionWizardActivity.this.f86712N == null || PaymentOptionWizardActivity.this.f86712N.getPaymentCards() == null || PaymentOptionWizardActivity.this.f86712N.getPaymentCards().size() == 0) {
                PaymentOptionWizardActivity.this.f86711M.f68958p.setEnabled(false);
            }
            if (bankApiResponse.isSuccess()) {
                PaymentOptionWizardActivity.this.m106575K3();
                PaymentOptionWizardActivity.this.f86718T = bankApiResponse.getResult() == null ? -1 : ((Long) bankApiResponse.getResult()).longValue();
                PaymentOptionWizardActivity.this.m106565F3();
                return;
            }
            PaymentOptionWizardActivity.this.m106575K3();
            PaymentOptionWizardActivity.this.f86711M.f68962t.setVisibility(0);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$e */
    class C35851e implements Runnable {
        C35851e() {
        }

        public void run() {
            PaymentOptionWizardActivity.this.f86711M.f68951i.setText(PaymentOptionWizardActivity.this.getString(C10328q.payment_option_wizard_choose_card));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$f */
    class C35852f implements Runnable {
        C35852f() {
        }

        public void run() {
            PaymentOptionWizardActivity.this.f86711M.f68951i.setText(PaymentOptionWizardActivity.this.getString(C10328q.payment_option_wizard_choose_payment_method));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$g */
    class C35853g implements Runnable {
        C35853g() {
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            Iterator it = PaymentOptionWizardActivity.this.f86714P.iterator();
            String str = "";
            while (it.hasNext()) {
                sb.append(str);
                sb.append(((PaymentDataObject) it.next()).getServiceId());
                str = ",";
            }
            PaymentOptionWizardActivity.this.f86707I.requestPaymentCards(sb.toString(), true);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$h */
    class C35854h extends RestCallback {
        C35854h() {
        }

        public void onEnqueue(C41205b bVar) {
            PaymentOptionWizardActivity.this.mo86438k1(bVar);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                PaymentOptionWizardActivity.this.m106594U3();
                PaymentOptionWizardActivity.this.f86726b0.run();
                return;
            }
            C32297d.m95154b(PaymentOptionWizardActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$i */
    class C35855i implements Comparator {
        C35855i() {
        }

        /* renamed from: a */
        public int compare(PaymentsCard paymentsCard, PaymentsCard paymentsCard2) {
            boolean isLocalCard = paymentsCard.isLocalCard();
            if (isLocalCard == paymentsCard2.isLocalCard()) {
                return 0;
            }
            if (isLocalCard) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$j */
    class C35856j extends RestCallback {
        C35856j() {
        }

        public void onEnqueue(C41205b bVar) {
            PaymentOptionWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            PaymentOptionWizardActivity.this.f86711M.f68958p.setLoading(false);
            PaymentOptionWizardActivity.this.f86711M.f68958p.setEnabled(true);
            PaymentOptionWizardActivity.this.m106588R3(th.getLocalizedMessage());
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            PaymentOptionWizardActivity.this.f86711M.f68958p.setLoading(false);
            PaymentOptionWizardActivity.this.f86711M.f68958p.setEnabled(true);
            if (bankApiResponse.isSuccess()) {
                PaymentOptionWizardActivity.this.f86722X = true;
                PaymentOptionWizardActivity.this.f86723Y = (double) ((PaymentCommissionEntity) bankApiResponse.getResult()).getCommission();
                if (((PaymentCommissionEntity) bankApiResponse.getResult()).getInfoDictionaryKey() != null) {
                    PaymentOptionWizardActivity.this.f86711M.f68963u.setVisibility(0);
                    String a = C27950a.m86284a(((PaymentCommissionEntity) bankApiResponse.getResult()).getInfoDictionaryKey());
                    if (a.contains("{0}")) {
                        PaymentOptionWizardActivity.this.f86711M.f68963u.setText(a.replace("{0}", (((double) (((PaymentCommissionEntity) bankApiResponse.getResult()).getOldCommission() - ((PaymentCommissionEntity) bankApiResponse.getResult()).getCommission())) / 100.0d) + ""));
                    } else {
                        PaymentOptionWizardActivity.this.f86711M.f68963u.setText(a);
                    }
                }
                PaymentOptionWizardActivity.this.m106606a4();
                return;
            }
            PaymentOptionWizardActivity.this.m106588R3(bankApiResponse.getErrorValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$k */
    class C35857k extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ ArrayList f86746a;

        C35857k(ArrayList arrayList) {
            this.f86746a = arrayList;
        }

        public void onEnqueue(C41205b bVar) {
            PaymentOptionWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            String str;
            super.onFailure(th);
            if (this.f86746a.size() < 2) {
                str = "payment_failure";
            } else {
                str = "group_payment_failure";
            }
            Iterator it = this.f86746a.iterator();
            while (it.hasNext()) {
                C36546y.m108282F().mo27136G("payment", str, (String) it.next(), (Bundle) null);
            }
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            PaymentOptionWizardActivity.this.m106575K3();
            if (bankApiResponse.isSuccess()) {
                for (KeyValue keyValue : ((PaymentDebtResponse) bankApiResponse.getResult()).getParameter()) {
                    if (keyValue.getKey().equals("extTransactionId")) {
                        PaymentOptionWizardActivity.this.f86721W = keyValue.getValue();
                        PaymentOptionWizardActivity.this.m106622q3(keyValue.getValue());
                        return;
                    }
                }
                return;
            }
            String str = this.f86746a.size() < 2 ? "payment_failure" : "group_payment_failure";
            Iterator it = this.f86746a.iterator();
            while (it.hasNext()) {
                C36546y.m108282F().mo27136G("payment", str, (String) it.next(), (Bundle) null);
            }
            C32297d.m95154b(PaymentOptionWizardActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$l */
    class C35858l extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f86748a;

        C35858l(String str) {
            this.f86748a = str;
        }

        public void onEnqueue(C41205b bVar) {
            PaymentOptionWizardActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            PaymentOptionWizardActivity.this.m106575K3();
            super.onFailure(th);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
            if (r14.equals("responseCode") == false) goto L_0x0041;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(p341ge.bog.mobilebank.shared2.network.BankApiResponse r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r0 = "UTF-8"
                super.onResponse(r18)
                boolean r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.f86703g0
                if (r2 == 0) goto L_0x0161
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                r2.m106575K3()
                boolean r2 = r18.isSuccess()
                if (r2 == 0) goto L_0x0161
                java.lang.Object r2 = r18.getResult()
                ge.bog.mobilebank.model.payment.PaymentDebtResponse r2 = (p341ge.bog.mobilebank.model.payment.PaymentDebtResponse) r2
                ge.bog.mobilebank.model.KeyValue[] r2 = r2.getParameter()
                int r3 = r2.length
                r4 = 0
                java.lang.String r5 = ""
                r10 = r4
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
            L_0x002b:
                r11 = 2
                r12 = 1
                if (r10 >= r3) goto L_0x0097
                r13 = r2[r10]
                java.lang.String r14 = r13.getKey()
                r14.hashCode()
                int r15 = r14.hashCode()
                r16 = -1
                switch(r15) {
                    case 47234394: goto L_0x006e;
                    case 247507199: goto L_0x0063;
                    case 1438723534: goto L_0x005a;
                    case 1463743775: goto L_0x004f;
                    case 1559236754: goto L_0x0044;
                    default: goto L_0x0041;
                }
            L_0x0041:
                r11 = r16
                goto L_0x0078
            L_0x0044:
                java.lang.String r11 = "transactionIdFor3ds"
                boolean r11 = r14.equals(r11)
                if (r11 != 0) goto L_0x004d
                goto L_0x0041
            L_0x004d:
                r11 = 4
                goto L_0x0078
            L_0x004f:
                java.lang.String r11 = "auth3dsRequestData"
                boolean r11 = r14.equals(r11)
                if (r11 != 0) goto L_0x0058
                goto L_0x0041
            L_0x0058:
                r11 = 3
                goto L_0x0078
            L_0x005a:
                java.lang.String r12 = "responseCode"
                boolean r12 = r14.equals(r12)
                if (r12 != 0) goto L_0x0078
                goto L_0x0041
            L_0x0063:
                java.lang.String r11 = "statusCode"
                boolean r11 = r14.equals(r11)
                if (r11 != 0) goto L_0x006c
                goto L_0x0041
            L_0x006c:
                r11 = r12
                goto L_0x0078
            L_0x006e:
                java.lang.String r11 = "auth3dsRequestUrl"
                boolean r11 = r14.equals(r11)
                if (r11 != 0) goto L_0x0077
                goto L_0x0041
            L_0x0077:
                r11 = r4
            L_0x0078:
                switch(r11) {
                    case 0: goto L_0x0090;
                    case 1: goto L_0x008b;
                    case 2: goto L_0x0086;
                    case 3: goto L_0x0081;
                    case 4: goto L_0x007c;
                    default: goto L_0x007b;
                }
            L_0x007b:
                goto L_0x0094
            L_0x007c:
                java.lang.String r5 = r13.getValue()
                goto L_0x0094
            L_0x0081:
                java.lang.String r7 = r13.getValue()
                goto L_0x0094
            L_0x0086:
                java.lang.String r9 = r13.getValue()
                goto L_0x0094
            L_0x008b:
                java.lang.String r8 = r13.getValue()
                goto L_0x0094
            L_0x0090:
                java.lang.String r6 = r13.getValue()
            L_0x0094:
                int r10 = r10 + 1
                goto L_0x002b
            L_0x0097:
                boolean r2 = android.text.TextUtils.isEmpty(r5)
                if (r2 != 0) goto L_0x00be
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                a91.j r2 = r2.f86713O
                ge.bog.mobilebank.model.cards.PaymentsCard r2 = r2.mo71103n()
                if (r2 == 0) goto L_0x00be
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                a91.j r2 = r2.f86713O
                ge.bog.mobilebank.model.cards.PaymentsCard r2 = r2.mo71103n()
                boolean r2 = r2.shouldSave()
                if (r2 == 0) goto L_0x00be
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                r2.mo87936Q3(r5)
            L_0x00be:
                java.lang.String r2 = "F"
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x00f3
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                boolean unused = r0.m106598W3(r4)
                java.lang.String r0 = "000"
                boolean r0 = r0.equals(r9)
                if (r0 == 0) goto L_0x00e2
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                ge.bog.mobilebank.model.ExternalPaymentDetails r2 = r0.f86729e0
                java.util.ArrayList r2 = r2.getPaymentDetails()
                r0.m106624s3(r2)
                goto L_0x0161
            L_0x00e2:
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                int r2 = p366bk.C10328q.payment_option_wizard_error_cutting_money
                java.lang.String r2 = r0.getString(r2)
                g91.C32297d.m95154b(r0, r2)
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                r0.m106575K3()
                goto L_0x0161
            L_0x00f3:
                boolean r2 = android.text.TextUtils.isEmpty(r6)
                if (r2 != 0) goto L_0x0137
                boolean r2 = android.text.TextUtils.isEmpty(r7)
                if (r2 != 0) goto L_0x0137
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                boolean r2 = r2.m106598W3(r12)
                if (r2 == 0) goto L_0x0137
                java.lang.String r2 = "PaReq=%s&TermUrl=https://3dacq.georgiancard.ge:443/payment/pares.wsm?ws.id=%s&ws.pc=3"
                java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ UnsupportedEncodingException -> 0x011e }
                java.lang.String r5 = java.net.URLEncoder.encode(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x011e }
                r3[r4] = r5     // Catch:{ UnsupportedEncodingException -> 0x011e }
                java.lang.String r5 = r1.f86748a     // Catch:{ UnsupportedEncodingException -> 0x011e }
                java.lang.String r0 = java.net.URLEncoder.encode(r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x011e }
                r3[r12] = r0     // Catch:{ UnsupportedEncodingException -> 0x011e }
                java.lang.String r0 = java.lang.String.format(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x011e }
                goto L_0x0123
            L_0x011e:
                r0 = move-exception
                r0.printStackTrace()
                r0 = 0
            L_0x0123:
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                p90.i2 r2 = r2.f86711M
                android.webkit.WebView r2 = r2.f68960r
                if (r0 == 0) goto L_0x0132
                byte[] r0 = r0.getBytes()
                goto L_0x0134
            L_0x0132:
                byte[] r0 = new byte[r4]
            L_0x0134:
                r2.postUrl(r6, r0)
            L_0x0137:
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                java.lang.Runnable r0 = r0.f86730f0
                if (r0 != 0) goto L_0x014b
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$m r2 = new ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$m
                java.lang.String r3 = r1.f86748a
                r2.<init>(r3)
                r0.f86730f0 = r2
            L_0x014b:
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                r0.m106594U3()
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r0 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                android.os.Handler r0 = r0.f86728d0
                ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.this
                java.lang.Runnable r2 = r2.f86730f0
                r3 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r2, r3)
            L_0x0161:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity.C35858l.onResponse(ge.bog.mobilebank.shared2.network.BankApiResponse):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.PaymentOptionWizardActivity$m */
    private class C35859m implements Runnable {

        /* renamed from: d */
        private String f86750d;

        C35859m(String str) {
            this.f86750d = str;
        }

        public void run() {
            PaymentOptionWizardActivity.this.m106621p3(this.f86750d);
        }
    }

    /* renamed from: A3 */
    private String m106555A3(String str, String str2) {
        C30896j jVar = this.f86713O;
        if (!(jVar == null || jVar.mo71103n() == null)) {
            if (this.f86713O.mo71103n().isLocalCard()) {
                ArrayMap arrayMap = this.f86719U;
                BigDecimal bigDecimal = (BigDecimal) arrayMap.get(str + str2);
                if (bigDecimal != null) {
                    return bigDecimal.toString();
                }
                return BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
            }
            ArrayMap arrayMap2 = this.f86720V;
            BigDecimal bigDecimal2 = (BigDecimal) arrayMap2.get(str + str2);
            if (bigDecimal2 != null) {
                return bigDecimal2.toString();
            }
        }
        return BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
    }

    /* renamed from: B3 */
    private ArrayList m106557B3() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f86714P.iterator();
        while (it.hasNext()) {
            PaymentDataObject paymentDataObject = (PaymentDataObject) it.next();
            PaymentDataObject copy = paymentDataObject.copy();
            copy.setAmount(m106626u3(copy.getParameters()));
            copy.setCommission(m106555A3(paymentDataObject.getServiceId(), paymentDataObject.getAmount()));
            copy.setCommissionForKeyValues(copy.getCommission());
            if (!copy.getServiceId().contains("mep-")) {
                copy.setServiceId("mep-" + copy.getServiceId());
            }
            Iterator<KeyValue> it2 = copy.getParameters().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                KeyValue next = it2.next();
                if (next.getKey().equals("amount")) {
                    next.setValue(copy.getAmount());
                    break;
                }
            }
            copy.getParameters().add(new KeyValue("extCustomerReference", this.f86709K.getExtCustomer()));
            arrayList.add(copy);
        }
        return arrayList;
    }

    /* renamed from: C3 */
    private int m106559C3() {
        Iterator it = this.f86714P.iterator();
        double d = Utils.DOUBLE_EPSILON;
        while (it.hasNext()) {
            d += Double.parseDouble(((PaymentDataObject) it.next()).getCommissionFromKeyValues());
        }
        return (int) d;
    }

    /* renamed from: D3 */
    private PaymentsBatchExecuteParams m106561D3(Long l, String str, String str2, String str3) {
        return new PaymentsBatchExecuteParams(l, new Gson().mo18181w(m106627v3()), C10146d0.C10177h.m37232a(), "PAYMENTS_BATCH_EXECUTE_NEW", str, str2, str3);
    }

    /* renamed from: E3 */
    private ArrayList m106563E3(PaymentDataObject paymentDataObject) {
        ArrayList arrayList = new ArrayList();
        Iterator<KeyValue> it = paymentDataObject.getParameters().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().copy());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public void m106565F3() {
        this.f86711M.f68958p.setLoading(true);
        this.f86711M.f68958p.setEnabled(false);
        this.f86711M.f68963u.setVisibility(8);
        BankApi bankApi = this.f86706H;
        bankApi.getPaymentsCommissions("" + this.f86718T, m106629x3(), new C35856j());
    }

    /* renamed from: G3 */
    private String m106567G3() {
        return String.valueOf(this.f86718T);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public C41185v m106569H3() {
        return C20288a.m66329d(getSupportFragmentManager());
    }

    /* renamed from: I3 */
    private int m106571I3(boolean z) {
        int i;
        if (this.f86713O.mo71103n() == null) {
            i = m106559C3();
        } else if (!this.f86713O.mo71103n().isExternalCard()) {
            i = m106559C3();
        } else {
            i = m106631z3(z);
        }
        return (int) ((double) i);
    }

    /* renamed from: J3 */
    private ArrayList m106573J3(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PaymentDataObject) it.next()).getInternalExecutor());
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public void m106575K3() {
        this.f86711M.f68959q.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void m106577L3(View view) {
        m106625t3();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void m106579M3(View view) {
        C32303f.m95188H(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public /* synthetic */ void m106581N3(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void m106583O3(View view) {
        if (this.f86715Q) {
            if (!this.f86722X) {
                m106565F3();
            } else if (this.f86713O.mo71103n() != null) {
                this.f86725a0 = UUID.randomUUID().toString();
                this.f86715Q = false;
                if (!this.f86713O.mo71103n().isExternalCard()) {
                    m106596V3("PAYMENTS_BATCH_EXECUTE_NEW", this.f86710L.mo66809a(m106561D3(Long.valueOf(this.f86718T), (String) null, (String) null, (String) null)));
                } else {
                    m106620o3(this.f86713O.mo71103n().isLocalCard(), this.f86713O.mo71103n().isNewCard());
                }
            }
        }
    }

    /* renamed from: P3 */
    private void m106585P3(String str, String str2, String str3) {
        String str4;
        Long l;
        ArrayList v3 = m106627v3();
        ArrayList arrayList = new ArrayList();
        if (v3 != null) {
            Iterator it = v3.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaymentExecuteEssObject) it.next()).getEssServiceId());
            }
        }
        if (arrayList.size() < 2) {
            str4 = "payment";
        } else {
            str4 = "group_payment";
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            l = null;
            if (!it2.hasNext()) {
                break;
            }
            C36546y.m108282F().mo27136G("payment", str4, (String) it2.next(), (Bundle) null);
        }
        if (m106569H3() != null) {
            m106569H3().mo95635L2(true);
        } else {
            m106594U3();
        }
        C27494a aVar = this.f86710L;
        long j = this.f86718T;
        if (j != -1) {
            l = Long.valueOf(j);
        }
        this.f86706H.paymentsBatchExecute(new Gson().mo18181w(v3), m106567G3(), aVar.mo66809a(m106561D3(l, str, str2, str3)), new C35847b(arrayList));
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public void m106588R3(String str) {
        this.f86722X = false;
        this.f86711M.f68958p.setButtonText(getString(C10328q.common_button_refresh));
        if (str == null) {
            str = "";
        }
        C12910e.m48789g(this, str, (C12902d.C12905b) null, true);
    }

    /* renamed from: S3 */
    private void m106590S3() {
        this.f86711M.f68961s.mo3946b().setOnClickListener(new C40207j(this));
        this.f86711M.f68954l.setOnClickListener(new C40208k(this));
        this.f86711M.f68953k.f69002e.setOnClickListener(new C40209l(this));
        this.f86711M.f68958p.setOnClickListener(new C40210m(this));
    }

    /* renamed from: T3 */
    private void m106592T3() {
        this.f86711M.f68960r.getSettings().setJavaScriptEnabled(true);
        this.f86711M.f68960r.getSettings().setDomStorageEnabled(true);
        this.f86711M.f68960r.getSettings().setLoadWithOverviewMode(false);
        this.f86711M.f68960r.getSettings().setUseWideViewPort(false);
        this.f86711M.f68960r.getSettings().setBuiltInZoomControls(true);
        this.f86711M.f68960r.setWebViewClient(new WebViewClient());
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public void m106594U3() {
        this.f86711M.f68959q.setVisibility(0);
    }

    /* renamed from: V3 */
    private void m106596V3(String str, HashMap hashMap) {
        if (m106569H3() != null) {
            this.f86724Z.mo53585c(m106569H3());
        }
        C41185v.m119403r2(str, hashMap).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public boolean m106598W3(boolean z) {
        int j = C32355x0.m95519j(this);
        if (!z) {
            if (this.f86711M.f68960r.getVisibility() == 8) {
                return false;
            }
        } else if (this.f86711M.f68960r.getVisibility() == 0) {
            return false;
        } else {
            this.f86711M.f68960r.setY((float) j);
            this.f86711M.f68960r.setVisibility(0);
        }
        C32290b1.m95112b(this.f86711M.f68960r);
        this.f86711M.f68960r.post(new C35848c(z, j));
        return true;
    }

    /* renamed from: X3 */
    private int m106600X3() {
        PaymentCardsEvent paymentCardsEvent = this.f86712N;
        if (paymentCardsEvent == null || paymentCardsEvent.getPaymentCards() == null) {
            return -1;
        }
        Collections.sort(this.f86712N.getPaymentCards(), new C35855i());
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.f86712N.getPaymentCards().size()) {
                i = 0;
                break;
            } else if (this.f86712N.getPaymentCards().get(i).isExternalCard()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: Y3 */
    public static void m106602Y3(Activity activity, Intent intent, int i) {
        if (!f86703g0) {
            activity.startActivityForResult(intent, i);
            f86703g0 = true;
        }
    }

    /* renamed from: Z3 */
    private void m106604Z3() {
        m106594U3();
        this.f86726b0.run();
        if (this.f86707I.isAuthorized()) {
            this.f86711M.f68951i.post(new C35851e());
            this.f86711M.f68954l.setVisibility(8);
            return;
        }
        this.f86711M.f68951i.post(new C35852f());
        this.f86711M.f68949g.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public void m106606a4() {
        double d;
        double d2 = this.f86723Y;
        String str = C32303f.m95204o((Double.parseDouble(this.f86716R) + d2) / 100.0d) + " ₾";
        if (this.f86722X) {
            this.f86711M.f68958p.setButtonText(getResources().getText(C10328q.f28937S0) + " (" + str + ")");
        } else {
            this.f86711M.f68958p.setButtonText(getString(C10328q.common_button_refresh));
        }
        this.f86711M.f68948f.setText(str);
        this.f86711M.f68950h.setText(C32303f.m95204o(d2 / 100.0d) + " ₾");
        if (m106631z3(true) <= m106559C3() || this.f86713O.mo71103n() == null || this.f86713O.mo71103n().isLocalCard()) {
            d = 0.0d;
        } else {
            d = (double) (m106631z3(true) - m106559C3());
        }
        C5958l0.m23910a(this.f86711M.f68954l);
        if (d == Utils.DOUBLE_EPSILON) {
            this.f86711M.f68947e.setVisibility(8);
        } else {
            this.f86711M.f68947e.setVisibility(0);
        }
        this.f86711M.f68947e.setText(getString(C10328q.payment_option_wizard_save_money) + " " + C32303f.m95204o(d / 100.0d) + " ₾");
    }

    /* renamed from: o3 */
    private void m106620o3(boolean z, boolean z2) {
        String str;
        String str2;
        m106594U3();
        if (z) {
            str = "mep-bog-payment3desint-authorize";
        } else {
            str = "mep-bog-payment3desext-authorize";
        }
        ArrayList arrayList = new ArrayList();
        if (this.f86713O.mo71103n() != null) {
            if (z2) {
                arrayList.add(new KeyValue("pan", this.f86713O.mo71103n().getPan()));
                arrayList.add(new KeyValue("cvv2", this.f86713O.mo71103n().getCvv()));
                arrayList.add(new KeyValue("expDate", this.f86713O.mo71103n().getTempExpDate()));
            } else {
                arrayList.add(new KeyValue("cardReference", this.f86713O.mo71103n().getCardData()));
            }
        }
        KeyValue keyValue = new KeyValue();
        keyValue.setKey("amount");
        keyValue.setValue(((int) (Double.parseDouble(this.f86716R) + ((double) m106571I3(false)))) + "");
        arrayList.add(keyValue);
        arrayList.add(new KeyValue("commission", BankApiResponse.SUCCESSFUL_RESPONSE_CODE));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = m106557B3().iterator();
        while (it.hasNext()) {
            arrayList2.add(((PaymentDataObject) it.next()).getServiceId());
        }
        if (arrayList2.size() < 2) {
            str2 = "payment";
        } else {
            str2 = "group_payment";
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C36546y.m108282F().mo27136G("payment", str2, (String) it2.next(), (Bundle) null);
        }
        this.f86706H.paymentsExecute(m106567G3(), str, this.f86717S.mo18181w(arrayList), (RestCallback<BankApiResponse<PaymentDebtResponse>>) new C35857k(arrayList2));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public void m106621p3(String str) {
        m106594U3();
        KeyValue keyValue = new KeyValue("externalTransactionId", str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(keyValue);
        this.f86706H.paymentsExecute(m106567G3(), "mep-bog-payment3des-status", this.f86717S.mo18181w(arrayList), (RestCallback<BankApiResponse<PaymentDebtResponse>>) new C35858l(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public void m106622q3(String str) {
        ExecutePaymentParams y3 = m106630y3(str);
        m106594U3();
        this.f86706H.paymentsExecute((HashMap<String, Object>) C32343x.m95469n(y3), m106567G3(), y3.getEssParameters(), (RestCallback<BankApiResponse<PaymentDebtResponse>>) new C35846a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public void m106623r3(BankApiResponse bankApiResponse) {
        ArrayList arrayList;
        boolean z;
        PaymentResult paymentResult = (PaymentResult) bankApiResponse.getResult();
        if (paymentResult != null) {
            arrayList = m106628w3(paymentResult.getExecuteResult());
        } else {
            arrayList = null;
        }
        Intent intent = new Intent(this, PaymentResultActivity.class);
        if (arrayList != null && arrayList.size() > 1) {
            intent = new Intent(this, PaymentResultListActivity.class);
        }
        if (BankApiResponse.CODE_STATUS_WARNING.equals(bankApiResponse.getCodeStatus()) || (bankApiResponse.getResult() != null && ((PaymentResult) bankApiResponse.getResult()).getExecuteResult() != null && ((PaymentResult) bankApiResponse.getResult()).getExecuteResult().size() == 1 && BankApiResponse.CODE_STATUS_WARNING.equals(((PaymentResult) bankApiResponse.getResult()).getExecuteResult().get(0).getCodeStatus()))) {
            intent.putExtra("PAYMENT_TIMED_OUT", true);
            if (arrayList == null || arrayList.size() < 2) {
                z = true;
            } else {
                z = false;
            }
            intent.putExtra("PAYMENT_SINGLE", z);
            if (bankApiResponse.getResult() == null || ((PaymentResult) bankApiResponse.getResult()).getExecuteResult() == null || ((PaymentResult) bankApiResponse.getResult()).getExecuteResult().size() != 1 || !BankApiResponse.CODE_STATUS_WARNING.equals(((PaymentResult) bankApiResponse.getResult()).getExecuteResult().get(0).getCodeStatus())) {
                intent.putExtra("PAYMENT_WARNING_KEY", bankApiResponse.getKey());
            } else {
                intent.putExtra("PAYMENT_WARNING_KEY", ((PaymentResult) bankApiResponse.getResult()).getExecuteResult().get(0).getErrorDictionaryKey());
            }
        }
        if (getIntent().getParcelableExtra("PAYMENT_SERVICE_CONFIG_JSON") != null) {
            intent.putExtra("PAYMENT_SERVICE_CONFIG_JSON", getIntent().getParcelableExtra("PAYMENT_SERVICE_CONFIG_JSON"));
        }
        intent.putExtra("PAYMENT_EXECUTED_LAST_FOUR", this.f86713O.mo71103n().getLastFour());
        if (arrayList != null) {
            intent.putExtra("PAYMENT_EXECUTED_DATA_OBJECT", C42035e.m122121c(arrayList));
        }
        intent.putExtra("PAYMENT_PACK_INDEX", getIntent().getIntExtra("PAYMENT_PACK_INDEX", -1));
        startActivity(intent);
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public void m106624s3(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PaymentDataObject) it.next()).setProcessStatus("N");
        }
        ArrayList J3 = m106573J3(arrayList);
        if (J3 == null || J3.size() == 0) {
            C32297d.m95153a(this);
            C10468i.m38037a("Payment data object was empty from server");
            return;
        }
        Intent intent = new Intent(this, PaymentResultActivity.class);
        if (J3.size() > 1) {
            intent = new Intent(this, PaymentResultListActivity.class);
        }
        if (getIntent().getParcelableExtra("PAYMENT_SERVICE_CONFIG_JSON") != null) {
            intent.putExtra("PAYMENT_SERVICE_CONFIG_JSON", getIntent().getParcelableExtra("PAYMENT_SERVICE_CONFIG_JSON"));
            intent.putExtra("IS_LIST_WITH_SHARED_CONFIGURATION", intent.getBooleanExtra("IS_LIST_WITH_SHARED_CONFIGURATION", false));
        }
        intent.putExtra("PAYMENT_EXECUTED_DATA_OBJECT", C42035e.m122121c(J3));
        intent.putExtra("TRANSACTION_ID", this.f86721W);
        if (this.f86713O.mo71103n() != null) {
            intent.putExtra("PAYMENT_OTHER_CARD", !this.f86713O.mo71103n().isLocalCard());
            intent.putExtra("PAYMENT_EXECUTED_LAST_FOUR", this.f86713O.mo71103n().getLastFour());
        }
        intent.putExtra("PAYMENT_PACK_INDEX", getIntent().getIntExtra("PAYMENT_PACK_INDEX", -1));
        startActivity(intent);
        setResult(-1);
        finish();
    }

    /* renamed from: t3 */
    private void m106625t3() {
        m106594U3();
        this.f86711M.f68962t.setVisibility(8);
        this.f86706H.getPaymentRequestId("PAYMENTS_BATCH_EXECUTE_NEW", new C35850d());
    }

    /* renamed from: u3 */
    private String m106626u3(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KeyValue keyValue = (KeyValue) it.next();
            if (keyValue.getKey().equals("amount")) {
                return keyValue.getValue();
            }
        }
        return "";
    }

    /* renamed from: v3 */
    private ArrayList m106627v3() {
        return m106628w3((ArrayList) null);
    }

    /* renamed from: w3 */
    private ArrayList m106628w3(ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f86714P.size(); i++) {
            PaymentDataObject paymentDataObject = (PaymentDataObject) this.f86714P.get(i);
            if (arrayList != null) {
                Iterator<KeyValue> it = ((PaymentExecuteEssObject) arrayList.get(i)).getEssParameters().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    KeyValue next = it.next();
                    if (next.getKey().equals("paymentId")) {
                        str = next.getValue();
                        break;
                    }
                }
            }
            str = null;
            paymentDataObject.setCommissionForKeyValues(this.f86723Y + "");
            paymentDataObject.setCommission(this.f86723Y + "");
            PaymentExecuteEssObject internalExecutor = paymentDataObject.getInternalExecutor();
            if (arrayList != null) {
                if (!TextUtils.isEmpty(((PaymentExecuteEssObject) arrayList.get(i)).getError())) {
                    if (BankApiResponse.CODE_STATUS_WARNING.equals(((PaymentExecuteEssObject) arrayList.get(i)).getCodeStatus())) {
                        internalExecutor.setStatus(BankApiResponse.CODE_STATUS_WARNING);
                        internalExecutor.setErrorDictionaryKey(((PaymentExecuteEssObject) arrayList.get(i)).getErrorDictionaryKey());
                    } else {
                        internalExecutor.setErrorDictionaryKey(((PaymentExecuteEssObject) arrayList.get(i)).getErrorDictionaryKey());
                        internalExecutor.setError(((PaymentExecuteEssObject) arrayList.get(i)).getError());
                        internalExecutor.setStatus("R");
                    }
                }
                String paymentCommission = ((PaymentExecuteEssObject) arrayList.get(i)).getPaymentCommission();
                if (paymentCommission == null || TextUtils.isEmpty(paymentCommission)) {
                    paymentCommission = "0.0";
                }
                internalExecutor.setPaymentCommission(paymentCommission);
            }
            internalExecutor.setEssParameters(m106563E3(paymentDataObject));
            arrayList2.add(internalExecutor);
            KeyValue keyValue = new KeyValue();
            keyValue.setValue(this.f86713O.mo71103n().getPan2().toUpperCase());
            keyValue.setKey("panMD5");
            KeyValue keyValue2 = new KeyValue();
            String expDateStr = this.f86713O.mo71103n().getExpDateStr(false);
            keyValue2.setKey("expDate");
            keyValue2.setValue(expDateStr);
            KeyValue keyValue3 = new KeyValue();
            keyValue3.setKey("channel");
            keyValue3.setValue("mob");
            internalExecutor.getEssParameters().add(keyValue3);
            internalExecutor.getEssParameters().add(keyValue);
            internalExecutor.getEssParameters().add(keyValue2);
            if (str != null) {
                internalExecutor.getEssParameters().add(new KeyValue("paymentId", str));
            }
            if (internalExecutor.getTemplateId() != null) {
                internalExecutor.getEssParameters().add(new KeyValue("templateId", internalExecutor.getTemplateId()));
            }
            internalExecutor.getEssParameters().add(new KeyValue("essExtOperationId", this.f86725a0));
        }
        return arrayList2;
    }

    /* renamed from: x3 */
    private HashMap m106629x3() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f86714P.iterator();
        while (it.hasNext()) {
            PaymentDataObject paymentDataObject = (PaymentDataObject) it.next();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(paymentDataObject.getParameters());
            arrayList.add(new PaymentsCommissionsRequestParams(paymentDataObject.getServiceId(), arrayList2));
        }
        HashMap a = this.f86710L.mo66809a(new OtpParams(BankApi.PAYMENTS_CALCULATE_COMMISSION, (String) null, (String) null, (String) null));
        a.put("executeParameters", new Gson().mo18181w(arrayList));
        a.put(IRetrofitService.SERVICE_ID, BankApi.PAYMENTS_CALCULATE_COMMISSION);
        return a;
    }

    /* renamed from: y3 */
    private ExecutePaymentParams m106630y3(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValue("extTransactionId", str));
        KeyValue keyValue = new KeyValue();
        keyValue.setKey("paymentData");
        keyValue.setValue(this.f86717S.mo18181w(new ExternalPaymentDetails(m106557B3())));
        arrayList.add(keyValue);
        return new ExecutePaymentParams("mep-bog-payment3desint-create", this.f86717S.mo18181w(arrayList), BankApi.SERVICE_PAYMENTS_EXECUTE);
    }

    /* renamed from: z3 */
    private int m106631z3(boolean z) {
        double doubleValue;
        PaymentsCard n = this.f86713O.mo71103n();
        double d = Utils.DOUBLE_EPSILON;
        if (n != null) {
            Iterator it = this.f86714P.iterator();
            while (it.hasNext()) {
                PaymentDataObject paymentDataObject = (PaymentDataObject) it.next();
                if (this.f86713O.mo71103n().isLocalCard()) {
                    ArrayMap arrayMap = this.f86719U;
                    BigDecimal bigDecimal = (BigDecimal) arrayMap.get(paymentDataObject.getServiceId() + paymentDataObject.getAmountFromKeyValues());
                    if (bigDecimal != null) {
                        doubleValue = bigDecimal.doubleValue();
                    }
                } else {
                    ArrayMap arrayMap2 = this.f86720V;
                    BigDecimal bigDecimal2 = (BigDecimal) arrayMap2.get(paymentDataObject.getServiceId() + paymentDataObject.getAmountFromKeyValues());
                    if (bigDecimal2 != null) {
                        doubleValue = bigDecimal2.doubleValue();
                    }
                }
                d += doubleValue;
            }
            if (z && this.f86713O.mo71103n() != null && !this.f86713O.mo71103n().isLocalCard()) {
                d += (Double.parseDouble(this.f86716R) + d) * 0.02d;
                if (((int) d) < 1) {
                    d = 1.0d;
                }
            }
        }
        return (int) Math.ceil(d);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        m106585P3(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27326i2 d = C27326i2.m84612d(getLayoutInflater());
        this.f86711M = d;
        setContentView((View) d.mo3946b());
        overridePendingTransition(C10313b.slide_in_up, 0);
        mo86438k1(this.f86705G.mo72084b(TMXFlags.TMX_FLAG_UTILITY_PAY));
        if (bundle == null || this.f86718T == -1) {
            m106625t3();
        } else {
            this.f86718T = bundle.getLong(f86704h0, -1);
            m106565F3();
        }
        getLifecycle().mo4906a(this.f86724Z);
        this.f86711M.f68958p.setLoading(true);
        this.f86711M.f68955m.setExecutorRunnable(this.f86726b0);
        this.f86714P = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_EXECUTE_DATA_OBJECT"));
        String stringExtra = getIntent().getStringExtra("WIZARD_AMOUNT");
        this.f86716R = stringExtra;
        this.f86711M.f68948f.setText(C32359z0.m95544O(stringExtra));
        this.f86713O = new C30896j();
        this.f86711M.f68952j.setLayoutManager(new LinearLayoutManager(this));
        this.f86711M.f68952j.setAdapter(this.f86713O);
        m106592T3();
        m106606a4();
        C32343x.m95423W0(this.f86708J, this);
        m106604Z3();
        m106590S3();
    }

    /* renamed from: Q3 */
    public void mo87936Q3(String str) {
        if (this.f86713O.mo71103n() != null) {
            this.f86706H.setSavedCard(C32359z0.m95559b0(this.f86713O.mo71103n().getPan()), C32307h.m95231h(this.f86713O.mo71103n().getPan()), str, "", this.f86713O.mo71103n().getCardClass(), this.f86713O.mo71103n().getTempCleanDate(), new C35854h());
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            m106594U3();
        } else {
            m106575K3();
        }
    }

    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
        if (this.f86713O.mo71103n() != null) {
            m106606a4();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C24978b bVar;
        super.onActivityResult(i, i2, intent);
        if (i == 10005 && i2 == -1) {
            String stringExtra = intent.getStringExtra("CARD_CVV");
            String stringExtra2 = intent.getStringExtra("CARD_NUMBER");
            String stringExtra3 = intent.getStringExtra("CARD_EXP_DATE");
            String stringExtra4 = intent.getStringExtra("CARD_CLASS");
            String stringExtra5 = intent.getStringExtra("TEMP_CLEAN_DATE");
            boolean booleanExtra = intent.getBooleanExtra("CARD_SHOULD_SAVE", false);
            PaymentsCard paymentsCard = new PaymentsCard();
            paymentsCard.setCvv(stringExtra);
            paymentsCard.setTempCleanDate(stringExtra5);
            paymentsCard.setCardClass(stringExtra4);
            paymentsCard.setLastFour(C32307h.m95231h(stringExtra2));
            paymentsCard.setPan(stringExtra2);
            paymentsCard.setTempExpDate(stringExtra3);
            if (intent.getBooleanExtra("IS_LOCAL_CARD", false)) {
                bVar = C24978b.YES;
            } else {
                bVar = C24978b.NO;
            }
            paymentsCard.setIsLocalCard(bVar.mo63391e());
            paymentsCard.setPaymentCardType("EXTERNAL");
            paymentsCard.setShouldSave(booleanExtra);
            paymentsCard.setNewCard(true);
            PaymentCardsEvent copy = this.f86712N.copy();
            copy.getPaymentCards().add(paymentsCard);
            this.f86727c0 = true;
            onPaymentCardsEvent(copy);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f86708J, this);
        f86703g0 = false;
        getLifecycle().mo4909d(this.f86724Z);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, C10313b.slide_out_up);
    }

    @C41452l
    public void onPaymentCardsEvent(PaymentCardsEvent paymentCardsEvent) {
        if (paymentCardsEvent != this.f86712N) {
            this.f86712N = paymentCardsEvent;
            if (paymentCardsEvent.getState() == 20) {
                m106575K3();
                this.f86711M.f68955m.hideLayout();
                int X3 = m106600X3();
                this.f86713O.mo71107r(paymentCardsEvent.getPaymentCards());
                this.f86713O.mo71108s(X3);
                this.f86713O.mo71106q(!this.f86707I.isAuthorized());
                this.f86713O.mo71105p(this);
                if (this.f86727c0) {
                    C30896j jVar = this.f86713O;
                    jVar.mo71109t(jVar.getItemCount() - 1);
                    this.f86711M.f68952j.mo5425x1(this.f86713O.getItemCount() - 1);
                    this.f86727c0 = false;
                }
                if (!(paymentCardsEvent.getPaymentCards() == null || paymentCardsEvent.getPaymentCards().size() == 0)) {
                    this.f86711M.f68958p.setEnabled(true);
                }
                this.f86713O.notifyDataSetChanged();
                m106606a4();
            } else if (paymentCardsEvent.getState() != 10) {
                m106575K3();
                this.f86711M.f68955m.stopAnimating();
                this.f86711M.f68955m.showLayout();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong(f86704h0, this.f86718T);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
