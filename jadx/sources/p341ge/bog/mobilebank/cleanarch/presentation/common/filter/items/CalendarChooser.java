package p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0218d;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.C5030m;
import com.google.android.material.datepicker.CalendarConstraints;
import d10.C19817a;
import d10.C19818b;
import d10.C19819c;
import g91.C32355x0;
import i10.C25100c;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogFlatButton;
import p341ge.bog.mobilebank.util.MinMaxDateValidator;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarChooser */
public class CalendarChooser extends LinearLayout {

    /* renamed from: d */
    private TextView f57513d;

    /* renamed from: e */
    private LinearLayout f57514e;

    /* renamed from: f */
    private View f57515f;

    /* renamed from: g */
    private C21518a f57516g;

    /* renamed from: h */
    private String f57517h;

    /* renamed from: i */
    private C5023l f57518i;

    /* renamed from: j */
    private C5023l f57519j;

    /* renamed from: k */
    private final SimpleDateFormat f57520k = new SimpleDateFormat("dd.MM.yyyy");

    /* renamed from: l */
    private final C5030m f57521l = new C19817a(this);

    /* renamed from: m */
    private final C5030m f57522m = new C19818b(this);

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarChooser$a */
    public interface C21518a {
        /* renamed from: k */
        void mo53731k(String str, String str2);
    }

    public CalendarChooser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            m69561h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m69558e(Long l) {
        String format = this.f57520k.format(new Date(l.longValue()));
        this.f57517h = format;
        this.f57513d.setText(format);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            this.f57519j.mo4576A1(fragmentManager, "Alert");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m69559f(Long l) {
        String format = this.f57520k.format(new Date(l.longValue()));
        TextView textView = this.f57513d;
        textView.setText(this.f57517h + " - " + format);
        C21518a aVar = this.f57516g;
        if (aVar != null) {
            aVar.mo53731k(this.f57517h, format);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m69560g(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            this.f57518i.mo4576A1(fragmentManager, "Alert");
        }
    }

    private FragmentManager getFragmentManager() {
        Activity a = C25100c.m80062a(this);
        if (a instanceof C0218d) {
            return ((C0218d) a).getSupportFragmentManager();
        }
        return null;
    }

    /* renamed from: h */
    private void m69561h() {
        View.inflate(getContext(), C10324m.calendar_chooser_layout, this);
        View findViewById = findViewById(C10322k.date_picker_container);
        this.f57513d = (TextView) findViewById(C10322k.f28839ha);
        this.f57514e = (LinearLayout) findViewById(C10322k.f28821b5);
        this.f57515f = findViewById(C10322k.f28886r4);
        Calendar instance = Calendar.getInstance();
        instance.set(11, instance.getMaximum(11));
        instance.set(12, instance.getMaximum(12));
        instance.set(13, instance.getMaximum(13));
        instance.set(14, instance.getMaximum(14));
        Calendar instance2 = Calendar.getInstance();
        instance2.add(2, -2);
        Calendar instance3 = Calendar.getInstance();
        instance3.add(1, -2);
        instance3.set(11, instance3.getMinimum(11));
        instance3.set(12, instance3.getMinimum(12));
        instance3.set(13, instance3.getMinimum(13));
        instance3.set(14, instance3.getMinimum(14));
        MinMaxDateValidator minMaxDateValidator = new MinMaxDateValidator(Long.valueOf(instance3.getTimeInMillis()), Long.valueOf(instance.getTimeInMillis()));
        CalendarConstraints a = new CalendarConstraints.C4986b().mo16156c(instance2.getTimeInMillis()).mo16157d(instance3.getTimeInMillis()).mo16155b(instance.getTimeInMillis()).mo16158e(minMaxDateValidator).mo16154a();
        CalendarConstraints a2 = new CalendarConstraints.C4986b().mo16156c(instance.getTimeInMillis()).mo16157d(instance3.getTimeInMillis()).mo16155b(instance.getTimeInMillis()).mo16158e(minMaxDateValidator).mo16154a();
        C5023l a3 = C5023l.C5029f.m19565c().mo16279h(C10328q.statement_calendar_chooser_start_date).mo16276e(a).mo16278g(Long.valueOf(instance2.getTimeInMillis())).mo16275a();
        C5023l a4 = C5023l.C5029f.m19565c().mo16279h(C10328q.statement_calendar_chooser_end_date).mo16276e(a2).mo16278g(Long.valueOf(instance.getTimeInMillis())).mo16275a();
        try {
            if (getContext() != null) {
                this.f57518i = a3;
                this.f57519j = a4;
                a3.mo16267J1(this.f57521l);
                this.f57519j.mo16267J1(this.f57522m);
                findViewById.setOnClickListener(new C19819c(this));
            }
        } catch (Exception e) {
            C10463g.m37989C("DatePicker crash + " + e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo53728d(int i, String str, int i2, int i3, View.OnClickListener onClickListener) {
        this.f57515f.setVisibility(0);
        BogFlatButton bogFlatButton = new BogFlatButton(getContext());
        bogFlatButton.setText(str, i2);
        if (i3 != -1) {
            bogFlatButton.setImage(i3);
        }
        bogFlatButton.setOnClickListener(onClickListener);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(C32355x0.m95516g(C10319h.bog_button_margin), 0, 0, 0);
        bogFlatButton.setLayoutParams(layoutParams);
        this.f57514e.addView(bogFlatButton, i);
    }

    public void setDateSelectedListener(C21518a aVar) {
        this.f57516g = aVar;
    }

    public void setStartDate(String str) {
        this.f57513d.setText(str);
    }
}
