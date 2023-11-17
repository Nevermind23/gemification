package p341ge.bog.mobilebank.qrwithdrawal.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.qrwithdrawal.data.model.QrDailyLimitApiModel */
public final class QrDailyLimitApiModel {
    private final int availableLimitAmount;
    private final int availableLimitCount;
    private final long cardId;
    private final String channelType;
    private final String channelTypeDesc;
    private final int currentAmount;
    private final int currentCount;

    /* renamed from: id */
    private final int f83338id;
    private final Long limitEndDate;
    private final Long limitStartDate;
    private final int maxLimitAmount;
    private final int maxLimitCount;

    public QrDailyLimitApiModel(int i, long j, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, Long l, Long l2) {
        C41536l.m120489i(str, "channelType");
        C41536l.m120489i(str2, "channelTypeDesc");
        this.f83338id = i;
        this.cardId = j;
        this.channelType = str;
        this.channelTypeDesc = str2;
        this.currentCount = i2;
        this.currentAmount = i3;
        this.maxLimitCount = i4;
        this.maxLimitAmount = i5;
        this.availableLimitCount = i6;
        this.availableLimitAmount = i7;
        this.limitStartDate = l;
        this.limitEndDate = l2;
    }

    public static /* synthetic */ QrDailyLimitApiModel copy$default(QrDailyLimitApiModel qrDailyLimitApiModel, int i, long j, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, Long l, Long l2, int i8, Object obj) {
        QrDailyLimitApiModel qrDailyLimitApiModel2 = qrDailyLimitApiModel;
        int i9 = i8;
        return qrDailyLimitApiModel.copy((i9 & 1) != 0 ? qrDailyLimitApiModel2.f83338id : i, (i9 & 2) != 0 ? qrDailyLimitApiModel2.cardId : j, (i9 & 4) != 0 ? qrDailyLimitApiModel2.channelType : str, (i9 & 8) != 0 ? qrDailyLimitApiModel2.channelTypeDesc : str2, (i9 & 16) != 0 ? qrDailyLimitApiModel2.currentCount : i2, (i9 & 32) != 0 ? qrDailyLimitApiModel2.currentAmount : i3, (i9 & 64) != 0 ? qrDailyLimitApiModel2.maxLimitCount : i4, (i9 & 128) != 0 ? qrDailyLimitApiModel2.maxLimitAmount : i5, (i9 & C11398b.f33139r) != 0 ? qrDailyLimitApiModel2.availableLimitCount : i6, (i9 & C11398b.f33140s) != 0 ? qrDailyLimitApiModel2.availableLimitAmount : i7, (i9 & C11398b.f33141t) != 0 ? qrDailyLimitApiModel2.limitStartDate : l, (i9 & C11398b.f33142u) != 0 ? qrDailyLimitApiModel2.limitEndDate : l2);
    }

    public final int component1() {
        return this.f83338id;
    }

    public final int component10() {
        return this.availableLimitAmount;
    }

    public final Long component11() {
        return this.limitStartDate;
    }

    public final Long component12() {
        return this.limitEndDate;
    }

    public final long component2() {
        return this.cardId;
    }

    public final String component3() {
        return this.channelType;
    }

    public final String component4() {
        return this.channelTypeDesc;
    }

    public final int component5() {
        return this.currentCount;
    }

    public final int component6() {
        return this.currentAmount;
    }

    public final int component7() {
        return this.maxLimitCount;
    }

    public final int component8() {
        return this.maxLimitAmount;
    }

    public final int component9() {
        return this.availableLimitCount;
    }

    public final QrDailyLimitApiModel copy(int i, long j, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, Long l, Long l2) {
        String str3 = str;
        C41536l.m120489i(str3, "channelType");
        String str4 = str2;
        C41536l.m120489i(str4, "channelTypeDesc");
        return new QrDailyLimitApiModel(i, j, str3, str4, i2, i3, i4, i5, i6, i7, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrDailyLimitApiModel)) {
            return false;
        }
        QrDailyLimitApiModel qrDailyLimitApiModel = (QrDailyLimitApiModel) obj;
        return this.f83338id == qrDailyLimitApiModel.f83338id && this.cardId == qrDailyLimitApiModel.cardId && C41536l.m120484d(this.channelType, qrDailyLimitApiModel.channelType) && C41536l.m120484d(this.channelTypeDesc, qrDailyLimitApiModel.channelTypeDesc) && this.currentCount == qrDailyLimitApiModel.currentCount && this.currentAmount == qrDailyLimitApiModel.currentAmount && this.maxLimitCount == qrDailyLimitApiModel.maxLimitCount && this.maxLimitAmount == qrDailyLimitApiModel.maxLimitAmount && this.availableLimitCount == qrDailyLimitApiModel.availableLimitCount && this.availableLimitAmount == qrDailyLimitApiModel.availableLimitAmount && C41536l.m120484d(this.limitStartDate, qrDailyLimitApiModel.limitStartDate) && C41536l.m120484d(this.limitEndDate, qrDailyLimitApiModel.limitEndDate);
    }

    public final int getAvailableLimitAmount() {
        return this.availableLimitAmount;
    }

    public final int getAvailableLimitCount() {
        return this.availableLimitCount;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final String getChannelTypeDesc() {
        return this.channelTypeDesc;
    }

    public final int getCurrentAmount() {
        return this.currentAmount;
    }

    public final int getCurrentCount() {
        return this.currentCount;
    }

    public final int getId() {
        return this.f83338id;
    }

    public final Long getLimitEndDate() {
        return this.limitEndDate;
    }

    public final Long getLimitStartDate() {
        return this.limitStartDate;
    }

    public final int getMaxLimitAmount() {
        return this.maxLimitAmount;
    }

    public final int getMaxLimitCount() {
        return this.maxLimitCount;
    }

    public int hashCode() {
        int a = ((((((((((((((((((this.f83338id * 31) + C7397t.m28148a(this.cardId)) * 31) + this.channelType.hashCode()) * 31) + this.channelTypeDesc.hashCode()) * 31) + this.currentCount) * 31) + this.currentAmount) * 31) + this.maxLimitCount) * 31) + this.maxLimitAmount) * 31) + this.availableLimitCount) * 31) + this.availableLimitAmount) * 31;
        Long l = this.limitStartDate;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.limitEndDate;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        int i = this.f83338id;
        long j = this.cardId;
        String str = this.channelType;
        String str2 = this.channelTypeDesc;
        int i2 = this.currentCount;
        int i3 = this.currentAmount;
        int i4 = this.maxLimitCount;
        int i5 = this.maxLimitAmount;
        int i6 = this.availableLimitCount;
        int i7 = this.availableLimitAmount;
        Long l = this.limitStartDate;
        Long l2 = this.limitEndDate;
        return "QrDailyLimitApiModel(id=" + i + ", cardId=" + j + ", channelType=" + str + ", channelTypeDesc=" + str2 + ", currentCount=" + i2 + ", currentAmount=" + i3 + ", maxLimitCount=" + i4 + ", maxLimitAmount=" + i5 + ", availableLimitCount=" + i6 + ", availableLimitAmount=" + i7 + ", limitStartDate=" + l + ", limitEndDate=" + l2 + ")";
    }
}
