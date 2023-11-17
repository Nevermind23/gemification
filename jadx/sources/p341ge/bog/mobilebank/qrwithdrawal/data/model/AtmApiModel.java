package p341ge.bog.mobilebank.qrwithdrawal.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.qrwithdrawal.data.model.AtmApiModel */
public final class AtmApiModel {
    private final List<AtmDenominationsApiModel> atmDenominations;
    private final String cashDispenserStatus;
    private final String maxNotesToDispense;

    public AtmApiModel(List<AtmDenominationsApiModel> list, String str, String str2) {
        C41536l.m120489i(list, "atmDenominations");
        this.atmDenominations = list;
        this.cashDispenserStatus = str;
        this.maxNotesToDispense = str2;
    }

    public static /* synthetic */ AtmApiModel copy$default(AtmApiModel atmApiModel, List<AtmDenominationsApiModel> list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = atmApiModel.atmDenominations;
        }
        if ((i & 2) != 0) {
            str = atmApiModel.cashDispenserStatus;
        }
        if ((i & 4) != 0) {
            str2 = atmApiModel.maxNotesToDispense;
        }
        return atmApiModel.copy(list, str, str2);
    }

    public final List<AtmDenominationsApiModel> component1() {
        return this.atmDenominations;
    }

    public final String component2() {
        return this.cashDispenserStatus;
    }

    public final String component3() {
        return this.maxNotesToDispense;
    }

    public final AtmApiModel copy(List<AtmDenominationsApiModel> list, String str, String str2) {
        C41536l.m120489i(list, "atmDenominations");
        return new AtmApiModel(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtmApiModel)) {
            return false;
        }
        AtmApiModel atmApiModel = (AtmApiModel) obj;
        return C41536l.m120484d(this.atmDenominations, atmApiModel.atmDenominations) && C41536l.m120484d(this.cashDispenserStatus, atmApiModel.cashDispenserStatus) && C41536l.m120484d(this.maxNotesToDispense, atmApiModel.maxNotesToDispense);
    }

    public final List<AtmDenominationsApiModel> getAtmDenominations() {
        return this.atmDenominations;
    }

    public final String getCashDispenserStatus() {
        return this.cashDispenserStatus;
    }

    public final String getMaxNotesToDispense() {
        return this.maxNotesToDispense;
    }

    public int hashCode() {
        int hashCode = this.atmDenominations.hashCode() * 31;
        String str = this.cashDispenserStatus;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxNotesToDispense;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        List<AtmDenominationsApiModel> list = this.atmDenominations;
        String str = this.cashDispenserStatus;
        String str2 = this.maxNotesToDispense;
        return "AtmApiModel(atmDenominations=" + list + ", cashDispenserStatus=" + str + ", maxNotesToDispense=" + str2 + ")";
    }
}
