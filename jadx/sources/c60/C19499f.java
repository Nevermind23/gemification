package c60;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1505h;
import b10.C19308a;
import g91.C32300e0;
import g91.C32335t0;
import he1.C41217g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: c60.f */
public final class C19499f extends C1483c {

    /* renamed from: z */
    public static final C19501b f53791z = new C19501b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: t */
    public View f53792t;

    /* renamed from: u */
    private final C41217g f53793u = C41219i.m119470b(new C19507h(this));

    /* renamed from: v */
    private final C41217g f53794v = C41219i.m119470b(new C19503d(this));

    /* renamed from: w */
    private final C41217g f53795w = C41219i.m119470b(new C19506g(this));

    /* renamed from: x */
    private final C41217g f53796x = C41219i.m119470b(new C19505f(this));

    /* renamed from: y */
    private C19500a f53797y;

    /* renamed from: c60.f$a */
    public interface C19500a {
        /* renamed from: X */
        void mo47739X(List list);
    }

    /* renamed from: c60.f$b */
    public static final class C19501b {
        private C19501b() {
        }

        public /* synthetic */ C19501b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19499f mo47740a(List list) {
            C41536l.m120489i(list, "smsNotifications");
            C19499f fVar = new C19499f();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("sms_notifications", new ArrayList(list));
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: c60.f$c */
    static final class C19502c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19502c f53798d = new C19502c();

        C19502c() {
            super(1);
        }

        /* renamed from: a */
        public final FilterValue invoke(C19308a aVar) {
            C41536l.m120489i(aVar, "it");
            return aVar.getValue();
        }
    }

    /* renamed from: c60.f$d */
    static final class C19503d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19499f f53799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19503d(C19499f fVar) {
            super(0);
            this.f53799d = fVar;
        }

        /* renamed from: b */
        public final ViewGroup invoke() {
            View E1 = this.f53799d.f53792t;
            if (E1 == null) {
                C41536l.m120506z("rootView");
                E1 = null;
            }
            return (ViewGroup) E1.findViewById(C10322k.numbers_container);
        }
    }

    /* renamed from: c60.f$e */
    public static final class C19504e extends Dialog {

        /* renamed from: d */
        final /* synthetic */ C19499f f53800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19504e(C19499f fVar, Context context, int i) {
            super(context, i);
            this.f53800d = fVar;
        }

        public void onBackPressed() {
            this.f53800d.mo47738b();
        }
    }

    /* renamed from: c60.f$f */
    static final class C19505f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19499f f53801d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19505f(C19499f fVar) {
            super(0);
            this.f53801d = fVar;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            Bundle arguments = this.f53801d.getArguments();
            if (arguments != null) {
                ArrayList parcelableArrayList = arguments.getParcelableArrayList("sms_notifications");
                C41536l.m120486f(parcelableArrayList);
                return parcelableArrayList;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: c60.f$g */
    static final class C19506g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19499f f53802d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19506g(C19499f fVar) {
            super(0);
            this.f53802d = fVar;
        }

        /* renamed from: b */
        public final BogButton invoke() {
            View E1 = this.f53802d.f53792t;
            if (E1 == null) {
                C41536l.m120506z("rootView");
                E1 = null;
            }
            return (BogButton) E1.findViewById(C10322k.submit_numbers_btn);
        }
    }

    /* renamed from: c60.f$h */
    static final class C19507h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19499f f53803d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19507h(C19499f fVar) {
            super(0);
            this.f53803d = fVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            View E1 = this.f53803d.f53792t;
            if (E1 == null) {
                C41536l.m120506z("rootView");
                E1 = null;
            }
            return (BogTextView) E1.findViewById(C10322k.toolbarTitleTV);
        }
    }

    /* renamed from: F1 */
    private final String m65075F1(String str) {
        String formatNumber = PhoneNumberUtils.formatNumber(str, Locale.getDefault().getCountry());
        return formatNumber == null ? str : formatNumber;
    }

    /* renamed from: G1 */
    private final List m65076G1() {
        return C40355o.m116850A(C40353n.m116848i(C40355o.m116863u(C40353n.m116848i(C32300e0.f79712a.mo72817b(m65078I1()), C19308a.class), C19502c.f53798d), FilterValue.Checkable.class));
    }

    /* renamed from: H1 */
    private final C19494b m65077H1(Context context, SmsNotification smsNotification, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        C19494b bVar = new C19494b(context);
        bVar.setTitle(m65075F1(smsNotification.mo52109a()));
        bVar.setValue(new FilterValue.Checkable(false));
        bVar.setOnCheckedChangeListener(onCheckedChangeListener);
        return bVar;
    }

    /* renamed from: I1 */
    private final ViewGroup m65078I1() {
        Object value = this.f53794v.getValue();
        C41536l.m120488h(value, "<get-numbersContainer>(...)");
        return (ViewGroup) value;
    }

    /* renamed from: J1 */
    private final List m65079J1() {
        Object value = this.f53796x.getValue();
        C41536l.m120488h(value, "<get-smsNotifications>(...)");
        return (List) value;
    }

    /* renamed from: K1 */
    private final BogButton m65080K1() {
        Object value = this.f53795w.getValue();
        C41536l.m120488h(value, "<get-submitNumbersButton>(...)");
        return (BogButton) value;
    }

    /* renamed from: L1 */
    private final BogTextView m65081L1() {
        Object value = this.f53793u.getValue();
        C41536l.m120488h(value, "<get-toolbarTitleTV>(...)");
        return (BogTextView) value;
    }

    /* renamed from: M1 */
    public static final C19499f m65082M1(List list) {
        return f53791z.mo47740a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m65083N1(C19499f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m65085P1();
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m65084O1(C19499f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.mo47738b();
    }

    /* renamed from: P1 */
    private final void m65085P1() {
        List J1 = m65079J1();
        List G1 = m65076G1();
        Iterator it = J1.iterator();
        Iterator it2 = G1.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C41343r.m119925u(J1, 10), C41343r.m119925u(G1, 10)));
        while (it.hasNext() && it2.hasNext()) {
            SmsNotification smsNotification = (SmsNotification) it.next();
            if (!((FilterValue.Checkable) it2.next()).mo53815a()) {
                smsNotification = null;
            }
            arrayList.add(smsNotification);
        }
        List T = C41358y.m120004T(arrayList);
        C19500a aVar = this.f53797y;
        if (aVar != null) {
            aVar.mo47739X(T);
        }
        mo47738b();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m65086Q1(C19499f fVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m65087R1();
    }

    /* renamed from: R1 */
    private final void m65087R1() {
        List G1 = m65076G1();
        boolean z = false;
        if (!(G1 instanceof Collection) || !G1.isEmpty()) {
            Iterator it = G1.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((FilterValue.Checkable) it.next()).mo53815a()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        m65080K1().setOrange(z, z);
    }

    /* renamed from: b */
    public final void mo47738b() {
        mo4578l1();
    }

    public void onAttach(Context context) {
        C19500a aVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        C1505h requireActivity = requireActivity();
        if (requireActivity instanceof C19500a) {
            aVar = (C19500a) requireActivity;
        } else {
            aVar = null;
        }
        this.f53797y = aVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C32335t0.m95361f() == 0) {
            mo4588y1(0, C10329r.DialogFullScreen_SlideUpDown);
        } else if (C32335t0.m95361f() == 2) {
            mo4588y1(0, C10329r.DialogFullScreenWealth_SlideUpDown);
        } else {
            mo4588y1(0, C10329r.DialogFullScreenSolo_SlideUpDown);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        View inflate = getLayoutInflater().inflate(C10324m.sms_to_push_choose_numbers_dialog_fragment, (ViewGroup) null);
        C41536l.m120488h(inflate, "layoutInflater.inflate(\n…_fragment, null\n        )");
        this.f53792t = inflate;
        if (inflate == null) {
            C41536l.m120506z("rootView");
            inflate = null;
        }
        inflate.findViewById(C10322k.submit_numbers_btn).setOnClickListener(new C19497d(this));
        View view = this.f53792t;
        if (view == null) {
            C41536l.m120506z("rootView");
            view = null;
        }
        view.findViewById(C10322k.toolbarLeftIV).setOnClickListener(new C19498e(this));
        View view2 = this.f53792t;
        if (view2 != null) {
            return view2;
        }
        C41536l.m120506z("rootView");
        return null;
    }

    public void onDetach() {
        super.onDetach();
        this.f53797y = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m65081L1().setText(getString(C10328q.sms_to_push_choose_numbers_title));
        m65078I1().removeAllViews();
        for (SmsNotification H1 : m65079J1()) {
            ViewGroup I1 = m65078I1();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            I1.addView(m65077H1(requireContext, H1, new C19496c(this)));
        }
        m65080K1().setOrange(false, false, true);
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        return new C19504e(this, requireContext(), mo4580o1());
    }
}
