package p625ud;

import java.util.concurrent.LinkedBlockingQueue;
import p374ce.C10396b;
import p570qd.C17486a;

/* renamed from: ud.a */
public class C18108a extends C18111c {

    /* renamed from: i */
    private LinkedBlockingQueue f51355i;

    /* renamed from: j */
    private C18109a f51356j;

    /* renamed from: k */
    private final int f51357k;

    /* renamed from: ud.a$a */
    public interface C18109a {
        /* renamed from: b */
        void mo43344b(byte[] bArr);
    }

    public C18108a(int i, C18109a aVar) {
        super(i, byte[].class);
        if (aVar != null) {
            this.f51356j = aVar;
            this.f51357k = 0;
            return;
        }
        this.f51355i = new LinkedBlockingQueue(i);
        this.f51357k = 1;
    }

    /* renamed from: j */
    public void mo45786j() {
        super.mo45786j();
        if (this.f51357k == 1) {
            this.f51355i.clear();
        }
    }

    /* renamed from: k */
    public void mo45787k(int i, C10396b bVar, C17486a aVar) {
        super.mo45787k(i, bVar, aVar);
        int c = mo45801c();
        for (int i2 = 0; i2 < mo45803e(); i2++) {
            if (this.f51357k == 0) {
                this.f51356j.mo43344b(new byte[c]);
            } else {
                this.f51355i.offer(new byte[c]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public byte[] mo45784g(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo45785h(byte[] bArr, boolean z) {
        if (z && bArr.length == mo45801c()) {
            if (this.f51357k == 0) {
                this.f51356j.mo43344b(bArr);
            } else {
                this.f51355i.offer(bArr);
            }
        }
    }
}
