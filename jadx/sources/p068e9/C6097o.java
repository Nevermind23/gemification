package p068e9;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p094g9.C6285b0;
import p094g9.C6331c0;
import p159l9.C7026i;
import p172m9.C7145d;
import p172m9.C7146e;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: e9.o */
public class C6097o {

    /* renamed from: f */
    private static final Map f18955f;

    /* renamed from: g */
    static final String f18956g = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.3.7"});

    /* renamed from: a */
    private final Context f18957a;

    /* renamed from: b */
    private final C6114w f18958b;

    /* renamed from: c */
    private final C6049a f18959c;

    /* renamed from: d */
    private final C7145d f18960d;

    /* renamed from: e */
    private final C7026i f18961e;

    static {
        HashMap hashMap = new HashMap();
        f18955f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public C6097o(Context context, C6114w wVar, C6049a aVar, C7145d dVar, C7026i iVar) {
        this.f18957a = context;
        this.f18958b = wVar;
        this.f18959c = aVar;
        this.f18960d = dVar;
        this.f18961e = iVar;
    }

    /* renamed from: a */
    private C6285b0.C6286a m24370a(C6285b0.C6286a aVar) {
        C6331c0 c0Var;
        if (!this.f18961e.mo21237b().f20901b.f20910c || this.f18959c.f18831c.size() <= 0) {
            c0Var = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C6057e eVar : this.f18959c.f18831c) {
                arrayList.add(C6285b0.C6286a.C6287a.m24959a().mo19974d(eVar.mo19550c()).mo19972b(eVar.mo19548a()).mo19973c(eVar.mo19549b()).mo19971a());
            }
            c0Var = C6331c0.m25210b(arrayList);
        }
        return C6285b0.C6286a.m24949a().mo19977c(aVar.mo19960c()).mo19979e(aVar.mo19962e()).mo19981g(aVar.mo19964g()).mo19983i(aVar.mo19966i()).mo19978d(aVar.mo19961d()).mo19980f(aVar.mo19963f()).mo19982h(aVar.mo19965h()).mo19984j(aVar.mo19967j()).mo19976b(c0Var).mo19975a();
    }

    /* renamed from: b */
    private C6285b0.C6290b m24371b() {
        return C6285b0.m24934b().mo19953i("18.3.7").mo19949e(this.f18959c.f18829a).mo19950f(this.f18958b.mo19643a()).mo19947c(this.f18959c.f18834f).mo19948d(this.f18959c.f18835g).mo19952h(4);
    }

    /* renamed from: f */
    private static int m24372f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = (Integer) f18955f.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: g */
    private C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a m24373g() {
        return C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a.m25095a().mo20090b(0).mo20092d(0).mo20091c(this.f18959c.f18833e).mo20093e(this.f18959c.f18830b).mo20089a();
    }

    /* renamed from: h */
    private C6331c0 m24374h() {
        return C6331c0.m25211c(m24373g());
    }

    /* renamed from: i */
    private C6285b0.C6297e.C6304d.C6305a m24375i(int i, C6285b0.C6286a aVar) {
        boolean z;
        if (aVar.mo19960c() != 100) {
            z = true;
        } else {
            z = false;
        }
        return C6285b0.C6297e.C6304d.C6305a.m25076a().mo20074b(Boolean.valueOf(z)).mo20078f(i).mo20076d(m24380n(aVar)).mo20073a();
    }

    /* renamed from: j */
    private C6285b0.C6297e.C6304d.C6305a m24376j(int i, C7146e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        boolean z2;
        ActivityManager.RunningAppProcessInfo j = C6063h.m24219j(this.f18959c.f18833e, this.f18957a);
        if (j != null) {
            if (j.importance != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        return C6285b0.C6297e.C6304d.C6305a.m25076a().mo20074b(bool).mo20078f(i).mo20076d(m24381o(eVar, thread, i2, i3, z)).mo20073a();
    }

    /* renamed from: k */
    private C6285b0.C6297e.C6304d.C6320c m24377k(int i) {
        Double d;
        C6055d a = C6055d.m24184a(this.f18957a);
        Float b = a.mo19546b();
        if (b != null) {
            d = Double.valueOf(b.doubleValue());
        } else {
            d = null;
        }
        int c = a.mo19547c();
        boolean p = C6063h.m24225p(this.f18957a);
        long t = C6063h.m24229t() - C6063h.m24210a(this.f18957a);
        return C6285b0.C6297e.C6304d.C6320c.m25159a().mo20150b(d).mo20151c(c).mo20154f(p).mo20153e(i).mo20155g(t).mo20152d(C6063h.m24211b(Environment.getDataDirectory().getPath())).mo20149a();
    }

    /* renamed from: l */
    private C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c m24378l(C7146e eVar, int i, int i2) {
        return m24379m(eVar, i, i2, 0);
    }

    /* renamed from: m */
    private C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c m24379m(C7146e eVar, int i, int i2, int i3) {
        String str = eVar.f21156b;
        String str2 = eVar.f21155a;
        StackTraceElement[] stackTraceElementArr = eVar.f21157c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C7146e eVar2 = eVar.f21158d;
        if (i3 >= i2) {
            C7146e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f21158d;
                i4++;
            }
        }
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.C6312a d = C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.m25113a().mo20111f(str).mo20110e(str2).mo20108c(C6331c0.m25210b(m24383q(stackTraceElementArr, i))).mo20109d(i4);
        if (eVar2 != null && i4 == 0) {
            d.mo20107b(m24379m(eVar2, i, i2, i3 + 1));
        }
        return d.mo20106a();
    }

    /* renamed from: n */
    private C6285b0.C6297e.C6304d.C6305a.C6307b m24380n(C6285b0.C6286a aVar) {
        return C6285b0.C6297e.C6304d.C6305a.C6307b.m25089a().mo20096b(aVar).mo20099e(m24388v()).mo20097c(m24374h()).mo20095a();
    }

    /* renamed from: o */
    private C6285b0.C6297e.C6304d.C6305a.C6307b m24381o(C7146e eVar, Thread thread, int i, int i2, boolean z) {
        return C6285b0.C6297e.C6304d.C6305a.C6307b.m25089a().mo20100f(m24391y(eVar, thread, i, z)).mo20098d(m24378l(eVar, i, i2)).mo20099e(m24388v()).mo20097c(m24374h()).mo20095a();
    }

    /* renamed from: p */
    private C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b m24382p(StackTraceElement stackTraceElement, C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.C6318a aVar) {
        long j;
        long j2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j = Math.max((long) stackTraceElement.getLineNumber(), 0);
        } else {
            j = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = (long) stackTraceElement.getLineNumber();
        }
        return aVar.mo20135e(j).mo20136f(str).mo20132b(fileName).mo20134d(j2).mo20131a();
    }

    /* renamed from: q */
    private C6331c0 m24383q(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement p : stackTraceElementArr) {
            arrayList.add(m24382p(p, C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.m25141a().mo20133c(i)));
        }
        return C6331c0.m25210b(arrayList);
    }

    /* renamed from: r */
    private C6285b0.C6297e.C6298a m24384r() {
        return C6285b0.C6297e.C6298a.m25021a().mo20026e(this.f18958b.mo19644f()).mo20028g(this.f18959c.f18834f).mo20025d(this.f18959c.f18835g).mo20027f(this.f18958b.mo19643a()).mo20023b(this.f18959c.f18836h.mo7087d()).mo20024c(this.f18959c.f18836h.mo7088e()).mo20022a();
    }

    /* renamed from: s */
    private C6285b0.C6297e m24385s(String str, long j) {
        return C6285b0.C6297e.m25005a().mo20040l(j).mo20037i(str).mo20035g(f18956g).mo20030b(m24384r()).mo20039k(m24387u()).mo20032d(m24386t()).mo20036h(3).mo20029a();
    }

    /* renamed from: t */
    private C6285b0.C6297e.C6302c m24386t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int f = m24372f();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long t = C6063h.m24229t();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean z = C6063h.m24235z();
        int n = C6063h.m24223n();
        String str = Build.MANUFACTURER;
        return C6285b0.C6297e.C6302c.m25049a().mo20052b(f).mo20056f(Build.MODEL).mo20053c(availableProcessors).mo20058h(t).mo20054d(blockCount).mo20059i(z).mo20060j(n).mo20055e(str).mo20057g(Build.PRODUCT).mo20051a();
    }

    /* renamed from: u */
    private C6285b0.C6297e.C6324e m24387u() {
        return C6285b0.C6297e.C6324e.m25177a().mo20166d(3).mo20167e(Build.VERSION.RELEASE).mo20164b(Build.VERSION.CODENAME).mo20165c(C6063h.m24206A()).mo20163a();
    }

    /* renamed from: v */
    private C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d m24388v() {
        return C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d.m25125a().mo20118d(BankApiResponse.SUCCESSFUL_RESPONSE_CODE).mo20117c(BankApiResponse.SUCCESSFUL_RESPONSE_CODE).mo20116b(0).mo20115a();
    }

    /* renamed from: w */
    private C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e m24389w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m24390x(thread, stackTraceElementArr, 0);
    }

    /* renamed from: x */
    private C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e m24390x(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.m25133a().mo20125d(thread.getName()).mo20124c(i).mo20123b(C6331c0.m25210b(m24383q(stackTraceElementArr, i))).mo20122a();
    }

    /* renamed from: y */
    private C6331c0 m24391y(C7146e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m24390x(thread, eVar.f21157c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(m24389w(thread2, this.f18960d.mo21397a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return C6331c0.m25210b(arrayList);
    }

    /* renamed from: c */
    public C6285b0.C6297e.C6304d mo19630c(C6285b0.C6286a aVar) {
        int i = this.f18957a.getResources().getConfiguration().orientation;
        return C6285b0.C6297e.C6304d.m25069a().mo20142f("anr").mo20141e(aVar.mo19966i()).mo20138b(m24375i(i, m24370a(aVar))).mo20139c(m24377k(i)).mo20137a();
    }

    /* renamed from: d */
    public C6285b0.C6297e.C6304d mo19631d(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f18957a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j2 = j;
        return C6285b0.C6297e.C6304d.m25069a().mo20142f(str).mo20141e(j).mo20138b(m24376j(i3, new C7146e(th, this.f18960d), thread, i, i2, z)).mo20139c(m24377k(i3)).mo20137a();
    }

    /* renamed from: e */
    public C6285b0 mo19632e(String str, long j) {
        return m24371b().mo19954j(m24385s(str, j)).mo19945a();
    }
}
