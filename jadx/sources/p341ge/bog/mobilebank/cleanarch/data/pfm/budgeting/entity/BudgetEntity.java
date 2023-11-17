package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetEntity */
public final class BudgetEntity {
    private final long catId;
    private final String color;
    private final long error;
    private final String errorDictionaryKey;

    /* renamed from: id */
    private final long f56453id;
    private final boolean isCatIncome;
    private final String name;
    private final Integer orderNo;
    private final Long parentCatId;
    private final String parentCatName;
    private final BigDecimal spent;
    private final BigDecimal value;

    public BudgetEntity(long j, long j2, Long l, String str, boolean z, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, long j3, Integer num) {
        String str5 = str2;
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        String str6 = str4;
        C41536l.m120489i(str, "color");
        C41536l.m120489i(str5, "name");
        C41536l.m120489i(bigDecimal3, "spent");
        C41536l.m120489i(bigDecimal4, C11755a.C11756a.f34100b);
        C41536l.m120489i(str6, "errorDictionaryKey");
        this.f56453id = j;
        this.catId = j2;
        this.parentCatId = l;
        this.color = str;
        this.isCatIncome = z;
        this.name = str5;
        this.parentCatName = str3;
        this.spent = bigDecimal3;
        this.value = bigDecimal4;
        this.errorDictionaryKey = str6;
        this.error = j3;
        this.orderNo = num;
    }

    public static /* synthetic */ BudgetEntity copy$default(BudgetEntity budgetEntity, long j, long j2, Long l, String str, boolean z, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, long j3, Integer num, int i, Object obj) {
        BudgetEntity budgetEntity2 = budgetEntity;
        int i2 = i;
        return budgetEntity.copy((i2 & 1) != 0 ? budgetEntity2.f56453id : j, (i2 & 2) != 0 ? budgetEntity2.catId : j2, (i2 & 4) != 0 ? budgetEntity2.parentCatId : l, (i2 & 8) != 0 ? budgetEntity2.color : str, (i2 & 16) != 0 ? budgetEntity2.isCatIncome : z, (i2 & 32) != 0 ? budgetEntity2.name : str2, (i2 & 64) != 0 ? budgetEntity2.parentCatName : str3, (i2 & 128) != 0 ? budgetEntity2.spent : bigDecimal, (i2 & C11398b.f33139r) != 0 ? budgetEntity2.value : bigDecimal2, (i2 & C11398b.f33140s) != 0 ? budgetEntity2.errorDictionaryKey : str4, (i2 & C11398b.f33141t) != 0 ? budgetEntity2.error : j3, (i2 & C11398b.f33142u) != 0 ? budgetEntity2.orderNo : num);
    }

    public final long component1() {
        return this.f56453id;
    }

    public final String component10() {
        return this.errorDictionaryKey;
    }

    public final long component11() {
        return this.error;
    }

    public final Integer component12() {
        return this.orderNo;
    }

    public final long component2() {
        return this.catId;
    }

    public final Long component3() {
        return this.parentCatId;
    }

    public final String component4() {
        return this.color;
    }

    public final boolean component5() {
        return this.isCatIncome;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.parentCatName;
    }

    public final BigDecimal component8() {
        return this.spent;
    }

    public final BigDecimal component9() {
        return this.value;
    }

    public final BudgetEntity copy(long j, long j2, Long l, String str, boolean z, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, long j3, Integer num) {
        String str5 = str;
        C41536l.m120489i(str5, "color");
        String str6 = str2;
        C41536l.m120489i(str6, "name");
        BigDecimal bigDecimal3 = bigDecimal;
        C41536l.m120489i(bigDecimal3, "spent");
        BigDecimal bigDecimal4 = bigDecimal2;
        C41536l.m120489i(bigDecimal4, C11755a.C11756a.f34100b);
        String str7 = str4;
        C41536l.m120489i(str7, "errorDictionaryKey");
        return new BudgetEntity(j, j2, l, str5, z, str6, str3, bigDecimal3, bigDecimal4, str7, j3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BudgetEntity)) {
            return false;
        }
        BudgetEntity budgetEntity = (BudgetEntity) obj;
        return this.f56453id == budgetEntity.f56453id && this.catId == budgetEntity.catId && C41536l.m120484d(this.parentCatId, budgetEntity.parentCatId) && C41536l.m120484d(this.color, budgetEntity.color) && this.isCatIncome == budgetEntity.isCatIncome && C41536l.m120484d(this.name, budgetEntity.name) && C41536l.m120484d(this.parentCatName, budgetEntity.parentCatName) && C41536l.m120484d(this.spent, budgetEntity.spent) && C41536l.m120484d(this.value, budgetEntity.value) && C41536l.m120484d(this.errorDictionaryKey, budgetEntity.errorDictionaryKey) && this.error == budgetEntity.error && C41536l.m120484d(this.orderNo, budgetEntity.orderNo);
    }

    public final long getCatId() {
        return this.catId;
    }

    public final String getColor() {
        return this.color;
    }

    public final long getError() {
        return this.error;
    }

    public final String getErrorDictionaryKey() {
        return this.errorDictionaryKey;
    }

    public final long getId() {
        return this.f56453id;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public final Long getParentCatId() {
        return this.parentCatId;
    }

    public final String getParentCatName() {
        return this.parentCatName;
    }

    public final BigDecimal getSpent() {
        return this.spent;
    }

    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f56453id) * 31) + C7397t.m28148a(this.catId)) * 31;
        Long l = this.parentCatId;
        int i = 0;
        int hashCode = (((a + (l == null ? 0 : l.hashCode())) * 31) + this.color.hashCode()) * 31;
        boolean z = this.isCatIncome;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.name.hashCode()) * 31;
        String str = this.parentCatName;
        int hashCode3 = (((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.spent.hashCode()) * 31) + this.value.hashCode()) * 31) + this.errorDictionaryKey.hashCode()) * 31) + C7397t.m28148a(this.error)) * 31;
        Integer num = this.orderNo;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public final boolean isCatIncome() {
        return this.isCatIncome;
    }

    public String toString() {
        long j = this.f56453id;
        long j2 = this.catId;
        Long l = this.parentCatId;
        String str = this.color;
        boolean z = this.isCatIncome;
        String str2 = this.name;
        String str3 = this.parentCatName;
        BigDecimal bigDecimal = this.spent;
        BigDecimal bigDecimal2 = this.value;
        String str4 = this.errorDictionaryKey;
        long j3 = this.error;
        Integer num = this.orderNo;
        return "BudgetEntity(id=" + j + ", catId=" + j2 + ", parentCatId=" + l + ", color=" + str + ", isCatIncome=" + z + ", name=" + str2 + ", parentCatName=" + str3 + ", spent=" + bigDecimal + ", value=" + bigDecimal2 + ", errorDictionaryKey=" + str4 + ", error=" + j3 + ", orderNo=" + num + ")";
    }
}
