package p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel */
public final class LiabilityOverdueInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<LiabilityOverdueInfoUiModel> CREATOR = new C21776a();

    /* renamed from: d */
    private final ManagerInfoUiModel f58127d;

    /* renamed from: e */
    private final List f58128e;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel$a */
    public static final class C21776a implements Parcelable.Creator {
        /* renamed from: a */
        public final LiabilityOverdueInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            ManagerInfoUiModel createFromParcel = parcel.readInt() == 0 ? null : ManagerInfoUiModel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(OverdueProductInfoUiModel.CREATOR.createFromParcel(parcel));
            }
            return new LiabilityOverdueInfoUiModel(createFromParcel, arrayList);
        }

        /* renamed from: b */
        public final LiabilityOverdueInfoUiModel[] newArray(int i) {
            return new LiabilityOverdueInfoUiModel[i];
        }
    }

    public LiabilityOverdueInfoUiModel(ManagerInfoUiModel managerInfoUiModel, List list) {
        C41536l.m120489i(list, "overdueProductsInfo");
        this.f58127d = managerInfoUiModel;
        this.f58128e = list;
    }

    /* renamed from: a */
    public final ManagerInfoUiModel mo54309a() {
        return this.f58127d;
    }

    /* renamed from: b */
    public final List mo54310b() {
        return this.f58128e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiabilityOverdueInfoUiModel)) {
            return false;
        }
        LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel = (LiabilityOverdueInfoUiModel) obj;
        return C41536l.m120484d(this.f58127d, liabilityOverdueInfoUiModel.f58127d) && C41536l.m120484d(this.f58128e, liabilityOverdueInfoUiModel.f58128e);
    }

    public int hashCode() {
        ManagerInfoUiModel managerInfoUiModel = this.f58127d;
        return ((managerInfoUiModel == null ? 0 : managerInfoUiModel.hashCode()) * 31) + this.f58128e.hashCode();
    }

    public String toString() {
        ManagerInfoUiModel managerInfoUiModel = this.f58127d;
        List list = this.f58128e;
        return "LiabilityOverdueInfoUiModel(clientManagerInfo=" + managerInfoUiModel + ", overdueProductsInfo=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        ManagerInfoUiModel managerInfoUiModel = this.f58127d;
        if (managerInfoUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            managerInfoUiModel.writeToParcel(parcel, i);
        }
        List<OverdueProductInfoUiModel> list = this.f58128e;
        parcel.writeInt(list.size());
        for (OverdueProductInfoUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
