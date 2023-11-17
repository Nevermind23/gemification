package p297w4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C2626d;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.C2672b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p334z4.C9207a;

/* renamed from: w4.s */
public abstract class C8832s {

    /* renamed from: a */
    private static final String f24798a = "w4.s";

    /* renamed from: b */
    private static final List f24799b = m32882f();

    /* renamed from: c */
    private static final List f24800c = m32881e();

    /* renamed from: d */
    private static final Map f24801d = m32880d();

    /* renamed from: e */
    private static final AtomicBoolean f24802e = new AtomicBoolean(false);

    /* renamed from: f */
    private static final List f24803f = Arrays.asList(new Integer[]{20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101});

    /* renamed from: w4.s$a */
    static class C8833a implements Runnable {
        C8833a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    for (C8838f a : C8832s.m32879c()) {
                        a.m32912b(true);
                    }
                    C8832s.m32878b().set(false);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: w4.s$b */
    private static class C8834b extends C8838f {
        private C8834b() {
            super((C8833a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo24264d() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo24265e() {
            return "com.facebook.arstudio.player";
        }

        /* synthetic */ C8834b(C8833a aVar) {
            this();
        }
    }

    /* renamed from: w4.s$c */
    private static class C8835c extends C8838f {
        private C8835c() {
            super((C8833a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo24264d() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo24265e() {
            return "com.facebook.lite";
        }

        /* synthetic */ C8835c(C8833a aVar) {
            this();
        }
    }

    /* renamed from: w4.s$d */
    private static class C8836d extends C8838f {
        private C8836d() {
            super((C8833a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo24264d() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo24265e() {
            return "com.facebook.katana";
        }

        /* synthetic */ C8836d(C8833a aVar) {
            this();
        }
    }

    /* renamed from: w4.s$e */
    private static class C8837e extends C8838f {
        private C8837e() {
            super((C8833a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo24264d() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo24265e() {
            return "com.facebook.orca";
        }

        /* synthetic */ C8837e(C8833a aVar) {
            this();
        }
    }

    /* renamed from: w4.s$f */
    private static abstract class C8838f {

        /* renamed from: a */
        private TreeSet f24804a;

        private C8838f() {
        }

        /* synthetic */ C8838f(C8833a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            if (r1.isEmpty() == false) goto L_0x0013;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void m32912b(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L_0x000d
                java.util.TreeSet r1 = r0.f24804a     // Catch:{ all -> 0x0015 }
                if (r1 == 0) goto L_0x000d
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0015 }
                if (r1 == 0) goto L_0x0013
            L_0x000d:
                java.util.TreeSet r1 = p297w4.C8832s.m32877a(r0)     // Catch:{ all -> 0x0015 }
                r0.f24804a = r1     // Catch:{ all -> 0x0015 }
            L_0x0013:
                monitor-exit(r0)
                return
            L_0x0015:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p297w4.C8832s.C8838f.m32912b(boolean):void");
        }

        /* renamed from: c */
        public TreeSet mo24266c() {
            TreeSet treeSet = this.f24804a;
            if (treeSet == null || treeSet.isEmpty()) {
                m32912b(false);
            }
            return this.f24804a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract String mo24264d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract String mo24265e();
    }

    /* renamed from: w4.s$g */
    public static class C8839g {

        /* renamed from: a */
        private C8838f f24805a;

        /* renamed from: b */
        private int f24806b;

        private C8839g() {
        }

        /* renamed from: a */
        public static C8839g m32916a(C8838f fVar, int i) {
            C8839g gVar = new C8839g();
            gVar.f24805a = fVar;
            gVar.f24806b = i;
            return gVar;
        }

        /* renamed from: b */
        public static C8839g m32917b() {
            C8839g gVar = new C8839g();
            gVar.f24806b = -1;
            return gVar;
        }

        /* renamed from: c */
        public int mo24267c() {
            return this.f24806b;
        }
    }

    /* renamed from: w4.s$h */
    private static class C8840h extends C8838f {
        private C8840h() {
            super((C8833a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo24264d() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String mo24265e() {
            return "com.facebook.wakizashi";
        }

        /* synthetic */ C8840h(C8833a aVar) {
            this();
        }
    }

    /* renamed from: a */
    static /* synthetic */ TreeSet m32877a(C8838f fVar) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return m32891o(fVar);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ AtomicBoolean m32878b() {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f24802e;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ List m32879c() {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f24799b;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    private static Map m32880d() {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C8837e((C8833a) null));
            List list = f24799b;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f24800c);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    private static List m32881e() {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(m32882f());
            arrayList.add(0, new C8834b((C8833a) null));
            return arrayList;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    private static List m32882f() {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C8836d((C8833a) null));
            arrayList.add(new C8840h((C8833a) null));
            return arrayList;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    private static Uri m32883g(C8838f fVar) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return Uri.parse("content://" + fVar.mo24265e() + ".provider.PlatformProvider/versions");
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: h */
    public static int m32884h(TreeSet treeSet, int i, int[] iArr) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return 0;
        }
        try {
            int length = iArr.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (descendingIterator.hasNext()) {
                int intValue = ((Integer) descendingIterator.next()).intValue();
                i2 = Math.max(i2, intValue);
                while (length >= 0 && iArr[length] > intValue) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == intValue) {
                    if (length % 2 == 0) {
                        return Math.min(i2, i);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return 0;
        }
    }

    /* renamed from: i */
    public static Bundle m32885i(FacebookException facebookException) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (facebookException instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    public static Intent m32886j(Context context, String str, Collection collection, String str2, boolean z, boolean z2, C2672b bVar, String str3, String str4) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            C8835c cVar = new C8835c((C8833a) null);
            Context context2 = context;
            return m32901y(context, m32887k(cVar, str, collection, str2, z, z2, bVar, str3, str4, false), cVar);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    private static Intent m32887k(C8838f fVar, String str, Collection collection, String str2, boolean z, boolean z2, C2672b bVar, String str3, String str4, boolean z3) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            String d = fVar.mo24264d();
            if (d == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(fVar.mo24265e(), d).putExtra("client_id", str);
            putExtra.putExtra("facebook_sdk_version", C2626d.m10149t());
            if (!C8769a0.m32645R(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!C8769a0.m32644Q(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", "token,signed_request,graph_domain");
            putExtra.putExtra("return_scopes", "true");
            if (z2) {
                putExtra.putExtra("default_audience", bVar.mo8436a());
            }
            putExtra.putExtra("legacy_override", C2626d.m10144o());
            putExtra.putExtra("auth_type", str4);
            if (z3) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            return putExtra;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    public static Intent m32888l(Context context) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            for (C8838f fVar : f24799b) {
                Intent z = m32902z(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(fVar.mo24265e()).addCategory("android.intent.category.DEFAULT"), fVar);
                if (z != null) {
                    return z;
                }
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: m */
    public static Intent m32889m(Intent intent, Bundle bundle, FacebookException facebookException) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            UUID p = m32892p(intent);
            if (p == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m32898v(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", p.toString());
            if (facebookException != null) {
                bundle2.putBundle("error", m32885i(facebookException));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: n */
    public static List m32890n(Context context, String str, Collection collection, String str2, boolean z, boolean z2, C2672b bVar, String str3, String str4, boolean z3) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (C8838f k : f24799b) {
                Intent k2 = m32887k(k, str, collection, str2, z, z2, bVar, str3, str4, z3);
                if (k2 != null) {
                    arrayList.add(k2);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        android.util.Log.e(f24798a, "Failed to query content resolver.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r13 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0085 A[Catch:{ all -> 0x0089 }] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.TreeSet m32891o(p297w4.C8832s.C8838f r13) {
        /*
            java.lang.String r0 = "Failed to query content resolver."
            java.lang.String r1 = "version"
            java.lang.Class<w4.s> r2 = p297w4.C8832s.class
            boolean r3 = p334z4.C9207a.m34024c(r2)
            r4 = 0
            if (r3 == 0) goto L_0x000e
            return r4
        L_0x000e:
            java.util.TreeSet r3 = new java.util.TreeSet     // Catch:{ all -> 0x0089 }
            r3.<init>()     // Catch:{ all -> 0x0089 }
            android.content.Context r5 = com.facebook.C2626d.m10134e()     // Catch:{ all -> 0x0089 }
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch:{ all -> 0x0089 }
            java.lang.String[] r8 = new java.lang.String[]{r1}     // Catch:{ all -> 0x0089 }
            android.net.Uri r7 = m32883g(r13)     // Catch:{ all -> 0x0089 }
            android.content.Context r5 = com.facebook.C2626d.m10134e()     // Catch:{ all -> 0x0081 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r9.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r13 = r13.mo24265e()     // Catch:{ all -> 0x0081 }
            r9.append(r13)     // Catch:{ all -> 0x0081 }
            java.lang.String r13 = ".provider.PlatformProvider"
            r9.append(r13)     // Catch:{ all -> 0x0081 }
            java.lang.String r13 = r9.toString()     // Catch:{ all -> 0x0081 }
            r9 = 0
            android.content.pm.ProviderInfo r13 = r5.resolveContentProvider(r13, r9)     // Catch:{ RuntimeException -> 0x0046 }
            goto L_0x004d
        L_0x0046:
            r13 = move-exception
            java.lang.String r5 = f24798a     // Catch:{ all -> 0x0081 }
            android.util.Log.e(r5, r0, r13)     // Catch:{ all -> 0x0081 }
            r13 = r4
        L_0x004d:
            if (r13 == 0) goto L_0x007a
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r13 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException -> 0x0057 }
            goto L_0x005d
        L_0x0057:
            java.lang.String r13 = f24798a     // Catch:{ all -> 0x0081 }
            android.util.Log.e(r13, r0)     // Catch:{ all -> 0x0081 }
            r13 = r4
        L_0x005d:
            if (r13 == 0) goto L_0x007b
        L_0x005f:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x007b
            int r0 = r13.getColumnIndex(r1)     // Catch:{ all -> 0x0075 }
            int r0 = r13.getInt(r0)     // Catch:{ all -> 0x0075 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0075 }
            r3.add(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x005f
        L_0x0075:
            r0 = move-exception
            r12 = r0
            r0 = r13
            r13 = r12
            goto L_0x0083
        L_0x007a:
            r13 = r4
        L_0x007b:
            if (r13 == 0) goto L_0x0080
            r13.close()     // Catch:{ all -> 0x0089 }
        L_0x0080:
            return r3
        L_0x0081:
            r13 = move-exception
            r0 = r4
        L_0x0083:
            if (r0 == 0) goto L_0x0088
            r0.close()     // Catch:{ all -> 0x0089 }
        L_0x0088:
            throw r13     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r13 = move-exception
            p334z4.C9207a.m34023b(r13, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p297w4.C8832s.m32891o(w4.s$f):java.util.TreeSet");
    }

    /* renamed from: p */
    public static UUID m32892p(Intent intent) {
        String str;
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls) || intent == null) {
            return null;
        }
        try {
            if (m32899w(m32898v(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                if (bundleExtra != null) {
                    str = bundleExtra.getString("action_id");
                } else {
                    str = null;
                }
            } else {
                str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (str == null) {
                return null;
            }
            try {
                return UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: q */
    public static FacebookException m32893q(Bundle bundle) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
                return new FacebookException(string2);
            }
            return new FacebookOperationCanceledException(string2);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: r */
    private static C8839g m32894r(List list, int[] iArr) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            m32900x();
            if (list == null) {
                return C8839g.m32917b();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C8838f fVar = (C8838f) it.next();
                int h = m32884h(fVar.mo24266c(), m32896t(), iArr);
                if (h != -1) {
                    return C8839g.m32916a(fVar, h);
                }
            }
            return C8839g.m32917b();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: s */
    public static int m32895s(int i) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return 0;
        }
        try {
            return m32894r(f24799b, new int[]{i}).mo24267c();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return 0;
        }
    }

    /* renamed from: t */
    public static final int m32896t() {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return 0;
        }
        try {
            return ((Integer) f24803f.get(0)).intValue();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return 0;
        }
    }

    /* renamed from: u */
    public static Bundle m32897u(Intent intent) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (!m32899w(m32898v(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: v */
    public static int m32898v(Intent intent) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return 0;
        }
    }

    /* renamed from: w */
    public static boolean m32899w(int i) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (!f24803f.contains(Integer.valueOf(i)) || i < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: x */
    public static void m32900x() {
        Class<C8832s> cls = C8832s.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (f24802e.compareAndSet(false, true)) {
                    C2626d.m10142m().execute(new C8833a());
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: y */
    static Intent m32901y(Context context, Intent intent, C8838f fVar) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null && C8805i.m32787b(context, resolveActivity.activityInfo.packageName)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: z */
    static Intent m32902z(Context context, Intent intent, C8838f fVar) {
        Class<C8832s> cls = C8832s.class;
        if (C9207a.m34024c(cls) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && C8805i.m32787b(context, resolveService.serviceInfo.packageName)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}
