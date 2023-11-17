package p341ge.bog.sso_client.onboarding.analytics.facetec;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd */
public enum FacetecStepEnd {
    DOCUMENT("document_scanned"),
    SELFIE("selfie_scanned"),
    FINISH("facetec_process_finished");
    
    private final String actionName;

    private FacetecStepEnd(String str) {
        this.actionName = str;
    }

    public final String getActionName() {
        return this.actionName;
    }
}
