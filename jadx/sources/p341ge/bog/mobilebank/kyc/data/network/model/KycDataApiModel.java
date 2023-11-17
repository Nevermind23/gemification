package p341ge.bog.mobilebank.kyc.data.network.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.kyc.data.network.model.KycDataApiModel */
public final class KycDataApiModel {
    private final Client client;
    private final List<QuestActivities> questActivities;
    private final List<QuestCountry> questCountry;
    private final List<QuestPositions> questPositions;
    private final List<QuestSourceAmount> questSourceAmount;
    private final List<QuestSourceProperty> questSourceProperty;

    public KycDataApiModel(List<QuestSourceAmount> list, Client client2, List<QuestSourceProperty> list2, List<QuestCountry> list3, List<QuestActivities> list4, List<QuestPositions> list5) {
        C41536l.m120489i(list, "questSourceAmount");
        C41536l.m120489i(client2, "client");
        C41536l.m120489i(list2, "questSourceProperty");
        C41536l.m120489i(list3, "questCountry");
        C41536l.m120489i(list4, "questActivities");
        C41536l.m120489i(list5, "questPositions");
        this.questSourceAmount = list;
        this.client = client2;
        this.questSourceProperty = list2;
        this.questCountry = list3;
        this.questActivities = list4;
        this.questPositions = list5;
    }

    public static /* synthetic */ KycDataApiModel copy$default(KycDataApiModel kycDataApiModel, List<QuestSourceAmount> list, Client client2, List<QuestSourceProperty> list2, List<QuestCountry> list3, List<QuestActivities> list4, List<QuestPositions> list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kycDataApiModel.questSourceAmount;
        }
        if ((i & 2) != 0) {
            client2 = kycDataApiModel.client;
        }
        Client client3 = client2;
        if ((i & 4) != 0) {
            list2 = kycDataApiModel.questSourceProperty;
        }
        List<QuestSourceProperty> list6 = list2;
        if ((i & 8) != 0) {
            list3 = kycDataApiModel.questCountry;
        }
        List<QuestCountry> list7 = list3;
        if ((i & 16) != 0) {
            list4 = kycDataApiModel.questActivities;
        }
        List<QuestActivities> list8 = list4;
        if ((i & 32) != 0) {
            list5 = kycDataApiModel.questPositions;
        }
        return kycDataApiModel.copy(list, client3, list6, list7, list8, list5);
    }

    public final List<QuestSourceAmount> component1() {
        return this.questSourceAmount;
    }

    public final Client component2() {
        return this.client;
    }

    public final List<QuestSourceProperty> component3() {
        return this.questSourceProperty;
    }

    public final List<QuestCountry> component4() {
        return this.questCountry;
    }

    public final List<QuestActivities> component5() {
        return this.questActivities;
    }

    public final List<QuestPositions> component6() {
        return this.questPositions;
    }

    public final KycDataApiModel copy(List<QuestSourceAmount> list, Client client2, List<QuestSourceProperty> list2, List<QuestCountry> list3, List<QuestActivities> list4, List<QuestPositions> list5) {
        C41536l.m120489i(list, "questSourceAmount");
        C41536l.m120489i(client2, "client");
        C41536l.m120489i(list2, "questSourceProperty");
        C41536l.m120489i(list3, "questCountry");
        C41536l.m120489i(list4, "questActivities");
        C41536l.m120489i(list5, "questPositions");
        return new KycDataApiModel(list, client2, list2, list3, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDataApiModel)) {
            return false;
        }
        KycDataApiModel kycDataApiModel = (KycDataApiModel) obj;
        return C41536l.m120484d(this.questSourceAmount, kycDataApiModel.questSourceAmount) && C41536l.m120484d(this.client, kycDataApiModel.client) && C41536l.m120484d(this.questSourceProperty, kycDataApiModel.questSourceProperty) && C41536l.m120484d(this.questCountry, kycDataApiModel.questCountry) && C41536l.m120484d(this.questActivities, kycDataApiModel.questActivities) && C41536l.m120484d(this.questPositions, kycDataApiModel.questPositions);
    }

    public final Client getClient() {
        return this.client;
    }

    public final List<QuestActivities> getQuestActivities() {
        return this.questActivities;
    }

    public final List<QuestCountry> getQuestCountry() {
        return this.questCountry;
    }

    public final List<QuestPositions> getQuestPositions() {
        return this.questPositions;
    }

    public final List<QuestSourceAmount> getQuestSourceAmount() {
        return this.questSourceAmount;
    }

    public final List<QuestSourceProperty> getQuestSourceProperty() {
        return this.questSourceProperty;
    }

    public int hashCode() {
        return (((((((((this.questSourceAmount.hashCode() * 31) + this.client.hashCode()) * 31) + this.questSourceProperty.hashCode()) * 31) + this.questCountry.hashCode()) * 31) + this.questActivities.hashCode()) * 31) + this.questPositions.hashCode();
    }

    public String toString() {
        List<QuestSourceAmount> list = this.questSourceAmount;
        Client client2 = this.client;
        List<QuestSourceProperty> list2 = this.questSourceProperty;
        List<QuestCountry> list3 = this.questCountry;
        List<QuestActivities> list4 = this.questActivities;
        List<QuestPositions> list5 = this.questPositions;
        return "KycDataApiModel(questSourceAmount=" + list + ", client=" + client2 + ", questSourceProperty=" + list2 + ", questCountry=" + list3 + ", questActivities=" + list4 + ", questPositions=" + list5 + ")";
    }
}
