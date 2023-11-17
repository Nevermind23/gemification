package p341ge.bog.mobilebank.cleanarch.data.home.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityApiEntity */
public final class AssetLiabilityApiEntity {
    private final List<AssetLiabilityDetailApiEntity> assets;
    private final List<AssetLiabilityDetailApiEntity> availableAmounts;
    private final List<AssetLiabilityDetailApiEntity> liabilities;
    private final List<AssetLiabilityPointApiEntity> points;

    public AssetLiabilityApiEntity(List<AssetLiabilityPointApiEntity> list, List<AssetLiabilityDetailApiEntity> list2, List<AssetLiabilityDetailApiEntity> list3, List<AssetLiabilityDetailApiEntity> list4) {
        C41536l.m120489i(list, "points");
        C41536l.m120489i(list2, "assets");
        C41536l.m120489i(list3, "liabilities");
        C41536l.m120489i(list4, "availableAmounts");
        this.points = list;
        this.assets = list2;
        this.liabilities = list3;
        this.availableAmounts = list4;
    }

    public static /* synthetic */ AssetLiabilityApiEntity copy$default(AssetLiabilityApiEntity assetLiabilityApiEntity, List<AssetLiabilityPointApiEntity> list, List<AssetLiabilityDetailApiEntity> list2, List<AssetLiabilityDetailApiEntity> list3, List<AssetLiabilityDetailApiEntity> list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = assetLiabilityApiEntity.points;
        }
        if ((i & 2) != 0) {
            list2 = assetLiabilityApiEntity.assets;
        }
        if ((i & 4) != 0) {
            list3 = assetLiabilityApiEntity.liabilities;
        }
        if ((i & 8) != 0) {
            list4 = assetLiabilityApiEntity.availableAmounts;
        }
        return assetLiabilityApiEntity.copy(list, list2, list3, list4);
    }

    public final List<AssetLiabilityPointApiEntity> component1() {
        return this.points;
    }

    public final List<AssetLiabilityDetailApiEntity> component2() {
        return this.assets;
    }

    public final List<AssetLiabilityDetailApiEntity> component3() {
        return this.liabilities;
    }

    public final List<AssetLiabilityDetailApiEntity> component4() {
        return this.availableAmounts;
    }

    public final AssetLiabilityApiEntity copy(List<AssetLiabilityPointApiEntity> list, List<AssetLiabilityDetailApiEntity> list2, List<AssetLiabilityDetailApiEntity> list3, List<AssetLiabilityDetailApiEntity> list4) {
        C41536l.m120489i(list, "points");
        C41536l.m120489i(list2, "assets");
        C41536l.m120489i(list3, "liabilities");
        C41536l.m120489i(list4, "availableAmounts");
        return new AssetLiabilityApiEntity(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetLiabilityApiEntity)) {
            return false;
        }
        AssetLiabilityApiEntity assetLiabilityApiEntity = (AssetLiabilityApiEntity) obj;
        return C41536l.m120484d(this.points, assetLiabilityApiEntity.points) && C41536l.m120484d(this.assets, assetLiabilityApiEntity.assets) && C41536l.m120484d(this.liabilities, assetLiabilityApiEntity.liabilities) && C41536l.m120484d(this.availableAmounts, assetLiabilityApiEntity.availableAmounts);
    }

    public final List<AssetLiabilityDetailApiEntity> getAssets() {
        return this.assets;
    }

    public final List<AssetLiabilityDetailApiEntity> getAvailableAmounts() {
        return this.availableAmounts;
    }

    public final List<AssetLiabilityDetailApiEntity> getLiabilities() {
        return this.liabilities;
    }

    public final List<AssetLiabilityPointApiEntity> getPoints() {
        return this.points;
    }

    public int hashCode() {
        return (((((this.points.hashCode() * 31) + this.assets.hashCode()) * 31) + this.liabilities.hashCode()) * 31) + this.availableAmounts.hashCode();
    }

    public String toString() {
        List<AssetLiabilityPointApiEntity> list = this.points;
        List<AssetLiabilityDetailApiEntity> list2 = this.assets;
        List<AssetLiabilityDetailApiEntity> list3 = this.liabilities;
        List<AssetLiabilityDetailApiEntity> list4 = this.availableAmounts;
        return "AssetLiabilityApiEntity(points=" + list + ", assets=" + list2 + ", liabilities=" + list3 + ", availableAmounts=" + list4 + ")";
    }
}
