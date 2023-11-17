package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ConditionsData */
public final class ConditionsData implements Parcelable {
    public static final Parcelable.Creator<ConditionsData> CREATOR = new C32475a();

    /* renamed from: d */
    private final List f79966d;

    /* renamed from: e */
    private final double f79967e;

    /* renamed from: f */
    private final double f79968f;

    /* renamed from: g */
    private final String f79969g;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ConditionsData$a */
    public static final class C32475a implements Parcelable.Creator {
        /* renamed from: a */
        public final ConditionsData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ForgivenFund.CREATOR.createFromParcel(parcel));
            }
            return new ConditionsData(arrayList, parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        /* renamed from: b */
        public final ConditionsData[] newArray(int i) {
            return new ConditionsData[i];
        }
    }

    public ConditionsData(List list, double d, double d2, String str) {
        C41536l.m120489i(list, "forgivenFunds");
        C41536l.m120489i(str, "ccy");
        this.f79966d = list;
        this.f79967e = d;
        this.f79968f = d2;
        this.f79969g = str;
    }

    /* renamed from: a */
    public final String mo73291a() {
        return this.f79969g;
    }

    /* renamed from: b */
    public final List mo73292b() {
        return this.f79966d;
    }

    /* renamed from: d */
    public final double mo73293d() {
        return this.f79967e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo73295e() {
        return this.f79968f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConditionsData)) {
            return false;
        }
        ConditionsData conditionsData = (ConditionsData) obj;
        return C41536l.m120484d(this.f79966d, conditionsData.f79966d) && Double.compare(this.f79967e, conditionsData.f79967e) == 0 && Double.compare(this.f79968f, conditionsData.f79968f) == 0 && C41536l.m120484d(this.f79969g, conditionsData.f79969g);
    }

    public int hashCode() {
        return (((((this.f79966d.hashCode() * 31) + Double.doubleToLongBits(this.f79967e)) * 31) + Double.doubleToLongBits(this.f79968f)) * 31) + this.f79969g.hashCode();
    }

    public String toString() {
        List list = this.f79966d;
        double d = this.f79967e;
        double d2 = this.f79968f;
        String str = this.f79969g;
        return "ConditionsData(forgivenFunds=" + list + ", fullAmount=" + d + ", rqstDownPayment=" + d2 + ", ccy=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<ForgivenFund> list = this.f79966d;
        parcel.writeInt(list.size());
        for (ForgivenFund writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.f79967e);
        parcel.writeDouble(this.f79968f);
        parcel.writeString(this.f79969g);
    }
}
