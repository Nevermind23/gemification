package p733cz;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsAndCurrenciesApiEntity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferApiEntity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferTypeApiEntity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.RemittanceCreditInfoContractApiModel;
import p341ge.bog.mobilebank.model.CcyRatesWrapper;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: cz.a */
public interface C19811a {
    @C40458f(".?serviceId=UMTS_FIND_TRANSFER_NEW")
    /* renamed from: a */
    C40762x<List<MoneyTransferApiEntity>> mo48105a(@C40472t("mtSystemName") String str, @C40472t("transferNumber") String str2, @C40472t("transferCurrency") String str3);

    @C40458f(".?serviceId=UMTS_FIND_UNIVERSAL_TRANSFER")
    /* renamed from: b */
    C40762x<List<MoneyTransferApiEntity>> mo48106b(@C40472t("transferNumber") String str);

    @C40458f(".?serviceId=CCY_GET_OFFICIAL_AND_COMMERCIAL_RATES")
    /* renamed from: c */
    C40762x<BankApiResponse<CcyRatesWrapper>> mo48107c(@C40472t("all") int i, @C40472t("getMidRates") int i2);

    @C40458f(".?serviceId=UMTS_GET_ACCOUNTS_AND_CCYS&forSending=0")
    /* renamed from: d */
    C40762x<BankApiResponse<TransferAccountsAndCurrenciesApiEntity>> mo48108d(@C40472t("amount") double d, @C40472t("ccy") String str, @C40472t("countryCode") String str2);

    @C40458f(".?serviceId=UMTS_GET_MT_SYSTEMS&includeLogos=1")
    /* renamed from: e */
    C40762x<List<MoneyTransferTypeApiEntity>> mo48109e();

    @C40458f(".?serviceId=UMTS_GET_CREDIT_INFO_CONTRACT")
    C40762x<RemittanceCreditInfoContractApiModel> getCreditInfoContract(@C40472t("mtSystemName") String str, @C40472t("senderCountry") String str2);
}
