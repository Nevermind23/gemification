package q81;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import p366bk.C10324m;
import p366bk.C10329r;

/* renamed from: q81.a0 */
public class C38162a0 extends Dialog {
    public C38162a0(Context context) {
        super(context, C10329r.ProgressBarDialog);
    }

    /* renamed from: a */
    public static C38162a0 m112290a(Context context) {
        C38162a0 a0Var = new C38162a0(context);
        a0Var.requestWindowFeature(1);
        a0Var.setContentView(C10324m.dialog_progress_bar);
        Window window = a0Var.getWindow();
        window.setLayout(-1, -1);
        window.clearFlags(2);
        window.setBackgroundDrawable(new ColorDrawable(0));
        a0Var.setCancelable(false);
        return a0Var;
    }
}
