package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.eventbus.events.SMSNotifListEvent;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.fragments.d1 */
public class C35593d1 extends C35651n1 {

    /* renamed from: d */
    private BogTextView f86073d;

    /* renamed from: e */
    private BogTextView f86074e;

    /* renamed from: f */
    private SMSNotifListEvent f86075f;

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m105733k1(View view) {
        m105736n1();
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m105734l1(View view) {
        m105735m1();
    }

    /* renamed from: m1 */
    private void m105735m1() {
        if (getActivity() != null && (getActivity() instanceof SmsNotifManagerActivity)) {
            ((SmsNotifManagerActivity) getActivity()).mo86380V2("DEVICE");
        }
    }

    /* renamed from: n1 */
    private void m105736n1() {
        if (getActivity() != null && (getActivity() instanceof SmsNotifManagerActivity)) {
            ((SmsNotifManagerActivity) getActivity()).mo86380V2("PHONE");
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_notifications_type_list;
    }

    /* renamed from: o1 */
    public void mo86668o1(SMSNotifListEvent sMSNotifListEvent) {
        String str;
        boolean z;
        boolean z2;
        if (sMSNotifListEvent != null) {
            this.f86075f = sMSNotifListEvent;
            if (this.f86073d != null && this.f86074e != null) {
                if (getActivity() != null && (getActivity() instanceof SmsNotifManagerActivity) && isVisible()) {
                    ((SmsNotifManagerActivity) getActivity()).mo86377M2();
                }
                ArrayList<SMSContact> arrayList = this.f86075f.smsContacts;
                String str2 = "";
                if (arrayList != null) {
                    Iterator<SMSContact> it = arrayList.iterator();
                    str = str2;
                    z = false;
                    while (it.hasNext()) {
                        SMSContact next = it.next();
                        if (next.isActive()) {
                            if (next.contact != null) {
                                str = str + next.contact + ", ";
                            }
                            z = true;
                        }
                    }
                } else {
                    str = str2;
                    z = false;
                }
                ArrayList<SMSContact> arrayList2 = this.f86075f.pushContacts;
                if (arrayList2 != null) {
                    Iterator<SMSContact> it2 = arrayList2.iterator();
                    z2 = false;
                    while (it2.hasNext()) {
                        SMSContact next2 = it2.next();
                        if (next2.isActive()) {
                            if (next2.contactName != null) {
                                str2 = str2 + next2.contactName + ", ";
                            }
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                if (!z) {
                    str = getString(C10328q.notifications_turned_off);
                } else if (str.length() > 1) {
                    str = str.substring(0, str.length() - 2);
                }
                this.f86073d.setText(str);
                if (!z2) {
                    str2 = getString(C10328q.notifications_turned_off);
                } else if (str2.length() > 1) {
                    str2 = str2.substring(0, str2.length() - 2);
                }
                this.f86073d.setText(str);
                this.f86074e.setText(str2);
            }
        }
    }

    public void onStart() {
        super.onStart();
        try {
            ((SmsNotifManagerActivity) getActivity()).mo86379T2(false);
        } catch (Exception unused) {
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86073d = (BogTextView) view.findViewById(C10322k.sms_notifications_desc);
        this.f86074e = (BogTextView) view.findViewById(C10322k.push_notifications_desc);
        view.findViewById(C10322k.sms_container).setOnClickListener(new C35586b1(this));
        view.findViewById(C10322k.push_container).setOnClickListener(new C35590c1(this));
        mo86668o1(this.f86075f);
    }
}
