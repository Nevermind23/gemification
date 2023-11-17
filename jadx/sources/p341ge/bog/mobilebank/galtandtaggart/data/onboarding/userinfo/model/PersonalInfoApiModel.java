package p341ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.onboarding.userinfo.model.PersonalInfoApiModel */
public final class PersonalInfoApiModel {
    private final Integer birthDay;
    private final Integer birthMonth;
    private final Integer birthYear;
    private final String gender;

    public PersonalInfoApiModel(Integer num, Integer num2, Integer num3, String str) {
        this.birthYear = num;
        this.birthMonth = num2;
        this.birthDay = num3;
        this.gender = str;
    }

    public static /* synthetic */ PersonalInfoApiModel copy$default(PersonalInfoApiModel personalInfoApiModel, Integer num, Integer num2, Integer num3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = personalInfoApiModel.birthYear;
        }
        if ((i & 2) != 0) {
            num2 = personalInfoApiModel.birthMonth;
        }
        if ((i & 4) != 0) {
            num3 = personalInfoApiModel.birthDay;
        }
        if ((i & 8) != 0) {
            str = personalInfoApiModel.gender;
        }
        return personalInfoApiModel.copy(num, num2, num3, str);
    }

    public final Integer component1() {
        return this.birthYear;
    }

    public final Integer component2() {
        return this.birthMonth;
    }

    public final Integer component3() {
        return this.birthDay;
    }

    public final String component4() {
        return this.gender;
    }

    public final PersonalInfoApiModel copy(Integer num, Integer num2, Integer num3, String str) {
        return new PersonalInfoApiModel(num, num2, num3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalInfoApiModel)) {
            return false;
        }
        PersonalInfoApiModel personalInfoApiModel = (PersonalInfoApiModel) obj;
        return C41536l.m120484d(this.birthYear, personalInfoApiModel.birthYear) && C41536l.m120484d(this.birthMonth, personalInfoApiModel.birthMonth) && C41536l.m120484d(this.birthDay, personalInfoApiModel.birthDay) && C41536l.m120484d(this.gender, personalInfoApiModel.gender);
    }

    public final Integer getBirthDay() {
        return this.birthDay;
    }

    public final Integer getBirthMonth() {
        return this.birthMonth;
    }

    public final Integer getBirthYear() {
        return this.birthYear;
    }

    public final String getGender() {
        return this.gender;
    }

    public int hashCode() {
        Integer num = this.birthYear;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.birthMonth;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.birthDay;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.gender;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        Integer num = this.birthYear;
        Integer num2 = this.birthMonth;
        Integer num3 = this.birthDay;
        String str = this.gender;
        return "PersonalInfoApiModel(birthYear=" + num + ", birthMonth=" + num2 + ", birthDay=" + num3 + ", gender=" + str + ")";
    }
}
