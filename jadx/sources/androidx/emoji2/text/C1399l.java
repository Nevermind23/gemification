package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p059e0.C5881b;

/* renamed from: androidx.emoji2.text.l */
abstract class C1399l {

    /* renamed from: androidx.emoji2.text.l$a */
    private static class C1400a implements C1402c {

        /* renamed from: a */
        private final ByteBuffer f4003a;

        C1400a(ByteBuffer byteBuffer) {
            this.f4003a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo4037a() {
            return this.f4003a.getInt();
        }

        /* renamed from: b */
        public void mo4038b(int i) {
            ByteBuffer byteBuffer = this.f4003a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        /* renamed from: c */
        public long mo4039c() {
            return C1399l.m4811c(this.f4003a.getInt());
        }

        public long getPosition() {
            return (long) this.f4003a.position();
        }

        public int readUnsignedShort() {
            return C1399l.m4812d(this.f4003a.getShort());
        }
    }

    /* renamed from: androidx.emoji2.text.l$b */
    private static class C1401b {

        /* renamed from: a */
        private final long f4004a;

        /* renamed from: b */
        private final long f4005b;

        C1401b(long j, long j2) {
            this.f4004a = j;
            this.f4005b = j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo4042a() {
            return this.f4004a;
        }
    }

    /* renamed from: androidx.emoji2.text.l$c */
    private interface C1402c {
        /* renamed from: a */
        int mo4037a();

        /* renamed from: b */
        void mo4038b(int i);

        /* renamed from: c */
        long mo4039c();

        long getPosition();

        int readUnsignedShort();
    }

    /* renamed from: a */
    private static C1401b m4809a(C1402c cVar) {
        long j;
        cVar.mo4038b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.mo4038b(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int a = cVar.mo4037a();
                cVar.mo4038b(4);
                j = cVar.mo4039c();
                cVar.mo4038b(4);
                if (1835365473 == a) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo4038b((int) (j - cVar.getPosition()));
                cVar.mo4038b(12);
                long c = cVar.mo4039c();
                for (int i2 = 0; ((long) i2) < c; i2++) {
                    int a2 = cVar.mo4037a();
                    long c2 = cVar.mo4039c();
                    long c3 = cVar.mo4039c();
                    if (1164798569 == a2 || 1701669481 == a2) {
                        return new C1401b(c2 + j, c3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    static C5881b m4810b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m4809a(new C1400a(duplicate)).mo4042a());
        return C5881b.m23665h(duplicate);
    }

    /* renamed from: c */
    static long m4811c(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: d */
    static int m4812d(short s) {
        return s & 65535;
    }
}
