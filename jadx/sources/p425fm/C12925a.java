package p425fm;

import ci1.C40455c;
import ci1.C40456d;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardApplicationTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardClientCountryInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardDailyLimitEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.CsDefaultDepartmentEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardAppAccountEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardCommissionEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardCurrencyEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardFeeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardNicknameEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardPayrollInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardPinDeliveryTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardRegTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardRegisterResultEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.RecoverCardEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.ScoolCardInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.delivery.CardDeliveryAddressesEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.delivery.DeliveryFeeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.InstantCardActivationResultEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.InstantDeliveryPointEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.ValidatedInstantCardEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.insurance.DebitCardInsuranceInfoEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: fm.a */
public interface C12925a {

    /* renamed from: fm.a$a */
    public static final class C12926a {
        /* renamed from: a */
        public static /* synthetic */ C40762x m48859a(C12925a aVar, String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, int i, Object obj) {
            String str8;
            Long l2;
            String str9;
            String str10;
            String str11;
            String str12;
            int i2 = i;
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str8 = "Y";
                } else {
                    str8 = str3;
                }
                if ((i2 & 8) != 0) {
                    l2 = null;
                } else {
                    l2 = l;
                }
                if ((i2 & 16) != 0) {
                    str9 = null;
                } else {
                    str9 = str4;
                }
                if ((i2 & 32) != 0) {
                    str10 = null;
                } else {
                    str10 = str5;
                }
                if ((i2 & 64) != 0) {
                    str11 = null;
                } else {
                    str11 = str6;
                }
                if ((i2 & 128) != 0) {
                    str12 = null;
                } else {
                    str12 = str7;
                }
                return aVar.mo33681C3(str, str2, str8, l2, str9, str10, str11, str12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDebitCardTypesRx");
        }
    }

    @C40458f(".?serviceId=CARD_GET_RECOVER_CARDS")
    /* renamed from: A1 */
    C40762x<List<RecoverCardEntity>> mo33678A1();

    @C40458f(".?serviceId=CARDS_GET_IIC_PRE_CONTRACT")
    /* renamed from: A3 */
    C40762x<PreContractEntity> mo33679A3(@C40472t("customerId") String str, @C40472t("prodType") String str2, @C40472t("accRegType") String str3, @C40472t("accountsPackage") String str4, @C40472t("cardClass") String str5, @C40472t("cardType") String str6, @C40472t("acctNumber") String str7, @C40472t("pinPhoneNumber") String str8);

    @C40458f(".")
    /* renamed from: B3 */
    C40762x<BankApiResponse<DebitCardFeeEntity>> mo33680B3(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=CARDS_APPLICATIONS_GET_CARD_TYPES_WITH_SCHOOLCARDS")
    /* renamed from: C3 */
    C40762x<List<DebitCardEntity>> mo33681C3(@C40472t("regionId") String str, @C40472t("isPayroll") String str2, @C40472t("cardLimitCheck") String str3, @C40472t("orgId") Long l, @C40472t("cardId") String str4, @C40472t("orderExpiredCard") String str5, @C40472t("orderRecoverCard") String str6, @C40472t("wishCardFlag") String str7);

    @C40458f("?serviceId=CARDS_GET_INSTANT_CARD_SERVICE_CENTERS")
    /* renamed from: D1 */
    C40762x<List<InstantDeliveryPointEntity>> mo33682D1(@C40472t("treeName") String str);

    @C40457e
    @C40467o(".")
    /* renamed from: D3 */
    C40762x<BankApiResponse<DebitCardRegisterResultEntity>> mo33683D3(@C40456d HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=CARDS_GET_CS_DEF_DEPARTMENTS")
    /* renamed from: E0 */
    C40762x<BankApiResponse<List<CsDefaultDepartmentEntity>>> mo33684E0();

    @C40458f(".")
    /* renamed from: E3 */
    C40762x<BankApiResponse<PreContractEntity>> mo33685E3(@C40473u Map<String, Object> map);

    @C40458f(".?serviceId=CARDS_APPLICATIONS_VALIDATE_AND_GET_CHILD_SCHOOLCARD")
    /* renamed from: F3 */
    C40762x<ScoolCardInfoEntity> mo33686F3(@C40472t("customerId") String str, @C40472t("childClientKey") String str2);

    @C40458f(".?serviceId=CARDS_CHECK_INSTANT_DELIVERY")
    /* renamed from: G3 */
    C40762x<YesNoApiEntity> mo33687G3(@C40472t("customerId") String str, @C40472t("product") String str2);

    @C40457e
    @C40467o(".?serviceId=CARDS_CREATE_CARD_ORDER_AGREEMENT")
    /* renamed from: H3 */
    C40734b mo33688H3(@C40472t("customerId") String str, @C40472t("cardDeliveryAddress") String str2, @C40472t("tmxSessionId") String str3, @C40472t("addressPointValue") String str4, @C40472t("product") String str5, @C40472t("templCode") String str6, @C40455c("preContractText") String str7);

    @C40458f(".?serviceId=CARDS_GET_COUNTRY_INFO")
    /* renamed from: I3 */
    C40749p<CardClientCountryInfoEntity> mo33689I3(@C40472t("customerId") String str);

    @C40458f(".?serviceId=CARDS_GET_INSTANT_CARD_AGREEMENT_CS_FEE")
    /* renamed from: J3 */
    C40762x<Double> mo33690J3(@C40472t("customerId") String str, @C40472t("addressPointValue") String str2);

    @C40458f(".?serviceId=CARDS_VALIDATE_CARD_DATA")
    /* renamed from: K1 */
    C40762x<ValidatedInstantCardEntity> mo33691K1(@C40472t("pan2") String str, @C40472t("cvv") String str2, @C40472t("expDate") String str3);

    @C40458f(".?serviceId=CARDS_GET_CLIENT_PAYROLL_ORGANIZATIONS")
    /* renamed from: V0 */
    C40762x<List<DebitCardPayrollInfoEntity>> mo33692V0();

    @C40458f(".?serviceId=CARDS_CHANGE_DAILY_LIMIT_TYPE")
    /* renamed from: W1 */
    C40734b mo33693W1(@C40473u HashMap<String, Object> hashMap);

    @C40457e
    @C40467o(".?serviceId=CARDS_REGISTER_CARD")
    /* renamed from: b0 */
    C40762x<InstantCardActivationResultEntity> mo33694b0(@C40472t("customerId") String str, @C40472t("pan2") String str2, @C40472t("cvv") String str3, @C40472t("expDate") String str4, @C40472t("mainAcctKey") Long l, @C40472t("pinDeliveryPhone") String str5, @C40455c("preContractText") String str6);

    @C40458f(".?serviceId=CARDS_GET_INSURANCE_TYPES_V2")
    /* renamed from: g2 */
    C40762x<DebitCardInsuranceInfoEntity> mo33695g2(@C40472t("customerId") String str, @C40472t("plcClass") String str2, @C40472t("plcType") String str3, @C40472t("subProductCode") String str4, @C40472t("cardId") String str5, @C40472t("childClientKey") String str6);

    @C40458f("?serviceId=CARDS_GET_CARD_AGREEMENT_CS_FEE_AMOUNT")
    /* renamed from: m2 */
    C40762x<Double> mo33696m2(@C40472t("customerId") String str, @C40472t("addressPointValue") String str2);

    @C40458f(".?serviceId=CARDS_APPLICATIONS_GET_CARD_DELIVERY_ADDRESSES")
    /* renamed from: q3 */
    C40762x<BankApiResponse<CardDeliveryAddressesEntity>> mo33697q3();

    @C40458f(".?serviceId=SCOOLCARDS_GET_DAILY_LIMIT_TYPES")
    /* renamed from: s3 */
    C40762x<List<CardDailyLimitEntity>> mo33698s3();

    @C40458f(".?serviceId=CARDS_GET_CARD_NICKNAME_INFO_BY_CLIENT")
    /* renamed from: t0 */
    C40762x<BankApiResponse<DebitCardNicknameEntity>> mo33699t0();

    @C40458f(".?serviceId=CARDS_APPLICATIONS_GET_CARD_CCY")
    /* renamed from: t3 */
    C40762x<BankApiResponse<List<DebitCardCurrencyEntity>>> mo33700t3(@C40472t("linkId") long j);

    @C40458f(".?serviceId=COMMON_CAN_CLIENT_USE_NICKNAME")
    /* renamed from: u2 */
    C40762x<BankApiResponse<YesNoApiEntity>> mo33701u2();

    @C40458f(".?serviceId=CARDS_APPLICATIONS_GET_ACCOUNTS")
    /* renamed from: u3 */
    C40762x<BankApiResponse<List<DebitCardAppAccountEntity>>> mo33702u3(@C40472t("cardType") String str, @C40472t("cardClass") String str2, @C40472t("isPayroll") String str3);

    @C40458f(".?serviceId=CARDS_APPLICATIONS_GET_REG_TYPES")
    /* renamed from: v3 */
    C40762x<BankApiResponse<List<DebitCardRegTypeEntity>>> mo33703v3();

    @C40458f(".?serviceId=CARDS_GET_CUSTOMER_CARD_APPLICATION_TYPES")
    /* renamed from: w3 */
    C40762x<List<CardApplicationTypeEntity>> mo33704w3();

    @C40458f(".?serviceId=CARDS_GET_CS_CARD_TYPE_INFO")
    /* renamed from: x3 */
    C40762x<BankApiResponse<DeliveryFeeEntity>> mo33705x3(@C40472t("cardClass") String str, @C40472t("cardType") String str2, @C40472t("cardForType") String str3);

    @C40458f(".?serviceId=CARDS_GET_PIN_DELIVERY_TYPES")
    /* renamed from: y3 */
    C40762x<BankApiResponse<List<DebitCardPinDeliveryTypeEntity>>> mo33706y3(@C40472t("cardClass") String str, @C40472t("cardType") String str2);

    @C40458f(".?serviceId=CARDS_GET_VIRTUAL_CARD_COMMISSION")
    /* renamed from: z3 */
    C40762x<DebitCardCommissionEntity> mo33707z3(@C40472t("digitalCard") String str, @C40472t("regType") String str2, @C40472t("product") String str3);
}
