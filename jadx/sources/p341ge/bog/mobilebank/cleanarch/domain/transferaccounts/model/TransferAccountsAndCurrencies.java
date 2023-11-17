package p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountsAndCurrencies */
public final class TransferAccountsAndCurrencies implements Parcelable {
    public static final Parcelable.Creator<TransferAccountsAndCurrencies> CREATOR = new C21043a();

    /* renamed from: d */
    private final List f56527d;

    /* renamed from: e */
    private final List f56528e;

    /* renamed from: f */
    private final String f56529f;

    /* renamed from: g */
    private final boolean f56530g;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountsAndCurrencies$a */
    public static final class C21043a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransferAccountsAndCurrencies createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z = false;
            for (int i = 0; i != readInt; i++) {
                arrayList.add(TransferAccountItem.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(TransferCurrencyItem.CREATOR.createFromParcel(parcel));
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new TransferAccountsAndCurrencies(arrayList, arrayList2, readString, z);
        }

        /* renamed from: b */
        public final TransferAccountsAndCurrencies[] newArray(int i) {
            return new TransferAccountsAndCurrencies[i];
        }
    }

    public TransferAccountsAndCurrencies(List list, List list2, String str, boolean z) {
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(list2, "currencies");
        C41536l.m120489i(str, "conversionDescriptionKey");
        this.f56527d = list;
        this.f56528e = list2;
        this.f56529f = str;
        this.f56530g = z;
    }

    /* renamed from: a */
    public final List mo52174a() {
        return this.f56527d;
    }

    /* renamed from: b */
    public final String mo52175b() {
        return this.f56529f;
    }

    /* renamed from: d */
    public final List mo52176d() {
        return this.f56528e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo52178e() {
        return this.f56530g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAccountsAndCurrencies)) {
            return false;
        }
        TransferAccountsAndCurrencies transferAccountsAndCurrencies = (TransferAccountsAndCurrencies) obj;
        return C41536l.m120484d(this.f56527d, transferAccountsAndCurrencies.f56527d) && C41536l.m120484d(this.f56528e, transferAccountsAndCurrencies.f56528e) && C41536l.m120484d(this.f56529f, transferAccountsAndCurrencies.f56529f) && this.f56530g == transferAccountsAndCurrencies.f56530g;
    }

    public int hashCode() {
        int hashCode = ((((this.f56527d.hashCode() * 31) + this.f56528e.hashCode()) * 31) + this.f56529f.hashCode()) * 31;
        boolean z = this.f56530g;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        List list = this.f56527d;
        List list2 = this.f56528e;
        String str = this.f56529f;
        boolean z = this.f56530g;
        return "TransferAccountsAndCurrencies(accounts=" + list + ", currencies=" + list2 + ", conversionDescriptionKey=" + str + ", isRateCampaignActive=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<TransferAccountItem> list = this.f56527d;
        parcel.writeInt(list.size());
        for (TransferAccountItem writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<TransferCurrencyItem> list2 = this.f56528e;
        parcel.writeInt(list2.size());
        for (TransferCurrencyItem writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f56529f);
        parcel.writeInt(this.f56530g ? 1 : 0);
    }
}
