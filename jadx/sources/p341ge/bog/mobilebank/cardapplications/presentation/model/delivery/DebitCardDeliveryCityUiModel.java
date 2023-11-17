package p341ge.bog.mobilebank.cardapplications.presentation.model.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel */
public final class DebitCardDeliveryCityUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardDeliveryCityUiModel> CREATOR = new C14236a();

    /* renamed from: d */
    private final String f41825d;

    /* renamed from: e */
    private final List f41826e;

    /* renamed from: f */
    private final long f41827f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel$a */
    public static final class C14236a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardDeliveryCityUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(DebitCardDeliveryDistrictUiModel.CREATOR.createFromParcel(parcel));
            }
            return new DebitCardDeliveryCityUiModel(readString, arrayList, parcel.readLong());
        }

        /* renamed from: b */
        public final DebitCardDeliveryCityUiModel[] newArray(int i) {
            return new DebitCardDeliveryCityUiModel[i];
        }
    }

    public DebitCardDeliveryCityUiModel(String str, List list, long j) {
        C41536l.m120489i(str, "cityName");
        C41536l.m120489i(list, "districts");
        this.f41825d = str;
        this.f41826e = list;
        this.f41827f = j;
    }

    /* renamed from: a */
    public final String mo39900a() {
        return this.f41825d;
    }

    /* renamed from: b */
    public final List mo39901b() {
        return this.f41826e;
    }

    /* renamed from: d */
    public final long mo39902d() {
        return this.f41827f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardDeliveryCityUiModel)) {
            return false;
        }
        DebitCardDeliveryCityUiModel debitCardDeliveryCityUiModel = (DebitCardDeliveryCityUiModel) obj;
        return C41536l.m120484d(this.f41825d, debitCardDeliveryCityUiModel.f41825d) && C41536l.m120484d(this.f41826e, debitCardDeliveryCityUiModel.f41826e) && this.f41827f == debitCardDeliveryCityUiModel.f41827f;
    }

    public int hashCode() {
        return (((this.f41825d.hashCode() * 31) + this.f41826e.hashCode()) * 31) + C7397t.m28148a(this.f41827f);
    }

    public String toString() {
        String str = this.f41825d;
        List list = this.f41826e;
        long j = this.f41827f;
        return "DebitCardDeliveryCityUiModel(cityName=" + str + ", districts=" + list + ", id=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41825d);
        List<DebitCardDeliveryDistrictUiModel> list = this.f41826e;
        parcel.writeInt(list.size());
        for (DebitCardDeliveryDistrictUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.f41827f);
    }
}
