package p819ls;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityDetailApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityPointApiEntity;
import p739dv.C20102a;
import p739dv.C20103b;
import p739dv.C20104c;

/* renamed from: ls.a */
public final class C26061a {

    /* renamed from: ls.a$a */
    public static final class C26062a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Long.valueOf(((AssetLiabilityPointApiEntity) obj).getOrderNo()), Long.valueOf(((AssetLiabilityPointApiEntity) obj2).getOrderNo()));
        }
    }

    /* renamed from: a */
    public final C20102a mo64977a(AssetLiabilityApiEntity assetLiabilityApiEntity) {
        C41536l.m120489i(assetLiabilityApiEntity, "assetLiability");
        List<AssetLiabilityPointApiEntity> t0 = C41358y.m120030t0(assetLiabilityApiEntity.getPoints(), new C26062a());
        ArrayList arrayList = new ArrayList(C41343r.m119925u(t0, 10));
        for (AssetLiabilityPointApiEntity c : t0) {
            arrayList.add(mo64979c(c));
        }
        List<AssetLiabilityDetailApiEntity> assets = assetLiabilityApiEntity.getAssets();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(assets, 10));
        for (AssetLiabilityDetailApiEntity b : assets) {
            arrayList2.add(mo64978b(b));
        }
        List<AssetLiabilityDetailApiEntity> liabilities = assetLiabilityApiEntity.getLiabilities();
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(liabilities, 10));
        for (AssetLiabilityDetailApiEntity b2 : liabilities) {
            arrayList3.add(mo64978b(b2));
        }
        List<AssetLiabilityDetailApiEntity> availableAmounts = assetLiabilityApiEntity.getAvailableAmounts();
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(availableAmounts, 10));
        for (AssetLiabilityDetailApiEntity b3 : availableAmounts) {
            arrayList4.add(mo64978b(b3));
        }
        return new C20102a(arrayList, arrayList2, arrayList3, arrayList4);
    }

    /* renamed from: b */
    public final C20103b mo64978b(AssetLiabilityDetailApiEntity assetLiabilityDetailApiEntity) {
        C41536l.m120489i(assetLiabilityDetailApiEntity, "assetLiabilityDetail");
        return new C20103b(assetLiabilityDetailApiEntity.getProductType(), assetLiabilityDetailApiEntity.getAmountBase(), assetLiabilityDetailApiEntity.getDictionaryKey());
    }

    /* renamed from: c */
    public final C20104c mo64979c(AssetLiabilityPointApiEntity assetLiabilityPointApiEntity) {
        C41536l.m120489i(assetLiabilityPointApiEntity, "assetLiabilityPoint");
        return new C20104c(assetLiabilityPointApiEntity.getId(), assetLiabilityPointApiEntity.getDictionaryKey(), assetLiabilityPointApiEntity.getOrderNo(), assetLiabilityPointApiEntity.getAmount(), assetLiabilityPointApiEntity.getFormat(), assetLiabilityPointApiEntity.getScoolcardFlag(), assetLiabilityPointApiEntity.getFirstName(), assetLiabilityPointApiEntity.getProdType(), assetLiabilityPointApiEntity.getAmountInGel());
    }
}
