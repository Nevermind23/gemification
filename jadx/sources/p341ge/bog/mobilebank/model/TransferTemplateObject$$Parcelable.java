package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.model.template.TemplateBasketParameter;
import p341ge.bog.mobilebank.model.template.TemplateBasketParameter$$Parcelable;

/* renamed from: ge.bog.mobilebank.model.TransferTemplateObject$$Parcelable */
public class TransferTemplateObject$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<TransferTemplateObject$$Parcelable> CREATOR = new Parcelable.Creator<TransferTemplateObject$$Parcelable>() {
        public TransferTemplateObject$$Parcelable createFromParcel(Parcel parcel) {
            return new TransferTemplateObject$$Parcelable(TransferTemplateObject$$Parcelable.read(parcel, new C42027a()));
        }

        public TransferTemplateObject$$Parcelable[] newArray(int i) {
            return new TransferTemplateObject$$Parcelable[i];
        }
    };
    private TransferTemplateObject transferTemplateObject$$0;

    public TransferTemplateObject$$Parcelable(TransferTemplateObject transferTemplateObject) {
        this.transferTemplateObject$$0 = transferTemplateObject;
    }

    public static TransferTemplateObject read(Parcel parcel, C42027a aVar) {
        ArrayList<TemplateBasketParameter> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            TransferTemplateObject transferTemplateObject = new TransferTemplateObject();
            aVar.mo97501f(g, transferTemplateObject);
            transferTemplateObject.templateType = parcel.readString();
            transferTemplateObject.operationKey = parcel.readString();
            transferTemplateObject.amount = parcel.readString();
            transferTemplateObject.templateName = parcel.readString();
            int readInt2 = parcel.readInt();
            Long l = null;
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add(TemplateBasketParameter$$Parcelable.read(parcel, aVar));
                }
            }
            transferTemplateObject.templateParameters = arrayList;
            if (parcel.readInt() >= 0) {
                l = Long.valueOf(parcel.readLong());
            }
            transferTemplateObject.f81294id = l;
            aVar.mo97501f(readInt, transferTemplateObject);
            return transferTemplateObject;
        } else if (!aVar.mo97499d(readInt)) {
            return (TransferTemplateObject) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(TransferTemplateObject transferTemplateObject, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(transferTemplateObject);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(transferTemplateObject));
        parcel.writeString(transferTemplateObject.templateType);
        parcel.writeString(transferTemplateObject.operationKey);
        parcel.writeString(transferTemplateObject.amount);
        parcel.writeString(transferTemplateObject.templateName);
        ArrayList<TemplateBasketParameter> arrayList = transferTemplateObject.templateParameters;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<TemplateBasketParameter> it = transferTemplateObject.templateParameters.iterator();
            while (it.hasNext()) {
                TemplateBasketParameter$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        if (transferTemplateObject.f81294id == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(transferTemplateObject.f81294id.longValue());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.transferTemplateObject$$0, parcel, i, new C42027a());
    }

    public TransferTemplateObject getParcel() {
        return this.transferTemplateObject$$0;
    }
}
