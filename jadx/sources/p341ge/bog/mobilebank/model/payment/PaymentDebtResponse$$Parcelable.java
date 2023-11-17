package p341ge.bog.mobilebank.model.payment;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.KeyValue$$Parcelable;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentDebtResponse$$Parcelable */
public class PaymentDebtResponse$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentDebtResponse$$Parcelable> CREATOR = new Parcelable.Creator<PaymentDebtResponse$$Parcelable>() {
        public PaymentDebtResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentDebtResponse$$Parcelable(PaymentDebtResponse$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentDebtResponse$$Parcelable[] newArray(int i) {
            return new PaymentDebtResponse$$Parcelable[i];
        }
    };
    private PaymentDebtResponse paymentDebtResponse$$0;

    public PaymentDebtResponse$$Parcelable(PaymentDebtResponse paymentDebtResponse) {
        this.paymentDebtResponse$$0 = paymentDebtResponse;
    }

    public static PaymentDebtResponse read(Parcel parcel, C42027a aVar) {
        KeyValue[] keyValueArr;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentDebtResponse paymentDebtResponse = new PaymentDebtResponse();
            aVar.mo97501f(g, paymentDebtResponse);
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                keyValueArr = null;
            } else {
                KeyValue[] keyValueArr2 = new KeyValue[readInt2];
                for (int i = 0; i < readInt2; i++) {
                    keyValueArr2[i] = KeyValue$$Parcelable.read(parcel, aVar);
                }
                keyValueArr = keyValueArr2;
            }
            paymentDebtResponse.parameter = keyValueArr;
            aVar.mo97501f(readInt, paymentDebtResponse);
            return paymentDebtResponse;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentDebtResponse) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentDebtResponse paymentDebtResponse, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentDebtResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentDebtResponse));
        KeyValue[] keyValueArr = paymentDebtResponse.parameter;
        if (keyValueArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(keyValueArr.length);
        for (KeyValue write : paymentDebtResponse.parameter) {
            KeyValue$$Parcelable.write(write, parcel, i, aVar);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentDebtResponse$$0, parcel, i, new C42027a());
    }

    public PaymentDebtResponse getParcel() {
        return this.paymentDebtResponse$$0;
    }
}
