package com.auth0.android.jwt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.gson.C5490d;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;
import p316xa.C8982a;

public class JWT implements Parcelable {
    public static final Parcelable.Creator<JWT> CREATOR = new C2372a();

    /* renamed from: d */
    private final String f7512d;

    /* renamed from: e */
    private Map f7513e;

    /* renamed from: f */
    private C2377d f7514f;

    /* renamed from: g */
    private String f7515g;

    /* renamed from: com.auth0.android.jwt.JWT$a */
    static class C2372a implements Parcelable.Creator {
        C2372a() {
        }

        /* renamed from: a */
        public JWT createFromParcel(Parcel parcel) {
            return new JWT(parcel.readString());
        }

        /* renamed from: b */
        public JWT[] newArray(int i) {
            return new JWT[i];
        }
    }

    /* renamed from: com.auth0.android.jwt.JWT$b */
    class C2373b extends C8982a<Map<String, String>> {
        C2373b() {
        }
    }

    public JWT(String str) {
        m9164b(str);
        this.f7512d = str;
    }

    /* renamed from: a */
    private String m9163a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e) {
            throw new DecodeException("Received bytes didn't correspond to a valid Base64 encoded string.", e);
        }
    }

    /* renamed from: b */
    private void m9164b(String str) {
        String[] g = m9167g(str);
        this.f7513e = (Map) m9166f(m9163a(g[0]), new C2373b().getType());
        this.f7514f = (C2377d) m9166f(m9163a(g[1]), C2377d.class);
        this.f7515g = g[2];
    }

    /* renamed from: e */
    static Gson m9165e() {
        return new C5490d().mo18205d(C2377d.class, new JWTDeserializer()).mo18203b();
    }

    /* renamed from: f */
    private Object m9166f(String str, Type type) {
        try {
            return m9165e().mo18171m(str, type);
        } catch (Exception e) {
            throw new DecodeException("The token's payload had an invalid JSON format.", e);
        }
    }

    /* renamed from: g */
    private String[] m9167g(String str) {
        String[] split = str.split("\\.");
        if (split.length == 2 && str.endsWith(".")) {
            split = new String[]{split[0], split[1], ""};
        }
        if (split.length == 3) {
            return split;
        }
        throw new DecodeException(String.format("The token was expected to have 3 parts, but got %s.", new Object[]{Integer.valueOf(split.length)}));
    }

    /* renamed from: d */
    public C2375b mo7649d(String str) {
        return this.f7514f.mo7661a(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f7512d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7512d);
    }
}
