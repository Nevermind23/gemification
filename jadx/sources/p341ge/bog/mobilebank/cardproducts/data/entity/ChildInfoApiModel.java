package p341ge.bog.mobilebank.cardproducts.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardproducts.data.entity.ChildInfoApiModel */
public final class ChildInfoApiModel {
    private final long birthDate;
    private final long clientKey;
    private final String financialPhone;
    private final String firstName;
    private final String firstNameInt;
    private final String lastName;
    private final String lastNameInt;
    private final String pin;

    public ChildInfoApiModel(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str2, "firstName");
        C41536l.m120489i(str3, "firstNameInt");
        C41536l.m120489i(str4, "lastName");
        C41536l.m120489i(str5, "lastNameInt");
        C41536l.m120489i(str6, "pin");
        this.birthDate = j;
        this.clientKey = j2;
        this.financialPhone = str;
        this.firstName = str2;
        this.firstNameInt = str3;
        this.lastName = str4;
        this.lastNameInt = str5;
        this.pin = str6;
    }

    public static /* synthetic */ ChildInfoApiModel copy$default(ChildInfoApiModel childInfoApiModel, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        ChildInfoApiModel childInfoApiModel2 = childInfoApiModel;
        int i2 = i;
        return childInfoApiModel.copy((i2 & 1) != 0 ? childInfoApiModel2.birthDate : j, (i2 & 2) != 0 ? childInfoApiModel2.clientKey : j2, (i2 & 4) != 0 ? childInfoApiModel2.financialPhone : str, (i2 & 8) != 0 ? childInfoApiModel2.firstName : str2, (i2 & 16) != 0 ? childInfoApiModel2.firstNameInt : str3, (i2 & 32) != 0 ? childInfoApiModel2.lastName : str4, (i2 & 64) != 0 ? childInfoApiModel2.lastNameInt : str5, (i2 & 128) != 0 ? childInfoApiModel2.pin : str6);
    }

    public final long component1() {
        return this.birthDate;
    }

    public final long component2() {
        return this.clientKey;
    }

    public final String component3() {
        return this.financialPhone;
    }

    public final String component4() {
        return this.firstName;
    }

    public final String component5() {
        return this.firstNameInt;
    }

    public final String component6() {
        return this.lastName;
    }

    public final String component7() {
        return this.lastNameInt;
    }

    public final String component8() {
        return this.pin;
    }

    public final ChildInfoApiModel copy(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str2;
        C41536l.m120489i(str7, "firstName");
        String str8 = str3;
        C41536l.m120489i(str8, "firstNameInt");
        String str9 = str4;
        C41536l.m120489i(str9, "lastName");
        String str10 = str5;
        C41536l.m120489i(str10, "lastNameInt");
        String str11 = str6;
        C41536l.m120489i(str11, "pin");
        return new ChildInfoApiModel(j, j2, str, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildInfoApiModel)) {
            return false;
        }
        ChildInfoApiModel childInfoApiModel = (ChildInfoApiModel) obj;
        return this.birthDate == childInfoApiModel.birthDate && this.clientKey == childInfoApiModel.clientKey && C41536l.m120484d(this.financialPhone, childInfoApiModel.financialPhone) && C41536l.m120484d(this.firstName, childInfoApiModel.firstName) && C41536l.m120484d(this.firstNameInt, childInfoApiModel.firstNameInt) && C41536l.m120484d(this.lastName, childInfoApiModel.lastName) && C41536l.m120484d(this.lastNameInt, childInfoApiModel.lastNameInt) && C41536l.m120484d(this.pin, childInfoApiModel.pin);
    }

    public final long getBirthDate() {
        return this.birthDate;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final String getFinancialPhone() {
        return this.financialPhone;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFirstNameInt() {
        return this.firstNameInt;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLastNameInt() {
        return this.lastNameInt;
    }

    public final String getPin() {
        return this.pin;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.birthDate) * 31) + C7397t.m28148a(this.clientKey)) * 31;
        String str = this.financialPhone;
        return ((((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.firstName.hashCode()) * 31) + this.firstNameInt.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.lastNameInt.hashCode()) * 31) + this.pin.hashCode();
    }

    public String toString() {
        long j = this.birthDate;
        long j2 = this.clientKey;
        String str = this.financialPhone;
        String str2 = this.firstName;
        String str3 = this.firstNameInt;
        String str4 = this.lastName;
        String str5 = this.lastNameInt;
        String str6 = this.pin;
        return "ChildInfoApiModel(birthDate=" + j + ", clientKey=" + j2 + ", financialPhone=" + str + ", firstName=" + str2 + ", firstNameInt=" + str3 + ", lastName=" + str4 + ", lastNameInt=" + str5 + ", pin=" + str6 + ")";
    }
}
