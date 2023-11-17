package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.DDProviderItem$$Parcelable */
public class DDProviderItem$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DDProviderItem$$Parcelable> CREATOR = new Parcelable.Creator<DDProviderItem$$Parcelable>() {
        public DDProviderItem$$Parcelable createFromParcel(Parcel parcel) {
            return new DDProviderItem$$Parcelable(DDProviderItem$$Parcelable.read(parcel, new C42027a()));
        }

        public DDProviderItem$$Parcelable[] newArray(int i) {
            return new DDProviderItem$$Parcelable[i];
        }
    };
    private DDProviderItem dDProviderItem$$0;

    public DDProviderItem$$Parcelable(DDProviderItem dDProviderItem) {
        this.dDProviderItem$$0 = dDProviderItem;
    }

    public static DDProviderItem read(Parcel parcel, C42027a aVar) {
        ArrayList<DDDebitService> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DDProviderItem dDProviderItem = new DDProviderItem();
            aVar.mo97501f(g, dDProviderItem);
            dDProviderItem.dictionaryKey = parcel.readString();
            dDProviderItem.providerOptionId = parcel.readString();
            dDProviderItem.providerCode = parcel.readString();
            dDProviderItem.providerServiceId = parcel.readString();
            dDProviderItem.valid = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            dDProviderItem.isCategory = z;
            dDProviderItem.idProvider = parcel.readLong();
            dDProviderItem.topUpAllowed = parcel.readString();
            dDProviderItem.minPayment = parcel.readString();
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList<DDDebitService> arrayList2 = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add(DDDebitService$$Parcelable.read(parcel, aVar));
                }
                arrayList = arrayList2;
            }
            dDProviderItem.debitService = arrayList;
            dDProviderItem.categoryId = parcel.readLong();
            dDProviderItem.fixVar = parcel.readString();
            dDProviderItem.channelCode = parcel.readString();
            aVar.mo97501f(readInt, dDProviderItem);
            return dDProviderItem;
        } else if (!aVar.mo97499d(readInt)) {
            return (DDProviderItem) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DDProviderItem dDProviderItem, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(dDProviderItem);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(dDProviderItem));
        parcel.writeString(dDProviderItem.dictionaryKey);
        parcel.writeString(dDProviderItem.providerOptionId);
        parcel.writeString(dDProviderItem.providerCode);
        parcel.writeString(dDProviderItem.providerServiceId);
        parcel.writeString(dDProviderItem.valid);
        parcel.writeInt(dDProviderItem.isCategory ? 1 : 0);
        parcel.writeLong(dDProviderItem.idProvider);
        parcel.writeString(dDProviderItem.topUpAllowed);
        parcel.writeString(dDProviderItem.minPayment);
        ArrayList<DDDebitService> arrayList = dDProviderItem.debitService;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<DDDebitService> it = dDProviderItem.debitService.iterator();
            while (it.hasNext()) {
                DDDebitService$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        parcel.writeLong(dDProviderItem.categoryId);
        parcel.writeString(dDProviderItem.fixVar);
        parcel.writeString(dDProviderItem.channelCode);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.dDProviderItem$$0, parcel, i, new C42027a());
    }

    public DDProviderItem getParcel() {
        return this.dDProviderItem$$0;
    }
}
