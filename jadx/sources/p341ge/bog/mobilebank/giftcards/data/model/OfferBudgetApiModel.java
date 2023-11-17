package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.OfferBudgetApiModel */
public final class OfferBudgetApiModel {
    private final List<Double> fixedAmounts;
    private final Integer maxCapAmount;
    private final String maxCapCcy;

    public OfferBudgetApiModel(List<Double> list, Integer num, String str) {
        this.fixedAmounts = list;
        this.maxCapAmount = num;
        this.maxCapCcy = str;
    }

    public static /* synthetic */ OfferBudgetApiModel copy$default(OfferBudgetApiModel offerBudgetApiModel, List<Double> list, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = offerBudgetApiModel.fixedAmounts;
        }
        if ((i & 2) != 0) {
            num = offerBudgetApiModel.maxCapAmount;
        }
        if ((i & 4) != 0) {
            str = offerBudgetApiModel.maxCapCcy;
        }
        return offerBudgetApiModel.copy(list, num, str);
    }

    public final List<Double> component1() {
        return this.fixedAmounts;
    }

    public final Integer component2() {
        return this.maxCapAmount;
    }

    public final String component3() {
        return this.maxCapCcy;
    }

    public final OfferBudgetApiModel copy(List<Double> list, Integer num, String str) {
        return new OfferBudgetApiModel(list, num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferBudgetApiModel)) {
            return false;
        }
        OfferBudgetApiModel offerBudgetApiModel = (OfferBudgetApiModel) obj;
        return C41536l.m120484d(this.fixedAmounts, offerBudgetApiModel.fixedAmounts) && C41536l.m120484d(this.maxCapAmount, offerBudgetApiModel.maxCapAmount) && C41536l.m120484d(this.maxCapCcy, offerBudgetApiModel.maxCapCcy);
    }

    public final List<Double> getFixedAmounts() {
        return this.fixedAmounts;
    }

    public final Integer getMaxCapAmount() {
        return this.maxCapAmount;
    }

    public final String getMaxCapCcy() {
        return this.maxCapCcy;
    }

    public int hashCode() {
        List<Double> list = this.fixedAmounts;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.maxCapAmount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.maxCapCcy;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        List<Double> list = this.fixedAmounts;
        Integer num = this.maxCapAmount;
        String str = this.maxCapCcy;
        return "OfferBudgetApiModel(fixedAmounts=" + list + ", maxCapAmount=" + num + ", maxCapCcy=" + str + ")";
    }
}
