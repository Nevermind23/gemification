package p341ge.bog.mobilebank.loans.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.loans.presentation.repayment.model.RepaymentDetailsUiModel;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.loans.presentation.model.PaymentResultData */
public final class PaymentResultData implements Parcelable {
    public static final Parcelable.Creator<PaymentResultData> CREATOR = new C32685a();

    /* renamed from: d */
    private final StringSource f80453d;

    /* renamed from: e */
    private final String f80454e;

    /* renamed from: f */
    private final boolean f80455f;

    /* renamed from: g */
    private final boolean f80456g;

    /* renamed from: h */
    private final List f80457h;

    /* renamed from: ge.bog.mobilebank.loans.presentation.model.PaymentResultData$a */
    public static final class C32685a implements Parcelable.Creator {
        /* renamed from: a */
        public final PaymentResultData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            StringSource stringSource = (StringSource) parcel.readParcelable(PaymentResultData.class.getClassLoader());
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(RepaymentDetailsUiModel.CREATOR.createFromParcel(parcel));
            }
            return new PaymentResultData(stringSource, readString, z, z2, arrayList);
        }

        /* renamed from: b */
        public final PaymentResultData[] newArray(int i) {
            return new PaymentResultData[i];
        }
    }

    public PaymentResultData(StringSource stringSource, String str, boolean z, boolean z2, List list) {
        C41536l.m120489i(stringSource, "title");
        C41536l.m120489i(list, "list");
        this.f80453d = stringSource;
        this.f80454e = str;
        this.f80455f = z;
        this.f80456g = z2;
        this.f80457h = list;
    }

    /* renamed from: a */
    public final boolean mo74344a() {
        return this.f80456g;
    }

    /* renamed from: b */
    public final List mo74345b() {
        return this.f80457h;
    }

    /* renamed from: d */
    public final boolean mo74346d() {
        return this.f80455f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo74348e() {
        return this.f80454e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentResultData)) {
            return false;
        }
        PaymentResultData paymentResultData = (PaymentResultData) obj;
        return C41536l.m120484d(this.f80453d, paymentResultData.f80453d) && C41536l.m120484d(this.f80454e, paymentResultData.f80454e) && this.f80455f == paymentResultData.f80455f && this.f80456g == paymentResultData.f80456g && C41536l.m120484d(this.f80457h, paymentResultData.f80457h);
    }

    /* renamed from: f */
    public final StringSource mo74350f() {
        return this.f80453d;
    }

    public int hashCode() {
        int hashCode = this.f80453d.hashCode() * 31;
        String str = this.f80454e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f80455f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f80456g;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.f80457h.hashCode();
    }

    public String toString() {
        StringSource stringSource = this.f80453d;
        String str = this.f80454e;
        boolean z = this.f80455f;
        boolean z2 = this.f80456g;
        List list = this.f80457h;
        return "PaymentResultData(title=" + stringSource + ", respKey=" + str + ", pendingStatus=" + z + ", fromBNPL=" + z2 + ", list=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f80453d, i);
        parcel.writeString(this.f80454e);
        parcel.writeInt(this.f80455f ? 1 : 0);
        parcel.writeInt(this.f80456g ? 1 : 0);
        List<RepaymentDetailsUiModel> list = this.f80457h;
        parcel.writeInt(list.size());
        for (RepaymentDetailsUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentResultData(StringSource stringSource, String str, boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, str, z, (i & 8) != 0 ? false : z2, list);
    }
}
