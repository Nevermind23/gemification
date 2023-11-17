package hg1;

import android.support.p013v4.media.session.C0125b;
import fg1.C40949a;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Iterator;
import org.bouncycastle.util.encoders.C41955a;

/* renamed from: hg1.c */
public class C41265c extends BufferedWriter {

    /* renamed from: d */
    private final int f97282d;

    /* renamed from: e */
    private char[] f97283e = new char[64];

    public C41265c(Writer writer) {
        super(writer);
        String a = C40949a.m118735a();
        this.f97282d = a != null ? a.length() : 2;
    }

    /* renamed from: a */
    private void m119567a(byte[] bArr) {
        char[] cArr;
        int i;
        byte[] a = C41955a.m121932a(bArr);
        int i2 = 0;
        while (i2 < a.length) {
            int i3 = 0;
            while (true) {
                cArr = this.f97283e;
                if (i3 == cArr.length || (i = i2 + i3) >= a.length) {
                    write(cArr, 0, i3);
                    newLine();
                    i2 += this.f97283e.length;
                } else {
                    cArr[i3] = (char) a[i];
                    i3++;
                }
            }
            write(cArr, 0, i3);
            newLine();
            i2 += this.f97283e.length;
        }
    }

    /* renamed from: d */
    private void m119568d(String str) {
        write("-----END " + str + "-----");
        newLine();
    }

    /* renamed from: f */
    private void m119569f(String str) {
        write("-----BEGIN " + str + "-----");
        newLine();
    }

    /* renamed from: c */
    public void mo95728c(C41264b bVar) {
        C41263a a = bVar.mo95724a();
        m119569f(a.mo95727d());
        if (!a.mo95726c().isEmpty()) {
            Iterator it = a.mo95726c().iterator();
            if (!it.hasNext()) {
                newLine();
            } else {
                C0125b.m366a(it.next());
                throw null;
            }
        }
        m119567a(a.mo95725b());
        m119568d(a.mo95727d());
    }
}
