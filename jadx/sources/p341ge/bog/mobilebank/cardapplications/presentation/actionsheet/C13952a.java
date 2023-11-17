package p341ge.bog.mobilebank.cardapplications.presentation.actionsheet;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.a */
public final /* synthetic */ class C13952a implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ AddressChooserActionSheet f41338d;

    public /* synthetic */ C13952a(AddressChooserActionSheet addressChooserActionSheet) {
        this.f41338d = addressChooserActionSheet;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return AddressChooserActionSheet.m51898p2(this.f41338d, dialogInterface, i, keyEvent);
    }
}
