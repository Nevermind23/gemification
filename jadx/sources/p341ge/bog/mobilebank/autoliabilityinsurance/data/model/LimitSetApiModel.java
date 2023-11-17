package p341ge.bog.mobilebank.autoliabilityinsurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.data.model.LimitSetApiModel */
public final class LimitSetApiModel {
    private final String limitCode;
    private final String limitEn;
    private final String limitGe;

    public LimitSetApiModel(String str, String str2, String str3) {
        C41536l.m120489i(str, "limitCode");
        C41536l.m120489i(str2, "limitGe");
        C41536l.m120489i(str3, "limitEn");
        this.limitCode = str;
        this.limitGe = str2;
        this.limitEn = str3;
    }

    public static /* synthetic */ LimitSetApiModel copy$default(LimitSetApiModel limitSetApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitSetApiModel.limitCode;
        }
        if ((i & 2) != 0) {
            str2 = limitSetApiModel.limitGe;
        }
        if ((i & 4) != 0) {
            str3 = limitSetApiModel.limitEn;
        }
        return limitSetApiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.limitCode;
    }

    public final String component2() {
        return this.limitGe;
    }

    public final String component3() {
        return this.limitEn;
    }

    public final LimitSetApiModel copy(String str, String str2, String str3) {
        C41536l.m120489i(str, "limitCode");
        C41536l.m120489i(str2, "limitGe");
        C41536l.m120489i(str3, "limitEn");
        return new LimitSetApiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitSetApiModel)) {
            return false;
        }
        LimitSetApiModel limitSetApiModel = (LimitSetApiModel) obj;
        return C41536l.m120484d(this.limitCode, limitSetApiModel.limitCode) && C41536l.m120484d(this.limitGe, limitSetApiModel.limitGe) && C41536l.m120484d(this.limitEn, limitSetApiModel.limitEn);
    }

    public final String getLimitCode() {
        return this.limitCode;
    }

    public final String getLimitEn() {
        return this.limitEn;
    }

    public final String getLimitGe() {
        return this.limitGe;
    }

    public int hashCode() {
        return (((this.limitCode.hashCode() * 31) + this.limitGe.hashCode()) * 31) + this.limitEn.hashCode();
    }

    public String toString() {
        String str = this.limitCode;
        String str2 = this.limitGe;
        String str3 = this.limitEn;
        return "LimitSetApiModel(limitCode=" + str + ", limitGe=" + str2 + ", limitEn=" + str3 + ")";
    }
}
