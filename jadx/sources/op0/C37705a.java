package op0;

import ci1.C40455c;
import ci1.C40456d;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.loanactivation.data.entity.LoanAccountEntity;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.LimitLoanDecisionApiModel;

/* renamed from: op0.a */
public interface C37705a {

    /* renamed from: op0.a$a */
    public static final class C37706a {
        /* renamed from: a */
        public static /* synthetic */ C40762x m110823a(C37705a aVar, Double d, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Integer num3, Double d2, Double d3, String str8, Long l2, String str9, String str10, int i, Object obj) {
            String str11;
            if (obj == null) {
                if ((i & 131072) != 0) {
                    str11 = "";
                } else {
                    str11 = str10;
                }
                return aVar.mo90905e(d, str, num, num2, str2, str3, str4, str5, str6, str7, l, num3, d2, d3, str8, l2, str9, str11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicationPreContract");
        }
    }

    @C40458f(".?serviceId=OFFERS_IDENTIFY_CREDITOR")
    /* renamed from: a */
    C40734b mo90901a();

    @C40458f(".?serviceId=OFFERS_GET_LIMIT_LOAN_DECISION&terminal=123")
    /* renamed from: b */
    C40762x<LimitLoanDecisionApiModel> mo90902b(@C40472t("limitId") String str, @C40472t("operationType") String str2);

    @C40457e
    @C40467o(".?serviceId=OFFERS_CHECK_LIMIT_LOAN_DECISION&terminal=123")
    /* renamed from: c */
    C40762x<LimitLoanDecisionApiModel> mo90903c(@C40472t("decNo") Long l, @C40472t("decisionScheme") String str, @C40472t("operationType") String str2, @C40472t("cardPan") String str3, @C40472t("loanCcy") String str4, @C40472t("loanTerm") Integer num, @C40472t("payDay") Integer num2, @C40455c("refinanceInfo") String str5, @C40472t("insIncFlag") String str6, @C40472t("providerId") String str7, @C40472t("loanAmount") Double d, @C40472t("downPaymentAcctKey") Long l2);

    @C40458f(".?serviceId=CARDS_GET_CARDS_FOR_LOAN_OFFER ")
    /* renamed from: d */
    C40762x<List<LoanAccountEntity>> mo90904d(@C40472t("ccy") String str);

    @C40458f(".?serviceId=OFFERS_GET_LND_PRE_CONTRACT_TEMPLATE")
    /* renamed from: e */
    C40762x<PreContractEntity> mo90905e(@C40472t("loanAmount") Double d, @C40472t("loanCcy") String str, @C40472t("loanTerm") Integer num, @C40472t("payDay") Integer num2, @C40472t("limitCategory") String str2, @C40472t("decisionScheme") String str3, @C40472t("operationType") String str4, @C40472t("insIncFlag") String str5, @C40472t("providerId") String str6, @C40472t("refinanceInfo") String str7, @C40472t("decNo") Long l, @C40472t("conditionDays") Integer num3, @C40472t("drawAmount") Double d2, @C40472t("drawAmount2") Double d3, @C40472t("prodType") String str8, @C40472t("downPaymentAcctKey") Long l2, @C40472t("cardPan") String str9, @C40472t("terminal") String str10);

    @C40457e
    @C40467o(".?serviceId=OFFERS_PROCESS_LOAN_REGISTRATION")
    C40734b registerLoan(@C40456d HashMap<String, Object> hashMap);
}
