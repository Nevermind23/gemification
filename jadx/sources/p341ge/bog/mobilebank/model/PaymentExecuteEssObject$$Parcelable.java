package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.PaymentExecuteEssObject$$Parcelable */
public class PaymentExecuteEssObject$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentExecuteEssObject$$Parcelable> CREATOR = new Parcelable.Creator<PaymentExecuteEssObject$$Parcelable>() {
        public PaymentExecuteEssObject$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentExecuteEssObject$$Parcelable(PaymentExecuteEssObject$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentExecuteEssObject$$Parcelable[] newArray(int i) {
            return new PaymentExecuteEssObject$$Parcelable[i];
        }
    };
    private PaymentExecuteEssObject paymentExecuteEssObject$$0;

    public PaymentExecuteEssObject$$Parcelable(PaymentExecuteEssObject paymentExecuteEssObject) {
        this.paymentExecuteEssObject$$0 = paymentExecuteEssObject;
    }

    public static PaymentExecuteEssObject read(Parcel parcel, C42027a aVar) {
        ArrayList<KeyValue> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentExecuteEssObject paymentExecuteEssObject = new PaymentExecuteEssObject();
            aVar.mo97501f(g, paymentExecuteEssObject);
            paymentExecuteEssObject.essServiceId = parcel.readString();
            paymentExecuteEssObject.paymentCommission = parcel.readString();
            paymentExecuteEssObject.templateName = parcel.readString();
            paymentExecuteEssObject.errorDictionaryKey = parcel.readString();
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
            paymentExecuteEssObject.essParameters = arrayList;
            paymentExecuteEssObject.templateId = parcel.readString();
            paymentExecuteEssObject.error = parcel.readString();
            paymentExecuteEssObject.status = parcel.readString();
            paymentExecuteEssObject.codeStatus = parcel.readString();
            aVar.mo97501f(readInt, paymentExecuteEssObject);
            return paymentExecuteEssObject;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentExecuteEssObject) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentExecuteEssObject paymentExecuteEssObject, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentExecuteEssObject);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentExecuteEssObject));
        parcel.writeString(paymentExecuteEssObject.essServiceId);
        parcel.writeString(paymentExecuteEssObject.paymentCommission);
        parcel.writeString(paymentExecuteEssObject.templateName);
        parcel.writeString(paymentExecuteEssObject.errorDictionaryKey);
        ArrayList<KeyValue> arrayList = paymentExecuteEssObject.essParameters;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<KeyValue> it = paymentExecuteEssObject.essParameters.iterator();
            while (it.hasNext()) {
                KeyValue$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        parcel.writeString(paymentExecuteEssObject.templateId);
        parcel.writeString(paymentExecuteEssObject.error);
        parcel.writeString(paymentExecuteEssObject.status);
        parcel.writeString(paymentExecuteEssObject.codeStatus);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentExecuteEssObject$$0, parcel, i, new C42027a());
    }

    public PaymentExecuteEssObject getParcel() {
        return this.paymentExecuteEssObject$$0;
    }
}
