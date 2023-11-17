package p341ge.bog.mobilebank.model.offers;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import org.parceler.Parcel;

@Parcel
@Keep
/* renamed from: ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails */
public class LimitLoanDecisionDetails {
    public String accessType;
    public BigDecimal comisAmount;
    public BigDecimal comisMin;
    public double comisRate;
    public String conditionDate;
    public int conditionDays;
    public String conditionRate;
    public long decisionNo;
    public String decisionScheme;
    public Double downPayment;
    public BigDecimal drawAmount;
    public BigDecimal drawAmount2;
    public long firstPayDate;
    public Double forgiveFeeAmount;
    public Double forgiveIntAmount;
    public Double forgiveOdiAmount;
    public Double fullPaymentAmount;
    public BigDecimal insIncAmount;
    public String insIncFlag;
    public BigDecimal insLifeAmount;
    public BigDecimal keepAmount;
    public BigDecimal loanAmount;
    public String loanCcy;
    public double loanIrr;
    public String loanIrr2;
    public String loanIrr3;
    public String loanIrr4;
    public long loanMaturity;
    public double loanRate;
    public int loanTerm;
    public BigDecimal maxLoanAmount;
    public Integer maxTerm;
    public BigDecimal minLoanAmount;
    public Integer minTerm;
    public String operationType;
    public Integer payDay;
    public int paymentCount;
    public Double penaltyFee;
    public String penaltyFeeValue;
    public double penaltyInt;
    public double penaltyOne;
    public double penaltyPre;
    public double penaltyPri;
    public BigDecimal pmtAmount;
    public BigDecimal rfncAmount;
    public Double rqstDownPayment;
    public BigDecimal withdrawalAmount;

    public String getAccessType() {
        return this.accessType;
    }

    public BigDecimal getComisAmount() {
        return this.comisAmount;
    }

    public BigDecimal getComisMin() {
        return this.comisMin;
    }

    public double getComisRate() {
        return this.comisRate;
    }

    public String getConditionDate() {
        return this.conditionDate;
    }

    public int getConditionDays() {
        return this.conditionDays;
    }

    public String getConditionRate() {
        return this.conditionRate;
    }

    public long getDecisionNo() {
        return this.decisionNo;
    }

    public String getDecisionScheme() {
        return this.decisionScheme;
    }

    public Double getDownPayment() {
        return this.downPayment;
    }

    public BigDecimal getDrawAmount() {
        return this.drawAmount;
    }

    public BigDecimal getDrawAmount2() {
        return this.drawAmount2;
    }

    public long getFirstPayDate() {
        return this.firstPayDate;
    }

    public Double getForgiveFeeAmount() {
        return this.forgiveFeeAmount;
    }

    public Double getForgiveIntAmount() {
        return this.forgiveIntAmount;
    }

    public Double getForgiveOdiAmount() {
        return this.forgiveOdiAmount;
    }

    public Double getFullPaymentAmount() {
        return this.fullPaymentAmount;
    }

    public BigDecimal getInsIncAmount() {
        return this.insIncAmount;
    }

    public String getInsIncFlag() {
        return this.insIncFlag;
    }

    public BigDecimal getInsLifeAmount() {
        return this.insLifeAmount;
    }

    public BigDecimal getKeepAmount() {
        return this.keepAmount;
    }

    public BigDecimal getLoanAmount() {
        return this.loanAmount;
    }

    public String getLoanCcy() {
        return this.loanCcy;
    }

    public double getLoanIrr() {
        return this.loanIrr;
    }

    public String getLoanIrr2() {
        return this.loanIrr2;
    }

    public String getLoanIrr3() {
        return this.loanIrr3;
    }

    public String getLoanIrr4() {
        return this.loanIrr4;
    }

    public long getLoanMaturity() {
        return this.loanMaturity;
    }

    public double getLoanRate() {
        return this.loanRate;
    }

    public int getLoanTerm() {
        return this.loanTerm;
    }

    public BigDecimal getMaxLoanAmount() {
        return this.maxLoanAmount;
    }

    public Integer getMaxTerm() {
        return this.maxTerm;
    }

    public BigDecimal getMinLoanAmount() {
        return this.minLoanAmount;
    }

    public Integer getMinTerm() {
        return this.minTerm;
    }

    public String getOperationType() {
        return this.operationType;
    }

    public Integer getPayDay() {
        return this.payDay;
    }

    public int getPaymentCount() {
        return this.paymentCount;
    }

    public Double getPenaltyFee() {
        return this.penaltyFee;
    }

    public String getPenaltyFeeValue() {
        return this.penaltyFeeValue;
    }

    public double getPenaltyInt() {
        return this.penaltyInt;
    }

    public double getPenaltyOne() {
        return this.penaltyOne;
    }

    public double getPenaltyPre() {
        return this.penaltyPre;
    }

    public double getPenaltyPri() {
        return this.penaltyPri;
    }

    public BigDecimal getPmtAmount() {
        return this.pmtAmount;
    }

    public BigDecimal getRfncAmount() {
        return this.rfncAmount;
    }

    public Double getRqstDownPayment() {
        return this.rqstDownPayment;
    }

    public BigDecimal getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public boolean isInsuranceAvailable() {
        return C41536l.m120484d(this.insIncFlag, "X");
    }

    public void setComisAmount(BigDecimal bigDecimal) {
        this.comisAmount = bigDecimal;
    }

    public void setConditionDays(int i) {
        this.conditionDays = i;
    }

    public void setDecisionNo(long j) {
        this.decisionNo = j;
    }

    public void setDecisionScheme(String str) {
        this.decisionScheme = str;
    }

    public void setDrawAmount(BigDecimal bigDecimal) {
        this.drawAmount = bigDecimal;
    }

    public void setDrawAmount2(BigDecimal bigDecimal) {
        this.drawAmount2 = bigDecimal;
    }

    public void setForgiveFeeAmount(Double d) {
        this.forgiveFeeAmount = d;
    }

    public void setForgiveIntAmount(Double d) {
        this.forgiveIntAmount = d;
    }

    public void setForgiveOdiAmount(Double d) {
        this.forgiveOdiAmount = d;
    }

    public void setFullPaymentAmount(Double d) {
        this.fullPaymentAmount = d;
    }

    public void setInsIncFlag(String str) {
        this.insIncFlag = str;
    }

    public void setInsLifeAmount(BigDecimal bigDecimal) {
        this.insLifeAmount = bigDecimal;
    }

    public void setKeepAmount(BigDecimal bigDecimal) {
        this.keepAmount = bigDecimal;
    }

    public void setLoanAmount(BigDecimal bigDecimal) {
        this.loanAmount = bigDecimal;
    }

    public void setLoanTerm(int i) {
        this.loanTerm = i;
    }

    public void setMaxLoanAmount(BigDecimal bigDecimal) {
        this.maxLoanAmount = bigDecimal;
    }

    public void setMinLoanAmount(BigDecimal bigDecimal) {
        this.minLoanAmount = bigDecimal;
    }

    public void setOperationType(String str) {
        this.operationType = str;
    }

    public void setPayDay(Integer num) {
        this.payDay = num;
    }

    public void setRfncAmount(BigDecimal bigDecimal) {
        this.rfncAmount = bigDecimal;
    }

    public void setRqstDownPayment(Double d) {
        this.rqstDownPayment = d;
    }
}
