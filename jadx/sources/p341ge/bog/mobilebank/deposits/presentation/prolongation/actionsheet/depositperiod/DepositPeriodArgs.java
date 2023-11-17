package p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodArgs */
public final class DepositPeriodArgs implements Parcelable {
    public static final Parcelable.Creator<DepositPeriodArgs> CREATOR = new C23247a();

    /* renamed from: d */
    private final List f60842d;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodArgs$a */
    public static final class C23247a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositPeriodArgs createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(DepositPeriodArgs.class.getClassLoader()));
            }
            return new DepositPeriodArgs(arrayList);
        }

        /* renamed from: b */
        public final DepositPeriodArgs[] newArray(int i) {
            return new DepositPeriodArgs[i];
        }
    }

    public DepositPeriodArgs(List list) {
        C41536l.m120489i(list, "data");
        this.f60842d = list;
    }

    /* renamed from: a */
    public final List mo58135a() {
        return this.f60842d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DepositPeriodArgs) && C41536l.m120484d(this.f60842d, ((DepositPeriodArgs) obj).f60842d);
    }

    public int hashCode() {
        return this.f60842d.hashCode();
    }

    public String toString() {
        List list = this.f60842d;
        return "DepositPeriodArgs(data=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<Parcelable> list = this.f60842d;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
