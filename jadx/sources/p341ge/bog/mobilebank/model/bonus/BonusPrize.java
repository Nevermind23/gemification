package p341ge.bog.mobilebank.model.bonus;

import org.parceler.Parcel;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.bonus.BonusPrize */
public class BonusPrize {
    String attachmentFileBase64;
    BonusType bonusType;
    int categoryId;
    long finalDate;
    String industryAddress;
    String industryInformation;
    String industryName;
    String industryPhoneNumber;
    String industryWebsite;
    long orderDate;
    String prizeCode;
    long prizeCost;
    String prizeDesc;
    String prizeName;
    long prizeNo;
    long prizeNumber;
    @C8664c("prizeOrderNumber")
    String prizeOrderNumber;
    BonusPrizeStatus status;
    int totalCount;

    public String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public BonusType getBonusType() {
        return this.bonusType;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public long getFinalDate() {
        return this.finalDate;
    }

    public String getIndustryAddress() {
        return this.industryAddress;
    }

    public String getIndustryInformation() {
        return this.industryInformation;
    }

    public String getIndustryName() {
        return this.industryName;
    }

    public String getIndustryPhoneNumber() {
        return this.industryPhoneNumber;
    }

    public String getIndustryWebsite() {
        return this.industryWebsite;
    }

    public String getPrizeCode() {
        return this.prizeCode;
    }

    public long getPrizeCost() {
        return this.prizeCost;
    }

    public String getPrizeDesc() {
        return this.prizeDesc;
    }

    public String getPrizeName() {
        return this.prizeName;
    }

    public long getPrizeNo() {
        return this.prizeNo;
    }

    public long getPrizeNumber() {
        return this.prizeNumber;
    }

    public String getPrizeOrderNumber() {
        return this.prizeOrderNumber;
    }

    public BonusPrizeStatus getStatus() {
        return this.status;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setAttachmentFileBase64(String str) {
        this.attachmentFileBase64 = str;
    }

    public void setBonusType(BonusType bonusType2) {
        this.bonusType = bonusType2;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setStatus(BonusPrizeStatus bonusPrizeStatus) {
        this.status = bonusPrizeStatus;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }
}
