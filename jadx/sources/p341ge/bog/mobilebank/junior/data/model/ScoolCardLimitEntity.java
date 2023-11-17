package p341ge.bog.mobilebank.junior.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.junior.data.model.ScoolCardLimitEntity */
public final class ScoolCardLimitEntity {
    private final String dailyLimitType;

    /* renamed from: id */
    private final int f63512id;
    private final String limitTypeDesc;
    private final String prodType;
    private final YesNoApiEntity showFlag;

    public ScoolCardLimitEntity(int i, String str, String str2, String str3, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "dailyLimitType");
        C41536l.m120489i(str3, "limitTypeDesc");
        C41536l.m120489i(yesNoApiEntity, "showFlag");
        this.f63512id = i;
        this.prodType = str;
        this.dailyLimitType = str2;
        this.limitTypeDesc = str3;
        this.showFlag = yesNoApiEntity;
    }

    public static /* synthetic */ ScoolCardLimitEntity copy$default(ScoolCardLimitEntity scoolCardLimitEntity, int i, String str, String str2, String str3, YesNoApiEntity yesNoApiEntity, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scoolCardLimitEntity.f63512id;
        }
        if ((i2 & 2) != 0) {
            str = scoolCardLimitEntity.prodType;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = scoolCardLimitEntity.dailyLimitType;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = scoolCardLimitEntity.limitTypeDesc;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            yesNoApiEntity = scoolCardLimitEntity.showFlag;
        }
        return scoolCardLimitEntity.copy(i, str4, str5, str6, yesNoApiEntity);
    }

    public final int component1() {
        return this.f63512id;
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

    public final ScoolCardLimitEntity copy(int i, String str, String str2, String str3, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "dailyLimitType");
        C41536l.m120489i(str3, "limitTypeDesc");
        C41536l.m120489i(yesNoApiEntity, "showFlag");
        return new ScoolCardLimitEntity(i, str, str2, str3, yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoolCardLimitEntity)) {
            return false;
        }
        ScoolCardLimitEntity scoolCardLimitEntity = (ScoolCardLimitEntity) obj;
        return this.f63512id == scoolCardLimitEntity.f63512id && C41536l.m120484d(this.prodType, scoolCardLimitEntity.prodType) && C41536l.m120484d(this.dailyLimitType, scoolCardLimitEntity.dailyLimitType) && C41536l.m120484d(this.limitTypeDesc, scoolCardLimitEntity.limitTypeDesc) && this.showFlag == scoolCardLimitEntity.showFlag;
    }

    public final String getDailyLimitType() {
        return this.dailyLimitType;
    }

    public final int getId() {
        return this.f63512id;
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
        return (((((((this.f63512id * 31) + this.prodType.hashCode()) * 31) + this.dailyLimitType.hashCode()) * 31) + this.limitTypeDesc.hashCode()) * 31) + this.showFlag.hashCode();
    }

    public String toString() {
        int i = this.f63512id;
        String str = this.prodType;
        String str2 = this.dailyLimitType;
        String str3 = this.limitTypeDesc;
        YesNoApiEntity yesNoApiEntity = this.showFlag;
        return "ScoolCardLimitEntity(id=" + i + ", prodType=" + str + ", dailyLimitType=" + str2 + ", limitTypeDesc=" + str3 + ", showFlag=" + yesNoApiEntity + ")";
    }
}
