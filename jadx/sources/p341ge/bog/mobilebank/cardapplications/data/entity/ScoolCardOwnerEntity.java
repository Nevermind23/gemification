package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.ScoolCardOwnerEntity */
public final class ScoolCardOwnerEntity {
    private final long birthDate;
    private final long childClientKey;
    private final String firstName;
    private final String firstNameInt;
    private final String lastName;
    private final String lastNameInt;
    private final String pin;

    public ScoolCardOwnerEntity(long j, String str, String str2, String str3, String str4, long j2, String str5) {
        C41536l.m120489i(str, "firstName");
        C41536l.m120489i(str2, "lastName");
        this.childClientKey = j;
        this.firstName = str;
        this.lastName = str2;
        this.firstNameInt = str3;
        this.lastNameInt = str4;
        this.birthDate = j2;
        this.pin = str5;
    }

    public static /* synthetic */ ScoolCardOwnerEntity copy$default(ScoolCardOwnerEntity scoolCardOwnerEntity, long j, String str, String str2, String str3, String str4, long j2, String str5, int i, Object obj) {
        ScoolCardOwnerEntity scoolCardOwnerEntity2 = scoolCardOwnerEntity;
        return scoolCardOwnerEntity.copy((i & 1) != 0 ? scoolCardOwnerEntity2.childClientKey : j, (i & 2) != 0 ? scoolCardOwnerEntity2.firstName : str, (i & 4) != 0 ? scoolCardOwnerEntity2.lastName : str2, (i & 8) != 0 ? scoolCardOwnerEntity2.firstNameInt : str3, (i & 16) != 0 ? scoolCardOwnerEntity2.lastNameInt : str4, (i & 32) != 0 ? scoolCardOwnerEntity2.birthDate : j2, (i & 64) != 0 ? scoolCardOwnerEntity2.pin : str5);
    }

    public final long component1() {
        return this.childClientKey;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.firstNameInt;
    }

    public final String component5() {
        return this.lastNameInt;
    }

    public final long component6() {
        return this.birthDate;
    }

    public final String component7() {
        return this.pin;
    }

    public final ScoolCardOwnerEntity copy(long j, String str, String str2, String str3, String str4, long j2, String str5) {
        C41536l.m120489i(str, "firstName");
        C41536l.m120489i(str2, "lastName");
        return new ScoolCardOwnerEntity(j, str, str2, str3, str4, j2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoolCardOwnerEntity)) {
            return false;
        }
        ScoolCardOwnerEntity scoolCardOwnerEntity = (ScoolCardOwnerEntity) obj;
        return this.childClientKey == scoolCardOwnerEntity.childClientKey && C41536l.m120484d(this.firstName, scoolCardOwnerEntity.firstName) && C41536l.m120484d(this.lastName, scoolCardOwnerEntity.lastName) && C41536l.m120484d(this.firstNameInt, scoolCardOwnerEntity.firstNameInt) && C41536l.m120484d(this.lastNameInt, scoolCardOwnerEntity.lastNameInt) && this.birthDate == scoolCardOwnerEntity.birthDate && C41536l.m120484d(this.pin, scoolCardOwnerEntity.pin);
    }

    public final long getBirthDate() {
        return this.birthDate;
    }

    public final long getChildClientKey() {
        return this.childClientKey;
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
        int a = ((((C7397t.m28148a(this.childClientKey) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31;
        String str = this.firstNameInt;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastNameInt;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.birthDate)) * 31;
        String str3 = this.pin;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.childClientKey;
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.firstNameInt;
        String str4 = this.lastNameInt;
        long j2 = this.birthDate;
        String str5 = this.pin;
        return "ScoolCardOwnerEntity(childClientKey=" + j + ", firstName=" + str + ", lastName=" + str2 + ", firstNameInt=" + str3 + ", lastNameInt=" + str4 + ", birthDate=" + j2 + ", pin=" + str5 + ")";
    }
}
