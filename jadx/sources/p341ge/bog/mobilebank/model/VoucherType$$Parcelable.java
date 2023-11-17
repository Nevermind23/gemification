package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.VoucherType$$Parcelable */
public class VoucherType$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<VoucherType$$Parcelable> CREATOR = new Parcelable.Creator<VoucherType$$Parcelable>() {
        public VoucherType$$Parcelable createFromParcel(Parcel parcel) {
            return new VoucherType$$Parcelable(VoucherType$$Parcelable.read(parcel, new C42027a()));
        }

        public VoucherType$$Parcelable[] newArray(int i) {
            return new VoucherType$$Parcelable[i];
        }
    };
    private VoucherType voucherType$$0;

    public VoucherType$$Parcelable(VoucherType voucherType) {
        this.voucherType$$0 = voucherType;
    }

    public static VoucherType read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            VoucherType voucherType = new VoucherType();
            aVar.mo97501f(g, voucherType);
            voucherType.voucherBonus = (BigDecimal) parcel.readSerializable();
            voucherType.dictionaryKey = parcel.readString();
            voucherType.voucherType = parcel.readString();
            voucherType.voucherAmount = (BigDecimal) parcel.readSerializable();
            voucherType.voucherDesc = parcel.readString();
            voucherType.productType = parcel.readString();
            voucherType.voucherCcy = parcel.readString();
            aVar.mo97501f(readInt, voucherType);
            return voucherType;
        } else if (!aVar.mo97499d(readInt)) {
            return (VoucherType) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(VoucherType voucherType, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(voucherType);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(voucherType));
        parcel.writeSerializable(voucherType.voucherBonus);
        parcel.writeString(voucherType.dictionaryKey);
        parcel.writeString(voucherType.voucherType);
        parcel.writeSerializable(voucherType.voucherAmount);
        parcel.writeString(voucherType.voucherDesc);
        parcel.writeString(voucherType.productType);
        parcel.writeString(voucherType.voucherCcy);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.voucherType$$0, parcel, i, new C42027a());
    }

    public VoucherType getParcel() {
        return this.voucherType$$0;
    }
}
