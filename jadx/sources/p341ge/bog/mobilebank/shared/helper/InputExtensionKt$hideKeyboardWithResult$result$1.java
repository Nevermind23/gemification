package p341ge.bog.mobilebank.shared.helper;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.shared.helper.InputExtensionKt$hideKeyboardWithResult$result$1 */
public final class InputExtensionKt$hideKeyboardWithResult$result$1 extends ResultReceiver {

    /* renamed from: d */
    final /* synthetic */ C43064a f83740d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InputExtensionKt$hideKeyboardWithResult$result$1(C43064a aVar) {
        super((Handler) null);
        this.f83740d = aVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == 1 || i == 3) {
            this.f83740d.invoke();
        }
    }
}
