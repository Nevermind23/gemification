package y61;

import android.content.Intent;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;
import f91.C31972b;
import g91.C32297d;
import g91.C32319m;
import java.util.ArrayList;
import java.util.Iterator;
import jg1.C41438c;
import n41.C37353c;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.eventbus.events.DDSTOListEvent;
import p341ge.bog.mobilebank.eventbus.events.InTransferDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.STOPeriodTypesEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferHistoryEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.InTransferDetail;
import p341ge.bog.mobilebank.model.PMIHistoryItem;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.ddsto.CardDebitAccount;
import p341ge.bog.mobilebank.model.ddsto.CardDebitDetails;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.DDSTODetailsWrapper;
import p341ge.bog.mobilebank.model.ddsto.STODetails;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.transfers.activities.TransferLoaderActivity;
import p341ge.bog.mobilebank.transfers.model.TransferForm;

/* renamed from: y61.b */
public class C40026b {

    /* renamed from: A */
    private boolean f95055A = false;

    /* renamed from: a */
    private C40025a f95056a;

    /* renamed from: b */
    private TransferLoaderActivity f95057b;

    /* renamed from: c */
    private boolean f95058c;

    /* renamed from: d */
    private boolean f95059d;

    /* renamed from: e */
    private TransferForm.TRANSFERTYPE f95060e;

    /* renamed from: f */
    private String f95061f;

    /* renamed from: g */
    private String f95062g;

    /* renamed from: h */
    private String f95063h;

    /* renamed from: i */
    private String f95064i;

    /* renamed from: j */
    private ArrayList f95065j;

    /* renamed from: k */
    private long f95066k = -1;

    /* renamed from: l */
    private long f95067l = -1;

    /* renamed from: m */
    private Long f95068m = -1L;

    /* renamed from: n */
    private Long f95069n = -1L;

    /* renamed from: o */
    private boolean f95070o = false;

    /* renamed from: p */
    private TemplateBasketItem f95071p;

    /* renamed from: q */
    private DDSTO f95072q;

    /* renamed from: r */
    private AccountOperation f95073r;

    /* renamed from: s */
    private TransferHistoryItem f95074s;

    /* renamed from: t */
    private PMIHistoryItem f95075t;

    /* renamed from: u */
    private AccountLovEvent f95076u;

    /* renamed from: v */
    private STOPeriodTypesEvent f95077v;

    /* renamed from: w */
    private DDSTOListEvent f95078w;

    /* renamed from: x */
    private TransferHistoryEvent f95079x;

    /* renamed from: y */
    private InTransferDetailsEvent f95080y;

    /* renamed from: z */
    private boolean f95081z = false;

    public C40026b(TransferLoaderActivity transferLoaderActivity, Client client, C41438c cVar, Intent intent, C37353c cVar2) {
        boolean z;
        String str;
        this.f95057b = transferLoaderActivity;
        if (intent.getLongExtra("TRANSFER_CONTACT_ID", -1) != -1) {
            z = true;
        } else {
            z = false;
        }
        this.f95081z = z;
        String stringExtra = intent.getStringExtra("TRANSFER_MODULE");
        this.f95062g = stringExtra;
        this.f95056a = new C40025a(this, client, cVar, "STO".equals(stringExtra));
        this.f95063h = intent.getStringExtra("OPERATION_TYPE");
        this.f95061f = intent.getStringExtra("TRANSFER_FORM");
        this.f95064i = intent.getStringExtra("TRANSFER_PRINT_FORM_TYPE");
        this.f95066k = intent.getLongExtra("TRANSFER_ITEM_KEY", -1);
        this.f95059d = intent.getBooleanExtra("TRANSFER_WITHIN_BANK", true);
        TransferForm.TRANSFERTYPE transfertype = (TransferForm.TRANSFERTYPE) intent.getSerializableExtra("TRANSFER_TYPE");
        this.f95060e = transfertype;
        if (transfertype == null) {
            this.f95060e = TransferForm.TRANSFERTYPE.ACCOUNT;
        }
        this.f95067l = intent.getLongExtra("TRANSFER_DD_KEY", -1);
        this.f95068m = Long.valueOf(intent.getLongExtra("TRANSFER_PFM_ID", -1));
        this.f95069n = Long.valueOf(intent.getLongExtra("TRANSFER_OPERATION_DATE", -1));
        this.f95070o = intent.getBooleanExtra("IS_REAL_ESTATE", false);
        if (intent.hasExtra("COLLECTED_VALUES")) {
            this.f95065j = (ArrayList) C42035e.m122119a(intent.getParcelableExtra("COLLECTED_VALUES"));
            if (client.getUserInfo() != null) {
                this.f95065j.set(9, client.getUserInfo().getClient().getName(cVar2));
            }
            if (client.getUserInfo() != null) {
                ArrayList arrayList = this.f95065j;
                if (client.getUserInfo().getClient().isResident()) {
                    str = client.getUserInfo().getClient().pin;
                } else {
                    str = "";
                }
                arrayList.set(10, str);
            }
        }
        if (intent.hasExtra("TEMPLATE_ITEM")) {
            this.f95071p = (TemplateBasketItem) C42035e.m122119a(intent.getParcelableExtra("TEMPLATE_ITEM"));
        }
        if (intent.hasExtra("STO_ITEM")) {
            this.f95072q = (DDSTO) C42035e.m122119a(intent.getParcelableExtra("STO_ITEM"));
        }
        if (intent.hasExtra("TRANSFER_HISTORY_ITEM")) {
            this.f95074s = (TransferHistoryItem) C42035e.m122119a(intent.getParcelableExtra("TRANSFER_HISTORY_ITEM"));
        }
        if (intent.hasExtra("ACCOUNT_OPERATION")) {
            this.f95073r = (AccountOperation) C42035e.m122119a(intent.getParcelableExtra("ACCOUNT_OPERATION"));
        }
        this.f95055A = client.hasProduct("CREDITCARDACCOUNT");
    }

    /* renamed from: f */
    private void m115987f() {
        this.f95056a.mo93862j();
        this.f95056a.mo93856d();
        if (TransferForm.TRANSFER_FORM_OWN.equals(this.f95061f) && this.f95055A) {
            this.f95056a.mo93858f();
        }
        long j = this.f95066k;
        if (j > 0) {
            this.f95056a.mo93861i(j, this.f95068m, this.f95064i, this.f95069n);
        } else {
            TransferHistoryItem transferHistoryItem = this.f95074s;
            if (transferHistoryItem != null && transferHistoryItem.getDocType().equals("PAYMENT_FOREIGN")) {
                this.f95056a.mo93859g(this.f95074s);
                this.f95061f = TransferForm.TRANSFER_FORM_FOREIGN;
            }
        }
        AccountOperation accountOperation = this.f95073r;
        if (accountOperation != null) {
            this.f95056a.mo93855c(accountOperation);
        }
        if ("STO".equals(this.f95062g)) {
            this.f95056a.mo93860h();
        }
        if (!"TRANSFER".equals(this.f95062g)) {
            return;
        }
        if (TransferForm.TRANSFER_FORM_OTHER.equals(this.f95061f) || TransferForm.TRANSFER_FORM_FOREIGN.equals(this.f95061f)) {
            this.f95056a.mo93857e();
        }
    }

    /* renamed from: i */
    private void m115988i(InTransferDetail inTransferDetail) {
        if (inTransferDetail.getAmount() != null && inTransferDetail.getAmount().doubleValue() > Utils.DOUBLE_EPSILON) {
            this.f95065j.set(15, String.valueOf(inTransferDetail.getAmount().doubleValue()));
        }
        this.f95065j.set(1, String.valueOf(inTransferDetail.getDstAcctKey()));
        if (!TextUtils.isEmpty(inTransferDetail.getNomination())) {
            this.f95065j.set(19, inTransferDetail.getNomination());
        }
        String str = this.f95061f;
        str.hashCode();
        if (str.equals(TransferForm.TRANSFER_FORM_CONVERSION) || str.equals(TransferForm.TRANSFER_FORM_OWN)) {
            this.f95065j.set(3, String.valueOf(inTransferDetail.getSrcAcctKey()));
            return;
        }
        this.f95065j.set(3, String.valueOf(inTransferDetail.getSenderAcctNo()));
        this.f95065j.set(5, inTransferDetail.getSenderName());
    }

    /* renamed from: j */
    private void m115989j(DDSTO ddsto) {
        STODetails sTODetails;
        DDSTODetailsWrapper dDSTODetailsWrapper;
        CardDebitDetails cardDebitDetails;
        String str = ddsto.productCode;
        str.hashCode();
        int i = 0;
        if (str.equals("STO")) {
            DDSTODetailsWrapper dDSTODetailsWrapper2 = ddsto.details;
            if (dDSTODetailsWrapper2 != null && (sTODetails = dDSTODetailsWrapper2.stoDetails) != null) {
                this.f95065j.set(0, sTODetails.documentName);
                this.f95065j.set(1, String.valueOf(ddsto.details.stoDetails.srcAcctKey));
                this.f95065j.set(5, String.valueOf(ddsto.details.stoDetails.benefName));
                this.f95065j.set(15, String.valueOf(ddsto.details.stoDetails.amount));
                this.f95065j.set(19, String.valueOf(ddsto.details.stoDetails.additionalInfo));
                this.f95065j.set(24, C32319m.m95314u(ddsto.details.stoDetails.startDate));
                long j = ddsto.details.stoDetails.endDate;
                if (j != 0) {
                    this.f95065j.set(25, C32319m.m95314u(j));
                }
                String str2 = ddsto.details.stoDetails.senderInn;
                if (str2 != null) {
                    this.f95065j.set(10, str2);
                }
                Iterator<STOPeriodType> it = this.f95077v.stoPeriodTypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().periodType.equals(ddsto.periodType)) {
                        this.f95065j.set(23, String.valueOf(i));
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (TransferForm.TRANSFER_FORM_OWN.equals(this.f95061f)) {
                this.f95065j.set(3, String.valueOf(ddsto.details.stoDetails.dstAcctKey));
                return;
            }
            ArrayList arrayList = this.f95065j;
            STODetails sTODetails2 = ddsto.details.stoDetails;
            Object obj = sTODetails2.benefAcctNo;
            if (obj == null) {
                obj = Long.valueOf(sTODetails2.dstAcctKey);
            }
            arrayList.set(3, String.valueOf(obj));
            if (!TextUtils.isEmpty(ddsto.details.stoDetails.payerName)) {
                this.f95065j.set(9, ddsto.details.stoDetails.payerName);
            }
        } else if (str.equals("BILL") && (dDSTODetailsWrapper = ddsto.details) != null && (cardDebitDetails = dDSTODetailsWrapper.cardDebitDetails) != null) {
            this.f95065j.set(0, cardDebitDetails.billPayName);
            this.f95065j.set(3, String.valueOf(ddsto.details.cardDebitDetails.creditCardAcctKey));
            Iterator<CardDebitAccount> it2 = ddsto.details.cardDebitDetails.accounts.iterator();
            String str3 = "";
            while (it2.hasNext()) {
                str3 = str3 + String.valueOf(it2.next().acctKey) + "_";
            }
            this.f95065j.set(2, str3);
            this.f95065j.set(21, ddsto.details.cardDebitDetails.phoneNumber);
            long j2 = ddsto.details.cardDebitDetails.closeDate;
            if (j2 != 0) {
                this.f95065j.set(25, C32319m.m95314u(j2));
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02dd, code lost:
        r6 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ee, code lost:
        r2 = r6;
        r7 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        r11 = r3;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m115990k(p341ge.bog.mobilebank.model.template.TemplateBasketItem r21) {
        /*
            r20 = this;
            r0 = r20
            java.util.ArrayList r1 = r0.f95065j
            java.lang.String r2 = r21.getTemplateName()
            r3 = 0
            r1.set(r3, r2)
            java.lang.String r1 = r0.f95061f
            r1.hashCode()
            java.lang.String r2 = "OWN"
            boolean r1 = r1.equals(r2)
            r2 = 19
            r4 = 15
            java.lang.String r5 = "creditAccountNumber"
            java.lang.String r7 = "debitAccountNumber"
            java.lang.String r8 = "amount"
            java.lang.String r9 = "description"
            r11 = 0
            java.lang.String r12 = ""
            r14 = 3
            if (r1 != 0) goto L_0x0203
            java.util.List r1 = r21.getTemplateParameters()
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r16 = "GEL"
            r17 = r16
        L_0x0035:
            boolean r18 = r1.hasNext()
            if (r18 == 0) goto L_0x0190
            java.lang.Object r18 = r1.next()
            ge.bog.mobilebank.model.template.TemplateBasketParameter r18 = (p341ge.bog.mobilebank.model.template.TemplateBasketParameter) r18
            java.lang.String r6 = r18.getParameterKey()
            r6.hashCode()
            int r19 = r6.hashCode()
            r10 = 10
            r3 = 9
            r15 = 5
            switch(r19) {
                case -1724546052: goto L_0x00de;
                case -1413853096: goto L_0x00d4;
                case -786908336: goto L_0x00c9;
                case -331497815: goto L_0x00be;
                case -304517248: goto L_0x00b3;
                case 334893212: goto L_0x00a8;
                case 421028761: goto L_0x009d;
                case 466877532: goto L_0x0092;
                case 481244746: goto L_0x0087;
                case 543009860: goto L_0x007b;
                case 575402001: goto L_0x006f;
                case 682696029: goto L_0x0064;
                case 738595990: goto L_0x0057;
                default: goto L_0x0054;
            }
        L_0x0054:
            r6 = -1
            goto L_0x00e7
        L_0x0057:
            java.lang.String r13 = "debitAccNo"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x0060
            goto L_0x0054
        L_0x0060:
            r6 = 12
            goto L_0x00e7
        L_0x0064:
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x006b
            goto L_0x0054
        L_0x006b:
            r6 = 11
            goto L_0x00e7
        L_0x006f:
            java.lang.String r13 = "currency"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x0078
            goto L_0x0054
        L_0x0078:
            r6 = r10
            goto L_0x00e7
        L_0x007b:
            java.lang.String r13 = "recipientName"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x0084
            goto L_0x0054
        L_0x0084:
            r6 = r3
            goto L_0x00e7
        L_0x0087:
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x008e
            goto L_0x0054
        L_0x008e:
            r6 = 8
            goto L_0x00e7
        L_0x0092:
            java.lang.String r13 = "idDebitAccount"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x009b
            goto L_0x0054
        L_0x009b:
            r6 = 7
            goto L_0x00e7
        L_0x009d:
            java.lang.String r13 = "idCreditAccount"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x00a6
            goto L_0x0054
        L_0x00a6:
            r6 = 6
            goto L_0x00e7
        L_0x00a8:
            java.lang.String r13 = "debitAccountId"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x00b1
            goto L_0x0054
        L_0x00b1:
            r6 = r15
            goto L_0x00e7
        L_0x00b3:
            java.lang.String r13 = "payerName"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x00bc
            goto L_0x0054
        L_0x00bc:
            r6 = 4
            goto L_0x00e7
        L_0x00be:
            java.lang.String r13 = "creditAccNo"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x00c7
            goto L_0x0054
        L_0x00c7:
            r6 = r14
            goto L_0x00e7
        L_0x00c9:
            java.lang.String r13 = "payerId"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x00d2
            goto L_0x0054
        L_0x00d2:
            r6 = 2
            goto L_0x00e7
        L_0x00d4:
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x00dc
            goto L_0x0054
        L_0x00dc:
            r6 = 1
            goto L_0x00e7
        L_0x00de:
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x00e6
            goto L_0x0054
        L_0x00e6:
            r6 = 0
        L_0x00e7:
            switch(r6) {
                case 0: goto L_0x0184;
                case 1: goto L_0x017a;
                case 2: goto L_0x0170;
                case 3: goto L_0x0146;
                case 4: goto L_0x013c;
                case 5: goto L_0x011c;
                case 6: goto L_0x0146;
                case 7: goto L_0x00fd;
                case 8: goto L_0x00fd;
                case 9: goto L_0x00f2;
                case 10: goto L_0x00ec;
                case 11: goto L_0x0146;
                case 12: goto L_0x00fd;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            goto L_0x018d
        L_0x00ec:
            java.lang.String r17 = r18.getParameterValue()
            goto L_0x018d
        L_0x00f2:
            java.util.ArrayList r3 = r0.f95065j
            java.lang.String r6 = r18.getParameterValue()
            r3.set(r15, r6)
            goto L_0x018d
        L_0x00fd:
            if (r11 != 0) goto L_0x018d
            java.lang.String r3 = r18.getParameterValue()
            if (r3 == 0) goto L_0x018d
            java.lang.String r3 = r18.getParameterValue()
            java.lang.String r3 = r3.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x018d
            java.lang.String r3 = r18.getParameterValue()
            java.lang.String r3 = r3.trim()
            goto L_0x013a
        L_0x011c:
            if (r11 != 0) goto L_0x018d
            java.lang.String r3 = r18.getParameterValue()
            if (r3 == 0) goto L_0x018d
            java.lang.String r3 = r18.getParameterValue()
            java.lang.String r3 = r3.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x018d
            java.lang.String r3 = r18.getParameterValue()
            java.lang.String r3 = r3.trim()
        L_0x013a:
            r11 = r3
            goto L_0x018d
        L_0x013c:
            java.util.ArrayList r6 = r0.f95065j
            java.lang.String r10 = r18.getParameterValue()
            r6.set(r3, r10)
            goto L_0x018d
        L_0x0146:
            java.util.ArrayList r3 = r0.f95065j
            java.lang.Object r3 = r3.get(r14)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x018d
            java.lang.String r3 = r18.getParameterValue()
            java.lang.String r3 = r3.trim()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x018d
            java.util.ArrayList r3 = r0.f95065j
            java.lang.String r6 = r18.getParameterValue()
            java.lang.String r6 = r6.trim()
            r3.set(r14, r6)
            goto L_0x018d
        L_0x0170:
            java.util.ArrayList r3 = r0.f95065j
            java.lang.String r6 = r18.getParameterValue()
            r3.set(r10, r6)
            goto L_0x018d
        L_0x017a:
            java.util.ArrayList r3 = r0.f95065j
            java.lang.String r6 = r18.getParameterValue()
            r3.set(r4, r6)
            goto L_0x018d
        L_0x0184:
            java.util.ArrayList r3 = r0.f95065j
            java.lang.String r6 = r18.getParameterValue()
            r3.set(r2, r6)
        L_0x018d:
            r3 = 0
            goto L_0x0035
        L_0x0190:
            if (r11 == 0) goto L_0x02f3
            java.lang.String r1 = "GE"
            if (r17 != 0) goto L_0x01ab
            boolean r2 = r11.startsWith(r1)
            if (r2 == 0) goto L_0x01a8
            int r2 = r11.length()
            r3 = 22
            if (r2 <= r3) goto L_0x01a8
            java.lang.String r16 = r11.substring(r3)
        L_0x01a8:
            r2 = r16
            goto L_0x01ad
        L_0x01ab:
            r2 = r17
        L_0x01ad:
            boolean r1 = r11.startsWith(r1)
            if (r1 == 0) goto L_0x01c3
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r1 = r0.f95076u
            ge.bog.mobilebank.model.account.AccountLovContainer r1 = r1.getAccountLovContainer()
            int r3 = r20.mo93880e()
            r4 = 1
            f91.a r1 = f91.C31972b.m94379d(r1, r11, r2, r3, r4)
            goto L_0x01d6
        L_0x01c3:
            r4 = 1
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r1 = r0.f95076u
            ge.bog.mobilebank.model.account.AccountLovContainer r1 = r1.getAccountLovContainer()
            long r2 = java.lang.Long.parseLong(r11)
            int r5 = r20.mo93880e()
            f91.a r1 = f91.C31972b.m94378c(r1, r2, r5, r4)
        L_0x01d6:
            ge.bog.mobilebank.model.account.AccountLov r2 = r1.mo72458a()
            if (r2 == 0) goto L_0x01fb
            java.util.ArrayList r2 = r0.f95065j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            ge.bog.mobilebank.model.account.AccountLov r1 = r1.mo72458a()
            long r4 = r1.getId()
            r3.append(r4)
            r3.append(r12)
            java.lang.String r1 = r3.toString()
            r3 = 1
            r2.set(r3, r1)
            goto L_0x02f3
        L_0x01fb:
            r3 = 1
            java.util.ArrayList r1 = r0.f95065j
            r1.set(r3, r12)
            goto L_0x02f3
        L_0x0203:
            java.util.List r1 = r21.getTemplateParameters()
            java.util.Iterator r1 = r1.iterator()
        L_0x020b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02f3
            java.lang.Object r3 = r1.next()
            ge.bog.mobilebank.model.template.TemplateBasketParameter r3 = (p341ge.bog.mobilebank.model.template.TemplateBasketParameter) r3
            java.lang.String r6 = r3.getParameterKey()
            r6.hashCode()
            int r10 = r6.hashCode()
            switch(r10) {
                case -1724546052: goto L_0x0242;
                case -1413853096: goto L_0x0239;
                case 481244746: goto L_0x0230;
                case 682696029: goto L_0x0227;
                default: goto L_0x0225;
            }
        L_0x0225:
            r6 = -1
            goto L_0x024a
        L_0x0227:
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x022e
            goto L_0x0225
        L_0x022e:
            r6 = r14
            goto L_0x024a
        L_0x0230:
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0237
            goto L_0x0225
        L_0x0237:
            r6 = 2
            goto L_0x024a
        L_0x0239:
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0240
            goto L_0x0225
        L_0x0240:
            r6 = 1
            goto L_0x024a
        L_0x0242:
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0249
            goto L_0x0225
        L_0x0249:
            r6 = 0
        L_0x024a:
            switch(r6) {
                case 0: goto L_0x02e0;
                case 1: goto L_0x02d1;
                case 2: goto L_0x0291;
                case 3: goto L_0x0253;
                default: goto L_0x024d;
            }
        L_0x024d:
            r6 = r2
            r16 = r7
        L_0x0250:
            r15 = 1
            goto L_0x02ee
        L_0x0253:
            java.lang.String r3 = r3.getParameterValue()
            r6 = 22
            java.lang.String r10 = r3.substring(r6)     // Catch:{ Exception -> 0x025e }
            goto L_0x025f
        L_0x025e:
            r10 = r11
        L_0x025f:
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r6 = r0.f95076u
            ge.bog.mobilebank.model.account.AccountLovContainer r6 = r6.getAccountLovContainer()
            r13 = 0
            f91.a r3 = f91.C31972b.m94379d(r6, r3, r10, r13, r13)
            ge.bog.mobilebank.model.account.AccountLov r6 = r3.mo72458a()
            if (r6 == 0) goto L_0x024d
            java.util.ArrayList r6 = r0.f95065j
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            ge.bog.mobilebank.model.account.AccountLov r3 = r3.mo72458a()
            long r2 = r3.getId()
            r10.append(r2)
            r10.append(r12)
            java.lang.String r2 = r10.toString()
            r6.set(r14, r2)
            r16 = r7
            r6 = 19
            goto L_0x0250
        L_0x0291:
            java.lang.String r2 = r3.getParameterValue()
            r6 = 22
            java.lang.String r3 = r2.substring(r6)     // Catch:{ Exception -> 0x029c }
            goto L_0x029d
        L_0x029c:
            r3 = r11
        L_0x029d:
            ge.bog.mobilebank.eventbus.events.AccountLovEvent r10 = r0.f95076u
            ge.bog.mobilebank.model.account.AccountLovContainer r10 = r10.getAccountLovContainer()
            r6 = 0
            r15 = 1
            f91.a r2 = f91.C31972b.m94379d(r10, r2, r3, r6, r15)
            ge.bog.mobilebank.model.account.AccountLov r3 = r2.mo72458a()
            if (r3 == 0) goto L_0x02ce
            java.util.ArrayList r3 = r0.f95065j
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            ge.bog.mobilebank.model.account.AccountLov r2 = r2.mo72458a()
            r16 = r7
            long r6 = r2.getId()
            r10.append(r6)
            r10.append(r12)
            java.lang.String r2 = r10.toString()
            r3.set(r15, r2)
            goto L_0x02dd
        L_0x02ce:
            r16 = r7
            goto L_0x02dd
        L_0x02d1:
            r16 = r7
            r15 = 1
            java.util.ArrayList r2 = r0.f95065j
            java.lang.String r3 = r3.getParameterValue()
            r2.set(r4, r3)
        L_0x02dd:
            r6 = 19
            goto L_0x02ee
        L_0x02e0:
            r16 = r7
            r15 = 1
            java.util.ArrayList r2 = r0.f95065j
            java.lang.String r3 = r3.getParameterValue()
            r6 = 19
            r2.set(r6, r3)
        L_0x02ee:
            r2 = r6
            r7 = r16
            goto L_0x020b
        L_0x02f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y61.C40026b.m115990k(ge.bog.mobilebank.model.template.TemplateBasketItem):void");
    }

    /* renamed from: l */
    private void m115991l(TransferHistoryItem transferHistoryItem) {
        if (transferHistoryItem.getAmount() != null && transferHistoryItem.getAmount().doubleValue() > Utils.DOUBLE_EPSILON) {
            this.f95065j.set(15, String.valueOf(transferHistoryItem.getAmount().doubleValue()));
        }
        this.f95065j.set(1, String.valueOf(transferHistoryItem.getSrcAcctKey()));
        if (!TextUtils.isEmpty(transferHistoryItem.getNomination())) {
            this.f95065j.set(19, transferHistoryItem.getNomination());
        }
        String str = this.f95061f;
        str.hashCode();
        if (str.equals(TransferForm.TRANSFER_FORM_CONVERSION) || str.equals(TransferForm.TRANSFER_FORM_OWN)) {
            this.f95065j.set(3, String.valueOf(transferHistoryItem.getDstAcctKey()));
            return;
        }
        this.f95065j.set(3, transferHistoryItem.getBenefAcctNo());
        if ("PAYMENT_FOREIGN".equals(transferHistoryItem.getDocType())) {
            this.f95065j.set(5, transferHistoryItem.getBenefClientShort());
        } else {
            this.f95065j.set(5, transferHistoryItem.getBenefName());
        }
        if (!TextUtils.isEmpty(transferHistoryItem.benefCity)) {
            this.f95065j.set(7, transferHistoryItem.benefCity);
        }
        if (!TextUtils.isEmpty(transferHistoryItem.benefAddress)) {
            this.f95065j.set(8, transferHistoryItem.benefAddress);
        }
        if (!TextUtils.isEmpty(transferHistoryItem.payerInn)) {
            this.f95065j.set(10, transferHistoryItem.payerInn);
        }
        if (!TextUtils.isEmpty(transferHistoryItem.payerName)) {
            this.f95065j.set(9, transferHistoryItem.payerName);
        }
        if (!TextUtils.isEmpty(transferHistoryItem.dispatchType)) {
            this.f95065j.set(16, transferHistoryItem.dispatchType);
        }
    }

    /* renamed from: a */
    public void mo93876a() {
        this.f95058c = false;
        this.f95057b = null;
        C40025a aVar = this.f95056a;
        if (aVar != null) {
            aVar.mo93853a();
        }
    }

    /* renamed from: b */
    public void mo93877b() {
        this.f95058c = true;
        m115987f();
        C40025a aVar = this.f95056a;
        if (aVar != null) {
            aVar.mo93863l();
        }
        this.f95056a.mo93854b();
    }

    /* renamed from: c */
    public void mo93878c() {
        this.f95058c = false;
        C40025a aVar = this.f95056a;
        if (aVar != null) {
            aVar.mo93864m();
        }
    }

    /* renamed from: d */
    public void mo93879d() {
        if (!this.f95081z && !TransferForm.TRANSFER_FORM_OWN.equals(this.f95061f) && !TransferForm.TRANSFER_FORM_CONVERSION.equals(this.f95061f) && !TransferForm.TRANSFER_FORM_FOREIGN.equals(this.f95061f) && !TextUtils.isEmpty((CharSequence) this.f95065j.get(3)) && ((String) this.f95065j.get(3)).length() > 2 && !((String) this.f95065j.get(3)).substring(0, 2).equalsIgnoreCase("GE")) {
            this.f95061f = TransferForm.TRANSFER_FORM_BUDGET;
        }
    }

    /* renamed from: e */
    public int mo93880e() {
        String str = this.f95061f;
        if (str != null) {
            str.hashCode();
            if (str.equals(TransferForm.TRANSFER_FORM_CONVERSION) || str.equals(TransferForm.TRANSFER_FORM_OWN)) {
                return 0;
            }
        }
        if (this.f95059d) {
            return 1;
        }
        return 2;
    }

    /* renamed from: g */
    public void mo93881g(AccountLovEvent accountLovEvent) {
        int i;
        this.f95076u = accountLovEvent;
        if (accountLovEvent.getState() == 20) {
            ArrayList<AccountLov> e = C31972b.m94380e(this.f95076u.getAccountLovContainer(), mo93880e(), true);
            int i2 = 0;
            if (e.size() == 1) {
                i = 0;
            } else {
                i = -1;
            }
            for (AccountLov accountLov : e) {
                if (accountLov.isDefault() && (!this.f95070o || accountLov.getCcy().equals("GEL"))) {
                    i = i2;
                }
                i2++;
            }
            try {
                if (TextUtils.isEmpty((CharSequence) this.f95065j.get(1))) {
                    String str = ((AccountLov) e.get(i)).getMainAcctKey() + "";
                    String str2 = (String) this.f95065j.get(3);
                    if (str2 == null || !str2.equals(str)) {
                        this.f95065j.set(1, str);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public void mo93882h(InTransferDetailsEvent inTransferDetailsEvent) {
        this.f95080y = inTransferDetailsEvent;
        if (inTransferDetailsEvent != null && inTransferDetailsEvent.getState() == 20 && this.f95080y.getState() == 20) {
            String docType = inTransferDetailsEvent.getInTransferDetail().getDocType();
            docType.hashCode();
            char c = 65535;
            switch (docType.hashCode()) {
                case -93971273:
                    if (docType.equals("PAYMENT_WITHIN_BANK")) {
                        c = 0;
                        break;
                    }
                    break;
                case -93909248:
                    if (docType.equals("PAYMENT_WITHIN_BUDGET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1078753379:
                    if (docType.equals("PAYMENT_WITHIN_GEORGIA")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1174158607:
                    if (docType.equals("PAYMENT_CONVERSION")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f95059d = true;
                    break;
                case 1:
                    this.f95061f = TransferForm.TRANSFER_FORM_BUDGET;
                    break;
                case 2:
                    break;
                case 3:
                    this.f95061f = TransferForm.TRANSFER_FORM_CONVERSION;
                    break;
                default:
                    this.f95061f = TransferForm.TRANSFER_FORM_OWN;
                    break;
            }
            this.f95061f = TransferForm.TRANSFER_FORM_OTHER;
            m115988i(inTransferDetailsEvent.getInTransferDetail());
        }
    }

    /* renamed from: m */
    public void mo93883m(int i) {
        mo93884n(i, "");
    }

    /* renamed from: n */
    public void mo93884n(int i, String str) {
        long[] jArr;
        DDSTODetailsWrapper dDSTODetailsWrapper;
        CardDebitDetails cardDebitDetails;
        String str2;
        boolean z;
        int i2 = i;
        if (this.f95057b != null && this.f95058c) {
            if (i2 == 20) {
                long j = this.f95067l;
                if (j > 0) {
                    DDSTO stoByPaymentId = this.f95078w.getStoByPaymentId(j);
                    this.f95072q = stoByPaymentId;
                    if (stoByPaymentId != null) {
                        String str3 = stoByPaymentId.productCode;
                        STODetails sTODetails = stoByPaymentId.details.stoDetails;
                        String str4 = "";
                        if (sTODetails != null) {
                            str2 = sTODetails.subProductCode;
                        } else {
                            str2 = str4;
                        }
                        if (sTODetails != null) {
                            str4 = sTODetails.benefAcctNo;
                        }
                        this.f95061f = TransferForm.getTransferFormBySTOProductCode(str3, str2, str4);
                        STODetails sTODetails2 = this.f95072q.details.stoDetails;
                        if (sTODetails2 == null || !"PAYMENT_WITHIN_BANK".equals(sTODetails2.subProductCode)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.f95059d = z;
                    }
                }
                TransferHistoryItem transferHistoryItem = this.f95074s;
                if (transferHistoryItem != null) {
                    m115991l(transferHistoryItem);
                } else {
                    TemplateBasketItem templateBasketItem = this.f95071p;
                    if (templateBasketItem != null) {
                        m115990k(templateBasketItem);
                    } else {
                        DDSTO ddsto = this.f95072q;
                        if (ddsto != null) {
                            m115989j(ddsto);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                DDSTOListEvent dDSTOListEvent = this.f95078w;
                if (!(dDSTOListEvent == null || dDSTOListEvent.getList() == null)) {
                    Iterator<DDSTO> it = this.f95078w.getList().iterator();
                    while (it.hasNext()) {
                        DDSTO next = it.next();
                        if (!(!"BILL".equals(next.productCode) || (dDSTODetailsWrapper = next.details) == null || (cardDebitDetails = dDSTODetailsWrapper.cardDebitDetails) == null)) {
                            arrayList.add(Long.valueOf(cardDebitDetails.creditCardAcctKey));
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    jArr = new long[arrayList.size()];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        jArr[i3] = ((Long) arrayList.get(i3)).longValue();
                    }
                } else {
                    jArr = null;
                }
                this.f95057b.mo85300H2(this.f95062g, this.f95061f, this.f95063h, this.f95059d, this.f95070o, this.f95060e, this.f95065j, this.f95076u, this.f95077v, this.f95071p, this.f95072q, this.f95075t, jArr);
            } else if ((i2 == 30 || i2 == 40) && !TextUtils.isEmpty(str)) {
                C32297d.m95154b(this.f95057b, str);
            }
            this.f95057b.mo85301I2(i2);
        }
    }

    /* renamed from: o */
    public void mo93885o(PMIHistoryItem pMIHistoryItem) {
        this.f95075t = pMIHistoryItem;
    }

    /* renamed from: p */
    public void mo93886p(DDSTOListEvent dDSTOListEvent) {
        this.f95078w = dDSTOListEvent;
    }

    /* renamed from: q */
    public void mo93887q(STOPeriodTypesEvent sTOPeriodTypesEvent) {
        this.f95077v = sTOPeriodTypesEvent;
    }

    /* renamed from: r */
    public void mo93888r(TransferHistoryEvent transferHistoryEvent) {
        this.f95079x = transferHistoryEvent;
        if (transferHistoryEvent != null && transferHistoryEvent.getState() == 20) {
            String docType = transferHistoryEvent.getTransferHistoryItem().getDocType();
            docType.hashCode();
            char c = 65535;
            switch (docType.hashCode()) {
                case -93971273:
                    if (docType.equals("PAYMENT_WITHIN_BANK")) {
                        c = 0;
                        break;
                    }
                    break;
                case -93909248:
                    if (docType.equals("PAYMENT_WITHIN_BUDGET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1078753379:
                    if (docType.equals("PAYMENT_WITHIN_GEORGIA")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1174158607:
                    if (docType.equals("PAYMENT_CONVERSION")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1867328347:
                    if (docType.equals("PAYMENT_FOREIGN")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f95059d = true;
                    break;
                case 1:
                    this.f95061f = TransferForm.TRANSFER_FORM_BUDGET;
                    break;
                case 2:
                    break;
                case 3:
                    this.f95061f = TransferForm.TRANSFER_FORM_CONVERSION;
                    break;
                case 4:
                    this.f95061f = TransferForm.TRANSFER_FORM_FOREIGN;
                    break;
                default:
                    this.f95061f = TransferForm.TRANSFER_FORM_OWN;
                    break;
            }
            this.f95061f = TransferForm.TRANSFER_FORM_OTHER;
            m115991l(transferHistoryEvent.getTransferHistoryItem());
        }
    }
}
