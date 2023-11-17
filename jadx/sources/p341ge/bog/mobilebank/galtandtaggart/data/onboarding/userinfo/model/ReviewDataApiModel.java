package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.ReviewDataApiModel */
public final class ReviewDataApiModel {
    private final BasicInfoApiModel basicInfo;
    private final EmplInfoApiModel employmentInfo;
    private final IdentificationInfoApiModel identificationInfo;
    private final InvestmentProfileInfoApiModel investorProfileInfo;
    private final AddressApiModel juridicalAddress;
    private final PersonalInfoApiModel personalInfo;
    private final AddressApiModel physicalAddress;

    public ReviewDataApiModel(BasicInfoApiModel basicInfoApiModel, AddressApiModel addressApiModel, AddressApiModel addressApiModel2, EmplInfoApiModel emplInfoApiModel, IdentificationInfoApiModel identificationInfoApiModel, PersonalInfoApiModel personalInfoApiModel, InvestmentProfileInfoApiModel investmentProfileInfoApiModel) {
        this.basicInfo = basicInfoApiModel;
        this.juridicalAddress = addressApiModel;
        this.physicalAddress = addressApiModel2;
        this.employmentInfo = emplInfoApiModel;
        this.identificationInfo = identificationInfoApiModel;
        this.personalInfo = personalInfoApiModel;
        this.investorProfileInfo = investmentProfileInfoApiModel;
    }

    public static /* synthetic */ ReviewDataApiModel copy$default(ReviewDataApiModel reviewDataApiModel, BasicInfoApiModel basicInfoApiModel, AddressApiModel addressApiModel, AddressApiModel addressApiModel2, EmplInfoApiModel emplInfoApiModel, IdentificationInfoApiModel identificationInfoApiModel, PersonalInfoApiModel personalInfoApiModel, InvestmentProfileInfoApiModel investmentProfileInfoApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            basicInfoApiModel = reviewDataApiModel.basicInfo;
        }
        if ((i & 2) != 0) {
            addressApiModel = reviewDataApiModel.juridicalAddress;
        }
        AddressApiModel addressApiModel3 = addressApiModel;
        if ((i & 4) != 0) {
            addressApiModel2 = reviewDataApiModel.physicalAddress;
        }
        AddressApiModel addressApiModel4 = addressApiModel2;
        if ((i & 8) != 0) {
            emplInfoApiModel = reviewDataApiModel.employmentInfo;
        }
        EmplInfoApiModel emplInfoApiModel2 = emplInfoApiModel;
        if ((i & 16) != 0) {
            identificationInfoApiModel = reviewDataApiModel.identificationInfo;
        }
        IdentificationInfoApiModel identificationInfoApiModel2 = identificationInfoApiModel;
        if ((i & 32) != 0) {
            personalInfoApiModel = reviewDataApiModel.personalInfo;
        }
        PersonalInfoApiModel personalInfoApiModel2 = personalInfoApiModel;
        if ((i & 64) != 0) {
            investmentProfileInfoApiModel = reviewDataApiModel.investorProfileInfo;
        }
        return reviewDataApiModel.copy(basicInfoApiModel, addressApiModel3, addressApiModel4, emplInfoApiModel2, identificationInfoApiModel2, personalInfoApiModel2, investmentProfileInfoApiModel);
    }

    public final BasicInfoApiModel component1() {
        return this.basicInfo;
    }

    public final AddressApiModel component2() {
        return this.juridicalAddress;
    }

    public final AddressApiModel component3() {
        return this.physicalAddress;
    }

    public final EmplInfoApiModel component4() {
        return this.employmentInfo;
    }

    public final IdentificationInfoApiModel component5() {
        return this.identificationInfo;
    }

    public final PersonalInfoApiModel component6() {
        return this.personalInfo;
    }

    public final InvestmentProfileInfoApiModel component7() {
        return this.investorProfileInfo;
    }

    public final ReviewDataApiModel copy(BasicInfoApiModel basicInfoApiModel, AddressApiModel addressApiModel, AddressApiModel addressApiModel2, EmplInfoApiModel emplInfoApiModel, IdentificationInfoApiModel identificationInfoApiModel, PersonalInfoApiModel personalInfoApiModel, InvestmentProfileInfoApiModel investmentProfileInfoApiModel) {
        return new ReviewDataApiModel(basicInfoApiModel, addressApiModel, addressApiModel2, emplInfoApiModel, identificationInfoApiModel, personalInfoApiModel, investmentProfileInfoApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewDataApiModel)) {
            return false;
        }
        ReviewDataApiModel reviewDataApiModel = (ReviewDataApiModel) obj;
        return C41536l.m120484d(this.basicInfo, reviewDataApiModel.basicInfo) && C41536l.m120484d(this.juridicalAddress, reviewDataApiModel.juridicalAddress) && C41536l.m120484d(this.physicalAddress, reviewDataApiModel.physicalAddress) && C41536l.m120484d(this.employmentInfo, reviewDataApiModel.employmentInfo) && C41536l.m120484d(this.identificationInfo, reviewDataApiModel.identificationInfo) && C41536l.m120484d(this.personalInfo, reviewDataApiModel.personalInfo) && C41536l.m120484d(this.investorProfileInfo, reviewDataApiModel.investorProfileInfo);
    }

    public final BasicInfoApiModel getBasicInfo() {
        return this.basicInfo;
    }

    public final EmplInfoApiModel getEmploymentInfo() {
        return this.employmentInfo;
    }

    public final IdentificationInfoApiModel getIdentificationInfo() {
        return this.identificationInfo;
    }

    public final InvestmentProfileInfoApiModel getInvestorProfileInfo() {
        return this.investorProfileInfo;
    }

    public final AddressApiModel getJuridicalAddress() {
        return this.juridicalAddress;
    }

    public final PersonalInfoApiModel getPersonalInfo() {
        return this.personalInfo;
    }

    public final AddressApiModel getPhysicalAddress() {
        return this.physicalAddress;
    }

    public int hashCode() {
        BasicInfoApiModel basicInfoApiModel = this.basicInfo;
        int i = 0;
        int hashCode = (basicInfoApiModel == null ? 0 : basicInfoApiModel.hashCode()) * 31;
        AddressApiModel addressApiModel = this.juridicalAddress;
        int hashCode2 = (hashCode + (addressApiModel == null ? 0 : addressApiModel.hashCode())) * 31;
        AddressApiModel addressApiModel2 = this.physicalAddress;
        int hashCode3 = (hashCode2 + (addressApiModel2 == null ? 0 : addressApiModel2.hashCode())) * 31;
        EmplInfoApiModel emplInfoApiModel = this.employmentInfo;
        int hashCode4 = (hashCode3 + (emplInfoApiModel == null ? 0 : emplInfoApiModel.hashCode())) * 31;
        IdentificationInfoApiModel identificationInfoApiModel = this.identificationInfo;
        int hashCode5 = (hashCode4 + (identificationInfoApiModel == null ? 0 : identificationInfoApiModel.hashCode())) * 31;
        PersonalInfoApiModel personalInfoApiModel = this.personalInfo;
        int hashCode6 = (hashCode5 + (personalInfoApiModel == null ? 0 : personalInfoApiModel.hashCode())) * 31;
        InvestmentProfileInfoApiModel investmentProfileInfoApiModel = this.investorProfileInfo;
        if (investmentProfileInfoApiModel != null) {
            i = investmentProfileInfoApiModel.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        BasicInfoApiModel basicInfoApiModel = this.basicInfo;
        AddressApiModel addressApiModel = this.juridicalAddress;
        AddressApiModel addressApiModel2 = this.physicalAddress;
        EmplInfoApiModel emplInfoApiModel = this.employmentInfo;
        IdentificationInfoApiModel identificationInfoApiModel = this.identificationInfo;
        PersonalInfoApiModel personalInfoApiModel = this.personalInfo;
        InvestmentProfileInfoApiModel investmentProfileInfoApiModel = this.investorProfileInfo;
        return "ReviewDataApiModel(basicInfo=" + basicInfoApiModel + ", juridicalAddress=" + addressApiModel + ", physicalAddress=" + addressApiModel2 + ", employmentInfo=" + emplInfoApiModel + ", identificationInfo=" + identificationInfoApiModel + ", personalInfo=" + personalInfoApiModel + ", investorProfileInfo=" + investmentProfileInfoApiModel + ")";
    }
}
