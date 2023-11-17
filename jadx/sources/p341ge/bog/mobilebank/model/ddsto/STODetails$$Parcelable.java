package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.STODetails$$Parcelable */
public class STODetails$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<STODetails$$Parcelable> CREATOR = new Parcelable.Creator<STODetails$$Parcelable>() {
        public STODetails$$Parcelable createFromParcel(Parcel parcel) {
            return new STODetails$$Parcelable(STODetails$$Parcelable.read(parcel, new C42027a()));
        }

        public STODetails$$Parcelable[] newArray(int i) {
            return new STODetails$$Parcelable[i];
        }
    };
    private STODetails sTODetails$$0;

    public STODetails$$Parcelable(STODetails sTODetails) {
        this.sTODetails$$0 = sTODetails;
    }

    public static STODetails read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            STODetails sTODetails = new STODetails();
            aVar.mo97501f(g, sTODetails);
            sTODetails.dictionaryKey = parcel.readString();
            sTODetails.dstAcctKey = parcel.readLong();
            sTODetails.benefName = parcel.readString();
            sTODetails.endDate = parcel.readLong();
            sTODetails.description = parcel.readString();
            sTODetails.acctDesc = parcel.readString();
            sTODetails.benefAcctNo = parcel.readString();
            sTODetails.intBankName = parcel.readString();
            sTODetails.srcAcctKey = parcel.readLong();
            sTODetails.benefBankCode = parcel.readString();
            sTODetails.cdsAgreeKey = parcel.readLong();
            sTODetails.acctNo = parcel.readString();
            sTODetails.clientKey = parcel.readLong();
            sTODetails.additionalInfo = parcel.readString();
            sTODetails.payerName = parcel.readString();
            sTODetails.currency = parcel.readString();
            sTODetails.senderInn = parcel.readString();
            sTODetails.amount = parcel.readString();
            sTODetails.subProductCode = parcel.readString();
            sTODetails.sentModule = parcel.readString();
            sTODetails.paymentdetail = parcel.readString();
            sTODetails.documentName = parcel.readString();
            sTODetails.charges = parcel.readString();
            sTODetails.periodType = parcel.readString();
            sTODetails.nextSentDate = parcel.readLong();
            sTODetails.agreeNo = parcel.readString();
            sTODetails.intBankCode = parcel.readString();
            sTODetails.benefAcctDesc = parcel.readString();
            sTODetails.documentId = parcel.readLong();
            sTODetails.benefBankName = parcel.readString();
            sTODetails.startDate = parcel.readLong();
            sTODetails.status = parcel.readString();
            aVar.mo97501f(readInt, sTODetails);
            return sTODetails;
        } else if (!aVar.mo97499d(readInt)) {
            return (STODetails) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(STODetails sTODetails, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(sTODetails);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(sTODetails));
        parcel.writeString(sTODetails.dictionaryKey);
        parcel.writeLong(sTODetails.dstAcctKey);
        parcel.writeString(sTODetails.benefName);
        parcel.writeLong(sTODetails.endDate);
        parcel.writeString(sTODetails.description);
        parcel.writeString(sTODetails.acctDesc);
        parcel.writeString(sTODetails.benefAcctNo);
        parcel.writeString(sTODetails.intBankName);
        parcel.writeLong(sTODetails.srcAcctKey);
        parcel.writeString(sTODetails.benefBankCode);
        parcel.writeLong(sTODetails.cdsAgreeKey);
        parcel.writeString(sTODetails.acctNo);
        parcel.writeLong(sTODetails.clientKey);
        parcel.writeString(sTODetails.additionalInfo);
        parcel.writeString(sTODetails.payerName);
        parcel.writeString(sTODetails.currency);
        parcel.writeString(sTODetails.senderInn);
        parcel.writeString(sTODetails.amount);
        parcel.writeString(sTODetails.subProductCode);
        parcel.writeString(sTODetails.sentModule);
        parcel.writeString(sTODetails.paymentdetail);
        parcel.writeString(sTODetails.documentName);
        parcel.writeString(sTODetails.charges);
        parcel.writeString(sTODetails.periodType);
        parcel.writeLong(sTODetails.nextSentDate);
        parcel.writeString(sTODetails.agreeNo);
        parcel.writeString(sTODetails.intBankCode);
        parcel.writeString(sTODetails.benefAcctDesc);
        parcel.writeLong(sTODetails.documentId);
        parcel.writeString(sTODetails.benefBankName);
        parcel.writeLong(sTODetails.startDate);
        parcel.writeString(sTODetails.status);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.sTODetails$$0, parcel, i, new C42027a());
    }

    public STODetails getParcel() {
        return this.sTODetails$$0;
    }
}
