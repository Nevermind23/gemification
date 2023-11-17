package p245s4;

import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.GraphRequest;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p115i4.C6564m;
import p154l4.C6888f;
import p206p4.C7700c;
import p297w4.C8769a0;
import p334z4.C9207a;

/* renamed from: s4.f */
public final class C8229f implements View.OnClickListener {

    /* renamed from: h */
    private static final Set f23412h = new HashSet();

    /* renamed from: d */
    private View.OnClickListener f23413d;

    /* renamed from: e */
    private WeakReference f23414e;

    /* renamed from: f */
    private WeakReference f23415f;

    /* renamed from: g */
    private String f23416g;

    /* renamed from: s4.f$a */
    static class C8230a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f23417d;

        /* renamed from: e */
        final /* synthetic */ String f23418e;

        C8230a(String str, String str2) {
            this.f23417d = str;
            this.f23418e = str2;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C8229f.m31017a(this.f23417d, this.f23418e, new float[0]);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: s4.f$b */
    class C8231b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ JSONObject f23419d;

        /* renamed from: e */
        final /* synthetic */ String f23420e;

        /* renamed from: f */
        final /* synthetic */ String f23421f;

        C8231b(JSONObject jSONObject, String str, String str2) {
            this.f23419d = jSONObject;
            this.f23420e = str;
            this.f23421f = str2;
        }

        public void run() {
            String[] o;
            if (!C9207a.m34024c(this)) {
                try {
                    String lowerCase = C8769a0.m32688r(C2626d.m10134e()).toLowerCase();
                    float[] a = C8222a.m30980a(this.f23419d, lowerCase);
                    String c = C8222a.m30982c(this.f23420e, C8229f.m31018b(C8229f.this), lowerCase);
                    if (a != null && (o = C7700c.m29257o(C7700c.C7705e.MTML_APP_EVENT_PREDICTION, new float[][]{a}, new String[]{c})) != null) {
                        String str = o[0];
                        C8223b.m30994a(this.f23421f, str);
                        if (!str.equals("other")) {
                            C8229f.m31017a(str, this.f23420e, a);
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    private C8229f(View view, View view2, String str) {
        this.f23413d = C6888f.m26743g(view);
        this.f23415f = new WeakReference(view);
        this.f23414e = new WeakReference(view2);
        this.f23416g = str.toLowerCase().replace("activity", "");
    }

    /* renamed from: a */
    static /* synthetic */ void m31017a(String str, String str2, float[] fArr) {
        Class<C8229f> cls = C8229f.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m31022f(str, str2, fArr);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ String m31018b(C8229f fVar) {
        Class<C8229f> cls = C8229f.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return fVar.f23416g;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static void m31019c(View view, View view2, String str) {
        Class<C8229f> cls = C8229f.class;
        if (!C9207a.m34024c(cls)) {
            try {
                int hashCode = view.hashCode();
                Set set = f23412h;
                if (!set.contains(Integer.valueOf(hashCode))) {
                    C6888f.m26754r(view, new C8229f(view, view2, str));
                    set.add(Integer.valueOf(hashCode));
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    private void m31020d(String str, String str2, JSONObject jSONObject) {
        if (!C9207a.m34024c(this)) {
            try {
                C8769a0.m32679m0(new C8231b(jSONObject, str2, str));
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: e */
    private void m31021e() {
        if (!C9207a.m34024c(this)) {
            try {
                View view = (View) this.f23414e.get();
                View view2 = (View) this.f23415f.get();
                if (view != null && view2 != null) {
                    try {
                        String d = C8224c.m31001d(view2);
                        String b = C8223b.m30995b(view2, d);
                        if (b != null && !m31023g(b, d)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", C8224c.m30999b(view, view2));
                            jSONObject.put("screenname", this.f23416g);
                            m31020d(b, d, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: f */
    private static void m31022f(String str, String str2, float[] fArr) {
        Class<C8229f> cls = C8229f.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (C8225d.m31008f(str)) {
                    new C6564m(C2626d.m10134e()).mo20549h(str, str2);
                } else if (C8225d.m31007e(str)) {
                    m31024h(str, str2, fArr);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: g */
    private static boolean m31023g(String str, String str2) {
        Class<C8229f> cls = C8229f.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            String d = C8223b.m30997d(str);
            if (d == null) {
                return false;
            }
            if (d.equals("other")) {
                return true;
            }
            C8769a0.m32679m0(new C8230a(d, str2));
            return true;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: h */
    private static void m31024h(String str, String str2, float[] fArr) {
        Class<C8229f> cls = C8229f.class;
        if (!C9207a.m34024c(cls)) {
            try {
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("event_name", str);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    for (float append : fArr) {
                        sb.append(append);
                        sb.append(",");
                    }
                    jSONObject.put("dense", sb.toString());
                    jSONObject.put("button_text", str2);
                    bundle.putString("metadata", jSONObject.toString());
                    GraphRequest K = GraphRequest.m10013K((AccessToken) null, String.format(Locale.US, "%s/suggested_events", new Object[]{C2626d.m10135f()}), (JSONObject) null, (GraphRequest.C2612e) null);
                    K.mo8181Z(bundle);
                    K.mo8184g();
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    public void onClick(View view) {
        if (!C9207a.m34024c(this)) {
            try {
                View.OnClickListener onClickListener = this.f23413d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                m31021e();
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }
}
