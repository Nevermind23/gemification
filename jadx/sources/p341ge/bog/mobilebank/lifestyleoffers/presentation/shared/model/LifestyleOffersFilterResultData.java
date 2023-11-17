package p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model;

import android.os.Parcel;
import android.os.Parcelable;
import ao0.C10119a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData */
public final class LifestyleOffersFilterResultData implements Parcelable {
    public static final Parcelable.Creator<LifestyleOffersFilterResultData> CREATOR = new C15114a();

    /* renamed from: d */
    private final List f43392d;

    /* renamed from: e */
    private final List f43393e;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData$a */
    public static final class C15114a implements Parcelable.Creator {
        /* renamed from: a */
        public final LifestyleOffersFilterResultData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(C10119a.valueOf(parcel.readString()));
            }
            return new LifestyleOffersFilterResultData(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final LifestyleOffersFilterResultData[] newArray(int i) {
            return new LifestyleOffersFilterResultData[i];
        }
    }

    public LifestyleOffersFilterResultData() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final List mo42067a() {
        return this.f43393e;
    }

    /* renamed from: b */
    public final List mo42068b() {
        return this.f43392d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleOffersFilterResultData)) {
            return false;
        }
        LifestyleOffersFilterResultData lifestyleOffersFilterResultData = (LifestyleOffersFilterResultData) obj;
        return C41536l.m120484d(this.f43392d, lifestyleOffersFilterResultData.f43392d) && C41536l.m120484d(this.f43393e, lifestyleOffersFilterResultData.f43393e);
    }

    public int hashCode() {
        return (this.f43392d.hashCode() * 31) + this.f43393e.hashCode();
    }

    public String toString() {
        List list = this.f43392d;
        List list2 = this.f43393e;
        return "LifestyleOffersFilterResultData(filteredCategories=" + list + ", filteredBadges=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<Number> list = this.f43392d;
        parcel.writeInt(list.size());
        for (Number longValue : list) {
            parcel.writeLong(longValue.longValue());
        }
        List<C10119a> list2 = this.f43393e;
        parcel.writeInt(list2.size());
        for (C10119a name : list2) {
            parcel.writeString(name.name());
        }
    }

    public LifestyleOffersFilterResultData(List list, List list2) {
        C41536l.m120489i(list, "filteredCategories");
        C41536l.m120489i(list2, "filteredBadges");
        this.f43392d = list;
        this.f43393e = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifestyleOffersFilterResultData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list, (i & 2) != 0 ? C41341q.m119907j() : list2);
    }
}
