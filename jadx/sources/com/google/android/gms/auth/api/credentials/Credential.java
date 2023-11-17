package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

@Deprecated
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C3802a();

    /* renamed from: d */
    private final String f12034d;

    /* renamed from: e */
    private final String f12035e;

    /* renamed from: f */
    private final Uri f12036f;

    /* renamed from: g */
    private final List f12037g;

    /* renamed from: h */
    private final String f12038h;

    /* renamed from: i */
    private final String f12039i;

    /* renamed from: j */
    private final String f12040j;

    /* renamed from: k */
    private final String f12041k;

    Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List list2;
        Boolean bool;
        String trim = ((String) C7264i.m27903l(str, "credential identifier cannot be null")).trim();
        C7264i.m27899h(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                if (TextUtils.isEmpty(str4)) {
                    bool = Boolean.FALSE;
                } else {
                    Uri parse = Uri.parse(str4);
                    if (!parse.isAbsolute() || !parse.isHierarchical() || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority())) {
                        bool = Boolean.FALSE;
                    } else {
                        boolean z = true;
                        if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                if (!bool.booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f12035e = str2;
                this.f12036f = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f12037g = list2;
                this.f12034d = trim;
                this.f12038h = str3;
                this.f12039i = str4;
                this.f12040j = str5;
                this.f12041k = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    /* renamed from: R */
    public String mo11606R() {
        return this.f12034d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (!TextUtils.equals(this.f12034d, credential.f12034d) || !TextUtils.equals(this.f12035e, credential.f12035e) || !C7258g.m27880a(this.f12036f, credential.f12036f) || !TextUtils.equals(this.f12038h, credential.f12038h) || !TextUtils.equals(this.f12039i, credential.f12039i)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public List mo11608f0() {
        return this.f12037g;
    }

    /* renamed from: f1 */
    public Uri mo11609f1() {
        return this.f12036f;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12034d, this.f12035e, this.f12036f, this.f12038h, this.f12039i);
    }

    /* renamed from: q0 */
    public String mo11611q0() {
        return this.f12035e;
    }

    /* renamed from: s0 */
    public String mo11612s0() {
        return this.f12038h;
    }

    /* renamed from: v */
    public String mo11613v() {
        return this.f12039i;
    }

    /* renamed from: w */
    public String mo11614w() {
        return this.f12041k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo11606R(), false);
        C7461a.m28392x(parcel, 2, mo11611q0(), false);
        C7461a.m28390v(parcel, 3, mo11609f1(), i, false);
        C7461a.m28364C(parcel, 4, mo11608f0(), false);
        C7461a.m28392x(parcel, 5, mo11612s0(), false);
        C7461a.m28392x(parcel, 6, mo11613v(), false);
        C7461a.m28392x(parcel, 9, mo11616x(), false);
        C7461a.m28392x(parcel, 10, mo11614w(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo11616x() {
        return this.f12040j;
    }
}
