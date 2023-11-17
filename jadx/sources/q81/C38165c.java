package q81;

import android.app.Activity;
import android.view.View;
import android.view.WindowManager;
import com.github.mikephil.charting.utils.Utils;
import g91.C32355x0;
import p341ge.bog.mobilebank.model.credit.BillInfo;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p90.C27463x2;

/* renamed from: q81.c */
public class C38165c extends C38160a implements View.OnClickListener {

    /* renamed from: h */
    private C27463x2 f91586h;

    /* renamed from: i */
    private Activity f91587i;

    /* renamed from: j */
    private Runnable f91588j;

    /* renamed from: k */
    private Runnable f91589k;

    /* renamed from: l */
    private CreditCardAccount f91590l;

    public C38165c(Activity activity, CreditCardAccount creditCardAccount) {
        super(activity);
        this.f91587i = activity;
        this.f91590l = creditCardAccount;
        C27463x2 d = C27463x2.m85160d(getLayoutInflater());
        this.f91586h = d;
        setContentView(d.mo3946b());
        if (getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int l = C32355x0.m95521l(activity);
            attributes.width = l - (l / 4);
            attributes.height = -2;
            getWindow().setAttributes(attributes);
        }
        this.f91586h.f70202f.setOnClickListener(this);
        this.f91586h.f70203g.setOnClickListener(this);
        if (m112301c(this.f91590l) > Utils.DOUBLE_EPSILON) {
            this.f91586h.f70201e.setVisibility(0);
            this.f91586h.f70203g.setVisibility(0);
            return;
        }
        this.f91586h.f70201e.setVisibility(8);
        this.f91586h.f70203g.setVisibility(8);
    }

    /* renamed from: c */
    private double m112301c(CreditCardAccount creditCardAccount) {
        BillInfo billInfo = creditCardAccount.getBillInfo();
        if (billInfo == null || billInfo.getFullPaymentDue() == null) {
            return Utils.DOUBLE_EPSILON;
        }
        return billInfo.getFullPaymentDue().doubleValue();
    }

    /* renamed from: d */
    public void mo91694d(Runnable runnable) {
        this.f91588j = runnable;
    }

    /* renamed from: e */
    public void mo91695e(Runnable runnable) {
        this.f91589k = runnable;
    }

    public void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        dismiss();
        C27463x2 x2Var = this.f91586h;
        if (x2Var.f70202f == view && (runnable2 = this.f91588j) != null) {
            runnable2.run();
        } else if (x2Var.f70203g == view && (runnable = this.f91589k) != null) {
            runnable.run();
        }
    }
}
