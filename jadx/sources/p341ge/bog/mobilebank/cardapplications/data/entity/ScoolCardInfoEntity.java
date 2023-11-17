package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.ScoolCardInfoEntity */
public final class ScoolCardInfoEntity {
    private final String cardNameKey;
    private final String cardNameValue;
    private final CsFlag csFlag;
    private final long linkId;
    private final String plcClass;
    private final String plcType;
    private final String product;
    private final YesNoApiEntity regionFlag;
    private final String subProductCode;
    private final String typeName;

    public ScoolCardInfoEntity(String str, String str2, String str3, String str4, long j, String str5, String str6, CsFlag csFlag2, String str7, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(str3, "typeName");
        C41536l.m120489i(str4, "product");
        C41536l.m120489i(str5, "subProductCode");
        C41536l.m120489i(yesNoApiEntity, "regionFlag");
        this.plcClass = str;
        this.plcType = str2;
        this.typeName = str3;
        this.product = str4;
        this.linkId = j;
        this.subProductCode = str5;
        this.cardNameKey = str6;
        this.csFlag = csFlag2;
        this.cardNameValue = str7;
        this.regionFlag = yesNoApiEntity;
    }

    public static /* synthetic */ ScoolCardInfoEntity copy$default(ScoolCardInfoEntity scoolCardInfoEntity, String str, String str2, String str3, String str4, long j, String str5, String str6, CsFlag csFlag2, String str7, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        ScoolCardInfoEntity scoolCardInfoEntity2 = scoolCardInfoEntity;
        int i2 = i;
        return scoolCardInfoEntity.copy((i2 & 1) != 0 ? scoolCardInfoEntity2.plcClass : str, (i2 & 2) != 0 ? scoolCardInfoEntity2.plcType : str2, (i2 & 4) != 0 ? scoolCardInfoEntity2.typeName : str3, (i2 & 8) != 0 ? scoolCardInfoEntity2.product : str4, (i2 & 16) != 0 ? scoolCardInfoEntity2.linkId : j, (i2 & 32) != 0 ? scoolCardInfoEntity2.subProductCode : str5, (i2 & 64) != 0 ? scoolCardInfoEntity2.cardNameKey : str6, (i2 & 128) != 0 ? scoolCardInfoEntity2.csFlag : csFlag2, (i2 & C11398b.f33139r) != 0 ? scoolCardInfoEntity2.cardNameValue : str7, (i2 & C11398b.f33140s) != 0 ? scoolCardInfoEntity2.regionFlag : yesNoApiEntity);
    }

    public final String component1() {
        return this.plcClass;
    }

    public final YesNoApiEntity component10() {
        return this.regionFlag;
    }

    public final String component2() {
        return this.plcType;
    }

    public final String component3() {
        return this.typeName;
    }

    public final String component4() {
        return this.product;
    }

    public final long component5() {
        return this.linkId;
    }

    public final String component6() {
        return this.subProductCode;
    }

    public final String component7() {
        return this.cardNameKey;
    }

    public final CsFlag component8() {
        return this.csFlag;
    }

    public final String component9() {
        return this.cardNameValue;
    }

    public final ScoolCardInfoEntity copy(String str, String str2, String str3, String str4, long j, String str5, String str6, CsFlag csFlag2, String str7, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        String str8 = str3;
        C41536l.m120489i(str8, "typeName");
        String str9 = str4;
        C41536l.m120489i(str9, "product");
        String str10 = str5;
        C41536l.m120489i(str10, "subProductCode");
        YesNoApiEntity yesNoApiEntity2 = yesNoApiEntity;
        C41536l.m120489i(yesNoApiEntity2, "regionFlag");
        return new ScoolCardInfoEntity(str, str2, str8, str9, j, str10, str6, csFlag2, str7, yesNoApiEntity2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoolCardInfoEntity)) {
            return false;
        }
        ScoolCardInfoEntity scoolCardInfoEntity = (ScoolCardInfoEntity) obj;
        return C41536l.m120484d(this.plcClass, scoolCardInfoEntity.plcClass) && C41536l.m120484d(this.plcType, scoolCardInfoEntity.plcType) && C41536l.m120484d(this.typeName, scoolCardInfoEntity.typeName) && C41536l.m120484d(this.product, scoolCardInfoEntity.product) && this.linkId == scoolCardInfoEntity.linkId && C41536l.m120484d(this.subProductCode, scoolCardInfoEntity.subProductCode) && C41536l.m120484d(this.cardNameKey, scoolCardInfoEntity.cardNameKey) && this.csFlag == scoolCardInfoEntity.csFlag && C41536l.m120484d(this.cardNameValue, scoolCardInfoEntity.cardNameValue) && this.regionFlag == scoolCardInfoEntity.regionFlag;
    }

    public final String getCardNameKey() {
        return this.cardNameKey;
    }

    public final String getCardNameValue() {
        return this.cardNameValue;
    }

    public final CsFlag getCsFlag() {
        return this.csFlag;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public final String getPlcClass() {
        return this.plcClass;
    }

    public final String getPlcType() {
        return this.plcType;
    }

    public final String getProduct() {
        return this.product;
    }

    public final YesNoApiEntity getRegionFlag() {
        return this.regionFlag;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.plcClass.hashCode() * 31) + this.plcType.hashCode()) * 31) + this.typeName.hashCode()) * 31) + this.product.hashCode()) * 31) + C7397t.m28148a(this.linkId)) * 31) + this.subProductCode.hashCode()) * 31;
        String str = this.cardNameKey;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CsFlag csFlag2 = this.csFlag;
        int hashCode3 = (hashCode2 + (csFlag2 == null ? 0 : csFlag2.hashCode())) * 31;
        String str2 = this.cardNameValue;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.regionFlag.hashCode();
    }

    public String toString() {
        String str = this.plcClass;
        String str2 = this.plcType;
        String str3 = this.typeName;
        String str4 = this.product;
        long j = this.linkId;
        String str5 = this.subProductCode;
        String str6 = this.cardNameKey;
        CsFlag csFlag2 = this.csFlag;
        String str7 = this.cardNameValue;
        YesNoApiEntity yesNoApiEntity = this.regionFlag;
        return "ScoolCardInfoEntity(plcClass=" + str + ", plcType=" + str2 + ", typeName=" + str3 + ", product=" + str4 + ", linkId=" + j + ", subProductCode=" + str5 + ", cardNameKey=" + str6 + ", csFlag=" + csFlag2 + ", cardNameValue=" + str7 + ", regionFlag=" + yesNoApiEntity + ")";
    }
}
