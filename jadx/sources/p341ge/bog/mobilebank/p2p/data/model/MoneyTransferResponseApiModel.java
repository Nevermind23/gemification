package p341ge.bog.mobilebank.p2p.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.p2p.data.model.MoneyTransferResponseApiModel */
public final class MoneyTransferResponseApiModel {
    private final double amount;
    private final String ccy;
    private final double comAmount;
    private final String comCcy;
    private final String contactName;
    private final String contactPhoneNumber;
    private final String nomination;

    public MoneyTransferResponseApiModel(double d, String str, double d2, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "comCcy");
        C41536l.m120489i(str3, "contactPhoneNumber");
        C41536l.m120489i(str4, "nomination");
        this.amount = d;
        this.ccy = str;
        this.comAmount = d2;
        this.comCcy = str2;
        this.contactPhoneNumber = str3;
        this.nomination = str4;
        this.contactName = str5;
    }

    public static /* synthetic */ MoneyTransferResponseApiModel copy$default(MoneyTransferResponseApiModel moneyTransferResponseApiModel, double d, String str, double d2, String str2, String str3, String str4, String str5, int i, Object obj) {
        MoneyTransferResponseApiModel moneyTransferResponseApiModel2 = moneyTransferResponseApiModel;
        return moneyTransferResponseApiModel.copy((i & 1) != 0 ? moneyTransferResponseApiModel2.amount : d, (i & 2) != 0 ? moneyTransferResponseApiModel2.ccy : str, (i & 4) != 0 ? moneyTransferResponseApiModel2.comAmount : d2, (i & 8) != 0 ? moneyTransferResponseApiModel2.comCcy : str2, (i & 16) != 0 ? moneyTransferResponseApiModel2.contactPhoneNumber : str3, (i & 32) != 0 ? moneyTransferResponseApiModel2.nomination : str4, (i & 64) != 0 ? moneyTransferResponseApiModel2.contactName : str5);
    }

    public final double component1() {
        return this.amount;
    }

    public final String component2() {
        return this.ccy;
    }

    public final double component3() {
        return this.comAmount;
    }

    public final String component4() {
        return this.comCcy;
    }

    public final String component5() {
        return this.contactPhoneNumber;
    }

    public final String component6() {
        return this.nomination;
    }

    public final String component7() {
        return this.contactName;
    }

    public final MoneyTransferResponseApiModel copy(double d, String str, double d2, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "ccy");
        String str6 = str2;
        C41536l.m120489i(str6, "comCcy");
        String str7 = str3;
        C41536l.m120489i(str7, "contactPhoneNumber");
        String str8 = str4;
        C41536l.m120489i(str8, "nomination");
        return new MoneyTransferResponseApiModel(d, str, d2, str6, str7, str8, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferResponseApiModel)) {
            return false;
        }
        MoneyTransferResponseApiModel moneyTransferResponseApiModel = (MoneyTransferResponseApiModel) obj;
        return Double.compare(this.amount, moneyTransferResponseApiModel.amount) == 0 && C41536l.m120484d(this.ccy, moneyTransferResponseApiModel.ccy) && Double.compare(this.comAmount, moneyTransferResponseApiModel.comAmount) == 0 && C41536l.m120484d(this.comCcy, moneyTransferResponseApiModel.comCcy) && C41536l.m120484d(this.contactPhoneNumber, moneyTransferResponseApiModel.contactPhoneNumber) && C41536l.m120484d(this.nomination, moneyTransferResponseApiModel.nomination) && C41536l.m120484d(this.contactName, moneyTransferResponseApiModel.contactName);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final double getComAmount() {
        return this.comAmount;
    }

    public final String getComCcy() {
        return this.comCcy;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final String getContactPhoneNumber() {
        return this.contactPhoneNumber;
    }

    public final String getNomination() {
        return this.nomination;
    }

    public int hashCode() {
        int a = ((((((((((Double.doubleToLongBits(this.amount) * 31) + this.ccy.hashCode()) * 31) + Double.doubleToLongBits(this.comAmount)) * 31) + this.comCcy.hashCode()) * 31) + this.contactPhoneNumber.hashCode()) * 31) + this.nomination.hashCode()) * 31;
        String str = this.contactName;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        double d = this.amount;
        String str = this.ccy;
        double d2 = this.comAmount;
        String str2 = this.comCcy;
        String str3 = this.contactPhoneNumber;
        String str4 = this.nomination;
        String str5 = this.contactName;
        return "MoneyTransferResponseApiModel(amount=" + d + ", ccy=" + str + ", comAmount=" + d2 + ", comCcy=" + str2 + ", contactPhoneNumber=" + str3 + ", nomination=" + str4 + ", contactName=" + str5 + ")";
    }
}
