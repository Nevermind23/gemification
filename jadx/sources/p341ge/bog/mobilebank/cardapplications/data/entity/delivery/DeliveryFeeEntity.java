package p341ge.bog.mobilebank.cardapplications.data.entity.delivery;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.delivery.DeliveryFeeEntity */
public final class DeliveryFeeEntity {
    private final double feeAmount;
    private final String feeCcy;

    public DeliveryFeeEntity(double d, String str) {
        C41536l.m120489i(str, "feeCcy");
        this.feeAmount = d;
        this.feeCcy = str;
    }

    public static /* synthetic */ DeliveryFeeEntity copy$default(DeliveryFeeEntity deliveryFeeEntity, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = deliveryFeeEntity.feeAmount;
        }
        if ((i & 2) != 0) {
            str = deliveryFeeEntity.feeCcy;
        }
        return deliveryFeeEntity.copy(d, str);
    }

    public final double component1() {
        return this.feeAmount;
    }

    public final String component2() {
        return this.feeCcy;
    }

    public final DeliveryFeeEntity copy(double d, String str) {
        C41536l.m120489i(str, "feeCcy");
        return new DeliveryFeeEntity(d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryFeeEntity)) {
            return false;
        }
        DeliveryFeeEntity deliveryFeeEntity = (DeliveryFeeEntity) obj;
        return Double.compare(this.feeAmount, deliveryFeeEntity.feeAmount) == 0 && C41536l.m120484d(this.feeCcy, deliveryFeeEntity.feeCcy);
    }

    public final double getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeCcy() {
        return this.feeCcy;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.feeAmount) * 31) + this.feeCcy.hashCode();
    }

    public String toString() {
        double d = this.feeAmount;
        String str = this.feeCcy;
        return "DeliveryFeeEntity(feeAmount=" + d + ", feeCcy=" + str + ")";
    }
}
