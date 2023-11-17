package com.medallia.digital.mobilesdk;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.medallia.digital.mobilesdk.C11221y3;

public class MedalliaFullFormActivity extends C10820g0 {

    /* renamed from: l */
    private Toolbar f30576l;

    /* renamed from: m */
    private TextView f30577m;

    /* renamed from: i */
    private String m38968i() {
        C11238z3 localization;
        String string = getString(C10706R.string.back);
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (localization = C11208y0.m41106c().mo29204a().getLocalization()) == null) {
                return string;
            }
            ResourceContract f = localization.mo29251f();
            String a = C11221y3.m41127d().mo29210a(f != null ? f.getLocalUrl() : null, this.f30976a.getFormLanguage(), C11221y3.C11224c.BACK, (C11221y3.C11222a) null);
            return !TextUtils.isEmpty(a) ? a : string;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return string;
        }
    }

    /* renamed from: j */
    private void m38969j() {
        C10984l5 l5Var;
        C11013n2 n2Var = this.f30976a;
        if (n2Var != null) {
            String title = n2Var.getTitle();
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
            if (!TextUtils.isEmpty(title)) {
                this.f30577m.setText(title);
            }
            if (!TextUtils.isEmpty(titleBackgroundColor)) {
                try {
                    this.f30576l.setBackgroundColor(Color.parseColor(titleBackgroundColor));
                } catch (Exception unused2) {
                    C10735b4.m39114f("Error on set title background color");
                }
            }
            if (!TextUtils.isEmpty(titleTextColor)) {
                try {
                    this.f30577m.setTextColor(Color.parseColor(titleTextColor));
                    Drawable navigationIcon = this.f30576l.getNavigationIcon();
                    if (navigationIcon != null) {
                        navigationIcon.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.MULTIPLY);
                    }
                } catch (Exception unused3) {
                    C10735b4.m39114f("Error on set title text color");
                }
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
        setContentView(C10706R.layout.medallia_activity_full_form);
        Toolbar toolbar = (Toolbar) findViewById(C10706R.C10708id.medallia_toolbar);
        this.f30576l = toolbar;
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo566t(false);
            getSupportActionBar().mo565s(true);
            getSupportActionBar().mo568v(m38968i());
        }
        this.f30577m = (TextView) findViewById(C10706R.C10708id.medallia_title_text_view);
        m38969j();
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

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        mo28326e();
        return true;
    }

    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
