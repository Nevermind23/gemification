package p341ge.bog.mobilebank.products.data;

import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.mapper.LiabilityInfoMapper;
import p341ge.bog.mobilebank.products.data.model.LiabilityOverdueInfoApiModel;
import p70.C27239a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.data.ProductsRepositoryImpl$getLiabilitiesOverdueDetails$1 */
/* synthetic */ class ProductsRepositoryImpl$getLiabilitiesOverdueDetails$1 extends C41535k implements C43075l {
    ProductsRepositoryImpl$getLiabilitiesOverdueDetails$1(Object obj) {
        super(1, obj, LiabilityInfoMapper.class, "convert", "convert(Lge/bog/mobilebank/products/data/model/LiabilityOverdueInfoApiModel;)Lge/bog/mobilebank/cleanarch/shareddomain/model/liabilityoverdue/LiabilityOverdueInfo;", 0);
    }

    public final C27239a invoke(LiabilityOverdueInfoApiModel liabilityOverdueInfoApiModel) {
        C41536l.m120489i(liabilityOverdueInfoApiModel, "p0");
        return ((LiabilityInfoMapper) this.receiver).convert(liabilityOverdueInfoApiModel);
    }
}
