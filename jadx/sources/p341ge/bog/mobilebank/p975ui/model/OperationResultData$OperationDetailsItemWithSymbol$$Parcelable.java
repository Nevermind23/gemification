package p341ge.bog.mobilebank.p975ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.p975ui.model.OperationResultData;

/* renamed from: ge.bog.mobilebank.ui.model.OperationResultData$OperationDetailsItemWithSymbol$$Parcelable */
public class OperationResultData$OperationDetailsItemWithSymbol$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<OperationResultData$OperationDetailsItemWithSymbol$$Parcelable> CREATOR = new C35691a();
    private OperationResultData.OperationDetailsItemWithSymbol operationDetailsItemWithSymbol$$0;

    /* renamed from: ge.bog.mobilebank.ui.model.OperationResultData$OperationDetailsItemWithSymbol$$Parcelable$a */
    class C35691a implements Parcelable.Creator {
        C35691a() {
        }

        /* renamed from: a */
        public OperationResultData$OperationDetailsItemWithSymbol$$Parcelable createFromParcel(Parcel parcel) {
            return new OperationResultData$OperationDetailsItemWithSymbol$$Parcelable(OperationResultData$OperationDetailsItemWithSymbol$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public OperationResultData$OperationDetailsItemWithSymbol$$Parcelable[] newArray(int i) {
            return new OperationResultData$OperationDetailsItemWithSymbol$$Parcelable[i];
        }
    }

    public OperationResultData$OperationDetailsItemWithSymbol$$Parcelable(OperationResultData.OperationDetailsItemWithSymbol operationDetailsItemWithSymbol) {
        this.operationDetailsItemWithSymbol$$0 = operationDetailsItemWithSymbol;
    }

    public static OperationResultData.OperationDetailsItemWithSymbol read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            OperationResultData.OperationDetailsItemWithSymbol operationDetailsItemWithSymbol = new OperationResultData.OperationDetailsItemWithSymbol();
            aVar.mo97501f(g, operationDetailsItemWithSymbol);
            operationDetailsItemWithSymbol.title = parcel.readString();
            operationDetailsItemWithSymbol.value = parcel.readString();
            aVar.mo97501f(readInt, operationDetailsItemWithSymbol);
            return operationDetailsItemWithSymbol;
        } else if (!aVar.mo97499d(readInt)) {
            return (OperationResultData.OperationDetailsItemWithSymbol) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(OperationResultData.OperationDetailsItemWithSymbol operationDetailsItemWithSymbol, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(operationDetailsItemWithSymbol);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(operationDetailsItemWithSymbol));
        parcel.writeString(operationDetailsItemWithSymbol.title);
        parcel.writeString(operationDetailsItemWithSymbol.value);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.operationDetailsItemWithSymbol$$0, parcel, i, new C42027a());
    }

    public OperationResultData.OperationDetailsItemWithSymbol getParcel() {
        return this.operationDetailsItemWithSymbol$$0;
    }
}
