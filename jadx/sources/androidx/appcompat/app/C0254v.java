package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.C1483c;

/* renamed from: androidx.appcompat.app.v */
public class C0254v extends C1483c {
    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        return new C0253u(getContext(), mo4580o1());
    }

    /* renamed from: z1 */
    public void mo711z1(Dialog dialog, int i) {
        if (dialog instanceof C0253u) {
            C0253u uVar = (C0253u) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            uVar.mo707h(1);
            return;
        }
        super.mo711z1(dialog, i);
    }
}
