package p133j9;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p027b9.C2184f;
import p068e9.C6099p;
import p081f9.C6188i;
import p094g9.C6285b0;
import p094g9.C6331c0;
import p107h9.C6485h;
import p159l9.C7026i;

/* renamed from: j9.e */
public class C6761e {

    /* renamed from: d */
    private static final Charset f20309d = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final int f20310e = 15;

    /* renamed from: f */
    private static final C6485h f20311f = new C6485h();

    /* renamed from: g */
    private static final Comparator f20312g = new C6759c();

    /* renamed from: h */
    private static final FilenameFilter f20313h = new C6760d();

    /* renamed from: a */
    private final AtomicInteger f20314a = new AtomicInteger(0);

    /* renamed from: b */
    private final C6762f f20315b;

    /* renamed from: c */
    private final C7026i f20316c;

    public C6761e(C6762f fVar, C7026i iVar) {
        this.f20315b = fVar;
        this.f20316c = iVar;
    }

    /* renamed from: A */
    private static String m26316A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f20309d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: B */
    private void m26317B(File file, C6285b0.C6293d dVar, String str, C6285b0.C6286a aVar) {
        try {
            C6485h hVar = f20311f;
            m26321F(this.f20315b.mo20795g(str), hVar.mo20389G(hVar.mo20388F(m26316A(file)).mo19957o(dVar).mo19955m(aVar)));
        } catch (IOException e) {
            C2184f f = C2184f.m8346f();
            f.mo7098l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: C */
    private void m26318C(String str, long j) {
        boolean z;
        List p = this.f20315b.mo20803p(str, f20313h);
        if (p.isEmpty()) {
            C2184f.m8346f().mo7095i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p);
        ArrayList arrayList = new ArrayList();
        Iterator it = p.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File file = (File) it.next();
                try {
                    arrayList.add(f20311f.mo20390h(m26316A(file)));
                    if (z || m26335s(file.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    C2184f.m8346f().mo7098l("Could not add event to report for " + file, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            C2184f.m8346f().mo7097k("Could not parse event files for session " + str);
            return;
        }
        m26319D(this.f20315b.mo20802o(str, "report"), arrayList, j, z, C6188i.m24668j(str, this.f20315b));
    }

    /* renamed from: D */
    private void m26319D(File file, List list, long j, boolean z, String str) {
        File file2;
        try {
            C6485h hVar = f20311f;
            C6285b0 n = hVar.mo20388F(m26316A(file)).mo19958p(j, z, str).mo19956n(C6331c0.m25210b(list));
            C6285b0.C6297e k = n.mo19942k();
            if (k != null) {
                if (z) {
                    file2 = this.f20315b.mo20798j(k.mo20006h());
                } else {
                    file2 = this.f20315b.mo20800l(k.mo20006h());
                }
                m26321F(file2, hVar.mo20389G(n));
            }
        } catch (IOException e) {
            C2184f f = C2184f.m8346f();
            f.mo7098l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: E */
    private int m26320E(String str, int i) {
        List p = this.f20315b.mo20803p(str, new C6757a());
        Collections.sort(p, new C6758b());
        return m26328f(p, i);
    }

    /* renamed from: F */
    private static void m26321F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f20309d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: G */
    private static void m26322G(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f20309d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m26330h(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: e */
    private SortedSet m26327e(String str) {
        this.f20315b.mo20790b();
        SortedSet p = mo20784p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String str2 = (String) p.last();
            C2184f f = C2184f.m8346f();
            f.mo7089b("Removing session over cap: " + str2);
            this.f20315b.mo20791c(str2);
            p.remove(str2);
        }
        return p;
    }

    /* renamed from: f */
    private static int m26328f(List list, int i) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i) {
                return size;
            }
            C6762f.m26353s(file);
            size--;
        }
        return size;
    }

    /* renamed from: g */
    private void m26329g() {
        int i = this.f20316c.mo21237b().f20900a.f20912b;
        List n = m26333n();
        int size = n.size();
        if (size > i) {
            for (File delete : n.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: h */
    private static long m26330h(long j) {
        return j * 1000;
    }

    /* renamed from: j */
    private void m26331j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: m */
    private static String m26332m(int i, boolean z) {
        String str;
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        if (z) {
            str = "_";
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    /* renamed from: n */
    private List m26333n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20315b.mo20799k());
        arrayList.addAll(this.f20315b.mo20796h());
        Comparator comparator = f20312g;
        Collections.sort(arrayList, comparator);
        List m = this.f20315b.mo20801m();
        Collections.sort(m, comparator);
        arrayList.addAll(m);
        return arrayList;
    }

    /* renamed from: o */
    private static String m26334o(String str) {
        return str.substring(0, f20310e);
    }

    /* renamed from: s */
    private static boolean m26335s(String str) {
        if (!str.startsWith("event") || !str.endsWith("_")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m26336t(File file, String str) {
        if (!str.startsWith("event") || str.endsWith("_")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static int m26339x(File file, File file2) {
        return m26334o(file.getName()).compareTo(m26334o(file2.getName()));
    }

    /* renamed from: i */
    public void mo20781i() {
        m26331j(this.f20315b.mo20801m());
        m26331j(this.f20315b.mo20799k());
        m26331j(this.f20315b.mo20796h());
    }

    /* renamed from: k */
    public void mo20782k(String str, long j) {
        for (String str2 : m26327e(str)) {
            C2184f f = C2184f.m8346f();
            f.mo7095i("Finalizing report for session " + str2);
            m26318C(str2, j);
            this.f20315b.mo20791c(str2);
        }
        m26329g();
    }

    /* renamed from: l */
    public void mo20783l(String str, C6285b0.C6293d dVar, C6285b0.C6286a aVar) {
        File o = this.f20315b.mo20802o(str, "report");
        C2184f f = C2184f.m8346f();
        f.mo7089b("Writing native session report for " + str + " to file: " + o);
        m26317B(o, dVar, str, aVar);
    }

    /* renamed from: p */
    public SortedSet mo20784p() {
        return new TreeSet(this.f20315b.mo20792d()).descendingSet();
    }

    /* renamed from: q */
    public long mo20785q(String str) {
        return this.f20315b.mo20802o(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean mo20786r() {
        if (!this.f20315b.mo20801m().isEmpty() || !this.f20315b.mo20799k().isEmpty() || !this.f20315b.mo20796h().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public List mo20787w() {
        List<File> n = m26333n();
        ArrayList arrayList = new ArrayList();
        for (File file : n) {
            try {
                arrayList.add(C6099p.m24396a(f20311f.mo20388F(m26316A(file)), file.getName(), file));
            } catch (IOException e) {
                C2184f f = C2184f.m8346f();
                f.mo7098l("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void mo20788y(C6285b0.C6297e.C6304d dVar, String str, boolean z) {
        int i = this.f20316c.mo21237b().f20900a.f20911a;
        try {
            m26321F(this.f20315b.mo20802o(str, m26332m(this.f20314a.getAndIncrement(), z)), f20311f.mo20391i(dVar));
        } catch (IOException e) {
            C2184f f = C2184f.m8346f();
            f.mo7098l("Could not persist event for session " + str, e);
        }
        m26320E(str, i);
    }

    /* renamed from: z */
    public void mo20789z(C6285b0 b0Var) {
        C6285b0.C6297e k = b0Var.mo19942k();
        if (k == null) {
            C2184f.m8346f().mo7089b("Could not get session for report");
            return;
        }
        String h = k.mo20006h();
        try {
            m26321F(this.f20315b.mo20802o(h, "report"), f20311f.mo20389G(b0Var));
            m26322G(this.f20315b.mo20802o(h, "start-time"), "", k.mo20009k());
        } catch (IOException e) {
            C2184f f = C2184f.m8346f();
            f.mo7090c("Could not persist report for session " + h, e);
        }
    }
}
