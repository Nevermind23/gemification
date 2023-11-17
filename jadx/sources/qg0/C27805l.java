package qg0;

import ie0.C25190j;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTAcquire;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividend;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividendTax;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTInstrument;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTMergerRequisition;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction;
import tg0.C28380b;

/* renamed from: qg0.l */
public enum C27805l {
    AccountBalance(C25190j.gt_transaction_account_balance),
    Comment(C25190j.gt_transaction_comment),
    FinTranID(C25190j.gt_transaction_transaction_number),
    FeeSec(C25190j.gt_transaction_us_treasury_fee),
    FeeXtraShares(C25190j.gt_transaction_sec_ownership_fee),
    FeeExchange(C25190j.gt_transaction_exchange_fee),
    FillQty(C25190j.gt_transaction_securities_amount),
    FillPx(C25190j.gt_transaction_price_of_securities),
    OrderID(r1),
    TranAmount(r2),
    TranWhen(C25190j.gt_transaction_transaction_date),
    OrderNo(r1),
    CumQtyB(C25190j.gt_transaction_combined_amount_of_bought_securities),
    CumQtyS(C25190j.gt_transaction_combined_amount_of_sold_securities),
    LeavesQty(C25190j.gt_transaction_amount_of_remaining_securities),
    OrderQty(C25190j.gt_transaction_amount_of_securities),
    FeeBase(C25190j.gt_transaction_base_fee),
    AmountCash(r2),
    InstrumentName(C25190j.gt_transaction_instrument_name),
    InstrumentSymbol(C25190j.gt_transaction_instrument_identifier),
    MergerAcquisitionAcquirerName(C25190j.gt_transaction_main_company_name),
    MergerAcquisitionAcquirerSymbol(C25190j.gt_transaction_main_company_ticker),
    MergerAcquisitionAcquireeName(C25190j.gt_transaction_merging_company_name),
    MergerAcquisitionAcquireeSymbol(C25190j.gt_transaction_merging_company_ticker),
    DividendType(C25190j.gt_transaction_dividend_type),
    DividendAmountPerShare(C25190j.gt_transaction_dividend_amount_per_share),
    DividendTaxCode(C25190j.gt_transaction_dividend_tax_code),
    DividendTaxRate(C25190j.gt_transaction_dividend_tax_rate),
    DividendTaxType(C25190j.gt_transaction_dividend_tax_type);
    

    /* renamed from: d */
    private final int f70934d;

    /* renamed from: qg0.l$a */
    public /* synthetic */ class C27806a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70935a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(2:57|58)|59|61) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|61) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                qg0.l[] r0 = qg0.C27805l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                qg0.l r1 = qg0.C27805l.AccountBalance     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                qg0.l r1 = qg0.C27805l.Comment     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                qg0.l r1 = qg0.C27805l.FinTranID     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                qg0.l r1 = qg0.C27805l.FeeSec     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                qg0.l r1 = qg0.C27805l.FeeXtraShares     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                qg0.l r1 = qg0.C27805l.FeeExchange     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                qg0.l r1 = qg0.C27805l.FillQty     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                qg0.l r1 = qg0.C27805l.FillPx     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                qg0.l r1 = qg0.C27805l.OrderID     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                qg0.l r1 = qg0.C27805l.TranAmount     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                qg0.l r1 = qg0.C27805l.TranWhen     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                qg0.l r1 = qg0.C27805l.OrderNo     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                qg0.l r1 = qg0.C27805l.CumQtyB     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                qg0.l r1 = qg0.C27805l.CumQtyS     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                qg0.l r1 = qg0.C27805l.LeavesQty     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                qg0.l r1 = qg0.C27805l.OrderQty     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                qg0.l r1 = qg0.C27805l.FeeBase     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                qg0.l r1 = qg0.C27805l.AmountCash     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                qg0.l r1 = qg0.C27805l.InstrumentName     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                qg0.l r1 = qg0.C27805l.InstrumentSymbol     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                qg0.l r1 = qg0.C27805l.MergerAcquisitionAcquirerName     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                qg0.l r1 = qg0.C27805l.MergerAcquisitionAcquirerSymbol     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                qg0.l r1 = qg0.C27805l.MergerAcquisitionAcquireeName     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                qg0.l r1 = qg0.C27805l.MergerAcquisitionAcquireeSymbol     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                qg0.l r1 = qg0.C27805l.DividendType     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                qg0.l r1 = qg0.C27805l.DividendAmountPerShare     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                qg0.l r1 = qg0.C27805l.DividendTaxCode     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                qg0.l r1 = qg0.C27805l.DividendTaxRate     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                qg0.l r1 = qg0.C27805l.DividendTaxType     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                f70935a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg0.C27805l.C27806a.<clinit>():void");
        }
    }

    private C27805l(int i) {
        this.f70934d = i;
    }

    /* renamed from: b */
    public final int mo67332b() {
        return this.f70934d;
    }

    /* renamed from: c */
    public final String mo67333c(GTTransaction gTTransaction) {
        GTAcquire b;
        GTAcquire b2;
        GTAcquire a;
        GTAcquire a2;
        C41536l.m120489i(gTTransaction, "transaction");
        switch (C27806a.f70935a[ordinal()]) {
            case 1:
                String d = gTTransaction.mo60155d();
                if (d == null) {
                    return null;
                }
                return d + " $";
            case 2:
                return gTTransaction.mo60159f();
            case 3:
                return gTTransaction.mo60171s();
            case 4:
                String l = gTTransaction.mo60166l();
                if (l == null) {
                    return null;
                }
                return l + " $";
            case 5:
                String m = gTTransaction.mo60167m();
                if (m == null) {
                    return null;
                }
                return m + " $";
            case 6:
                String k = gTTransaction.mo60165k();
                if (k == null) {
                    return null;
                }
                return k + " $";
            case 7:
                return gTTransaction.mo60169q();
            case 8:
                String p = gTTransaction.mo60168p();
                if (p == null) {
                    return null;
                }
                return p + " $";
            case 9:
                return gTTransaction.mo60179y();
            case 10:
                String C = gTTransaction.mo60152C();
                if (C == null) {
                    return null;
                }
                return C + " $";
            case 11:
                return C28380b.m87047b(gTTransaction, true);
            case 12:
                return gTTransaction.mo60180z();
            case 13:
                return gTTransaction.mo60160g();
            case 14:
                return gTTransaction.mo60160g();
            case 15:
                return gTTransaction.mo60174u();
            case 16:
                return gTTransaction.mo60150A();
            case 17:
                String j = gTTransaction.mo60164j();
                if (j == null) {
                    return null;
                }
                return j + " $";
            case 18:
                BigDecimal e = gTTransaction.mo60157e();
                return e + " $";
            case 19:
                GTInstrument t = gTTransaction.mo60172t();
                if (t != null) {
                    return t.mo60128b();
                }
                return null;
            case 20:
                GTInstrument t2 = gTTransaction.mo60172t();
                if (t2 != null) {
                    return t2.mo60129d();
                }
                return null;
            case 21:
                GTMergerRequisition v = gTTransaction.mo60175v();
                if (v == null || (b = v.mo60140b()) == null) {
                    return null;
                }
                return b.mo60093a();
            case 22:
                GTMergerRequisition v2 = gTTransaction.mo60175v();
                if (v2 == null || (b2 = v2.mo60140b()) == null) {
                    return null;
                }
                return b2.mo60094b();
            case 23:
                GTMergerRequisition v3 = gTTransaction.mo60175v();
                if (v3 == null || (a = v3.mo60139a()) == null) {
                    return null;
                }
                return a.mo60093a();
            case 24:
                GTMergerRequisition v4 = gTTransaction.mo60175v();
                if (v4 == null || (a2 = v4.mo60139a()) == null) {
                    return null;
                }
                return a2.mo60094b();
            case 25:
                GTDividend h = gTTransaction.mo60161h();
                if (h != null) {
                    return h.mo60106d();
                }
                return null;
            case 26:
                GTDividend h2 = gTTransaction.mo60161h();
                if (h2 != null) {
                    return h2.mo60104a();
                }
                return null;
            case 27:
                GTDividend h3 = gTTransaction.mo60161h();
                if (h3 != null) {
                    return h3.mo60105b();
                }
                return null;
            case 28:
                GTDividendTax i = gTTransaction.mo60163i();
                if (i != null) {
                    return i.mo60116a();
                }
                return null;
            case 29:
                GTDividendTax i2 = gTTransaction.mo60163i();
                if (i2 != null) {
                    return i2.mo60117b();
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
