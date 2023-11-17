package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.C2640g;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p297w4.C8775b0;
import p297w4.C8828p;
import p297w4.C8831r;
import p297w4.C8845v;
import p334z4.C9207a;

public class GraphRequest {

    /* renamed from: n */
    public static final String f8142n = "GraphRequest";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f8143o;

    /* renamed from: p */
    private static String f8144p;

    /* renamed from: q */
    private static Pattern f8145q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: r */
    private static volatile String f8146r;

    /* renamed from: a */
    private AccessToken f8147a;

    /* renamed from: b */
    private C2643i f8148b;

    /* renamed from: c */
    private String f8149c;

    /* renamed from: d */
    private JSONObject f8150d;

    /* renamed from: e */
    private String f8151e;

    /* renamed from: f */
    private String f8152f;

    /* renamed from: g */
    private boolean f8153g;

    /* renamed from: h */
    private Bundle f8154h;

    /* renamed from: i */
    private C2612e f8155i;

    /* renamed from: j */
    private String f8156j;

    /* renamed from: k */
    private Object f8157k;

    /* renamed from: l */
    private String f8158l;

    /* renamed from: m */
    private boolean f8159m;

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new C2607a();

        /* renamed from: d */
        private final String f8160d;

        /* renamed from: e */
        private final Parcelable f8161e;

        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        static class C2607a implements Parcelable.Creator {
            C2607a() {
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel, (C2638e) null);
            }

            /* renamed from: b */
            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, C2638e eVar) {
            this(parcel);
        }

        /* renamed from: a */
        public String mo8194a() {
            return this.f8160d;
        }

        /* renamed from: b */
        public Parcelable mo8195b() {
            return this.f8161e;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8160d);
            parcel.writeParcelable(this.f8161e, i);
        }

        public ParcelableResourceWithMimeType(Parcelable parcelable, String str) {
            this.f8160d = str;
            this.f8161e = parcelable;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f8160d = parcel.readString();
            this.f8161e = parcel.readParcelable(C2626d.m10134e().getClassLoader());
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    class C2608a implements C2612e {

        /* renamed from: a */
        final /* synthetic */ C2612e f8162a;

        C2608a(C2612e eVar) {
            this.f8162a = eVar;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            JSONObject jSONObject;
            JSONArray jSONArray;
            String str;
            String str2;
            String str3;
            JSONObject h = hVar.mo8280h();
            if (h != null) {
                jSONObject = h.optJSONObject("__debug__");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray(C11769i.f34134e);
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("message");
                    } else {
                        str = null;
                    }
                    if (optJSONObject != null) {
                        str2 = optJSONObject.optString("type");
                    } else {
                        str2 = null;
                    }
                    if (optJSONObject != null) {
                        str3 = optJSONObject.optString("link");
                    } else {
                        str3 = null;
                    }
                    if (!(str == null || str2 == null)) {
                        C2645k kVar = C2645k.GRAPH_API_DEBUG_INFO;
                        if (str2.equals("warning")) {
                            kVar = C2645k.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!C8769a0.m32644Q(str3)) {
                            str = str + " Link: " + str3;
                        }
                        C8831r.m32866g(kVar, GraphRequest.f8142n, str);
                    }
                }
            }
            C2612e eVar = this.f8162a;
            if (eVar != null) {
                eVar.mo107a(hVar);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    static class C2609b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f8164d;

        /* renamed from: e */
        final /* synthetic */ C2640g f8165e;

        C2609b(ArrayList arrayList, C2640g gVar) {
            this.f8164d = arrayList;
            this.f8165e = gVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    Iterator it = this.f8164d.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((C2612e) pair.first).mo107a((C2642h) pair.second);
                    }
                    for (C2640g.C2641a a : this.f8165e.mo8275v()) {
                        a.mo8238a(this.f8165e);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$c */
    class C2610c implements C2613f {

        /* renamed from: a */
        final /* synthetic */ ArrayList f8166a;

        C2610c(ArrayList arrayList) {
            this.f8166a = arrayList;
        }

        /* renamed from: a */
        public void mo8203a(String str, String str2) {
            this.f8166a.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
        }
    }

    /* renamed from: com.facebook.GraphRequest$d */
    private static class C2611d {

        /* renamed from: a */
        private final GraphRequest f8168a;

        /* renamed from: b */
        private final Object f8169b;

        public C2611d(GraphRequest graphRequest, Object obj) {
            this.f8168a = graphRequest;
            this.f8169b = obj;
        }

        /* renamed from: a */
        public GraphRequest mo8204a() {
            return this.f8168a;
        }

        /* renamed from: b */
        public Object mo8205b() {
            return this.f8169b;
        }
    }

    /* renamed from: com.facebook.GraphRequest$e */
    public interface C2612e {
        /* renamed from: a */
        void mo107a(C2642h hVar);
    }

    /* renamed from: com.facebook.GraphRequest$f */
    private interface C2613f {
        /* renamed from: a */
        void mo8203a(String str, String str2);
    }

    /* renamed from: com.facebook.GraphRequest$g */
    private static class C2614g implements C2613f {

        /* renamed from: a */
        private final OutputStream f8170a;

        /* renamed from: b */
        private final C8831r f8171b;

        /* renamed from: c */
        private boolean f8172c = true;

        /* renamed from: d */
        private boolean f8173d;

        public C2614g(OutputStream outputStream, C8831r rVar, boolean z) {
            this.f8170a = outputStream;
            this.f8171b = rVar;
            this.f8173d = z;
        }

        /* renamed from: b */
        private RuntimeException m10073b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo8203a(String str, String str2) {
            mo8209f(str, (String) null, (String) null);
            mo8212i("%s", str2);
            mo8214k();
            C8831r rVar = this.f8171b;
            if (rVar != null) {
                rVar.mo24260c("    " + str, str2);
            }
        }

        /* renamed from: c */
        public void mo8206c(String str, Object... objArr) {
            if (!this.f8173d) {
                if (this.f8172c) {
                    this.f8170a.write("--".getBytes());
                    this.f8170a.write(GraphRequest.f8143o.getBytes());
                    this.f8170a.write("\r\n".getBytes());
                    this.f8172c = false;
                }
                this.f8170a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.f8170a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
        }

        /* renamed from: d */
        public void mo8207d(String str, Bitmap bitmap) {
            mo8209f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f8170a);
            mo8212i("", new Object[0]);
            mo8214k();
            C8831r rVar = this.f8171b;
            if (rVar != null) {
                rVar.mo24260c("    " + str, "<Image>");
            }
        }

        /* renamed from: e */
        public void mo8208e(String str, byte[] bArr) {
            mo8209f(str, str, "content/unknown");
            this.f8170a.write(bArr);
            mo8212i("", new Object[0]);
            mo8214k();
            C8831r rVar = this.f8171b;
            if (rVar != null) {
                rVar.mo24260c("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: f */
        public void mo8209f(String str, String str2, String str3) {
            if (!this.f8173d) {
                mo8206c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo8206c("; filename=\"%s\"", str2);
                }
                mo8212i("", new Object[0]);
                if (str3 != null) {
                    mo8212i("%s: %s", "Content-Type", str3);
                }
                mo8212i("", new Object[0]);
                return;
            }
            this.f8170a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        /* renamed from: g */
        public void mo8210g(String str, Uri uri, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo8209f(str, str, str2);
            if (this.f8170a instanceof C2682n) {
                ((C2682n) this.f8170a).mo8456c(C8769a0.m32693u(uri));
                i = 0;
            } else {
                i = C8769a0.m32678m(C2626d.m10134e().getContentResolver().openInputStream(uri), this.f8170a) + 0;
            }
            mo8212i("", new Object[0]);
            mo8214k();
            C8831r rVar = this.f8171b;
            if (rVar != null) {
                rVar.mo24260c("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: h */
        public void mo8211h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo8209f(str, str, str2);
            OutputStream outputStream = this.f8170a;
            if (outputStream instanceof C2682n) {
                ((C2682n) outputStream).mo8456c(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C8769a0.m32678m(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f8170a) + 0;
            }
            mo8212i("", new Object[0]);
            mo8214k();
            C8831r rVar = this.f8171b;
            if (rVar != null) {
                rVar.mo24260c("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: i */
        public void mo8212i(String str, Object... objArr) {
            mo8206c(str, objArr);
            if (!this.f8173d) {
                mo8206c("\r\n", new Object[0]);
            }
        }

        /* renamed from: j */
        public void mo8213j(String str, Object obj, GraphRequest graphRequest) {
            OutputStream outputStream = this.f8170a;
            if (outputStream instanceof C2684p) {
                ((C2684p) outputStream).mo8455a(graphRequest);
            }
            if (GraphRequest.m10011I(obj)) {
                mo8203a(str, GraphRequest.m10014L(obj));
            } else if (obj instanceof Bitmap) {
                mo8207d(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                mo8208e(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                mo8210g(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo8211h(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable b = parcelableResourceWithMimeType.mo8195b();
                String a = parcelableResourceWithMimeType.mo8194a();
                if (b instanceof ParcelFileDescriptor) {
                    mo8211h(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    mo8210g(str, (Uri) b, a);
                } else {
                    throw m10073b();
                }
            } else {
                throw m10073b();
            }
        }

        /* renamed from: k */
        public void mo8214k() {
            if (!this.f8173d) {
                mo8212i("--%s", GraphRequest.f8143o);
                return;
            }
            this.f8170a.write("&".getBytes());
        }

        /* renamed from: l */
        public void mo8215l(String str, JSONArray jSONArray, Collection collection) {
            OutputStream outputStream = this.f8170a;
            if (!(outputStream instanceof C2684p)) {
                mo8203a(str, jSONArray.toString());
                return;
            }
            C2684p pVar = (C2684p) outputStream;
            mo8209f(str, (String) null, (String) null);
            mo8206c("[", new Object[0]);
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                pVar.mo8455a((GraphRequest) it.next());
                if (i > 0) {
                    mo8206c(",%s", jSONObject.toString());
                } else {
                    mo8206c("%s", jSONObject.toString());
                }
                i++;
            }
            mo8206c("]", new Object[0]);
            C8831r rVar = this.f8171b;
            if (rVar != null) {
                rVar.mo24260c("    " + str, jSONArray.toString());
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f8143o = sb.toString();
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C2643i iVar, C2612e eVar) {
        this(accessToken, str, bundle, iVar, eVar, (String) null);
    }

    /* renamed from: C */
    private static String m10006C() {
        if (f8146r == null) {
            f8146r = String.format("%s.%s", new Object[]{"FBAndroidSDK", "9.0.0"});
            String a = C8828p.m32859a();
            if (!C8769a0.m32644Q(a)) {
                f8146r = String.format(Locale.ROOT, "%s/%s", new Object[]{f8146r, a});
            }
        }
        return f8146r;
    }

    /* renamed from: E */
    private static boolean m10007E(C2640g gVar) {
        for (C2640g.C2641a aVar : gVar.mo8275v()) {
        }
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            ((GraphRequest) it.next()).mo8187s();
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m10008F(C2640g gVar) {
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator<String> it2 = graphRequest.f8154h.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m10010H(graphRequest.f8154h.get(it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m10009G(String str) {
        Matcher matcher = f8145q.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        if (str.startsWith("me/") || str.startsWith("/me/")) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private static boolean m10010H(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static boolean m10011I(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* renamed from: J */
    public static GraphRequest m10012J(AccessToken accessToken, String str, C2612e eVar) {
        return new GraphRequest(accessToken, str, (Bundle) null, (C2643i) null, eVar);
    }

    /* renamed from: K */
    public static GraphRequest m10013K(AccessToken accessToken, String str, JSONObject jSONObject, C2612e eVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, (Bundle) null, C2643i.POST, eVar);
        graphRequest.mo8179X(jSONObject);
        return graphRequest;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static String m10014L(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10015M(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.C2613f r8) {
        /*
            boolean r0 = m10009G(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L_0x001e
            r3 = -1
            if (r7 == r3) goto L_0x001c
            if (r0 >= r7) goto L_0x001e
        L_0x001c:
            r7 = r1
            goto L_0x001f
        L_0x001e:
            r7 = r2
        L_0x001f:
            java.util.Iterator r0 = r6.keys()
        L_0x0023:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003f
            r5 = r1
            goto L_0x0040
        L_0x003f:
            r5 = r2
        L_0x0040:
            m10016N(r3, r4, r8, r5)
            goto L_0x0023
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m10015M(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$f):void");
    }

    /* renamed from: N */
    private static void m10016N(String str, Object obj, C2613f fVar, boolean z) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m10016N(String.format("%s[%s]", new Object[]{str, next}), jSONObject.opt(next), fVar, z);
                }
            } else if (jSONObject.has("id")) {
                m10016N(str, jSONObject.optString("id"), fVar, z);
            } else if (jSONObject.has(C11769i.C11770a.f34149l)) {
                m10016N(str, jSONObject.optString(C11769i.C11770a.f34149l), fVar, z);
            } else if (jSONObject.has("fbsdk:create_object")) {
                m10016N(str, jSONObject.toString(), fVar, z);
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m10016N(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), fVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            fVar.mo8203a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            fVar.mo8203a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    /* renamed from: O */
    private static void m10017O(C2640g gVar, C8831r rVar, int i, URL url, OutputStream outputStream, boolean z) {
        C2614g gVar2 = new C2614g(outputStream, rVar, z);
        if (i == 1) {
            GraphRequest n = gVar.get(0);
            HashMap hashMap = new HashMap();
            for (String next : n.f8154h.keySet()) {
                Object obj = n.f8154h.get(next);
                if (m10010H(obj)) {
                    hashMap.put(next, new C2611d(n, obj));
                }
            }
            if (rVar != null) {
                rVar.mo24258a("  Parameters:\n");
            }
            m10020R(n.f8154h, gVar2, n);
            if (rVar != null) {
                rVar.mo24258a("  Attachments:\n");
            }
            m10019Q(hashMap, gVar2);
            JSONObject jSONObject = n.f8150d;
            if (jSONObject != null) {
                m10015M(jSONObject, url.getPath(), gVar2);
                return;
            }
            return;
        }
        String r = m10042r(gVar);
        if (!C8769a0.m32644Q(r)) {
            gVar2.mo8203a("batch_app_id", r);
            HashMap hashMap2 = new HashMap();
            m10021S(gVar2, gVar, hashMap2);
            if (rVar != null) {
                rVar.mo24258a("  Attachments:\n");
            }
            m10019Q(hashMap2, gVar2);
            return;
        }
        throw new FacebookException("App ID was not specified at the request or Settings.");
    }

    /* renamed from: P */
    static void m10018P(C2640g gVar, List list) {
        int size = gVar.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest n = gVar.get(i);
            if (n.f8155i != null) {
                arrayList.add(new Pair(n.f8155i, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C2609b bVar = new C2609b(arrayList, gVar);
            Handler r = gVar.mo8271r();
            if (r == null) {
                bVar.run();
            } else {
                r.post(bVar);
            }
        }
    }

    /* renamed from: Q */
    private static void m10019Q(Map map, C2614g gVar) {
        for (String str : map.keySet()) {
            C2611d dVar = (C2611d) map.get(str);
            if (m10010H(dVar.mo8205b())) {
                gVar.mo8213j(str, dVar.mo8205b(), dVar.mo8204a());
            }
        }
    }

    /* renamed from: R */
    private static void m10020R(Bundle bundle, C2614g gVar, GraphRequest graphRequest) {
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (m10011I(obj)) {
                gVar.mo8213j(next, obj, graphRequest);
            }
        }
    }

    /* renamed from: S */
    private static void m10021S(C2614g gVar, Collection collection, Map map) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((GraphRequest) it.next()).m10022T(jSONArray, map);
        }
        gVar.mo8215l("batch", jSONArray, collection);
    }

    /* renamed from: T */
    private void m10022T(JSONArray jSONArray, Map map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f8151e;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f8153g);
        }
        String str2 = this.f8152f;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String z = mo8193z();
        jSONObject.put("relative_url", z);
        jSONObject.put("method", this.f8148b);
        AccessToken accessToken = this.f8147a;
        if (accessToken != null) {
            C8831r.m32868j(accessToken.mo8134t());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f8154h.keySet()) {
            Object obj = this.f8154h.get(str3);
            if (m10010H(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new C2611d(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f8150d != null) {
            ArrayList arrayList2 = new ArrayList();
            m10015M(this.f8150d, z, new C2610c(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.facebook.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.facebook.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.facebook.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m10023U(com.facebook.C2640g r13, java.net.HttpURLConnection r14) {
        /*
            w4.r r6 = new w4.r
            com.facebook.k r0 = com.facebook.C2645k.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = m10008F(r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L_0x001c
            com.facebook.GraphRequest r3 = r13.get(r0)
            com.facebook.i r3 = r3.f8148b
            goto L_0x001e
        L_0x001c:
            com.facebook.i r3 = com.facebook.C2643i.POST
        L_0x001e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            m10024W(r14, r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.mo24258a(r7)
            java.lang.String r7 = "Id"
            java.lang.String r8 = r13.mo8276w()
            r6.mo24260c(r7, r8)
            java.lang.String r7 = "URL"
            r6.mo24260c(r7, r4)
            java.lang.String r7 = "Method"
            java.lang.String r8 = r14.getRequestMethod()
            r6.mo24260c(r7, r8)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo24260c(r7, r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo24260c(r7, r8)
            int r7 = r13.mo8278z()
            r14.setConnectTimeout(r7)
            int r7 = r13.mo8278z()
            r14.setReadTimeout(r7)
            com.facebook.i r7 = com.facebook.C2643i.POST
            if (r3 != r7) goto L_0x006d
            r0 = r1
        L_0x006d:
            if (r0 != 0) goto L_0x0073
            r6.mo24261d()
            return
        L_0x0073:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c9 }
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x00c9 }
            r1.<init>(r14)     // Catch:{ all -> 0x00c9 }
            if (r5 == 0) goto L_0x008c
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0089 }
            r14.<init>(r1)     // Catch:{ all -> 0x0089 }
            r0 = r14
            goto L_0x008d
        L_0x0089:
            r13 = move-exception
            r0 = r1
            goto L_0x00ca
        L_0x008c:
            r0 = r1
        L_0x008d:
            boolean r14 = m10007E(r13)     // Catch:{ all -> 0x00c9 }
            if (r14 == 0) goto L_0x00b7
            com.facebook.n r14 = new com.facebook.n     // Catch:{ all -> 0x00c9 }
            android.os.Handler r1 = r13.mo8271r()     // Catch:{ all -> 0x00c9 }
            r14.<init>(r1)     // Catch:{ all -> 0x00c9 }
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r14
            r12 = r5
            m10017O(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c9 }
            int r1 = r14.mo8457k()     // Catch:{ all -> 0x00c9 }
            java.util.Map r10 = r14.mo8458n()     // Catch:{ all -> 0x00c9 }
            com.facebook.o r14 = new com.facebook.o     // Catch:{ all -> 0x00c9 }
            long r11 = (long) r1     // Catch:{ all -> 0x00c9 }
            r7 = r14
            r8 = r0
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x00c9 }
            goto L_0x00b8
        L_0x00b7:
            r14 = r0
        L_0x00b8:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            m10017O(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00c6 }
            r14.close()
            r6.mo24261d()
            return
        L_0x00c6:
            r13 = move-exception
            r0 = r14
            goto L_0x00ca
        L_0x00c9:
            r13 = move-exception
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            r0.close()
        L_0x00cf:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m10023U(com.facebook.g, java.net.HttpURLConnection):void");
    }

    /* renamed from: W */
    private static void m10024W(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection.setRequestProperty("Content-Type", m10044x());
    }

    /* renamed from: c0 */
    static final boolean m10028c0(GraphRequest graphRequest) {
        String D = graphRequest.mo8177D();
        if (C8769a0.m32644Q(D)) {
            return true;
        }
        if (D.startsWith("v")) {
            D = D.substring(1);
        }
        String[] split = D.split("\\.");
        if (split.length >= 2 && Integer.parseInt(split[0]) > 2) {
            return true;
        }
        if (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m10029d() {
        if (this.f8147a != null) {
            if (!this.f8154h.containsKey("access_token")) {
                String t = this.f8147a.mo8134t();
                C8831r.m32868j(t);
                this.f8154h.putString("access_token", t);
            }
        } else if (!this.f8159m && !this.f8154h.containsKey("access_token")) {
            String f = C2626d.m10135f();
            String k = C2626d.m10140k();
            if (C8769a0.m32644Q(f) || C8769a0.m32644Q(k)) {
                C8769a0.m32649V(f8142n, "Warning: Request without access token missing application ID or client token.");
            } else {
                this.f8154h.putString("access_token", f + "|" + k);
            }
        }
        this.f8154h.putString("sdk", "android");
        this.f8154h.putString("format", "json");
        if (C2626d.m10154y(C2645k.GRAPH_API_DEBUG_INFO)) {
            this.f8154h.putString("debug", "info");
        } else if (C2626d.m10154y(C2645k.GRAPH_API_DEBUG_WARNING)) {
            this.f8154h.putString("debug", "warning");
        }
    }

    /* renamed from: d0 */
    public static HttpURLConnection m10030d0(C2640g gVar) {
        URL url;
        m10032e0(gVar);
        try {
            if (gVar.size() == 1) {
                url = new URL(gVar.get(0).mo8176B());
            } else {
                url = new URL(C8845v.m32933c());
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = m10033f(url);
                m10023U(gVar, httpURLConnection);
                return httpURLConnection;
            } catch (IOException | JSONException e) {
                C8769a0.m32680n(httpURLConnection);
                throw new FacebookException("could not construct request body", e);
            }
        } catch (MalformedURLException e2) {
            throw new FacebookException("could not construct URL for request", e2);
        }
    }

    /* renamed from: e */
    private String m10031e(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f8148b == C2643i.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String next : this.f8154h.keySet()) {
            Object obj = this.f8154h.get(next);
            if (obj == null) {
                obj = "";
            }
            if (m10011I(obj)) {
                buildUpon.appendQueryParameter(next, m10014L(obj).toString());
            } else if (this.f8148b == C2643i.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: e0 */
    static final void m10032e0(C2640g gVar) {
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (C2643i.GET.equals(graphRequest.mo8191w()) && m10028c0(graphRequest)) {
                Bundle y = graphRequest.mo8192y();
                if (!y.containsKey("fields") || C8769a0.m32644Q(y.getString("fields"))) {
                    C8831r.m32865f(C2645k.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.mo8190u());
                }
            }
        }
    }

    /* renamed from: f */
    private static HttpURLConnection m10033f(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setRequestProperty("User-Agent", m10006C());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: h */
    public static C2642h m10034h(GraphRequest graphRequest) {
        List l = m10037l(graphRequest);
        if (l != null && l.size() == 1) {
            return (C2642h) l.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* renamed from: j */
    public static List m10035j(C2640g gVar) {
        C8775b0.m32715h(gVar, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = m10030d0(gVar);
            return m10041p(httpURLConnection, gVar);
        } catch (Exception e) {
            List a = C2642h.m10186a(gVar.mo8277x(), httpURLConnection, new FacebookException((Throwable) e));
            m10018P(gVar, a);
            return a;
        } finally {
            C8769a0.m32680n(httpURLConnection);
        }
    }

    /* renamed from: k */
    public static List m10036k(Collection collection) {
        return m10035j(new C2640g(collection));
    }

    /* renamed from: l */
    public static List m10037l(GraphRequest... graphRequestArr) {
        C8775b0.m32716i(graphRequestArr, "requests");
        return m10036k(Arrays.asList(graphRequestArr));
    }

    /* renamed from: m */
    public static C2639f m10038m(C2640g gVar) {
        C8775b0.m32715h(gVar, "requests");
        C2639f fVar = new C2639f(gVar);
        fVar.executeOnExecutor(C2626d.m10142m(), new Void[0]);
        return fVar;
    }

    /* renamed from: n */
    public static C2639f m10039n(Collection collection) {
        return m10038m(new C2640g(collection));
    }

    /* renamed from: o */
    public static C2639f m10040o(GraphRequest... graphRequestArr) {
        C8775b0.m32716i(graphRequestArr, "requests");
        return m10039n(Arrays.asList(graphRequestArr));
    }

    /* renamed from: p */
    public static List m10041p(HttpURLConnection httpURLConnection, C2640g gVar) {
        List f = C2642h.m10191f(httpURLConnection, gVar);
        C8769a0.m32680n(httpURLConnection);
        int size = gVar.size();
        if (size == f.size()) {
            m10018P(gVar, f);
            C2619b.m10107h().mo8232f();
            return f;
        }
        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(f.size()), Integer.valueOf(size)}));
    }

    /* renamed from: r */
    private static String m10042r(C2640g gVar) {
        String g;
        if (!C8769a0.m32644Q(gVar.mo8270o())) {
            return gVar.mo8270o();
        }
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f8147a;
            if (accessToken != null && (g = accessToken.mo8124g()) != null) {
                return g;
            }
        }
        if (!C8769a0.m32644Q(f8144p)) {
            return f8144p;
        }
        return C2626d.m10135f();
    }

    /* renamed from: v */
    private String m10043v() {
        if (f8145q.matcher(this.f8149c).matches()) {
            return this.f8149c;
        }
        return String.format("%s/%s", new Object[]{this.f8158l, this.f8149c});
    }

    /* renamed from: x */
    private static String m10044x() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{f8143o});
    }

    /* renamed from: A */
    public final Object mo8175A() {
        return this.f8157k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final String mo8176B() {
        String str;
        String str2;
        String str3 = this.f8156j;
        if (str3 != null) {
            return str3.toString();
        }
        if (mo8191w() != C2643i.POST || (str2 = this.f8149c) == null || !str2.endsWith("/videos")) {
            str = C8845v.m32933c();
        } else {
            str = C8845v.m32934d();
        }
        String format = String.format("%s/%s", new Object[]{str, m10043v()});
        m10029d();
        return m10031e(format, Boolean.FALSE);
    }

    /* renamed from: D */
    public final String mo8177D() {
        return this.f8158l;
    }

    /* renamed from: V */
    public final void mo8178V(C2612e eVar) {
        if (C2626d.m10154y(C2645k.GRAPH_API_DEBUG_INFO) || C2626d.m10154y(C2645k.GRAPH_API_DEBUG_WARNING)) {
            this.f8155i = new C2608a(eVar);
        } else {
            this.f8155i = eVar;
        }
    }

    /* renamed from: X */
    public final void mo8179X(JSONObject jSONObject) {
        this.f8150d = jSONObject;
    }

    /* renamed from: Y */
    public final void mo8180Y(C2643i iVar) {
        if (this.f8156j == null || iVar == C2643i.GET) {
            if (iVar == null) {
                iVar = C2643i.GET;
            }
            this.f8148b = iVar;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: Z */
    public final void mo8181Z(Bundle bundle) {
        this.f8154h = bundle;
    }

    /* renamed from: a0 */
    public final void mo8182a0(boolean z) {
        this.f8159m = z;
    }

    /* renamed from: b0 */
    public final void mo8183b0(Object obj) {
        this.f8157k = obj;
    }

    /* renamed from: g */
    public final C2642h mo8184g() {
        return m10034h(this);
    }

    /* renamed from: i */
    public final C2639f mo8185i() {
        return m10040o(this);
    }

    /* renamed from: q */
    public final AccessToken mo8186q() {
        return this.f8147a;
    }

    /* renamed from: s */
    public final C2612e mo8187s() {
        return this.f8155i;
    }

    /* renamed from: t */
    public final JSONObject mo8188t() {
        return this.f8150d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f8147a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f8149c);
        sb.append(", graphObject: ");
        sb.append(this.f8150d);
        sb.append(", httpMethod: ");
        sb.append(this.f8148b);
        sb.append(", parameters: ");
        sb.append(this.f8154h);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final String mo8190u() {
        return this.f8149c;
    }

    /* renamed from: w */
    public final C2643i mo8191w() {
        return this.f8148b;
    }

    /* renamed from: y */
    public final Bundle mo8192y() {
        return this.f8154h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final String mo8193z() {
        if (this.f8156j == null) {
            String format = String.format("%s/%s", new Object[]{C8845v.m32933c(), m10043v()});
            m10029d();
            Uri parse = Uri.parse(m10031e(format, Boolean.TRUE));
            return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C2643i iVar, C2612e eVar, String str2) {
        this.f8153g = true;
        this.f8159m = false;
        this.f8147a = accessToken;
        this.f8149c = str;
        this.f8158l = str2;
        mo8178V(eVar);
        mo8180Y(iVar);
        if (bundle != null) {
            this.f8154h = new Bundle(bundle);
        } else {
            this.f8154h = new Bundle();
        }
        if (this.f8158l == null) {
            this.f8158l = C2626d.m10144o();
        }
    }
}
