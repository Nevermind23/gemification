package p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;
import p341ge.bog.mobilebank.cleanarch.data.contact.entity.ContactApiModel;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestParticipantApiModel */
public final class MoneyRequestParticipantApiModel {
    private final ContactApiModel contact;
    @C8664c("participantKey")
    private final String key;
    @C8664c("participantName")
    private final String name;
    private final long participantId;
    private final String participantStatus;
    private final double requestedAmount;
    private final String requestedCcy;
    private final double transferredAmount;
    @C8664c("participantType")
    private final MoneyRequestParticipantTypeApiModel type;

    public MoneyRequestParticipantApiModel(long j, MoneyRequestParticipantTypeApiModel moneyRequestParticipantTypeApiModel, String str, String str2, double d, double d2, String str3, String str4, ContactApiModel contactApiModel) {
        C41536l.m120489i(moneyRequestParticipantTypeApiModel, "type");
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str3, "requestedCcy");
        C41536l.m120489i(str4, "participantStatus");
        this.participantId = j;
        this.type = moneyRequestParticipantTypeApiModel;
        this.key = str;
        this.name = str2;
        this.requestedAmount = d;
        this.transferredAmount = d2;
        this.requestedCcy = str3;
        this.participantStatus = str4;
        this.contact = contactApiModel;
    }

    public static /* synthetic */ MoneyRequestParticipantApiModel copy$default(MoneyRequestParticipantApiModel moneyRequestParticipantApiModel, long j, MoneyRequestParticipantTypeApiModel moneyRequestParticipantTypeApiModel, String str, String str2, double d, double d2, String str3, String str4, ContactApiModel contactApiModel, int i, Object obj) {
        MoneyRequestParticipantApiModel moneyRequestParticipantApiModel2 = moneyRequestParticipantApiModel;
        int i2 = i;
        return moneyRequestParticipantApiModel.copy((i2 & 1) != 0 ? moneyRequestParticipantApiModel2.participantId : j, (i2 & 2) != 0 ? moneyRequestParticipantApiModel2.type : moneyRequestParticipantTypeApiModel, (i2 & 4) != 0 ? moneyRequestParticipantApiModel2.key : str, (i2 & 8) != 0 ? moneyRequestParticipantApiModel2.name : str2, (i2 & 16) != 0 ? moneyRequestParticipantApiModel2.requestedAmount : d, (i2 & 32) != 0 ? moneyRequestParticipantApiModel2.transferredAmount : d2, (i2 & 64) != 0 ? moneyRequestParticipantApiModel2.requestedCcy : str3, (i2 & 128) != 0 ? moneyRequestParticipantApiModel2.participantStatus : str4, (i2 & C11398b.f33139r) != 0 ? moneyRequestParticipantApiModel2.contact : contactApiModel);
    }

    public final long component1() {
        return this.participantId;
    }

    public final MoneyRequestParticipantTypeApiModel component2() {
        return this.type;
    }

    public final String component3() {
        return this.key;
    }

    public final String component4() {
        return this.name;
    }

    public final double component5() {
        return this.requestedAmount;
    }

    public final double component6() {
        return this.transferredAmount;
    }

    public final String component7() {
        return this.requestedCcy;
    }

    public final String component8() {
        return this.participantStatus;
    }

    public final ContactApiModel component9() {
        return this.contact;
    }

    public final MoneyRequestParticipantApiModel copy(long j, MoneyRequestParticipantTypeApiModel moneyRequestParticipantTypeApiModel, String str, String str2, double d, double d2, String str3, String str4, ContactApiModel contactApiModel) {
        MoneyRequestParticipantTypeApiModel moneyRequestParticipantTypeApiModel2 = moneyRequestParticipantTypeApiModel;
        C41536l.m120489i(moneyRequestParticipantTypeApiModel2, "type");
        String str5 = str;
        C41536l.m120489i(str5, "key");
        String str6 = str3;
        C41536l.m120489i(str6, "requestedCcy");
        String str7 = str4;
        C41536l.m120489i(str7, "participantStatus");
        return new MoneyRequestParticipantApiModel(j, moneyRequestParticipantTypeApiModel2, str5, str2, d, d2, str6, str7, contactApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyRequestParticipantApiModel)) {
            return false;
        }
        MoneyRequestParticipantApiModel moneyRequestParticipantApiModel = (MoneyRequestParticipantApiModel) obj;
        return this.participantId == moneyRequestParticipantApiModel.participantId && this.type == moneyRequestParticipantApiModel.type && C41536l.m120484d(this.key, moneyRequestParticipantApiModel.key) && C41536l.m120484d(this.name, moneyRequestParticipantApiModel.name) && Double.compare(this.requestedAmount, moneyRequestParticipantApiModel.requestedAmount) == 0 && Double.compare(this.transferredAmount, moneyRequestParticipantApiModel.transferredAmount) == 0 && C41536l.m120484d(this.requestedCcy, moneyRequestParticipantApiModel.requestedCcy) && C41536l.m120484d(this.participantStatus, moneyRequestParticipantApiModel.participantStatus) && C41536l.m120484d(this.contact, moneyRequestParticipantApiModel.contact);
    }

    public final ContactApiModel getContact() {
        return this.contact;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final long getParticipantId() {
        return this.participantId;
    }

    public final String getParticipantStatus() {
        return this.participantStatus;
    }

    public final double getRequestedAmount() {
        return this.requestedAmount;
    }

    public final String getRequestedCcy() {
        return this.requestedCcy;
    }

    public final double getTransferredAmount() {
        return this.transferredAmount;
    }

    public final MoneyRequestParticipantTypeApiModel getType() {
        return this.type;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.participantId) * 31) + this.type.hashCode()) * 31) + this.key.hashCode()) * 31;
        String str = this.name;
        int i = 0;
        int hashCode = (((((((((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.requestedAmount)) * 31) + Double.doubleToLongBits(this.transferredAmount)) * 31) + this.requestedCcy.hashCode()) * 31) + this.participantStatus.hashCode()) * 31;
        ContactApiModel contactApiModel = this.contact;
        if (contactApiModel != null) {
            i = contactApiModel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.participantId;
        MoneyRequestParticipantTypeApiModel moneyRequestParticipantTypeApiModel = this.type;
        String str = this.key;
        String str2 = this.name;
        double d = this.requestedAmount;
        double d2 = this.transferredAmount;
        String str3 = this.requestedCcy;
        String str4 = this.participantStatus;
        ContactApiModel contactApiModel = this.contact;
        return "MoneyRequestParticipantApiModel(participantId=" + j + ", type=" + moneyRequestParticipantTypeApiModel + ", key=" + str + ", name=" + str2 + ", requestedAmount=" + d + ", transferredAmount=" + d2 + ", requestedCcy=" + str3 + ", participantStatus=" + str4 + ", contact=" + contactApiModel + ")";
    }
}
