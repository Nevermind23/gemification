package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p297w4.C8775b0;

public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR = new C2599a();

    /* renamed from: o */
    private static final Date f8083o;

    /* renamed from: p */
    private static final Date f8084p;

    /* renamed from: q */
    private static final Date f8085q = new Date();

    /* renamed from: r */
    private static final C2625c f8086r = C2625c.FACEBOOK_APPLICATION_WEB;

    /* renamed from: d */
    private final Date f8087d;

    /* renamed from: e */
    private final Set f8088e;

    /* renamed from: f */
    private final Set f8089f;

    /* renamed from: g */
    private final Set f8090g;

    /* renamed from: h */
    private final String f8091h;

    /* renamed from: i */
    private final C2625c f8092i;

    /* renamed from: j */
    private final Date f8093j;

    /* renamed from: k */
    private final String f8094k;

    /* renamed from: l */
    private final String f8095l;

    /* renamed from: m */
    private final Date f8096m;

    /* renamed from: n */
    private final String f8097n;

    /* renamed from: com.facebook.AccessToken$a */
    static class C2599a implements Parcelable.Creator {
        C2599a() {
        }

        /* renamed from: a */
        public AccessToken createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }

        /* renamed from: b */
        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    /* renamed from: com.facebook.AccessToken$b */
    public interface C2600b {
        /* renamed from: a */
        void mo8144a(FacebookException facebookException);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f8083o = date;
        f8084p = date;
    }

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, C2625c cVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3, (String) null);
    }

    /* renamed from: a */
    private void m9960a(StringBuilder sb) {
        sb.append(" permissions:");
        if (this.f8088e == null) {
            sb.append("null");
            return;
        }
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f8088e));
        sb.append("]");
    }

    /* renamed from: b */
    static AccessToken m9961b(AccessToken accessToken) {
        return new AccessToken(accessToken.f8091h, accessToken.f8094k, accessToken.mo8136u(), accessToken.mo8132q(), accessToken.mo8127j(), accessToken.mo8128k(), accessToken.f8092i, new Date(), new Date(), accessToken.f8096m);
    }

    /* renamed from: d */
    static AccessToken m9962d(JSONObject jSONObject) {
        Collection collection;
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            C2625c valueOf = C2625c.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            String optString = jSONObject.optString("graph_domain", (String) null);
            List T = C8769a0.m32647T(jSONArray);
            List T2 = C8769a0.m32647T(jSONArray2);
            if (optJSONArray == null) {
                collection = new ArrayList();
            } else {
                collection = C8769a0.m32647T(optJSONArray);
            }
            return new AccessToken(string, string2, string3, T, T2, collection, valueOf, date, date2, date3, optString);
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    /* renamed from: e */
    static AccessToken m9963e(Bundle bundle) {
        List r = m9966r(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List r2 = m9966r(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List r3 = m9966r(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String c = C2644j.m10195c(bundle);
        if (C8769a0.m32644Q(c)) {
            c = C2626d.m10135f();
        }
        String str = c;
        String f = C2644j.m10198f(bundle);
        try {
            return new AccessToken(f, str, C8769a0.m32660d(f).getString("id"), r, r2, r3, C2644j.m10197e(bundle), C2644j.m10196d(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C2644j.m10196d(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), (Date) null);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    static void m9964f() {
        AccessToken g = C2619b.m10107h().mo8233g();
        if (g != null) {
            m9968x(m9961b(g));
        }
    }

    /* renamed from: h */
    public static AccessToken m9965h() {
        return C2619b.m10107h().mo8233g();
    }

    /* renamed from: r */
    static List m9966r(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    /* renamed from: v */
    public static boolean m9967v() {
        AccessToken g = C2619b.m10107h().mo8233g();
        if (g == null || g.mo8137w()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public static void m9968x(AccessToken accessToken) {
        C2619b.m10107h().mo8236m(accessToken);
    }

    /* renamed from: z */
    private String m9969z() {
        if (this.f8091h == null) {
            return "null";
        }
        if (C2626d.m10154y(C2645k.INCLUDE_ACCESS_TOKENS)) {
            return this.f8091h;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.f8087d.equals(accessToken.f8087d) && this.f8088e.equals(accessToken.f8088e) && this.f8089f.equals(accessToken.f8089f) && this.f8090g.equals(accessToken.f8090g) && this.f8091h.equals(accessToken.f8091h) && this.f8092i == accessToken.f8092i && this.f8093j.equals(accessToken.f8093j) && ((str = this.f8094k) != null ? str.equals(accessToken.f8094k) : accessToken.f8094k == null) && this.f8095l.equals(accessToken.f8095l) && this.f8096m.equals(accessToken.f8096m)) {
            String str2 = this.f8097n;
            String str3 = accessToken.f8097n;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
            } else if (str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public String mo8124g() {
        return this.f8094k;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((((527 + this.f8087d.hashCode()) * 31) + this.f8088e.hashCode()) * 31) + this.f8089f.hashCode()) * 31) + this.f8090g.hashCode()) * 31) + this.f8091h.hashCode()) * 31) + this.f8092i.hashCode()) * 31) + this.f8093j.hashCode()) * 31;
        String str = this.f8094k;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.f8095l.hashCode()) * 31) + this.f8096m.hashCode()) * 31;
        String str2 = this.f8097n;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: i */
    public Date mo8126i() {
        return this.f8096m;
    }

    /* renamed from: j */
    public Set mo8127j() {
        return this.f8089f;
    }

    /* renamed from: k */
    public Set mo8128k() {
        return this.f8090g;
    }

    /* renamed from: l */
    public Date mo8129l() {
        return this.f8087d;
    }

    /* renamed from: m */
    public String mo8130m() {
        return this.f8097n;
    }

    /* renamed from: p */
    public Date mo8131p() {
        return this.f8093j;
    }

    /* renamed from: q */
    public Set mo8132q() {
        return this.f8088e;
    }

    /* renamed from: s */
    public C2625c mo8133s() {
        return this.f8092i;
    }

    /* renamed from: t */
    public String mo8134t() {
        return this.f8091h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m9969z());
        m9960a(sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public String mo8136u() {
        return this.f8095l;
    }

    /* renamed from: w */
    public boolean mo8137w() {
        return new Date().after(this.f8087d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8087d.getTime());
        parcel.writeStringList(new ArrayList(this.f8088e));
        parcel.writeStringList(new ArrayList(this.f8089f));
        parcel.writeStringList(new ArrayList(this.f8090g));
        parcel.writeString(this.f8091h);
        parcel.writeString(this.f8092i.name());
        parcel.writeLong(this.f8093j.getTime());
        parcel.writeString(this.f8094k);
        parcel.writeString(this.f8095l);
        parcel.writeLong(this.f8096m.getTime());
        parcel.writeString(this.f8097n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public JSONObject mo8139y() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f8091h);
        jSONObject.put("expires_at", this.f8087d.getTime());
        jSONObject.put("permissions", new JSONArray(this.f8088e));
        jSONObject.put("declined_permissions", new JSONArray(this.f8089f));
        jSONObject.put("expired_permissions", new JSONArray(this.f8090g));
        jSONObject.put("last_refresh", this.f8093j.getTime());
        jSONObject.put("source", this.f8092i.name());
        jSONObject.put("application_id", this.f8094k);
        jSONObject.put("user_id", this.f8095l);
        jSONObject.put("data_access_expiration_time", this.f8096m.getTime());
        String str = this.f8097n;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, C2625c cVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C8775b0.m32717j(str, "accessToken");
        C8775b0.m32717j(str2, "applicationId");
        C8775b0.m32717j(str3, "userId");
        this.f8087d = date == null ? f8084p : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        this.f8088e = Collections.unmodifiableSet(hashSet);
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        this.f8089f = Collections.unmodifiableSet(hashSet2);
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        this.f8090g = Collections.unmodifiableSet(hashSet3);
        this.f8091h = str;
        this.f8092i = cVar == null ? f8086r : cVar;
        this.f8093j = date2 == null ? f8085q : date2;
        this.f8094k = str2;
        this.f8095l = str3;
        this.f8096m = (date3 == null || date3.getTime() == 0) ? f8084p : date3;
        this.f8097n = str4;
    }

    AccessToken(Parcel parcel) {
        this.f8087d = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f8088e = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f8089f = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f8090g = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f8091h = parcel.readString();
        this.f8092i = C2625c.valueOf(parcel.readString());
        this.f8093j = new Date(parcel.readLong());
        this.f8094k = parcel.readString();
        this.f8095l = parcel.readString();
        this.f8096m = new Date(parcel.readLong());
        this.f8097n = parcel.readString();
    }
}
