package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBank$$Parcelable;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode$$Parcelable;

/* renamed from: ge.bog.mobilebank.model.PMIHistoryItem$$Parcelable */
public class PMIHistoryItem$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PMIHistoryItem$$Parcelable> CREATOR = new Parcelable.Creator<PMIHistoryItem$$Parcelable>() {
        public PMIHistoryItem$$Parcelable createFromParcel(Parcel parcel) {
            return new PMIHistoryItem$$Parcelable(PMIHistoryItem$$Parcelable.read(parcel, new C42027a()));
        }

        public PMIHistoryItem$$Parcelable[] newArray(int i) {
            return new PMIHistoryItem$$Parcelable[i];
        }
    };
    private PMIHistoryItem pMIHistoryItem$$0;

    public PMIHistoryItem$$Parcelable(PMIHistoryItem pMIHistoryItem) {
        this.pMIHistoryItem$$0 = pMIHistoryItem;
    }

    public static PMIHistoryItem read(Parcel parcel, C42027a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PMIHistoryItem pMIHistoryItem = new PMIHistoryItem();
            aVar.mo97501f(g, pMIHistoryItem);
            boolean z4 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            pMIHistoryItem.reportingCodeNeeded = z;
            pMIHistoryItem.benefBank = ForeignBank$$Parcelable.read(parcel, aVar);
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            pMIHistoryItem.intBankNeeded = z2;
            pMIHistoryItem.benefCountry = (BogCountry) parcel.readParcelable(PMIHistoryItem$$Parcelable.class.getClassLoader());
            pMIHistoryItem.reportingCode = ReportingCode$$Parcelable.read(parcel, aVar);
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            pMIHistoryItem.benefCountryNeeded = z3;
            pMIHistoryItem.intBank = ForeignBank$$Parcelable.read(parcel, aVar);
            if (parcel.readInt() == 1) {
                z4 = true;
            }
            pMIHistoryItem.benefBankNeeded = z4;
            aVar.mo97501f(readInt, pMIHistoryItem);
            return pMIHistoryItem;
        } else if (!aVar.mo97499d(readInt)) {
            return (PMIHistoryItem) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PMIHistoryItem pMIHistoryItem, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(pMIHistoryItem);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(pMIHistoryItem));
        parcel.writeInt(pMIHistoryItem.reportingCodeNeeded ? 1 : 0);
        ForeignBank$$Parcelable.write(pMIHistoryItem.benefBank, parcel, i, aVar);
        parcel.writeInt(pMIHistoryItem.intBankNeeded ? 1 : 0);
        parcel.writeParcelable(pMIHistoryItem.benefCountry, i);
        ReportingCode$$Parcelable.write(pMIHistoryItem.reportingCode, parcel, i, aVar);
        parcel.writeInt(pMIHistoryItem.benefCountryNeeded ? 1 : 0);
        ForeignBank$$Parcelable.write(pMIHistoryItem.intBank, parcel, i, aVar);
        parcel.writeInt(pMIHistoryItem.benefBankNeeded ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.pMIHistoryItem$$0, parcel, i, new C42027a());
    }

    public PMIHistoryItem getParcel() {
        return this.pMIHistoryItem$$0;
    }
}
