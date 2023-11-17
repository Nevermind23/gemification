package p341ge.bog.mobilebank.lifestyleoffers.domain.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleChooserInterestType */
public final class LifestyleChooserInterestType {
    private Set<String> chosenInterests;
    private final List<LifestyleChooserInterestSubType> interestSubTypes;
    private final String interestType;
    private final long interestTypeImageId;
    private final String interestTypeImageUrl;
    private boolean isChosen;
    private boolean isEnabled;
    private String subtypesDescriptions;
    private final String typeDesc;

    public LifestyleChooserInterestType(String str, String str2, long j, String str3, List<LifestyleChooserInterestSubType> list, boolean z, boolean z2, Set<String> set, String str4) {
        C41536l.m120489i(str, "interestType");
        C41536l.m120489i(str2, "typeDesc");
        C41536l.m120489i(str3, "interestTypeImageUrl");
        C41536l.m120489i(list, "interestSubTypes");
        C41536l.m120489i(set, "chosenInterests");
        C41536l.m120489i(str4, "subtypesDescriptions");
        this.interestType = str;
        this.typeDesc = str2;
        this.interestTypeImageId = j;
        this.interestTypeImageUrl = str3;
        this.interestSubTypes = list;
        this.isEnabled = z;
        this.isChosen = z2;
        this.chosenInterests = set;
        this.subtypesDescriptions = str4;
    }

    public static /* synthetic */ LifestyleChooserInterestType copy$default(LifestyleChooserInterestType lifestyleChooserInterestType, String str, String str2, long j, String str3, List list, boolean z, boolean z2, Set set, String str4, int i, Object obj) {
        LifestyleChooserInterestType lifestyleChooserInterestType2 = lifestyleChooserInterestType;
        int i2 = i;
        return lifestyleChooserInterestType.copy((i2 & 1) != 0 ? lifestyleChooserInterestType2.interestType : str, (i2 & 2) != 0 ? lifestyleChooserInterestType2.typeDesc : str2, (i2 & 4) != 0 ? lifestyleChooserInterestType2.interestTypeImageId : j, (i2 & 8) != 0 ? lifestyleChooserInterestType2.interestTypeImageUrl : str3, (i2 & 16) != 0 ? lifestyleChooserInterestType2.interestSubTypes : list, (i2 & 32) != 0 ? lifestyleChooserInterestType2.isEnabled : z, (i2 & 64) != 0 ? lifestyleChooserInterestType2.isChosen : z2, (i2 & 128) != 0 ? lifestyleChooserInterestType2.chosenInterests : set, (i2 & C11398b.f33139r) != 0 ? lifestyleChooserInterestType2.subtypesDescriptions : str4);
    }

    public final String component1() {
        return this.interestType;
    }

    public final String component2() {
        return this.typeDesc;
    }

    public final long component3() {
        return this.interestTypeImageId;
    }

    public final String component4() {
        return this.interestTypeImageUrl;
    }

    public final List<LifestyleChooserInterestSubType> component5() {
        return this.interestSubTypes;
    }

    public final boolean component6() {
        return this.isEnabled;
    }

    public final boolean component7() {
        return this.isChosen;
    }

    public final Set<String> component8() {
        return this.chosenInterests;
    }

    public final String component9() {
        return this.subtypesDescriptions;
    }

    public final LifestyleChooserInterestType copy(String str, String str2, long j, String str3, List<LifestyleChooserInterestSubType> list, boolean z, boolean z2, Set<String> set, String str4) {
        C41536l.m120489i(str, "interestType");
        C41536l.m120489i(str2, "typeDesc");
        String str5 = str3;
        C41536l.m120489i(str5, "interestTypeImageUrl");
        List<LifestyleChooserInterestSubType> list2 = list;
        C41536l.m120489i(list2, "interestSubTypes");
        Set<String> set2 = set;
        C41536l.m120489i(set2, "chosenInterests");
        String str6 = str4;
        C41536l.m120489i(str6, "subtypesDescriptions");
        return new LifestyleChooserInterestType(str, str2, j, str5, list2, z, z2, set2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleChooserInterestType)) {
            return false;
        }
        LifestyleChooserInterestType lifestyleChooserInterestType = (LifestyleChooserInterestType) obj;
        return C41536l.m120484d(this.interestType, lifestyleChooserInterestType.interestType) && C41536l.m120484d(this.typeDesc, lifestyleChooserInterestType.typeDesc) && this.interestTypeImageId == lifestyleChooserInterestType.interestTypeImageId && C41536l.m120484d(this.interestTypeImageUrl, lifestyleChooserInterestType.interestTypeImageUrl) && C41536l.m120484d(this.interestSubTypes, lifestyleChooserInterestType.interestSubTypes) && this.isEnabled == lifestyleChooserInterestType.isEnabled && this.isChosen == lifestyleChooserInterestType.isChosen && C41536l.m120484d(this.chosenInterests, lifestyleChooserInterestType.chosenInterests) && C41536l.m120484d(this.subtypesDescriptions, lifestyleChooserInterestType.subtypesDescriptions);
    }

    public final Set<String> getChosenInterests() {
        return this.chosenInterests;
    }

    public final List<LifestyleChooserInterestSubType> getInterestSubTypes() {
        return this.interestSubTypes;
    }

    public final String getInterestType() {
        return this.interestType;
    }

    public final long getInterestTypeImageId() {
        return this.interestTypeImageId;
    }

    public final String getInterestTypeImageUrl() {
        return this.interestTypeImageUrl;
    }

    public final String getSubtypesDescriptions() {
        return this.subtypesDescriptions;
    }

    public final String getTypeDesc() {
        return this.typeDesc;
    }

    public int hashCode() {
        int hashCode = ((((((((this.interestType.hashCode() * 31) + this.typeDesc.hashCode()) * 31) + C7397t.m28148a(this.interestTypeImageId)) * 31) + this.interestTypeImageUrl.hashCode()) * 31) + this.interestSubTypes.hashCode()) * 31;
        boolean z = this.isEnabled;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isChosen;
        if (!z3) {
            z2 = z3;
        }
        return ((((i + (z2 ? 1 : 0)) * 31) + this.chosenInterests.hashCode()) * 31) + this.subtypesDescriptions.hashCode();
    }

    public final boolean isChosen() {
        return this.isChosen;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setChosen(boolean z) {
        this.isChosen = z;
    }

    public final void setChosenInterests(Set<String> set) {
        C41536l.m120489i(set, "<set-?>");
        this.chosenInterests = set;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setSubtypesDescriptions(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.subtypesDescriptions = str;
    }

    public String toString() {
        String str = this.interestType;
        String str2 = this.typeDesc;
        long j = this.interestTypeImageId;
        String str3 = this.interestTypeImageUrl;
        List<LifestyleChooserInterestSubType> list = this.interestSubTypes;
        boolean z = this.isEnabled;
        boolean z2 = this.isChosen;
        Set<String> set = this.chosenInterests;
        String str4 = this.subtypesDescriptions;
        return "LifestyleChooserInterestType(interestType=" + str + ", typeDesc=" + str2 + ", interestTypeImageId=" + j + ", interestTypeImageUrl=" + str3 + ", interestSubTypes=" + list + ", isEnabled=" + z + ", isChosen=" + z2 + ", chosenInterests=" + set + ", subtypesDescriptions=" + str4 + ")";
    }
}
