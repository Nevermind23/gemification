package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p078f6.C6161b;
import p182n6.C7264i;
import p195o6.C7461a;
import p260t6.C8404f;
import p260t6.C8407i;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C3823c();

    /* renamed from: q */
    public static C8404f f12144q = C8407i.m31544d();

    /* renamed from: d */
    final int f12145d;

    /* renamed from: e */
    private String f12146e;

    /* renamed from: f */
    private String f12147f;

    /* renamed from: g */
    private String f12148g;

    /* renamed from: h */
    private String f12149h;

    /* renamed from: i */
    private Uri f12150i;

    /* renamed from: j */
    private String f12151j;

    /* renamed from: k */
    private long f12152k;

    /* renamed from: l */
    private String f12153l;

    /* renamed from: m */
    List f12154m;

    /* renamed from: n */
    private String f12155n;

    /* renamed from: o */
    private String f12156o;

    /* renamed from: p */
    private Set f12157p = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f12145d = i;
        this.f12146e = str;
        this.f12147f = str2;
        this.f12148g = str3;
        this.f12149h = str4;
        this.f12150i = uri;
        this.f12151j = str5;
        this.f12152k = j;
        this.f12153l = str6;
        this.f12154m = list;
        this.f12155n = str7;
        this.f12156o = str8;
    }

    /* renamed from: F1 */
    public static GoogleSignInAccount m14379F1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), C7264i.m27898g(str7), new ArrayList((Collection) C7264i.m27902k(set)), str5, str6);
    }

    /* renamed from: G1 */
    public static GoogleSignInAccount m14380G1(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount F1 = m14379F1(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        F1.f12151j = str7;
        return F1;
    }

    /* renamed from: H1 */
    public final String mo11761H1() {
        return this.f12153l;
    }

    /* renamed from: I1 */
    public final String mo11762I1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo11765f0() != null) {
                jSONObject.put("id", mo11765f0());
            }
            if (mo11769q0() != null) {
                jSONObject.put("tokenId", mo11769q0());
            }
            if (mo11772w() != null) {
                jSONObject.put("email", mo11772w());
            }
            if (mo11771v() != null) {
                jSONObject.put("displayName", mo11771v());
            }
            if (mo11763R() != null) {
                jSONObject.put("givenName", mo11763R());
            }
            if (mo11774x() != null) {
                jSONObject.put("familyName", mo11774x());
            }
            Uri s0 = mo11770s0();
            if (s0 != null) {
                jSONObject.put("photoUrl", s0.toString());
            }
            if (mo11768i1() != null) {
                jSONObject.put("serverAuthCode", mo11768i1());
            }
            jSONObject.put("expirationTime", this.f12152k);
            jSONObject.put("obfuscatedIdentifier", this.f12153l);
            JSONArray jSONArray = new JSONArray();
            List list = this.f12154m;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C6161b.f19141d);
            for (Scope v : scopeArr) {
                jSONArray.put(v.mo11897v());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: R */
    public String mo11763R() {
        return this.f12155n;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f12153l.equals(this.f12153l) || !googleSignInAccount.mo11766f1().equals(mo11766f1())) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public String mo11765f0() {
        return this.f12146e;
    }

    /* renamed from: f1 */
    public Set mo11766f1() {
        HashSet hashSet = new HashSet(this.f12154m);
        hashSet.addAll(this.f12157p);
        return hashSet;
    }

    public int hashCode() {
        return ((this.f12153l.hashCode() + 527) * 31) + mo11766f1().hashCode();
    }

    /* renamed from: i1 */
    public String mo11768i1() {
        return this.f12151j;
    }

    /* renamed from: q0 */
    public String mo11769q0() {
        return this.f12147f;
    }

    /* renamed from: s0 */
    public Uri mo11770s0() {
        return this.f12150i;
    }

    /* renamed from: v */
    public String mo11771v() {
        return this.f12149h;
    }

    /* renamed from: w */
    public String mo11772w() {
        return this.f12148g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12145d);
        C7461a.m28392x(parcel, 2, mo11765f0(), false);
        C7461a.m28392x(parcel, 3, mo11769q0(), false);
        C7461a.m28392x(parcel, 4, mo11772w(), false);
        C7461a.m28392x(parcel, 5, mo11771v(), false);
        C7461a.m28390v(parcel, 6, mo11770s0(), i, false);
        C7461a.m28392x(parcel, 7, mo11768i1(), false);
        C7461a.m28387s(parcel, 8, this.f12152k);
        C7461a.m28392x(parcel, 9, this.f12153l, false);
        C7461a.m28364C(parcel, 10, this.f12154m, false);
        C7461a.m28392x(parcel, 11, mo11763R(), false);
        C7461a.m28392x(parcel, 12, mo11774x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo11774x() {
        return this.f12156o;
    }
}
