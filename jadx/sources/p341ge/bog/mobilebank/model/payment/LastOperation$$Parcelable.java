package p341ge.bog.mobilebank.model.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.KeyValue$$Parcelable;

/* renamed from: ge.bog.mobilebank.model.payment.LastOperation$$Parcelable */
public class LastOperation$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<LastOperation$$Parcelable> CREATOR = new Parcelable.Creator<LastOperation$$Parcelable>() {
        public LastOperation$$Parcelable createFromParcel(Parcel parcel) {
            return new LastOperation$$Parcelable(LastOperation$$Parcelable.read(parcel, new C42027a()));
        }

        public LastOperation$$Parcelable[] newArray(int i) {
            return new LastOperation$$Parcelable[i];
        }
    };
    private LastOperation lastOperation$$0;

    public LastOperation$$Parcelable(LastOperation lastOperation) {
        this.lastOperation$$0 = lastOperation;
    }

    public static LastOperation read(Parcel parcel, C42027a aVar) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            LastOperation lastOperation = new LastOperation();
            aVar.mo97501f(g, lastOperation);
            ArrayList<KeyValue> arrayList = null;
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            lastOperation.operationDate = l;
            lastOperation.essPaymentId = parcel.readString();
            lastOperation.pfmSplit = parcel.readString();
            if (parcel.readInt() < 0) {
                l2 = null;
            } else {
                l2 = Long.valueOf(parcel.readLong());
            }
            lastOperation.pfmCatId = l2;
            lastOperation.pfmProviderStatusId = parcel.readString();
            if (parcel.readInt() < 0) {
                l3 = null;
            } else {
                l3 = Long.valueOf(parcel.readLong());
            }
            lastOperation.pfmId = l3;
            if (parcel.readInt() < 0) {
                l4 = null;
            } else {
                l4 = Long.valueOf(parcel.readLong());
            }
            lastOperation.pfmParentCatId = l4;
            if (parcel.readInt() < 0) {
                l5 = null;
            } else {
                l5 = Long.valueOf(parcel.readLong());
            }
            lastOperation.pfmParentOpId = l5;
            lastOperation.pfmTagName = parcel.readString();
            lastOperation.pfmRecurring = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            lastOperation.pfmComputable = z;
            lastOperation.pfmForecast = parcel.readString();
            if (parcel.readInt() < 0) {
                l6 = null;
            } else {
                l6 = Long.valueOf(parcel.readLong());
            }
            lastOperation.pfmTagId = l6;
            Class<LastOperation$$Parcelable> cls = LastOperation$$Parcelable.class;
            lastOperation.transactionCategory = (TransactionCategoryModel) parcel.readParcelable(cls.getClassLoader());
            lastOperation.logo = parcel.readString();
            if (parcel.readInt() < 0) {
                l7 = null;
            } else {
                l7 = Long.valueOf(parcel.readLong());
            }
            lastOperation.postDate = l7;
            lastOperation.parentCategory = (TransactionCategoryModel) parcel.readParcelable(cls.getClassLoader());
            lastOperation.serviceId = parcel.readString();
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                arrayList = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add(KeyValue$$Parcelable.read(parcel, aVar));
                }
            }
            lastOperation.parameters = arrayList;
            lastOperation.pfmCatName = parcel.readString();
            lastOperation.pfmParentCatName = parcel.readString();
            aVar.mo97501f(readInt, lastOperation);
            return lastOperation;
        } else if (!aVar.mo97499d(readInt)) {
            return (LastOperation) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(LastOperation lastOperation, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(lastOperation);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(lastOperation));
        if (lastOperation.operationDate == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(lastOperation.operationDate.longValue());
        }
        parcel.writeString(lastOperation.essPaymentId);
        parcel.writeString(lastOperation.pfmSplit);
        if (lastOperation.pfmCatId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(lastOperation.pfmCatId.longValue());
        }
        parcel.writeString(lastOperation.pfmProviderStatusId);
        if (lastOperation.pfmId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(lastOperation.pfmId.longValue());
        }
        if (lastOperation.pfmParentCatId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(lastOperation.pfmParentCatId.longValue());
        }
        if (lastOperation.pfmParentOpId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(lastOperation.pfmParentOpId.longValue());
        }
        parcel.writeString(lastOperation.pfmTagName);
        parcel.writeString(lastOperation.pfmRecurring);
        parcel.writeInt(lastOperation.pfmComputable ? 1 : 0);
        parcel.writeString(lastOperation.pfmForecast);
        if (lastOperation.pfmTagId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(lastOperation.pfmTagId.longValue());
        }
        parcel.writeParcelable(lastOperation.transactionCategory, i);
        parcel.writeString(lastOperation.logo);
        if (lastOperation.postDate == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(lastOperation.postDate.longValue());
        }
        parcel.writeParcelable(lastOperation.parentCategory, i);
        parcel.writeString(lastOperation.serviceId);
        ArrayList<KeyValue> arrayList = lastOperation.parameters;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<KeyValue> it = lastOperation.parameters.iterator();
            while (it.hasNext()) {
                KeyValue$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        parcel.writeString(lastOperation.pfmCatName);
        parcel.writeString(lastOperation.pfmParentCatName);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.lastOperation$$0, parcel, i, new C42027a());
    }

    public LastOperation getParcel() {
        return this.lastOperation$$0;
    }
}
