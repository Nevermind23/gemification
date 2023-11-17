package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.EmploymentInfoApiModel */
public final class EmploymentInfoApiModel {
    private final boolean brokerValue;
    private final String directorOfNameValue;
    private final String directorOfSymbolValue;
    private final String employerNameValue;
    private final List<SubTypeApiModel> occupationStatusLOV;
    private final String occupationStatusValue;
    private final List<SubTypeApiModel> positionLOV;
    private final String positionValue;
    private final List<SubTypeApiModel> sectorLOV;
    private final String sectorValue;

    public EmploymentInfoApiModel(String str, List<SubTypeApiModel> list, String str2, String str3, List<SubTypeApiModel> list2, String str4, List<SubTypeApiModel> list3, boolean z, String str5, String str6) {
        C41536l.m120489i(list, "occupationStatusLOV");
        C41536l.m120489i(list2, "sectorLOV");
        C41536l.m120489i(list3, "positionLOV");
        this.occupationStatusValue = str;
        this.occupationStatusLOV = list;
        this.employerNameValue = str2;
        this.sectorValue = str3;
        this.sectorLOV = list2;
        this.positionValue = str4;
        this.positionLOV = list3;
        this.brokerValue = z;
        this.directorOfNameValue = str5;
        this.directorOfSymbolValue = str6;
    }

    public static /* synthetic */ EmploymentInfoApiModel copy$default(EmploymentInfoApiModel employmentInfoApiModel, String str, List list, String str2, String str3, List list2, String str4, List list3, boolean z, String str5, String str6, int i, Object obj) {
        EmploymentInfoApiModel employmentInfoApiModel2 = employmentInfoApiModel;
        int i2 = i;
        return employmentInfoApiModel.copy((i2 & 1) != 0 ? employmentInfoApiModel2.occupationStatusValue : str, (i2 & 2) != 0 ? employmentInfoApiModel2.occupationStatusLOV : list, (i2 & 4) != 0 ? employmentInfoApiModel2.employerNameValue : str2, (i2 & 8) != 0 ? employmentInfoApiModel2.sectorValue : str3, (i2 & 16) != 0 ? employmentInfoApiModel2.sectorLOV : list2, (i2 & 32) != 0 ? employmentInfoApiModel2.positionValue : str4, (i2 & 64) != 0 ? employmentInfoApiModel2.positionLOV : list3, (i2 & 128) != 0 ? employmentInfoApiModel2.brokerValue : z, (i2 & C11398b.f33139r) != 0 ? employmentInfoApiModel2.directorOfNameValue : str5, (i2 & C11398b.f33140s) != 0 ? employmentInfoApiModel2.directorOfSymbolValue : str6);
    }

    public final String component1() {
        return this.occupationStatusValue;
    }

    public final String component10() {
        return this.directorOfSymbolValue;
    }

    public final List<SubTypeApiModel> component2() {
        return this.occupationStatusLOV;
    }

    public final String component3() {
        return this.employerNameValue;
    }

    public final String component4() {
        return this.sectorValue;
    }

    public final List<SubTypeApiModel> component5() {
        return this.sectorLOV;
    }

    public final String component6() {
        return this.positionValue;
    }

    public final List<SubTypeApiModel> component7() {
        return this.positionLOV;
    }

    public final boolean component8() {
        return this.brokerValue;
    }

    public final String component9() {
        return this.directorOfNameValue;
    }

    public final EmploymentInfoApiModel copy(String str, List<SubTypeApiModel> list, String str2, String str3, List<SubTypeApiModel> list2, String str4, List<SubTypeApiModel> list3, boolean z, String str5, String str6) {
        C41536l.m120489i(list, "occupationStatusLOV");
        List<SubTypeApiModel> list4 = list2;
        C41536l.m120489i(list4, "sectorLOV");
        List<SubTypeApiModel> list5 = list3;
        C41536l.m120489i(list5, "positionLOV");
        return new EmploymentInfoApiModel(str, list, str2, str3, list4, str4, list5, z, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmploymentInfoApiModel)) {
            return false;
        }
        EmploymentInfoApiModel employmentInfoApiModel = (EmploymentInfoApiModel) obj;
        return C41536l.m120484d(this.occupationStatusValue, employmentInfoApiModel.occupationStatusValue) && C41536l.m120484d(this.occupationStatusLOV, employmentInfoApiModel.occupationStatusLOV) && C41536l.m120484d(this.employerNameValue, employmentInfoApiModel.employerNameValue) && C41536l.m120484d(this.sectorValue, employmentInfoApiModel.sectorValue) && C41536l.m120484d(this.sectorLOV, employmentInfoApiModel.sectorLOV) && C41536l.m120484d(this.positionValue, employmentInfoApiModel.positionValue) && C41536l.m120484d(this.positionLOV, employmentInfoApiModel.positionLOV) && this.brokerValue == employmentInfoApiModel.brokerValue && C41536l.m120484d(this.directorOfNameValue, employmentInfoApiModel.directorOfNameValue) && C41536l.m120484d(this.directorOfSymbolValue, employmentInfoApiModel.directorOfSymbolValue);
    }

    public final boolean getBrokerValue() {
        return this.brokerValue;
    }

    public final String getDirectorOfNameValue() {
        return this.directorOfNameValue;
    }

    public final String getDirectorOfSymbolValue() {
        return this.directorOfSymbolValue;
    }

    public final String getEmployerNameValue() {
        return this.employerNameValue;
    }

    public final List<SubTypeApiModel> getOccupationStatusLOV() {
        return this.occupationStatusLOV;
    }

    public final String getOccupationStatusValue() {
        return this.occupationStatusValue;
    }

    public final List<SubTypeApiModel> getPositionLOV() {
        return this.positionLOV;
    }

    public final String getPositionValue() {
        return this.positionValue;
    }

    public final List<SubTypeApiModel> getSectorLOV() {
        return this.sectorLOV;
    }

    public final String getSectorValue() {
        return this.sectorValue;
    }

    public int hashCode() {
        String str = this.occupationStatusValue;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.occupationStatusLOV.hashCode()) * 31;
        String str2 = this.employerNameValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectorValue;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.sectorLOV.hashCode()) * 31;
        String str4 = this.positionValue;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.positionLOV.hashCode()) * 31;
        boolean z = this.brokerValue;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str5 = this.directorOfNameValue;
        int hashCode5 = (i2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.directorOfSymbolValue;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.occupationStatusValue;
        List<SubTypeApiModel> list = this.occupationStatusLOV;
        String str2 = this.employerNameValue;
        String str3 = this.sectorValue;
        List<SubTypeApiModel> list2 = this.sectorLOV;
        String str4 = this.positionValue;
        List<SubTypeApiModel> list3 = this.positionLOV;
        boolean z = this.brokerValue;
        String str5 = this.directorOfNameValue;
        String str6 = this.directorOfSymbolValue;
        return "EmploymentInfoApiModel(occupationStatusValue=" + str + ", occupationStatusLOV=" + list + ", employerNameValue=" + str2 + ", sectorValue=" + str3 + ", sectorLOV=" + list2 + ", positionValue=" + str4 + ", positionLOV=" + list3 + ", brokerValue=" + z + ", directorOfNameValue=" + str5 + ", directorOfSymbolValue=" + str6 + ")";
    }
}
