package p267u0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p318y0.C9006k;
import p318y0.C9007l;

/* renamed from: u0.a0 */
public final class C8438a0 implements C9007l, C9006k {

    /* renamed from: l */
    public static final C8439a f23990l = new C8439a((DefaultConstructorMarker) null);

    /* renamed from: m */
    public static final TreeMap f23991m = new TreeMap();

    /* renamed from: d */
    private final int f23992d;

    /* renamed from: e */
    private volatile String f23993e;

    /* renamed from: f */
    public final long[] f23994f;

    /* renamed from: g */
    public final double[] f23995g;

    /* renamed from: h */
    public final String[] f23996h;

    /* renamed from: i */
    public final byte[][] f23997i;

    /* renamed from: j */
    private final int[] f23998j;

    /* renamed from: k */
    private int f23999k;

    /* renamed from: u0.a0$a */
    public static final class C8439a {
        private C8439a() {
        }

        public /* synthetic */ C8439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C8438a0 mo23629a(String str, int i) {
            C41536l.m120489i(str, "query");
            TreeMap treeMap = C8438a0.f23991m;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    C8438a0 a0Var = (C8438a0) ceilingEntry.getValue();
                    a0Var.mo23626m(str, i);
                    C41536l.m120488h(a0Var, "sqliteQuery");
                    return a0Var;
                }
                C41238w wVar = C41238w.f97225a;
                C8438a0 a0Var2 = new C8438a0(i, (DefaultConstructorMarker) null);
                a0Var2.mo23626m(str, i);
                return a0Var2;
            }
        }

        /* renamed from: b */
        public final void mo23630b() {
            TreeMap treeMap = C8438a0.f23991m;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                C41536l.m120488h(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public /* synthetic */ C8438a0(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* renamed from: d */
    public static final C8438a0 m31651d(String str, int i) {
        return f23990l.mo23629a(str, i);
    }

    /* renamed from: X0 */
    public void mo23618X0(int i, byte[] bArr) {
        C41536l.m120489i(bArr, C11755a.C11756a.f34100b);
        this.f23998j[i] = 5;
        this.f23997i[i] = bArr;
    }

    /* renamed from: a */
    public String mo23619a() {
        String str = this.f23993e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: b */
    public void mo23620b(int i, double d) {
        this.f23998j[i] = 3;
        this.f23995g[i] = d;
    }

    /* renamed from: c */
    public void mo23621c(C9006k kVar) {
        C41536l.m120489i(kVar, "statement");
        int k = mo23625k();
        if (1 <= k) {
            int i = 1;
            while (true) {
                int i2 = this.f23998j[i];
                if (i2 == 1) {
                    kVar.mo23624j1(i);
                } else if (i2 == 2) {
                    kVar.mo23628r(i, this.f23994f[i]);
                } else if (i2 == 3) {
                    kVar.mo23620b(i, this.f23995g[i]);
                } else if (i2 == 4) {
                    String str = this.f23996h[i];
                    if (str != null) {
                        kVar.mo23623j(i, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (i2 == 5) {
                    byte[] bArr = this.f23997i[i];
                    if (bArr != null) {
                        kVar.mo23618X0(i, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (i != k) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void close() {
    }

    /* renamed from: j */
    public void mo23623j(int i, String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f23998j[i] = 4;
        this.f23996h[i] = str;
    }

    /* renamed from: j1 */
    public void mo23624j1(int i) {
        this.f23998j[i] = 1;
    }

    /* renamed from: k */
    public int mo23625k() {
        return this.f23999k;
    }

    /* renamed from: m */
    public final void mo23626m(String str, int i) {
        C41536l.m120489i(str, "query");
        this.f23993e = str;
        this.f23999k = i;
    }

    /* renamed from: n */
    public final void mo23627n() {
        TreeMap treeMap = f23991m;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f23992d), this);
            f23990l.mo23630b();
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: r */
    public void mo23628r(int i, long j) {
        this.f23998j[i] = 2;
        this.f23994f[i] = j;
    }

    private C8438a0(int i) {
        this.f23992d = i;
        int i2 = i + 1;
        this.f23998j = new int[i2];
        this.f23994f = new long[i2];
        this.f23995g = new double[i2];
        this.f23996h = new String[i2];
        this.f23997i = new byte[i2][];
    }
}
