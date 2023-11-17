package p341ge.bog.mobilebank.model.deposits;

import android.text.TextUtils;
import g91.C32303f;
import g91.C32319m;
import java.math.BigDecimal;
import java.util.ArrayList;
import l50.C25838r;
import p341ge.bog.mobilebank.eventbus.events.DepositOperationsEvent;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.model.deposits.Deposit */
public class Deposit {
    private static final String MAXIMA_PROT_TYPE = "MAXIMACARDACCOUNT";
    private static final long ONE_MONTH = 2592000000L;
    private static final String TERMLESS_DICTIONARY_KEY = "text.deposits.details.end.date.termless";
    private static final String[] operationsProdTypes = {"CALL", MAXIMA_PROT_TYPE, "MAXIMADEPOSIT", "PREMIUM"};
    long accountKey;
    String acctNo;
    long agreeKey;
    Long applicationId;
    String attachmentUrl;
    BigDecimal availableAmount;
    public BigDecimal bcBalance;
    String ccy;
    long clientKey;
    BigDecimal currentBalance;
    ArrayList<C25838r> depositCards = new ArrayList<>();
    DepositDetails depositDetails;
    String depositPdfUrl;
    String dictionaryKey;
    private String isBreakable;
    public long mainAccountKey;
    DepositMaximaWrapper maximaDetails;
    BigDecimal minAccrualBalance;
    String name;
    long nextWithdrawalDate;
    DepositOperationsEvent operationsEvent;
    public Long pfmAcctId;
    String prodType;
    ArrayList<String> productFunctions;
    long productId;
    public ArrayList<SavingGoal> savingGoals;
    public String subType;
    long techAcctKey;

    public long getAccountKey() {
        return this.accountKey;
    }

    public String getAcctNo() {
        return this.acctNo;
    }

    public long getAgreeKey() {
        return this.agreeKey;
    }

    public Long getApplicationId() {
        return this.applicationId;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public String getBalance() {
        if (isMaxima()) {
            return C32303f.m95204o(getAvailableAmount().doubleValue());
        }
        return C32303f.m95204o(getCurrentBalance().doubleValue());
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public BigDecimal getCurrentBalance() {
        return this.currentBalance;
    }

    public ArrayList<C25838r> getDepositCards() {
        return this.depositCards;
    }

    public DepositDetails getDepositDetails() {
        return this.depositDetails;
    }

    public String getDepositNameOrType() {
        if (!TextUtils.isEmpty(getName())) {
            return getName();
        }
        return C27950a.m86284a(getDictionaryKey());
    }

    public String getDepositPdfUrl() {
        return this.depositPdfUrl;
    }

    public String getDepositTitle() {
        if (!TextUtils.isEmpty(getName())) {
            return getName();
        }
        if (!TextUtils.isEmpty(this.depositDetails.getPurposeDictionaryKey())) {
            return C27950a.m86284a(this.depositDetails.getPurposeDictionaryKey());
        }
        return C27950a.m86284a(getDictionaryKey());
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public String getIntAccrued() {
        if (getMaximaDetails() == null) {
            return C32303f.m95204o(getDepositDetails().getIntAccrued().doubleValue());
        }
        return C32303f.m95204o(getMaximaDetails().getIntAccrued().doubleValue());
    }

    public String getInterestRate() {
        if (getMaximaDetails() != null || getDepositDetails().getInterestRate() == null) {
            return "";
        }
        return C32303f.m95204o(getDepositDetails().getInterestRate().doubleValue());
    }

    public String getMaturityDate() {
        if (getDepositDetails() == null || getDepositDetails().getMaturityDate() == null) {
            return C27950a.m86284a(TERMLESS_DICTIONARY_KEY);
        }
        return C32319m.m95314u(getDepositDetails().getMaturityDate().longValue());
    }

    public DepositMaximaWrapper getMaximaDetails() {
        return this.maximaDetails;
    }

    public BigDecimal getMinAccrualBalance() {
        BigDecimal bigDecimal = this.minAccrualBalance;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
    }

    public String getName() {
        return this.name;
    }

    public long getNextWithdrawalDate() {
        return this.nextWithdrawalDate;
    }

    public DepositOperationsEvent getOperationsEvent() {
        return this.operationsEvent;
    }

    public String getProdType() {
        return this.prodType;
    }

    public ArrayList<String> getProductFunctions() {
        return this.productFunctions;
    }

    public long getProductId() {
        return this.productId;
    }

    public SavingGoal getSavingGoal() {
        if (hasSavingGoal()) {
            return this.savingGoals.get(0);
        }
        return null;
    }

    public String getStartDate() {
        if (getMaximaDetails() != null) {
            if (getMaximaDetails().getStartDate() > 0) {
                return C32319m.m95314u(getMaximaDetails().getStartDate());
            }
            return "";
        } else if (getDepositDetails().getStartDate() > 0) {
            return C32319m.m95314u(getDepositDetails().getStartDate());
        } else {
            return "";
        }
    }

    public long getTechAcctKey() {
        return this.techAcctKey;
    }

    public String getTotalBalance() {
        if (isMaxima()) {
            return "TODO";
        }
        return C32303f.m95204o(getDepositDetails().getTotalBalance().doubleValue());
    }

    public boolean hasOperations() {
        if (getProdType() != null) {
            for (String equals : operationsProdTypes) {
                if (equals.equals(getProdType())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasSavingGoal() {
        ArrayList<SavingGoal> arrayList = this.savingGoals;
        return arrayList != null && arrayList.size() > 0;
    }

    public boolean isBreakable() {
        return this.isBreakable.equals("Y");
    }

    public boolean isMaxima() {
        return MAXIMA_PROT_TYPE.equals(getProdType());
    }

    public boolean purposeEmpty() {
        DepositDetails depositDetails2 = this.depositDetails;
        return depositDetails2 == null || TextUtils.isEmpty(depositDetails2.getPurposeDictionaryKey());
    }

    public boolean purposeUsed() {
        DepositDetails depositDetails2 = this.depositDetails;
        return depositDetails2 == null || TextUtils.isEmpty(depositDetails2.getPurposeDictionaryKey());
    }

    public void setAcctNo(String str) {
        this.acctNo = str;
    }

    public void setAgreeKey(long j) {
        this.agreeKey = j;
    }

    public void setAvailableAmount(BigDecimal bigDecimal) {
        this.availableAmount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setDepositCards(ArrayList<C25838r> arrayList) {
        this.depositCards = arrayList;
    }

    public void setDepositDetails(DepositDetails depositDetails2) {
        this.depositDetails = depositDetails2;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setMaximaDetails(DepositMaximaWrapper depositMaximaWrapper) {
        this.maximaDetails = depositMaximaWrapper;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOperationsEvent(DepositOperationsEvent depositOperationsEvent) {
        this.operationsEvent = depositOperationsEvent;
    }

    public void setProdType(String str) {
        this.prodType = str;
    }

    public boolean showWithdrawalDate() {
        return this.nextWithdrawalDate - ONE_MONTH < System.currentTimeMillis();
    }
}
