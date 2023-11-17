package p341ge.bog.mobilebank.payment.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration$$Parcelable;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption$$Parcelable;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem$$Parcelable;

/* renamed from: ge.bog.mobilebank.payment.model.PaymentCustomConfiguration$$Parcelable */
public class PaymentCustomConfiguration$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentCustomConfiguration$$Parcelable> CREATOR = new C33622a();
    private PaymentCustomConfiguration paymentCustomConfiguration$$0;

    /* renamed from: ge.bog.mobilebank.payment.model.PaymentCustomConfiguration$$Parcelable$a */
    class C33622a implements Parcelable.Creator {
        C33622a() {
        }

        /* renamed from: a */
        public PaymentCustomConfiguration$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentCustomConfiguration$$Parcelable(PaymentCustomConfiguration$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public PaymentCustomConfiguration$$Parcelable[] newArray(int i) {
            return new PaymentCustomConfiguration$$Parcelable[i];
        }
    }

    public PaymentCustomConfiguration$$Parcelable(PaymentCustomConfiguration paymentCustomConfiguration) {
        this.paymentCustomConfiguration$$0 = paymentCustomConfiguration;
    }

    public static PaymentCustomConfiguration read(Parcel parcel, C42027a aVar) {
        boolean z;
        ArrayList<TemplateBasketItem> arrayList;
        boolean z2;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentCustomConfiguration paymentCustomConfiguration = new PaymentCustomConfiguration();
            aVar.mo97501f(g, paymentCustomConfiguration);
            paymentCustomConfiguration.pointAmount = parcel.readString();
            paymentCustomConfiguration.debtServiceId = parcel.readString();
            paymentCustomConfiguration.baseConfiguration = PaymentProviderConfiguration$$Parcelable.read(parcel, aVar);
            boolean z3 = true;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            paymentCustomConfiguration.isCompany = z;
            paymentCustomConfiguration.logoUrl = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = null;
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add(TemplateBasketItem$$Parcelable.read(parcel, aVar));
                }
            }
            paymentCustomConfiguration.resultListItems = arrayList;
            paymentCustomConfiguration.defaultPersonalNumber = parcel.readString();
            paymentCustomConfiguration.selectedPackageConfig = PaymentsServiceConfigInputOption$$Parcelable.read(parcel, aVar);
            paymentCustomConfiguration.defaultTicketNumber = parcel.readString();
            paymentCustomConfiguration.companyId = parcel.readLong();
            paymentCustomConfiguration.selectedPackageIndex = parcel.readInt();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            paymentCustomConfiguration.isTemplate = z2;
            paymentCustomConfiguration.name = parcel.readString();
            if (parcel.readInt() != 1) {
                z3 = false;
            }
            paymentCustomConfiguration.isMobile = z3;
            paymentCustomConfiguration.serviceId = parcel.readString();
            paymentCustomConfiguration.bonusType = parcel.readString();
            int readInt3 = parcel.readInt();
            if (readInt3 >= 0) {
                arrayList2 = new ArrayList(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    arrayList2.add(PaymentCustomParameter$$Parcelable.read(parcel, aVar));
                }
            }
            paymentCustomConfiguration.parameters = arrayList2;
            paymentCustomConfiguration.defaultCarNumber = parcel.readString();
            aVar.mo97501f(readInt, paymentCustomConfiguration);
            return paymentCustomConfiguration;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentCustomConfiguration) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentCustomConfiguration paymentCustomConfiguration, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentCustomConfiguration);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentCustomConfiguration));
        parcel.writeString(paymentCustomConfiguration.pointAmount);
        parcel.writeString(paymentCustomConfiguration.debtServiceId);
        PaymentProviderConfiguration$$Parcelable.write(paymentCustomConfiguration.baseConfiguration, parcel, i, aVar);
        parcel.writeInt(paymentCustomConfiguration.isCompany ? 1 : 0);
        parcel.writeString(paymentCustomConfiguration.logoUrl);
        ArrayList<TemplateBasketItem> arrayList = paymentCustomConfiguration.resultListItems;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<TemplateBasketItem> it = paymentCustomConfiguration.resultListItems.iterator();
            while (it.hasNext()) {
                TemplateBasketItem$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        parcel.writeString(paymentCustomConfiguration.defaultPersonalNumber);
        PaymentsServiceConfigInputOption$$Parcelable.write(paymentCustomConfiguration.selectedPackageConfig, parcel, i, aVar);
        parcel.writeString(paymentCustomConfiguration.defaultTicketNumber);
        parcel.writeLong(paymentCustomConfiguration.companyId);
        parcel.writeInt(paymentCustomConfiguration.selectedPackageIndex);
        parcel.writeInt(paymentCustomConfiguration.isTemplate ? 1 : 0);
        parcel.writeString(paymentCustomConfiguration.name);
        parcel.writeInt(paymentCustomConfiguration.isMobile ? 1 : 0);
        parcel.writeString(paymentCustomConfiguration.serviceId);
        parcel.writeString(paymentCustomConfiguration.bonusType);
        List<PaymentCustomParameter> list = paymentCustomConfiguration.parameters;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            for (PaymentCustomParameter write : paymentCustomConfiguration.parameters) {
                PaymentCustomParameter$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        parcel.writeString(paymentCustomConfiguration.defaultCarNumber);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentCustomConfiguration$$0, parcel, i, new C42027a());
    }

    public PaymentCustomConfiguration getParcel() {
        return this.paymentCustomConfiguration$$0;
    }
}
