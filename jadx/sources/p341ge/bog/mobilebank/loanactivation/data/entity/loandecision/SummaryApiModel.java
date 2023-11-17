package p341ge.bog.mobilebank.loanactivation.data.entity.loandecision;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.loandecision.SummaryApiModel */
public final class SummaryApiModel {
    private String ccy;
    private Double fullAmount;
    private Double intAmount;
    private Double priAmount;

    public SummaryApiModel(Double d, String str, Double d2, Double d3) {
        this.intAmount = d;
        this.ccy = str;
        this.priAmount = d2;
        this.fullAmount = d3;
    }

    public static /* synthetic */ SummaryApiModel copy$default(SummaryApiModel summaryApiModel, Double d, String str, Double d2, Double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = summaryApiModel.intAmount;
        }
        if ((i & 2) != 0) {
            str = summaryApiModel.ccy;
        }
        if ((i & 4) != 0) {
            d2 = summaryApiModel.priAmount;
        }
        if ((i & 8) != 0) {
            d3 = summaryApiModel.fullAmount;
        }
        return summaryApiModel.copy(d, str, d2, d3);
    }

    public final Double component1() {
        return this.intAmount;
    }

    public final String component2() {
        return this.ccy;
    }

    public final Double component3() {
        return this.priAmount;
    }

    public final Double component4() {
        return this.fullAmount;
    }

    public final SummaryApiModel copy(Double d, String str, Double d2, Double d3) {
        return new SummaryApiModel(d, str, d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryApiModel)) {
            return false;
        }
        SummaryApiModel summaryApiModel = (SummaryApiModel) obj;
        return C41536l.m120484d(this.intAmount, summaryApiModel.intAmount) && C41536l.m120484d(this.ccy, summaryApiModel.ccy) && C41536l.m120484d(this.priAmount, summaryApiModel.priAmount) && C41536l.m120484d(this.fullAmount, summaryApiModel.fullAmount);
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Double getFullAmount() {
        return this.fullAmount;
    }

    public final Double getIntAmount() {
        return this.intAmount;
    }

    public final Double getPriAmount() {
        return this.priAmount;
    }

    public int hashCode() {
        Double d = this.intAmount;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.ccy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.priAmount;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.fullAmount;
        if (d3 != null) {
            i = d3.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setCcy(String str) {
        this.ccy = str;
    }

    public final void setFullAmount(Double d) {
        this.fullAmount = d;
    }

    public final void setIntAmount(Double d) {
        this.intAmount = d;
    }

    public final void setPriAmount(Double d) {
        this.priAmount = d;
    }

    public String toString() {
        Double d = this.intAmount;
        String str = this.ccy;
        Double d2 = this.priAmount;
        Double d3 = this.fullAmount;
        return "SummaryApiModel(intAmount=" + d + ", ccy=" + str + ", priAmount=" + d2 + ", fullAmount=" + d3 + ")";
    }
}
