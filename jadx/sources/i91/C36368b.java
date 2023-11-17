package i91;

import java.util.Comparator;
import p543oe.C17181b;

/* renamed from: i91.b */
public class C36368b extends C36367a {

    /* renamed from: i */
    public static Comparator f87744i = new C36369a();

    /* renamed from: c */
    private C17181b f87745c;

    /* renamed from: d */
    private int f87746d;

    /* renamed from: e */
    private StringBuffer f87747e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f87748f;

    /* renamed from: g */
    private int f87749g;

    /* renamed from: h */
    private String f87750h;

    /* renamed from: i91.b$a */
    class C36369a implements Comparator {
        C36369a() {
        }

        /* renamed from: a */
        public int compare(C36368b bVar, C36368b bVar2) {
            return bVar.f87748f - bVar2.f87748f;
        }
    }

    public C36368b(String str, String str2, String str3) {
        this.f87750h = str3;
        mo89099c(str);
        mo89100d(str2);
        mo89109n(new C17181b(str.replace(" ", "")));
        mo89110o(0);
        StringBuffer stringBuffer = new StringBuffer();
        this.f87747e = stringBuffer;
        stringBuffer.delete(0, stringBuffer.length());
        mo89108m(-1);
        mo89107l(0);
    }

    /* renamed from: f */
    public void mo89101f() {
        StringBuffer stringBuffer = this.f87747e;
        stringBuffer.delete(0, stringBuffer.length());
    }

    /* renamed from: g */
    public StringBuffer mo89102g() {
        return this.f87747e;
    }

    /* renamed from: h */
    public C17181b mo89103h() {
        return this.f87745c;
    }

    /* renamed from: i */
    public String mo89104i() {
        return this.f87750h;
    }

    /* renamed from: j */
    public int mo89105j() {
        return this.f87746d;
    }

    /* renamed from: k */
    public void mo89106k(String str) {
        StringBuffer stringBuffer = this.f87747e;
        stringBuffer.delete(0, stringBuffer.length());
        this.f87747e.append(str);
    }

    /* renamed from: l */
    public void mo89107l(int i) {
        this.f87749g = i;
    }

    /* renamed from: m */
    public void mo89108m(int i) {
        this.f87748f = i;
    }

    /* renamed from: n */
    public void mo89109n(C17181b bVar) {
        this.f87745c = bVar;
    }

    /* renamed from: o */
    public void mo89110o(int i) {
        this.f87746d = i;
    }
}
