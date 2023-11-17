package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.C11461g;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.util.f */
public final class C11811f implements Closeable {

    /* renamed from: A */
    private static final String f34274A = "READ";

    /* renamed from: o */
    static final String f34275o = "journal";

    /* renamed from: p */
    static final String f34276p = "journal.tmp";

    /* renamed from: q */
    static final String f34277q = "journal.bkp";

    /* renamed from: r */
    static final String f34278r = "libcore.io.DiskLruCache";

    /* renamed from: s */
    static final String f34279s = "1";

    /* renamed from: t */
    static final long f34280t = -1;

    /* renamed from: u */
    static final String f34281u = "[a-z0-9_-]{1,120}";

    /* renamed from: v */
    static final Pattern f34282v = Pattern.compile(f34281u);

    /* renamed from: w */
    static final OutputStream f34283w = new C11812a();

    /* renamed from: x */
    private static final String f34284x = "CLEAN";

    /* renamed from: y */
    private static final String f34285y = "DIRTY";

    /* renamed from: z */
    private static final String f34286z = "REMOVE";

    /* renamed from: a */
    final ThreadPoolExecutor f34287a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    final File f34288b;

    /* renamed from: c */
    final int f34289c;

    /* renamed from: d */
    private final File f34290d;

    /* renamed from: e */
    private final File f34291e;

    /* renamed from: f */
    private final File f34292f;

    /* renamed from: g */
    private final int f34293g;

    /* renamed from: h */
    private final LinkedHashMap<String, C11816d> f34294h = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: i */
    Writer f34295i;

    /* renamed from: j */
    int f34296j;

    /* renamed from: k */
    private long f34297k;

    /* renamed from: l */
    private long f34298l;

    /* renamed from: m */
    private final Callable<Void> f34299m = new C11813b();

    /* renamed from: n */
    private long f34300n;

    /* renamed from: com.salesforce.marketingcloud.util.f$a */
    class C11812a extends OutputStream {
        C11812a() {
        }

        public void write(int i) {
        }
    }

    /* renamed from: com.salesforce.marketingcloud.util.f$b */
    class C11813b implements Callable<Void> {
        C11813b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                com.salesforce.marketingcloud.util.f r0 = com.salesforce.marketingcloud.util.C11811f.this
                monitor-enter(r0)
                com.salesforce.marketingcloud.util.f r1 = com.salesforce.marketingcloud.util.C11811f.this     // Catch:{ all -> 0x0023 }
                java.io.Writer r2 = r1.f34295i     // Catch:{ all -> 0x0023 }
                r3 = 0
                if (r2 != 0) goto L_0x000c
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                return r3
            L_0x000c:
                r1.mo31661l()     // Catch:{ all -> 0x0023 }
                com.salesforce.marketingcloud.util.f r1 = com.salesforce.marketingcloud.util.C11811f.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.mo31658g()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0021
                com.salesforce.marketingcloud.util.f r1 = com.salesforce.marketingcloud.util.C11811f.this     // Catch:{ all -> 0x0023 }
                r1.mo31659j()     // Catch:{ all -> 0x0023 }
                com.salesforce.marketingcloud.util.f r1 = com.salesforce.marketingcloud.util.C11811f.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f34296j = r2     // Catch:{ all -> 0x0023 }
            L_0x0021:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                return r3
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11811f.C11813b.call():java.lang.Void");
        }
    }

    /* renamed from: com.salesforce.marketingcloud.util.f$c */
    public final class C11814c {

        /* renamed from: a */
        final C11816d f34302a;

        /* renamed from: b */
        final boolean[] f34303b;

        /* renamed from: c */
        boolean f34304c;

        /* renamed from: d */
        private boolean f34305d;

        /* renamed from: com.salesforce.marketingcloud.util.f$c$a */
        private class C11815a extends FilterOutputStream {
            C11815a(OutputStream outputStream) {
                super(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C11814c.this.f34304c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C11814c.this.f34304c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C11814c.this.f34304c = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C11814c.this.f34304c = true;
                }
            }
        }

        C11814c(C11816d dVar) {
            this.f34302a = dVar;
            this.f34303b = dVar.f34310c ? null : new boolean[C11811f.this.f34289c];
        }

        /* renamed from: a */
        public String mo31665a(int i) {
            InputStream b = mo31668b(i);
            if (b != null) {
                return C11811f.m43217a(b);
            }
            return null;
        }

        /* renamed from: b */
        public InputStream mo31668b(int i) {
            synchronized (C11811f.this) {
                C11816d dVar = this.f34302a;
                if (dVar.f34311d != this) {
                    throw new IllegalStateException();
                } else if (!dVar.f34310c) {
                    return null;
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f34302a.mo31676a(i));
                        return fileInputStream;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0022 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo31670c(int r5) {
            /*
                r4 = this;
                if (r5 < 0) goto L_0x0042
                com.salesforce.marketingcloud.util.f r0 = com.salesforce.marketingcloud.util.C11811f.this
                int r1 = r0.f34289c
                if (r5 >= r1) goto L_0x0042
                monitor-enter(r0)
                com.salesforce.marketingcloud.util.f$d r1 = r4.f34302a     // Catch:{ all -> 0x003f }
                com.salesforce.marketingcloud.util.f$c r2 = r1.f34311d     // Catch:{ all -> 0x003f }
                if (r2 != r4) goto L_0x0039
                boolean r2 = r1.f34310c     // Catch:{ all -> 0x003f }
                if (r2 != 0) goto L_0x0018
                boolean[] r2 = r4.f34303b     // Catch:{ all -> 0x003f }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x003f }
            L_0x0018:
                java.io.File r5 = r1.mo31678b((int) r5)     // Catch:{ all -> 0x003f }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0022 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0022 }
                goto L_0x002e
            L_0x0022:
                com.salesforce.marketingcloud.util.f r1 = com.salesforce.marketingcloud.util.C11811f.this     // Catch:{ all -> 0x003f }
                java.io.File r1 = r1.f34288b     // Catch:{ all -> 0x003f }
                r1.mkdirs()     // Catch:{ all -> 0x003f }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0035 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0035 }
            L_0x002e:
                com.salesforce.marketingcloud.util.f$c$a r5 = new com.salesforce.marketingcloud.util.f$c$a     // Catch:{ all -> 0x003f }
                r5.<init>(r1)     // Catch:{ all -> 0x003f }
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return r5
            L_0x0035:
                java.io.OutputStream r5 = com.salesforce.marketingcloud.util.C11811f.f34283w     // Catch:{ all -> 0x003f }
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return r5
            L_0x0039:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003f }
                r5.<init>()     // Catch:{ all -> 0x003f }
                throw r5     // Catch:{ all -> 0x003f }
            L_0x003f:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                throw r5
            L_0x0042:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected index "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r5)
                com.salesforce.marketingcloud.util.f r5 = com.salesforce.marketingcloud.util.C11811f.this
                int r5 = r5.f34289c
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11811f.C11814c.mo31670c(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo31666a() {
            C11811f.this.mo31649a(this, false);
        }

        /* renamed from: b */
        public void mo31669b() {
            if (!this.f34305d) {
                try {
                    mo31666a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c */
        public void mo31671c() {
            if (this.f34304c) {
                C11811f.this.mo31649a(this, false);
                C11811f.this.mo31655d(this.f34302a.f34308a);
            } else {
                C11811f.this.mo31649a(this, true);
            }
            this.f34305d = true;
        }

        /* renamed from: a */
        public void mo31667a(int i, String str) {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(mo31670c(i), C11818g.f34321c);
                try {
                    outputStreamWriter2.write(str);
                    C11818g.m43258a((Closeable) outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    C11818g.m43258a((Closeable) outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C11818g.m43258a((Closeable) outputStreamWriter);
                throw th;
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.util.f$d */
    private final class C11816d {

        /* renamed from: a */
        final String f34308a;

        /* renamed from: b */
        final long[] f34309b;

        /* renamed from: c */
        boolean f34310c;

        /* renamed from: d */
        C11814c f34311d;

        /* renamed from: e */
        long f34312e;

        C11816d(String str) {
            this.f34308a = str;
            this.f34309b = new long[C11811f.this.f34289c];
        }

        /* renamed from: a */
        public File mo31676a(int i) {
            File file = C11811f.this.f34288b;
            return new File(file, this.f34308a + "." + i);
        }

        /* renamed from: b */
        public File mo31678b(int i) {
            File file = C11811f.this.f34288b;
            return new File(file, this.f34308a + "." + i + ".tmp");
        }

        /* renamed from: a */
        private IOException m43248a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo31679b(String[] strArr) {
            if (strArr.length == C11811f.this.f34289c) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f34309b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m43248a(strArr);
                    }
                }
                return;
            }
            throw m43248a(strArr);
        }

        /* renamed from: a */
        public String mo31677a() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f34309b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.util.f$e */
    public final class C11817e implements Closeable {

        /* renamed from: a */
        private final String f34314a;

        /* renamed from: b */
        private final long f34315b;

        /* renamed from: c */
        private final InputStream[] f34316c;

        /* renamed from: d */
        private final long[] f34317d;

        C11817e(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f34314a = str;
            this.f34315b = j;
            this.f34316c = inputStreamArr;
            this.f34317d = jArr;
        }

        /* renamed from: a */
        public C11814c mo31680a() {
            return C11811f.this.mo31647a(this.f34314a, this.f34315b);
        }

        /* renamed from: b */
        public long mo31682b(int i) {
            return this.f34317d[i];
        }

        /* renamed from: c */
        public String mo31683c(int i) {
            return C11811f.m43217a(mo31681a(i));
        }

        public void close() {
            for (InputStream a : this.f34316c) {
                C11818g.m43258a((Closeable) a);
            }
        }

        /* renamed from: a */
        public InputStream mo31681a(int i) {
            return this.f34316c[i];
        }
    }

    private C11811f(File file, int i, int i2, long j) {
        this.f34288b = file;
        this.f34293g = i;
        this.f34290d = new File(file, f34275o);
        this.f34291e = new File(file, f34276p);
        this.f34292f = new File(file, f34277q);
        this.f34289c = i2;
        this.f34297k = j;
    }

    /* renamed from: h */
    private void m43223h() {
        m43219a(this.f34291e);
        Iterator<C11816d> it = this.f34294h.values().iterator();
        while (it.hasNext()) {
            C11816d next = it.next();
            int i = 0;
            if (next.f34311d == null) {
                while (i < this.f34289c) {
                    this.f34298l += next.f34309b[i];
                    i++;
                }
            } else {
                next.f34311d = null;
                while (i < this.f34289c) {
                    m43219a(next.mo31676a(i));
                    m43219a(next.mo31678b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f34296j = r0 - r9.f34294h.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo31685b() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        mo31659j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f34295i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f34290d, true), com.salesforce.marketingcloud.util.C11818g.f34319a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m43224i() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.salesforce.marketingcloud.util.k r1 = new com.salesforce.marketingcloud.util.k
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f34290d
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.salesforce.marketingcloud.util.C11818g.f34319a
            r1.<init>((java.io.InputStream) r2, (java.nio.charset.Charset) r3)
            java.lang.String r2 = r1.mo31688d()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo31688d()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo31688d()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo31688d()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo31688d()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f34293g     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f34289c     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo31688d()     // Catch:{ EOFException -> 0x005f }
            r9.m43221c(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.salesforce.marketingcloud.util.f$d> r2 = r9.f34294h     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f34296j = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo31685b()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.mo31659j()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f34290d     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.salesforce.marketingcloud.util.C11818g.f34319a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f34295i = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r1)
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
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11811f.m43224i():void");
    }

    /* renamed from: a */
    public C11814c mo31646a(String str) {
        return mo31647a(str, (long) f34280t);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r10.f34296j++;
        r10.f34295i.append("READ " + r11 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (mo31658g() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r10.f34287a.submit(r10.f34299m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        return new com.salesforce.marketingcloud.util.C11811f.C11817e(r10, r11, r0.f34312e, r8, r0.f34309b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.salesforce.marketingcloud.util.C11811f.C11817e mo31650b(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.m43218a()     // Catch:{ all -> 0x007e }
            r10.m43222e(r11)     // Catch:{ all -> 0x007e }
            java.util.LinkedHashMap<java.lang.String, com.salesforce.marketingcloud.util.f$d> r0 = r10.f34294h     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x007e }
            com.salesforce.marketingcloud.util.f$d r0 = (com.salesforce.marketingcloud.util.C11811f.C11816d) r0     // Catch:{ all -> 0x007e }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r10)
            return r1
        L_0x0014:
            boolean r2 = r0.f34310c     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r10)
            return r1
        L_0x001a:
            int r2 = r10.f34289c     // Catch:{ all -> 0x007e }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x007e }
            r2 = 0
            r3 = r2
        L_0x0020:
            int r4 = r10.f34289c     // Catch:{ FileNotFoundException -> 0x006e }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006e }
            java.io.File r5 = r0.mo31676a((int) r3)     // Catch:{ FileNotFoundException -> 0x006e }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006e }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006e }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r10.f34296j     // Catch:{ all -> 0x007e }
            int r1 = r1 + 1
            r10.f34296j = r1     // Catch:{ all -> 0x007e }
            java.io.Writer r1 = r10.f34295i     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r2.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x007e }
            r2.append(r11)     // Catch:{ all -> 0x007e }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007e }
            r1.append(r2)     // Catch:{ all -> 0x007e }
            boolean r1 = r10.mo31658g()     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r1 = r10.f34287a     // Catch:{ all -> 0x007e }
            java.util.concurrent.Callable<java.lang.Void> r2 = r10.f34299m     // Catch:{ all -> 0x007e }
            r1.submit(r2)     // Catch:{ all -> 0x007e }
        L_0x0060:
            com.salesforce.marketingcloud.util.f$e r1 = new com.salesforce.marketingcloud.util.f$e     // Catch:{ all -> 0x007e }
            long r6 = r0.f34312e     // Catch:{ all -> 0x007e }
            long[] r9 = r0.f34309b     // Catch:{ all -> 0x007e }
            r3 = r1
            r4 = r10
            r5 = r11
            r3.<init>(r5, r6, r8, r9)     // Catch:{ all -> 0x007e }
            monitor-exit(r10)
            return r1
        L_0x006e:
            int r11 = r10.f34289c     // Catch:{ all -> 0x007e }
            if (r2 >= r11) goto L_0x007c
            r11 = r8[r2]     // Catch:{ all -> 0x007e }
            if (r11 == 0) goto L_0x007c
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r11)     // Catch:{ all -> 0x007e }
            int r2 = r2 + 1
            goto L_0x006e
        L_0x007c:
            monitor-exit(r10)
            return r1
        L_0x007e:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11811f.mo31650b(java.lang.String):com.salesforce.marketingcloud.util.f$e");
    }

    /* renamed from: c */
    public synchronized void mo31652c() {
        m43218a();
        mo31661l();
        this.f34295i.flush();
    }

    public synchronized void close() {
        if (this.f34295i != null) {
            Iterator it = new ArrayList(this.f34294h.values()).iterator();
            while (it.hasNext()) {
                C11814c cVar = ((C11816d) it.next()).f34311d;
                if (cVar != null) {
                    cVar.mo31666a();
                }
            }
            mo31661l();
            this.f34295i.close();
            this.f34295i = null;
        }
    }

    /* renamed from: d */
    public File mo31654d() {
        return this.f34288b;
    }

    /* renamed from: e */
    public synchronized long mo31656e() {
        return this.f34297k;
    }

    /* renamed from: f */
    public synchronized boolean mo31657f() {
        return this.f34295i == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo31658g() {
        int i = this.f34296j;
        return i >= 2000 && i >= this.f34294h.size();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized void mo31659j() {
        StringBuilder sb;
        Writer writer = this.f34295i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34291e), C11818g.f34319a));
        try {
            bufferedWriter.write(f34278r);
            bufferedWriter.write("\n");
            bufferedWriter.write(f34279s);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f34293g));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f34289c));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C11816d next : this.f34294h.values()) {
                if (next.f34311d != null) {
                    sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(next.f34308a);
                    sb.append(10);
                } else {
                    sb = new StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(next.f34308a);
                    sb.append(next.mo31677a());
                    sb.append(10);
                }
                bufferedWriter.write(sb.toString());
            }
            bufferedWriter.close();
            if (this.f34290d.exists()) {
                m43220a(this.f34290d, this.f34292f, true);
            }
            m43220a(this.f34291e, this.f34290d, false);
            this.f34292f.delete();
            this.f34295i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34290d, true), C11818g.f34319a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: k */
    public synchronized long mo31660k() {
        return this.f34298l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo31661l() {
        while (this.f34298l > this.f34297k) {
            mo31655d((String) this.f34294h.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: c */
    private void m43221c(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(f34286z)) {
                    this.f34294h.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C11816d dVar = this.f34294h.get(str2);
            if (dVar == null) {
                dVar = new C11816d(str2);
                this.f34294h.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f34284x)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f34310c = true;
                dVar.f34311d = null;
                dVar.mo31679b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f34285y)) {
                dVar.f34311d = new C11814c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(f34274A)) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: e */
    private void m43222e(String str) {
        if (!f34282v.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.salesforce.marketingcloud.util.C11811f.C11814c mo31647a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m43218a()     // Catch:{ all -> 0x005c }
            r5.m43222e(r6)     // Catch:{ all -> 0x005c }
            java.util.LinkedHashMap<java.lang.String, com.salesforce.marketingcloud.util.f$d> r0 = r5.f34294h     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005c }
            com.salesforce.marketingcloud.util.f$d r0 = (com.salesforce.marketingcloud.util.C11811f.C11816d) r0     // Catch:{ all -> 0x005c }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x001e
            long r3 = r0.f34312e     // Catch:{ all -> 0x005c }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0020
        L_0x001e:
            monitor-exit(r5)
            return r2
        L_0x0020:
            if (r0 != 0) goto L_0x002d
            com.salesforce.marketingcloud.util.f$d r0 = new com.salesforce.marketingcloud.util.f$d     // Catch:{ all -> 0x005c }
            r0.<init>(r6)     // Catch:{ all -> 0x005c }
            java.util.LinkedHashMap<java.lang.String, com.salesforce.marketingcloud.util.f$d> r7 = r5.f34294h     // Catch:{ all -> 0x005c }
            r7.put(r6, r0)     // Catch:{ all -> 0x005c }
            goto L_0x0033
        L_0x002d:
            com.salesforce.marketingcloud.util.f$c r7 = r0.f34311d     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0033
            monitor-exit(r5)
            return r2
        L_0x0033:
            com.salesforce.marketingcloud.util.f$c r7 = new com.salesforce.marketingcloud.util.f$c     // Catch:{ all -> 0x005c }
            r7.<init>(r0)     // Catch:{ all -> 0x005c }
            r0.f34311d = r7     // Catch:{ all -> 0x005c }
            java.io.Writer r8 = r5.f34295i     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r0.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x005c }
            r0.append(r6)     // Catch:{ all -> 0x005c }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x005c }
            r8.write(r6)     // Catch:{ all -> 0x005c }
            java.io.Writer r6 = r5.f34295i     // Catch:{ all -> 0x005c }
            r6.flush()     // Catch:{ all -> 0x005c }
            monitor-exit(r5)
            return r7
        L_0x005c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11811f.mo31647a(java.lang.String, long):com.salesforce.marketingcloud.util.f$c");
    }

    /* renamed from: b */
    public void mo31651b() {
        close();
        C11818g.m43259a(this.f34288b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo31655d(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m43218a()     // Catch:{ all -> 0x008a }
            r7.m43222e(r8)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, com.salesforce.marketingcloud.util.f$d> r0 = r7.f34294h     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            com.salesforce.marketingcloud.util.f$d r0 = (com.salesforce.marketingcloud.util.C11811f.C11816d) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            com.salesforce.marketingcloud.util.f$c r2 = r0.f34311d     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0017
            goto L_0x0088
        L_0x0017:
            int r2 = r7.f34289c     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0053
            java.io.File r2 = r0.mo31676a((int) r1)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r0.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x0043:
            long r2 = r7.f34298l     // Catch:{ all -> 0x008a }
            long[] r4 = r0.f34309b     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            long r2 = r2 - r5
            r7.f34298l = r2     // Catch:{ all -> 0x008a }
            r2 = 0
            r4[r1] = r2     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0053:
            int r0 = r7.f34296j     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.f34296j = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.f34295i     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r2.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x008a }
            r2.append(r8)     // Catch:{ all -> 0x008a }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, com.salesforce.marketingcloud.util.f$d> r0 = r7.f34294h     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.mo31658g()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f34287a     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f34299m     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r7)
            return r1
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11811f.mo31655d(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C11811f m43216a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, f34277q);
            if (file2.exists()) {
                File file3 = new File(file, f34275o);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m43220a(file2, file3, false);
                }
            }
            C11811f fVar = new C11811f(file, i, i2, j);
            if (fVar.f34290d.exists()) {
                try {
                    fVar.m43224i();
                    fVar.m43223h();
                    return fVar;
                } catch (IOException e) {
                    C11461g.m41885b("DiskLruCache", e, "DiskLruCache %s is corrupt, removing.", file);
                    fVar.mo31651b();
                }
            }
            file.mkdirs();
            C11811f fVar2 = new C11811f(file, i, i2, j);
            fVar2.mo31659j();
            return fVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: a */
    static String m43217a(InputStream inputStream) {
        return C11818g.m43257a((Reader) new InputStreamReader(inputStream, C11818g.f34321c));
    }

    /* renamed from: a */
    private void m43218a() {
        if (this.f34295i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo31648a(long j) {
        this.f34297k = j;
        this.f34287a.submit(this.f34299m);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f2, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo31649a(com.salesforce.marketingcloud.util.C11811f.C11814c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.salesforce.marketingcloud.util.f$d r0 = r10.f34302a     // Catch:{ all -> 0x00f9 }
            com.salesforce.marketingcloud.util.f$c r1 = r0.f34311d     // Catch:{ all -> 0x00f9 }
            if (r1 != r10) goto L_0x00f3
            r1 = 0
            if (r11 == 0) goto L_0x0045
            boolean r2 = r0.f34310c     // Catch:{ all -> 0x00f9 }
            if (r2 != 0) goto L_0x0045
            r2 = r1
        L_0x000f:
            int r3 = r9.f34289c     // Catch:{ all -> 0x00f9 }
            if (r2 >= r3) goto L_0x0045
            boolean[] r3 = r10.f34303b     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.mo31678b((int) r2)     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f9 }
            if (r3 != 0) goto L_0x0028
            r10.mo31666a()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.mo31666a()     // Catch:{ all -> 0x00f9 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r11.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00f9 }
            r11.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f9 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x0045:
            int r10 = r9.f34289c     // Catch:{ all -> 0x00f9 }
            if (r1 >= r10) goto L_0x0075
            java.io.File r10 = r0.mo31678b((int) r1)     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x006f
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x0072
            java.io.File r2 = r0.mo31676a((int) r1)     // Catch:{ all -> 0x00f9 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f34309b     // Catch:{ all -> 0x00f9 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f9 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f34309b     // Catch:{ all -> 0x00f9 }
            r10[r1] = r5     // Catch:{ all -> 0x00f9 }
            long r7 = r9.f34298l     // Catch:{ all -> 0x00f9 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f34298l = r7     // Catch:{ all -> 0x00f9 }
            goto L_0x0072
        L_0x006f:
            m43219a((java.io.File) r10)     // Catch:{ all -> 0x00f9 }
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x0045
        L_0x0075:
            int r10 = r9.f34296j     // Catch:{ all -> 0x00f9 }
            r1 = 1
            int r10 = r10 + r1
            r9.f34296j = r10     // Catch:{ all -> 0x00f9 }
            r10 = 0
            r0.f34311d = r10     // Catch:{ all -> 0x00f9 }
            boolean r10 = r0.f34310c     // Catch:{ all -> 0x00f9 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b5
            r0.f34310c = r1     // Catch:{ all -> 0x00f9 }
            java.io.Writer r10 = r9.f34295i     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r1.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = r0.f34308a     // Catch:{ all -> 0x00f9 }
            r1.append(r3)     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = r0.mo31677a()     // Catch:{ all -> 0x00f9 }
            r1.append(r3)     // Catch:{ all -> 0x00f9 }
            r1.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f9 }
            r10.write(r1)     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x00d7
            long r10 = r9.f34300n     // Catch:{ all -> 0x00f9 }
            r1 = 1
            long r1 = r1 + r10
            r9.f34300n = r1     // Catch:{ all -> 0x00f9 }
            r0.f34312e = r10     // Catch:{ all -> 0x00f9 }
            goto L_0x00d7
        L_0x00b5:
            java.util.LinkedHashMap<java.lang.String, com.salesforce.marketingcloud.util.f$d> r10 = r9.f34294h     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f34308a     // Catch:{ all -> 0x00f9 }
            r10.remove(r11)     // Catch:{ all -> 0x00f9 }
            java.io.Writer r10 = r9.f34295i     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r11.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = r0.f34308a     // Catch:{ all -> 0x00f9 }
            r11.append(r0)     // Catch:{ all -> 0x00f9 }
            r11.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f9 }
            r10.write(r11)     // Catch:{ all -> 0x00f9 }
        L_0x00d7:
            java.io.Writer r10 = r9.f34295i     // Catch:{ all -> 0x00f9 }
            r10.flush()     // Catch:{ all -> 0x00f9 }
            long r10 = r9.f34298l     // Catch:{ all -> 0x00f9 }
            long r0 = r9.f34297k     // Catch:{ all -> 0x00f9 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ea
            boolean r10 = r9.mo31658g()     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x00f1
        L_0x00ea:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f34287a     // Catch:{ all -> 0x00f9 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f34299m     // Catch:{ all -> 0x00f9 }
            r10.submit(r11)     // Catch:{ all -> 0x00f9 }
        L_0x00f1:
            monitor-exit(r9)
            return
        L_0x00f3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            r10.<init>()     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11811f.mo31649a(com.salesforce.marketingcloud.util.f$c, boolean):void");
    }

    /* renamed from: a */
    private static void m43219a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m43220a(File file, File file2, boolean z) {
        if (z) {
            m43219a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
