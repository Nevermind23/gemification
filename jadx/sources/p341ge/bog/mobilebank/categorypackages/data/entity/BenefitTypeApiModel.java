package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.BenefitTypeApiModel */
public final class BenefitTypeApiModel {
    private final String detailsTextDKey;
    private final ExternalFileApiModel externalFile;
    private final String headerTextDKey;

    public BenefitTypeApiModel(String str, String str2, ExternalFileApiModel externalFileApiModel) {
        this.headerTextDKey = str;
        this.detailsTextDKey = str2;
        this.externalFile = externalFileApiModel;
    }

    public static /* synthetic */ BenefitTypeApiModel copy$default(BenefitTypeApiModel benefitTypeApiModel, String str, String str2, ExternalFileApiModel externalFileApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = benefitTypeApiModel.headerTextDKey;
        }
        if ((i & 2) != 0) {
            str2 = benefitTypeApiModel.detailsTextDKey;
        }
        if ((i & 4) != 0) {
            externalFileApiModel = benefitTypeApiModel.externalFile;
        }
        return benefitTypeApiModel.copy(str, str2, externalFileApiModel);
    }

    public final String component1() {
        return this.headerTextDKey;
    }

    public final String component2() {
        return this.detailsTextDKey;
    }

    public final ExternalFileApiModel component3() {
        return this.externalFile;
    }

    public final BenefitTypeApiModel copy(String str, String str2, ExternalFileApiModel externalFileApiModel) {
        return new BenefitTypeApiModel(str, str2, externalFileApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitTypeApiModel)) {
            return false;
        }
        BenefitTypeApiModel benefitTypeApiModel = (BenefitTypeApiModel) obj;
        return C41536l.m120484d(this.headerTextDKey, benefitTypeApiModel.headerTextDKey) && C41536l.m120484d(this.detailsTextDKey, benefitTypeApiModel.detailsTextDKey) && C41536l.m120484d(this.externalFile, benefitTypeApiModel.externalFile);
    }

    public final String getDetailsTextDKey() {
        return this.detailsTextDKey;
    }

    public final ExternalFileApiModel getExternalFile() {
        return this.externalFile;
    }

    public final String getHeaderTextDKey() {
        return this.headerTextDKey;
    }

    public int hashCode() {
        String str = this.headerTextDKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.detailsTextDKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExternalFileApiModel externalFileApiModel = this.externalFile;
        if (externalFileApiModel != null) {
            i = externalFileApiModel.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.headerTextDKey;
        String str2 = this.detailsTextDKey;
        ExternalFileApiModel externalFileApiModel = this.externalFile;
        return "BenefitTypeApiModel(headerTextDKey=" + str + ", detailsTextDKey=" + str2 + ", externalFile=" + externalFileApiModel + ")";
    }
}
