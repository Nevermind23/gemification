package p341ge.bog.mobilebank.payments.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.payments.domain.model.PaymentPayParameter */
public final class PaymentPayParameter implements Parcelable {
    public static final Parcelable.Creator<PaymentPayParameter> CREATOR = new C33630a();
    @C8664c("essServiceId")

    /* renamed from: d */
    private final String f82013d;
    @C8664c("essParameters")

    /* renamed from: e */
    private final List<KeyValue> f82014e;

    /* renamed from: ge.bog.mobilebank.payments.domain.model.PaymentPayParameter$a */
    public static final class C33630a implements Parcelable.Creator {
        /* renamed from: a */
        public final PaymentPayParameter createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(KeyValue.CREATOR.createFromParcel(parcel));
            }
            return new PaymentPayParameter(readString, arrayList);
        }

        /* renamed from: b */
        public final PaymentPayParameter[] newArray(int i) {
            return new PaymentPayParameter[i];
        }
    }

    public PaymentPayParameter(String str, List list) {
        C41536l.m120489i(str, "essServiceId");
        C41536l.m120489i(list, "essParameters");
        this.f82013d = str;
        this.f82014e = list;
    }

    /* renamed from: a */
    public final List mo80181a() {
        return this.f82014e;
    }

    /* renamed from: b */
    public final String mo80182b() {
        return this.f82013d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPayParameter)) {
            return false;
        }
        PaymentPayParameter paymentPayParameter = (PaymentPayParameter) obj;
        return C41536l.m120484d(this.f82013d, paymentPayParameter.f82013d) && C41536l.m120484d(this.f82014e, paymentPayParameter.f82014e);
    }

    public int hashCode() {
        return (this.f82013d.hashCode() * 31) + this.f82014e.hashCode();
    }

    public String toString() {
        String str = this.f82013d;
        List<KeyValue> list = this.f82014e;
        return "PaymentPayParameter(essServiceId=" + str + ", essParameters=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f82013d);
        List<KeyValue> list = this.f82014e;
        parcel.writeInt(list.size());
        for (KeyValue writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
