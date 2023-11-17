package p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData */
public final class CardAccountSelectorData implements Parcelable {
    public static final Parcelable.Creator<CardAccountSelectorData> CREATOR = new C34630a();

    /* renamed from: d */
    private final List f83682d;

    /* renamed from: e */
    private final Long f83683e;

    /* renamed from: ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData$a */
    public static final class C34630a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardAccountSelectorData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CardAccountSelectorUiModel.CREATOR.createFromParcel(parcel));
            }
            return new CardAccountSelectorData(arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final CardAccountSelectorData[] newArray(int i) {
            return new CardAccountSelectorData[i];
        }
    }

    public CardAccountSelectorData(List list, Long l) {
        C41536l.m120489i(list, "accounts");
        this.f83682d = list;
        this.f83683e = l;
    }

    /* renamed from: a */
    public final List mo84192a() {
        return this.f83682d;
    }

    /* renamed from: b */
    public final Long mo84193b() {
        return this.f83683e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardAccountSelectorData)) {
            return false;
        }
        CardAccountSelectorData cardAccountSelectorData = (CardAccountSelectorData) obj;
        return C41536l.m120484d(this.f83682d, cardAccountSelectorData.f83682d) && C41536l.m120484d(this.f83683e, cardAccountSelectorData.f83683e);
    }

    public int hashCode() {
        int hashCode = this.f83682d.hashCode() * 31;
        Long l = this.f83683e;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        List list = this.f83682d;
        Long l = this.f83683e;
        return "CardAccountSelectorData(accounts=" + list + ", selectedAcctKey=" + l + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<CardAccountSelectorUiModel> list = this.f83682d;
        parcel.writeInt(list.size());
        for (CardAccountSelectorUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        Long l = this.f83683e;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }
}
