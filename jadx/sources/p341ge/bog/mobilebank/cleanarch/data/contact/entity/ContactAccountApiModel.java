package p341ge.bog.mobilebank.cleanarch.data.contact.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.contact.entity.ContactAccountApiModel */
public final class ContactAccountApiModel {
    private final String acctName;
    private final String acctNo;
    private final String bank;

    /* renamed from: id */
    private final long f56433id;
    private final boolean isDefault;

    public ContactAccountApiModel(long j, String str, String str2, boolean z, String str3) {
        C41536l.m120489i(str, "acctNo");
        this.f56433id = j;
        this.acctNo = str;
        this.bank = str2;
        this.isDefault = z;
        this.acctName = str3;
    }

    public static /* synthetic */ ContactAccountApiModel copy$default(ContactAccountApiModel contactAccountApiModel, long j, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contactAccountApiModel.f56433id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = contactAccountApiModel.acctNo;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = contactAccountApiModel.bank;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            z = contactAccountApiModel.isDefault;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = contactAccountApiModel.acctName;
        }
        return contactAccountApiModel.copy(j2, str4, str5, z2, str3);
    }

    public final long component1() {
        return this.f56433id;
    }

    public final String component2() {
        return this.acctNo;
    }

    public final String component3() {
        return this.bank;
    }

    public final boolean component4() {
        return this.isDefault;
    }

    public final String component5() {
        return this.acctName;
    }

    public final ContactAccountApiModel copy(long j, String str, String str2, boolean z, String str3) {
        C41536l.m120489i(str, "acctNo");
        return new ContactAccountApiModel(j, str, str2, z, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactAccountApiModel)) {
            return false;
        }
        ContactAccountApiModel contactAccountApiModel = (ContactAccountApiModel) obj;
        return this.f56433id == contactAccountApiModel.f56433id && C41536l.m120484d(this.acctNo, contactAccountApiModel.acctNo) && C41536l.m120484d(this.bank, contactAccountApiModel.bank) && this.isDefault == contactAccountApiModel.isDefault && C41536l.m120484d(this.acctName, contactAccountApiModel.acctName);
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final String getBank() {
        return this.bank;
    }

    public final long getId() {
        return this.f56433id;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f56433id) * 31) + this.acctNo.hashCode()) * 31;
        String str = this.bank;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isDefault;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.acctName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        long j = this.f56433id;
        String str = this.acctNo;
        String str2 = this.bank;
        boolean z = this.isDefault;
        String str3 = this.acctName;
        return "ContactAccountApiModel(id=" + j + ", acctNo=" + str + ", bank=" + str2 + ", isDefault=" + z + ", acctName=" + str3 + ")";
    }
}
