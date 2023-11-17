package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.OpenBankAccountRowApiModel */
public final class OpenBankAccountRowApiModel {
    private final BalanceAmountApiModel balanceSummary;
    private final List<OpenBankAccountBalanceApiModel> balances;
    private final String cashAccountType;
    private final String currency;
    private final String iban;
    private final String name;
    private final String product;
    private final String resourceId;

    public OpenBankAccountRowApiModel(String str, String str2, String str3, String str4, String str5, String str6, BalanceAmountApiModel balanceAmountApiModel, List<OpenBankAccountBalanceApiModel> list) {
        C41536l.m120489i(str, "resourceId");
        C41536l.m120489i(str2, "iban");
        C41536l.m120489i(str3, "currency");
        C41536l.m120489i(str5, "cashAccountType");
        this.resourceId = str;
        this.iban = str2;
        this.currency = str3;
        this.product = str4;
        this.cashAccountType = str5;
        this.name = str6;
        this.balanceSummary = balanceAmountApiModel;
        this.balances = list;
    }

    public static /* synthetic */ OpenBankAccountRowApiModel copy$default(OpenBankAccountRowApiModel openBankAccountRowApiModel, String str, String str2, String str3, String str4, String str5, String str6, BalanceAmountApiModel balanceAmountApiModel, List list, int i, Object obj) {
        OpenBankAccountRowApiModel openBankAccountRowApiModel2 = openBankAccountRowApiModel;
        int i2 = i;
        return openBankAccountRowApiModel.copy((i2 & 1) != 0 ? openBankAccountRowApiModel2.resourceId : str, (i2 & 2) != 0 ? openBankAccountRowApiModel2.iban : str2, (i2 & 4) != 0 ? openBankAccountRowApiModel2.currency : str3, (i2 & 8) != 0 ? openBankAccountRowApiModel2.product : str4, (i2 & 16) != 0 ? openBankAccountRowApiModel2.cashAccountType : str5, (i2 & 32) != 0 ? openBankAccountRowApiModel2.name : str6, (i2 & 64) != 0 ? openBankAccountRowApiModel2.balanceSummary : balanceAmountApiModel, (i2 & 128) != 0 ? openBankAccountRowApiModel2.balances : list);
    }

    public final String component1() {
        return this.resourceId;
    }

    public final String component2() {
        return this.iban;
    }

    public final String component3() {
        return this.currency;
    }

    public final String component4() {
        return this.product;
    }

    public final String component5() {
        return this.cashAccountType;
    }

    public final String component6() {
        return this.name;
    }

    public final BalanceAmountApiModel component7() {
        return this.balanceSummary;
    }

    public final List<OpenBankAccountBalanceApiModel> component8() {
        return this.balances;
    }

    public final OpenBankAccountRowApiModel copy(String str, String str2, String str3, String str4, String str5, String str6, BalanceAmountApiModel balanceAmountApiModel, List<OpenBankAccountBalanceApiModel> list) {
        C41536l.m120489i(str, "resourceId");
        C41536l.m120489i(str2, "iban");
        C41536l.m120489i(str3, "currency");
        C41536l.m120489i(str5, "cashAccountType");
        return new OpenBankAccountRowApiModel(str, str2, str3, str4, str5, str6, balanceAmountApiModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenBankAccountRowApiModel)) {
            return false;
        }
        OpenBankAccountRowApiModel openBankAccountRowApiModel = (OpenBankAccountRowApiModel) obj;
        return C41536l.m120484d(this.resourceId, openBankAccountRowApiModel.resourceId) && C41536l.m120484d(this.iban, openBankAccountRowApiModel.iban) && C41536l.m120484d(this.currency, openBankAccountRowApiModel.currency) && C41536l.m120484d(this.product, openBankAccountRowApiModel.product) && C41536l.m120484d(this.cashAccountType, openBankAccountRowApiModel.cashAccountType) && C41536l.m120484d(this.name, openBankAccountRowApiModel.name) && C41536l.m120484d(this.balanceSummary, openBankAccountRowApiModel.balanceSummary) && C41536l.m120484d(this.balances, openBankAccountRowApiModel.balances);
    }

    public final BalanceAmountApiModel getBalanceSummary() {
        return this.balanceSummary;
    }

    public final List<OpenBankAccountBalanceApiModel> getBalances() {
        return this.balances;
    }

    public final String getCashAccountType() {
        return this.cashAccountType;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getIban() {
        return this.iban;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public int hashCode() {
        int hashCode = ((((this.resourceId.hashCode() * 31) + this.iban.hashCode()) * 31) + this.currency.hashCode()) * 31;
        String str = this.product;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cashAccountType.hashCode()) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BalanceAmountApiModel balanceAmountApiModel = this.balanceSummary;
        int hashCode4 = (hashCode3 + (balanceAmountApiModel == null ? 0 : balanceAmountApiModel.hashCode())) * 31;
        List<OpenBankAccountBalanceApiModel> list = this.balances;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.resourceId;
        String str2 = this.iban;
        String str3 = this.currency;
        String str4 = this.product;
        String str5 = this.cashAccountType;
        String str6 = this.name;
        BalanceAmountApiModel balanceAmountApiModel = this.balanceSummary;
        List<OpenBankAccountBalanceApiModel> list = this.balances;
        return "OpenBankAccountRowApiModel(resourceId=" + str + ", iban=" + str2 + ", currency=" + str3 + ", product=" + str4 + ", cashAccountType=" + str5 + ", name=" + str6 + ", balanceSummary=" + balanceAmountApiModel + ", balances=" + list + ")";
    }
}
