package t81;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import g91.C32335t0;
import java.util.ArrayList;
import java.util.Iterator;
import n41.C37353c;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.model.smsnotification.SMSType;
import p341ge.bog.mobilebank.model.smsnotification.SMSTypeGroup;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27328i4;
import r90.C27950a;

/* renamed from: t81.c */
public class C38721c extends C35651n1 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C27328i4 f92617d;

    /* renamed from: e */
    private SMSContact f92618e;

    /* renamed from: f */
    private String f92619f;

    /* renamed from: t81.c$a */
    class C38722a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SMSContact f92620a;

        C38722a(SMSContact sMSContact) {
            this.f92620a = sMSContact;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C38721c.this.m113407m1(this.f92620a.typeGroups);
        }
    }

    /* renamed from: t81.c$b */
    class C38723b implements View.OnClickListener {
        C38723b() {
        }

        public void onClick(View view) {
            C38721c.this.f92617d.f68979i.setChecked(!C38721c.this.f92617d.f68979i.isChecked());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public void m113407m1(ArrayList arrayList) {
        float f;
        String str;
        C27328i4 i4Var = this.f92617d;
        FrameLayout frameLayout = i4Var.f68977g;
        float f2 = 1.0f;
        if (i4Var.f68979i.isChecked()) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        frameLayout.setAlpha(f);
        C27328i4 i4Var2 = this.f92617d;
        View view = i4Var2.f68976f;
        if (!i4Var2.f68979i.isChecked()) {
            f2 = 0.4f;
        }
        view.setAlpha(f2);
        m113410p1(arrayList);
        SMSContact sMSContact = this.f92618e;
        if (sMSContact != null) {
            if (this.f92617d.f68979i.isChecked()) {
                str = "Y";
            } else {
                str = "N";
            }
            sMSContact.isActive = str;
            int i = C10318g.orange_txt_color;
            if (C32335t0.m95361f() == 2) {
                i = C10318g.color_accent_wealth;
            } else if (C32335t0.m95361f() == 1) {
                i = C10318g.color_accent_solo;
            }
            BogTextView bogTextView = this.f92617d.f68981k;
            C1505h activity = getActivity();
            if (!this.f92618e.isActive()) {
                i = C10318g.f28627N0;
            }
            bogTextView.setTextColor(C0767a.m2893c(activity, i));
        }
        try {
            ((SmsNotifManagerActivity) getActivity()).mo86378Q2();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ void m113408n1(SMSContact sMSContact, View view) {
        if (this.f92617d.f68979i.isChecked()) {
            try {
                ((SmsNotifManagerActivity) getActivity()).mo86373G2(sMSContact);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m113409o1(SMSTypeGroup sMSTypeGroup, String str, View view) {
        try {
            if (this.f92617d.f68979i.isChecked()) {
                ((SmsNotifManagerActivity) getActivity()).mo86375I2(sMSTypeGroup, str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: p1 */
    private void m113410p1(ArrayList arrayList) {
        float f;
        float f2;
        int i = 0;
        while (true) {
            f = 1.0f;
            try {
                if (i >= this.f92617d.f68978h.getChildCount()) {
                    break;
                }
                View childAt = this.f92617d.f68978h.getChildAt(i);
                if (this.f92617d.f68979i.isChecked() && ((SMSTypeGroup) arrayList.get(i)).hasActiveChild()) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.4f;
                }
                childAt.setAlpha(f2);
                i++;
            } catch (Exception unused) {
            }
        }
        C27328i4 i4Var = this.f92617d;
        View view = i4Var.f68976f;
        if (!i4Var.f68979i.isChecked()) {
            f = 0.4f;
        }
        view.setAlpha(f);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27328i4 d = C27328i4.m84622d(getLayoutInflater(), viewGroup, false);
        this.f92617d = d;
        return d.mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f92617d = null;
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
        mo92354q1(this.f92618e, this.f92619f);
    }

    /* renamed from: q1 */
    public void mo92354q1(SMSContact sMSContact, String str) {
        String str2;
        String str3;
        float f;
        this.f92618e = sMSContact;
        this.f92619f = str;
        if (this.f92617d != null && sMSContact != null && getActivity() != null) {
            this.f92617d.f68977g.findViewById(C10322k.f28850jc).setVisibility(8);
            str.hashCode();
            if (str.equals("PHONE")) {
                str2 = sMSContact.contact;
                this.f92617d.f68980j.setVisibility(0);
                this.f92617d.f68977g.setVisibility(0);
                this.f92617d.f68982l.f68330e.setOnClickListener(new C38719a(this, sMSContact));
            } else if (!str.equals("DEVICE")) {
                str2 = "";
            } else {
                str2 = sMSContact.contactName;
                this.f92617d.f68980j.setVisibility(8);
                this.f92617d.f68977g.setVisibility(8);
            }
            this.f92617d.f68981k.setText(str2);
            this.f92617d.f68982l.f68333h.setText(getActivity().getString(C10328q.notifications_sms_language_title));
            String string = getActivity().getString(C10328q.notifications_sms_language_ge);
            String str4 = sMSContact.languageCode;
            if (str4 != null && C37353c.f89802f.mo90437a(str4) == C37353c.EN) {
                string = getActivity().getString(C10328q.notifications_sms_language_en);
            }
            this.f92617d.f68982l.f68332g.setText(string);
            this.f92617d.f68979i.setChecked(sMSContact.isActive());
            this.f92617d.f68979i.setOnCheckedChangeListener(new C38722a(sMSContact));
            this.f92617d.f68983m.setOnClickListener(new C38723b());
            this.f92617d.f68978h.removeAllViews();
            this.f92617d.f68975e.setVisibility(8);
            this.f92617d.f68976f.setVisibility(8);
            ArrayList<SMSTypeGroup> arrayList = sMSContact.typeGroups;
            if (arrayList != null) {
                Iterator<SMSTypeGroup> it = arrayList.iterator();
                while (it.hasNext()) {
                    SMSTypeGroup next = it.next();
                    this.f92617d.f68975e.setVisibility(0);
                    this.f92617d.f68976f.setVisibility(0);
                    if (next.hasChildren()) {
                        View inflate = getLayoutInflater().inflate(C10324m.sms_contact_list_item, (ViewGroup) null);
                        int i = C10322k.f28846ii;
                        ((BogTextView) inflate.findViewById(i)).setText(next.groupName);
                        ((BogTextView) inflate.findViewById(i)).setTextColor(C0767a.m2893c(getActivity(), C10318g.f28627N0));
                        ArrayList<SMSType> arrayList2 = next.types;
                        if (arrayList2 != null) {
                            Iterator<SMSType> it2 = arrayList2.iterator();
                            str3 = "";
                            while (it2.hasNext()) {
                                str3 = str3 + C27950a.m86284a(it2.next().dictionaryKey) + ", ";
                            }
                        } else {
                            str3 = "";
                        }
                        if (str3.length() > 1) {
                            str3 = str3.substring(0, str3.length() - 2);
                        }
                        ((BogTextView) inflate.findViewById(C10322k.item_desc)).setText(str3);
                        inflate.setOnClickListener(new C38720b(this, next, str));
                        if (next.hasActiveChild()) {
                            f = 1.0f;
                        } else {
                            f = 0.4f;
                        }
                        inflate.setAlpha(f);
                        this.f92617d.f68978h.addView(inflate);
                    }
                }
            }
            m113407m1(sMSContact.typeGroups);
        }
    }
}
