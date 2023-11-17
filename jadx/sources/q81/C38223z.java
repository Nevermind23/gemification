package q81;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0214c;
import androidx.fragment.app.C1483c;
import p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.PlusActivationActivity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: q81.z */
public class C38223z extends C1483c {
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f91705t;

    /* renamed from: q81.z$a */
    class C38224a implements View.OnClickListener {
        C38224a() {
        }

        public void onClick(View view) {
            C38223z.this.mo4577k1();
            PreferencesApiManager.getInstance().setPlusActivationDialogShown(C38223z.this.f91705t);
            PlusActivationActivity.m104982K2(C38223z.this.getActivity());
        }
    }

    /* renamed from: q81.z$b */
    class C38225b implements View.OnClickListener {
        C38225b() {
        }

        public void onClick(View view) {
            C38223z.this.mo4577k1();
            PreferencesApiManager.getInstance().setPlusActivationDialogShown(C38223z.this.f91705t);
        }
    }

    /* renamed from: C1 */
    public static C38223z m112426C1(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("USER_NAME", str);
        C38223z zVar = new C38223z();
        zVar.setArguments(bundle);
        return zVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f91705t = getArguments().getString("USER_NAME");
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(C10324m.dialog_plus_offer, (ViewGroup) null);
        inflate.findViewById(C10322k.f28847im).setOnClickListener(new C38224a());
        inflate.findViewById(C10322k.f28716D5).setOnClickListener(new C38225b());
        aVar.setView(inflate);
        return aVar.create();
    }
}
