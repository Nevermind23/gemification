package com.facetec.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: com.facetec.sdk.mv */
public final class C3440mv implements C3465nf {

    /* renamed from: a */
    private int f11275a = 0;

    /* renamed from: b */
    private final C3432mn f11276b;

    /* renamed from: c */
    private final C3439mu f11277c;

    /* renamed from: d */
    private final CRC32 f11278d = new CRC32();

    /* renamed from: e */
    private final Inflater f11279e;

    public C3440mv(C3465nf nfVar) {
        if (nfVar != null) {
            Inflater inflater = new Inflater(true);
            this.f11279e = inflater;
            C3432mn a = C3442mx.m13804a(nfVar);
            this.f11276b = a;
            this.f11277c = new C3439mu(a, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    private void m13777b(C3431mm mmVar, long j, long j2) {
        C3459na naVar = mmVar.f11261e;
        while (true) {
            int i = naVar.f11307c;
            int i2 = naVar.f11309e;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            naVar = naVar.f11311j;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) naVar.f11309e) + j);
            int min = (int) Math.min((long) (naVar.f11307c - i3), j2);
            this.f11278d.update(naVar.f11308d, i3, min);
            j2 -= (long) min;
            naVar = naVar.f11311j;
            j = 0;
        }
    }

    /* renamed from: c */
    public final long mo9643c(C3431mm mmVar, long j) {
        long j2;
        C3431mm mmVar2 = mmVar;
        long j3 = j;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f11275a == 0) {
                this.f11276b.mo9863e(10);
                byte c = this.f11276b.mo9851d().mo9843c(3);
                boolean z = ((c >> 1) & 1) == 1;
                if (z) {
                    m13777b(this.f11276b.mo9851d(), 0, 10);
                }
                m13778b("ID1ID2", 8075, (int) this.f11276b.mo9873h());
                this.f11276b.mo9880j(8);
                if (((c >> 2) & 1) == 1) {
                    this.f11276b.mo9863e(2);
                    if (z) {
                        m13777b(this.f11276b.mo9851d(), 0, 2);
                    }
                    long g = (long) this.f11276b.mo9851d().mo9871g();
                    this.f11276b.mo9863e(g);
                    if (z) {
                        j2 = g;
                        m13777b(this.f11276b.mo9851d(), 0, g);
                    } else {
                        j2 = g;
                    }
                    this.f11276b.mo9880j(j2);
                }
                if (((c >> 3) & 1) == 1) {
                    long r = this.f11276b.mo9889r();
                    if (r != -1) {
                        if (z) {
                            m13777b(this.f11276b.mo9851d(), 0, r + 1);
                        }
                        this.f11276b.mo9880j(r + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((c >> 4) & 1) == 1) {
                    long r2 = this.f11276b.mo9889r();
                    if (r2 != -1) {
                        if (z) {
                            m13777b(this.f11276b.mo9851d(), 0, r2 + 1);
                        }
                        this.f11276b.mo9880j(r2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    m13778b("FHCRC", (int) this.f11276b.mo9871g(), (int) (short) ((int) this.f11278d.getValue()));
                    this.f11278d.reset();
                }
                this.f11275a = 1;
            }
            if (this.f11275a == 1) {
                long j4 = mmVar2.f11260b;
                long c2 = this.f11277c.mo9643c(mmVar2, j3);
                if (c2 != -1) {
                    m13777b(mmVar, j4, c2);
                    return c2;
                }
                this.f11275a = 2;
            }
            if (this.f11275a == 2) {
                m13778b("CRC", this.f11276b.mo9875i(), (int) this.f11278d.getValue());
                m13778b("ISIZE", this.f11276b.mo9875i(), (int) this.f11279e.getBytesWritten());
                this.f11275a = 3;
                if (!this.f11276b.mo9864e()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final void close() {
        this.f11277c.close();
    }

    /* renamed from: b */
    private static void m13778b(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    /* renamed from: c */
    public final C3463ne mo9644c() {
        return this.f11276b.mo9644c();
    }
}
