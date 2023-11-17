package p115i4;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import p115i4.C6530a;
import p115i4.C6535c;
import p193o4.C7438b;
import p334z4.C9207a;

/* renamed from: i4.f */
abstract class C6547f {

    /* renamed from: a */
    private static final String f19995a = "i4.f";

    /* renamed from: i4.f$a */
    private static class C6548a extends ObjectInputStream {
        public C6548a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C6530a.C6532b.class);
            }
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(C6535c.C6537b.class);
            }
            return readClassDescriptor;
        }
    }

    /* renamed from: a */
    public static synchronized void m25840a(C6530a aVar, C6568o oVar) {
        synchronized (C6547f.class) {
            if (!C9207a.m34024c(C6547f.class)) {
                try {
                    C7438b.m28293b();
                    C6565n c = m25842c();
                    c.mo20555a(aVar, oVar.mo20561d());
                    m25843d(c);
                } catch (Throwable th) {
                    C9207a.m34023b(th, C6547f.class);
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m25841b(C6539d dVar) {
        synchronized (C6547f.class) {
            if (!C9207a.m34024c(C6547f.class)) {
                try {
                    C7438b.m28293b();
                    C6565n c = m25842c();
                    for (C6530a aVar : dVar.mo20522f()) {
                        c.mo20555a(aVar, dVar.mo20520c(aVar).mo20561d());
                    }
                    m25843d(c);
                } catch (Throwable th) {
                    C9207a.m34023b(th, C6547f.class);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0093 A[Catch:{ Exception -> 0x0038, all -> 0x009a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized p115i4.C6565n m25842c() {
        /*
            java.lang.Class<i4.f> r0 = p115i4.C6547f.class
            monitor-enter(r0)
            java.lang.Class<i4.f> r1 = p115i4.C6547f.class
            boolean r1 = p334z4.C9207a.m34024c(r1)     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            p193o4.C7438b.m28293b()     // Catch:{ all -> 0x009a }
            android.content.Context r1 = com.facebook.C2626d.m10134e()     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x007c, Exception -> 0x0046, all -> 0x0043 }
            i4.f$a r4 = new i4.f$a     // Catch:{ FileNotFoundException -> 0x007c, Exception -> 0x0046, all -> 0x0043 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x007c, Exception -> 0x0046, all -> 0x0043 }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x007c, Exception -> 0x0046, all -> 0x0043 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x007c, Exception -> 0x0046, all -> 0x0043 }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x007d, Exception -> 0x0041 }
            i4.n r3 = (p115i4.C6565n) r3     // Catch:{ FileNotFoundException -> 0x007d, Exception -> 0x0041 }
            p297w4.C8769a0.m32668h(r4)     // Catch:{ all -> 0x009a }
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch:{ Exception -> 0x0038 }
            r1.delete()     // Catch:{ Exception -> 0x0038 }
            goto L_0x0091
        L_0x0038:
            r1 = move-exception
            java.lang.String r4 = f19995a     // Catch:{ all -> 0x009a }
            java.lang.String r5 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r4, r5, r1)     // Catch:{ all -> 0x009a }
            goto L_0x0091
        L_0x0041:
            r3 = move-exception
            goto L_0x0048
        L_0x0043:
            r3 = move-exception
            r4 = r2
            goto L_0x0066
        L_0x0046:
            r3 = move-exception
            r4 = r2
        L_0x0048:
            java.lang.String r5 = f19995a     // Catch:{ all -> 0x0065 }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x0065 }
            p297w4.C8769a0.m32668h(r4)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x005c }
            r1.delete()     // Catch:{ Exception -> 0x005c }
            goto L_0x0090
        L_0x005c:
            r1 = move-exception
            java.lang.String r3 = f19995a     // Catch:{ all -> 0x009a }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x0061:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x009a }
            goto L_0x0090
        L_0x0065:
            r3 = move-exception
        L_0x0066:
            p297w4.C8769a0.m32668h(r4)     // Catch:{ all -> 0x009a }
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch:{ Exception -> 0x0073 }
            r1.delete()     // Catch:{ Exception -> 0x0073 }
            goto L_0x007b
        L_0x0073:
            r1 = move-exception
            java.lang.String r4 = f19995a     // Catch:{ all -> 0x009a }
            java.lang.String r5 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r4, r5, r1)     // Catch:{ all -> 0x009a }
        L_0x007b:
            throw r3     // Catch:{ all -> 0x009a }
        L_0x007c:
            r4 = r2
        L_0x007d:
            p297w4.C8769a0.m32668h(r4)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x008a }
            r1.delete()     // Catch:{ Exception -> 0x008a }
            goto L_0x0090
        L_0x008a:
            r1 = move-exception
            java.lang.String r3 = f19995a     // Catch:{ all -> 0x009a }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0061
        L_0x0090:
            r3 = r2
        L_0x0091:
            if (r3 != 0) goto L_0x0098
            i4.n r3 = new i4.n     // Catch:{ all -> 0x009a }
            r3.<init>()     // Catch:{ all -> 0x009a }
        L_0x0098:
            monitor-exit(r0)
            return r3
        L_0x009a:
            r1 = move-exception
            java.lang.Class<i4.f> r3 = p115i4.C6547f.class
            p334z4.C9207a.m34023b(r1, r3)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)
            return r2
        L_0x00a2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i4.C6547f.m25842c():i4.n");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m25843d(p115i4.C6565n r7) {
        /*
            java.lang.String r0 = "AppEventsLogger.persistedevents"
            java.lang.Class<i4.f> r1 = p115i4.C6547f.class
            boolean r2 = p334z4.C9207a.m34024c(r1)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            android.content.Context r2 = com.facebook.C2626d.m10134e()     // Catch:{ all -> 0x0041 }
            r3 = 0
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0029 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0029 }
            r6 = 0
            java.io.FileOutputStream r6 = r2.openFileOutput(r0, r6)     // Catch:{ all -> 0x0029 }
            r5.<init>(r6)     // Catch:{ all -> 0x0029 }
            r4.<init>(r5)     // Catch:{ all -> 0x0029 }
            r4.writeObject(r7)     // Catch:{ all -> 0x0026 }
            p297w4.C8769a0.m32668h(r4)     // Catch:{ all -> 0x0041 }
            goto L_0x003b
        L_0x0026:
            r7 = move-exception
            r3 = r4
            goto L_0x002a
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            java.lang.String r4 = f19995a     // Catch:{ all -> 0x003c }
            java.lang.String r5 = "Got unexpected exception while persisting events: "
            android.util.Log.w(r4, r5, r7)     // Catch:{ all -> 0x003c }
            java.io.File r7 = r2.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0038 }
            r7.delete()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            p297w4.C8769a0.m32668h(r3)     // Catch:{ all -> 0x0041 }
        L_0x003b:
            return
        L_0x003c:
            r7 = move-exception
            p297w4.C8769a0.m32668h(r3)     // Catch:{ all -> 0x0041 }
            throw r7     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r7 = move-exception
            p334z4.C9207a.m34023b(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i4.C6547f.m25843d(i4.n):void");
    }
}
