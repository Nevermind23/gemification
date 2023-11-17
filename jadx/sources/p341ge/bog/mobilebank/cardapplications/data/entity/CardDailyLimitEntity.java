package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.CardDailyLimitEntity */
public final class CardDailyLimitEntity {
    private final String dailyLimitType;

    /* renamed from: id */
    private final long f41305id;
    private final String limitTypeDesc;
    private final String prodType;
    private final YesNoApiEntity showFlag;

    public CardDailyLimitEntity(long j, String str, String str2, String str3, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "dailyLimitType");
        C41536l.m120489i(str3, "limitTypeDesc");
        this.f41305id = j;
        this.prodType = str;
        this.dailyLimitType = str2;
        this.limitTypeDesc = str3;
        this.showFlag = yesNoApiEntity;
    }

    public static /* synthetic */ CardDailyLimitEntity copy$default(CardDailyLimitEntity cardDailyLimitEntity, long j, String str, String str2, String str3, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cardDailyLimitEntity.f41305id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = cardDailyLimitEntity.prodType;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = cardDailyLimitEntity.dailyLimitType;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = cardDailyLimitEntity.limitTypeDesc;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            yesNoApiEntity = cardDailyLimitEntity.showFlag;
        }
        return cardDailyLimitEntity.copy(j2, str4, str5, str6, yesNoApiEntity);
    }

    public final long component1() {
        return this.f41305id;
    }

    public final String component2() {
        return this.prodType;
    }

    public final String component3() {
        return this.dailyLimitType;
    }

    public final String component4() {
        return this.limitTypeDesc;
    }

    public final YesNoApiEntity component5() {
        return this.showFlag;
    }

    public final CardDailyLimitEntity copy(long j, String str, String str2, String str3, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "dailyLimitType");
        C41536l.m120489i(str3, "limitTypeDesc");
        return new CardDailyLimitEntity(j, str, str2, str3, yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDailyLimitEntity)) {
            return false;
        }
        CardDailyLimitEntity cardDailyLimitEntity = (CardDailyLimitEntity) obj;
        return this.f41305id == cardDailyLimitEntity.f41305id && C41536l.m120484d(this.prodType, cardDailyLimitEntity.prodType) && C41536l.m120484d(this.dailyLimitType, cardDailyLimitEntity.dailyLimitType) && C41536l.m120484d(this.limitTypeDesc, cardDailyLimitEntity.limitTypeDesc) && this.showFlag == cardDailyLimitEntity.showFlag;
    }

    public final String getDailyLimitType() {
        return this.dailyLimitType;
    }

    public final long getId() {
        return this.f41305id;
    }

    public final String getLimitTypeDesc() {
        return this.limitTypeDesc;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final YesNoApiEntity getShowFlag() {
        return this.showFlag;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f41305id) * 31) + this.prodType.hashCode()) * 31) + this.dailyLimitType.hashCode()) * 31) + this.limitTypeDesc.hashCode()) * 31;
        YesNoApiEntity yesNoApiEntity = this.showFlag;
        return a + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode());
    }

    public String toString() {
        long j = this.f41305id;
        String str = this.prodType;
        String str2 = this.dailyLimitType;
        String str3 = this.limitTypeDesc;
        YesNoApiEntity yesNoApiEntity = this.showFlag;
        return "CardDailyLimitEntity(id=" + j + ", prodType=" + str + ", dailyLimitType=" + str2 + ", limitTypeDesc=" + str3 + ", showFlag=" + yesNoApiEntity + ")";
    }
}
