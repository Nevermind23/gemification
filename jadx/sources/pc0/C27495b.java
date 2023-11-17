package pc0;

import ba1.C10146d0;
import com.google.gson.Gson;
import hd0.C24978b;
import he1.C41224m;
import he1.C41233s;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import k41.C36869a;
import kotlin.jvm.internal.C41536l;
import org.json.JSONException;
import org.json.JSONObject;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.sso_client.models.DeviceIdentifier;

/* renamed from: pc0.b */
public final class C27495b implements C27494a {

    /* renamed from: a */
    private final C36546y f70383a;

    /* renamed from: b */
    private final C36869a f70384b;

    /* renamed from: c */
    private final Gson f70385c;

    /* renamed from: d */
    private final PreferencesApiManager f70386d;

    public C27495b(C36546y yVar, C36869a aVar, Gson gson, PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(yVar, "app");
        C41536l.m120489i(aVar, "deviceInfo");
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f70383a = yVar;
        this.f70384b = aVar;
        this.f70385c = gson;
        this.f70386d = preferencesApiManager;
    }

    /* renamed from: b */
    private final HashMap m85278b() {
        String extCustomerId;
        C41224m[] mVarArr = new C41224m[10];
        mVarArr[0] = C41233s.m119492a("channel", "MOBILE");
        mVarArr[1] = C41233s.m119492a("userId", "MOBILE");
        String str = "";
        mVarArr[2] = C41233s.m119492a("userAddress", str);
        mVarArr[3] = C41233s.m119492a("os", this.f70384b.mo89795c());
        mVarArr[4] = C41233s.m119492a("osVersion", this.f70384b.mo89796d());
        mVarArr[5] = C41233s.m119492a("appVersion", this.f70384b.mo89793a());
        mVarArr[6] = C41233s.m119492a("device", this.f70384b.mo89794b());
        mVarArr[7] = C41233s.m119492a("langCode", this.f70386d.getLanguage().mo90433b());
        DeviceIdentifier g = C10146d0.C10148b.m37109g();
        if (!(g == null || (extCustomerId = g.getExtCustomerId()) == null)) {
            str = extCustomerId;
        }
        mVarArr[8] = C41233s.m119492a("extCustomerId", str);
        mVarArr[9] = C41233s.m119492a("darkMode", C24978b.m79846b(Boolean.valueOf(this.f70383a.mo89317P().isDarkMode())).mo63391e());
        return C41344r0.m119930l(mVarArr);
    }

    /* renamed from: c */
    private final HashMap m85279c(OtpParams otpParams) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(this.f70385c.mo18181w(otpParams));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C41536l.m120487g(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                Object obj = jSONObject.get(str);
                if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                    obj = obj.toString();
                }
                C41536l.m120488h(obj, "mappedValue");
                hashMap.put(str, obj);
            }
        } catch (JSONException unused) {
        }
        hashMap.putAll(m85278b());
        return hashMap;
    }

    /* renamed from: a */
    public HashMap mo66809a(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return m85279c(otpParams);
    }
}
