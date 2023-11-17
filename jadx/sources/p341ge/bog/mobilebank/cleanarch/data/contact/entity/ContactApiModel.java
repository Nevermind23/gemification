package p341ge.bog.mobilebank.cleanarch.data.contact.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.contact.entity.ContactApiModel */
public final class ContactApiModel {
    @C8664c("Accounts")
    private final List<ContactAccountApiModel> accounts;
    private final String bank;
    private final boolean canRequestMoney;
    private final Boolean canTrust;
    private final String connectionType;
    private final long firstInteractionDate;
    private final String fullName;
    private final String fullNameEn;
    private final String fullNameGe;
    @C8664c("clientConnectionId")

    /* renamed from: id */
    private final long f56434id;
    private final Boolean isPhoneChangeAvailable;
    private final Boolean isPrimary;
    private final Boolean isTrusted;
    private final String linkImageId;
    private final String nickName;
    private final String phoneNumber;
    private final String profilePicture;

    public ContactApiModel(long j, String str, String str2, String str3, String str4, String str5, String str6, List<ContactAccountApiModel> list, String str7, String str8, long j2, boolean z, Boolean bool, Boolean bool2, String str9, Boolean bool3, Boolean bool4) {
        this.f56434id = j;
        this.fullName = str;
        this.fullNameGe = str2;
        this.fullNameEn = str3;
        this.nickName = str4;
        this.profilePicture = str5;
        this.bank = str6;
        this.accounts = list;
        this.linkImageId = str7;
        this.connectionType = str8;
        this.firstInteractionDate = j2;
        this.canRequestMoney = z;
        this.isTrusted = bool;
        this.isPrimary = bool2;
        this.phoneNumber = str9;
        this.isPhoneChangeAvailable = bool3;
        this.canTrust = bool4;
    }

    public static /* synthetic */ ContactApiModel copy$default(ContactApiModel contactApiModel, long j, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, long j2, boolean z, Boolean bool, Boolean bool2, String str9, Boolean bool3, Boolean bool4, int i, Object obj) {
        ContactApiModel contactApiModel2 = contactApiModel;
        int i2 = i;
        return contactApiModel.copy((i2 & 1) != 0 ? contactApiModel2.f56434id : j, (i2 & 2) != 0 ? contactApiModel2.fullName : str, (i2 & 4) != 0 ? contactApiModel2.fullNameGe : str2, (i2 & 8) != 0 ? contactApiModel2.fullNameEn : str3, (i2 & 16) != 0 ? contactApiModel2.nickName : str4, (i2 & 32) != 0 ? contactApiModel2.profilePicture : str5, (i2 & 64) != 0 ? contactApiModel2.bank : str6, (i2 & 128) != 0 ? contactApiModel2.accounts : list, (i2 & C11398b.f33139r) != 0 ? contactApiModel2.linkImageId : str7, (i2 & C11398b.f33140s) != 0 ? contactApiModel2.connectionType : str8, (i2 & C11398b.f33141t) != 0 ? contactApiModel2.firstInteractionDate : j2, (i2 & C11398b.f33142u) != 0 ? contactApiModel2.canRequestMoney : z, (i2 & C11398b.f33143v) != 0 ? contactApiModel2.isTrusted : bool, (i2 & 8192) != 0 ? contactApiModel2.isPrimary : bool2, (i2 & 16384) != 0 ? contactApiModel2.phoneNumber : str9, (i2 & 32768) != 0 ? contactApiModel2.isPhoneChangeAvailable : bool3, (i2 & 65536) != 0 ? contactApiModel2.canTrust : bool4);
    }

    public final long component1() {
        return this.f56434id;
    }

    public final String component10() {
        return this.connectionType;
    }

    public final long component11() {
        return this.firstInteractionDate;
    }

    public final boolean component12() {
        return this.canRequestMoney;
    }

    public final Boolean component13() {
        return this.isTrusted;
    }

    public final Boolean component14() {
        return this.isPrimary;
    }

    public final String component15() {
        return this.phoneNumber;
    }

    public final Boolean component16() {
        return this.isPhoneChangeAvailable;
    }

    public final Boolean component17() {
        return this.canTrust;
    }

    public final String component2() {
        return this.fullName;
    }

    public final String component3() {
        return this.fullNameGe;
    }

    public final String component4() {
        return this.fullNameEn;
    }

    public final String component5() {
        return this.nickName;
    }

    public final String component6() {
        return this.profilePicture;
    }

    public final String component7() {
        return this.bank;
    }

    public final List<ContactAccountApiModel> component8() {
        return this.accounts;
    }

    public final String component9() {
        return this.linkImageId;
    }

    public final ContactApiModel copy(long j, String str, String str2, String str3, String str4, String str5, String str6, List<ContactAccountApiModel> list, String str7, String str8, long j2, boolean z, Boolean bool, Boolean bool2, String str9, Boolean bool3, Boolean bool4) {
        return new ContactApiModel(j, str, str2, str3, str4, str5, str6, list, str7, str8, j2, z, bool, bool2, str9, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactApiModel)) {
            return false;
        }
        ContactApiModel contactApiModel = (ContactApiModel) obj;
        return this.f56434id == contactApiModel.f56434id && C41536l.m120484d(this.fullName, contactApiModel.fullName) && C41536l.m120484d(this.fullNameGe, contactApiModel.fullNameGe) && C41536l.m120484d(this.fullNameEn, contactApiModel.fullNameEn) && C41536l.m120484d(this.nickName, contactApiModel.nickName) && C41536l.m120484d(this.profilePicture, contactApiModel.profilePicture) && C41536l.m120484d(this.bank, contactApiModel.bank) && C41536l.m120484d(this.accounts, contactApiModel.accounts) && C41536l.m120484d(this.linkImageId, contactApiModel.linkImageId) && C41536l.m120484d(this.connectionType, contactApiModel.connectionType) && this.firstInteractionDate == contactApiModel.firstInteractionDate && this.canRequestMoney == contactApiModel.canRequestMoney && C41536l.m120484d(this.isTrusted, contactApiModel.isTrusted) && C41536l.m120484d(this.isPrimary, contactApiModel.isPrimary) && C41536l.m120484d(this.phoneNumber, contactApiModel.phoneNumber) && C41536l.m120484d(this.isPhoneChangeAvailable, contactApiModel.isPhoneChangeAvailable) && C41536l.m120484d(this.canTrust, contactApiModel.canTrust);
    }

    public final List<ContactAccountApiModel> getAccounts() {
        return this.accounts;
    }

    public final String getBank() {
        return this.bank;
    }

    public final boolean getCanRequestMoney() {
        return this.canRequestMoney;
    }

    public final Boolean getCanTrust() {
        return this.canTrust;
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final long getFirstInteractionDate() {
        return this.firstInteractionDate;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getFullNameEn() {
        return this.fullNameEn;
    }

    public final String getFullNameGe() {
        return this.fullNameGe;
    }

    public final long getId() {
        return this.f56434id;
    }

    public final String getLinkImageId() {
        return this.linkImageId;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getProfilePicture() {
        return this.profilePicture;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f56434id) * 31;
        String str = this.fullName;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullNameGe;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullNameEn;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.profilePicture;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bank;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<ContactAccountApiModel> list = this.accounts;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.linkImageId;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.connectionType;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + C7397t.m28148a(this.firstInteractionDate)) * 31;
        boolean z = this.canRequestMoney;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        Boolean bool = this.isTrusted;
        int hashCode10 = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPrimary;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.phoneNumber;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool3 = this.isPhoneChangeAvailable;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canTrust;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return hashCode13 + i;
    }

    public final Boolean isPhoneChangeAvailable() {
        return this.isPhoneChangeAvailable;
    }

    public final Boolean isPrimary() {
        return this.isPrimary;
    }

    public final Boolean isTrusted() {
        return this.isTrusted;
    }

    public String toString() {
        long j = this.f56434id;
        String str = this.fullName;
        String str2 = this.fullNameGe;
        String str3 = this.fullNameEn;
        String str4 = this.nickName;
        String str5 = this.profilePicture;
        String str6 = this.bank;
        List<ContactAccountApiModel> list = this.accounts;
        String str7 = this.linkImageId;
        String str8 = this.connectionType;
        long j2 = this.firstInteractionDate;
        boolean z = this.canRequestMoney;
        Boolean bool = this.isTrusted;
        Boolean bool2 = this.isPrimary;
        String str9 = this.phoneNumber;
        Boolean bool3 = this.isPhoneChangeAvailable;
        Boolean bool4 = this.canTrust;
        return "ContactApiModel(id=" + j + ", fullName=" + str + ", fullNameGe=" + str2 + ", fullNameEn=" + str3 + ", nickName=" + str4 + ", profilePicture=" + str5 + ", bank=" + str6 + ", accounts=" + list + ", linkImageId=" + str7 + ", connectionType=" + str8 + ", firstInteractionDate=" + j2 + ", canRequestMoney=" + z + ", isTrusted=" + bool + ", isPrimary=" + bool2 + ", phoneNumber=" + str9 + ", isPhoneChangeAvailable=" + bool3 + ", canTrust=" + bool4 + ")";
    }
}
