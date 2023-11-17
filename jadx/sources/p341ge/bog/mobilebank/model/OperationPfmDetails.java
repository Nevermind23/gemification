package p341ge.bog.mobilebank.model;

import java.util.List;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.OperationPfmDetails */
public final class OperationPfmDetails {
    @C8664c("pfmCatId")
    private Long pfmCatId;
    @C8664c("pfmCatName")
    private String pfmCatName;
    @C8664c("pfmComputable")
    private boolean pfmComputable;
    @C8664c("pfmForecast")
    private String pfmForecast;
    @C8664c("pfmId")
    private Long pfmId;
    @C8664c("pfmParentCatId")
    private Long pfmParentCatId;
    @C8664c("pfmParentCatName")
    private String pfmParentCatName;
    @C8664c("pfmParentOpId")
    private Long pfmParentOpId;
    @C8664c("pfmRecurring")
    private String pfmRecurring;
    @C8664c("pfmSplit")
    private String pfmSplit;
    @C8664c("pfmTagId")
    private Long pfmTagId;
    @C8664c("pfmTagName")
    private String pfmTagName;
    @C8664c("pmiDocGpiActions")
    private List<PMIDocGPIAction> pmiDocGPIActions;

    public final Long getPfmCatId() {
        return this.pfmCatId;
    }

    public final String getPfmCatName() {
        return this.pfmCatName;
    }

    public final boolean getPfmComputable() {
        return this.pfmComputable;
    }

    public final String getPfmForecast() {
        return this.pfmForecast;
    }

    public final Long getPfmId() {
        return this.pfmId;
    }

    public final Long getPfmParentCatId() {
        return this.pfmParentCatId;
    }

    public final String getPfmParentCatName() {
        return this.pfmParentCatName;
    }

    public final Long getPfmParentOpId() {
        return this.pfmParentOpId;
    }

    public final String getPfmRecurring() {
        return this.pfmRecurring;
    }

    public final String getPfmSplit() {
        return this.pfmSplit;
    }

    public final Long getPfmTagId() {
        return this.pfmTagId;
    }

    public final String getPfmTagName() {
        return this.pfmTagName;
    }

    public final List<PMIDocGPIAction> getPmiDocGPIActions() {
        return this.pmiDocGPIActions;
    }

    public final void setPfmCatId(Long l) {
        this.pfmCatId = l;
    }

    public final void setPfmCatName(String str) {
        this.pfmCatName = str;
    }

    public final void setPfmComputable(boolean z) {
        this.pfmComputable = z;
    }

    public final void setPfmForecast(String str) {
        this.pfmForecast = str;
    }

    public final void setPfmId(Long l) {
        this.pfmId = l;
    }

    public final void setPfmParentCatId(Long l) {
        this.pfmParentCatId = l;
    }

    public final void setPfmParentCatName(String str) {
        this.pfmParentCatName = str;
    }

    public final void setPfmParentOpId(Long l) {
        this.pfmParentOpId = l;
    }

    public final void setPfmRecurring(String str) {
        this.pfmRecurring = str;
    }

    public final void setPfmSplit(String str) {
        this.pfmSplit = str;
    }

    public final void setPfmTagId(Long l) {
        this.pfmTagId = l;
    }

    public final void setPfmTagName(String str) {
        this.pfmTagName = str;
    }

    public final void setPmiDocGPIActions(List<PMIDocGPIAction> list) {
        this.pmiDocGPIActions = list;
    }
}
