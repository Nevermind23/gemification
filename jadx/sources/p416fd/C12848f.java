package p416fd;

import com.google.zxing.C5753c;
import com.google.zxing.C5758h;
import com.google.zxing.C5759i;
import com.google.zxing.C5763l;
import com.google.zxing.C5764m;
import com.google.zxing.C5766o;
import com.google.zxing.C5767p;
import java.util.ArrayList;
import java.util.List;
import p200ob.C7516j;

/* renamed from: fd.f */
public class C12848f implements C5767p {

    /* renamed from: a */
    private C5763l f37973a;

    /* renamed from: b */
    private List f37974b = new ArrayList();

    public C12848f(C5763l lVar) {
        this.f37973a = lVar;
    }

    /* renamed from: a */
    public void mo18906a(C5766o oVar) {
        this.f37974b.add(oVar);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5764m mo33507b(C5753c cVar) {
        this.f37974b.clear();
        try {
            C5763l lVar = this.f37973a;
            if (lVar instanceof C5759i) {
                C5764m e = ((C5759i) lVar).mo18889e(cVar);
                this.f37973a.mo18886a();
                return e;
            }
            C5764m c = lVar.mo18888c(cVar);
            this.f37973a.mo18886a();
            return c;
        } catch (Exception unused) {
            this.f37973a.mo18886a();
            return null;
        } catch (Throwable th) {
            this.f37973a.mo18886a();
            throw th;
        }
    }

    /* renamed from: c */
    public C5764m mo33508c(C5758h hVar) {
        return mo33507b(mo33510e(hVar));
    }

    /* renamed from: d */
    public List mo33509d() {
        return new ArrayList(this.f37974b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C5753c mo33510e(C5758h hVar) {
        return new C5753c(new C7516j(hVar));
    }
}
