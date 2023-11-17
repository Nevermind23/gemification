package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;
import ue1.C43075l;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final C41954a f98692e = new C41954a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final byte[] f98693f = {42};

    /* renamed from: g */
    private static final List f98694g = C41339p.m119900e("*");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final PublicSuffixDatabase f98695h = new PublicSuffixDatabase();

    /* renamed from: a */
    private final AtomicBoolean f98696a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f98697b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f98698c;

    /* renamed from: d */
    private byte[] f98699d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C41954a {
        private C41954a() {
        }

        public /* synthetic */ C41954a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m121930b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int d;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = C42197d.m122538d(bArr4[i9][i12], C11051p3.f31759c);
                    }
                    d = i3 - C42197d.m122538d(bArr3[i6 + i13], C11051p3.f31759c);
                    if (d == 0) {
                        i13++;
                        i12++;
                        if (i13 == i8) {
                            break;
                        } else if (bArr4[i9].length != i12) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            i12 = -1;
                            z2 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (d >= 0) {
                    if (d <= 0) {
                        int i14 = i8 - i13;
                        int length2 = bArr4[i9].length - i12;
                        int length3 = bArr4.length;
                        for (int i15 = i9 + 1; i15 < length3; i15++) {
                            length2 += bArr4[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                Charset charset = StandardCharsets.UTF_8;
                                C41536l.m120488h(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase mo97168c() {
            return PublicSuffixDatabase.f98695h;
        }
    }

    /* renamed from: b */
    private final List m121924b(List list) {
        boolean z;
        List list2;
        String str;
        String str2;
        String str3;
        List list3;
        if (this.f98696a.get() || !this.f98696a.compareAndSet(false, true)) {
            try {
                this.f98697b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m121926e();
        }
        if (this.f98698c != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int size = list.size();
            byte[][] bArr = new byte[size][];
            for (int i = 0; i < size; i++) {
                Charset charset = StandardCharsets.UTF_8;
                C41536l.m120488h(charset, "UTF_8");
                byte[] bytes = ((String) list.get(i)).getBytes(charset);
                C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                list2 = null;
                if (i2 >= size) {
                    str = null;
                    break;
                }
                int i3 = i2 + 1;
                C41954a aVar = f98692e;
                byte[] bArr2 = this.f98698c;
                if (bArr2 == null) {
                    C41536l.m120506z("publicSuffixListBytes");
                    bArr2 = null;
                }
                String a = aVar.m121930b(bArr2, bArr, i2);
                if (a != null) {
                    str = a;
                    break;
                }
                i2 = i3;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = i4 + 1;
                    bArr3[i4] = f98693f;
                    C41954a aVar2 = f98692e;
                    byte[] bArr4 = this.f98698c;
                    if (bArr4 == null) {
                        C41536l.m120506z("publicSuffixListBytes");
                        bArr4 = null;
                    }
                    String a2 = aVar2.m121930b(bArr4, bArr3, i4);
                    if (a2 != null) {
                        str2 = a2;
                        break;
                    }
                    i4 = i5;
                }
            }
            str2 = null;
            if (str2 != null) {
                int i6 = size - 1;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        break;
                    }
                    int i8 = i7 + 1;
                    C41954a aVar3 = f98692e;
                    byte[] bArr5 = this.f98699d;
                    if (bArr5 == null) {
                        C41536l.m120506z("publicSuffixExceptionListBytes");
                        bArr5 = null;
                    }
                    str3 = aVar3.m121930b(bArr5, bArr, i7);
                    if (str3 != null) {
                        break;
                    }
                    i7 = i8;
                }
            }
            str3 = null;
            if (str3 != null) {
                return C40440x.m117181w0(C41536l.m120497q("!", str3), new char[]{'.'}, false, 0, 6, (Object) null);
            } else if (str == null && str2 == null) {
                return f98694g;
            } else {
                if (str == null) {
                    list3 = null;
                } else {
                    list3 = C40440x.m117181w0(str, new char[]{'.'}, false, 0, 6, (Object) null);
                }
                if (list3 == null) {
                    list3 = C41341q.m119907j();
                }
                if (str2 != null) {
                    list2 = C40440x.m117181w0(str2, new char[]{'.'}, false, 0, 6, (Object) null);
                }
                if (list2 == null) {
                    list2 = C41341q.m119907j();
                }
                if (list3.size() > list2.size()) {
                    return list3;
                }
                return list2;
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        se1.C42550b.m123187a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        throw r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m121925d() {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            dg1.j r1 = new dg1.j
            dg1.z r0 = dg1.C40691m.m117774f(r0)
            r1.<init>(r0)
            dg1.d r0 = dg1.C40691m.m117770b(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x0045 }
            long r1 = (long) r1     // Catch:{ all -> 0x0045 }
            byte[] r1 = r0.mo94765t0(r1)     // Catch:{ all -> 0x0045 }
            int r2 = r0.readInt()     // Catch:{ all -> 0x0045 }
            long r2 = (long) r2     // Catch:{ all -> 0x0045 }
            byte[] r2 = r0.mo94765t0(r2)     // Catch:{ all -> 0x0045 }
            he1.w r3 = he1.C41238w.f97225a     // Catch:{ all -> 0x0045 }
            r3 = 0
            se1.C42550b.m123187a(r0, r3)
            monitor-enter(r4)
            kotlin.jvm.internal.C41536l.m120486f(r1)     // Catch:{ all -> 0x0042 }
            r4.f98698c = r1     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C41536l.m120486f(r2)     // Catch:{ all -> 0x0042 }
            r4.f98699d = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.f98697b
            r0.countDown()
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r2 = move-exception
            se1.C42550b.m123187a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m121925d():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m121926e() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m121925d()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            xf1.k$a r2 = xf1.C43286k.f101052a     // Catch:{ all -> 0x000e }
            xf1.k r2 = r2.mo101988g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.mo101984j(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m121926e():void");
    }

    /* renamed from: f */
    private final List m121927f(String str) {
        List w0 = C40440x.m117181w0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (C41536l.m120484d(C41358y.m120019i0(w0), "")) {
            return C41358y.m120003S(w0, 1);
        }
        return w0;
    }

    /* renamed from: c */
    public final String mo97167c(String str) {
        int i;
        int i2;
        C41536l.m120489i(str, "domain");
        String unicode = IDN.toUnicode(str);
        C41536l.m120488h(unicode, "unicodeDomain");
        List f = m121927f(unicode);
        List b = m121924b(f);
        if (f.size() == b.size() && ((String) b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) b.get(0)).charAt(0) == '!') {
            i2 = f.size();
            i = b.size();
        } else {
            i2 = f.size();
            i = b.size() + 1;
        }
        return C40355o.m116861s(C40355o.m116853k(C41358y.m119997M(m121927f(str)), i2 - i), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
    }
}
