package fa0;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.DepositTypeDetailsEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.InterestRateEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.PurposeEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.WithdrawalTypeEntity;

/* renamed from: fa0.a */
public interface C20456a {
    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_DEPOSIT_TYPES")
    /* renamed from: a */
    C40762x<List<DepositTypeDetailsEntity>> mo48975a();

    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_INTEREST_RATE")
    /* renamed from: b */
    C40762x<InterestRateEntity> mo48976b(@C40472t("prodType") String str, @C40472t("amount") String str2, @C40472t("ccy") String str3, @C40472t("intWithPeriodType") String str4, @C40472t("depositTerm") String str5);

    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_INTEREST_TERM")
    /* renamed from: c */
    C40762x<InterestRateEntity> mo48977c(@C40472t("prodType") String str, @C40472t("amount") String str2, @C40472t("ccy") String str3, @C40472t("intWithPeriodType") String str4, @C40472t("depositTerm") String str5, @C40472t("endDate") String str6);

    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_DEPOSIT_PURPOSES")
    /* renamed from: d */
    C40762x<PurposeEntity> mo48978d(@C40472t("prodType") String str);

    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_DEPOSIT_CCY")
    /* renamed from: e */
    C40762x<List<String>> mo48979e(@C40472t("prodType") String str);

    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_DEPOSIT_INT_WITH_PERIOD_TYPES")
    /* renamed from: f */
    C40762x<List<WithdrawalTypeEntity>> mo48980f(@C40472t("prodType") String str, @C40472t("minInstallment") String str2, @C40472t("ccy") String str3, @C40472t("depositTerm") String str4);

    @C40458f(".?serviceId=DEPOSITS_APPLICATIONS_GET_PRE_CONTRACT_TEMPLATE")
    /* renamed from: g */
    C40762x<PreContractEntity> mo48981g(@C40472t("depositName") String str, @C40472t("purpose") String str2, @C40472t("amount") String str3, @C40472t("ccy") String str4, @C40472t("depositTerm") String str5, @C40472t("depositOpenDate") Long l, @C40472t("endDate") Long l2, @C40472t("intWithPeriodType") String str6, @C40472t("intWithPeriodTypeText") String str7, @C40472t("depositAccount") String str8, @C40472t("availableAmount") String str9, @C40472t("intRate") Double d, @C40472t("possibleProfit") Double d2, @C40472t("irr") Double d3, @C40472t("prodType") String str10, @C40472t("depositProdType") String str11);
}
