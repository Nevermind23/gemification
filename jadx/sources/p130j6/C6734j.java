package p130j6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.FragmentManager;
import p182n6.C7264i;

/* renamed from: j6.j */
public class C6734j extends C1483c {

    /* renamed from: t */
    private Dialog f20303t;

    /* renamed from: u */
    private DialogInterface.OnCancelListener f20304u;

    /* renamed from: v */
    private Dialog f20305v;

    /* renamed from: B1 */
    public static C6734j m26252B1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C6734j jVar = new C6734j();
        Dialog dialog2 = (Dialog) C7264i.m27903l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        jVar.f20303t = dialog2;
        if (onCancelListener != null) {
            jVar.f20304u = onCancelListener;
        }
        return jVar;
    }

    /* renamed from: A1 */
    public void mo4576A1(FragmentManager fragmentManager, String str) {
        super.mo4576A1(fragmentManager, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20304u;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        Dialog dialog = this.f20303t;
        if (dialog != null) {
            return dialog;
        }
        mo4587x1(false);
        if (this.f20305v == null) {
            this.f20305v = new AlertDialog.Builder((Context) C7264i.m27902k(getContext())).create();
        }
        return this.f20305v;
    }
}
