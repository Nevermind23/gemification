package wf1;

import com.salesforce.marketingcloud.C11398b;
import dg1.C40669a0;
import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import dg1.C40707z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;
import wf1.C43198c;
import ze1.C43417c;

/* renamed from: wf1.g */
public final class C43223g implements Closeable {

    /* renamed from: h */
    public static final C43224a f100914h = new C43224a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Logger f100915i;

    /* renamed from: d */
    private final C40679d f100916d;

    /* renamed from: e */
    private final boolean f100917e;

    /* renamed from: f */
    private final C43225b f100918f;

    /* renamed from: g */
    private final C43198c.C43199a f100919g;

    /* renamed from: wf1.g$a */
    public static final class C43224a {
        private C43224a() {
        }

        public /* synthetic */ C43224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger mo101840a() {
            return C43223g.f100915i;
        }

        /* renamed from: b */
        public final int mo101841b(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    /* renamed from: wf1.g$b */
    public static final class C43225b implements C40707z {

        /* renamed from: d */
        private final C40679d f100920d;

        /* renamed from: e */
        private int f100921e;

        /* renamed from: f */
        private int f100922f;

        /* renamed from: g */
        private int f100923g;

        /* renamed from: h */
        private int f100924h;

        /* renamed from: i */
        private int f100925i;

        public C43225b(C40679d dVar) {
            C41536l.m120489i(dVar, "source");
            this.f100920d = dVar;
        }

        /* renamed from: k */
        private final void m124062k() {
            int i = this.f100923g;
            int J = C42197d.m122516J(this.f100920d);
            this.f100924h = J;
            this.f100921e = J;
            int d = C42197d.m122538d(this.f100920d.readByte(), C11051p3.f31759c);
            this.f100922f = C42197d.m122538d(this.f100920d.readByte(), C11051p3.f31759c);
            C43224a aVar = C43223g.f100914h;
            if (aVar.mo101840a().isLoggable(Level.FINE)) {
                aVar.mo101840a().fine(C43201d.f100800a.mo101765c(true, this.f100923g, this.f100921e, d, this.f100922f));
            }
            int readInt = this.f100920d.readInt() & Integer.MAX_VALUE;
            this.f100923g = readInt;
            if (d != 9) {
                throw new IOException(d + " != TYPE_CONTINUATION");
            } else if (readInt != i) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        /* renamed from: C */
        public C40669a0 mo94678C() {
            return this.f100920d.mo94678C();
        }

        /* renamed from: a */
        public final int mo101842a() {
            return this.f100924h;
        }

        public void close() {
        }

        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "sink");
            while (true) {
                int i = this.f100924h;
                if (i == 0) {
                    this.f100920d.skip((long) this.f100925i);
                    this.f100925i = 0;
                    if ((this.f100922f & 4) != 0) {
                        return -1;
                    }
                    m124062k();
                } else {
                    long g = this.f100920d.mo21305g(bVar, Math.min(j, (long) i));
                    if (g == -1) {
                        return -1;
                    }
                    this.f100924h -= (int) g;
                    return g;
                }
            }
        }

        /* renamed from: m */
        public final void mo101843m(int i) {
            this.f100922f = i;
        }

        /* renamed from: n */
        public final void mo101844n(int i) {
            this.f100924h = i;
        }

        /* renamed from: o */
        public final void mo101845o(int i) {
            this.f100921e = i;
        }

        /* renamed from: p */
        public final void mo101846p(int i) {
            this.f100925i = i;
        }

        /* renamed from: q */
        public final void mo101847q(int i) {
            this.f100923g = i;
        }
    }

    /* renamed from: wf1.g$c */
    public interface C43226c {
        /* renamed from: a */
        void mo101823a(int i, C43194a aVar, C40681e eVar);

        /* renamed from: b */
        void mo101824b(boolean z, int i, int i2, List list);

        /* renamed from: c */
        void mo101825c(int i, long j);

        /* renamed from: d */
        void mo101826d(int i, C43194a aVar);

        /* renamed from: e */
        void mo101827e(int i, int i2, List list);

        /* renamed from: f */
        void mo101828f();

        /* renamed from: g */
        void mo101829g(boolean z, int i, C40679d dVar, int i2);

        /* renamed from: h */
        void mo101830h(boolean z, int i, int i2);

        /* renamed from: i */
        void mo101831i(int i, int i2, int i3, boolean z);

        /* renamed from: j */
        void mo101832j(boolean z, C43239l lVar);
    }

    static {
        Logger logger = Logger.getLogger(C43201d.class.getName());
        C41536l.m120488h(logger, "getLogger(Http2::class.java.name)");
        f100915i = logger;
    }

    public C43223g(C40679d dVar, boolean z) {
        C41536l.m120489i(dVar, "source");
        this.f100916d = dVar;
        this.f100917e = z;
        C43225b bVar = new C43225b(dVar);
        this.f100918f = bVar;
        this.f100919g = new C43198c.C43199a(bVar, C11398b.f33143v, 0, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    private final void m124047e(C43226c cVar, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            boolean z2 = true;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 32) == 0) {
                z2 = false;
            }
            if (!z2) {
                if ((i2 & 8) != 0) {
                    i4 = C42197d.m122538d(this.f100916d.readByte(), C11051p3.f31759c);
                }
                cVar.mo101829g(z, i3, this.f100916d, f100914h.mo101841b(i, i2, i4));
                this.f100916d.skip((long) i4);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* renamed from: f */
    private final void m124048f(C43226c cVar, int i, int i2, int i3) {
        if (i < 8) {
            throw new IOException(C41536l.m120497q("TYPE_GOAWAY length < 8: ", Integer.valueOf(i)));
        } else if (i3 == 0) {
            int readInt = this.f100916d.readInt();
            int readInt2 = this.f100916d.readInt();
            int i4 = i - 8;
            C43194a a = C43194a.f100752e.mo101746a(readInt2);
            if (a != null) {
                C40681e eVar = C40681e.f96328h;
                if (i4 > 0) {
                    eVar = this.f100916d.mo94705J0((long) i4);
                }
                cVar.mo101823a(readInt, a, eVar);
                return;
            }
            throw new IOException(C41536l.m120497q("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    /* renamed from: h */
    private final List m124049h(int i, int i2, int i3, int i4) {
        this.f100918f.mo101844n(i);
        C43225b bVar = this.f100918f;
        bVar.mo101845o(bVar.mo101842a());
        this.f100918f.mo101846p(i2);
        this.f100918f.mo101843m(i3);
        this.f100918f.mo101847q(i4);
        this.f100919g.mo101757k();
        return this.f100919g.mo101755e();
    }

    /* renamed from: i */
    private final void m124050i(C43226c cVar, int i, int i2, int i3) {
        boolean z;
        if (i3 != 0) {
            int i4 = 0;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i4 = C42197d.m122538d(this.f100916d.readByte(), C11051p3.f31759c);
            }
            if ((i2 & 32) != 0) {
                m124052m(cVar, i3);
                i -= 5;
            }
            cVar.mo101824b(z, i3, -1, m124049h(f100914h.mo101841b(i, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: k */
    private final void m124051k(C43226c cVar, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException(C41536l.m120497q("TYPE_PING length != 8: ", Integer.valueOf(i)));
        } else if (i3 == 0) {
            int readInt = this.f100916d.readInt();
            int readInt2 = this.f100916d.readInt();
            boolean z = true;
            if ((i2 & 1) == 0) {
                z = false;
            }
            cVar.mo101830h(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    /* renamed from: m */
    private final void m124052m(C43226c cVar, int i) {
        boolean z;
        int readInt = this.f100916d.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z = true;
        } else {
            z = false;
        }
        cVar.mo101831i(i, readInt & Integer.MAX_VALUE, C42197d.m122538d(this.f100916d.readByte(), C11051p3.f31759c) + 1, z);
    }

    /* renamed from: n */
    private final void m124053n(C43226c cVar, int i, int i2, int i3) {
        if (i != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        } else if (i3 != 0) {
            m124052m(cVar, i3);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    /* renamed from: o */
    private final void m124054o(C43226c cVar, int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                i4 = C42197d.m122538d(this.f100916d.readByte(), C11051p3.f31759c);
            } else {
                i4 = 0;
            }
            cVar.mo101827e(i3, this.f100916d.readInt() & Integer.MAX_VALUE, m124049h(f100914h.mo101841b(i - 4, i2, i4), i4, i2, i3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* renamed from: p */
    private final void m124055p(C43226c cVar, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        } else if (i3 != 0) {
            int readInt = this.f100916d.readInt();
            C43194a a = C43194a.f100752e.mo101746a(readInt);
            if (a != null) {
                cVar.mo101826d(i3, a);
                return;
            }
            throw new IOException(C41536l.m120497q("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* renamed from: q */
    private final void m124056q(C43226c cVar, int i, int i2, int i3) {
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i2 & 1) != 0) {
            if (i == 0) {
                cVar.mo101828f();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i % 6 == 0) {
            C43239l lVar = new C43239l();
            C43417c m = C43429k.m124594m(C43429k.m124596o(0, i), 6);
            int j = m.mo102109j();
            int l = m.mo102110l();
            int n = m.mo102111n();
            if ((n > 0 && j <= l) || (n < 0 && l <= j)) {
                while (true) {
                    int i4 = j + n;
                    int e = C42197d.m122539e(this.f100916d.readShort(), 65535);
                    readInt = this.f100916d.readInt();
                    if (e != 2) {
                        if (e == 3) {
                            e = 4;
                        } else if (e != 4) {
                            if (e == 5 && (readInt < 16384 || readInt > 16777215)) {
                            }
                        } else if (readInt >= 0) {
                            e = 7;
                        } else {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    lVar.mo101924h(e, readInt);
                    if (j == l) {
                        break;
                    }
                    j = i4;
                }
                throw new IOException(C41536l.m120497q("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
            }
            cVar.mo101832j(false, lVar);
        } else {
            throw new IOException(C41536l.m120497q("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i)));
        }
    }

    /* renamed from: s */
    private final void m124057s(C43226c cVar, int i, int i2, int i3) {
        if (i == 4) {
            long f = C42197d.m122540f(this.f100916d.readInt(), 2147483647L);
            if (f != 0) {
                cVar.mo101825c(i3, f);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(C41536l.m120497q("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i)));
    }

    /* renamed from: c */
    public final boolean mo101837c(boolean z, C43226c cVar) {
        C41536l.m120489i(cVar, "handler");
        try {
            this.f100916d.mo94691B0(9);
            int J = C42197d.m122516J(this.f100916d);
            if (J <= 16384) {
                int d = C42197d.m122538d(this.f100916d.readByte(), C11051p3.f31759c);
                int d2 = C42197d.m122538d(this.f100916d.readByte(), C11051p3.f31759c);
                int readInt = this.f100916d.readInt() & Integer.MAX_VALUE;
                Logger logger = f100915i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C43201d.f100800a.mo101765c(true, readInt, J, d, d2));
                }
                if (!z || d == 4) {
                    switch (d) {
                        case 0:
                            m124047e(cVar, J, d2, readInt);
                            return true;
                        case 1:
                            m124050i(cVar, J, d2, readInt);
                            return true;
                        case 2:
                            m124053n(cVar, J, d2, readInt);
                            return true;
                        case 3:
                            m124055p(cVar, J, d2, readInt);
                            return true;
                        case 4:
                            m124056q(cVar, J, d2, readInt);
                            return true;
                        case 5:
                            m124054o(cVar, J, d2, readInt);
                            return true;
                        case 6:
                            m124051k(cVar, J, d2, readInt);
                            return true;
                        case 7:
                            m124048f(cVar, J, d2, readInt);
                            return true;
                        case 8:
                            m124057s(cVar, J, d2, readInt);
                            return true;
                        default:
                            this.f100916d.skip((long) J);
                            return true;
                    }
                } else {
                    throw new IOException(C41536l.m120497q("Expected a SETTINGS frame but was ", C43201d.f100800a.mo101764b(d)));
                }
            } else {
                throw new IOException(C41536l.m120497q("FRAME_SIZE_ERROR: ", Integer.valueOf(J)));
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() {
        this.f100916d.close();
    }

    /* renamed from: d */
    public final void mo101839d(C43226c cVar) {
        C41536l.m120489i(cVar, "handler");
        if (!this.f100917e) {
            C40679d dVar = this.f100916d;
            C40681e eVar = C43201d.f100801b;
            C40681e J0 = dVar.mo94705J0((long) eVar.mo94793B());
            Logger logger = f100915i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C42197d.m122554t(C41536l.m120497q("<< CONNECTION ", J0.mo94810o()), new Object[0]));
            }
            if (!C41536l.m120484d(eVar, J0)) {
                throw new IOException(C41536l.m120497q("Expected a connection header but was ", J0.mo94797F()));
            }
        } else if (!mo101837c(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }
}
