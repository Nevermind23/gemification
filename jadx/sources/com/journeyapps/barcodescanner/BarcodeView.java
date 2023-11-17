package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.C5754d;
import java.util.HashMap;
import java.util.List;
import p174mb.C7165k;
import p416fd.C12843a;
import p416fd.C12844b;
import p416fd.C12848f;
import p416fd.C12849g;
import p416fd.C12850h;
import p416fd.C12851i;
import p416fd.C12854j;
import p416fd.C12863r;

public class BarcodeView extends C10650a {
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C10646b f30323E = C10646b.NONE;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C12843a f30324F = null;

    /* renamed from: G */
    private C12851i f30325G;

    /* renamed from: H */
    private C12849g f30326H;

    /* renamed from: I */
    private Handler f30327I;

    /* renamed from: J */
    private final Handler.Callback f30328J = new C10645a();

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    class C10645a implements Handler.Callback {
        C10645a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C7165k.zxing_decode_succeeded) {
                C12844b bVar = (C12844b) message.obj;
                if (!(bVar == null || BarcodeView.this.f30324F == null || BarcodeView.this.f30323E == C10646b.NONE)) {
                    BarcodeView.this.f30324F.mo27408b(bVar);
                    if (BarcodeView.this.f30323E == C10646b.SINGLE) {
                        BarcodeView.this.mo27375N();
                    }
                }
                return true;
            } else if (i == C7165k.zxing_decode_failed) {
                return true;
            } else {
                if (i != C7165k.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.f30324F == null || BarcodeView.this.f30323E == C10646b.NONE)) {
                    BarcodeView.this.f30324F.mo27407a(list);
                }
                return true;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$b */
    private enum C10646b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m38803K();
    }

    /* renamed from: G */
    private C12848f m38802G() {
        if (this.f30326H == null) {
            this.f30326H = mo27372H();
        }
        C12850h hVar = new C12850h();
        HashMap hashMap = new HashMap();
        hashMap.put(C5754d.NEED_RESULT_POINT_CALLBACK, hVar);
        C12848f a = this.f30326H.mo33511a(hashMap);
        hVar.mo33512b(a);
        return a;
    }

    /* renamed from: K */
    private void m38803K() {
        this.f30326H = new C12854j();
        this.f30327I = new Handler(this.f30328J);
    }

    /* renamed from: L */
    private void m38804L() {
        m38805M();
        if (this.f30323E != C10646b.NONE && mo27445t()) {
            C12851i iVar = new C12851i(getCameraInstance(), m38802G(), this.f30327I);
            this.f30325G = iVar;
            iVar.mo33514i(getPreviewFramingRect());
            this.f30325G.mo33516k();
        }
    }

    /* renamed from: M */
    private void m38805M() {
        C12851i iVar = this.f30325G;
        if (iVar != null) {
            iVar.mo33517l();
            this.f30325G = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public C12849g mo27372H() {
        return new C12854j();
    }

    /* renamed from: I */
    public void mo27373I(C12843a aVar) {
        this.f30323E = C10646b.CONTINUOUS;
        this.f30324F = aVar;
        m38804L();
    }

    /* renamed from: J */
    public void mo27374J(C12843a aVar) {
        this.f30323E = C10646b.SINGLE;
        this.f30324F = aVar;
        m38804L();
    }

    /* renamed from: N */
    public void mo27375N() {
        this.f30323E = C10646b.NONE;
        this.f30324F = null;
        m38805M();
    }

    public C12849g getDecoderFactory() {
        return this.f30326H;
    }

    public void setDecoderFactory(C12849g gVar) {
        C12863r.m48677a();
        this.f30326H = gVar;
        C12851i iVar = this.f30325G;
        if (iVar != null) {
            iVar.mo33515j(m38802G());
        }
    }

    /* renamed from: u */
    public void mo27378u() {
        m38805M();
        super.mo27378u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo27379x() {
        super.mo27379x();
        m38804L();
    }
}
