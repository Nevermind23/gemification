package p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetUpdateEntity */
public final class BudgetUpdateEntity {
    private final long catId;
    private final String errorDictionaryKey;

    /* renamed from: id */
    private final Long f56454id;
    private final float value;

    public BudgetUpdateEntity(Long l, long j, float f, String str) {
        this.f56454id = l;
        this.catId = j;
        this.value = f;
        this.errorDictionaryKey = str;
    }

    public static /* synthetic */ BudgetUpdateEntity copy$default(BudgetUpdateEntity budgetUpdateEntity, Long l, long j, float f, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = budgetUpdateEntity.f56454id;
        }
        if ((i & 2) != 0) {
            j = budgetUpdateEntity.catId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = budgetUpdateEntity.value;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            str = budgetUpdateEntity.errorDictionaryKey;
        }
        return budgetUpdateEntity.copy(l, j2, f2, str);
    }

    public final Long component1() {
        return this.f56454id;
    }

    public final long component2() {
        return this.catId;
    }

    public final float component3() {
        return this.value;
    }

    public final String component4() {
        return this.errorDictionaryKey;
    }

    public final BudgetUpdateEntity copy(Long l, long j, float f, String str) {
        return new BudgetUpdateEntity(l, j, f, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BudgetUpdateEntity)) {
            return false;
        }
        BudgetUpdateEntity budgetUpdateEntity = (BudgetUpdateEntity) obj;
        return C41536l.m120484d(this.f56454id, budgetUpdateEntity.f56454id) && this.catId == budgetUpdateEntity.catId && Float.compare(this.value, budgetUpdateEntity.value) == 0 && C41536l.m120484d(this.errorDictionaryKey, budgetUpdateEntity.errorDictionaryKey);
    }

    public final long getCatId() {
        return this.catId;
    }

    public final String getErrorDictionaryKey() {
        return this.errorDictionaryKey;
    }

    public final Long getId() {
        return this.f56454id;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        Long l = this.f56454id;
        int i = 0;
        int hashCode = (((((l == null ? 0 : l.hashCode()) * 31) + C7397t.m28148a(this.catId)) * 31) + Float.floatToIntBits(this.value)) * 31;
        String str = this.errorDictionaryKey;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Long l = this.f56454id;
        long j = this.catId;
        float f = this.value;
        String str = this.errorDictionaryKey;
        return "BudgetUpdateEntity(id=" + l + ", catId=" + j + ", value=" + f + ", errorDictionaryKey=" + str + ")";
    }
}
