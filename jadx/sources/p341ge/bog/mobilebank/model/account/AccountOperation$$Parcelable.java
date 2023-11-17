package p341ge.bog.mobilebank.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C24978b;
import java.math.BigDecimal;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.model.payment.DeviceType;

/* renamed from: ge.bog.mobilebank.model.account.AccountOperation$$Parcelable */
public class AccountOperation$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<AccountOperation$$Parcelable> CREATOR = new Parcelable.Creator<AccountOperation$$Parcelable>() {
        public AccountOperation$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountOperation$$Parcelable(AccountOperation$$Parcelable.read(parcel, new C42027a()));
        }

        public AccountOperation$$Parcelable[] newArray(int i) {
            return new AccountOperation$$Parcelable[i];
        }
    };
    private AccountOperation accountOperation$$0;

    public AccountOperation$$Parcelable(AccountOperation accountOperation) {
        this.accountOperation$$0 = accountOperation;
    }

    public static AccountOperation read(Parcel parcel, C42027a aVar) {
        C24978b bVar;
        Long l;
        boolean z;
        Long l2;
        Long l3;
        boolean z2;
        DeviceType deviceType;
        boolean z3;
        Long l4;
        boolean z4;
        boolean z5;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            AccountOperation accountOperation = new AccountOperation();
            aVar.mo97501f(g, accountOperation);
            accountOperation.setOperationDate(parcel.readLong());
            accountOperation.setEssServiceId(parcel.readString());
            accountOperation.setEssId(parcel.readString());
            accountOperation.setOperationTitle(parcel.readString());
            String readString = parcel.readString();
            Long l5 = null;
            if (readString == null) {
                bVar = null;
            } else {
                bVar = (C24978b) Enum.valueOf(C24978b.class, readString);
            }
            accountOperation.setBackTransferAllowed(bVar);
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            accountOperation.setPfmCatId(l);
            accountOperation.setPrintFormType(parcel.readString());
            accountOperation.setEntryGroupDKey(parcel.readString());
            accountOperation.setCashbackAmount((BigDecimal) parcel.readSerializable());
            accountOperation.setBenefProfilePicture(parcel.readString());
            boolean z6 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            accountOperation.setReversalAvailable(z);
            accountOperation.setBonusPointType(parcel.readString());
            if (parcel.readInt() < 0) {
                l2 = null;
            } else {
                l2 = Long.valueOf(parcel.readLong());
            }
            accountOperation.setPfmParentOpId(l2);
            accountOperation.setEntryId(parcel.readLong());
            accountOperation.setMerchantName(parcel.readString());
            if (parcel.readInt() < 0) {
                l3 = null;
            } else {
                l3 = Long.valueOf(parcel.readLong());
            }
            accountOperation.setPfmTagId(l3);
            accountOperation.setImageUrl(parcel.readString());
            accountOperation.setCcy(parcel.readString());
            Class<AccountOperation$$Parcelable> cls = AccountOperation$$Parcelable.class;
            accountOperation.setTransactionCategory((TransactionCategoryModel) parcel.readParcelable(cls.getClassLoader()));
            accountOperation.setIsPrintable(parcel.readString());
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            accountOperation.setRepeatAllowed(z2);
            accountOperation.setPfmCatName(parcel.readString());
            String readString2 = parcel.readString();
            if (readString2 == null) {
                deviceType = null;
            } else {
                deviceType = (DeviceType) Enum.valueOf(DeviceType.class, readString2);
            }
            accountOperation.setDeviceType(deviceType);
            accountOperation.setAmount((BigDecimal) parcel.readSerializable());
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            accountOperation.setCanSplit(z3);
            accountOperation.setPfmSplit(parcel.readString());
            accountOperation.setGroupImageUrl(parcel.readString());
            if (parcel.readInt() < 0) {
                l4 = null;
            } else {
                l4 = Long.valueOf(parcel.readLong());
            }
            accountOperation.setPfmId(l4);
            accountOperation.setDocKey(parcel.readLong());
            if (parcel.readInt() >= 0) {
                l5 = Long.valueOf(parcel.readLong());
            }
            accountOperation.setPfmParentCatId(l5);
            accountOperation.setPfmTagName(parcel.readString());
            accountOperation.setPfmRecurring(parcel.readString());
            accountOperation.setBonusPoint((BigDecimal) parcel.readSerializable());
            accountOperation.setNomination(parcel.readString());
            if (parcel.readInt() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            accountOperation.setPfmComputable(z4);
            accountOperation.setPfmForecast(parcel.readString());
            if (parcel.readInt() == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            accountOperation.setTemplateAllowed(z5);
            accountOperation.setPostDate(parcel.readLong());
            accountOperation.setParentCategory((TransactionCategoryModel) parcel.readParcelable(cls.getClassLoader()));
            if (parcel.readInt() == 1) {
                z6 = true;
            }
            accountOperation.setDDSTOAlllowed(z6);
            accountOperation.setMerchantNameInt(parcel.readString());
            accountOperation.setPfmParentCatName(parcel.readString());
            accountOperation.setStatus(parcel.readString());
            aVar.mo97501f(readInt, accountOperation);
            return accountOperation;
        } else if (!aVar.mo97499d(readInt)) {
            return (AccountOperation) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(AccountOperation accountOperation, Parcel parcel, int i, C42027a aVar) {
        String str;
        int c = aVar.mo97498c(accountOperation);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(accountOperation));
        parcel.writeLong(accountOperation.getOperationDate());
        parcel.writeString(accountOperation.getEssServiceId());
        parcel.writeString(accountOperation.getEssId());
        parcel.writeString(accountOperation.getOperationTitle());
        C24978b backTransferAllowed = accountOperation.getBackTransferAllowed();
        String str2 = null;
        if (backTransferAllowed == null) {
            str = null;
        } else {
            str = backTransferAllowed.name();
        }
        parcel.writeString(str);
        if (accountOperation.getPfmCatId() == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(accountOperation.getPfmCatId().longValue());
        }
        parcel.writeString(accountOperation.getPrintFormType());
        parcel.writeString(accountOperation.getEntryGroupDKey());
        parcel.writeSerializable(accountOperation.getCashbackAmount());
        parcel.writeString(accountOperation.getBenefProfilePicture());
        parcel.writeInt(accountOperation.isReversalAvailable() ? 1 : 0);
        parcel.writeString(accountOperation.getBonusPointType());
        if (accountOperation.getPfmParentOpId() == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(accountOperation.getPfmParentOpId().longValue());
        }
        parcel.writeLong(accountOperation.getEntryId());
        parcel.writeString(accountOperation.getMerchantName());
        if (accountOperation.getPfmTagId() == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(accountOperation.getPfmTagId().longValue());
        }
        parcel.writeString(accountOperation.getImageUrl());
        parcel.writeString(accountOperation.getCcy());
        parcel.writeParcelable(accountOperation.getTransactionCategory(), i);
        parcel.writeString(accountOperation.getIsPrintable());
        parcel.writeInt(accountOperation.isRepeatAllowed() ? 1 : 0);
        parcel.writeString(accountOperation.getPfmCatName());
        DeviceType deviceType = accountOperation.getDeviceType();
        if (deviceType != null) {
            str2 = deviceType.name();
        }
        parcel.writeString(str2);
        parcel.writeSerializable(accountOperation.getAmount());
        parcel.writeInt(accountOperation.isCanSplit() ? 1 : 0);
        parcel.writeString(accountOperation.getPfmSplit());
        parcel.writeString(accountOperation.getGroupImageUrl());
        if (accountOperation.getPfmId() == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(accountOperation.getPfmId().longValue());
        }
        parcel.writeLong(accountOperation.getDocKey());
        if (accountOperation.getPfmParentCatId() == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(accountOperation.getPfmParentCatId().longValue());
        }
        parcel.writeString(accountOperation.getPfmTagName());
        parcel.writeString(accountOperation.getPfmRecurring());
        parcel.writeSerializable(accountOperation.getBonusPoint());
        parcel.writeString(accountOperation.getNomination());
        parcel.writeInt(accountOperation.isPfmComputable() ? 1 : 0);
        parcel.writeString(accountOperation.getPfmForecast());
        parcel.writeInt(accountOperation.isTemplateAllowed() ? 1 : 0);
        parcel.writeLong(accountOperation.getPostDate());
        parcel.writeParcelable(accountOperation.getParentCategory(), i);
        parcel.writeInt(accountOperation.isDDSTOAlllowed() ? 1 : 0);
        parcel.writeString(accountOperation.getMerchantNameInt());
        parcel.writeString(accountOperation.getPfmParentCatName());
        parcel.writeString(accountOperation.getStatus());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountOperation$$0, parcel, i, new C42027a());
    }

    public AccountOperation getParcel() {
        return this.accountOperation$$0;
    }
}
