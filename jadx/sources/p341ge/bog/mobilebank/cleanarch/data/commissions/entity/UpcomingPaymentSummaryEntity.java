package p341ge.bog.mobilebank.cleanarch.data.commissions.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentSummaryEntity */
public final class UpcomingPaymentSummaryEntity {
    public static final C20972a Companion = new C20972a((DefaultConstructorMarker) null);
    public static final String SUMMARY_TYPE_FEE = "FEE";
    private final Double amountSum;
    private final String ccy;
    private final Integer count;
    private final String nameDictionaryKey;
    private final String productGroup;

    /* renamed from: ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentSummaryEntity$a */
    public static final class C20972a {
        private C20972a() {
        }

        public /* synthetic */ C20972a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UpcomingPaymentSummaryEntity(String str, Double d, String str2, Integer num, String str3) {
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(str2, "ccy");
        this.productGroup = str;
        this.amountSum = d;
        this.ccy = str2;
        this.count = num;
        this.nameDictionaryKey = str3;
    }

    public static /* synthetic */ UpcomingPaymentSummaryEntity copy$default(UpcomingPaymentSummaryEntity upcomingPaymentSummaryEntity, String str, Double d, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upcomingPaymentSummaryEntity.productGroup;
        }
        if ((i & 2) != 0) {
            d = upcomingPaymentSummaryEntity.amountSum;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            str2 = upcomingPaymentSummaryEntity.ccy;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num = upcomingPaymentSummaryEntity.count;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = upcomingPaymentSummaryEntity.nameDictionaryKey;
        }
        return upcomingPaymentSummaryEntity.copy(str, d2, str4, num2, str3);
    }

    public final String component1() {
        return this.productGroup;
    }

    public final Double component2() {
        return this.amountSum;
    }

    public final String component3() {
        return this.ccy;
    }

    public final Integer component4() {
        return this.count;
    }

    public final String component5() {
        return this.nameDictionaryKey;
    }

    public final UpcomingPaymentSummaryEntity copy(String str, Double d, String str2, Integer num, String str3) {
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(str2, "ccy");
        return new UpcomingPaymentSummaryEntity(str, d, str2, num, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingPaymentSummaryEntity)) {
            return false;
        }
        UpcomingPaymentSummaryEntity upcomingPaymentSummaryEntity = (UpcomingPaymentSummaryEntity) obj;
        return C41536l.m120484d(this.productGroup, upcomingPaymentSummaryEntity.productGroup) && C41536l.m120484d(this.amountSum, upcomingPaymentSummaryEntity.amountSum) && C41536l.m120484d(this.ccy, upcomingPaymentSummaryEntity.ccy) && C41536l.m120484d(this.count, upcomingPaymentSummaryEntity.count) && C41536l.m120484d(this.nameDictionaryKey, upcomingPaymentSummaryEntity.nameDictionaryKey);
    }

    public final Double getAmountSum() {
        return this.amountSum;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getNameDictionaryKey() {
        return this.nameDictionaryKey;
    }

    public final String getProductGroup() {
        return this.productGroup;
    }

    public int hashCode() {
        int hashCode = this.productGroup.hashCode() * 31;
        Double d = this.amountSum;
        int i = 0;
        int hashCode2 = (((hashCode + (d == null ? 0 : d.hashCode())) * 31) + this.ccy.hashCode()) * 31;
        Integer num = this.count;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nameDictionaryKey;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.productGroup;
        Double d = this.amountSum;
        String str2 = this.ccy;
        Integer num = this.count;
        String str3 = this.nameDictionaryKey;
        return "UpcomingPaymentSummaryEntity(productGroup=" + str + ", amountSum=" + d + ", ccy=" + str2 + ", count=" + num + ", nameDictionaryKey=" + str3 + ")";
    }
}
