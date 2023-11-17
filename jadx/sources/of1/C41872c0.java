package of1;

import cf1.C40407d;
import dg1.C40677c;
import dg1.C40681e;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41937x;
import pf1.C42197d;

/* renamed from: of1.c0 */
public abstract class C41872c0 {

    /* renamed from: a */
    public static final C41873a f98276a = new C41873a((DefaultConstructorMarker) null);

    /* renamed from: of1.c0$a */
    public static final class C41873a {

        /* renamed from: of1.c0$a$a */
        public static final class C41874a extends C41872c0 {

            /* renamed from: b */
            final /* synthetic */ C41937x f98277b;

            /* renamed from: c */
            final /* synthetic */ File f98278c;

            C41874a(C41937x xVar, File file) {
                this.f98277b = xVar;
                this.f98278c = file;
            }

            /* renamed from: a */
            public long mo21298a() {
                return this.f98278c.length();
            }

            /* renamed from: b */
            public C41937x mo21299b() {
                return this.f98277b;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                se1.C42550b.m123187a(r0, r3);
             */
            /* renamed from: j */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo21300j(dg1.C40677c r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "sink"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    java.io.File r0 = r2.f98278c
                    dg1.z r0 = dg1.C40691m.m117773e(r0)
                    r3.mo94741l1(r0)     // Catch:{ all -> 0x0013 }
                    r3 = 0
                    se1.C42550b.m123187a(r0, r3)
                    return
                L_0x0013:
                    r3 = move-exception
                    throw r3     // Catch:{ all -> 0x0015 }
                L_0x0015:
                    r1 = move-exception
                    se1.C42550b.m123187a(r0, r3)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: of1.C41872c0.C41873a.C41874a.mo21300j(dg1.c):void");
            }
        }

        /* renamed from: of1.c0$a$b */
        public static final class C41875b extends C41872c0 {

            /* renamed from: b */
            final /* synthetic */ C41937x f98279b;

            /* renamed from: c */
            final /* synthetic */ C40681e f98280c;

            C41875b(C41937x xVar, C40681e eVar) {
                this.f98279b = xVar;
                this.f98280c = eVar;
            }

            /* renamed from: a */
            public long mo21298a() {
                return (long) this.f98280c.mo94793B();
            }

            /* renamed from: b */
            public C41937x mo21299b() {
                return this.f98279b;
            }

            /* renamed from: j */
            public void mo21300j(C40677c cVar) {
                C41536l.m120489i(cVar, "sink");
                cVar.mo94717T(this.f98280c);
            }
        }

        /* renamed from: of1.c0$a$c */
        public static final class C41876c extends C41872c0 {

            /* renamed from: b */
            final /* synthetic */ C41937x f98281b;

            /* renamed from: c */
            final /* synthetic */ int f98282c;

            /* renamed from: d */
            final /* synthetic */ byte[] f98283d;

            /* renamed from: e */
            final /* synthetic */ int f98284e;

            C41876c(C41937x xVar, int i, byte[] bArr, int i2) {
                this.f98281b = xVar;
                this.f98282c = i;
                this.f98283d = bArr;
                this.f98284e = i2;
            }

            /* renamed from: a */
            public long mo21298a() {
                return (long) this.f98282c;
            }

            /* renamed from: b */
            public C41937x mo21299b() {
                return this.f98281b;
            }

            /* renamed from: j */
            public void mo21300j(C40677c cVar) {
                C41536l.m120489i(cVar, "sink");
                cVar.mo94730e1(this.f98283d, this.f98284e, this.f98282c);
            }
        }

        private C41873a() {
        }

        public /* synthetic */ C41873a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: j */
        public static /* synthetic */ C41872c0 m121340j(C41873a aVar, C41937x xVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo96716h(xVar, bArr, i, i2);
        }

        /* renamed from: k */
        public static /* synthetic */ C41872c0 m121341k(C41873a aVar, byte[] bArr, C41937x xVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                xVar = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo96717i(bArr, xVar, i, i2);
        }

        /* renamed from: a */
        public final C41872c0 mo96709a(C40681e eVar, C41937x xVar) {
            C41536l.m120489i(eVar, "<this>");
            return new C41875b(xVar, eVar);
        }

        /* renamed from: b */
        public final C41872c0 mo96710b(File file, C41937x xVar) {
            C41536l.m120489i(file, "<this>");
            return new C41874a(xVar, file);
        }

        /* renamed from: c */
        public final C41872c0 mo96711c(String str, C41937x xVar) {
            C41536l.m120489i(str, "<this>");
            Charset charset = C40407d.f95989b;
            if (xVar != null) {
                Charset d = C41937x.m121707d(xVar, (Charset) null, 1, (Object) null);
                if (d == null) {
                    C41937x.C41938a aVar = C41937x.f98573e;
                    xVar = aVar.mo97020b(xVar + "; charset=utf-8");
                } else {
                    charset = d;
                }
            }
            byte[] bytes = str.getBytes(charset);
            C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
            return mo96717i(bytes, xVar, 0, bytes.length);
        }

        /* renamed from: d */
        public final C41872c0 mo96712d(C41937x xVar, C40681e eVar) {
            C41536l.m120489i(eVar, "content");
            return mo96709a(eVar, xVar);
        }

        /* renamed from: e */
        public final C41872c0 mo96713e(C41937x xVar, File file) {
            C41536l.m120489i(file, "file");
            return mo96710b(file, xVar);
        }

        /* renamed from: f */
        public final C41872c0 mo96714f(C41937x xVar, String str) {
            C41536l.m120489i(str, "content");
            return mo96711c(str, xVar);
        }

        /* renamed from: g */
        public final C41872c0 mo96715g(C41937x xVar, byte[] bArr) {
            C41536l.m120489i(bArr, "content");
            return m121340j(this, xVar, bArr, 0, 0, 12, (Object) null);
        }

        /* renamed from: h */
        public final C41872c0 mo96716h(C41937x xVar, byte[] bArr, int i, int i2) {
            C41536l.m120489i(bArr, "content");
            return mo96717i(bArr, xVar, i, i2);
        }

        /* renamed from: i */
        public final C41872c0 mo96717i(byte[] bArr, C41937x xVar, int i, int i2) {
            C41536l.m120489i(bArr, "<this>");
            C42197d.m122546l((long) bArr.length, (long) i, (long) i2);
            return new C41876c(xVar, i2, bArr, i);
        }
    }

    /* renamed from: c */
    public static final C41872c0 m121330c(File file, C41937x xVar) {
        return f98276a.mo96710b(file, xVar);
    }

    /* renamed from: d */
    public static final C41872c0 m121331d(C41937x xVar, C40681e eVar) {
        return f98276a.mo96712d(xVar, eVar);
    }

    /* renamed from: e */
    public static final C41872c0 m121332e(C41937x xVar, File file) {
        return f98276a.mo96713e(xVar, file);
    }

    /* renamed from: f */
    public static final C41872c0 m121333f(C41937x xVar, String str) {
        return f98276a.mo96714f(xVar, str);
    }

    /* renamed from: g */
    public static final C41872c0 m121334g(C41937x xVar, byte[] bArr) {
        return f98276a.mo96715g(xVar, bArr);
    }

    /* renamed from: a */
    public abstract long mo21298a();

    /* renamed from: b */
    public abstract C41937x mo21299b();

    /* renamed from: h */
    public boolean mo96707h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo96708i() {
        return false;
    }

    /* renamed from: j */
    public abstract void mo21300j(C40677c cVar);
}
