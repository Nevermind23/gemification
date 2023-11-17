package bi0;

import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import he1.C41238w;
import java.util.Calendar;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import oh0.C27010e;
import p190o1.C7397t;
import p202p0.C7556l;
import ue1.C43075l;

/* renamed from: bi0.b */
public interface C19387b {

    /* renamed from: bi0.b$a */
    public static final class C19388a implements C19387b {

        /* renamed from: a */
        private final Long f53614a;

        /* renamed from: b */
        private final long f53615b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C43075l f53616c;

        /* renamed from: bi0.b$a$a */
        static final class C19389a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C19388a f53617d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19389a(C19388a aVar) {
                super(1);
                this.f53617d = aVar;
            }

            /* renamed from: a */
            public final void mo47609a(Long l) {
                C43075l c = this.f53617d.f53616c;
                C41536l.m120488h(l, "date");
                c.invoke(l);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo47609a((Long) obj);
                return C41238w.f97225a;
            }
        }

        public C19388a(Long l, long j, C43075l lVar) {
            C41536l.m120489i(lVar, "onPositiveButtonClickListener");
            this.f53614a = l;
            this.f53615b = j;
            this.f53616c = lVar;
        }

        /* renamed from: d */
        private final CalendarConstraints m64871d(long j) {
            long W1 = C5023l.m19556W1();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(W1);
            instance.add(5, 1);
            long timeInMillis = instance.getTimeInMillis();
            DateValidatorPointForward a = DateValidatorPointForward.m19410a(timeInMillis);
            C41536l.m120488h(a, "from(tomorrow)");
            DateValidatorPointBackward a2 = DateValidatorPointBackward.m19406a(j);
            C41536l.m120488h(a2, "before(endDate)");
            CalendarConstraints.DateValidator d = CompositeDateValidator.m19386d(C41341q.m119910m(a, a2));
            C41536l.m120488h(d, "allOf(validators)");
            CalendarConstraints a3 = new CalendarConstraints.C4986b().mo16158e(d).mo16157d(timeInMillis).mo16155b(j).mo16156c(timeInMillis).mo16154a();
            C41536l.m120488h(a3, "Builder()\n              …\n                .build()");
            return a3;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m64872e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: a */
        public void mo47605a(FragmentManager fragmentManager, C7556l lVar) {
            C41536l.m120489i(fragmentManager, "fragmentManager");
            C41536l.m120489i(lVar, "navController");
            C5023l a = C5023l.C5029f.m19565c().mo16276e(m64871d(this.f53615b)).mo16278g(this.f53614a).mo16275a();
            a.mo16267J1(new C19386a(new C19389a(this)));
            a.mo4576A1(fragmentManager, (String) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19388a)) {
                return false;
            }
            C19388a aVar = (C19388a) obj;
            return C41536l.m120484d(this.f53614a, aVar.f53614a) && this.f53615b == aVar.f53615b && C41536l.m120484d(this.f53616c, aVar.f53616c);
        }

        public int hashCode() {
            Long l = this.f53614a;
            return ((((l == null ? 0 : l.hashCode()) * 31) + C7397t.m28148a(this.f53615b)) * 31) + this.f53616c.hashCode();
        }

        public String toString() {
            Long l = this.f53614a;
            long j = this.f53615b;
            C43075l lVar = this.f53616c;
            return "OpenCalendar(selection=" + l + ", endDate=" + j + ", onPositiveButtonClickListener=" + lVar + ")";
        }
    }

    /* renamed from: bi0.b$b */
    public static final class C19390b implements C19387b {

        /* renamed from: a */
        public static final C19390b f53618a = new C19390b();

        private C19390b() {
        }

        /* renamed from: a */
        public void mo47605a(FragmentManager fragmentManager, C7556l lVar) {
            C41536l.m120489i(fragmentManager, "fragmentManager");
            C41536l.m120489i(lVar, "navController");
            lVar.mo22117L(C27010e.action_giftCardsChooseAmountFragment_to_giftCardNominationFragment);
        }
    }

    /* renamed from: a */
    void mo47605a(FragmentManager fragmentManager, C7556l lVar);
}
