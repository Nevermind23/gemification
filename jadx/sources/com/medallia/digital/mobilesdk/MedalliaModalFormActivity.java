package com.medallia.digital.mobilesdk;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.medallia.digital.mobilesdk.C11221y3;

public class MedalliaModalFormActivity extends C10820g0 {

    /* renamed from: l */
    private ImageView f30578l;

    /* renamed from: m */
    private TextView f30579m;

    /* renamed from: com.medallia.digital.mobilesdk.MedalliaModalFormActivity$a */
    class C10699a implements View.OnClickListener {
        C10699a() {
        }

        public void onClick(View view) {
            MedalliaModalFormActivity.this.mo28326e();
        }
    }

    /* renamed from: i */
    private void m38973i() {
        this.f30578l.setOnClickListener(new C10699a());
    }

    /* renamed from: j */
    private void m38974j() {
        C11238z3 localization;
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (localization = C11208y0.m41106c().mo29204a().getLocalization()) != null) {
                ResourceContract f = localization.mo29251f();
                String a = C11221y3.m41127d().mo29210a(f != null ? f.getLocalUrl() : null, this.f30976a.getFormLanguage(), C11221y3.C11224c.CLOSE, (C11221y3.C11222a) null);
                if (!TextUtils.isEmpty(a)) {
                    this.f30578l.setContentDescription(a);
                }
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: k */
    private void m38975k() {
        C10984l5 l5Var;
        this.f30579m.setText(this.f30976a.getTitle());
        String titleTextColor = this.f30976a.getTitleTextColor();
        String titleBackgroundColor = this.f30976a.getTitleBackgroundColor();
        try {
            if (this.f30976a.isDarkModeEnabled() && (l5Var = this.f30983h) != null) {
                titleBackgroundColor = l5Var.mo28698b().mo28240b();
                titleTextColor = this.f30983h.mo28699c().mo29235b();
            }
        } catch (Exception unused) {
            C10735b4.m39114f("Error on set title text and background dark mode color");
        }
        if (!TextUtils.isEmpty(titleTextColor)) {
            try {
                this.f30579m.setTextColor(Color.parseColor(titleTextColor));
                this.f30578l.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.SRC_IN);
            } catch (Exception unused2) {
                C10735b4.m39114f("Error on set title text color");
            }
        }
        if (!TextUtils.isEmpty(titleBackgroundColor)) {
            try {
                this.f30579m.setBackgroundColor(Color.parseColor(titleBackgroundColor));
            } catch (Exception unused3) {
                C10735b4.m39114f("Error on set title background color");
            }
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo27922a() {
        super.mo27922a();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo27923b() {
        super.mo27923b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo27924f() {
        setContentView(C10706R.layout.medallia_activity_modal_form);
        this.f30578l = (ImageView) findViewById(C10706R.C10708id.medallia_modal_close_button);
        this.f30579m = (TextView) findViewById(C10706R.C10708id.medallia_typ_form_title);
        m38974j();
        m38975k();
        m38973i();
    }

    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    public void mediaCaptureResult(String str) {
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onClose() {
        super.onClose();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
