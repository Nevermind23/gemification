package p341ge.bog.mobilebank.model.payment;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42028b;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentProviderConfiguration$$Parcelable */
public class PaymentProviderConfiguration$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentProviderConfiguration$$Parcelable> CREATOR = new Parcelable.Creator<PaymentProviderConfiguration$$Parcelable>() {
        public PaymentProviderConfiguration$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentProviderConfiguration$$Parcelable(PaymentProviderConfiguration$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentProviderConfiguration$$Parcelable[] newArray(int i) {
            return new PaymentProviderConfiguration$$Parcelable[i];
        }
    };
    private PaymentProviderConfiguration paymentProviderConfiguration$$0;

    public PaymentProviderConfiguration$$Parcelable(PaymentProviderConfiguration paymentProviderConfiguration) {
        this.paymentProviderConfiguration$$0 = paymentProviderConfiguration;
    }

    public static PaymentProviderConfiguration read(Parcel parcel, C42027a aVar) {
        Integer num;
        Double d;
        boolean z;
        boolean z2;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentProviderConfiguration paymentProviderConfiguration = new PaymentProviderConfiguration();
            aVar.mo97501f(g, paymentProviderConfiguration);
            paymentProviderConfiguration.serviceType = parcel.readString();
            Integer num2 = null;
            if (parcel.readInt() < 0) {
                num = null;
            } else {
                num = Integer.valueOf(parcel.readInt());
            }
            C42028b.m122113b(PaymentProviderConfiguration.class, paymentProviderConfiguration, "orderId", num);
            paymentProviderConfiguration.channel = parcel.readString();
            paymentProviderConfiguration.debtServiceId = parcel.readString();
            if (parcel.readInt() < 0) {
                d = null;
            } else {
                d = Double.valueOf(parcel.readDouble());
            }
            paymentProviderConfiguration.payAmountLimit = d;
            paymentProviderConfiguration.serviceName = parcel.readString();
            paymentProviderConfiguration.serviceConfigJson = PaymentServiceConfig$$Parcelable.read(parcel, aVar);
            paymentProviderConfiguration.serviceCategory = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            paymentProviderConfiguration.hasDebt = z;
            paymentProviderConfiguration.parentID = parcel.readLong();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            paymentProviderConfiguration.isDDAllowed = z2;
            paymentProviderConfiguration.serviceConfig = parcel.readString();
            if (parcel.readInt() >= 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            paymentProviderConfiguration.orderingNumber = num2;
            paymentProviderConfiguration.oldLogo = parcel.readString();
            paymentProviderConfiguration.paymentServiceId = parcel.readString();
            paymentProviderConfiguration.logo = parcel.readString();
            paymentProviderConfiguration.commission = parcel.readString();
            paymentProviderConfiguration.f81344id = parcel.readLong();
            paymentProviderConfiguration.additionalData = parcel.readString();
            paymentProviderConfiguration.serviceId = parcel.readString();
            if (parcel.readInt() == 1) {
                z3 = true;
            }
            paymentProviderConfiguration.isTemplateAccessAllowed = z3;
            paymentProviderConfiguration.providerName = parcel.readString();
            aVar.mo97501f(readInt, paymentProviderConfiguration);
            return paymentProviderConfiguration;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentProviderConfiguration) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentProviderConfiguration paymentProviderConfiguration, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentProviderConfiguration);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentProviderConfiguration));
        parcel.writeString(paymentProviderConfiguration.serviceType);
        Class<Integer> cls = Integer.class;
        Class<PaymentProviderConfiguration> cls2 = PaymentProviderConfiguration.class;
        if (C42028b.m122112a(cls, cls2, paymentProviderConfiguration, "orderId") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(((Integer) C42028b.m122112a(cls, cls2, paymentProviderConfiguration, "orderId")).intValue());
        }
        parcel.writeString(paymentProviderConfiguration.channel);
        parcel.writeString(paymentProviderConfiguration.debtServiceId);
        if (paymentProviderConfiguration.payAmountLimit == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(paymentProviderConfiguration.payAmountLimit.doubleValue());
        }
        parcel.writeString(paymentProviderConfiguration.serviceName);
        PaymentServiceConfig$$Parcelable.write(paymentProviderConfiguration.serviceConfigJson, parcel, i, aVar);
        parcel.writeString(paymentProviderConfiguration.serviceCategory);
        parcel.writeInt(paymentProviderConfiguration.hasDebt ? 1 : 0);
        parcel.writeLong(paymentProviderConfiguration.parentID);
        parcel.writeInt(paymentProviderConfiguration.isDDAllowed ? 1 : 0);
        parcel.writeString(paymentProviderConfiguration.serviceConfig);
        if (paymentProviderConfiguration.orderingNumber == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(paymentProviderConfiguration.orderingNumber.intValue());
        }
        parcel.writeString(paymentProviderConfiguration.oldLogo);
        parcel.writeString(paymentProviderConfiguration.paymentServiceId);
        parcel.writeString(paymentProviderConfiguration.logo);
        parcel.writeString(paymentProviderConfiguration.commission);
        parcel.writeLong(paymentProviderConfiguration.f81344id);
        parcel.writeString(paymentProviderConfiguration.additionalData);
        parcel.writeString(paymentProviderConfiguration.serviceId);
        parcel.writeInt(paymentProviderConfiguration.isTemplateAccessAllowed ? 1 : 0);
        parcel.writeString(paymentProviderConfiguration.providerName);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentProviderConfiguration$$0, parcel, i, new C42027a());
    }

    public PaymentProviderConfiguration getParcel() {
        return this.paymentProviderConfiguration$$0;
    }
}
