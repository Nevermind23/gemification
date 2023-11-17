package p341ge.bog.mobilebank.products.data.mapper;

import com.github.mikephil.charting.utils.Utils;
import hd0.C24977a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.loans.AcctRefEntity;
import p341ge.bog.mobilebank.products.data.model.AmountApiModel;
import p341ge.bog.mobilebank.products.data.model.LndDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.LoanApiModel;
import p341ge.bog.mobilebank.products.data.model.LoanDetailsApiModel;
import p341ge.bog.mobilebank.products.data.model.LoanInvoiceApiModel;
import p341ge.bog.mobilebank.products.data.model.LoanInvoiceWrapperApiModel;
import p341ge.bog.mobilebank.products.data.model.LoanScheduleApiModel;
import p341ge.bog.mobilebank.products.data.model.LoansWrapperApiModel;
import p341ge.bog.mobilebank.products.data.model.PlnDetailsApiModel;
import xy0.C39937b;
import xy0.C39951o;
import xy0.C39952p;
import xy0.C39953q;
import xy0.C39954r;
import xy0.C39955s;
import xy0.C39957u;
import xy0.C39958v;
import xy0.C39959w;
import xy0.C39962z;

/* renamed from: ge.bog.mobilebank.products.data.mapper.LoansWrapperApiModelMapper */
public final class LoansWrapperApiModelMapper {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.LoansWrapperApiModelMapper$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.model.loans.AcctRefEntity[] r0 = p341ge.bog.mobilebank.model.loans.AcctRefEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.model.loans.AcctRefEntity r1 = p341ge.bog.mobilebank.model.loans.AcctRefEntity.COSIGNER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.model.loans.AcctRefEntity r1 = p341ge.bog.mobilebank.model.loans.AcctRefEntity.PRIMARY_SIGNER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.data.mapper.LoansWrapperApiModelMapper.WhenMappings.<clinit>():void");
        }
    }

    public final C39959w convert(LoansWrapperApiModel loansWrapperApiModel) {
        String currency;
        Double amount;
        C41536l.m120489i(loansWrapperApiModel, "loansWrapperApiModel");
        Double amount2 = loansWrapperApiModel.getSummary().getAmount();
        double d = Utils.DOUBLE_EPSILON;
        double doubleValue = amount2 != null ? amount2.doubleValue() : 0.0d;
        String currency2 = loansWrapperApiModel.getSummary().getCurrency();
        String str = "GEL";
        if (currency2 == null) {
            currency2 = str;
        }
        C24977a aVar = new C24977a(doubleValue, currency2);
        AmountApiModel cosignerSummary = loansWrapperApiModel.getCosignerSummary();
        if (!(cosignerSummary == null || (amount = cosignerSummary.getAmount()) == null)) {
            d = amount.doubleValue();
        }
        AmountApiModel cosignerSummary2 = loansWrapperApiModel.getCosignerSummary();
        if (!(cosignerSummary2 == null || (currency = cosignerSummary2.getCurrency()) == null)) {
            str = currency;
        }
        C24977a aVar2 = new C24977a(d, str);
        List<LoanApiModel> loans = loansWrapperApiModel.getLoans();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(loans, 10));
        for (LoanApiModel convert : loans) {
            arrayList.add(convert(convert));
        }
        List<LoanDetailsApiModel> details = loansWrapperApiModel.getDetails();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(details, 10));
        for (LoanDetailsApiModel convert2 : details) {
            arrayList2.add(convert(convert2));
        }
        return new C39959w(aVar, aVar2, arrayList, arrayList2);
    }

    private final C39952p convert(LoanApiModel loanApiModel) {
        long loanKey = loanApiModel.getLoanKey();
        String prodType = loanApiModel.getProdType();
        if (prodType == null) {
            prodType = "";
        }
        C39958v convert = convert(prodType);
        BigDecimal amount = loanApiModel.getAmount();
        double doubleValue = amount != null ? amount.doubleValue() : Utils.DOUBLE_EPSILON;
        String loanName = loanApiModel.getLoanName();
        String ccy = loanApiModel.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        }
        return new C39952p(loanKey, convert, doubleValue, loanName, ccy, loanApiModel.getBcAmount(), loanApiModel.getLoanType(), loanApiModel.getProductDictionaryKey(), loanApiModel.getInstallmentFlag(), loanApiModel.getProductFunctions(), loanApiModel.getAttachmentUrl(), loanApiModel.getProductId(), convert(loanApiModel.getAcctRef()));
    }

    private final C39937b convert(AcctRefEntity acctRefEntity) {
        int i = acctRefEntity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[acctRefEntity.ordinal()];
        if (i == 1) {
            return C39937b.COSIGNER;
        }
        if (i != 2) {
            return null;
        }
        return C39937b.PRIMARY_SIGNER;
    }

    private final C39958v convert(String str) {
        for (C39958v vVar : C39958v.values()) {
            String b = vVar.mo93783b();
            Locale locale = Locale.ROOT;
            String lowerCase = b.toLowerCase(locale);
            C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = str.toLowerCase(locale);
            C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (C41536l.m120484d(lowerCase, lowerCase2)) {
                return vVar;
            }
        }
        return null;
    }

    private final C39953q convert(LoanDetailsApiModel loanDetailsApiModel) {
        long loanKey = loanDetailsApiModel.getLoanKey();
        LndDetailsApiModel lndDetails = loanDetailsApiModel.getLndDetails();
        C39951o convert = lndDetails != null ? convert(lndDetails) : null;
        PlnDetailsApiModel plnDetails = loanDetailsApiModel.getPlnDetails();
        C39962z convert2 = plnDetails != null ? convert(plnDetails) : null;
        LoanScheduleApiModel schedule = loanDetailsApiModel.getSchedule();
        C39957u convert3 = schedule != null ? convert(schedule) : null;
        LoanInvoiceWrapperApiModel invoice = loanDetailsApiModel.getInvoice();
        return new C39953q(loanKey, convert, convert2, convert3, invoice != null ? convert(invoice) : null);
    }

    private final C39962z convert(PlnDetailsApiModel plnDetailsApiModel) {
        return new C39962z(plnDetailsApiModel.getAmount(), plnDetailsApiModel.getStartDate(), plnDetailsApiModel.getMaturityDate(), plnDetailsApiModel.getInterestRate(), plnDetailsApiModel.getIntAmount(), plnDetailsApiModel.getPenalty(), plnDetailsApiModel.getInitialPrincipal(), plnDetailsApiModel.getAcctNo(), plnDetailsApiModel.getProductDictionaryKey(), plnDetailsApiModel.getAvailableAmount());
    }

    private final C39951o convert(LndDetailsApiModel lndDetailsApiModel) {
        Long loanKey = lndDetailsApiModel.getLoanKey();
        long longValue = loanKey != null ? loanKey.longValue() : 0;
        Long signedDate = lndDetailsApiModel.getSignedDate();
        Date date = signedDate != null ? new Date(signedDate.longValue()) : null;
        Long firstDdDate = lndDetailsApiModel.getFirstDdDate();
        Date date2 = firstDdDate != null ? new Date(firstDdDate.longValue()) : null;
        Long matureDate = lndDetailsApiModel.getMatureDate();
        Date date3 = matureDate != null ? new Date(matureDate.longValue()) : null;
        Long linkAcctKey = lndDetailsApiModel.getLinkAcctKey();
        BigDecimal initialPrincipal = lndDetailsApiModel.getInitialPrincipal();
        double doubleValue = initialPrincipal != null ? initialPrincipal.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal remainingInterest = lndDetailsApiModel.getRemainingInterest();
        double doubleValue2 = remainingInterest != null ? remainingInterest.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal offsetIntSaved = lndDetailsApiModel.getOffsetIntSaved();
        double doubleValue3 = offsetIntSaved != null ? offsetIntSaved.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal interestRate = lndDetailsApiModel.getInterestRate();
        double doubleValue4 = interestRate != null ? interestRate.doubleValue() : Utils.DOUBLE_EPSILON;
        long clientKey = lndDetailsApiModel.getClientKey();
        boolean d = C41536l.m120484d(lndDetailsApiModel.getInsFlag(), "Y");
        BigDecimal insAmount = lndDetailsApiModel.getInsAmount();
        double doubleValue5 = insAmount != null ? insAmount.doubleValue() : Utils.DOUBLE_EPSILON;
        String loanSubType = lndDetailsApiModel.getLoanSubType();
        BigDecimal nextInterest = lndDetailsApiModel.getNextInterest();
        double doubleValue6 = nextInterest != null ? nextInterest.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal nextPayment = lndDetailsApiModel.getNextPayment();
        double doubleValue7 = nextPayment != null ? nextPayment.doubleValue() : Utils.DOUBLE_EPSILON;
        String subTypeGroup = lndDetailsApiModel.getSubTypeGroup();
        boolean d2 = C41536l.m120484d(lndDetailsApiModel.getSmsScheme(), "Y");
        boolean d3 = C41536l.m120484d(lndDetailsApiModel.isLoanReverseAllowed(), "Y");
        String linkAcctNo = lndDetailsApiModel.getLinkAcctNo();
        BigDecimal restAmount = lndDetailsApiModel.getRestAmount();
        double doubleValue8 = restAmount != null ? restAmount.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal prePaymentCom = lndDetailsApiModel.getPrePaymentCom();
        double doubleValue9 = prePaymentCom != null ? prePaymentCom.doubleValue() : Utils.DOUBLE_EPSILON;
        String repaymentFlag = lndDetailsApiModel.getRepaymentFlag();
        boolean d4 = C41536l.m120484d(lndDetailsApiModel.isReversible(), "Y");
        BigDecimal loanDebt = lndDetailsApiModel.getLoanDebt();
        return new C39951o(longValue, date, date2, date3, linkAcctKey, doubleValue, doubleValue2, doubleValue3, doubleValue4, clientKey, d, doubleValue5, loanSubType, doubleValue6, doubleValue7, subTypeGroup, d2, d3, linkAcctNo, doubleValue8, doubleValue9, repaymentFlag, d4, loanDebt != null ? loanDebt.doubleValue() : Utils.DOUBLE_EPSILON, lndDetailsApiModel.getFileUrl(), lndDetailsApiModel.isOnlineInstallment(), lndDetailsApiModel.getReversalStatus(), lndDetailsApiModel.getReversalStatusDictionaryKey(), lndDetailsApiModel.getReversalStatusDictionaryValue(), lndDetailsApiModel.getNextFloatingRate(), lndDetailsApiModel.getNextLoanRateChangeDate(), lndDetailsApiModel.getNextSpreadRate(), lndDetailsApiModel.getNextMinIntRate(), lndDetailsApiModel.getNextLoanIntTypeName(), lndDetailsApiModel.getNextLoanIntTypeDictionaryKey(), lndDetailsApiModel.getNextLoanIntTypeDictionaryValue());
    }

    private final C39957u convert(LoanScheduleApiModel loanScheduleApiModel) {
        String str;
        String str2;
        String primaryKey = loanScheduleApiModel.getPrimaryKey();
        long loanKey = loanScheduleApiModel.getLoanKey();
        String loanNo = loanScheduleApiModel.getLoanNo();
        Date date = new Date(loanScheduleApiModel.getPayDate());
        String ccy = loanScheduleApiModel.getCcy();
        BigDecimal priAmt = loanScheduleApiModel.getPriAmt();
        double d = Utils.DOUBLE_EPSILON;
        Double valueOf = Double.valueOf(priAmt != null ? priAmt.doubleValue() : 0.0d);
        BigDecimal intAmt = loanScheduleApiModel.getIntAmt();
        Double valueOf2 = Double.valueOf(intAmt != null ? intAmt.doubleValue() : 0.0d);
        BigDecimal feeAmt = loanScheduleApiModel.getFeeAmt();
        Double valueOf3 = Double.valueOf(feeAmt != null ? feeAmt.doubleValue() : 0.0d);
        String feeType = loanScheduleApiModel.getFeeType();
        String str3 = feeType == null ? "" : feeType;
        BigDecimal exAmt = loanScheduleApiModel.getExAmt();
        Double valueOf4 = Double.valueOf(exAmt != null ? exAmt.doubleValue() : 0.0d);
        BigDecimal totalAmt = loanScheduleApiModel.getTotalAmt();
        Double valueOf5 = Double.valueOf(totalAmt != null ? totalAmt.doubleValue() : 0.0d);
        BigDecimal nextPayAmt = loanScheduleApiModel.getNextPayAmt();
        Double valueOf6 = Double.valueOf(nextPayAmt != null ? nextPayAmt.doubleValue() : 0.0d);
        BigDecimal intAmtWithoutOffset = loanScheduleApiModel.getIntAmtWithoutOffset();
        if (intAmtWithoutOffset != null) {
            d = intAmtWithoutOffset.doubleValue();
        }
        Double valueOf7 = Double.valueOf(d);
        String feeTypeDictionaryKey = loanScheduleApiModel.getFeeTypeDictionaryKey();
        if (feeTypeDictionaryKey == null) {
            str = "";
        } else {
            str = feeTypeDictionaryKey;
        }
        String feeTypeDictionaryValue = loanScheduleApiModel.getFeeTypeDictionaryValue();
        if (feeTypeDictionaryValue == null) {
            str2 = "";
        } else {
            str2 = feeTypeDictionaryValue;
        }
        return new C39957u(primaryKey, loanKey, loanNo, date, ccy, valueOf, valueOf2, valueOf3, str3, valueOf4, valueOf5, valueOf6, valueOf7, str, str2);
    }

    private final C39955s convert(LoanInvoiceWrapperApiModel loanInvoiceWrapperApiModel) {
        Date date = new Date(loanInvoiceWrapperApiModel.getPaymentDate());
        BigDecimal amount = loanInvoiceWrapperApiModel.getAmount();
        double doubleValue = amount != null ? amount.doubleValue() : Utils.DOUBLE_EPSILON;
        List<LoanInvoiceApiModel> list = loanInvoiceWrapperApiModel.getList();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (LoanInvoiceApiModel convert : list) {
            arrayList.add(convert(convert));
        }
        return new C39955s(date, doubleValue, arrayList);
    }

    private final C39954r convert(LoanInvoiceApiModel loanInvoiceApiModel) {
        long loanKey = loanInvoiceApiModel.getLoanKey();
        long paymentDate = loanInvoiceApiModel.getPaymentDate();
        String invoiceType = loanInvoiceApiModel.getInvoiceType();
        String feeType = loanInvoiceApiModel.getFeeType();
        String ccy = loanInvoiceApiModel.getCcy();
        BigDecimal amount = loanInvoiceApiModel.getAmount();
        return new C39954r(loanKey, paymentDate, invoiceType, feeType, ccy, amount != null ? amount.doubleValue() : Utils.DOUBLE_EPSILON, loanInvoiceApiModel.getInvoiceTypeDictionaryKey());
    }
}
