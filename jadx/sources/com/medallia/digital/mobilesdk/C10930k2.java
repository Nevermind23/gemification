package com.medallia.digital.mobilesdk;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.medallia.digital.mobilesdk.k2 */
final class C10930k2 {

    /* renamed from: a */
    protected static final String f31396a = "medalliaDigitalSDK";

    /* renamed from: b */
    protected static final String f31397b = "PreviewApp";

    /* renamed from: c */
    private static final String f31398c = "com.medallia.digital.previewapp";

    /* renamed from: d */
    protected static final String f31399d = "resources";

    /* renamed from: e */
    protected static final String f31400e = "targetRuleEngine";

    /* renamed from: f */
    protected static final String f31401f = "configuration";

    /* renamed from: g */
    protected static final String f31402g = "configurationPropertyForLocale";

    /* renamed from: h */
    private static final String f31403h = "templates";

    /* renamed from: i */
    private static final String f31404i = "UTF-8";

    /* renamed from: com.medallia.digital.mobilesdk.k2$a */
    static class C10931a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f31405a;

        C10931a(String str) {
            this.f31405a = str;
        }

        /* renamed from: a */
        public void mo27617a() {
            super.mo27617a();
            new File(this.f31405a).delete();
        }
    }

    C10930k2() {
    }

    /* renamed from: a */
    protected static synchronized Pair<String, Boolean> m39970a(String str) {
        synchronized (C10930k2.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Pair<String, Boolean> b = m39978b(new File(m39991f(str)));
            return b;
        }
    }

    /* renamed from: b */
    protected static double m39977b() {
        File file = new File(m39985d());
        return (!file.exists() || !file.isDirectory()) ? Utils.DOUBLE_EPSILON : C11064q1.m40586a(m39982c(file));
    }

    /* renamed from: c */
    protected static double m39981c() {
        return C11064q1.m40586a(m39982c(new File(m39991f(f31399d))));
    }

    /* renamed from: d */
    protected static synchronized File m39984d(String str) {
        synchronized (C10930k2.class) {
            if (str == null) {
                return null;
            }
            File file = new File(m39991f(str));
            return file;
        }
    }

    /* renamed from: e */
    protected static double m39987e() {
        return C11064q1.m40586a(m39982c(new File(m39991f(f31400e))));
    }

    /* renamed from: f */
    protected static double m39990f() {
        return C11064q1.m40586a(m39982c(new File(m39991f(f31403h))));
    }

    /* renamed from: g */
    protected static String m39992g(String str) {
        if (str == null) {
            return null;
        }
        String f = m39991f(str);
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File(f);
            byte[] bArr = new byte[((int) file.length())];
            new DataInputStream(new BufferedInputStream(new FileInputStream(file))).readFully(bArr);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, f31404i));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            gZIPInputStream.close();
            byteArrayInputStream.close();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        return sb.toString();
    }

    /* renamed from: h */
    protected static boolean m39993h(String str) {
        if (str == null) {
            return false;
        }
        String f = m39991f("");
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(m39991f(str))));
            byte[] bArr = new byte[C11398b.f33141t];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String b = m39980b(nextEntry.getName(), new File(f));
                    if (b == null) {
                        C10735b4.m39111c("ZIP entry tried to write outside destination directory");
                        return false;
                    } else if (nextEntry.isDirectory()) {
                        new File(b).mkdirs();
                    } else {
                        new File(b).getParentFile().mkdirs();
                        FileOutputStream fileOutputStream = new FileOutputStream(b);
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        zipInputStream.closeEntry();
                    }
                } else {
                    zipInputStream.close();
                    return true;
                }
            }
        } catch (Exception e) {
            C10735b4.m39111c("Could not unzip item " + e.getMessage());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static synchronized java.io.File m39971a(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Class<com.medallia.digital.mobilesdk.k2> r0 = com.medallia.digital.mobilesdk.C10930k2.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0070 }
            r2 = 0
            if (r1 != 0) goto L_0x006e
            if (r6 != 0) goto L_0x000d
            goto L_0x006e
        L_0x000d:
            java.lang.String r5 = m39991f(r5)     // Catch:{ all -> 0x0070 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0070 }
            r1.<init>(r5)     // Catch:{ all -> 0x0070 }
            java.io.File r5 = r1.getParentFile()     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x0042
            java.io.File r5 = r1.getParentFile()     // Catch:{ all -> 0x0070 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x0042
            java.io.File r5 = r1.getParentFile()     // Catch:{ all -> 0x0070 }
            boolean r5 = r5.mkdirs()     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r3.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "Directory for file was created = "
            r3.append(r4)     // Catch:{ all -> 0x0070 }
            r3.append(r5)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0070 }
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r5)     // Catch:{ all -> 0x0070 }
        L_0x0042:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0053 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0053 }
            byte[] r6 = r6.getBytes()     // Catch:{ IOException -> 0x0053 }
            r5.write(r6)     // Catch:{ IOException -> 0x0053 }
            r5.close()     // Catch:{ IOException -> 0x0053 }
            monitor-exit(r0)
            return r1
        L_0x0053:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r6.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = "Failed to store to file "
            r6.append(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0070 }
            r6.append(r5)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0070 }
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r5)     // Catch:{ all -> 0x0070 }
            monitor-exit(r0)
            return r2
        L_0x006e:
            monitor-exit(r0)
            return r2
        L_0x0070:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10930k2.m39971a(java.lang.String, java.lang.String):java.io.File");
    }

    /* renamed from: b */
    private static Pair<String, Boolean> m39978b(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return null;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File b : listFiles) {
                m39978b(b);
            }
        }
        boolean delete = file.delete();
        C10735b4.m39109b("File was deleted = " + delete);
        return new Pair<>(file.getPath(), Boolean.valueOf(delete));
    }

    /* renamed from: c */
    private static long m39982c(File file) {
        File[] listFiles;
        long j = 0;
        if (!(file == null || !file.exists() || (listFiles = file.listFiles()) == null)) {
            for (File file2 : listFiles) {
                j += file2.isDirectory() ? m39982c(file2) : file2.length();
            }
        }
        return j;
    }

    /* renamed from: d */
    protected static String m39985d() {
        String path = C10884i4.m39721c().mo28483b().getFilesDir().getPath();
        if (path.isEmpty() || !path.contains(f31398c)) {
            return String.format("%s/%s", new Object[]{path, f31396a});
        }
        return String.format("%s/%s", new Object[]{path, f31397b});
    }

    /* renamed from: e */
    protected static FileInputStream m39988e(String str) {
        try {
            return new FileInputStream(new File(str));
        } catch (FileNotFoundException e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* renamed from: f */
    protected static String m39991f(String str) {
        if (str != null && str.startsWith(m39985d())) {
            return str;
        }
        if (str == null || !str.startsWith(C11110u2.f31950c)) {
            return String.format("%s/%s", new Object[]{m39985d(), str});
        }
        return String.format("%s%s", new Object[]{m39985d(), str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static synchronized java.io.File m39972a(java.lang.String r5, byte[] r6) {
        /*
            java.lang.Class<com.medallia.digital.mobilesdk.k2> r0 = com.medallia.digital.mobilesdk.C10930k2.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x005b }
            r2 = 0
            if (r1 != 0) goto L_0x0059
            if (r6 != 0) goto L_0x000d
            goto L_0x0059
        L_0x000d:
            java.lang.String r5 = m39991f(r5)     // Catch:{ all -> 0x005b }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x005b }
            r1.<init>(r5)     // Catch:{ all -> 0x005b }
            java.io.File r5 = r1.getParentFile()     // Catch:{ IOException -> 0x0057 }
            if (r5 == 0) goto L_0x0042
            java.io.File r5 = r1.getParentFile()     // Catch:{ IOException -> 0x0057 }
            boolean r5 = r5.exists()     // Catch:{ IOException -> 0x0057 }
            if (r5 != 0) goto L_0x0042
            java.io.File r5 = r1.getParentFile()     // Catch:{ IOException -> 0x0057 }
            boolean r5 = r5.mkdirs()     // Catch:{ IOException -> 0x0057 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0057 }
            r3.<init>()     // Catch:{ IOException -> 0x0057 }
            java.lang.String r4 = "Directory for file was created = "
            r3.append(r4)     // Catch:{ IOException -> 0x0057 }
            r3.append(r5)     // Catch:{ IOException -> 0x0057 }
            java.lang.String r5 = r3.toString()     // Catch:{ IOException -> 0x0057 }
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r5)     // Catch:{ IOException -> 0x0057 }
        L_0x0042:
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0057 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0057 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0057 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0057 }
            r5.write(r6)     // Catch:{ IOException -> 0x0057 }
            r5.flush()     // Catch:{ IOException -> 0x0057 }
            r5.close()     // Catch:{ IOException -> 0x0057 }
            monitor-exit(r0)
            return r1
        L_0x0057:
            monitor-exit(r0)
            return r2
        L_0x0059:
            monitor-exit(r0)
            return r2
        L_0x005b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10930k2.m39972a(java.lang.String, byte[]):java.io.File");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static synchronized java.lang.Boolean m39979b(java.lang.String r3) {
        /*
            java.lang.Class<com.medallia.digital.mobilesdk.k2> r0 = com.medallia.digital.mobilesdk.C10930k2.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x003b }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)
            return r2
        L_0x000c:
            java.lang.String r3 = m39991f(r3)     // Catch:{ all -> 0x003b }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x003b }
            r1.<init>(r3)     // Catch:{ all -> 0x003b }
            boolean r3 = r1.exists()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0039
            boolean r3 = r1.isDirectory()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x002f
            android.util.Pair r3 = m39978b((java.io.File) r1)     // Catch:{ all -> 0x003b }
            if (r3 != 0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x003b }
            r2 = r3
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x003b }
        L_0x002d:
            monitor-exit(r0)
            return r2
        L_0x002f:
            boolean r3 = r1.delete()     // Catch:{ all -> 0x003b }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)
            return r3
        L_0x0039:
            monitor-exit(r0)
            return r2
        L_0x003b:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10930k2.m39979b(java.lang.String):java.lang.Boolean");
    }

    /* renamed from: c */
    protected static void m39983c(String str) {
        C11004m7.m40304b().mo28763a().execute(new C10931a(str));
    }

    /* renamed from: d */
    protected static synchronized boolean m39986d(File file) {
        boolean z;
        synchronized (C10930k2.class) {
            if (file != null) {
                if (file.exists()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return null;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static synchronized java.lang.String m39989e(java.io.File r4) {
        /*
            java.lang.Class<com.medallia.digital.mobilesdk.k2> r0 = com.medallia.digital.mobilesdk.C10930k2.class
            monitor-enter(r0)
            if (r4 == 0) goto L_0x003a
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x000c
            goto L_0x003a
        L_0x000c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0029 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x0029 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0029 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0029 }
        L_0x001b:
            java.lang.String r4 = r2.readLine()     // Catch:{ IOException -> 0x0029 }
            if (r4 == 0) goto L_0x0025
            r1.append(r4)     // Catch:{ IOException -> 0x0029 }
            goto L_0x001b
        L_0x0025:
            r2.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0031
        L_0x0029:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0037 }
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r4)     // Catch:{ all -> 0x0037 }
        L_0x0031:
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)
            return r4
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x003a:
            monitor-exit(r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10930k2.m39989e(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    protected static synchronized Boolean m39973a(File file) {
        synchronized (C10930k2.class) {
            if (file == null) {
                return null;
            }
            Boolean valueOf = Boolean.valueOf(file.delete());
            return valueOf;
        }
    }

    /* renamed from: b */
    private static String m39980b(String str, File file) {
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(file.getCanonicalPath())) {
            return canonicalPath;
        }
        return null;
    }

    /* renamed from: a */
    protected static String m39974a(Uri uri) {
        Cursor query = C10884i4.m39721c().mo28483b().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return uri.getPath();
        }
        query.moveToFirst();
        String columnName = query.getColumnName(query.getColumnIndex("_data"));
        query.close();
        return columnName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static synchronized java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.Boolean>> m39975a(java.lang.String r6, java.io.File r7) {
        /*
            java.lang.Class<com.medallia.digital.mobilesdk.k2> r0 = com.medallia.digital.mobilesdk.C10930k2.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x004a }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)
            return r2
        L_0x000c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            r1.<init>()     // Catch:{ all -> 0x004a }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x004a }
            java.lang.String r6 = m39991f(r6)     // Catch:{ all -> 0x004a }
            r3.<init>(r6)     // Catch:{ all -> 0x004a }
            boolean r6 = r3.exists()     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x0048
            boolean r6 = r3.isDirectory()     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x0048
            java.io.File[] r6 = r3.listFiles()     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x0046
            int r2 = r6.length     // Catch:{ all -> 0x004a }
            r3 = 0
        L_0x002e:
            if (r3 >= r2) goto L_0x0046
            r4 = r6[r3]     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0043
            boolean r5 = r4.equals(r7)     // Catch:{ all -> 0x004a }
            if (r5 != 0) goto L_0x0043
            android.util.Pair r4 = m39978b((java.io.File) r4)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0043
            r1.add(r4)     // Catch:{ all -> 0x004a }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x002e
        L_0x0046:
            monitor-exit(r0)
            return r1
        L_0x0048:
            monitor-exit(r0)
            return r2
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10930k2.m39975a(java.lang.String, java.io.File):java.util.ArrayList");
    }

    /* renamed from: a */
    protected static synchronized void m39976a() {
        synchronized (C10930k2.class) {
            C10735b4.m39107a("Files");
            m39978b(new File(m39985d()));
        }
    }
}
