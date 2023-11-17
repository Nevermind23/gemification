package p341ge.bog.mobilebank.model.qrpay;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.qrpay.QrPaymentResult$$Parcelable */
public class QrPaymentResult$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<QrPaymentResult$$Parcelable> CREATOR = new Parcelable.Creator<QrPaymentResult$$Parcelable>() {
        public QrPaymentResult$$Parcelable createFromParcel(Parcel parcel) {
            return new QrPaymentResult$$Parcelable(QrPaymentResult$$Parcelable.read(parcel, new C42027a()));
        }

        public QrPaymentResult$$Parcelable[] newArray(int i) {
            return new QrPaymentResult$$Parcelable[i];
        }
    };
    private QrPaymentResult qrPaymentResult$$0;

    public QrPaymentResult$$Parcelable(QrPaymentResult qrPaymentResult) {
        this.qrPaymentResult$$0 = qrPaymentResult;
    }

    public static QrPaymentResult read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            QrPaymentResult qrPaymentResult = new QrPaymentResult();
            aVar.mo97501f(g, qrPaymentResult);
            qrPaymentResult.printFormType = parcel.readString();
            qrPaymentResult.docKey = parcel.readString();
            aVar.mo97501f(readInt, qrPaymentResult);
            return qrPaymentResult;
        } else if (!aVar.mo97499d(readInt)) {
            return (QrPaymentResult) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(QrPaymentResult qrPaymentResult, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(qrPaymentResult);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(qrPaymentResult));
        parcel.writeString(qrPaymentResult.printFormType);
        parcel.writeString(qrPaymentResult.docKey);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.qrPaymentResult$$0, parcel, i, new C42027a());
    }

    public QrPaymentResult getParcel() {
        return this.qrPaymentResult$$0;
    }
}
