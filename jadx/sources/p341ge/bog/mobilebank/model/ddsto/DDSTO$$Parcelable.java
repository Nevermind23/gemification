package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.DDSTO$$Parcelable */
public class DDSTO$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DDSTO$$Parcelable> CREATOR = new Parcelable.Creator<DDSTO$$Parcelable>() {
        public DDSTO$$Parcelable createFromParcel(Parcel parcel) {
            return new DDSTO$$Parcelable(DDSTO$$Parcelable.read(parcel, new C42027a()));
        }

        public DDSTO$$Parcelable[] newArray(int i) {
            return new DDSTO$$Parcelable[i];
        }
    };
    private DDSTO dDSTO$$0;

    public DDSTO$$Parcelable(DDSTO ddsto) {
        this.dDSTO$$0 = ddsto;
    }

    public static DDSTO read(Parcel parcel, C42027a aVar) {
        Long l;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DDSTO ddsto = new DDSTO();
            aVar.mo97501f(g, ddsto);
            ddsto.dictionaryKey = parcel.readString();
            ddsto.amount = parcel.readString();
            ddsto.periodType = parcel.readString();
            ddsto.productCode = parcel.readString();
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            ddsto.nextSentDate = l;
            ddsto.serviceCode = parcel.readString();
            ddsto.paymentId = parcel.readLong();
            ddsto.ccy = parcel.readString();
            ddsto.periodTypeDictionaryKey = parcel.readString();
            ddsto.debitType = parcel.readString();
            ddsto.details = DDSTODetailsWrapper$$Parcelable.read(parcel, aVar);
            ddsto.status = parcel.readString();
            aVar.mo97501f(readInt, ddsto);
            return ddsto;
        } else if (!aVar.mo97499d(readInt)) {
            return (DDSTO) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DDSTO ddsto, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(ddsto);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(ddsto));
        parcel.writeString(ddsto.dictionaryKey);
        parcel.writeString(ddsto.amount);
        parcel.writeString(ddsto.periodType);
        parcel.writeString(ddsto.productCode);
        if (ddsto.nextSentDate == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(ddsto.nextSentDate.longValue());
        }
        parcel.writeString(ddsto.serviceCode);
        parcel.writeLong(ddsto.paymentId);
        parcel.writeString(ddsto.ccy);
        parcel.writeString(ddsto.periodTypeDictionaryKey);
        parcel.writeString(ddsto.debitType);
        DDSTODetailsWrapper$$Parcelable.write(ddsto.details, parcel, i, aVar);
        parcel.writeString(ddsto.status);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.dDSTO$$0, parcel, i, new C42027a());
    }

    public DDSTO getParcel() {
        return this.dDSTO$$0;
    }
}
