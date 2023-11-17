package p341ge.bog.mobilebank.p975ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.p975ui.model.OperationResultData;

/* renamed from: ge.bog.mobilebank.ui.model.OperationResultData$$Parcelable */
public class OperationResultData$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<OperationResultData$$Parcelable> CREATOR = new C35689a();
    private OperationResultData operationResultData$$0;

    /* renamed from: ge.bog.mobilebank.ui.model.OperationResultData$$Parcelable$a */
    class C35689a implements Parcelable.Creator {
        C35689a() {
        }

        /* renamed from: a */
        public OperationResultData$$Parcelable createFromParcel(Parcel parcel) {
            return new OperationResultData$$Parcelable(OperationResultData$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public OperationResultData$$Parcelable[] newArray(int i) {
            return new OperationResultData$$Parcelable[i];
        }
    }

    public OperationResultData$$Parcelable(OperationResultData operationResultData) {
        this.operationResultData$$0 = operationResultData;
    }

    public static OperationResultData read(Parcel parcel, C42027a aVar) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            OperationResultData operationResultData = new OperationResultData();
            aVar.mo97501f(g, operationResultData);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            operationResultData.success = z;
            operationResultData.errorTitle = parcel.readString();
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add(OperationResultData$OperationDetailsItem$$Parcelable.read(parcel, aVar));
                }
                arrayList = arrayList2;
            }
            operationResultData.detailsList = arrayList;
            operationResultData.successTitle = parcel.readString();
            aVar.mo97501f(readInt, operationResultData);
            return operationResultData;
        } else if (!aVar.mo97499d(readInt)) {
            return (OperationResultData) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(OperationResultData operationResultData, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(operationResultData);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(operationResultData));
        parcel.writeInt(operationResultData.success ? 1 : 0);
        parcel.writeString(operationResultData.errorTitle);
        List<OperationResultData.OperationDetailsItem> list = operationResultData.detailsList;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            for (OperationResultData.OperationDetailsItem write : operationResultData.detailsList) {
                OperationResultData$OperationDetailsItem$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        parcel.writeString(operationResultData.successTitle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.operationResultData$$0, parcel, i, new C42027a());
    }

    public OperationResultData getParcel() {
        return this.operationResultData$$0;
    }
}
