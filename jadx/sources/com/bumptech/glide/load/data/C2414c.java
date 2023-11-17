package com.bumptech.glide.load.data;

import java.io.OutputStream;
import p205p3.C7674b;

/* renamed from: com.bumptech.glide.load.data.c */
public final class C2414c extends OutputStream {

    /* renamed from: d */
    private final OutputStream f7646d;

    /* renamed from: e */
    private byte[] f7647e;

    /* renamed from: f */
    private C7674b f7648f;

    /* renamed from: g */
    private int f7649g;

    public C2414c(OutputStream outputStream, C7674b bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: a */
    private void m9349a() {
        int i = this.f7649g;
        if (i > 0) {
            this.f7646d.write(this.f7647e, 0, i);
            this.f7649g = 0;
        }
    }

    /* renamed from: k */
    private void m9350k() {
        if (this.f7649g == this.f7647e.length) {
            m9349a();
        }
    }

    /* renamed from: n */
    private void m9351n() {
        byte[] bArr = this.f7647e;
        if (bArr != null) {
            this.f7648f.mo22389e(bArr);
            this.f7647e = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f7646d.close();
            m9351n();
        } catch (Throwable th) {
            this.f7646d.close();
            throw th;
        }
    }

    public void flush() {
        m9349a();
        this.f7646d.flush();
    }

    public void write(int i) {
        byte[] bArr = this.f7647e;
        int i2 = this.f7649g;
        this.f7649g = i2 + 1;
        bArr[i2] = (byte) i;
        m9350k();
    }

    C2414c(OutputStream outputStream, C7674b bVar, int i) {
        this.f7646d = outputStream;
        this.f7648f = bVar;
        this.f7647e = (byte[]) bVar.mo22387c(i, byte[].class);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f7649g;
            if (i6 != 0 || i4 < this.f7647e.length) {
                int min = Math.min(i4, this.f7647e.length - i6);
                System.arraycopy(bArr, i5, this.f7647e, this.f7649g, min);
                this.f7649g += min;
                i3 += min;
                m9350k();
            } else {
                this.f7646d.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
