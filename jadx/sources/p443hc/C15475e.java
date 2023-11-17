package p443hc;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import p200ob.C7508b;
import p200ob.C7511e;
import p226qb.C8001a;
import p226qb.C8003c;

/* renamed from: hc.e */
public final class C15475e {

    /* renamed from: a */
    private final C8003c f43898a = new C8003c(C8001a.f23055l);

    /* renamed from: a */
    private void m55973a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f43898a.mo23155a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m23152a();
        }
    }

    /* renamed from: b */
    private C7511e m55974b(C15462a aVar, Map map) {
        C15480j e = aVar.mo42551e();
        C15476f d = aVar.mo42550d().mo42561d();
        C15463b[] b = C15463b.m55952b(aVar.mo42549c(), e, d);
        int i = 0;
        for (C15463b c : b) {
            i += c.mo42555c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C15463b bVar : b) {
            byte[] a = bVar.mo42554a();
            int c2 = bVar.mo42555c();
            m55973a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C15473d.m55965a(bArr, e, d, map);
    }

    /* renamed from: c */
    public C7511e mo42558c(C7508b bVar, Map map) {
        ChecksumException e;
        C15462a aVar = new C15462a(bVar);
        FormatException formatException = null;
        try {
            return m55974b(aVar, map);
        } catch (FormatException e2) {
            FormatException formatException2 = e2;
            e = null;
            formatException = formatException2;
            try {
                aVar.mo42552f();
                aVar.mo42553g(true);
                aVar.mo42551e();
                aVar.mo42550d();
                aVar.mo42548b();
                C7511e b = m55974b(aVar, map);
                b.mo22006m(new C15479i(true));
                return b;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (ChecksumException e3) {
            e = e3;
            aVar.mo42552f();
            aVar.mo42553g(true);
            aVar.mo42551e();
            aVar.mo42550d();
            aVar.mo42548b();
            C7511e b2 = m55974b(aVar, map);
            b2.mo22006m(new C15479i(true));
            return b2;
        }
    }
}
