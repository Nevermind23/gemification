package t81;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import com.github.mikephil.charting.utils.Utils;
import g91.C32290b1;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.model.smsnotification.SMSNotification;
import p341ge.bog.mobilebank.model.smsnotification.SMSType;
import p341ge.bog.mobilebank.model.smsnotification.SMSTypeGroup;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: t81.d */
public class C38724d extends C35651n1 {

    /* renamed from: d */
    private ViewGroup f92623d;

    /* renamed from: e */
    private SMSTypeGroup f92624e;

    /* renamed from: f */
    private String f92625f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f92626g = -1;

    /* renamed from: t81.d$a */
    class C38725a implements View.OnClickListener {
        C38725a() {
        }

        public void onClick(View view) {
            C38724d.this.m113414k1(view.findViewById(C10322k.collapsing_layout), view.findViewById(C10322k.arrow_layout));
        }
    }

    /* renamed from: t81.d$b */
    class C38726b implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ int f92628d;

        /* renamed from: e */
        final /* synthetic */ SMSNotification f92629e;

        /* renamed from: f */
        final /* synthetic */ String f92630f;

        C38726b(int i, SMSNotification sMSNotification, String str) {
            this.f92628d = i;
            this.f92629e = sMSNotification;
            this.f92630f = str;
        }

        public void onClick(View view) {
            try {
                C38724d.this.f92626g = this.f92628d;
                ((SmsNotifManagerActivity) C38724d.this.getActivity()).mo86376J2(this.f92629e, this.f92630f);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public void m113414k1(View view, View view2) {
        this.f92626g = -1;
        if (view.getVisibility() == 0) {
            C32290b1.m95113c(view);
            view2.animate().rotation(Utils.FLOAT_EPSILON);
            return;
        }
        C32290b1.m95114d(view);
        view2.animate().rotation(180.0f);
    }

    /* renamed from: l1 */
    public void mo92357l1(SMSTypeGroup sMSTypeGroup, String str) {
        float f;
        int i;
        float f2;
        this.f92624e = sMSTypeGroup;
        this.f92625f = str;
        if (this.f92623d != null && sMSTypeGroup != null && getActivity() != null) {
            this.f92623d.removeAllViews();
            ArrayList<SMSType> arrayList = sMSTypeGroup.types;
            if (arrayList != null) {
                Iterator<SMSType> it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    SMSType next = it.next();
                    if (next.hasChildren()) {
                        View inflate = getLayoutInflater().inflate(C10324m.sms_contact_group_expandable_layout, (ViewGroup) null);
                        ((BogTextView) inflate.findViewById(C10322k.group_name)).setText(C27950a.m86284a(next.dictionaryKey));
                        View findViewById = inflate.findViewById(C10322k.arrow_layout);
                        if (i2 == this.f92626g) {
                            f = 180.0f;
                        } else {
                            f = Utils.FLOAT_EPSILON;
                        }
                        findViewById.setRotation(f);
                        inflate.setOnClickListener(new C38725a());
                        ArrayList<SMSNotification> arrayList2 = next.notifications;
                        if (arrayList2 != null) {
                            Iterator<SMSNotification> it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                SMSNotification next2 = it2.next();
                                View inflate2 = getLayoutInflater().inflate(C10324m.sms_contact_list_item, (ViewGroup) null);
                                int i3 = C10322k.f28846ii;
                                ((BogTextView) inflate2.findViewById(i3)).setText(next2.productName);
                                ((BogTextView) inflate2.findViewById(i3)).setTextColor(C0767a.m2893c(getActivity(), C10318g.f28627N0));
                                C1505h activity = getActivity();
                                if (!next2.isActive()) {
                                    i = C10328q.notifications_turned_off;
                                } else if (!next2.isAdditionalTextValid()) {
                                    i = C10328q.common_text_empty;
                                } else if (next2.isAdditionalTextActive()) {
                                    i = C10328q.notifications_additional_active;
                                } else {
                                    i = C10328q.notifications_additional_inactive;
                                }
                                ((BogTextView) inflate2.findViewById(C10322k.item_desc)).setText(activity.getString(i));
                                int i4 = C10322k.collapsing_layout;
                                ((ViewGroup) inflate.findViewById(i4)).addView(inflate2);
                                if (next2.isActive()) {
                                    f2 = 1.0f;
                                } else {
                                    f2 = 0.4f;
                                }
                                inflate2.setAlpha(f2);
                                inflate.findViewById(i4).setVisibility(0);
                                inflate2.setOnClickListener(new C38726b(i2, next2, str));
                            }
                        }
                        int i5 = C10322k.collapsing_layout;
                        int i6 = 8;
                        if (((ViewGroup) inflate.findViewById(i5)).getChildCount() > 0) {
                            ((ViewGroup) inflate.findViewById(i5)).getChildAt(((ViewGroup) inflate.findViewById(i5)).getChildCount() - 1).findViewById(C10322k.f28850jc).setVisibility(8);
                        }
                        View findViewById2 = inflate.findViewById(i5);
                        if (i2 == this.f92626g) {
                            i6 = 0;
                        }
                        findViewById2.setVisibility(i6);
                        this.f92623d.addView(inflate);
                        i2++;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_sms_contact_group_type;
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
        this.f92623d = (ViewGroup) view.findViewById(C10322k.groups_container);
        mo92357l1(this.f92624e, this.f92625f);
    }
}
