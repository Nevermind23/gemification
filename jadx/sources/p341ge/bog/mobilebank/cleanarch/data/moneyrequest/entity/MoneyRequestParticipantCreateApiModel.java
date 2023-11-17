package p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantCreateApiModel */
public final class MoneyRequestParticipantCreateApiModel {
    private final String participantKey;
    private final String participantName;
    private final String participantPhone;
    private final String participantType;
    private final Double requestedAmount;

    public MoneyRequestParticipantCreateApiModel(String str, String str2, String str3, Double d, String str4) {
        C41536l.m120489i(str, "participantType");
        C41536l.m120489i(str2, "participantKey");
        this.participantType = str;
        this.participantKey = str2;
        this.participantName = str3;
        this.requestedAmount = d;
        this.participantPhone = str4;
    }

    public static /* synthetic */ MoneyRequestParticipantCreateApiModel copy$default(MoneyRequestParticipantCreateApiModel moneyRequestParticipantCreateApiModel, String str, String str2, String str3, Double d, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moneyRequestParticipantCreateApiModel.participantType;
        }
        if ((i & 2) != 0) {
            str2 = moneyRequestParticipantCreateApiModel.participantKey;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = moneyRequestParticipantCreateApiModel.participantName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            d = moneyRequestParticipantCreateApiModel.requestedAmount;
        }
        Double d2 = d;
        if ((i & 16) != 0) {
            str4 = moneyRequestParticipantCreateApiModel.participantPhone;
        }
        return moneyRequestParticipantCreateApiModel.copy(str, str5, str6, d2, str4);
    }

    public final String component1() {
        return this.participantType;
    }

    public final String component2() {
        return this.participantKey;
    }

    public final String component3() {
        return this.participantName;
    }

    public final Double component4() {
        return this.requestedAmount;
    }

    public final String component5() {
        return this.participantPhone;
    }

    public final MoneyRequestParticipantCreateApiModel copy(String str, String str2, String str3, Double d, String str4) {
        C41536l.m120489i(str, "participantType");
        C41536l.m120489i(str2, "participantKey");
        return new MoneyRequestParticipantCreateApiModel(str, str2, str3, d, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyRequestParticipantCreateApiModel)) {
            return false;
        }
        MoneyRequestParticipantCreateApiModel moneyRequestParticipantCreateApiModel = (MoneyRequestParticipantCreateApiModel) obj;
        return C41536l.m120484d(this.participantType, moneyRequestParticipantCreateApiModel.participantType) && C41536l.m120484d(this.participantKey, moneyRequestParticipantCreateApiModel.participantKey) && C41536l.m120484d(this.participantName, moneyRequestParticipantCreateApiModel.participantName) && C41536l.m120484d(this.requestedAmount, moneyRequestParticipantCreateApiModel.requestedAmount) && C41536l.m120484d(this.participantPhone, moneyRequestParticipantCreateApiModel.participantPhone);
    }

    public final String getParticipantKey() {
        return this.participantKey;
    }

    public final String getParticipantName() {
        return this.participantName;
    }

    public final String getParticipantPhone() {
        return this.participantPhone;
    }

    public final String getParticipantType() {
        return this.participantType;
    }

    public final Double getRequestedAmount() {
        return this.requestedAmount;
    }

    public int hashCode() {
        int hashCode = ((this.participantType.hashCode() * 31) + this.participantKey.hashCode()) * 31;
        String str = this.participantName;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.requestedAmount;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.participantPhone;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.participantType;
        String str2 = this.participantKey;
        String str3 = this.participantName;
        Double d = this.requestedAmount;
        String str4 = this.participantPhone;
        return "MoneyRequestParticipantCreateApiModel(participantType=" + str + ", participantKey=" + str2 + ", participantName=" + str3 + ", requestedAmount=" + d + ", participantPhone=" + str4 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyRequestParticipantCreateApiModel(String str, String str2, String str3, Double d, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, (i & 16) != 0 ? null : str4);
    }
}
