package p341ge.bog.mobilebank.p975ui.model.qrpay;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.ui.model.qrpay.QrId$$Parcelable */
public class QrId$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<QrId$$Parcelable> CREATOR = new C35697a();
    private QrId qrId$$0;

    /* renamed from: ge.bog.mobilebank.ui.model.qrpay.QrId$$Parcelable$a */
    class C35697a implements Parcelable.Creator {
        C35697a() {
        }

        /* renamed from: a */
        public QrId$$Parcelable createFromParcel(Parcel parcel) {
            return new QrId$$Parcelable(QrId$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public QrId$$Parcelable[] newArray(int i) {
            return new QrId$$Parcelable[i];
        }
    }

    public QrId$$Parcelable(QrId qrId) {
        this.qrId$$0 = qrId;
    }

    public static QrId read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            QrId qrId = new QrId();
            aVar.mo97501f(g, qrId);
            qrId.f86304id = parcel.readString();
            qrId.type = parcel.readString();
            qrId.version = parcel.readString();
            qrId.issuer = parcel.readString();
            aVar.mo97501f(readInt, qrId);
            return qrId;
        } else if (!aVar.mo97499d(readInt)) {
            return (QrId) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(QrId qrId, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(qrId);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(qrId));
        parcel.writeString(qrId.f86304id);
        parcel.writeString(qrId.type);
        parcel.writeString(qrId.version);
        parcel.writeString(qrId.issuer);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.qrId$$0, parcel, i, new C42027a());
    }

    public QrId getParcel() {
        return this.qrId$$0;
    }
}
