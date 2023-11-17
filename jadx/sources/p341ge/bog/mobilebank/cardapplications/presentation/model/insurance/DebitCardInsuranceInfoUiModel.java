package p341ge.bog.mobilebank.cardapplications.presentation.model.insurance;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.insurance.DebitCardInsuranceInfoUiModel */
public final class DebitCardInsuranceInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardInsuranceInfoUiModel> CREATOR = new C14241a();

    /* renamed from: d */
    private final List f41841d;

    /* renamed from: e */
    private final List f41842e;

    /* renamed from: f */
    private final int f41843f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.insurance.DebitCardInsuranceInfoUiModel$a */
    public static final class C14241a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardInsuranceInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(DebitCardInsuranceFeeUiModel.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(parcel.readParcelable(DebitCardInsuranceInfoUiModel.class.getClassLoader()));
            }
            return new DebitCardInsuranceInfoUiModel(arrayList, arrayList2, parcel.readInt());
        }

        /* renamed from: b */
        public final DebitCardInsuranceInfoUiModel[] newArray(int i) {
            return new DebitCardInsuranceInfoUiModel[i];
        }
    }

    public DebitCardInsuranceInfoUiModel(List list, List list2, int i) {
        C41536l.m120489i(list, "insuranceFee");
        C41536l.m120489i(list2, "insuranceTypes");
        this.f41841d = list;
        this.f41842e = list2;
        this.f41843f = i;
    }

    /* renamed from: a */
    public final List mo39956a() {
        return this.f41842e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardInsuranceInfoUiModel)) {
            return false;
        }
        DebitCardInsuranceInfoUiModel debitCardInsuranceInfoUiModel = (DebitCardInsuranceInfoUiModel) obj;
        return C41536l.m120484d(this.f41841d, debitCardInsuranceInfoUiModel.f41841d) && C41536l.m120484d(this.f41842e, debitCardInsuranceInfoUiModel.f41842e) && this.f41843f == debitCardInsuranceInfoUiModel.f41843f;
    }

    public int hashCode() {
        return (((this.f41841d.hashCode() * 31) + this.f41842e.hashCode()) * 31) + this.f41843f;
    }

    public String toString() {
        List list = this.f41841d;
        List list2 = this.f41842e;
        int i = this.f41843f;
        return "DebitCardInsuranceInfoUiModel(insuranceFee=" + list + ", insuranceTypes=" + list2 + ", numberOfRecords=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<DebitCardInsuranceFeeUiModel> list = this.f41841d;
        parcel.writeInt(list.size());
        for (DebitCardInsuranceFeeUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<Parcelable> list2 = this.f41842e;
        parcel.writeInt(list2.size());
        for (Parcelable writeParcelable : list2) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.f41843f);
    }
}
