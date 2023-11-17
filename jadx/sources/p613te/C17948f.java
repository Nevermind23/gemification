package p613te;

import java.net.InetAddress;
import java.net.UnknownHostException;
import p613te.C17952j;

/* renamed from: te.f */
public class C17948f implements Runnable {

    /* renamed from: e */
    private static final String f51104e;

    /* renamed from: f */
    public static int f51105f = m61832a();

    /* renamed from: g */
    public static int f51106g = m61832a();

    /* renamed from: h */
    public static int f51107h = 2;

    /* renamed from: d */
    private final String f51108d;

    static {
        Class<C17948f> cls = C17948f.class;
        int a = m61832a();
        if ((a * (f51106g + a)) % f51107h != 0) {
        }
        f51104e = C17952j.m61850c(cls);
    }

    public C17948f(String str) {
        this.f51108d = str;
    }

    /* renamed from: a */
    public static int m61832a() {
        return 13;
    }

    public void run() {
        try {
            String str = f51104e;
            C17952j.C17953a.m61858c(str, C17931a.m61768c("p\u0011|\r\u000e\u0002\u0006}5Xae1|~}x\u0002{", '1', 5));
            InetAddress byName = InetAddress.getByName(this.f51108d);
            StringBuilder sb = new StringBuilder();
            sb.append(C17931a.m61768c("ox|H\t\u000b\n\u0017\t\u0016\u0015@", 'T', 2));
            sb.append(byName);
            String c = C17931a.m61768c("\u0005RVWT_[\fP]\\`]WgYY", 245, 4);
            int i = f51105f;
            if ((i * (f51106g + i)) % f51107h != 0) {
                f51105f = 1;
                f51106g = 25;
            }
            sb.append(c);
            C17952j.C17953a.m61860e(str, sb.toString());
        } catch (UnknownHostException unused) {
            C17952j.C17953a.m61858c(f51104e, C17931a.m61772g("D^eg_]\u0018;DH\u0014_a`[d^", 203, 180, 2));
        }
    }
}
