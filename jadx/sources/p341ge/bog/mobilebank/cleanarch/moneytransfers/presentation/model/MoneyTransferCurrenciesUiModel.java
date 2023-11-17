package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel */
public final class MoneyTransferCurrenciesUiModel implements Parcelable {
    public static final Parcelable.Creator<MoneyTransferCurrenciesUiModel> CREATOR = new C21222a();

    /* renamed from: d */
    private final String f56975d;

    /* renamed from: e */
    private final boolean f56976e;

    /* renamed from: f */
    private final List f56977f;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel$a */
    public static final class C21222a implements Parcelable.Creator {
        /* renamed from: a */
        public final MoneyTransferCurrenciesUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(TransferCurrencyUiItem.CREATOR.createFromParcel(parcel));
            }
            return new MoneyTransferCurrenciesUiModel(readString, z, arrayList);
        }

        /* renamed from: b */
        public final MoneyTransferCurrenciesUiModel[] newArray(int i) {
            return new MoneyTransferCurrenciesUiModel[i];
        }
    }

    public MoneyTransferCurrenciesUiModel(String str, boolean z, List list) {
        C41536l.m120489i(str, "conversionDescriptionKey");
        C41536l.m120489i(list, "currencies");
        this.f56975d = str;
        this.f56976e = z;
        this.f56977f = list;
    }

    /* renamed from: a */
    public final String mo53131a() {
        return this.f56975d;
    }

    /* renamed from: b */
    public final List mo53132b() {
        return this.f56977f;
    }

    /* renamed from: d */
    public final boolean mo53133d() {
        return this.f56976e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferCurrenciesUiModel)) {
            return false;
        }
        MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel = (MoneyTransferCurrenciesUiModel) obj;
        return C41536l.m120484d(this.f56975d, moneyTransferCurrenciesUiModel.f56975d) && this.f56976e == moneyTransferCurrenciesUiModel.f56976e && C41536l.m120484d(this.f56977f, moneyTransferCurrenciesUiModel.f56977f);
    }

    public int hashCode() {
        int hashCode = this.f56975d.hashCode() * 31;
        boolean z = this.f56976e;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f56977f.hashCode();
    }

    public String toString() {
        String str = this.f56975d;
        boolean z = this.f56976e;
        List list = this.f56977f;
        return "MoneyTransferCurrenciesUiModel(conversionDescriptionKey=" + str + ", isRateCampaignActive=" + z + ", currencies=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f56975d);
        parcel.writeInt(this.f56976e ? 1 : 0);
        List<TransferCurrencyUiItem> list = this.f56977f;
        parcel.writeInt(list.size());
        for (TransferCurrencyUiItem writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
