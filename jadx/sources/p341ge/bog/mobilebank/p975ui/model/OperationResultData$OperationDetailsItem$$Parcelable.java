package p341ge.bog.mobilebank.p975ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.p975ui.model.OperationResultData;

/* renamed from: ge.bog.mobilebank.ui.model.OperationResultData$OperationDetailsItem$$Parcelable */
public class OperationResultData$OperationDetailsItem$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<OperationResultData$OperationDetailsItem$$Parcelable> CREATOR = new C35690a();
    private OperationResultData.OperationDetailsItem operationDetailsItem$$0;

    /* renamed from: ge.bog.mobilebank.ui.model.OperationResultData$OperationDetailsItem$$Parcelable$a */
    class C35690a implements Parcelable.Creator {
        C35690a() {
        }

        /* renamed from: a */
        public OperationResultData$OperationDetailsItem$$Parcelable createFromParcel(Parcel parcel) {
            return new OperationResultData$OperationDetailsItem$$Parcelable(OperationResultData$OperationDetailsItem$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public OperationResultData$OperationDetailsItem$$Parcelable[] newArray(int i) {
            return new OperationResultData$OperationDetailsItem$$Parcelable[i];
        }
    }

    public OperationResultData$OperationDetailsItem$$Parcelable(OperationResultData.OperationDetailsItem operationDetailsItem) {
        this.operationDetailsItem$$0 = operationDetailsItem;
    }

    public static OperationResultData.OperationDetailsItem read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            OperationResultData.OperationDetailsItem operationDetailsItem = new OperationResultData.OperationDetailsItem();
            aVar.mo97501f(g, operationDetailsItem);
            operationDetailsItem.title = parcel.readString();
            operationDetailsItem.value = parcel.readString();
            aVar.mo97501f(readInt, operationDetailsItem);
            return operationDetailsItem;
        } else if (!aVar.mo97499d(readInt)) {
            return (OperationResultData.OperationDetailsItem) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(OperationResultData.OperationDetailsItem operationDetailsItem, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(operationDetailsItem);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(operationDetailsItem));
        parcel.writeString(operationDetailsItem.title);
        parcel.writeString(operationDetailsItem.value);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.operationDetailsItem$$0, parcel, i, new C42027a());
    }

    public OperationResultData.OperationDetailsItem getParcel() {
        return this.operationDetailsItem$$0;
    }
}
