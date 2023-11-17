package p341ge.bog.mobilebank.loanactivation.data.entity.loandecision;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.loandecision.ParamInfoApiModel */
public final class ParamInfoApiModel {
    private final String parameterCode;
    private final String parameterValue;

    public ParamInfoApiModel(String str, String str2) {
        this.parameterCode = str;
        this.parameterValue = str2;
    }

    public static /* synthetic */ ParamInfoApiModel copy$default(ParamInfoApiModel paramInfoApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paramInfoApiModel.parameterCode;
        }
        if ((i & 2) != 0) {
            str2 = paramInfoApiModel.parameterValue;
        }
        return paramInfoApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.parameterCode;
    }

    public final String component2() {
        return this.parameterValue;
    }

    public final ParamInfoApiModel copy(String str, String str2) {
        return new ParamInfoApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParamInfoApiModel)) {
            return false;
        }
        ParamInfoApiModel paramInfoApiModel = (ParamInfoApiModel) obj;
        return C41536l.m120484d(this.parameterCode, paramInfoApiModel.parameterCode) && C41536l.m120484d(this.parameterValue, paramInfoApiModel.parameterValue);
    }

    public final String getParameterCode() {
        return this.parameterCode;
    }

    public final String getParameterValue() {
        return this.parameterValue;
    }

    public int hashCode() {
        String str = this.parameterCode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.parameterValue;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.parameterCode;
        String str2 = this.parameterValue;
        return "ParamInfoApiModel(parameterCode=" + str + ", parameterValue=" + str2 + ")";
    }
}
