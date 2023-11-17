package p341ge.bog.mobilebank.insurance.travelinsurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.data.model.InsuranceCardExternalFileApiModel */
public final class InsuranceCardExternalFileApiModel {
    private final String fileType;
    private final String fileUrl;
    private final YesNoApiEntity isDark;

    public InsuranceCardExternalFileApiModel(YesNoApiEntity yesNoApiEntity, String str, String str2) {
        C41536l.m120489i(yesNoApiEntity, "isDark");
        C41536l.m120489i(str2, "fileType");
        this.isDark = yesNoApiEntity;
        this.fileUrl = str;
        this.fileType = str2;
    }

    public static /* synthetic */ InsuranceCardExternalFileApiModel copy$default(InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel, YesNoApiEntity yesNoApiEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoApiEntity = insuranceCardExternalFileApiModel.isDark;
        }
        if ((i & 2) != 0) {
            str = insuranceCardExternalFileApiModel.fileUrl;
        }
        if ((i & 4) != 0) {
            str2 = insuranceCardExternalFileApiModel.fileType;
        }
        return insuranceCardExternalFileApiModel.copy(yesNoApiEntity, str, str2);
    }

    public final YesNoApiEntity component1() {
        return this.isDark;
    }

    public final String component2() {
        return this.fileUrl;
    }

    public final String component3() {
        return this.fileType;
    }

    public final InsuranceCardExternalFileApiModel copy(YesNoApiEntity yesNoApiEntity, String str, String str2) {
        C41536l.m120489i(yesNoApiEntity, "isDark");
        C41536l.m120489i(str2, "fileType");
        return new InsuranceCardExternalFileApiModel(yesNoApiEntity, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceCardExternalFileApiModel)) {
            return false;
        }
        InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel = (InsuranceCardExternalFileApiModel) obj;
        return this.isDark == insuranceCardExternalFileApiModel.isDark && C41536l.m120484d(this.fileUrl, insuranceCardExternalFileApiModel.fileUrl) && C41536l.m120484d(this.fileType, insuranceCardExternalFileApiModel.fileType);
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public int hashCode() {
        int hashCode = this.isDark.hashCode() * 31;
        String str = this.fileUrl;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fileType.hashCode();
    }

    public final YesNoApiEntity isDark() {
        return this.isDark;
    }

    public String toString() {
        YesNoApiEntity yesNoApiEntity = this.isDark;
        String str = this.fileUrl;
        String str2 = this.fileType;
        return "InsuranceCardExternalFileApiModel(isDark=" + yesNoApiEntity + ", fileUrl=" + str + ", fileType=" + str2 + ")";
    }
}
