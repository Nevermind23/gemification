package p341ge.bog.mobilebank.p975ui.model.qrinstallment;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42028b;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.ui.model.qrinstallment.QrInstallmentData$$Parcelable */
public class QrInstallmentData$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<QrInstallmentData$$Parcelable> CREATOR = new C35696a();
    private QrInstallmentData qrInstallmentData$$0;

    /* renamed from: ge.bog.mobilebank.ui.model.qrinstallment.QrInstallmentData$$Parcelable$a */
    class C35696a implements Parcelable.Creator {
        C35696a() {
        }

        /* renamed from: a */
        public QrInstallmentData$$Parcelable createFromParcel(Parcel parcel) {
            return new QrInstallmentData$$Parcelable(QrInstallmentData$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public QrInstallmentData$$Parcelable[] newArray(int i) {
            return new QrInstallmentData$$Parcelable[i];
        }
    }

    public QrInstallmentData$$Parcelable(QrInstallmentData qrInstallmentData) {
        this.qrInstallmentData$$0 = qrInstallmentData;
    }

    public static QrInstallmentData read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            QrInstallmentData qrInstallmentData = new QrInstallmentData();
            aVar.mo97501f(g, qrInstallmentData);
            Class<QrInstallmentData> cls = QrInstallmentData.class;
            C42028b.m122113b(cls, qrInstallmentData, "offerNo", parcel.readString());
            C42028b.m122113b(cls, qrInstallmentData, "installmentAmount", parcel.readString());
            C42028b.m122113b(cls, qrInstallmentData, "offerOperationType", parcel.readString());
            C42028b.m122113b(cls, qrInstallmentData, "merchantTerminalId", parcel.readString());
            C42028b.m122113b(cls, qrInstallmentData, "merchantName", parcel.readString());
            aVar.mo97501f(readInt, qrInstallmentData);
            return qrInstallmentData;
        } else if (!aVar.mo97499d(readInt)) {
            return (QrInstallmentData) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(QrInstallmentData qrInstallmentData, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(qrInstallmentData);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(qrInstallmentData));
        Class<String> cls = String.class;
        Class<QrInstallmentData> cls2 = QrInstallmentData.class;
        parcel.writeString((String) C42028b.m122112a(cls, cls2, qrInstallmentData, "offerNo"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, qrInstallmentData, "installmentAmount"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, qrInstallmentData, "offerOperationType"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, qrInstallmentData, "merchantTerminalId"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, qrInstallmentData, "merchantName"));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.qrInstallmentData$$0, parcel, i, new C42027a());
    }

    public QrInstallmentData getParcel() {
        return this.qrInstallmentData$$0;
    }
}
