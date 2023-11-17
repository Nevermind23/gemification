package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11767h;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import he1.C41233s;
import he1.C41238w;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import ue1.C43075l;

public final class Identity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "~$Identity";
    /* access modifiers changed from: private */
    public static Identity _instance;
    /* access modifiers changed from: private */
    public final Map<ModuleIdentifier, ModuleIdentity> _moduleIdentities;
    private final String platform;
    private final String registrationId;
    private final List<String> reservedKeys;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void get_instance$annotations() {
        }

        public final Identity create$sfmcsdk_release(String str) {
            C41536l.m120489i(str, "registrationId");
            Identity access$get_instance$cp = Identity._instance;
            if (access$get_instance$cp != null) {
                return access$get_instance$cp;
            }
            Identity identity = new Identity(str, (DefaultConstructorMarker) null);
            Identity.Companion.setInstance(identity);
            return identity;
        }

        public final Identity getInstance() {
            Identity access$get_instance$cp = Identity._instance;
            if (access$get_instance$cp != null) {
                return access$get_instance$cp;
            }
            throw new IllegalStateException("You must initialize the SDK before attempting to use Identity.");
        }

        public final void setInstance(Identity identity) {
            C41536l.m120489i(identity, C11755a.C11756a.f34100b);
            SFMCSdkLogger.INSTANCE.mo31452d(Identity.TAG, new Identity$Companion$instance$1(identity));
            Identity._instance = identity;
        }

        public final Map<String, Object> toEvent$sfmcsdk_release() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Identity access$get_instance$cp = Identity._instance;
            if (access$get_instance$cp != null) {
                linkedHashMap.put(C11772k.C11773a.f34170b, access$get_instance$cp.getPlatform());
                linkedHashMap.put("registrationId", access$get_instance$cp.getRegistrationId());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : access$get_instance$cp._moduleIdentities.entrySet()) {
                    String name = ((ModuleIdentifier) entry.getKey()).name();
                    if (name != null) {
                        String lowerCase = name.toLowerCase(Locale.ROOT);
                        C41536l.m120488h(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        jSONObject.put(lowerCase, ((ModuleIdentity) entry.getValue()).toJson());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                C41238w wVar = C41238w.f97225a;
                linkedHashMap.put("moduleIdentities", jSONObject);
            }
            return linkedHashMap;
        }
    }

    public /* synthetic */ Identity(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static /* synthetic */ void clearProfileAttribute$default(Identity identity, String str, ModuleIdentifier[] moduleIdentifierArr, int i, Object obj) {
        if ((i & 2) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.clearProfileAttribute(str, moduleIdentifierArr);
    }

    public static /* synthetic */ void clearProfileAttributes$default(Identity identity, List list, ModuleIdentifier[] moduleIdentifierArr, int i, Object obj) {
        if ((i & 2) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.clearProfileAttributes(list, moduleIdentifierArr);
    }

    private final boolean isValidEventAttributeValue(Object obj) {
        return (obj instanceof Number ? true : obj instanceof Boolean ? true : obj instanceof String ? true : obj instanceof Character) || obj == null;
    }

    public static /* synthetic */ void setProfileAttribute$default(Identity identity, String str, String str2, ModuleIdentifier[] moduleIdentifierArr, int i, Object obj) {
        if ((i & 4) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.setProfileAttribute(str, str2, moduleIdentifierArr);
    }

    public static /* synthetic */ void setProfileAttributes$default(Identity identity, Map map, ModuleIdentifier[] moduleIdentifierArr, int i, Object obj) {
        if ((i & 2) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.setProfileAttributes(map, moduleIdentifierArr);
    }

    public static /* synthetic */ void setProfileId$default(Identity identity, String str, ModuleIdentifier[] moduleIdentifierArr, int i, Object obj) {
        if ((i & 2) != 0) {
            moduleIdentifierArr = ModuleIdentifier.values();
        }
        identity.setProfileId(str, moduleIdentifierArr);
    }

    private final String validatedEventAttributeKey(String str) {
        String g0 = C41358y.m120017g0(this.reservedKeys, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        if (str != null) {
            String obj = C40440x.m117146P0(str).toString();
            if (C40439w.m117118v(str)) {
                SFMCSdkLogger.INSTANCE.mo31463w(TAG, new Identity$validatedEventAttributeKey$1(str));
            } else {
                List<String> list = this.reservedKeys;
                Locale locale = Locale.US;
                C41536l.m120488h(locale, "US");
                String lowerCase = str.toLowerCase(locale);
                C41536l.m120488h(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (list.contains(lowerCase)) {
                    SFMCSdkLogger.INSTANCE.mo31463w(TAG, new Identity$validatedEventAttributeKey$2(str, g0));
                } else if (C41536l.m120484d(str, obj)) {
                    return obj;
                } else {
                    SFMCSdkLogger.INSTANCE.mo31463w(TAG, new Identity$validatedEventAttributeKey$3(str, obj));
                    return obj;
                }
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public final void clearProfileAttribute(String str) {
        C41536l.m120489i(str, "key");
        clearProfileAttribute$default(this, str, (ModuleIdentifier[]) null, 2, (Object) null);
    }

    public final void clearProfileAttributes(List<String> list) {
        C41536l.m120489i(list, C11769i.C11770a.f34151n);
        clearProfileAttributes$default(this, list, (ModuleIdentifier[]) null, 2, (Object) null);
    }

    public final Map<ModuleIdentifier, ModuleIdentity> getModuleIdentities() {
        return this._moduleIdentities;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getRegistrationId() {
        return this.registrationId;
    }

    public final void setModuleIdentity$sfmcsdk_release(ModuleIdentity moduleIdentity) {
        C41536l.m120489i(moduleIdentity, "moduleIdentity");
        synchronized (this._moduleIdentities) {
            this._moduleIdentities.put(moduleIdentity.getModuleName(), moduleIdentity);
            C41238w wVar = C41238w.f97225a;
        }
    }

    public final void setProfile(String str, Map<String, String> map, ModuleIdentifier moduleIdentifier, ModuleIdentifier... moduleIdentifierArr) {
        C41536l.m120489i(str, "profileId");
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        C41536l.m120489i(moduleIdentifier, "module");
        C41536l.m120489i(moduleIdentifierArr, "modules");
        setProfile(new Profile(str, map), moduleIdentifier, (ModuleIdentifier[]) Arrays.copyOf(moduleIdentifierArr, moduleIdentifierArr.length));
    }

    public final void setProfileAttribute(String str, String str2) {
        C41536l.m120489i(str, "key");
        setProfileAttribute$default(this, str, str2, (ModuleIdentifier[]) null, 4, (Object) null);
    }

    public final void setProfileAttributes(Map<String, String> map) {
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        setProfileAttributes$default(this, map, (ModuleIdentifier[]) null, 2, (Object) null);
    }

    public final void setProfileId(String str) {
        C41536l.m120489i(str, "id");
        setProfileId$default(this, str, (ModuleIdentifier[]) null, 2, (Object) null);
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C11772k.C11773a.f34170b, getPlatform());
        jSONObject.put("registrationId", getRegistrationId());
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry next : this._moduleIdentities.entrySet()) {
            String name = ((ModuleIdentifier) next.getKey()).name();
            if (name != null) {
                String lowerCase = name.toLowerCase(Locale.ROOT);
                C41536l.m120488h(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                jSONObject2.put(lowerCase, ((ModuleIdentity) next.getValue()).toJson());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        C41238w wVar = C41238w.f97225a;
        jSONObject.put("moduleIdentities", jSONObject2);
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJson().toString();
        C41536l.m120488h(jSONObject, "toJson().toString()");
        return jSONObject;
    }

    private Identity(String str) {
        this.registrationId = str;
        this.platform = "Android";
        this._moduleIdentities = new LinkedHashMap();
        this.reservedKeys = C41341q.m119910m("deviceid", "userid", "eventid", "sessionid", "datetime", "eventtype", "category", C11767h.C11768a.f34132b, C11767h.C11768a.f34133c);
    }

    public final void clearProfileAttribute(String str, ModuleIdentifier... moduleIdentifierArr) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(moduleIdentifierArr, "modules");
        setProfileAttributes(C41342q0.m119922g(C41233s.m119492a(str, "")), (ModuleIdentifier[]) Arrays.copyOf(moduleIdentifierArr, moduleIdentifierArr.length));
    }

    public final void clearProfileAttributes(List<String> list, ModuleIdentifier... moduleIdentifierArr) {
        C41536l.m120489i(list, C11769i.C11770a.f34151n);
        C41536l.m120489i(moduleIdentifierArr, "modules");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(list, 10)), 16));
        for (String put : list) {
            linkedHashMap.put(put, "");
        }
        setProfileAttributes(linkedHashMap, (ModuleIdentifier[]) Arrays.copyOf(moduleIdentifierArr, moduleIdentifierArr.length));
    }

    public final void setProfile(Profile profile, ModuleIdentifier moduleIdentifier, ModuleIdentifier... moduleIdentifierArr) {
        C41536l.m120489i(profile, "profile");
        C41536l.m120489i(moduleIdentifier, "module");
        C41536l.m120489i(moduleIdentifierArr, "modules");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(moduleIdentifier, profile);
        for (ModuleIdentifier moduleIdentifier2 : moduleIdentifierArr) {
            if (!C41536l.m120484d(moduleIdentifier2.name(), moduleIdentifier.name())) {
                linkedHashMap.put(moduleIdentifier2, profile);
            }
        }
        setProfile(linkedHashMap);
    }

    public final void setProfileAttribute(String str, String str2, ModuleIdentifier... moduleIdentifierArr) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(moduleIdentifierArr, "modules");
        setProfileAttributes(C41342q0.m119922g(C41233s.m119492a(str, str2)), (ModuleIdentifier[]) Arrays.copyOf(moduleIdentifierArr, moduleIdentifierArr.length));
    }

    public final void setProfileAttributes(Map<String, String> map, ModuleIdentifier... moduleIdentifierArr) {
        C41536l.m120489i(map, C11772k.C11773a.f34176h);
        C41536l.m120489i(moduleIdentifierArr, "modules");
        synchronized (this._moduleIdentities) {
            for (ModuleIdentifier moduleIdentifier : moduleIdentifierArr) {
                ModuleIdentity moduleIdentity = this._moduleIdentities.get(moduleIdentifier);
                if (moduleIdentity != null) {
                    moduleIdentity.getCustomProperties().put(C11772k.C11773a.f34176h, map);
                }
            }
            C41238w wVar = C41238w.f97225a;
        }
        Event identityEvent$sfmcsdk_release = EventManager.Companion.identityEvent$sfmcsdk_release();
        if (identityEvent$sfmcsdk_release != null) {
            identityEvent$sfmcsdk_release.track();
        }
    }

    public final void setProfileId(String str, ModuleIdentifier... moduleIdentifierArr) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(moduleIdentifierArr, "modules");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ModuleIdentifier put : moduleIdentifierArr) {
            linkedHashMap.put(put, str);
        }
        setProfileId((Map<ModuleIdentifier, String>) linkedHashMap);
    }

    public final void setProfileId(Map<ModuleIdentifier, String> map) {
        C41536l.m120489i(map, "ids");
        synchronized (this._moduleIdentities) {
            for (Map.Entry entry : map.entrySet()) {
                ModuleIdentity moduleIdentity = this._moduleIdentities.get(entry.getKey());
                if (moduleIdentity != null) {
                    moduleIdentity.setProfileId((String) entry.getValue());
                }
            }
            Event identityEvent$sfmcsdk_release = EventManager.Companion.identityEvent$sfmcsdk_release();
            if (identityEvent$sfmcsdk_release != null) {
                identityEvent$sfmcsdk_release.track();
                C41238w wVar = C41238w.f97225a;
            }
        }
    }

    public final void setProfile(Map<ModuleIdentifier, Profile> map) {
        C41536l.m120489i(map, "identities");
        synchronized (this._moduleIdentities) {
            for (Map.Entry next : map.entrySet()) {
                ModuleIdentity moduleIdentity = this._moduleIdentities.get(next.getKey());
                if (moduleIdentity != null) {
                    moduleIdentity.setProfileId(((Profile) next.getValue()).getProfileId());
                    moduleIdentity.setCustomProperties(C41344r0.m119943y(((Profile) next.getValue()).getAttributes()));
                }
            }
            C41238w wVar = C41238w.f97225a;
        }
        Event identityEvent$sfmcsdk_release = EventManager.Companion.identityEvent$sfmcsdk_release();
        if (identityEvent$sfmcsdk_release != null) {
            identityEvent$sfmcsdk_release.track();
        }
    }
}
