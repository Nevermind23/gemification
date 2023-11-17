package rf1;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41869b0;
import of1.C41877d;
import of1.C41880d0;
import of1.C41928u;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import pf1.C42197d;
import uf1.C43089c;

/* renamed from: rf1.b */
public final class C42370b {

    /* renamed from: c */
    public static final C42371a f99611c = new C42371a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C41869b0 f99612a;

    /* renamed from: b */
    private final C41880d0 f99613b;

    /* renamed from: rf1.b$a */
    public static final class C42371a {
        private C42371a() {
        }

        public /* synthetic */ C42371a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo97821a(C41880d0 d0Var, C41869b0 b0Var) {
            C41536l.m120489i(d0Var, "response");
            C41536l.m120489i(b0Var, "request");
            int q = d0Var.mo96747q();
            if (!(q == 200 || q == 410 || q == 414 || q == 501 || q == 203 || q == 204)) {
                if (q != 307) {
                    if (!(q == 308 || q == 404 || q == 405)) {
                        switch (q) {
                            case BogInputLayout.INPUT_TYPE_TEXT_PASSWORD:
                            case BogInputLayout.INPUT_TYPE_NUM_PASSWORD:
                                break;
                            case BogInputLayout.INPUT_TYPE_NUM_REAL:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C41880d0.m121379v(d0Var, "Expires", (String) null, 2, (Object) null) == null && d0Var.mo96744k().mo96721d() == -1 && !d0Var.mo96744k().mo96720c() && !d0Var.mo96744k().mo96719b()) {
                    return false;
                }
            }
            if (d0Var.mo96744k().mo96726i() || b0Var.mo96673b().mo96726i()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: rf1.b$b */
    public static final class C42372b {

        /* renamed from: a */
        private final long f99614a;

        /* renamed from: b */
        private final C41869b0 f99615b;

        /* renamed from: c */
        private final C41880d0 f99616c;

        /* renamed from: d */
        private Date f99617d;

        /* renamed from: e */
        private String f99618e;

        /* renamed from: f */
        private Date f99619f;

        /* renamed from: g */
        private String f99620g;

        /* renamed from: h */
        private Date f99621h;

        /* renamed from: i */
        private long f99622i;

        /* renamed from: j */
        private long f99623j;

        /* renamed from: k */
        private String f99624k;

        /* renamed from: l */
        private int f99625l = -1;

        public C42372b(long j, C41869b0 b0Var, C41880d0 d0Var) {
            C41536l.m120489i(b0Var, "request");
            this.f99614a = j;
            this.f99615b = b0Var;
            this.f99616c = d0Var;
            if (d0Var != null) {
                this.f99622i = d0Var.mo96743f0();
                this.f99623j = d0Var.mo96740a0();
                C41928u w = d0Var.mo96753w();
                int size = w.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    String c = w.mo96926c(i);
                    String n = w.mo96932n(i);
                    if (C40439w.m117115s(c, "Date", true)) {
                        this.f99617d = C43089c.m123628a(n);
                        this.f99618e = n;
                    } else if (C40439w.m117115s(c, "Expires", true)) {
                        this.f99621h = C43089c.m123628a(n);
                    } else if (C40439w.m117115s(c, "Last-Modified", true)) {
                        this.f99619f = C43089c.m123628a(n);
                        this.f99620g = n;
                    } else if (C40439w.m117115s(c, "ETag", true)) {
                        this.f99624k = n;
                    } else if (C40439w.m117115s(c, "Age", true)) {
                        this.f99625l = C42197d.m122530X(n, -1);
                    }
                    i = i2;
                }
            }
        }

        /* renamed from: a */
        private final long m122892a() {
            Date date = this.f99617d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f99623j - date.getTime());
            }
            int i = this.f99625l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f99623j;
            return j + (j2 - this.f99622i) + (this.f99614a - j2);
        }

        /* renamed from: c */
        private final C42370b m122893c() {
            long j;
            String str;
            if (this.f99616c == null) {
                return new C42370b(this.f99615b, (C41880d0) null);
            }
            if (this.f99615b.mo96677f() && this.f99616c.mo96749t() == null) {
                return new C42370b(this.f99615b, (C41880d0) null);
            }
            if (!C42370b.f99611c.mo97821a(this.f99616c, this.f99615b)) {
                return new C42370b(this.f99615b, (C41880d0) null);
            }
            C41877d b = this.f99615b.mo96673b();
            if (b.mo96725h() || m122895e(this.f99615b)) {
                return new C42370b(this.f99615b, (C41880d0) null);
            }
            C41877d k = this.f99616c.mo96744k();
            long a = m122892a();
            long d = m122894d();
            if (b.mo96721d() != -1) {
                d = Math.min(d, TimeUnit.SECONDS.toMillis((long) b.mo96721d()));
            }
            long j2 = 0;
            if (b.mo96723f() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo96723f());
            } else {
                j = 0;
            }
            if (!k.mo96724g() && b.mo96722e() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b.mo96722e());
            }
            if (!k.mo96725h()) {
                long j3 = j + a;
                if (j3 < j2 + d) {
                    C41880d0.C41881a Q = this.f99616c.mo96736Q();
                    if (j3 >= d) {
                        Q.mo96762a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m122896f()) {
                        Q.mo96762a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C42370b((C41869b0) null, Q.mo96764c());
                }
            }
            String str2 = this.f99624k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f99619f != null) {
                    str2 = this.f99620g;
                } else if (this.f99617d == null) {
                    return new C42370b(this.f99615b, (C41880d0) null);
                } else {
                    str2 = this.f99618e;
                }
                str = "If-Modified-Since";
            }
            C41928u.C41929a j4 = this.f99615b.mo96676e().mo96931j();
            C41536l.m120486f(str2);
            j4.mo96939d(str, str2);
            return new C42370b(this.f99615b.mo96679h().mo96692j(j4.mo96941f()).mo96684b(), this.f99616c);
        }

        /* renamed from: d */
        private final long m122894d() {
            long j;
            long j2;
            C41880d0 d0Var = this.f99616c;
            C41536l.m120486f(d0Var);
            C41877d k = d0Var.mo96744k();
            if (k.mo96721d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) k.mo96721d());
            }
            Date date = this.f99621h;
            Long l = null;
            if (date != null) {
                Date date2 = this.f99617d;
                if (date2 != null) {
                    l = Long.valueOf(date2.getTime());
                }
                if (l == null) {
                    j2 = this.f99623j;
                } else {
                    j2 = l.longValue();
                }
                long time = date.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f99619f == null || this.f99616c.mo96742e0().mo96681j().mo96960p() != null) {
                return 0;
            } else {
                Date date3 = this.f99617d;
                if (date3 != null) {
                    l = Long.valueOf(date3.getTime());
                }
                if (l == null) {
                    j = this.f99622i;
                } else {
                    j = l.longValue();
                }
                Date date4 = this.f99619f;
                C41536l.m120486f(date4);
                long time2 = j - date4.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
                return 0;
            }
        }

        /* renamed from: e */
        private final boolean m122895e(C41869b0 b0Var) {
            if (b0Var.mo96675d("If-Modified-Since") == null && b0Var.mo96675d("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private final boolean m122896f() {
            C41880d0 d0Var = this.f99616c;
            C41536l.m120486f(d0Var);
            return d0Var.mo96744k().mo96721d() == -1 && this.f99621h == null;
        }

        /* renamed from: b */
        public final C42370b mo97822b() {
            C42370b c = m122893c();
            if (c.mo97820b() == null || !this.f99615b.mo96673b().mo96728k()) {
                return c;
            }
            return new C42370b((C41869b0) null, (C41880d0) null);
        }
    }

    public C42370b(C41869b0 b0Var, C41880d0 d0Var) {
        this.f99612a = b0Var;
        this.f99613b = d0Var;
    }

    /* renamed from: a */
    public final C41880d0 mo97819a() {
        return this.f99613b;
    }

    /* renamed from: b */
    public final C41869b0 mo97820b() {
        return this.f99612a;
    }
}
