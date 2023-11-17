package p416fd;

import com.google.zxing.C5753c;
import com.google.zxing.C5758h;
import com.google.zxing.C5763l;
import p200ob.C7516j;

/* renamed from: fd.l */
public class C12856l extends C12848f {

    /* renamed from: c */
    private boolean f37993c = true;

    public C12856l(C5763l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C5753c mo33510e(C5758h hVar) {
        if (this.f37993c) {
            this.f37993c = false;
            return new C5753c(new C7516j(hVar.mo18880e()));
        }
        this.f37993c = true;
        return new C5753c(new C7516j(hVar));
    }
}
