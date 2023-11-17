package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.DDDebitService$$Parcelable */
public class DDDebitService$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DDDebitService$$Parcelable> CREATOR = new Parcelable.Creator<DDDebitService$$Parcelable>() {
        public DDDebitService$$Parcelable createFromParcel(Parcel parcel) {
            return new DDDebitService$$Parcelable(DDDebitService$$Parcelable.read(parcel, new C42027a()));
        }

        public DDDebitService$$Parcelable[] newArray(int i) {
            return new DDDebitService$$Parcelable[i];
        }
    };
    private DDDebitService dDDebitService$$0;

    public DDDebitService$$Parcelable(DDDebitService dDDebitService) {
        this.dDDebitService$$0 = dDDebitService;
    }

    public static DDDebitService read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DDDebitService dDDebitService = new DDDebitService();
            aVar.mo97501f(g, dDDebitService);
            dDDebitService.valid = parcel.readString();
            dDDebitService.dictionaryKey = parcel.readString();
            dDDebitService.serviceCode = parcel.readString();
            dDDebitService.providerId = parcel.readLong();
            dDDebitService.serviceId = parcel.readLong();
            dDDebitService.subServiceId = parcel.readString();
            aVar.mo97501f(readInt, dDDebitService);
            return dDDebitService;
        } else if (!aVar.mo97499d(readInt)) {
            return (DDDebitService) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DDDebitService dDDebitService, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(dDDebitService);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(dDDebitService));
        parcel.writeString(dDDebitService.valid);
        parcel.writeString(dDDebitService.dictionaryKey);
        parcel.writeString(dDDebitService.serviceCode);
        parcel.writeLong(dDDebitService.providerId);
        parcel.writeLong(dDDebitService.serviceId);
        parcel.writeString(dDDebitService.subServiceId);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.dDDebitService$$0, parcel, i, new C42027a());
    }

    public DDDebitService getParcel() {
        return this.dDDebitService$$0;
    }
}
