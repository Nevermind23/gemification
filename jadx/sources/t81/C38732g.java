package t81;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import p341ge.bog.mobilebank.model.smsnotification.SMSNotification;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p90.C27338j4;

/* renamed from: t81.g */
public class C38732g extends C35651n1 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C27338j4 f92643d;

    /* renamed from: e */
    private SMSNotification f92644e;

    /* renamed from: f */
    private String f92645f;

    /* renamed from: t81.g$a */
    class C38733a implements CompoundButton.OnCheckedChangeListener {
        C38733a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C38732g.this.m113422k1();
            C38732g.this.f92643d.f69078i.setEnabled(z);
        }
    }

    /* renamed from: t81.g$b */
    class C38734b implements View.OnClickListener {
        C38734b() {
        }

        public void onClick(View view) {
            C38732g.this.f92643d.f69075f.setChecked(!C38732g.this.f92643d.f69075f.isChecked());
        }
    }

    /* renamed from: t81.g$c */
    class C38735c implements CompoundButton.OnCheckedChangeListener {
        C38735c() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C38732g.this.m113422k1();
        }
    }

    /* renamed from: t81.g$d */
    class C38736d implements View.OnClickListener {
        C38736d() {
        }

        public void onClick(View view) {
            C38732g.this.f92643d.f69078i.setChecked(!C38732g.this.f92643d.f69078i.isChecked());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public void m113422k1() {
        float f;
        String str;
        C27338j4 j4Var = this.f92643d;
        RelativeLayout relativeLayout = j4Var.f69077h;
        if (j4Var.f69075f.isChecked()) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        relativeLayout.setAlpha(f);
        SMSNotification sMSNotification = this.f92644e;
        if (sMSNotification != null) {
            String str2 = "Y";
            if (this.f92643d.f69075f.isChecked()) {
                str = str2;
            } else {
                str = "N";
            }
            sMSNotification.isActive = str;
            SMSNotification sMSNotification2 = this.f92644e;
            if (!this.f92643d.f69078i.isChecked()) {
                str2 = "N";
            }
            sMSNotification2.isAdditionalTextActive = str2;
        }
        try {
            ((SmsNotifManagerActivity) getActivity()).mo86378Q2();
        } catch (Exception unused) {
        }
    }

    /* renamed from: l1 */
    public void mo92365l1(SMSNotification sMSNotification, String str) {
        int i;
        this.f92644e = sMSNotification;
        this.f92645f = str;
        if (this.f92643d != null && getActivity() != null && sMSNotification != null) {
            this.f92643d.f69075f.setChecked(sMSNotification.isActive());
            this.f92643d.f69078i.setChecked(sMSNotification.isAdditionalTextActive());
            C27338j4 j4Var = this.f92643d;
            j4Var.f69078i.setEnabled(j4Var.f69075f.isChecked());
            m113422k1();
            this.f92643d.f69075f.setOnCheckedChangeListener(new C38733a());
            this.f92643d.f69076g.setOnClickListener(new C38734b());
            this.f92643d.f69078i.setOnCheckedChangeListener(new C38735c());
            this.f92643d.f69077h.setOnClickListener(new C38736d());
            RelativeLayout relativeLayout = this.f92643d.f69077h;
            int i2 = 0;
            if (sMSNotification.isAdditionalTextValid()) {
                i = 0;
            } else {
                i = 8;
            }
            relativeLayout.setVisibility(i);
            BigDividerView bigDividerView = this.f92643d.f69074e;
            if (!sMSNotification.isAdditionalTextValid()) {
                i2 = 8;
            }
            bigDividerView.setVisibility(i2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27338j4 d = C27338j4.m84662d(getLayoutInflater(), viewGroup, false);
        this.f92643d = d;
        return d.mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f92643d = null;
    }

    public void onStart() {
        super.onStart();
        try {
            ((SmsNotifManagerActivity) getActivity()).mo86379T2(true);
        } catch (Exception unused) {
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo92365l1(this.f92644e, this.f92645f);
    }
}
