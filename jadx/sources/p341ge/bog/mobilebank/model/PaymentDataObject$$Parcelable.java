package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.PaymentDataObject$$Parcelable */
public class PaymentDataObject$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentDataObject$$Parcelable> CREATOR = new Parcelable.Creator<PaymentDataObject$$Parcelable>() {
        public PaymentDataObject$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentDataObject$$Parcelable(PaymentDataObject$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentDataObject$$Parcelable[] newArray(int i) {
            return new PaymentDataObject$$Parcelable[i];
        }
    };
    private PaymentDataObject paymentDataObject$$0;

    public PaymentDataObject$$Parcelable(PaymentDataObject paymentDataObject) {
        this.paymentDataObject$$0 = paymentDataObject;
    }

    public static PaymentDataObject read(Parcel parcel, C42027a aVar) {
        ArrayList<KeyValue> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentDataObject paymentDataObject = new PaymentDataObject();
            aVar.mo97501f(g, paymentDataObject);
            paymentDataObject.amount = parcel.readString();
            paymentDataObject.processStatus = parcel.readString();
            paymentDataObject.templateName = parcel.readString();
            paymentDataObject.commission = parcel.readString();
            paymentDataObject.serviceId = parcel.readString();
            paymentDataObject.templateId = parcel.readString();
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList<KeyValue> arrayList2 = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add(KeyValue$$Parcelable.read(parcel, aVar));
                }
                arrayList = arrayList2;
            }
            paymentDataObject.parameters = arrayList;
            aVar.mo97501f(readInt, paymentDataObject);
            return paymentDataObject;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentDataObject) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentDataObject paymentDataObject, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentDataObject);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentDataObject));
        parcel.writeString(paymentDataObject.amount);
        parcel.writeString(paymentDataObject.processStatus);
        parcel.writeString(paymentDataObject.templateName);
        parcel.writeString(paymentDataObject.commission);
        parcel.writeString(paymentDataObject.serviceId);
        parcel.writeString(paymentDataObject.templateId);
        ArrayList<KeyValue> arrayList = paymentDataObject.parameters;
        if (arrayList == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(arrayList.size());
        Iterator<KeyValue> it = paymentDataObject.parameters.iterator();
        while (it.hasNext()) {
            KeyValue$$Parcelable.write(it.next(), parcel, i, aVar);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentDataObject$$0, parcel, i, new C42027a());
    }

    public PaymentDataObject getParcel() {
        return this.paymentDataObject$$0;
    }
}
