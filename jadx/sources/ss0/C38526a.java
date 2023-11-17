package ss0;

import ci1.C40455c;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40762x;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusAccountEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusDepositAccountEntity;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.MoneyBoxTariffApiEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.OpenMoneyBoxResultEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasHistoryItemEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasServiceInfoEntity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.PiggyBankPausePeriodEntity;

/* renamed from: ss0.a */
public interface C38526a {
    @C40458f(".?serviceId=CAS_GET_ACCOUNTS_LOV")
    /* renamed from: K */
    C40762x<List<BonusAccountEntity>> mo92093K();

    @C40457e
    @C40467o(".?serviceId=CAS_OPEN_AGREEMENT")
    /* renamed from: L */
    C40762x<OpenMoneyBoxResultEntity> mo92094L(@C40472t("customerId") Long l, @C40472t("amount") String str, @C40472t("ccy") String str2, @C40472t("acctKeys") String str3, @C40455c("preContractText") String str4);

    @C40458f(".?serviceId=CAS_CLOSE_AGREEMENT")
    /* renamed from: O */
    C40734b mo92095O(@C40472t("customerId") long j, @C40472t("clientServiceId") long j2, @C40472t("dstAccount") Long l);

    @C40458f(".?serviceId=CAS_GET_LAST_YEAR_STATEMENT_SUMMARY")
    /* renamed from: Q */
    C40762x<List<CasHistoryItemEntity>> mo92096Q(@C40472t("clientServiceId") long j);

    @C40458f(".?serviceId=CAS_GET_PRE_CONTRACT")
    /* renamed from: Y */
    C40762x<PreContractEntity> mo92097Y(@C40472t("customerId") long j, @C40472t("newCas") String str, @C40472t("acctKeys") String str2, @C40472t("amount") String str3, @C40472t("depositNo") String str4, @C40472t("depositAccount") String str5);

    @C40458f(".?serviceId=BONUSES_CONVERT_TO_PLUS_POINTS")
    /* renamed from: a */
    C40762x<BigDecimal> mo92098a(@C40472t("sellPoints") double d);

    @C40458f(".")
    /* renamed from: b */
    C40734b mo92099b(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=CAS_CLOSE")
    /* renamed from: c */
    C40734b mo92100c(@C40472t("clientServiceId") Long l);

    @C40458f(".?serviceId=CAS_RESUME_AGREEMENT")
    /* renamed from: d */
    C40734b mo92101d(@C40472t("customerId") long j, @C40472t("clientServiceId") long j2);

    @C40458f(".?serviceId=CAS_GET_CLIENT_SERVICE_INFO")
    /* renamed from: e */
    C40762x<CasServiceInfoEntity> mo92102e();

    @C40458f(".?serviceId=CAS_GET_PAUSE_PERIODS")
    /* renamed from: f */
    C40762x<List<PiggyBankPausePeriodEntity>> mo92103f();

    @C40458f(".?serviceId=CAS_GET_TARIFFS")
    /* renamed from: g */
    C40762x<List<MoneyBoxTariffApiEntity>> mo92104g(@C40472t("agreeType") String str);

    @C40458f(".?serviceId=CAS_EDIT_AGREEMENT")
    /* renamed from: g0 */
    C40734b mo92105g0(@C40472t("customerId") long j, @C40472t("clientServiceId") String str, @C40472t("amount") double d, @C40472t("ccy") String str2, @C40472t("acctKeys") String str3);

    @C40458f(".?serviceId=CAS_PAUSE_AGREEMENT")
    /* renamed from: h */
    C40734b mo92106h(@C40472t("customerId") long j, @C40472t("clientServiceId") long j2, @C40472t("startDate") String str, @C40472t("endDate") String str2);

    @C40458f(".?serviceId=BONUSES_GET_PLUS_BNS_RATE")
    /* renamed from: i */
    C40762x<BigDecimal> mo92107i(@C40472t("productType") String str, @C40472t("bonusType") String str2);

    @C40458f(".?serviceId=CLIENTS_GET_CLIENT_INITIALS_BY_PIN")
    /* renamed from: j */
    C40762x<String> mo92108j(@C40472t("pin") String str);

    @C40458f(".?serviceId=CAS_GET_AVAILABLE_DEPOSITS")
    /* renamed from: l */
    C40762x<List<BonusDepositAccountEntity>> mo92109l();

    @C40458f(".?serviceId=CAS_REGISTER_EDIT")
    /* renamed from: r */
    C40734b mo92110r(@C40472t("agreeKey") long j, @C40472t("ccy") String str, @C40472t("amount") String str2, @C40472t("acctKeys") String str3, @C40472t("clientServiceId") Long l);
}
