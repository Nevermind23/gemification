package p341ge.bog.mobilebank.products.data.mapper;

import com.github.mikephil.charting.utils.Utils;
import hd0.C24977a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.LoanInvoice;
import p341ge.bog.mobilebank.model.LoanInvoiceWrapper;
import p341ge.bog.mobilebank.model.LoanSummery;
import p341ge.bog.mobilebank.model.loans.AcctRefEntity;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetails;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.model.loans.PLNDetails;
import p341ge.bog.mobilebank.model.loans.schedule.LoanSchedule;
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

/* renamed from: ge.bog.mobilebank.products.data.mapper.LoansWrapperLegacyModelMapper */
public final class LoansWrapperLegacyModelMapper {

    /* renamed from: ge.bog.mobilebank.products.data.mapper.LoansWrapperLegacyModelMapper$WhenMappings */
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
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.data.mapper.LoansWrapperLegacyModelMapper.WhenMappings.<clinit>():void");
        }
    }

    public final C39959w convert(LoansWrapper loansWrapper) {
        BigDecimal amount;
        C41536l.m120489i(loansWrapper, "loansWrapperApiModel");
        BigDecimal amount2 = loansWrapper.getSummary().getAmount();
        double d = Utils.DOUBLE_EPSILON;
        double doubleValue = amount2 != null ? amount2.doubleValue() : 0.0d;
        String ccy = loansWrapper.getSummary().getCcy();
        String str = "GEL";
        if (ccy == null) {
            ccy = str;
        }
        C24977a aVar = new C24977a(doubleValue, ccy);
        LoanSummery loanSummery = loansWrapper.cosignerSummary;
        if (!(loanSummery == null || (amount = loanSummery.getAmount()) == null)) {
            d = amount.doubleValue();
        }
        LoanSummery loanSummery2 = loansWrapper.cosignerSummary;
        String ccy2 = loanSummery2 != null ? loanSummery2.getCcy() : null;
        if (ccy2 != null) {
            str = ccy2;
        }
        C24977a aVar2 = new C24977a(d, str);
        ArrayList<Loan> loans = loansWrapper.getLoans();
        C41536l.m120488h(loans, "loansWrapperApiModel.loans");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(loans, 10));
        for (Loan convert : loans) {
            arrayList.add(convert(convert));
        }
        ArrayList<LoanDetailsWrapper> details = loansWrapper.getDetails();
        C41536l.m120488h(details, "loansWrapperApiModel.details");
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(details, 10));
        for (LoanDetailsWrapper convert2 : details) {
            arrayList2.add(convert(convert2));
        }
        return new C39959w(aVar, aVar2, arrayList, arrayList2);
    }

    private final C39952p convert(Loan loan) {
        Loan loan2 = loan;
        long loanKey = loan.getLoanKey();
        String prodType = loan.getProdType();
        if (prodType == null) {
            prodType = "";
        } else {
            C41536l.m120488h(prodType, "prodType ?: \"\"");
        }
        C39958v convert = convert(prodType);
        BigDecimal amount = loan.getAmount();
        double doubleValue = amount != null ? amount.doubleValue() : Utils.DOUBLE_EPSILON;
        String loanName = loan.getLoanName();
        String ccy = loan.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        } else {
            C41536l.m120488h(ccy, "ccy ?: Consts.GEL");
        }
        String str = ccy;
        BigDecimal bigDecimal = loan2.bcAmount;
        String loanType = loan.getLoanType();
        String productDictionaryKey = loan.getProductDictionaryKey();
        String str2 = loan2.installmentFlag;
        ArrayList<String> productFunctions = loan.getProductFunctions();
        C41536l.m120488h(productFunctions, "productFunctions");
        return new C39952p(loanKey, convert, doubleValue, loanName, str, bigDecimal, loanType, productDictionaryKey, str2, productFunctions, loan.getAttachmentUrl(), loan.getProductId(), convert(loan2.acctRef));
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

    private final C39953q convert(LoanDetailsWrapper loanDetailsWrapper) {
        long loanKey = loanDetailsWrapper.getLoanKey();
        LoanDetails details = loanDetailsWrapper.getDetails();
        C39951o convert = details != null ? convert(details) : null;
        PLNDetails plnDetails = loanDetailsWrapper.getPlnDetails();
        C39962z convert2 = plnDetails != null ? convert(plnDetails) : null;
        LoanSchedule schedule = loanDetailsWrapper.getSchedule();
        C39957u convert3 = schedule != null ? convert(schedule) : null;
        LoanInvoiceWrapper invoice = loanDetailsWrapper.getInvoice();
        return new C39953q(loanKey, convert, convert2, convert3, invoice != null ? convert(invoice) : null);
    }

    private final C39962z convert(PLNDetails pLNDetails) {
        return new C39962z(pLNDetails.getAmount(), pLNDetails.getStartDate(), pLNDetails.getMaturityDate(), pLNDetails.getInterestRate(), pLNDetails.getIntAmount(), pLNDetails.getPenalty(), pLNDetails.getInitialPrincipal(), pLNDetails.getAcctNo(), pLNDetails.getProductDictionaryKey(), pLNDetails.getAvailableAmount());
    }

    private final C39951o convert(LoanDetails loanDetails) {
        LoanDetails loanDetails2 = loanDetails;
        long loanKey = loanDetails.getLoanKey();
        Date date = new Date(loanDetails.getSignedDate());
        Long l = loanDetails2.firstDdDate;
        Date date2 = l != null ? new Date(l.longValue()) : null;
        Date date3 = new Date(loanDetails.getMatureDate());
        Long valueOf = Long.valueOf(loanDetails.getLinkAcctKey());
        BigDecimal initialPrincipal = loanDetails.getInitialPrincipal();
        double doubleValue = initialPrincipal != null ? initialPrincipal.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal remainingInterest = loanDetails.getRemainingInterest();
        double doubleValue2 = remainingInterest != null ? remainingInterest.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal offsetIntSaved = loanDetails.getOffsetIntSaved();
        double doubleValue3 = offsetIntSaved != null ? offsetIntSaved.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal interestRate = loanDetails.getInterestRate();
        double doubleValue4 = interestRate != null ? interestRate.doubleValue() : Utils.DOUBLE_EPSILON;
        long clientKey = loanDetails.getClientKey();
        boolean d = C41536l.m120484d(loanDetails2.insFlag, "Y");
        BigDecimal insAmount = loanDetails.getInsAmount();
        double doubleValue5 = insAmount != null ? insAmount.doubleValue() : Utils.DOUBLE_EPSILON;
        String str = loanDetails2.loanSubType;
        C41536l.m120488h(str, "lndDetailsApiModel.loanSubType");
        BigDecimal bigDecimal = loanDetails2.nextInterest;
        double doubleValue6 = bigDecimal != null ? bigDecimal.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal bigDecimal2 = loanDetails2.nextPayment;
        double doubleValue7 = bigDecimal2 != null ? bigDecimal2.doubleValue() : Utils.DOUBLE_EPSILON;
        String str2 = loanDetails2.subTypeGroup;
        C41536l.m120488h(str2, "lndDetailsApiModel.subTypeGroup");
        boolean d2 = C41536l.m120484d(loanDetails2.smsScheme, "Y");
        boolean d3 = C41536l.m120484d(loanDetails2.isLoanReverseAllowed, "Y");
        String linkAcctNo = loanDetails.getLinkAcctNo();
        BigDecimal bigDecimal3 = loanDetails2.restAmount;
        double doubleValue8 = bigDecimal3 != null ? bigDecimal3.doubleValue() : Utils.DOUBLE_EPSILON;
        BigDecimal bigDecimal4 = loanDetails2.prePaymentCom;
        double doubleValue9 = bigDecimal4 != null ? bigDecimal4.doubleValue() : Utils.DOUBLE_EPSILON;
        String repaymentFlag = loanDetails.getRepaymentFlag();
        C41536l.m120488h(repaymentFlag, "lndDetailsApiModel.repaymentFlag");
        boolean d4 = C41536l.m120484d(loanDetails2.isReversible, "Y");
        BigDecimal bigDecimal5 = loanDetails2.loanDebt;
        double doubleValue10 = bigDecimal5 != null ? bigDecimal5.doubleValue() : Utils.DOUBLE_EPSILON;
        String fileUrl = loanDetails.getFileUrl();
        String str3 = loanDetails2.isOnlineInstallment;
        C41536l.m120488h(str3, "lndDetailsApiModel.isOnlineInstallment");
        return new C39951o(loanKey, date, date2, date3, valueOf, doubleValue, doubleValue2, doubleValue3, doubleValue4, clientKey, d, doubleValue5, str, doubleValue6, doubleValue7, str2, d2, d3, linkAcctNo, doubleValue8, doubleValue9, repaymentFlag, d4, doubleValue10, fileUrl, str3, loanDetails2.reversalStatus, loanDetails.getReversalStatusDictionaryKey(), loanDetails2.reversalStatusDictionaryValue, loanDetails2.nextFloatingRate, loanDetails2.nextLoanRateChangeDate, loanDetails2.nextSpreadRate, loanDetails2.nextMinIntRate, loanDetails2.nextLoanIntTypeName, loanDetails2.nextLoanIntTypeDictionaryKey, loanDetails2.nextLoanIntTypeDictionaryValue);
    }

    private final C39957u convert(LoanSchedule loanSchedule) {
        LoanSchedule loanSchedule2 = loanSchedule;
        String str = loanSchedule2.primaryKey;
        C41536l.m120488h(str, "loanScheduleApiModel.primaryKey");
        long loanKey = loanSchedule.getLoanKey();
        String loanNo = loanSchedule.getLoanNo();
        C41536l.m120488h(loanNo, "loanScheduleApiModel.loanNo");
        Date date = new Date(loanSchedule2.payDate);
        String ccy = loanSchedule.getCcy();
        BigDecimal priAmt = loanSchedule.getPriAmt();
        double d = Utils.DOUBLE_EPSILON;
        Double valueOf = Double.valueOf(priAmt != null ? priAmt.doubleValue() : 0.0d);
        BigDecimal intAmt = loanSchedule.getIntAmt();
        Double valueOf2 = Double.valueOf(intAmt != null ? intAmt.doubleValue() : 0.0d);
        BigDecimal feeAmt = loanSchedule.getFeeAmt();
        Double valueOf3 = Double.valueOf(feeAmt != null ? feeAmt.doubleValue() : 0.0d);
        String str2 = loanSchedule2.feeType;
        BigDecimal bigDecimal = loanSchedule2.exAmt;
        Double valueOf4 = Double.valueOf(bigDecimal != null ? bigDecimal.doubleValue() : 0.0d);
        BigDecimal totalAmt = loanSchedule.getTotalAmt();
        Double valueOf5 = Double.valueOf(totalAmt != null ? totalAmt.doubleValue() : 0.0d);
        BigDecimal nextPayAmt = loanSchedule.getNextPayAmt();
        Double valueOf6 = Double.valueOf(nextPayAmt != null ? nextPayAmt.doubleValue() : 0.0d);
        BigDecimal intAmtWithoutOffset = loanSchedule.getIntAmtWithoutOffset();
        if (intAmtWithoutOffset != null) {
            d = intAmtWithoutOffset.doubleValue();
        }
        return new C39957u(str, loanKey, loanNo, date, ccy, valueOf, valueOf2, valueOf3, str2, valueOf4, valueOf5, valueOf6, Double.valueOf(d), loanSchedule2.feeTypeDictionaryKey, loanSchedule2.feeTypeDictionaryValue);
    }

    private final C39955s convert(LoanInvoiceWrapper loanInvoiceWrapper) {
        Date date = new Date(loanInvoiceWrapper.getPaymentDate());
        BigDecimal amount = loanInvoiceWrapper.getAmount();
        double doubleValue = amount != null ? amount.doubleValue() : Utils.DOUBLE_EPSILON;
        LoanInvoice[] list = loanInvoiceWrapper.getList();
        C41536l.m120488h(list, "loanInvoiceWrapperApiModel.list");
        ArrayList arrayList = new ArrayList(list.length);
        for (LoanInvoice convert : list) {
            arrayList.add(convert(convert));
        }
        return new C39955s(date, doubleValue, arrayList);
    }

    private final C39954r convert(LoanInvoice loanInvoice) {
        long loanKey = loanInvoice.getLoanKey();
        long j = loanInvoice.paymentDate;
        String str = loanInvoice.invoiceType;
        String str2 = loanInvoice.feeType;
        String ccy = loanInvoice.getCcy();
        BigDecimal amount = loanInvoice.getAmount();
        return new C39954r(loanKey, j, str, str2, ccy, amount != null ? amount.doubleValue() : Utils.DOUBLE_EPSILON, loanInvoice.getInvoiceTypeDictionaryKey());
    }
}
