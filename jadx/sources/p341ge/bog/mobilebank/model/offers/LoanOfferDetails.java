package p341ge.bog.mobilebank.model.offers;

import hd0.C24978b;
import java.math.BigDecimal;
import java.util.List;
import org.parceler.Parcel;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.offers.LoanOfferDetails */
public class LoanOfferDetails {
    BigDecimal amount;
    String attachmentFileBase64;
    String ccy;
    BigDecimal commissionAmount;
    BigDecimal commissionRate;
    @C8664c("p_dec_no")
    long decNo;
    String decScheme;
    C24978b expressFlag;
    @C8664c("p_extra_code")
    String extraCode;
    BigDecimal insAmount;
    C24978b insFlag;
    @C8664c("p_irr")
    BigDecimal irr;
    List<BigDecimal> loanAmounts;
    int maxTerm;
    int minTerm;
    BigDecimal overdueOnetimeFine;
    @C8664c("p_pay_count")
    BigDecimal payCount;
    @C8664c("p_f_pay_date")
    long payDate;
    @C8664c("p_pay_day")
    String payDay;
    @C8664c("p_period_fee")
    BigDecimal periodFee;
    @C8664c("p_pmt")
    BigDecimal pmt;
    BigDecimal prePenalty;
    @C8664c("pri_over")
    String priOver;
    BigDecimal rate;
    BigDecimal repayAmount;
    @C8664c("repayCCY")
    String repayCcy;
    Integer term;
    @C8664c("p_with_amount")
    BigDecimal withAmount;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getDecNo() {
        return this.decNo;
    }

    public String getDecScheme() {
        return this.decScheme;
    }

    public C24978b getExpressFlag() {
        return this.expressFlag;
    }

    public C24978b getInsFlag() {
        return this.insFlag;
    }

    public List<BigDecimal> getLoanAmounts() {
        return this.loanAmounts;
    }

    public int getMaxTerm() {
        return this.maxTerm;
    }

    public int getMinTerm() {
        return this.minTerm;
    }

    public String getPayDay() {
        return this.payDay;
    }

    public BigDecimal getRepayAmount() {
        return this.repayAmount;
    }

    public String getRepayCcy() {
        return this.repayCcy;
    }

    public Integer getTerm() {
        return this.term;
    }

    public boolean isAmountEditable() {
        if ("Y".equals(this.extraCode) || "X".equals(this.extraCode)) {
            return true;
        }
        return false;
    }

    public boolean isEditable() {
        return "N".equals(this.extraCode);
    }
}
