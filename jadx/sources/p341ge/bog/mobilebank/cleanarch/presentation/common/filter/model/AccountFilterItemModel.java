package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.AccountFilterItemModel */
public final class AccountFilterItemModel implements Parcelable {
    public static final Parcelable.Creator<AccountFilterItemModel> CREATOR = new C21530a();

    /* renamed from: d */
    private final String f57567d;

    /* renamed from: e */
    private final String f57568e;

    /* renamed from: f */
    private final String f57569f;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.model.AccountFilterItemModel$a */
    public static final class C21530a implements Parcelable.Creator {
        /* renamed from: a */
        public final AccountFilterItemModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new AccountFilterItemModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final AccountFilterItemModel[] newArray(int i) {
            return new AccountFilterItemModel[i];
        }
    }

    public AccountFilterItemModel(String str, String str2, String str3) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "accountNo");
        C41536l.m120489i(str3, "amount");
        this.f57567d = str;
        this.f57568e = str2;
        this.f57569f = str3;
    }

    /* renamed from: a */
    public final String mo53751a() {
        return this.f57568e;
    }

    /* renamed from: b */
    public final String mo53752b() {
        return this.f57569f;
    }

    /* renamed from: d */
    public final String mo53753d() {
        return this.f57567d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountFilterItemModel)) {
            return false;
        }
        AccountFilterItemModel accountFilterItemModel = (AccountFilterItemModel) obj;
        return C41536l.m120484d(this.f57567d, accountFilterItemModel.f57567d) && C41536l.m120484d(this.f57568e, accountFilterItemModel.f57568e) && C41536l.m120484d(this.f57569f, accountFilterItemModel.f57569f);
    }

    public int hashCode() {
        return (((this.f57567d.hashCode() * 31) + this.f57568e.hashCode()) * 31) + this.f57569f.hashCode();
    }

    public String toString() {
        String str = this.f57567d;
        String str2 = this.f57568e;
        String str3 = this.f57569f;
        return "AccountFilterItemModel(title=" + str + ", accountNo=" + str2 + ", amount=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f57567d);
        parcel.writeString(this.f57568e);
        parcel.writeString(this.f57569f);
    }
}
