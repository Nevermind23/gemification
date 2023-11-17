package p779hr;

import android.content.DialogInterface;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.dialog.C13310d;

/* renamed from: hr.b */
public final class C25052b extends C13310d {

    /* renamed from: L */
    private C25051a f64406L;

    /* renamed from: f2 */
    public final void mo63490f2(C25051a aVar) {
        this.f64406L = aVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C25051a aVar = this.f64406L;
        if (aVar != null) {
            aVar.mo63489a(dialogInterface);
        }
    }
}
