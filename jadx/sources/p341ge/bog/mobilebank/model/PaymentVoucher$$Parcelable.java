package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.PaymentVoucher$$Parcelable */
public class PaymentVoucher$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentVoucher$$Parcelable> CREATOR = new Parcelable.Creator<PaymentVoucher$$Parcelable>() {
        public PaymentVoucher$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentVoucher$$Parcelable(PaymentVoucher$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentVoucher$$Parcelable[] newArray(int i) {
            return new PaymentVoucher$$Parcelable[i];
        }
    };
    private PaymentVoucher paymentVoucher$$0;

    public PaymentVoucher$$Parcelable(PaymentVoucher paymentVoucher) {
        this.paymentVoucher$$0 = paymentVoucher;
    }

    public static PaymentVoucher read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentVoucher paymentVoucher = new PaymentVoucher();
            aVar.mo97501f(g, paymentVoucher);
            paymentVoucher.voucherBonus = (BigDecimal) parcel.readSerializable();
            paymentVoucher.providerCode = parcel.readString();
            paymentVoucher.voucherType = parcel.readString();
            paymentVoucher.voucherAmount = (BigDecimal) parcel.readSerializable();
            paymentVoucher.bonusType = parcel.readString();
            paymentVoucher.voucherCcy = parcel.readString();
            aVar.mo97501f(readInt, paymentVoucher);
            return paymentVoucher;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentVoucher) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentVoucher paymentVoucher, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentVoucher);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentVoucher));
        parcel.writeSerializable(paymentVoucher.voucherBonus);
        parcel.writeString(paymentVoucher.providerCode);
        parcel.writeString(paymentVoucher.voucherType);
        parcel.writeSerializable(paymentVoucher.voucherAmount);
        parcel.writeString(paymentVoucher.bonusType);
        parcel.writeString(paymentVoucher.voucherCcy);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentVoucher$$0, parcel, i, new C42027a());
    }

    public PaymentVoucher getParcel() {
        return this.paymentVoucher$$0;
    }
}
