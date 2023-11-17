package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.C11530k;
import com.salesforce.marketingcloud.storage.C11791f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.b */
public class C11398b implements C11418d, C11530k.C11535e {

    /* renamed from: i */
    public static final int f33130i = 0;

    /* renamed from: j */
    public static final int f33131j = 1;

    /* renamed from: k */
    public static final int f33132k = 2;

    /* renamed from: l */
    public static final int f33133l = 4;

    /* renamed from: m */
    public static final int f33134m = 8;

    /* renamed from: n */
    public static final int f33135n = 16;

    /* renamed from: o */
    public static final int f33136o = 32;

    /* renamed from: p */
    public static final int f33137p = 64;

    /* renamed from: q */
    public static final int f33138q = 128;

    /* renamed from: r */
    public static final int f33139r = 256;

    /* renamed from: s */
    public static final int f33140s = 512;

    /* renamed from: t */
    public static final int f33141t = 1024;

    /* renamed from: u */
    public static final int f33142u = 2048;

    /* renamed from: v */
    public static final int f33143v = 4096;

    /* renamed from: w */
    private static final int f33144w = 1;

    /* renamed from: d */
    private final C11791f f33145d;

    /* renamed from: e */
    private final C11530k f33146e;

    /* renamed from: f */
    private C11400b f33147f;

    /* renamed from: g */
    private C11401c f33148g;

    /* renamed from: h */
    private C11401c f33149h = C11401c.NONE;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.b$a */
    public @interface C11399a {
    }

    /* renamed from: com.salesforce.marketingcloud.b$b */
    interface C11400b {
        /* renamed from: a */
        void mo29635a(int i);
    }

    /* renamed from: com.salesforce.marketingcloud.b$c */
    public enum C11401c {
        RTBF(8191),
        ROP(8190),
        DNT(1888),
        NONE(0);
        

        /* renamed from: a */
        public final int f33155a;

        private C11401c(int i) {
            this.f33155a = i;
        }

        /* renamed from: a */
        public static C11401c m41715a(String str) {
            try {
                return valueOf(str);
            } catch (Exception unused) {
                return NONE;
            }
        }
    }

    C11398b(C11530k kVar, C11791f fVar) {
        this.f33146e = kVar;
        this.f33145d = fVar;
        String a = fVar.mo31609a((String) null);
        if (a != null) {
            this.f33149h = C11401c.m41715a(a);
        }
        if (this.f33149h != C11401c.RTBF) {
            kVar.mo30104a(C11530k.C11534d.blocked, (C11530k.C11535e) this);
        }
    }

    /* renamed from: b */
    public static boolean m41710b(int i, int i2) {
        return !m41709a(i, i2);
    }

    /* renamed from: c */
    public static boolean m41711c(int i, int i2) {
        if (m41710b(i, i2)) {
            return false;
        }
        switch (i2) {
            case 2:
            case f33139r /*256*/:
            case f33140s /*512*/:
            case f33142u /*2048*/:
                if (C11401c.ROP.f33155a == i) {
                    return false;
                }
                break;
            case 4:
            case 8:
            case 16:
            case 32:
            case 64:
            case 128:
            case f33143v /*4096*/:
                break;
            default:
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo29844a() {
        return this.f33149h.f33155a;
    }

    public String componentName() {
        return "ControlChannel";
    }

    public JSONObject componentState() {
        try {
            return new JSONObject().put("flag", this.f33149h.name());
        } catch (JSONException unused) {
            return null;
        }
    }

    public void onSyncReceived(C11530k.C11534d dVar, JSONObject jSONObject) {
        if (dVar == C11530k.C11534d.blocked && jSONObject.optInt("version", -1) == 1) {
            try {
                m41708a(jSONObject.getJSONObject("items").getInt("blocked"));
            } catch (JSONException e) {
                C11461g.m41885b(MarketingCloudSdk.f32856u, e, "Failed to parse [blocked] sync data.", new Object[0]);
            }
        }
    }

    public void tearDown(boolean z) {
        this.f33146e.mo30104a(C11530k.C11534d.blocked, (C11530k.C11535e) null);
        this.f33147f = null;
    }

    /* renamed from: a */
    private synchronized void m41708a(int i) {
        C11401c cVar = C11401c.RTBF;
        if (!m41709a(i, cVar.f33155a)) {
            cVar = C11401c.ROP;
            if (!m41709a(i, cVar.f33155a)) {
                cVar = C11401c.DNT;
                if (!m41709a(i, cVar.f33155a)) {
                    cVar = C11401c.NONE;
                }
            }
        }
        C11461g.m41891d(MarketingCloudSdk.f32856u, "Control Channel blocked value %d received", Integer.valueOf(i));
        this.f33145d.mo31611b(cVar.name());
        if (cVar != this.f33149h) {
            C11400b bVar = this.f33147f;
            if (bVar != null) {
                this.f33149h = cVar;
                bVar.mo29635a(cVar.f33155a);
            } else {
                this.f33148g = cVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo29845a(C11400b bVar) {
        C11401c cVar;
        this.f33147f = bVar;
        if (!(bVar == null || (cVar = this.f33148g) == null)) {
            this.f33149h = cVar;
            this.f33148g = null;
            bVar.mo29635a(cVar.f33155a);
        }
    }

    /* renamed from: a */
    public static boolean m41709a(int i, int i2) {
        return (i & i2) == i2;
    }
}
