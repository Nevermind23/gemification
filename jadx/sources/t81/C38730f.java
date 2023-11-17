package t81;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import g91.C32335t0;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.eventbus.events.SMSNotifListEvent;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.model.smsnotification.SMSTypeGroup;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: t81.f */
public class C38730f extends C35651n1 {

    /* renamed from: d */
    private ViewGroup f92636d;

    /* renamed from: e */
    private BogTextView f92637e;

    /* renamed from: f */
    private View f92638f;

    /* renamed from: g */
    private SMSNotifListEvent f92639g;

    /* renamed from: h */
    private String f92640h;

    /* renamed from: t81.f$a */
    class C38731a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ String f92641d;

        C38731a(String str) {
            this.f92641d = str;
        }

        public void onClick(View view) {
            try {
                ((SmsNotifManagerActivity) C38730f.this.getActivity()).mo86374H2((String) view.getTag(), this.f92641d);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i1 */
    public void mo92363i1(SMSNotifListEvent sMSNotifListEvent, String str) {
        String str2;
        int i;
        this.f92639g = sMSNotifListEvent;
        this.f92640h = str;
        ArrayList<SMSContact> arrayList = new ArrayList<>();
        str.hashCode();
        if (str.equals("PHONE")) {
            arrayList = sMSNotifListEvent.smsContacts;
        } else if (str.equals("DEVICE")) {
            arrayList = sMSNotifListEvent.pushContacts;
        }
        if (sMSNotifListEvent != null && arrayList != null && this.f92636d != null && getActivity() != null && arrayList.size() > 0) {
            sMSNotifListEvent.restoreInitialData();
            this.f92636d.removeAllViews();
            Iterator<SMSContact> it = arrayList.iterator();
            while (it.hasNext()) {
                SMSContact next = it.next();
                View inflate = getLayoutInflater().inflate(C10324m.sms_contact_list_item, (ViewGroup) null);
                String str3 = "";
                if (str.equals("PHONE")) {
                    str2 = next.contact;
                } else if (!str.equals("DEVICE")) {
                    str2 = str3;
                } else {
                    str2 = next.contactName;
                }
                int i2 = C10322k.f28846ii;
                ((BogTextView) inflate.findViewById(i2)).setText(str2);
                BogTextView bogTextView = (BogTextView) inflate.findViewById(i2);
                if (next.isActive()) {
                    i = C32335t0.m95358c(getContext());
                } else {
                    i = C0767a.m2893c(getActivity(), C10318g.f28627N0);
                }
                bogTextView.setTextColor(i);
                ArrayList<SMSTypeGroup> arrayList2 = next.typeGroups;
                if (arrayList2 != null) {
                    Iterator<SMSTypeGroup> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        str3 = str3 + it2.next().groupName + ", ";
                    }
                    if (str3.length() > 1) {
                        str3 = str3.substring(0, str3.length() - 2);
                    }
                }
                BogTextView bogTextView2 = (BogTextView) inflate.findViewById(C10322k.item_desc);
                if (!next.isActive()) {
                    str3 = getActivity().getString(C10328q.notifications_turned_off);
                }
                bogTextView2.setText(str3);
                inflate.setTag(next.getUniqueTag());
                inflate.findViewById(C10322k.f28875o9).setOnClickListener(new C38731a(str));
                this.f92636d.addView(inflate);
            }
            if (this.f92636d.getChildCount() > 0) {
                ViewGroup viewGroup = this.f92636d;
                viewGroup.getChildAt(viewGroup.getChildCount() - 1).findViewById(C10322k.f28850jc).setVisibility(8);
            }
            this.f92637e.setVisibility(8);
            this.f92638f.setVisibility(0);
        } else if (this.f92637e != null && "DEVICE".equals(str)) {
            this.f92637e.setVisibility(0);
            this.f92638f.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_sms_contact_list;
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
        this.f92636d = (ViewGroup) view.findViewById(C10322k.f28875o9);
        this.f92637e = (BogTextView) view.findViewById(C10322k.f28848ix);
        this.f92638f = view.findViewById(C10322k.f28751Ik);
        mo92363i1(this.f92639g, this.f92640h);
    }
}
