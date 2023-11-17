package p341ge.bog.mobilebank.loyaltyprogress.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyprogress.data.model.StatusDetailsApiModel */
public final class StatusDetailsApiModel {
    private final Long clientKey;
    private final String currentLabel;
    private final String currentLabelType;
    private final String detailsUrl;
    private final Long endDate;
    private final Long nextEndDate;
    private final String nextLabel;
    private final Integer nextLabelScore;
    private final String nextLabelType;
    private final Long nextStartDate;
    private final String realLabel;
    private final String realLabelType;
    private final Long startDate;
    private final Integer sumStatusPoint;

    public StatusDetailsApiModel(Long l, String str, String str2, Integer num, Long l2, Long l3, String str3, String str4, String str5, String str6, Integer num2, Long l4, Long l5, String str7) {
        this.clientKey = l;
        this.currentLabelType = str;
        this.currentLabel = str2;
        this.sumStatusPoint = num;
        this.startDate = l2;
        this.endDate = l3;
        this.realLabelType = str3;
        this.realLabel = str4;
        this.nextLabelType = str5;
        this.nextLabel = str6;
        this.nextLabelScore = num2;
        this.nextStartDate = l4;
        this.nextEndDate = l5;
        this.detailsUrl = str7;
    }

    public static /* synthetic */ StatusDetailsApiModel copy$default(StatusDetailsApiModel statusDetailsApiModel, Long l, String str, String str2, Integer num, Long l2, Long l3, String str3, String str4, String str5, String str6, Integer num2, Long l4, Long l5, String str7, int i, Object obj) {
        StatusDetailsApiModel statusDetailsApiModel2 = statusDetailsApiModel;
        int i2 = i;
        return statusDetailsApiModel.copy((i2 & 1) != 0 ? statusDetailsApiModel2.clientKey : l, (i2 & 2) != 0 ? statusDetailsApiModel2.currentLabelType : str, (i2 & 4) != 0 ? statusDetailsApiModel2.currentLabel : str2, (i2 & 8) != 0 ? statusDetailsApiModel2.sumStatusPoint : num, (i2 & 16) != 0 ? statusDetailsApiModel2.startDate : l2, (i2 & 32) != 0 ? statusDetailsApiModel2.endDate : l3, (i2 & 64) != 0 ? statusDetailsApiModel2.realLabelType : str3, (i2 & 128) != 0 ? statusDetailsApiModel2.realLabel : str4, (i2 & C11398b.f33139r) != 0 ? statusDetailsApiModel2.nextLabelType : str5, (i2 & C11398b.f33140s) != 0 ? statusDetailsApiModel2.nextLabel : str6, (i2 & C11398b.f33141t) != 0 ? statusDetailsApiModel2.nextLabelScore : num2, (i2 & C11398b.f33142u) != 0 ? statusDetailsApiModel2.nextStartDate : l4, (i2 & C11398b.f33143v) != 0 ? statusDetailsApiModel2.nextEndDate : l5, (i2 & 8192) != 0 ? statusDetailsApiModel2.detailsUrl : str7);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final String component10() {
        return this.nextLabel;
    }

    public final Integer component11() {
        return this.nextLabelScore;
    }

    public final Long component12() {
        return this.nextStartDate;
    }

    public final Long component13() {
        return this.nextEndDate;
    }

    public final String component14() {
        return this.detailsUrl;
    }

    public final String component2() {
        return this.currentLabelType;
    }

    public final String component3() {
        return this.currentLabel;
    }

    public final Integer component4() {
        return this.sumStatusPoint;
    }

    public final Long component5() {
        return this.startDate;
    }

    public final Long component6() {
        return this.endDate;
    }

    public final String component7() {
        return this.realLabelType;
    }

    public final String component8() {
        return this.realLabel;
    }

    public final String component9() {
        return this.nextLabelType;
    }

    public final StatusDetailsApiModel copy(Long l, String str, String str2, Integer num, Long l2, Long l3, String str3, String str4, String str5, String str6, Integer num2, Long l4, Long l5, String str7) {
        return new StatusDetailsApiModel(l, str, str2, num, l2, l3, str3, str4, str5, str6, num2, l4, l5, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusDetailsApiModel)) {
            return false;
        }
        StatusDetailsApiModel statusDetailsApiModel = (StatusDetailsApiModel) obj;
        return C41536l.m120484d(this.clientKey, statusDetailsApiModel.clientKey) && C41536l.m120484d(this.currentLabelType, statusDetailsApiModel.currentLabelType) && C41536l.m120484d(this.currentLabel, statusDetailsApiModel.currentLabel) && C41536l.m120484d(this.sumStatusPoint, statusDetailsApiModel.sumStatusPoint) && C41536l.m120484d(this.startDate, statusDetailsApiModel.startDate) && C41536l.m120484d(this.endDate, statusDetailsApiModel.endDate) && C41536l.m120484d(this.realLabelType, statusDetailsApiModel.realLabelType) && C41536l.m120484d(this.realLabel, statusDetailsApiModel.realLabel) && C41536l.m120484d(this.nextLabelType, statusDetailsApiModel.nextLabelType) && C41536l.m120484d(this.nextLabel, statusDetailsApiModel.nextLabel) && C41536l.m120484d(this.nextLabelScore, statusDetailsApiModel.nextLabelScore) && C41536l.m120484d(this.nextStartDate, statusDetailsApiModel.nextStartDate) && C41536l.m120484d(this.nextEndDate, statusDetailsApiModel.nextEndDate) && C41536l.m120484d(this.detailsUrl, statusDetailsApiModel.detailsUrl);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getCurrentLabel() {
        return this.currentLabel;
    }

    public final String getCurrentLabelType() {
        return this.currentLabelType;
    }

    public final String getDetailsUrl() {
        return this.detailsUrl;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Long getNextEndDate() {
        return this.nextEndDate;
    }

    public final String getNextLabel() {
        return this.nextLabel;
    }

    public final Integer getNextLabelScore() {
        return this.nextLabelScore;
    }

    public final String getNextLabelType() {
        return this.nextLabelType;
    }

    public final Long getNextStartDate() {
        return this.nextStartDate;
    }

    public final String getRealLabel() {
        return this.realLabel;
    }

    public final String getRealLabelType() {
        return this.realLabelType;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final Integer getSumStatusPoint() {
        return this.sumStatusPoint;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.currentLabelType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentLabel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sumStatusPoint;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.startDate;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endDate;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.realLabelType;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.realLabel;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nextLabelType;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nextLabel;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.nextLabelScore;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l4 = this.nextStartDate;
        int hashCode12 = (hashCode11 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.nextEndDate;
        int hashCode13 = (hashCode12 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str7 = this.detailsUrl;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        Long l = this.clientKey;
        String str = this.currentLabelType;
        String str2 = this.currentLabel;
        Integer num = this.sumStatusPoint;
        Long l2 = this.startDate;
        Long l3 = this.endDate;
        String str3 = this.realLabelType;
        String str4 = this.realLabel;
        String str5 = this.nextLabelType;
        String str6 = this.nextLabel;
        Integer num2 = this.nextLabelScore;
        Long l4 = this.nextStartDate;
        Long l5 = this.nextEndDate;
        String str7 = this.detailsUrl;
        return "StatusDetailsApiModel(clientKey=" + l + ", currentLabelType=" + str + ", currentLabel=" + str2 + ", sumStatusPoint=" + num + ", startDate=" + l2 + ", endDate=" + l3 + ", realLabelType=" + str3 + ", realLabel=" + str4 + ", nextLabelType=" + str5 + ", nextLabel=" + str6 + ", nextLabelScore=" + num2 + ", nextStartDate=" + l4 + ", nextEndDate=" + l5 + ", detailsUrl=" + str7 + ")";
    }
}
