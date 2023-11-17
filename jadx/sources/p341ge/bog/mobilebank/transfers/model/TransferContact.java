package p341ge.bog.mobilebank.transfers.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p891su.C28269e;

/* renamed from: ge.bog.mobilebank.transfers.model.TransferContact */
public final class TransferContact implements Parcelable {
    public static final Parcelable.Creator<TransferContact> CREATOR = new Creator();
    private final List<TransferContactAccount> accounts;
    private final C28269e connectionType;
    private final String fullName;

    /* renamed from: id */
    private final long f84350id;
    private final boolean isBogContact;
    private final boolean isBudgetContact;
    private final boolean isVerified;
    private final int profilePictureDrawable;
    private final String profilePictureUrl;

    /* renamed from: ge.bog.mobilebank.transfers.model.TransferContact$Creator */
    public static final class Creator implements Parcelable.Creator<TransferContact> {
        public final TransferContact createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            C28269e valueOf = C28269e.valueOf(parcel.readString());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(TransferContactAccount.CREATOR.createFromParcel(parcel));
            }
            return new TransferContact(readLong, readString, readString2, readInt, z, valueOf, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        public final TransferContact[] newArray(int i) {
            return new TransferContact[i];
        }
    }

    public TransferContact(long j, String str, String str2, int i, boolean z, C28269e eVar, List<TransferContactAccount> list, boolean z2, boolean z3) {
        C41536l.m120489i(eVar, "connectionType");
        C41536l.m120489i(list, "accounts");
        this.f84350id = j;
        this.fullName = str;
        this.profilePictureUrl = str2;
        this.profilePictureDrawable = i;
        this.isBogContact = z;
        this.connectionType = eVar;
        this.accounts = list;
        this.isBudgetContact = z2;
        this.isVerified = z3;
    }

    public static /* synthetic */ TransferContact copy$default(TransferContact transferContact, long j, String str, String str2, int i, boolean z, C28269e eVar, List list, boolean z2, boolean z3, int i2, Object obj) {
        TransferContact transferContact2 = transferContact;
        int i3 = i2;
        return transferContact.copy((i3 & 1) != 0 ? transferContact2.f84350id : j, (i3 & 2) != 0 ? transferContact2.fullName : str, (i3 & 4) != 0 ? transferContact2.profilePictureUrl : str2, (i3 & 8) != 0 ? transferContact2.profilePictureDrawable : i, (i3 & 16) != 0 ? transferContact2.isBogContact : z, (i3 & 32) != 0 ? transferContact2.connectionType : eVar, (i3 & 64) != 0 ? transferContact2.accounts : list, (i3 & 128) != 0 ? transferContact2.isBudgetContact : z2, (i3 & C11398b.f33139r) != 0 ? transferContact2.isVerified : z3);
    }

    public final long component1() {
        return this.f84350id;
    }

    public final String component2() {
        return this.fullName;
    }

    public final String component3() {
        return this.profilePictureUrl;
    }

    public final int component4() {
        return this.profilePictureDrawable;
    }

    public final boolean component5() {
        return this.isBogContact;
    }

    public final C28269e component6() {
        return this.connectionType;
    }

    public final List<TransferContactAccount> component7() {
        return this.accounts;
    }

    public final boolean component8() {
        return this.isBudgetContact;
    }

    public final boolean component9() {
        return this.isVerified;
    }

    public final TransferContact copy(long j, String str, String str2, int i, boolean z, C28269e eVar, List<TransferContactAccount> list, boolean z2, boolean z3) {
        C28269e eVar2 = eVar;
        C41536l.m120489i(eVar2, "connectionType");
        List<TransferContactAccount> list2 = list;
        C41536l.m120489i(list2, "accounts");
        return new TransferContact(j, str, str2, i, z, eVar2, list2, z2, z3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferContact)) {
            return false;
        }
        TransferContact transferContact = (TransferContact) obj;
        return this.f84350id == transferContact.f84350id && C41536l.m120484d(this.fullName, transferContact.fullName) && C41536l.m120484d(this.profilePictureUrl, transferContact.profilePictureUrl) && this.profilePictureDrawable == transferContact.profilePictureDrawable && this.isBogContact == transferContact.isBogContact && this.connectionType == transferContact.connectionType && C41536l.m120484d(this.accounts, transferContact.accounts) && this.isBudgetContact == transferContact.isBudgetContact && this.isVerified == transferContact.isVerified;
    }

    public final List<TransferContactAccount> getAccounts() {
        return this.accounts;
    }

    public final C28269e getConnectionType() {
        return this.connectionType;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final long getId() {
        return this.f84350id;
    }

    public final int getProfilePictureDrawable() {
        return this.profilePictureDrawable;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f84350id) * 31;
        String str = this.fullName;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.profilePictureUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (((hashCode + i) * 31) + this.profilePictureDrawable) * 31;
        boolean z = this.isBogContact;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((i2 + (z ? 1 : 0)) * 31) + this.connectionType.hashCode()) * 31) + this.accounts.hashCode()) * 31;
        boolean z3 = this.isBudgetContact;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isVerified;
        if (!z4) {
            z2 = z4;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final boolean isBogContact() {
        return this.isBogContact;
    }

    public final boolean isBudgetContact() {
        return this.isBudgetContact;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        long j = this.f84350id;
        String str = this.fullName;
        String str2 = this.profilePictureUrl;
        int i = this.profilePictureDrawable;
        boolean z = this.isBogContact;
        C28269e eVar = this.connectionType;
        List<TransferContactAccount> list = this.accounts;
        boolean z2 = this.isBudgetContact;
        boolean z3 = this.isVerified;
        return "TransferContact(id=" + j + ", fullName=" + str + ", profilePictureUrl=" + str2 + ", profilePictureDrawable=" + i + ", isBogContact=" + z + ", connectionType=" + eVar + ", accounts=" + list + ", isBudgetContact=" + z2 + ", isVerified=" + z3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f84350id);
        parcel.writeString(this.fullName);
        parcel.writeString(this.profilePictureUrl);
        parcel.writeInt(this.profilePictureDrawable);
        parcel.writeInt(this.isBogContact ? 1 : 0);
        parcel.writeString(this.connectionType.name());
        List<TransferContactAccount> list = this.accounts;
        parcel.writeInt(list.size());
        for (TransferContactAccount writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isBudgetContact ? 1 : 0);
        parcel.writeInt(this.isVerified ? 1 : 0);
    }
}
