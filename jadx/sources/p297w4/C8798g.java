package p297w4;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1505h;
import com.facebook.C2626d;
import com.facebook.FacebookException;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import p297w4.C8785c0;

/* renamed from: w4.g */
public class C8798g extends C1483c {

    /* renamed from: t */
    private Dialog f24691t;

    /* renamed from: w4.g$a */
    class C8799a implements C8785c0.C8792g {
        C8799a() {
        }

        /* renamed from: a */
        public void mo8426a(Bundle bundle, FacebookException facebookException) {
            C8798g.this.m32774D1(bundle, facebookException);
        }
    }

    /* renamed from: w4.g$b */
    class C8800b implements C8785c0.C8792g {
        C8800b() {
        }

        /* renamed from: a */
        public void mo8426a(Bundle bundle, FacebookException facebookException) {
            C8798g.this.m32775E1(bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public void m32774D1(Bundle bundle, FacebookException facebookException) {
        int i;
        C1505h activity = getActivity();
        Intent m = C8832s.m32889m(activity.getIntent(), bundle, facebookException);
        if (facebookException == null) {
            i = -1;
        } else {
            i = 0;
        }
        activity.setResult(i, m);
        activity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public void m32775E1(Bundle bundle) {
        C1505h activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: F1 */
    public void mo24228F1(Dialog dialog) {
        this.f24691t = dialog;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f24691t instanceof C8785c0) && isResumed()) {
            ((C8785c0) this.f24691t).mo24202s();
        }
    }

    public void onCreate(Bundle bundle) {
        C8785c0 c0Var;
        super.onCreate(bundle);
        if (this.f24691t == null) {
            C1505h activity = getActivity();
            Bundle u = C8832s.m32897u(activity.getIntent());
            if (!u.getBoolean("is_fallback", false)) {
                String string = u.getString(UrlHandler.ACTION);
                Bundle bundle2 = u.getBundle("params");
                if (C8769a0.m32644Q(string)) {
                    C8769a0.m32649V("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                c0Var = new C8785c0.C8790e(activity, string, bundle2).mo24216h(new C8799a()).mo8431a();
            } else {
                String string2 = u.getString(C11769i.C11770a.f34149l);
                if (C8769a0.m32644Q(string2)) {
                    C8769a0.m32649V("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                c0Var = C8806j.m32788A(activity, string2, String.format("fb%s://bridge/", new Object[]{C2626d.m10135f()}));
                c0Var.mo24206w(new C8800b());
            }
            this.f24691t = c0Var;
        }
    }

    public void onDestroyView() {
        if (mo4579n1() != null && getRetainInstance()) {
            mo4579n1().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.f24691t;
        if (dialog instanceof C8785c0) {
            ((C8785c0) dialog).mo24202s();
        }
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        if (this.f24691t == null) {
            m32774D1((Bundle) null, (FacebookException) null);
            mo4587x1(false);
        }
        return this.f24691t;
    }
}
