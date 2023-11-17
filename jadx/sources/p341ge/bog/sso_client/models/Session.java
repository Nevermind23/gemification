package p341ge.bog.sso_client.models;

import af1.C40303i;
import androidx.annotation.Keep;
import com.auth0.android.jwt.JWT;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import gb1.C32393w;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sso.type.AuthElementType;
import ue1.C43075l;
import ve1.C43155e;

@Keep
/* renamed from: ge.bog.sso_client.models.Session */
public final class Session implements Map<String, Object>, C43155e {
    static final /* synthetic */ C40303i[] $$delegatedProperties;
    private final /* synthetic */ HashMap<String, Object> $$delegate_0;
    private final Map _alwaysSkipSecurityOffer$delegate;
    private final Map _availableAuthTypes$delegate;
    private final Map _offerSecuritySettingsSetup$delegate;
    private final Map avatarUrl$delegate;
    private final Map biometricToken$delegate;
    private final Map firstName$delegate;
    private final Map<String, Object> internalAttrs;
    private final Map isChannelActive$delegate;
    private final Map isPasswordChangeRequired$delegate;
    private final Map isPasswordExpired$delegate;
    private final Map isUserNameChangeRequired$delegate;
    private final Map lastName$delegate;
    private final Map loginAuthTypes$delegate;
    private final Map loginUserInInfo$delegate;
    private final Map mails$delegate;
    private final Map passCodeToken$delegate;
    private final Map phones$delegate;
    private final Map processReference$delegate;
    private final Map refreshToken$delegate;
    private final Map saveUser$delegate;
    private final Map savedCompanyClientKey$delegate;
    private final Map<String, Object> sessionAttrs;
    private final Map ssoToken$delegate;
    private final Map token$delegate;
    private final Map username$delegate;

    /* renamed from: ge.bog.sso_client.models.Session$a */
    static final class C35930a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f86910d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35930a(String str) {
            super(1);
            this.f86910d = str;
        }

        /* renamed from: a */
        public final void mo88400a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            if (C32393w.m95664e(this.f86910d)) {
                Set<AuthElementType> availableAuthTypes$sso_client_release = session.getAvailableAuthTypes$sso_client_release();
                AuthElementType authElementType = AuthElementType.TRUSTED_DEVICE;
                if (!availableAuthTypes$sso_client_release.contains(authElementType)) {
                    session.setAvailableAuthTypes$sso_client_release(C41361y0.m120041m(session.getAvailableAuthTypes$sso_client_release(), authElementType));
                }
            }
            if (!C32393w.m95664e(this.f86910d)) {
                Set<AuthElementType> availableAuthTypes$sso_client_release2 = session.getAvailableAuthTypes$sso_client_release();
                AuthElementType authElementType2 = AuthElementType.TRUSTED_DEVICE;
                if (availableAuthTypes$sso_client_release2.contains(authElementType2)) {
                    session.setAvailableAuthTypes$sso_client_release(C41361y0.m120039k(session.getAvailableAuthTypes$sso_client_release(), authElementType2));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88400a((Session) obj);
            return C41238w.f97225a;
        }
    }

    static {
        Class<Session> cls = Session.class;
        $$delegatedProperties = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "username", "getUsername()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "avatarUrl", "getAvatarUrl()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "firstName", "getFirstName()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "lastName", "getLastName()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "phones", "getPhones()Ljava/util/List;", 0)), C41520a0.m120439e(new C41539o(cls, "mails", "getMails()Ljava/util/List;", 0)), C41520a0.m120439e(new C41539o(cls, "saveUser", "getSaveUser()Ljava/lang/Boolean;", 0)), C41520a0.m120439e(new C41539o(cls, "passCodeToken", "getPassCodeToken$sso_client_release()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "biometricToken", "getBiometricToken$sso_client_release()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "loginAuthTypes", "getLoginAuthTypes$sso_client_release()Ljava/util/Set;", 0)), C41520a0.m120439e(new C41539o(cls, "_availableAuthTypes", "get_availableAuthTypes()Ljava/util/ArrayList;", 0)), C41520a0.m120439e(new C41539o(cls, "token", "getToken()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "loginUserInInfo", "getLoginUserInInfo()Lge/bog/sso_client/models/LoginUserInfo;", 0)), C41520a0.m120439e(new C41539o(cls, "refreshToken", "getRefreshToken$sso_client_release()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "ssoToken", "getSsoToken$sso_client_release()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "isChannelActive", "isChannelActive$sso_client_release()Ljava/lang/Boolean;", 0)), C41520a0.m120439e(new C41539o(cls, "isPasswordExpired", "isPasswordExpired$sso_client_release()Ljava/lang/Boolean;", 0)), C41520a0.m120439e(new C41539o(cls, "isUserNameChangeRequired", "isUserNameChangeRequired$sso_client_release()Ljava/lang/Boolean;", 0)), C41520a0.m120439e(new C41539o(cls, "isPasswordChangeRequired", "isPasswordChangeRequired$sso_client_release()Ljava/lang/Boolean;", 0)), C41520a0.m120439e(new C41539o(cls, "processReference", "getProcessReference$sso_client_release()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "savedCompanyClientKey", "getSavedCompanyClientKey$sso_client_release()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "_alwaysSkipSecurityOffer", "get_alwaysSkipSecurityOffer()Ljava/lang/Boolean;", 0)), C41520a0.m120439e(new C41539o(cls, "_offerSecuritySettingsSetup", "get_offerSecuritySettingsSetup()Ljava/lang/Boolean;", 0))};
    }

    public Session() {
        this((Map) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    private final Boolean get_alwaysSkipSecurityOffer() {
        return (Boolean) C35962r.m107007e(this._alwaysSkipSecurityOffer$delegate, this, $$delegatedProperties[21]);
    }

    private final ArrayList<String> get_availableAuthTypes() {
        return (ArrayList) C35962r.m107007e(this._availableAuthTypes$delegate, this, $$delegatedProperties[10]);
    }

    private final Boolean get_offerSecuritySettingsSetup() {
        return (Boolean) C35962r.m107007e(this._offerSecuritySettingsSetup$delegate, this, $$delegatedProperties[22]);
    }

    private final void set_alwaysSkipSecurityOffer(Boolean bool) {
        C35962r.m107008f(this._alwaysSkipSecurityOffer$delegate, this, $$delegatedProperties[21], bool);
    }

    private final void set_availableAuthTypes(ArrayList<String> arrayList) {
        C35962r.m107008f(this._availableAuthTypes$delegate, this, $$delegatedProperties[10], arrayList);
    }

    private final void set_offerSecuritySettingsSetup(Boolean bool) {
        C35962r.m107008f(this._offerSecuritySettingsSetup$delegate, this, $$delegatedProperties[22], bool);
    }

    public void clear() {
        this.$$delegate_0.clear();
    }

    public boolean containsKey(String str) {
        C41536l.m120489i(str, "key");
        return this.$$delegate_0.containsKey(str);
    }

    public boolean containsValue(Object obj) {
        return this.$$delegate_0.containsValue(obj);
    }

    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public Object get(String str) {
        C41536l.m120489i(str, "key");
        return this.$$delegate_0.get(str);
    }

    public final Boolean getAlwaysSkipSecurityOffer$sso_client_release() {
        if (getAvailableAuthTypes$sso_client_release().containsAll(C41357x0.m119989i(AuthElementType.TRUSTED_DEVICE, AuthElementType.PASSCODE))) {
            return Boolean.TRUE;
        }
        return get_alwaysSkipSecurityOffer();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r0 == null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set<sso.type.AuthElementType> getAvailableAuthTypes$sso_client_release() {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.get_availableAuthTypes()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0033
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = ie1.C41343r.m119925u(r0, r4)
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x002d
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            sso.type.AuthElementType$Companion r5 = sso.type.AuthElementType.Companion
            sso.type.AuthElementType r4 = r5.safeValueOf(r4)
            r3.add(r4)
            goto L_0x0017
        L_0x002d:
            java.util.Set r0 = ie1.C41358y.m119993D0(r3)
            if (r0 != 0) goto L_0x0042
        L_0x0033:
            r0 = 2
            sso.type.AuthElementType[] r0 = new sso.type.AuthElementType[r0]
            sso.type.AuthElementType r3 = sso.type.AuthElementType.OTP
            r0[r2] = r3
            sso.type.AuthElementType r3 = sso.type.AuthElementType.PASSWORD
            r0[r1] = r3
            java.util.Set r0 = ie1.C41357x0.m119989i(r0)
        L_0x0042:
            ge.bog.sso_client.models.Session r3 = ba1.C10146d0.C10159c.m37143b()
            java.lang.String r3 = r3.getBiometricToken$sso_client_release()
            if (r3 == 0) goto L_0x0055
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r3 = r2
            goto L_0x0056
        L_0x0055:
            r3 = r1
        L_0x0056:
            if (r3 == 0) goto L_0x005e
            sso.type.AuthElementType r3 = sso.type.AuthElementType.BIOMETRY
            java.util.Set r0 = ie1.C41361y0.m120039k(r0, r3)
        L_0x005e:
            ge.bog.sso_client.models.Session r3 = ba1.C10146d0.C10159c.m37143b()
            java.lang.String r3 = r3.getPassCodeToken$sso_client_release()
            if (r3 == 0) goto L_0x0070
            int r3 = r3.length()
            if (r3 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r1 = r2
        L_0x0070:
            if (r1 == 0) goto L_0x0078
            sso.type.AuthElementType r1 = sso.type.AuthElementType.PASSCODE
            java.util.Set r0 = ie1.C41361y0.m120039k(r0, r1)
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.models.Session.getAvailableAuthTypes$sso_client_release():java.util.Set");
    }

    public final String getAvatarUrl() {
        return (String) C35962r.m107007e(this.avatarUrl$delegate, this, $$delegatedProperties[1]);
    }

    public final boolean getBiometricEnabled$sso_client_release() {
        return getAvailableAuthTypes$sso_client_release().contains(AuthElementType.BIOMETRY);
    }

    public final String getBiometricToken$sso_client_release() {
        return (String) C35962r.m107007e(this.biometricToken$delegate, this, $$delegatedProperties[8]);
    }

    public Set<Map.Entry<String, Object>> getEntries() {
        Set<Map.Entry<String, Object>> entrySet = this.$$delegate_0.entrySet();
        C41536l.m120488h(entrySet, "<get-entries>(...)");
        return entrySet;
    }

    public final String getFirstName() {
        return (String) C35962r.m107007e(this.firstName$delegate, this, $$delegatedProperties[2]);
    }

    public final Map<String, Object> getInternalAttrs$sso_client_release() {
        return this.internalAttrs;
    }

    public Set<String> getKeys() {
        Set<String> keySet = this.$$delegate_0.keySet();
        C41536l.m120488h(keySet, "<get-keys>(...)");
        return keySet;
    }

    public final String getLastName() {
        return (String) C35962r.m107007e(this.lastName$delegate, this, $$delegatedProperties[3]);
    }

    public final Set<AuthElementType> getLoginAuthTypes$sso_client_release() {
        return (Set) C35962r.m107007e(this.loginAuthTypes$delegate, this, $$delegatedProperties[9]);
    }

    public final C35940h getLoginUserInInfo() {
        return (C35940h) C35962r.m107007e(this.loginUserInInfo$delegate, this, $$delegatedProperties[12]);
    }

    public final List<UserContact> getMails() {
        return (List) C35962r.m107007e(this.mails$delegate, this, $$delegatedProperties[5]);
    }

    public final Boolean getOfferSecuritySettingsSetup() {
        if (getAvailableAuthTypes$sso_client_release().containsAll(C41357x0.m119989i(AuthElementType.TRUSTED_DEVICE, AuthElementType.BIOMETRY, AuthElementType.PASSCODE))) {
            return Boolean.FALSE;
        }
        return get_offerSecuritySettingsSetup();
    }

    public final boolean getPassCodeEnabled$sso_client_release() {
        return getAvailableAuthTypes$sso_client_release().contains(AuthElementType.PASSCODE);
    }

    public final String getPassCodeToken$sso_client_release() {
        return (String) C35962r.m107007e(this.passCodeToken$delegate, this, $$delegatedProperties[7]);
    }

    public final List<UserContact> getPhones() {
        return (List) C35962r.m107007e(this.phones$delegate, this, $$delegatedProperties[4]);
    }

    public final String getProcessReference$sso_client_release() {
        return (String) C35962r.m107007e(this.processReference$delegate, this, $$delegatedProperties[19]);
    }

    public final String getRefreshToken$sso_client_release() {
        return (String) C35962r.m107007e(this.refreshToken$delegate, this, $$delegatedProperties[13]);
    }

    public final Boolean getSaveUser() {
        return (Boolean) C35962r.m107007e(this.saveUser$delegate, this, $$delegatedProperties[6]);
    }

    public final String getSavedCompanyClientKey$sso_client_release() {
        return (String) C35962r.m107007e(this.savedCompanyClientKey$delegate, this, $$delegatedProperties[20]);
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    public final String getSsoToken$sso_client_release() {
        return (String) C35962r.m107007e(this.ssoToken$delegate, this, $$delegatedProperties[14]);
    }

    public final String getToken() {
        return (String) C35962r.m107007e(this.token$delegate, this, $$delegatedProperties[11]);
    }

    public final SessionUserInfo getUserInfo() {
        return new SessionUserInfo(getUsername(), getAvatarUrl(), getFirstName(), getLastName(), getPhones(), getMails());
    }

    public final String getUsername() {
        return (String) C35962r.m107007e(this.username$delegate, this, $$delegatedProperties[0]);
    }

    public Collection<Object> getValues() {
        Collection<Object> values = this.$$delegate_0.values();
        C41536l.m120488h(values, "<get-values>(...)");
        return values;
    }

    public final Boolean isChannelActive$sso_client_release() {
        return (Boolean) C35962r.m107007e(this.isChannelActive$delegate, this, $$delegatedProperties[15]);
    }

    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    public final Boolean isPasswordChangeRequired$sso_client_release() {
        return (Boolean) C35962r.m107007e(this.isPasswordChangeRequired$delegate, this, $$delegatedProperties[18]);
    }

    public final Boolean isPasswordExpired$sso_client_release() {
        return (Boolean) C35962r.m107007e(this.isPasswordExpired$delegate, this, $$delegatedProperties[16]);
    }

    public final Boolean isUserNameChangeRequired$sso_client_release() {
        return (Boolean) C35962r.m107007e(this.isUserNameChangeRequired$delegate, this, $$delegatedProperties[17]);
    }

    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    public Object put(String str, Object obj) {
        C41536l.m120489i(str, "key");
        return this.$$delegate_0.put(str, obj);
    }

    public final void put$sso_client_release(C35939g gVar) {
        C41536l.m120489i(gVar, "logInInfo");
        setChannelActive$sso_client_release(gVar.mo88498b());
        setPasswordExpired$sso_client_release(gVar.mo88500d());
        setUserNameChangeRequired$sso_client_release(gVar.mo88501e());
        setPasswordChangeRequired$sso_client_release(gVar.mo88499c());
        setProcessReference$sso_client_release(gVar.mo88497a());
    }

    public void putAll(Map<? extends String, ? extends Object> map) {
        C41536l.m120489i(map, "from");
        this.$$delegate_0.putAll(map);
    }

    public Object remove(String str) {
        C41536l.m120489i(str, "key");
        return this.$$delegate_0.remove(str);
    }

    public final void setAlwaysSkipSecurityOffer$sso_client_release(Boolean bool) {
        set_alwaysSkipSecurityOffer(bool);
    }

    public final void setAvailableAuthTypes$sso_client_release(Set<? extends AuthElementType> set) {
        C41536l.m120489i(set, C11755a.C11756a.f34100b);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(set, 10));
        for (AuthElementType rawValue : set) {
            arrayList.add(rawValue.getRawValue());
        }
        set_availableAuthTypes(new ArrayList(arrayList));
    }

    public final void setAvatarUrl(String str) {
        C35962r.m107008f(this.avatarUrl$delegate, this, $$delegatedProperties[1], str);
    }

    public final void setBiometricToken$sso_client_release(String str) {
        C35962r.m107008f(this.biometricToken$delegate, this, $$delegatedProperties[8], str);
    }

    public final void setChannelActive$sso_client_release(Boolean bool) {
        C35962r.m107008f(this.isChannelActive$delegate, this, $$delegatedProperties[15], bool);
    }

    public final void setFirstName(String str) {
        C35962r.m107008f(this.firstName$delegate, this, $$delegatedProperties[2], str);
    }

    public final void setLastName(String str) {
        C35962r.m107008f(this.lastName$delegate, this, $$delegatedProperties[3], str);
    }

    public final void setLastUserIsTrusted$sso_client_release(String str) {
        if (!C41536l.m120484d(str, "SET") && str != null) {
            C35962r.m107005c(this, new C35930a(str));
        }
    }

    public final void setLoginAuthTypes$sso_client_release(Set<? extends AuthElementType> set) {
        C35962r.m107008f(this.loginAuthTypes$delegate, this, $$delegatedProperties[9], set);
    }

    public final void setLoginUserInInfo$sso_client_release(C35940h hVar) {
        C35962r.m107008f(this.loginUserInInfo$delegate, this, $$delegatedProperties[12], hVar);
    }

    public final void setMails(List<UserContact> list) {
        C35962r.m107008f(this.mails$delegate, this, $$delegatedProperties[5], list);
    }

    public final void setOfferSecuritySettingsSetup(Boolean bool) {
        set_offerSecuritySettingsSetup(bool);
    }

    public final void setPassCodeToken$sso_client_release(String str) {
        C35962r.m107008f(this.passCodeToken$delegate, this, $$delegatedProperties[7], str);
    }

    public final void setPasswordChangeRequired$sso_client_release(Boolean bool) {
        C35962r.m107008f(this.isPasswordChangeRequired$delegate, this, $$delegatedProperties[18], bool);
    }

    public final void setPasswordExpired$sso_client_release(Boolean bool) {
        C35962r.m107008f(this.isPasswordExpired$delegate, this, $$delegatedProperties[16], bool);
    }

    public final void setPhones(List<UserContact> list) {
        C35962r.m107008f(this.phones$delegate, this, $$delegatedProperties[4], list);
    }

    public final void setProcessReference$sso_client_release(String str) {
        C35962r.m107008f(this.processReference$delegate, this, $$delegatedProperties[19], str);
    }

    public final void setRefreshToken$sso_client_release(String str) {
        C35962r.m107008f(this.refreshToken$delegate, this, $$delegatedProperties[13], str);
    }

    public final void setSaveUser(Boolean bool) {
        C35962r.m107008f(this.saveUser$delegate, this, $$delegatedProperties[6], bool);
    }

    public final void setSavedCompanyClientKey$sso_client_release(String str) {
        C35962r.m107008f(this.savedCompanyClientKey$delegate, this, $$delegatedProperties[20], str);
    }

    public final void setSsoToken$sso_client_release(String str) {
        C35962r.m107008f(this.ssoToken$delegate, this, $$delegatedProperties[14], str);
    }

    public final void setToken$sso_client_release(String str) {
        C35962r.m107008f(this.token$delegate, this, $$delegatedProperties[11], str);
    }

    public final void setUserNameChangeRequired$sso_client_release(Boolean bool) {
        C35962r.m107008f(this.isUserNameChangeRequired$delegate, this, $$delegatedProperties[17], bool);
    }

    public final void setUsername$sso_client_release(String str) {
        C35962r.m107008f(this.username$delegate, this, $$delegatedProperties[0], str);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public Session(Map<String, Object> map, Map<String, Object> map2) {
        C41536l.m120489i(map, "internalAttrs");
        C41536l.m120489i(map2, "sessionAttrs");
        this.internalAttrs = map;
        this.sessionAttrs = map2;
        this.$$delegate_0 = new HashMap<>();
        this.username$delegate = map;
        this.avatarUrl$delegate = map;
        this.firstName$delegate = map;
        this.lastName$delegate = map;
        this.phones$delegate = map;
        this.mails$delegate = map;
        this.saveUser$delegate = map2;
        this.passCodeToken$delegate = map;
        this.biometricToken$delegate = map;
        this.loginAuthTypes$delegate = map2;
        this._availableAuthTypes$delegate = map;
        this.token$delegate = map2;
        this.loginUserInInfo$delegate = map2;
        this.refreshToken$delegate = map2;
        this.ssoToken$delegate = map2;
        this.isChannelActive$delegate = map2;
        this.isPasswordExpired$delegate = map2;
        this.isUserNameChangeRequired$delegate = map2;
        this.isPasswordChangeRequired$delegate = map2;
        this.processReference$delegate = map2;
        this.savedCompanyClientKey$delegate = map;
        this._alwaysSkipSecurityOffer$delegate = map;
        this._offerSecuritySettingsSetup$delegate = map;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public final void put$sso_client_release(C35933a aVar) {
        C41536l.m120489i(aVar, "accessToken");
        setToken$sso_client_release(aVar.mo88459b());
        setRefreshToken$sso_client_release(aVar.mo88458a());
        try {
            String token = getToken();
            if (token == null) {
                token = "";
            }
            JWT jwt = new JWT(token);
            setLoginUserInInfo$sso_client_release(new C35940h(jwt.mo7649d("userId").mo7659a(), jwt.mo7649d("clientKey").mo7659a(), jwt.mo7649d("username").mo7659a(), jwt.mo7649d("mustChangeUsername").mo7660c(), jwt.mo7649d("mustChangePassword").mo7660c()));
        } catch (Exception unused) {
            setToken$sso_client_release((String) null);
            setRefreshToken$sso_client_release((String) null);
            setLoginUserInInfo$sso_client_release((C35940h) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Session(java.util.Map r2, java.util.Map r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r1 = this;
            r5 = r4 & 1
            java.lang.String r0 = "synchronizedMap(SessionAttrsImpl())"
            if (r5 == 0) goto L_0x0012
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Map r2 = p342j$.util.DesugarCollections.synchronizedMap(r2)
            kotlin.jvm.internal.C41536l.m120488h(r2, r0)
        L_0x0012:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0022
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Map r3 = p342j$.util.DesugarCollections.synchronizedMap(r3)
            kotlin.jvm.internal.C41536l.m120488h(r3, r0)
        L_0x0022:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.sso_client.models.Session.<init>(java.util.Map, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
