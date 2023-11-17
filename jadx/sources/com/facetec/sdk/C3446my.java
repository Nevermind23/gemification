package com.facetec.sdk;

import java.nio.ByteBuffer;

/* renamed from: com.facetec.sdk.my */
final class C3446my implements C3434mp {

    /* renamed from: a */
    private boolean f11289a;

    /* renamed from: d */
    private C3461nc f11290d;

    /* renamed from: e */
    private C3431mm f11291e = new C3431mm();

    C3446my(C3461nc ncVar) {
        if (ncVar != null) {
            this.f11290d = ncVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: b */
    public final void mo9671b(C3431mm mmVar, long j) {
        if (!this.f11289a) {
            this.f11291e.mo9671b(mmVar, j);
            mo9887p();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public final C3463ne mo9707c() {
        return this.f11290d.mo9707c();
    }

    public final void close() {
        if (!this.f11289a) {
            try {
                C3431mm mmVar = this.f11291e;
                long j = mmVar.f11260b;
                if (j > 0) {
                    this.f11290d.mo9671b(mmVar, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f11290d.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f11289a = true;
            if (th != null) {
                C3460nb.m13838c(th);
            }
        }
    }

    /* renamed from: d */
    public final C3431mm mo9851d() {
        return this.f11291e;
    }

    /* renamed from: e */
    public final C3434mp mo9860e(String str) {
        if (!this.f11289a) {
            this.f11291e.mo9860e(str);
            return mo9887p();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public final C3434mp mo9867f(int i) {
        if (!this.f11289a) {
            this.f11291e.mo9867f(i);
            return mo9887p();
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f11289a) {
            C3431mm mmVar = this.f11291e;
            long j = mmVar.f11260b;
            if (j > 0) {
                this.f11290d.mo9671b(mmVar, j);
            }
            this.f11290d.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: g */
    public final C3434mp mo9870g(int i) {
        if (!this.f11289a) {
            this.f11291e.mo9870g(i);
            return mo9887p();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: i */
    public final C3434mp mo9876i(int i) {
        if (!this.f11289a) {
            this.f11291e.mo9876i(i);
            return mo9887p();
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f11289a;
    }

    /* renamed from: n */
    public final C3434mp mo9884n(long j) {
        if (!this.f11289a) {
            this.f11291e.mo9884n(j);
            return mo9887p();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: p */
    public final C3434mp mo9887p() {
        if (!this.f11289a) {
            long b = this.f11291e.mo9838b();
            if (b > 0) {
                this.f11290d.mo9671b(this.f11291e, b);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.f11290d);
        sb.append(")");
        return sb.toString();
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.f11289a) {
            int write = this.f11291e.write(byteBuffer);
            mo9887p();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: d */
    public final C3434mp mo9854d(byte[] bArr, int i, int i2) {
        if (!this.f11289a) {
            this.f11291e.mo9854d(bArr, i, i2);
            return mo9887p();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: e */
    public final C3434mp mo9861e(byte[] bArr) {
        if (!this.f11289a) {
            this.f11291e.mo9861e(bArr);
            return mo9887p();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public final C3434mp mo9868f(long j) {
        if (!this.f11289a) {
            this.f11291e.mo9868f(j);
            return mo9887p();
        }
        throw new IllegalStateException("closed");
    }
}
