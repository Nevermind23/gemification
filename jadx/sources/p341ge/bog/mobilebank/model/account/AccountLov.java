package p341ge.bog.mobilebank.model.account;

import android.os.Parcelable;
import android.text.TextUtils;
import g91.C32303f;
import g91.C32307h;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.account.AccountLov */
public class AccountLov implements Parcelable {
    public static final Parcelable.Creator<AccountLov> CREATOR = new Parcelable.Creator<AccountLov>() {
        public AccountLov createFromParcel(android.os.Parcel parcel) {
            return new AccountLov(parcel);
        }

        public AccountLov[] newArray(int i) {
            return new AccountLov[i];
        }
    };
    String acctNo;
    String attachmentId;
    String attachmentUrl;
    BigDecimal availableAmount;
    String ccy;
    boolean hasDeposit;

    /* renamed from: id */
    long f81298id;
    boolean isCreditCard;
    String isDefault;
    boolean isForCreditSTO;
    long mainAcctKey;
    String name;
    String productCode;
    String productGroup;
    BigDecimal realAmount;
    ArrayList<AccountLov> subAccounts;

    public AccountLov() {
    }

    public int describeContents() {
        return 0;
    }

    public String getAccountTitle() {
        if (!TextUtils.isEmpty(this.name)) {
            return this.name;
        }
        if (!TextUtils.isEmpty(this.acctNo)) {
            return this.acctNo;
        }
        return "";
    }

    public String getAcctNo() {
        return this.acctNo;
    }

    public String getAttachmentId() {
        return this.attachmentId;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getId() {
        return this.f81298id;
    }

    public String getIsDefault() {
        return this.isDefault;
    }

    public long getMainAcctKey() {
        return this.mainAcctKey;
    }

    public String getName() {
        return this.name;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProductGroup() {
        return this.productGroup;
    }

    public BigDecimal getRealAmount() {
        BigDecimal bigDecimal = this.realAmount;
        if (bigDecimal == null) {
            return this.availableAmount;
        }
        return bigDecimal;
    }

    public String getRealAmountFormatted() {
        if (this.realAmount == null) {
            return "";
        }
        return C32303f.m95204o(this.realAmount.doubleValue()) + C32303f.m95198i(getCcy(), true);
    }

    public ArrayList<AccountLov> getSubAccounts() {
        return this.subAccounts;
    }

    public boolean hasDeposit() {
        return this.hasDeposit;
    }

    public boolean isCreditCard() {
        return C32307h.m95235l(this.productCode);
    }

    public boolean isDefault() {
        return "Y".equals(this.isDefault);
    }

    public boolean isForCreditSTO() {
        return this.isForCreditSTO;
    }

    public void setAcctNo(String str) {
        this.acctNo = str;
    }

    public void setAttachmentId(String str) {
        this.attachmentId = str;
    }

    public void setAttachmentUrl(String str) {
        this.attachmentUrl = str;
    }

    public void setAvailableAmount(BigDecimal bigDecimal) {
        this.availableAmount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setCreditCard(boolean z) {
        this.isCreditCard = z;
    }

    public void setForCreditSTO(boolean z) {
        this.isForCreditSTO = z;
    }

    public void setHasDeposit(boolean z) {
        this.hasDeposit = z;
    }

    public void setId(long j) {
        this.f81298id = j;
    }

    public void setIsDefault(String str) {
        this.isDefault = str;
    }

    public void setMainAcctKey(long j) {
        this.mainAcctKey = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setProductGroup(String str) {
        this.productGroup = str;
    }

    public void setRealAmount(BigDecimal bigDecimal) {
        this.realAmount = bigDecimal;
    }

    public void setSubAccounts(ArrayList<AccountLov> arrayList) {
        this.subAccounts = arrayList;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.isCreditCard ? (byte) 1 : 0);
        parcel.writeByte(this.isForCreditSTO ? (byte) 1 : 0);
        parcel.writeLong(this.f81298id);
        parcel.writeString(this.acctNo);
        parcel.writeString(this.name);
        parcel.writeString(this.ccy);
        parcel.writeSerializable(this.availableAmount);
        parcel.writeLong(this.mainAcctKey);
        parcel.writeSerializable(this.realAmount);
        parcel.writeString(this.isDefault);
        parcel.writeString(this.attachmentId);
        parcel.writeByte(this.hasDeposit ? (byte) 1 : 0);
        parcel.writeString(this.attachmentUrl);
        parcel.writeList(this.subAccounts);
        parcel.writeString(this.productCode);
    }

    protected AccountLov(android.os.Parcel parcel) {
        boolean z = true;
        this.isCreditCard = parcel.readByte() != 0;
        this.isForCreditSTO = parcel.readByte() != 0;
        this.f81298id = parcel.readLong();
        this.acctNo = parcel.readString();
        this.name = parcel.readString();
        this.ccy = parcel.readString();
        this.availableAmount = (BigDecimal) parcel.readSerializable();
        this.mainAcctKey = parcel.readLong();
        this.realAmount = (BigDecimal) parcel.readSerializable();
        this.isDefault = parcel.readString();
        this.attachmentId = parcel.readString();
        this.hasDeposit = parcel.readByte() == 0 ? false : z;
        this.attachmentUrl = parcel.readString();
        ArrayList<AccountLov> arrayList = new ArrayList<>();
        this.subAccounts = arrayList;
        parcel.readList(arrayList, AccountLov.class.getClassLoader());
        this.productCode = parcel.readString();
    }

    public AccountLov(AccountLov accountLov) {
        this.isCreditCard = accountLov.isCreditCard;
        this.isForCreditSTO = accountLov.isForCreditSTO;
        this.f81298id = accountLov.f81298id;
        this.acctNo = accountLov.acctNo;
        this.name = accountLov.name;
        this.ccy = accountLov.ccy;
        this.availableAmount = accountLov.availableAmount.add(BigDecimal.ZERO);
        this.mainAcctKey = accountLov.mainAcctKey;
        this.realAmount = accountLov.realAmount;
        this.isDefault = accountLov.isDefault;
        this.attachmentId = accountLov.attachmentId;
        this.hasDeposit = accountLov.hasDeposit;
        this.attachmentUrl = accountLov.attachmentUrl;
        if (accountLov.subAccounts != null) {
            this.subAccounts = new ArrayList<>();
            Iterator<AccountLov> it = accountLov.getSubAccounts().iterator();
            while (it.hasNext()) {
                this.subAccounts.add(new AccountLov(it.next()));
            }
        } else {
            this.subAccounts = null;
        }
        this.productCode = accountLov.productCode;
    }
}
