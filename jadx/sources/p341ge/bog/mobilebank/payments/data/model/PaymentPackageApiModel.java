package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.PaymentPackageApiModel */
public final class PaymentPackageApiModel {
    private final String channel;

    /* renamed from: id */
    private final long f81975id;
    private final String masterServiceId;
    private final Integer orderNo;
    private final BigDecimal packageAmount;
    private final String packageDesc;
    private final String packageName;
    private final String paymentServiceId;
    private final String status;
    private final String validationFunction;

    public PaymentPackageApiModel(long j, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, Integer num, String str7) {
        this.f81975id = j;
        this.masterServiceId = str;
        this.paymentServiceId = str2;
        this.packageName = str3;
        this.packageDesc = str4;
        this.packageAmount = bigDecimal;
        this.channel = str5;
        this.status = str6;
        this.orderNo = num;
        this.validationFunction = str7;
    }

    public static /* synthetic */ PaymentPackageApiModel copy$default(PaymentPackageApiModel paymentPackageApiModel, long j, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, Integer num, String str7, int i, Object obj) {
        PaymentPackageApiModel paymentPackageApiModel2 = paymentPackageApiModel;
        int i2 = i;
        return paymentPackageApiModel.copy((i2 & 1) != 0 ? paymentPackageApiModel2.f81975id : j, (i2 & 2) != 0 ? paymentPackageApiModel2.masterServiceId : str, (i2 & 4) != 0 ? paymentPackageApiModel2.paymentServiceId : str2, (i2 & 8) != 0 ? paymentPackageApiModel2.packageName : str3, (i2 & 16) != 0 ? paymentPackageApiModel2.packageDesc : str4, (i2 & 32) != 0 ? paymentPackageApiModel2.packageAmount : bigDecimal, (i2 & 64) != 0 ? paymentPackageApiModel2.channel : str5, (i2 & 128) != 0 ? paymentPackageApiModel2.status : str6, (i2 & C11398b.f33139r) != 0 ? paymentPackageApiModel2.orderNo : num, (i2 & C11398b.f33140s) != 0 ? paymentPackageApiModel2.validationFunction : str7);
    }

    public final long component1() {
        return this.f81975id;
    }

    public final String component10() {
        return this.validationFunction;
    }

    public final String component2() {
        return this.masterServiceId;
    }

    public final String component3() {
        return this.paymentServiceId;
    }

    public final String component4() {
        return this.packageName;
    }

    public final String component5() {
        return this.packageDesc;
    }

    public final BigDecimal component6() {
        return this.packageAmount;
    }

    public final String component7() {
        return this.channel;
    }

    public final String component8() {
        return this.status;
    }

    public final Integer component9() {
        return this.orderNo;
    }

    public final PaymentPackageApiModel copy(long j, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, Integer num, String str7) {
        return new PaymentPackageApiModel(j, str, str2, str3, str4, bigDecimal, str5, str6, num, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPackageApiModel)) {
            return false;
        }
        PaymentPackageApiModel paymentPackageApiModel = (PaymentPackageApiModel) obj;
        return this.f81975id == paymentPackageApiModel.f81975id && C41536l.m120484d(this.masterServiceId, paymentPackageApiModel.masterServiceId) && C41536l.m120484d(this.paymentServiceId, paymentPackageApiModel.paymentServiceId) && C41536l.m120484d(this.packageName, paymentPackageApiModel.packageName) && C41536l.m120484d(this.packageDesc, paymentPackageApiModel.packageDesc) && C41536l.m120484d(this.packageAmount, paymentPackageApiModel.packageAmount) && C41536l.m120484d(this.channel, paymentPackageApiModel.channel) && C41536l.m120484d(this.status, paymentPackageApiModel.status) && C41536l.m120484d(this.orderNo, paymentPackageApiModel.orderNo) && C41536l.m120484d(this.validationFunction, paymentPackageApiModel.validationFunction);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final long getId() {
        return this.f81975id;
    }

    public final String getMasterServiceId() {
        return this.masterServiceId;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public final BigDecimal getPackageAmount() {
        return this.packageAmount;
    }

    public final String getPackageDesc() {
        return this.packageDesc;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPaymentServiceId() {
        return this.paymentServiceId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getValidationFunction() {
        return this.validationFunction;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f81975id) * 31;
        String str = this.masterServiceId;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentServiceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packageName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageDesc;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.packageAmount;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str5 = this.channel;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.orderNo;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.validationFunction;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        long j = this.f81975id;
        String str = this.masterServiceId;
        String str2 = this.paymentServiceId;
        String str3 = this.packageName;
        String str4 = this.packageDesc;
        BigDecimal bigDecimal = this.packageAmount;
        String str5 = this.channel;
        String str6 = this.status;
        Integer num = this.orderNo;
        String str7 = this.validationFunction;
        return "PaymentPackageApiModel(id=" + j + ", masterServiceId=" + str + ", paymentServiceId=" + str2 + ", packageName=" + str3 + ", packageDesc=" + str4 + ", packageAmount=" + bigDecimal + ", channel=" + str5 + ", status=" + str6 + ", orderNo=" + num + ", validationFunction=" + str7 + ")";
    }
}
