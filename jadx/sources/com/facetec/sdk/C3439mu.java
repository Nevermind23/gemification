package com.facetec.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: com.facetec.sdk.mu */
public final class C3439mu implements C3465nf {

    /* renamed from: a */
    private final Inflater f11271a;

    /* renamed from: b */
    private final C3432mn f11272b;

    /* renamed from: d */
    private int f11273d;

    /* renamed from: e */
    private boolean f11274e;

    C3439mu(C3432mn mnVar, Inflater inflater) {
        if (mnVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f11272b = mnVar;
            this.f11271a = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: a */
    private boolean m13773a() {
        if (!this.f11271a.needsInput()) {
            return false;
        }
        m13774e();
        if (this.f11271a.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f11272b.mo9864e()) {
            return true;
        } else {
            C3459na naVar = this.f11272b.mo9851d().f11261e;
            int i = naVar.f11307c;
            int i2 = naVar.f11309e;
            int i3 = i - i2;
            this.f11273d = i3;
            this.f11271a.setInput(naVar.f11308d, i2, i3);
            return false;
        }
    }

    /* renamed from: e */
    private void m13774e() {
        int i = this.f11273d;
        if (i != 0) {
            int remaining = i - this.f11271a.getRemaining();
            this.f11273d -= remaining;
            this.f11272b.mo9880j((long) remaining);
        }
    }

    /* renamed from: c */
    public final long mo9643c(C3431mm mmVar, long j) {
        C3459na e;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.f11274e) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = m13773a();
                try {
                    e = mmVar.mo9862e(1);
                    int inflate = this.f11271a.inflate(e.f11308d, e.f11307c, (int) Math.min(j, (long) (8192 - e.f11307c)));
                    if (inflate > 0) {
                        e.f11307c += inflate;
                        long j2 = (long) inflate;
                        mmVar.f11260b += j2;
                        return j2;
                    } else if (this.f11271a.finished()) {
                        break;
                    } else if (this.f11271a.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            m13774e();
            if (e.f11309e != e.f11307c) {
                return -1;
            }
            mmVar.f11261e = e.mo9941e();
            C3447mz.m13831b(e);
            return -1;
        }
    }

    public final void close() {
        if (!this.f11274e) {
            this.f11271a.end();
            this.f11274e = true;
            this.f11272b.close();
        }
    }

    /* renamed from: c */
    public final C3463ne mo9644c() {
        return this.f11272b.mo9644c();
    }
}
