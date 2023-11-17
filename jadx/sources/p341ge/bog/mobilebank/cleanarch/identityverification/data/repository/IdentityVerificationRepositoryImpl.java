package p341ge.bog.mobilebank.cleanarch.identityverification.data.repository;

import androidx.annotation.Keep;
import ed1.C40734b;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.identityverification.data.entity.VerificationProcessDataEntity;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p824lx.C26095a;
import p834mx.C26310a;
import p854ox.C27093a;
import p864px.C27639a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.identityverification.data.repository.IdentityVerificationRepositoryImpl */
public final class IdentityVerificationRepositoryImpl implements C27639a {

    /* renamed from: c */
    public static final C21048a f56548c = new C21048a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f56549a;

    /* renamed from: b */
    private final C26095a f56550b;

    @Keep
    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.data.repository.IdentityVerificationRepositoryImpl$IdentityVerificationParams */
    public static final class IdentityVerificationParams extends OtpParams {
        private final String authElements;
        private final boolean isVerificationAfterLogin;
        private final String operationId;
        private final String operationReference;
        private final String qrType;
        private final String regularOperationReference;
        private final String scaAuthCode;
        private final String serviceId;
        private final String tmxSessionId;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ IdentityVerificationParams(boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000b
            L_0x0009:
                r6 = r16
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r7 = r2
                goto L_0x0013
            L_0x0011:
                r7 = r17
            L_0x0013:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0019
                r10 = r2
                goto L_0x001b
            L_0x0019:
                r10 = r20
            L_0x001b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0021
                r11 = r2
                goto L_0x0023
            L_0x0021:
                r11 = r21
            L_0x0023:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0029
                r12 = r2
                goto L_0x002b
            L_0x0029:
                r12 = r22
            L_0x002b:
                r3 = r13
                r4 = r14
                r5 = r15
                r8 = r18
                r9 = r19
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.identityverification.data.repository.IdentityVerificationRepositoryImpl.IdentityVerificationParams.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getAuthElements() {
            return this.authElements;
        }

        public String getOperationId() {
            return this.operationId;
        }

        public String getOperationReference() {
            return this.operationReference;
        }

        public final String getQrType() {
            return this.qrType;
        }

        public final String getRegularOperationReference() {
            return this.regularOperationReference;
        }

        public String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public String getServiceId() {
            return this.serviceId;
        }

        public final String getTmxSessionId() {
            return this.tmxSessionId;
        }

        public final boolean isVerificationAfterLogin() {
            return this.isVerificationAfterLogin;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IdentityVerificationParams(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(str5, str7, str8, (String) null, 8, (DefaultConstructorMarker) null);
            String str9 = str5;
            C41536l.m120489i(str, "authElements");
            C41536l.m120489i(str9, IRetrofitService.SERVICE_ID);
            this.isVerificationAfterLogin = z;
            this.authElements = str;
            this.regularOperationReference = str2;
            this.qrType = str3;
            this.tmxSessionId = str4;
            this.serviceId = str9;
            this.operationId = str6;
            this.operationReference = str7;
            this.scaAuthCode = str8;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.data.repository.IdentityVerificationRepositoryImpl$a */
    public static final class C21048a {
        private C21048a() {
        }

        public /* synthetic */ C21048a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.data.repository.IdentityVerificationRepositoryImpl$b */
    static final class C21049b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationRepositoryImpl f56551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21049b(IdentityVerificationRepositoryImpl identityVerificationRepositoryImpl) {
            super(1);
            this.f56551d = identityVerificationRepositoryImpl;
        }

        /* renamed from: a */
        public final C27093a invoke(VerificationProcessDataEntity verificationProcessDataEntity) {
            C41536l.m120489i(verificationProcessDataEntity, "it");
            return this.f56551d.mo52244e().mo65013a(verificationProcessDataEntity);
        }
    }

    public IdentityVerificationRepositoryImpl(IRetrofitService iRetrofitService, C26095a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f56549a = iRetrofitService;
        this.f56550b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C27093a m68128d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27093a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo52242a(IdentityVerificationParams identityVerificationParams) {
        C41536l.m120489i(identityVerificationParams, "params");
        C40762x<BankApiResponse<Object>> verifyIdentity = this.f56549a.verifyIdentity(identityVerificationParams.getServiceId(), identityVerificationParams.getRegularOperationReference(), Boolean.valueOf(identityVerificationParams.isVerificationAfterLogin()), identityVerificationParams.getAuthElements(), identityVerificationParams.getQrType(), identityVerificationParams.getOperationId(), identityVerificationParams.getOperationReference(), identityVerificationParams.getScaAuthCode());
        C41536l.m120488h(verifyIdentity, "service.verifyIdentity(\n…ms.scaAuthCode,\n        )");
        return C19273c.m64720f(verifyIdentity);
    }

    /* renamed from: b */
    public C40762x mo52243b(String str) {
        C41536l.m120489i(str, "operationReference");
        C40762x<BankApiResponse<VerificationProcessDataEntity>> identityVerificationProcessData = this.f56549a.identityVerificationProcessData("IDENTITY_GET_LOGIN_REDIRECT_PROCESS_DATA", str);
        C41536l.m120488h(identityVerificationProcessData, "service.identityVerifica…rationReference\n        )");
        C40762x A = C19273c.m64722h(identityVerificationProcessData).mo95062A(new C26310a(new C21049b(this)));
        C41536l.m120488h(A, "override fun getIdentity…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: e */
    public final C26095a mo52244e() {
        return this.f56550b;
    }
}
