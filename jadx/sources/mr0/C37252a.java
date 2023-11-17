package mr0;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import p341ge.bog.mobilebank.loans.data.model.LoanHistoryApiModel;
import p341ge.bog.mobilebank.loans.data.model.LoanPaymentEntity;
import p341ge.bog.mobilebank.loans.data.model.LoanPlnHistoryApiModel;
import p341ge.bog.mobilebank.loans.data.model.LoanSchedulesApiModel;
import p341ge.bog.mobilebank.loans.data.model.PawnLoanApiModel;

/* renamed from: mr0.a */
public interface C37252a {
    @C40458f(".?serviceId=LOANS_GET_LOAN_REPAYMENTS")
    /* renamed from: b */
    C40762x<LoanHistoryApiModel> mo90333b(@C40472t("loanKey") long j);

    @C40458f(".?serviceId=LOANS_GET_PLN_REPAYMENTS")
    /* renamed from: c */
    C40762x<LoanPlnHistoryApiModel> mo90334c(@C40472t("loanKey") long j);

    @C40458f(".?serviceId=LOANS_SET_PLN_NAME")
    /* renamed from: d */
    C40734b mo90335d(@C40472t("loanKey") long j, @C40472t("loanName") String str, @C40472t("customerId") String str2);

    @C40458f(".?serviceId=LOANS_SET_LND_NAME")
    /* renamed from: e */
    C40734b mo90336e(@C40472t("loanKey") long j, @C40472t("loanName") String str, @C40472t("customerId") String str2);

    @C40458f(".?serviceId=LOANS_CALCULATE_AND_GET_REPAYMENT_DATA")
    /* renamed from: f */
    C40762x<LoanPaymentEntity> mo90337f(@C40472t("loanKey") long j, @C40472t("amount") String str, @C40472t("ccy") String str2, @C40472t("prodType") String str3);

    @C40458f(".?serviceId=LOANS_REPAY_LOAN")
    /* renamed from: g */
    C40734b mo90338g(@C40472t("loanKey") long j, @C40472t("amount") String str, @C40472t("ccy") String str2, @C40472t("acctKey") long j2, @C40472t("fullPrePayment") String str3, @C40472t("planType") String str4);

    @C40458f(".?serviceId=LOANS_GET_LND_SCHEDULE")
    /* renamed from: h */
    C40762x<LoanSchedulesApiModel> mo90339h(@C40472t("loanKey") long j);

    @C40458f(".?serviceId=LOANS_PROCESS_PLN_PAYMENT")
    /* renamed from: i */
    C40762x<PawnLoanApiModel> mo90340i(@C40472t("amount") String str, @C40472t("ccy") String str2, @C40472t("loanKey") String str3, @C40472t("operationType") String str4);

    @C40458f(".?serviceId=LOANS_REVERSE_LOAN")
    /* renamed from: j */
    C40734b mo90341j(@C40472t("applicationType") String str, @C40472t("productType") String str2, @C40472t("loanKey") long j, @C40472t("reversalReason") String str3);
}
