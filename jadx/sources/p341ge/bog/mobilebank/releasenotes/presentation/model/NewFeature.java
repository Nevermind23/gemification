package p341ge.bog.mobilebank.releasenotes.presentation.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.releasenotes.presentation.model.NewFeature */
public final class NewFeature {
    private final String buttonResName;
    private final String descriptionResName;
    private final String featureId;
    private final String imageResName;
    private final boolean isAnimation;
    private final String titleResName;

    public NewFeature(String str, String str2, String str3, String str4, String str5, boolean z) {
        C41536l.m120489i(str, "featureId");
        C41536l.m120489i(str2, "titleResName");
        C41536l.m120489i(str3, "descriptionResName");
        C41536l.m120489i(str5, "imageResName");
        this.featureId = str;
        this.titleResName = str2;
        this.descriptionResName = str3;
        this.buttonResName = str4;
        this.imageResName = str5;
        this.isAnimation = z;
    }

    public static /* synthetic */ NewFeature copy$default(NewFeature newFeature, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newFeature.featureId;
        }
        if ((i & 2) != 0) {
            str2 = newFeature.titleResName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = newFeature.descriptionResName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = newFeature.buttonResName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = newFeature.imageResName;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = newFeature.isAnimation;
        }
        return newFeature.copy(str, str6, str7, str8, str9, z);
    }

    public final String component1() {
        return this.featureId;
    }

    public final String component2() {
        return this.titleResName;
    }

    public final String component3() {
        return this.descriptionResName;
    }

    public final String component4() {
        return this.buttonResName;
    }

    public final String component5() {
        return this.imageResName;
    }

    public final boolean component6() {
        return this.isAnimation;
    }

    public final NewFeature copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        C41536l.m120489i(str, "featureId");
        C41536l.m120489i(str2, "titleResName");
        C41536l.m120489i(str3, "descriptionResName");
        C41536l.m120489i(str5, "imageResName");
        return new NewFeature(str, str2, str3, str4, str5, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewFeature)) {
            return false;
        }
        NewFeature newFeature = (NewFeature) obj;
        return C41536l.m120484d(this.featureId, newFeature.featureId) && C41536l.m120484d(this.titleResName, newFeature.titleResName) && C41536l.m120484d(this.descriptionResName, newFeature.descriptionResName) && C41536l.m120484d(this.buttonResName, newFeature.buttonResName) && C41536l.m120484d(this.imageResName, newFeature.imageResName) && this.isAnimation == newFeature.isAnimation;
    }

    public final String getButtonResName() {
        return this.buttonResName;
    }

    public final String getDescriptionResName() {
        return this.descriptionResName;
    }

    public final String getFeatureId() {
        return this.featureId;
    }

    public final String getImageResName() {
        return this.imageResName;
    }

    public final String getTitleResName() {
        return this.titleResName;
    }

    public int hashCode() {
        int hashCode = ((((this.featureId.hashCode() * 31) + this.titleResName.hashCode()) * 31) + this.descriptionResName.hashCode()) * 31;
        String str = this.buttonResName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imageResName.hashCode()) * 31;
        boolean z = this.isAnimation;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public final boolean isAnimation() {
        return this.isAnimation;
    }

    public String toString() {
        String str = this.featureId;
        String str2 = this.titleResName;
        String str3 = this.descriptionResName;
        String str4 = this.buttonResName;
        String str5 = this.imageResName;
        boolean z = this.isAnimation;
        return "NewFeature(featureId=" + str + ", titleResName=" + str2 + ", descriptionResName=" + str3 + ", buttonResName=" + str4 + ", imageResName=" + str5 + ", isAnimation=" + z + ")";
    }
}
