package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30543ba;
import a81.C30557ca;
import a81.C30571da;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import g91.C32290b1;
import g91.C32297d;
import gd1.C40992a;
import hd1.C41205b;
import p189o0.C7357a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10313b;
import p366bk.C10328q;
import p843nw.C26620c;
import p843nw.C26623f;
import p90.C27462x1;

/* renamed from: ge.bog.mobilebank.ui.activities.RenameAccountActivity */
public class RenameAccountActivity extends C35419i0 implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C27462x1 f85434G;

    /* renamed from: H */
    String f85435H;

    /* renamed from: I */
    String f85436I;

    /* renamed from: J */
    long f85437J;

    /* renamed from: K */
    private int f85438K = 3;

    /* renamed from: L */
    private String f85439L;

    /* renamed from: M */
    C26620c f85440M;

    /* renamed from: N */
    C26623f f85441N;

    /* renamed from: O */
    protected BankApi f85442O;

    /* renamed from: P */
    protected Client f85443P;

    /* renamed from: ge.bog.mobilebank.ui.activities.RenameAccountActivity$a */
    class C35315a implements Runnable {
        C35315a() {
        }

        public void run() {
            C32290b1.m95116f(RenameAccountActivity.this.getApplication(), RenameAccountActivity.this.f85434G.f70198f.getEditText());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RenameAccountActivity$b */
    class C35316b extends RestCallback {
        C35316b() {
        }

        public void onEnqueue(C41205b bVar) {
            RenameAccountActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            RenameAccountActivity renameAccountActivity = RenameAccountActivity.this;
            C32297d.m95154b(renameAccountActivity, renameAccountActivity.getString(C10328q.common_text_acc_name_didnt_change));
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                RenameAccountActivity.this.f85443P.requestAccountLovs(true, false);
                RenameAccountActivity.this.m104743I2();
                return;
            }
            RenameAccountActivity renameAccountActivity = RenameAccountActivity.this;
            C32297d.m95154b(renameAccountActivity, renameAccountActivity.getString(C10328q.common_text_acc_name_didnt_change));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RenameAccountActivity$c */
    class C35317c extends RestCallback {
        C35317c() {
        }

        public void onEnqueue(C41205b bVar) {
            RenameAccountActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            RenameAccountActivity renameAccountActivity = RenameAccountActivity.this;
            C32297d.m95154b(renameAccountActivity, renameAccountActivity.getString(C10328q.common_text_acc_name_didnt_change));
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                RenameAccountActivity.this.f85443P.requestAccountLovs(true, false);
                RenameAccountActivity.this.m104743I2();
                return;
            }
            RenameAccountActivity renameAccountActivity = RenameAccountActivity.this;
            C32297d.m95154b(renameAccountActivity, renameAccountActivity.getString(C10328q.common_text_acc_name_didnt_change));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.RenameAccountActivity$d */
    class C35318d extends RestCallback {
        C35318d() {
        }

        public void onEnqueue(C41205b bVar) {
            RenameAccountActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            RenameAccountActivity renameAccountActivity = RenameAccountActivity.this;
            C32297d.m95154b(renameAccountActivity, renameAccountActivity.getString(C10328q.common_text_acc_name_didnt_change));
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (bankApiResponse.isSuccess()) {
                RenameAccountActivity.this.f85443P.requestAccountLovs(true, false);
                RenameAccountActivity.this.m104743I2();
                return;
            }
            RenameAccountActivity renameAccountActivity = RenameAccountActivity.this;
            C32297d.m95154b(renameAccountActivity, renameAccountActivity.getString(C10328q.common_text_acc_name_didnt_change));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void m104741G2(Throwable th) {
        C32297d.m95154b(this, getString(C10328q.common_text_acc_name_didnt_change));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void m104742H2(Throwable th) {
        C32297d.m95154b(this, getString(C10328q.common_text_acc_name_didnt_change));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public void m104743I2() {
        C7357a.m28044b(this).mo21731d(new Intent("ge.bog.mobilebank.products.presentation.products.refresh_products"));
        Intent intent = new Intent();
        intent.putExtra("ACCOUNT_NAME", this.f85434G.f70198f.getValue());
        intent.putExtra("RENAME_TYPE", getIntent().getIntExtra("RENAME_TYPE", -1));
        setResult(-1, intent);
        finish();
    }

    /* renamed from: J2 */
    public static void m104744J2(Activity activity, String str, String str2, int i, long j, int i2) {
        Intent intent = new Intent(activity, RenameAccountActivity.class);
        intent.putExtra("ACCOUNT_NAME", str);
        intent.putExtra("ACC_UNIQUE_KEY", j);
        intent.putExtra("ACC_TYPE", str2);
        intent.putExtra("RENAME_TYPE", i);
        intent.putExtra("RENAMTE_HINT_TEXT", i2);
        activity.startActivityForResult(intent, 73);
    }

    /* renamed from: K2 */
    public static void m104745K2(C35651n1 n1Var, String str, String str2, int i, long j, int i2) {
        Intent intent = new Intent(n1Var.getContext(), RenameAccountActivity.class);
        intent.putExtra("ACCOUNT_NAME", str);
        intent.putExtra("ACC_UNIQUE_KEY", j);
        intent.putExtra("ACC_TYPE", str2);
        intent.putExtra("RENAME_TYPE", i);
        intent.putExtra("RENAMTE_HINT_TEXT", i2);
        n1Var.startActivityForResult(intent, 73);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27462x1 d = C27462x1.m85155d(getLayoutInflater());
        this.f85434G = d;
        setContentView((View) d.mo3946b());
        overridePendingTransition(C10313b.slide_in_up, 0);
        this.f85434G.f70197e.setOnClickListener(this);
        this.f85434G.f70199g.setOnClickListener(this);
        this.f85435H = getIntent().getStringExtra("ACCOUNT_NAME");
        this.f85437J = getIntent().getLongExtra("ACC_UNIQUE_KEY", -1);
        this.f85436I = getIntent().getStringExtra("ACC_TYPE");
        this.f85438K = getIntent().getIntExtra("RENAME_TYPE", -1);
        this.f85439L = getString(getIntent().getIntExtra("RENAMTE_HINT_TEXT", C10328q.common_text_account_name));
        String str = this.f85435H;
        if (str != null) {
            this.f85434G.f70198f.setValue(str);
        }
        getWindow().setSoftInputMode(4);
        this.f85434G.f70198f.getEditText().post(new C35315a());
        this.f85434G.f70198f.setEditTextHintFocused(this.f85439L);
        this.f85434G.f70198f.setEditTextUnfocusedHintText(this.f85439L);
    }

    public void onClick(View view) {
        C27462x1 x1Var = this.f85434G;
        if (x1Var.f70197e == view) {
            finish();
        } else if (x1Var.f70199g == view) {
            int i = this.f85438K;
            if (i == 3) {
                this.f85442O.setLoanName(x1Var.f70198f.getValue(), this.f85437J, this.f85436I, new C35316b());
            } else if (i == 4) {
                this.f85442O.setDepositName(this.f85437J, x1Var.f70198f.getValue(), new C35317c());
            } else if (i == 1) {
                mo86438k1(this.f85440M.mo65874a(this.f85437J, x1Var.f70198f.getValue()).mo94906z(C40992a.m118827a()).mo94888G(new C30543ba(this), new C30557ca(this)));
            } else if (i == 2) {
                this.f85442O.changeAcctName(this.f85437J, x1Var.f70198f.getValue(), new C35318d());
            } else if (i == 6) {
                mo86438k1(this.f85441N.mo65877a(this.f85437J, x1Var.f70198f.getValue()).mo94906z(C40992a.m118827a()).mo94888G(new C30543ba(this), new C30571da(this)));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, C10313b.slide_out_up);
    }
}
