package p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;

/* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloDropdownValuesUiModel */
public final class BecomeSoloDropdownValuesUiModel implements Parcelable {
    public static final Parcelable.Creator<BecomeSoloDropdownValuesUiModel> CREATOR = new C20842a();

    /* renamed from: d */
    private final List f56112d;

    /* renamed from: e */
    private final List f56113e;

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloDropdownValuesUiModel$a */
    public static final class C20842a implements Parcelable.Creator {
        /* renamed from: a */
        public final BecomeSoloDropdownValuesUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(LookupUiModel.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(LookupUiModel.CREATOR.createFromParcel(parcel));
            }
            return new BecomeSoloDropdownValuesUiModel(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final BecomeSoloDropdownValuesUiModel[] newArray(int i) {
            return new BecomeSoloDropdownValuesUiModel[i];
        }
    }

    public BecomeSoloDropdownValuesUiModel(List list, List list2) {
        C41536l.m120489i(list, "incomeRange");
        C41536l.m120489i(list2, "feePaymentPeriods");
        this.f56112d = list;
        this.f56113e = list2;
    }

    /* renamed from: a */
    public final List mo49602a() {
        return this.f56113e;
    }

    /* renamed from: b */
    public final List mo49603b() {
        return this.f56112d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BecomeSoloDropdownValuesUiModel)) {
            return false;
        }
        BecomeSoloDropdownValuesUiModel becomeSoloDropdownValuesUiModel = (BecomeSoloDropdownValuesUiModel) obj;
        return C41536l.m120484d(this.f56112d, becomeSoloDropdownValuesUiModel.f56112d) && C41536l.m120484d(this.f56113e, becomeSoloDropdownValuesUiModel.f56113e);
    }

    public int hashCode() {
        return (this.f56112d.hashCode() * 31) + this.f56113e.hashCode();
    }

    public String toString() {
        List list = this.f56112d;
        List list2 = this.f56113e;
        return "BecomeSoloDropdownValuesUiModel(incomeRange=" + list + ", feePaymentPeriods=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<LookupUiModel> list = this.f56112d;
        parcel.writeInt(list.size());
        for (LookupUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<LookupUiModel> list2 = this.f56113e;
        parcel.writeInt(list2.size());
        for (LookupUiModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
