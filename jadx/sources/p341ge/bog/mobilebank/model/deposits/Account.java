package p341ge.bog.mobilebank.model.deposits;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.model.deposits.Account */
public final class Account implements Parcelable {
    public static final Parcelable.Creator<Account> CREATOR = new Creator();
    private final String alias;

    /* renamed from: id */
    private final long f81313id;
    private final int type;

    /* renamed from: ge.bog.mobilebank.model.deposits.Account$Creator */
    public static final class Creator implements Parcelable.Creator<Account> {
        public final Account createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new Account(parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        public final Account[] newArray(int i) {
            return new Account[i];
        }
    }

    public Account(String str, long j, int i) {
        C41536l.m120489i(str, "alias");
        this.alias = str;
        this.f81313id = j;
        this.type = i;
    }

    public static /* synthetic */ Account copy$default(Account account, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = account.alias;
        }
        if ((i2 & 2) != 0) {
            j = account.f81313id;
        }
        if ((i2 & 4) != 0) {
            i = account.type;
        }
        return account.copy(str, j, i);
    }

    public final String component1() {
        return this.alias;
    }

    public final long component2() {
        return this.f81313id;
    }

    public final int component3() {
        return this.type;
    }

    public final Account copy(String str, long j, int i) {
        C41536l.m120489i(str, "alias");
        return new Account(str, j, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        return C41536l.m120484d(this.alias, account.alias) && this.f81313id == account.f81313id && this.type == account.type;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final long getId() {
        return this.f81313id;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.alias.hashCode() * 31) + C7397t.m28148a(this.f81313id)) * 31) + this.type;
    }

    public String toString() {
        String str = this.alias;
        long j = this.f81313id;
        int i = this.type;
        return "Account(alias=" + str + ", id=" + j + ", type=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.alias);
        parcel.writeLong(this.f81313id);
        parcel.writeInt(this.type);
    }
}
