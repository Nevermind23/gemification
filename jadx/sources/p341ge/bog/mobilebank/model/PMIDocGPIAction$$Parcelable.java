package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.UrlHandler;
import java.io.Serializable;
import java.math.BigDecimal;
import org.parceler.C42027a;
import org.parceler.C42028b;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.PMIDocGPIAction$$Parcelable */
public class PMIDocGPIAction$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PMIDocGPIAction$$Parcelable> CREATOR = new Parcelable.Creator<PMIDocGPIAction$$Parcelable>() {
        public PMIDocGPIAction$$Parcelable createFromParcel(Parcel parcel) {
            return new PMIDocGPIAction$$Parcelable(PMIDocGPIAction$$Parcelable.read(parcel, new C42027a()));
        }

        public PMIDocGPIAction$$Parcelable[] newArray(int i) {
            return new PMIDocGPIAction$$Parcelable[i];
        }
    };
    private PMIDocGPIAction pMIDocGPIAction$$0;

    public PMIDocGPIAction$$Parcelable(PMIDocGPIAction pMIDocGPIAction) {
        this.pMIDocGPIAction$$0 = pMIDocGPIAction;
    }

    public static PMIDocGPIAction read(Parcel parcel, C42027a aVar) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PMIDocGPIAction pMIDocGPIAction = new PMIDocGPIAction();
            aVar.mo97501f(g, pMIDocGPIAction);
            Class<PMIDocGPIAction> cls = PMIDocGPIAction.class;
            C42028b.m122113b(cls, pMIDocGPIAction, "dateTime", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "amount", (BigDecimal) parcel.readSerializable());
            C42028b.m122113b(cls, pMIDocGPIAction, "statusDesc", parcel.readString());
            Long l5 = null;
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            C42028b.m122113b(cls, pMIDocGPIAction, "docKey", l);
            C42028b.m122113b(cls, pMIDocGPIAction, "description", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "statusOriginarorCity", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "statusOriginatorCounty", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "timeZn", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "relatedReference", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "statusOriginatorBic", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "referenceNumber", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "statusOriginatorName", parcel.readString());
            C42028b.m122113b(cls, pMIDocGPIAction, "ccy", parcel.readString());
            if (parcel.readInt() < 0) {
                l2 = null;
            } else {
                l2 = Long.valueOf(parcel.readLong());
            }
            C42028b.m122113b(cls, pMIDocGPIAction, "originalDate", l2);
            C42028b.m122113b(cls, pMIDocGPIAction, UrlHandler.ACTION, parcel.readString());
            if (parcel.readInt() < 0) {
                l3 = null;
            } else {
                l3 = Long.valueOf(parcel.readLong());
            }
            C42028b.m122113b(cls, pMIDocGPIAction, "id", l3);
            C42028b.m122113b(cls, pMIDocGPIAction, "swtMt", parcel.readString());
            if (parcel.readInt() < 0) {
                l4 = null;
            } else {
                l4 = Long.valueOf(parcel.readLong());
            }
            C42028b.m122113b(cls, pMIDocGPIAction, "localDate", l4);
            if (parcel.readInt() >= 0) {
                l5 = Long.valueOf(parcel.readLong());
            }
            C42028b.m122113b(cls, pMIDocGPIAction, "rowNumber", l5);
            C42028b.m122113b(cls, pMIDocGPIAction, "statusCode", parcel.readString());
            aVar.mo97501f(readInt, pMIDocGPIAction);
            return pMIDocGPIAction;
        } else if (!aVar.mo97499d(readInt)) {
            return (PMIDocGPIAction) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PMIDocGPIAction pMIDocGPIAction, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(pMIDocGPIAction);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(pMIDocGPIAction));
        Class<String> cls = String.class;
        Class<PMIDocGPIAction> cls2 = PMIDocGPIAction.class;
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "dateTime"));
        parcel.writeSerializable((Serializable) C42028b.m122112a(BigDecimal.class, cls2, pMIDocGPIAction, "amount"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "statusDesc"));
        Class<Long> cls3 = Long.class;
        if (C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "docKey") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(((Long) C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "docKey")).longValue());
        }
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "description"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "statusOriginarorCity"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "statusOriginatorCounty"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "timeZn"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "relatedReference"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "statusOriginatorBic"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "referenceNumber"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "statusOriginatorName"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "ccy"));
        if (C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "originalDate") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(((Long) C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "originalDate")).longValue());
        }
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, UrlHandler.ACTION));
        if (C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "id") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(((Long) C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "id")).longValue());
        }
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "swtMt"));
        if (C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "localDate") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(((Long) C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "localDate")).longValue());
        }
        if (C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "rowNumber") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(((Long) C42028b.m122112a(cls3, cls2, pMIDocGPIAction, "rowNumber")).longValue());
        }
        parcel.writeString((String) C42028b.m122112a(cls, cls2, pMIDocGPIAction, "statusCode"));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.pMIDocGPIAction$$0, parcel, i, new C42027a());
    }

    public PMIDocGPIAction getParcel() {
        return this.pMIDocGPIAction$$0;
    }
}
