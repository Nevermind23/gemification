package p341ge.bog.mobilebank.payments.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.payments.domain.model.PaymentReceiptPdfParameters */
public final class PaymentReceiptPdfParameters implements Parcelable {
    public static final Parcelable.Creator<PaymentReceiptPdfParameters> CREATOR = new C33631a();
    @C8664c("parameters")

    /* renamed from: d */
    private final List<KeyValue> f82015d;

    /* renamed from: ge.bog.mobilebank.payments.domain.model.PaymentReceiptPdfParameters$a */
    public static final class C33631a implements Parcelable.Creator {
        /* renamed from: a */
        public final PaymentReceiptPdfParameters createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(KeyValue.CREATOR.createFromParcel(parcel));
            }
            return new PaymentReceiptPdfParameters(arrayList);
        }

        /* renamed from: b */
        public final PaymentReceiptPdfParameters[] newArray(int i) {
            return new PaymentReceiptPdfParameters[i];
        }
    }

    public PaymentReceiptPdfParameters(List list) {
        C41536l.m120489i(list, "parameters");
        this.f82015d = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentReceiptPdfParameters) && C41536l.m120484d(this.f82015d, ((PaymentReceiptPdfParameters) obj).f82015d);
    }

    public int hashCode() {
        return this.f82015d.hashCode();
    }

    public String toString() {
        List<KeyValue> list = this.f82015d;
        return "PaymentReceiptPdfParameters(parameters=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<KeyValue> list = this.f82015d;
        parcel.writeInt(list.size());
        for (KeyValue writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
