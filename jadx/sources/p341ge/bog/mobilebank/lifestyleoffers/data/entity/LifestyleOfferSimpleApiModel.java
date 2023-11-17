package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferSimpleApiModel */
public final class LifestyleOfferSimpleApiModel {
    private final Long ofrId;

    public LifestyleOfferSimpleApiModel(Long l) {
        this.ofrId = l;
    }

    public static /* synthetic */ LifestyleOfferSimpleApiModel copy$default(LifestyleOfferSimpleApiModel lifestyleOfferSimpleApiModel, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = lifestyleOfferSimpleApiModel.ofrId;
        }
        return lifestyleOfferSimpleApiModel.copy(l);
    }

    public final Long component1() {
        return this.ofrId;
    }

    public final LifestyleOfferSimpleApiModel copy(Long l) {
        return new LifestyleOfferSimpleApiModel(l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LifestyleOfferSimpleApiModel) && C41536l.m120484d(this.ofrId, ((LifestyleOfferSimpleApiModel) obj).ofrId);
    }

    public final Long getOfrId() {
        return this.ofrId;
    }

    public int hashCode() {
        Long l = this.ofrId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        Long l = this.ofrId;
        return "LifestyleOfferSimpleApiModel(ofrId=" + l + ")";
    }
}
