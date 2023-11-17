package p297w4;

import android.net.Uri;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w4.m */
public final class C8817m {

    /* renamed from: a */
    private boolean f24744a;

    /* renamed from: b */
    private String f24745b;

    /* renamed from: c */
    private boolean f24746c;

    /* renamed from: d */
    private int f24747d;

    /* renamed from: e */
    private EnumSet f24748e;

    /* renamed from: f */
    private Map f24749f;

    /* renamed from: g */
    private boolean f24750g;

    /* renamed from: h */
    private C8801h f24751h;

    /* renamed from: i */
    private String f24752i;

    /* renamed from: j */
    private String f24753j;

    /* renamed from: k */
    private boolean f24754k;

    /* renamed from: l */
    private boolean f24755l;

    /* renamed from: m */
    private String f24756m;

    /* renamed from: n */
    private JSONArray f24757n;

    /* renamed from: o */
    private boolean f24758o;

    /* renamed from: p */
    private boolean f24759p;

    /* renamed from: q */
    private String f24760q;

    /* renamed from: r */
    private String f24761r;

    /* renamed from: s */
    private String f24762s;

    /* renamed from: w4.m$a */
    public static class C8818a {

        /* renamed from: a */
        private String f24763a;

        /* renamed from: b */
        private String f24764b;

        /* renamed from: c */
        private Uri f24765c;

        /* renamed from: d */
        private int[] f24766d;

        private C8818a(String str, String str2, Uri uri, int[] iArr) {
            this.f24763a = str;
            this.f24764b = str2;
            this.f24765c = uri;
            this.f24766d = iArr;
        }

        /* renamed from: c */
        public static C8818a m32830c(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (C8769a0.m32644Q(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (C8769a0.m32644Q(str) || C8769a0.m32644Q(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString(C11769i.C11770a.f34149l);
            if (!C8769a0.m32644Q(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new C8818a(str, str2, uri, m32831d(jSONObject.optJSONArray("versions")));
        }

        /* renamed from: d */
        private static int[] m32831d(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C8769a0.m32644Q(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            C8769a0.m32648U("FacebookSDK", e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        /* renamed from: a */
        public String mo24251a() {
            return this.f24763a;
        }

        /* renamed from: b */
        public String mo24252b() {
            return this.f24764b;
        }
    }

    public C8817m(boolean z, String str, boolean z2, int i, EnumSet enumSet, Map map, boolean z3, C8801h hVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        this.f24744a = z;
        this.f24745b = str;
        this.f24746c = z2;
        this.f24749f = map;
        this.f24751h = hVar;
        this.f24747d = i;
        this.f24750g = z3;
        this.f24748e = enumSet;
        this.f24752i = str2;
        this.f24753j = str3;
        this.f24754k = z4;
        this.f24755l = z5;
        this.f24757n = jSONArray;
        this.f24756m = str4;
        this.f24758o = z6;
        this.f24759p = z7;
        this.f24760q = str5;
        this.f24761r = str6;
        this.f24762s = str7;
    }

    /* renamed from: a */
    public boolean mo24238a() {
        return this.f24750g;
    }

    /* renamed from: b */
    public boolean mo24239b() {
        return this.f24755l;
    }

    /* renamed from: c */
    public C8801h mo24240c() {
        return this.f24751h;
    }

    /* renamed from: d */
    public JSONArray mo24241d() {
        return this.f24757n;
    }

    /* renamed from: e */
    public boolean mo24242e() {
        return this.f24754k;
    }

    /* renamed from: f */
    public boolean mo24243f() {
        return this.f24759p;
    }

    /* renamed from: g */
    public String mo24244g() {
        return this.f24760q;
    }

    /* renamed from: h */
    public String mo24245h() {
        return this.f24762s;
    }

    /* renamed from: i */
    public String mo24246i() {
        return this.f24756m;
    }

    /* renamed from: j */
    public int mo24247j() {
        return this.f24747d;
    }

    /* renamed from: k */
    public EnumSet mo24248k() {
        return this.f24748e;
    }

    /* renamed from: l */
    public String mo24249l() {
        return this.f24761r;
    }

    /* renamed from: m */
    public boolean mo24250m() {
        return this.f24744a;
    }
}
