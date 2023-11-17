package p113i2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.androidnetworking.error.ANError;
import dg1.C40691m;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import of1.C41872c0;
import of1.C41877d;
import of1.C41880d0;
import of1.C41882e;
import of1.C41921s;
import of1.C41928u;
import of1.C41931v;
import of1.C41937x;
import of1.C41939y;
import of1.C41944z;
import org.json.JSONArray;
import org.json.JSONObject;
import p126j2.C6684b;
import p152l2.C6867a;
import p152l2.C6868b;
import p152l2.C6869c;
import p152l2.C6872e;
import p152l2.C6873f;
import p165m2.C7066a;
import p165m2.C7077g;
import p178n2.C7216a;
import p178n2.C7217b;
import p191o2.C7419a;
import p191o2.C7421c;

/* renamed from: i2.a */
public class C6511a {

    /* renamed from: O */
    private static final C41937x f19844O = C41937x.m121709g("application/json; charset=utf-8");

    /* renamed from: P */
    private static final C41937x f19845P = C41937x.m121709g("text/x-markdown; charset=utf-8");

    /* renamed from: Q */
    private static final Object f19846Q = new Object();

    /* renamed from: A */
    private boolean f19847A;

    /* renamed from: B */
    private int f19848B;

    /* renamed from: C */
    private C6872e f19849C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C6868b f19850D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C6873f f19851E;

    /* renamed from: F */
    private Bitmap.Config f19852F;

    /* renamed from: G */
    private int f19853G;

    /* renamed from: H */
    private int f19854H;

    /* renamed from: I */
    private ImageView.ScaleType f19855I;

    /* renamed from: J */
    private C41877d f19856J;

    /* renamed from: K */
    private Executor f19857K;

    /* renamed from: L */
    private C41944z f19858L;

    /* renamed from: M */
    private String f19859M;

    /* renamed from: N */
    private Type f19860N;

    /* renamed from: a */
    private int f19861a;

    /* renamed from: b */
    private C6524e f19862b;

    /* renamed from: c */
    private int f19863c;

    /* renamed from: d */
    private String f19864d;

    /* renamed from: e */
    private int f19865e;

    /* renamed from: f */
    private Object f19866f;

    /* renamed from: g */
    private C6525f f19867g;

    /* renamed from: h */
    private HashMap f19868h;

    /* renamed from: i */
    private HashMap f19869i;

    /* renamed from: j */
    private HashMap f19870j;

    /* renamed from: k */
    private HashMap f19871k;

    /* renamed from: l */
    private HashMap f19872l;

    /* renamed from: m */
    private HashMap f19873m;

    /* renamed from: n */
    private HashMap f19874n;

    /* renamed from: o */
    private String f19875o;

    /* renamed from: p */
    private String f19876p;

    /* renamed from: q */
    private String f19877q;

    /* renamed from: r */
    private String f19878r;

    /* renamed from: s */
    private byte[] f19879s;

    /* renamed from: t */
    private File f19880t;

    /* renamed from: u */
    private C41937x f19881u;

    /* renamed from: v */
    private Future f19882v;

    /* renamed from: w */
    private C41882e f19883w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f19884x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f19885y;

    /* renamed from: z */
    private boolean f19886z;

    /* renamed from: i2.a$a */
    class C6512a implements C6868b {
        C6512a() {
        }

        /* renamed from: a */
        public void mo20479a(long j, long j2) {
            if (C6511a.this.f19850D != null && !C6511a.this.f19885y) {
                C6511a.this.f19850D.mo20479a(j, j2);
            }
        }
    }

    /* renamed from: i2.a$b */
    class C6513b implements C6873f {
        C6513b() {
        }

        /* renamed from: a */
        public void mo20480a(long j, long j2) {
            int unused = C6511a.this.f19884x = (int) ((100 * j) / j2);
            if (C6511a.this.f19851E != null && !C6511a.this.f19885y) {
                C6511a.this.f19851E.mo20480a(j, j2);
            }
        }
    }

    /* renamed from: i2.a$c */
    class C6514c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C6521b f19889d;

        C6514c(C6521b bVar) {
            this.f19889d = bVar;
        }

        public void run() {
            C6511a.this.m25703k(this.f19889d);
        }
    }

    /* renamed from: i2.a$d */
    class C6515d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C6521b f19891d;

        C6515d(C6521b bVar) {
            this.f19891d = bVar;
        }

        public void run() {
            C6511a.this.m25703k(this.f19891d);
        }
    }

    /* renamed from: i2.a$e */
    class C6516e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C41880d0 f19893d;

        C6516e(C41880d0 d0Var) {
            this.f19893d = d0Var;
        }

        public void run() {
            C6869c unused = C6511a.this.getClass();
            C6511a.this.mo20466o();
        }
    }

    /* renamed from: i2.a$f */
    class C6517f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C41880d0 f19895d;

        C6517f(C41880d0 d0Var) {
            this.f19895d = d0Var;
        }

        public void run() {
            C6869c unused = C6511a.this.getClass();
            C6511a.this.mo20466o();
        }
    }

    /* renamed from: i2.a$g */
    static /* synthetic */ class C6518g {

        /* renamed from: a */
        static final /* synthetic */ int[] f19897a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                i2.f[] r0 = p113i2.C6525f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19897a = r0
                i2.f r1 = p113i2.C6525f.JSON_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19897a     // Catch:{ NoSuchFieldError -> 0x001d }
                i2.f r1 = p113i2.C6525f.JSON_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19897a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i2.f r1 = p113i2.C6525f.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19897a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i2.f r1 = p113i2.C6525f.BITMAP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19897a     // Catch:{ NoSuchFieldError -> 0x003e }
                i2.f r1 = p113i2.C6525f.PARSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19897a     // Catch:{ NoSuchFieldError -> 0x0049 }
                i2.f r1 = p113i2.C6525f.PREFETCH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p113i2.C6511a.C6518g.<clinit>():void");
        }
    }

    /* renamed from: i2.a$h */
    public static class C6519h {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C6524e f19898a = C6524e.MEDIUM;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f19899b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Object f19900c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public HashMap f19901d = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public HashMap f19902e = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public HashMap f19903f = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public HashMap f19904g = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: h */
        public HashMap f19905h = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C41877d f19906i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f19907j = 0;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Executor f19908k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C41944z f19909l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public String f19910m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f19911n;

        public C6519h(String str) {
            this.f19899b = str;
        }

        /* renamed from: r */
        private void m25755r(String str, C7216a aVar) {
            List list = (List) this.f19905h.get(str);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(aVar);
            this.f19905h.put(str, list);
        }

        /* renamed from: o */
        public C6519h mo20485o(String str, String str2) {
            List list = (List) this.f19901d.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f19901d.put(str, list);
            }
            if (!list.contains(str2)) {
                list.add(str2);
            }
            return this;
        }

        /* renamed from: p */
        public C6519h mo20486p(String str, File file) {
            return mo20487q(str, file, (String) null);
        }

        /* renamed from: q */
        public C6519h mo20487q(String str, File file, String str2) {
            m25755r(str, new C7216a(file, str2));
            return this;
        }

        /* renamed from: s */
        public C6519h mo20488s(String str, String str2) {
            return mo20489t(str, str2, (String) null);
        }

        /* renamed from: t */
        public C6519h mo20489t(String str, String str2, String str3) {
            this.f19904g.put(str, new C7217b(str2, str3));
            return this;
        }

        /* renamed from: u */
        public C6511a mo20490u() {
            return new C6511a(this);
        }

        /* renamed from: v */
        public C6519h mo20491v(C41944z zVar) {
            this.f19909l = zVar;
            return this;
        }

        /* renamed from: w */
        public C6519h mo20492w(C6524e eVar) {
            this.f19898a = eVar;
            return this;
        }
    }

    /* renamed from: i2.a$i */
    public static class C6520i {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C6524e f19912a = C6524e.MEDIUM;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f19913b = 1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f19914c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Object f19915d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f19916e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f19917f = null;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public byte[] f19918g = null;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public File f19919h = null;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public HashMap f19920i = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public HashMap f19921j = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public HashMap f19922k = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public HashMap f19923l = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: m */
        public HashMap f19924m = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: n */
        public C41877d f19925n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Executor f19926o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C41944z f19927p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public String f19928q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public String f19929r;

        public C6520i(String str) {
            this.f19914c = str;
            this.f19913b = 1;
        }

        /* renamed from: s */
        public C6520i mo20493s(String str, String str2) {
            this.f19921j.put(str, str2);
            return this;
        }

        /* renamed from: t */
        public C6520i mo20494t(String str, String str2) {
            List list = (List) this.f19920i.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f19920i.put(str, list);
            }
            if (!list.contains(str2)) {
                list.add(str2);
            }
            return this;
        }

        /* renamed from: u */
        public C6511a mo20495u() {
            return new C6511a(this);
        }

        /* renamed from: v */
        public C6520i mo20496v(C6524e eVar) {
            this.f19912a = eVar;
            return this;
        }
    }

    public C6511a(C6520i iVar) {
        this.f19868h = new HashMap();
        this.f19869i = new HashMap();
        this.f19870j = new HashMap();
        this.f19871k = new HashMap();
        this.f19872l = new HashMap();
        this.f19873m = new HashMap();
        this.f19874n = new HashMap();
        this.f19877q = null;
        this.f19878r = null;
        this.f19879s = null;
        this.f19880t = null;
        this.f19881u = null;
        this.f19848B = 0;
        this.f19856J = null;
        this.f19857K = null;
        this.f19858L = null;
        this.f19859M = null;
        this.f19860N = null;
        this.f19863c = 0;
        this.f19861a = iVar.f19913b;
        this.f19862b = iVar.f19912a;
        this.f19864d = iVar.f19914c;
        this.f19866f = iVar.f19915d;
        this.f19868h = iVar.f19920i;
        this.f19869i = iVar.f19921j;
        this.f19870j = iVar.f19922k;
        this.f19872l = iVar.f19923l;
        this.f19873m = iVar.f19924m;
        this.f19877q = iVar.f19916e;
        this.f19878r = iVar.f19917f;
        this.f19880t = iVar.f19919h;
        this.f19879s = iVar.f19918g;
        this.f19856J = iVar.f19925n;
        this.f19857K = iVar.f19926o;
        this.f19858L = iVar.f19927p;
        this.f19859M = iVar.f19928q;
        if (iVar.f19929r != null) {
            this.f19881u = C41937x.m121709g(iVar.f19929r);
        }
    }

    /* renamed from: h */
    private void m25702h(ANError aNError) {
        C6872e eVar = this.f19849C;
        if (eVar != null) {
            eVar.mo20947b(aNError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m25703k(C6521b bVar) {
        C6872e eVar = this.f19849C;
        if (eVar != null) {
            eVar.mo20946a((String) bVar.mo20498c());
        }
        mo20466o();
    }

    /* renamed from: A */
    public C6524e mo20443A() {
        return this.f19862b;
    }

    /* renamed from: B */
    public C41872c0 mo20444B() {
        String str = this.f19877q;
        if (str != null) {
            C41937x xVar = this.f19881u;
            if (xVar != null) {
                return C41872c0.m121333f(xVar, str);
            }
            return C41872c0.m121333f(f19844O, str);
        }
        String str2 = this.f19878r;
        if (str2 != null) {
            C41937x xVar2 = this.f19881u;
            if (xVar2 != null) {
                return C41872c0.m121333f(xVar2, str2);
            }
            return C41872c0.m121333f(f19845P, str2);
        }
        File file = this.f19880t;
        if (file != null) {
            C41937x xVar3 = this.f19881u;
            if (xVar3 != null) {
                return C41872c0.m121332e(xVar3, file);
            }
            return C41872c0.m121332e(f19845P, file);
        }
        byte[] bArr = this.f19879s;
        if (bArr != null) {
            C41937x xVar4 = this.f19881u;
            if (xVar4 != null) {
                return C41872c0.m121334g(xVar4, bArr);
            }
            return C41872c0.m121334g(f19845P, bArr);
        }
        C41921s.C41922a aVar = new C41921s.C41922a();
        try {
            for (Map.Entry entry : this.f19869i.entrySet()) {
                aVar.mo96912a((String) entry.getKey(), (String) entry.getValue());
            }
            for (Map.Entry entry2 : this.f19870j.entrySet()) {
                aVar.mo96913b((String) entry2.getKey(), (String) entry2.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aVar.mo96914c();
    }

    /* renamed from: C */
    public int mo20445C() {
        return this.f19863c;
    }

    /* renamed from: D */
    public C6525f mo20446D() {
        return this.f19867g;
    }

    /* renamed from: E */
    public int mo20447E() {
        return this.f19865e;
    }

    /* renamed from: F */
    public C6873f mo20448F() {
        return new C6513b();
    }

    /* renamed from: G */
    public String mo20449G() {
        String str = this.f19864d;
        for (Map.Entry entry : this.f19873m.entrySet()) {
            str = str.replace("{" + ((String) entry.getKey()) + "}", String.valueOf(entry.getValue()));
        }
        C41931v.C41932a k = C41931v.m121622m(str).mo96956k();
        HashMap hashMap = this.f19872l;
        if (hashMap != null) {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                List<String> list = (List) entry2.getValue();
                if (list != null) {
                    for (String b : list) {
                        k.mo96980b(str2, b);
                    }
                }
            }
        }
        return k.mo96981c().toString();
    }

    /* renamed from: H */
    public String mo20450H() {
        return this.f19859M;
    }

    /* renamed from: I */
    public ANError mo20451I(ANError aNError) {
        try {
            if (!(aNError.mo7642b() == null || aNError.mo7642b().mo96739a() == null || aNError.mo7642b().mo96739a().mo21304t() == null)) {
                aNError.mo7644d(C40691m.m117770b(aNError.mo7642b().mo96739a().mo21304t()).mo94746o1());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aNError;
    }

    /* renamed from: J */
    public C6521b mo20452J(C41880d0 d0Var) {
        C6521b b;
        switch (C6518g.f19897a[this.f19867g.ordinal()]) {
            case 1:
                try {
                    return C6521b.m25787f(new JSONArray(C40691m.m117770b(d0Var.mo96739a().mo21304t()).mo94746o1()));
                } catch (Exception e) {
                    return C6521b.m25786a(C7421c.m28234e(new ANError((Throwable) e)));
                }
            case 2:
                try {
                    return C6521b.m25787f(new JSONObject(C40691m.m117770b(d0Var.mo96739a().mo21304t()).mo94746o1()));
                } catch (Exception e2) {
                    return C6521b.m25786a(C7421c.m28234e(new ANError((Throwable) e2)));
                }
            case 3:
                try {
                    return C6521b.m25787f(C40691m.m117770b(d0Var.mo96739a().mo21304t()).mo94746o1());
                } catch (Exception e3) {
                    return C6521b.m25786a(C7421c.m28234e(new ANError((Throwable) e3)));
                }
            case 4:
                synchronized (f19846Q) {
                    try {
                        b = C7421c.m28231b(d0Var, this.f19853G, this.f19854H, this.f19852F, this.f19855I);
                    } catch (Exception e4) {
                        return C6521b.m25786a(C7421c.m28234e(new ANError((Throwable) e4)));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return b;
            case 5:
                try {
                    return C6521b.m25787f(C7419a.m28228a().mo20822a(this.f19860N).mo20823a(d0Var.mo96739a()));
                } catch (Exception e5) {
                    return C6521b.m25786a(C7421c.m28234e(new ANError((Throwable) e5)));
                }
            case 6:
                try {
                    C40691m.m117770b(d0Var.mo96739a().mo21304t()).skip(Long.MAX_VALUE);
                    return C6521b.m25787f("prefetch");
                } catch (Exception e6) {
                    return C6521b.m25786a(C7421c.m28234e(new ANError((Throwable) e6)));
                }
            default:
                return null;
        }
    }

    /* renamed from: K */
    public void mo20453K(C41882e eVar) {
        this.f19883w = eVar;
    }

    /* renamed from: L */
    public void mo20454L(Future future) {
        this.f19882v = future;
    }

    /* renamed from: M */
    public void mo20455M(boolean z) {
        this.f19847A = z;
    }

    /* renamed from: N */
    public void mo20456N(int i) {
        this.f19865e = i;
    }

    /* renamed from: O */
    public C6511a mo20457O(C6873f fVar) {
        this.f19851E = fVar;
        return this;
    }

    /* renamed from: P */
    public void mo20458P(String str) {
        this.f19859M = str;
    }

    /* renamed from: Q */
    public void mo20459Q() {
        this.f19886z = true;
        mo20466o();
    }

    /* renamed from: g */
    public synchronized void mo20460g(ANError aNError) {
        try {
            if (!this.f19886z) {
                if (this.f19885y) {
                    aNError.mo7643c();
                    aNError.mo7645e(0);
                }
                m25702h(aNError);
            }
            this.f19886z = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: i */
    public void mo20461i(C41880d0 d0Var) {
        try {
            this.f19886z = true;
            if (!this.f19885y) {
                Executor executor = this.f19857K;
                if (executor != null) {
                    executor.execute(new C6516e(d0Var));
                } else {
                    C6684b.m26121b().mo20675a().mo20676a().execute(new C6517f(d0Var));
                }
            } else {
                ANError aNError = new ANError();
                aNError.mo7643c();
                aNError.mo7645e(0);
                mo20466o();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public void mo20462j(C6521b bVar) {
        try {
            this.f19886z = true;
            if (!this.f19885y) {
                Executor executor = this.f19857K;
                if (executor != null) {
                    executor.execute(new C6514c(bVar));
                } else {
                    C6684b.m26121b().mo20675a().mo20676a().execute(new C6515d(bVar));
                }
            } else {
                ANError aNError = new ANError();
                aNError.mo7643c();
                aNError.mo7645e(0);
                m25702h(aNError);
                mo20466o();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: l */
    public void mo20463l() {
        this.f19849C = null;
        this.f19850D = null;
        this.f19851E = null;
    }

    /* renamed from: m */
    public C6521b mo20464m() {
        this.f19867g = C6525f.JSON_OBJECT;
        return C7077g.m27353a(this);
    }

    /* renamed from: n */
    public C6521b mo20465n() {
        this.f19867g = C6525f.STRING;
        return C7077g.m27353a(this);
    }

    /* renamed from: o */
    public void mo20466o() {
        mo20463l();
        C7066a.m27323c().mo21291b(this);
    }

    /* renamed from: p */
    public C6867a mo20467p() {
        return null;
    }

    /* renamed from: q */
    public void mo20468q(C6872e eVar) {
        this.f19867g = C6525f.STRING;
        this.f19849C = eVar;
        C7066a.m27323c().mo21290a(this);
    }

    /* renamed from: r */
    public C41877d mo20469r() {
        return this.f19856J;
    }

    /* renamed from: s */
    public C41882e mo20470s() {
        return this.f19883w;
    }

    /* renamed from: t */
    public String mo20471t() {
        return this.f19875o;
    }

    public String toString() {
        return "ANRequest{sequenceNumber='" + this.f19865e + ", mMethod=" + this.f19861a + ", mPriority=" + this.f19862b + ", mRequestType=" + this.f19863c + ", mUrl=" + this.f19864d + '}';
    }

    /* renamed from: u */
    public C6868b mo20473u() {
        return new C6512a();
    }

    /* renamed from: v */
    public String mo20474v() {
        return this.f19876p;
    }

    /* renamed from: w */
    public C41928u mo20475w() {
        C41928u.C41929a aVar = new C41928u.C41929a();
        try {
            HashMap hashMap = this.f19868h;
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List<String> list = (List) entry.getValue();
                    if (list != null) {
                        for (String a : list) {
                            aVar.mo96936a(str, a);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aVar.mo96941f();
    }

    /* renamed from: x */
    public int mo20476x() {
        return this.f19861a;
    }

    /* renamed from: y */
    public C41872c0 mo20477y() {
        C41937x xVar;
        C41937x xVar2;
        C41939y.C41940a aVar = new C41939y.C41940a();
        C41937x xVar3 = this.f19881u;
        if (xVar3 == null) {
            xVar3 = C41939y.f98585l;
        }
        C41939y.C41940a e = aVar.mo97026e(xVar3);
        try {
            for (Map.Entry entry : this.f19871k.entrySet()) {
                C7217b bVar = (C7217b) entry.getValue();
                String str = bVar.f21387b;
                if (str != null) {
                    xVar2 = C41937x.m121709g(str);
                } else {
                    xVar2 = null;
                }
                e.mo97023b(C41928u.m121597l("Content-Disposition", "form-data; name=\"" + ((String) entry.getKey()) + "\""), C41872c0.m121333f(xVar2, bVar.f21386a));
            }
            for (Map.Entry entry2 : this.f19874n.entrySet()) {
                for (C7216a aVar2 : (List) entry2.getValue()) {
                    String name = aVar2.f21384a.getName();
                    String str2 = aVar2.f21385b;
                    if (str2 != null) {
                        xVar = C41937x.m121709g(str2);
                    } else {
                        xVar = C41937x.m121709g(C7421c.m28236g(name));
                    }
                    C41872c0 e2 = C41872c0.m121332e(xVar, aVar2.f21384a);
                    e.mo97023b(C41928u.m121597l("Content-Disposition", "form-data; name=\"" + ((String) entry2.getKey()) + "\"; filename=\"" + name + "\""), e2);
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return e.mo97025d();
    }

    /* renamed from: z */
    public C41944z mo20478z() {
        return this.f19858L;
    }

    public C6511a(C6519h hVar) {
        this.f19868h = new HashMap();
        this.f19869i = new HashMap();
        this.f19870j = new HashMap();
        this.f19871k = new HashMap();
        this.f19872l = new HashMap();
        this.f19873m = new HashMap();
        this.f19874n = new HashMap();
        this.f19877q = null;
        this.f19878r = null;
        this.f19879s = null;
        this.f19880t = null;
        this.f19881u = null;
        this.f19848B = 0;
        this.f19856J = null;
        this.f19857K = null;
        this.f19858L = null;
        this.f19859M = null;
        this.f19860N = null;
        this.f19863c = 2;
        this.f19861a = 1;
        this.f19862b = hVar.f19898a;
        this.f19864d = hVar.f19899b;
        this.f19866f = hVar.f19900c;
        this.f19868h = hVar.f19901d;
        this.f19872l = hVar.f19902e;
        this.f19873m = hVar.f19903f;
        this.f19871k = hVar.f19904g;
        this.f19874n = hVar.f19905h;
        this.f19856J = hVar.f19906i;
        this.f19848B = hVar.f19907j;
        this.f19857K = hVar.f19908k;
        this.f19858L = hVar.f19909l;
        this.f19859M = hVar.f19910m;
        if (hVar.f19911n != null) {
            this.f19881u = C41937x.m121709g(hVar.f19911n);
        }
    }
}
