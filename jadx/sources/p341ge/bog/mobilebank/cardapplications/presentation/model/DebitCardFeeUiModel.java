package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardFeeUiModel */
public final class DebitCardFeeUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardFeeUiModel> CREATOR = new C14212a();

    /* renamed from: d */
    private final boolean f41681d;

    /* renamed from: e */
    private final List f41682e;

    /* renamed from: f */
    private Integer f41683f;

    /* renamed from: g */
    private final double f41684g;

    /* renamed from: h */
    private final String f41685h;

    /* renamed from: i */
    private final double f41686i;

    /* renamed from: j */
    private final String f41687j;

    /* renamed from: k */
    private final boolean f41688k;

    /* renamed from: l */
    private final double f41689l;

    /* renamed from: m */
    private final String f41690m;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardFeeUiModel$a */
    public static final class C14212a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardFeeUiModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ActiveCardUiModel.CREATOR.createFromParcel(parcel2));
            }
            return new DebitCardFeeUiModel(z, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, parcel.readDouble(), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardFeeUiModel[] newArray(int i) {
            return new DebitCardFeeUiModel[i];
        }
    }

    public DebitCardFeeUiModel(boolean z, List list, Integer num, double d, String str, double d2, String str2, boolean z2, double d3, String str3) {
        C41536l.m120489i(list, "cards");
        C41536l.m120489i(str, "comCcy");
        C41536l.m120489i(str2, "deliveryFeeCcy");
        C41536l.m120489i(str3, "packFeeCcy");
        this.f41681d = z;
        this.f41682e = list;
        this.f41683f = num;
        this.f41684g = d;
        this.f41685h = str;
        this.f41686i = d2;
        this.f41687j = str2;
        this.f41688k = z2;
        this.f41689l = d3;
        this.f41690m = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardFeeUiModel)) {
            return false;
        }
        DebitCardFeeUiModel debitCardFeeUiModel = (DebitCardFeeUiModel) obj;
        return this.f41681d == debitCardFeeUiModel.f41681d && C41536l.m120484d(this.f41682e, debitCardFeeUiModel.f41682e) && C41536l.m120484d(this.f41683f, debitCardFeeUiModel.f41683f) && Double.compare(this.f41684g, debitCardFeeUiModel.f41684g) == 0 && C41536l.m120484d(this.f41685h, debitCardFeeUiModel.f41685h) && Double.compare(this.f41686i, debitCardFeeUiModel.f41686i) == 0 && C41536l.m120484d(this.f41687j, debitCardFeeUiModel.f41687j) && this.f41688k == debitCardFeeUiModel.f41688k && Double.compare(this.f41689l, debitCardFeeUiModel.f41689l) == 0 && C41536l.m120484d(this.f41690m, debitCardFeeUiModel.f41690m);
    }

    public int hashCode() {
        boolean z = this.f41681d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((z ? 1 : 0) * true) + this.f41682e.hashCode()) * 31;
        Integer num = this.f41683f;
        int hashCode2 = (((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Double.doubleToLongBits(this.f41684g)) * 31) + this.f41685h.hashCode()) * 31) + Double.doubleToLongBits(this.f41686i)) * 31) + this.f41687j.hashCode()) * 31;
        boolean z3 = this.f41688k;
        if (!z3) {
            z2 = z3;
        }
        return ((((hashCode2 + (z2 ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f41689l)) * 31) + this.f41690m.hashCode();
    }

    public String toString() {
        boolean z = this.f41681d;
        List list = this.f41682e;
        Integer num = this.f41683f;
        double d = this.f41684g;
        String str = this.f41685h;
        double d2 = this.f41686i;
        String str2 = this.f41687j;
        boolean z2 = this.f41688k;
        double d3 = this.f41689l;
        String str3 = this.f41690m;
        return "DebitCardFeeUiModel(cardRecoveryFlag=" + z + ", cards=" + list + ", selectedCardIndex=" + num + ", comAmount=" + d + ", comCcy=" + str + ", deliveryFeeAmount=" + d2 + ", deliveryFeeCcy=" + str2 + ", packageRegFlag=" + z2 + ", packFeeAmount=" + d3 + ", packFeeCcy=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f41681d ? 1 : 0);
        List<ActiveCardUiModel> list = this.f41682e;
        parcel.writeInt(list.size());
        for (ActiveCardUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        Integer num = this.f41683f;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeDouble(this.f41684g);
        parcel.writeString(this.f41685h);
        parcel.writeDouble(this.f41686i);
        parcel.writeString(this.f41687j);
        parcel.writeInt(this.f41688k ? 1 : 0);
        parcel.writeDouble(this.f41689l);
        parcel.writeString(this.f41690m);
    }
}
