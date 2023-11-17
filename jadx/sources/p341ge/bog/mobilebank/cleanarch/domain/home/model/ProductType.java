package p341ge.bog.mobilebank.cleanarch.domain.home.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.domain.home.model.ProductType */
public final class ProductType {
    public static final String ACC_TYPE_ACCOUNT = "ACCOUNT";
    public static final String ACC_TYPE_CREDIT_CARD = "CREDITCARDACCOUNT";
    public static final String ACC_TYPE_DEPOSIT = "DEPOSIT";
    public static final String ACC_TYPE_GT = "G&T";
    public static final String ACC_TYPE_GT_NEW = "GTP_TRADING";
    public static final String ACC_TYPE_LOAN = "LOAN";
    public static final String ACC_TYPE_PENSION = "PENSION_FUND";
    public static final String BONUS_PROD_TYPE_CASHBACK = "CASHBACK";
    public static final String BONUS_PROD_TYPE_MEMBREWARD = "MEMBREWARD";
    public static final String BONUS_PROD_TYPE_PLUS = "PLUS";
    public static final String BONUS_PROD_TYPE_PRLLOT = "PRLLOT";
    public static final String BONUS_PROD_TYPE_SCOOL = "SCOOL";
    public static final String BONUS_TYPE_CASHBACK = "AMEX_CASHBACK";
    public static final String BONUS_TYPE_MEMBREWARD = "AMEX";
    public static final String BONUS_TYPE_PLUS = "PLUS";
    public static final String BONUS_TYPE_PRLO = "PRLLOT";
    public static final String BONUS_TYPE_SCOOL = "SCOOLA";
    public static final C20997a Companion = new C20997a((DefaultConstructorMarker) null);
    public static final String PRODUCT_STATUS_APPROVED = "APPROVED";
    public static final String PRODUCT_STATUS_CLOSED = "CLOSED";
    public static final String PRODUCT_STATUS_DRAFT = "DRAFT";
    public static final String PRODUCT_STATUS_IN_PROGRESS = "IN_PROGRESS";
    public static final String PRODUCT_STATUS_NEW = "NEW";
    public static final String PRODUCT_STATUS_PENDING = "PENDING";
    public static final String PRODUCT_STATUS_REJECTED = "REJECTED";
    private final String clientKey;
    private final String product;
    private final String status;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.home.model.ProductType$a */
    public static final class C20997a {
        private C20997a() {
        }

        public /* synthetic */ C20997a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProductType() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProductType copy$default(ProductType productType, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productType.clientKey;
        }
        if ((i & 2) != 0) {
            str2 = productType.product;
        }
        if ((i & 4) != 0) {
            str3 = productType.status;
        }
        return productType.copy(str, str2, str3);
    }

    public final String component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.product;
    }

    public final String component3() {
        return this.status;
    }

    public final ProductType copy(String str, String str2, String str3) {
        return new ProductType(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductType)) {
            return false;
        }
        ProductType productType = (ProductType) obj;
        return C41536l.m120484d(this.clientKey, productType.clientKey) && C41536l.m120484d(this.product, productType.product) && C41536l.m120484d(this.status, productType.status);
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.clientKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.product;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.clientKey;
        String str2 = this.product;
        String str3 = this.status;
        return "ProductType(clientKey=" + str + ", product=" + str2 + ", status=" + str3 + ")";
    }

    public ProductType(String str, String str2, String str3) {
        this.clientKey = str;
        this.product = str2;
        this.status = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductType(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
