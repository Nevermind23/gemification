package p068e9;

import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p027b9.C2184f;
import p081f9.C6173c;
import p081f9.C6188i;
import p094g9.C6285b0;
import p094g9.C6331c0;
import p133j9.C6761e;
import p133j9.C6762f;
import p146k9.C6837b;
import p159l9.C7026i;
import p172m9.C7145d;
import p203p1.C7643g;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: e9.l0 */
public class C6088l0 {

    /* renamed from: a */
    private final C6097o f18925a;

    /* renamed from: b */
    private final C6761e f18926b;

    /* renamed from: c */
    private final C6837b f18927c;

    /* renamed from: d */
    private final C6173c f18928d;

    /* renamed from: e */
    private final C6188i f18929e;

    C6088l0(C6097o oVar, C6761e eVar, C6837b bVar, C6173c cVar, C6188i iVar) {
        this.f18925a = oVar;
        this.f18926b = eVar;
        this.f18927c = bVar;
        this.f18928d = cVar;
        this.f18929e = iVar;
    }

    /* renamed from: c */
    private C6285b0.C6297e.C6304d m24323c(C6285b0.C6297e.C6304d dVar) {
        return m24324d(dVar, this.f18928d, this.f18929e);
    }

    /* renamed from: d */
    private C6285b0.C6297e.C6304d m24324d(C6285b0.C6297e.C6304d dVar, C6173c cVar, C6188i iVar) {
        C6285b0.C6297e.C6304d.C6319b g = dVar.mo20066g();
        String c = cVar.mo19746c();
        if (c != null) {
            g.mo20140d(C6285b0.C6297e.C6304d.C6322d.m25173a().mo20158b(c).mo20157a());
        } else {
            C2184f.m8346f().mo7095i("No log data to include with this event.");
        }
        List k = m24329k(iVar.mo19772e());
        List k2 = m24329k(iVar.mo19773f());
        if (!k.isEmpty() || !k2.isEmpty()) {
            g.mo20138b(dVar.mo20061b().mo20072g().mo20075c(C6331c0.m25210b(k)).mo20077e(C6331c0.m25210b(k2)).mo20073a());
        }
        return g.mo20137a();
    }

    /* renamed from: e */
    private static C6285b0.C6286a m24325e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream a = applicationExitInfo.getTraceInputStream();
            if (a != null) {
                str = m24326f(a);
            }
        } catch (IOException e) {
            C2184f f = C2184f.m8346f();
            f.mo7097k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return C6285b0.C6286a.m24949a().mo19977c(applicationExitInfo.getImportance()).mo19979e(applicationExitInfo.getProcessName()).mo19981g(applicationExitInfo.getReason()).mo19983i(applicationExitInfo.getTimestamp()).mo19978d(applicationExitInfo.getPid()).mo19980f(applicationExitInfo.getPss()).mo19982h(applicationExitInfo.getRss()).mo19984j(str).mo19975a();
    }

    /* renamed from: f */
    public static String m24326f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: g */
    public static C6088l0 m24327g(Context context, C6114w wVar, C6762f fVar, C6049a aVar, C6173c cVar, C6188i iVar, C7145d dVar, C7026i iVar2, C6052b0 b0Var) {
        return new C6088l0(new C6097o(context, wVar, aVar, dVar, iVar2), new C6761e(fVar, iVar2), C6837b.m26568b(context, iVar2, b0Var), cVar, iVar);
    }

    /* renamed from: j */
    private ApplicationExitInfo m24328j(String str, List list) {
        long q = this.f18926b.mo20785q(str);
        for (Object a : list) {
            ApplicationExitInfo a2 = C7643g.m29075a(a);
            if (a2.getTimestamp() < q) {
                return null;
            }
            if (a2.getReason() == 6) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static List m24329k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C6285b0.C6291c.m24987a().mo19988b((String) entry.getKey()).mo19989c((String) entry.getValue()).mo19987a());
        }
        Collections.sort(arrayList, new C6073j0());
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m24331p(Task task) {
        if (task.mo24873r()) {
            C6099p pVar = (C6099p) task.mo24869n();
            C2184f f = C2184f.m8346f();
            f.mo7089b("Crashlytics report successfully enqueued to DataTransport: " + pVar.mo19537d());
            File c = pVar.mo19536c();
            if (c.delete()) {
                C2184f f2 = C2184f.m8346f();
                f2.mo7089b("Deleted report file: " + c.getPath());
                return true;
            }
            C2184f f3 = C2184f.m8346f();
            f3.mo7097k("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        C2184f.m8346f().mo7098l("Crashlytics report could not be enqueued to DataTransport", task.mo24868m());
        return false;
    }

    /* renamed from: q */
    private void m24332q(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        boolean equals = str2.equals("crash");
        C6285b0.C6297e.C6304d d = this.f18925a.mo19631d(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f18926b.mo20788y(m24323c(d), str, equals);
    }

    /* renamed from: h */
    public void mo19599h(String str, List list, C6285b0.C6286a aVar) {
        C2184f.m8346f().mo7089b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6285b0.C6293d.C6295b a = ((C6117z) it.next()).mo19551a();
            if (a != null) {
                arrayList.add(a);
            }
        }
        this.f18926b.mo20783l(str, C6285b0.C6293d.m24993a().mo19993b(C6331c0.m25210b(arrayList)).mo19992a(), aVar);
    }

    /* renamed from: i */
    public void mo19600i(long j, String str) {
        this.f18926b.mo20782k(str, j);
    }

    /* renamed from: l */
    public boolean mo19601l() {
        return this.f18926b.mo20786r();
    }

    /* renamed from: n */
    public SortedSet mo19602n() {
        return this.f18926b.mo20784p();
    }

    /* renamed from: o */
    public void mo19603o(String str, long j) {
        this.f18926b.mo20789z(this.f18925a.mo19632e(str, j));
    }

    /* renamed from: r */
    public void mo19604r(Throwable th, Thread thread, String str, long j) {
        C2184f f = C2184f.m8346f();
        f.mo7095i("Persisting fatal event for session " + str);
        m24332q(th, thread, str, "crash", j, true);
    }

    /* renamed from: s */
    public void mo19605s(Throwable th, Thread thread, String str, long j) {
        C2184f f = C2184f.m8346f();
        f.mo7095i("Persisting non-fatal event for session " + str);
        m24332q(th, thread, str, "error", j, false);
    }

    /* renamed from: t */
    public void mo19606t(String str, List list, C6173c cVar, C6188i iVar) {
        ApplicationExitInfo j = m24328j(str, list);
        if (j == null) {
            C2184f f = C2184f.m8346f();
            f.mo7095i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        C6285b0.C6297e.C6304d c = this.f18925a.mo19630c(m24325e(j));
        C2184f f2 = C2184f.m8346f();
        f2.mo7089b("Persisting anr for session " + str);
        this.f18926b.mo20788y(m24324d(c, cVar, iVar), str, true);
    }

    /* renamed from: u */
    public void mo19607u() {
        this.f18926b.mo20781i();
    }

    /* renamed from: v */
    public Task mo19608v(Executor executor) {
        return mo19609w(executor, (String) null);
    }

    /* renamed from: w */
    public Task mo19609w(Executor executor, String str) {
        boolean z;
        List<C6099p> w = this.f18926b.mo20787w();
        ArrayList arrayList = new ArrayList();
        for (C6099p pVar : w) {
            if (str == null || str.equals(pVar.mo19537d())) {
                C6837b bVar = this.f18927c;
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(bVar.mo20892c(pVar, z).mo24865j(executor, new C6086k0(this)));
            }
        }
        return C9231i.m34114h(arrayList);
    }
}
