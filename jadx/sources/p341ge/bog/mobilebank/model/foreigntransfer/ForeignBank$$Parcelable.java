package p341ge.bog.mobilebank.model.foreigntransfer;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.foreigntransfer.ForeignBank$$Parcelable */
public class ForeignBank$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<ForeignBank$$Parcelable> CREATOR = new Parcelable.Creator<ForeignBank$$Parcelable>() {
        public ForeignBank$$Parcelable createFromParcel(Parcel parcel) {
            return new ForeignBank$$Parcelable(ForeignBank$$Parcelable.read(parcel, new C42027a()));
        }

        public ForeignBank$$Parcelable[] newArray(int i) {
            return new ForeignBank$$Parcelable[i];
        }
    };
    private ForeignBank foreignBank$$0;

    public ForeignBank$$Parcelable(ForeignBank foreignBank) {
        this.foreignBank$$0 = foreignBank;
    }

    public static ForeignBank read(Parcel parcel, C42027a aVar) {
        TransferCountryCode transferCountryCode;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            ForeignBank foreignBank = new ForeignBank();
            aVar.mo97501f(g, foreignBank);
            foreignBank.setAddress(parcel.readString());
            foreignBank.setCity(parcel.readString());
            String readString = parcel.readString();
            if (readString == null) {
                transferCountryCode = null;
            } else {
                transferCountryCode = (TransferCountryCode) Enum.valueOf(TransferCountryCode.class, readString);
            }
            foreignBank.setCountryCode(transferCountryCode);
            foreignBank.setBankName(parcel.readString());
            foreignBank.setTotalCount(parcel.readInt());
            foreignBank.setBranch(parcel.readString());
            foreignBank.setSwift(parcel.readString());
            aVar.mo97501f(readInt, foreignBank);
            return foreignBank;
        } else if (!aVar.mo97499d(readInt)) {
            return (ForeignBank) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(ForeignBank foreignBank, Parcel parcel, int i, C42027a aVar) {
        String str;
        int c = aVar.mo97498c(foreignBank);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(foreignBank));
        parcel.writeString(foreignBank.getAddress());
        parcel.writeString(foreignBank.getCity());
        TransferCountryCode countryCode = foreignBank.getCountryCode();
        if (countryCode == null) {
            str = null;
        } else {
            str = countryCode.name();
        }
        parcel.writeString(str);
        parcel.writeString(foreignBank.getBankName());
        parcel.writeInt(foreignBank.getTotalCount());
        parcel.writeString(foreignBank.getBranch());
        parcel.writeString(foreignBank.getSwift());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.foreignBank$$0, parcel, i, new C42027a());
    }

    public ForeignBank getParcel() {
        return this.foreignBank$$0;
    }
}
