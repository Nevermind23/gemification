package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplCategoryWithMerchantsApiEntity */
public final class BnplCategoryWithMerchantsApiEntity {
    @C8664c("categoryDescEn")
    private String categoryDescEn;
    @C8664c("categoryDescGe")
    private String categoryDescGe;
    @C8664c("categoryId")
    private Long categoryId;
    @C8664c("dictionaryKey")
    private String dictionaryKey;
    @C8664c("merchants")
    private List<BnplMerchantApiEntity> merchants;

    public BnplCategoryWithMerchantsApiEntity(Long l, String str, String str2, String str3, List<BnplMerchantApiEntity> list) {
        this.categoryId = l;
        this.categoryDescGe = str;
        this.categoryDescEn = str2;
        this.dictionaryKey = str3;
        this.merchants = list;
    }

    public static /* synthetic */ BnplCategoryWithMerchantsApiEntity copy$default(BnplCategoryWithMerchantsApiEntity bnplCategoryWithMerchantsApiEntity, Long l, String str, String str2, String str3, List<BnplMerchantApiEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = bnplCategoryWithMerchantsApiEntity.categoryId;
        }
        if ((i & 2) != 0) {
            str = bnplCategoryWithMerchantsApiEntity.categoryDescGe;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = bnplCategoryWithMerchantsApiEntity.categoryDescEn;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = bnplCategoryWithMerchantsApiEntity.dictionaryKey;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = bnplCategoryWithMerchantsApiEntity.merchants;
        }
        return bnplCategoryWithMerchantsApiEntity.copy(l, str4, str5, str6, list);
    }

    public final Long component1() {
        return this.categoryId;
    }

    public final String component2() {
        return this.categoryDescGe;
    }

    public final String component3() {
        return this.categoryDescEn;
    }

    public final String component4() {
        return this.dictionaryKey;
    }

    public final List<BnplMerchantApiEntity> component5() {
        return this.merchants;
    }

    public final BnplCategoryWithMerchantsApiEntity copy(Long l, String str, String str2, String str3, List<BnplMerchantApiEntity> list) {
        return new BnplCategoryWithMerchantsApiEntity(l, str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplCategoryWithMerchantsApiEntity)) {
            return false;
        }
        BnplCategoryWithMerchantsApiEntity bnplCategoryWithMerchantsApiEntity = (BnplCategoryWithMerchantsApiEntity) obj;
        return C41536l.m120484d(this.categoryId, bnplCategoryWithMerchantsApiEntity.categoryId) && C41536l.m120484d(this.categoryDescGe, bnplCategoryWithMerchantsApiEntity.categoryDescGe) && C41536l.m120484d(this.categoryDescEn, bnplCategoryWithMerchantsApiEntity.categoryDescEn) && C41536l.m120484d(this.dictionaryKey, bnplCategoryWithMerchantsApiEntity.dictionaryKey) && C41536l.m120484d(this.merchants, bnplCategoryWithMerchantsApiEntity.merchants);
    }

    public final String getCategoryDescEn() {
        return this.categoryDescEn;
    }

    public final String getCategoryDescGe() {
        return this.categoryDescGe;
    }

    public final Long getCategoryId() {
        return this.categoryId;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final List<BnplMerchantApiEntity> getMerchants() {
        return this.merchants;
    }

    public int hashCode() {
        Long l = this.categoryId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.categoryDescGe;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.categoryDescEn;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dictionaryKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BnplMerchantApiEntity> list = this.merchants;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setCategoryDescEn(String str) {
        this.categoryDescEn = str;
    }

    public final void setCategoryDescGe(String str) {
        this.categoryDescGe = str;
    }

    public final void setCategoryId(Long l) {
        this.categoryId = l;
    }

    public final void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public final void setMerchants(List<BnplMerchantApiEntity> list) {
        this.merchants = list;
    }

    public String toString() {
        Long l = this.categoryId;
        String str = this.categoryDescGe;
        String str2 = this.categoryDescEn;
        String str3 = this.dictionaryKey;
        List<BnplMerchantApiEntity> list = this.merchants;
        return "BnplCategoryWithMerchantsApiEntity(categoryId=" + l + ", categoryDescGe=" + str + ", categoryDescEn=" + str2 + ", dictionaryKey=" + str3 + ", merchants=" + list + ")";
    }
}
