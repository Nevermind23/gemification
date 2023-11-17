package p341ge.bog.mobilebank.transportcard.domain.interactor;

import androidx.annotation.Keep;
import ed1.C40762x;
import java.util.HashMap;
import k71.C36888a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: ge.bog.mobilebank.transportcard.domain.interactor.PurchasePassUseCase */
public final class PurchasePassUseCase {

    /* renamed from: a */
    private final C36888a f84443a;

    @Keep
    /* renamed from: ge.bog.mobilebank.transportcard.domain.interactor.PurchasePassUseCase$Param */
    public static final class Param extends OtpParams {
        private final Long chargeAccountKey;
        private final String deviceId;
        private final String deviceType;
        private final String operationId;
        private final String operationReference;
        private final String scaAuthCode;
        private final String serviceId;
        private final String typeId;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Param(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
            /*
                r12 = this;
                r0 = r21
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r4 = r2
                goto L_0x000a
            L_0x0009:
                r4 = r13
            L_0x000a:
                r1 = r0 & 2
                if (r1 == 0) goto L_0x0010
                r5 = r2
                goto L_0x0011
            L_0x0010:
                r5 = r14
            L_0x0011:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0017
                r9 = r2
                goto L_0x0019
            L_0x0017:
                r9 = r18
            L_0x0019:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x001f
                r10 = r2
                goto L_0x0021
            L_0x001f:
                r10 = r19
            L_0x0021:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0027
                r11 = r2
                goto L_0x0029
            L_0x0027:
                r11 = r20
            L_0x0029:
                r3 = r12
                r6 = r15
                r7 = r16
                r8 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transportcard.domain.interactor.PurchasePassUseCase.Param.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ Param copy$default(Param param, String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, int i, Object obj) {
            Param param2 = param;
            int i2 = i;
            return param.copy((i2 & 1) != 0 ? param2.deviceId : str, (i2 & 2) != 0 ? param2.deviceType : str2, (i2 & 4) != 0 ? param2.typeId : str3, (i2 & 8) != 0 ? param2.chargeAccountKey : l, (i2 & 16) != 0 ? param2.serviceId : str4, (i2 & 32) != 0 ? param2.operationId : str5, (i2 & 64) != 0 ? param2.operationReference : str6, (i2 & 128) != 0 ? param2.scaAuthCode : str7);
        }

        public final String component1() {
            return this.deviceId;
        }

        public final String component2() {
            return this.deviceType;
        }

        public final String component3() {
            return this.typeId;
        }

        public final Long component4() {
            return this.chargeAccountKey;
        }

        public final String component5() {
            return this.serviceId;
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

        public final Param copy(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
            C41536l.m120489i(str3, "typeId");
            C41536l.m120489i(str4, IRetrofitService.SERVICE_ID);
            return new Param(str, str2, str3, l, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return C41536l.m120484d(this.deviceId, param.deviceId) && C41536l.m120484d(this.deviceType, param.deviceType) && C41536l.m120484d(this.typeId, param.typeId) && C41536l.m120484d(this.chargeAccountKey, param.chargeAccountKey) && C41536l.m120484d(this.serviceId, param.serviceId) && C41536l.m120484d(this.operationId, param.operationId) && C41536l.m120484d(this.operationReference, param.operationReference) && C41536l.m120484d(this.scaAuthCode, param.scaAuthCode);
        }

        public final Long getChargeAccountKey() {
            return this.chargeAccountKey;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getDeviceType() {
            return this.deviceType;
        }

        public String getOperationId() {
            return this.operationId;
        }

        public String getOperationReference() {
            return this.operationReference;
        }

        public String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public String getServiceId() {
            return this.serviceId;
        }

        public final String getTypeId() {
            return this.typeId;
        }

        public int hashCode() {
            String str = this.deviceId;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.deviceType;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.typeId.hashCode()) * 31;
            Long l = this.chargeAccountKey;
            int hashCode3 = (((hashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.serviceId.hashCode()) * 31;
            String str3 = this.operationId;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.operationReference;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.scaAuthCode;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            String str = this.deviceId;
            String str2 = this.deviceType;
            String str3 = this.typeId;
            Long l = this.chargeAccountKey;
            String str4 = this.serviceId;
            String str5 = this.operationId;
            String str6 = this.operationReference;
            String str7 = this.scaAuthCode;
            return "Param(deviceId=" + str + ", deviceType=" + str2 + ", typeId=" + str3 + ", chargeAccountKey=" + l + ", serviceId=" + str4 + ", operationId=" + str5 + ", operationReference=" + str6 + ", scaAuthCode=" + str7 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Param(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
            super(str4, str6, str7, (String) null, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(str3, "typeId");
            C41536l.m120489i(str4, IRetrofitService.SERVICE_ID);
            this.deviceId = str;
            this.deviceType = str2;
            this.typeId = str3;
            this.chargeAccountKey = l;
            this.serviceId = str4;
            this.operationId = str5;
            this.operationReference = str6;
            this.scaAuthCode = str7;
        }
    }

    public PurchasePassUseCase(C36888a aVar) {
        C41536l.m120489i(aVar, "transportCardRepository");
        this.f84443a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo85743a(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        return this.f84443a.mo72426V5(hashMap);
    }
}
