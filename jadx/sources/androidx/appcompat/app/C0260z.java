package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.C0238h;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: androidx.appcompat.app.z */
abstract class C0260z {

    /* renamed from: androidx.appcompat.app.z$a */
    static class C0261a implements Executor {

        /* renamed from: d */
        private final Object f1389d = new Object();

        /* renamed from: e */
        final Queue f1390e = new ArrayDeque();

        /* renamed from: f */
        final Executor f1391f;

        /* renamed from: g */
        Runnable f1392g;

        C0261a(Executor executor) {
            this.f1391f = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m879b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                mo730c();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo730c() {
            synchronized (this.f1389d) {
                Runnable runnable = (Runnable) this.f1390e.poll();
                this.f1392g = runnable;
                if (runnable != null) {
                    this.f1391f.execute(runnable);
                }
            }
        }

        public void execute(Runnable runnable) {
            synchronized (this.f1389d) {
                this.f1390e.add(new C0259y(this, runnable));
                if (this.f1392g == null) {
                    mo730c();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.z$b */
    static class C0262b implements Executor {
        C0262b() {
        }

        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* renamed from: a */
    static void m875a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, (String) null);
                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                newSerializer.startTag((String) null, "locales");
                newSerializer.attribute((String) null, "application_locales", str);
                newSerializer.endTag((String) null, "locales");
                newSerializer.endDocument();
                Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception e) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: " + str, e);
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", new Object[]{"androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"}));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r3 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r3 == null) goto L_0x0050;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m876b(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x0075 }
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            int r5 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
        L_0x0017:
            int r6 = r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            r7 = 1
            if (r6 == r7) goto L_0x0040
            r7 = 3
            if (r6 != r7) goto L_0x0027
            int r8 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            if (r8 <= r5) goto L_0x0040
        L_0x0027:
            if (r6 == r7) goto L_0x0017
            r7 = 4
            if (r6 != r7) goto L_0x002d
            goto L_0x0017
        L_0x002d:
            java.lang.String r6 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
            if (r6 == 0) goto L_0x0017
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch:{ IOException | XmlPullParserException -> 0x0048 }
        L_0x0040:
            if (r3 == 0) goto L_0x0050
        L_0x0042:
            r3.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0050
        L_0x0046:
            r9 = move-exception
            goto L_0x006f
        L_0x0048:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0050
            goto L_0x0042
        L_0x0050:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x006b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r1, r9)
            goto L_0x006e
        L_0x006b:
            r9.deleteFile(r0)
        L_0x006e:
            return r2
        L_0x006f:
            if (r3 == 0) goto L_0x0074
            r3.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            throw r9
        L_0x0075:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0260z.m876b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    static void m877c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (C0238h.m796m().mo3366f()) {
                    String b = m876b(context);
                    Object systemService = context.getSystemService(C11772k.C11773a.f34182n);
                    if (systemService != null) {
                        C0238h.C0240b.m833b(systemService, C0238h.C0239a.m831a(b));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
