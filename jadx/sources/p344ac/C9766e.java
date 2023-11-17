package p344ac;

import com.google.zxing.NotFoundException;
import p200ob.C7507a;

/* renamed from: ac.e */
final class C9766e extends C9770i {

    /* renamed from: c */
    private final String f26548c;

    /* renamed from: d */
    private final String f26549d;

    C9766e(C7507a aVar, String str, String str2) {
        super(aVar);
        this.f26548c = str2;
        this.f26549d = str;
    }

    /* renamed from: k */
    private void m35917k(StringBuilder sb, int i) {
        int f = mo26222b().mo26246f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f26548c);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    /* renamed from: d */
    public String mo26218d() {
        if (mo26223c().mo21961l() == 84) {
            StringBuilder sb = new StringBuilder();
            mo26219f(sb, 8);
            mo26221j(sb, 48, 20);
            m35917k(sb, 68);
            return sb.toString();
        }
        throw NotFoundException.m23155a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo26216h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f26549d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo26217i(int i) {
        return i % 100000;
    }
}
