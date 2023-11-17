package p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsAndCurrenciesApiEntity */
public final class TransferAccountsAndCurrenciesApiEntity {
    private final List<TransferAccountItemApiEntity> accounts;
    private final String conversionDescriptionKey;
    private final List<TransferCurrencyItemApiEntity> currencies;
    private final boolean isRateCampaignActive;

    public TransferAccountsAndCurrenciesApiEntity(List<TransferAccountItemApiEntity> list, List<TransferCurrencyItemApiEntity> list2, String str, boolean z) {
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(list2, "currencies");
        C41536l.m120489i(str, "conversionDescriptionKey");
        this.accounts = list;
        this.currencies = list2;
        this.conversionDescriptionKey = str;
        this.isRateCampaignActive = z;
    }

    public static /* synthetic */ TransferAccountsAndCurrenciesApiEntity copy$default(TransferAccountsAndCurrenciesApiEntity transferAccountsAndCurrenciesApiEntity, List<TransferAccountItemApiEntity> list, List<TransferCurrencyItemApiEntity> list2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transferAccountsAndCurrenciesApiEntity.accounts;
        }
        if ((i & 2) != 0) {
            list2 = transferAccountsAndCurrenciesApiEntity.currencies;
        }
        if ((i & 4) != 0) {
            str = transferAccountsAndCurrenciesApiEntity.conversionDescriptionKey;
        }
        if ((i & 8) != 0) {
            z = transferAccountsAndCurrenciesApiEntity.isRateCampaignActive;
        }
        return transferAccountsAndCurrenciesApiEntity.copy(list, list2, str, z);
    }

    public final List<TransferAccountItemApiEntity> component1() {
        return this.accounts;
    }

    public final List<TransferCurrencyItemApiEntity> component2() {
        return this.currencies;
    }

    public final String component3() {
        return this.conversionDescriptionKey;
    }

    public final boolean component4() {
        return this.isRateCampaignActive;
    }

    public final TransferAccountsAndCurrenciesApiEntity copy(List<TransferAccountItemApiEntity> list, List<TransferCurrencyItemApiEntity> list2, String str, boolean z) {
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(list2, "currencies");
        C41536l.m120489i(str, "conversionDescriptionKey");
        return new TransferAccountsAndCurrenciesApiEntity(list, list2, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAccountsAndCurrenciesApiEntity)) {
            return false;
        }
        TransferAccountsAndCurrenciesApiEntity transferAccountsAndCurrenciesApiEntity = (TransferAccountsAndCurrenciesApiEntity) obj;
        return C41536l.m120484d(this.accounts, transferAccountsAndCurrenciesApiEntity.accounts) && C41536l.m120484d(this.currencies, transferAccountsAndCurrenciesApiEntity.currencies) && C41536l.m120484d(this.conversionDescriptionKey, transferAccountsAndCurrenciesApiEntity.conversionDescriptionKey) && this.isRateCampaignActive == transferAccountsAndCurrenciesApiEntity.isRateCampaignActive;
    }

    public final List<TransferAccountItemApiEntity> getAccounts() {
        return this.accounts;
    }

    public final String getConversionDescriptionKey() {
        return this.conversionDescriptionKey;
    }

    public final List<TransferCurrencyItemApiEntity> getCurrencies() {
        return this.currencies;
    }

    public int hashCode() {
        int hashCode = ((((this.accounts.hashCode() * 31) + this.currencies.hashCode()) * 31) + this.conversionDescriptionKey.hashCode()) * 31;
        boolean z = this.isRateCampaignActive;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isRateCampaignActive() {
        return this.isRateCampaignActive;
    }

    public String toString() {
        List<TransferAccountItemApiEntity> list = this.accounts;
        List<TransferCurrencyItemApiEntity> list2 = this.currencies;
        String str = this.conversionDescriptionKey;
        boolean z = this.isRateCampaignActive;
        return "TransferAccountsAndCurrenciesApiEntity(accounts=" + list + ", currencies=" + list2 + ", conversionDescriptionKey=" + str + ", isRateCampaignActive=" + z + ")";
    }
}
