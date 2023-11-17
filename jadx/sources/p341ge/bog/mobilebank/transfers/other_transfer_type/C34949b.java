package p341ge.bog.mobilebank.transfers.other_transfer_type;

import a81.C30772sa;
import android.content.Context;
import b71.C31135a;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.b */
public abstract class C34949b extends C30772sa {

    /* renamed from: F */
    private boolean f84376F = false;

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.b$a */
    class C34950a implements C0001b {
        C34950a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34949b.this.mo37460R0();
        }
    }

    C34949b() {
        m102770O0();
    }

    /* renamed from: O0 */
    private void m102770O0() {
        addOnContextAvailableListener(new C34950a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84376F) {
            this.f84376F = true;
            ((C31135a) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32386E0((OtherTransferTypeListActivity) C18157e.m62250a(this));
        }
    }
}
