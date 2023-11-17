package p341ge.bog.mobilebank.model.payment;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter$$Parcelable */
public class PaymentServiceConfigParameter$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentServiceConfigParameter$$Parcelable> CREATOR = new Parcelable.Creator<PaymentServiceConfigParameter$$Parcelable>() {
        public PaymentServiceConfigParameter$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentServiceConfigParameter$$Parcelable(PaymentServiceConfigParameter$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentServiceConfigParameter$$Parcelable[] newArray(int i) {
            return new PaymentServiceConfigParameter$$Parcelable[i];
        }
    };
    private PaymentServiceConfigParameter paymentServiceConfigParameter$$0;

    public PaymentServiceConfigParameter$$Parcelable(PaymentServiceConfigParameter paymentServiceConfigParameter) {
        this.paymentServiceConfigParameter$$0 = paymentServiceConfigParameter;
    }

    public static PaymentServiceConfigParameter read(Parcel parcel, C42027a aVar) {
        PaymentServiceConfigInput[] paymentServiceConfigInputArr;
        boolean z;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentServiceConfigParameter paymentServiceConfigParameter = new PaymentServiceConfigParameter();
            aVar.mo97501f(g, paymentServiceConfigParameter);
            paymentServiceConfigParameter.paramType = parcel.readString();
            int readInt2 = parcel.readInt();
            Boolean bool = null;
            boolean z2 = false;
            if (readInt2 < 0) {
                paymentServiceConfigInputArr = null;
            } else {
                paymentServiceConfigInputArr = new PaymentServiceConfigInput[readInt2];
                for (int i = 0; i < readInt2; i++) {
                    paymentServiceConfigInputArr[i] = PaymentServiceConfigInput$$Parcelable.read(parcel, aVar);
                }
            }
            paymentServiceConfigParameter.input = paymentServiceConfigInputArr;
            paymentServiceConfigParameter.name = parcel.readString();
            paymentServiceConfigParameter.description = parcel.readString();
            paymentServiceConfigParameter.paramMask = parcel.readString();
            paymentServiceConfigParameter.f81347id = parcel.readString();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            paymentServiceConfigParameter.successParam = z;
            if (parcel.readInt() >= 0) {
                if (parcel.readInt() == 1) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            }
            paymentServiceConfigParameter.mandatory = bool;
            aVar.mo97501f(readInt, paymentServiceConfigParameter);
            return paymentServiceConfigParameter;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentServiceConfigParameter) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentServiceConfigParameter paymentServiceConfigParameter, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentServiceConfigParameter);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentServiceConfigParameter));
        parcel.writeString(paymentServiceConfigParameter.paramType);
        PaymentServiceConfigInput[] paymentServiceConfigInputArr = paymentServiceConfigParameter.input;
        if (paymentServiceConfigInputArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(paymentServiceConfigInputArr.length);
            for (PaymentServiceConfigInput write : paymentServiceConfigParameter.input) {
                PaymentServiceConfigInput$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        parcel.writeString(paymentServiceConfigParameter.name);
        parcel.writeString(paymentServiceConfigParameter.description);
        parcel.writeString(paymentServiceConfigParameter.paramMask);
        parcel.writeString(paymentServiceConfigParameter.f81347id);
        parcel.writeInt(paymentServiceConfigParameter.successParam ? 1 : 0);
        if (paymentServiceConfigParameter.mandatory == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(paymentServiceConfigParameter.mandatory.booleanValue() ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentServiceConfigParameter$$0, parcel, i, new C42027a());
    }

    public PaymentServiceConfigParameter getParcel() {
        return this.paymentServiceConfigParameter$$0;
    }
}
