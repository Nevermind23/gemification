package p341ge.bog.mobilebank.loanactivation.data.entity.loandecision;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.loandecision.ScheduleInfoApiModel */
public final class ScheduleInfoApiModel {
    private final String ccy;
    private final String comAmount;
    private final String insAmount;
    private final String intAmount;
    private final String outAmount;
    private final String payDate;
    private final String priAmount;
    private final String sumAmount;

    public ScheduleInfoApiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.ccy = str;
        this.comAmount = str2;
        this.insAmount = str3;
        this.intAmount = str4;
        this.outAmount = str5;
        this.payDate = str6;
        this.priAmount = str7;
        this.sumAmount = str8;
    }

    public static /* synthetic */ ScheduleInfoApiModel copy$default(ScheduleInfoApiModel scheduleInfoApiModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        ScheduleInfoApiModel scheduleInfoApiModel2 = scheduleInfoApiModel;
        int i2 = i;
        return scheduleInfoApiModel.copy((i2 & 1) != 0 ? scheduleInfoApiModel2.ccy : str, (i2 & 2) != 0 ? scheduleInfoApiModel2.comAmount : str2, (i2 & 4) != 0 ? scheduleInfoApiModel2.insAmount : str3, (i2 & 8) != 0 ? scheduleInfoApiModel2.intAmount : str4, (i2 & 16) != 0 ? scheduleInfoApiModel2.outAmount : str5, (i2 & 32) != 0 ? scheduleInfoApiModel2.payDate : str6, (i2 & 64) != 0 ? scheduleInfoApiModel2.priAmount : str7, (i2 & 128) != 0 ? scheduleInfoApiModel2.sumAmount : str8);
    }

    public final String component1() {
        return this.ccy;
    }

    public final String component2() {
        return this.comAmount;
    }

    public final String component3() {
        return this.insAmount;
    }

    public final String component4() {
        return this.intAmount;
    }

    public final String component5() {
        return this.outAmount;
    }

    public final String component6() {
        return this.payDate;
    }

    public final String component7() {
        return this.priAmount;
    }

    public final String component8() {
        return this.sumAmount;
    }

    public final ScheduleInfoApiModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new ScheduleInfoApiModel(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleInfoApiModel)) {
            return false;
        }
        ScheduleInfoApiModel scheduleInfoApiModel = (ScheduleInfoApiModel) obj;
        return C41536l.m120484d(this.ccy, scheduleInfoApiModel.ccy) && C41536l.m120484d(this.comAmount, scheduleInfoApiModel.comAmount) && C41536l.m120484d(this.insAmount, scheduleInfoApiModel.insAmount) && C41536l.m120484d(this.intAmount, scheduleInfoApiModel.intAmount) && C41536l.m120484d(this.outAmount, scheduleInfoApiModel.outAmount) && C41536l.m120484d(this.payDate, scheduleInfoApiModel.payDate) && C41536l.m120484d(this.priAmount, scheduleInfoApiModel.priAmount) && C41536l.m120484d(this.sumAmount, scheduleInfoApiModel.sumAmount);
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getComAmount() {
        return this.comAmount;
    }

    public final String getInsAmount() {
        return this.insAmount;
    }

    public final String getIntAmount() {
        return this.intAmount;
    }

    public final String getOutAmount() {
        return this.outAmount;
    }

    public final String getPayDate() {
        return this.payDate;
    }

    public final String getPriAmount() {
        return this.priAmount;
    }

    public final String getSumAmount() {
        return this.sumAmount;
    }

    public int hashCode() {
        String str = this.ccy;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.comAmount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.insAmount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.intAmount;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.outAmount;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payDate;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.priAmount;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sumAmount;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.ccy;
        String str2 = this.comAmount;
        String str3 = this.insAmount;
        String str4 = this.intAmount;
        String str5 = this.outAmount;
        String str6 = this.payDate;
        String str7 = this.priAmount;
        String str8 = this.sumAmount;
        return "ScheduleInfoApiModel(ccy=" + str + ", comAmount=" + str2 + ", insAmount=" + str3 + ", intAmount=" + str4 + ", outAmount=" + str5 + ", payDate=" + str6 + ", priAmount=" + str7 + ", sumAmount=" + str8 + ")";
    }
}
