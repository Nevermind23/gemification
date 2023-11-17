package p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryEntity */
public final class TransactionCategoryEntity {
    private final boolean catComputable;
    private final String catHexrgbcolor;
    private final long catId;
    private final boolean catIsCustom;
    private final boolean catIsIncome;
    private final Boolean catIsbudgetizable;
    private final String catKey;
    private final int catLevel;
    private final String catName;
    private final Integer catOrder;
    private final List<TransactionCategoryEntity> categories;
    private final Long parentCatId;

    public TransactionCategoryEntity(boolean z, String str, long j, boolean z2, boolean z3, Boolean bool, String str2, int i, String str3, Integer num, Long l, List<TransactionCategoryEntity> list) {
        C41536l.m120489i(str, "catHexrgbcolor");
        C41536l.m120489i(str2, "catKey");
        C41536l.m120489i(str3, "catName");
        this.catComputable = z;
        this.catHexrgbcolor = str;
        this.catId = j;
        this.catIsCustom = z2;
        this.catIsIncome = z3;
        this.catIsbudgetizable = bool;
        this.catKey = str2;
        this.catLevel = i;
        this.catName = str3;
        this.catOrder = num;
        this.parentCatId = l;
        this.categories = list;
    }

    public static /* synthetic */ TransactionCategoryEntity copy$default(TransactionCategoryEntity transactionCategoryEntity, boolean z, String str, long j, boolean z2, boolean z3, Boolean bool, String str2, int i, String str3, Integer num, Long l, List list, int i2, Object obj) {
        TransactionCategoryEntity transactionCategoryEntity2 = transactionCategoryEntity;
        int i3 = i2;
        return transactionCategoryEntity.copy((i3 & 1) != 0 ? transactionCategoryEntity2.catComputable : z, (i3 & 2) != 0 ? transactionCategoryEntity2.catHexrgbcolor : str, (i3 & 4) != 0 ? transactionCategoryEntity2.catId : j, (i3 & 8) != 0 ? transactionCategoryEntity2.catIsCustom : z2, (i3 & 16) != 0 ? transactionCategoryEntity2.catIsIncome : z3, (i3 & 32) != 0 ? transactionCategoryEntity2.catIsbudgetizable : bool, (i3 & 64) != 0 ? transactionCategoryEntity2.catKey : str2, (i3 & 128) != 0 ? transactionCategoryEntity2.catLevel : i, (i3 & C11398b.f33139r) != 0 ? transactionCategoryEntity2.catName : str3, (i3 & C11398b.f33140s) != 0 ? transactionCategoryEntity2.catOrder : num, (i3 & C11398b.f33141t) != 0 ? transactionCategoryEntity2.parentCatId : l, (i3 & C11398b.f33142u) != 0 ? transactionCategoryEntity2.categories : list);
    }

    public final boolean component1() {
        return this.catComputable;
    }

    public final Integer component10() {
        return this.catOrder;
    }

    public final Long component11() {
        return this.parentCatId;
    }

    public final List<TransactionCategoryEntity> component12() {
        return this.categories;
    }

    public final String component2() {
        return this.catHexrgbcolor;
    }

    public final long component3() {
        return this.catId;
    }

    public final boolean component4() {
        return this.catIsCustom;
    }

    public final boolean component5() {
        return this.catIsIncome;
    }

    public final Boolean component6() {
        return this.catIsbudgetizable;
    }

    public final String component7() {
        return this.catKey;
    }

    public final int component8() {
        return this.catLevel;
    }

    public final String component9() {
        return this.catName;
    }

    public final TransactionCategoryEntity copy(boolean z, String str, long j, boolean z2, boolean z3, Boolean bool, String str2, int i, String str3, Integer num, Long l, List<TransactionCategoryEntity> list) {
        String str4 = str;
        C41536l.m120489i(str4, "catHexrgbcolor");
        String str5 = str2;
        C41536l.m120489i(str5, "catKey");
        String str6 = str3;
        C41536l.m120489i(str6, "catName");
        return new TransactionCategoryEntity(z, str4, j, z2, z3, bool, str5, i, str6, num, l, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionCategoryEntity)) {
            return false;
        }
        TransactionCategoryEntity transactionCategoryEntity = (TransactionCategoryEntity) obj;
        return this.catComputable == transactionCategoryEntity.catComputable && C41536l.m120484d(this.catHexrgbcolor, transactionCategoryEntity.catHexrgbcolor) && this.catId == transactionCategoryEntity.catId && this.catIsCustom == transactionCategoryEntity.catIsCustom && this.catIsIncome == transactionCategoryEntity.catIsIncome && C41536l.m120484d(this.catIsbudgetizable, transactionCategoryEntity.catIsbudgetizable) && C41536l.m120484d(this.catKey, transactionCategoryEntity.catKey) && this.catLevel == transactionCategoryEntity.catLevel && C41536l.m120484d(this.catName, transactionCategoryEntity.catName) && C41536l.m120484d(this.catOrder, transactionCategoryEntity.catOrder) && C41536l.m120484d(this.parentCatId, transactionCategoryEntity.parentCatId) && C41536l.m120484d(this.categories, transactionCategoryEntity.categories);
    }

    public final boolean getCatComputable() {
        return this.catComputable;
    }

    public final String getCatHexrgbcolor() {
        return this.catHexrgbcolor;
    }

    public final long getCatId() {
        return this.catId;
    }

    public final boolean getCatIsCustom() {
        return this.catIsCustom;
    }

    public final boolean getCatIsIncome() {
        return this.catIsIncome;
    }

    public final Boolean getCatIsbudgetizable() {
        return this.catIsbudgetizable;
    }

    public final String getCatKey() {
        return this.catKey;
    }

    public final int getCatLevel() {
        return this.catLevel;
    }

    public final String getCatName() {
        return this.catName;
    }

    public final Integer getCatOrder() {
        return this.catOrder;
    }

    public final List<TransactionCategoryEntity> getCategories() {
        return this.categories;
    }

    public final Long getParentCatId() {
        return this.parentCatId;
    }

    public int hashCode() {
        boolean z = this.catComputable;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + this.catHexrgbcolor.hashCode()) * 31) + C7397t.m28148a(this.catId)) * 31;
        boolean z3 = this.catIsCustom;
        if (z3) {
            z3 = true;
        }
        int i = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.catIsIncome;
        if (!z4) {
            z2 = z4;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        Boolean bool = this.catIsbudgetizable;
        int i3 = 0;
        int hashCode2 = (((((((i2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.catKey.hashCode()) * 31) + this.catLevel) * 31) + this.catName.hashCode()) * 31;
        Integer num = this.catOrder;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.parentCatId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List<TransactionCategoryEntity> list = this.categories;
        if (list != null) {
            i3 = list.hashCode();
        }
        return hashCode4 + i3;
    }

    public String toString() {
        boolean z = this.catComputable;
        String str = this.catHexrgbcolor;
        long j = this.catId;
        boolean z2 = this.catIsCustom;
        boolean z3 = this.catIsIncome;
        Boolean bool = this.catIsbudgetizable;
        String str2 = this.catKey;
        int i = this.catLevel;
        String str3 = this.catName;
        Integer num = this.catOrder;
        Long l = this.parentCatId;
        List<TransactionCategoryEntity> list = this.categories;
        return "TransactionCategoryEntity(catComputable=" + z + ", catHexrgbcolor=" + str + ", catId=" + j + ", catIsCustom=" + z2 + ", catIsIncome=" + z3 + ", catIsbudgetizable=" + bool + ", catKey=" + str2 + ", catLevel=" + i + ", catName=" + str3 + ", catOrder=" + num + ", parentCatId=" + l + ", categories=" + list + ")";
    }
}
