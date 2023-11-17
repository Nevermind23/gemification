package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p297w4.C8801h;
import p297w4.C8817m;
import p297w4.C8819n;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C2604a();

    /* renamed from: r */
    static final C2606c f8120r = new C2606c(BogInputLayout.INPUT_NORMAL_STATE, 299, (C2604a) null);

    /* renamed from: d */
    private final C2605b f8121d;

    /* renamed from: e */
    private final int f8122e;

    /* renamed from: f */
    private final int f8123f;

    /* renamed from: g */
    private final int f8124g;

    /* renamed from: h */
    private final String f8125h;

    /* renamed from: i */
    private final String f8126i;

    /* renamed from: j */
    private final String f8127j;

    /* renamed from: k */
    private final String f8128k;

    /* renamed from: l */
    private final String f8129l;

    /* renamed from: m */
    private final JSONObject f8130m;

    /* renamed from: n */
    private final JSONObject f8131n;

    /* renamed from: o */
    private final Object f8132o;

    /* renamed from: p */
    private final HttpURLConnection f8133p;

    /* renamed from: q */
    private final FacebookException f8134q;

    /* renamed from: com.facebook.FacebookRequestError$a */
    static class C2604a implements Parcelable.Creator {
        C2604a() {
        }

        /* renamed from: a */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, (C2604a) null);
        }

        /* renamed from: b */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    public enum C2605b {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$c */
    private static class C2606c {

        /* renamed from: a */
        private final int f8139a;

        /* renamed from: b */
        private final int f8140b;

        /* synthetic */ C2606c(int i, int i2, C2604a aVar) {
            this(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8173a(int i) {
            return this.f8139a <= i && i <= this.f8140b;
        }

        private C2606c(int i, int i2) {
            this.f8139a = i;
            this.f8140b = i2;
        }
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, C2604a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static FacebookRequestError m9994a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        JSONObject jSONObject2;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        JSONObject jSONObject3 = jSONObject;
        try {
            if (jSONObject3.has("code")) {
                int i3 = jSONObject3.getInt("code");
                Object D = C8769a0.m32631D(jSONObject3, "body", "FACEBOOK_NON_JSON_RESULT");
                if (D != null && (D instanceof JSONObject)) {
                    JSONObject jSONObject4 = (JSONObject) D;
                    boolean z2 = false;
                    if (jSONObject4.has("error")) {
                        JSONObject jSONObject5 = (JSONObject) C8769a0.m32631D(jSONObject4, "error", (String) null);
                        String optString = jSONObject5.optString("type", (String) null);
                        String optString2 = jSONObject5.optString("message", (String) null);
                        i2 = jSONObject5.optInt("code", -1);
                        int optInt = jSONObject5.optInt("error_subcode", -1);
                        str2 = jSONObject5.optString("error_user_msg", (String) null);
                        str = jSONObject5.optString("error_user_title", (String) null);
                        z = jSONObject5.optBoolean("is_transient", false);
                        z2 = true;
                        str4 = optString;
                        int i4 = optInt;
                        str3 = optString2;
                        i = i4;
                    } else {
                        if (!jSONObject4.has("error_code")) {
                            if (!jSONObject4.has("error_msg")) {
                                if (!jSONObject4.has("error_reason")) {
                                    z = false;
                                    i2 = -1;
                                    i = -1;
                                    str4 = null;
                                    str3 = null;
                                    str2 = null;
                                    str = null;
                                }
                            }
                        }
                        String optString3 = jSONObject4.optString("error_reason", (String) null);
                        String optString4 = jSONObject4.optString("error_msg", (String) null);
                        int optInt2 = jSONObject4.optInt("error_code", -1);
                        i = jSONObject4.optInt("error_subcode", -1);
                        str3 = optString4;
                        z = false;
                        str2 = null;
                        str = null;
                        i2 = optInt2;
                        z2 = true;
                        str4 = optString3;
                    }
                    if (z2) {
                        return new FacebookRequestError(i3, i2, i, str4, str3, str, str2, z, jSONObject4, jSONObject, obj, httpURLConnection, (FacebookException) null);
                    }
                }
                if (!f8120r.mo8173a(i3)) {
                    if (jSONObject3.has("body")) {
                        jSONObject2 = (JSONObject) C8769a0.m32631D(jSONObject3, "body", "FACEBOOK_NON_JSON_RESULT");
                    } else {
                        jSONObject2 = null;
                    }
                    return new FacebookRequestError(i3, -1, -1, (String) null, (String) null, (String) null, (String) null, false, jSONObject2, jSONObject, obj, httpURLConnection, (FacebookException) null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* renamed from: b */
    static synchronized C8801h m9995b() {
        synchronized (FacebookRequestError.class) {
            C8817m j = C8819n.m32843j(C2626d.m10135f());
            if (j == null) {
                C8801h c = C8801h.m32781c();
                return c;
            }
            C8801h c2 = j.mo24240c();
            return c2;
        }
    }

    /* renamed from: d */
    public int mo8160d() {
        return this.f8123f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo8162e() {
        String str = this.f8126i;
        if (str != null) {
            return str;
        }
        return this.f8134q.getLocalizedMessage();
    }

    /* renamed from: f */
    public String mo8163f() {
        return this.f8125h;
    }

    /* renamed from: g */
    public FacebookException mo8164g() {
        return this.f8134q;
    }

    /* renamed from: h */
    public int mo8165h() {
        return this.f8122e;
    }

    /* renamed from: i */
    public int mo8166i() {
        return this.f8124g;
    }

    public String toString() {
        return "{HttpStatus: " + this.f8122e + ", errorCode: " + this.f8123f + ", subErrorCode: " + this.f8124g + ", errorType: " + this.f8125h + ", errorMessage: " + mo8162e() + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8122e);
        parcel.writeInt(this.f8123f);
        parcel.writeInt(this.f8124g);
        parcel.writeString(this.f8125h);
        parcel.writeString(this.f8126i);
        parcel.writeString(this.f8127j);
        parcel.writeString(this.f8128k);
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        boolean z2;
        C2605b bVar;
        this.f8122e = i;
        this.f8123f = i2;
        this.f8124g = i3;
        this.f8125h = str;
        this.f8126i = str2;
        this.f8131n = jSONObject;
        this.f8130m = jSONObject2;
        this.f8132o = obj;
        this.f8133p = httpURLConnection;
        this.f8127j = str3;
        this.f8128k = str4;
        if (facebookException != null) {
            this.f8134q = facebookException;
            z2 = true;
        } else {
            this.f8134q = new FacebookServiceException(this, str2);
            z2 = false;
        }
        C8801h b = m9995b();
        if (z2) {
            bVar = C2605b.OTHER;
        } else {
            bVar = b.mo24229a(i2, i3, z);
        }
        this.f8121d = bVar;
        this.f8129l = b.mo24230e(bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FacebookRequestError(java.net.HttpURLConnection r15, java.lang.Exception r16) {
        /*
            r14 = this;
            r0 = r16
            r1 = -1
            r2 = -1
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            boolean r12 = r0 instanceof com.facebook.FacebookException
            if (r12 == 0) goto L_0x0015
            com.facebook.FacebookException r0 = (com.facebook.FacebookException) r0
            r13 = r0
            goto L_0x001b
        L_0x0015:
            com.facebook.FacebookException r12 = new com.facebook.FacebookException
            r12.<init>((java.lang.Throwable) r0)
            r13 = r12
        L_0x001b:
            r0 = r14
            r12 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, (String) null, (String) null, false, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null);
    }
}
