package yq0;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.loanoffers.data.entity.securedloans.ExternalLoanPropertyEntity;
import p341ge.bog.mobilebank.loanoffers.data.entity.securedloans.LoanPropertyEntity;

/* renamed from: yq0.a */
public interface C40046a {
    @C40458f(".?serviceId=LOANS_GET_PRI_OWNERS")
    /* renamed from: a */
    C40762x<ExternalLoanPropertyEntity> mo93919a(@C40472t("cadastreCode") String str);

    @C40458f(".?serviceId=LOANS_GET_PRI_PROPERTIES")
    /* renamed from: b */
    C40762x<List<LoanPropertyEntity>> mo93920b();

    @C40458f(".?serviceId=LOANS_PREPARE_IPO_APPLICATION_V2")
    /* renamed from: c */
    C40734b mo93921c(@C40472t("applicationType") String str, @C40472t("product") String str2, @C40472t("subProduct") String str3, @C40472t("loanAmount") String str4, @C40472t("loanCurrency") String str5, @C40472t("collateralInfo") String str6, @C40472t("nomination") String str7);
}
