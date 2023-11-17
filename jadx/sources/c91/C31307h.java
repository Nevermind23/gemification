package c91;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.C5030m;
import com.google.android.material.datepicker.CalendarConstraints;
import g91.C32319m;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p341ge.bog.mobilebank.util.MinMaxDateValidator;
import p366bk.C10320i;

/* renamed from: c91.h */
public class C31307h extends C31303f {

    /* renamed from: A */
    private View.OnClickListener f77738A = new C31309b();

    /* renamed from: B */
    private final C5030m f77739B = new C31306g(this);

    /* renamed from: c91.h$a */
    class C31308a implements Runnable {
        C31308a() {
        }

        public void run() {
            if (TextUtils.isEmpty(C31307h.this.mo71611z1())) {
                C31307h.this.m92960u2();
            }
        }
    }

    /* renamed from: c91.h$b */
    class C31309b implements View.OnClickListener {
        C31309b() {
        }

        public void onClick(View view) {
            C31307h.this.m92960u2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void m92959t2(Long l) {
        mo71717U1(l + "");
        this.f77882e.getEditText().setText(C32319m.m95297d(l.longValue(), "dd.MM.yyyy"));
        this.f77883f.mo87965p3(true);
        C35862c cVar = this.f77883f;
        if (cVar instanceof AdvancedWizardActivity) {
            ((AdvancedWizardActivity) cVar).mo87835L3(mo71734s1());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public void m92960u2() {
        Long l;
        if (getContext() != null) {
            mo71729m1();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                currentTimeMillis = Long.parseLong(mo71611z1());
            } catch (Exception unused) {
                if (mo71707D1().getMinDate() != 0) {
                    currentTimeMillis = mo71707D1().getMinDate();
                }
            }
            CalendarConstraints.C4986b bVar = new CalendarConstraints.C4986b();
            bVar.mo16156c(currentTimeMillis);
            Long l2 = null;
            if (mo71707D1().getMinDate() != 0) {
                l = Long.valueOf(mo71707D1().getMinDate());
            } else {
                l = null;
            }
            if (l != null) {
                bVar.mo16157d(mo71707D1().getMinDate());
            }
            if (mo71707D1().getMaxDate() != 0) {
                l2 = Long.valueOf(mo71707D1().getMaxDate());
            }
            if (l2 != null && (l == null || l2.longValue() > l.longValue())) {
                bVar.mo16155b(mo71707D1().getMaxDate());
            }
            bVar.mo16158e(new MinMaxDateValidator(l, l2));
            C5023l a = C5023l.C5029f.m19565c().mo16276e(bVar.mo16154a()).mo16275a();
            a.mo16267J1(this.f77739B);
            a.mo4576A1(getChildFragmentManager(), "Alert");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo71729m1();
        mo71559o2();
        mo71607t1().setInputType(mo71707D1().getInputType());
        this.f77882e.setRightDrawable(C10320i.ic_calendar, this.f77738A);
        this.f77882e.setOnClickListener(this.f77738A);
        this.f77882e.getEditText().setText(mo71707D1().getVisibleInput());
        this.f77882e.getEditText().setOnClickListener(this.f77738A);
        this.f77882e.getEditText().requestFocus();
        this.f77882e.getEditText().setFocusable(false);
        if (!TextUtils.isEmpty(mo71707D1().getValue())) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(Long.valueOf(mo71707D1().getValue()).longValue());
            this.f77882e.setValue(new SimpleDateFormat("dd.MM.yyyy").format(gregorianCalendar.getTime()));
        }
        view.post(new C31308a());
    }
}
