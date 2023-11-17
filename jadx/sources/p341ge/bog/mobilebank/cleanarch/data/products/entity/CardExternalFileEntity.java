package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.CardExternalFileEntity */
public final class CardExternalFileEntity {
    private final String fileSubType;
    private final String fileType;
    private final String fileUrl;
    private final YesNoApiEntity isDark;

    public CardExternalFileEntity(String str, YesNoApiEntity yesNoApiEntity, String str2, String str3) {
        this.fileSubType = str;
        this.isDark = yesNoApiEntity;
        this.fileUrl = str2;
        this.fileType = str3;
    }

    public static /* synthetic */ CardExternalFileEntity copy$default(CardExternalFileEntity cardExternalFileEntity, String str, YesNoApiEntity yesNoApiEntity, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardExternalFileEntity.fileSubType;
        }
        if ((i & 2) != 0) {
            yesNoApiEntity = cardExternalFileEntity.isDark;
        }
        if ((i & 4) != 0) {
            str2 = cardExternalFileEntity.fileUrl;
        }
        if ((i & 8) != 0) {
            str3 = cardExternalFileEntity.fileType;
        }
        return cardExternalFileEntity.copy(str, yesNoApiEntity, str2, str3);
    }

    public final String component1() {
        return this.fileSubType;
    }

    public final YesNoApiEntity component2() {
        return this.isDark;
    }

    public final String component3() {
        return this.fileUrl;
    }

    public final String component4() {
        return this.fileType;
    }

    public final CardExternalFileEntity copy(String str, YesNoApiEntity yesNoApiEntity, String str2, String str3) {
        return new CardExternalFileEntity(str, yesNoApiEntity, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardExternalFileEntity)) {
            return false;
        }
        CardExternalFileEntity cardExternalFileEntity = (CardExternalFileEntity) obj;
        return C41536l.m120484d(this.fileSubType, cardExternalFileEntity.fileSubType) && this.isDark == cardExternalFileEntity.isDark && C41536l.m120484d(this.fileUrl, cardExternalFileEntity.fileUrl) && C41536l.m120484d(this.fileType, cardExternalFileEntity.fileType);
    }

    public final String getFileSubType() {
        return this.fileSubType;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public int hashCode() {
        String str = this.fileSubType;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        YesNoApiEntity yesNoApiEntity = this.isDark;
        int hashCode2 = (hashCode + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str2 = this.fileUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileType;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final YesNoApiEntity isDark() {
        return this.isDark;
    }

    public String toString() {
        String str = this.fileSubType;
        YesNoApiEntity yesNoApiEntity = this.isDark;
        String str2 = this.fileUrl;
        String str3 = this.fileType;
        return "CardExternalFileEntity(fileSubType=" + str + ", isDark=" + yesNoApiEntity + ", fileUrl=" + str2 + ", fileType=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardExternalFileEntity(String str, YesNoApiEntity yesNoApiEntity, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, yesNoApiEntity, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
