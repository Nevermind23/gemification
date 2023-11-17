package p140k3;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: k3.b */
public final class C6777b implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final File f20362d;

    /* renamed from: e */
    private final File f20363e;

    /* renamed from: f */
    private final File f20364f;

    /* renamed from: g */
    private final File f20365g;

    /* renamed from: h */
    private final int f20366h;

    /* renamed from: i */
    private long f20367i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f20368j;

    /* renamed from: k */
    private long f20369k = 0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Writer f20370l;

    /* renamed from: m */
    private final LinkedHashMap f20371m = new LinkedHashMap(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f20372n;

    /* renamed from: o */
    private long f20373o = 0;

    /* renamed from: p */
    final ThreadPoolExecutor f20374p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6779b((C6778a) null));

    /* renamed from: q */
    private final Callable f20375q = new C6778a();

    /* renamed from: k3.b$a */
    class C6778a implements Callable {
        C6778a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                k3.b r0 = p140k3.C6777b.this
                monitor-enter(r0)
                k3.b r1 = p140k3.C6777b.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f20370l     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                k3.b r1 = p140k3.C6777b.this     // Catch:{ all -> 0x0028 }
                r1.m26429h0()     // Catch:{ all -> 0x0028 }
                k3.b r1 = p140k3.C6777b.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m26438x()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                k3.b r1 = p140k3.C6777b.this     // Catch:{ all -> 0x0028 }
                r1.m26422a0()     // Catch:{ all -> 0x0028 }
                k3.b r1 = p140k3.C6777b.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f20372n = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p140k3.C6777b.C6778a.call():java.lang.Void");
        }
    }

    /* renamed from: k3.b$b */
    private static final class C6779b implements ThreadFactory {
        private C6779b() {
        }

        /* synthetic */ C6779b(C6778a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: k3.b$c */
    public final class C6780c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C6781d f20377a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f20378b;

        /* renamed from: c */
        private boolean f20379c;

        /* synthetic */ C6780c(C6777b bVar, C6781d dVar, C6778a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo20833a() {
            C6777b.this.m26434p(this, false);
        }

        /* renamed from: b */
        public void mo20834b() {
            if (!this.f20379c) {
                try {
                    mo20833a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo20835e() {
            C6777b.this.m26434p(this, true);
            this.f20379c = true;
        }

        /* renamed from: f */
        public File mo20836f(int i) {
            File k;
            synchronized (C6777b.this) {
                if (this.f20377a.f20386f == this) {
                    if (!this.f20377a.f20385e) {
                        this.f20378b[i] = true;
                    }
                    k = this.f20377a.mo20838k(i);
                    C6777b.this.f20362d.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        private C6780c(C6781d dVar) {
            this.f20377a = dVar;
            this.f20378b = dVar.f20385e ? null : new boolean[C6777b.this.f20368j];
        }
    }

    /* renamed from: k3.b$d */
    private final class C6781d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f20381a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f20382b;

        /* renamed from: c */
        File[] f20383c;

        /* renamed from: d */
        File[] f20384d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f20385e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C6780c f20386f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f20387g;

        /* synthetic */ C6781d(C6777b bVar, String str, C6778a aVar) {
            this(str);
        }

        /* renamed from: m */
        private IOException m26460m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m26461n(String[] strArr) {
            if (strArr.length == C6777b.this.f20368j) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f20382b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m26460m(strArr);
                    }
                }
                return;
            }
            throw m26460m(strArr);
        }

        /* renamed from: j */
        public File mo20837j(int i) {
            return this.f20383c[i];
        }

        /* renamed from: k */
        public File mo20838k(int i) {
            return this.f20384d[i];
        }

        /* renamed from: l */
        public String mo20839l() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f20382b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private C6781d(String str) {
            this.f20381a = str;
            this.f20382b = new long[C6777b.this.f20368j];
            this.f20383c = new File[C6777b.this.f20368j];
            this.f20384d = new File[C6777b.this.f20368j];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C6777b.this.f20368j; i++) {
                sb.append(i);
                this.f20383c[i] = new File(C6777b.this.f20362d, sb.toString());
                sb.append(".tmp");
                this.f20384d[i] = new File(C6777b.this.f20362d, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: k3.b$e */
    public final class C6782e {

        /* renamed from: a */
        private final String f20389a;

        /* renamed from: b */
        private final long f20390b;

        /* renamed from: c */
        private final long[] f20391c;

        /* renamed from: d */
        private final File[] f20392d;

        /* synthetic */ C6782e(C6777b bVar, String str, long j, File[] fileArr, long[] jArr, C6778a aVar) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo20840a(int i) {
            return this.f20392d[i];
        }

        private C6782e(String str, long j, File[] fileArr, long[] jArr) {
            this.f20389a = str;
            this.f20390b = j;
            this.f20392d = fileArr;
            this.f20391c = jArr;
        }
    }

    private C6777b(File file, int i, int i2, long j) {
        File file2 = file;
        this.f20362d = file2;
        this.f20366h = i;
        this.f20363e = new File(file2, "journal");
        this.f20364f = new File(file2, "journal.tmp");
        this.f20365g = new File(file2, "journal.bkp");
        this.f20368j = i2;
        this.f20367i = j;
    }

    /* renamed from: Q */
    private void m26418Q() {
        m26435s(this.f20364f);
        Iterator it = this.f20371m.values().iterator();
        while (it.hasNext()) {
            C6781d dVar = (C6781d) it.next();
            int i = 0;
            if (dVar.f20386f == null) {
                while (i < this.f20368j) {
                    this.f20369k += dVar.f20382b[i];
                    i++;
                }
            } else {
                C6780c unused = dVar.f20386f = null;
                while (i < this.f20368j) {
                    m26435s(dVar.mo20837j(i));
                    m26435s(dVar.mo20838k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f20372n = r0 - r9.f20371m.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo20842n() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m26422a0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f20370l = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f20363e, true), p140k3.C6785d.f20400a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26419R() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            k3.c r1 = new k3.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f20363e
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p140k3.C6785d.f20400a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo20843o()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo20843o()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo20843o()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo20843o()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo20843o()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f20366h     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f20368j     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo20843o()     // Catch:{ EOFException -> 0x005f }
            r9.m26420U(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap r2 = r9.f20371m     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f20372n = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo20842n()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m26422a0()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f20363e     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p140k3.C6785d.f20400a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f20370l = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p140k3.C6785d.m26470a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p140k3.C6785d.m26470a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p140k3.C6777b.m26419R():void");
    }

    /* renamed from: U */
    private void m26420U(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f20371m.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C6781d dVar = (C6781d) this.f20371m.get(str2);
            if (dVar == null) {
                dVar = new C6781d(this, str2, (C6778a) null);
                this.f20371m.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f20385e = true;
                C6780c unused2 = dVar.f20386f = null;
                dVar.m26461n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C6780c unused3 = dVar.f20386f = new C6780c(this, dVar, (C6778a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public synchronized void m26422a0() {
        Writer writer = this.f20370l;
        if (writer != null) {
            m26433o(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f20364f), C6785d.f20400a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f20366h));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f20368j));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C6781d dVar : this.f20371m.values()) {
                if (dVar.f20386f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f20381a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f20381a + dVar.mo20839l() + 10);
                }
            }
            m26433o(bufferedWriter);
            if (this.f20363e.exists()) {
                m26427f0(this.f20363e, this.f20365g, true);
            }
            m26427f0(this.f20364f, this.f20363e, false);
            this.f20365g.delete();
            this.f20370l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f20363e, true), C6785d.f20400a));
        } catch (Throwable th) {
            m26433o(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: f0 */
    private static void m26427f0(File file, File file2, boolean z) {
        if (z) {
            m26435s(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m26429h0() {
        while (this.f20369k > this.f20367i) {
            mo20826e0((String) ((Map.Entry) this.f20371m.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: n */
    private void m26432n() {
        if (this.f20370l == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: o */
    private static void m26433o(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m26434p(p140k3.C6777b.C6780c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            k3.b$d r0 = r10.f20377a     // Catch:{ all -> 0x010e }
            k3.b$c r1 = r0.f20386f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f20385e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0015:
            int r3 = r9.f20368j     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f20378b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo20838k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo20833a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo20833a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f20368j     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo20838k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo20837j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f20382b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f20382b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f20369k     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f20369k = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m26435s(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f20372n     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f20372n = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            p140k3.C6777b.C6780c unused = r0.f20386f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f20385e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f20385e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f20381a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo20839l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f20373o     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f20373o = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f20387g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap r10 = r9.f20371m     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f20381a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f20381a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f20370l     // Catch:{ all -> 0x010e }
            m26437v(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f20369k     // Catch:{ all -> 0x010e }
            long r0 = r9.f20367i     // Catch:{ all -> 0x010e }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ff
            boolean r10 = r9.m26438x()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f20374p     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable r11 = r9.f20375q     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p140k3.C6777b.m26434p(k3.b$c, boolean):void");
    }

    /* renamed from: s */
    private static void m26435s(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p140k3.C6777b.C6780c m26436u(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m26432n()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap r0 = r5.f20371m     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            k3.b$d r0 = (p140k3.C6777b.C6781d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r3 = r0.f20387g     // Catch:{ all -> 0x005d }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r2
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            k3.b$d r0 = new k3.b$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap r7 = r5.f20371m     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            k3.b$c r7 = r0.f20386f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r2
        L_0x0034:
            k3.b$c r7 = new k3.b$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x005d }
            p140k3.C6777b.C6780c unused = r0.f20386f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f20370l     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f20370l     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f20370l     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f20370l     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f20370l     // Catch:{ all -> 0x005d }
            m26437v(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p140k3.C6777b.m26436u(java.lang.String, long):k3.b$c");
    }

    /* renamed from: v */
    private static void m26437v(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public boolean m26438x() {
        int i = this.f20372n;
        if (i < 2000 || i < this.f20371m.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static C6777b m26439y(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m26427f0(file2, file3, false);
                }
            }
            C6777b bVar = new C6777b(file, i, i2, j);
            if (bVar.f20363e.exists()) {
                try {
                    bVar.m26419R();
                    bVar.m26418Q();
                    return bVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    bVar.mo20827q();
                }
            }
            file.mkdirs();
            C6777b bVar2 = new C6777b(file, i, i2, j);
            bVar2.m26422a0();
            return bVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public synchronized void close() {
        if (this.f20370l != null) {
            Iterator it = new ArrayList(this.f20371m.values()).iterator();
            while (it.hasNext()) {
                C6781d dVar = (C6781d) it.next();
                if (dVar.f20386f != null) {
                    dVar.f20386f.mo20833a();
                }
            }
            m26429h0();
            m26433o(this.f20370l);
            this.f20370l = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo20826e0(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m26432n()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap r0 = r7.f20371m     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            k3.b$d r0 = (p140k3.C6777b.C6781d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            k3.b$c r2 = r0.f20386f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f20368j     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo20837j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f20369k     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f20382b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f20369k = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f20382b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f20372n     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f20372n = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f20370l     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f20370l     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f20370l     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f20370l     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap r0 = r7.f20371m     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m26438x()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f20374p     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable r0 = r7.f20375q     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p140k3.C6777b.mo20826e0(java.lang.String):boolean");
    }

    /* renamed from: q */
    public void mo20827q() {
        close();
        C6785d.m26471b(this.f20362d);
    }

    /* renamed from: t */
    public C6780c mo20828t(String str) {
        return m26436u(str, -1);
    }

    /* renamed from: w */
    public synchronized C6782e mo20829w(String str) {
        m26432n();
        C6781d dVar = (C6781d) this.f20371m.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f20385e) {
            return null;
        }
        for (File exists : dVar.f20383c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f20372n++;
        this.f20370l.append("READ");
        this.f20370l.append(' ');
        this.f20370l.append(str);
        this.f20370l.append(10);
        if (m26438x()) {
            this.f20374p.submit(this.f20375q);
        }
        return new C6782e(this, str, dVar.f20387g, dVar.f20383c, dVar.f20382b, (C6778a) null);
    }
}
