package p341ge.bog.mobilebank.cleanarch.data.p764zk.entity;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.zk.entity.UmtsCardsApiModel */
public final class UmtsCardsApiModel {
    private final Map<String, ArrayList<UmtsCardApiEntity>> cards;
    private final String customUrl;

    public UmtsCardsApiModel(Map<String, ? extends ArrayList<UmtsCardApiEntity>> map, String str) {
        C41536l.m120489i(map, "cards");
        this.cards = map;
        this.customUrl = str;
    }

    public static /* synthetic */ UmtsCardsApiModel copy$default(UmtsCardsApiModel umtsCardsApiModel, Map<String, ArrayList<UmtsCardApiEntity>> map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = umtsCardsApiModel.cards;
        }
        if ((i & 2) != 0) {
            str = umtsCardsApiModel.customUrl;
        }
        return umtsCardsApiModel.copy(map, str);
    }

    public final Map<String, ArrayList<UmtsCardApiEntity>> component1() {
        return this.cards;
    }

    public final String component2() {
        return this.customUrl;
    }

    public final UmtsCardsApiModel copy(Map<String, ? extends ArrayList<UmtsCardApiEntity>> map, String str) {
        C41536l.m120489i(map, "cards");
        return new UmtsCardsApiModel(map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmtsCardsApiModel)) {
            return false;
        }
        UmtsCardsApiModel umtsCardsApiModel = (UmtsCardsApiModel) obj;
        return C41536l.m120484d(this.cards, umtsCardsApiModel.cards) && C41536l.m120484d(this.customUrl, umtsCardsApiModel.customUrl);
    }

    public final Map<String, ArrayList<UmtsCardApiEntity>> getCards() {
        return this.cards;
    }

    public final String getCustomUrl() {
        return this.customUrl;
    }

    public int hashCode() {
        int hashCode = this.cards.hashCode() * 31;
        String str = this.customUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        Map<String, ArrayList<UmtsCardApiEntity>> map = this.cards;
        String str = this.customUrl;
        return "UmtsCardsApiModel(cards=" + map + ", customUrl=" + str + ")";
    }
}
