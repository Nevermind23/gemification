package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.DDPaymentDetails$$Parcelable */
public class DDPaymentDetails$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DDPaymentDetails$$Parcelable> CREATOR = new Parcelable.Creator<DDPaymentDetails$$Parcelable>() {
        public DDPaymentDetails$$Parcelable createFromParcel(Parcel parcel) {
            return new DDPaymentDetails$$Parcelable(DDPaymentDetails$$Parcelable.read(parcel, new C42027a()));
        }

        public DDPaymentDetails$$Parcelable[] newArray(int i) {
            return new DDPaymentDetails$$Parcelable[i];
        }
    };
    private DDPaymentDetails dDPaymentDetails$$0;

    public DDPaymentDetails$$Parcelable(DDPaymentDetails dDPaymentDetails) {
        this.dDPaymentDetails$$0 = dDPaymentDetails;
    }

    public static DDPaymentDetails read(Parcel parcel, C42027a aVar) {
        Long l;
        Long l2;
        ArrayList<DDPaymentAccount> arrayList;
        Long l3;
        Long l4;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DDPaymentDetails dDPaymentDetails = new DDPaymentDetails();
            aVar.mo97501f(g, dDPaymentDetails);
            dDPaymentDetails.dictionaryKey = parcel.readString();
            dDPaymentDetails.amount = (BigDecimal) parcel.readSerializable();
            dDPaymentDetails.providerCode = parcel.readString();
            dDPaymentDetails.thresholdAmount = (BigDecimal) parcel.readSerializable();
            Long l5 = null;
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            dDPaymentDetails.endDate = l;
            dDPaymentDetails.topUp = parcel.readString();
            dDPaymentDetails.isoverlimitaction = parcel.readString();
            dDPaymentDetails.providerServiceId = parcel.readString();
            dDPaymentDetails.type = parcel.readString();
            dDPaymentDetails.customerIdentification = parcel.readString();
            if (parcel.readInt() < 0) {
                l2 = null;
            } else {
                l2 = Long.valueOf(parcel.readLong());
            }
            dDPaymentDetails.debitsServiceId = l2;
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add(DDPaymentAccount$$Parcelable.read(parcel, aVar));
                }
            }
            dDPaymentDetails.paymentAccounts = arrayList;
            dDPaymentDetails.periodType = parcel.readString();
            if (parcel.readInt() < 0) {
                l3 = null;
            } else {
                l3 = Long.valueOf(parcel.readLong());
            }
            dDPaymentDetails.nextSentDate = l3;
            if (parcel.readInt() < 0) {
                l4 = null;
            } else {
                l4 = Long.valueOf(parcel.readLong());
            }
            dDPaymentDetails.paymentId = l4;
            if (parcel.readInt() >= 0) {
                l5 = Long.valueOf(parcel.readLong());
            }
            dDPaymentDetails.providerId = l5;
            dDPaymentDetails.subServiceId = parcel.readString();
            dDPaymentDetails.orderName = parcel.readString();
            aVar.mo97501f(readInt, dDPaymentDetails);
            return dDPaymentDetails;
        } else if (!aVar.mo97499d(readInt)) {
            return (DDPaymentDetails) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DDPaymentDetails dDPaymentDetails, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(dDPaymentDetails);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(dDPaymentDetails));
        parcel.writeString(dDPaymentDetails.dictionaryKey);
        parcel.writeSerializable(dDPaymentDetails.amount);
        parcel.writeString(dDPaymentDetails.providerCode);
        parcel.writeSerializable(dDPaymentDetails.thresholdAmount);
        if (dDPaymentDetails.endDate == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(dDPaymentDetails.endDate.longValue());
        }
        parcel.writeString(dDPaymentDetails.topUp);
        parcel.writeString(dDPaymentDetails.isoverlimitaction);
        parcel.writeString(dDPaymentDetails.providerServiceId);
        parcel.writeString(dDPaymentDetails.type);
        parcel.writeString(dDPaymentDetails.customerIdentification);
        if (dDPaymentDetails.debitsServiceId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(dDPaymentDetails.debitsServiceId.longValue());
        }
        ArrayList<DDPaymentAccount> arrayList = dDPaymentDetails.paymentAccounts;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<DDPaymentAccount> it = dDPaymentDetails.paymentAccounts.iterator();
            while (it.hasNext()) {
                DDPaymentAccount$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        parcel.writeString(dDPaymentDetails.periodType);
        if (dDPaymentDetails.nextSentDate == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(dDPaymentDetails.nextSentDate.longValue());
        }
        if (dDPaymentDetails.paymentId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(dDPaymentDetails.paymentId.longValue());
        }
        if (dDPaymentDetails.providerId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(dDPaymentDetails.providerId.longValue());
        }
        parcel.writeString(dDPaymentDetails.subServiceId);
        parcel.writeString(dDPaymentDetails.orderName);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.dDPaymentDetails$$0, parcel, i, new C42027a());
    }

    public DDPaymentDetails getParcel() {
        return this.dDPaymentDetails$$0;
    }
}
