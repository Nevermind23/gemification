package ke0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.GTMarketInfoApiModel;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.MarketInfo;

/* renamed from: ke0.d */
public final class C25716d {
    /* renamed from: a */
    public final MarketInfo mo64284a(GTMarketInfoApiModel gTMarketInfoApiModel) {
        C41536l.m120489i(gTMarketInfoApiModel, "model");
        return new MarketInfo(gTMarketInfoApiModel.getStatus(), gTMarketInfoApiModel.getNextOpenDate());
    }
}
