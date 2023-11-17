package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

public final class Profile {
    private final Map<String, String> attributes;
    private final String profileId;

    public Profile(String str, Map<String, String> map) {
        C41536l.m120489i(str, "profileId");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        this.profileId = str;
        this.attributes = map;
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profile.profileId;
        }
        if ((i & 2) != 0) {
            map = profile.attributes;
        }
        return profile.copy(str, map);
    }

    public final String component1() {
        return this.profileId;
    }

    public final Map<String, String> component2() {
        return this.attributes;
    }

    public final Profile copy(String str, Map<String, String> map) {
        C41536l.m120489i(str, "profileId");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        return new Profile(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return C41536l.m120484d(this.profileId, profile.profileId) && C41536l.m120484d(this.attributes, profile.attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public int hashCode() {
        return (this.profileId.hashCode() * 31) + this.attributes.hashCode();
    }

    public String toString() {
        return "Profile(profileId=" + this.profileId + ", attributes=" + this.attributes + ')';
    }
}
