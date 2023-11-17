package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.firebase.encoders.EncodingException;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p142k5.C6811b;
import p155l5.C6889a;
import p155l5.C6915j;
import p155l5.C6916k;
import p155l5.C6919l;
import p155l5.C6921m;
import p155l5.C6923n;
import p155l5.C6924o;
import p155l5.C6928p;
import p168m5.C7117h;
import p168m5.C7118i;
import p181n5.C7234f;
import p181n5.C7236g;
import p181n5.C7244m;
import p220q5.C7894a;
import p233r5.C8064b;
import p237r9.C8070a;
import p298w5.C8850a;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: com.google.android.datatransport.cct.d */
final class C3777d implements C7244m {

    /* renamed from: a */
    private final C8070a f11833a;

    /* renamed from: b */
    private final ConnectivityManager f11834b;

    /* renamed from: c */
    private final Context f11835c;

    /* renamed from: d */
    final URL f11836d;

    /* renamed from: e */
    private final C8850a f11837e;

    /* renamed from: f */
    private final C8850a f11838f;

    /* renamed from: g */
    private final int f11839g;

    /* renamed from: com.google.android.datatransport.cct.d$a */
    static final class C3778a {

        /* renamed from: a */
        final URL f11840a;

        /* renamed from: b */
        final C6915j f11841b;

        /* renamed from: c */
        final String f11842c;

        C3778a(URL url, C6915j jVar, String str) {
            this.f11840a = url;
            this.f11841b = jVar;
            this.f11842c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3778a mo11434a(URL url) {
            return new C3778a(url, this.f11841b, this.f11842c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.d$b */
    static final class C3779b {

        /* renamed from: a */
        final int f11843a;

        /* renamed from: b */
        final URL f11844b;

        /* renamed from: c */
        final long f11845c;

        C3779b(int i, URL url, long j) {
            this.f11843a = i;
            this.f11844b = url;
            this.f11845c = j;
        }
    }

    C3777d(Context context, C8850a aVar, C8850a aVar2, int i) {
        this.f11833a = C6915j.m26863b();
        this.f11835c = context;
        this.f11834b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f11836d = m13976n(C3774a.f11824c);
        this.f11837e = aVar2;
        this.f11838f = aVar;
        this.f11839g = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C3779b m13967e(C3778a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream m;
        C7894a.m29868f("CctTransportBackend", "Making request to: %s", aVar.f11840a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f11840a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f11839g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.9"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f11842c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f11833a.mo23245b(aVar.f11841b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C7894a.m29868f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                C7894a.m29864b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                C7894a.m29864b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C3779b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new C3779b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m = m13975m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C3779b bVar = new C3779b(responseCode, (URL) null, C6923n.m26908b(new BufferedReader(new InputStreamReader(m))).mo21060c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            C7894a.m29866d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C3779b(500, (URL) null, 0);
        } catch (EncodingException | IOException e2) {
            C7894a.m29866d("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C3779b(TextTypeView.SEPARATOR_FULL, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: f */
    private static int m13968f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C6924o.C6926b.UNKNOWN_MOBILE_SUBTYPE.mo21074b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return C6924o.C6926b.COMBINED.mo21074b();
        }
        if (C6924o.C6926b.m26916a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    private static int m13969g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C6924o.C6927c.NONE.mo21075b();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m13970h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C7894a.m29866d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    private C6915j m13971i(C7234f fVar) {
        C6919l.C6920a aVar;
        HashMap hashMap = new HashMap();
        for (C7118i iVar : fVar.mo21590b()) {
            String j = iVar.mo21330j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C7118i iVar2 = (C7118i) ((List) entry.getValue()).get(0);
            C6921m.C6922a b = C6921m.m26889a().mo21057f(C6928p.DEFAULT).mo21058g(this.f11838f.mo24276a()).mo21059h(this.f11837e.mo24276a()).mo21053b(C6916k.m26865a().mo21023c(C6916k.C6918b.ANDROID_FIREBASE).mo21022b(C6889a.m26756a().mo21002m(Integer.valueOf(iVar2.mo21375g("sdk-version"))).mo20999j(iVar2.mo21374b("model")).mo20995f(iVar2.mo21374b("hardware")).mo20993d(iVar2.mo21374b("device")).mo21001l(iVar2.mo21374b("product")).mo21000k(iVar2.mo21374b("os-uild")).mo20997h(iVar2.mo21374b("manufacturer")).mo20994e(iVar2.mo21374b("fingerprint")).mo20992c(iVar2.mo21374b("country")).mo20996g(iVar2.mo21374b(C11772k.C11773a.f34182n)).mo20998i(iVar2.mo21374b("mcc_mnc")).mo20991b(iVar2.mo21374b("application_build")).mo20990a()).mo21021a());
            try {
                b.mo21072i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo21073j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C7118i iVar3 : (List) entry.getValue()) {
                C7117h e = iVar3.mo21326e();
                C6811b b2 = e.mo21370b();
                if (b2.equals(C6811b.m26540b("proto"))) {
                    aVar = C6919l.m26873j(e.mo21369a());
                } else if (b2.equals(C6811b.m26540b("json"))) {
                    aVar = C6919l.m26872i(new String(e.mo21369a(), Charset.forName("UTF-8")));
                } else {
                    C7894a.m29869g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo21036c(iVar3.mo21328f()).mo21037d(iVar3.mo21331k()).mo21041h(iVar3.mo21376h("tz-offset")).mo21038e(C6924o.m26910a().mo21071c(C6924o.C6927c.m26918a(iVar3.mo21375g("net-type"))).mo21070b(C6924o.C6926b.m26916a(iVar3.mo21375g("mobile-subtype"))).mo21069a());
                if (iVar3.mo21325d() != null) {
                    aVar.mo21035b(iVar3.mo21325d());
                }
                arrayList3.add(aVar.mo21034a());
            }
            b.mo21054c(arrayList3);
            arrayList2.add(b.mo21052a());
        }
        return C6915j.m26862a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m13972j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    static long m13973k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ C3778a m13974l(C3778a aVar, C3779b bVar) {
        URL url = bVar.f11844b;
        if (url == null) {
            return null;
        }
        C7894a.m29864b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo11434a(bVar.f11844b);
    }

    /* renamed from: m */
    private static InputStream m13975m(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    private static URL m13976n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public C7236g mo11432a(C7234f fVar) {
        C6915j i = m13971i(fVar);
        URL url = this.f11836d;
        String str = null;
        if (fVar.mo21591c() != null) {
            try {
                C3774a c = C3774a.m13959c(fVar.mo21591c());
                if (c.mo11426d() != null) {
                    str = c.mo11426d();
                }
                if (c.mo11427e() != null) {
                    url = m13976n(c.mo11427e());
                }
            } catch (IllegalArgumentException unused) {
                return C7236g.m27826a();
            }
        }
        try {
            C3779b bVar = (C3779b) C8064b.m30568a(5, new C3778a(url, i, str), new C3775b(this), new C3776c());
            int i2 = bVar.f11843a;
            if (i2 == 200) {
                return C7236g.m27828e(bVar.f11845c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    if (i2 == 400) {
                        return C7236g.m27827d();
                    }
                    return C7236g.m27826a();
                }
            }
            return C7236g.m27829f();
        } catch (IOException e) {
            C7894a.m29866d("CctTransportBackend", "Could not make request to the backend", e);
            return C7236g.m27829f();
        }
    }

    /* renamed from: b */
    public C7118i mo11433b(C7118i iVar) {
        NetworkInfo activeNetworkInfo = this.f11834b.getActiveNetworkInfo();
        return iVar.mo21378l().mo21379a("sdk-version", Build.VERSION.SDK_INT).mo21381c("model", Build.MODEL).mo21381c("hardware", Build.HARDWARE).mo21381c("device", Build.DEVICE).mo21381c("product", Build.PRODUCT).mo21381c("os-uild", Build.ID).mo21381c("manufacturer", Build.MANUFACTURER).mo21381c("fingerprint", Build.FINGERPRINT).mo21380b("tz-offset", m13973k()).mo21379a("net-type", m13969g(activeNetworkInfo)).mo21379a("mobile-subtype", m13968f(activeNetworkInfo)).mo21381c("country", Locale.getDefault().getCountry()).mo21381c(C11772k.C11773a.f34182n, Locale.getDefault().getLanguage()).mo21381c("mcc_mnc", m13972j(this.f11835c).getSimOperator()).mo21381c("application_build", Integer.toString(m13970h(this.f11835c))).mo21333d();
    }

    C3777d(Context context, C8850a aVar, C8850a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
