package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.CardSmallImageEntity */
public final class CardSmallImageEntity {
    private final String fileUrl;
    private final YesNoApiEntity isDark;

    public CardSmallImageEntity(YesNoApiEntity yesNoApiEntity, String str) {
        this.isDark = yesNoApiEntity;
        this.fileUrl = str;
    }

    public static /* synthetic */ CardSmallImageEntity copy$default(CardSmallImageEntity cardSmallImageEntity, YesNoApiEntity yesNoApiEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoApiEntity = cardSmallImageEntity.isDark;
        }
        if ((i & 2) != 0) {
            str = cardSmallImageEntity.fileUrl;
        }
        return cardSmallImageEntity.copy(yesNoApiEntity, str);
    }

    public final YesNoApiEntity component1() {
        return this.isDark;
    }

    public final String component2() {
        return this.fileUrl;
    }

    public final CardSmallImageEntity copy(YesNoApiEntity yesNoApiEntity, String str) {
        return new CardSmallImageEntity(yesNoApiEntity, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSmallImageEntity)) {
            return false;
        }
        CardSmallImageEntity cardSmallImageEntity = (CardSmallImageEntity) obj;
        return this.isDark == cardSmallImageEntity.isDark && C41536l.m120484d(this.fileUrl, cardSmallImageEntity.fileUrl);
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public int hashCode() {
        YesNoApiEntity yesNoApiEntity = this.isDark;
        int i = 0;
        int hashCode = (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode()) * 31;
        String str = this.fileUrl;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final YesNoApiEntity isDark() {
        return this.isDark;
    }

    public String toString() {
        YesNoApiEntity yesNoApiEntity = this.isDark;
        String str = this.fileUrl;
        return "CardSmallImageEntity(isDark=" + yesNoApiEntity + ", fileUrl=" + str + ")";
    }
}
