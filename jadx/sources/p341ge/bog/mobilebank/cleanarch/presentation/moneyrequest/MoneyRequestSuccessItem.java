package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.account.AccountLov;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestSuccessItem */
public final class MoneyRequestSuccessItem implements Parcelable {
    public static final Parcelable.Creator<MoneyRequestSuccessItem> CREATOR = new C21782a();

    /* renamed from: d */
    private final boolean f58141d;

    /* renamed from: e */
    private final String f58142e;

    /* renamed from: f */
    private final String f58143f;

    /* renamed from: g */
    private final AccountLov f58144g;

    /* renamed from: h */
    private final String f58145h;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestSuccessItem$a */
    public static final class C21782a implements Parcelable.Creator {
        /* renamed from: a */
        public final MoneyRequestSuccessItem createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new MoneyRequestSuccessItem(parcel.readInt() != 0, parcel.readString(), parcel.readString(), (AccountLov) parcel.readParcelable(MoneyRequestSuccessItem.class.getClassLoader()), parcel.readString());
        }

        /* renamed from: b */
        public final MoneyRequestSuccessItem[] newArray(int i) {
            return new MoneyRequestSuccessItem[i];
        }
    }

    public MoneyRequestSuccessItem(boolean z, String str, String str2, AccountLov accountLov, String str3) {
        C41536l.m120489i(str, "requestedMoney");
        C41536l.m120489i(str2, "requestedPeopleAmount");
        C41536l.m120489i(str3, "comment");
        this.f58141d = z;
        this.f58142e = str;
        this.f58143f = str2;
        this.f58144g = accountLov;
        this.f58145h = str3;
    }

    /* renamed from: a */
    public final String mo54346a() {
        return this.f58145h;
    }

    /* renamed from: b */
    public final AccountLov mo54347b() {
        return this.f58144g;
    }

    /* renamed from: d */
    public final String mo54348d() {
        return this.f58142e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo54350e() {
        return this.f58143f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyRequestSuccessItem)) {
            return false;
        }
        MoneyRequestSuccessItem moneyRequestSuccessItem = (MoneyRequestSuccessItem) obj;
        return this.f58141d == moneyRequestSuccessItem.f58141d && C41536l.m120484d(this.f58142e, moneyRequestSuccessItem.f58142e) && C41536l.m120484d(this.f58143f, moneyRequestSuccessItem.f58143f) && C41536l.m120484d(this.f58144g, moneyRequestSuccessItem.f58144g) && C41536l.m120484d(this.f58145h, moneyRequestSuccessItem.f58145h);
    }

    /* renamed from: f */
    public final boolean mo54352f() {
        return this.f58141d;
    }

    public int hashCode() {
        boolean z = this.f58141d;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + this.f58142e.hashCode()) * 31) + this.f58143f.hashCode()) * 31;
        AccountLov accountLov = this.f58144g;
        return ((hashCode + (accountLov == null ? 0 : accountLov.hashCode())) * 31) + this.f58145h.hashCode();
    }

    public String toString() {
        boolean z = this.f58141d;
        String str = this.f58142e;
        String str2 = this.f58143f;
        AccountLov accountLov = this.f58144g;
        String str3 = this.f58145h;
        return "MoneyRequestSuccessItem(isSuccess=" + z + ", requestedMoney=" + str + ", requestedPeopleAmount=" + str2 + ", receiverAccount=" + accountLov + ", comment=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f58141d ? 1 : 0);
        parcel.writeString(this.f58142e);
        parcel.writeString(this.f58143f);
        parcel.writeParcelable(this.f58144g, i);
        parcel.writeString(this.f58145h);
    }
}
