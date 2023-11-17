package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiveAwayGiftCardRequestModel */
public final class GiveAwayGiftCardRequestModel {
    private final Long activationDate;
    private final Long dstClientKey;
    private final String dstClientPhoneNumber;
    private final String giftCardDesignName;
    private final long giftCardId;
    private final String giftCardNomination;
    private final long srcClientKey;

    public GiveAwayGiftCardRequestModel(long j, long j2, String str, Long l, Long l2, String str2, String str3) {
        C41536l.m120489i(str, "dstClientPhoneNumber");
        C41536l.m120489i(str2, "giftCardNomination");
        C41536l.m120489i(str3, "giftCardDesignName");
        this.srcClientKey = j;
        this.giftCardId = j2;
        this.dstClientPhoneNumber = str;
        this.dstClientKey = l;
        this.activationDate = l2;
        this.giftCardNomination = str2;
        this.giftCardDesignName = str3;
    }

    public static /* synthetic */ GiveAwayGiftCardRequestModel copy$default(GiveAwayGiftCardRequestModel giveAwayGiftCardRequestModel, long j, long j2, String str, Long l, Long l2, String str2, String str3, int i, Object obj) {
        GiveAwayGiftCardRequestModel giveAwayGiftCardRequestModel2 = giveAwayGiftCardRequestModel;
        return giveAwayGiftCardRequestModel.copy((i & 1) != 0 ? giveAwayGiftCardRequestModel2.srcClientKey : j, (i & 2) != 0 ? giveAwayGiftCardRequestModel2.giftCardId : j2, (i & 4) != 0 ? giveAwayGiftCardRequestModel2.dstClientPhoneNumber : str, (i & 8) != 0 ? giveAwayGiftCardRequestModel2.dstClientKey : l, (i & 16) != 0 ? giveAwayGiftCardRequestModel2.activationDate : l2, (i & 32) != 0 ? giveAwayGiftCardRequestModel2.giftCardNomination : str2, (i & 64) != 0 ? giveAwayGiftCardRequestModel2.giftCardDesignName : str3);
    }

    public final long component1() {
        return this.srcClientKey;
    }

    public final long component2() {
        return this.giftCardId;
    }

    public final String component3() {
        return this.dstClientPhoneNumber;
    }

    public final Long component4() {
        return this.dstClientKey;
    }

    public final Long component5() {
        return this.activationDate;
    }

    public final String component6() {
        return this.giftCardNomination;
    }

    public final String component7() {
        return this.giftCardDesignName;
    }

    public final GiveAwayGiftCardRequestModel copy(long j, long j2, String str, Long l, Long l2, String str2, String str3) {
        String str4 = str;
        C41536l.m120489i(str4, "dstClientPhoneNumber");
        String str5 = str2;
        C41536l.m120489i(str5, "giftCardNomination");
        String str6 = str3;
        C41536l.m120489i(str6, "giftCardDesignName");
        return new GiveAwayGiftCardRequestModel(j, j2, str4, l, l2, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiveAwayGiftCardRequestModel)) {
            return false;
        }
        GiveAwayGiftCardRequestModel giveAwayGiftCardRequestModel = (GiveAwayGiftCardRequestModel) obj;
        return this.srcClientKey == giveAwayGiftCardRequestModel.srcClientKey && this.giftCardId == giveAwayGiftCardRequestModel.giftCardId && C41536l.m120484d(this.dstClientPhoneNumber, giveAwayGiftCardRequestModel.dstClientPhoneNumber) && C41536l.m120484d(this.dstClientKey, giveAwayGiftCardRequestModel.dstClientKey) && C41536l.m120484d(this.activationDate, giveAwayGiftCardRequestModel.activationDate) && C41536l.m120484d(this.giftCardNomination, giveAwayGiftCardRequestModel.giftCardNomination) && C41536l.m120484d(this.giftCardDesignName, giveAwayGiftCardRequestModel.giftCardDesignName);
    }

    public final Long getActivationDate() {
        return this.activationDate;
    }

    public final Long getDstClientKey() {
        return this.dstClientKey;
    }

    public final String getDstClientPhoneNumber() {
        return this.dstClientPhoneNumber;
    }

    public final String getGiftCardDesignName() {
        return this.giftCardDesignName;
    }

    public final long getGiftCardId() {
        return this.giftCardId;
    }

    public final String getGiftCardNomination() {
        return this.giftCardNomination;
    }

    public final long getSrcClientKey() {
        return this.srcClientKey;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.srcClientKey) * 31) + C7397t.m28148a(this.giftCardId)) * 31) + this.dstClientPhoneNumber.hashCode()) * 31;
        Long l = this.dstClientKey;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.activationDate;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.giftCardNomination.hashCode()) * 31) + this.giftCardDesignName.hashCode();
    }

    public String toString() {
        long j = this.srcClientKey;
        long j2 = this.giftCardId;
        String str = this.dstClientPhoneNumber;
        Long l = this.dstClientKey;
        Long l2 = this.activationDate;
        String str2 = this.giftCardNomination;
        String str3 = this.giftCardDesignName;
        return "GiveAwayGiftCardRequestModel(srcClientKey=" + j + ", giftCardId=" + j2 + ", dstClientPhoneNumber=" + str + ", dstClientKey=" + l + ", activationDate=" + l2 + ", giftCardNomination=" + str2 + ", giftCardDesignName=" + str3 + ")";
    }
}
