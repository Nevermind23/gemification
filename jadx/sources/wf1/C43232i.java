package wf1;

import dg1.C40672b;
import dg1.C40677c;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;
import wf1.C43198c;

/* renamed from: wf1.i */
public final class C43232i implements Closeable {

    /* renamed from: j */
    public static final C43233a f100954j = new C43233a((DefaultConstructorMarker) null);

    /* renamed from: k */
    private static final Logger f100955k = Logger.getLogger(C43201d.class.getName());

    /* renamed from: d */
    private final C40677c f100956d;

    /* renamed from: e */
    private final boolean f100957e;

    /* renamed from: f */
    private final C40672b f100958f;

    /* renamed from: g */
    private int f100959g = 16384;

    /* renamed from: h */
    private boolean f100960h;

    /* renamed from: i */
    private final C43198c.C43200b f100961i;

    /* renamed from: wf1.i$a */
    public static final class C43233a {
        private C43233a() {
        }

        public /* synthetic */ C43233a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C43232i(C40677c cVar, boolean z) {
        C41536l.m120489i(cVar, "sink");
        this.f100956d = cVar;
        this.f100957e = z;
        C40672b bVar = new C40672b();
        this.f100958f = bVar;
        this.f100961i = new C43198c.C43200b(0, false, bVar, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: y */
    private final void m124134y(int i, long j) {
        int i2;
        while (j > 0) {
            long min = Math.min((long) this.f100959g, j);
            j -= min;
            int i3 = (int) min;
            if (j == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            mo101898o(i, i3, 9, i2);
            this.f100956d.mo21301x1(this.f100958f, min);
        }
    }

    /* renamed from: a */
    public final synchronized void mo101892a(C43239l lVar) {
        C41536l.m120489i(lVar, "peerSettings");
        if (!this.f100960h) {
            this.f100959g = lVar.mo101921e(this.f100959g);
            if (lVar.mo101918b() != -1) {
                this.f100961i.mo101759e(lVar.mo101918b());
            }
            mo101898o(0, 0, 4, 1);
            this.f100956d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.f100960h = true;
        this.f100956d.close();
    }

    public final synchronized void flush() {
        if (!this.f100960h) {
            this.f100956d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: k */
    public final synchronized void mo101895k() {
        if (this.f100960h) {
            throw new IOException("closed");
        } else if (this.f100957e) {
            Logger logger = f100955k;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C42197d.m122554t(C41536l.m120497q(">> CONNECTION ", C43201d.f100801b.mo94810o()), new Object[0]));
            }
            this.f100956d.mo94717T(C43201d.f100801b);
            this.f100956d.flush();
        }
    }

    /* renamed from: m */
    public final synchronized void mo101896m(boolean z, int i, C40672b bVar, int i2) {
        if (!this.f100960h) {
            mo101897n(i, z ? 1 : 0, bVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: n */
    public final void mo101897n(int i, int i2, C40672b bVar, int i3) {
        mo101898o(i, i3, 0, i2);
        if (i3 > 0) {
            C40677c cVar = this.f100956d;
            C41536l.m120486f(bVar);
            cVar.mo21301x1(bVar, (long) i3);
        }
    }

    /* renamed from: o */
    public final void mo101898o(int i, int i2, int i3, int i4) {
        boolean z;
        Logger logger = f100955k;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C43201d.f100800a.mo101765c(false, i, i2, i3, i4));
        }
        boolean z2 = true;
        if (i2 <= this.f100959g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((Integer.MIN_VALUE & i) != 0) {
                z2 = false;
            }
            if (z2) {
                C42197d.m122536b0(this.f100956d, i2);
                this.f100956d.mo94715R0(i3 & C11051p3.f31759c);
                this.f100956d.mo94715R0(i4 & C11051p3.f31759c);
                this.f100956d.mo94711P(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(C41536l.m120497q("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f100959g + ": " + i2).toString());
    }

    /* renamed from: p */
    public final synchronized void mo101899p(int i, C43194a aVar, byte[] bArr) {
        boolean z;
        C41536l.m120489i(aVar, "errorCode");
        C41536l.m120489i(bArr, "debugData");
        if (!this.f100960h) {
            boolean z2 = false;
            if (aVar.mo101745b() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo101898o(0, bArr.length + 8, 7, 0);
                this.f100956d.mo94711P(i);
                this.f100956d.mo94711P(aVar.mo101745b());
                if (bArr.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    this.f100956d.mo94770w0(bArr);
                }
                this.f100956d.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: q */
    public final synchronized void mo101900q(boolean z, int i, List list) {
        int i2;
        C41536l.m120489i(list, "headerBlock");
        if (!this.f100960h) {
            this.f100961i.mo101761g(list);
            long M0 = this.f100958f.mo94709M0();
            long min = Math.min((long) this.f100959g, M0);
            int i3 = (M0 > min ? 1 : (M0 == min ? 0 : -1));
            if (i3 == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            mo101898o(i, (int) min, 1, i2);
            this.f100956d.mo21301x1(this.f100958f, min);
            if (i3 > 0) {
                m124134y(i, M0 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: s */
    public final int mo101901s() {
        return this.f100959g;
    }

    /* renamed from: t */
    public final synchronized void mo101902t(boolean z, int i, int i2) {
        int i3;
        if (!this.f100960h) {
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            mo101898o(0, 8, 6, i3);
            this.f100956d.mo94711P(i);
            this.f100956d.mo94711P(i2);
            this.f100956d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: u */
    public final synchronized void mo101903u(int i, int i2, List list) {
        int i3;
        C41536l.m120489i(list, "requestHeaders");
        if (!this.f100960h) {
            this.f100961i.mo101761g(list);
            long M0 = this.f100958f.mo94709M0();
            int min = (int) Math.min(((long) this.f100959g) - 4, M0);
            int i4 = min + 4;
            long j = (long) min;
            int i5 = (M0 > j ? 1 : (M0 == j ? 0 : -1));
            if (i5 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            mo101898o(i, i4, 5, i3);
            this.f100956d.mo94711P(i2 & Integer.MAX_VALUE);
            this.f100956d.mo21301x1(this.f100958f, j);
            if (i5 > 0) {
                m124134y(i, M0 - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: v */
    public final synchronized void mo101904v(int i, C43194a aVar) {
        boolean z;
        C41536l.m120489i(aVar, "errorCode");
        if (!this.f100960h) {
            if (aVar.mo101745b() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo101898o(i, 4, 3, 0);
                this.f100956d.mo94711P(aVar.mo101745b());
                this.f100956d.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: w */
    public final synchronized void mo101905w(C43239l lVar) {
        int i;
        C41536l.m120489i(lVar, "settings");
        if (!this.f100960h) {
            int i2 = 0;
            mo101898o(0, lVar.mo101925i() * 6, 4, 0);
            while (i2 < 10) {
                int i3 = i2 + 1;
                if (lVar.mo101922f(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 != 7) {
                        i = i2;
                    } else {
                        i = 4;
                    }
                    this.f100956d.mo94707L0(i);
                    this.f100956d.mo94711P(lVar.mo101917a(i2));
                }
                i2 = i3;
            }
            this.f100956d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: x */
    public final synchronized void mo101906x(int i, long j) {
        boolean z;
        if (!this.f100960h) {
            if (j == 0 || j > 2147483647L) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                mo101898o(i, 4, 8, 0);
                this.f100956d.mo94711P((int) j);
                this.f100956d.flush();
            } else {
                throw new IllegalArgumentException(C41536l.m120497q("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }
}
