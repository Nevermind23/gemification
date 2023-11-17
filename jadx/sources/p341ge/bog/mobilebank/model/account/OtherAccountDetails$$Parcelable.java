package p341ge.bog.mobilebank.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.account.OtherAccountDetails$$Parcelable */
public class OtherAccountDetails$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<OtherAccountDetails$$Parcelable> CREATOR = new Parcelable.Creator<OtherAccountDetails$$Parcelable>() {
        public OtherAccountDetails$$Parcelable createFromParcel(Parcel parcel) {
            return new OtherAccountDetails$$Parcelable(OtherAccountDetails$$Parcelable.read(parcel, new C42027a()));
        }

        public OtherAccountDetails$$Parcelable[] newArray(int i) {
            return new OtherAccountDetails$$Parcelable[i];
        }
    };
    private OtherAccountDetails otherAccountDetails$$0;

    public OtherAccountDetails$$Parcelable(OtherAccountDetails otherAccountDetails) {
        this.otherAccountDetails$$0 = otherAccountDetails;
    }

    public static OtherAccountDetails read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            OtherAccountDetails otherAccountDetails = new OtherAccountDetails();
            aVar.mo97501f(g, otherAccountDetails);
            otherAccountDetails.acctNo = parcel.readString();
            otherAccountDetails.name = parcel.readString();
            otherAccountDetails.f81299id = parcel.readString();
            aVar.mo97501f(readInt, otherAccountDetails);
            return otherAccountDetails;
        } else if (!aVar.mo97499d(readInt)) {
            return (OtherAccountDetails) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(OtherAccountDetails otherAccountDetails, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(otherAccountDetails);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(otherAccountDetails));
        parcel.writeString(otherAccountDetails.acctNo);
        parcel.writeString(otherAccountDetails.name);
        parcel.writeString(otherAccountDetails.f81299id);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.otherAccountDetails$$0, parcel, i, new C42027a());
    }

    public OtherAccountDetails getParcel() {
        return this.otherAccountDetails$$0;
    }
}
