package pf1;

import cf1.C40407d;
import cf1.C40419j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import dg1.C40672b;
import dg1.C40677c;
import dg1.C40679d;
import dg1.C40681e;
import dg1.C40694p;
import dg1.C40707z;
import ie1.C41330k0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41523c;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41884e0;
import of1.C41917r;
import of1.C41928u;
import of1.C41931v;
import of1.C41937x;
import of1.C41944z;
import p342j$.util.DesugarTimeZone;
import wf1.C43196b;
import ze1.C43420e;

/* renamed from: pf1.d */
public abstract class C42197d {

    /* renamed from: a */
    public static final byte[] f99264a;

    /* renamed from: b */
    public static final C41928u f99265b = C41928u.f98549e.mo96945g(new String[0]);

    /* renamed from: c */
    public static final C41884e0 f99266c;

    /* renamed from: d */
    public static final C41872c0 f99267d;

    /* renamed from: e */
    private static final C40694p f99268e;

    /* renamed from: f */
    public static final TimeZone f99269f;

    /* renamed from: g */
    private static final C40419j f99270g = new C40419j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h */
    public static final boolean f99271h = false;

    /* renamed from: i */
    public static final String f99272i;

    static {
        byte[] bArr = new byte[0];
        f99264a = bArr;
        f99266c = C41884e0.C41886b.m121442d(C41884e0.f98336e, bArr, (C41937x) null, 1, (Object) null);
        f99267d = C41872c0.C41873a.m121341k(C41872c0.f98276a, bArr, (C41937x) null, 0, 0, 7, (Object) null);
        C40694p.C40695a aVar = C40694p.f96352g;
        C40681e.C40682a aVar2 = C40681e.f96327g;
        f99268e = aVar.mo94841d(aVar2.mo94820a("efbbbf"), aVar2.mo94820a("feff"), aVar2.mo94820a("fffe"), aVar2.mo94820a("0000ffff"), aVar2.mo94820a("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        C41536l.m120486f(timeZone);
        f99269f = timeZone;
        String name = C41944z.class.getName();
        C41536l.m120488h(name, "OkHttpClient::class.java.name");
        f99272i = C40440x.m117173o0(C40440x.m117172n0(name, "okhttp3."), "Client");
    }

    /* renamed from: A */
    public static /* synthetic */ int m122507A(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m122560z(str, i, i2);
    }

    /* renamed from: B */
    public static final int m122508B(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        C41536l.m120489i(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char charAt = str.charAt(i3);
                boolean z4 = false;
                if (charAt == 9 || charAt == 10) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && charAt != 12) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 && charAt != 13) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3 || charAt == ' ') {
                    z4 = true;
                }
                if (!z4) {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3 = i4;
            }
        }
        return i;
    }

    /* renamed from: C */
    public static /* synthetic */ int m122509C(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m122508B(str, i, i2);
    }

    /* renamed from: D */
    public static final int m122510D(String str, int i) {
        C41536l.m120489i(str, "<this>");
        int length = str.length();
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i = i2;
        }
        return str.length();
    }

    /* renamed from: E */
    public static final String[] m122511E(String[] strArr, String[] strArr2, Comparator comparator) {
        C41536l.m120489i(strArr, "<this>");
        C41536l.m120489i(strArr2, "other");
        C41536l.m120489i(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                String str2 = strArr2[i2];
                i2++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* renamed from: F */
    public static final boolean m122512F(Socket socket, C40679d dVar) {
        int soTimeout;
        C41536l.m120489i(socket, "<this>");
        C41536l.m120489i(dVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !dVar.mo94714Q0();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* renamed from: G */
    public static final boolean m122513G(String str) {
        C41536l.m120489i(str, "name");
        if (C40439w.m117115s(str, "Authorization", true) || C40439w.m117115s(str, "Cookie", true) || C40439w.m117115s(str, "Proxy-Authorization", true) || C40439w.m117115s(str, "Set-Cookie", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static final int m122514H(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z = false;
            }
            if (!z) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: I */
    public static final Charset m122515I(C40679d dVar, Charset charset) {
        C41536l.m120489i(dVar, "<this>");
        C41536l.m120489i(charset, "default");
        int S0 = dVar.mo94716S0(f99268e);
        if (S0 == -1) {
            return charset;
        }
        if (S0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            C41536l.m120488h(charset2, "UTF_8");
            return charset2;
        } else if (S0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            C41536l.m120488h(charset3, "UTF_16BE");
            return charset3;
        } else if (S0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            C41536l.m120488h(charset4, "UTF_16LE");
            return charset4;
        } else if (S0 == 3) {
            return C40407d.f95988a.mo94457a();
        } else {
            if (S0 == 4) {
                return C40407d.f95988a.mo94458b();
            }
            throw new AssertionError();
        }
    }

    /* renamed from: J */
    public static final int m122516J(C40679d dVar) {
        C41536l.m120489i(dVar, "<this>");
        return m122538d(dVar.readByte(), C11051p3.f31759c) | (m122538d(dVar.readByte(), C11051p3.f31759c) << 16) | (m122538d(dVar.readByte(), C11051p3.f31759c) << 8);
    }

    /* renamed from: K */
    public static final int m122517K(C40672b bVar, byte b) {
        C41536l.m120489i(bVar, "<this>");
        int i = 0;
        while (!bVar.mo94714Q0() && bVar.mo94764t(0) == b) {
            i++;
            bVar.readByte();
        }
        return i;
    }

    /* renamed from: L */
    public static final boolean m122518L(C40707z zVar, int i, TimeUnit timeUnit) {
        long j;
        C41536l.m120489i(zVar, "<this>");
        C41536l.m120489i(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (zVar.mo94678C().mo94686e()) {
            j = zVar.mo94678C().mo94684c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        zVar.mo94678C().mo94685d(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C40672b bVar = new C40672b();
            while (zVar.mo21305g(bVar, 8192) != -1) {
                bVar.mo94724a();
            }
            if (j == Long.MAX_VALUE) {
                zVar.mo94678C().mo94682a();
            } else {
                zVar.mo94678C().mo94685d(nanoTime + j);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                zVar.mo94678C().mo94682a();
            } else {
                zVar.mo94678C().mo94685d(nanoTime + j);
            }
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                zVar.mo94678C().mo94682a();
            } else {
                zVar.mo94678C().mo94685d(nanoTime + j);
            }
            throw th;
        }
    }

    /* renamed from: M */
    public static final ThreadFactory m122519M(String str, boolean z) {
        C41536l.m120489i(str, "name");
        return new C42195b(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static final Thread m122520N(String str, boolean z, Runnable runnable) {
        C41536l.m120489i(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* renamed from: O */
    public static final List m122521O(C41928u uVar) {
        C41536l.m120489i(uVar, "<this>");
        C43420e o = C43429k.m124596o(0, uVar.size());
        ArrayList arrayList = new ArrayList(C41343r.m119925u(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            int nextInt = ((C41330k0) it).nextInt();
            arrayList.add(new C43196b(uVar.mo96926c(nextInt), uVar.mo96932n(nextInt)));
        }
        return arrayList;
    }

    /* renamed from: P */
    public static final C41928u m122522P(List list) {
        C41536l.m120489i(list, "<this>");
        C41928u.C41929a aVar = new C41928u.C41929a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C43196b bVar = (C43196b) it.next();
            aVar.mo96939d(bVar.mo101747a().mo94797F(), bVar.mo101748b().mo94797F());
        }
        return aVar.mo96941f();
    }

    /* renamed from: Q */
    public static final String m122523Q(int i) {
        String hexString = Integer.toHexString(i);
        C41536l.m120488h(hexString, "toHexString(this)");
        return hexString;
    }

    /* renamed from: R */
    public static final String m122524R(long j) {
        String hexString = Long.toHexString(j);
        C41536l.m120488h(hexString, "toHexString(this)");
        return hexString;
    }

    /* renamed from: S */
    public static final String m122525S(C41931v vVar, boolean z) {
        String str;
        C41536l.m120489i(vVar, "<this>");
        if (C40440x.m117139M(vVar.mo96954i(), ":", false, 2, (Object) null)) {
            str = '[' + vVar.mo96954i() + ']';
        } else {
            str = vVar.mo96954i();
        }
        if (!z && vVar.mo96959o() == C41931v.f98552k.mo97001c(vVar.mo96964t())) {
            return str;
        }
        return str + ':' + vVar.mo96959o();
    }

    /* renamed from: T */
    public static /* synthetic */ String m122526T(C41931v vVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m122525S(vVar, z);
    }

    /* renamed from: U */
    public static final List m122527U(List list) {
        C41536l.m120489i(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(C41358y.m119991B0(list));
        C41536l.m120488h(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: V */
    public static final Map m122528V(Map map) {
        C41536l.m120489i(map, "<this>");
        if (map.isEmpty()) {
            return C41344r0.m119928j();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C41536l.m120488h(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    /* renamed from: W */
    public static final long m122529W(String str, long j) {
        C41536l.m120489i(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: X */
    public static final int m122530X(String str, int i) {
        Long l;
        if (str == null) {
            l = null;
        } else {
            try {
                l = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (l == null) {
            return i;
        }
        long longValue = l.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    /* renamed from: Y */
    public static final String m122531Y(String str, int i, int i2) {
        C41536l.m120489i(str, "<this>");
        int z = m122560z(str, i, i2);
        String substring = str.substring(z, m122508B(str, z, i2));
        C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: Z */
    public static /* synthetic */ String m122532Z(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m122531Y(str, i, i2);
    }

    /* renamed from: a0 */
    public static final Throwable m122534a0(Exception exc, List list) {
        C41536l.m120489i(exc, "<this>");
        C41536l.m120489i(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41211b.m119461a(exc, (Exception) it.next());
        }
        return exc;
    }

    /* renamed from: b0 */
    public static final void m122536b0(C40677c cVar, int i) {
        C41536l.m120489i(cVar, "<this>");
        cVar.mo94715R0((i >>> 16) & C11051p3.f31759c);
        cVar.mo94715R0((i >>> 8) & C11051p3.f31759c);
        cVar.mo94715R0(i & C11051p3.f31759c);
    }

    /* renamed from: c */
    public static final void m122537c(List list, Object obj) {
        C41536l.m120489i(list, "<this>");
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    /* renamed from: d */
    public static final int m122538d(byte b, int i) {
        return b & i;
    }

    /* renamed from: e */
    public static final int m122539e(short s, int i) {
        return s & i;
    }

    /* renamed from: f */
    public static final long m122540f(int i, long j) {
        return ((long) i) & j;
    }

    /* renamed from: g */
    public static final C41917r.C41920c m122541g(C41917r rVar) {
        C41536l.m120489i(rVar, "<this>");
        return new C42196c(rVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C41917r m122542h(C41917r rVar, C41882e eVar) {
        C41536l.m120489i(rVar, "$this_asFactory");
        C41536l.m120489i(eVar, "it");
        return rVar;
    }

    /* renamed from: i */
    public static final boolean m122543i(String str) {
        C41536l.m120489i(str, "<this>");
        return f99270g.mo94489f(str);
    }

    /* renamed from: j */
    public static final boolean m122544j(C41931v vVar, C41931v vVar2) {
        C41536l.m120489i(vVar, "<this>");
        C41536l.m120489i(vVar2, "other");
        if (!C41536l.m120484d(vVar.mo96954i(), vVar2.mo96954i()) || vVar.mo96959o() != vVar2.mo96959o() || !C41536l.m120484d(vVar.mo96964t(), vVar2.mo96964t())) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final int m122545k(String str, long j, TimeUnit timeUnit) {
        boolean z;
        boolean z2;
        boolean z3;
        C41536l.m120489i(str, "name");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z4 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (timeUnit != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (millis == 0 && i > 0) {
                        z4 = false;
                    }
                    if (z4) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(C41536l.m120497q(str, " too small.").toString());
                }
                throw new IllegalArgumentException(C41536l.m120497q(str, " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(C41536l.m120497q(str, " < 0").toString());
    }

    /* renamed from: l */
    public static final void m122546l(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public static final void m122547m(Closeable closeable) {
        C41536l.m120489i(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static final void m122548n(Socket socket) {
        C41536l.m120489i(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C41536l.m120484d(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public static final String[] m122549o(String[] strArr, String str) {
        C41536l.m120489i(strArr, "<this>");
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C41536l.m120488h(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C41333m.m119800y(strArr2)] = str;
        return strArr2;
    }

    /* renamed from: p */
    public static final int m122550p(String str, char c, int i, int i2) {
        C41536l.m120489i(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: q */
    public static final int m122551q(String str, String str2, int i, int i2) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "delimiters");
        while (i < i2) {
            int i3 = i + 1;
            if (C40440x.m117137L(str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: r */
    public static /* synthetic */ int m122552r(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m122550p(str, c, i, i2);
    }

    /* renamed from: s */
    public static final boolean m122553s(C40707z zVar, int i, TimeUnit timeUnit) {
        C41536l.m120489i(zVar, "<this>");
        C41536l.m120489i(timeUnit, "timeUnit");
        try {
            return m122518L(zVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static final String m122554t(String str, Object... objArr) {
        C41536l.m120489i(str, "format");
        C41536l.m120489i(objArr, "args");
        C41524c0 c0Var = C41524c0.f97701a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C41536l.m120488h(format, "format(locale, format, *args)");
        return format;
    }

    /* renamed from: u */
    public static final boolean m122555u(String[] strArr, String[] strArr2, Comparator comparator) {
        boolean z;
        boolean z2;
        C41536l.m120489i(strArr, "<this>");
        C41536l.m120489i(comparator, "comparator");
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr2 != null) {
            if (strArr2.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    Iterator a = C41523c.m120452a(strArr2);
                    while (true) {
                        if (a.hasNext()) {
                            if (comparator.compare(str, (String) a.next()) == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public static final long m122556v(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "<this>");
        String b = d0Var.mo96753w().mo96925b("Content-Length");
        if (b == null) {
            return -1;
        }
        return m122529W(b, -1);
    }

    /* renamed from: w */
    public static final List m122557w(Object... objArr) {
        C41536l.m120489i(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(C41341q.m119910m(Arrays.copyOf(objArr2, objArr2.length)));
        C41536l.m120488h(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: x */
    public static final int m122558x(String[] strArr, String str, Comparator comparator) {
        boolean z;
        C41536l.m120489i(strArr, "<this>");
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        C41536l.m120489i(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public static final int m122559y(String str) {
        C41536l.m120489i(str, "<this>");
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (C41536l.m120491k(charAt, 31) <= 0 || C41536l.m120491k(charAt, C11051p3.f31760d) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: z */
    public static final int m122560z(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        C41536l.m120489i(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            boolean z4 = false;
            if (charAt == 9 || charAt == 10) {
                z = true;
            } else {
                z = false;
            }
            if (!z && charAt != 12) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && charAt != 13) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 || charAt == ' ') {
                z4 = true;
            }
            if (!z4) {
                return i;
            }
            i = i3;
        }
        return i2;
    }
}
