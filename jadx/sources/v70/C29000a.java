package v70;

import ci1.C40455c;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import com.salesforce.marketingcloud.C11398b;
import ed1.C40734b;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.consumerloanapplication.data.creditinfo.entity.CreditInfoStatusEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity.AttachmentInfoApiModel;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.ClaDataEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.LoanCalculationEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.LoanTypeEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.lookup.entity.CountryEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.lookup.entity.OrganizationEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.ApplicationSalaryInfoEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.LoanPrepareApplicationEntity;

/* renamed from: v70.a */
public interface C29000a {

    /* renamed from: v70.a$a */
    public static final class C29001a {
        /* renamed from: a */
        public static /* synthetic */ C40762x m88728a(C29000a aVar, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, int i, Object obj) {
            String str9;
            if (obj == null) {
                if ((i & C11398b.f33139r) != 0) {
                    str9 = "";
                } else {
                    str9 = str8;
                }
                return aVar.mo68843K(str, str2, str3, str4, str5, str6, bool, str7, str9);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareApplication");
        }

        /* renamed from: b */
        public static /* synthetic */ C40762x m88729b(C29000a aVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    str5 = "";
                }
                return aVar.mo68840H(str, str2, str3, str4, str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateApplication");
        }
    }

    @C40458f(".?serviceId=APPLICATIONS_GET_GEOSTAT_CUSTOMERS")
    /* renamed from: F */
    C40762x<List<OrganizationEntity>> mo68838F(@C40472t("searchWord") String str);

    @C40457e
    @C40467o(".?serviceId=CLIENTS_CONFIRMATION_ON_CREDIT_INFO_V2")
    /* renamed from: G */
    C40734b mo68839G(@C40455c("criInfoServiceKey") String str, @C40455c("criInfoTextFileContent") String str2, @C40455c("infoDocumentTemplateVersion") String str3, @C40455c("criOfferServiceKey") String str4, @C40455c("criOfferTextFileContent") String str5, @C40455c("remitanceServiceKey") String str6, @C40455c("remitanceOfferContent") String str7, @C40455c("remitenceFileTemplateVersion") String str8, @C40455c("offerDocumentTemplateVersion") String str9, @C40455c("serviceStatus") String str10, @C40455c("clientType") String str11);

    @C40457e
    @C40467o(".?serviceId=LOANS_UPDATE_APPLICATION_DATA_V2")
    /* renamed from: H */
    C40762x<LoanPrepareApplicationEntity> mo68840H(@C40472t("applicationType") String str, @C40472t("product") String str2, @C40472t("applicationId") String str3, @C40455c("applicationData") String str4, @C40472t("terminalId") String str5);

    @C40457e
    @C40467o(".?serviceId=LOANS_UPLOAD_APP_FILE")
    /* renamed from: I */
    C40734b mo68841I(@C40472t("applicationId") Long l, @C40455c("attachments") String str);

    @C40458f(".?serviceId=COMMON_GET_EXT_SERVICE_STATUS_V2")
    /* renamed from: J */
    C40762x<List<CreditInfoStatusEntity>> mo68842J(@C40472t("serviceKey") String str);

    @C40457e
    @C40467o(".?serviceId=LOANS_PREPARE_APPLICATION_V2")
    /* renamed from: K */
    C40762x<LoanPrepareApplicationEntity> mo68843K(@C40472t("applicationType") String str, @C40472t("product") String str2, @C40472t("subProduct") String str3, @C40472t("loanAmount") String str4, @C40472t("loanCurrency") String str5, @C40472t("term") String str6, @C40472t("approveForRSCustomerInfo") Boolean bool, @C40455c("approveForRSCustomerInfoDocument") String str7, @C40472t("terminalId") String str8);

    @C40458f(".?serviceId=COMMON_GET_COUNTRY_CODES")
    /* renamed from: a */
    C40762x<List<CountryEntity>> mo68844a();

    @C40458f(".?serviceId=COMMON_GET_FILE_ATTACHMENT_INFO")
    /* renamed from: b */
    C40762x<AttachmentInfoApiModel> mo68845b(@C40472t("attachmentType") String str);

    @C40458f(".?serviceId=LOANS_GET_LOAN_TYPES")
    /* renamed from: c */
    C40762x<List<LoanTypeEntity>> mo68846c();

    @C40458f(".?serviceId=APPLICATIONS_GET_APPLICANT_SALARY")
    /* renamed from: d */
    C40762x<List<ApplicationSalaryInfoEntity>> mo68847d(@C40472t("applicationId") String str);

    @C40458f(".?serviceId=LOANS_GET_PRODUCT_RESTRICTS_AND_STRUCTURES")
    /* renamed from: e */
    C40762x<ClaDataEntity> mo68848e(@C40472t("product") String str, @C40472t("subProduct") String str2);

    @C40458f(".?serviceId=CALCULATOR_CALCULATE_LOAN_PAYMENT")
    /* renamed from: f */
    C40762x<LoanCalculationEntity> mo68849f(@C40472t("principalAmount") String str, @C40472t("paymentCount") String str2);
}
