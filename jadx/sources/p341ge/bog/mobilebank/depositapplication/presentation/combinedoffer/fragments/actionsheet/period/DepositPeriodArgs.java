package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodArgs */
public final class DepositPeriodArgs implements Parcelable {
    public static final Parcelable.Creator<DepositPeriodArgs> CREATOR = new C22859a();

    /* renamed from: d */
    private final List f60237d;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodArgs$a */
    public static final class C22859a implements Parcelable.Creator {
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
        this.f60237d = list;
    }

    /* renamed from: a */
    public final List mo56958a() {
        return this.f60237d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DepositPeriodArgs) && C41536l.m120484d(this.f60237d, ((DepositPeriodArgs) obj).f60237d);
    }

    public int hashCode() {
        return this.f60237d.hashCode();
    }

    public String toString() {
        List list = this.f60237d;
        return "DepositPeriodArgs(data=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<Parcelable> list = this.f60237d;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
