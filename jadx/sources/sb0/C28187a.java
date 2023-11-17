package sb0;

import ci1.C40456d;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositSavingGoalPurposeWrapperEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositsAndBondsEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakInfoEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakProcessValidationEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakValidationEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositLoanAgreementEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositChangeProlParametersEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationDetailsEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationPeriodEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationWithdrawalTypeEntity;

/* renamed from: sb0.a */
public interface C28187a {
    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_DEPOSIT_PURPOSES_WITH_ID")
    /* renamed from: B */
    C40762x<DepositSavingGoalPurposeWrapperEntity> mo67685B(@C40472t("prodType") String str);

    @C40457e
    @C40467o(".")
    /* renamed from: J0 */
    C40762x<DepositBreakProcessValidationEntity> mo67686J0(@C40456d HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=PFM_SAVING_GOAL_DELETE")
    /* renamed from: M */
    C40734b mo67687M(@C40472t("id") Long l);

    @C40458f(".?serviceId=LOANS_DEP_GET_AGREEMENTS")
    /* renamed from: M2 */
    C40762x<List<DepositLoanAgreementEntity>> mo67688M2();

    @C40458f(".?serviceId=DEPOSITS_GET_DEPOSIT_PROD_PERIODS")
    /* renamed from: T0 */
    C40762x<DepositProlongationPeriodEntity> mo67689T0(@C40472t("prodType") String str, @C40472t("amount") double d, @C40472t("ccy") String str2, @C40472t("startDate") long j, @C40472t("intWithPeriodType") String str3);

    @C40458f(".?serviceId=DEPOSITS_GET_PROLONG_DETAILS")
    /* renamed from: U0 */
    C40762x<DepositProlongationDetailsEntity> mo67690U0(@C40472t("agreeKey") long j);

    @C40458f(".?serviceId=DEPOSITS_BREAK_DEPOSIT_INFO")
    /* renamed from: a */
    C40762x<DepositBreakInfoEntity> mo67691a(@C40472t("agreeKey") long j, @C40472t("ccy") String str);

    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_DEPOSIT_INT_WITH_PERIOD_TYPES")
    /* renamed from: a2 */
    C40762x<List<DepositProlongationWithdrawalTypeEntity>> mo67692a2(@C40472t("prodType") String str, @C40472t("minInstallment") double d, @C40472t("ccy") String str2, @C40472t("depositTerm") long j);

    @C40458f(".?serviceId=DEPOSITS_SET_NAME")
    /* renamed from: a3 */
    C40734b mo67693a3(@C40472t("agreeKey") long j, @C40472t("name") String str);

    @C40458f(".?serviceId=COLLECTOR_GET_DEPOSITS_AND_BONDS_DETAILS_V2")
    /* renamed from: b */
    C40749p<DepositsAndBondsEntity> mo67694b();

    @C40458f(".?serviceId=DEPOSITS_CHANGE_AGREE_PROL_STATE")
    /* renamed from: c */
    C40734b mo67695c(@C40472t("agreeKey") long j, @C40472t("state") String str);

    @C40458f(".?serviceId=DEPOSITS_GET_PROLONG_AGREE_AMOUNT")
    /* renamed from: d */
    C40762x<String> mo67696d(@C40472t("agreeKey") long j, @C40472t("withdrawInterest") String str);

    @C40458f(".?serviceId=PFM_SAVING_GOAL_UPDATE")
    /* renamed from: e */
    C40734b mo67697e(@C40472t("id") Long l, @C40472t("name") String str, @C40472t("amount") Double d, @C40472t("startDate") String str2, @C40472t("endDate") String str3, @C40472t("sgcId") Long l2, @C40472t("accountId") Long l3, @C40472t("agreeKey") Long l4);

    @C40458f(".?serviceId=DEPOSITS_SET_AGREE_PROL_INFO")
    /* renamed from: f */
    C40734b mo67698f(@C40472t("amount") double d, @C40472t("name") String str, @C40472t("purpose") String str2, @C40472t("copySto") String str3, @C40472t("copyCas") String str4, @C40472t("acctKey") Long l, @C40472t("agreeType") String str5, @C40472t("agreeKey") long j, @C40472t("startDate") long j2, @C40472t("maturityDate") long j3, @C40472t("intWithPeriodType") String str6, @C40472t("withdrawInterest") String str7);

    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_PRE_CONTRACT_TEMPLATE")
    /* renamed from: f1 */
    C40762x<PreContractEntity> mo67699f1(@C40472t("depositName") String str, @C40472t("purpose") String str2, @C40472t("amount") double d, @C40472t("ccy") String str3, @C40472t("depositTerm") long j, @C40472t("depositOpenDate") long j2, @C40472t("endDate") long j3, @C40472t("intWithPeriodType") String str4, @C40472t("intWithPeriodTypeText") String str5, @C40472t("availableAmount") double d2, @C40472t("intRate") double d3, @C40472t("irr") double d4, @C40472t("prodType") String str6, @C40472t("isProlongation") int i, @C40472t("possibleProfit") double d5);

    @C40458f(".?serviceId=PFM_SAVING_GOAL_CREATE")
    /* renamed from: g */
    C40734b mo67700g(@C40472t("name") String str, @C40472t("amount") Double d, @C40472t("startingAmount") Double d2, @C40472t("startDate") String str2, @C40472t("endDate") String str3, @C40472t("sgcId") Long l, @C40472t("accountId") Long l2, @C40472t("agreeKey") Long l3);

    @C40458f(".?serviceId=DEPOSITS_CHANGE_PROL_PARAMETERS")
    /* renamed from: g1 */
    C40762x<DepositChangeProlParametersEntity> mo67701g1(@C40472t("amount") double d, @C40472t("prodType") String str, @C40472t("ccy") String str2, @C40472t("startDate") long j, @C40472t("maturityDate") long j2, @C40472t("intPeriodType") String str3);

    @C40458f(".?serviceId=DEPOSITS_PROCESS_DEPOSIT_BREAK")
    /* renamed from: n1 */
    C40734b mo67702n1(@C40472t("agreeKey") long j, @C40472t("dstAcctKey") long j2);

    @C40458f(".?serviceId=DEPOSITS_VALIDATE_DEPOSIT_BREAK")
    /* renamed from: r3 */
    C40762x<DepositBreakValidationEntity> mo67703r3(@C40472t("agreeKey") long j);
}
