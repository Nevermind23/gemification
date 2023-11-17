package p341ge.bog.mobilebank.cleanarch.data.creditinfo;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.StatusEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditinfo.entity.CreditInfoContractEntity;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p710av.C19278a;
import p720bv.C19412a;
import p799js.C25482a;
import p799js.C25483b;
import p809ks.C25763a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl */
public final class CreditInfoRepositoryImpl implements C19412a {

    /* renamed from: c */
    public static final C20993a f56443c = new C20993a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f56444a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25763a f56445b;

    @Keep
    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl$ConfirmCriParams */
    public static final class ConfirmCriParams extends OtpParams {
        private final String clientType;
        private final String criTextFileContent;
        private final String documentTemplateVersion;
        private final String operationId;
        private final String operationReference;
        private final String productType;
        private final String scaAuthCode;
        private final String serviceId;
        private final String serviceKey;
        private final String serviceStatus;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ConfirmCriParams(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r9 = r2
                goto L_0x000b
            L_0x0009:
                r9 = r19
            L_0x000b:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0011
                r10 = r2
                goto L_0x0013
            L_0x0011:
                r10 = r20
            L_0x0013:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0019
                r11 = r2
                goto L_0x001b
            L_0x0019:
                r11 = r21
            L_0x001b:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0023
                java.lang.String r0 = "CLIENTS_CONFIRMATION_ON_CREDIT_INFO"
                r12 = r0
                goto L_0x0025
            L_0x0023:
                r12 = r22
            L_0x0025:
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r8 = r18
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl.ConfirmCriParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ ConfirmCriParams copy$default(ConfirmCriParams confirmCriParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            ConfirmCriParams confirmCriParams2 = confirmCriParams;
            int i2 = i;
            return confirmCriParams.copy((i2 & 1) != 0 ? confirmCriParams2.criTextFileContent : str, (i2 & 2) != 0 ? confirmCriParams2.serviceStatus : str2, (i2 & 4) != 0 ? confirmCriParams2.serviceKey : str3, (i2 & 8) != 0 ? confirmCriParams2.productType : str4, (i2 & 16) != 0 ? confirmCriParams2.documentTemplateVersion : str5, (i2 & 32) != 0 ? confirmCriParams2.operationId : str6, (i2 & 64) != 0 ? confirmCriParams2.operationReference : str7, (i2 & 128) != 0 ? confirmCriParams2.scaAuthCode : str8, (i2 & C11398b.f33139r) != 0 ? confirmCriParams2.serviceId : str9);
        }

        public final String component1() {
            return this.criTextFileContent;
        }

        public final String component2() {
            return this.serviceStatus;
        }

        public final String component3() {
            return this.serviceKey;
        }

        public final String component4() {
            return this.productType;
        }

        public final String component5() {
            return this.documentTemplateVersion;
        }

        public final String component6() {
            return this.operationId;
        }

        public final String component7() {
            return this.operationReference;
        }

        public final String component8() {
            return this.scaAuthCode;
        }

        public final String component9() {
            return this.serviceId;
        }

        public final ConfirmCriParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            C41536l.m120489i(str, "criTextFileContent");
            C41536l.m120489i(str2, "serviceStatus");
            C41536l.m120489i(str3, "serviceKey");
            C41536l.m120489i(str4, "productType");
            String str10 = str5;
            C41536l.m120489i(str10, "documentTemplateVersion");
            String str11 = str9;
            C41536l.m120489i(str11, IRetrofitService.SERVICE_ID);
            return new ConfirmCriParams(str, str2, str3, str4, str10, str6, str7, str8, str11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmCriParams)) {
                return false;
            }
            ConfirmCriParams confirmCriParams = (ConfirmCriParams) obj;
            return C41536l.m120484d(this.criTextFileContent, confirmCriParams.criTextFileContent) && C41536l.m120484d(this.serviceStatus, confirmCriParams.serviceStatus) && C41536l.m120484d(this.serviceKey, confirmCriParams.serviceKey) && C41536l.m120484d(this.productType, confirmCriParams.productType) && C41536l.m120484d(this.documentTemplateVersion, confirmCriParams.documentTemplateVersion) && C41536l.m120484d(this.operationId, confirmCriParams.operationId) && C41536l.m120484d(this.operationReference, confirmCriParams.operationReference) && C41536l.m120484d(this.scaAuthCode, confirmCriParams.scaAuthCode) && C41536l.m120484d(this.serviceId, confirmCriParams.serviceId);
        }

        public final String getClientType() {
            return this.clientType;
        }

        public final String getCriTextFileContent() {
            return this.criTextFileContent;
        }

        public final String getDocumentTemplateVersion() {
            return this.documentTemplateVersion;
        }

        public String getOperationId() {
            return this.operationId;
        }

        public String getOperationReference() {
            return this.operationReference;
        }

        public final String getProductType() {
            return this.productType;
        }

        public String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public String getServiceId() {
            return this.serviceId;
        }

        public final String getServiceKey() {
            return this.serviceKey;
        }

        public final String getServiceStatus() {
            return this.serviceStatus;
        }

        public int hashCode() {
            int hashCode = ((((((((this.criTextFileContent.hashCode() * 31) + this.serviceStatus.hashCode()) * 31) + this.serviceKey.hashCode()) * 31) + this.productType.hashCode()) * 31) + this.documentTemplateVersion.hashCode()) * 31;
            String str = this.operationId;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.operationReference;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.scaAuthCode;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((hashCode3 + i) * 31) + this.serviceId.hashCode();
        }

        public String toString() {
            String str = this.criTextFileContent;
            String str2 = this.serviceStatus;
            String str3 = this.serviceKey;
            String str4 = this.productType;
            String str5 = this.documentTemplateVersion;
            String str6 = this.operationId;
            String str7 = this.operationReference;
            String str8 = this.scaAuthCode;
            String str9 = this.serviceId;
            return "ConfirmCriParams(criTextFileContent=" + str + ", serviceStatus=" + str2 + ", serviceKey=" + str3 + ", productType=" + str4 + ", documentTemplateVersion=" + str5 + ", operationId=" + str6 + ", operationReference=" + str7 + ", scaAuthCode=" + str8 + ", serviceId=" + str9 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ConfirmCriParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            super(str9, str7, str8, (String) null, 8, (DefaultConstructorMarker) null);
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str9;
            C41536l.m120489i(str, "criTextFileContent");
            C41536l.m120489i(str10, "serviceStatus");
            C41536l.m120489i(str11, "serviceKey");
            C41536l.m120489i(str12, "productType");
            C41536l.m120489i(str13, "documentTemplateVersion");
            C41536l.m120489i(str14, IRetrofitService.SERVICE_ID);
            this.criTextFileContent = str;
            this.serviceStatus = str10;
            this.serviceKey = str11;
            this.productType = str12;
            this.documentTemplateVersion = str13;
            this.operationId = str6;
            this.operationReference = str7;
            this.scaAuthCode = str8;
            this.serviceId = str14;
            this.clientType = PensionStatusResult.STATUS_INACTIVE;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl$a */
    public static final class C20993a {
        private C20993a() {
        }

        public /* synthetic */ C20993a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl$b */
    static final class C20994b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditInfoRepositoryImpl f56446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20994b(CreditInfoRepositoryImpl creditInfoRepositoryImpl) {
            super(1);
            this.f56446d = creditInfoRepositoryImpl;
        }

        /* renamed from: a */
        public final C19278a invoke(CreditInfoContractEntity creditInfoContractEntity) {
            C41536l.m120489i(creditInfoContractEntity, "it");
            return this.f56446d.f56445b.mo64346a(creditInfoContractEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl$c */
    static final class C20995c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditInfoRepositoryImpl f56447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20995c(CreditInfoRepositoryImpl creditInfoRepositoryImpl) {
            super(1);
            this.f56447d = creditInfoRepositoryImpl;
        }

        /* renamed from: a */
        public final C19278a invoke(CreditInfoContractEntity creditInfoContractEntity) {
            C41536l.m120489i(creditInfoContractEntity, "it");
            return this.f56447d.f56445b.mo64346a(creditInfoContractEntity);
        }
    }

    public CreditInfoRepositoryImpl(IRetrofitService iRetrofitService, C25763a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f56444a = iRetrofitService;
        this.f56445b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C19278a m67999f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C19278a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C19278a m68000g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C19278a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo47642a() {
        C40762x<BankApiResponse<CreditInfoContractEntity>> creditInfoContract = this.f56444a.getCreditInfoContract("COMMON_GET_CONTRACT", "CREDIT_INFO_CHECK_PERMISSION_OFFERS");
        C41536l.m120488h(creditInfoContract, "service.getCreditInfoCon…RMISSION_OFFERS\n        )");
        C40762x A = C19273c.m64722h(creditInfoContract).mo95062A(new C25483b(new C20995c(this)));
        C41536l.m120488h(A, "override fun getContract…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: b */
    public C40762x mo47643b(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x<BankApiResponse<Object>> useOtpForActionSinglePost = this.f56444a.useOtpForActionSinglePost(hashMap);
        C41536l.m120488h(useOtpForActionSinglePost, "service.useOtpForActionSinglePost(params)");
        C40734b f = C19273c.m64720f(useOtpForActionSinglePost);
        StatusEntity statusEntity = StatusEntity.ACTIVE;
        if (!C41536l.m120484d(statusEntity.getValue(), hashMap.get("serviceStatus"))) {
            statusEntity = StatusEntity.INACTIVE;
        }
        C40762x g = f.mo94898g(C40762x.m118162z(statusEntity));
        C41536l.m120488h(g, "service.useOtpForActionS…          )\n            )");
        return g;
    }

    public C40762x getContract(String str) {
        C41536l.m120489i(str, "contractType");
        C40762x<BankApiResponse<CreditInfoContractEntity>> creditInfoContract = this.f56444a.getCreditInfoContract("COMMON_GET_CONTRACT", str);
        C41536l.m120488h(creditInfoContract, "service.getCreditInfoCon…   contractType\n        )");
        C40762x A = C19273c.m64722h(creditInfoContract).mo95062A(new C25482a(new C20994b(this)));
        C41536l.m120488h(A, "override fun getContract…per.transform(it) }\n    }");
        return A;
    }
}
