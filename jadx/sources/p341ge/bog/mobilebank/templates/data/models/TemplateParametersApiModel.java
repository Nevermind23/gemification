package p341ge.bog.mobilebank.templates.data.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.templates.data.models.TemplateParametersApiModel */
public final class TemplateParametersApiModel {

    /* renamed from: id */
    private final long f84124id;
    private final Integer parameterIndex;
    private final String parameterKey;
    private final String parameterType;
    private final String parameterValue;
    private final String verifyParameterData;

    public TemplateParametersApiModel(long j, String str, String str2, String str3, Integer num, String str4) {
        this.f84124id = j;
        this.parameterKey = str;
        this.parameterValue = str2;
        this.parameterType = str3;
        this.parameterIndex = num;
        this.verifyParameterData = str4;
    }

    public static /* synthetic */ TemplateParametersApiModel copy$default(TemplateParametersApiModel templateParametersApiModel, long j, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        TemplateParametersApiModel templateParametersApiModel2 = templateParametersApiModel;
        return templateParametersApiModel.copy((i & 1) != 0 ? templateParametersApiModel2.f84124id : j, (i & 2) != 0 ? templateParametersApiModel2.parameterKey : str, (i & 4) != 0 ? templateParametersApiModel2.parameterValue : str2, (i & 8) != 0 ? templateParametersApiModel2.parameterType : str3, (i & 16) != 0 ? templateParametersApiModel2.parameterIndex : num, (i & 32) != 0 ? templateParametersApiModel2.verifyParameterData : str4);
    }

    public final long component1() {
        return this.f84124id;
    }

    public final String component2() {
        return this.parameterKey;
    }

    public final String component3() {
        return this.parameterValue;
    }

    public final String component4() {
        return this.parameterType;
    }

    public final Integer component5() {
        return this.parameterIndex;
    }

    public final String component6() {
        return this.verifyParameterData;
    }

    public final TemplateParametersApiModel copy(long j, String str, String str2, String str3, Integer num, String str4) {
        return new TemplateParametersApiModel(j, str, str2, str3, num, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateParametersApiModel)) {
            return false;
        }
        TemplateParametersApiModel templateParametersApiModel = (TemplateParametersApiModel) obj;
        return this.f84124id == templateParametersApiModel.f84124id && C41536l.m120484d(this.parameterKey, templateParametersApiModel.parameterKey) && C41536l.m120484d(this.parameterValue, templateParametersApiModel.parameterValue) && C41536l.m120484d(this.parameterType, templateParametersApiModel.parameterType) && C41536l.m120484d(this.parameterIndex, templateParametersApiModel.parameterIndex) && C41536l.m120484d(this.verifyParameterData, templateParametersApiModel.verifyParameterData);
    }

    public final long getId() {
        return this.f84124id;
    }

    public final Integer getParameterIndex() {
        return this.parameterIndex;
    }

    public final String getParameterKey() {
        return this.parameterKey;
    }

    public final String getParameterType() {
        return this.parameterType;
    }

    public final String getParameterValue() {
        return this.parameterValue;
    }

    public final String getVerifyParameterData() {
        return this.verifyParameterData;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f84124id) * 31;
        String str = this.parameterKey;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parameterValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parameterType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.parameterIndex;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.verifyParameterData;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.f84124id;
        String str = this.parameterKey;
        String str2 = this.parameterValue;
        String str3 = this.parameterType;
        Integer num = this.parameterIndex;
        String str4 = this.verifyParameterData;
        return "TemplateParametersApiModel(id=" + j + ", parameterKey=" + str + ", parameterValue=" + str2 + ", parameterType=" + str3 + ", parameterIndex=" + num + ", verifyParameterData=" + str4 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TemplateParametersApiModel(long j, String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4);
    }
}
