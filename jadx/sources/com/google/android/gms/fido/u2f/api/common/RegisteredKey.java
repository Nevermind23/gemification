package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p182n6.C7264i;
import p195o6.C7461a;
import p336z6.C9213a;

@Deprecated
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new C9213a();

    /* renamed from: d */
    private final KeyHandle f13054d;

    /* renamed from: e */
    private final String f13055e;

    /* renamed from: f */
    String f13056f;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        this.f13054d = (KeyHandle) C7264i.m27902k(keyHandle);
        this.f13056f = str;
        this.f13055e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.f13056f;
        if (str == null) {
            if (registeredKey.f13056f != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.f13056f)) {
            return false;
        }
        if (!this.f13054d.equals(registeredKey.f13054d)) {
            return false;
        }
        String str2 = this.f13055e;
        if (str2 == null) {
            if (registeredKey.f13055e != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.f13055e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f13056f;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = ((i + 31) * 31) + this.f13054d.hashCode();
        String str2 = this.f13055e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (hashCode * 31) + i2;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f13054d.mo12690v(), 11));
            if (this.f13054d.mo12691w() != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", this.f13054d.mo12691w().toString());
            }
            if (this.f13054d.mo12693x() != null) {
                jSONObject.put("transports", this.f13054d.mo12693x().toString());
            }
            String str = this.f13056f;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f13055e;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: v */
    public String mo12722v() {
        return this.f13055e;
    }

    /* renamed from: w */
    public String mo12723w() {
        return this.f13056f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo12725x(), i, false);
        C7461a.m28392x(parcel, 3, mo12723w(), false);
        C7461a.m28392x(parcel, 4, mo12722v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public KeyHandle mo12725x() {
        return this.f13054d;
    }
}
