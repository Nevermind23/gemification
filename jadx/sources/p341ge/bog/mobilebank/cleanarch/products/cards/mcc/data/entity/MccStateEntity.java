package p341ge.bog.mobilebank.cleanarch.products.cards.mcc.data.entity;

import androidx.annotation.Keep;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import w60.C29237a;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.data.entity.MccStateEntity */
public final class MccStateEntity {
    private final C24978b accessMode;
    private final Long cardId;
    private final String mccGroupCode;
    private final String mccGroupDesc;
    private final String mccGroupDescKey;
    private final String mccGroupName;
    private final String mccGroupNameKey;
    private final C24978b mccStatus;

    public MccStateEntity(Long l, String str, C24978b bVar, C24978b bVar2, String str2, String str3, String str4, String str5) {
        this.cardId = l;
        this.mccGroupCode = str;
        this.mccStatus = bVar;
        this.accessMode = bVar2;
        this.mccGroupNameKey = str2;
        this.mccGroupName = str3;
        this.mccGroupDescKey = str4;
        this.mccGroupDesc = str5;
    }

    public static /* synthetic */ MccStateEntity copy$default(MccStateEntity mccStateEntity, Long l, String str, C24978b bVar, C24978b bVar2, String str2, String str3, String str4, String str5, int i, Object obj) {
        MccStateEntity mccStateEntity2 = mccStateEntity;
        int i2 = i;
        return mccStateEntity.copy((i2 & 1) != 0 ? mccStateEntity2.cardId : l, (i2 & 2) != 0 ? mccStateEntity2.mccGroupCode : str, (i2 & 4) != 0 ? mccStateEntity2.mccStatus : bVar, (i2 & 8) != 0 ? mccStateEntity2.accessMode : bVar2, (i2 & 16) != 0 ? mccStateEntity2.mccGroupNameKey : str2, (i2 & 32) != 0 ? mccStateEntity2.mccGroupName : str3, (i2 & 64) != 0 ? mccStateEntity2.mccGroupDescKey : str4, (i2 & 128) != 0 ? mccStateEntity2.mccGroupDesc : str5);
    }

    public final Long component1() {
        return this.cardId;
    }

    public final String component2() {
        return this.mccGroupCode;
    }

    public final C24978b component3() {
        return this.mccStatus;
    }

    public final C24978b component4() {
        return this.accessMode;
    }

    public final String component5() {
        return this.mccGroupNameKey;
    }

    public final String component6() {
        return this.mccGroupName;
    }

    public final String component7() {
        return this.mccGroupDescKey;
    }

    public final String component8() {
        return this.mccGroupDesc;
    }

    public final MccStateEntity copy(Long l, String str, C24978b bVar, C24978b bVar2, String str2, String str3, String str4, String str5) {
        return new MccStateEntity(l, str, bVar, bVar2, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MccStateEntity)) {
            return false;
        }
        MccStateEntity mccStateEntity = (MccStateEntity) obj;
        return C41536l.m120484d(this.cardId, mccStateEntity.cardId) && C41536l.m120484d(this.mccGroupCode, mccStateEntity.mccGroupCode) && this.mccStatus == mccStateEntity.mccStatus && this.accessMode == mccStateEntity.accessMode && C41536l.m120484d(this.mccGroupNameKey, mccStateEntity.mccGroupNameKey) && C41536l.m120484d(this.mccGroupName, mccStateEntity.mccGroupName) && C41536l.m120484d(this.mccGroupDescKey, mccStateEntity.mccGroupDescKey) && C41536l.m120484d(this.mccGroupDesc, mccStateEntity.mccGroupDesc);
    }

    public final C24978b getAccessMode() {
        return this.accessMode;
    }

    public final Long getCardId() {
        return this.cardId;
    }

    public final String getMccGroupCode() {
        return this.mccGroupCode;
    }

    public final String getMccGroupDesc() {
        return this.mccGroupDesc;
    }

    public final String getMccGroupDescKey() {
        return this.mccGroupDescKey;
    }

    public final String getMccGroupName() {
        return this.mccGroupName;
    }

    public final String getMccGroupNameKey() {
        return this.mccGroupNameKey;
    }

    public final C24978b getMccStatus() {
        return this.mccStatus;
    }

    public int hashCode() {
        Long l = this.cardId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.mccGroupCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C24978b bVar = this.mccStatus;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C24978b bVar2 = this.accessMode;
        int hashCode4 = (hashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str2 = this.mccGroupNameKey;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mccGroupName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mccGroupDescKey;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mccGroupDesc;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public final C29237a toMccState() {
        long j;
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l = this.cardId;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        long j2 = j;
        String str6 = this.mccGroupCode;
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        C24978b bVar = this.mccStatus;
        C24978b bVar2 = C24978b.YES;
        if (bVar == bVar2) {
            z = true;
        } else {
            z = false;
        }
        if (this.accessMode == bVar2) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str7 = this.mccGroupNameKey;
        if (str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        String str8 = this.mccGroupName;
        if (str8 == null) {
            str3 = "";
        } else {
            str3 = str8;
        }
        String str9 = this.mccGroupDescKey;
        if (str9 == null) {
            str4 = "";
        } else {
            str4 = str9;
        }
        String str10 = this.mccGroupDesc;
        if (str10 == null) {
            str5 = "";
        } else {
            str5 = str10;
        }
        return new C29237a(j2, str, z, z2, str2, str3, str4, str5);
    }

    public String toString() {
        Long l = this.cardId;
        String str = this.mccGroupCode;
        C24978b bVar = this.mccStatus;
        C24978b bVar2 = this.accessMode;
        String str2 = this.mccGroupNameKey;
        String str3 = this.mccGroupName;
        String str4 = this.mccGroupDescKey;
        String str5 = this.mccGroupDesc;
        return "MccStateEntity(cardId=" + l + ", mccGroupCode=" + str + ", mccStatus=" + bVar + ", accessMode=" + bVar2 + ", mccGroupNameKey=" + str2 + ", mccGroupName=" + str3 + ", mccGroupDescKey=" + str4 + ", mccGroupDesc=" + str5 + ")";
    }
}
