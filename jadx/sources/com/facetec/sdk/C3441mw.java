package com.facetec.sdk;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p341ge.bog.mobilebank.p975ui.views.widgets.deprecated.BogTextInputET;

/* renamed from: com.facetec.sdk.mw */
final class C3441mw implements C3432mn {

    /* renamed from: a */
    private C3465nf f11280a;

    /* renamed from: c */
    private boolean f11281c;

    /* renamed from: e */
    private C3431mm f11282e = new C3431mm();

    C3441mw(C3465nf nfVar) {
        if (nfVar != null) {
            this.f11280a = nfVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: a */
    public final C3435mq mo9837a(long j) {
        mo9863e(j);
        return this.f11282e.mo9837a(j);
    }

    /* renamed from: b */
    public final String mo9842b(Charset charset) {
        if (charset != null) {
            this.f11282e.mo9850d(this.f11280a);
            return this.f11282e.mo9842b(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: c */
    public final long mo9643c(C3431mm mmVar, long j) {
        if (mmVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.f11281c) {
            C3431mm mmVar2 = this.f11282e;
            if (mmVar2.f11260b == 0 && this.f11280a.mo9643c(mmVar2, 8192) == -1) {
                return -1;
            }
            return this.f11282e.mo9643c(mmVar, Math.min(j, this.f11282e.f11260b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void close() {
        if (!this.f11281c) {
            this.f11281c = true;
            this.f11280a.close();
            this.f11282e.mo9888q();
        }
    }

    /* renamed from: d */
    public final C3431mm mo9851d() {
        return this.f11282e;
    }

    /* renamed from: e */
    public final boolean mo9864e() {
        if (!this.f11281c) {
            return this.f11282e.mo9864e() && this.f11280a.mo9643c(this.f11282e, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: f */
    public final byte mo9866f() {
        mo9863e(1);
        return this.f11282e.mo9866f();
    }

    /* renamed from: g */
    public final short mo9871g() {
        mo9863e(2);
        return this.f11282e.mo9871g();
    }

    /* renamed from: h */
    public final short mo9873h() {
        mo9863e(2);
        return this.f11282e.mo9873h();
    }

    /* renamed from: i */
    public final byte[] mo9877i(long j) {
        mo9863e(j);
        return this.f11282e.mo9877i(j);
    }

    public final boolean isOpen() {
        return !this.f11281c;
    }

    /* renamed from: j */
    public final int mo9879j() {
        mo9863e(4);
        return this.f11282e.mo9879j();
    }

    /* renamed from: l */
    public final long mo9882l() {
        mo9863e(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!m13783d((long) i2)) {
                break;
            }
            byte c = this.f11282e.mo9843c((long) i);
            if ((c >= 48 && c <= 57) || ((c >= 97 && c <= 102) || (c >= 65 && c <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(c)}));
            }
        }
        return this.f11282e.mo9882l();
    }

    /* renamed from: m */
    public final String mo9883m() {
        return mo9841b(Long.MAX_VALUE);
    }

    /* renamed from: r */
    public final long mo9889r() {
        return m13781b((byte) 0, 0, Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        C3431mm mmVar = this.f11282e;
        if (mmVar.f11260b == 0 && this.f11280a.mo9643c(mmVar, 8192) == -1) {
            return -1;
        }
        return this.f11282e.read(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.f11280a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: d */
    private boolean m13783d(long j) {
        C3431mm mmVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.f11281c) {
            do {
                mmVar = this.f11282e;
                if (mmVar.f11260b >= j) {
                    return true;
                }
            } while (this.f11280a.mo9643c(mmVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: i */
    public final int mo9875i() {
        mo9863e(4);
        return this.f11282e.mo9875i();
    }

    /* renamed from: j */
    public final void mo9880j(long j) {
        if (!this.f11281c) {
            while (j > 0) {
                C3431mm mmVar = this.f11282e;
                if (mmVar.f11260b == 0 && this.f11280a.mo9643c(mmVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f11282e.mo9835a());
                this.f11282e.mo9880j(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public final String mo9841b(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long b = m13781b((byte) 10, 0, j2);
            if (b != -1) {
                return this.f11282e.mo9855d(b);
            }
            if (j2 < Long.MAX_VALUE && m13783d(j2) && this.f11282e.mo9843c(j2 - 1) == 13 && m13783d(1 + j2) && this.f11282e.mo9843c(j2) == 10) {
                return this.f11282e.mo9855d(j2);
            }
            C3431mm mmVar = new C3431mm();
            C3431mm mmVar2 = this.f11282e;
            mmVar2.mo9853d(mmVar, 0, Math.min(32, mmVar2.mo9835a()));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.f11282e.mo9835a(), j));
            sb.append(" content=");
            sb.append(mmVar.mo9885n().mo9894b());
            sb.append(BogTextInputET.emptyChar);
            throw new EOFException(sb.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
    }

    /* renamed from: e */
    public final void mo9863e(long j) {
        if (!m13783d(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: d */
    public final void mo9856d(byte[] bArr) {
        try {
            mo9863e((long) bArr.length);
            this.f11282e.mo9856d(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C3431mm mmVar = this.f11282e;
                long j = mmVar.f11260b;
                if (j > 0) {
                    int c = mmVar.mo9844c(bArr, i, (int) j);
                    if (c != -1) {
                        i += c;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m13782c(C3435mq mqVar, int i) {
        if (this.f11281c) {
            throw new IllegalStateException("closed");
        } else if (i < 0 || mqVar.mo9906g() < i) {
            return false;
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                long j = ((long) i2) + 0;
                if (!m13783d(1 + j) || this.f11282e.mo9843c(j) != mqVar.mo9902e(i2)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo9857d(C3435mq mqVar) {
        return m13782c(mqVar, mqVar.mo9906g());
    }

    /* renamed from: b */
    private long m13781b(byte b, long j, long j2) {
        if (this.f11281c) {
            throw new IllegalStateException("closed");
        } else if (j2 >= 0) {
            while (j < j2) {
                long c = this.f11282e.mo9845c(b, j, j2);
                if (c == -1) {
                    C3431mm mmVar = this.f11282e;
                    long j3 = mmVar.f11260b;
                    if (j3 >= j2 || this.f11280a.mo9643c(mmVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return c;
                }
            }
            return -1;
        } else {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{0L, Long.valueOf(j2)}));
        }
    }

    /* renamed from: c */
    public final C3463ne mo9644c() {
        return this.f11280a.mo9644c();
    }
}
