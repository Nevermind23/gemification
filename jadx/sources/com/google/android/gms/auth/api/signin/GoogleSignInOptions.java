package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p078f6.C6162c;
import p091g6.C6228a;
import p182n6.C7264i;
import p195o6.C7461a;

public class GoogleSignInOptions extends AbstractSafeParcelable implements C3847a.C3851d, C3847a.C3851d.C3853b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C3825e();

    /* renamed from: o */
    public static final GoogleSignInOptions f12158o;

    /* renamed from: p */
    public static final GoogleSignInOptions f12159p;

    /* renamed from: q */
    public static final Scope f12160q = new Scope("profile");

    /* renamed from: r */
    public static final Scope f12161r = new Scope("email");

    /* renamed from: s */
    public static final Scope f12162s = new Scope("openid");

    /* renamed from: t */
    public static final Scope f12163t;

    /* renamed from: u */
    public static final Scope f12164u = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: v */
    private static Comparator f12165v = new C3824d();

    /* renamed from: d */
    final int f12166d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ArrayList f12167e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Account f12168f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f12169g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f12170h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final boolean f12171i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f12172j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f12173k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ArrayList f12174l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f12175m;

    /* renamed from: n */
    private Map f12176n;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f12163t = scope;
        C3820a aVar = new C3820a();
        aVar.mo11788b();
        aVar.mo11789c();
        f12158o = aVar.mo11787a();
        C3820a aVar2 = new C3820a();
        aVar2.mo11790d(scope, new Scope[0]);
        f12159p = aVar2.mo11787a();
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C6162c cVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    /* renamed from: F1 */
    public static GoogleSignInOptions m14392F1(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, str3, str4, (Map) new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static Map m14402Q1(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo11805v()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* renamed from: J1 */
    public final String mo11775J1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f12167e, f12165v);
            Iterator it = this.f12167e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).mo11897v());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f12168f;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f12169g);
            jSONObject.put("forceCodeForRefreshToken", this.f12171i);
            jSONObject.put("serverAuthRequested", this.f12170h);
            if (!TextUtils.isEmpty(this.f12172j)) {
                jSONObject.put("serverClientId", this.f12172j);
            }
            if (!TextUtils.isEmpty(this.f12173k)) {
                jSONObject.put("hostedDomain", this.f12173k);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: R */
    public ArrayList mo11776R() {
        return new ArrayList(this.f12167e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo11783v()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f12174l     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f12174l     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f12167e     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo11776R()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f12167e     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo11776R()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f12168f     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo11783v()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo11783v()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f12172j     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo11778f0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f12172j     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo11778f0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f12171i     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11781q0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f12169g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11782s0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f12170h     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo11779f1()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f12175m     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo11786x()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    /* renamed from: f0 */
    public String mo11778f0() {
        return this.f12172j;
    }

    /* renamed from: f1 */
    public boolean mo11779f1() {
        return this.f12170h;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f12167e;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).mo11897v());
        }
        Collections.sort(arrayList);
        C6228a aVar = new C6228a();
        aVar.mo19835a(arrayList);
        aVar.mo19835a(this.f12168f);
        aVar.mo19835a(this.f12172j);
        aVar.mo19837c(this.f12171i);
        aVar.mo19837c(this.f12169g);
        aVar.mo19837c(this.f12170h);
        aVar.mo19835a(this.f12175m);
        return aVar.mo19836b();
    }

    /* renamed from: q0 */
    public boolean mo11781q0() {
        return this.f12171i;
    }

    /* renamed from: s0 */
    public boolean mo11782s0() {
        return this.f12169g;
    }

    /* renamed from: v */
    public Account mo11783v() {
        return this.f12168f;
    }

    /* renamed from: w */
    public ArrayList mo11784w() {
        return this.f12174l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12166d);
        C7461a.m28364C(parcel, 2, mo11776R(), false);
        C7461a.m28390v(parcel, 3, mo11783v(), i, false);
        C7461a.m28372d(parcel, 4, mo11782s0());
        C7461a.m28372d(parcel, 5, mo11779f1());
        C7461a.m28372d(parcel, 6, mo11781q0());
        C7461a.m28392x(parcel, 7, mo11778f0(), false);
        C7461a.m28392x(parcel, 8, this.f12173k, false);
        C7461a.m28364C(parcel, 9, mo11784w(), false);
        C7461a.m28392x(parcel, 10, mo11786x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo11786x() {
        return this.f12175m;
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C3820a {

        /* renamed from: a */
        private Set f12177a = new HashSet();

        /* renamed from: b */
        private boolean f12178b;

        /* renamed from: c */
        private boolean f12179c;

        /* renamed from: d */
        private boolean f12180d;

        /* renamed from: e */
        private String f12181e;

        /* renamed from: f */
        private Account f12182f;

        /* renamed from: g */
        private String f12183g;

        /* renamed from: h */
        private Map f12184h = new HashMap();

        /* renamed from: i */
        private String f12185i;

        public C3820a() {
        }

        /* renamed from: a */
        public GoogleSignInOptions mo11787a() {
            if (this.f12177a.contains(GoogleSignInOptions.f12164u)) {
                Set set = this.f12177a;
                Scope scope = GoogleSignInOptions.f12163t;
                if (set.contains(scope)) {
                    this.f12177a.remove(scope);
                }
            }
            if (this.f12180d && (this.f12182f == null || !this.f12177a.isEmpty())) {
                mo11788b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f12177a), this.f12182f, this.f12180d, this.f12178b, this.f12179c, this.f12181e, this.f12183g, this.f12184h, this.f12185i, (C6162c) null);
        }

        /* renamed from: b */
        public C3820a mo11788b() {
            this.f12177a.add(GoogleSignInOptions.f12162s);
            return this;
        }

        /* renamed from: c */
        public C3820a mo11789c() {
            this.f12177a.add(GoogleSignInOptions.f12160q);
            return this;
        }

        /* renamed from: d */
        public C3820a mo11790d(Scope scope, Scope... scopeArr) {
            this.f12177a.add(scope);
            this.f12177a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: e */
        public C3820a mo11791e(String str) {
            this.f12185i = str;
            return this;
        }

        public C3820a(GoogleSignInOptions googleSignInOptions) {
            C7264i.m27902k(googleSignInOptions);
            this.f12177a = new HashSet(googleSignInOptions.f12167e);
            this.f12178b = googleSignInOptions.f12170h;
            this.f12179c = googleSignInOptions.f12171i;
            this.f12180d = googleSignInOptions.f12169g;
            this.f12181e = googleSignInOptions.f12172j;
            this.f12182f = googleSignInOptions.f12168f;
            this.f12183g = googleSignInOptions.f12173k;
            this.f12184h = GoogleSignInOptions.m14402Q1(googleSignInOptions.f12174l);
            this.f12185i = googleSignInOptions.f12175m;
        }
    }

    GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m14402Q1(arrayList2), str3);
    }

    private GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.f12166d = i;
        this.f12167e = arrayList;
        this.f12168f = account;
        this.f12169g = z;
        this.f12170h = z2;
        this.f12171i = z3;
        this.f12172j = str;
        this.f12173k = str2;
        this.f12174l = new ArrayList(map.values());
        this.f12176n = map;
        this.f12175m = str3;
    }
}
