package of1;

import cf1.C40407d;
import dg1.C40672b;
import dg1.C40679d;
import he1.C41238w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;

/* renamed from: of1.e0 */
public abstract class C41884e0 implements Closeable {

    /* renamed from: e */
    public static final C41886b f98336e = new C41886b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private Reader f98337d;

    /* renamed from: of1.e0$a */
    public static final class C41885a extends Reader {

        /* renamed from: d */
        private final C40679d f98338d;

        /* renamed from: e */
        private final Charset f98339e;

        /* renamed from: f */
        private boolean f98340f;

        /* renamed from: g */
        private Reader f98341g;

        public C41885a(C40679d dVar, Charset charset) {
            C41536l.m120489i(dVar, "source");
            C41536l.m120489i(charset, "charset");
            this.f98338d = dVar;
            this.f98339e = charset;
        }

        public void close() {
            C41238w wVar;
            this.f98340f = true;
            Reader reader = this.f98341g;
            if (reader == null) {
                wVar = null;
            } else {
                reader.close();
                wVar = C41238w.f97225a;
            }
            if (wVar == null) {
                this.f98338d.close();
            }
        }

        public int read(char[] cArr, int i, int i2) {
            C41536l.m120489i(cArr, "cbuf");
            if (!this.f98340f) {
                Reader reader = this.f98341g;
                if (reader == null) {
                    reader = new InputStreamReader(this.f98338d.mo94698E1(), C42197d.m122515I(this.f98338d, this.f98339e));
                    this.f98341g = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: of1.e0$b */
    public static final class C41886b {

        /* renamed from: of1.e0$b$a */
        public static final class C41887a extends C41884e0 {

            /* renamed from: f */
            final /* synthetic */ C41937x f98342f;

            /* renamed from: g */
            final /* synthetic */ long f98343g;

            /* renamed from: h */
            final /* synthetic */ C40679d f98344h;

            C41887a(C41937x xVar, long j, C40679d dVar) {
                this.f98342f = xVar;
                this.f98343g = j;
                this.f98344h = dVar;
            }

            /* renamed from: o */
            public long mo21302o() {
                return this.f98343g;
            }

            /* renamed from: q */
            public C41937x mo21303q() {
                return this.f98342f;
            }

            /* renamed from: t */
            public C40679d mo21304t() {
                return this.f98344h;
            }
        }

        private C41886b() {
        }

        public /* synthetic */ C41886b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C41884e0 m121442d(C41886b bVar, byte[] bArr, C41937x xVar, int i, Object obj) {
            if ((i & 1) != 0) {
                xVar = null;
            }
            return bVar.mo96799c(bArr, xVar);
        }

        /* renamed from: a */
        public final C41884e0 mo96797a(C40679d dVar, C41937x xVar, long j) {
            C41536l.m120489i(dVar, "<this>");
            return new C41887a(xVar, j, dVar);
        }

        /* renamed from: b */
        public final C41884e0 mo96798b(C41937x xVar, long j, C40679d dVar) {
            C41536l.m120489i(dVar, "content");
            return mo96797a(dVar, xVar, j);
        }

        /* renamed from: c */
        public final C41884e0 mo96799c(byte[] bArr, C41937x xVar) {
            C41536l.m120489i(bArr, "<this>");
            return mo96797a(new C40672b().mo94770w0(bArr), xVar, (long) bArr.length);
        }
    }

    /* renamed from: n */
    private final Charset m121435n() {
        C41937x q = mo21303q();
        Charset c = q == null ? null : q.mo97012c(C40407d.f95989b);
        return c == null ? C40407d.f95989b : c;
    }

    /* renamed from: s */
    public static final C41884e0 m121436s(C41937x xVar, long j, C40679d dVar) {
        return f98336e.mo96798b(xVar, j, dVar);
    }

    /* renamed from: a */
    public final InputStream mo96792a() {
        return mo21304t().mo94698E1();
    }

    public void close() {
        C42197d.m122547m(mo21304t());
    }

    /* renamed from: k */
    public final Reader mo96794k() {
        Reader reader = this.f98337d;
        if (reader != null) {
            return reader;
        }
        C41885a aVar = new C41885a(mo21304t(), m121435n());
        this.f98337d = aVar;
        return aVar;
    }

    /* renamed from: o */
    public abstract long mo21302o();

    /* renamed from: q */
    public abstract C41937x mo21303q();

    /* renamed from: t */
    public abstract C40679d mo21304t();
}
