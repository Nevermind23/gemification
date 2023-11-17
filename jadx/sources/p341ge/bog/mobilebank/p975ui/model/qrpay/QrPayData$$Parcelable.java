package p341ge.bog.mobilebank.p975ui.model.qrpay;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.ui.model.qrpay.QrPayData$$Parcelable */
public class QrPayData$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<QrPayData$$Parcelable> CREATOR = new C35698a();
    private QrPayData qrPayData$$0;

    /* renamed from: ge.bog.mobilebank.ui.model.qrpay.QrPayData$$Parcelable$a */
    class C35698a implements Parcelable.Creator {
        C35698a() {
        }

        /* renamed from: a */
        public QrPayData$$Parcelable createFromParcel(Parcel parcel) {
            return new QrPayData$$Parcelable(QrPayData$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public QrPayData$$Parcelable[] newArray(int i) {
            return new QrPayData$$Parcelable[i];
        }
    }

    public QrPayData$$Parcelable(QrPayData qrPayData) {
        this.qrPayData$$0 = qrPayData;
    }

    public static QrPayData read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            QrPayData qrPayData = new QrPayData();
            aVar.mo97501f(g, qrPayData);
            qrPayData.amount = parcel.readString();
            qrPayData.qrStandard = parcel.readString();
            qrPayData.qrId = QrId$$Parcelable.read(parcel, aVar);
            qrPayData.merchantTerminalId = parcel.readString();
            qrPayData.merchantName = parcel.readString();
            aVar.mo97501f(readInt, qrPayData);
            return qrPayData;
        } else if (!aVar.mo97499d(readInt)) {
            return (QrPayData) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(QrPayData qrPayData, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(qrPayData);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(qrPayData));
        parcel.writeString(qrPayData.amount);
        parcel.writeString(qrPayData.qrStandard);
        QrId$$Parcelable.write(qrPayData.qrId, parcel, i, aVar);
        parcel.writeString(qrPayData.merchantTerminalId);
        parcel.writeString(qrPayData.merchantName);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.qrPayData$$0, parcel, i, new C42027a());
    }

    public QrPayData getParcel() {
        return this.qrPayData$$0;
    }
}
