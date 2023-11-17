package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.Beneficiary$$Parcelable */
public class Beneficiary$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<Beneficiary$$Parcelable> CREATOR = new Parcelable.Creator<Beneficiary$$Parcelable>() {
        public Beneficiary$$Parcelable createFromParcel(Parcel parcel) {
            return new Beneficiary$$Parcelable(Beneficiary$$Parcelable.read(parcel, new C42027a()));
        }

        public Beneficiary$$Parcelable[] newArray(int i) {
            return new Beneficiary$$Parcelable[i];
        }
    };
    private Beneficiary beneficiary$$0;

    public Beneficiary$$Parcelable(Beneficiary beneficiary) {
        this.beneficiary$$0 = beneficiary;
    }

    public static Beneficiary read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            Beneficiary beneficiary = new Beneficiary();
            aVar.mo97501f(g, beneficiary);
            beneficiary.benefName = parcel.readString();
            beneficiary.benefNameInt = parcel.readString();
            beneficiary.beneficiaryName = parcel.readString();
            beneficiary.benefAcctNo = parcel.readString();
            beneficiary.benefBic = parcel.readString();
            aVar.mo97501f(readInt, beneficiary);
            return beneficiary;
        } else if (!aVar.mo97499d(readInt)) {
            return (Beneficiary) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(Beneficiary beneficiary, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(beneficiary);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(beneficiary));
        parcel.writeString(beneficiary.benefName);
        parcel.writeString(beneficiary.benefNameInt);
        parcel.writeString(beneficiary.beneficiaryName);
        parcel.writeString(beneficiary.benefAcctNo);
        parcel.writeString(beneficiary.benefBic);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.beneficiary$$0, parcel, i, new C42027a());
    }

    public Beneficiary getParcel() {
        return this.beneficiary$$0;
    }
}
