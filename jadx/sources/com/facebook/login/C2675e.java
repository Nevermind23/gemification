package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.facebook.login.LoginClient;
import p258t4.C8365b;
import p258t4.C8366c;

/* renamed from: com.facebook.login.e */
public class C2675e extends Fragment {

    /* renamed from: d */
    private String f8388d;

    /* renamed from: e */
    private LoginClient f8389e;

    /* renamed from: f */
    private LoginClient.Request f8390f;

    /* renamed from: com.facebook.login.e$a */
    class C2676a implements LoginClient.C2667c {
        C2676a() {
        }

        /* renamed from: a */
        public void mo8414a(LoginClient.Result result) {
            C2675e.this.m10399m1(result);
        }
    }

    /* renamed from: com.facebook.login.e$b */
    class C2677b implements LoginClient.C2666b {

        /* renamed from: a */
        final /* synthetic */ View f8392a;

        C2677b(View view) {
            this.f8392a = view;
        }

        /* renamed from: a */
        public void mo8412a() {
            this.f8392a.setVisibility(0);
        }

        /* renamed from: b */
        public void mo8413b() {
            this.f8392a.setVisibility(8);
        }
    }

    /* renamed from: l1 */
    private void m10398l1(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f8388d = callingActivity.getPackageName();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public void m10399m1(LoginClient.Result result) {
        int i;
        this.f8390f = null;
        if (result.f8345d == LoginClient.Result.C2664b.CANCEL) {
            i = 0;
        } else {
            i = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, intent);
            getActivity().finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i1 */
    public LoginClient mo8444i1() {
        return new LoginClient((Fragment) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public int mo8445j1() {
        return C8366c.com_facebook_login_fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public LoginClient mo8446k1() {
        return this.f8389e;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f8389e.mo8383z(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f8389e = loginClient;
            loginClient.mo8361B(this);
        } else {
            this.f8389e = mo8444i1();
        }
        this.f8389e.mo8362C(new C2676a());
        C1505h activity = getActivity();
        if (activity != null) {
            m10398l1(activity);
            Intent intent = activity.getIntent();
            if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
                this.f8390f = (LoginClient.Request) bundleExtra.getParcelable("request");
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo8445j1(), viewGroup, false);
        this.f8389e.mo8360A(new C2677b(inflate.findViewById(C8365b.com_facebook_login_fragment_progress_bar)));
        return inflate;
    }

    public void onDestroy() {
        this.f8389e.mo8368d();
        super.onDestroy();
    }

    public void onPause() {
        View view;
        super.onPause();
        if (getView() == null) {
            view = null;
        } else {
            view = getView().findViewById(C8365b.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f8388d == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        this.f8389e.mo8363D(this.f8390f);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f8389e);
    }
}
