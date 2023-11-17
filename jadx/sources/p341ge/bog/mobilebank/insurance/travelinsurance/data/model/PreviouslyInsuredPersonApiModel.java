package p341ge.bog.mobilebank.insurance.travelinsurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.data.model.PreviouslyInsuredPersonApiModel */
public final class PreviouslyInsuredPersonApiModel {
    private final Long insuredBirthDate;
    private final String insuredFirstNameEn;
    private final String insuredLastNameEn;
    private final String insuredPin;
    private final String insurerFirstName;
    private final String insurerLastName;

    public PreviouslyInsuredPersonApiModel(String str, String str2, String str3, String str4, String str5, Long l) {
        this.insurerFirstName = str;
        this.insurerLastName = str2;
        this.insuredFirstNameEn = str3;
        this.insuredLastNameEn = str4;
        this.insuredPin = str5;
        this.insuredBirthDate = l;
    }

    public static /* synthetic */ PreviouslyInsuredPersonApiModel copy$default(PreviouslyInsuredPersonApiModel previouslyInsuredPersonApiModel, String str, String str2, String str3, String str4, String str5, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previouslyInsuredPersonApiModel.insurerFirstName;
        }
        if ((i & 2) != 0) {
            str2 = previouslyInsuredPersonApiModel.insurerLastName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = previouslyInsuredPersonApiModel.insuredFirstNameEn;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = previouslyInsuredPersonApiModel.insuredLastNameEn;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = previouslyInsuredPersonApiModel.insuredPin;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            l = previouslyInsuredPersonApiModel.insuredBirthDate;
        }
        return previouslyInsuredPersonApiModel.copy(str, str6, str7, str8, str9, l);
    }

    public final String component1() {
        return this.insurerFirstName;
    }

    public final String component2() {
        return this.insurerLastName;
    }

    public final String component3() {
        return this.insuredFirstNameEn;
    }

    public final String component4() {
        return this.insuredLastNameEn;
    }

    public final String component5() {
        return this.insuredPin;
    }

    public final Long component6() {
        return this.insuredBirthDate;
    }

    public final PreviouslyInsuredPersonApiModel copy(String str, String str2, String str3, String str4, String str5, Long l) {
        return new PreviouslyInsuredPersonApiModel(str, str2, str3, str4, str5, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviouslyInsuredPersonApiModel)) {
            return false;
        }
        PreviouslyInsuredPersonApiModel previouslyInsuredPersonApiModel = (PreviouslyInsuredPersonApiModel) obj;
        return C41536l.m120484d(this.insurerFirstName, previouslyInsuredPersonApiModel.insurerFirstName) && C41536l.m120484d(this.insurerLastName, previouslyInsuredPersonApiModel.insurerLastName) && C41536l.m120484d(this.insuredFirstNameEn, previouslyInsuredPersonApiModel.insuredFirstNameEn) && C41536l.m120484d(this.insuredLastNameEn, previouslyInsuredPersonApiModel.insuredLastNameEn) && C41536l.m120484d(this.insuredPin, previouslyInsuredPersonApiModel.insuredPin) && C41536l.m120484d(this.insuredBirthDate, previouslyInsuredPersonApiModel.insuredBirthDate);
    }

    public final Long getInsuredBirthDate() {
        return this.insuredBirthDate;
    }

    public final String getInsuredFirstNameEn() {
        return this.insuredFirstNameEn;
    }

    public final String getInsuredLastNameEn() {
        return this.insuredLastNameEn;
    }

    public final String getInsuredPin() {
        return this.insuredPin;
    }

    public final String getInsurerFirstName() {
        return this.insurerFirstName;
    }

    public final String getInsurerLastName() {
        return this.insurerLastName;
    }

    public int hashCode() {
        String str = this.insurerFirstName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.insurerLastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.insuredFirstNameEn;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.insuredLastNameEn;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.insuredPin;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.insuredBirthDate;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.insurerFirstName;
        String str2 = this.insurerLastName;
        String str3 = this.insuredFirstNameEn;
        String str4 = this.insuredLastNameEn;
        String str5 = this.insuredPin;
        Long l = this.insuredBirthDate;
        return "PreviouslyInsuredPersonApiModel(insurerFirstName=" + str + ", insurerLastName=" + str2 + ", insuredFirstNameEn=" + str3 + ", insuredLastNameEn=" + str4 + ", insuredPin=" + str5 + ", insuredBirthDate=" + l + ")";
    }
}
