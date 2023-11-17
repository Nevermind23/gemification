package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasServiceInfoUiModel */
public final class CasServiceInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<CasServiceInfoUiModel> CREATOR = new C33105a();

    /* renamed from: d */
    private final List f81038d;

    /* renamed from: e */
    private final List f81039e;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasServiceInfoUiModel$a */
    public static final class C33105a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasServiceInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CasInfoSummaryUiModel.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(CasServiceProductUiModel.CREATOR.createFromParcel(parcel));
            }
            return new CasServiceInfoUiModel(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final CasServiceInfoUiModel[] newArray(int i) {
            return new CasServiceInfoUiModel[i];
        }
    }

    public CasServiceInfoUiModel(List list, List list2) {
        C41536l.m120489i(list, "summary");
        C41536l.m120489i(list2, "clientServices");
        this.f81038d = list;
        this.f81039e = list2;
    }

    /* renamed from: a */
    public final List mo75039a() {
        return this.f81039e;
    }

    /* renamed from: b */
    public final List mo75040b() {
        return this.f81038d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasServiceInfoUiModel)) {
            return false;
        }
        CasServiceInfoUiModel casServiceInfoUiModel = (CasServiceInfoUiModel) obj;
        return C41536l.m120484d(this.f81038d, casServiceInfoUiModel.f81038d) && C41536l.m120484d(this.f81039e, casServiceInfoUiModel.f81039e);
    }

    public int hashCode() {
        return (this.f81038d.hashCode() * 31) + this.f81039e.hashCode();
    }

    public String toString() {
        List list = this.f81038d;
        List list2 = this.f81039e;
        return "CasServiceInfoUiModel(summary=" + list + ", clientServices=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<CasInfoSummaryUiModel> list = this.f81038d;
        parcel.writeInt(list.size());
        for (CasInfoSummaryUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<CasServiceProductUiModel> list2 = this.f81039e;
        parcel.writeInt(list2.size());
        for (CasServiceProductUiModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
