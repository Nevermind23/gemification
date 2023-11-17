package p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.AnalysisApiEntity */
public final class AnalysisApiEntity {
    private final long hashCode;
    private final PFMDataApiEntity pfmData;

    public AnalysisApiEntity(PFMDataApiEntity pFMDataApiEntity, long j) {
        C41536l.m120489i(pFMDataApiEntity, "pfmData");
        this.pfmData = pFMDataApiEntity;
        this.hashCode = j;
    }

    public static /* synthetic */ AnalysisApiEntity copy$default(AnalysisApiEntity analysisApiEntity, PFMDataApiEntity pFMDataApiEntity, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            pFMDataApiEntity = analysisApiEntity.pfmData;
        }
        if ((i & 2) != 0) {
            j = analysisApiEntity.hashCode;
        }
        return analysisApiEntity.copy(pFMDataApiEntity, j);
    }

    public final PFMDataApiEntity component1() {
        return this.pfmData;
    }

    public final long component2() {
        return this.hashCode;
    }

    public final AnalysisApiEntity copy(PFMDataApiEntity pFMDataApiEntity, long j) {
        C41536l.m120489i(pFMDataApiEntity, "pfmData");
        return new AnalysisApiEntity(pFMDataApiEntity, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalysisApiEntity)) {
            return false;
        }
        AnalysisApiEntity analysisApiEntity = (AnalysisApiEntity) obj;
        return C41536l.m120484d(this.pfmData, analysisApiEntity.pfmData) && this.hashCode == analysisApiEntity.hashCode;
    }

    public final long getHashCode() {
        return this.hashCode;
    }

    public final PFMDataApiEntity getPfmData() {
        return this.pfmData;
    }

    public int hashCode() {
        return (this.pfmData.hashCode() * 31) + C7397t.m28148a(this.hashCode);
    }

    public String toString() {
        PFMDataApiEntity pFMDataApiEntity = this.pfmData;
        long j = this.hashCode;
        return "AnalysisApiEntity(pfmData=" + pFMDataApiEntity + ", hashCode=" + j + ")";
    }
}
