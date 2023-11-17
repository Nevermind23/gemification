package p341ge.bog.mobilebank.model.payment;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption$$Parcelable */
public class PaymentsServiceConfigInputOption$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentsServiceConfigInputOption$$Parcelable> CREATOR = new Parcelable.Creator<PaymentsServiceConfigInputOption$$Parcelable>() {
        public PaymentsServiceConfigInputOption$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentsServiceConfigInputOption$$Parcelable(PaymentsServiceConfigInputOption$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentsServiceConfigInputOption$$Parcelable[] newArray(int i) {
            return new PaymentsServiceConfigInputOption$$Parcelable[i];
        }
    };
    private PaymentsServiceConfigInputOption paymentsServiceConfigInputOption$$0;

    public PaymentsServiceConfigInputOption$$Parcelable(PaymentsServiceConfigInputOption paymentsServiceConfigInputOption) {
        this.paymentsServiceConfigInputOption$$0 = paymentsServiceConfigInputOption;
    }

    public static PaymentsServiceConfigInputOption read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentsServiceConfigInputOption paymentsServiceConfigInputOption = new PaymentsServiceConfigInputOption();
            aVar.mo97501f(g, paymentsServiceConfigInputOption);
            paymentsServiceConfigInputOption.amount = parcel.readDouble();
            paymentsServiceConfigInputOption.service = parcel.readString();
            paymentsServiceConfigInputOption.f81348id = parcel.readString();
            paymentsServiceConfigInputOption.value = parcel.readString();
            aVar.mo97501f(readInt, paymentsServiceConfigInputOption);
            return paymentsServiceConfigInputOption;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentsServiceConfigInputOption) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentsServiceConfigInputOption paymentsServiceConfigInputOption, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentsServiceConfigInputOption);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentsServiceConfigInputOption));
        parcel.writeDouble(paymentsServiceConfigInputOption.amount);
        parcel.writeString(paymentsServiceConfigInputOption.service);
        parcel.writeString(paymentsServiceConfigInputOption.f81348id);
        parcel.writeString(paymentsServiceConfigInputOption.value);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentsServiceConfigInputOption$$0, parcel, i, new C42027a());
    }

    public PaymentsServiceConfigInputOption getParcel() {
        return this.paymentsServiceConfigInputOption$$0;
    }
}
