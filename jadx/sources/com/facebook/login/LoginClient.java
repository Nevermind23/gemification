package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p258t4.C8367d;
import p297w4.C8769a0;
import p297w4.C8775b0;
import p297w4.C8795d;

class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C2665a();

    /* renamed from: d */
    LoginMethodHandler[] f8324d;

    /* renamed from: e */
    int f8325e;

    /* renamed from: f */
    Fragment f8326f;

    /* renamed from: g */
    C2667c f8327g;

    /* renamed from: h */
    C2666b f8328h;

    /* renamed from: i */
    boolean f8329i;

    /* renamed from: j */
    Request f8330j;

    /* renamed from: k */
    Map f8331k;

    /* renamed from: l */
    Map f8332l;

    /* renamed from: m */
    private C2678f f8333m;

    /* renamed from: n */
    private int f8334n;

    /* renamed from: o */
    private int f8335o;

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C2662a();

        /* renamed from: d */
        private final C2674d f8336d;

        /* renamed from: e */
        private Set f8337e;

        /* renamed from: f */
        private final C2672b f8338f;

        /* renamed from: g */
        private final String f8339g;

        /* renamed from: h */
        private final String f8340h;

        /* renamed from: i */
        private boolean f8341i;

        /* renamed from: j */
        private String f8342j;

        /* renamed from: k */
        private String f8343k;

        /* renamed from: l */
        private String f8344l;

        /* renamed from: com.facebook.login.LoginClient$Request$a */
        static class C2662a implements Parcelable.Creator {
            C2662a() {
            }

            /* renamed from: a */
            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel, (C2665a) null);
            }

            /* renamed from: b */
            public Request[] newArray(int i) {
                return new Request[i];
            }
        }

        /* synthetic */ Request(Parcel parcel, C2665a aVar) {
            this(parcel);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo8384a() {
            return this.f8339g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo8385b() {
            return this.f8340h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo8386d() {
            return this.f8343k;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C2672b mo8388e() {
            return this.f8338f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo8389f() {
            return this.f8344l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public String mo8390g() {
            return this.f8342j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C2674d mo8391h() {
            return this.f8336d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Set mo8392i() {
            return this.f8337e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo8393j() {
            for (String b : this.f8337e) {
                if (C2679g.m10413b(b)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo8394k() {
            return this.f8341i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo8395l(Set set) {
            C8775b0.m32716i(set, "permissions");
            this.f8337e = set;
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str;
            C2674d dVar = this.f8336d;
            String str2 = null;
            if (dVar != null) {
                str = dVar.name();
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeStringList(new ArrayList(this.f8337e));
            C2672b bVar = this.f8338f;
            if (bVar != null) {
                str2 = bVar.name();
            }
            parcel.writeString(str2);
            parcel.writeString(this.f8339g);
            parcel.writeString(this.f8340h);
            parcel.writeByte(this.f8341i ? (byte) 1 : 0);
            parcel.writeString(this.f8342j);
            parcel.writeString(this.f8343k);
            parcel.writeString(this.f8344l);
        }

        private Request(Parcel parcel) {
            boolean z = false;
            this.f8341i = false;
            String readString = parcel.readString();
            C2672b bVar = null;
            this.f8336d = readString != null ? C2674d.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f8337e = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f8338f = readString2 != null ? C2672b.valueOf(readString2) : bVar;
            this.f8339g = parcel.readString();
            this.f8340h = parcel.readString();
            this.f8341i = parcel.readByte() != 0 ? true : z;
            this.f8342j = parcel.readString();
            this.f8343k = parcel.readString();
            this.f8344l = parcel.readString();
        }
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C2663a();

        /* renamed from: d */
        final C2664b f8345d;

        /* renamed from: e */
        final AccessToken f8346e;

        /* renamed from: f */
        final String f8347f;

        /* renamed from: g */
        final String f8348g;

        /* renamed from: h */
        final Request f8349h;

        /* renamed from: i */
        public Map f8350i;

        /* renamed from: j */
        public Map f8351j;

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        static class C2663a implements Parcelable.Creator {
            C2663a() {
            }

            /* renamed from: a */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel, (C2665a) null);
            }

            /* renamed from: b */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$b */
        enum C2664b {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: d */
            private final String f8356d;

            private C2664b(String str) {
                this.f8356d = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo8407a() {
                return this.f8356d;
            }
        }

        /* synthetic */ Result(Parcel parcel, C2665a aVar) {
            this(parcel);
        }

        /* renamed from: a */
        static Result m10332a(Request request, String str) {
            return new Result(request, C2664b.CANCEL, (AccessToken) null, str, (String) null);
        }

        /* renamed from: b */
        static Result m10333b(Request request, String str, String str2) {
            return m10334d(request, str, str2, (String) null);
        }

        /* renamed from: d */
        static Result m10334d(Request request, String str, String str2, String str3) {
            return new Result(request, C2664b.ERROR, (AccessToken) null, TextUtils.join(": ", C8769a0.m32658c(str, str2)), str3);
        }

        /* renamed from: e */
        static Result m10335e(Request request, AccessToken accessToken) {
            return new Result(request, C2664b.SUCCESS, accessToken, (String) null, (String) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8345d.name());
            parcel.writeParcelable(this.f8346e, i);
            parcel.writeString(this.f8347f);
            parcel.writeString(this.f8348g);
            parcel.writeParcelable(this.f8349h, i);
            C8769a0.m32691s0(parcel, this.f8350i);
            C8769a0.m32691s0(parcel, this.f8351j);
        }

        Result(Request request, C2664b bVar, AccessToken accessToken, String str, String str2) {
            C8775b0.m32716i(bVar, "code");
            this.f8349h = request;
            this.f8346e = accessToken;
            this.f8347f = str;
            this.f8345d = bVar;
            this.f8348g = str2;
        }

        private Result(Parcel parcel) {
            this.f8345d = C2664b.valueOf(parcel.readString());
            this.f8346e = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f8347f = parcel.readString();
            this.f8348g = parcel.readString();
            this.f8349h = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f8350i = C8769a0.m32665f0(parcel);
            this.f8351j = C8769a0.m32665f0(parcel);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    static class C2665a implements Parcelable.Creator {
        C2665a() {
        }

        /* renamed from: a */
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        /* renamed from: b */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    interface C2666b {
        /* renamed from: a */
        void mo8412a();

        /* renamed from: b */
        void mo8413b();
    }

    /* renamed from: com.facebook.login.LoginClient$c */
    public interface C2667c {
        /* renamed from: a */
        void mo8414a(Result result);
    }

    public LoginClient(Fragment fragment) {
        this.f8325e = -1;
        this.f8334n = 0;
        this.f8335o = 0;
        this.f8326f = fragment;
    }

    /* renamed from: a */
    private void m10289a(String str, String str2, boolean z) {
        if (this.f8331k == null) {
            this.f8331k = new HashMap();
        }
        if (this.f8331k.containsKey(str) && z) {
            str2 = ((String) this.f8331k.get(str)) + "," + str2;
        }
        this.f8331k.put(str, str2);
    }

    /* renamed from: i */
    private void m10290i() {
        mo8372g(Result.m10333b(this.f8330j, "Login attempt failed.", (String) null));
    }

    /* renamed from: l */
    static String m10291l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: r */
    private C2678f m10292r() {
        C2678f fVar = this.f8333m;
        if (fVar == null || !fVar.mo8447a().equals(this.f8330j.mo8384a())) {
            this.f8333m = new C2678f(mo8374j(), this.f8330j.mo8384a());
        }
        return this.f8333m;
    }

    /* renamed from: s */
    public static int m10293s() {
        return C8795d.Login.mo24226a();
    }

    /* renamed from: u */
    private void m10294u(String str, Result result, Map map) {
        m10295v(str, result.f8345d.mo8407a(), result.f8347f, result.f8348g, map);
    }

    /* renamed from: v */
    private void m10295v(String str, String str2, String str3, String str4, Map map) {
        if (this.f8330j == null) {
            m10292r().mo8451e("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m10292r().mo8448b(this.f8330j.mo8385b(), str, str2, str3, str4, map);
        }
    }

    /* renamed from: y */
    private void m10296y(Result result) {
        C2667c cVar = this.f8327g;
        if (cVar != null) {
            cVar.mo8414a(result);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo8360A(C2666b bVar) {
        this.f8328h = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo8361B(Fragment fragment) {
        if (this.f8326f == null) {
            this.f8326f = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo8362C(C2667c cVar) {
        this.f8327g = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo8363D(Request request) {
        if (!mo8378q()) {
            mo8367b(request);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo8364E() {
        LoginMethodHandler k = mo8375k();
        if (!k.mo8418j() || mo8370e()) {
            int q = k.mo8298q(this.f8330j);
            this.f8334n = 0;
            if (q > 0) {
                m10292r().mo8450d(this.f8330j.mo8385b(), k.mo8294g());
                this.f8335o = q;
            } else {
                m10292r().mo8449c(this.f8330j.mo8385b(), k.mo8294g());
                m10289a("not_tried", k.mo8294g(), true);
            }
            if (q > 0) {
                return true;
            }
            return false;
        }
        m10289a("no_internet_permission", "1", false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo8365F() {
        int i;
        if (this.f8325e >= 0) {
            m10295v(mo8375k().mo8294g(), "skipped", (String) null, (String) null, mo8375k().f8357d);
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.f8324d;
            if (loginMethodHandlerArr != null && (i = this.f8325e) < loginMethodHandlerArr.length - 1) {
                this.f8325e = i + 1;
            } else if (this.f8330j != null) {
                m10290i();
                return;
            } else {
                return;
            }
        } while (!mo8364E());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo8366G(Result result) {
        Result result2;
        if (result.f8346e != null) {
            AccessToken h = AccessToken.m9965h();
            AccessToken accessToken = result.f8346e;
            if (!(h == null || accessToken == null)) {
                try {
                    if (h.mo8136u().equals(accessToken.mo8136u())) {
                        result2 = Result.m10335e(this.f8330j, result.f8346e);
                        mo8372g(result2);
                        return;
                    }
                } catch (Exception e) {
                    mo8372g(Result.m10333b(this.f8330j, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result2 = Result.m10333b(this.f8330j, "User logged in as different Facebook user.", (String) null);
            mo8372g(result2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8367b(Request request) {
        if (request != null) {
            if (this.f8330j != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.m9967v() || mo8370e()) {
                this.f8330j = request;
                this.f8324d = mo8377p(request);
                mo8365F();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8368d() {
        if (this.f8325e >= 0) {
            mo8375k().mo8345b();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8370e() {
        if (this.f8329i) {
            return true;
        }
        if (mo8371f("android.permission.INTERNET") != 0) {
            C1505h j = mo8374j();
            mo8372g(Result.m10333b(this.f8330j, j.getString(C8367d.com_facebook_internet_permission_error_title), j.getString(C8367d.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f8329i = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8371f(String str) {
        return mo8374j().checkCallingOrSelfPermission(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8372g(Result result) {
        LoginMethodHandler k = mo8375k();
        if (k != null) {
            m10294u(k.mo8294g(), result, k.f8357d);
        }
        Map map = this.f8331k;
        if (map != null) {
            result.f8350i = map;
        }
        Map map2 = this.f8332l;
        if (map2 != null) {
            result.f8351j = map2;
        }
        this.f8324d = null;
        this.f8325e = -1;
        this.f8330j = null;
        this.f8331k = null;
        this.f8334n = 0;
        this.f8335o = 0;
        m10296y(result);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8373h(Result result) {
        if (result.f8346e == null || !AccessToken.m9967v()) {
            mo8372g(result);
        } else {
            mo8366G(result);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1505h mo8374j() {
        return this.f8326f.getActivity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public LoginMethodHandler mo8375k() {
        int i = this.f8325e;
        if (i >= 0) {
            return this.f8324d[i];
        }
        return null;
    }

    /* renamed from: m */
    public Fragment mo8376m() {
        return this.f8326f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public LoginMethodHandler[] mo8377p(Request request) {
        ArrayList arrayList = new ArrayList();
        C2674d h = request.mo8391h();
        if (h.mo8441e()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (h.mo8442f()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (h.mo8440c()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (h.mo8438a()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (h.mo8443g()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (h.mo8439b()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo8378q() {
        return this.f8330j != null && this.f8325e >= 0;
    }

    /* renamed from: t */
    public Request mo8379t() {
        return this.f8330j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo8380w() {
        C2666b bVar = this.f8328h;
        if (bVar != null) {
            bVar.mo8412a();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f8324d, i);
        parcel.writeInt(this.f8325e);
        parcel.writeParcelable(this.f8330j, i);
        C8769a0.m32691s0(parcel, this.f8331k);
        C8769a0.m32691s0(parcel, this.f8332l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo8382x() {
        C2666b bVar = this.f8328h;
        if (bVar != null) {
            bVar.mo8413b();
        }
    }

    /* renamed from: z */
    public boolean mo8383z(int i, int i2, Intent intent) {
        this.f8334n++;
        if (this.f8330j != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f8107k, false)) {
                mo8365F();
                return false;
            } else if (!mo8375k().mo8297p() || intent != null || this.f8334n >= this.f8335o) {
                return mo8375k().mo8295k(i, i2, intent);
            }
        }
        return false;
    }

    public LoginClient(Parcel parcel) {
        this.f8325e = -1;
        this.f8334n = 0;
        this.f8335o = 0;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f8324d = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f8324d;
            LoginMethodHandler loginMethodHandler = (LoginMethodHandler) readParcelableArray[i];
            loginMethodHandlerArr[i] = loginMethodHandler;
            loginMethodHandler.mo8419m(this);
        }
        this.f8325e = parcel.readInt();
        this.f8330j = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f8331k = C8769a0.m32665f0(parcel);
        this.f8332l = C8769a0.m32665f0(parcel);
    }
}
