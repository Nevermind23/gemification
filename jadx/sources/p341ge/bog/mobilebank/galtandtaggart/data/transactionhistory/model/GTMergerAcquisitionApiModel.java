package p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTMergerAcquisitionApiModel */
public final class GTMergerAcquisitionApiModel {
    private final GTAcquireApiModel acquiree;
    private final GTAcquireApiModel acquirer;
    private final String type;

    public GTMergerAcquisitionApiModel(String str, GTAcquireApiModel gTAcquireApiModel, GTAcquireApiModel gTAcquireApiModel2) {
        this.type = str;
        this.acquirer = gTAcquireApiModel;
        this.acquiree = gTAcquireApiModel2;
    }

    public static /* synthetic */ GTMergerAcquisitionApiModel copy$default(GTMergerAcquisitionApiModel gTMergerAcquisitionApiModel, String str, GTAcquireApiModel gTAcquireApiModel, GTAcquireApiModel gTAcquireApiModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gTMergerAcquisitionApiModel.type;
        }
        if ((i & 2) != 0) {
            gTAcquireApiModel = gTMergerAcquisitionApiModel.acquirer;
        }
        if ((i & 4) != 0) {
            gTAcquireApiModel2 = gTMergerAcquisitionApiModel.acquiree;
        }
        return gTMergerAcquisitionApiModel.copy(str, gTAcquireApiModel, gTAcquireApiModel2);
    }

    public final String component1() {
        return this.type;
    }

    public final GTAcquireApiModel component2() {
        return this.acquirer;
    }

    public final GTAcquireApiModel component3() {
        return this.acquiree;
    }

    public final GTMergerAcquisitionApiModel copy(String str, GTAcquireApiModel gTAcquireApiModel, GTAcquireApiModel gTAcquireApiModel2) {
        return new GTMergerAcquisitionApiModel(str, gTAcquireApiModel, gTAcquireApiModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTMergerAcquisitionApiModel)) {
            return false;
        }
        GTMergerAcquisitionApiModel gTMergerAcquisitionApiModel = (GTMergerAcquisitionApiModel) obj;
        return C41536l.m120484d(this.type, gTMergerAcquisitionApiModel.type) && C41536l.m120484d(this.acquirer, gTMergerAcquisitionApiModel.acquirer) && C41536l.m120484d(this.acquiree, gTMergerAcquisitionApiModel.acquiree);
    }

    public final GTAcquireApiModel getAcquiree() {
        return this.acquiree;
    }

    public final GTAcquireApiModel getAcquirer() {
        return this.acquirer;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        GTAcquireApiModel gTAcquireApiModel = this.acquirer;
        int hashCode2 = (hashCode + (gTAcquireApiModel == null ? 0 : gTAcquireApiModel.hashCode())) * 31;
        GTAcquireApiModel gTAcquireApiModel2 = this.acquiree;
        if (gTAcquireApiModel2 != null) {
            i = gTAcquireApiModel2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.type;
        GTAcquireApiModel gTAcquireApiModel = this.acquirer;
        GTAcquireApiModel gTAcquireApiModel2 = this.acquiree;
        return "GTMergerAcquisitionApiModel(type=" + str + ", acquirer=" + gTAcquireApiModel + ", acquiree=" + gTAcquireApiModel2 + ")";
    }
}
