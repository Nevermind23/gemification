package p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.ChangeDailyLimitsParams */
public final class ChangeDailyLimitsParams extends OtpParams {
    public static final C34633a Companion = new C34633a((DefaultConstructorMarker) null);
    public static final String SERVICE_ID = "CARDS_CHANGE_DAILY_LIMIT_TYPE";
    private final String cardId;
    private final String dailyLimitType;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* renamed from: ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.ChangeDailyLimitsParams$a */
    public static final class C34633a {
        private C34633a() {
        }

        public /* synthetic */ C34633a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeDailyLimitsParams(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? SERVICE_ID : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ ChangeDailyLimitsParams copy$default(ChangeDailyLimitsParams changeDailyLimitsParams, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeDailyLimitsParams.cardId;
        }
        if ((i & 2) != 0) {
            str2 = changeDailyLimitsParams.dailyLimitType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = changeDailyLimitsParams.serviceId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = changeDailyLimitsParams.operationId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = changeDailyLimitsParams.operationReference;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = changeDailyLimitsParams.scaAuthCode;
        }
        return changeDailyLimitsParams.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.cardId;
    }

    public final String component2() {
        return this.dailyLimitType;
    }

    public final String component3() {
        return this.serviceId;
    }

    public final String component4() {
        return this.operationId;
    }

    public final String component5() {
        return this.operationReference;
    }

    public final String component6() {
        return this.scaAuthCode;
    }

    public final ChangeDailyLimitsParams copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str3, IRetrofitService.SERVICE_ID);
        return new ChangeDailyLimitsParams(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDailyLimitsParams)) {
            return false;
        }
        ChangeDailyLimitsParams changeDailyLimitsParams = (ChangeDailyLimitsParams) obj;
        return C41536l.m120484d(this.cardId, changeDailyLimitsParams.cardId) && C41536l.m120484d(this.dailyLimitType, changeDailyLimitsParams.dailyLimitType) && C41536l.m120484d(this.serviceId, changeDailyLimitsParams.serviceId) && C41536l.m120484d(this.operationId, changeDailyLimitsParams.operationId) && C41536l.m120484d(this.operationReference, changeDailyLimitsParams.operationReference) && C41536l.m120484d(this.scaAuthCode, changeDailyLimitsParams.scaAuthCode);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getDailyLimitType() {
        return this.dailyLimitType;
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

    public int hashCode() {
        String str = this.cardId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dailyLimitType;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.serviceId.hashCode()) * 31;
        String str3 = this.operationId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.operationReference;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scaAuthCode;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.cardId;
        String str2 = this.dailyLimitType;
        String str3 = this.serviceId;
        String str4 = this.operationId;
        String str5 = this.operationReference;
        String str6 = this.scaAuthCode;
        return "ChangeDailyLimitsParams(cardId=" + str + ", dailyLimitType=" + str2 + ", serviceId=" + str3 + ", operationId=" + str4 + ", operationReference=" + str5 + ", scaAuthCode=" + str6 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeDailyLimitsParams(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str3, str5, str6, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str3, IRetrofitService.SERVICE_ID);
        this.cardId = str;
        this.dailyLimitType = str2;
        this.serviceId = str3;
        this.operationId = str4;
        this.operationReference = str5;
        this.scaAuthCode = str6;
    }
}
