package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;

/* renamed from: ge.bog.mobilebank.model.TransferHistoryItem$$Parcelable */
public class TransferHistoryItem$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<TransferHistoryItem$$Parcelable> CREATOR = new Parcelable.Creator<TransferHistoryItem$$Parcelable>() {
        public TransferHistoryItem$$Parcelable createFromParcel(Parcel parcel) {
            return new TransferHistoryItem$$Parcelable(TransferHistoryItem$$Parcelable.read(parcel, new C42027a()));
        }

        public TransferHistoryItem$$Parcelable[] newArray(int i) {
            return new TransferHistoryItem$$Parcelable[i];
        }
    };
    private TransferHistoryItem transferHistoryItem$$0;

    public TransferHistoryItem$$Parcelable(TransferHistoryItem transferHistoryItem) {
        this.transferHistoryItem$$0 = transferHistoryItem;
    }

    public static TransferHistoryItem read(Parcel parcel, C42027a aVar) {
        ArrayList arrayList;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            TransferHistoryItem transferHistoryItem = new TransferHistoryItem();
            aVar.mo97501f(g, transferHistoryItem);
            int readInt2 = parcel.readInt();
            boolean z = false;
            Long l6 = null;
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add(PMIDocGPIAction$$Parcelable.read(parcel, aVar));
                }
            }
            transferHistoryItem.pmiDocGPIActions = arrayList;
            transferHistoryItem.benefName = parcel.readString();
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            transferHistoryItem.pfmCatId = l;
            transferHistoryItem.benefProfilePicture = parcel.readString();
            if (parcel.readInt() < 0) {
                l2 = null;
            } else {
                l2 = Long.valueOf(parcel.readLong());
            }
            transferHistoryItem.pfmParentOpId = l2;
            transferHistoryItem.benefBic = parcel.readString();
            transferHistoryItem.entryId = parcel.readLong();
            transferHistoryItem.clientKey = parcel.readLong();
            transferHistoryItem.ccy = parcel.readString();
            transferHistoryItem.additionalInfo = parcel.readString();
            Class<TransferHistoryItem$$Parcelable> cls = TransferHistoryItem$$Parcelable.class;
            transferHistoryItem.transactionCategory = (TransactionCategoryModel) parcel.readParcelable(cls.getClassLoader());
            transferHistoryItem.dstAcctNo = parcel.readString();
            transferHistoryItem.regReportingCode = parcel.readString();
            transferHistoryItem.benefInn = parcel.readString();
            transferHistoryItem.srcAcctNo = parcel.readString();
            transferHistoryItem.dstAcctName = parcel.readString();
            transferHistoryItem.prodGroup = parcel.readString();
            transferHistoryItem.pfmSplit = parcel.readString();
            transferHistoryItem.intermediarName = parcel.readString();
            transferHistoryItem.pfmTagName = parcel.readString();
            transferHistoryItem.payerInn = parcel.readString();
            transferHistoryItem.prodType = parcel.readString();
            transferHistoryItem.docNo = parcel.readString();
            transferHistoryItem.srcAcctTypeKey = parcel.readString();
            transferHistoryItem.inpSysDate = parcel.readLong();
            transferHistoryItem.parentCategory = (TransactionCategoryModel) parcel.readParcelable(cls.getClassLoader());
            transferHistoryItem.benefAddress = parcel.readString();
            transferHistoryItem.dispatchType = parcel.readString();
            transferHistoryItem.dstAcctKey = parcel.readLong();
            transferHistoryItem.benefAcctNo = parcel.readString();
            transferHistoryItem.srcAcctKey = parcel.readLong();
            if (parcel.readInt() < 0) {
                l3 = null;
            } else {
                l3 = Long.valueOf(parcel.readLong());
            }
            transferHistoryItem.pfmTagId = l3;
            transferHistoryItem.docStatus = parcel.readString();
            transferHistoryItem.rate = (BigDecimal) parcel.readSerializable();
            transferHistoryItem.srcAcctName = parcel.readString();
            transferHistoryItem.benefCountry = parcel.readString();
            transferHistoryItem.payerName = parcel.readString();
            transferHistoryItem.benefNameTmp = parcel.readString();
            transferHistoryItem.pfmCatName = parcel.readString();
            transferHistoryItem.amount = (BigDecimal) parcel.readSerializable();
            transferHistoryItem.docType = parcel.readString();
            transferHistoryItem.pfmProviderStatusId = parcel.readString();
            if (parcel.readInt() < 0) {
                l4 = null;
            } else {
                l4 = Long.valueOf(parcel.readLong());
            }
            transferHistoryItem.pfmId = l4;
            transferHistoryItem.docKey = parcel.readLong();
            if (parcel.readInt() < 0) {
                l5 = null;
            } else {
                l5 = Long.valueOf(parcel.readLong());
            }
            transferHistoryItem.pfmParentCatId = l5;
            transferHistoryItem.treasureCode = parcel.readString();
            if (parcel.readInt() >= 0) {
                l6 = Long.valueOf(parcel.readLong());
            }
            transferHistoryItem.valueDate = l6;
            transferHistoryItem.benefClientShort = parcel.readString();
            transferHistoryItem.pfmRecurring = parcel.readString();
            transferHistoryItem.nomination = parcel.readString();
            if (parcel.readInt() == 1) {
                z = true;
            }
            transferHistoryItem.pfmComputable = z;
            transferHistoryItem.pfmForecast = parcel.readString();
            transferHistoryItem.dstAcctTypeKey = parcel.readString();
            transferHistoryItem.benefCity = parcel.readString();
            transferHistoryItem.information = parcel.readString();
            transferHistoryItem.pfmParentCatName = parcel.readString();
            aVar.mo97501f(readInt, transferHistoryItem);
            return transferHistoryItem;
        } else if (!aVar.mo97499d(readInt)) {
            return (TransferHistoryItem) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(TransferHistoryItem transferHistoryItem, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(transferHistoryItem);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(transferHistoryItem));
        List<PMIDocGPIAction> list = transferHistoryItem.pmiDocGPIActions;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            for (PMIDocGPIAction write : transferHistoryItem.pmiDocGPIActions) {
                PMIDocGPIAction$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        parcel.writeString(transferHistoryItem.benefName);
        if (transferHistoryItem.pfmCatId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(transferHistoryItem.pfmCatId.longValue());
        }
        parcel.writeString(transferHistoryItem.benefProfilePicture);
        if (transferHistoryItem.pfmParentOpId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(transferHistoryItem.pfmParentOpId.longValue());
        }
        parcel.writeString(transferHistoryItem.benefBic);
        parcel.writeLong(transferHistoryItem.entryId);
        parcel.writeLong(transferHistoryItem.clientKey);
        parcel.writeString(transferHistoryItem.ccy);
        parcel.writeString(transferHistoryItem.additionalInfo);
        parcel.writeParcelable(transferHistoryItem.transactionCategory, i);
        parcel.writeString(transferHistoryItem.dstAcctNo);
        parcel.writeString(transferHistoryItem.regReportingCode);
        parcel.writeString(transferHistoryItem.benefInn);
        parcel.writeString(transferHistoryItem.srcAcctNo);
        parcel.writeString(transferHistoryItem.dstAcctName);
        parcel.writeString(transferHistoryItem.prodGroup);
        parcel.writeString(transferHistoryItem.pfmSplit);
        parcel.writeString(transferHistoryItem.intermediarName);
        parcel.writeString(transferHistoryItem.pfmTagName);
        parcel.writeString(transferHistoryItem.payerInn);
        parcel.writeString(transferHistoryItem.prodType);
        parcel.writeString(transferHistoryItem.docNo);
        parcel.writeString(transferHistoryItem.srcAcctTypeKey);
        parcel.writeLong(transferHistoryItem.inpSysDate);
        parcel.writeParcelable(transferHistoryItem.parentCategory, i);
        parcel.writeString(transferHistoryItem.benefAddress);
        parcel.writeString(transferHistoryItem.dispatchType);
        parcel.writeLong(transferHistoryItem.dstAcctKey);
        parcel.writeString(transferHistoryItem.benefAcctNo);
        parcel.writeLong(transferHistoryItem.srcAcctKey);
        if (transferHistoryItem.pfmTagId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(transferHistoryItem.pfmTagId.longValue());
        }
        parcel.writeString(transferHistoryItem.docStatus);
        parcel.writeSerializable(transferHistoryItem.rate);
        parcel.writeString(transferHistoryItem.srcAcctName);
        parcel.writeString(transferHistoryItem.benefCountry);
        parcel.writeString(transferHistoryItem.payerName);
        parcel.writeString(transferHistoryItem.benefNameTmp);
        parcel.writeString(transferHistoryItem.pfmCatName);
        parcel.writeSerializable(transferHistoryItem.amount);
        parcel.writeString(transferHistoryItem.docType);
        parcel.writeString(transferHistoryItem.pfmProviderStatusId);
        if (transferHistoryItem.pfmId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(transferHistoryItem.pfmId.longValue());
        }
        parcel.writeLong(transferHistoryItem.docKey);
        if (transferHistoryItem.pfmParentCatId == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(transferHistoryItem.pfmParentCatId.longValue());
        }
        parcel.writeString(transferHistoryItem.treasureCode);
        if (transferHistoryItem.valueDate == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(transferHistoryItem.valueDate.longValue());
        }
        parcel.writeString(transferHistoryItem.benefClientShort);
        parcel.writeString(transferHistoryItem.pfmRecurring);
        parcel.writeString(transferHistoryItem.nomination);
        parcel.writeInt(transferHistoryItem.pfmComputable ? 1 : 0);
        parcel.writeString(transferHistoryItem.pfmForecast);
        parcel.writeString(transferHistoryItem.dstAcctTypeKey);
        parcel.writeString(transferHistoryItem.benefCity);
        parcel.writeString(transferHistoryItem.information);
        parcel.writeString(transferHistoryItem.pfmParentCatName);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.transferHistoryItem$$0, parcel, i, new C42027a());
    }

    public TransferHistoryItem getParcel() {
        return this.transferHistoryItem$$0;
    }
}
