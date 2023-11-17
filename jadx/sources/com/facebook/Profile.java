package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p297w4.C8775b0;

public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new C2616b();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f8174j = "Profile";

    /* renamed from: d */
    private final String f8175d;

    /* renamed from: e */
    private final String f8176e;

    /* renamed from: f */
    private final String f8177f;

    /* renamed from: g */
    private final String f8178g;

    /* renamed from: h */
    private final String f8179h;

    /* renamed from: i */
    private final Uri f8180i;

    /* renamed from: com.facebook.Profile$a */
    static class C2615a implements C8769a0.C8772c {
        C2615a() {
        }

        /* renamed from: a */
        public void mo8221a(JSONObject jSONObject) {
            Uri uri;
            String optString = jSONObject.optString("id");
            if (optString == null) {
                Log.w(Profile.f8174j, "No user ID returned on Me request");
                return;
            }
            String optString2 = jSONObject.optString("link");
            String optString3 = jSONObject.optString("first_name");
            String optString4 = jSONObject.optString("middle_name");
            String optString5 = jSONObject.optString("last_name");
            String optString6 = jSONObject.optString("name");
            if (optString2 != null) {
                uri = Uri.parse(optString2);
            } else {
                uri = null;
            }
            Profile.m10088e(new Profile(optString, optString3, optString4, optString5, optString6, uri));
        }

        /* renamed from: b */
        public void mo8222b(FacebookException facebookException) {
            String a = Profile.f8174j;
            Log.e(a, "Got unexpected exception: " + facebookException);
        }
    }

    /* renamed from: com.facebook.Profile$b */
    static class C2616b implements Parcelable.Creator {
        C2616b() {
        }

        /* renamed from: a */
        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel, (C2615a) null);
        }

        /* renamed from: b */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    }

    /* synthetic */ Profile(Parcel parcel, C2615a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    public static void m10086b() {
        AccessToken h = AccessToken.m9965h();
        if (!AccessToken.m9967v()) {
            m10088e((Profile) null);
        } else {
            C8769a0.m32697y(h.mo8134t(), new C2615a());
        }
    }

    /* renamed from: d */
    public static Profile m10087d() {
        return C2681m.m10414b().mo8452a();
    }

    /* renamed from: e */
    public static void m10088e(Profile profile) {
        C2681m.m10414b().mo8454e(profile);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        String str = this.f8175d;
        if (str != null ? str.equals(profile.f8175d) : profile.f8175d == null) {
            String str2 = this.f8176e;
            if (str2 != null ? str2.equals(profile.f8176e) : profile.f8176e == null) {
                String str3 = this.f8177f;
                if (str3 != null ? str3.equals(profile.f8177f) : profile.f8177f == null) {
                    String str4 = this.f8178g;
                    if (str4 != null ? str4.equals(profile.f8178g) : profile.f8178g == null) {
                        String str5 = this.f8179h;
                        if (str5 != null ? str5.equals(profile.f8179h) : profile.f8179h == null) {
                            Uri uri = this.f8180i;
                            Uri uri2 = profile.f8180i;
                            if (uri == null) {
                                if (uri2 == null) {
                                    return true;
                                }
                            } else if (uri.equals(uri2)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public JSONObject mo8218f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f8175d);
            jSONObject.put("first_name", this.f8176e);
            jSONObject.put("middle_name", this.f8177f);
            jSONObject.put("last_name", this.f8178g);
            jSONObject.put("name", this.f8179h);
            Uri uri = this.f8180i;
            if (uri == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", uri.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int hashCode() {
        int hashCode = 527 + this.f8175d.hashCode();
        String str = this.f8176e;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.f8177f;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f8178g;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f8179h;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.f8180i;
        if (uri != null) {
            return (hashCode * 31) + uri.hashCode();
        }
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f8175d);
        parcel.writeString(this.f8176e);
        parcel.writeString(this.f8177f);
        parcel.writeString(this.f8178g);
        parcel.writeString(this.f8179h);
        Uri uri = this.f8180i;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        parcel.writeString(str);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C8775b0.m32717j(str, "id");
        this.f8175d = str;
        this.f8176e = str2;
        this.f8177f = str3;
        this.f8178g = str4;
        this.f8179h = str5;
        this.f8180i = uri;
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f8175d = jSONObject.optString("id", (String) null);
        this.f8176e = jSONObject.optString("first_name", (String) null);
        this.f8177f = jSONObject.optString("middle_name", (String) null);
        this.f8178g = jSONObject.optString("last_name", (String) null);
        this.f8179h = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        this.f8180i = optString != null ? Uri.parse(optString) : uri;
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.f8175d = parcel.readString();
        this.f8176e = parcel.readString();
        this.f8177f = parcel.readString();
        this.f8178g = parcel.readString();
        this.f8179h = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f8180i = uri;
    }
}
