package p341ge.bog.mobilebank.model.payment;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.model.PaymentVoucher;
import p341ge.bog.mobilebank.model.PaymentVoucher$$Parcelable;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentServiceConfig$$Parcelable */
public class PaymentServiceConfig$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentServiceConfig$$Parcelable> CREATOR = new Parcelable.Creator<PaymentServiceConfig$$Parcelable>() {
        public PaymentServiceConfig$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentServiceConfig$$Parcelable(PaymentServiceConfig$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentServiceConfig$$Parcelable[] newArray(int i) {
            return new PaymentServiceConfig$$Parcelable[i];
        }
    };
    private PaymentServiceConfig paymentServiceConfig$$0;

    public PaymentServiceConfig$$Parcelable(PaymentServiceConfig paymentServiceConfig) {
        this.paymentServiceConfig$$0 = paymentServiceConfig;
    }

    public static PaymentServiceConfig read(Parcel parcel, C42027a aVar) {
        PaymentVoucher[] paymentVoucherArr;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentServiceConfig paymentServiceConfig = new PaymentServiceConfig();
            aVar.mo97501f(g, paymentServiceConfig);
            int readInt2 = parcel.readInt();
            PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = null;
            if (readInt2 < 0) {
                paymentVoucherArr = null;
            } else {
                paymentVoucherArr = new PaymentVoucher[readInt2];
                for (int i = 0; i < readInt2; i++) {
                    paymentVoucherArr[i] = PaymentVoucher$$Parcelable.read(parcel, aVar);
                }
            }
            paymentServiceConfig.mVouchers = paymentVoucherArr;
            int readInt3 = parcel.readInt();
            if (readInt3 >= 0) {
                paymentServiceConfigParameterArr = new PaymentServiceConfigParameter[readInt3];
                for (int i2 = 0; i2 < readInt3; i2++) {
                    paymentServiceConfigParameterArr[i2] = PaymentServiceConfigParameter$$Parcelable.read(parcel, aVar);
                }
            }
            paymentServiceConfig.parameter = paymentServiceConfigParameterArr;
            paymentServiceConfig.name = parcel.readString();
            paymentServiceConfig.logo = parcel.readString();
            paymentServiceConfig.description = parcel.readString();
            paymentServiceConfig.f81345id = parcel.readString();
            paymentServiceConfig.type = parcel.readString();
            paymentServiceConfig.logoSmall = parcel.readString();
            aVar.mo97501f(readInt, paymentServiceConfig);
            return paymentServiceConfig;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentServiceConfig) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentServiceConfig paymentServiceConfig, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentServiceConfig);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentServiceConfig));
        PaymentVoucher[] paymentVoucherArr = paymentServiceConfig.mVouchers;
        if (paymentVoucherArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(paymentVoucherArr.length);
            for (PaymentVoucher write : paymentServiceConfig.mVouchers) {
                PaymentVoucher$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = paymentServiceConfig.parameter;
        if (paymentServiceConfigParameterArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(paymentServiceConfigParameterArr.length);
            for (PaymentServiceConfigParameter write2 : paymentServiceConfig.parameter) {
                PaymentServiceConfigParameter$$Parcelable.write(write2, parcel, i, aVar);
            }
        }
        parcel.writeString(paymentServiceConfig.name);
        parcel.writeString(paymentServiceConfig.logo);
        parcel.writeString(paymentServiceConfig.description);
        parcel.writeString(paymentServiceConfig.f81345id);
        parcel.writeString(paymentServiceConfig.type);
        parcel.writeString(paymentServiceConfig.logoSmall);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentServiceConfig$$0, parcel, i, new C42027a());
    }

    public PaymentServiceConfig getParcel() {
        return this.paymentServiceConfig$$0;
    }
}
