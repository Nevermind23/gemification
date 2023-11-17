package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.p016os.C0934x;
import androidx.core.util.C1008h;
import com.salesforce.marketingcloud.C11398b;
import java.nio.ByteBuffer;
import p059e0.C5881b;

/* renamed from: androidx.emoji2.text.m */
public final class C1403m {

    /* renamed from: a */
    private final C5881b f4006a;

    /* renamed from: b */
    private final char[] f4007b;

    /* renamed from: c */
    private final C1404a f4008c = new C1404a(C11398b.f33141t);

    /* renamed from: d */
    private final Typeface f4009d;

    /* renamed from: androidx.emoji2.text.m$a */
    static class C1404a {

        /* renamed from: a */
        private final SparseArray f4010a;

        /* renamed from: b */
        private C1390g f4011b;

        private C1404a() {
            this(1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1404a mo4049a(int i) {
            SparseArray sparseArray = this.f4010a;
            if (sparseArray == null) {
                return null;
            }
            return (C1404a) sparseArray.get(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C1390g mo4050b() {
            return this.f4011b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4051c(C1390g gVar, int i, int i2) {
            C1404a a = mo4049a(gVar.mo4011b(i));
            if (a == null) {
                a = new C1404a();
                this.f4010a.put(gVar.mo4011b(i), a);
            }
            if (i2 > i) {
                a.mo4051c(gVar, i + 1, i2);
            } else {
                a.f4011b = gVar;
            }
        }

        C1404a(int i) {
            this.f4010a = new SparseArray(i);
        }
    }

    private C1403m(Typeface typeface, C5881b bVar) {
        this.f4009d = typeface;
        this.f4006a = bVar;
        this.f4007b = new char[(bVar.mo19235k() * 2)];
        m4820a(bVar);
    }

    /* renamed from: a */
    private void m4820a(C5881b bVar) {
        int k = bVar.mo19235k();
        for (int i = 0; i < k; i++) {
            C1390g gVar = new C1390g(this, i);
            Character.toChars(gVar.mo4015f(), this.f4007b, i * 2);
            mo4048h(gVar);
        }
    }

    /* renamed from: b */
    public static C1403m m4821b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            C0934x.m3381a("EmojiCompat.MetadataRepo.create");
            return new C1403m(typeface, C1399l.m4810b(byteBuffer));
        } finally {
            C0934x.m3382b();
        }
    }

    /* renamed from: c */
    public char[] mo4043c() {
        return this.f4007b;
    }

    /* renamed from: d */
    public C5881b mo4044d() {
        return this.f4006a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo4045e() {
        return this.f4006a.mo19236l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C1404a mo4046f() {
        return this.f4008c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Typeface mo4047g() {
        return this.f4009d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4048h(C1390g gVar) {
        boolean z;
        C1008h.m3531h(gVar, "emoji metadata cannot be null");
        if (gVar.mo4012c() > 0) {
            z = true;
        } else {
            z = false;
        }
        C1008h.m3525b(z, "invalid metadata codepoint length");
        this.f4008c.mo4051c(gVar, 0, gVar.mo4012c() - 1);
    }
}
