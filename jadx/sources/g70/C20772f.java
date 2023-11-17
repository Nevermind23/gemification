package g70;

import p337z7.C9221d;
import p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel;

/* renamed from: g70.f */
public final /* synthetic */ class C20772f implements C9221d {

    /* renamed from: a */
    public final /* synthetic */ QrScannerViewModel f55982a;

    public /* synthetic */ C20772f(QrScannerViewModel qrScannerViewModel) {
        this.f55982a = qrScannerViewModel;
    }

    public final void onFailure(Exception exc) {
        QrScannerViewModel.m73047ow(this.f55982a, exc);
    }
}
