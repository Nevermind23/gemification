package p341ge.bog.mobilebank.ddsto.data.sto;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.ddsto.data.sto.Details */
public final class Details {
    @C8664c("stoDetails")
    private StoDetailsApiModel stoDetails;

    public Details() {
        this((StoDetailsApiModel) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Details copy$default(Details details, StoDetailsApiModel stoDetailsApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            stoDetailsApiModel = details.stoDetails;
        }
        return details.copy(stoDetailsApiModel);
    }

    public final StoDetailsApiModel component1() {
        return this.stoDetails;
    }

    public final Details copy(StoDetailsApiModel stoDetailsApiModel) {
        return new Details(stoDetailsApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Details) && C41536l.m120484d(this.stoDetails, ((Details) obj).stoDetails);
    }

    public final StoDetailsApiModel getStoDetails() {
        return this.stoDetails;
    }

    public int hashCode() {
        StoDetailsApiModel stoDetailsApiModel = this.stoDetails;
        if (stoDetailsApiModel == null) {
            return 0;
        }
        return stoDetailsApiModel.hashCode();
    }

    public final void setStoDetails(StoDetailsApiModel stoDetailsApiModel) {
        this.stoDetails = stoDetailsApiModel;
    }

    public String toString() {
        StoDetailsApiModel stoDetailsApiModel = this.stoDetails;
        return "Details(stoDetails=" + stoDetailsApiModel + ")";
    }

    public Details(StoDetailsApiModel stoDetailsApiModel) {
        this.stoDetails = stoDetailsApiModel;
    }

    public /* synthetic */ Details(StoDetailsApiModel stoDetailsApiModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Details details;
        StoDetailsApiModel stoDetailsApiModel2;
        if ((i & 1) != 0) {
            stoDetailsApiModel2 = new StoDetailsApiModel((Long) null, (Long) null, (String) null, (Long) null, (Long) null, (String) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 1, (DefaultConstructorMarker) null);
            details = this;
        } else {
            details = this;
            stoDetailsApiModel2 = stoDetailsApiModel;
        }
        new Details(stoDetailsApiModel2);
    }
}
