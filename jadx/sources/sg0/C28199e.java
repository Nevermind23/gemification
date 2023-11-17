package sg0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c10.C19443b;
import c10.C19445c;
import c10.C19454j;
import g91.C32319m;
import g91.C32343x;
import ie0.C25190j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.model.TransactionsFilterData;
import p725cr.C19788a;
import tg0.C28387g;
import ue0.C28736l;

/* renamed from: sg0.e */
public final class C28199e extends C19788a {

    /* renamed from: Q */
    public static final C28200a f71540Q = new C28200a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C28736l f71541H;

    /* renamed from: I */
    private C28201b f71542I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Long f71543J = 0L;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public Long f71544K;

    /* renamed from: L */
    private Long f71545L = 0L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public long f71546M = Calendar.getInstance().getTimeInMillis();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public long f71547N;

    /* renamed from: O */
    private final C28202c f71548O = new C28202c(this);

    /* renamed from: P */
    private final C28203d f71549P = new C28203d(this);

    /* renamed from: sg0.e$a */
    public static final class C28200a {
        private C28200a() {
        }

        public /* synthetic */ C28200a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28199e mo67720a(TransactionsFilterData transactionsFilterData) {
            C41536l.m120489i(transactionsFilterData, "filterData");
            C28199e eVar = new C28199e();
            Bundle bundle = new Bundle();
            bundle.putParcelable("FILTER_DATA", transactionsFilterData);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    /* renamed from: sg0.e$b */
    public interface C28201b {
        /* renamed from: p */
        void mo60912p(TransactionsFilterData transactionsFilterData);
    }

    /* renamed from: sg0.e$c */
    public static final class C28202c implements C19454j {

        /* renamed from: a */
        final /* synthetic */ C28199e f71550a;

        C28202c(C28199e eVar) {
            this.f71550a = eVar;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            long j2;
            this.f71550a.f71547N = j;
            C28199e eVar = this.f71550a;
            Long j22 = eVar.f71544K;
            if (j22 != null) {
                j2 = j22.longValue();
            } else {
                j2 = this.f71550a.f71546M;
            }
            eVar.m86697q2(j2, this.f71550a.f71547N, this.f71550a.f71546M, false).mo47662d();
        }
    }

    /* renamed from: sg0.e$d */
    public static final class C28203d implements C19454j {

        /* renamed from: a */
        final /* synthetic */ C28199e f71551a;

        C28203d(C28199e eVar) {
            this.f71551a = eVar;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            C28199e eVar = this.f71551a;
            eVar.f71543J = Long.valueOf(eVar.f71547N);
            this.f71551a.f71544K = Long.valueOf(j);
            this.f71551a.m86704x2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final C19445c m86697q2(long j, long j2, long j3, boolean z) {
        C19454j jVar;
        if (z) {
            jVar = this.f71548O;
        } else {
            jVar = this.f71549P;
        }
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        return new C19443b(requireContext, j, j2, j3, jVar);
    }

    /* renamed from: r2 */
    private final C28736l m86698r2() {
        C28736l lVar = this.f71541H;
        C41536l.m120486f(lVar);
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m86699s2(C28199e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C28201b bVar = eVar.f71542I;
        if (bVar != null) {
            bVar.mo60912p(new TransactionsFilterData((Long) null, (Long) null, (List) null));
        }
        eVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m86700t2(C28199e eVar, View view) {
        long j;
        long j2;
        C41536l.m120489i(eVar, "this$0");
        Long l = eVar.f71543J;
        if (l != null) {
            j = l.longValue();
        } else {
            j = eVar.f71546M;
        }
        long j3 = j;
        Long l2 = eVar.f71545L;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        eVar.m86697q2(j3, j2, eVar.f71546M, true).mo47662d();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m86701u2(View view) {
        C41536l.m120487g(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        View childAt = ((LinearLayout) view).getChildAt(0);
        C41536l.m120487g(childAt, "null cannot be cast to non-null type ge.bog.designsystem.components.checkbox.CheckboxView");
        CheckboxView checkboxView = (CheckboxView) childAt;
        checkboxView.setChecked(!checkboxView.isChecked());
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m86702v2(C28199e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        ArrayList arrayList = new ArrayList();
        if (eVar.m86698r2().f73343f.isChecked()) {
            arrayList.add(C28387g.ORDER_1_B.name());
            arrayList.add(C28387g.SPUR.name());
        }
        if (eVar.m86698r2().f73357t.isChecked()) {
            arrayList.add(C28387g.ORDER_1_S.name());
            arrayList.add(C28387g.SSAL.name());
        }
        if (eVar.m86698r2().f73350m.isChecked()) {
            arrayList.add(C28387g.CSR.name());
        }
        if (eVar.m86698r2().f73360w.isChecked()) {
            arrayList.add(C28387g.CSD.name());
        }
        if (eVar.m86698r2().f73354q.isChecked()) {
            arrayList.add("DEFAULT");
        }
        C28201b bVar = eVar.f71542I;
        if (bVar != null) {
            bVar.mo60912p(new TransactionsFilterData(eVar.f71543J, eVar.f71544K, arrayList));
        }
        eVar.mo4577k1();
    }

    /* renamed from: w2 */
    private final void m86703w2(boolean z) {
        TextView textView = m86698r2().f73347j;
        C41536l.m120488h(textView, "binding.dateHint");
        C32343x.m95483r1(textView, z, false, 2, (Object) null);
        if (!z) {
            m86698r2().f73348k.setText(getString(C25190j.gt_history_filter_date));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m86704x2() {
        long j;
        String str;
        Long l = this.f71543J;
        if (l == null && this.f71544K == null) {
            m86703w2(false);
            return;
        }
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        String u = C32319m.m95314u(j);
        C41536l.m120488h(u, "getDottedDate(startDate ?: 0L)");
        Long l2 = this.f71544K;
        if (l2 != null) {
            str = C32319m.m95314u(l2.longValue());
        } else {
            str = null;
        }
        TextView textView = m86698r2().f73348k;
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%s - %s", Arrays.copyOf(new Object[]{u, str}, 2));
        C41536l.m120488h(format, "format(format, *args)");
        textView.setText(format);
        m86703w2(true);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f71541H = C28736l.m88070d(layoutInflater, viewGroup, true);
    }

    public void onAttach(Context context) {
        C28201b bVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C28201b) {
            this.f71542I = (C28201b) context;
        } else if (getParentFragment() instanceof C28201b) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C28201b) {
                bVar = (C28201b) parentFragment;
            } else {
                bVar = null;
            }
            this.f71542I = bVar;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        TransactionsFilterData transactionsFilterData;
        Long l;
        List a;
        boolean z;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C25190j.f64738e));
        Bundle arguments = getArguments();
        Long l2 = null;
        if (arguments != null) {
            transactionsFilterData = (TransactionsFilterData) arguments.getParcelable("FILTER_DATA");
        } else {
            transactionsFilterData = null;
        }
        if (transactionsFilterData != null) {
            l = transactionsFilterData.mo60946b();
        } else {
            l = null;
        }
        this.f71543J = l;
        if (transactionsFilterData != null) {
            l2 = transactionsFilterData.mo60947d();
        }
        this.f71544K = l2;
        m86704x2();
        if (!(transactionsFilterData == null || (a = transactionsFilterData.mo60945a()) == null)) {
            CheckboxView checkboxView = m86698r2().f73343f;
            boolean z2 = false;
            if (a.contains(C28387g.ORDER_1_B.name()) || a.contains(C28387g.SPUR.name())) {
                z = true;
            } else {
                z = false;
            }
            checkboxView.setChecked(z);
            CheckboxView checkboxView2 = m86698r2().f73357t;
            if (a.contains(C28387g.SSAL.name()) || a.contains(C28387g.ORDER_1_S.name())) {
                z2 = true;
            }
            checkboxView2.setChecked(z2);
            m86698r2().f73350m.setChecked(a.contains(C28387g.CSR.name()));
            m86698r2().f73360w.setChecked(a.contains(C28387g.CSD.name()));
            m86698r2().f73354q.setChecked(a.contains("DEFAULT"));
        }
        m86698r2().f73345h.setOnClickListener(new C28195a(this));
        m86698r2().f73346i.setOnClickListener(new C28196b(this));
        C28197c cVar = new C28197c();
        m86698r2().f73342e.setOnClickListener(cVar);
        m86698r2().f73356s.setOnClickListener(cVar);
        m86698r2().f73349l.setOnClickListener(cVar);
        m86698r2().f73359v.setOnClickListener(cVar);
        m86698r2().f73353p.setOnClickListener(cVar);
        m86698r2().f73352o.setOnClickListener(new C28198d(this));
    }
}
