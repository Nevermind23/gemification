package p341ge.bog.sso_client.onboarding.analytics.facetec;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepStart */
public enum FacetecStepStart {
    DOCUMENT("document_scan_start"),
    SELFIE("selfie_scan_start"),
    ACCEPT_AND_START("accept_and_facetec_start");
    
    private final String actionName;

    private FacetecStepStart(String str) {
        this.actionName = str;
    }

    public final String getActionName() {
        return this.actionName;
    }
}
