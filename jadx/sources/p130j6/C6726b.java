package p130j6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p182n6.C7264i;

/* renamed from: j6.b */
public class C6726b extends DialogFragment {

    /* renamed from: d */
    private Dialog f20299d;

    /* renamed from: e */
    private DialogInterface.OnCancelListener f20300e;

    /* renamed from: f */
    private Dialog f20301f;

    /* renamed from: a */
    public static C6726b m26245a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C6726b bVar = new C6726b();
        Dialog dialog2 = (Dialog) C7264i.m27903l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f20299d = dialog2;
        if (onCancelListener != null) {
            bVar.f20300e = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20300e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f20299d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f20301f == null) {
            this.f20301f = new AlertDialog.Builder((Context) C7264i.m27902k(getActivity())).create();
        }
        return this.f20301f;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
