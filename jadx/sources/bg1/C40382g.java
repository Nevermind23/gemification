package bg1;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import pf1.C42197d;

/* renamed from: bg1.g */
public final class C40382g implements Closeable {

    /* renamed from: d */
    private final boolean f95934d;

    /* renamed from: e */
    private final C40679d f95935e;

    /* renamed from: f */
    private final C40383a f95936f;

    /* renamed from: g */
    private final boolean f95937g;

    /* renamed from: h */
    private final boolean f95938h;

    /* renamed from: i */
    private boolean f95939i;

    /* renamed from: j */
    private int f95940j;

    /* renamed from: k */
    private long f95941k;

    /* renamed from: l */
    private boolean f95942l;

    /* renamed from: m */
    private boolean f95943m;

    /* renamed from: n */
    private boolean f95944n;

    /* renamed from: o */
    private final C40672b f95945o = new C40672b();

    /* renamed from: p */
    private final C40672b f95946p = new C40672b();

    /* renamed from: q */
    private C40369c f95947q;

    /* renamed from: r */
    private final byte[] f95948r;

    /* renamed from: s */
    private final C40672b.C40673a f95949s;

    /* renamed from: bg1.g$a */
    public interface C40383a {
        /* renamed from: a */
        void mo94408a(C40681e eVar);

        /* renamed from: c */
        void mo94409c(C40681e eVar);

        /* renamed from: d */
        void mo94410d(String str);

        /* renamed from: e */
        void mo94411e(C40681e eVar);

        /* renamed from: h */
        void mo94412h(int i, String str);
    }

    public C40382g(boolean z, C40679d dVar, C40383a aVar, boolean z2, boolean z3) {
        byte[] bArr;
        C41536l.m120489i(dVar, "source");
        C41536l.m120489i(aVar, "frameCallback");
        this.f95934d = z;
        this.f95935e = dVar;
        this.f95936f = aVar;
        this.f95937g = z2;
        this.f95938h = z3;
        C40672b.C40673a aVar2 = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.f95948r = bArr;
        this.f95949s = !z ? new C40672b.C40673a() : aVar2;
    }

    /* renamed from: k */
    private final void m116932k() {
        String str;
        short s;
        long j = this.f95941k;
        if (j > 0) {
            this.f95935e.mo94736j0(this.f95945o, j);
            if (!this.f95934d) {
                C40672b bVar = this.f95945o;
                C40672b.C40673a aVar = this.f95949s;
                C41536l.m120486f(aVar);
                bVar.mo94732h0(aVar);
                this.f95949s.mo94780o(0);
                C40381f fVar = C40381f.f95933a;
                C40672b.C40673a aVar2 = this.f95949s;
                byte[] bArr = this.f95948r;
                C41536l.m120486f(bArr);
                fVar.mo94437b(aVar2, bArr);
                this.f95949s.close();
            }
        }
        switch (this.f95940j) {
            case 8:
                long M0 = this.f95945o.mo94709M0();
                if (M0 != 1) {
                    if (M0 != 0) {
                        s = this.f95945o.readShort();
                        str = this.f95945o.mo94746o1();
                        String a = C40381f.f95933a.mo94436a(s);
                        if (a != null) {
                            throw new ProtocolException(a);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.f95936f.mo94412h(s, str);
                    this.f95939i = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f95936f.mo94408a(this.f95945o.mo94743n0());
                return;
            case 10:
                this.f95936f.mo94411e(this.f95945o.mo94743n0());
                return;
            default:
                throw new ProtocolException(C41536l.m120497q("Unknown control opcode: ", C42197d.m122523Q(this.f95940j)));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: n */
    private final void m116933n() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        if (!this.f95939i) {
            long h = this.f95935e.mo94678C().mo94689h();
            this.f95935e.mo94678C().mo94683b();
            try {
                int d = C42197d.m122538d(this.f95935e.readByte(), C11051p3.f31759c);
                this.f95935e.mo94678C().mo94688g(h, TimeUnit.NANOSECONDS);
                int i = d & 15;
                this.f95940j = i;
                boolean z7 = false;
                if ((d & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f95942l = z;
                if ((d & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f95943m = z2;
                if (!z2 || z) {
                    if ((d & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i == 1 || i == 2) {
                        if (!z3) {
                            z6 = false;
                        } else if (this.f95937g) {
                            z6 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.f95944n = z6;
                    } else if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((d & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if ((d & 16) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            int d2 = C42197d.m122538d(this.f95935e.readByte(), C11051p3.f31759c);
                            if ((d2 & 128) != 0) {
                                z7 = true;
                            }
                            if (z7 == this.f95934d) {
                                if (this.f95934d) {
                                    str = "Server-sent frames must not be masked.";
                                } else {
                                    str = "Client-sent frames must be masked.";
                                }
                                throw new ProtocolException(str);
                            }
                            long j = (long) (d2 & C11051p3.f31760d);
                            this.f95941k = j;
                            if (j == 126) {
                                this.f95941k = (long) C42197d.m122539e(this.f95935e.readShort(), 65535);
                            } else if (j == 127) {
                                long readLong = this.f95935e.readLong();
                                this.f95941k = readLong;
                                if (readLong < 0) {
                                    throw new ProtocolException("Frame length 0x" + C42197d.m122524R(this.f95941k) + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.f95943m && this.f95941k > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            } else if (z7) {
                                C40679d dVar = this.f95935e;
                                byte[] bArr = this.f95948r;
                                C41536l.m120486f(bArr);
                                dVar.readFully(bArr);
                            }
                        } else {
                            throw new ProtocolException("Unexpected rsv3 flag");
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f95935e.mo94678C().mo94688g(h, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: o */
    private final void m116934o() {
        while (!this.f95939i) {
            long j = this.f95941k;
            if (j > 0) {
                this.f95935e.mo94736j0(this.f95946p, j);
                if (!this.f95934d) {
                    C40672b bVar = this.f95946p;
                    C40672b.C40673a aVar = this.f95949s;
                    C41536l.m120486f(aVar);
                    bVar.mo94732h0(aVar);
                    this.f95949s.mo94780o(this.f95946p.mo94709M0() - this.f95941k);
                    C40381f fVar = C40381f.f95933a;
                    C40672b.C40673a aVar2 = this.f95949s;
                    byte[] bArr = this.f95948r;
                    C41536l.m120486f(bArr);
                    fVar.mo94437b(aVar2, bArr);
                    this.f95949s.close();
                }
            }
            if (!this.f95942l) {
                m116936s();
                if (this.f95940j != 0) {
                    throw new ProtocolException(C41536l.m120497q("Expected continuation opcode. Got: ", C42197d.m122523Q(this.f95940j)));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: q */
    private final void m116935q() {
        int i = this.f95940j;
        if (i == 1 || i == 2) {
            m116934o();
            if (this.f95944n) {
                C40369c cVar = this.f95947q;
                if (cVar == null) {
                    cVar = new C40369c(this.f95938h);
                    this.f95947q = cVar;
                }
                cVar.mo94406a(this.f95946p);
            }
            if (i == 1) {
                this.f95936f.mo94410d(this.f95946p.mo94746o1());
            } else {
                this.f95936f.mo94409c(this.f95946p.mo94743n0());
            }
        } else {
            throw new ProtocolException(C41536l.m120497q("Unknown opcode: ", C42197d.m122523Q(i)));
        }
    }

    /* renamed from: s */
    private final void m116936s() {
        while (!this.f95939i) {
            m116933n();
            if (this.f95943m) {
                m116932k();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo94439a() {
        m116933n();
        if (this.f95943m) {
            m116932k();
        } else {
            m116935q();
        }
    }

    public void close() {
        C40369c cVar = this.f95947q;
        if (cVar != null) {
            cVar.close();
        }
    }
}
