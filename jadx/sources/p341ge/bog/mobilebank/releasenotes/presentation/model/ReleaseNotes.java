package p341ge.bog.mobilebank.releasenotes.presentation.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.releasenotes.presentation.model.ReleaseNotes */
public final class ReleaseNotes {
    private final String appVersion;
    private List<NewFeature> features;

    public ReleaseNotes(String str, List<NewFeature> list) {
        C41536l.m120489i(str, "appVersion");
        C41536l.m120489i(list, "features");
        this.appVersion = str;
        this.features = list;
    }

    public static /* synthetic */ ReleaseNotes copy$default(ReleaseNotes releaseNotes, String str, List<NewFeature> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = releaseNotes.appVersion;
        }
        if ((i & 2) != 0) {
            list = releaseNotes.features;
        }
        return releaseNotes.copy(str, list);
    }

    public final String component1() {
        return this.appVersion;
    }

    public final List<NewFeature> component2() {
        return this.features;
    }

    public final ReleaseNotes copy(String str, List<NewFeature> list) {
        C41536l.m120489i(str, "appVersion");
        C41536l.m120489i(list, "features");
        return new ReleaseNotes(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReleaseNotes)) {
            return false;
        }
        ReleaseNotes releaseNotes = (ReleaseNotes) obj;
        return C41536l.m120484d(this.appVersion, releaseNotes.appVersion) && C41536l.m120484d(this.features, releaseNotes.features);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final List<NewFeature> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        return (this.appVersion.hashCode() * 31) + this.features.hashCode();
    }

    public final void setFeatures(List<NewFeature> list) {
        C41536l.m120489i(list, "<set-?>");
        this.features = list;
    }

    public String toString() {
        String str = this.appVersion;
        List<NewFeature> list = this.features;
        return "ReleaseNotes(appVersion=" + str + ", features=" + list + ")";
    }
}
